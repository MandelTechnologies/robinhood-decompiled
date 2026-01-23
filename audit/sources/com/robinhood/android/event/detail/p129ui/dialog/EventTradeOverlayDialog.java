package com.robinhood.android.event.detail.p129ui.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EventTradeOverlayDialog.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.ui.dialog.ComposableSingletons$EventTradeOverlayDialogKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventTradeOverlayDialog {
    public static final EventTradeOverlayDialog INSTANCE = new EventTradeOverlayDialog();
    private static Function2<Composer, Integer, Unit> lambda$584689744 = ComposableLambda3.composableLambdaInstance(584689744, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ui.dialog.ComposableSingletons$EventTradeOverlayDialogKt$lambda$584689744$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(584689744, i, -1, "com.robinhood.android.event.detail.ui.dialog.ComposableSingletons$EventTradeOverlayDialogKt.lambda$584689744.<anonymous> (EventTradeOverlayDialog.kt:258)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CLOSE_16), BentoAlertSheet6.button2Title, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$584689744$feature_event_detail_externalDebug() {
        return lambda$584689744;
    }
}
