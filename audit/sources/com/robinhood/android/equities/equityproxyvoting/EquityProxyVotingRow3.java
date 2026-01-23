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
/* renamed from: com.robinhood.android.equities.equityproxyvoting.ComposableSingletons$EquityProxyVotingRowKt$lambda$1430024587$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityProxyVotingRow3 implements Function2<Composer, Integer, Unit> {
    public static final EquityProxyVotingRow3 INSTANCE = new EquityProxyVotingRow3();

    EquityProxyVotingRow3() {
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
            ComposerKt.traceEventStart(1430024587, i, -1, "com.robinhood.android.equities.equityproxyvoting.ComposableSingletons$EquityProxyVotingRowKt.lambda$1430024587.<anonymous> (EquityProxyVotingRow.kt:188)");
        }
        BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16);
        long jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.equityproxyvoting.ComposableSingletons$EquityProxyVotingRowKt$lambda$1430024587$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoIcon2.m20644BentoIconFU0evQE(size16, null, jM21427getFg30d7_KjU, null, (Function0) objRememberedValue, false, composer, BentoIcon4.Size16.$stable | 24624, 40);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
