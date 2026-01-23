package io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import io.branch.referral.Branch;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes21.dex */
class BranchActivityLifecycleObserver implements Application.ActivityLifecycleCallbacks {
    private int activityCnt_ = 0;
    private Set<String> activitiesOnStack_ = new HashSet();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    BranchActivityLifecycleObserver() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        PrefHelper.Debug("onActivityCreated, activity = " + activity);
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        branch.setIntentState(Branch.INTENT_STATE.PENDING);
        if (BranchViewHandler.getInstance().isInstallOrOpenBranchViewPending(activity.getApplicationContext())) {
            BranchViewHandler.getInstance().showPendingBranchView(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        PrefHelper.Debug("onActivityStarted, activity = " + activity);
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        branch.currentActivityReference_ = new WeakReference<>(activity);
        branch.setIntentState(Branch.INTENT_STATE.PENDING);
        this.activityCnt_++;
        maybeRefreshAdvertisingID(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) throws InterruptedException {
        PrefHelper.Debug("onActivityResumed, activity = " + activity);
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        if (!Branch.bypassCurrentActivityIntentState()) {
            branch.onIntentReady(activity);
        }
        if (branch.getInitState() == Branch.SESSION_STATE.UNINITIALISED && !Branch.disableAutoSessionInitialization) {
            if (Branch.getPluginName() == null) {
                PrefHelper.Debug("initializing session on user's behalf (onActivityResumed called but SESSION_STATE = UNINITIALISED)");
                Branch.sessionBuilder(activity).init();
            } else {
                PrefHelper.Debug("onActivityResumed called and SESSION_STATE = UNINITIALISED, however this is a " + Branch.getPluginName() + " plugin, so we are NOT initializing session on user's behalf");
            }
        }
        this.activitiesOnStack_.add(activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        PrefHelper.Debug("onActivityPaused, activity = " + activity);
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        branch.getShareLinkManager();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) throws InterruptedException {
        PrefHelper.Debug("onActivityStopped, activity = " + activity);
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        int i = this.activityCnt_ - 1;
        this.activityCnt_ = i;
        if (i < 1) {
            branch.setInstantDeepLinkPossible(false);
            branch.closeSessionInternal();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        PrefHelper.Debug("onActivityDestroyed, activity = " + activity);
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        if (branch.getCurrentActivity() == activity) {
            branch.currentActivityReference_.clear();
        }
        BranchViewHandler.getInstance().onCurrentActivityDestroyed(activity);
        this.activitiesOnStack_.remove(activity.toString());
    }

    private void maybeRefreshAdvertisingID(Context context) {
        Branch branch = Branch.getInstance();
        if (branch == null || branch.getTrackingController() == null || branch.getDeviceInfo() == null || branch.getDeviceInfo().getSystemObserver() == null || branch.getPrefHelper() == null || branch.getPrefHelper().getSessionID() == null) {
            return;
        }
        if (branch.getPrefHelper().getSessionID().equals(branch.getDeviceInfo().getSystemObserver().getAIDInitializationSessionID()) || branch.isGAParamsFetchInProgress() || branch.getTrackingController().isTrackingDisabled()) {
            return;
        }
        branch.setGAParamsFetchInProgress(branch.getDeviceInfo().getSystemObserver().prefetchAdsParams(context, branch));
    }

    boolean isCurrentActivityLaunchedFromStack() {
        Branch branch = Branch.getInstance();
        if (branch == null || branch.getCurrentActivity() == null) {
            return false;
        }
        return this.activitiesOnStack_.contains(branch.getCurrentActivity().toString());
    }
}
