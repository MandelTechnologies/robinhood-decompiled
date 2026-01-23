package com.robinhood.android.settings.settings;

import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionsSettingsFragmentKey;
import com.robinhood.android.options.contracts.OptionsSettingsFragmentKey2;
import com.robinhood.shared.settings.contracts.Constants6;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey2;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.shared.settings.contracts.SettingsPage;
import com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TraderSettingsParentFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0012\u0010\u001c\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/TraderSettingsParentFragment;", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsParentFragment;", "<init>", "()V", "launchType", "Lcom/robinhood/shared/settings/contracts/SettingsLaunchType;", "getLaunchType", "()Lcom/robinhood/shared/settings/contracts/SettingsLaunchType;", "fromGoldUpgrade", "", "getFromGoldUpgrade", "()Z", "preventUpNavigation", "getPreventUpNavigation", "isFromDeeplink", "subPage", "", "getSubPage", "()Ljava/lang/String;", "itemId", "getItemId", "accountNumber", "getAccountNumber", "showAccountSwitcher", "getShowAccountSwitcher", "launchCashManagementSettings", "", "launchOptionsSettings", "launchDayTradeSettings", "launchMarginSettings", "Companion", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class TraderSettingsParentFragment extends BaseSettingsParentFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseSettingsParentFragment.$stable;

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public SettingsFragmentKey3 getLaunchType() {
        return ((SettingsFragmentKey) INSTANCE.getArgs((Fragment) this)).getLaunchType();
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public boolean getFromGoldUpgrade() {
        return ((SettingsFragmentKey) INSTANCE.getArgs((Fragment) this)).getFromGoldUpgrade();
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public boolean getPreventUpNavigation() {
        return ((SettingsFragmentKey) INSTANCE.getArgs((Fragment) this)).getPreventUpNavigation();
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public boolean isFromDeeplink() {
        return ((SettingsFragmentKey) INSTANCE.getArgs((Fragment) this)).isFromDeeplink();
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public String getSubPage() {
        return ((SettingsFragmentKey) INSTANCE.getArgs((Fragment) this)).getSubPage();
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public String getItemId() {
        return ((SettingsFragmentKey) INSTANCE.getArgs((Fragment) this)).getItemId();
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public String getAccountNumber() {
        return ((SettingsFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public boolean getShowAccountSwitcher() {
        return ((SettingsFragmentKey) INSTANCE.getArgs((Fragment) this)).getShowAccountSwitcher();
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public void launchCashManagementSettings() {
        setOrReplaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new SettingsPage(Constants6.CASH_MANAGEMENT_SETTINGS_PAGE_ID, null, null, 6, null), null, 2, null));
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public void launchOptionsSettings(boolean isFromDeeplink) {
        OptionsSettingsFragmentKey2 accountNumber;
        OptionsSettingsFragmentKey2 accountType;
        Navigator navigator = getNavigator();
        Companion companion = INSTANCE;
        String accountNumber2 = ((SettingsFragmentKey) companion.getArgs((Fragment) this)).getAccountNumber();
        if (accountNumber2 != null) {
            accountNumber = new OptionsSettingsFragmentKey2.AccountNumber(accountNumber2);
        } else {
            SettingsFragmentKey2 accountInfo = ((SettingsFragmentKey) companion.getArgs((Fragment) this)).getAccountInfo();
            if (accountInfo != null) {
                if (accountInfo instanceof SettingsFragmentKey2.AccountNumber) {
                    accountType = new OptionsSettingsFragmentKey2.AccountNumber(((SettingsFragmentKey2.AccountNumber) accountInfo).getAccountNumber());
                } else {
                    if (!(accountInfo instanceof SettingsFragmentKey2.AccountType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    accountType = new OptionsSettingsFragmentKey2.AccountType(((SettingsFragmentKey2.AccountType) accountInfo).getAccountType());
                }
                accountNumber = accountType;
            } else {
                accountNumber = null;
            }
        }
        setOrReplaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new OptionsSettingsFragmentKey(accountNumber, isFromDeeplink), null, 2, null));
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public void launchDayTradeSettings(String accountNumber) {
        setOrReplaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new SettingsPage(Constants6.DAY_TRADE_SETTINGS_PAGE_ID, accountNumber, null, 4, null), null, 2, null));
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment
    public void launchMarginSettings() {
        setOrReplaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new SettingsPage(Constants6.MARGIN_SETTINGS_PAGE_ID, null, null, 6, null), null, 2, null));
    }

    /* compiled from: TraderSettingsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/TraderSettingsParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/settings/settings/TraderSettingsParentFragment;", "Lcom/robinhood/shared/settings/contracts/SettingsFragmentKey;", "<init>", "()V", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TraderSettingsParentFragment, SettingsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SettingsFragmentKey settingsFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, settingsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SettingsFragmentKey getArgs(TraderSettingsParentFragment traderSettingsParentFragment) {
            return (SettingsFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, traderSettingsParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TraderSettingsParentFragment newInstance(SettingsFragmentKey settingsFragmentKey) {
            return (TraderSettingsParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, settingsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TraderSettingsParentFragment traderSettingsParentFragment, SettingsFragmentKey settingsFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, traderSettingsParentFragment, settingsFragmentKey);
        }
    }
}
