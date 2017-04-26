package alayluya.loopin.com.loopin_alayluya.Pojo;

import java.util.ArrayList;

/**
 * Created by ranja_000 on 4/5/2017.
 */

public class SignUpReturn {

    boolean IsSuccess;
    String Message;
    ArrayList<Result> results;

    public SignUpReturn(boolean isSuccess, String Message, ArrayList<Result> results) {
        IsSuccess = isSuccess;
        this.results = results;
        this.Message = Message;
    }

    public boolean isSuccess() {
        return IsSuccess;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public String getMessage() {
        return Message;
    }

    class Result {

    }
}
