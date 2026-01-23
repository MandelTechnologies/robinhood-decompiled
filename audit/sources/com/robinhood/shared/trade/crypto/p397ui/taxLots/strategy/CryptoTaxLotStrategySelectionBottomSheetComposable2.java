package com.robinhood.shared.trade.crypto.p397ui.taxLots.strategy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: CryptoTaxLotStrategySelectionBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.strategy.ComposableSingletons$CryptoTaxLotStrategySelectionBottomSheetComposableKt$lambda$-1350160202$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoTaxLotStrategySelectionBottomSheetComposable2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoTaxLotStrategySelectionBottomSheetComposable2 INSTANCE = new CryptoTaxLotStrategySelectionBottomSheetComposable2();

    CryptoTaxLotStrategySelectionBottomSheetComposable2() {
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
            ComposerKt.traceEventStart(-1350160202, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.strategy.ComposableSingletons$CryptoTaxLotStrategySelectionBottomSheetComposableKt.lambda$-1350160202.<anonymous> (CryptoTaxLotStrategySelectionBottomSheetComposable.kt:60)");
        }
        BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, "----------", false, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1912, (DefaultConstructorMarker) null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.strategy.ComposableSingletons$CryptoTaxLotStrategySelectionBottomSheetComposableKt$lambda$-1350160202$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer, (BentoSelectionRowState.$stable << 3) | 384, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
