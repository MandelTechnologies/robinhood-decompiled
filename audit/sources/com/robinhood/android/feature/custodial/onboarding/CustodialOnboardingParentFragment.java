package com.robinhood.android.feature.custodial.onboarding;

import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks;
import com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionFragmentKey;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.custodial.contracts.CustodialOnboardingKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CustodialOnboardingParentFragment.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/feature/custodial/onboarding/CustodialOnboardingParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/account/contracts/onboarding/ManagementStyleSelectionCallbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/feature/custodial/onboarding/CustodialOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/feature/custodial/onboarding/CustodialOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onConfirmSelfDirectedAccount", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onConfirmManagedAccount", "Companion", "feature-custodial-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CustodialOnboardingParentFragment extends BaseFragment implements ManagementStyleSelectionCallbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CustodialOnboardingParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.duxo = DuxosKt.duxo(this, CustodialOnboardingDuxo.class);
    }

    private final CustodialOnboardingDuxo getDuxo() {
        return (CustodialOnboardingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new ManagementStyleSelectionFragmentKey(BrokerageAccountType.UNKNOWN, ((CustodialOnboardingKey) INSTANCE.getArgs((Fragment) this)).getSource()), null, 2, null));
        }
    }

    @Override // com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks
    public void onConfirmSelfDirectedAccount(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().createCustodialApplication(ManagementType.SELF_DIRECTED);
    }

    @Override // com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks
    public void onConfirmManagedAccount(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Toast.makeText(requireContext(), "Not supported yet", 0).show();
    }

    /* compiled from: CustodialOnboardingParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/custodial/onboarding/CustodialOnboardingParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/feature/custodial/onboarding/CustodialOnboardingParentFragment;", "Lcom/robinhood/android/custodial/contracts/CustodialOnboardingKey;", "<init>", "()V", "feature-custodial-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CustodialOnboardingParentFragment, CustodialOnboardingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CustodialOnboardingKey getArgs(CustodialOnboardingParentFragment custodialOnboardingParentFragment) {
            return (CustodialOnboardingKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, custodialOnboardingParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CustodialOnboardingParentFragment newInstance(CustodialOnboardingKey custodialOnboardingKey) {
            return (CustodialOnboardingParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, custodialOnboardingKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CustodialOnboardingParentFragment custodialOnboardingParentFragment, CustodialOnboardingKey custodialOnboardingKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, custodialOnboardingParentFragment, custodialOnboardingKey);
        }
    }
}
