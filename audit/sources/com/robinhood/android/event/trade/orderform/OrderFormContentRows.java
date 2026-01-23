package com.robinhood.android.event.trade.orderform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderFormContentRows.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.orderform.ComposableSingletons$OrderFormContentRowsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class OrderFormContentRows {
    public static final OrderFormContentRows INSTANCE = new OrderFormContentRows();
    private static Function3<String, Composer, Integer, Unit> lambda$143776392 = ComposableLambda3.composableLambdaInstance(143776392, false, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.ComposableSingletons$OrderFormContentRowsKt$lambda$143776392$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(143776392, i, -1, "com.robinhood.android.event.trade.orderform.ComposableSingletons$OrderFormContentRowsKt.lambda$143776392.<anonymous> (OrderFormContentRows.kt:300)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<String, Composer, Integer, Unit> getLambda$143776392$feature_event_trade_externalDebug() {
        return lambda$143776392;
    }
}
