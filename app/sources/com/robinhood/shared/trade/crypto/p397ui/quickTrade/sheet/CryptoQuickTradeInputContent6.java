package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import android.view.KeyEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpad;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoQuickTradeInputContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$CryptoQuickTradeInputContent$1$1$2$3, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoQuickTradeInputContent6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<KeyEvent, Unit> $onKeyPress;
    final /* synthetic */ CryptoQuickTradeSheetViewState $viewState;

    /* JADX WARN: Multi-variable type inference failed */
    CryptoQuickTradeInputContent6(CryptoQuickTradeSheetViewState cryptoQuickTradeSheetViewState, Function1<? super KeyEvent, Unit> function1) {
        this.$viewState = cryptoQuickTradeSheetViewState;
        this.$onKeyPress = function1;
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
            ComposerKt.traceEventStart(-1073625391, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoQuickTradeInputContent.kt:133)");
        }
        CryptoOrderAnimatedBentoNumpadState numpadState = this.$viewState.getNumpadState();
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onKeyPress);
        final Function1<KeyEvent, Unit> function1 = this.$onKeyPress;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$CryptoQuickTradeInputContent$1$1$2$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoQuickTradeInputContent6.invoke$lambda$1$lambda$0(function1, (KeyEvent) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoOrderAnimatedBentoNumpad.CryptoOrderAnimatedBentoNumpad(numpadState, (Function1) objRememberedValue, null, null, composer, CryptoOrderAnimatedBentoNumpadState.$stable, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }
}
