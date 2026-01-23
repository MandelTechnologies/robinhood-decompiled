package com.robinhood.android.navigation.compose;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposableCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u0004*\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u0004*\u00020\t¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"COMPOSABLE_ARGS_KEY", "", "typedArgs", "T", "Landroid/os/Parcelable;", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)Landroid/os/Parcelable;", "args", "ARG", "Landroidx/navigation/NavBackStackEntry;", "(Landroidx/navigation/NavBackStackEntry;)Landroid/os/Parcelable;", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.compose.ComposableCompanionKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ComposableCompanion {
    public static final String COMPOSABLE_ARGS_KEY = "rh_navigation_args";

    public static final <T extends Parcelable> T typedArgs(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        return (T) savedStateHandle.get("rh_navigation_args");
    }

    public static final <ARG extends Parcelable> ARG args(NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Bundle arguments = navBackStackEntry.getArguments();
        ARG arg = arguments != null ? (ARG) arguments.getParcelable("rh_navigation_args") : null;
        Intrinsics.checkNotNull(arg, "null cannot be cast to non-null type ARG of com.robinhood.android.navigation.compose.ComposableCompanionKt.args");
        return arg;
    }
}
