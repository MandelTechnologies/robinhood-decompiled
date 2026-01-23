package com.robinhood.android.eventcontracts.sharedeventui.scrolls;

import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CollapsingHeaderNestedScrollConnection.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"rememberCollapsingHeaderNestedScrollConnection", "Lcom/robinhood/android/eventcontracts/sharedeventui/scrolls/CollapsingHeaderNestedScrollConnection;", "headerMaxHeightPxState", "Landroidx/compose/runtime/State;", "", "(Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/eventcontracts/sharedeventui/scrolls/CollapsingHeaderNestedScrollConnection;", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.scrolls.CollapsingHeaderNestedScrollConnectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CollapsingHeaderNestedScrollConnection2 {
    public static final CollapsingHeaderNestedScrollConnection rememberCollapsingHeaderNestedScrollConnection(SnapshotState4<Float> headerMaxHeightPxState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(headerMaxHeightPxState, "headerMaxHeightPxState");
        composer.startReplaceGroup(1251889155);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1251889155, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.scrolls.rememberCollapsingHeaderNestedScrollConnection (CollapsingHeaderNestedScrollConnection.kt:64)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = ((((i & 14) ^ 6) > 4 && composer.changed(headerMaxHeightPxState)) || (i & 6) == 4) | composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CollapsingHeaderNestedScrollConnection(density, headerMaxHeightPxState);
            composer.updateRememberedValue(objRememberedValue);
        }
        CollapsingHeaderNestedScrollConnection collapsingHeaderNestedScrollConnection = (CollapsingHeaderNestedScrollConnection) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return collapsingHeaderNestedScrollConnection;
    }
}
