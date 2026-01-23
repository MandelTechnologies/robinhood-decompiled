package com.robinhood.android.feature.account.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.account.contracts.individualaccounts.IndividualAccountOnboardingFragmentKey;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingPrimaryIntro;
import com.robinhood.android.account.contracts.onboarding.AccountTypeSelectionCallbacks;
import com.robinhood.android.account.contracts.onboarding.GeneralAccountOnboardingFragmentKey;
import com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks;
import com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionFragmentKey;
import com.robinhood.android.advisory.contracts.AdvisoryOnboardingKey;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys5;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: GeneralAccountOnboardingParentFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR/\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/GeneralAccountOnboardingParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/account/contracts/onboarding/AccountTypeSelectionCallbacks;", "Lcom/robinhood/android/account/contracts/onboarding/ManagementStyleSelectionCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "<set-?>", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "setBrokerageAccountType", "(Lcom/robinhood/models/api/BrokerageAccountType;)V", "brokerageAccountType$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBrokerageAccountTypeSelected", "onRetirementAccountTypeSelected", "onCustodialAccountTypeSelected", "onConfirmSelfDirectedAccount", "onConfirmManagedAccount", "launchAdvisoryOnboarding", "manuallySelectedAdvisory", "Companion", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class GeneralAccountOnboardingParentFragment extends BaseFragment implements AccountTypeSelectionCallbacks, ManagementStyleSelectionCallbacks {

    /* renamed from: brokerageAccountType$delegate, reason: from kotlin metadata */
    private final Interfaces3 brokerageAccountType;
    private final boolean toolbarVisible;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(GeneralAccountOnboardingParentFragment.class, "brokerageAccountType", "getBrokerageAccountType()Lcom/robinhood/models/api/BrokerageAccountType;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GeneralAccountOnboardingParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ManagementType.values().length];
            try {
                iArr[ManagementType.MANAGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagementType.SELF_DIRECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagementType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BrokerageAccountType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public GeneralAccountOnboardingParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
        this.brokerageAccountType = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final BrokerageAccountType getBrokerageAccountType() {
        return (BrokerageAccountType) this.brokerageAccountType.getValue(this, $$delegatedProperties[0]);
    }

    private final void setBrokerageAccountType(BrokerageAccountType brokerageAccountType) {
        this.brokerageAccountType.setValue(this, $$delegatedProperties[0], brokerageAccountType);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            AccountTypeSelectionFragment.Companion companion = AccountTypeSelectionFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            ManagementType managementType = ((GeneralAccountOnboardingFragmentKey) companion2.getArgs((Fragment) this)).getManagementType();
            String source = ((GeneralAccountOnboardingFragmentKey) companion2.getArgs((Fragment) this)).getSource();
            if (source == null) {
                source = "";
            }
            setFragment(i, companion.newInstance((Parcelable) new AccountTypeSelectionFragment.Args(managementType, source)));
        }
    }

    @Override // com.robinhood.android.account.contracts.onboarding.AccountTypeSelectionCallbacks
    public void onBrokerageAccountTypeSelected(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        switch (WhenMappings.$EnumSwitchMapping$1[brokerageAccountType.ordinal()]) {
            case 1:
                Companion companion = INSTANCE;
                ManagementType managementType = ((GeneralAccountOnboardingFragmentKey) companion.getArgs((Fragment) this)).getManagementType();
                int i = managementType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[managementType.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        launchAdvisoryOnboarding(brokerageAccountType, false);
                        return;
                    } else if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new ManagementStyleSelectionFragmentKey(brokerageAccountType, ((GeneralAccountOnboardingFragmentKey) companion.getArgs((Fragment) this)).getSource()), null, 2, null));
                return;
            case 2:
                Navigator navigator = getNavigator();
                String source = ((GeneralAccountOnboardingFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource();
                if (source == null) {
                    source = "";
                }
                replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new JointAccountOnboardingPrimaryIntro(source, null, 2, null), null, 2, null));
                return;
            case 3:
            case 4:
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Somehow selected a specific retirement account type in onboarding."), true, null, 4, null);
                onRetirementAccountTypeSelected();
                return;
            case 5:
            case 6:
                throw new IllegalStateException("Custodial accounts not yet supported");
            case 7:
                throw new IllegalStateException("Unknown brokerage account type selected");
            case 8:
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.account.contracts.onboarding.AccountTypeSelectionCallbacks
    public void onRetirementAccountTypeSelected() {
        RetirementIntentKeys5 retirementIntentKeys5;
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion = INSTANCE;
        String source = ((GeneralAccountOnboardingFragmentKey) companion.getArgs((Fragment) this)).getSource();
        ManagementType managementType = ((GeneralAccountOnboardingFragmentKey) companion.getArgs((Fragment) this)).getManagementType();
        int i = managementType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[managementType.ordinal()];
        if (i == -1) {
            retirementIntentKeys5 = RetirementIntentKeys5.SELECTION_REQUIRED;
        } else if (i == 1) {
            retirementIntentKeys5 = RetirementIntentKeys5.MANAGED;
        } else if (i == 2) {
            retirementIntentKeys5 = RetirementIntentKeys5.SELF_DIRECTED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            retirementIntentKeys5 = RetirementIntentKeys5.SELECTION_REQUIRED;
        }
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RetirementSignUp(null, source, false, null, false, retirementIntentKeys5, null, 93, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.account.contracts.onboarding.AccountTypeSelectionCallbacks
    public void onCustodialAccountTypeSelected() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GenericSdFlowIntentKey(GeneralAccountOnboardingParentFragment2.CUSTODIAL_ONBOARDING_ODYSSEY_FLOW, true, null, null, null, null, false, null, null, 508, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks
    public void onConfirmSelfDirectedAccount(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        setBrokerageAccountType(brokerageAccountType);
        Companion companion = INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        companion.m2014x75f17734(contextRequireContext, getNavigator(), brokerageAccountType, ((GeneralAccountOnboardingFragmentKey) companion.getArgs((Fragment) this)).getSource());
    }

    @Override // com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks
    public void onConfirmManagedAccount(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        launchAdvisoryOnboarding(brokerageAccountType, true);
    }

    private final void launchAdvisoryOnboarding(BrokerageAccountType brokerageAccountType, boolean manuallySelectedAdvisory) {
        AdvisoryOnboardingKey.EntryPoint entryPoint;
        setBrokerageAccountType(brokerageAccountType);
        Navigator navigator = getNavigator();
        String source = ((GeneralAccountOnboardingFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource();
        if (manuallySelectedAdvisory) {
            entryPoint = AdvisoryOnboardingKey.EntryPoint.ManuallySelectedAdvisory.INSTANCE;
        } else {
            entryPoint = AdvisoryOnboardingKey.EntryPoint.PreselectedAdvisory.INSTANCE;
        }
        replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new AdvisoryOnboardingKey(brokerageAccountType, entryPoint, source), null, 2, null));
    }

    /* compiled from: GeneralAccountOnboardingParentFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/GeneralAccountOnboardingParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/feature/account/onboarding/GeneralAccountOnboardingParentFragment;", "Lcom/robinhood/android/account/contracts/onboarding/GeneralAccountOnboardingFragmentKey;", "<init>", "()V", "delegateToSelfDirectedOnboarding", "", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "", "delegateToSelfDirectedOnboarding$feature_account_onboarding_externalDebug", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<GeneralAccountOnboardingParentFragment, GeneralAccountOnboardingFragmentKey> {

        /* compiled from: GeneralAccountOnboardingParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BrokerageAccountType.values().length];
                try {
                    iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GeneralAccountOnboardingFragmentKey generalAccountOnboardingFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, generalAccountOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public GeneralAccountOnboardingFragmentKey getArgs(GeneralAccountOnboardingParentFragment generalAccountOnboardingParentFragment) {
            return (GeneralAccountOnboardingFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, generalAccountOnboardingParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GeneralAccountOnboardingParentFragment newInstance(GeneralAccountOnboardingFragmentKey generalAccountOnboardingFragmentKey) {
            return (GeneralAccountOnboardingParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, generalAccountOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GeneralAccountOnboardingParentFragment generalAccountOnboardingParentFragment, GeneralAccountOnboardingFragmentKey generalAccountOnboardingFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, generalAccountOnboardingParentFragment, generalAccountOnboardingFragmentKey);
        }

        /* renamed from: delegateToSelfDirectedOnboarding$feature_account_onboarding_externalDebug */
        public final void m2014x75f17734(Context context, Navigator navigator, BrokerageAccountType brokerageAccountType, String source) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            int i = WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()];
            if (i == 1) {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new JointAccountOnboardingPrimaryIntro(source != null ? source : "", null, 2, null), false, false, false, false, null, false, null, null, 1020, null);
            } else {
                if (i == 2) {
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new IndividualAccountOnboardingFragmentKey(source != null ? source : ""), false, false, false, false, null, false, null, null, 1020, null);
                    return;
                }
                throw new IllegalStateException(("Unsupported brokerage account type for self-directed account: " + brokerageAccountType).toString());
            }
        }
    }
}
