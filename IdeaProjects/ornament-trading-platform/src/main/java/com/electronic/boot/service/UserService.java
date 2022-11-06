package com.electronic.boot.service;

import com.electronic.boot.bean.User;

public interface UserService {

    //查询所有的
//    List<Material> findAll();
//    //添加一个
//    void addMaterial(Material material);
//    //根据id查询一个
//    Material findMaterialById(int id);
//    //根据id修改一个
//    void updateMaterialById(Material material);
//    //根据id删除一个
//    void deleteMaterialById(Integer id);

    User getUser(String username, String password);

    User register(User user);


    User getUserById(String id);
}
