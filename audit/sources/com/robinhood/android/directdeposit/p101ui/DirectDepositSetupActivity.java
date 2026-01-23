package com.robinhood.android.directdeposit.p101ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.directdeposit.Activities;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.accountinfo.AccountInfoFragment;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositBranchFragment;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositBranchV2Fragment;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashFragment;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState3;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState4;
import com.robinhood.android.directdeposit.p101ui.prefilled.PreFilledFormFlowFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.android.earlypay.lib.confirmation.p111ui.EarlyPayConfirmationFragment;
import com.robinhood.android.earlypay.lib.confirmation.p111ui.EarlyPayConfirmationType;
import com.robinhood.android.earlypay.lib.signup.p112ui.EarlyPaySignupFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.p226ui.DirectDepositPaycheckRecurringInvestmentsConfirmationFragment;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p355ui.DirectDepositAmount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: DirectDepositSetupActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002OPB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u000206H\u0016J\b\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u0002062\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u000206H\u0016J\b\u0010C\u001a\u000206H\u0016J\u0010\u0010D\u001a\u0002062\u0006\u0010E\u001a\u00020'H\u0016J\b\u0010F\u001a\u000206H\u0016J\u0010\u0010G\u001a\u0002062\u0006\u0010H\u001a\u00020'H\u0016J\b\u0010I\u001a\u000206H\u0016J\b\u0010J\u001a\u000206H\u0016J\b\u0010K\u001a\u000206H\u0016J\b\u0010L\u001a\u000206H\u0016J\b\u0010M\u001a\u000206H\u0016J\u0012\u0010N\u001a\u0002062\b\u0010/\u001a\u0004\u0018\u00010.H\u0016R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u001e\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R/\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\u001e\u001a\u0004\u0018\u00010.8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/DirectDepositSetupActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2Fragment$Callbacks;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$Callbacks;", "Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment$Callbacks;", "Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "getRhyAccountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "setRhyAccountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "<set-?>", "Lcom/robinhood/android/directdeposit/ui/DirectDepositSetupActivity$State;", "state", "getState", "()Lcom/robinhood/android/directdeposit/ui/DirectDepositSetupActivity$State;", "setState", "(Lcom/robinhood/android/directdeposit/ui/DirectDepositSetupActivity$State;)V", "state$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "completedDirectDepositSource", "getCompletedDirectDepositSource", "()Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "setCompletedDirectDepositSource", "(Lcom/robinhood/android/common/directdeposit/DirectDepositSource;)V", "completedDirectDepositSource$delegate", "Lcom/robinhood/userleap/survey/Survey;", DirectDepositShimKey.EXTRA_DROP_OFF_SURVEY, "getDropOffSurvey", "()Lcom/robinhood/userleap/survey/Survey;", "setDropOffSurvey", "(Lcom/robinhood/userleap/survey/Survey;)V", "dropOffSurvey$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "getStartFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "onSplashPrimaryButtonClicked", "primaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "onSplashSecondaryButtonClicked", "secondaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "onSeeAccountInfo", "onGetPreFilledForm", "onSetUpDirectDeposit", "directDepositSource", "onDirectDepositCompletedForPaycheckRecurringInvestment", "onDirectDepositCompleted", "source", "onEnrollmentSuccess", "onEnrollmentSkipped", "onEnrollmentConfirmed", "onBackPressed", "onPrefilledFormFlowCompleted", "onPrefilledFormFlowCancelled", "State", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositSetupActivity extends BaseActivity implements DirectDepositSplashFragment.Callbacks, DirectDepositBranchFragment.Callbacks, DirectDepositBranchV2Fragment.Callbacks, DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Callbacks, AccountInfoFragment.Callbacks, PreFilledFormFlowFragment.Callbacks, EarlyPaySignupFragment.Callbacks, EarlyPayConfirmationFragment.Callbacks {

    /* renamed from: completedDirectDepositSource$delegate, reason: from kotlin metadata */
    private final Interfaces3 completedDirectDepositSource;

    /* renamed from: dropOffSurvey$delegate, reason: from kotlin metadata */
    private final Interfaces3 dropOffSurvey;
    public EventLogger eventLogger;
    public RhyAccountStore rhyAccountStore;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final Interfaces3 state;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DirectDepositSetupActivity.class, "state", "getState()Lcom/robinhood/android/directdeposit/ui/DirectDepositSetupActivity$State;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DirectDepositSetupActivity.class, "completedDirectDepositSource", "getCompletedDirectDepositSource()Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DirectDepositSetupActivity.class, DirectDepositShimKey.EXTRA_DROP_OFF_SURVEY, "getDropOffSurvey()Lcom/robinhood/userleap/survey/Survey;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectDepositSetupActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DirectDepositSplashViewState3.values().length];
            try {
                iArr[DirectDepositSplashViewState3.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DirectDepositSplashViewState3.SET_UP_DIRECT_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DirectDepositSplashViewState4.values().length];
            try {
                iArr2[DirectDepositSplashViewState4.ALREADY_SET_UP_DIRECT_DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositSetupActivity() {
        super(C14044R.layout.activity_direct_deposit);
        Interfaces interfacesSavedParcelable = BindSavedState2.savedParcelable(this, new State(null, false, 3, 0 == true ? 1 : 0));
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.state = (Interfaces3) interfacesSavedParcelable.provideDelegate(this, kPropertyArr[0]);
        this.completedDirectDepositSource = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[1]);
        this.dropOffSurvey = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[2]);
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

    public final RhyAccountStore getRhyAccountStore() {
        RhyAccountStore rhyAccountStore = this.rhyAccountStore;
        if (rhyAccountStore != null) {
            return rhyAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyAccountStore");
        return null;
    }

    public final void setRhyAccountStore(RhyAccountStore rhyAccountStore) {
        Intrinsics.checkNotNullParameter(rhyAccountStore, "<set-?>");
        this.rhyAccountStore = rhyAccountStore;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final State getState() {
        return (State) this.state.getValue(this, $$delegatedProperties[0]);
    }

    private final void setState(State state) {
        this.state.setValue(this, $$delegatedProperties[0], state);
    }

    private final DirectDepositSource getCompletedDirectDepositSource() {
        return (DirectDepositSource) this.completedDirectDepositSource.getValue(this, $$delegatedProperties[1]);
    }

    private final void setCompletedDirectDepositSource(DirectDepositSource directDepositSource) {
        this.completedDirectDepositSource.setValue(this, $$delegatedProperties[1], directDepositSource);
    }

    private final Survey getDropOffSurvey() {
        return (Survey) this.dropOffSurvey.getValue(this, $$delegatedProperties[2]);
    }

    private final void setDropOffSurvey(Survey survey) {
        this.dropOffSurvey.setValue(this, $$delegatedProperties[2], survey);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        BaseFragment startFragment;
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            int i = C14044R.id.fragment_container;
            Companion companion = INSTANCE;
            if (((LegacyIntentKey.DirectDepositSetup) companion.getExtras((Activity) this)).getShowSplash()) {
                startFragment = (BaseFragment) DirectDepositSplashFragment.INSTANCE.newInstance((Parcelable) new DirectDepositSplashFragment.Args(((LegacyIntentKey.DirectDepositSetup) companion.getExtras((Activity) this)).getFromRhyMigration()));
            } else {
                startFragment = getStartFragment();
            }
            setFragment(i, startFragment);
        }
        LifecycleHost.DefaultImpls.bind$default(this, getRhyAccountStore().streamSpendingAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.DirectDepositSetupActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSetupActivity.onCreate$lambda$0(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(DirectDepositSetupActivity directDepositSetupActivity, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        directDepositSetupActivity.setState(State.copy$default(directDepositSetupActivity.getState(), null, ((RhyAccount) optional.component1()) != null, 1, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public void finish() {
        DirectDepositSource completedDirectDepositSource = getCompletedDirectDepositSource();
        if (completedDirectDepositSource != null) {
            Activities.setSuccessfulDirectDepositResult(this, completedDirectDepositSource);
        }
        super.finish();
    }

    private final BaseFragment getStartFragment() {
        setDropOffSurvey(Survey.DIRECT_DEPOSIT_SETUP_CHOICE_DROP_OFF);
        Companion companion = INSTANCE;
        if (((LegacyIntentKey.DirectDepositSetup) companion.getExtras((Activity) this)).getShowBranchV2()) {
            return (BaseFragment) DirectDepositBranchV2Fragment.INSTANCE.newInstance((Parcelable) new DirectDepositBranchV2Fragment.Args(((LegacyIntentKey.DirectDepositSetup) companion.getExtras((Activity) this)).getShowEarlyPayHook(), ((LegacyIntentKey.DirectDepositSetup) companion.getExtras((Activity) this)).getFromDDOnboardingFlow()));
        }
        return DirectDepositBranchFragment.INSTANCE.newInstance();
    }

    @Override // com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment.Callbacks
    public void onSplashPrimaryButtonClicked(DirectDepositSplashViewState3 primaryButtonState) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        EventLogger eventLogger = getEventLogger();
        Screen screen = new Screen(Screen.Name.DD_INTRO, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[primaryButtonState.ordinal()];
        if (i == 1) {
            action = UserInteractionEventData.Action.VIEW_DD_SETUP_CHOICE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            action = UserInteractionEventData.Action.SET_UP_DIRECT_DEPOSIT;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, null, false, 56, null);
        int i2 = iArr[primaryButtonState.ordinal()];
        if (i2 != 1 && i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        replaceFragment(getStartFragment());
    }

    @Override // com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment.Callbacks
    public void onSplashSecondaryButtonClicked(DirectDepositSplashViewState4 secondaryButtonState) {
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        if (WhenMappings.$EnumSwitchMapping$1[secondaryButtonState.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.ALREADY_SET_UP_DIRECT_DEPOSIT, new Screen(Screen.Name.DD_INTRO, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 56, null);
        Activities.setSuccessfulDirectDepositResult(this, DirectDepositSource.ALREADY_SET_UP_DD);
        replaceFragment(EarlyPaySignupFragment.INSTANCE.newInstance((Parcelable) new EarlyPaySignupFragment.Args(false)));
    }

    @Override // com.robinhood.android.directdeposit.ui.intro.DirectDepositBranchFragment.Callbacks
    public void onSeeAccountInfo() {
        setDropOffSurvey(null);
        replaceFragment(AccountInfoFragment.INSTANCE.newInstance(((LegacyIntentKey.DirectDepositSetup) INSTANCE.getExtras((Activity) this)).getFromDDOnboardingFlow()));
    }

    @Override // com.robinhood.android.directdeposit.ui.intro.DirectDepositBranchFragment.Callbacks, com.robinhood.android.directdeposit.ui.intro.DirectDepositBranchV2Fragment.Callbacks, com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoFragment.Callbacks
    public void onGetPreFilledForm() {
        setDropOffSurvey(Survey.DIRECT_DEPOSIT_PREFILLED_INTRO_DROP_OFF);
        replaceFragment(PreFilledFormFlowFragment.INSTANCE.newInstance((Parcelable) new PreFilledFormFlowFragment.Args(((LegacyIntentKey.DirectDepositSetup) INSTANCE.getExtras((Activity) this)).getFromDDOnboardingFlow())));
    }

    @Override // com.robinhood.android.directdeposit.ui.intro.DirectDepositBranchV2Fragment.Callbacks
    public void onSetUpDirectDeposit(DirectDepositSource directDepositSource) {
        Intrinsics.checkNotNullParameter(directDepositSource, "directDepositSource");
        setCompletedDirectDepositSource(directDepositSource);
    }

    @Override // com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Callbacks
    public void onDirectDepositCompletedForPaycheckRecurringInvestment() {
        finish();
    }

    @Override // com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoFragment.Callbacks
    public void onDirectDepositCompleted(DirectDepositSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        setCompletedDirectDepositSource(source);
        finish();
    }

    @Override // com.robinhood.android.earlypay.lib.signup.ui.EarlyPaySignupFragment.Callbacks
    public void onEnrollmentSuccess() {
        replaceFragment(EarlyPayConfirmationFragment.INSTANCE.newInstance((Parcelable) new EarlyPayConfirmationFragment.Args(EarlyPayConfirmationType.STANDARD)));
    }

    @Override // com.robinhood.android.earlypay.lib.signup.ui.EarlyPaySignupFragment.Callbacks
    public void onEnrollmentSkipped() {
        finish();
    }

    @Override // com.robinhood.android.earlypay.lib.confirmation.ui.EarlyPayConfirmationFragment.Callbacks
    public void onEnrollmentConfirmed() {
        finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentFragment() instanceof DirectDepositSplashFragment) {
            Survey dropOffSurvey = getDropOffSurvey();
            if (getCompletedDirectDepositSource() == null && dropOffSurvey != null && getState().getHasRhyAccount()) {
                getUserLeapManager().setPendingSurvey(dropOffSurvey);
            }
        }
        super.onBackPressed();
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormFlowFragment.Callbacks
    public void onPrefilledFormFlowCompleted() {
        onDirectDepositCompleted(DirectDepositSource.MANUAL_FORM_HR);
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormFlowFragment.Callbacks
    public void onPrefilledFormFlowCancelled(Survey dropOffSurvey) {
        setDropOffSurvey(dropOffSurvey);
    }

    /* compiled from: DirectDepositSetupActivity.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/DirectDepositSetupActivity$State;", "Landroid/os/Parcelable;", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "Lcom/robinhood/models/ui/DirectDepositAmount;", "hasRhyAccount", "", "<init>", "(Lcom/robinhood/models/ui/DirectDepositAmount;Z)V", "getDepositAmount", "()Lcom/robinhood/models/ui/DirectDepositAmount;", "getHasRhyAccount", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        private final DirectDepositAmount depositAmount;
        private final boolean hasRhyAccount;

        /* compiled from: DirectDepositSetupActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State((DirectDepositAmount) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ State copy$default(State state, DirectDepositAmount directDepositAmount, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                directDepositAmount = state.depositAmount;
            }
            if ((i & 2) != 0) {
                z = state.hasRhyAccount;
            }
            return state.copy(directDepositAmount, z);
        }

        /* renamed from: component1, reason: from getter */
        public final DirectDepositAmount getDepositAmount() {
            return this.depositAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasRhyAccount() {
            return this.hasRhyAccount;
        }

        public final State copy(DirectDepositAmount depositAmount, boolean hasRhyAccount) {
            Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
            return new State(depositAmount, hasRhyAccount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.depositAmount, state.depositAmount) && this.hasRhyAccount == state.hasRhyAccount;
        }

        public int hashCode() {
            return (this.depositAmount.hashCode() * 31) + Boolean.hashCode(this.hasRhyAccount);
        }

        public String toString() {
            return "State(depositAmount=" + this.depositAmount + ", hasRhyAccount=" + this.hasRhyAccount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.depositAmount, flags);
            dest.writeInt(this.hasRhyAccount ? 1 : 0);
        }

        public State(DirectDepositAmount depositAmount, boolean z) {
            Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
            this.depositAmount = depositAmount;
            this.hasRhyAccount = z;
        }

        public /* synthetic */ State(DirectDepositAmount directDepositAmount, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DirectDepositAmount.Unsupported.INSTANCE : directDepositAmount, (i & 2) != 0 ? false : z);
        }

        public final DirectDepositAmount getDepositAmount() {
            return this.depositAmount;
        }

        public final boolean getHasRhyAccount() {
            return this.hasRhyAccount;
        }
    }

    /* compiled from: DirectDepositSetupActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/DirectDepositSetupActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/directdeposit/ui/DirectDepositSetupActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositSetup;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DirectDepositSetupActivity, LegacyIntentKey.DirectDepositSetup> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.DirectDepositSetup getExtras(DirectDepositSetupActivity directDepositSetupActivity) {
            return (LegacyIntentKey.DirectDepositSetup) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, directDepositSetupActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DirectDepositSetup directDepositSetup) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, directDepositSetup);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.DirectDepositSetup directDepositSetup) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, directDepositSetup);
        }
    }
}
