package com.somnus;

import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.somnus.mybatis.dao.MerAccountDao;
import com.somnus.mybatis.domain.MerAccount;
import com.somnus.mybatis.domain.User;

/** 
 * @Title: MybatisTestCase.java 
 * @Package com.somnus 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月2日 下午9:56:22 
 * @version V1.0 
 */
public class MybatisTestCase {
	protected transient Logger log = LoggerFactory.getLogger(this.getClass());
	private static SqlSession session;
	@Rule
    public TestName name = new TestName();

    @Before
    public void setUp() {
    	log.info("调用测试方法: {}", new Object[]{name.getMethodName()});
    	try {
    		Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");  
    		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    		//用于普通update
			/*session = sqlSessionFactory.openSession();*/
    		//用于批量update
			session = sqlSessionFactory.openSession(ExecutorType.BATCH, true);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}  
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void insert() throws ParseException{
    	Long beginTime = System.currentTimeMillis();
    	for(int i =0;i < 1000; i++){
    		User user = new User();
    		user.setStr2varchar("2016-10-01");
    		user.setStr2date("2016-10-01");
    		user.setDate2varchar(null);
    		user.setDate2date(new SimpleDateFormat("yyyy-MM-dd").parse("2016-12-01"));
    		user.setDate2timestamp(new Date());
    		session.insert("com.somnus.mybatis.dao.UserDao.insert",user);
    	}
    	session.commit();
        session.clearCache();
    	System.out.println("insert:"+(System.currentTimeMillis() - beginTime));
    }
    
    @Test
    public void insertBatch() throws ParseException{
    	List<User> list = new ArrayList<User>();
    	Long beginTime = System.currentTimeMillis();
    	for(int i =0;i < 1000; i++){
    		User user = new User();
    		user.setStr2varchar("2016-10-01");
    		user.setStr2date("2016-10-01");
    		user.setDate2varchar(null);
    		user.setDate2date(new SimpleDateFormat("yyyy-MM-dd").parse("2016-12-01"));
    		user.setDate2timestamp(new Date());
    		list.add(user);
    	}
    	session.insert("com.somnus.mybatis.dao.UserDao.insertBatch",list);
    	session.commit();
        session.clearCache();
    	System.out.println("insertBatch:"+(System.currentTimeMillis() - beginTime));
    }
    
    @Test
    public void 日期映射测试(){
    	User user = (User) session.selectOne("com.somnus.mybatis.dao.UserDao.selectByPrimaryKey", 1); 
    	System.out.println(user.getUserId());
    	System.out.println("String——>varchar：" + user.getStr2varchar());
    	System.out.println("String——>date：" + user.getStr2date());
    	System.out.println("Date——>varchar：" + user.getDate2varchar());
    	System.out.println("Date——>date：" + user.getDate2date());
    	System.out.println("Date——>timestamp：" + user.getDate2timestamp());
    }
    
    @Test
    public void load(){
    	MerAccount meraccount = (MerAccount) session.selectOne("com.somnus.mybatis.dao.MerAccountDao.selectByPrimaryKey", "2000002493"); 
    	System.out.println(meraccount.getAcctName());
    }
    
    @Test
    public void list(){
    	List<MerAccount> list = session.selectList("com.somnus.mybatis.dao.MerAccountDao.selectByAcctcode", "1020550016"); 
    	for(MerAccount account:list){
    		System.out.println(account.getBankName());
    	}
    }
    
    @Test
    public void list2(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("acctCode", "1020550016");
        map.put("bankCode", "1100");
        List<MerAccount> list = session.selectList("com.somnus.mybatis.dao.MerAccountDao.selectByCondition", map); 
        for(MerAccount account:list){
            System.out.println(account.getBankName());
        }
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
    public void selectByAcctcode(){
    	int page = 1;
        int pageSize = 20;
        String sortString = "bank_code.asc,bank_acct_no.desc";
        PageBounds pageBounds = new PageBounds(page, pageSize , Order.formString(sortString));
        
        PageList<MerAccount> pagelist = (PageList) session.selectList("com.somnus.mybatis.dao.MerAccountDao.selectByAcctcode", 
                "1020550016", pageBounds);
        
        int total = pagelist.getPaginator().getTotalCount();//总记录数
        System.out.println(total);
        
        for(MerAccount account:pagelist){
        	System.out.println(account.getBankName());
        }
    }
    
    @Test
    public void selectByAcctcode2(){
        int page = 1;
        int pageSize = 5;
        String sortString = "bank_code.asc,bank_acct_no.desc";
        PageBounds pageBounds = new PageBounds(page, pageSize , Order.formString(sortString));
        
        MerAccountDao dao = session.getMapper(MerAccountDao.class);
        PageList<MerAccount> pagelist = dao.selectByAcctcode("1020550016", pageBounds);
        
        int total = pagelist.getPaginator().getTotalCount();//总记录数
        System.out.println(total);
        
        for(MerAccount account:pagelist){
            System.out.println(account.getBankName());
        }
    }
}
