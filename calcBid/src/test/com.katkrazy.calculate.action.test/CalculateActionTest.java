package com.katkrazy.calculate.action.test;
/**
 * Created by kingdee on 2017/3/16.
 */
import com.katkrazy.calculate.action.CalculateAction;
import com.katkrazy.calculate.dao.impl.CalculateDaoImpl;
import org.junit.Test;

public class CalculateActionTest {

    @Test
    public void testExecute() throws Exception {
        CalculateDaoImpl dao = new CalculateDaoImpl();
        dao.find();

    }


}
