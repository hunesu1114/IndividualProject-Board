package Project.Board.pagination;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class PagingConst {
    private final int POST_CNT_PER_PAGE=10;
    private final int PAGE_CNT_PER_BLOCK=5;
}
