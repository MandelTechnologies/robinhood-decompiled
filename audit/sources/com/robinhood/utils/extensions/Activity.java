package com.robinhood.utils.extensions;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Activity.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0007\u001a\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\u0003\"\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"intentExtra", "Lkotlin/Lazy;", "T", "Landroid/app/Activity;", "key", "", "defaultValueIfNull", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Lazy;", "hideKeyboard", "Lio/reactivex/Observable;", "", "implicitOnly", "", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ActivityKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Activity {
    private static DisplayMetrics displayMetrics;

    public static final <T> Lazy<T> intentExtra(final android.app.Activity activity, final String key) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.utils.extensions.ActivityKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Activity.intentExtra$lambda$0(activity, key);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object intentExtra$lambda$0(android.app.Activity activity, String str) {
        Bundle extras;
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return extras.get(str);
    }

    public static final <T> Lazy<T> intentExtra(final android.app.Activity activity, final String key, final T t) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.utils.extensions.ActivityKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Activity.intentExtra$lambda$1(activity, key, t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object intentExtra$lambda$1(android.app.Activity activity, String str, Object obj) {
        Bundle extras;
        Intent intent = activity.getIntent();
        Object obj2 = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get(str);
        return obj2 == null ? obj : obj2;
    }

    public static /* synthetic */ Observable hideKeyboard$default(android.app.Activity activity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return hideKeyboard(activity, z);
    }

    public static final Observable<Integer> hideKeyboard(android.app.Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return ContextsUiExtensions.hideKeyboard(activity, activity.getWindow().getDecorView().getWindowToken(), z);
    }

    public static final DisplayMetrics getDisplayMetrics(android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (displayMetrics == null) {
            displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        DisplayMetrics displayMetrics2 = displayMetrics;
        Intrinsics.checkNotNull(displayMetrics2);
        return displayMetrics2;
    }
}
