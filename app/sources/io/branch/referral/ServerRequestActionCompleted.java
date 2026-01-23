package io.branch.referral;

import android.app.Activity;
import android.content.Context;
import io.branch.referral.BranchViewHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
class ServerRequestActionCompleted extends ServerRequest {
    private final BranchViewHandler.IBranchViewEvents callback_;

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

    @Override // io.branch.referral.ServerRequest
    public boolean shouldRetryOnFail() {
        return true;
    }

    public ServerRequestActionCompleted(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.callback_ = null;
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) {
        if (serverResponse.getObject() != null) {
            JSONObject object = serverResponse.getObject();
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.BranchViewData;
            if (!object.has(defines$Jsonkey.getKey()) || Branch.getInstance().getCurrentActivity() == null) {
                return;
            }
            String string2 = "";
            try {
                JSONObject post = getPost();
                if (post != null) {
                    Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.Event;
                    if (post.has(defines$Jsonkey2.getKey())) {
                        string2 = post.getString(defines$Jsonkey2.getKey());
                    }
                }
                Activity currentActivity = Branch.getInstance().getCurrentActivity();
                BranchViewHandler.getInstance().showBranchView(serverResponse.getObject().getJSONObject(defines$Jsonkey.getKey()), string2, currentActivity, this.callback_);
            } catch (JSONException unused) {
                BranchViewHandler.IBranchViewEvents iBranchViewEvents = this.callback_;
                if (iBranchViewEvents != null) {
                    iBranchViewEvents.onBranchViewError(-201, "Unable to show branch view. Branch view received is invalid ", string2);
                }
            }
        }
    }

    @Override // io.branch.referral.ServerRequest
    public boolean handleErrors(Context context) {
        return !super.doesAppHasInternetPermission(context);
    }
}
