package com.china.center.oa.sail.dao;

import com.china.center.jdbc.inter.DAO;
import com.china.center.oa.sail.bean.ZyOrderBean;

public interface ZyOrderDAO extends DAO<ZyOrderBean, ZyOrderBean>
{
    public boolean updateStatus(String citicNo);
}
