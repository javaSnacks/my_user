//package com.slw.my_user.controllor;
//
//import cn.xinzhili.xutils.core.http.Response;
//import com.slw.my_user.model.User;
//import com.slw.my_user.model.request.AddUserRelationshipRequest;
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
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.BDDMockito.given;
//import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
//import static org.springframework.restdocs.payload.PayloadDocumentation.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(MockitoJUnitRunner.class)
//public class UserControllorTest {
//
//    @Rule
//    public JUnitRestDocumentation restDocumentation =
//            new JUnitRestDocumentation("build/generated-snippets");
//
//    @InjectMocks
//    UserControllor userControllor;
//
//    @Mock
//    private UserService userService;
//
//    private ObjectMapper mapper;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders
//                .standaloneSetup(userControllor)
//                .apply(MockMvcRestDocumentation
//                        .documentationConfiguration(restDocumentation))
//                .build();
//        mapper = new ObjectMapper();
//    }
//
//    @Test
//    public void testAddOneUser() throws Exception {
//        AddUserRelationshipRequest addUserRelationshipRequest = new AddUserRelationshipRequest();
//        addUserRelationshipRequest.setName("zuzu");
//        addUserRelationshipRequest.setPhone("12122121221");
//        Response response = Response.instanceSuccess();
//        given(userService.addOneUser(anyString(),anyString())).willReturn(response);
//
//        mockMvc.perform(
//                post("/user")
//                .characterEncoding("utf-8")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(mapper.writeValueAsBytes(addUserRelationshipRequest)))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andDo(document("123",
//                        requestFields(
//                                fieldWithPath("name").description("姓名"),
//                                fieldWithPath("phone").description("电话")
//                        ),
//
//                        responseFields(
//                                fieldWithPath("status").description("状态"),
//                                fieldWithPath("data").description("数据")
//                        )));
//    }
//
//
//
//
//    @Test
//    public void testGetAllUser() throws Exception {
//        List<User> userList = new ArrayList<>();
//        User user = new User();
//        user.setId(1);
//        user.setName("xiaohua");
//        user.setPhone("12234567890");
//        user.setRelationshipId(new Integer[]{1,2});
//        user.setValid(2);
//        userList.add(user);
//        given(userService.selectAllUser()).willReturn(userList);
//
//        mockMvc.perform(
//                get("/user/")
//                .characterEncoding("utf-8")
//        )
//                .andDo(print())
//                .andExpect(status().isOk());
////                .andDo(document("123",
////                        requestFields(
////                                fieldWithPath("name").description("姓名"),
////                                fieldWithPath("phone").description("电话")
////                        ),
////
////                        responseFields(
////                                fieldWithPath("status").description("状态"),
////                                fieldWithPath("data").description("数据")
////                        )));
//    }
//
//}
