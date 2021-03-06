package edu.bennett.tachyons.vms;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by NAYA on 8/8/2017.
 */

public class json_visitee {
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private List<visitee_list> data = null;
    @SerializedName("errors")
    @Expose
    private Errorcodes errors;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<visitee_list> getData() {
        return data;
    }

    public void setData(List<visitee_list> data) {
        this.data = data;
    }

    public Errorcodes getErrors() {
        return errors;
    }

    public void setErrors(Errorcodes errors) {
        this.errors = errors;
    }
}
