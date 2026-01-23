package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.networking.ConnectionFactory;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: DefaultStripeNetworkClient.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B;\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJF\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u001c\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u001fH\u0081@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(¨\u0006*"}, m3636d2 = {"Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lcom/stripe/android/core/networking/ConnectionFactory;", "connectionFactory", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "retryDelaySupplier", "", "maxRetries", "Lcom/stripe/android/core/Logger;", "logger", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;)V", "Lcom/stripe/android/core/networking/StripeRequest;", "request", "Lcom/stripe/android/core/networking/StripeResponse;", "", "makeRequest", "(Lcom/stripe/android/core/networking/StripeRequest;)Lcom/stripe/android/core/networking/StripeResponse;", "BodyType", "Lcom/stripe/android/core/networking/StripeConnection;", "connection", "baseUrl", "parseResponse", "(Lcom/stripe/android/core/networking/StripeConnection;Ljava/lang/String;)Lcom/stripe/android/core/networking/StripeResponse;", "executeRequest", "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remainingRetries", "", "retryResponseCodes", "Lkotlin/Function0;", "requester", "executeInternal$stripe_core_release", "(ILjava/lang/Iterable;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInternal", "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/core/networking/ConnectionFactory;", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "I", "Lcom/stripe/android/core/Logger;", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DefaultStripeNetworkClient implements StripeNetworkClient {
    private static final Companion Companion = new Companion(null);
    private final ConnectionFactory connectionFactory;
    private final Logger logger;
    private final int maxRetries;
    private final RetryDelaySupplier retryDelaySupplier;
    private final CoroutineContext workContext;

    @JvmOverloads
    public DefaultStripeNetworkClient(CoroutineContext workContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier, int i, Logger logger) {
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(retryDelaySupplier, "retryDelaySupplier");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.workContext = workContext;
        this.connectionFactory = connectionFactory;
        this.retryDelaySupplier = retryDelaySupplier;
        this.maxRetries = i;
        this.logger = logger;
    }

    public /* synthetic */ DefaultStripeNetworkClient(CoroutineContext coroutineContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier, int i, Logger logger, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dispatchers.getIO() : coroutineContext, (i2 & 2) != 0 ? ConnectionFactory.Default.INSTANCE : connectionFactory, (i2 & 4) != 0 ? new ExponentialBackoffRetryDelaySupplier() : retryDelaySupplier, (i2 & 8) != 0 ? 3 : i, (i2 & 16) != 0 ? Logger.INSTANCE.noop() : logger);
    }

    @Override // com.stripe.android.core.networking.StripeNetworkClient
    public Object executeRequest(final StripeRequest stripeRequest, Continuation<? super StripeResponse<String>> continuation) {
        return executeInternal$stripe_core_release(this.maxRetries, stripeRequest.getRetryResponseCodes(), new Function0<StripeResponse<String>>() { // from class: com.stripe.android.core.networking.DefaultStripeNetworkClient.executeRequest.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final StripeResponse<String> invoke() {
                return DefaultStripeNetworkClient.this.makeRequest(stripeRequest);
            }
        }, continuation);
    }

    public final <BodyType> Object executeInternal$stripe_core_release(int i, Iterable<Integer> iterable, Function0<StripeResponse<BodyType>> function0, Continuation<? super StripeResponse<BodyType>> continuation) {
        return BuildersKt.withContext(this.workContext, new DefaultStripeNetworkClient2(function0, iterable, i, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeResponse<String> makeRequest(StripeRequest request) {
        return parseResponse(this.connectionFactory.create(request), request.getUrl());
    }

    private final <BodyType> StripeResponse<BodyType> parseResponse(StripeConnection<BodyType> connection, String baseUrl) throws Throwable {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeResponse<BodyType> response = connection.getResponse();
            this.logger.info(response.toString());
            objM28550constructorimpl = Result.m28550constructorimpl(response);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            this.logger.error("Exception while making Stripe API request", thM28553exceptionOrNullimpl);
            if (thM28553exceptionOrNullimpl instanceof IOException) {
                throw APIConnectionException.INSTANCE.create((IOException) thM28553exceptionOrNullimpl, baseUrl);
            }
            throw thM28553exceptionOrNullimpl;
        }
        return (StripeResponse) objM28550constructorimpl;
    }

    /* compiled from: DefaultStripeNetworkClient.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$Companion;", "", "()V", "DEFAULT_MAX_RETRIES", "", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
