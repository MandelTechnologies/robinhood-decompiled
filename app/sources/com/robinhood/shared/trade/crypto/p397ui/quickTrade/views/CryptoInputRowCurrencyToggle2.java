package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoInputRowCurrencyToggle4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoInputRowCurrencyToggle.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoInputRowCurrencyToggleKt$lambda$1310306470$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoInputRowCurrencyToggle2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoInputRowCurrencyToggle2 INSTANCE = new CryptoInputRowCurrencyToggle2();

    CryptoInputRowCurrencyToggle2() {
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
            ComposerKt.traceEventStart(1310306470, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoInputRowCurrencyToggleKt.lambda$1310306470.<anonymous> (CryptoInputRowCurrencyToggle.kt:91)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        CryptoInputRowCurrencyToggle4 quote = invoke$lambda$1(snapshotState) ? new CryptoInputRowCurrencyToggle4.Quote("USD") : new CryptoInputRowCurrencyToggle4.Asset(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue2);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.ComposableSingletons$CryptoInputRowCurrencyToggleKt$lambda$1310306470$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoInputRowCurrencyToggle2.invoke$lambda$5$lambda$4(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        CryptoInputRowCurrencyToggle3.CryptoInputRowCurrencyToggle(quote, ClickableKt.m4891clickableO2vRcR0$default(companion2, interactionSource3, null, false, null, null, (Function0) objRememberedValue3, 28, null), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState) {
        invoke$lambda$2(snapshotState, !invoke$lambda$1(snapshotState));
        return Unit.INSTANCE;
    }
}
