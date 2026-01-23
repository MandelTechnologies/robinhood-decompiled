package com.withpersona.sdk2.camera;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContextUtils.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m3636d2 = {"getActivity", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/Context;", "requireActivity", "camera_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.ContextUtilsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class ContextUtils2 {
    public static final AppCompatActivity getActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return getActivity(baseContext);
    }

    public static final AppCompatActivity requireActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        AppCompatActivity activity = getActivity(context);
        if (activity != null) {
            return activity;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
