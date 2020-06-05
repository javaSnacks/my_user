//package com.slw.my_user.controllor;
//
//import cn.xinzhili.xutils.core.http.Response;
//import com.slw.my_user.model.Relationship;
//import com.slw.my_user.model.request.AddRelationshipRequest;
//import com.slw.my_user.service.RelationshipService;
//import com.slw.my_user.service.UserService;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.http.MediaType;
//import org.springframework.restdocs.JUnitRestDocumentation;
//import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.BDDMockito.given;
//import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
//import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
////import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(MockitoJUnitRunner.class)
//public class RelationshipControllorTest {
//
//    @Rule
//    public JUnitRestDocumentation restDocumentation =
//            new JUnitRestDocumentation("build/generated-snippets");
//
//    @Mock
//    RelationshipService relationshipService;
//
//    @InjectMocks
//    RelationshipControllor relationshipControllor;
//
//    @Mock
//    UserService userService;
//
//
//    MockMvc mockMvc;
//
//
//    ObjectMapper objectMapper;
//
//
//    @Before
//    public void setup(){
//        mockMvc = MockMvcBuilders
//                .standaloneSetup(relationshipControllor)
//                .apply(MockMvcRestDocumentation
//                .documentationConfiguration(restDocumentation))
//                .build();
//        objectMapper = new ObjectMapper();
//    }
//
//    @Test
//    public void testAddOneRelationship() throws Exception {
//        AddRelationshipRequest addRelationshipRequest = new AddRelationshipRequest();
//        addRelationshipRequest.setPersonOne(1);
//        addRelationshipRequest.setPersonTwo(2);
//        addRelationshipRequest.setValid(true);
//        addRelationshipRequest.setOperator(1);
//        addRelationshipRequest.setExpiration(4);
//        addRelationshipRequest.setRelationshipType(2);
//        given(relationshipService.addOneRelationshipRecord(anyInt(),anyInt(),anyInt(),anyInt(),anyBoolean(),anyInt()))
//                .willReturn(11);
//
//        mockMvc.perform(
//                post("/relationship")
//                        .characterEncoding("utf-8")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsBytes(addRelationshipRequest))
//                        .requestAttr("personOne",1)
//                        .param("personTwo","2")
//                .queryParam("valid","true")
//        )
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andDo(MockMvcRestDocumentation.document("add_one_relationship",
//                        requestFields(
//                               fieldWithPath("operator").description("操作人"),
//                                fieldWithPath("personOne").description("第一个人"),
//                                fieldWithPath("personTwo").description("第二个人"),
//                                fieldWithPath("relationshipType").description("关系类型"),
//                                fieldWithPath("valid").description("是否有效"),
//                                fieldWithPath("expiration").description("到期时间")
//                        )));
//    }
//
//    @Test
//    public void testGetOneRelationship() throws Exception {
//        Relationship relationship = new Relationship();
//        relationship.setId(1223);
//        relationship.setRelationshipType(12);
//        relationship.setOperator(23);
//        relationship.setPersonTwo(2);
//        relationship.setPersonOne(1);
//        relationship.setValid(1);
//        relationship.setCreateTime(124324L);
//        relationship.setExpireTime(23423432L);
//        relationship.setDeleteTime(3242342L);
//        given(relationshipService.selectOneRelationshipById(anyInt())).willReturn(relationship);
//
//        mockMvc.perform(get("/relationship/{id}"))
//                .andDo(print())
//
//        ;
//    }
//
//
//
//}
