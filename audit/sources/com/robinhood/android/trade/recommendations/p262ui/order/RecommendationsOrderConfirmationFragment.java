package com.robinhood.android.trade.recommendations.p262ui.order;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.trade.recommendations.C29895R;
import com.robinhood.android.trade.recommendations.databinding.FragmentRecommendationsOrderConfirmationBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderResponse;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsOrderReceipt;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsOrderConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\u0002H\u0016J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0002R\u001e\u0010\u0006\u001a\u00020\u00038\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderResponse;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;", "<init>", "()V", "orderManager", "getOrderManager", "()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;", "setOrderManager", "(Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;)V", "confirmationLayoutId", "", "getConfirmationLayoutId", "()I", "duxo", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/trade/recommendations/databinding/FragmentRecommendationsOrderConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/trade/recommendations/databinding/FragmentRecommendationsOrderConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment$Callbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderReceipt$Row;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onOrderReceived", Card.Icon.ORDER, "setViewState", "state", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationViewState;", "Callbacks", "Args", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RecommendationsOrderConfirmationFragment extends BaseOrderConfirmationFragment<ApiRecommendationsOrderResponse, RecommendationsOrderSubmissionManager> {
    public RecommendationsOrderSubmissionManager orderManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsOrderConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/trade/recommendations/databinding/FragmentRecommendationsOrderConfirmationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsOrderConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final int confirmationLayoutId = C29895R.layout.fragment_recommendations_order_confirmation;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, RecommendationsOrderConfirmationDuxo.class);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding = ViewBinding5.viewBinding(this, RecommendationsOrderConfirmationFragment2.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderConfirmationFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    private final GenericListAdapter<RdsRowView, UiRecommendationsOrderReceipt.Row> adapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderConfirmationFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return RecommendationsOrderConfirmationFragment.adapter$lambda$0((RdsRowView) obj, (UiRecommendationsOrderReceipt.Row) obj2);
        }
    });

    /* compiled from: RecommendationsOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment$Callbacks;", "", "onCompleteOrderConfirmation", "", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCompleteOrderConfirmation();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public RecommendationsOrderSubmissionManager getOrderManager() {
        RecommendationsOrderSubmissionManager recommendationsOrderSubmissionManager = this.orderManager;
        if (recommendationsOrderSubmissionManager != null) {
            return recommendationsOrderSubmissionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(RecommendationsOrderSubmissionManager recommendationsOrderSubmissionManager) {
        Intrinsics.checkNotNullParameter(recommendationsOrderSubmissionManager, "<set-?>");
        this.orderManager = recommendationsOrderSubmissionManager;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public int getConfirmationLayoutId() {
        return this.confirmationLayoutId;
    }

    private final RecommendationsOrderConfirmationDuxo getDuxo() {
        return (RecommendationsOrderConfirmationDuxo) this.duxo.getValue();
    }

    private final FragmentRecommendationsOrderConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsOrderConfirmationBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(RdsRowView of, UiRecommendationsOrderReceipt.Row row) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(row, "row");
        of.setPrimaryText(row.getTitle());
        of.setMetadataPrimaryText(row.getValue());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C299151(this));
    }

    /* compiled from: RecommendationsOrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderConfirmationFragment$onStart$1 */
    /* synthetic */ class C299151 extends FunctionReferenceImpl implements Function1<RecommendationsOrderConfirmationViewState, Unit> {
        C299151(Object obj) {
            super(1, obj, RecommendationsOrderConfirmationFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecommendationsOrderConfirmationViewState recommendationsOrderConfirmationViewState) {
            invoke2(recommendationsOrderConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecommendationsOrderConfirmationViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsOrderConfirmationFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        requireActivity().setResult(-1);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentRecommendationsOrderConfirmationBinding binding = getBinding();
        RecyclerView list = binding.list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        bindAdapter(list, this.adapter);
        RdsButton doneBtn = binding.doneBtn;
        Intrinsics.checkNotNullExpressionValue(doneBtn, "doneBtn");
        OnClickListeners.onClick(doneBtn, new Function0() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsOrderConfirmationFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(RecommendationsOrderConfirmationFragment recommendationsOrderConfirmationFragment) {
        IdlingResourceCounters2.setBusy(IdlingResourceType.RECOMMENDATIONS_CHECKOUT_CELEBRATION, true);
        recommendationsOrderConfirmationFragment.getCallbacks().onCompleteOrderConfirmation();
        recommendationsOrderConfirmationFragment.getDuxo().logButtonTap();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onOrderReceived(ApiRecommendationsOrderResponse order) {
        Intrinsics.checkNotNullParameter(order, "order");
        getDuxo().setInvestmentId(order.getInvestment_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(RecommendationsOrderConfirmationViewState state) {
        UiRecommendationsOrderReceipt orderReceipt = state.getOrderReceipt();
        if (orderReceipt != null) {
            this.adapter.submitList(orderReceipt.getItems());
            FragmentRecommendationsOrderConfirmationBinding binding = getBinding();
            binding.title.setText(orderReceipt.getTitle());
            binding.subtitle.setText(orderReceipt.getDescription());
            binding.doneBtn.setText(orderReceipt.getCtaButtonTitle());
            if (getConfirmationContainer().getVisibility() == 0) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.RECOMMENDATIONS_CHECKOUT_ORDER_SUBMISSION, false);
            }
        }
    }

    /* compiled from: RecommendationsOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment$Args;", "Landroid/os/Parcelable;", "source", "", "accountNumber", "transferIds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSource", "()Ljava/lang/String;", "getAccountNumber", "getTransferIds", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String source;
        private final List<String> transferIds;

        /* compiled from: RecommendationsOrderConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.accountNumber);
            dest.writeStringList(this.transferIds);
        }

        public Args(String source, String str, List<String> transferIds) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(transferIds, "transferIds");
            this.source = source;
            this.accountNumber = str;
            this.transferIds = transferIds;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final List<String> getTransferIds() {
            return this.transferIds;
        }
    }

    /* compiled from: RecommendationsOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderConfirmationFragment$Args;", "<init>", "()V", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsOrderConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsOrderConfirmationFragment recommendationsOrderConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsOrderConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsOrderConfirmationFragment newInstance(Args args) {
            return (RecommendationsOrderConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsOrderConfirmationFragment recommendationsOrderConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsOrderConfirmationFragment, args);
        }
    }
}
