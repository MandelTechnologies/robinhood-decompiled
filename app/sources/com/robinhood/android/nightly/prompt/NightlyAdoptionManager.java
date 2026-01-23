package com.robinhood.android.nightly.prompt;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.RhProcessLifecycleOwner2;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDateTime;
import p479j$.time.chrono.ChronoLocalDateTime;

/* compiled from: NightlyAdoptionManager.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\f\u0010\u001a\u001a\u00020\u000e*\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyAdoptionManager;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "Lcom/robinhood/utils/ProcessLifecycleObserver;", "nightlyUpgradePrompt", "Lcom/robinhood/android/nightly/prompt/NightlyUpgradePrompt;", "lastNightlyPromptPref", "Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "(Lcom/robinhood/android/nightly/prompt/NightlyUpgradePrompt;Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/utils/RhProcessLifecycleOwner;)V", "isRhEmployee", "", "disposable", "Lio/reactivex/disposables/Disposable;", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "onActivityResumed", "activity", "Landroid/app/Activity;", "shouldPrompt", "isNightlyInstalled", "Landroid/content/Context;", "Companion", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NightlyAdoptionManager implements ActivityLifecycleListener, RhProcessLifecycleOwner2 {
    private static final long DAYS_BETWEEN_PROMPTS = 3;
    private static final String NIGHTLY_APP_PACKAGE_NAME = "com.robinhood.android.internal";
    private Disposable disposable;
    private final ExperimentsStore experimentsStore;
    private boolean isRhEmployee;
    private final LastNightlyPromptDatePreference lastNightlyPromptPref;
    private final NightlyUpgradePrompt nightlyUpgradePrompt;
    public static final int $stable = 8;

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStopped(this, activity);
    }

    public NightlyAdoptionManager(NightlyUpgradePrompt nightlyUpgradePrompt, LastNightlyPromptDatePreference lastNightlyPromptPref, ExperimentsStore experimentsStore, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(nightlyUpgradePrompt, "nightlyUpgradePrompt");
        Intrinsics.checkNotNullParameter(lastNightlyPromptPref, "lastNightlyPromptPref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.nightlyUpgradePrompt = nightlyUpgradePrompt;
        this.lastNightlyPromptPref = lastNightlyPromptPref;
        this.experimentsStore = experimentsStore;
        rhProcessLifecycleOwner.register(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.disposable = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{EmployeeNightlyAdoptionExperiment.INSTANCE}, false, null, 6, null).subscribe(new Consumer() { // from class: com.robinhood.android.nightly.prompt.NightlyAdoptionManager.onStart.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Boolean bool) {
                NightlyAdoptionManager nightlyAdoptionManager = NightlyAdoptionManager.this;
                Intrinsics.checkNotNull(bool);
                nightlyAdoptionManager.isRhEmployee = bool.booleanValue();
            }
        });
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.isRhEmployee && (activity instanceof BaseActivity) && !isNightlyInstalled(activity) && shouldPrompt()) {
            this.nightlyUpgradePrompt.show((BaseActivity) activity);
        }
    }

    private final boolean shouldPrompt() {
        LocalDateTime lastPromptDate = this.lastNightlyPromptPref.getLastPromptDate();
        return lastPromptDate == null || lastPromptDate.plusDays(3L).compareTo((ChronoLocalDateTime<?>) LocalDateTime.now()) < 0;
    }

    private final boolean isNightlyInstalled(Context context) throws PackageManager.NameNotFoundException {
        try {
            context.getPackageManager().getPackageInfo(NIGHTLY_APP_PACKAGE_NAME, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
