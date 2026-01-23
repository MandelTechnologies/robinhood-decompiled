package com.robinhood.android.retirement.onboarding;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks;
import com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionFragmentKey;
import com.robinhood.android.advisory.contracts.AdvisoryOnboardingKey;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys5;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys7;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonFragment;
import com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment;
import com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment;
import com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionFragment;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSignedAgreements;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RetirementSignUpFlowParentFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u000289B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0016H\u0002J\u0010\u0010/\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u00100\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0002J\b\u00101\u001a\u00020\u001cH\u0002J\t\u00102\u001a\u00020\u0016H\u0096\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment$Callbacks;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment$Callbacks;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment$Callbacks;", "Lcom/robinhood/android/account/contracts/onboarding/ManagementStyleSelectionCallbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "refId", "Ljava/util/UUID;", "getRefId", "()Ljava/util/UUID;", "refId$delegate", "Lkotlin/properties/ReadWriteProperty;", "hideProgressBar", "", "getHideProgressBar", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onConfirmAccountDescription", "showAccountComparison", "getManagementTypeSelectionFragment", "Landroidx/fragment/app/Fragment;", "onConfirmSelfDirectedAccount", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onAgreementsSigned", "signedAgreements", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;", "onAccountSubmitError", "onSignUpComplete", "accountNumber", "", "launchManagedOnboarding", "manuallySelectedAdvisory", "onConfirmManagedAccount", "finishSignup", "showSelfDirectedAgreements", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowParentFragment extends BaseFragment implements RegionGated, RetirementSignUpFlowAccountDescriptionFragment.Callbacks, RetirementSignUpFlowAgreementsFragment.Callbacks, RetirementSignUpFlowSubmitFragment.Callbacks, ManagementStyleSelectionCallbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: refId$delegate, reason: from kotlin metadata */
    private final Interfaces3 refId;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RetirementSignUpFlowParentFragment.class, "refId", "getRefId()Ljava/util/UUID;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RetirementSignUpFlowParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RetirementIntentKeys5.values().length];
            try {
                iArr[RetirementIntentKeys5.SELECTION_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RetirementIntentKeys5.SELF_DIRECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RetirementIntentKeys5.MANAGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RetirementSignUpFlowParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.refId = (Interfaces3) BindSavedState2.savedSerializable(this, uuidRandomUUID).provideDelegate(this, $$delegatedProperties[0]);
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final UUID getRefId() {
        Object value = this.refId.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UUID) value;
    }

    private final boolean getHideProgressBar() {
        return CollectionsKt.listOf((Object[]) new RetirementIntentKeys5[]{RetirementIntentKeys5.SELECTION_REQUIRED, RetirementIntentKeys5.MANAGED}).contains(((Args) INSTANCE.getArgs((Fragment) this)).getManagementTypeSelection());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            RetirementSignUpFlowAccountDescriptionFragment.Companion companion = RetirementSignUpFlowAccountDescriptionFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new RetirementSignUpFlowAccountDescriptionFragment.Args(((Args) companion2.getArgs((Fragment) this)).getAccountType(), ((Args) companion2.getArgs((Fragment) this)).getDescriptionLoggingIdentifier(), ((Args) companion2.getArgs((Fragment) this)).getSteps(), getHideProgressBar())));
        }
    }

    @Override // com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.Callbacks
    public void onConfirmAccountDescription() {
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getManagementTypeSelection().ordinal()];
        if (i == 1) {
            replaceFragment(getManagementTypeSelectionFragment());
        } else if (i == 2) {
            showSelfDirectedAgreements();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            launchManagedOnboarding(false);
        }
    }

    @Override // com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.Callbacks
    public void showAccountComparison() {
        replaceFragment(RetirementAccountComparisonFragment.INSTANCE.newInstance());
    }

    private final Fragment getManagementTypeSelectionFragment() {
        Companion companion = INSTANCE;
        if (Intrinsics.areEqual(((Args) companion.getArgs((Fragment) this)).getEntryPoint(), RetirementLastKnownEntryPointManager.DASHBOARD_SWIPEY_CTA)) {
            return RetirementManagementStyleSelectionFragment.INSTANCE.newInstance((Parcelable) new RetirementManagementStyleSelectionFragment.Args(((Args) companion.getArgs((Fragment) this)).getAccountType(), ((Args) companion.getArgs((Fragment) this)).getEntryPoint()));
        }
        return Navigator.DefaultImpls.createFragment$default(getNavigator(), new ManagementStyleSelectionFragmentKey(((Args) companion.getArgs((Fragment) this)).getAccountType(), ((Args) companion.getArgs((Fragment) this)).getEntryPoint()), null, 2, null);
    }

    @Override // com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks
    public void onConfirmSelfDirectedAccount(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        showSelfDirectedAgreements();
    }

    @Override // com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment.Callbacks
    public void onAgreementsSigned(RetirementSignUpFlowSignedAgreements signedAgreements) {
        Intrinsics.checkNotNullParameter(signedAgreements, "signedAgreements");
        RetirementSignUpFlowSubmitFragment.Companion companion = RetirementSignUpFlowSubmitFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new RetirementSignUpFlowSubmitFragment.Args(((Args) companion2.getArgs((Fragment) this)).getAccountType(), ManagementType.SELF_DIRECTED, signedAgreements, ((Args) companion2.getArgs((Fragment) this)).getIgnoreExitDeepLink(), ((Args) companion2.getArgs((Fragment) this)).getEntryPoint(), getRefId())));
    }

    @Override // com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment.Callbacks
    public void onAccountSubmitError() {
        popLastFragment();
    }

    @Override // com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment.Callbacks
    public void onSignUpComplete(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        finishSignup(accountNumber);
    }

    private final void launchManagedOnboarding(boolean manuallySelectedAdvisory) {
        AdvisoryOnboardingKey.EntryPoint entryPoint;
        Navigator navigator = getNavigator();
        Companion companion = INSTANCE;
        BrokerageAccountType accountType = ((Args) companion.getArgs((Fragment) this)).getAccountType();
        String descriptionLoggingIdentifier = ((Args) companion.getArgs((Fragment) this)).getDescriptionLoggingIdentifier();
        if (manuallySelectedAdvisory) {
            entryPoint = AdvisoryOnboardingKey.EntryPoint.ManuallySelectedAdvisory.INSTANCE;
        } else {
            entryPoint = AdvisoryOnboardingKey.EntryPoint.PreselectedAdvisory.INSTANCE;
        }
        replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new AdvisoryOnboardingKey(accountType, entryPoint, descriptionLoggingIdentifier), null, 2, null));
    }

    @Override // com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks
    public void onConfirmManagedAccount(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        launchManagedOnboarding(true);
    }

    private final void finishSignup(String accountNumber) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        NavigationActivityResultContract3.setResult(fragmentActivityRequireActivity, new RetirementIntentKeys7.Result.Success(((Args) INSTANCE.getArgs((Fragment) this)).getAccountType(), accountNumber));
        getUserLeapManager().track(TrackingEvent.FINISHED_RET_SIGN_UP);
        requireActivity().finish();
    }

    private final void showSelfDirectedAgreements() {
        RetirementSignUpFlowAgreementsFragment.Companion companion = RetirementSignUpFlowAgreementsFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new RetirementSignUpFlowAgreementsFragment.Args(((Args) companion2.getArgs((Fragment) this)).getAccountType(), ((Args) companion2.getArgs((Fragment) this)).getSteps(), getHideProgressBar())));
    }

    /* compiled from: RetirementSignUpFlowParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JM\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowParentFragment$Args;", "Landroid/os/Parcelable;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "descriptionLoggingIdentifier", "", "ignoreExitDeepLink", "", "entryPoint", "steps", "", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "managementTypeSelection", "Lcom/robinhood/android/retirement/contracts/RetirementOnboardingManagementTypeSelection;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lcom/robinhood/android/retirement/contracts/RetirementOnboardingManagementTypeSelection;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getDescriptionLoggingIdentifier", "()Ljava/lang/String;", "getIgnoreExitDeepLink", "()Z", "getEntryPoint", "getSteps", "()Ljava/util/List;", "getManagementTypeSelection", "()Lcom/robinhood/android/retirement/contracts/RetirementOnboardingManagementTypeSelection;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BrokerageAccountType accountType;
        private final String descriptionLoggingIdentifier;
        private final String entryPoint;
        private final boolean ignoreExitDeepLink;
        private final RetirementIntentKeys5 managementTypeSelection;
        private final List<RetirementSignUpStep> steps;

        /* compiled from: RetirementSignUpFlowParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BrokerageAccountType brokerageAccountTypeValueOf = BrokerageAccountType.valueOf(parcel.readString());
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RetirementSignUpStep.valueOf(parcel.readString()));
                }
                return new Args(brokerageAccountTypeValueOf, string2, z, string3, arrayList, RetirementIntentKeys5.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, BrokerageAccountType brokerageAccountType, String str, boolean z, String str2, List list, RetirementIntentKeys5 retirementIntentKeys5, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = args.accountType;
            }
            if ((i & 2) != 0) {
                str = args.descriptionLoggingIdentifier;
            }
            if ((i & 4) != 0) {
                z = args.ignoreExitDeepLink;
            }
            if ((i & 8) != 0) {
                str2 = args.entryPoint;
            }
            if ((i & 16) != 0) {
                list = args.steps;
            }
            if ((i & 32) != 0) {
                retirementIntentKeys5 = args.managementTypeSelection;
            }
            List list2 = list;
            RetirementIntentKeys5 retirementIntentKeys52 = retirementIntentKeys5;
            return args.copy(brokerageAccountType, str, z, str2, list2, retirementIntentKeys52);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescriptionLoggingIdentifier() {
            return this.descriptionLoggingIdentifier;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIgnoreExitDeepLink() {
            return this.ignoreExitDeepLink;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final List<RetirementSignUpStep> component5() {
            return this.steps;
        }

        /* renamed from: component6, reason: from getter */
        public final RetirementIntentKeys5 getManagementTypeSelection() {
            return this.managementTypeSelection;
        }

        public final Args copy(BrokerageAccountType accountType, String descriptionLoggingIdentifier, boolean ignoreExitDeepLink, String entryPoint, List<? extends RetirementSignUpStep> steps, RetirementIntentKeys5 managementTypeSelection) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(descriptionLoggingIdentifier, "descriptionLoggingIdentifier");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(managementTypeSelection, "managementTypeSelection");
            return new Args(accountType, descriptionLoggingIdentifier, ignoreExitDeepLink, entryPoint, steps, managementTypeSelection);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.accountType == args.accountType && Intrinsics.areEqual(this.descriptionLoggingIdentifier, args.descriptionLoggingIdentifier) && this.ignoreExitDeepLink == args.ignoreExitDeepLink && Intrinsics.areEqual(this.entryPoint, args.entryPoint) && Intrinsics.areEqual(this.steps, args.steps) && this.managementTypeSelection == args.managementTypeSelection;
        }

        public int hashCode() {
            int iHashCode = ((((this.accountType.hashCode() * 31) + this.descriptionLoggingIdentifier.hashCode()) * 31) + Boolean.hashCode(this.ignoreExitDeepLink)) * 31;
            String str = this.entryPoint;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.steps.hashCode()) * 31) + this.managementTypeSelection.hashCode();
        }

        public String toString() {
            return "Args(accountType=" + this.accountType + ", descriptionLoggingIdentifier=" + this.descriptionLoggingIdentifier + ", ignoreExitDeepLink=" + this.ignoreExitDeepLink + ", entryPoint=" + this.entryPoint + ", steps=" + this.steps + ", managementTypeSelection=" + this.managementTypeSelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountType.name());
            dest.writeString(this.descriptionLoggingIdentifier);
            dest.writeInt(this.ignoreExitDeepLink ? 1 : 0);
            dest.writeString(this.entryPoint);
            List<RetirementSignUpStep> list = this.steps;
            dest.writeInt(list.size());
            Iterator<RetirementSignUpStep> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeString(this.managementTypeSelection.name());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(BrokerageAccountType accountType, String descriptionLoggingIdentifier, boolean z, String str, List<? extends RetirementSignUpStep> steps, RetirementIntentKeys5 managementTypeSelection) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(descriptionLoggingIdentifier, "descriptionLoggingIdentifier");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(managementTypeSelection, "managementTypeSelection");
            this.accountType = accountType;
            this.descriptionLoggingIdentifier = descriptionLoggingIdentifier;
            this.ignoreExitDeepLink = z;
            this.entryPoint = str;
            this.steps = steps;
            this.managementTypeSelection = managementTypeSelection;
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final String getDescriptionLoggingIdentifier() {
            return this.descriptionLoggingIdentifier;
        }

        public final boolean getIgnoreExitDeepLink() {
            return this.ignoreExitDeepLink;
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final List<RetirementSignUpStep> getSteps() {
            return this.steps;
        }

        public final RetirementIntentKeys5 getManagementTypeSelection() {
            return this.managementTypeSelection;
        }
    }

    /* compiled from: RetirementSignUpFlowParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowParentFragment;", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowParentFragment$Args;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RetirementSignUpFlowParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RetirementSignUpFlowParentFragment retirementSignUpFlowParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, retirementSignUpFlowParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementSignUpFlowParentFragment newInstance(Args args) {
            return (RetirementSignUpFlowParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementSignUpFlowParentFragment retirementSignUpFlowParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, retirementSignUpFlowParentFragment, args);
        }
    }
}
