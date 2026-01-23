package com.robinhood.android.advisory.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.advisory.contracts.AdvisoryOnboardingKey;
import com.robinhood.android.advisory.onboarding.AdvisoryOnboardingParentFragment;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment;
import com.robinhood.android.advisory.onboarding.firstdeposit.timeline.AdvisoryFirstDepositTimelineFragment;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment;
import com.robinhood.android.advisory.onboarding.portfolioreveal.AdvisoryPortfolioRevealCallbacks;
import com.robinhood.android.advisory.onboarding.portfolioreveal.AdvisoryPortfolioRevealParentFragment;
import com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2;
import com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.models.retirement.api.contributions.ContributionYear;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel2;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel4;
import com.robinhood.models.advisory.api.contribution.TransferAccountInfo;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.investorprofile.questionnaire.QuestionnaireLoggingParams;
import com.robinhood.models.util.Money;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: AdvisoryOnboardingParentFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u00019B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J&\u0010#\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020(H\u0016J*\u0010)\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J \u00100\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u00106\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u00108\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/AdvisoryOnboardingParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/AdvisoryPortfolioRevealCallbacks;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2$Callbacks;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFirstDepositTransferTypeSelectionFragment$Callbacks;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/timeline/AdvisoryFirstDepositTimelineFragment$Callbacks;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferFragment$Callbacks;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "<set-?>", "Ljava/util/UUID;", "applicationId", "getApplicationId", "()Ljava/util/UUID;", "setApplicationId", "(Ljava/util/UUID;)V", "applicationId$delegate", "Lkotlin/properties/ReadWriteProperty;", "questionnaireLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onQuestionnaireIntroContinueClicked", "onCompletePortfolioReveal", "onRetirementContributionSelected", "contributionYears", "", "Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;", "minimumContribution", "Lcom/robinhood/models/util/Money;", "onDepositSelected", "minimumDeposit", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;", "sourceTransferAccountInfo", "Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "onTimelineContinue", "showAssetTransferTimeline", "timeline", "Lcom/robinhood/models/advisory/api/contribution/FundingMethodTimeline;", "loggingIdentifier", "", "showAgreements", "onFirstDepositConfigured", "onFirstTimeContributionConfigured", "launchAgreements", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryOnboardingParentFragment extends BaseFragment implements AdvisoryPortfolioRevealCallbacks, PortfolioQuestionnaireIntroFragmentV2.Callbacks, AdvisoryFirstDepositTransferTypeSelectionFragment.Callbacks, AdvisoryFirstDepositTimelineFragment.Callbacks, AdvisoryFirstDepositTransferFragment.Callbacks, RetirementOnboardingContributionFragment.Callbacks {

    /* renamed from: applicationId$delegate, reason: from kotlin metadata */
    private final Interfaces3 applicationId;
    private final ActivityResultLauncher<Intent> questionnaireLauncher;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AdvisoryOnboardingParentFragment.class, "applicationId", "getApplicationId()Ljava/util/UUID;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvisoryOnboardingParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AdvisoryOnboardingParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.applicationId = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[0]);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.advisory.onboarding.AdvisoryOnboardingParentFragment$questionnaireLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    UUID applicationId = this.this$0.getApplicationId();
                    if (applicationId == null) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Attempted to launch portfolio reveal without an application id"), true, null, 4, null);
                        return;
                    }
                    AdvisoryOnboardingParentFragment advisoryOnboardingParentFragment = this.this$0;
                    AdvisoryPortfolioRevealParentFragment.Companion companion = AdvisoryPortfolioRevealParentFragment.INSTANCE;
                    AdvisoryOnboardingParentFragment.Companion companion2 = AdvisoryOnboardingParentFragment.INSTANCE;
                    advisoryOnboardingParentFragment.replaceFragment(companion.newInstance((Parcelable) new AdvisoryPortfolioRevealParentFragment.Args(((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this.this$0)).getBrokerageAccountType(), applicationId, ((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this.this$0)).getSource())));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.questionnaireLauncher = activityResultLauncherRegisterForActivityResult;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getApplicationId() {
        return (UUID) this.applicationId.getValue(this, $$delegatedProperties[0]);
    }

    private final void setApplicationId(UUID uuid) {
        this.applicationId.setValue(this, $$delegatedProperties[0], uuid);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            PortfolioQuestionnaireIntroFragmentV2.Companion companion = PortfolioQuestionnaireIntroFragmentV2.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new PortfolioQuestionnaireIntroFragmentV2.Args(((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this)).getBrokerageAccountType(), ((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this)).getEntryPoint(), ((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this)).getSource())));
        }
    }

    @Override // com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2.Callbacks
    public void onQuestionnaireIntroContinueClicked(UUID applicationId) {
        String str;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        setApplicationId(applicationId);
        ActivityResultLauncher<Intent> activityResultLauncher = this.questionnaireLauncher;
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion = INSTANCE;
        switch (WhenMappings.$EnumSwitchMapping$0[((AdvisoryOnboardingKey) companion.getArgs((Fragment) this)).getBrokerageAccountType().ordinal()]) {
            case 1:
                str = QuestionnaireContexts.ADVISORY_INDIVIDUAL;
                break;
            case 2:
                str = QuestionnaireContexts.RETIREMENT_ADVISORY_ROTH_IRA;
                break;
            case 3:
                str = QuestionnaireContexts.RETIREMENT_ADVISORY_TRADITIONAL_IRA;
                break;
            case 4:
            case 5:
                throw new IllegalStateException("Custodial accounts not yet supported");
            case 6:
                throw new IllegalStateException("Managed joint accounts are unsupported");
            case 7:
                throw new IllegalStateException("Attempted to start managed account questionnaire for unknown account type.");
            case 8:
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str2 = str;
        String source = ((AdvisoryOnboardingKey) companion.getArgs((Fragment) this)).getSource();
        if (source == null) {
            source = "";
        }
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new Questionnaire(false, str2, null, applicationId.toString(), null, null, false, true, false, false, true, new QuestionnaireLoggingParams(source, null, 2, null), null, false, false, false, false, false, null, null, 1037168, null), null, false, 12, null));
    }

    @Override // com.robinhood.android.advisory.onboarding.portfolioreveal.AdvisoryPortfolioRevealCallbacks
    public void onCompletePortfolioReveal(UUID applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Companion companion = INSTANCE;
        AdvisoryOnboardingKey.EntryPoint entryPoint = ((AdvisoryOnboardingKey) companion.getArgs((Fragment) this)).getEntryPoint();
        if (Intrinsics.areEqual(entryPoint, AdvisoryOnboardingKey.EntryPoint.ManuallySelectedAdvisory.INSTANCE) || Intrinsics.areEqual(entryPoint, AdvisoryOnboardingKey.EntryPoint.PreselectedAdvisory.INSTANCE)) {
            replaceFragment(AdvisoryFirstDepositTransferTypeSelectionFragment.INSTANCE.newInstance((Parcelable) new AdvisoryFirstDepositTransferTypeSelectionFragment.Args(((AdvisoryOnboardingKey) companion.getArgs((Fragment) this)).getBrokerageAccountType(), applicationId, ((AdvisoryOnboardingKey) companion.getArgs((Fragment) this)).getSource())));
        } else {
            if (!(entryPoint instanceof AdvisoryOnboardingKey.EntryPoint.RxRSunset)) {
                throw new NoWhenBranchMatchedException();
            }
            launchAgreements(applicationId);
        }
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment.Callbacks
    public void onRetirementContributionSelected(UUID applicationId, List<ContributionYear> contributionYears, Money minimumContribution) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(contributionYears, "contributionYears");
        Intrinsics.checkNotNullParameter(minimumContribution, "minimumContribution");
        RetirementOnboardingContributionFragment.Companion companion = RetirementOnboardingContributionFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new RetirementOnboardingContributionFragment.Args(applicationId, contributionYears, minimumContribution, ((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this)).getBrokerageAccountType(), ((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this)).getSource())));
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment.Callbacks
    public void onDepositSelected(UUID applicationId, Money minimumDeposit, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel, TransferAccountInfo sourceTransferAccountInfo) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        AdvisoryFirstDepositTransferFragment.Companion companion = AdvisoryFirstDepositTransferFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new AdvisoryFirstDepositTransferFragment.Args(((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this)).getBrokerageAccountType(), applicationId, minimumDeposit, viewModel, ((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this)).getSource(), sourceTransferAccountInfo)));
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.timeline.AdvisoryFirstDepositTimelineFragment.Callbacks
    public void onTimelineContinue(UUID applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        launchAgreements(applicationId);
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment.Callbacks
    public void showAssetTransferTimeline(UUID applicationId, ApiAdvisoryFirstTimeContributionViewModel4 timeline, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        AdvisoryFirstDepositTimelineFragment.Companion companion = AdvisoryFirstDepositTimelineFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        String source = ((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this)).getSource();
        if (source == null) {
            source = "";
        }
        replaceFragment(companion.newInstance((Parcelable) new AdvisoryFirstDepositTimelineFragment.Args(applicationId, timeline, source, loggingIdentifier, ((AdvisoryOnboardingKey) companion2.getArgs((Fragment) this)).getBrokerageAccountType())));
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment.Callbacks
    public void showAgreements(UUID applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        launchAgreements(applicationId);
    }

    @Override // com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferFragment.Callbacks
    public void onFirstDepositConfigured(UUID applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        launchAgreements(applicationId);
    }

    @Override // com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment.Callbacks
    public void onFirstTimeContributionConfigured(UUID applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        launchAgreements(applicationId);
    }

    private final void launchAgreements(UUID applicationId) {
        TrackingEvent trackingEvent;
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion = INSTANCE;
        OdysseyUtils.launchManagedAgreements(navigator, contextRequireContext, applicationId, ((AdvisoryOnboardingKey) companion.getArgs((Fragment) this)).getBrokerageAccountType(), ((AdvisoryOnboardingKey) companion.getArgs((Fragment) this)).getSource());
        int i = WhenMappings.$EnumSwitchMapping$0[((AdvisoryOnboardingKey) companion.getArgs((Fragment) this)).getBrokerageAccountType().ordinal()];
        if (i == 1) {
            trackingEvent = TrackingEvent.ADVISORY_SEEN_AGREEMENTS_INDIVIDUAL;
        } else if (i == 2) {
            trackingEvent = TrackingEvent.ADVISORY_SEEN_AGREEMENTS_ROTH;
        } else {
            trackingEvent = i != 3 ? null : TrackingEvent.ADVISORY_SEEN_AGREEMENTS_TRAD;
        }
        if (trackingEvent != null) {
            getUserLeapManager().track(trackingEvent);
        }
    }

    /* compiled from: AdvisoryOnboardingParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/AdvisoryOnboardingParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/AdvisoryOnboardingParentFragment;", "Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AdvisoryOnboardingParentFragment, AdvisoryOnboardingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AdvisoryOnboardingKey advisoryOnboardingKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, advisoryOnboardingKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvisoryOnboardingKey getArgs(AdvisoryOnboardingParentFragment advisoryOnboardingParentFragment) {
            return (AdvisoryOnboardingKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, advisoryOnboardingParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvisoryOnboardingParentFragment newInstance(AdvisoryOnboardingKey advisoryOnboardingKey) {
            return (AdvisoryOnboardingParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, advisoryOnboardingKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvisoryOnboardingParentFragment advisoryOnboardingParentFragment, AdvisoryOnboardingKey advisoryOnboardingKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, advisoryOnboardingParentFragment, advisoryOnboardingKey);
        }
    }
}
