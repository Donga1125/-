package greenjangtanji.yeosuro.reply.repository;

import greenjangtanji.yeosuro.reply.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    List<Reply> findByFeedId (Long feedId);

}
