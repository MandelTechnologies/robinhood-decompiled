package com.robinhood.android.navigation.compose.result;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SetResultToPreviousEntry.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"setResultToPreviousEntry", "", "Landroidx/navigation/NavController;", "result", "", "key", "", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.compose.result.SetResultToPreviousEntryKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SetResultToPreviousEntry {
    public static final void setResultToPreviousEntry(NavController navController, Object result, String key) {
        SavedStateHandle savedStateHandle;
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(key, "key");
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        if (previousBackStackEntry == null || (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) == null) {
            return;
        }
        savedStateHandle.set(key, result);
    }
}
