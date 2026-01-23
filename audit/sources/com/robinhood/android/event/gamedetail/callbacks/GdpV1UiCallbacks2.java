package com.robinhood.android.event.gamedetail.callbacks;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GdpV1UiCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"compositeGdpV1UiCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpV1UiCallbacks;", "screenCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;", "chartCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;", "gdpV1SelectionCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpV1SelectionCallbacks;", "commonCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;", "(Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/GdpV1SelectionCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/event/gamedetail/callbacks/GdpV1UiCallbacks;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.callbacks.GdpV1UiCallbacksKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GdpV1UiCallbacks2 {
    public static final GdpV1UiCallbacks compositeGdpV1UiCallbacks(GameDetailScreenCallbacks screenCallbacks, ChartCallbacks chartCallbacks, GdpV1SelectionCallbacks gdpV1SelectionCallbacks, GdpCommonCallbacks commonCallbacks, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenCallbacks, "screenCallbacks");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Intrinsics.checkNotNullParameter(gdpV1SelectionCallbacks, "gdpV1SelectionCallbacks");
        Intrinsics.checkNotNullParameter(commonCallbacks, "commonCallbacks");
        composer.startReplaceGroup(26344427);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(26344427, i, -1, "com.robinhood.android.event.gamedetail.callbacks.compositeGdpV1UiCallbacks (GdpV1UiCallbacks.kt:25)");
        }
        composer.startReplaceGroup(-1224400529);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(screenCallbacks)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(chartCallbacks)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(gdpV1SelectionCallbacks)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(commonCallbacks)) || (i & 3072) == 2048);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new GdpV1UiCallbacks(screenCallbacks, chartCallbacks, gdpV1SelectionCallbacks, commonCallbacks);
            composer.updateRememberedValue(objRememberedValue);
        }
        GdpV1UiCallbacks gdpV1UiCallbacks = (GdpV1UiCallbacks) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return gdpV1UiCallbacks;
    }
}
