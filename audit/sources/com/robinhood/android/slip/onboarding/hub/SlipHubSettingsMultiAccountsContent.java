package com.robinhood.android.slip.onboarding.hub;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.accountswitcher.AccountToggleList;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsContent;
import com.robinhood.android.slip.onboarding.hub.p256ui.SettingsToggleAlertViewState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks2;
import com.robinhood.shared.account.contracts.switcher.AccountToggleData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SlipHubSettingsMultiAccountsContent.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0007\u001a\u0081\u0001\u0010\b\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u001026\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"ToggleSlipAlert", "", "state", "Lcom/robinhood/android/slip/onboarding/hub/ui/SettingsToggleAlertViewState;", "onDismissRequest", "Lkotlin/Function0;", "onToggle", "(Lcom/robinhood/android/slip/onboarding/hub/ui/SettingsToggleAlertViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HubSettingsMultiAccounts", "title", "", "description", "accountToggleData", "Lcom/robinhood/shared/account/contracts/switcher/AccountToggleData;", "toggleAlertViewState", "accountToggleCallbacks", "Lcom/robinhood/shared/account/contracts/switcher/AccountToggleCallbacks;", "setAccountStatus", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "accountNumber", "", "enabled", "dismissAlert", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/account/contracts/switcher/AccountToggleData;Lcom/robinhood/android/slip/onboarding/hub/ui/SettingsToggleAlertViewState;Lcom/robinhood/shared/account/contracts/switcher/AccountToggleCallbacks;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-slip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsContentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipHubSettingsMultiAccountsContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubSettingsMultiAccounts$lambda$1(String str, String str2, AccountToggleData accountToggleData, SettingsToggleAlertViewState settingsToggleAlertViewState, AccountSelectorCallbacks2 accountSelectorCallbacks2, Function2 function2, Function0 function0, int i, Composer composer, int i2) {
        HubSettingsMultiAccounts(str, str2, accountToggleData, settingsToggleAlertViewState, accountSelectorCallbacks2, function2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleSlipAlert$lambda$0(SettingsToggleAlertViewState settingsToggleAlertViewState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ToggleSlipAlert(settingsToggleAlertViewState, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ToggleSlipAlert(final SettingsToggleAlertViewState settingsToggleAlertViewState, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(439290899);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(settingsToggleAlertViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(439290899, i2, -1, "com.robinhood.android.slip.onboarding.hub.ToggleSlipAlert (SlipHubSettingsMultiAccountsContent.kt:31)");
            }
            String title = settingsToggleAlertViewState.getTitle();
            int i3 = i2;
            BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(settingsToggleAlertViewState.getContent());
            BentoAlertButton bentoAlertButton = new BentoAlertButton(settingsToggleAlertViewState.getPrimaryCta(), function02);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(settingsToggleAlertViewState.getSecondaryCta(), function0);
            int i4 = (BentoAlertDialog2.Body.MarkdownText.$stable << 3) | 1572864;
            int i5 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(title, markdownText, bentoAlertButton, null, bentoAlertButton2, null, true, null, function0, composerStartRestartGroup, i4 | (i5 << 6) | (i5 << 12) | ((i3 << 21) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipHubSettingsMultiAccountsContent.ToggleSlipAlert$lambda$0(settingsToggleAlertViewState, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SlipHubSettingsMultiAccountsContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsContentKt$HubSettingsMultiAccounts$1 */
    static final class C286701 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AccountSelectorCallbacks2 $accountToggleCallbacks;
        final /* synthetic */ AccountToggleData $accountToggleData;
        final /* synthetic */ String $description;
        final /* synthetic */ Function0<Unit> $dismissAlert;
        final /* synthetic */ Function2<String, Boolean, Unit> $setAccountStatus;
        final /* synthetic */ String $title;
        final /* synthetic */ SettingsToggleAlertViewState $toggleAlertViewState;

        /* JADX WARN: Multi-variable type inference failed */
        C286701(SettingsToggleAlertViewState settingsToggleAlertViewState, Function0<Unit> function0, Function2<? super String, ? super Boolean, Unit> function2, String str, String str2, AccountToggleData accountToggleData, AccountSelectorCallbacks2 accountSelectorCallbacks2) {
            this.$toggleAlertViewState = settingsToggleAlertViewState;
            this.$dismissAlert = function0;
            this.$setAccountStatus = function2;
            this.$title = str;
            this.$description = str2;
            this.$accountToggleData = accountToggleData;
            this.$accountToggleCallbacks = accountSelectorCallbacks2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function2 function2, SettingsToggleAlertViewState settingsToggleAlertViewState, Function0 function0) {
            function2.invoke(settingsToggleAlertViewState.getAccountNumber(), Boolean.valueOf(settingsToggleAlertViewState.getDirectionToToggle()));
            function0.invoke();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            BentoTheme bentoTheme;
            int i2;
            Modifier.Companion companion;
            String str;
            AccountToggleData accountToggleData;
            AccountSelectorCallbacks2 accountSelectorCallbacks2;
            int i3;
            float fM7995constructorimpl;
            float fM21592getMediumD9Ej5fM;
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(394946707, i, -1, "com.robinhood.android.slip.onboarding.hub.HubSettingsMultiAccounts.<anonymous> (SlipHubSettingsMultiAccountsContent.kt:61)");
            }
            composer2.startReplaceGroup(1586664078);
            SettingsToggleAlertViewState settingsToggleAlertViewState = this.$toggleAlertViewState;
            if (settingsToggleAlertViewState != null) {
                Function0<Unit> function0 = this.$dismissAlert;
                composer2.startReplaceGroup(-1746271574);
                boolean zChanged = composer2.changed(this.$setAccountStatus) | composer2.changed(this.$toggleAlertViewState) | composer2.changed(this.$dismissAlert);
                final Function2<String, Boolean, Unit> function2 = this.$setAccountStatus;
                final SettingsToggleAlertViewState settingsToggleAlertViewState2 = this.$toggleAlertViewState;
                final Function0<Unit> function02 = this.$dismissAlert;
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsContentKt$HubSettingsMultiAccounts$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SlipHubSettingsMultiAccountsContent.C286701.invoke$lambda$1$lambda$0(function2, settingsToggleAlertViewState2, function02);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                SlipHubSettingsMultiAccountsContent.ToggleSlipAlert(settingsToggleAlertViewState, function0, (Function0) objRememberedValue, composer2, 0);
            }
            composer2.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme2.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String str2 = this.$title;
            String str3 = this.$description;
            AccountToggleData accountToggleData2 = this.$accountToggleData;
            AccountSelectorCallbacks2 accountSelectorCallbacks22 = this.$accountToggleCallbacks;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2.startReplaceGroup(-1719246162);
            if (str2 == null || StringsKt.isBlank(str2)) {
                bentoTheme = bentoTheme2;
                i2 = i4;
                companion = companion2;
                str = str3;
                accountToggleData = accountToggleData2;
                accountSelectorCallbacks2 = accountSelectorCallbacks22;
            } else {
                if ((str3 == null || StringsKt.isBlank(str3)) && !accountToggleData2.getRows().isEmpty()) {
                    composer2.startReplaceGroup(-1756782040);
                    fM21592getMediumD9Ej5fM = bentoTheme2.getSpacing(composer2, i4).m21592getMediumD9Ej5fM();
                    composer2.endReplaceGroup();
                } else if (str3 == null || StringsKt.isBlank(str3)) {
                    composer2.startReplaceGroup(-1756577347);
                    composer2.endReplaceGroup();
                    fM21592getMediumD9Ej5fM = C2002Dp.m7995constructorimpl(0);
                } else {
                    composer2.startReplaceGroup(-1756662039);
                    fM21592getMediumD9Ej5fM = bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM();
                    composer2.endReplaceGroup();
                }
                companion = companion2;
                accountSelectorCallbacks2 = accountSelectorCallbacks22;
                str = str3;
                accountToggleData = accountToggleData2;
                bentoTheme = bentoTheme2;
                i2 = i4;
                BentoText2.m20747BentoText38GnDrw(str2, com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, 0.0f, fM21592getMediumD9Ej5fM, composer2, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer2, i4).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 8188);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1719224227);
            if (str == null || StringsKt.isBlank(str)) {
                i3 = 0;
            } else {
                composer2.startReplaceGroup(-1719219483);
                if (accountToggleData.getRows().isEmpty()) {
                    i3 = 0;
                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                } else {
                    fM7995constructorimpl = bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM();
                    i3 = 0;
                }
                float f = fM7995constructorimpl;
                composer2.endReplaceGroup();
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, 0.0f, f, composer2, 6, 1);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, i3);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, i3);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21622defaultHorizontalPaddingWMci_g0);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, 0, 30);
                composer2 = composer;
                composer2.endNode();
            }
            composer2.endReplaceGroup();
            AccountToggleList.AccountToggleList(accountToggleData, accountSelectorCallbacks2, null, WindowInsetsKt.asPaddingValues(WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composer2, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()), composer2, i3), composer2, 0, 4);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void HubSettingsMultiAccounts(final String str, final String str2, final AccountToggleData accountToggleData, final SettingsToggleAlertViewState settingsToggleAlertViewState, final AccountSelectorCallbacks2 accountToggleCallbacks, final Function2<? super String, ? super Boolean, Unit> setAccountStatus, final Function0<Unit> dismissAlert, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(accountToggleData, "accountToggleData");
        Intrinsics.checkNotNullParameter(accountToggleCallbacks, "accountToggleCallbacks");
        Intrinsics.checkNotNullParameter(setAccountStatus, "setAccountStatus");
        Intrinsics.checkNotNullParameter(dismissAlert, "dismissAlert");
        Composer composerStartRestartGroup = composer.startRestartGroup(-661846904);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(accountToggleData) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(settingsToggleAlertViewState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(accountToggleCallbacks) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(setAccountStatus) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(dismissAlert) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-661846904, i2, -1, "com.robinhood.android.slip.onboarding.hub.HubSettingsMultiAccounts (SlipHubSettingsMultiAccountsContent.kt:59)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(394946707, true, new C286701(settingsToggleAlertViewState, dismissAlert, setAccountStatus, str, str2, accountToggleData, accountToggleCallbacks), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipHubSettingsMultiAccountsContent.HubSettingsMultiAccounts$lambda$1(str, str2, accountToggleData, settingsToggleAlertViewState, accountToggleCallbacks, setAccountStatus, dismissAlert, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
