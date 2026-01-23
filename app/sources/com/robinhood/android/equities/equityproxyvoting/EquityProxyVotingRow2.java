package com.robinhood.android.equities.equityproxyvoting;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityProxyVotingRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.equityproxyvoting.ComposableSingletons$EquityProxyVotingRowKt$lambda$-1423103865$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityProxyVotingRow2 implements Function2<Composer, Integer, Unit> {
    public static final EquityProxyVotingRow2 INSTANCE = new EquityProxyVotingRow2();

    EquityProxyVotingRow2() {
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
            ComposerKt.traceEventStart(-1423103865, i, -1, "com.robinhood.android.equities.equityproxyvoting.ComposableSingletons$EquityProxyVotingRowKt.lambda$-1423103865.<anonymous> (EquityProxyVotingRow.kt:110)");
        }
        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CALENDAR_24);
        long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.equityproxyvoting.ComposableSingletons$EquityProxyVotingRowKt$lambda$-1423103865$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, null, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 24624, 40);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
