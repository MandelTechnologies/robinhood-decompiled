package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpad;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: CryptoTaxLotSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$2 */
/* loaded from: classes12.dex */
final class C40755xb7dd7625 implements Function3<BentoNumpadScopeV2, Composer, Integer, Unit> {
    final /* synthetic */ CryptoTaxLotSelectionDuxo $duxo;
    final /* synthetic */ SnapshotState4<CryptoTaxLotSelectionViewState> $viewState$delegate;

    C40755xb7dd7625(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, SnapshotState4<CryptoTaxLotSelectionViewState> snapshotState4) {
        this.$duxo = cryptoTaxLotSelectionDuxo;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer, Integer num) {
        invoke(bentoNumpadScopeV2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1099972600, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposable.<anonymous>.<anonymous> (CryptoTaxLotSelectionComposable.kt:176)");
        }
        CryptoOrderAnimatedBentoNumpadState numpadState = CryptoTaxLotSelectionComposableKt.CryptoTaxLotSelectionComposable$lambda$1(this.$viewState$delegate).getNumpadState();
        CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo = this.$duxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(cryptoTaxLotSelectionDuxo);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new C40756x24cf57f(cryptoTaxLotSelectionDuxo);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Function1 function1 = (Function1) ((KFunction) objRememberedValue);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
        final CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo2 = this.$duxo;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C40755xb7dd7625.invoke$lambda$2$lambda$1(cryptoTaxLotSelectionDuxo2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoOrderAnimatedBentoNumpad.CryptoOrderAnimatedBentoNumpad(numpadState, function1, null, (Function0) objRememberedValue2, composer, CryptoOrderAnimatedBentoNumpadState.$stable, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo) {
        cryptoTaxLotSelectionDuxo.onMaxSelected();
        return Unit.INSTANCE;
    }
}
