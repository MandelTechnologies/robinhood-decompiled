package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: RemoteCardAccountRangeSource.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcom/stripe/android/cards/RemoteCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "Lcom/stripe/android/cards/CardAccountRangeStore;", "cardAccountRangeStore", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/cards/CardAccountRangeStore;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "", "onCardMetadataMissingRange", "()V", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "", "Lcom/stripe/android/model/AccountRange;", "getAccountRanges", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_loading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class RemoteCardAccountRangeSource implements CardAccountRangeSource {
    private final StateFlow2<Boolean> _loading;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final CardAccountRangeStore cardAccountRangeStore;
    private final StateFlow<Boolean> loading;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final ApiRequest.Options requestOptions;
    private final StripeRepository stripeRepository;

    /* compiled from: RemoteCardAccountRangeSource.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.cards.RemoteCardAccountRangeSource", m3645f = "RemoteCardAccountRangeSource.kt", m3646l = {30}, m3647m = "getAccountRanges")
    /* renamed from: com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRanges$1 */
    static final class C425151 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C425151(Continuation<? super C425151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteCardAccountRangeSource.this.getAccountRanges(null, this);
        }
    }

    public RemoteCardAccountRangeSource(StripeRepository stripeRepository, ApiRequest.Options requestOptions, CardAccountRangeStore cardAccountRangeStore, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(cardAccountRangeStore, "cardAccountRangeStore");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.stripeRepository = stripeRepository;
        this.requestOptions = requestOptions;
        this.cardAccountRangeStore = cardAccountRangeStore;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        StateFlow2<Boolean> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(Boolean.FALSE);
        this._loading = stateFlow2MutableStateFlow;
        this.loading = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public StateFlow<Boolean> getLoading() {
        return this.loading;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.cards.CardAccountRangeSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        C425151 c425151;
        CardNumber.Unvalidated unvalidated2;
        Bin bin;
        Object accountRanges;
        RemoteCardAccountRangeSource remoteCardAccountRangeSource;
        RemoteCardAccountRangeSource remoteCardAccountRangeSource2;
        if (continuation instanceof C425151) {
            c425151 = (C425151) continuation;
            int i = c425151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425151.label = i - Integer.MIN_VALUE;
            } else {
                c425151 = new C425151(continuation);
            }
        }
        Object obj = c425151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Bin bin2 = unvalidated.getBin();
            if (bin2 == null) {
                return null;
            }
            this._loading.setValue(boxing.boxBoolean(true));
            StripeRepository stripeRepository = this.stripeRepository;
            ApiRequest.Options options = this.requestOptions;
            c425151.L$0 = this;
            c425151.L$1 = unvalidated;
            c425151.L$2 = bin2;
            c425151.L$3 = this;
            c425151.label = 1;
            Object objMo26880getCardMetadata0E7RQCE = stripeRepository.mo26880getCardMetadata0E7RQCE(bin2, options, c425151);
            if (objMo26880getCardMetadata0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
            unvalidated2 = unvalidated;
            bin = bin2;
            accountRanges = objMo26880getCardMetadata0E7RQCE;
            remoteCardAccountRangeSource = this;
            remoteCardAccountRangeSource2 = remoteCardAccountRangeSource;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteCardAccountRangeSource = (RemoteCardAccountRangeSource) c425151.L$3;
            bin = (Bin) c425151.L$2;
            unvalidated2 = (CardNumber.Unvalidated) c425151.L$1;
            remoteCardAccountRangeSource2 = (RemoteCardAccountRangeSource) c425151.L$0;
            ResultKt.throwOnFailure(obj);
            accountRanges = ((Result) obj).getValue();
        }
        if (Result.m28556isSuccessimpl(accountRanges)) {
            accountRanges = ((CardMetadata) accountRanges).getAccountRanges();
        }
        Object objM28550constructorimpl = Result.m28550constructorimpl(accountRanges);
        remoteCardAccountRangeSource._loading.setValue(boxing.boxBoolean(false));
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            List<AccountRange> list = (List) objM28550constructorimpl;
            remoteCardAccountRangeSource2.cardAccountRangeStore.save(bin, list);
            if (!list.isEmpty()) {
                List<AccountRange> list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    if (unvalidated2.getIsValidLuhn()) {
                    }
                } else {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((AccountRange) it.next()).getBinRange().matches(unvalidated2)) {
                            break;
                        }
                    }
                    if (unvalidated2.getIsValidLuhn()) {
                        remoteCardAccountRangeSource2.onCardMetadataMissingRange();
                    }
                }
            }
        }
        return (List) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
    }

    private final void onCardMetadataMissingRange() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CardMetadataMissingRange, null, null, null, null, null, 62, null));
    }
}
