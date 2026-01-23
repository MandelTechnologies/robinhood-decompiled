package com.robinhood.android.investFlow.submit;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationArgs;
import com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationFragment;
import com.robinhood.android.lib.trade.BaseOrderParentFragment;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowOrderParentFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\"H\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderParentFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragment;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationFragment$Callbacks;", "<init>", "()V", "orderManager", "getOrderManager", "()Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;", "setOrderManager", "(Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;)V", "accountNumberObs", "Lio/reactivex/Observable;", "", "getAccountNumberObs", "()Lio/reactivex/Observable;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Unsupported;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Unsupported;", "analyticsErrorString", "getAnalyticsErrorString", "()Ljava/lang/String;", "side", "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "skipForceSuitability", "", "getSkipForceSuitability", "()Z", "createOrderConfirmationFragment", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCompleteOrderConfirmation", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"FragmentNotRegionGated"})
/* loaded from: classes10.dex */
public final class InvestFlowOrderParentFragment extends BaseOrderParentFragment<InvestFlowOrderSubmissionManager> implements InvestFlowOrderConfirmationFragment.Callbacks {
    public InvestFlowOrderSubmissionManager orderManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final CarSuitabilityType.Unsupported carSuitabilityType = CarSuitabilityType.Unsupported.INSTANCE;
    private final String analyticsErrorString = AnalyticsStrings.ERROR_PLACE_ORDER;
    private final OrderSide side = OrderSide.BUY;

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public InvestFlowOrderSubmissionManager getOrderManager() {
        InvestFlowOrderSubmissionManager investFlowOrderSubmissionManager = this.orderManager;
        if (investFlowOrderSubmissionManager != null) {
            return investFlowOrderSubmissionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(InvestFlowOrderSubmissionManager investFlowOrderSubmissionManager) {
        Intrinsics.checkNotNullParameter(investFlowOrderSubmissionManager, "<set-?>");
        this.orderManager = investFlowOrderSubmissionManager;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public Observable<String> getAccountNumberObs() {
        Observable<String> observableJust = Observable.just(((InvestFlowOrderArgs) INSTANCE.getArgs((Fragment) this)).getAccountNumber());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public CarSuitabilityType.Unsupported getCarSuitabilityType() {
        return this.carSuitabilityType;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public String getAnalyticsErrorString() {
        return this.analyticsErrorString;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public OrderSide getSide() {
        return this.side;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public boolean getSkipForceSuitability() {
        return ((InvestFlowOrderArgs) INSTANCE.getArgs((Fragment) this)).getSkipForceSuitability();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public InvestFlowOrderConfirmationFragment createOrderConfirmationFragment() {
        InvestFlowOrderConfirmationFragment.Companion companion = InvestFlowOrderConfirmationFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        return (InvestFlowOrderConfirmationFragment) companion.newInstance((Parcelable) new InvestFlowOrderConfirmationArgs(((InvestFlowOrderArgs) companion2.getArgs((Fragment) this)).getAccountNumber(), ((InvestFlowOrderArgs) companion2.getArgs((Fragment) this)).getLoggingParams()));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            ((InvestFlowOrderArgs) companion.getArgs((Fragment) this)).setRefId(getOrderUuid());
            setFragment(C19349R.id.fragment_container, InvestFlowOrderFragment.INSTANCE.newInstance(companion.getArgs((Fragment) this)));
        }
    }

    @Override // com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationFragment.Callbacks
    public void onCompleteOrderConfirmation() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.setResult(1);
        fragmentActivityRequireActivity.finish();
    }

    /* compiled from: InvestFlowOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderParentFragment;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowOrderParentFragment, InvestFlowOrderArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowOrderArgs getArgs(InvestFlowOrderParentFragment investFlowOrderParentFragment) {
            return (InvestFlowOrderArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowOrderParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowOrderParentFragment newInstance(InvestFlowOrderArgs investFlowOrderArgs) {
            return (InvestFlowOrderParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowOrderArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowOrderParentFragment investFlowOrderParentFragment, InvestFlowOrderArgs investFlowOrderArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowOrderParentFragment, investFlowOrderArgs);
        }
    }
}
