package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.robinhood.McDucklingTabFragmentDeepLinkProps;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingPrimaryIntro;
import com.robinhood.android.advisory.contracts.StrategiesValuePropsKey;
import com.robinhood.android.cash.contracts.SpendingTab;
import com.robinhood.android.common.navigation.McDucklingWaitlistSource;
import com.robinhood.android.home.contracts.AccountHomeKey;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesign.accounttab.AccountTabType;
import com.robinhood.android.redesign.accounttab.deeplink.AccountTabDeeplinkCache;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKey;
import com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragmentPage;
import com.robinhood.android.redesigninvesting.interactions.scrolling.LocalAccountTabScrollConnection;
import com.robinhood.android.retirement.RetirementTabFragmentDeepLinkProps;
import com.robinhood.android.retirement.contracts.RetirementTabFragmentKey;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: AccountSelectorFragmentPage.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, m3636d2 = {"AccountTabFragmentPage", "", "tabInfo", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;", "isVisible", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "tabScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;ZLandroidx/fragment/app/FragmentManager;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "applyFragmentChanges", "fragment", "Landroidx/fragment/app/Fragment;", "feature-account-selector_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragmentPageKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorFragmentPage {

    /* compiled from: AccountSelectorFragmentPage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragmentPageKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountTabType.values().length];
            try {
                iArr[AccountTabType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountTabType.INDIVIDUAL_SIGN_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountTabType.INDIVIDUAL_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountTabType.RETIREMENT_IRA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountTabType.RETIREMENT_ROTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountTabType.RETIREMENT_SIGN_UP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccountTabType.MANAGED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccountTabType.SPENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccountTabType.CREDIT_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AccountTabType.ADVISORY_SIGN_UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AccountTabType.JOINT_SIGN_UP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AccountTabType.JOINT_PENDING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AccountTabType.JOINT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTabFragmentPage$lambda$0(AccountTabInfo accountTabInfo, boolean z, FragmentManager fragmentManager, NestedScrollModifier nestedScrollModifier, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountTabFragmentPage(accountTabInfo, z, fragmentManager, nestedScrollModifier, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountTabFragmentPage(final AccountTabInfo tabInfo, final boolean z, final FragmentManager fragmentManager, final NestedScrollModifier tabScrollConnection, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        AccountHomeKey accountHomeKey;
        Object accountHomeKey2;
        Object retirementTabFragmentKey;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tabInfo, "tabInfo");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(tabScrollConnection, "tabScrollConnection");
        Composer composerStartRestartGroup = composer.startRestartGroup(1799213218);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(tabInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(fragmentManager) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(tabScrollConnection) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1799213218, i3, -1, "com.robinhood.android.redesign.feature.accounttab.AccountTabFragmentPage (AccountSelectorFragmentPage.kt:34)");
                    }
                    AccountSelectorTabArgs accountSelectorTabArgs = new AccountSelectorTabArgs(tabInfo.getId(), false, 150, 2, null);
                    if (!(tabInfo instanceof AccountTabInfo.Nux)) {
                        accountHomeKey2 = new AccountHomeKey(HomeDashboardType.Nux.INSTANCE, accountSelectorTabArgs);
                    } else {
                        if (!(tabInfo instanceof AccountTabInfo.Account)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AccountTabInfo.Account account = (AccountTabInfo.Account) tabInfo;
                        switch (WhenMappings.$EnumSwitchMapping$0[account.getAccountType().ordinal()]) {
                            case 1:
                                accountHomeKey = new AccountHomeKey(new HomeDashboardType.Account(account.getAccountId()), accountSelectorTabArgs);
                                accountHomeKey2 = accountHomeKey;
                                break;
                            case 2:
                                accountHomeKey2 = new AccountHomeKey(HomeDashboardType.Nux.INSTANCE, accountSelectorTabArgs);
                                break;
                            case 3:
                                AccountTabInfo.Account.PendingApplication pendingApplication = account.getPendingApplication();
                                if (pendingApplication == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                accountHomeKey = new AccountHomeKey(new HomeDashboardType.PendingApplication(pendingApplication.getApplicationId(), pendingApplication.getBrokerageAccountType()), accountSelectorTabArgs);
                                accountHomeKey2 = accountHomeKey;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                retirementTabFragmentKey = new RetirementTabFragmentKey(account.getAccountId(), null, accountSelectorTabArgs, 2, null);
                                accountHomeKey2 = retirementTabFragmentKey;
                                break;
                            case 7:
                                accountHomeKey = new AccountHomeKey(new HomeDashboardType.Account(account.getAccountId()), accountSelectorTabArgs);
                                accountHomeKey2 = accountHomeKey;
                                break;
                            case 8:
                                accountHomeKey2 = new SpendingTab(accountSelectorTabArgs);
                                break;
                            case 9:
                                accountHomeKey2 = new SpendingTab(accountSelectorTabArgs);
                                break;
                            case 10:
                                retirementTabFragmentKey = new StrategiesValuePropsKey("account-tab-selector", null, accountSelectorTabArgs, 2, null);
                                accountHomeKey2 = retirementTabFragmentKey;
                                break;
                            case 11:
                                accountHomeKey2 = new JointAccountOnboardingPrimaryIntro("account-selector-tab", accountSelectorTabArgs);
                                break;
                            case 12:
                                AccountTabInfo.Account.PendingApplication pendingApplication2 = account.getPendingApplication();
                                if (pendingApplication2 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                accountHomeKey = new AccountHomeKey(new HomeDashboardType.PendingApplication(pendingApplication2.getApplicationId(), pendingApplication2.getBrokerageAccountType()), accountSelectorTabArgs);
                                accountHomeKey2 = accountHomeKey;
                                break;
                            case 13:
                                accountHomeKey = new AccountHomeKey(new HomeDashboardType.Account(account.getAccountId()), accountSelectorTabArgs);
                                accountHomeKey2 = accountHomeKey;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    CompositionLocal3.CompositionLocalProvider(LocalAccountTabScrollConnection.getLocalAccountTabScrollConnection().provides(tabScrollConnection), ComposableLambda3.rememberComposableLambda(-697776798, true, new C264401(tabInfo, z2, accountHomeKey2, fragmentManager, modifier3), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragmentPageKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountSelectorFragmentPage.AccountTabFragmentPage$lambda$0(tabInfo, z, fragmentManager, tabScrollConnection, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                AccountSelectorTabArgs accountSelectorTabArgs2 = new AccountSelectorTabArgs(tabInfo.getId(), false, 150, 2, null);
                if (!(tabInfo instanceof AccountTabInfo.Nux)) {
                }
                CompositionLocal3.CompositionLocalProvider(LocalAccountTabScrollConnection.getLocalAccountTabScrollConnection().provides(tabScrollConnection), ComposableLambda3.rememberComposableLambda(-697776798, true, new C264401(tabInfo, z2, accountHomeKey2, fragmentManager, modifier3), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: AccountSelectorFragmentPage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragmentPageKt$AccountTabFragmentPage$1 */
    static final class C264401 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Object $fragmentKey;
        final /* synthetic */ FragmentManager $fragmentManager;
        final /* synthetic */ boolean $isVisible;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ AccountTabInfo $tabInfo;

        C264401(AccountTabInfo accountTabInfo, boolean z, Object obj, FragmentManager fragmentManager, Modifier modifier) {
            this.$tabInfo = accountTabInfo;
            this.$isVisible = z;
            this.$fragmentKey = obj;
            this.$fragmentManager = fragmentManager;
            this.$modifier = modifier;
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
                ComposerKt.traceEventStart(-697776798, i, -1, "com.robinhood.android.redesign.feature.accounttab.AccountTabFragmentPage.<anonymous> (AccountSelectorFragmentPage.kt:124)");
            }
            String id = this.$tabInfo.getId();
            Lifecycle.State state = this.$isVisible ? Lifecycle.State.RESUMED : Lifecycle.State.STARTED;
            FragmentKey fragmentKey = (FragmentKey) this.$fragmentKey;
            FragmentManager fragmentManager = this.$fragmentManager;
            Modifier modifier = this.$modifier;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragmentPageKt$AccountTabFragmentPage$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountSelectorFragmentPage.C264401.invoke$lambda$1$lambda$0((Fragment) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AccountSelectorAndroidFragmentFromKey.AccountSelectorAndroidFragmentFromKey(fragmentKey, id, fragmentManager, modifier, null, state, (Function1) objRememberedValue, composer, 1572864, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            AccountSelectorFragmentPage.applyFragmentChanges(fragment);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyFragmentChanges(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof RetirementTabFragmentDeepLinkProps) {
            AccountTabDeeplinkCache accountTabDeeplinkCache = AccountTabDeeplinkCache.INSTANCE;
            TabLinkIntentKey tabIntentKey = accountTabDeeplinkCache.getTabIntentKey();
            if (!(tabIntentKey instanceof TabLinkIntentKey.Retirement)) {
                tabIntentKey = null;
            }
            TabLinkIntentKey.Retirement retirement = (TabLinkIntentKey.Retirement) tabIntentKey;
            if (retirement != null) {
                Timber.INSTANCE.tag("AccountTabSwitcher").mo3350d("Apply fragment retirement args: " + retirement, new Object[0]);
                RetirementTabFragmentDeepLinkProps retirementTabFragmentDeepLinkProps = (RetirementTabFragmentDeepLinkProps) fragment;
                retirementTabFragmentDeepLinkProps.setFirstSwipey(retirement.getFirstSwipey());
                retirementTabFragmentDeepLinkProps.setEntryPoint(retirement.getEntryPoint());
                accountTabDeeplinkCache.setTabIntentKey(null);
                return;
            }
            return;
        }
        if (fragment instanceof McDucklingTabFragmentDeepLinkProps) {
            AccountTabDeeplinkCache accountTabDeeplinkCache2 = AccountTabDeeplinkCache.INSTANCE;
            TabLinkIntentKey tabIntentKey2 = accountTabDeeplinkCache2.getTabIntentKey();
            if (!(tabIntentKey2 instanceof TabLinkIntentKey.McDuckling)) {
                tabIntentKey2 = null;
            }
            TabLinkIntentKey.McDuckling mcDuckling = (TabLinkIntentKey.McDuckling) tabIntentKey2;
            if (mcDuckling != null) {
                Timber.INSTANCE.tag("AccountTabSwitcher").mo3350d("Apply fragment mcduckling args: " + mcDuckling, new Object[0]);
                McDucklingTabFragmentDeepLinkProps mcDucklingTabFragmentDeepLinkProps = (McDucklingTabFragmentDeepLinkProps) fragment;
                String source = mcDuckling.getSource();
                if (source == null) {
                    source = McDucklingWaitlistSource.SOURCE_CASH_MANAGEMENT_TAB;
                }
                mcDucklingTabFragmentDeepLinkProps.setSource(source);
                if (mcDuckling.getShowCardActions()) {
                    mcDucklingTabFragmentDeepLinkProps.getShowCardActionsFromLink().onNext(Unit.INSTANCE);
                }
                String scrollTo = mcDuckling.getScrollTo();
                if (scrollTo != null) {
                    mcDucklingTabFragmentDeepLinkProps.getScrollToFromLink().onNext(scrollTo);
                }
                accountTabDeeplinkCache2.setTabIntentKey(null);
            }
        }
    }
}
