package com.robinhood.feature.sweep.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.EventLoggedRhDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.databinding.ActivityFragmentContainerWithRdsLoadingViewBinding;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayFragment;
import com.robinhood.android.lib.sweep.SweepOnboardingEventLogger;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.AccountOverviewLaunchType;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.sweep.contracts.SweepOnboardingContract;
import com.robinhood.android.sweep.contracts.SweepOnboardingIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.feature.sweep.onboarding.SweepOnboardingErrorFragment;
import com.robinhood.feature.sweep.onboarding.SweepOnboardingViewState;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingEnrollmentFragment;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldFragment;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSplashFragment;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSplashHandler;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSweepAgreementFragment;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeFragment;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: SweepOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001RB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010;\u001a\u00020<H\u0016J\u0012\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\b\u0010@\u001a\u00020<H\u0014J\b\u0010A\u001a\u00020<H\u0014J\u0010\u0010B\u001a\u00020<2\u0006\u0010C\u001a\u00020\"H\u0002J\u0010\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020<H\u0016J\b\u0010H\u001a\u00020<H\u0016J\b\u0010I\u001a\u00020<H\u0016J\u0010\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020\u000bH\u0016J\u0010\u0010L\u001a\u00020<2\u0006\u0010M\u001a\u00020\u001aH\u0016J\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0016J\b\u0010Q\u001a\u00020<H\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006S"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSplashFragment$Callbacks;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingLearnMoreGoldFragment$Callbacks;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingAgreementsFragment$Callbacks;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingSweepAgreementFragment$Callbacks;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingEnrollmentFragment$Callbacks;", "<init>", "()V", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "<set-?>", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow;", "sweepFlow", "getSweepFlow", "()Lcom/robinhood/models/api/bonfire/ApiSweepFlow;", "setSweepFlow", "(Lcom/robinhood/models/api/bonfire/ApiSweepFlow;)V", "sweepFlow$delegate", "Lkotlin/properties/ReadWriteProperty;", "goldInterestRate", "Ljava/math/BigDecimal;", "nonGoldInterestRate", "", "accountNumber", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "accountNumber$delegate", "savedViewState", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingViewState;", "binding", "Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "getBinding", "()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "getSweepOnboardingEventLogger", "()Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "setSweepOnboardingEventLogger", "(Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDestroy", "handleState", "viewState", "onDialogDismissed", "id", "", "onContinueClicked", "onLearnMoreGoldContinue", "onAgreementsAccepted", "onEnrollSuccess", "isWithGold", "onEnrollIncomplete", "displayMessage", "onDisplayAgreement", "agreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "onSweepAgreementAccepted", "Companion", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class SweepOnboardingActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, SweepOnboardingSplashFragment.Callbacks, SweepOnboardingLearnMoreGoldFragment.Callbacks, SweepOnboardingAgreementsFragment.Callbacks, SweepOnboardingSweepAgreementFragment.Callbacks, SweepOnboardingEnrollmentFragment.Callbacks {

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Interfaces3 accountNumber;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean excludeFromAnalyticsLogging;
    private BigDecimal goldInterestRate;
    private BigDecimal nonGoldInterestRate;
    private SweepOnboardingViewState savedViewState;

    /* renamed from: sweepFlow$delegate, reason: from kotlin metadata */
    private final Interfaces3 sweepFlow;
    public SweepOnboardingEventLogger sweepOnboardingEventLogger;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SweepOnboardingActivity.class, "sweepFlow", "getSweepFlow()Lcom/robinhood/models/api/bonfire/ApiSweepFlow;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SweepOnboardingActivity.class, "accountNumber", "getAccountNumber()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(SweepOnboardingActivity.class, "binding", "getBinding()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SweepOnboardingActivity() {
        super(C11839R.layout.activity_fragment_container_with_rds_loading_view);
        this.excludeFromAnalyticsLogging = true;
        Interfaces interfacesSavedParcelable = BindSavedState2.savedParcelable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.sweepFlow = (Interfaces3) interfacesSavedParcelable.provideDelegate(this, kPropertyArr[0]);
        this.accountNumber = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[1]);
        this.binding = ViewBinding5.viewBinding(this, SweepOnboardingActivity2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, SweepOnboardingDuxo.class);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    private final ApiSweepFlow getSweepFlow() {
        return (ApiSweepFlow) this.sweepFlow.getValue(this, $$delegatedProperties[0]);
    }

    private final void setSweepFlow(ApiSweepFlow apiSweepFlow) {
        this.sweepFlow.setValue(this, $$delegatedProperties[0], apiSweepFlow);
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue(this, $$delegatedProperties[1]);
    }

    private final void setAccountNumber(String str) {
        this.accountNumber.setValue(this, $$delegatedProperties[1], str);
    }

    private final ActivityFragmentContainerWithRdsLoadingViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[2]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerWithRdsLoadingViewBinding) value;
    }

    private final SweepOnboardingDuxo getDuxo() {
        return (SweepOnboardingDuxo) this.duxo.getValue();
    }

    public final SweepOnboardingEventLogger getSweepOnboardingEventLogger() {
        SweepOnboardingEventLogger sweepOnboardingEventLogger = this.sweepOnboardingEventLogger;
        if (sweepOnboardingEventLogger != null) {
            return sweepOnboardingEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sweepOnboardingEventLogger");
        return null;
    }

    public final void setSweepOnboardingEventLogger(SweepOnboardingEventLogger sweepOnboardingEventLogger) {
        Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "<set-?>");
        this.sweepOnboardingEventLogger = sweepOnboardingEventLogger;
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentFragment() instanceof SweepOnboardingSplashFragment) {
            getUserLeapManager().setPendingSurvey(Survey.SWEEP_ONBOARDING_DROP_OFF);
            finish();
        }
        super.onBackPressed();
        if (getDuxo().getStates().blockingFirst(SweepOnboardingViewState.Loading.INSTANCE) instanceof SweepOnboardingViewState.AlreadyEnrolled) {
            NavigationActivityResultContract3.finishWithResult(this, new SweepOnboardingContract.Result.Completed(true));
        } else if (getSweepFlow() == null) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSweepOnboardingEventLogger().logFlowAppear(((SweepOnboardingIntentKey) INSTANCE.getExtras((Activity) this)).getSourceScreenIdentifier());
        NavigationActivityResultContract3.setResult(this, SweepOnboardingContract.Result.Canceled.INSTANCE);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepOnboardingActivity.onCreate$lambda$0(this.f$0, (SweepOnboardingViewState) obj);
            }
        });
        ScarletManager2.getScarletManager(this).putOverlay(AchromaticOverlay.INSTANCE, Boolean.FALSE);
        ShimmerLoadingView rdsLoadingView = getBinding().rdsLoadingView;
        Intrinsics.checkNotNullExpressionValue(rdsLoadingView, "rdsLoadingView");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(rdsLoadingView, InsetSides.INSTANCE.m26684getVerticalXedK2Rk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(SweepOnboardingActivity sweepOnboardingActivity, SweepOnboardingViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (sweepOnboardingActivity.isStateSaved()) {
            sweepOnboardingActivity.savedViewState = it;
        } else {
            sweepOnboardingActivity.handleState(it);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        SweepOnboardingViewState sweepOnboardingViewState = this.savedViewState;
        if (sweepOnboardingViewState != null) {
            handleState(sweepOnboardingViewState);
            this.savedViewState = null;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        getSweepOnboardingEventLogger().logFlowDisappear();
        super.onDestroy();
    }

    private final void handleState(SweepOnboardingViewState viewState) {
        int i;
        if (viewState instanceof SweepOnboardingViewState.Loading) {
            getBinding().rdsLoadingView.show();
            return;
        }
        if (viewState instanceof SweepOnboardingViewState.Error) {
            RhDialogFragment.Builder cancelable = RhDialogFragment.INSTANCE.create(this).setId(C11048R.id.dialog_id_generic_error).setTitle(C33184R.string.sweep_onboarding_error_something_went_wrong, new Object[0]).setMessage(C33184R.string.sweep_onboarding_error_description, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setCancelable(false);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(cancelable, supportFragmentManager, "loadSweepOnboardingError", false, 4, null);
            return;
        }
        if (viewState instanceof SweepOnboardingViewState.Loaded) {
            SweepOnboardingViewState.Loaded loaded = (SweepOnboardingViewState.Loaded) viewState;
            setSweepFlow(loaded.getSweepFlow());
            getSweepOnboardingEventLogger().setGoldContext(loaded.getSweepFlow().isGold());
            this.goldInterestRate = loaded.getGoldInterestRate();
            this.nonGoldInterestRate = loaded.getNonGoldInterestRate();
            setAccountNumber(loaded.getAccountNumber());
            replaceFragmentWithoutBackStack(SweepOnboardingSplashFragment.INSTANCE.newInstance((Parcelable) new SweepOnboardingSplashFragment.Args(loaded.getSweepFlow().getSweepOnboarding(), loaded.getSweepFlow().isGold(), ((SweepOnboardingIntentKey) INSTANCE.getExtras((Activity) this)).getCanSkip())));
            getBinding().rdsLoadingView.hide();
            if (loaded.getSweepFlow().isGold()) {
                ScarletManager scarletManager = ScarletManager2.getScarletManager(this);
                int priority = AchromaticOverlay.INSTANCE.getPriority();
                Boolean bool = Boolean.FALSE;
                scarletManager.removeOverlay(priority, bool);
                ScarletManager2.getScarletManager(this).putOverlay(GoldOverlay.INSTANCE, bool);
                return;
            }
            return;
        }
        if (viewState instanceof SweepOnboardingViewState.AlreadyEnrolled) {
            if (((SweepOnboardingViewState.AlreadyEnrolled) viewState).isMcwEnabled()) {
                i = C33184R.string.mcw_cash_sweep_already_enabled_dialog_message;
            } else {
                i = C33184R.string.cash_sweep_already_enabled_dialog_message;
            }
            RhDialogFragment.Builder message = EventLoggedRhDialogFragment.INSTANCE.create(this).setComponentType(Component.ComponentType.CASH_SWEEP_ALREADY_ENABLED_DIALOG).setId(C33184R.id.dialog_id_cash_sweep_already_enrolled).setTitle(C33184R.string.cash_sweep_already_enabled_dialog_title, new Object[0]).setMessage(getString(i));
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, supportFragmentManager2, "cash_sweep_already_enrolled_dialog", false, 4, null);
            return;
        }
        if (!(viewState instanceof SweepOnboardingViewState.Paused)) {
            throw new NoWhenBranchMatchedException();
        }
        Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new LegacyFragmentKey.AccountOverview(AccountOverviewLaunchType.SWEEP, getAccountNumber()), false, false, false, null, false, true, false, false, false, null, false, 8052, null);
        finish();
        startActivity(intentCreateIntentForFragment$default);
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        } else if (id == C33184R.id.dialog_id_cash_sweep_already_enrolled) {
            NavigationActivityResultContract3.finishWithResult(this, new SweepOnboardingContract.Result.Completed(true));
        }
    }

    @Override // com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSplashFragment.Callbacks
    public void onContinueClicked() {
        replaceFragment(SweepOnboardingSplashHandler.INSTANCE.getNextFragmentAfterSplash(getSweepFlow(), getAccountNumber()));
    }

    @Override // com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldFragment.Callbacks
    public void onLearnMoreGoldContinue() {
        SweepOnboardingAgreementsFragment.Companion companion = SweepOnboardingAgreementsFragment.INSTANCE;
        ApiSweepFlow sweepFlow = getSweepFlow();
        if (sweepFlow != null) {
            replaceFragment(companion.newInstance((Parcelable) new SweepOnboardingAgreementsFragment.Args(sweepFlow.getGoldCombinedAgreements())));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment.Callbacks
    public void onAgreementsAccepted() {
        SweepOnboardingEnrollmentFragment.Companion companion = SweepOnboardingEnrollmentFragment.INSTANCE;
        String accountNumber = getAccountNumber();
        if (accountNumber != null) {
            replaceFragment(companion.newInstance((Parcelable) new SweepOnboardingEnrollmentFragment.Args(true, accountNumber)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingEnrollmentFragment.Callbacks
    public void onEnrollSuccess(boolean isWithGold) {
        NavigationActivityResultContract3.setResult(this, new SweepOnboardingContract.Result.Completed(true));
        SweepOnboardingWelcomeFragment.Companion companion = SweepOnboardingWelcomeFragment.INSTANCE;
        ApiSweepFlow sweepFlow = getSweepFlow();
        if (sweepFlow == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ApiSweepFlow.SweepWelcome sweepWelcome = sweepFlow.getSweepWelcome();
        ApiSweepFlow sweepFlow2 = getSweepFlow();
        if (sweepFlow2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold = sweepFlow2.getSweepWelcomeGold();
        ApiSweepFlow sweepFlow3 = getSweepFlow();
        if (sweepFlow3 != null) {
            replaceFragmentWithoutAnimation(companion.newInstance((Parcelable) new SweepOnboardingWelcomeFragment.Args(sweepWelcome, sweepWelcomeGold, sweepFlow3.isGold(), isWithGold)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingEnrollmentFragment.Callbacks
    public void onEnrollIncomplete(String displayMessage) {
        Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
        replaceFragment(SweepOnboardingErrorFragment.INSTANCE.newInstance((Parcelable) new SweepOnboardingErrorFragment.Args(displayMessage)));
    }

    @Override // com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment.Callbacks
    public void onDisplayAgreement(ApiGoldSweepAgreement agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        replaceFragment(GoldSweepAgreementDisplayFragment.INSTANCE.newInstance((Parcelable) new GoldSweepAgreementDisplayFragment.Args(agreement.getAgreementType(), agreement.getTitle(), new Screen(Screen.Name.SWEEP_ONBOARDING_AGREEMENTS_LIST, null, null, null, 14, null), null, 8, null)));
    }

    @Override // com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSweepAgreementFragment.Callbacks
    public void onSweepAgreementAccepted() {
        SweepOnboardingEnrollmentFragment.Companion companion = SweepOnboardingEnrollmentFragment.INSTANCE;
        String accountNumber = getAccountNumber();
        if (accountNumber != null) {
            replaceFragment(companion.newInstance((Parcelable) new SweepOnboardingEnrollmentFragment.Args(false, accountNumber)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* compiled from: SweepOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingActivity;", "Lcom/robinhood/android/sweep/contracts/SweepOnboardingIntentKey;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<SweepOnboardingActivity, SweepOnboardingIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public SweepOnboardingIntentKey getExtras(SweepOnboardingActivity sweepOnboardingActivity) {
            return (SweepOnboardingIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, sweepOnboardingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, SweepOnboardingIntentKey sweepOnboardingIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, sweepOnboardingIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, SweepOnboardingIntentKey sweepOnboardingIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, sweepOnboardingIntentKey);
        }
    }
}
