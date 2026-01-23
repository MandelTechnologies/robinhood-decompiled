package com.stripe.android.view;

import android.app.Application;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.R$id;
import com.stripe.android.databinding.StripeBankListPaymentMethodBinding;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.FpxViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AddPaymentMethodFpxView.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodFpxView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;I)V", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "fpxAdapter", "Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "fpxBankStatuses", "Lcom/stripe/android/model/BankStatuses;", "viewModel", "Lcom/stripe/android/view/FpxViewModel;", "getViewModel", "()Lcom/stripe/android/view/FpxViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getItem", "Lcom/stripe/android/view/FpxBank;", "position", "onFpxBankStatusesUpdated", "", "updateStatuses", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class AddPaymentMethodFpxView extends AddPaymentMethodView {
    private final AddPaymentMethodListAdapter fpxAdapter;
    private BankStatuses fpxBankStatuses;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ AddPaymentMethodFpxView(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddPaymentMethodFpxView(final FragmentActivity activity, AttributeSet attributeSet, int i) {
        super(activity, attributeSet, i);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.fpxBankStatuses = new BankStatuses(null, 1, null);
        AddPaymentMethodListAdapter addPaymentMethodListAdapter = new AddPaymentMethodListAdapter(new ThemeConfig(activity), FpxBank.getEntries(), new Function1<Integer, Unit>() { // from class: com.stripe.android.view.AddPaymentMethodFpxView$fpxAdapter$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i2) {
                this.this$0.getViewModel().setSelectedPosition$payments_core_release(Integer.valueOf(i2));
            }
        });
        this.fpxAdapter = addPaymentMethodListAdapter;
        this.viewModel = LazyKt.lazy(new Function0<FpxViewModel>() { // from class: com.stripe.android.view.AddPaymentMethodFpxView$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final FpxViewModel invoke() {
                FragmentActivity fragmentActivity = activity;
                Application application = activity.getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                return (FpxViewModel) new ViewModelProvider(fragmentActivity, new FpxViewModel.Factory(application)).get(FpxViewModel.class);
            }
        });
        StripeBankListPaymentMethodBinding stripeBankListPaymentMethodBindingInflate = StripeBankListPaymentMethodBinding.inflate(activity.getLayoutInflater(), this, true);
        Intrinsics.checkNotNullExpressionValue(stripeBankListPaymentMethodBindingInflate, "inflate(...)");
        setId(R$id.stripe_payment_methods_add_fpx);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(activity), null, null, new C426431(null), 3, null);
        RecyclerView recyclerView = stripeBankListPaymentMethodBindingInflate.bankList;
        recyclerView.setAdapter(addPaymentMethodListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Integer selectedPosition$payments_core_release = getViewModel().getSelectedPosition();
        if (selectedPosition$payments_core_release != null) {
            addPaymentMethodListAdapter.updateSelected$payments_core_release(selectedPosition$payments_core_release.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FpxViewModel getViewModel() {
        return (FpxViewModel) this.viewModel.getValue();
    }

    @Override // com.stripe.android.view.AddPaymentMethodView
    public PaymentMethodCreateParams getCreateParams() {
        Integer numValueOf = Integer.valueOf(this.fpxAdapter.getSelectedPosition());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.Fpx(FpxBank.getEntries().get(numValueOf.intValue()).getCode()), (PaymentMethod.BillingDetails) null, (Map) null, (PaymentMethod.AllowRedisplay) null, 14, (Object) null);
    }

    /* compiled from: AddPaymentMethodFpxView.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.AddPaymentMethodFpxView$1", m3645f = "AddPaymentMethodFpxView.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.view.AddPaymentMethodFpxView$1 */
    static final class C426431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C426431(Continuation<? super C426431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AddPaymentMethodFpxView.this.new C426431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AddPaymentMethodFpxView.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: com.stripe.android.view.AddPaymentMethodFpxView$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AddPaymentMethodFpxView $tmp0;

            AnonymousClass1(AddPaymentMethodFpxView addPaymentMethodFpxView) {
                this.$tmp0 = addPaymentMethodFpxView;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AddPaymentMethodFpxView.class, "onFpxBankStatusesUpdated", "onFpxBankStatusesUpdated(Lcom/stripe/android/model/BankStatuses;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(BankStatuses bankStatuses, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$onFpxBankStatusesUpdated = C426431.invokeSuspend$onFpxBankStatusesUpdated(this.$tmp0, bankStatuses, continuation);
                return objInvokeSuspend$onFpxBankStatusesUpdated == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$onFpxBankStatusesUpdated : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((BankStatuses) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<BankStatuses> fpxBankStatues = AddPaymentMethodFpxView.this.getViewModel().getFpxBankStatues();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AddPaymentMethodFpxView.this);
                this.label = 1;
                if (fpxBankStatues.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$onFpxBankStatusesUpdated(AddPaymentMethodFpxView addPaymentMethodFpxView, BankStatuses bankStatuses, Continuation continuation) {
            addPaymentMethodFpxView.onFpxBankStatusesUpdated(bankStatuses);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFpxBankStatusesUpdated(BankStatuses fpxBankStatuses) {
        if (fpxBankStatuses != null) {
            updateStatuses(fpxBankStatuses);
        }
    }

    private final void updateStatuses(BankStatuses fpxBankStatuses) {
        this.fpxBankStatuses = fpxBankStatuses;
        this.fpxAdapter.setBankStatuses$payments_core_release(fpxBankStatuses);
        PrimitiveRanges2 indices = CollectionsKt.getIndices(FpxBank.getEntries());
        ArrayList arrayList = new ArrayList();
        for (Integer num : indices) {
            if (!fpxBankStatuses.isOnline$payments_core_release(getItem(num.intValue()))) {
                arrayList.add(num);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.fpxAdapter.notifyAdapterItemChanged(((Number) it.next()).intValue());
        }
    }

    private final FpxBank getItem(int position) {
        return FpxBank.getEntries().get(position);
    }

    /* compiled from: AddPaymentMethodFpxView.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodFpxView$Companion;", "", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/view/AddPaymentMethodFpxView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "create$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ AddPaymentMethodFpxView create$payments_core_release(FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new AddPaymentMethodFpxView(activity, null, 0, 6, null);
        }
    }
}
