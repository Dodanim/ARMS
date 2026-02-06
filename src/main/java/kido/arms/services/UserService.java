/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kido.arms.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import kido.arms.entities.UserEntity;
import kido.arms.model.LoginModel;

/**
 *
 * @author kttim
 */
public class UserService {
//    private  EntityManagerFactory emf;

    public UserService() {
        //BreaffyPU is the persistence file.xml
        // this.emf = Persistence.createEntityManagerFactory("BreaffyPU");
    }
    
    public UserEntity authenticate(LoginModel loginModel) {
        // EntityManager em = emf.createEntityManager();
        try {
//            TypedQuery<UserEntity> query = em.createQuery(
//                "SELECT u FROM Usuario u WHERE u.username = :username AND u.password = :password",
//                UserEntity.class
//            );
//            query.setParameter("username", loginModel.getUserName());
//            query.setParameter("password", loginModel.getPassword()); // ⚠️ en real → usar hash
//            
//           // return query.getResultStream().findFirst().orElse(null);
            UserEntity improvisar = new UserEntity();
            improvisar.setUserID((long)123456);
            improvisar.setUserName("admin");
            improvisar.setUserNameShowed("Petrona Petrolina");
            improvisar.setUserPassword("123");
            improvisar.setAccessLevel(1);
            
            if (loginModel.getUserName().equals(improvisar.getUserName())
                    && loginModel.getPassword().equals(improvisar.getUserPassword())) {
                return improvisar;
            } else {
                return null;
            }
            
        } finally {
//            em.close();
        }
    }
}
