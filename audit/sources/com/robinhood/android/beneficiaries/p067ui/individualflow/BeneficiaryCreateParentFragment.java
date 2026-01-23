package com.robinhood.android.beneficiaries.p067ui.individualflow;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.beneficiaries.contracts.BeneficiariesFragmentKey;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySplashViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BeneficiaryCreateLoadConfigurationFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BeneficiaryCreateStepsFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.agreement.BeneficiaryCreateAgreementFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.intro.BeneficiaryValuePropFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
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

/* compiled from: BeneficiaryCreateParentFragment.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u000234B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010(\u001a\u00020\u00192\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*H\u0016J\b\u0010,\u001a\u00020\u0019H\u0016J\t\u0010-\u001a\u00020!H\u0096\u0001R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateLoadConfigurationFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/agreement/BeneficiaryCreateAgreementFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/intro/BeneficiaryValuePropFragment$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "setConfiguration", "(Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;)V", "configuration$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onConfigurationLoadSuccessful", "onConfigurationLoadFailed", "onValuePropCompleted", "showAgreementIfNeeded", "shouldClearBackstack", "", "onAgreementCompleted", "agreement", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "currentAgreementIndex", "", "navigateToSteps", "onBeneficiaryFlowStepsCompleted", "postSubmitAlert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onBeneficiaryFlowStepsAborted", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryCreateParentFragment extends BaseFragment implements RegionGated, BeneficiaryCreateLoadConfigurationFragment.Callbacks, BeneficiaryCreateAgreementFragment.Callbacks, BeneficiaryCreateStepsFragment.Callbacks, BeneficiaryValuePropFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: configuration$delegate, reason: from kotlin metadata */
    private final Interfaces3 configuration;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateParentFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BeneficiaryCreateParentFragment.class, EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "getConfiguration()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryCreateParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateParentFragment$Callbacks;", "", "onBeneficiaryFlowCompleted", "", "postSubmitAlert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onBeneficiaryFlowAborted", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBeneficiaryFlowAborted();

        void onBeneficiaryFlowCompleted(GenericAlertContent<? extends GenericAction> postSubmitAlert);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public BeneficiaryCreateParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.BeneficiaryCreateParentFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.configuration = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[1]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final ApiCreateBeneficiaryConfiguration getConfiguration() {
        return (ApiCreateBeneficiaryConfiguration) this.configuration.getValue(this, $$delegatedProperties[1]);
    }

    private final void setConfiguration(ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
        this.configuration.setValue(this, $$delegatedProperties[1], apiCreateBeneficiaryConfiguration);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            BeneficiaryCreateLoadConfigurationFragment.Companion companion = BeneficiaryCreateLoadConfigurationFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new BeneficiaryCreateLoadConfigurationFragment.Args(((BeneficiariesFragmentKey.UpdateBeneficiary) companion2.getArgs((Fragment) this)).getAccountNumber(), ((BeneficiariesFragmentKey.UpdateBeneficiary) companion2.getArgs((Fragment) this)).getBeneficiaryId())));
        }
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.BeneficiaryCreateLoadConfigurationFragment.Callbacks
    public void onConfigurationLoadSuccessful(ApiCreateBeneficiaryConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        setConfiguration(configuration);
        ApiBeneficiarySplashViewModel splash_view_model = configuration.getSplash_view_model();
        if (splash_view_model != null) {
            replaceFragmentWithoutAnimationAndBackStack(BeneficiaryValuePropFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryValuePropFragment.Args(splash_view_model)));
        } else {
            showAgreementIfNeeded(true);
        }
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.BeneficiaryCreateLoadConfigurationFragment.Callbacks
    public void onConfigurationLoadFailed() {
        getCallbacks().onBeneficiaryFlowAborted();
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.intro.BeneficiaryValuePropFragment.Callbacks
    public void onValuePropCompleted() {
        showAgreementIfNeeded(false);
    }

    private final void showAgreementIfNeeded(boolean shouldClearBackstack) {
        ApiBeneficiaryAgreementViewModel agreement_view_model;
        ApiCreateBeneficiaryConfiguration configuration = getConfiguration();
        if (configuration != null && (agreement_view_model = configuration.getAgreement_view_model()) != null) {
            BeneficiaryCreateAgreementFragment beneficiaryCreateAgreementFragment = (BeneficiaryCreateAgreementFragment) BeneficiaryCreateAgreementFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryCreateAgreementFragment.Args(agreement_view_model, 0));
            if (shouldClearBackstack) {
                replaceFragmentWithoutAnimationAndBackStack(beneficiaryCreateAgreementFragment);
                return;
            } else {
                replaceFragmentWithoutAnimation(beneficiaryCreateAgreementFragment);
                return;
            }
        }
        navigateToSteps(shouldClearBackstack);
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.agreement.BeneficiaryCreateAgreementFragment.Callbacks
    public void onAgreementCompleted(ApiBeneficiaryAgreementViewModel agreement, int currentAgreementIndex) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        navigateToSteps(false);
    }

    private final void navigateToSteps(boolean shouldClearBackstack) {
        BeneficiaryCreateStepsFragment.Companion companion = BeneficiaryCreateStepsFragment.INSTANCE;
        ApiCreateBeneficiaryConfiguration configuration = getConfiguration();
        if (configuration != null) {
            BeneficiaryCreateStepsFragment beneficiaryCreateStepsFragment = (BeneficiaryCreateStepsFragment) companion.newInstance((Parcelable) new BeneficiaryCreateStepsFragment.Args(configuration));
            if (shouldClearBackstack) {
                replaceFragmentWithoutAnimationAndBackStack(beneficiaryCreateStepsFragment);
                return;
            } else {
                replaceFragmentWithoutAnimation(beneficiaryCreateStepsFragment);
                return;
            }
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.BeneficiaryCreateStepsFragment.Callbacks
    public void onBeneficiaryFlowStepsCompleted(GenericAlertContent<? extends GenericAction> postSubmitAlert) {
        getCallbacks().onBeneficiaryFlowCompleted(postSubmitAlert);
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        ViewsKt.hideKeyboard$default(viewRequireView, false, 1, null);
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.BeneficiaryCreateStepsFragment.Callbacks
    public void onBeneficiaryFlowStepsAborted() {
        getCallbacks().onBeneficiaryFlowAborted();
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        ViewsKt.hideKeyboard$default(viewRequireView, false, 1, null);
    }

    /* compiled from: BeneficiaryCreateParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateParentFragment;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$UpdateBeneficiary;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryCreateParentFragment, BeneficiariesFragmentKey.UpdateBeneficiary> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BeneficiariesFragmentKey.UpdateBeneficiary getArgs(BeneficiaryCreateParentFragment beneficiaryCreateParentFragment) {
            return (BeneficiariesFragmentKey.UpdateBeneficiary) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryCreateParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryCreateParentFragment newInstance(BeneficiariesFragmentKey.UpdateBeneficiary updateBeneficiary) {
            return (BeneficiaryCreateParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, updateBeneficiary);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryCreateParentFragment beneficiaryCreateParentFragment, BeneficiariesFragmentKey.UpdateBeneficiary updateBeneficiary) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryCreateParentFragment, updateBeneficiary);
        }
    }
}
