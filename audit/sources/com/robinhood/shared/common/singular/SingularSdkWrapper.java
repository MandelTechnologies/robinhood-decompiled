package com.robinhood.shared.common.singular;

import android.content.Intent;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: SingularSdkWrapper.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "", "activityLifecycleCallbacks", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "getActivityLifecycleCallbacks", "()Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "init", "", "intent", "Landroid/content/Intent;", "listener", "Lkotlin/Function1;", "Lcom/robinhood/shared/common/singular/LinkParams;", "enableSingular", "disableSingular", "lib-singular_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface SingularSdkWrapper {
    void disableSingular();

    void enableSingular();

    ActivityLifecycleListener getActivityLifecycleCallbacks();

    void init(Intent intent, Function1<? super LinkParams, Unit> listener);
}
