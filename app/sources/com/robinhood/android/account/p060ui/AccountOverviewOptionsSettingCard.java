package com.robinhood.android.account.p060ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.sharedui.components.banners.InfoBannerComposable3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountOverviewOptionsSettingCard.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"OptionsSection", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/account/ui/OptionsSectionState;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/account/ui/OptionsSectionState;Landroidx/compose/runtime/Composer;II)V", "feature-account-overview_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.ui.AccountOverviewOptionsSettingCardKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountOverviewOptionsSettingCard {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSection$lambda$0(Modifier modifier, OptionsSectionState accountOverviewOptionsSettingCard2, int i, int i2, Composer composer, int i3) {
        OptionsSection(modifier, accountOverviewOptionsSettingCard2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSection$lambda$5(Modifier modifier, OptionsSectionState accountOverviewOptionsSettingCard2, int i, int i2, Composer composer, int i3) {
        OptionsSection(modifier, accountOverviewOptionsSettingCard2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void OptionsSection(Modifier modifier, final OptionsSectionState state, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier.Companion companion;
        int i4;
        float fM21592getMediumD9Ej5fM;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-713420891);
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
        int i6 = i3;
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            final Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-713420891, i6, -1, "com.robinhood.android.account.ui.OptionsSection (AccountOverviewOptionsSettingCard.kt:469)");
            }
            if (state.getHideOptionsSection()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewOptionsSettingCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountOverviewOptionsSettingCard.OptionsSection$lambda$0(modifier3, state, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(AccountOverviewComponents.m10805defaultAccountOverviewSectionPaddinguFdPcIQ(modifier3, 0.0f, false, composerStartRestartGroup, i6 & 14, 3), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.INVESTING_SETTINGS, null, null, null, 14, null), null, null, new Component(Component.ComponentType.OPTIONS_STATUS_SECTION, state.getOptionsStatus().name(), null, 4, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            AccountOverviewComponents.AccountOverviewSectionTitle(null, StringResources_androidKt.stringResource(C8159R.string.options_setting_card_title, composer2, 0), StringResources_androidKt.stringResource(state.getTitleTextRes(), composer2, 0), null, null, composer2, 0, 25);
            composer2.startReplaceGroup(693953654);
            if (state.getShowOptionLevel3EntryPoint()) {
                String strStringResource = StringResources_androidKt.stringResource(C23386R.string.apply_for_options_level_3, composer2, 0);
                Modifier modifierTestTag = TestTag3.testTag(companion4, AccountOverviewOptionsSettingCard4.LEVEL3_ENTRY_POINT_TAG);
                composer2.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changedInstance(state);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewOptionsSettingCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountOverviewOptionsSettingCard.OptionsSection$lambda$4$lambda$3$lambda$2$lambda$1(navigator, context, state);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                companion = companion4;
                i4 = 0;
                InfoBannerComposable3.m17015OptionsLevel3EntryPointTagComposableuDo3WH8(strStringResource, modifierTestTag, (Function0) objRememberedValue, 0L, null, composer2, 48, 24);
                composer2 = composer2;
            } else {
                companion = companion4;
                i4 = 0;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            AccountOverviewOptionsSettingCard3 summary = state.getSummary(composer2, (i6 >> 3) & 14);
            if (summary instanceof AccountOverviewOptionsSettingCard3.Text) {
                composer2.startReplaceGroup(-1785564724);
                AccountOverviewComponents.AccountOverviewSectionSummary(TestTag3.testTag(companion, AccountOverviewOptionsSettingCard4.SUMMARY_WITHOUT_LINK), ((AccountOverviewOptionsSettingCard3.Text) summary).getText(), composer2, 6, i4);
                composer2.endReplaceGroup();
            } else if (summary instanceof AccountOverviewOptionsSettingCard3.TextWithLink) {
                composer2.startReplaceGroup(-1785352374);
                AccountOverviewOptionsSettingCard3.TextWithLink textWithLink = (AccountOverviewOptionsSettingCard3.TextWithLink) summary;
                Composer composer3 = composer2;
                AccountOverviewComponents.AccountOverviewSectionSummaryWithLink(TestTag3.testTag(companion, AccountOverviewOptionsSettingCard4.SUMMARY_WITH_LINK), textWithLink.getText(), textWithLink.getLinkText(), state.getSummaryTextLinkOnClick(navigator, context, current), composer3, 6, 0);
                composer2 = composer3;
                composer2.endReplaceGroup();
            } else {
                if (!(summary instanceof AccountOverviewOptionsSettingCard3.TextWithSubstringLink)) {
                    composer2.startReplaceGroup(80946558);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(-1784974670);
                AccountOverviewOptionsSettingCard3.TextWithSubstringLink textWithSubstringLink = (AccountOverviewOptionsSettingCard3.TextWithSubstringLink) summary;
                Composer composer4 = composer2;
                AccountOverviewComponents.AccountOverviewSectionSummaryWithSubstringLink(TestTag3.testTag(companion, AccountOverviewOptionsSettingCard4.SUMMARY_WITH_LINK), textWithSubstringLink.getText(), textWithSubstringLink.getSubstringLinkText(), state.getSummaryTextLinkOnClick(navigator, context, current), composer4, 6, 0);
                composer2 = composer4;
                composer2.endReplaceGroup();
            }
            Integer firstCtaTextRes = state.getFirstCtaTextRes();
            composer2.startReplaceGroup(80981521);
            if (firstCtaTextRes != null) {
                AccountOverviewComponents.AccountOverviewSectionCta(TestTag3.testTag(companion, AccountOverviewOptionsSettingCard4.CTA), StringResources_androidKt.stringResource(firstCtaTextRes.intValue(), composer2, i4), false, false, state.getFirstCtaOnClick(navigator, context, current), composer2, 6, 12);
            }
            composer2.endReplaceGroup();
            Integer secondCtaTextRes = state.getSecondCtaTextRes();
            composer2.startReplaceGroup(80996898);
            if (secondCtaTextRes != null) {
                String strStringResource2 = StringResources_androidKt.stringResource(secondCtaTextRes.intValue(), composer2, i4);
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                if (firstCtaTextRes != null) {
                    composer2.startReplaceGroup(-1783759625);
                    fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1783674282);
                    fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                    composer2.endReplaceGroup();
                }
                Composer composer5 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8(state.getSecondCtaOnClick(navigator, context, current), strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, fM21592getMediumD9Ej5fM, 0.0f, 0.0f, 13, null), null, type2, false, false, null, null, null, null, false, null, composer5, 24576, 0, 8168);
                composer2 = composer5;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewOptionsSettingCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountOverviewOptionsSettingCard.OptionsSection$lambda$5(modifier2, state, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSection$lambda$4$lambda$3$lambda$2$lambda$1(Navigator navigator, Context context, OptionsSectionState accountOverviewOptionsSettingCard2) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new OptionOnboarding(new OptionOnboarding2.AccountNumber(accountOverviewOptionsSettingCard2.getAccount().getAccountNumber()), new OptionOnboarding.OptionOnboardingSource.Legacy("settings"), null, 4, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }
}
