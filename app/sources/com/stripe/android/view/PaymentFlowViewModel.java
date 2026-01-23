package com.stripe.android.view;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PaymentFlowViewModel.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 A2\u00020\u0001:\u0002ABB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006C"}, m3636d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionData;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "Lkotlin/Result;", "Lcom/stripe/android/model/Customer;", "saveCustomerShippingInformation-gIAlu-s$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCustomerShippingInformation", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingInfoValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "shippingMethodsFactory", "", "Lcom/stripe/android/model/ShippingMethod;", "validateShippingInformation-BWLJW6A$payments_core_release", "(Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Lcom/stripe/android/model/ShippingInformation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateShippingInformation", "Lcom/stripe/android/CustomerSession;", "Lcom/stripe/android/PaymentSessionData;", "getPaymentSessionData$payments_core_release", "()Lcom/stripe/android/PaymentSessionData;", "setPaymentSessionData$payments_core_release", "(Lcom/stripe/android/PaymentSessionData;)V", "Lkotlin/coroutines/CoroutineContext;", "shippingMethods", "Ljava/util/List;", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "", "isShippingInfoSubmitted", "Z", "isShippingInfoSubmitted$payments_core_release", "()Z", "setShippingInfoSubmitted$payments_core_release", "(Z)V", "selectedShippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "getSelectedShippingMethod$payments_core_release", "()Lcom/stripe/android/model/ShippingMethod;", "setSelectedShippingMethod$payments_core_release", "(Lcom/stripe/android/model/ShippingMethod;)V", "submittedShippingInfo", "Lcom/stripe/android/model/ShippingInformation;", "getSubmittedShippingInfo$payments_core_release", "()Lcom/stripe/android/model/ShippingInformation;", "setSubmittedShippingInfo$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;)V", "", "currentPage", "I", "getCurrentPage$payments_core_release", "()I", "setCurrentPage$payments_core_release", "(I)V", "Companion", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PaymentFlowViewModel extends ViewModel {
    private int currentPage;
    private final CustomerSession customerSession;
    private boolean isShippingInfoSubmitted;
    private PaymentSessionData paymentSessionData;
    private ShippingMethod selectedShippingMethod;
    private List<ShippingMethod> shippingMethods;
    private ShippingInformation submittedShippingInfo;
    private final CoroutineContext workContext;
    public static final int $stable = 8;
    private static final Set<String> PRODUCT_USAGE = SetsKt.setOf((Object[]) new String[]{"PaymentSession", "PaymentFlowActivity", "ShippingInfoScreen"});

    /* renamed from: getPaymentSessionData$payments_core_release, reason: from getter */
    public final PaymentSessionData getPaymentSessionData() {
        return this.paymentSessionData;
    }

    public final void setPaymentSessionData$payments_core_release(PaymentSessionData paymentSessionData) {
        Intrinsics.checkNotNullParameter(paymentSessionData, "<set-?>");
        this.paymentSessionData = paymentSessionData;
    }

    public PaymentFlowViewModel(CustomerSession customerSession, PaymentSessionData paymentSessionData, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(customerSession, "customerSession");
        Intrinsics.checkNotNullParameter(paymentSessionData, "paymentSessionData");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.customerSession = customerSession;
        this.paymentSessionData = paymentSessionData;
        this.workContext = workContext;
        this.shippingMethods = CollectionsKt.emptyList();
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return this.shippingMethods;
    }

    /* renamed from: isShippingInfoSubmitted$payments_core_release, reason: from getter */
    public final boolean getIsShippingInfoSubmitted() {
        return this.isShippingInfoSubmitted;
    }

    public final void setShippingInfoSubmitted$payments_core_release(boolean z) {
        this.isShippingInfoSubmitted = z;
    }

    /* renamed from: getSelectedShippingMethod$payments_core_release, reason: from getter */
    public final ShippingMethod getSelectedShippingMethod() {
        return this.selectedShippingMethod;
    }

    public final void setSelectedShippingMethod$payments_core_release(ShippingMethod shippingMethod) {
        this.selectedShippingMethod = shippingMethod;
    }

    /* renamed from: getSubmittedShippingInfo$payments_core_release, reason: from getter */
    public final ShippingInformation getSubmittedShippingInfo() {
        return this.submittedShippingInfo;
    }

    /* renamed from: getCurrentPage$payments_core_release, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final void setCurrentPage$payments_core_release(int i) {
        this.currentPage = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: saveCustomerShippingInformation-gIAlu-s$payments_core_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object m26970saveCustomerShippingInformationgIAlus$payments_core_release(ShippingInformation shippingInformation, Continuation continuation) {
        PaymentFlowViewModel2 paymentFlowViewModel2;
        if (continuation instanceof PaymentFlowViewModel2) {
            paymentFlowViewModel2 = (PaymentFlowViewModel2) continuation;
            int i = paymentFlowViewModel2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentFlowViewModel2.label = i - Integer.MIN_VALUE;
            } else {
                paymentFlowViewModel2 = new PaymentFlowViewModel2(this, continuation);
            }
        }
        Object orThrow = paymentFlowViewModel2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = paymentFlowViewModel2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(orThrow);
            paymentFlowViewModel2.L$0 = this;
            paymentFlowViewModel2.L$1 = shippingInformation;
            paymentFlowViewModel2.label = 1;
            final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(paymentFlowViewModel2));
            this.submittedShippingInfo = shippingInformation;
            this.customerSession.setCustomerShippingInformation$payments_core_release(shippingInformation, PRODUCT_USAGE, new CustomerSession.CustomerRetrievalListener() { // from class: com.stripe.android.view.PaymentFlowViewModel$saveCustomerShippingInformation$2$1
            });
            orThrow = safeContinuationJvm.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(paymentFlowViewModel2);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(orThrow);
        }
        return ((Result) orThrow).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: validateShippingInformation-BWLJW6A$payments_core_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object m26971validateShippingInformationBWLJW6A$payments_core_release(PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, ShippingInformation shippingInformation, Continuation continuation) {
        PaymentFlowViewModel4 paymentFlowViewModel4;
        PaymentFlowViewModel paymentFlowViewModel;
        if (continuation instanceof PaymentFlowViewModel4) {
            paymentFlowViewModel4 = (PaymentFlowViewModel4) continuation;
            int i = paymentFlowViewModel4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentFlowViewModel4.label = i - Integer.MIN_VALUE;
            } else {
                paymentFlowViewModel4 = new PaymentFlowViewModel4(this, continuation);
            }
        }
        Object objWithContext = paymentFlowViewModel4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = paymentFlowViewModel4.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            PaymentFlowViewModel5 paymentFlowViewModel5 = new PaymentFlowViewModel5(shippingInformationValidator, shippingInformation, shippingMethodsFactory, null);
            paymentFlowViewModel4.L$0 = this;
            paymentFlowViewModel4.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, paymentFlowViewModel5, paymentFlowViewModel4);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentFlowViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentFlowViewModel = (PaymentFlowViewModel) paymentFlowViewModel4.L$0;
            ResultKt.throwOnFailure(objWithContext);
        }
        Object value = ((Result) objWithContext).getValue();
        Object objEmptyList = CollectionsKt.emptyList();
        if (!Result.m28555isFailureimpl(value)) {
            objEmptyList = value;
        }
        paymentFlowViewModel.shippingMethods = (List) objEmptyList;
        return value;
    }

    /* compiled from: PaymentFlowViewModel.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "customerSession", "Lcom/stripe/android/CustomerSession;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionData;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final CustomerSession customerSession;
        private final PaymentSessionData paymentSessionData;

        public Factory(CustomerSession customerSession, PaymentSessionData paymentSessionData) {
            Intrinsics.checkNotNullParameter(customerSession, "customerSession");
            Intrinsics.checkNotNullParameter(paymentSessionData, "paymentSessionData");
            this.customerSession = customerSession;
            this.paymentSessionData = paymentSessionData;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new PaymentFlowViewModel(this.customerSession, this.paymentSessionData, Dispatchers.getIO());
        }
    }
}
