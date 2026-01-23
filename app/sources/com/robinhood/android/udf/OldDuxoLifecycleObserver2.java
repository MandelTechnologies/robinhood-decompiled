package com.robinhood.android.udf;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OldDuxoLifecycleObserver.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"attachToLifecycle", "", "Lcom/robinhood/android/udf/OldDuxo;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "lib-udf_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.udf.OldDuxoLifecycleObserverKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OldDuxoLifecycleObserver2 {
    public static final void attachToLifecycle(OldDuxo<?> oldDuxo, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(oldDuxo, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        lifecycleOwner.getLifecycle().addObserver(new OldDuxoLifecycleObserver(oldDuxo));
    }
}
