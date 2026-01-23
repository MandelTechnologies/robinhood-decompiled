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
/* renamed from: com.robinhood.shared.common.etpcomposition.ComposableSingletons$RhvFundBreakdownSectionKt$lambda$-342029071$1, reason: use source file name */
/* loaded from: classes26.dex */
final class RhvFundBreakdownSection3 implements Function2<Composer, Integer, Unit> {
    public static final RhvFundBreakdownSection3 INSTANCE = new RhvFundBreakdownSection3();

    RhvFundBreakdownSection3() {
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
            ComposerKt.traceEventStart(-342029071, i, -1, "com.robinhood.shared.common.etpcomposition.ComposableSingletons$RhvFundBreakdownSectionKt.lambda$-342029071.<anonymous> (RhvFundBreakdownSection.kt:220)");
        }
        Color.Companion companion = Color.INSTANCE;
        long jM6717getBlue0d7_KjU = companion.m6717getBlue0d7_KjU();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.common.etpcomposition.ComposableSingletons$RhvFundBreakdownSectionKt$lambda$-342029071$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RhvFundBreakdownSection4.m24839RhvHoldingRowFU0evQE("Sample Holding", "25%", jM6717getBlue0d7_KjU, (Function0) objRememberedValue, PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, companion.m6727getWhite0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(16)), true, composer, 224694, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
