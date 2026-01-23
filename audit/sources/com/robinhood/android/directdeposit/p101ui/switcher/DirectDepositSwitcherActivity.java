package com.robinhood.android.directdeposit.p101ui.switcher;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.directdeposit.Activities;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashFragment;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState3;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState4;
import com.robinhood.android.directdeposit.p101ui.switcher.DirectDepositSwitcherConfirmationFragment;
import com.robinhood.android.directdeposit.p101ui.switcher.DirectDepositSwitcherEarlyPayConfirmationFragment;
import com.robinhood.android.directdeposit.p101ui.switcher.atomic.AtomicTransactFragment;
import com.robinhood.android.earlypay.lib.confirmation.p111ui.EarlyPayConfirmationFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.p226ui.DirectDepositPaycheckRecurringInvestmentsConfirmationFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.Serializable;
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

/* compiled from: DirectDepositSwitcherActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001SB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020-H\u0016J\"\u00101\u001a\u00020-2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000106H\u0014J\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020<H\u0016J\u0012\u0010=\u001a\u00020-2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020\u001dH\u0016J\u0010\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020-H\u0016J\b\u0010F\u001a\u00020-H\u0016J\b\u0010G\u001a\u00020-H\u0016J\b\u0010H\u001a\u00020-H\u0016J\b\u0010I\u001a\u00020-H\u0016J\u001a\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u0002032\b\u0010L\u001a\u0004\u0018\u00010/H\u0016J\u001a\u0010M\u001a\u00020%2\u0006\u0010K\u001a\u0002032\b\u0010L\u001a\u0004\u0018\u00010/H\u0016J\u0018\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u00020P2\u0006\u0010>\u001a\u00020?H\u0002J\u0014\u0010Q\u001a\u0004\u0018\u00010?2\b\u0010L\u001a\u0004\u0018\u00010/H\u0002J\b\u0010R\u001a\u00020-H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010$\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherEarlyPayConfirmationFragment$Callbacks;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$Callbacks;", "Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "getRhyAccountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "setRhyAccountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "<set-?>", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "completedDirectDepositSource", "getCompletedDirectDepositSource", "()Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "setCompletedDirectDepositSource", "(Lcom/robinhood/android/common/directdeposit/DirectDepositSource;)V", "completedDirectDepositSource$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "hasRhyAccount", "getHasRhyAccount", "()Z", "setHasRhyAccount", "(Z)V", "hasRhyAccount$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onSplashPrimaryButtonClicked", "primaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewPrimaryButtonState;", "onSplashSecondaryButtonClicked", "secondaryButtonState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewSecondaryButtonState;", "onCloseAtomicTransact", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onCompleteAtomicTransact", "directDepositSource", "onAtomicInitializationError", "throwable", "", "onExitSwitcher", "onDirectDepositSwitchComplete", "onDirectDepositCompletedForPaycheckRecurringInvestment", "onEnrollmentConfirmed", "onEarlyPayEnrollmentComplete", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "logExitDialogInteraction", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "getTransactExitScreen", "startManualSetup", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositSwitcherActivity extends BaseActivity implements DirectDepositSplashFragment.Callbacks, DirectDepositSwitcherConfirmationFragment.Callbacks, DirectDepositSwitcherEarlyPayConfirmationFragment.Callbacks, DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Callbacks, EarlyPayConfirmationFragment.Callbacks, AtomicTransactFragment.Callbacks {
    private static final String ARG_TRANSACT_SCREEN = "transactScreen";
    private static final int MANUAL_REQUEST_CODE = 24;

    /* renamed from: completedDirectDepositSource$delegate, reason: from kotlin metadata */
    private final Interfaces3 completedDirectDepositSource;
    public EventLogger eventLogger;

    /* renamed from: hasRhyAccount$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasRhyAccount;
    public RhyAccountStore rhyAccountStore;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DirectDepositSwitcherActivity.class, "completedDirectDepositSource", "getCompletedDirectDepositSource()Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DirectDepositSwitcherActivity.class, "hasRhyAccount", "getHasRhyAccount()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectDepositSwitcherActivity.kt */
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

    public DirectDepositSwitcherActivity() {
        super(C11048R.layout.activity_fragment_container);
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.completedDirectDepositSource = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[0]);
        this.hasRhyAccount = BindSavedState2.savedBoolean(this, false).provideDelegate(this, kPropertyArr[1]);
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

    private final DirectDepositSource getCompletedDirectDepositSource() {
        return (DirectDepositSource) this.completedDirectDepositSource.getValue(this, $$delegatedProperties[0]);
    }

    private final void setCompletedDirectDepositSource(DirectDepositSource directDepositSource) {
        this.completedDirectDepositSource.setValue(this, $$delegatedProperties[0], directDepositSource);
    }

    private final boolean getHasRhyAccount() {
        return ((Boolean) this.hasRhyAccount.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setHasRhyAccount(boolean z) {
        this.hasRhyAccount.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Fragment fragmentNewInstance;
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            int i = C14044R.id.fragment_container;
            Companion companion = INSTANCE;
            if (((LegacyIntentKey.DirectDepositSwitcher) companion.getExtras((Activity) this)).getShowSplash()) {
                fragmentNewInstance = (BaseFragment) DirectDepositSplashFragment.INSTANCE.newInstance((Parcelable) new DirectDepositSplashFragment.Args(((LegacyIntentKey.DirectDepositSwitcher) companion.getExtras((Activity) this)).getFromRhyMigration()));
            } else {
                fragmentNewInstance = AtomicTransactFragment.INSTANCE.newInstance();
            }
            setFragment(i, fragmentNewInstance);
        }
        LifecycleHost.DefaultImpls.bind$default(this, getRhyAccountStore().streamSpendingAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSwitcherActivity.onCreate$lambda$0(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(DirectDepositSwitcherActivity directDepositSwitcherActivity, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        directDepositSwitcherActivity.setHasRhyAccount(((RhyAccount) optional.component1()) != null);
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 24) {
            setResult(resultCode, data);
            finish();
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
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
            action = UserInteractionEventData.Action.VIEW_DD_SWITCHER_SEARCH_COMPANY;
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
        replaceFragment(AtomicTransactFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashFragment.Callbacks
    public void onSplashSecondaryButtonClicked(DirectDepositSplashViewState4 secondaryButtonState) {
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        if (WhenMappings.$EnumSwitchMapping$1[secondaryButtonState.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.ALREADY_SET_UP_DIRECT_DEPOSIT, new Screen(Screen.Name.DD_INTRO, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 56, null);
        onCompleteAtomicTransact(DirectDepositSource.ALREADY_SET_UP_DD);
    }

    @Override // com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactFragment.Callbacks
    public void onCloseAtomicTransact(Screen screen) {
        if (((LegacyIntentKey.DirectDepositSwitcher) INSTANCE.getExtras((Activity) this)).getShowExitConfirmation()) {
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(this).setId(C14044R.id.dialog_direct_deposit_switcher_exit_confirmation).setMessage(C14044R.string.direct_deposit_switcher_exit_message, new Object[0]).setPositiveButton(C11048R.string.general_label_yes, new Object[0]).setNegativeButton(C14044R.string.direct_deposit_switcher_exit_negative, new Object[0]);
            Bundle bundle = new Bundle();
            bundle.putSerializable(ARG_TRANSACT_SCREEN, screen);
            RhDialogFragment.Builder passthroughArgs = negativeButton.setPassthroughArgs(bundle);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, "directDepositSwitcherConfirmExit", false, 4, null);
            return;
        }
        finish();
    }

    @Override // com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactFragment.Callbacks
    public void onCompleteAtomicTransact(DirectDepositSource directDepositSource) {
        Intrinsics.checkNotNullParameter(directDepositSource, "directDepositSource");
        setCompletedDirectDepositSource(directDepositSource);
        Companion companion = INSTANCE;
        if (((LegacyIntentKey.DirectDepositSwitcher) companion.getExtras((Activity) this)).getShowConfirmationScreen()) {
            replaceFragment(DirectDepositSwitcherConfirmationFragment.INSTANCE.newInstance((Parcelable) new DirectDepositSwitcherConfirmationFragment.Args(((LegacyIntentKey.DirectDepositSwitcher) companion.getExtras((Activity) this)).getShowEarlyPayHook())));
        } else {
            finish();
        }
    }

    @Override // com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactFragment.Callbacks
    public void onAtomicInitializationError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, throwable, false, null, 4, null);
        startManualSetup();
    }

    @Override // com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationFragment.Callbacks
    public void onExitSwitcher() {
        DirectDepositSwitcherActivities.logDdSwitcherCompletion(this);
        setCompletedDirectDepositSource(DirectDepositSource.SWITCHER);
        finish();
    }

    @Override // com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationFragment.Callbacks, com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherEarlyPayConfirmationFragment.Callbacks
    public void onDirectDepositSwitchComplete() {
        DirectDepositSwitcherActivities.logDdSwitcherCompletion(this);
        setCompletedDirectDepositSource(DirectDepositSource.SWITCHER);
        finish();
    }

    @Override // com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Callbacks
    public void onDirectDepositCompletedForPaycheckRecurringInvestment() {
        finish();
    }

    @Override // com.robinhood.android.earlypay.lib.confirmation.ui.EarlyPayConfirmationFragment.Callbacks
    public void onEnrollmentConfirmed() {
        Activities.finishWithSuccessfulDirectDeposits(this, DirectDepositSource.SWITCHER);
    }

    @Override // com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationFragment.Callbacks
    public void onEarlyPayEnrollmentComplete() {
        replaceFragment(DirectDepositSwitcherEarlyPayConfirmationFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14044R.id.dialog_direct_deposit_switcher_exit_confirmation) {
            Screen transactExitScreen = getTransactExitScreen(passthroughArgs);
            if (transactExitScreen != null) {
                logExitDialogInteraction(UserInteractionEventData.Action.APPROVE, transactExitScreen);
            }
            startManualSetup();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14044R.id.dialog_direct_deposit_switcher_exit_confirmation) {
            Screen transactExitScreen = getTransactExitScreen(passthroughArgs);
            if (transactExitScreen != null) {
                logExitDialogInteraction(UserInteractionEventData.Action.DISMISS, transactExitScreen);
                if (transactExitScreen.getName() == Screen.Name.DD_SWITCHER_SEARCH_COMPANY && getHasRhyAccount()) {
                    getUserLeapManager().setPendingSurvey(Survey.DIRECT_DEPOSIT_SWITCHER_SEARCH_DROP_OFF);
                }
            }
            finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    private final void logExitDialogInteraction(UserInteractionEventData.Action action, Screen screen) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), action, screen, new Component(Component.ComponentType.DD_MANUAL_SETUP_ALERT, null, null, 6, null), null, null, false, 56, null);
    }

    private final Screen getTransactExitScreen(Bundle passthroughArgs) {
        Serializable serializable = passthroughArgs != null ? passthroughArgs.getSerializable(ARG_TRANSACT_SCREEN) : null;
        Screen screen = serializable instanceof Screen ? (Screen) serializable : null;
        if (screen == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new NullPointerException("Expected non-null ARG_TRANSACT_SCREEN"), false, null, 6, null);
        }
        return screen;
    }

    private final void startManualSetup() {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new LegacyIntentKey.DirectDepositSetup(false, false, false, ((LegacyIntentKey.DirectDepositSwitcher) INSTANCE.getExtras((Activity) this)).getFromDDOnboardingFlow(), false, 6, null), 24, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    /* compiled from: DirectDepositSwitcherActivity.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositSwitcher;", "<init>", "()V", "ARG_TRANSACT_SCREEN", "", "MANUAL_REQUEST_CODE", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DirectDepositSwitcherActivity, LegacyIntentKey.DirectDepositSwitcher> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.DirectDepositSwitcher getExtras(DirectDepositSwitcherActivity directDepositSwitcherActivity) {
            return (LegacyIntentKey.DirectDepositSwitcher) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, directDepositSwitcherActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DirectDepositSwitcher directDepositSwitcher) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, directDepositSwitcher);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.DirectDepositSwitcher directDepositSwitcher) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, directDepositSwitcher);
        }
    }
}
