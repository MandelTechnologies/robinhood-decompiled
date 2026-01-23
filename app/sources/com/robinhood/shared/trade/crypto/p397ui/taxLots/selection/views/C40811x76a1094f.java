package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionFooterState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTaxLotSelectionFooter.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.ComposableSingletons$CryptoTaxLotSelectionFooterKt$lambda$1975375824$1 */
/* loaded from: classes12.dex */
final class C40811x76a1094f implements Function2<Composer, Integer, Unit> {
    public static final C40811x76a1094f INSTANCE = new C40811x76a1094f();

    C40811x76a1094f() {
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
            ComposerKt.traceEventStart(1975375824, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.ComposableSingletons$CryptoTaxLotSelectionFooterKt.lambda$1975375824.<anonymous> (CryptoTaxLotSelectionFooter.kt:227)");
        }
        CryptoTaxLotSelectionFooterState.TextContent.Loading loading = CryptoTaxLotSelectionFooterState.TextContent.Loading.INSTANCE;
        CryptoTaxLotSelectionFooterState cryptoTaxLotSelectionFooterState = new CryptoTaxLotSelectionFooterState(loading, loading, loading, null, false, false, 40, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.ComposableSingletons$CryptoTaxLotSelectionFooterKt$lambda$1975375824$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoTaxLotSelectionFooterKt.CryptoTaxLotSelectionFooter(cryptoTaxLotSelectionFooterState, (Function0) objRememberedValue, null, composer, StringResource.$stable | 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
