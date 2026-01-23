package com.robinhood.utils.p409ui.lifecycle;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContextLifecycles.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\b"}, m3636d2 = {"lifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "Landroid/content/Context;", "getLifecycleState", "(Landroid/content/Context;)Landroidx/lifecycle/Lifecycle$State;", "isResumed", "", "(Landroid/content/Context;)Ljava/lang/Boolean;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.lifecycle.ContextLifecyclesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ContextLifecycles {
    public static final Lifecycle.State getLifecycleState(Context context) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(context, "<this>");
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
        if (appCompatActivityFindActivityBaseContext == null || (lifecycle = appCompatActivityFindActivityBaseContext.getLifecycle()) == null) {
            return null;
        }
        return lifecycle.getState();
    }

    public static final Boolean isResumed(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Lifecycle.State lifecycleState = getLifecycleState(context);
        if (lifecycleState != null) {
            return Boolean.valueOf(lifecycleState.isAtLeast(Lifecycle.State.RESUMED));
        }
        return null;
    }
}
