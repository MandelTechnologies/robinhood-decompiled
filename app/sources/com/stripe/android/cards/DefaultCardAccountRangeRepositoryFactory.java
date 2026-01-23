package com.stripe.android.cards;

import android.content.Context;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.AccountRange;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.uicore.utils.StateFlows2;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DefaultCardAccountRangeRepositoryFactory.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001c\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "Landroid/content/Context;", "context", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "<init>", "(Landroid/content/Context;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V", "(Landroid/content/Context;)V", "Lcom/stripe/android/cards/CardAccountRangeStore;", PlaceTypes.STORE, "Lcom/stripe/android/cards/CardAccountRangeSource;", "createRemoteCardAccountRangeSource", "(Lcom/stripe/android/cards/CardAccountRangeStore;)Lcom/stripe/android/cards/CardAccountRangeSource;", "", "publishableKey", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "event", "", "fireAnalyticsEvent", "(Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V", "Lcom/stripe/android/cards/CardAccountRangeRepository;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Lcom/stripe/android/cards/CardAccountRangeRepository;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "kotlin.jvm.PlatformType", "appContext", "Landroid/content/Context;", "Lkotlin/Lazy;", "Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;", "cardAccountRangeRepository", "Lkotlin/Lazy;", "NullCardAccountRangeSource", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DefaultCardAccountRangeRepositoryFactory implements CardAccountRangeRepository.Factory {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Context appContext;
    private final Lazy<DefaultCardAccountRangeRepository> cardAccountRangeRepository;

    public DefaultCardAccountRangeRepositoryFactory(Context context, AnalyticsRequestExecutor analyticsRequestExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.appContext = context.getApplicationContext();
        this.cardAccountRangeRepository = LazyKt.lazy(new Function0<DefaultCardAccountRangeRepository>() { // from class: com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory$cardAccountRangeRepository$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DefaultCardAccountRangeRepository invoke() {
                InMemoryCardAccountRangeStore inMemoryCardAccountRangeStore = new InMemoryCardAccountRangeStore();
                return new DefaultCardAccountRangeRepository(new InMemoryCardAccountRangeSource(inMemoryCardAccountRangeStore), this.this$0.createRemoteCardAccountRangeSource(inMemoryCardAccountRangeStore), new StaticCardAccountRangeSource(null, 1, null), inMemoryCardAccountRangeStore);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultCardAccountRangeRepositoryFactory(Context context) {
        this(context, new DefaultAnalyticsRequestExecutor());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public CardAccountRangeRepository create() throws IllegalStateException {
        return this.cardAccountRangeRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardAccountRangeSource createRemoteCardAccountRangeSource(CardAccountRangeStore store) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            PaymentConfiguration.Companion companion2 = PaymentConfiguration.INSTANCE;
            Context appContext = this.appContext;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            objM28550constructorimpl = Result.m28550constructorimpl(companion2.getInstance(appContext).getPublishableKey());
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            fireAnalyticsEvent((String) objM28550constructorimpl, PaymentAnalyticsEvent.CardMetadataPublishableKeyAvailable);
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
            fireAnalyticsEvent("pk_undefined", PaymentAnalyticsEvent.CardMetadataPublishableKeyUnavailable);
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            final String str = (String) objM28550constructorimpl;
            Context appContext2 = this.appContext;
            Intrinsics.checkNotNullExpressionValue(appContext2, "appContext");
            StripeApiRepository stripeApiRepository = new StripeApiRepository(appContext2, new Function0<String>() { // from class: com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory$createRemoteCardAccountRangeSource$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return str;
                }
            }, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
            ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor();
            Context appContext3 = this.appContext;
            Intrinsics.checkNotNullExpressionValue(appContext3, "appContext");
            return new RemoteCardAccountRangeSource(stripeApiRepository, options, store, defaultAnalyticsRequestExecutor, new PaymentAnalyticsRequestFactory(appContext3, str, null, 4, null));
        }
        return new NullCardAccountRangeSource();
    }

    private final void fireAnalyticsEvent(String publishableKey, PaymentAnalyticsEvent event) {
        AnalyticsRequestExecutor analyticsRequestExecutor = this.analyticsRequestExecutor;
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(new PaymentAnalyticsRequestFactory(appContext, publishableKey, null, 4, null), event, null, null, null, null, null, 62, null));
    }

    /* compiled from: DefaultCardAccountRangeRepositoryFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory$NullCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "()V", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "getAccountRanges", "", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class NullCardAccountRangeSource implements CardAccountRangeSource {
        private final StateFlow<Boolean> loading = StateFlows2.stateFlowOf(Boolean.FALSE);

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
            return null;
        }

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public StateFlow<Boolean> getLoading() {
            return this.loading;
        }
    }
}
