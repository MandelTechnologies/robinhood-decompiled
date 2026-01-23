package com.robinhood.android.redesigninvesting.highlights.p231ui.card;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.invest_tab_highlights.proto.p494v1.HighlightTypeDto;

/* compiled from: EcReserveCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$EcReserveCardKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class EcReserveCard2 {
    public static final EcReserveCard2 INSTANCE = new EcReserveCard2();
    private static Function2<Composer, Integer, Unit> lambda$1441914824 = ComposableLambda3.composableLambdaInstance(1441914824, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$EcReserveCardKt$lambda$1441914824$1
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
                ComposerKt.traceEventStart(1441914824, i, -1, "com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$EcReserveCardKt.lambda$1441914824.<anonymous> (EcReserveCard.kt:51)");
            }
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            EcReserveCard5.EcReserveCard(new HighlightCard.RealHighlightCard.EcReserveCard(string2, HighlightTypeDto.EC_RESERVED, "", "", "Pro football", "12 games", false), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1403966981, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9193lambda$1403966981 = ComposableLambda3.composableLambdaInstance(-1403966981, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$EcReserveCardKt$lambda$-1403966981$1
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
                ComposerKt.traceEventStart(-1403966981, i, -1, "com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$EcReserveCardKt.lambda$-1403966981.<anonymous> (EcReserveCard.kt:68)");
            }
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            EcReserveCard5.EcReserveCard(new HighlightCard.RealHighlightCard.EcReserveCard(string2, HighlightTypeDto.EC_RESERVED, "", "", "Pro football", "4 games live", true), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1403966981$lib_highlights_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17961getLambda$1403966981$lib_highlights_ui_externalDebug() {
        return f9193lambda$1403966981;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1441914824$lib_highlights_ui_externalDebug() {
        return lambda$1441914824;
    }
}
