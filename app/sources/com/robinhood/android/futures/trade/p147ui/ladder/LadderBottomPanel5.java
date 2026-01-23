package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderBottomPanel.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderBottomPanelKt$lambda$-202600082$1, reason: use source file name */
/* loaded from: classes10.dex */
final class LadderBottomPanel5 implements Function2<Composer, Integer, Unit> {
    public static final LadderBottomPanel5 INSTANCE = new LadderBottomPanel5();

    LadderBottomPanel5() {
    }

    private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202600082, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderBottomPanelKt.lambda$-202600082.<anonymous> (LadderBottomPanel.kt:195)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(16));
        boolean z = !invoke$lambda$1(snapshotState);
        BigDecimal bigDecimal = new BigDecimal(1);
        boolean zInvoke$lambda$1 = invoke$lambda$1(snapshotState);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderBottomPanelKt$lambda$-202600082$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LadderBottomPanel5.invoke$lambda$4$lambda$3(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderBottomPanelKt$lambda$-202600082$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LadderBottomPanel5.invoke$lambda$6$lambda$5(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function02 = (Function0) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderBottomPanelKt$lambda$-202600082$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        LadderBottomPanel6.MarketOrderForm(true, z, bigDecimal, false, zInvoke$lambda$1, false, function0, function02, (Function0) objRememberedValue4, modifierM5142padding3ABfNKs, composer, 920325126, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState) {
        invoke$lambda$2(snapshotState, !invoke$lambda$1(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState) {
        invoke$lambda$2(snapshotState, !invoke$lambda$1(snapshotState));
        return Unit.INSTANCE;
    }
}
