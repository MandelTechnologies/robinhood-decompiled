package com.robinhood.android.navigation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Intents.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\b2\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u0010\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\f\u001a\u00020\r\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\f\u001a\u00020\r*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u000e\u0010\u0011\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"navigationType", "Lcom/robinhood/android/navigation/NavigationType;", "Landroid/content/Intent;", "getNavigationType", "(Landroid/content/Intent;)Lcom/robinhood/android/navigation/NavigationType;", "putNavigationType", "", "removeNavigationType", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Lcom/robinhood/android/navigation/NavigationType;", Intents2.KEY_NAVIGATION_TYPE, "", "navigationTypeTransitionEnabled", "", "getNavigationTypeTransitionEnabled", "(Landroid/content/Intent;)Z", "putNavigationTypeTransitionEnabled", Intents2.KEY_NAVIGATION_TYPE_TRANSITION_ENABLED, "lib-navigation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.navigation.IntentsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Intents2 {
    private static final String KEY_NAVIGATION_TYPE = "KEY_NAVIGATION_TYPE";
    private static final String KEY_NAVIGATION_TYPE_TRANSITION_ENABLED = "KEY_NAVIGATION_TYPE_TRANSITION_ENABLED";

    public static final void putNavigationType(Intent intent, NavigationType navigationType) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(KEY_NAVIGATION_TYPE, navigationType);
    }

    public static final void removeNavigationType(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.removeExtra(KEY_NAVIGATION_TYPE);
    }

    public static final void putNavigationType(Bundle bundle, NavigationType navigationType) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        bundle.putSerializable(KEY_NAVIGATION_TYPE, navigationType);
    }

    public static final NavigationType getNavigationType(Intent intent) {
        Object serializableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            serializableExtra = intent.getSerializableExtra(KEY_NAVIGATION_TYPE, NavigationType.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra(KEY_NAVIGATION_TYPE);
            if (!(serializableExtra2 instanceof NavigationType)) {
                serializableExtra2 = null;
            }
            serializableExtra = (NavigationType) serializableExtra2;
        }
        return (NavigationType) serializableExtra;
    }

    public static final NavigationType getNavigationType(Bundle bundle) {
        Object serializable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            serializable = bundle.getSerializable(KEY_NAVIGATION_TYPE, NavigationType.class);
        } else {
            Object serializable2 = bundle.getSerializable(KEY_NAVIGATION_TYPE);
            if (!(serializable2 instanceof NavigationType)) {
                serializable2 = null;
            }
            serializable = (NavigationType) serializable2;
        }
        return (NavigationType) serializable;
    }

    public static final boolean getNavigationTypeTransitionEnabled(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(KEY_NAVIGATION_TYPE_TRANSITION_ENABLED, false);
    }

    public static final void putNavigationTypeTransitionEnabled(Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(KEY_NAVIGATION_TYPE_TRANSITION_ENABLED, z);
    }
}
