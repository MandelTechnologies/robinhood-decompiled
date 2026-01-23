package com.robinhood.shared.crypto.transfer.send.amount;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals3;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AmountAvailableSheetContent.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a]\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\r\u001aD\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0002¨\u0006\u0010"}, m3636d2 = {"AmountAvailableSheetContent", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "amountAvailableForWithdrawal", "", "bodyTextLoggingIdentifier", "navigateToCryptoLimitsPage", "Lkotlin/Function0;", "hideAvailabilitySheet", "onLearnMoreClicked", "amountAvailableModalPrimaryButton", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType;", "amountAvailableModalSecondaryButton", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType;Landroidx/compose/runtime/Composer;I)V", "getAmountAvailableListener", "type", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.AmountAvailableSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AmountAvailableSheetContent2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmountAvailableSheetContent$lambda$7(RhModalBottomSheet5 rhModalBottomSheet5, String str, String str2, Function0 function0, Function0 function02, Function0 function03, CryptoTransferSendAmountViewState.AmountAvailableButtonType amountAvailableButtonType, CryptoTransferSendAmountViewState.AmountAvailableButtonType amountAvailableButtonType2, int i, Composer composer, int i2) {
        AmountAvailableSheetContent(rhModalBottomSheet5, str, str2, function0, function02, function03, amountAvailableButtonType, amountAvailableButtonType2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AmountAvailableSheetContent(final RhModalBottomSheet5 rhModalBottomSheet5, final String amountAvailableForWithdrawal, final String bodyTextLoggingIdentifier, final Function0<Unit> navigateToCryptoLimitsPage, final Function0<Unit> hideAvailabilitySheet, final Function0<Unit> onLearnMoreClicked, final CryptoTransferSendAmountViewState.AmountAvailableButtonType amountAvailableModalPrimaryButton, final CryptoTransferSendAmountViewState.AmountAvailableButtonType amountAvailableButtonType, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(amountAvailableForWithdrawal, "amountAvailableForWithdrawal");
        Intrinsics.checkNotNullParameter(bodyTextLoggingIdentifier, "bodyTextLoggingIdentifier");
        Intrinsics.checkNotNullParameter(navigateToCryptoLimitsPage, "navigateToCryptoLimitsPage");
        Intrinsics.checkNotNullParameter(hideAvailabilitySheet, "hideAvailabilitySheet");
        Intrinsics.checkNotNullParameter(onLearnMoreClicked, "onLearnMoreClicked");
        Intrinsics.checkNotNullParameter(amountAvailableModalPrimaryButton, "amountAvailableModalPrimaryButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(-228094283);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changed(amountAvailableForWithdrawal) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(bodyTextLoggingIdentifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(navigateToCryptoLimitsPage) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(hideAvailabilitySheet) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLearnMoreClicked) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(amountAvailableModalPrimaryButton) : composerStartRestartGroup.changedInstance(amountAvailableModalPrimaryButton) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(amountAvailableButtonType) : composerStartRestartGroup.changedInstance(amountAvailableButtonType) ? 8388608 : 4194304;
        }
        if ((4793489 & i2) == 4793488 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-228094283, i2, -1, "com.robinhood.shared.crypto.transfer.send.amount.AmountAvailableSheetContent (AmountAvailableSheetContent.kt:35)");
            }
            Component component = new Component(Component.ComponentType.BOTTOM_SHEET, "available_to_send", null, 4, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            AutoLoggingCompositionLocals3 autoLoggingCompositionLocals3 = AutoLoggingCompositionLocals3.INSTANCE;
            int i3 = AutoLoggingCompositionLocals3.$stable;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, autoLoggingCompositionLocals3.getEventContext(composerStartRestartGroup, i3), component, null, 39, null), true, false, false, false, false, null, 108, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            int i5 = i2;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_amount_available_send, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(Column6.INSTANCE.align(companion, companion2.getCenterHorizontally()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(amountAvailableForWithdrawal, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, autoLoggingCompositionLocals3.getEventContext(composerStartRestartGroup, i3), new Component(Component.ComponentType.TEXT_VIEW, bodyTextLoggingIdentifier, null, 4, null), new ComponentHierarchy(component, null, null, null, null, 30, null), 7, null), true, false, false, false, false, null, 108, null), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, (i5 >> 3) & 14, 0, 8124);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButtonBar(composerStartRestartGroup, 0).getSpacing().m21707getVerticalPaddingD9Ej5fM(), 7, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            final Function0<Unit> amountAvailableListener = getAmountAvailableListener(amountAvailableModalPrimaryButton, navigateToCryptoLimitsPage, hideAvailabilitySheet, onLearnMoreClicked);
            final Function0<Unit> amountAvailableListener2 = getAmountAvailableListener(amountAvailableButtonType, navigateToCryptoLimitsPage, hideAvailabilitySheet, onLearnMoreClicked);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, amountAvailableModalPrimaryButton.getLoggingAction(), autoLoggingCompositionLocals3.getEventContext(composerStartRestartGroup, i3), new Component(componentType, amountAvailableModalPrimaryButton.getLoggingIdentifier(), null, 4, null), new ComponentHierarchy(component, null, null, null, null, 30, null), 3, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
            StringResource text = amountAvailableModalPrimaryButton.getText();
            int i6 = StringResource.$stable;
            String string2 = StringResource2.getString(text, composerStartRestartGroup, i6);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(amountAvailableListener);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.AmountAvailableSheetContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AmountAvailableSheetContent2.AmountAvailableSheetContent$lambda$6$lambda$5$lambda$1$lambda$0(amountAvailableListener);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup.startReplaceGroup(-371943122);
            if (amountAvailableButtonType != null) {
                String string3 = StringResource2.getString(amountAvailableButtonType.getText(), composerStartRestartGroup, i6);
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, amountAvailableButtonType.getLoggingAction(), autoLoggingCompositionLocals3.getEventContext(composerStartRestartGroup, i3), new Component(componentType, amountAvailableButtonType.getLoggingIdentifier(), null, 4, null), new ComponentHierarchy(component, null, null, null, null, 30, null), 3, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged2 = composerStartRestartGroup.changed(amountAvailableListener2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.AmountAvailableSheetContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AmountAvailableSheetContent2.m2789xa8876b30(amountAvailableListener2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, string3, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.amount.AmountAvailableSheetContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AmountAvailableSheetContent2.AmountAvailableSheetContent$lambda$7(rhModalBottomSheet5, amountAvailableForWithdrawal, bodyTextLoggingIdentifier, navigateToCryptoLimitsPage, hideAvailabilitySheet, onLearnMoreClicked, amountAvailableModalPrimaryButton, amountAvailableButtonType, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmountAvailableSheetContent$lambda$6$lambda$5$lambda$1$lambda$0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AmountAvailableSheetContent$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2 */
    public static final Unit m2789xa8876b30(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private static final Function0<Unit> getAmountAvailableListener(CryptoTransferSendAmountViewState.AmountAvailableButtonType amountAvailableButtonType, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        if (Intrinsics.areEqual(amountAvailableButtonType, CryptoTransferSendAmountViewState.AmountAvailableButtonType.ReviewTransferLimits.INSTANCE)) {
            return function0;
        }
        if (amountAvailableButtonType instanceof CryptoTransferSendAmountViewState.AmountAvailableButtonType.Done) {
            return function02;
        }
        if (Intrinsics.areEqual(amountAvailableButtonType, CryptoTransferSendAmountViewState.AmountAvailableButtonType.LearnMore.INSTANCE)) {
            return function03;
        }
        return null;
    }
}
