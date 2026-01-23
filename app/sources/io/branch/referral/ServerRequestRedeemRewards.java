package io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
class ServerRequestRedeemRewards extends ServerRequest {
    int actualNumOfCreditsToRedeem_;

    @Override // io.branch.referral.ServerRequest
    public void clearCallbacks() {
    }

    @Override // io.branch.referral.ServerRequest
    public void handleFailure(int i, String str) {
    }

    @Override // io.branch.referral.ServerRequest
    public boolean isGetRequest() {
        return false;
    }

    public ServerRequestRedeemRewards(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.actualNumOfCreditsToRedeem_ = 0;
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        return !super.doesAppHasInternetPermission(context) || this.actualNumOfCreditsToRedeem_ <= 0;
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        JSONObject post = getPost();
        if (post != null) {
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.Bucket;
            if (post.has(defines$Jsonkey.getKey())) {
                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.Amount;
                if (post.has(defines$Jsonkey2.getKey())) {
                    try {
                        int i = post.getInt(defines$Jsonkey2.getKey());
                        String string2 = post.getString(defines$Jsonkey.getKey());
                        this.prefHelper_.setCreditCount(string2, this.prefHelper_.getCreditCount(string2) - i);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
