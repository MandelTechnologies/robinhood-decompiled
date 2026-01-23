package com.robinhood.android.retirement.dashboard.header;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCta;
import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementDashboardHeader.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a'\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"RetirementAccountSwitcherTag", "", "AccountSwitcherHeaderCta", "", "state", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "callbacks", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RetirementDashboardHeader", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderCallbacks;", "(Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-retirement-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementDashboardHeader2 {
    public static final String RetirementAccountSwitcherTag = "retirement_account_switcher";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherHeaderCta$lambda$2(RetirementDashboardHeader3 retirementDashboardHeader3, AccountSwitcherCallbacks3 accountSwitcherCallbacks3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSwitcherHeaderCta(retirementDashboardHeader3, accountSwitcherCallbacks3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementDashboardHeader$lambda$3(RetirementDashboardHeader3 retirementDashboardHeader3, RetirementDashboardHeader retirementDashboardHeader, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RetirementDashboardHeader(retirementDashboardHeader3, retirementDashboardHeader, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSwitcherHeaderCta(final RetirementDashboardHeader3 state, final AccountSwitcherCallbacks3 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final AccountSwitcherData data;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1713773404);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1713773404, i3, -1, "com.robinhood.android.retirement.dashboard.header.AccountSwitcherHeaderCta (RetirementDashboardHeader.kt:92)");
                }
                RetirementDashboardHeader3.Loaded loaded = !(state instanceof RetirementDashboardHeader3.Loaded) ? (RetirementDashboardHeader3.Loaded) state : null;
                data = loaded == null ? loaded.getData() : null;
                Modifier modifierTestTag = TestTag3.testTag(modifier4, RetirementAccountSwitcherTag);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.EXPAND, null, new Component(Component.ComponentType.BUTTON, AnalyticsStrings.TAB_NAV_TAB_BAR_ACCOUNT_SELECTOR, null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null);
                String string2 = StringResource2.getString(state.getTitle(), composerStartRestartGroup, StringResource.$stable);
                TextStyle displayCapsuleLarge = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge();
                boolean z = state instanceof RetirementDashboardHeader3.Loading;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(data) | composerStartRestartGroup.changedInstance(callbacks);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RetirementDashboardHeader2.AccountSwitcherHeaderCta$lambda$1$lambda$0(data, callbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                AccountSwitcherCta.m15801AccountSwitcherCtaGmEhDVc(string2, displayCapsuleLarge, modifierAutoLogEvents$default, null, z, 0.0f, false, false, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementDashboardHeader2.AccountSwitcherHeaderCta$lambda$2(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(state instanceof RetirementDashboardHeader3.Loaded)) {
            }
            if (loaded == null) {
            }
            Modifier modifierTestTag2 = TestTag3.testTag(modifier4, RetirementAccountSwitcherTag);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.EXPAND, null, new Component(Component.ComponentType.BUTTON, AnalyticsStrings.TAB_NAV_TAB_BAR_ACCOUNT_SELECTOR, null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null);
            String string22 = StringResource2.getString(state.getTitle(), composerStartRestartGroup, StringResource.$stable);
            TextStyle displayCapsuleLarge2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleLarge();
            boolean z2 = state instanceof RetirementDashboardHeader3.Loading;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(data) | composerStartRestartGroup.changedInstance(callbacks);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RetirementDashboardHeader2.AccountSwitcherHeaderCta$lambda$1$lambda$0(data, callbacks);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                AccountSwitcherCta.m15801AccountSwitcherCtaGmEhDVc(string22, displayCapsuleLarge2, modifierAutoLogEvents$default2, null, z2, 0.0f, false, false, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherHeaderCta$lambda$1$lambda$0(AccountSwitcherData accountSwitcherData, AccountSwitcherCallbacks3 accountSwitcherCallbacks3) {
        if (accountSwitcherData != null) {
            accountSwitcherCallbacks3.onAccountSwitcherCtaClicked(accountSwitcherData);
        }
        return Unit.INSTANCE;
    }

    public static final void RetirementDashboardHeader(final RetirementDashboardHeader3 state, final RetirementDashboardHeader callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-212103245);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-212103245, i3, -1, "com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader (RetirementDashboardHeader.kt:127)");
            }
            GoldMatchInfoTag.ContainerWithMatchInfoTag(state.getActiveMatchBreakdown(), modifier3, ComposableLambda3.rememberComposableLambda(2007100180, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderKt.RetirementDashboardHeader.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2007100180, i5, -1, "com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader.<anonymous> (RetirementDashboardHeader.kt:132)");
                    }
                    RetirementDashboardHeader2.AccountSwitcherHeaderCta(state, callbacks, null, composer2, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementDashboardHeader2.RetirementDashboardHeader$lambda$3(state, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
