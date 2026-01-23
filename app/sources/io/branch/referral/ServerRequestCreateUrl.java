package io.branch.referral;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes21.dex */
class ServerRequestCreateUrl extends ServerRequest {
    private boolean defaultToLongUrl_;
    private boolean isAsync_;

    @Override // io.branch.referral.ServerRequest
    public void clearCallbacks() {
    }

    public BranchLinkData getLinkPost() {
        return null;
    }

    public void handleDuplicateURLError() {
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
    }

    @Override // io.branch.referral.ServerRequest
    public boolean isGetRequest() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    boolean isPersistable() {
        return false;
    }

    @Override // io.branch.referral.ServerRequest
    protected boolean prepareExecuteWithoutTracking() {
        return true;
    }

    public ServerRequestCreateUrl(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.isAsync_ = true;
        this.defaultToLongUrl_ = true;
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        return !super.doesAppHasInternetPermission(context);
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        try {
            serverResponse.getObject().getString("url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
