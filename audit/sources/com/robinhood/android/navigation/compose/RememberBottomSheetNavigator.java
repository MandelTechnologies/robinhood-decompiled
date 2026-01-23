package com.robinhood.android.navigation.compose;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RememberBottomSheetNavigator.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"rememberBottomSheetNavigator", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.navigation.compose.RememberBottomSheetNavigatorKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class RememberBottomSheetNavigator {
    public static final BottomSheetNavigator rememberBottomSheetNavigator(ModalBottomSheetState sheetState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        composer.startReplaceGroup(670062165);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(670062165, i, -1, "com.robinhood.android.navigation.compose.rememberBottomSheetNavigator (RememberBottomSheetNavigator.kt:18)");
        }
        composer.startReplaceGroup(5004770);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(sheetState)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new BottomSheetNavigator(sheetState);
            composer.updateRememberedValue(objRememberedValue);
        }
        BottomSheetNavigator bottomSheetNavigator = (BottomSheetNavigator) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bottomSheetNavigator;
    }
}
