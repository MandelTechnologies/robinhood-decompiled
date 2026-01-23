package com.stripe.android.view;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.CustomerSession;
import com.stripe.android.Stripe;
import com.stripe.android.analytics.PaymentSessionEventReporter;
import com.stripe.android.analytics.PaymentSessionEventReporterFactory;
import com.stripe.android.analytics.SessionSavedStateHandler;
import com.stripe.android.core.utils.CreationExtrasKtx;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.i18n.ErrorMessageTranslator;
import com.stripe.android.view.i18n.TranslatorManager;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddPaymentMethodViewModel.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 42\u00020\u0001:\u000245B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001eH\u0080@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J$\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010%\u001a\u00020&H\u0080@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020*H\u0000¢\u0006\u0002\b+J\r\u0010,\u001a\u00020*H\u0000¢\u0006\u0002\b-J\r\u0010.\u001a\u00020*H\u0000¢\u0006\u0002\b/J\r\u00100\u001a\u00020*H\u0000¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020&2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b3R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stripe", "Lcom/stripe/android/Stripe;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "errorMessageTranslator", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "eventReporter", "Lcom/stripe/android/analytics/PaymentSessionEventReporter;", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/Stripe;Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;Lcom/stripe/android/view/i18n/ErrorMessageTranslator;Lcom/stripe/android/analytics/PaymentSessionEventReporter;)V", "value", "", "formInteractedEventReported", "getFormInteractedEventReported", "()Z", "setFormInteractedEventReported", "(Z)V", "formShownEventReported", "getFormShownEventReported", "setFormShownEventReported", "productUsage", "", "", "attachPaymentMethod", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "customerSession", "Lcom/stripe/android/CustomerSession;", "paymentMethod", "attachPaymentMethod-0E7RQCE$payments_core_release", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createPaymentMethod-gIAlu-s$payments_core_release", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCardNumberCompleted", "", "onCardNumberCompleted$payments_core_release", "onFormInteracted", "onFormInteracted$payments_core_release", "onFormShown", "onFormShown$payments_core_release", "onSaveClicked", "onSaveClicked$payments_core_release", "updatedPaymentMethodCreateParams", "updatedPaymentMethodCreateParams$payments_core_release", "Companion", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class AddPaymentMethodViewModel extends AndroidViewModel {
    private final Args args;
    private final ErrorMessageTranslator errorMessageTranslator;
    private final PaymentSessionEventReporter eventReporter;
    private final Set<String> productUsage;
    private final SavedStateHandle savedStateHandle;
    private final Stripe stripe;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ AddPaymentMethodViewModel(Application application, SavedStateHandle savedStateHandle, Stripe stripe, Args args, ErrorMessageTranslator errorMessageTranslator, PaymentSessionEventReporter paymentSessionEventReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, savedStateHandle, stripe, args, (i & 16) != 0 ? TranslatorManager.INSTANCE.getErrorMessageTranslator() : errorMessageTranslator, (i & 32) != 0 ? PaymentSessionEventReporterFactory.INSTANCE.create(application) : paymentSessionEventReporter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodViewModel(Application application, SavedStateHandle savedStateHandle, Stripe stripe, Args args, ErrorMessageTranslator errorMessageTranslator, PaymentSessionEventReporter eventReporter) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stripe, "stripe");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(errorMessageTranslator, "errorMessageTranslator");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        this.savedStateHandle = savedStateHandle;
        this.stripe = stripe;
        this.args = args;
        this.errorMessageTranslator = errorMessageTranslator;
        this.eventReporter = eventReporter;
        this.productUsage = CollectionsKt.toSet(CollectionsKt.listOfNotNull((Object[]) new String[]{"AddPaymentMethodActivity", args.getIsPaymentSessionActive() ? "PaymentSession" : null}));
        SessionSavedStateHandler.INSTANCE.attachTo(this, savedStateHandle);
        if (getFormShownEventReported()) {
            return;
        }
        eventReporter.onFormShown(args.getPaymentMethodType().code);
        setFormShownEventReported(true);
    }

    private final boolean getFormShownEventReported() {
        Boolean bool = (Boolean) this.savedStateHandle.get("FROM_SHOWN_EVENT_REPORTED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void setFormShownEventReported(boolean z) {
        this.savedStateHandle.set("FROM_SHOWN_EVENT_REPORTED", Boolean.valueOf(z));
    }

    private final boolean getFormInteractedEventReported() {
        Boolean bool = (Boolean) this.savedStateHandle.get("FROM_INTERACTED_EVENT_REPORTED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void setFormInteractedEventReported(boolean z) {
        this.savedStateHandle.set("FROM_INTERACTED_EVENT_REPORTED", Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: createPaymentMethod-gIAlu-s$payments_core_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26956createPaymentMethodgIAlus$payments_core_release(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Result<PaymentMethod>> continuation) {
        AddPaymentMethodViewModel4 addPaymentMethodViewModel4;
        if (continuation instanceof AddPaymentMethodViewModel4) {
            addPaymentMethodViewModel4 = (AddPaymentMethodViewModel4) continuation;
            int i = addPaymentMethodViewModel4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addPaymentMethodViewModel4.label = i - Integer.MIN_VALUE;
            } else {
                addPaymentMethodViewModel4 = new AddPaymentMethodViewModel4(this, continuation);
            }
        }
        Object orThrow = addPaymentMethodViewModel4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = addPaymentMethodViewModel4.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(orThrow);
            addPaymentMethodViewModel4.L$0 = this;
            addPaymentMethodViewModel4.L$1 = paymentMethodCreateParams;
            addPaymentMethodViewModel4.label = 1;
            final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(addPaymentMethodViewModel4));
            Stripe.createPaymentMethod$default(this.stripe, updatedPaymentMethodCreateParams$payments_core_release(paymentMethodCreateParams), null, null, new ApiResultCallback<PaymentMethod>() { // from class: com.stripe.android.view.AddPaymentMethodViewModel$createPaymentMethod$2$1
                @Override // com.stripe.android.ApiResultCallback
                public void onSuccess(PaymentMethod result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    safeContinuationJvm.resumeWith(Result.m28550constructorimpl(Result.m28549boximpl(Result.m28550constructorimpl(result))));
                }

                @Override // com.stripe.android.ApiResultCallback
                public void onError(Exception e) {
                    Intrinsics.checkNotNullParameter(e, "e");
                    Continuation<Result<PaymentMethod>> continuation2 = safeContinuationJvm;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m28550constructorimpl(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(e)))));
                }
            }, 6, null);
            orThrow = safeContinuationJvm.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(addPaymentMethodViewModel4);
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

    public final PaymentMethodCreateParams updatedPaymentMethodCreateParams$payments_core_release(PaymentMethodCreateParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return PaymentMethodCreateParams.copy$default(params, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.productUsage, null, 786431, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: attachPaymentMethod-0E7RQCE$payments_core_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object m26955attachPaymentMethod0E7RQCE$payments_core_release(CustomerSession customerSession, PaymentMethod paymentMethod, Continuation continuation) {
        AddPaymentMethodViewModel2 addPaymentMethodViewModel2;
        if (continuation instanceof AddPaymentMethodViewModel2) {
            addPaymentMethodViewModel2 = (AddPaymentMethodViewModel2) continuation;
            int i = addPaymentMethodViewModel2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addPaymentMethodViewModel2.label = i - Integer.MIN_VALUE;
            } else {
                addPaymentMethodViewModel2 = new AddPaymentMethodViewModel2(this, continuation);
            }
        }
        Object orThrow = addPaymentMethodViewModel2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = addPaymentMethodViewModel2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(orThrow);
            addPaymentMethodViewModel2.L$0 = this;
            addPaymentMethodViewModel2.L$1 = customerSession;
            addPaymentMethodViewModel2.L$2 = paymentMethod;
            addPaymentMethodViewModel2.label = 1;
            final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(addPaymentMethodViewModel2));
            String str = paymentMethod.id;
            if (str == null) {
                str = "";
            }
            customerSession.attachPaymentMethod$payments_core_release(str, this.productUsage, new CustomerSession.PaymentMethodRetrievalListener() { // from class: com.stripe.android.view.AddPaymentMethodViewModel$attachPaymentMethod$2$1
            });
            orThrow = safeContinuationJvm.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(addPaymentMethodViewModel2);
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

    public final void onFormShown$payments_core_release() {
        if (getFormShownEventReported()) {
            return;
        }
        this.eventReporter.onFormShown(this.args.getPaymentMethodType().code);
        setFormShownEventReported(true);
    }

    public final void onFormInteracted$payments_core_release() {
        if (getFormInteractedEventReported()) {
            return;
        }
        this.eventReporter.onFormInteracted(this.args.getPaymentMethodType().code);
        setFormInteractedEventReported(true);
    }

    public final void onCardNumberCompleted$payments_core_release() {
        this.eventReporter.onCardNumberCompleted();
    }

    public final void onSaveClicked$payments_core_release() {
        this.eventReporter.onDoneButtonTapped(this.args.getPaymentMethodType().code);
    }

    /* compiled from: AddPaymentMethodViewModel.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "stripe", "Lcom/stripe/android/Stripe;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final Args args;
        private final Stripe stripe;

        public Factory(Stripe stripe, Args args) {
            Intrinsics.checkNotNullParameter(stripe, "stripe");
            Intrinsics.checkNotNullParameter(args, "args");
            this.stripe = stripe;
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new AddPaymentMethodViewModel(CreationExtrasKtx.requireApplication(extras), SavedStateHandleSupport.createSavedStateHandle(extras), this.stripe, this.args, null, null, 48, null);
        }
    }

    /* compiled from: AddPaymentMethodViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodViewModel$Companion;", "", "()V", "FORM_INTERACTED_EVENT_REPORTED_KEY", "", "FORM_SHOWN_EVENT_REPORTED_KEY", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
