package com.robinhood.shared.crypto.staking.staking.input;

import android.view.KeyEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.crypto.p315ui.staking.AmountAvailableInfoScreen;
import com.robinhood.shared.crypto.staking.staking.input.SuggestedInputAmountState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoStakingInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.input.ComposableSingletons$CryptoStakingInputComposableKt$lambda$418727833$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoStakingInputComposable4 implements Function2<Composer, Integer, Unit> {
    public static final CryptoStakingInputComposable4 INSTANCE = new CryptoStakingInputComposable4();

    CryptoStakingInputComposable4() {
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
            ComposerKt.traceEventStart(418727833, i, -1, "com.robinhood.shared.crypto.staking.staking.input.ComposableSingletons$CryptoStakingInputComposableKt.lambda$418727833.<anonymous> (CryptoStakingInputComposable.kt:274)");
        }
        CryptoInputMode cryptoInputMode = CryptoInputMode.ASSET_CURRENCY;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke("-.--------");
        StringResource stringResourceInvoke2 = companion.invoke("-.--------");
        StringResource stringResourceInvoke3 = companion.invoke("-");
        ApiCryptoStakingOrder.OrderType orderType = ApiCryptoStakingOrder.OrderType.DEPOSIT;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        CryptoStakingInputViewState cryptoStakingInputViewState = new CryptoStakingInputViewState(false, false, null, cryptoInputMode, null, orderType, uuidRandomUUID, companion.invoke("----- ---"), "-", null, false, true, false, null, stringResourceInvoke, stringResourceInvoke2, false, "", "-", false, stringResourceInvoke3, ApiCryptoStakingOrder.AmountType.UNKNOWN, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.input.ComposableSingletons$CryptoStakingInputComposableKt$lambda$418727833$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoStakingInputComposable4.invoke$lambda$1$lambda$0((KeyEvent) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.input.ComposableSingletons$CryptoStakingInputComposableKt$lambda$418727833$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.input.ComposableSingletons$CryptoStakingInputComposableKt$lambda$418727833$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingInputComposable4.invoke$lambda$5$lambda$4((BigDecimal) obj, (SuggestedInputAmountState.Type) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function2 function2 = (Function2) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.input.ComposableSingletons$CryptoStakingInputComposableKt$lambda$418727833$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoStakingInputComposable4.invoke$lambda$7$lambda$6((AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function1 function12 = (Function1) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.input.ComposableSingletons$CryptoStakingInputComposableKt$lambda$418727833$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        CryptoStakingInputComposable5.LoadedContent(cryptoStakingInputViewState, null, function1, function0, function2, function12, null, (Function0) objRememberedValue5, composer, 14380464);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(BigDecimal bigDecimal, SuggestedInputAmountState.Type type2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<unused var>");
        Intrinsics.checkNotNullParameter(type2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
