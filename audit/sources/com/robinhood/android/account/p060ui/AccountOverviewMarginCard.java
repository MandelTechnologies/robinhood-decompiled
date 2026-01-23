package com.robinhood.android.account.p060ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
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
import com.robinhood.android.account.p060ui.MarginSectionState;
import com.robinhood.android.instant.p160ui.InstantCashConstants2;
import com.robinhood.android.instant.p160ui.InstantCashUtils;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.margin.contracts.MarginInvestingSettingsKey;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.AccountType;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: AccountOverviewMarginCard.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"MARGIN_SECTION_TITLE_TEST_TAG", "", "MARGIN_SECTION_SUMMARY_TEST_TAG", "MARGIN_SECTION_CTA_TEST_TAG", "SourceScreenIdentifier", "MarginSectionRows", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/account/ui/MarginSectionState$Rows;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/account/ui/MarginSectionState$Rows;Landroidx/compose/runtime/Composer;II)V", "MarginSectionSummary", "Lcom/robinhood/android/account/ui/MarginSectionState;", "callbacks", "Lcom/robinhood/android/account/ui/MarginSectionCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/account/ui/MarginSectionState;Lcom/robinhood/android/account/ui/MarginSectionCallbacks;Landroidx/compose/runtime/Composer;II)V", "MarginSection", "feature-account-overview_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.ui.AccountOverviewMarginCardKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountOverviewMarginCard {
    public static final String MARGIN_SECTION_CTA_TEST_TAG = "margin_section_cta";
    public static final String MARGIN_SECTION_SUMMARY_TEST_TAG = "margin_section_summary";
    public static final String MARGIN_SECTION_TITLE_TEST_TAG = "margin_section_title";
    private static final String SourceScreenIdentifier = "ACCOUNT_CARD";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginSection$lambda$16(Modifier modifier, MarginSectionState marginSectionState, AccountOverviewMarginCard3 accountOverviewMarginCard3, int i, int i2, Composer composer, int i3) {
        MarginSection(modifier, marginSectionState, accountOverviewMarginCard3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginSectionRows$lambda$2(Modifier modifier, MarginSectionState.Rows rows, int i, int i2, Composer composer, int i3) {
        MarginSectionRows(modifier, rows, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginSectionSummary$lambda$10(Modifier modifier, MarginSectionState marginSectionState, AccountOverviewMarginCard3 accountOverviewMarginCard3, int i, int i2, Composer composer, int i3) {
        MarginSectionSummary(modifier, marginSectionState, accountOverviewMarginCard3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final void MarginSectionRows(Modifier modifier, final MarginSectionState.Rows rows, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1621877687);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= composerStartRestartGroup.changed(rows) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1621877687, i3, -1, "com.robinhood.android.account.ui.MarginSectionRows (AccountOverviewMarginCard.kt:149)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            modifier3 = modifier4;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
            AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(null, StringResources_androidKt.stringResource(C8159R.string.account_overview_gold_section_margin_used, composerStartRestartGroup, 0), rows.getMarginUsed(), null, null, composerStartRestartGroup, 0, 25);
            AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(null, StringResources_androidKt.stringResource(C8159R.string.account_overview_gold_section_margin_maintenance, composerStartRestartGroup, 0), rows.getMaintenance(), null, null, composerStartRestartGroup, 0, 25);
            String optionsCollateral = rows.getOptionsCollateral();
            composerStartRestartGroup.startReplaceGroup(1914987711);
            if (optionsCollateral != null) {
                AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(null, StringResources_androidKt.stringResource(C8159R.string.account_overview_gold_section_options_collateral, composerStartRestartGroup, 0), optionsCollateral, null, null, composerStartRestartGroup, 0, 25);
            }
            composerStartRestartGroup.endReplaceGroup();
            AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(null, StringResources_androidKt.stringResource(C8159R.string.account_overview_gold_section_today_day_trade_limit, composerStartRestartGroup, 0), rows.getDayTradeLimit(), null, null, composerStartRestartGroup, 0, 25);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewMarginCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountOverviewMarginCard.MarginSectionRows$lambda$2(modifier3, rows, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MarginSectionSummary(Modifier modifier, final MarginSectionState marginSectionState, final AccountOverviewMarginCard3 accountOverviewMarginCard3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        final Modifier modifier4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1480670272);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= composerStartRestartGroup.changedInstance(marginSectionState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(accountOverviewMarginCard3) : composerStartRestartGroup.changedInstance(accountOverviewMarginCard3) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1480670272, i3, -1, "com.robinhood.android.account.ui.MarginSectionSummary (AccountOverviewMarginCard.kt:179)");
            }
            MarginSectionState.Summary summary$feature_account_overview_externalRelease = marginSectionState.getSummary$feature_account_overview_externalRelease();
            if (summary$feature_account_overview_externalRelease instanceof MarginSectionState.Summary.PlainText) {
                composerStartRestartGroup.startReplaceGroup(1334248491);
                boolean z = false;
                String strStringResource = StringResources_androidKt.stringResource(((MarginSectionState.Summary.PlainText) summary$feature_account_overview_externalRelease).getTextRes(), composerStartRestartGroup, 0);
                if (marginSectionState.getAccount().getType() == AccountType.CASH) {
                    composerStartRestartGroup.startReplaceGroup(1289970235);
                    String strStringResource2 = StringResources_androidKt.stringResource(C8159R.string.account_overview_margin_section_cash_account_learn_more, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(accountOverviewMarginCard3))) {
                        z = true;
                    }
                    boolean zChangedInstance = z | composerStartRestartGroup.changedInstance(marginSectionState);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewMarginCardKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountOverviewMarginCard.MarginSectionSummary$lambda$4$lambda$3(accountOverviewMarginCard3, marginSectionState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AccountOverviewComponents.AccountOverviewSectionSummaryWithSubstringLink(modifier2, strStringResource, strStringResource2, (Function0) objRememberedValue, composerStartRestartGroup, i3 & 14, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (marginSectionState.getAccount().getType() == AccountType.MARGIN && marginSectionState.isMarginInvestingEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(1335179700);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(accountOverviewMarginCard3))) {
                        z = true;
                    }
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewMarginCardKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountOverviewMarginCard.MarginSectionSummary$lambda$6$lambda$5(accountOverviewMarginCard3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AccountOverviewComponents.AccountOverviewSectionSummaryWithLink(modifier2, strStringResource, null, (Function0) objRememberedValue2, composerStartRestartGroup, i3 & 14, 4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1335544136);
                    final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final String strStringResource3 = StringResources_androidKt.stringResource(C8159R.string.margin_overview_help_center_link, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource3);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewMarginCardKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountOverviewMarginCard.MarginSectionSummary$lambda$8$lambda$7(navigator, context, strStringResource3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AccountOverviewComponents.AccountOverviewSectionSummaryWithLink(modifier2, strStringResource, null, (Function0) objRememberedValue3, composerStartRestartGroup, i3 & 14, 4);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier2;
            } else {
                if (!(summary$feature_account_overview_externalRelease instanceof MarginSectionState.Summary.Markdown)) {
                    composerStartRestartGroup.startReplaceGroup(1289964073);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1336182178);
                Object obj = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                String text = ((MarginSectionState.Summary.Markdown) summary$feature_account_overview_externalRelease).getText();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier5 = modifier2;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier5, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                modifier3 = modifier5;
                MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, BentoMarkdownText.$stable), null, null, null, null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), null, null, bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), null, 0, null, 1903, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(obj);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new AccountOverviewMarginCard2(obj);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoMarkdownText2.BentoMarkdownText(text, modifierM5146paddingqDBjuR0$default, markdownStyleM16260copyR0sFphs$default, (Function0<Unit>) null, (Function1<? super String, Unit>) ((KFunction) objRememberedValue4), composerStartRestartGroup, MarkdownStyle.$stable << 6, 8);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewMarginCardKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AccountOverviewMarginCard.MarginSectionSummary$lambda$10(modifier4, marginSectionState, accountOverviewMarginCard3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginSectionSummary$lambda$4$lambda$3(AccountOverviewMarginCard3 accountOverviewMarginCard3, MarginSectionState marginSectionState) {
        accountOverviewMarginCard3.onSwitchToMarginAccountClicked(InstantCashUtils.getSwitchAccountSassyInputParams(marginSectionState.getAccount(), InstantCashConstants2.SOURCE_MARGIN_INVESTING_SECTION));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginSectionSummary$lambda$6$lambda$5(AccountOverviewMarginCard3 accountOverviewMarginCard3) {
        accountOverviewMarginCard3.showMarginTerminologyDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginSectionSummary$lambda$8$lambda$7(Navigator navigator, Context context, String str) {
        Navigators3.showHelpCenterWebViewFragment(navigator, context, str);
        return Unit.INSTANCE;
    }

    public static final void MarginSection(Modifier modifier, final MarginSectionState state, final AccountOverviewMarginCard3 callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(423869268);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(423869268, i3, -1, "com.robinhood.android.account.ui.MarginSection (AccountOverviewMarginCard.kt:247)");
            }
            Modifier modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ = AccountOverviewComponents.m10805defaultAccountOverviewSectionPaddinguFdPcIQ(modifier4, 0.0f, true, composerStartRestartGroup, (i3 & 14) | 384, 1);
            modifier3 = modifier4;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            AccountOverviewComponents.AccountOverviewSectionTitle(TestTag3.testTag(companion3, MARGIN_SECTION_TITLE_TEST_TAG), StringResources_androidKt.stringResource(C8159R.string.account_overview_margin_section_margin_investing_title, composerStartRestartGroup, 0), StringResources6.getTextAsString(state.getValueText(), composerStartRestartGroup, StringResource.$stable), null, null, composerStartRestartGroup, 6, 24);
            MarginSectionSummary(TestTag3.testTag(companion3, MARGIN_SECTION_SUMMARY_TEST_TAG), state, callbacks, composerStartRestartGroup, (i3 & 896) | (i3 & 112) | 6, 0);
            composerStartRestartGroup.endNode();
            MarginSectionState.Rows rows$feature_account_overview_externalRelease = state.getRows$feature_account_overview_externalRelease();
            composerStartRestartGroup.startReplaceGroup(-1885486464);
            if (rows$feature_account_overview_externalRelease != null) {
                MarginSectionRows(null, rows$feature_account_overview_externalRelease, composerStartRestartGroup, 0, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1885481966);
            if (!state.getShouldHideEnableMarginCta()) {
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(TestTag3.testTag(companion3, MARGIN_SECTION_CTA_TEST_TAG), 0.0f, composerStartRestartGroup, 6, 1);
                String strStringResource = StringResources_androidKt.stringResource(state.getCtaTextRes(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewMarginCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountOverviewMarginCard.MarginSection$lambda$15$lambda$14$lambda$13(state, navigator, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AccountOverviewComponents.AccountOverviewSectionCta(modifierM21623defaultHorizontalPaddingrAjV9yQ2, strStringResource, false, false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 12);
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewMarginCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountOverviewMarginCard.MarginSection$lambda$16(modifier5, state, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginSection$lambda$15$lambda$14$lambda$13(MarginSectionState marginSectionState, Navigator navigator, Context context) {
        if (marginSectionState.isMarginInvestingEnabled()) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, new MarginInvestingSettingsKey(marginSectionState.getAccount().getAccountNumber(), false, 2, null), null, false, null, null, 60, null);
        } else {
            Navigator.DefaultImpls.startActivity$default(navigator, context, new EnableMarginInvestingKey(marginSectionState.getAccount().getAccountNumber(), SourceScreenIdentifier, null, false, false, 28, null), null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }
}
