package com.stripe.android.utils;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¨\u0006\u0006"}, m3636d2 = {"argsAreInvalid", "", "Landroid/app/Activity;", "argsProvider", "Lkotlin/Function0;", "", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.utils.ActivityUtilsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class ActivityUtils2 {
    public static final boolean argsAreInvalid(Activity activity, Function0<Unit> argsProvider) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(argsProvider, "argsProvider");
        try {
            argsProvider.invoke();
            return false;
        } catch (IllegalArgumentException unused) {
            activity.finish();
            return true;
        }
    }
}
