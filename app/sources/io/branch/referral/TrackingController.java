package io.branch.referral;

import android.content.Context;

/* loaded from: classes21.dex */
class TrackingController {
    private boolean trackingDisabled = true;

    TrackingController(Context context) {
        updateTrackingState(context);
    }

    void disableTracking(Context context, boolean z) {
        if (this.trackingDisabled != z) {
            this.trackingDisabled = z;
            if (z) {
                onTrackingDisabled(context);
            } else {
                onTrackingEnabled();
            }
            PrefHelper.getInstance(context).setBool("bnc_tracking_state", Boolean.valueOf(z));
        }
    }

    boolean isTrackingDisabled() {
        return this.trackingDisabled;
    }

    void updateTrackingState(Context context) {
        this.trackingDisabled = PrefHelper.getInstance(context).getBool("bnc_tracking_state");
    }

    private void onTrackingDisabled(Context context) {
        Branch.getInstance().clearPendingRequests();
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        prefHelper.setSessionID("bnc_no_value");
        prefHelper.setLinkClickID("bnc_no_value");
        prefHelper.setLinkClickIdentifier("bnc_no_value");
        prefHelper.setAppLink("bnc_no_value");
        prefHelper.setInstallReferrerParams("bnc_no_value");
        prefHelper.setGooglePlayReferrer("bnc_no_value");
        prefHelper.setGoogleSearchInstallIdentifier("bnc_no_value");
        prefHelper.setExternalIntentUri("bnc_no_value");
        prefHelper.setExternalIntentExtra("bnc_no_value");
        prefHelper.setSessionParams("bnc_no_value");
        prefHelper.saveLastStrongMatchTime(0L);
    }

    private void onTrackingEnabled() throws InterruptedException {
        Branch branch = Branch.getInstance();
        if (branch != null) {
            branch.registerAppInit(branch.getInstallOrOpenRequest(null), true);
        }
    }
}
