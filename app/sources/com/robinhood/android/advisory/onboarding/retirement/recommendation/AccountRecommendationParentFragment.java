package com.robinhood.android.advisory.onboarding.retirement.recommendation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationParentFragment;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.intro.AccountRecommendationIntroFragment;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsFragment;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionFragment;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear.AccountRecommendationTaxYearFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationIntroViewModel;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: AccountRecommendationParentFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u000267B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0011H\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u001eH\u0016J\b\u0010/\u001a\u00020\u001eH\u0002J\t\u00100\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "callbacks", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "", "taxYearContext", "getTaxYearContext", "()Ljava/lang/String;", "setTaxYearContext", "(Ljava/lang/String;)V", "taxYearContext$delegate", "Lkotlin/properties/ReadWriteProperty;", "questionnaireLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onGetAccountRecommendationClicked", "viewModel", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$IntroViewModel;", "onAccountRecommendationDeclined", "intro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "onMultiYearContinueClicked", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$MultiYearViewModel;", "onTaxYearSelected", "context", "onAccountTypeDecided", "decision", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationDecision;", "onIneligibleDoneClicked", "showResultsScreen", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AccountRecommendationParentFragment extends BaseFragment implements RegionGated, AccountRecommendationCallbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final ActivityResultLauncher<Intent> questionnaireLauncher;

    /* renamed from: taxYearContext$delegate, reason: from kotlin metadata */
    private final Interfaces3 taxYearContext;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountRecommendationParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationParentFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AccountRecommendationParentFragment.class, "taxYearContext", "getTaxYearContext()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AccountRecommendationParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationParentFragment$Callbacks;", "", "onAccountRecommendationDeclined", "", "intro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "onAccountRecommendationDecided", "decision", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationDecision;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountRecommendationDecided(AccountRecommendationDecision decision);

        void onAccountRecommendationDeclined(RetirementOnboardingIntro.AccountSelection intro);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public AccountRecommendationParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE, AdvisoryRegionGate.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationParentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AccountRecommendationParentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.taxYearContext = BindSavedState2.savedString(this).provideDelegate(this, $$delegatedProperties[1]);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationParentFragment$questionnaireLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.showResultsScreen();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.questionnaireLauncher = activityResultLauncherRegisterForActivityResult;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final String getTaxYearContext() {
        return (String) this.taxYearContext.getValue(this, $$delegatedProperties[1]);
    }

    private final void setTaxYearContext(String str) {
        this.taxYearContext.setValue(this, $$delegatedProperties[1], str);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, AccountRecommendationSelectionFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationCallbacks
    public void onGetAccountRecommendationClicked(ApiAccountTypeRecommendationIntroViewModel.IntroViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        replaceFragment(AccountRecommendationIntroFragment.INSTANCE.newInstance((Parcelable) viewModel));
    }

    @Override // com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationCallbacks
    public void onAccountRecommendationDeclined(RetirementOnboardingIntro.AccountSelection intro) {
        Intrinsics.checkNotNullParameter(intro, "intro");
        getCallbacks().onAccountRecommendationDeclined(intro);
    }

    @Override // com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationCallbacks
    public void onMultiYearContinueClicked(ApiAccountTypeRecommendationIntroViewModel.MultiYearViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        replaceFragment(AccountRecommendationTaxYearFragment.INSTANCE.newInstance((Parcelable) viewModel));
    }

    @Override // com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationCallbacks
    public void onTaxYearSelected(String context) {
        Intrinsics.checkNotNullParameter(context, "context");
        setTaxYearContext(context);
        ActivityResultLauncher<Intent> activityResultLauncher = this.questionnaireLauncher;
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new Questionnaire(true, context, null, null, null, null, false, true, false, false, true, null, null, false, false, false, false, false, null, null, 1047416, null), null, false, 12, null));
    }

    @Override // com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationCallbacks
    public void onAccountTypeDecided(AccountRecommendationDecision decision) {
        Intrinsics.checkNotNullParameter(decision, "decision");
        getCallbacks().onAccountRecommendationDecided(decision);
    }

    @Override // com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationCallbacks
    public void onIneligibleDoneClicked() {
        BaseFragment.popEntireFragmentBackstack$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showResultsScreen() {
        String taxYearContext = getTaxYearContext();
        if (taxYearContext != null) {
            replaceFragment(AccountRecommendationResultsFragment.INSTANCE.newInstance((Parcelable) new AccountRecommendationResultsFragment.Args(taxYearContext)));
        }
    }

    /* compiled from: AccountRecommendationParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationParentFragment;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<AccountRecommendationParentFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((AccountRecommendationParentFragment) fragment);
        }

        public Void getArgs(AccountRecommendationParentFragment accountRecommendationParentFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, accountRecommendationParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public AccountRecommendationParentFragment newInstance() {
            return (AccountRecommendationParentFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public AccountRecommendationParentFragment newInstance(Void r1) {
            return (AccountRecommendationParentFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
