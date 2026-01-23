package com.robinhood.android.account.p060ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.AccountTypeSectionState;
import com.robinhood.android.instant.p160ui.InstantCashConstants2;
import com.robinhood.android.instant.p160ui.InstantCashUtils;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.AccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: AccountTypeSectionState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"AccountTypeSection", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/account/ui/AccountTypeSectionState;", "callbacks", "Lcom/robinhood/android/account/ui/AccountTypeSectionCallback;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/account/ui/AccountTypeSectionState;Lcom/robinhood/android/account/ui/AccountTypeSectionCallback;Landroidx/compose/runtime/Composer;II)V", "feature-account-overview_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.ui.AccountTypeSectionStateKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountTypeSectionState3 {

    /* compiled from: AccountTypeSectionState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.ui.AccountTypeSectionStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.MARGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.CASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTypeSection$lambda$6(Modifier modifier, AccountTypeSectionState accountTypeSectionState, AccountTypeSectionState2 accountTypeSectionState2, int i, int i2, Composer composer, int i3) {
        AccountTypeSection(modifier, accountTypeSectionState, accountTypeSectionState2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AccountTypeSection(Modifier modifier, final AccountTypeSectionState state, final AccountTypeSectionState2 callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        int i4;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1232761479);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        int i6 = i3;
        if ((i6 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1232761479, i6, -1, "com.robinhood.android.account.ui.AccountTypeSection (AccountTypeSectionState.kt:149)");
            }
            Modifier modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ = AccountOverviewComponents.m10805defaultAccountOverviewSectionPaddinguFdPcIQ(modifier2, 0.0f, false, composerStartRestartGroup, i6 & 14, 3);
            modifier3 = modifier2;
            composerStartRestartGroup = composerStartRestartGroup;
            boolean z = false;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            AccountOverviewComponents.AccountOverviewSectionTitle(null, StringResources_androidKt.stringResource(C8159R.string.account_type_section_label, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(state.getTitleTextRes(), composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 0, 25);
            final AccountTypeSectionState.Summary summary = state.getSummary();
            if (summary instanceof AccountTypeSectionState.Summary.PlainText) {
                composerStartRestartGroup.startReplaceGroup(217887607);
                String strStringResource = StringResources_androidKt.stringResource(((AccountTypeSectionState.Summary.PlainText) summary).getTextRes(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = ((i6 & 896) == 256 || ((i6 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changed(summary);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountTypeSectionStateKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountTypeSectionState3.AccountTypeSection$lambda$5$lambda$1$lambda$0(callbacks, summary);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AccountOverviewComponents.AccountOverviewSectionSummaryWithLink(null, strStringResource, null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 5);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                i4 = -1633490746;
            } else {
                if (!(summary instanceof AccountTypeSectionState.Summary.Markdown)) {
                    composerStartRestartGroup.startReplaceGroup(217884699);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1835120987);
                UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                String text = ((AccountTypeSectionState.Summary.Markdown) summary).getText();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, BentoMarkdownText.$stable), null, null, null, null, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), null, null, bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), null, 0, null, 1903, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new AccountTypeSectionState4(uriHandler);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                i4 = -1633490746;
                BentoMarkdownText2.BentoMarkdownText(text, modifierM5146paddingqDBjuR0$default, markdownStyleM16260copyR0sFphs$default, (Function0<Unit>) null, (Function1<? super String, Unit>) ((KFunction) objRememberedValue2), composerStartRestartGroup, MarkdownStyle.$stable << 6, 8);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.startReplaceGroup(217915346);
            if (state.getShowCta()) {
                String strStringResource2 = StringResources_androidKt.stringResource(state.getCtaTextRes(), composerStartRestartGroup, 0);
                boolean z2 = !state.getDisableCta();
                composerStartRestartGroup.startReplaceGroup(i4);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(state);
                if ((i6 & 896) == 256 || ((i6 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) {
                    z = true;
                }
                boolean z3 = zChangedInstance2 | z;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.account.ui.AccountTypeSectionStateKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountTypeSectionState3.AccountTypeSection$lambda$5$lambda$4$lambda$3(state, callbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                AccountOverviewComponents.AccountOverviewSectionCta(null, strStringResource2, z2, false, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 9);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountTypeSectionStateKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountTypeSectionState3.AccountTypeSection$lambda$6(modifier3, state, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTypeSection$lambda$5$lambda$1$lambda$0(AccountTypeSectionState2 accountTypeSectionState2, AccountTypeSectionState.Summary summary) {
        accountTypeSectionState2.onAccountTypeLearnMoreClicked(((AccountTypeSectionState.Summary.PlainText) summary).getLearnMoreUrlRes());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTypeSection$lambda$5$lambda$4$lambda$3(AccountTypeSectionState accountTypeSectionState, AccountTypeSectionState2 accountTypeSectionState2) {
        int i = WhenMappings.$EnumSwitchMapping$0[accountTypeSectionState.getAccount().getType().ordinal()];
        if (i == 1) {
            accountTypeSectionState2.onAccountTypeSwitchToCashCtaClicked(InstantCashUtils.getSwitchAccountSassyInputParams(accountTypeSectionState.getAccount(), InstantCashConstants2.SOURCE_INVESTING_SETTINGS_ACCOUNT_TYPE));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (accountTypeSectionState.isRetirementAccount()) {
                accountTypeSectionState2.onAccountTypeSwitchToLimitedMarginCtaClicked(accountTypeSectionState.getAccount().getAccountNumber());
            } else {
                accountTypeSectionState2.onAccountTypeSwitchToMarginCtaClicked(InstantCashUtils.getSwitchAccountSassyInputParams(accountTypeSectionState.getAccount(), InstantCashConstants2.SOURCE_INVESTING_SETTINGS_ACCOUNT_TYPE));
            }
        }
        return Unit.INSTANCE;
    }
}
