package com.example.decemberBlog.repository;

import com.example.decemberBlog.entity.Blg001;
import org.springframework.data.repository.CrudRepository;
// CrudRepository<> -> JPA에서 제공하는 레파지토리 인터페이스를 활용해 만들 수 있다.
// CrudRepository는 JPA에서 제공하는 인터페이스로 이를 상속해 엔티티를 관리(C,R,U,D)할 수 있다.
// <>를 붙이고 그 안에 제네릭 요소를 받음.
// CrudRepository가 제공하는 기능을 별도 정의 없이 그대로 사용할 수 있다. DB에 데이터를 CRUD하고
// 기본 동작을 추가 코드로 구현할 필요 없이 CrudRepository에서 상속받아 사용할 수 있다.
//CrudRepository 패키지 자동 임포트
public interface Blg001Repository extends CrudRepository<Blg001, Long> {
}
