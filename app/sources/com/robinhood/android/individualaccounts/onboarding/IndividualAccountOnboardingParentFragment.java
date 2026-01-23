package com.robinhood.android.individualaccounts.onboarding;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.account.contracts.individualaccounts.AccountApplicationCreatedCallback;
import com.robinhood.android.account.contracts.individualaccounts.IndividualAccountOnboardingFragmentKey;
import com.robinhood.android.account.contracts.naming.CreateAccountNicknameFragmentKey;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDeeplinkTarget;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.shared.remote.assets.LottieUrl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: IndividualAccountOnboardingParentFragment.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0002R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/IndividualAccountOnboardingParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/account/contracts/individualaccounts/AccountApplicationCreatedCallback;", "<init>", "()V", "<set-?>", "", "applicationId", "getApplicationId", "()Ljava/lang/String;", "setApplicationId", "(Ljava/lang/String;)V", "applicationId$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onApplicationCreated", "prefetchOnboardingLotties", "Companion", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndividualAccountOnboardingParentFragment extends BaseFragment implements AccountApplicationCreatedCallback {

    /* renamed from: applicationId$delegate, reason: from kotlin metadata */
    private final Interfaces3 applicationId;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(IndividualAccountOnboardingParentFragment.class, "applicationId", "getApplicationId()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public IndividualAccountOnboardingParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.applicationId = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    private final String getApplicationId() {
        return (String) this.applicationId.getValue(this, $$delegatedProperties[0]);
    }

    private final void setApplicationId(String str) {
        this.applicationId.setValue(this, $$delegatedProperties[0], str);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefetchOnboardingLotties();
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new CreateAccountNicknameFragmentKey(BrokerageAccountType.INDIVIDUAL, ManagementType.SELF_DIRECTED, ((IndividualAccountOnboardingFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource()), null, 2, null));
        }
    }

    @Override // com.robinhood.android.account.contracts.individualaccounts.AccountApplicationCreatedCallback
    public void onApplicationCreated(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        setApplicationId(applicationId);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("application_id", applicationId));
        IndividualAccountOutroDeeplinkTarget individualAccountOutroDeeplinkTarget = IndividualAccountOutroDeeplinkTarget.INSTANCE;
        Companion companion = INSTANCE;
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GenericSdFlowIntentKey("generic_agreement/mib_agreement", false, null, individualAccountOutroDeeplinkTarget.build(applicationId, ((IndividualAccountOnboardingFragmentKey) companion.getArgs((Fragment) this)).getSource()), mapMapOf, ((IndividualAccountOnboardingFragmentKey) companion.getArgs((Fragment) this)).getSource(), false, null, null, 454, null), null, false, null, null, 60, null);
    }

    private final void prefetchOnboardingLotties() {
        LottieUrl lottieUrl = LottieUrl.MIB_ACCOUNT_CREATED_DAY;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        lottieUrl.prefetch(contextRequireContext);
        LottieUrl lottieUrl2 = LottieUrl.MIB_ACCOUNT_CREATED_NIGHT;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        lottieUrl2.prefetch(contextRequireContext2);
    }

    /* compiled from: IndividualAccountOnboardingParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/IndividualAccountOnboardingParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/individualaccounts/onboarding/IndividualAccountOnboardingParentFragment;", "Lcom/robinhood/android/account/contracts/individualaccounts/IndividualAccountOnboardingFragmentKey;", "<init>", "()V", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<IndividualAccountOnboardingParentFragment, IndividualAccountOnboardingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(IndividualAccountOnboardingFragmentKey individualAccountOnboardingFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, individualAccountOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public IndividualAccountOnboardingFragmentKey getArgs(IndividualAccountOnboardingParentFragment individualAccountOnboardingParentFragment) {
            return (IndividualAccountOnboardingFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, individualAccountOnboardingParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IndividualAccountOnboardingParentFragment newInstance(IndividualAccountOnboardingFragmentKey individualAccountOnboardingFragmentKey) {
            return (IndividualAccountOnboardingParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, individualAccountOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IndividualAccountOnboardingParentFragment individualAccountOnboardingParentFragment, IndividualAccountOnboardingFragmentKey individualAccountOnboardingFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, individualAccountOnboardingParentFragment, individualAccountOnboardingFragmentKey);
        }
    }
}
