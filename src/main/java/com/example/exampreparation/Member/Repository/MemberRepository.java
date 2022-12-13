package com.example.exampreparation.Member.Repository;

import com.example.exampreparation.Member.Model.MemberModel;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<MemberModel, Long>
{

}
