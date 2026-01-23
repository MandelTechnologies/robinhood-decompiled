package com.robinhood.shared.tradeladder.p398ui.ladder.shared.style;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTypography;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill.PillLoadingPlaceholderModifierKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LoadingStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.QuantityBarStyle;
import com.robinhood.utils.compose.extensions.Colors8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderStyle.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001e\u001a\u00020\u001b*\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoColors;", "bentoColors", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LadderStyle;", "ladderStyle", "(Lcom/robinhood/compose/bento/theme/BentoColors;)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LadderStyle;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/QuantityBarStyle;", "quantityBarStyle", "(Lcom/robinhood/compose/bento/theme/BentoColors;)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/QuantityBarStyle;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LoadingStyle;", "loadingStyle", "(Lcom/robinhood/compose/bento/theme/BentoColors;)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/LoadingStyle;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle;", "pillStyle", "(Lcom/robinhood/compose/bento/theme/BentoColors;)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle;", "Lkotlin/Function0;", "", "content", "WithLadderStyle", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalLadderStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLadderStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLadderStyle$annotations", "()V", "Lcom/robinhood/compose/bento/theme/BentoTypography;", "Landroidx/compose/ui/text/TextStyle;", "getTextMBold", "(Lcom/robinhood/compose/bento/theme/BentoTypography;)Landroidx/compose/ui/text/TextStyle;", "textMBold", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class LadderStyleKt {
    private static final CompositionLocal6<LadderStyle> LocalLadderStyle = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.style.LadderStyleKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LadderStyleKt.LocalLadderStyle$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WithLadderStyle$lambda$1(Function2 function2, int i, Composer composer, int i2) {
        WithLadderStyle(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLocalLadderStyle$annotations() {
    }

    private static final LoadingStyle loadingStyle(BentoColors bentoColors) {
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(2));
        float f = 1;
        return new LoadingStyle(new LoadingStyle.Sided(Colors8.m26601blendWithjxsXWHM(bentoColors.m21456getPositive0d7_KjU(), bentoColors.m21371getBg0d7_KjU(), 0.4f), bentoColors.m21456getPositive0d7_KjU(), C2002Dp.m7995constructorimpl(f), roundedCornerShapeM5327RoundedCornerShape0680j_4, null), new LoadingStyle.Sided(Colors8.m26601blendWithjxsXWHM(bentoColors.m21427getFg30d7_KjU(), bentoColors.m21371getBg0d7_KjU(), 0.4f), bentoColors.m21427getFg30d7_KjU(), C2002Dp.m7995constructorimpl(f), roundedCornerShapeM5327RoundedCornerShape0680j_4, null), new LoadingStyle.Sided(Colors8.m26601blendWithjxsXWHM(bentoColors.m21452getNegative0d7_KjU(), bentoColors.m21371getBg0d7_KjU(), 0.4f), bentoColors.m21452getNegative0d7_KjU(), C2002Dp.m7995constructorimpl(f), roundedCornerShapeM5327RoundedCornerShape0680j_4, null));
    }

    private static final QuantityBarStyle quantityBarStyle(BentoColors bentoColors) {
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(2));
        float f = 1;
        return new QuantityBarStyle(new QuantityBarStyle.Sided(bentoColors.m21456getPositive0d7_KjU(), Colors8.m26601blendWithjxsXWHM(bentoColors.m21456getPositive0d7_KjU(), bentoColors.m21371getBg0d7_KjU(), 0.4f), bentoColors.m21456getPositive0d7_KjU(), C2002Dp.m7995constructorimpl(f), roundedCornerShapeM5327RoundedCornerShape0680j_4, null), new QuantityBarStyle.Sided(bentoColors.m21452getNegative0d7_KjU(), Colors8.m26601blendWithjxsXWHM(bentoColors.m21452getNegative0d7_KjU(), bentoColors.m21371getBg0d7_KjU(), 0.4f), bentoColors.m21452getNegative0d7_KjU(), C2002Dp.m7995constructorimpl(f), roundedCornerShapeM5327RoundedCornerShape0680j_4, null));
    }

    public static final LadderStyle ladderStyle(BentoColors bentoColors) {
        Intrinsics.checkNotNullParameter(bentoColors, "bentoColors");
        LadderSelectedRowStyle ladderSelectedRowStyle = new LadderSelectedRowStyle(bentoColors.m21456getPositive0d7_KjU(), bentoColors.m21452getNegative0d7_KjU(), null);
        long jM21456getPositive0d7_KjU = bentoColors.m21456getPositive0d7_KjU();
        long jM21452getNegative0d7_KjU = bentoColors.m21452getNegative0d7_KjU();
        return new LadderStyle(new LadderMarketOrderFormStyle(jM21456getPositive0d7_KjU, bentoColors.m21427getFg30d7_KjU(), jM21452getNegative0d7_KjU, bentoColors.m21427getFg30d7_KjU(), bentoColors.m21371getBg0d7_KjU(), bentoColors.m21427getFg30d7_KjU(), bentoColors.m21371getBg0d7_KjU(), bentoColors.m21427getFg30d7_KjU(), bentoColors.m21371getBg0d7_KjU(), bentoColors.m21427getFg30d7_KjU(), bentoColors.m21456getPositive0d7_KjU(), bentoColors.m21372getBg20d7_KjU(), bentoColors.m21452getNegative0d7_KjU(), bentoColors.m21372getBg20d7_KjU(), null), ladderSelectedRowStyle, pillStyle(bentoColors), quantityBarStyle(bentoColors), loadingStyle(bentoColors), PillLoadingPlaceholderModifierKt.defaultPillOutlineLinearGradiant(bentoColors));
    }

    private static final PillStyle pillStyle(BentoColors bentoColors) {
        return new PillStyle(bentoColors.m21371getBg0d7_KjU(), bentoColors.m21371getBg0d7_KjU(), bentoColors.m21456getPositive0d7_KjU(), bentoColors.m21452getNegative0d7_KjU(), Colors8.m26601blendWithjxsXWHM(bentoColors.m21456getPositive0d7_KjU(), bentoColors.m21371getBg0d7_KjU(), 0.2f), Colors8.m26601blendWithjxsXWHM(bentoColors.m21452getNegative0d7_KjU(), bentoColors.m21371getBg0d7_KjU(), 0.2f), bentoColors.m21371getBg0d7_KjU(), bentoColors.m21371getBg0d7_KjU(), null);
    }

    public static final CompositionLocal6<LadderStyle> getLocalLadderStyle() {
        return LocalLadderStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LadderStyle LocalLadderStyle$lambda$0() {
        throw new IllegalStateException("No LadderStyle provided");
    }

    public static final void WithLadderStyle(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1489937601);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1489937601, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.style.WithLadderStyle (LadderStyle.kt:324)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalLadderStyle.provides(ladderStyle(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable))), content, composerStartRestartGroup, ((i2 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.style.LadderStyleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderStyleKt.WithLadderStyle$lambda$1(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final TextStyle getTextMBold(BentoTypography bentoTypography) {
        Intrinsics.checkNotNullParameter(bentoTypography, "<this>");
        return TextStyle.m7655copyp1EtxEg$default(bentoTypography.getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
    }
}
