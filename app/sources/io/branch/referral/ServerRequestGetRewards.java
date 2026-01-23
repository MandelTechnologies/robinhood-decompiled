package io.branch.referral;

import android.content.Context;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
class ServerRequestGetRewards extends ServerRequest {
    @Override // io.branch.referral.ServerRequest
    public void clearCallbacks() {
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
    }

    @Override // io.branch.referral.ServerRequest
    public boolean isGetRequest() {
        return true;
    }

    public ServerRequestGetRewards(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    @Override // io.branch.referral.ServerRequest
    public String getRequestUrl() {
        return super.getRequestUrl() + this.prefHelper_.getIdentityID();
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        Iterator<String> itKeys = serverResponse.getObject().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                int i = serverResponse.getObject().getInt(next);
                this.prefHelper_.getCreditCount(next);
                this.prefHelper_.setCreditCount(next, i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        return !super.doesAppHasInternetPermission(context);
    }
}
