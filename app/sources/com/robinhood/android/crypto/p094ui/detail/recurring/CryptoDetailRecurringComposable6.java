package com.robinhood.android.crypto.p094ui.detail.recurring;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.crypto.p094ui.detail.recurring.CryptoDetailRecurringEvent;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.p375ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogComposable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoDetailRecurringComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$4$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoDetailRecurringComposable6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UUID $currencyPairId;
    final /* synthetic */ CryptoDetailRecurringDuxo $duxo;
    final /* synthetic */ CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert $it;
    final /* synthetic */ SnapshotState<CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert> $showCryptoFeeUnsupportedRecurringAlertDialog$delegate;
    final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventDescriptor;

    CryptoDetailRecurringComposable6(CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert showCryptoFeeUnsupportedRecurringAlert, UserInteractionEventDescriptor userInteractionEventDescriptor, UUID uuid, SnapshotState<CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert> snapshotState, CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo) {
        this.$it = showCryptoFeeUnsupportedRecurringAlert;
        this.$userInteractionEventDescriptor = userInteractionEventDescriptor;
        this.$currencyPairId = uuid;
        this.$showCryptoFeeUnsupportedRecurringAlertDialog$delegate = snapshotState;
        this.$duxo = cryptoDetailRecurringDuxo;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Screen screen;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-508178240, i, -1, "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposable.<anonymous>.<anonymous> (CryptoDetailRecurringComposable.kt:156)");
        }
        String assetCurrencyCode = this.$it.getAssetCurrencyCode();
        Screen screen2 = this.$userInteractionEventDescriptor.getScreen();
        if (screen2 == null) {
            Screen.Name name = Screen.Name.CRYPTO_DETAIL_PAGE;
            String string2 = this.$currencyPairId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            screen = new Screen(name, null, string2, null, 10, null);
        } else {
            screen = screen2;
        }
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$showCryptoFeeUnsupportedRecurringAlertDialog$delegate) | composer.changedInstance(this.$duxo);
        final CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo = this.$duxo;
        final SnapshotState<CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert> snapshotState = this.$showCryptoFeeUnsupportedRecurringAlertDialog$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoDetailRecurringComposable6.invoke$lambda$1$lambda$0(cryptoDetailRecurringDuxo, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(this.$showCryptoFeeUnsupportedRecurringAlertDialog$delegate);
        final SnapshotState<CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert> snapshotState2 = this.$showCryptoFeeUnsupportedRecurringAlertDialog$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$4$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoDetailRecurringComposable6.invoke$lambda$3$lambda$2(snapshotState2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoFeeUnsupportedRecurringAlertDialogComposable.CryptoFeeUnsupportedRecurringAlertDialogComposable(assetCurrencyCode, screen, function0, (Function0) objRememberedValue2, null, composer, 0, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, SnapshotState snapshotState) {
        snapshotState.setValue(null);
        cryptoDetailRecurringDuxo.onFeeUnsupportedRecurringAlertContinue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
