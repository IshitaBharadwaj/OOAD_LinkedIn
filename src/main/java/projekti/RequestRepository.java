/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 *
 * @author piaandersin
 */
public interface RequestRepository extends JpaRepository<Request, Long> {
    @Query("SELECT r.target FROM Request r where r.submitter = :submitter") 
    List <String> findTarget(@Param("submitter") Account submitter);
    List <Request> findByTargetAndSubmitterAndStatus(String target, Account submitter, String status);
    List <Request> findByTargetAndSubmitter(String target, Account submitter);
    List <Request> findByTargetAndStatus(String target, String status);
    List <Request> findByTarget(String target);
}
    