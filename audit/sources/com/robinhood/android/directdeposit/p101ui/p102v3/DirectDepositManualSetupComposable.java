package com.robinhood.android.directdeposit.p101ui.p102v3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositManualSetupComposable;
import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositV3ManualSetupFragment;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectDepositManualSetupComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aq\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\t2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0001¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"BUTTON_BAR_TAG", "", "DirectDepositManualSetupComposable", "", "viewState", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupViewState;", "callbacks", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupFragment$Callbacks;", "copyAccountNumber", "Lkotlin/Function1;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Lkotlin/ParameterName;", "name", "haptic", "copyRoutingNumber", "emailInfo", "Lkotlin/Function0;", "(Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupViewState;Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupFragment$Callbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.v3.DirectDepositManualSetupComposableKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class DirectDepositManualSetupComposable {
    public static final String BUTTON_BAR_TAG = "buttonBar";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DirectDepositManualSetupComposable$lambda$0(DirectDepositV3ManualSetupViewState directDepositV3ManualSetupViewState, DirectDepositV3ManualSetupFragment.Callbacks callbacks, Function1 function1, Function1 function12, Function0 function0, int i, Composer composer, int i2) {
        DirectDepositManualSetupComposable(directDepositV3ManualSetupViewState, callbacks, function1, function12, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: DirectDepositManualSetupComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.directdeposit.ui.v3.DirectDepositManualSetupComposableKt$DirectDepositManualSetupComposable$1 */
    static final class C141561 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ DirectDepositV3ManualSetupFragment.Callbacks $callbacks;
        final /* synthetic */ Function1<HapticFeedback, Unit> $copyAccountNumber;
        final /* synthetic */ Function1<HapticFeedback, Unit> $copyRoutingNumber;
        final /* synthetic */ Function0<Unit> $emailInfo;
        final /* synthetic */ DirectDepositV3ManualSetupViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C141561(DirectDepositV3ManualSetupViewState directDepositV3ManualSetupViewState, Function1<? super HapticFeedback, Unit> function1, Function1<? super HapticFeedback, Unit> function12, DirectDepositV3ManualSetupFragment.Callbacks callbacks, Function0<Unit> function0) {
            this.$viewState = directDepositV3ManualSetupViewState;
            this.$copyRoutingNumber = function1;
            this.$copyAccountNumber = function12;
            this.$callbacks = callbacks;
            this.$emailInfo = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$1$lambda$0(Function1 function1, HapticFeedback hapticFeedback) {
            function1.invoke(hapticFeedback);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$3$lambda$2(Function1 function1, HapticFeedback hapticFeedback) {
            function1.invoke(hapticFeedback);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$5$lambda$4(DirectDepositV3ManualSetupFragment.Callbacks callbacks) {
            callbacks.onGetPrefilledForm();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2066578088, i, -1, "com.robinhood.android.directdeposit.ui.v3.DirectDepositManualSetupComposable.<anonymous> (DirectDepositManualSetupComposable.kt:38)");
            }
            DirectDepositV3ManualSetupViewState directDepositV3ManualSetupViewState = this.$viewState;
            final Function1<HapticFeedback, Unit> function1 = this.$copyRoutingNumber;
            final Function1<HapticFeedback, Unit> function12 = this.$copyAccountNumber;
            final DirectDepositV3ManualSetupFragment.Callbacks callbacks = this.$callbacks;
            final Function0<Unit> function0 = this.$emailInfo;
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C14044R.string.direct_deposit_manual_setup_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion, companion2.getCenterHorizontally()), 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleLarge(), composer, 0, 0, 8188);
            String strStringResource2 = StringResources_androidKt.stringResource(C14044R.string.direct_deposit_manual_setup_description, composer, 0);
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), composer, 6, 0);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM, composer, 0, 0, 8124);
            final HapticFeedback hapticFeedback = (HapticFeedback) composer.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            UserInteractionEventData.Action action = UserInteractionEventData.Action.COPY;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
            String strStringResource3 = StringResources_androidKt.stringResource(C14044R.string.rhy_routing_details_routing_number, composer, 0);
            AccountRoutingDetailsStore.RoutingDetails routingDetails = directDepositV3ManualSetupViewState.getRoutingDetails();
            String routingNumber = routingDetails != null ? routingDetails.getRoutingNumber() : null;
            if (routingNumber == null) {
                routingNumber = "";
            }
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.COPY_16;
            BentoSettingsRows.EndElement.Icon icon = new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper2, null, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changedInstance(hapticFeedback);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositManualSetupComposableKt$DirectDepositManualSetupComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DirectDepositManualSetupComposable.C141561.invoke$lambda$10$lambda$1$lambda$0(function1, hapticFeedback);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            int i3 = BentoSettingsRows.EndElement.Icon.$stable;
            BentoSettingsRowKt.BentoSettingsRow(modifierAutoLogEvents$default, strStringResource3, routingNumber, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) icon, false, false, (Function0<Unit>) objRememberedValue, composer, i3 << 12, 104);
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, action, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
            String strStringResource4 = StringResources_androidKt.stringResource(C14044R.string.rhy_routing_details_account_number, composer, 0);
            AccountRoutingDetailsStore.RoutingDetails routingDetails2 = directDepositV3ManualSetupViewState.getRoutingDetails();
            String accountNumber = routingDetails2 != null ? routingDetails2.getAccountNumber() : null;
            String str = accountNumber != null ? accountNumber : "";
            BentoSettingsRows.EndElement.Icon icon2 = new BentoSettingsRows.EndElement.Icon(serverToBentoAssetMapper2, null, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(function12) | composer.changedInstance(hapticFeedback);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositManualSetupComposableKt$DirectDepositManualSetupComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DirectDepositManualSetupComposable.C141561.invoke$lambda$10$lambda$3$lambda$2(function12, hapticFeedback);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoSettingsRowKt.BentoSettingsRow(modifierAutoLogEvents$default2, strStringResource4, str, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) icon2, false, false, (Function0<Unit>) objRememberedValue2, composer, i3 << 12, 104);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14044R.string.direct_deposit_manual_setup_account_routing_tip, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), composer, 6, 0), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8120);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            String strStringResource5 = StringResources_androidKt.stringResource(C14044R.string.direct_deposit_manual_setup_form_option, composer, 0);
            BentoTextButton3.Icon.Size12 size12 = new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.DISCLOSURES_24, null, 2, null);
            Modifier modifierAlign = column6.align(companion, companion2.getCenterHorizontally());
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(callbacks);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositManualSetupComposableKt$DirectDepositManualSetupComposable$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DirectDepositManualSetupComposable.C141561.invoke$lambda$10$lambda$5$lambda$4(callbacks);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue3, strStringResource5, modifierAlign, size12, null, false, null, composer, BentoTextButton3.Icon.Size12.$stable << 9, 112);
            Modifier modifierTestTag = TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), composer, 6, 0), DirectDepositManualSetupComposable.BUTTON_BAR_TAG);
            String strStringResource6 = StringResources_androidKt.stringResource(directDepositV3ManualSetupViewState.getEmailStatus().getStringRes(), composer, 0);
            boolean zIsEmailSending = directDepositV3ManualSetupViewState.isEmailSending();
            String strStringResource7 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChanged3 = composer.changed(function0);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositManualSetupComposableKt$DirectDepositManualSetupComposable$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DirectDepositManualSetupComposable.C141561.invoke$lambda$10$lambda$7$lambda$6(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function02 = (Function0) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(callbacks);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositManualSetupComposableKt$DirectDepositManualSetupComposable$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DirectDepositManualSetupComposable.C141561.invoke$lambda$10$lambda$9$lambda$8(callbacks);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierTestTag, null, null, false, null, null, function02, strStringResource6, zIsEmailSending, null, false, (Function0) objRememberedValue5, strStringResource7, false, null, false, composer, 0, 0, 58942);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$7$lambda$6(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$8(DirectDepositV3ManualSetupFragment.Callbacks callbacks) {
            callbacks.onManualDirectDepositFlowCompleted();
            return Unit.INSTANCE;
        }
    }

    public static final void DirectDepositManualSetupComposable(final DirectDepositV3ManualSetupViewState viewState, final DirectDepositV3ManualSetupFragment.Callbacks callbacks, final Function1<? super HapticFeedback, Unit> copyAccountNumber, final Function1<? super HapticFeedback, Unit> copyRoutingNumber, final Function0<Unit> emailInfo, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(copyAccountNumber, "copyAccountNumber");
        Intrinsics.checkNotNullParameter(copyRoutingNumber, "copyRoutingNumber");
        Intrinsics.checkNotNullParameter(emailInfo, "emailInfo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1707005053);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(copyAccountNumber) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(copyRoutingNumber) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(emailInfo) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1707005053, i2, -1, "com.robinhood.android.directdeposit.ui.v3.DirectDepositManualSetupComposable (DirectDepositManualSetupComposable.kt:37)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2066578088, true, new C141561(viewState, copyRoutingNumber, copyAccountNumber, callbacks, emailInfo), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositManualSetupComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DirectDepositManualSetupComposable.DirectDepositManualSetupComposable$lambda$0(viewState, callbacks, copyAccountNumber, copyRoutingNumber, emailInfo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
