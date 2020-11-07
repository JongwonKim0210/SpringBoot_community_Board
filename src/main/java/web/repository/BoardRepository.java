package web.repository;

import web.domain.Board;
import web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findByUser(User user);

}
