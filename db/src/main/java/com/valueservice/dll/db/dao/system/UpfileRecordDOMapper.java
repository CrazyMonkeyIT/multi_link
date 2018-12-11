package com.valueservice.dll.db.dao.system;

import com.valueservice.dll.db.entity.system.UpfileRecordDO;

public interface UpfileRecordDOMapper {
    int insertSelective(UpfileRecordDO record);

    UpfileRecordDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UpfileRecordDO record);
}