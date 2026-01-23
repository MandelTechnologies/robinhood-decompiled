package com.robinhood.referral;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.referral.branch.BranchManager;
import io.branch.referral.Branch;
import io.branch.referral.BranchError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ReleaseReferralModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/referral/ReleaseReferralModule;", "", "<init>", "()V", "provideBranchManager", "Lcom/robinhood/referral/branch/BranchManager;", "disableTrackingPref", "Lcom/robinhood/prefs/BooleanPreference;", "providesBranchDisableTrackingPref", SharedPreferencesModule.DEVICE_PREFS_NAME, "Landroid/content/SharedPreferences;", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ReleaseReferralModule {
    public static final ReleaseReferralModule INSTANCE = new ReleaseReferralModule();

    private ReleaseReferralModule() {
    }

    public final BranchManager provideBranchManager(@BranchDisableTrackingPref final BooleanPreference disableTrackingPref) {
        Intrinsics.checkNotNullParameter(disableTrackingPref, "disableTrackingPref");
        return new BranchManager() { // from class: com.robinhood.referral.ReleaseReferralModule.provideBranchManager.1
            @Override // com.robinhood.referral.branch.BranchManager
            public void appInit(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                Branch.expectDelayedSessionInitialization(true);
                Branch.getAutoInstance(context).disableTracking(disableTrackingPref.get());
            }

            @Override // com.robinhood.referral.branch.BranchManager
            public void initSession(Uri data, Activity activity, final Function2<? super JSONObject, ? super String, Unit> listener) throws InterruptedException {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(listener, "listener");
                Branch.sessionBuilder(activity).withCallback(new Branch.BranchReferralInitListener() { // from class: com.robinhood.referral.ReleaseReferralModule$provideBranchManager$1$initSession$branchListener$1
                    @Override // io.branch.referral.Branch.BranchReferralInitListener
                    public final void onInitFinished(JSONObject jSONObject, BranchError branchError) {
                        listener.invoke(jSONObject, branchError != null ? branchError.getMessage() : null);
                    }
                }).withData(data).init();
            }

            @Override // com.robinhood.referral.branch.BranchManager
            public void setIdentity(String identity) throws InterruptedException {
                Intrinsics.checkNotNullParameter(identity, "identity");
                Branch.getInstance().setIdentity(identity);
            }

            @Override // com.robinhood.referral.branch.BranchManager
            public void disableTracking(boolean disableTracking) {
                disableTrackingPref.set(disableTracking);
                Branch branch = Branch.getInstance();
                if (branch != null) {
                    branch.disableTracking(disableTracking);
                }
            }

            @Override // com.robinhood.referral.branch.BranchManager
            public void logout() throws InterruptedException {
                Branch.getInstance().logout();
            }
        };
    }

    @BranchDisableTrackingPref
    public final BooleanPreference providesBranchDisableTrackingPref(@DevicePrefs SharedPreferences devicePrefs) {
        Intrinsics.checkNotNullParameter(devicePrefs, "devicePrefs");
        return new BooleanPreference(devicePrefs, "branch_disableTracking", false, null, 12, null);
    }
}
