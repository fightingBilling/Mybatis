package com.somnus;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
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

import com.somnus.mybatis.domain.MerAccount;
import com.somnus.mybatis.domain.TrnTransaction;

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
			session = sqlSessionFactory.openSession();
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}  
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void load(){
    	MerAccount meraccount = (MerAccount) session.selectOne("com.somnus.mybatis.doamin.MerAccountMapper.selectByPrimaryKey", "2000002493"); 
    	System.out.println(meraccount.getAcctName());
    }
    
    @Test
    public void list(){
    	List<TrnTransaction> list = session.selectList("com.somnus.mybatis.doamin.TransactionMappper.selectBySysCode", "1001"); 
    	for(TrnTransaction data:list){
    		System.out.println(data.getAccTranNo());
    	}
    }
}
