package com.withpersona.sdk2.inquiry.shared;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContextUtils.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0006\u001a\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0006\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t\"\u0015\u0010\u0018\u001a\u00020\u0015*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Landroid/content/Context;", "", "getApplicationName", "(Landroid/content/Context;)Ljava/lang/String;", "", "isDebugBuild", "(Landroid/content/Context;)Z", "Landroidx/appcompat/app/AppCompatActivity;", "requireActivity", "(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/lifecycle/LifecycleOwner;", "requireLifecycleOwner", "(Landroid/content/Context;)Landroidx/lifecycle/LifecycleOwner;", "", "hideKeyboard", "(Landroid/content/Context;)V", "showKeyboard", "isTalkbackEnabled", "isMicPresent", "getActivity", "activity", "Ljava/io/File;", "getSdkCacheDir", "(Landroid/content/Context;)Ljava/io/File;", "sdkCacheDir", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.ContextUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ContextUtils3 {
    public static final String getApplicationName(Context context) {
        String string2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i = context.getApplicationInfo().labelRes;
        if (i == 0) {
            try {
                CharSequence charSequence = context.getApplicationInfo().nonLocalizedLabel;
                return (charSequence == null || (string2 = charSequence.toString()) == null) ? context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() : string2;
            } catch (PackageManager.NameNotFoundException unused) {
                return "";
            }
        }
        String string3 = context.getString(i);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public static final boolean isDebugBuild(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getApplicationInfo().flags & 2) != 0;
    }

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

    public static final LifecycleOwner requireLifecycleOwner(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        AppCompatActivity activity = getActivity(context);
        if (activity != null) {
            return activity;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void hideKeyboard(Context context) {
        View currentFocus;
        Intrinsics.checkNotNullParameter(context, "<this>");
        AppCompatActivity activity = getActivity(context);
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static final void showKeyboard(Context context) {
        View currentFocus;
        Intrinsics.checkNotNullParameter(context, "<this>");
        AppCompatActivity activity = getActivity(context);
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(currentFocus, 1);
        }
    }

    public static final boolean isTalkbackEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isEnabled();
    }

    public static final boolean isMicPresent(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        } catch (Exception unused) {
            return false;
        }
    }

    public static final File getSdkCacheDir(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return new File(context.getCacheDir(), "pi2");
    }
}
