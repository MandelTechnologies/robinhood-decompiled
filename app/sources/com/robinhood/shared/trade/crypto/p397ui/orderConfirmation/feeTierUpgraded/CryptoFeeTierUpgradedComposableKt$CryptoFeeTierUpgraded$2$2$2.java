package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

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
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoFeeTierUpgradedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$2$2$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $finishPostOrderFlow;
    final /* synthetic */ Function0<Unit> $onContinueToNotificationPrimer;
    final /* synthetic */ CryptoFeeTierUpgradedViewState $viewState;

    /* compiled from: CryptoFeeTierUpgradedComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoFeeTierUpgradedViewState.PrimaryButton.values().length];
            try {
                iArr[CryptoFeeTierUpgradedViewState.PrimaryButton.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoFeeTierUpgradedViewState.PrimaryButton.CONTINUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$2$2$2(CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState, Function0<Unit> function0, Function0<Unit> function02) {
        this.$viewState = cryptoFeeTierUpgradedViewState;
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
            ComposerKt.traceEventStart(1956708729, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgraded.<anonymous>.<anonymous>.<anonymous> (CryptoFeeTierUpgradedComposable.kt:354)");
        }
        composer.startReplaceGroup(-798581420);
        Function0<Unit> function0 = null;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        CryptoFeeTierUpgradedViewState.PrimaryButton primaryButton = this.$viewState.getPrimaryButton();
        if (primaryButton != null) {
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, primaryButton.getIdentifier(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
            if (modifierAutoLogEvents$default != null) {
                modifierFillMaxWidth$default = modifierAutoLogEvents$default;
            }
        }
        composer.endReplaceGroup();
        boolean z = this.$viewState.getPrimaryButton() != null;
        CryptoFeeTierUpgradedViewState.PrimaryButton primaryButton2 = this.$viewState.getPrimaryButton();
        StringResource text = primaryButton2 != null ? primaryButton2.getText() : null;
        composer.startReplaceGroup(-798552572);
        String string2 = text == null ? null : StringResource2.getString(text, composer, StringResource.$stable);
        composer.endReplaceGroup();
        if (string2 == null) {
            string2 = "---------";
        }
        if (this.$viewState.getPrimaryButton() != null) {
            CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState = this.$viewState;
            Function0<Unit> function02 = this.$finishPostOrderFlow;
            Function0<Unit> function03 = this.$onContinueToNotificationPrimer;
            CryptoFeeTierUpgradedViewState.PrimaryButton primaryButton3 = cryptoFeeTierUpgradedViewState.getPrimaryButton();
            int i2 = primaryButton3 != null ? WhenMappings.$EnumSwitchMapping$0[primaryButton3.ordinal()] : -1;
            if (i2 == 1) {
                function0 = function02;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                function0 = function03;
            }
        }
        composer.startReplaceGroup(-798550221);
        if (function0 == null) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$2$2$2$$ExternalSyntheticLambda0
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
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8(function0, string2, modifierFillMaxWidth$default, null, null, z, false, null, null, null, null, false, null, composer, 0, 0, 8152);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
