package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.strategy.CryptoTaxLotStrategySelectionBottomSheetComposable3;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.strategy.TaxLotStrategySelectionRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoTaxLotOrderInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class CryptoTaxLotOrderInputComposableKt$MainContent$2$3 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    final /* synthetic */ CryptoTaxLotOrderInputDuxo $duxo;
    final /* synthetic */ SnapshotState<Boolean> $shouldShowStrategySelectionBottomSheet$delegate;
    final /* synthetic */ CryptoTaxLotOrderInputViewState $viewState;

    CryptoTaxLotOrderInputComposableKt$MainContent$2$3(CryptoTaxLotOrderInputViewState cryptoTaxLotOrderInputViewState, CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, SnapshotState<Boolean> snapshotState) {
        this.$viewState = cryptoTaxLotOrderInputViewState;
        this.$duxo = cryptoTaxLotOrderInputDuxo;
        this.$shouldShowStrategySelectionBottomSheet$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307291718, i2, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.MainContent.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:278)");
        }
        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "tax_lot_strategy", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        ImmutableList<TaxLotStrategySelectionRowState> taxLotStrategySelectionRowStates = this.$viewState.getTaxLotStrategySelectionRowStates();
        CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo = this.$duxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(cryptoTaxLotOrderInputDuxo);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CryptoTaxLotOrderInputComposableKt$MainContent$2$3$1$1(cryptoTaxLotOrderInputDuxo);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Function1 function1 = (Function1) ((KFunction) objRememberedValue);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
        final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo2 = this.$duxo;
        final SnapshotState<Boolean> snapshotState = this.$shouldShowStrategySelectionBottomSheet$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$MainContent$2$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTaxLotOrderInputComposableKt$MainContent$2$3.invoke$lambda$2$lambda$1(cryptoTaxLotOrderInputDuxo2, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoTaxLotStrategySelectionBottomSheetComposable3.CryptoTaxLotStrategySelectionBottomSheetComposable(RhModalBottomSheet, function1, taxLotStrategySelectionRowStates, (Function0) objRememberedValue2, modifierAutoLogEvents$default, composer, (BentoSelectionRowState.$stable << 6) | (i2 & 14) | RhModalBottomSheet5.$stable, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, SnapshotState snapshotState) {
        cryptoTaxLotOrderInputDuxo.onStrategyTypeSelected();
        CryptoTaxLotOrderInputComposableKt.MainContent$lambda$4(snapshotState, false);
        return Unit.INSTANCE;
    }
}
