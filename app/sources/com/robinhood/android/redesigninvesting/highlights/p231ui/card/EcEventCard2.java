package com.robinhood.android.redesigninvesting.highlights.p231ui.card;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.invest_tab_highlights.proto.p494v1.HighlightTypeDto;

/* compiled from: EcEventCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$EcEventCardKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class EcEventCard2 {
    public static final EcEventCard2 INSTANCE = new EcEventCard2();
    private static Function2<Composer, Integer, Unit> lambda$1231006663 = ComposableLambda3.composableLambdaInstance(1231006663, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$EcEventCardKt$lambda$1231006663$1
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
                ComposerKt.traceEventStart(1231006663, i, -1, "com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$EcEventCardKt.lambda$1231006663.<anonymous> (EcEventCard.kt:100)");
            }
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            EcEventCard4.EcEventCard(new HighlightCard.RealHighlightCard.EcEventCard(string2, HighlightTypeDto.EC_EVENT, "", "", new HighlightCard.RealHighlightCard.EcEventCard.Contract("BAL", "7", new BigDecimal("0.3"), new HighlightCard.RealHighlightCard.EcEventCard.DayNightColor("#FF0000", "#FF0000")), new HighlightCard.RealHighlightCard.EcEventCard.Contract("PIT", "14", new BigDecimal("0.7"), new HighlightCard.RealHighlightCard.EcEventCard.DayNightColor("#00FF00", "#00FF00")), "Q2 4:25"), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1231006663$lib_highlights_ui_externalDebug() {
        return lambda$1231006663;
    }
}
