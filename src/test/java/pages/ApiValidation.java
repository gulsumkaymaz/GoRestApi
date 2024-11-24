package pages;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class ApiValidation {
    // ana codelarimi, methodlarimi bu class içerisinde yaziyorum

    protected Response postMethod(String name, String gender, String email, String status) {
        String requestBody = updateBody(name, gender, email, status);
        Response response = given()
                .headers("Authorization", "Bearer 7c1158095623c6486eae51ffd8f901971ac32060fe9dde5f0c94c14404817c0d",
                        "Content-Type", "application/json", "Accept", ContentType.JSON)
                .body(requestBody)
                .post();
        return response;
    }

    private String updateBody(String name, String gender, String email, String status) {
        String body = "";
        try {
            body = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + File.separator + "src/test/resources/data/userDetails.json")));
        /* userDetails dosyasinin path ini alabiliriz ama bunu cloneladigimizde her pc de calismayabilir
       bu yuzden Paths.get
        */
            body = body.replaceAll("replaceName", name);
            body = body.replaceAll("replaceEmail", email);
            body = body.replaceAll("replaceStatus", status);
            body = body.replaceAll("replaceGender", gender);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return body;


    }
}
