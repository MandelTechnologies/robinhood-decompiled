package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTaxLotSelectionHeader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.ComposableSingletons$CryptoTaxLotSelectionHeaderKt$lambda$-1839248250$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoTaxLotSelectionHeader2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoTaxLotSelectionHeader2 INSTANCE = new CryptoTaxLotSelectionHeader2();

    CryptoTaxLotSelectionHeader2() {
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
            ComposerKt.traceEventStart(-1839248250, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.ComposableSingletons$CryptoTaxLotSelectionHeaderKt.lambda$-1839248250.<anonymous> (CryptoTaxLotSelectionHeader.kt:91)");
        }
        CryptoTaxLotSelectionHeaderState cryptoTaxLotSelectionHeaderState = new CryptoTaxLotSelectionHeaderState(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, new CryptoTaxLotSelectionHeaderState.PriceInfo.Market("$12,345.67"));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.ComposableSingletons$CryptoTaxLotSelectionHeaderKt$lambda$-1839248250$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoTaxLotSelectionHeader3.CryptoTaxLotSelectionHeader(cryptoTaxLotSelectionHeaderState, (Function0) objRememberedValue, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
