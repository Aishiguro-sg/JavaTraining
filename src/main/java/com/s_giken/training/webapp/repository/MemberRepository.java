package com.s_giken.training.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.s_giken.training.webapp.model.Member;
//import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    // SprintBootでは、予め用意されているのリポジトリアクセス用のメソッド以外のメソッドを
    // 定義するときに、特殊な命名ルールがあります。詳細は以下の参考先URLを確認して下さい。
    // https://docs.spring.io/spring-data/jpa/docs/1.11.1.RELEASE/reference/html/#jpa.query-methods
    //
    // 予め用意されているメソッド
    // <S extends T> S save(S entity);
    // T findOne(ID primaryKey); 条件をみたす最初のデータを取得する
    // Iterable<T> findAll(); findAll (Specification) に検索条件を渡します。
    // 独自の条件を生成する関数を用意し、呼び出し元のサービスクラスから findAll () の引数に指定すると動的条件の付与が可能です。
    // Long count();
    // void delete(T entity);
    // boolean exists(ID primaryKey);
    public List<Member> findByMailLikeAndNameLike(String meil, String name);
}

//public interface ListMemberRepository<Member,ID>{public void delete(Member entity);}
