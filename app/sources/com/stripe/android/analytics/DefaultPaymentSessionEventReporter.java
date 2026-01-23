package com.stripe.android.analytics;

import com.stripe.android.analytics.PaymentSessionEvent;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: DefaultPaymentSessionEventReporter.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B+\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u001b\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/analytics/DefaultPaymentSessionEventReporter;", "Lcom/stripe/android/analytics/PaymentSessionEventReporter;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/core/utils/DurationProvider;", "durationProvider", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/utils/DurationProvider;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/analytics/PaymentSessionEvent;", "event", "", "fireEvent", "(Lcom/stripe/android/analytics/PaymentSessionEvent;)V", "onLoadStarted", "()V", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "onFormShown", "(Ljava/lang/String;)V", "onFormInteracted", "onCardNumberCompleted", "onDoneButtonTapped", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/core/utils/DurationProvider;", "Lkotlin/coroutines/CoroutineContext;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DefaultPaymentSessionEventReporter implements PaymentSessionEventReporter {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final DurationProvider durationProvider;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final CoroutineContext workContext;

    public DefaultPaymentSessionEventReporter(AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, DurationProvider durationProvider, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(durationProvider, "durationProvider");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.durationProvider = durationProvider;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.analytics.PaymentSessionEventReporter
    public void onLoadStarted() {
        DurationProvider.DefaultImpls.start$default(this.durationProvider, DurationProvider.Key.Loading, false, 2, null);
        fireEvent(new PaymentSessionEvent.LoadStarted());
    }

    @Override // com.stripe.android.analytics.PaymentSessionEventReporter
    public void onFormShown(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        DurationProvider.DefaultImpls.start$default(this.durationProvider, DurationProvider.Key.ConfirmButtonClicked, false, 2, null);
        fireEvent(new PaymentSessionEvent.ShowPaymentOptionForm(code));
    }

    @Override // com.stripe.android.analytics.PaymentSessionEventReporter
    public void onFormInteracted(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        fireEvent(new PaymentSessionEvent.PaymentOptionFormInteraction(code));
    }

    @Override // com.stripe.android.analytics.PaymentSessionEventReporter
    public void onCardNumberCompleted() {
        fireEvent(new PaymentSessionEvent.CardNumberCompleted());
    }

    @Override // com.stripe.android.analytics.PaymentSessionEventReporter
    public void onDoneButtonTapped(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        fireEvent(new PaymentSessionEvent.TapDoneButton(code, this.durationProvider.mo26848endLV8wdWc(DurationProvider.Key.ConfirmButtonClicked), null));
    }

    /* compiled from: DefaultPaymentSessionEventReporter.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.analytics.DefaultPaymentSessionEventReporter$fireEvent$1", m3645f = "DefaultPaymentSessionEventReporter.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.analytics.DefaultPaymentSessionEventReporter$fireEvent$1 */
    static final class C425091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentSessionEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425091(PaymentSessionEvent paymentSessionEvent, Continuation<? super C425091> continuation) {
            super(2, continuation);
            this.$event = paymentSessionEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultPaymentSessionEventReporter.this.new C425091(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AnalyticsRequestExecutor analyticsRequestExecutor = DefaultPaymentSessionEventReporter.this.analyticsRequestExecutor;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = DefaultPaymentSessionEventReporter.this.paymentAnalyticsRequestFactory;
                PaymentSessionEvent paymentSessionEvent = this.$event;
                analyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.createRequest(paymentSessionEvent, paymentSessionEvent.getAdditionalParams()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void fireEvent(PaymentSessionEvent event) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(this.workContext), null, null, new C425091(event, null), 3, null);
    }
}
