package Project.Board.service;

import Project.Board.dto.MemberDto;
import Project.Board.dto.PostDto;
import Project.Board.entity.Post;
import Project.Board.pagination.Pagination;
import Project.Board.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post savePost(PostDto dto) {
        return postRepository.save(dto);
    }

    public Post findPostById(Long postId) {
        return postRepository.findById(postId);
    }

    public List<Post> findAllPost(Pagination pagination) {
        return postRepository.pagedFindAll(pagination);
    }

    public int postCnt() {
        return postRepository.postCnt();
    }

    public void updatePost(Long postId, PostDto updateParam) {
        postRepository.update(postId, updateParam);
    }

    public void deletePost(Long postId) {
        postRepository.delete(postId);
    }


}
