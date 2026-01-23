package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoFeeTierStatusComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $finishPostOrderFlow;
    final /* synthetic */ Function0<Unit> $onContinueToNotificationPrimer;
    final /* synthetic */ CryptoFeeTierStatusViewState $viewState;

    /* compiled from: CryptoFeeTierStatusComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoFeeTierStatusViewState.PrimaryButton.values().length];
            try {
                iArr[CryptoFeeTierStatusViewState.PrimaryButton.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoFeeTierStatusViewState.PrimaryButton.CONTINUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$5(CryptoFeeTierStatusViewState cryptoFeeTierStatusViewState, Function0<Unit> function0, Function0<Unit> function02) {
        this.$viewState = cryptoFeeTierStatusViewState;
        this.$finishPostOrderFlow = function0;
        this.$onContinueToNotificationPrimer = function02;
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
            ComposerKt.traceEventStart(-1266121656, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatus.<anonymous>.<anonymous> (CryptoFeeTierStatusComposable.kt:147)");
        }
        composer.startReplaceGroup(-1267162117);
        Function0<Unit> function0 = null;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        CryptoFeeTierStatusViewState.PrimaryButton primaryButton = this.$viewState.getPrimaryButton();
        if (primaryButton != null) {
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, primaryButton.getIdentifier(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
            if (modifierAutoLogEvents$default != null) {
                modifierFillMaxWidth$default = modifierAutoLogEvents$default;
            }
        }
        composer.endReplaceGroup();
        CryptoFeeTierStatusViewState.PrimaryButton primaryButton2 = this.$viewState.getPrimaryButton();
        StringResource text = primaryButton2 != null ? primaryButton2.getText() : null;
        composer.startReplaceGroup(-1267138893);
        String string2 = text == null ? null : StringResource2.getString(text, composer, StringResource.$stable);
        composer.endReplaceGroup();
        if (string2 == null) {
            string2 = "-------------";
        }
        String str = string2;
        if (this.$viewState.getPrimaryButton() != null) {
            CryptoFeeTierStatusViewState cryptoFeeTierStatusViewState = this.$viewState;
            function0 = this.$finishPostOrderFlow;
            Function0<Unit> function02 = this.$onContinueToNotificationPrimer;
            CryptoFeeTierStatusViewState.PrimaryButton primaryButton3 = cryptoFeeTierStatusViewState.getPrimaryButton();
            int i2 = primaryButton3 != null ? WhenMappings.$EnumSwitchMapping$0[primaryButton3.ordinal()] : -1;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                function0 = function02;
            }
        }
        composer.startReplaceGroup(-1267136714);
        if (function0 == null) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
        }
        Function0<Unit> function03 = function0;
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8(function03, str, modifierFillMaxWidth$default, null, null, this.$viewState.getPrimaryButton() != null, false, null, null, null, null, false, null, composer, 0, 0, 8152);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
