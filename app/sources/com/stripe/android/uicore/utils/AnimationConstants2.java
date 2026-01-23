package com.stripe.android.uicore.utils;

import android.app.Activity;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimationConstants.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m3636d2 = {"fadeOut", "", "Landroid/app/Activity;", "stripe-ui-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.uicore.utils.AnimationConstantsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class AnimationConstants2 {
    public static final void fadeOut(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            AnimationConstants animationConstants = AnimationConstants.INSTANCE;
            activity.overrideActivityTransition(1, animationConstants.getFADE_IN(), animationConstants.getFADE_OUT());
        } else {
            AnimationConstants animationConstants2 = AnimationConstants.INSTANCE;
            activity.overridePendingTransition(animationConstants2.getFADE_IN(), animationConstants2.getFADE_OUT());
        }
    }
}
