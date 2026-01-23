package com.robinhood.android.libdesignsystem.serverui.experimental.position;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: LocalDimensionTracker.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"LocalDimensionTracker", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker;", "getLocalDimensionTracker", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTrackerKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class LocalDimensionTracker2 {
    private static final CompositionLocal6<LocalDimensionTracker> LocalDimensionTracker = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTrackerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalDimensionTracker2.LocalDimensionTracker$lambda$0();
        }
    });

    public static final CompositionLocal6<LocalDimensionTracker> getLocalDimensionTracker() {
        return LocalDimensionTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDimensionTracker LocalDimensionTracker$lambda$0() {
        return new LocalDimensionTracker3();
    }
}
