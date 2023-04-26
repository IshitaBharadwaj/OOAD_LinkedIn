package projekti;


import org.springframework.data.jpa.repository.JpaRepository;
import projekti.Vote;



public interface PostVoteRepository extends JpaRepository<PostVote, Long> {
    
}
