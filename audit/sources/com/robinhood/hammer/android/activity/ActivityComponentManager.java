package com.robinhood.hammer.android.activity;

import android.app.Activity;
import com.robinhood.hammer.android.activity.ActivityComponent;
import com.robinhood.hammer.core.internal.AbstractComponentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityComponentManager.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/hammer/android/activity/ActivityComponentManager;", "Lcom/robinhood/hammer/core/internal/AbstractComponentManager;", "Lcom/robinhood/hammer/android/activity/ActivityComponent;", "activity", "Landroid/app/Activity;", "retainedComponentManager", "Lcom/robinhood/hammer/android/activity/ActivityRetainedComponentManager;", "<init>", "(Landroid/app/Activity;Lcom/robinhood/hammer/android/activity/ActivityRetainedComponentManager;)V", "createComponent", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ActivityComponentManager extends AbstractComponentManager<ActivityComponent> {
    private final Activity activity;
    private final ActivityRetainedComponentManager retainedComponentManager;

    public ActivityComponentManager(Activity activity, ActivityRetainedComponentManager retainedComponentManager) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(retainedComponentManager, "retainedComponentManager");
        this.activity = activity;
        this.retainedComponentManager = retainedComponentManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.hammer.core.internal.AbstractComponentManager
    public ActivityComponent createComponent() {
        return ((ActivityComponent.ParentComponent) this.retainedComponentManager.get()).createActivitySubcomponentFactory().build(this.activity);
    }
}
