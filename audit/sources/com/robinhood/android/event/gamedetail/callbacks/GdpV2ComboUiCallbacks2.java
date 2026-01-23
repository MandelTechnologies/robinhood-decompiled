package com.robinhood.android.event.gamedetail.callbacks;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GdpV2ComboUiCallbacks.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"compositeGdpV2ComboUiCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpV2ComboUiCallbacks;", "screenCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;", "chartCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;", "comboCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;", "commonCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;", "(Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/event/gamedetail/callbacks/GdpV2ComboUiCallbacks;", "updateWithComboCallbacks", "mutation", "Lkotlin/Function1;", "(Lcom/robinhood/android/event/gamedetail/callbacks/GdpV2ComboUiCallbacks;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/event/gamedetail/callbacks/GdpV2ComboUiCallbacks;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.callbacks.GdpV2ComboUiCallbacksKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GdpV2ComboUiCallbacks2 {
    public static final GdpV2ComboUiCallbacks compositeGdpV2ComboUiCallbacks(GameDetailScreenCallbacks screenCallbacks, ChartCallbacks chartCallbacks, GameDetailComboCallbacks comboCallbacks, GdpCommonCallbacks commonCallbacks, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(screenCallbacks, "screenCallbacks");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Intrinsics.checkNotNullParameter(comboCallbacks, "comboCallbacks");
        Intrinsics.checkNotNullParameter(commonCallbacks, "commonCallbacks");
        composer.startReplaceGroup(-1970831529);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1970831529, i, -1, "com.robinhood.android.event.gamedetail.callbacks.compositeGdpV2ComboUiCallbacks (GdpV2ComboUiCallbacks.kt:25)");
        }
        composer.startReplaceGroup(-1224400529);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(screenCallbacks)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(chartCallbacks)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(comboCallbacks)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(commonCallbacks)) || (i & 3072) == 2048);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new GdpV2ComboUiCallbacks(screenCallbacks, chartCallbacks, comboCallbacks, commonCallbacks);
            composer.updateRememberedValue(objRememberedValue);
        }
        GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks = (GdpV2ComboUiCallbacks) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return gdpV2ComboUiCallbacks;
    }

    public static final GdpV2ComboUiCallbacks updateWithComboCallbacks(GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, Function1<? super GameDetailComboCallbacks, ? extends GameDetailComboCallbacks> mutation, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(gdpV2ComboUiCallbacks, "<this>");
        Intrinsics.checkNotNullParameter(mutation, "mutation");
        composer.startReplaceGroup(-1325334778);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1325334778, i, -1, "com.robinhood.android.event.gamedetail.callbacks.updateWithComboCallbacks (GdpV2ComboUiCallbacks.kt:32)");
        }
        composer.startReplaceGroup(-1633490746);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(gdpV2ComboUiCallbacks)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(mutation)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new GdpV2ComboUiCallbacks(gdpV2ComboUiCallbacks, gdpV2ComboUiCallbacks, mutation.invoke(gdpV2ComboUiCallbacks), gdpV2ComboUiCallbacks);
            composer.updateRememberedValue(objRememberedValue);
        }
        GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks2 = (GdpV2ComboUiCallbacks) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return gdpV2ComboUiCallbacks2;
    }
}
