package com.robinhood.shared.common.etpcomposition;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhvFundBreakdownSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.etpcomposition.ComposableSingletons$RhvFundBreakdownSectionKt$lambda$-2069865896$1, reason: use source file name */
/* loaded from: classes26.dex */
final class RhvFundBreakdownSection2 implements Function2<Composer, Integer, Unit> {
    public static final RhvFundBreakdownSection2 INSTANCE = new RhvFundBreakdownSection2();

    RhvFundBreakdownSection2() {
    }

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
            ComposerKt.traceEventStart(-2069865896, i, -1, "com.robinhood.shared.common.etpcomposition.ComposableSingletons$RhvFundBreakdownSectionKt.lambda$-2069865896.<anonymous> (RhvFundBreakdownSection.kt:204)");
        }
        Color.Companion companion = Color.INSTANCE;
        long jM6717getBlue0d7_KjU = companion.m6717getBlue0d7_KjU();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.common.etpcomposition.ComposableSingletons$RhvFundBreakdownSectionKt$lambda$-2069865896$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RhvFundBreakdownSection4.m24839RhvHoldingRowFU0evQE("Sample Holding", "25%", jM6717getBlue0d7_KjU, (Function0) objRememberedValue, PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, companion.m6727getWhite0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(16)), false, composer, 28086, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
