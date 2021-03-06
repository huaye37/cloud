package com.ssm.dao;

import com.ssm.pojo.File;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: netdisc
 * @description:文件持久
 * @author: Mr.Gu
 * @create: 2020-06-15 21:33
 **/
public interface FileDao {
    /**
     * 查询用户文件
     * @param userId
     * @return
     */
    List<File> queryFile(int userId);

    /**
     * 插入文件
     * @param file
     * @return
     */
    int insertFile(File file);

    /**
     * 根据id查文件
     * @param fileId
     * @return
     */
    File queryFileById(int fileId);

    /**
     * 根据目录和用户id查文件
     * @param folderId
     * @return
     */
    List<File> queryFileByFolder(@Param("folderid") int folderId,@Param("userId") int userId);
    /**
     * 根据名称查文件
     */
    List<File> queryFileByName(@Param("name") String name,@Param("userId") int userId);

    /**
     * 根据时间查文件
     */
    List<File> queryFileByTime(@Param("time") String time,@Param("userId") int userId);
    /**
     * flag删除
     */
    int deleteFile(int fileId);
    /**
     * 查询所有删除的文件
     * @param userid
     * @return
     */
    List<File> queryRecycle(int userid);
    /**
     * 移除文件
     * @param fileId
     * @return
     */
    int removeFile(int fileId);
}
