package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes21.dex */
class ServerRequestRegisterOpen extends ServerRequestInitSession {
    Branch.BranchReferralInitListener callback_;

    @Override // io.branch.referral.ServerRequest
    public boolean isGetRequest() {
        return false;
    }

    ServerRequestRegisterOpen(Context context, Branch.BranchReferralInitListener branchReferralInitListener) {
        super(context, Defines$RequestPath.RegisterOpen.getPath());
        this.callback_ = branchReferralInitListener;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Defines$Jsonkey.DeviceFingerprintID.getKey(), this.prefHelper_.getDeviceFingerPrintID());
            jSONObject.put(Defines$Jsonkey.IdentityID.getKey(), this.prefHelper_.getIdentityID());
            setPost(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.constructError_ = true;
        }
    }

    ServerRequestRegisterOpen(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public void onPreExecute() {
        super.onPreExecute();
        if (Branch.getInstance().isInstantDeepLinkPossible()) {
            Branch.BranchReferralInitListener branchReferralInitListener = this.callback_;
            if (branchReferralInitListener != null) {
                branchReferralInitListener.onInitFinished(Branch.getInstance().getLatestReferringParams(), null);
            }
            Branch.getInstance().addExtraInstrumentationData(Defines$Jsonkey.InstantDeepLinkSession.getKey(), "true");
            Branch.getInstance().setInstantDeepLinkPossible(false);
        }
    }

    @Override // io.branch.referral.ServerRequestInitSession, io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) throws InterruptedException {
        super.onRequestSucceeded(serverResponse, branch);
        try {
            JSONObject object = serverResponse.getObject();
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.LinkClickID;
            if (object.has(defines$Jsonkey.getKey())) {
                this.prefHelper_.setLinkClickID(serverResponse.getObject().getString(defines$Jsonkey.getKey()));
            } else {
                this.prefHelper_.setLinkClickID("bnc_no_value");
            }
            JSONObject object2 = serverResponse.getObject();
            Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.Data;
            if (object2.has(defines$Jsonkey2.getKey())) {
                JSONObject jSONObject = new JSONObject(serverResponse.getObject().getString(defines$Jsonkey2.getKey()));
                Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.Clicked_Branch_Link;
                if (jSONObject.has(defines$Jsonkey3.getKey()) && jSONObject.getBoolean(defines$Jsonkey3.getKey()) && this.prefHelper_.getInstallParams().equals("bnc_no_value") && this.prefHelper_.getIsReferrable() == 1) {
                    this.prefHelper_.setInstallParams(serverResponse.getObject().getString(defines$Jsonkey2.getKey()));
                }
            }
            if (serverResponse.getObject().has(defines$Jsonkey2.getKey())) {
                this.prefHelper_.setSessionParams(serverResponse.getObject().getString(defines$Jsonkey2.getKey()));
            } else {
                this.prefHelper_.setSessionParams("bnc_no_value");
            }
            if (this.callback_ != null && !Branch.getInstance().isIDLSession()) {
                this.callback_.onInitFinished(branch.getLatestReferringParams(), null);
            }
            this.prefHelper_.setAppVersion(DeviceInfo.getInstance().getAppVersion());
        } catch (Exception e) {
            e.printStackTrace();
        }
        onInitSessionCompleted(serverResponse, branch);
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
        if (this.callback_ == null || Branch.getInstance().isIDLSession()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.callback_.onInitFinished(jSONObject, new BranchError("Trouble initializing Branch. " + str, i));
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        if (super.doesAppHasInternetPermission(context)) {
            return false;
        }
        if (this.callback_ == null || Branch.getInstance().isIDLSession()) {
            return true;
        }
        this.callback_.onInitFinished(null, new BranchError("Trouble initializing Branch.", -102));
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    public void clearCallbacks() {
        this.callback_ = null;
    }

    @Override // io.branch.referral.ServerRequestInitSession
    public String getRequestActionName() {
        return "open";
    }
}
