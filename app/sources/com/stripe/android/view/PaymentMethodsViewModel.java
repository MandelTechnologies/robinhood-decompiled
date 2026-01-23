package com.stripe.android.view;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.CustomerSession;
import com.stripe.android.R$string;
import com.stripe.android.analytics.PaymentSessionEventReporter;
import com.stripe.android.analytics.PaymentSessionEventReporterFactory;
import com.stripe.android.analytics.SessionSavedStateHandler;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: PaymentMethodsViewModel.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u00015BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001c\u0010*\u001a\u0004\u0018\u00010\n2\u0006\u0010+\u001a\u00020\u00162\b\b\u0001\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\fH\u0002J\u0015\u00101\u001a\u00020/2\u0006\u0010+\u001a\u00020\u0016H\u0000¢\u0006\u0002\b2J\u0015\u00103\u001a\u00020/2\u0006\u0010+\u001a\u00020\u0016H\u0000¢\u0006\u0002\b4R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00070\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "customerSession", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "selectedPaymentMethodId", "", "startedFromPaymentSession", "", "eventReporter", "Lcom/stripe/android/analytics/PaymentSessionEventReporter;", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Object;Ljava/lang/String;ZLcom/stripe/android/analytics/PaymentSessionEventReporter;)V", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "Ljava/lang/Object;", "paymentMethodsData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethodsData$payments_core_release", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "paymentMethodsJob", "Lkotlinx/coroutines/Job;", "productUsage", "", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "progressData", "getProgressData$payments_core_release", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "getSelectedPaymentMethodId$payments_core_release", "()Ljava/lang/String;", "setSelectedPaymentMethodId$payments_core_release", "(Ljava/lang/String;)V", "snackbarData", "getSnackbarData$payments_core_release", "createSnackbarText", "paymentMethod", "stringRes", "", "getPaymentMethods", "", "isInitialFetch", "onPaymentMethodAdded", "onPaymentMethodAdded$payments_core_release", "onPaymentMethodRemoved", "onPaymentMethodRemoved$payments_core_release", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PaymentMethodsViewModel extends AndroidViewModel {
    private final CardDisplayTextFactory cardDisplayTextFactory;
    private final Object customerSession;
    private final PaymentSessionEventReporter eventReporter;
    private final StateFlow2<Result<List<PaymentMethod>>> paymentMethodsData;
    private volatile Job paymentMethodsJob;
    private final Set<String> productUsage;
    private final StateFlow2<Boolean> progressData;
    private final Resources resources;
    private String selectedPaymentMethodId;
    private final StateFlow2<String> snackbarData;
    private final boolean startedFromPaymentSession;

    /* renamed from: getSelectedPaymentMethodId$payments_core_release, reason: from getter */
    public final String getSelectedPaymentMethodId() {
        return this.selectedPaymentMethodId;
    }

    public final void setSelectedPaymentMethodId$payments_core_release(String str) {
        this.selectedPaymentMethodId = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaymentMethodsViewModel(Application application, SavedStateHandle savedStateHandle, Object obj, String str, boolean z, PaymentSessionEventReporter paymentSessionEventReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str2 = (i & 8) != 0 ? null : str;
        if ((i & 32) != 0) {
            PaymentSessionEventReporterFactory paymentSessionEventReporterFactory = PaymentSessionEventReporterFactory.INSTANCE;
            Context applicationContext = application.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            paymentSessionEventReporter = paymentSessionEventReporterFactory.create(applicationContext);
        }
        this(application, savedStateHandle, obj, str2, z, paymentSessionEventReporter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsViewModel(Application application, SavedStateHandle savedStateHandle, Object obj, String str, boolean z, PaymentSessionEventReporter eventReporter) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        this.customerSession = obj;
        this.selectedPaymentMethodId = str;
        this.startedFromPaymentSession = z;
        this.eventReporter = eventReporter;
        this.resources = application.getResources();
        this.cardDisplayTextFactory = new CardDisplayTextFactory(application);
        this.productUsage = CollectionsKt.toSet(CollectionsKt.listOfNotNull((Object[]) new String[]{z ? "PaymentSession" : null, "PaymentMethodsActivity"}));
        this.paymentMethodsData = StateFlow4.MutableStateFlow(null);
        this.snackbarData = StateFlow4.MutableStateFlow(null);
        this.progressData = StateFlow4.MutableStateFlow(Boolean.FALSE);
        SessionSavedStateHandler.INSTANCE.attachTo(this, savedStateHandle);
        getPaymentMethods(true);
    }

    public final Set<String> getProductUsage$payments_core_release() {
        return this.productUsage;
    }

    public final StateFlow2<Result<List<PaymentMethod>>> getPaymentMethodsData$payments_core_release() {
        return this.paymentMethodsData;
    }

    public final StateFlow2<String> getSnackbarData$payments_core_release() {
        return this.snackbarData;
    }

    public final StateFlow2<Boolean> getProgressData$payments_core_release() {
        return this.progressData;
    }

    public final void onPaymentMethodAdded$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        String strCreateSnackbarText = createSnackbarText(paymentMethod, R$string.stripe_added);
        if (strCreateSnackbarText != null) {
            this.snackbarData.setValue(strCreateSnackbarText);
            this.snackbarData.setValue(null);
        }
        getPaymentMethods(false);
    }

    public final void onPaymentMethodRemoved$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        String strCreateSnackbarText = createSnackbarText(paymentMethod, R$string.stripe_removed);
        if (strCreateSnackbarText != null) {
            this.snackbarData.setValue(strCreateSnackbarText);
            this.snackbarData.setValue(null);
        }
    }

    private final String createSnackbarText(PaymentMethod paymentMethod, int stringRes) {
        PaymentMethod.Card card = paymentMethod.card;
        if (card != null) {
            return this.resources.getString(stringRes, this.cardDisplayTextFactory.createUnstyled$payments_core_release(card));
        }
        return null;
    }

    private final void getPaymentMethods(boolean isInitialFetch) {
        Job job = this.paymentMethodsJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        if (isInitialFetch) {
            this.eventReporter.onLoadStarted();
        }
        this.paymentMethodsJob = BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C426931(isInitialFetch, null), 3, null);
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.PaymentMethodsViewModel$getPaymentMethods$1", m3645f = "PaymentMethodsViewModel.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.view.PaymentMethodsViewModel$getPaymentMethods$1 */
    static final class C426931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isInitialFetch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C426931(boolean z, Continuation<? super C426931> continuation) {
            super(2, continuation);
            this.$isInitialFetch = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentMethodsViewModel.this.new C426931(this.$isInitialFetch, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PaymentMethodsViewModel.this.getProgressData$payments_core_release().setValue(boxing.boxBoolean(true));
            Object obj2 = PaymentMethodsViewModel.this.customerSession;
            final PaymentMethodsViewModel paymentMethodsViewModel = PaymentMethodsViewModel.this;
            final boolean z = this.$isInitialFetch;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
            if (thM28553exceptionOrNullimpl == null) {
                CustomerSession.getPaymentMethods$payments_core_release$default((CustomerSession) obj2, PaymentMethod.Type.Card, null, null, null, paymentMethodsViewModel.getProductUsage$payments_core_release(), new CustomerSession.PaymentMethodsRetrievalListener() { // from class: com.stripe.android.view.PaymentMethodsViewModel$getPaymentMethods$1$1$1
                }, 14, null);
            } else {
                paymentMethodsViewModel.getPaymentMethodsData$payments_core_release().setValue(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl))));
                paymentMethodsViewModel.getProgressData$payments_core_release().setValue(boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ-\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "customerSession", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "initialPaymentMethodId", "", "startedFromPaymentSession", "", "(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V", "Ljava/lang/Object;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final Application application;
        private final Object customerSession;
        private final String initialPaymentMethodId;
        private final boolean startedFromPaymentSession;

        public Factory(Application application, Object obj, String str, boolean z) {
            Intrinsics.checkNotNullParameter(application, "application");
            this.application = application;
            this.customerSession = obj;
            this.initialPaymentMethodId = str;
            this.startedFromPaymentSession = z;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new PaymentMethodsViewModel(this.application, SavedStateHandleSupport.createSavedStateHandle(extras), this.customerSession, this.initialPaymentMethodId, this.startedFromPaymentSession, null, 32, null);
        }
    }
}
