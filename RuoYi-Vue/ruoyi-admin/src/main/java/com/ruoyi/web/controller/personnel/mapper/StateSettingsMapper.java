package com.ruoyi.web.controller.personnel.mapper;

import com.ruoyi.web.controller.personnel.domain.StateSettings;

import java.util.List;


/**
 * 人员的状态设置Mapper接口
 * 
 * @author ALan
 * @date 2020-09-02
 */
public interface StateSettingsMapper 
{
    /**
     * 查询人员的状态设置
     * 
     * @param id 人员的状态设置ID
     * @return 人员的状态设置
     */
    public StateSettings selectStateSettingsById(String id);

    /**
     * 查询人员的状态设置列表
     * 
     * @param stateSettings 人员的状态设置
     * @return 人员的状态设置集合
     */
    public List<StateSettings> selectStateSettingsList(StateSettings stateSettings);

    /**
     * 新增人员的状态设置
     * 
     * @param stateSettings 人员的状态设置
     * @return 结果
     */
    public int insertStateSettings(StateSettings stateSettings);

    /**
     * 修改人员的状态设置
     * 
     * @param stateSettings 人员的状态设置
     * @return 结果
     */
    public int updateStateSettings(StateSettings stateSettings);

    /**
     * 删除人员的状态设置
     * 
     * @param id 人员的状态设置ID
     * @return 结果
     */
    public int deleteStateSettingsById(String id);

    /**
     * 批量删除人员的状态设置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStateSettingsByIds(String[] ids);
}
