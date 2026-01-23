package com.truelayer.payments.core.network.payments.api;

import android.util.Log;
import com.jakewharton.retrofit2.converter.kotlinx.serialization.Factory2;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.domain.configuration.HttpConnectionConfiguration2;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.NetworkError;
import com.truelayer.payments.core.network.common.Request2;
import com.truelayer.payments.core.network.payments.entity.PaymentApiError;
import com.truelayer.payments.core.network.payments.entity.request.StartAuthorizationFlowRequest;
import com.truelayer.payments.core.network.payments.entity.request.SubmitConsentRequest;
import com.truelayer.payments.core.network.payments.entity.request.SubmitFormRequest;
import com.truelayer.payments.core.network.payments.entity.request.SubmitProviderSelectionRequest;
import com.truelayer.payments.core.network.payments.entity.request.SubmitSchemeSelectionRequest;
import com.truelayer.payments.core.network.payments.entity.request.SubmitUserAccountSelectionRequest;
import com.truelayer.payments.core.network.payments.entity.response.PaymentResponse;
import com.truelayer.payments.core.network.payments.entity.shared.PaymentProviderDetails;
import com.truelayer.payments.core.utils.ErrorUtils2;
import com.truelayer.payments.core.utils.ExtensionsKt;
import com.truelayer.payments.core.utils.JsonConverter2;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;

/* compiled from: PaymentApiImpl.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J4\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0012J<\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0019J2\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ4\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0012J<\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J4\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0012JH\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0(H\u0096@¢\u0006\u0002\u0010)J<\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0016J<\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0016J<\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0016J4\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/api/PaymentApiImpl;", "Lcom/truelayer/payments/core/network/payments/api/PaymentApi;", "uri", "Lokhttp3/HttpUrl;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)V", "apiService", "Lcom/truelayer/payments/core/network/payments/api/PaymentApiService;", "cancelPayment", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "resourceToken", "", "idempotencyKey", "Ljava/util/UUID;", "paymentId", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSavedUserAccount", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "userAccountId", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayment", "Lcom/truelayer/payments/core/domain/payments/Payment;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "providerId", "paymentType", "Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserAccount", "startAuthorizationFlow", "payload", "Lcom/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitConsent", "submitForm", "inputs", "", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitProviderSelection", "submitSchemeSelection", "schemeId", "submitUserAccountSelection", "useNewUserAccount", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PaymentApiImpl implements PaymentApi {
    private final PaymentApiService apiService;

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, 75}, m3647m = "cancelPayment")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$cancelPayment$1 */
    static final class C427751 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C427751(Continuation<? super C427751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.cancelPayment(null, null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "deleteSavedUserAccount")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$deleteSavedUserAccount$1 */
    static final class C427761 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C427761(Continuation<? super C427761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.deleteSavedUserAccount(null, null, null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, 56}, m3647m = "getPayment")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$getPayment$1 */
    static final class C427771 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C427771(Continuation<? super C427771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.getPayment(null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, 202}, m3647m = "getPaymentProvider")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$getPaymentProvider$1 */
    static final class C427781 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C427781(Continuation<? super C427781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.getPaymentProvider(null, null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC7081g.f2777x89a9e432}, m3647m = "saveUserAccount")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$saveUserAccount$1 */
    static final class C427791 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C427791(Continuation<? super C427791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.saveUserAccount(null, null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, 94}, m3647m = "startAuthorizationFlow")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$startAuthorizationFlow$1 */
    static final class C427801 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C427801(Continuation<? super C427801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.startAuthorizationFlow(null, null, null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "submitConsent")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$submitConsent$1 */
    static final class C427811 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C427811(Continuation<? super C427811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.submitConsent(null, null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "submitForm")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$submitForm$1 */
    static final class C427821 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C427821(Continuation<? super C427821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.submitForm(null, null, null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, 116}, m3647m = "submitProviderSelection")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$submitProviderSelection$1 */
    static final class C427831 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C427831(Continuation<? super C427831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.submitProviderSelection(null, null, null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "submitSchemeSelection")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$submitSchemeSelection$1 */
    static final class C427841 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C427841(Continuation<? super C427841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.submitSchemeSelection(null, null, null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "submitUserAccountSelection")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$submitUserAccountSelection$1 */
    static final class C427851 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C427851(Continuation<? super C427851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.submitUserAccountSelection(null, null, null, null, this);
        }
    }

    /* compiled from: PaymentApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.payments.api.PaymentApiImpl", m3645f = "PaymentApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE}, m3647m = "useNewUserAccount")
    /* renamed from: com.truelayer.payments.core.network.payments.api.PaymentApiImpl$useNewUserAccount$1 */
    static final class C427861 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C427861(Continuation<? super C427861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiImpl.this.useNewUserAccount(null, null, null, this);
        }
    }

    public PaymentApiImpl(HttpUrl uri, OkHttpClient client) throws SecurityException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(client, "client");
        Object objCreate = new Retrofit.Builder().client(client).addConverterFactory(Factory2.create(JsonConverter2.getJsonDefault(), MediaType.INSTANCE.get("application/json"))).baseUrl(uri).build().create(PaymentApiService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.apiService = (PaymentApiService) objCreate;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:123)|48|49|129|50|51|125|52|53|121|54|55|131|56) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:123|48|49|129|50|51|125|52|53|121|54|55|131|56) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01af, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b2, code lost:
    
        r12 = r16;
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b6, code lost:
    
        r14 = r18;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01bc, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01be, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bf, code lost:
    
        r13 = r12;
        r8 = r12;
        r12 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d3, code lost:
    
        if (r12.code() < 500) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d5, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01db, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r13, r14, r15));
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d5 A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:13:0x0040, B:30:0x00a7, B:32:0x00b4, B:74:0x01ec, B:23:0x0074, B:27:0x008f, B:33:0x00c4, B:35:0x00ca, B:37:0x00d3, B:39:0x00ef, B:40:0x0132, B:42:0x013c, B:43:0x014e, B:45:0x016d, B:69:0x01cd, B:71:0x01d5, B:72:0x01db, B:73:0x01e7, B:20:0x0065), top: B:127:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01db A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:13:0x0040, B:30:0x00a7, B:32:0x00b4, B:74:0x01ec, B:23:0x0074, B:27:0x008f, B:33:0x00c4, B:35:0x00ca, B:37:0x00d3, B:39:0x00ef, B:40:0x0132, B:42:0x013c, B:43:0x014e, B:45:0x016d, B:69:0x01cd, B:71:0x01d5, B:72:0x01db, B:73:0x01e7, B:20:0x0065), top: B:127:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a4 -> B:14:0x0043). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPayment(String str, String str2, Continuation<? super Outcome<? extends Payment, ? extends CoreError>> continuation) {
        C427771 c427771;
        PaymentApiImpl paymentApiImpl;
        String str3;
        Object validationError;
        Object fail;
        int i;
        C427771 c4277712;
        PaymentApiImpl paymentApiImpl2;
        String str4;
        String str5;
        PaymentApiImpl paymentApiImpl3;
        String str6;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        int i5;
        NetworkError.HttpError httpError;
        String str8;
        String str9;
        String str10;
        if (continuation instanceof C427771) {
            c427771 = (C427771) continuation;
            int i6 = c427771.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427771.label = i6 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427771 = paymentApiImpl.new C427771(continuation);
            }
        }
        Object payment = c427771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427771.label;
        int i8 = 2;
        int i9 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(payment);
            i = 0;
            c4277712 = c427771;
            paymentApiImpl2 = paymentApiImpl;
            str4 = str;
            str5 = str2;
            jDelayTime = Request2.delayTime(i);
            c4277712.L$0 = paymentApiImpl2;
            c4277712.L$1 = str4;
            c4277712.L$2 = str5;
            c4277712.I$0 = i;
            c4277712.label = i9;
            if (DelayKt.delay(jDelayTime, c4277712) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427771.I$0;
                str7 = (String) c427771.L$2;
                str6 = (String) c427771.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427771.L$0;
                ResultKt.throwOnFailure(payment);
                String str11 = str7;
                C427771 c4277713 = c427771;
                str5 = str11;
                PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
                Response response = (Response) payment;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
                    i5 = i3;
                    i4 = iCode;
                } else {
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    String str12 = response.headers().get("tl-trace-id");
                    String url = response.raw().getRequest().getUrl().getUrl();
                    if (i3 > 0) {
                        TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str12, url, 17, null));
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                    }
                    i4 = iCode;
                    int i10 = i3;
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i10, strString, str12, url, 6, null);
                    String str13 = strString;
                    if (str13 == null || str13.length() == 0) {
                        i5 = i10;
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            httpError = httpError2;
                            str8 = str12;
                            str9 = url;
                            str10 = str13;
                            i5 = i10;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str13), i10, str13, str12, url, 2, null);
                        i5 = i10;
                        str10 = str13;
                        str8 = str12;
                        str9 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    c4277712 = c4277713;
                    str4 = str6;
                    i = i5;
                    paymentApiImpl2 = paymentApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4277712.L$0 = paymentApiImpl2;
                    c4277712.L$1 = str4;
                    c4277712.L$2 = str5;
                    c4277712.I$0 = i;
                    c4277712.label = i9;
                    if (DelayKt.delay(jDelayTime, c4277712) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    str7 = str5;
                    c427771 = c4277712;
                    i2 = i11;
                    paymentApiImpl3 = paymentApiImpl2;
                    str6 = str4;
                    i3 = i2 + i9;
                    PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str6);
                    c427771.L$0 = paymentApiImpl3;
                    c427771.L$1 = str6;
                    c427771.L$2 = str7;
                    c427771.I$0 = i3;
                    c427771.label = i8;
                    payment = paymentApiService.getPayment(bearerToken, str7, c427771);
                }
                if (fail instanceof Ok) {
                    fail = new Ok(((PaymentResponse) ((Ok) fail).getValue()).intoDomain2());
                } else if (!(fail instanceof Fail)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (fail instanceof Ok) {
                    return fail;
                }
                if (fail instanceof Fail) {
                    return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
                }
                throw new NoWhenBranchMatchedException();
            }
            i2 = c427771.I$0;
            str7 = (String) c427771.L$2;
            str6 = (String) c427771.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427771.L$0;
            ResultKt.throwOnFailure(payment);
            i3 = i2 + i9;
            PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str6);
            c427771.L$0 = paymentApiImpl3;
            c427771.L$1 = str6;
            c427771.L$2 = str7;
            c427771.I$0 = i3;
            c427771.label = i8;
            payment = paymentApiService2.getPayment(bearerToken2, str7, c427771);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:123)|52|53|117|54|55|121|56|57|119|58) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ca, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01cb, code lost:
    
        r37 = r23;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d1, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d7, code lost:
    
        r37 = r23;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01db, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ea, code lost:
    
        if (r13.code() >= 500) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ec, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f2, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:34:0x00bf, B:36:0x00cc, B:75:0x0203, B:23:0x007f, B:27:0x009d, B:29:0x00a6, B:31:0x00ac, B:37:0x00de, B:39:0x00e4, B:41:0x00ed, B:43:0x0109, B:44:0x014c, B:46:0x0156, B:47:0x0168, B:49:0x0180, B:70:0x01e4, B:72:0x01ec, B:73:0x01f2, B:74:0x01fe, B:20:0x006e), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:34:0x00bf, B:36:0x00cc, B:75:0x0203, B:23:0x007f, B:27:0x009d, B:29:0x00a6, B:31:0x00ac, B:37:0x00de, B:39:0x00e4, B:41:0x00ed, B:43:0x0109, B:44:0x014c, B:46:0x0156, B:47:0x0168, B:49:0x0180, B:70:0x01e4, B:72:0x01ec, B:73:0x01f2, B:74:0x01fe, B:20:0x006e), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f2 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:34:0x00bf, B:36:0x00cc, B:75:0x0203, B:23:0x007f, B:27:0x009d, B:29:0x00a6, B:31:0x00ac, B:37:0x00de, B:39:0x00e4, B:41:0x00ed, B:43:0x0109, B:44:0x014c, B:46:0x0156, B:47:0x0168, B:49:0x0180, B:70:0x01e4, B:72:0x01ec, B:73:0x01f2, B:74:0x01fe, B:20:0x006e), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bc -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object cancelPayment(String str, UUID uuid, String str2, Continuation<? super Outcome<Unit, ? extends CoreError>> continuation) {
        C427751 c427751;
        PaymentApiImpl paymentApiImpl;
        String str3;
        Object validationError;
        Object fail;
        String str4;
        int i;
        C427751 c4277512;
        PaymentApiImpl paymentApiImpl2;
        String str5;
        UUID uuid2;
        PaymentApiImpl paymentApiImpl3;
        String str6;
        UUID uuid3;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        int i5;
        String str8;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427751) {
            c427751 = (C427751) continuation;
            int i6 = c427751.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427751.label = i6 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427751 = paymentApiImpl.new C427751(continuation);
            }
        }
        Object objCancelPayment = c427751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427751.label;
        int i8 = 2;
        int i9 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(objCancelPayment);
            str4 = str2;
            i = 0;
            c4277512 = c427751;
            paymentApiImpl2 = paymentApiImpl;
            str5 = str;
            uuid2 = uuid;
            jDelayTime = Request2.delayTime(i);
            c4277512.L$0 = paymentApiImpl2;
            c4277512.L$1 = str5;
            c4277512.L$2 = uuid2;
            c4277512.L$3 = str4;
            c4277512.I$0 = i;
            c4277512.label = i9;
            if (DelayKt.delay(jDelayTime, c4277512) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427751.I$0;
                str7 = (String) c427751.L$3;
                uuid3 = (UUID) c427751.L$2;
                str6 = (String) c427751.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427751.L$0;
                ResultKt.throwOnFailure(objCancelPayment);
                UUID uuid5 = uuid3;
                C427751 c4277513 = c427751;
                PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
                Response response = (Response) objCancelPayment;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
                    uuid4 = uuid5;
                    i5 = i3;
                    i4 = iCode;
                } else {
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    String str9 = response.headers().get("tl-trace-id");
                    String url = response.raw().getRequest().getUrl().getUrl();
                    if (i3 > 0) {
                        TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str9, url, 17, null));
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                    }
                    i4 = iCode;
                    int i10 = i3;
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i10, strString, str9, url, 6, null);
                    String str10 = strString;
                    if (str10 == null || str10.length() == 0) {
                        uuid4 = uuid5;
                        i5 = i10;
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            uuid4 = uuid5;
                            str8 = str10;
                            httpError = httpError2;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        Object objDecodeFromString = jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str10);
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, objDecodeFromString, i10, str10, str9, url, 2, null);
                        uuid4 = uuid5;
                        i5 = i10;
                        str8 = str10;
                        String str11 = str9;
                        String str12 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    uuid2 = uuid4;
                    str4 = str7;
                    c4277512 = c4277513;
                    str5 = str6;
                    i = i5;
                    paymentApiImpl2 = paymentApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4277512.L$0 = paymentApiImpl2;
                    c4277512.L$1 = str5;
                    c4277512.L$2 = uuid2;
                    c4277512.L$3 = str4;
                    c4277512.I$0 = i;
                    c4277512.label = i9;
                    if (DelayKt.delay(jDelayTime, c4277512) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    uuid3 = uuid2;
                    c427751 = c4277512;
                    str7 = str4;
                    i2 = i11;
                    paymentApiImpl3 = paymentApiImpl2;
                    str6 = str5;
                    i3 = i2 + i9;
                    PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str6);
                    String string2 = uuid3 == null ? uuid3.toString() : null;
                    c427751.L$0 = paymentApiImpl3;
                    c427751.L$1 = str6;
                    c427751.L$2 = uuid3;
                    c427751.L$3 = str7;
                    c427751.I$0 = i3;
                    c427751.label = i8;
                    objCancelPayment = paymentApiService.cancelPayment(bearerToken, string2, str7, c427751);
                }
                if (!(fail instanceof Ok)) {
                    return fail;
                }
                if (fail instanceof Fail) {
                    return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
                }
                throw new NoWhenBranchMatchedException();
            }
            i2 = c427751.I$0;
            str7 = (String) c427751.L$3;
            uuid3 = (UUID) c427751.L$2;
            str6 = (String) c427751.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427751.L$0;
            ResultKt.throwOnFailure(objCancelPayment);
            i3 = i2 + i9;
            PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str6);
            if (uuid3 == null) {
            }
            c427751.L$0 = paymentApiImpl3;
            c427751.L$1 = str6;
            c427751.L$2 = uuid3;
            c427751.L$3 = str7;
            c427751.I$0 = i3;
            c427751.label = i8;
            objCancelPayment = paymentApiService2.cancelPayment(bearerToken2, string2, str7, c427751);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:119|54|55|123|56|57|121|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e5, code lost:
    
        r37 = r1;
        r4 = r18;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01eb, code lost:
    
        r15 = r20;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fd, code lost:
    
        if (r14.code() < 500) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ff, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0205, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00df, B:38:0x00ec, B:72:0x0216, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x00fd, B:41:0x0103, B:43:0x010c, B:45:0x0128, B:46:0x016b, B:48:0x0175, B:49:0x0187, B:51:0x01a1, B:67:0x01f7, B:69:0x01ff, B:70:0x0205, B:71:0x0211, B:21:0x0076), top: B:125:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00df, B:38:0x00ec, B:72:0x0216, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x00fd, B:41:0x0103, B:43:0x010c, B:45:0x0128, B:46:0x016b, B:48:0x0175, B:49:0x0187, B:51:0x01a1, B:67:0x01f7, B:69:0x01ff, B:70:0x0205, B:71:0x0211, B:21:0x0076), top: B:125:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00df, B:38:0x00ec, B:72:0x0216, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x00fd, B:41:0x0103, B:43:0x010c, B:45:0x0128, B:46:0x016b, B:48:0x0175, B:49:0x0187, B:51:0x01a1, B:67:0x01f7, B:69:0x01ff, B:70:0x0205, B:71:0x0211, B:21:0x0076), top: B:125:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00df, B:38:0x00ec, B:72:0x0216, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x00fd, B:41:0x0103, B:43:0x010c, B:45:0x0128, B:46:0x016b, B:48:0x0175, B:49:0x0187, B:51:0x01a1, B:67:0x01f7, B:69:0x01ff, B:70:0x0205, B:71:0x0211, B:21:0x0076), top: B:125:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0205 A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00df, B:38:0x00ec, B:72:0x0216, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x00fd, B:41:0x0103, B:43:0x010c, B:45:0x0128, B:46:0x016b, B:48:0x0175, B:49:0x0187, B:51:0x01a1, B:67:0x01f7, B:69:0x01ff, B:70:0x0205, B:71:0x0211, B:21:0x0076), top: B:125:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:15:0x0050). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startAuthorizationFlow(String str, UUID uuid, String str2, StartAuthorizationFlowRequest startAuthorizationFlowRequest, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427801 c427801;
        PaymentApiImpl paymentApiImpl;
        String str3;
        Object validationError;
        Object fail;
        String str4;
        StartAuthorizationFlowRequest startAuthorizationFlowRequest2;
        int i;
        C427801 c4278012;
        PaymentApiImpl paymentApiImpl2;
        String str5;
        UUID uuid2;
        PaymentApiImpl paymentApiImpl3;
        String str6;
        UUID uuid3;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        String str8;
        if (continuation instanceof C427801) {
            c427801 = (C427801) continuation;
            int i5 = c427801.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c427801.label = i5 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427801 = paymentApiImpl.new C427801(continuation);
            }
        }
        Object objStartAuthorizationFlow = c427801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c427801.label;
        int i7 = 2;
        int i8 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = c427801.I$0;
                startAuthorizationFlowRequest2 = (StartAuthorizationFlowRequest) c427801.L$4;
                str7 = (String) c427801.L$3;
                uuid3 = (UUID) c427801.L$2;
                str6 = (String) c427801.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427801.L$0;
                ResultKt.throwOnFailure(objStartAuthorizationFlow);
                i3 = i2 + i8;
                PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str6);
                if (uuid3 == null) {
                }
                c427801.L$0 = paymentApiImpl3;
                c427801.L$1 = str6;
                c427801.L$2 = uuid3;
                c427801.L$3 = str7;
                c427801.L$4 = startAuthorizationFlowRequest2;
                c427801.I$0 = i3;
                c427801.label = i7;
                C427801 c4278013 = c427801;
                StartAuthorizationFlowRequest startAuthorizationFlowRequest3 = startAuthorizationFlowRequest2;
                String str9 = str7;
                objStartAuthorizationFlow = paymentApiService.startAuthorizationFlow(bearerToken, string, str9, startAuthorizationFlowRequest3, c4278013);
                if (objStartAuthorizationFlow != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427801.I$0;
            startAuthorizationFlowRequest2 = (StartAuthorizationFlowRequest) c427801.L$4;
            String str10 = (String) c427801.L$3;
            UUID uuid5 = (UUID) c427801.L$2;
            str6 = (String) c427801.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427801.L$0;
            ResultKt.throwOnFailure(objStartAuthorizationFlow);
            C427801 c4278014 = c427801;
            UUID uuid6 = uuid5;
            PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
            Response response = (Response) objStartAuthorizationFlow;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str11 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str11, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i9 = i3;
                NetworkError.HttpError httpError = new NetworkError.HttpError(response.code(), null, null, i9, strString, str11, url, 6, null);
                String str12 = strString;
                if (str12 == null || str12.length() == 0) {
                    uuid4 = uuid6;
                    i3 = i9;
                    fail = new Fail(httpError);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str8 = str12;
                        i3 = i9;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str12), i9, str12, str11, url, 2, null);
                    uuid4 = uuid6;
                    i3 = i9;
                    str8 = str12;
                    String str13 = str11;
                    String str14 = url;
                    fail = new Fail(httpError2);
                }
            }
            if (Request2.shouldRetry(i3, i4)) {
                C427801 c4278015 = c4278014;
                i = i3;
                str4 = str10;
                c4278012 = c4278015;
                uuid2 = uuid4;
                str5 = str6;
                paymentApiImpl2 = paymentApiImpl4;
                i7 = 2;
                i8 = 1;
                jDelayTime = Request2.delayTime(i);
                c4278012.L$0 = paymentApiImpl2;
                c4278012.L$1 = str5;
                c4278012.L$2 = uuid2;
                c4278012.L$3 = str4;
                c4278012.L$4 = startAuthorizationFlowRequest2;
                c4278012.I$0 = i;
                c4278012.label = i8;
                if (DelayKt.delay(jDelayTime, c4278012) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i10 = i;
                uuid3 = uuid2;
                c427801 = c4278012;
                str7 = str4;
                i2 = i10;
                paymentApiImpl3 = paymentApiImpl2;
                str6 = str5;
                i3 = i2 + i8;
                PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str6);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                c427801.L$0 = paymentApiImpl3;
                c427801.L$1 = str6;
                c427801.L$2 = uuid3;
                c427801.L$3 = str7;
                c427801.L$4 = startAuthorizationFlowRequest2;
                c427801.I$0 = i3;
                c427801.label = i7;
                C427801 c42780132 = c427801;
                StartAuthorizationFlowRequest startAuthorizationFlowRequest32 = startAuthorizationFlowRequest2;
                String str92 = str7;
                objStartAuthorizationFlow = paymentApiService2.startAuthorizationFlow(bearerToken2, string2, str92, startAuthorizationFlowRequest32, c42780132);
                if (objStartAuthorizationFlow != coroutine_suspended) {
                    uuid6 = uuid3;
                    str10 = str92;
                    startAuthorizationFlowRequest2 = startAuthorizationFlowRequest32;
                    c4278014 = c42780132;
                    PaymentApiImpl paymentApiImpl42 = paymentApiImpl3;
                    Response response2 = (Response) objStartAuthorizationFlow;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i3, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (fail instanceof Ok) {
                fail = new Ok(((com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fail instanceof Ok) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objStartAuthorizationFlow);
        str4 = str2;
        startAuthorizationFlowRequest2 = startAuthorizationFlowRequest;
        i = 0;
        c4278012 = c427801;
        paymentApiImpl2 = paymentApiImpl;
        str5 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4278012.L$0 = paymentApiImpl2;
        c4278012.L$1 = str5;
        c4278012.L$2 = uuid2;
        c4278012.L$3 = str4;
        c4278012.L$4 = startAuthorizationFlowRequest2;
        c4278012.I$0 = i;
        c4278012.label = i8;
        if (DelayKt.delay(jDelayTime, c4278012) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:119|54|55|125|56|57|123|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e8, code lost:
    
        r37 = r1;
        r4 = r18;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
    
        r15 = r20;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0200, code lost:
    
        if (r14.code() < 500) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0202, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0208 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:15:0x0050). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitProviderSelection(String str, UUID uuid, String str2, String str3, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427831 c427831;
        PaymentApiImpl paymentApiImpl;
        String str4;
        Object validationError;
        Object fail;
        String str5;
        String str6;
        int i;
        C427831 c4278312;
        PaymentApiImpl paymentApiImpl2;
        String str7;
        UUID uuid2;
        PaymentApiImpl paymentApiImpl3;
        String str8;
        UUID uuid3;
        String str9;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        String str10;
        if (continuation instanceof C427831) {
            c427831 = (C427831) continuation;
            int i5 = c427831.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c427831.label = i5 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427831 = paymentApiImpl.new C427831(continuation);
            }
        }
        Object objSubmitProviderSelection = c427831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c427831.label;
        int i7 = 2;
        int i8 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str4 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str4 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str4, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str4, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str4, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = c427831.I$0;
                str6 = (String) c427831.L$4;
                str9 = (String) c427831.L$3;
                uuid3 = (UUID) c427831.L$2;
                str8 = (String) c427831.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427831.L$0;
                ResultKt.throwOnFailure(objSubmitProviderSelection);
                i3 = i2 + i8;
                PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str8);
                if (uuid3 == null) {
                }
                SubmitProviderSelectionRequest submitProviderSelectionRequest = new SubmitProviderSelectionRequest(str6);
                c427831.L$0 = paymentApiImpl3;
                c427831.L$1 = str8;
                c427831.L$2 = uuid3;
                c427831.L$3 = str9;
                c427831.L$4 = str6;
                c427831.I$0 = i3;
                c427831.label = i7;
                C427831 c4278313 = c427831;
                String str11 = str9;
                objSubmitProviderSelection = paymentApiService.submitProviderSelection(bearerToken, string, str11, submitProviderSelectionRequest, c4278313);
                if (objSubmitProviderSelection != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427831.I$0;
            str6 = (String) c427831.L$4;
            String str12 = (String) c427831.L$3;
            UUID uuid5 = (UUID) c427831.L$2;
            str8 = (String) c427831.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427831.L$0;
            ResultKt.throwOnFailure(objSubmitProviderSelection);
            C427831 c4278314 = c427831;
            UUID uuid6 = uuid5;
            PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
            Response response = (Response) objSubmitProviderSelection;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str13 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str13, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i9 = i3;
                NetworkError.HttpError httpError = new NetworkError.HttpError(response.code(), null, null, i9, strString, str13, url, 6, null);
                String str14 = strString;
                if (str14 == null || str14.length() == 0) {
                    uuid4 = uuid6;
                    i3 = i9;
                    fail = new Fail(httpError);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str10 = str14;
                        i3 = i9;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str14), i9, str14, str13, url, 2, null);
                    uuid4 = uuid6;
                    i3 = i9;
                    str10 = str14;
                    String str15 = str13;
                    String str16 = url;
                    fail = new Fail(httpError2);
                }
            }
            if (Request2.shouldRetry(i3, i4)) {
                C427831 c4278315 = c4278314;
                i = i3;
                str5 = str12;
                c4278312 = c4278315;
                uuid2 = uuid4;
                str7 = str8;
                paymentApiImpl2 = paymentApiImpl4;
                i7 = 2;
                i8 = 1;
                jDelayTime = Request2.delayTime(i);
                c4278312.L$0 = paymentApiImpl2;
                c4278312.L$1 = str7;
                c4278312.L$2 = uuid2;
                c4278312.L$3 = str5;
                c4278312.L$4 = str6;
                c4278312.I$0 = i;
                c4278312.label = i8;
                if (DelayKt.delay(jDelayTime, c4278312) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i10 = i;
                uuid3 = uuid2;
                c427831 = c4278312;
                str9 = str5;
                i2 = i10;
                paymentApiImpl3 = paymentApiImpl2;
                str8 = str7;
                i3 = i2 + i8;
                PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str8);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                SubmitProviderSelectionRequest submitProviderSelectionRequest2 = new SubmitProviderSelectionRequest(str6);
                c427831.L$0 = paymentApiImpl3;
                c427831.L$1 = str8;
                c427831.L$2 = uuid3;
                c427831.L$3 = str9;
                c427831.L$4 = str6;
                c427831.I$0 = i3;
                c427831.label = i7;
                C427831 c42783132 = c427831;
                String str112 = str9;
                objSubmitProviderSelection = paymentApiService2.submitProviderSelection(bearerToken2, string2, str112, submitProviderSelectionRequest2, c42783132);
                if (objSubmitProviderSelection != coroutine_suspended) {
                    uuid6 = uuid3;
                    str12 = str112;
                    c4278314 = c42783132;
                    PaymentApiImpl paymentApiImpl42 = paymentApiImpl3;
                    Response response2 = (Response) objSubmitProviderSelection;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i3, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (fail instanceof Ok) {
                fail = new Ok(((com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fail instanceof Ok) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objSubmitProviderSelection);
        str5 = str2;
        str6 = str3;
        i = 0;
        c4278312 = c427831;
        paymentApiImpl2 = paymentApiImpl;
        str7 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4278312.L$0 = paymentApiImpl2;
        c4278312.L$1 = str7;
        c4278312.L$2 = uuid2;
        c4278312.L$3 = str5;
        c4278312.L$4 = str6;
        c4278312.I$0 = i;
        c4278312.label = i8;
        if (DelayKt.delay(jDelayTime, c4278312) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:119|54|55|125|56|57|123|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e8, code lost:
    
        r37 = r1;
        r4 = r18;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
    
        r15 = r20;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0200, code lost:
    
        if (r14.code() < 500) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0202, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0208 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:15:0x0050). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitForm(String str, UUID uuid, String str2, Map<String, String> map, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427821 c427821;
        PaymentApiImpl paymentApiImpl;
        String str3;
        Object fail;
        String str4;
        Map<String, String> map2;
        int i;
        C427821 c4278212;
        PaymentApiImpl paymentApiImpl2;
        String str5;
        UUID uuid2;
        PaymentApiImpl paymentApiImpl3;
        String str6;
        UUID uuid3;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        String str8;
        if (continuation instanceof C427821) {
            c427821 = (C427821) continuation;
            int i5 = c427821.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c427821.label = i5 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427821 = paymentApiImpl.new C427821(continuation);
            }
        }
        Object objSubmitForm = c427821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c427821.label;
        int i7 = 2;
        int i8 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            Object connectionError = th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException ? new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null) : ((th instanceof SocketTimeoutException) || (th instanceof IOException)) ? new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null) : new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + connectionError + " caused by " + th);
            }
            fail = new Fail(connectionError);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = c427821.I$0;
                map2 = (Map) c427821.L$4;
                str7 = (String) c427821.L$3;
                uuid3 = (UUID) c427821.L$2;
                str6 = (String) c427821.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427821.L$0;
                ResultKt.throwOnFailure(objSubmitForm);
                i3 = i2 + i8;
                PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str6);
                if (uuid3 == null) {
                }
                SubmitFormRequest submitFormRequest = new SubmitFormRequest(map2);
                c427821.L$0 = paymentApiImpl3;
                c427821.L$1 = str6;
                c427821.L$2 = uuid3;
                c427821.L$3 = str7;
                c427821.L$4 = map2;
                c427821.I$0 = i3;
                c427821.label = i7;
                C427821 c4278213 = c427821;
                String str9 = str7;
                objSubmitForm = paymentApiService.submitForm(bearerToken, string, str9, submitFormRequest, c4278213);
                if (objSubmitForm != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427821.I$0;
            map2 = (Map) c427821.L$4;
            String str10 = (String) c427821.L$3;
            UUID uuid5 = (UUID) c427821.L$2;
            str6 = (String) c427821.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427821.L$0;
            ResultKt.throwOnFailure(objSubmitForm);
            C427821 c4278214 = c427821;
            UUID uuid6 = uuid5;
            PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
            Response response = (Response) objSubmitForm;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str11 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str11, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i9 = i3;
                NetworkError.HttpError httpError = new NetworkError.HttpError(response.code(), null, null, i9, strString, str11, url, 6, null);
                String str12 = strString;
                if (str12 == null || str12.length() == 0) {
                    uuid4 = uuid6;
                    i3 = i9;
                    fail = new Fail(httpError);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str8 = str12;
                        i3 = i9;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str12), i9, str12, str11, url, 2, null);
                    uuid4 = uuid6;
                    i3 = i9;
                    str8 = str12;
                    String str13 = str11;
                    String str14 = url;
                    fail = new Fail(httpError2);
                }
            }
            if (Request2.shouldRetry(i3, i4)) {
                C427821 c4278215 = c4278214;
                i = i3;
                str4 = str10;
                c4278212 = c4278215;
                uuid2 = uuid4;
                str5 = str6;
                paymentApiImpl2 = paymentApiImpl4;
                i7 = 2;
                i8 = 1;
                jDelayTime = Request2.delayTime(i);
                c4278212.L$0 = paymentApiImpl2;
                c4278212.L$1 = str5;
                c4278212.L$2 = uuid2;
                c4278212.L$3 = str4;
                c4278212.L$4 = map2;
                c4278212.I$0 = i;
                c4278212.label = i8;
                if (DelayKt.delay(jDelayTime, c4278212) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i10 = i;
                uuid3 = uuid2;
                c427821 = c4278212;
                str7 = str4;
                i2 = i10;
                paymentApiImpl3 = paymentApiImpl2;
                str6 = str5;
                i3 = i2 + i8;
                PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str6);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                SubmitFormRequest submitFormRequest2 = new SubmitFormRequest(map2);
                c427821.L$0 = paymentApiImpl3;
                c427821.L$1 = str6;
                c427821.L$2 = uuid3;
                c427821.L$3 = str7;
                c427821.L$4 = map2;
                c427821.I$0 = i3;
                c427821.label = i7;
                C427821 c42782132 = c427821;
                String str92 = str7;
                objSubmitForm = paymentApiService2.submitForm(bearerToken2, string2, str92, submitFormRequest2, c42782132);
                if (objSubmitForm != coroutine_suspended) {
                    uuid6 = uuid3;
                    str10 = str92;
                    c4278214 = c42782132;
                    PaymentApiImpl paymentApiImpl42 = paymentApiImpl3;
                    Response response2 = (Response) objSubmitForm;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i3, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (fail instanceof Ok) {
                fail = new Ok(((com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fail instanceof Ok) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objSubmitForm);
        str4 = str2;
        map2 = map;
        i = 0;
        c4278212 = c427821;
        paymentApiImpl2 = paymentApiImpl;
        str5 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4278212.L$0 = paymentApiImpl2;
        c4278212.L$1 = str5;
        c4278212.L$2 = uuid2;
        c4278212.L$3 = str4;
        c4278212.L$4 = map2;
        c4278212.I$0 = i;
        c4278212.label = i8;
        if (DelayKt.delay(jDelayTime, c4278212) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:132)|54|55|126|56|57|130|58|59|128|60) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01db, code lost:
    
        r37 = r1;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e1, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e7, code lost:
    
        r37 = r1;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01eb, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        if (r13.code() >= 500) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fc, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0202, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c8 -> B:15:0x004c). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitConsent(String str, UUID uuid, String str2, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427811 c427811;
        PaymentApiImpl paymentApiImpl;
        String str3;
        Object validationError;
        Object fail;
        String str4;
        int i;
        C427811 c4278112;
        PaymentApiImpl paymentApiImpl2;
        String str5;
        UUID uuid2;
        PaymentApiImpl paymentApiImpl3;
        String str6;
        UUID uuid3;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        int i5;
        String str8;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427811) {
            c427811 = (C427811) continuation;
            int i6 = c427811.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427811.label = i6 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427811 = paymentApiImpl.new C427811(continuation);
            }
        }
        Object objSubmitConsent = c427811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427811.label;
        int i8 = 2;
        int i9 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i7 != 0) {
            if (i7 == 1) {
                i2 = c427811.I$0;
                str7 = (String) c427811.L$3;
                uuid3 = (UUID) c427811.L$2;
                str6 = (String) c427811.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427811.L$0;
                ResultKt.throwOnFailure(objSubmitConsent);
                i3 = i2 + i9;
                PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str6);
                if (uuid3 == null) {
                }
                SubmitConsentRequest submitConsentRequest = SubmitConsentRequest.INSTANCE;
                c427811.L$0 = paymentApiImpl3;
                c427811.L$1 = str6;
                c427811.L$2 = uuid3;
                c427811.L$3 = str7;
                c427811.I$0 = i3;
                c427811.label = i8;
                C427811 c4278113 = c427811;
                String str9 = str7;
                objSubmitConsent = paymentApiService.submitConsent(bearerToken, string, str9, submitConsentRequest, c4278113);
                if (objSubmitConsent != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427811.I$0;
            String str10 = (String) c427811.L$3;
            UUID uuid5 = (UUID) c427811.L$2;
            str6 = (String) c427811.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427811.L$0;
            ResultKt.throwOnFailure(objSubmitConsent);
            C427811 c4278114 = c427811;
            UUID uuid6 = uuid5;
            PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
            Response response = (Response) objSubmitConsent;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i5 = i3;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str11 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str11, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i10 = i3;
                NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i10, strString, str11, url, 6, null);
                String str12 = strString;
                if (str12 == null || str12.length() == 0) {
                    uuid4 = uuid6;
                    i5 = i10;
                    fail = new Fail(httpError2);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str8 = str12;
                        httpError = httpError2;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    Object objDecodeFromString = jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str12);
                    httpError = httpError2;
                    NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, objDecodeFromString, i10, str12, str11, url, 2, null);
                    uuid4 = uuid6;
                    i5 = i10;
                    str8 = str12;
                    String str13 = str11;
                    String str14 = url;
                    fail = new Fail(httpError3);
                }
            }
            if (Request2.shouldRetry(i5, i4)) {
                uuid2 = uuid4;
                str4 = str10;
                c4278112 = c4278114;
                str5 = str6;
                i = i5;
                paymentApiImpl2 = paymentApiImpl4;
                i8 = 2;
                i9 = 1;
                jDelayTime = Request2.delayTime(i);
                c4278112.L$0 = paymentApiImpl2;
                c4278112.L$1 = str5;
                c4278112.L$2 = uuid2;
                c4278112.L$3 = str4;
                c4278112.I$0 = i;
                c4278112.label = i9;
                if (DelayKt.delay(jDelayTime, c4278112) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i11 = i;
                uuid3 = uuid2;
                c427811 = c4278112;
                str7 = str4;
                i2 = i11;
                paymentApiImpl3 = paymentApiImpl2;
                str6 = str5;
                i3 = i2 + i9;
                PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str6);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                SubmitConsentRequest submitConsentRequest2 = SubmitConsentRequest.INSTANCE;
                c427811.L$0 = paymentApiImpl3;
                c427811.L$1 = str6;
                c427811.L$2 = uuid3;
                c427811.L$3 = str7;
                c427811.I$0 = i3;
                c427811.label = i8;
                C427811 c42781132 = c427811;
                String str92 = str7;
                objSubmitConsent = paymentApiService2.submitConsent(bearerToken2, string2, str92, submitConsentRequest2, c42781132);
                if (objSubmitConsent != coroutine_suspended) {
                    uuid6 = uuid3;
                    str10 = str92;
                    c4278114 = c42781132;
                    PaymentApiImpl paymentApiImpl42 = paymentApiImpl3;
                    Response response2 = (Response) objSubmitConsent;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i5, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (!(fail instanceof Ok)) {
                fail = new Ok(((com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(fail instanceof Ok)) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objSubmitConsent);
        str4 = str2;
        i = 0;
        c4278112 = c427811;
        paymentApiImpl2 = paymentApiImpl;
        str5 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4278112.L$0 = paymentApiImpl2;
        c4278112.L$1 = str5;
        c4278112.L$2 = uuid2;
        c4278112.L$3 = str4;
        c4278112.I$0 = i;
        c4278112.label = i9;
        if (DelayKt.delay(jDelayTime, c4278112) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:119|54|55|125|56|57|123|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e8, code lost:
    
        r37 = r1;
        r4 = r18;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
    
        r15 = r20;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0200, code lost:
    
        if (r14.code() < 500) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0202, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0208 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:15:0x0050). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitSchemeSelection(String str, UUID uuid, String str2, String str3, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427841 c427841;
        PaymentApiImpl paymentApiImpl;
        String str4;
        Object validationError;
        Object fail;
        String str5;
        String str6;
        int i;
        C427841 c4278412;
        PaymentApiImpl paymentApiImpl2;
        String str7;
        UUID uuid2;
        PaymentApiImpl paymentApiImpl3;
        String str8;
        UUID uuid3;
        String str9;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        String str10;
        if (continuation instanceof C427841) {
            c427841 = (C427841) continuation;
            int i5 = c427841.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c427841.label = i5 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427841 = paymentApiImpl.new C427841(continuation);
            }
        }
        Object objSubmitSchemeSelection = c427841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c427841.label;
        int i7 = 2;
        int i8 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str4 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str4 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str4, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str4, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str4, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = c427841.I$0;
                str6 = (String) c427841.L$4;
                str9 = (String) c427841.L$3;
                uuid3 = (UUID) c427841.L$2;
                str8 = (String) c427841.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427841.L$0;
                ResultKt.throwOnFailure(objSubmitSchemeSelection);
                i3 = i2 + i8;
                PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str8);
                if (uuid3 == null) {
                }
                SubmitSchemeSelectionRequest submitSchemeSelectionRequest = new SubmitSchemeSelectionRequest(str6);
                c427841.L$0 = paymentApiImpl3;
                c427841.L$1 = str8;
                c427841.L$2 = uuid3;
                c427841.L$3 = str9;
                c427841.L$4 = str6;
                c427841.I$0 = i3;
                c427841.label = i7;
                C427841 c4278413 = c427841;
                String str11 = str9;
                objSubmitSchemeSelection = paymentApiService.submitSchemeSelection(bearerToken, string, str11, submitSchemeSelectionRequest, c4278413);
                if (objSubmitSchemeSelection != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427841.I$0;
            str6 = (String) c427841.L$4;
            String str12 = (String) c427841.L$3;
            UUID uuid5 = (UUID) c427841.L$2;
            str8 = (String) c427841.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427841.L$0;
            ResultKt.throwOnFailure(objSubmitSchemeSelection);
            C427841 c4278414 = c427841;
            UUID uuid6 = uuid5;
            PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
            Response response = (Response) objSubmitSchemeSelection;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str13 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str13, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i9 = i3;
                NetworkError.HttpError httpError = new NetworkError.HttpError(response.code(), null, null, i9, strString, str13, url, 6, null);
                String str14 = strString;
                if (str14 == null || str14.length() == 0) {
                    uuid4 = uuid6;
                    i3 = i9;
                    fail = new Fail(httpError);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str10 = str14;
                        i3 = i9;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str14), i9, str14, str13, url, 2, null);
                    uuid4 = uuid6;
                    i3 = i9;
                    str10 = str14;
                    String str15 = str13;
                    String str16 = url;
                    fail = new Fail(httpError2);
                }
            }
            if (Request2.shouldRetry(i3, i4)) {
                C427841 c4278415 = c4278414;
                i = i3;
                str5 = str12;
                c4278412 = c4278415;
                uuid2 = uuid4;
                str7 = str8;
                paymentApiImpl2 = paymentApiImpl4;
                i7 = 2;
                i8 = 1;
                jDelayTime = Request2.delayTime(i);
                c4278412.L$0 = paymentApiImpl2;
                c4278412.L$1 = str7;
                c4278412.L$2 = uuid2;
                c4278412.L$3 = str5;
                c4278412.L$4 = str6;
                c4278412.I$0 = i;
                c4278412.label = i8;
                if (DelayKt.delay(jDelayTime, c4278412) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i10 = i;
                uuid3 = uuid2;
                c427841 = c4278412;
                str9 = str5;
                i2 = i10;
                paymentApiImpl3 = paymentApiImpl2;
                str8 = str7;
                i3 = i2 + i8;
                PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str8);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                SubmitSchemeSelectionRequest submitSchemeSelectionRequest2 = new SubmitSchemeSelectionRequest(str6);
                c427841.L$0 = paymentApiImpl3;
                c427841.L$1 = str8;
                c427841.L$2 = uuid3;
                c427841.L$3 = str9;
                c427841.L$4 = str6;
                c427841.I$0 = i3;
                c427841.label = i7;
                C427841 c42784132 = c427841;
                String str112 = str9;
                objSubmitSchemeSelection = paymentApiService2.submitSchemeSelection(bearerToken2, string2, str112, submitSchemeSelectionRequest2, c42784132);
                if (objSubmitSchemeSelection != coroutine_suspended) {
                    uuid6 = uuid3;
                    str12 = str112;
                    c4278414 = c42784132;
                    PaymentApiImpl paymentApiImpl42 = paymentApiImpl3;
                    Response response2 = (Response) objSubmitSchemeSelection;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i3, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (fail instanceof Ok) {
                fail = new Ok(((com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fail instanceof Ok) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objSubmitSchemeSelection);
        str5 = str2;
        str6 = str3;
        i = 0;
        c4278412 = c427841;
        paymentApiImpl2 = paymentApiImpl;
        str7 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4278412.L$0 = paymentApiImpl2;
        c4278412.L$1 = str7;
        c4278412.L$2 = uuid2;
        c4278412.L$3 = str5;
        c4278412.L$4 = str6;
        c4278412.I$0 = i;
        c4278412.label = i8;
        if (DelayKt.delay(jDelayTime, c4278412) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:129)|49|50|131|51|52|127|53|54|125|55) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:129|49|50|131|51|52|127|53|54|125|55) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c4, code lost:
    
        r37 = r23;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ca, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d0, code lost:
    
        r37 = r23;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d4, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r13.code() >= 500) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e5, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01eb, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5 A[Catch: all -> 0x0050, TryCatch #1 {all -> 0x0050, blocks: (B:13:0x0044, B:31:0x00b8, B:33:0x00c5, B:72:0x01fc, B:28:0x009f, B:34:0x00d7, B:36:0x00dd, B:38:0x00e6, B:40:0x0102, B:41:0x0145, B:43:0x014f, B:44:0x0161, B:46:0x0179, B:67:0x01dd, B:69:0x01e5, B:70:0x01eb, B:71:0x01f7, B:20:0x006f), top: B:123:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01eb A[Catch: all -> 0x0050, TryCatch #1 {all -> 0x0050, blocks: (B:13:0x0044, B:31:0x00b8, B:33:0x00c5, B:72:0x01fc, B:28:0x009f, B:34:0x00d7, B:36:0x00dd, B:38:0x00e6, B:40:0x0102, B:41:0x0145, B:43:0x014f, B:44:0x0161, B:46:0x0179, B:67:0x01dd, B:69:0x01e5, B:70:0x01eb, B:71:0x01f7, B:20:0x006f), top: B:123:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b5 -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPaymentProvider(String str, String str2, PaymentContext.PaymentType paymentType, Continuation<? super Outcome<PaymentProvider, ? extends CoreError>> continuation) {
        C427781 c427781;
        PaymentApiImpl paymentApiImpl;
        Throwable th;
        PaymentContext.PaymentType paymentType2;
        PaymentContext.PaymentType paymentType3;
        Object ok;
        String str3;
        Object validationError;
        int i;
        C427781 c4277812;
        PaymentApiImpl paymentApiImpl2;
        String str4;
        String str5;
        PaymentApiImpl paymentApiImpl3;
        String str6;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        String str8;
        int i5;
        String str9;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427781) {
            c427781 = (C427781) continuation;
            int i6 = c427781.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427781.label = i6 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427781 = paymentApiImpl.new C427781(continuation);
            }
        }
        Object paymentProvider = c427781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427781.label;
        int i8 = 2;
        int i9 = 1;
        try {
        } catch (Throwable th2) {
            th = th2;
            paymentType2 = paymentType3;
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(paymentProvider);
            paymentType2 = paymentType;
            i = 0;
            c4277812 = c427781;
            paymentApiImpl2 = paymentApiImpl;
            str4 = str;
            str5 = str2;
            jDelayTime = Request2.delayTime(i);
            c4277812.L$0 = paymentApiImpl2;
            c4277812.L$1 = str4;
            c4277812.L$2 = str5;
            c4277812.L$3 = paymentType2;
            c4277812.I$0 = i;
            c4277812.label = i9;
            if (DelayKt.delay(jDelayTime, c4277812) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427781.I$0;
            paymentType3 = (PaymentContext.PaymentType) c427781.L$3;
            str7 = (String) c427781.L$2;
            str6 = (String) c427781.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427781.L$0;
            ResultKt.throwOnFailure(paymentProvider);
            String str10 = str7;
            C427781 c4277813 = c427781;
            PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
            Response response = (Response) paymentProvider;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                ok = new Ok(objBody);
                str8 = str10;
                i5 = i3;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str11 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str11, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i10 = i3;
                NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i10, strString, str11, url, 6, null);
                String str12 = strString;
                if (str12 == null || str12.length() == 0) {
                    str8 = str10;
                    i5 = i10;
                    ok = new Fail(httpError2);
                } else {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        str8 = str10;
                        str9 = str12;
                        httpError = httpError2;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    Object objDecodeFromString = jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str12);
                    httpError = httpError2;
                    NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, objDecodeFromString, i10, str12, str11, url, 2, null);
                    str8 = str10;
                    i5 = i10;
                    str9 = str12;
                    String str13 = str11;
                    String str14 = url;
                    ok = new Fail(httpError3);
                }
            }
            if (Request2.shouldRetry(i5, i4)) {
                str5 = str8;
                paymentType2 = paymentType3;
                c4277812 = c4277813;
                str4 = str6;
                i = i5;
                paymentApiImpl2 = paymentApiImpl4;
                i8 = 2;
                i9 = 1;
                try {
                    jDelayTime = Request2.delayTime(i);
                    c4277812.L$0 = paymentApiImpl2;
                    c4277812.L$1 = str4;
                    c4277812.L$2 = str5;
                    c4277812.L$3 = paymentType2;
                    c4277812.I$0 = i;
                    c4277812.label = i9;
                    if (DelayKt.delay(jDelayTime, c4277812) != coroutine_suspended) {
                        int i11 = i;
                        str7 = str5;
                        c427781 = c4277812;
                        paymentType3 = paymentType2;
                        i2 = i11;
                        paymentApiImpl3 = paymentApiImpl2;
                        str6 = str4;
                        i3 = i2 + i9;
                        PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                        String bearerToken = ExtensionsKt.toBearerToken(str6);
                        c427781.L$0 = paymentApiImpl3;
                        c427781.L$1 = str6;
                        c427781.L$2 = str7;
                        c427781.L$3 = paymentType3;
                        c427781.I$0 = i3;
                        c427781.label = i8;
                        paymentProvider = paymentApiService.getPaymentProvider(bearerToken, str7, c427781);
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th = th4;
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                    StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
                    if (stackTraceElement != null) {
                        str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                    } else {
                        str3 = null;
                    }
                    if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                        validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
                    } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                        validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
                    } else {
                        validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
                    }
                    ok = new Fail(validationError);
                    paymentType3 = paymentType2;
                    if (ok instanceof Ok) {
                    }
                    if (ok instanceof Ok) {
                    }
                }
            }
            if (ok instanceof Ok) {
                ok = new Ok(((PaymentProviderDetails) ((Ok) ok).getValue()).intoDomain(paymentType3));
            } else if (!(ok instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (ok instanceof Ok) {
                return ok;
            }
            if (ok instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) ok).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        i2 = c427781.I$0;
        paymentType3 = (PaymentContext.PaymentType) c427781.L$3;
        str7 = (String) c427781.L$2;
        str6 = (String) c427781.L$1;
        paymentApiImpl3 = (PaymentApiImpl) c427781.L$0;
        ResultKt.throwOnFailure(paymentProvider);
        i3 = i2 + i9;
        PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
        String bearerToken2 = ExtensionsKt.toBearerToken(str6);
        c427781.L$0 = paymentApiImpl3;
        c427781.L$1 = str6;
        c427781.L$2 = str7;
        c427781.L$3 = paymentType3;
        c427781.I$0 = i3;
        c427781.label = i8;
        paymentProvider = paymentApiService2.getPaymentProvider(bearerToken2, str7, c427781);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:119|54|55|125|56|57|123|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e8, code lost:
    
        r37 = r1;
        r4 = r18;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
    
        r15 = r20;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0200, code lost:
    
        if (r14.code() < 500) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0202, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0208 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:15:0x0050). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitUserAccountSelection(String str, UUID uuid, String str2, String str3, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427851 c427851;
        PaymentApiImpl paymentApiImpl;
        String str4;
        Object validationError;
        Object fail;
        String str5;
        String str6;
        int i;
        C427851 c4278512;
        PaymentApiImpl paymentApiImpl2;
        String str7;
        UUID uuid2;
        PaymentApiImpl paymentApiImpl3;
        String str8;
        UUID uuid3;
        String str9;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        String str10;
        if (continuation instanceof C427851) {
            c427851 = (C427851) continuation;
            int i5 = c427851.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c427851.label = i5 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427851 = paymentApiImpl.new C427851(continuation);
            }
        }
        Object objSubmitUserAccountSelection = c427851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c427851.label;
        int i7 = 2;
        int i8 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str4 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str4 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str4, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str4, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str4, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = c427851.I$0;
                str6 = (String) c427851.L$4;
                str9 = (String) c427851.L$3;
                uuid3 = (UUID) c427851.L$2;
                str8 = (String) c427851.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427851.L$0;
                ResultKt.throwOnFailure(objSubmitUserAccountSelection);
                i3 = i2 + i8;
                PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str8);
                if (uuid3 == null) {
                }
                SubmitUserAccountSelectionRequest.Existing existing = new SubmitUserAccountSelectionRequest.Existing(str6);
                c427851.L$0 = paymentApiImpl3;
                c427851.L$1 = str8;
                c427851.L$2 = uuid3;
                c427851.L$3 = str9;
                c427851.L$4 = str6;
                c427851.I$0 = i3;
                c427851.label = i7;
                C427851 c4278513 = c427851;
                String str11 = str9;
                objSubmitUserAccountSelection = paymentApiService.submitUserAccountSelection(bearerToken, string, str11, existing, c4278513);
                if (objSubmitUserAccountSelection != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427851.I$0;
            str6 = (String) c427851.L$4;
            String str12 = (String) c427851.L$3;
            UUID uuid5 = (UUID) c427851.L$2;
            str8 = (String) c427851.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427851.L$0;
            ResultKt.throwOnFailure(objSubmitUserAccountSelection);
            C427851 c4278514 = c427851;
            UUID uuid6 = uuid5;
            PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
            Response response = (Response) objSubmitUserAccountSelection;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str13 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str13, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i9 = i3;
                NetworkError.HttpError httpError = new NetworkError.HttpError(response.code(), null, null, i9, strString, str13, url, 6, null);
                String str14 = strString;
                if (str14 == null || str14.length() == 0) {
                    uuid4 = uuid6;
                    i3 = i9;
                    fail = new Fail(httpError);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str10 = str14;
                        i3 = i9;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str14), i9, str14, str13, url, 2, null);
                    uuid4 = uuid6;
                    i3 = i9;
                    str10 = str14;
                    String str15 = str13;
                    String str16 = url;
                    fail = new Fail(httpError2);
                }
            }
            if (Request2.shouldRetry(i3, i4)) {
                C427851 c4278515 = c4278514;
                i = i3;
                str5 = str12;
                c4278512 = c4278515;
                uuid2 = uuid4;
                str7 = str8;
                paymentApiImpl2 = paymentApiImpl4;
                i7 = 2;
                i8 = 1;
                jDelayTime = Request2.delayTime(i);
                c4278512.L$0 = paymentApiImpl2;
                c4278512.L$1 = str7;
                c4278512.L$2 = uuid2;
                c4278512.L$3 = str5;
                c4278512.L$4 = str6;
                c4278512.I$0 = i;
                c4278512.label = i8;
                if (DelayKt.delay(jDelayTime, c4278512) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i10 = i;
                uuid3 = uuid2;
                c427851 = c4278512;
                str9 = str5;
                i2 = i10;
                paymentApiImpl3 = paymentApiImpl2;
                str8 = str7;
                i3 = i2 + i8;
                PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str8);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                SubmitUserAccountSelectionRequest.Existing existing2 = new SubmitUserAccountSelectionRequest.Existing(str6);
                c427851.L$0 = paymentApiImpl3;
                c427851.L$1 = str8;
                c427851.L$2 = uuid3;
                c427851.L$3 = str9;
                c427851.L$4 = str6;
                c427851.I$0 = i3;
                c427851.label = i7;
                C427851 c42785132 = c427851;
                String str112 = str9;
                objSubmitUserAccountSelection = paymentApiService2.submitUserAccountSelection(bearerToken2, string2, str112, existing2, c42785132);
                if (objSubmitUserAccountSelection != coroutine_suspended) {
                    uuid6 = uuid3;
                    str12 = str112;
                    c4278514 = c42785132;
                    PaymentApiImpl paymentApiImpl42 = paymentApiImpl3;
                    Response response2 = (Response) objSubmitUserAccountSelection;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i3, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (fail instanceof Ok) {
                fail = new Ok(((com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fail instanceof Ok) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objSubmitUserAccountSelection);
        str5 = str2;
        str6 = str3;
        i = 0;
        c4278512 = c427851;
        paymentApiImpl2 = paymentApiImpl;
        str7 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4278512.L$0 = paymentApiImpl2;
        c4278512.L$1 = str7;
        c4278512.L$2 = uuid2;
        c4278512.L$3 = str5;
        c4278512.L$4 = str6;
        c4278512.I$0 = i;
        c4278512.label = i8;
        if (DelayKt.delay(jDelayTime, c4278512) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:119|54|55|125|56|57|123|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e8, code lost:
    
        r37 = r1;
        r4 = r18;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
    
        r15 = r20;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0200, code lost:
    
        if (r14.code() < 500) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0202, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0208 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0048, B:36:0x00e2, B:38:0x00ef, B:72:0x0219, B:24:0x0089, B:28:0x00a9, B:30:0x00b2, B:32:0x00bb, B:39:0x0100, B:41:0x0106, B:43:0x010f, B:45:0x012b, B:46:0x016e, B:48:0x0178, B:49:0x018a, B:51:0x01a4, B:67:0x01fa, B:69:0x0202, B:70:0x0208, B:71:0x0214, B:21:0x0076), top: B:121:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:15:0x0050). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteSavedUserAccount(String str, UUID uuid, String str2, String str3, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427761 c427761;
        PaymentApiImpl paymentApiImpl;
        String str4;
        Object validationError;
        Object fail;
        String str5;
        String str6;
        int i;
        C427761 c4277612;
        PaymentApiImpl paymentApiImpl2;
        String str7;
        UUID uuid2;
        PaymentApiImpl paymentApiImpl3;
        String str8;
        UUID uuid3;
        String str9;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        String str10;
        if (continuation instanceof C427761) {
            c427761 = (C427761) continuation;
            int i5 = c427761.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c427761.label = i5 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427761 = paymentApiImpl.new C427761(continuation);
            }
        }
        Object objSubmitUserAccountSelection = c427761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c427761.label;
        int i7 = 2;
        int i8 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str4 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str4 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str4, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str4, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str4, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = c427761.I$0;
                str6 = (String) c427761.L$4;
                str9 = (String) c427761.L$3;
                uuid3 = (UUID) c427761.L$2;
                str8 = (String) c427761.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427761.L$0;
                ResultKt.throwOnFailure(objSubmitUserAccountSelection);
                i3 = i2 + i8;
                PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str8);
                if (uuid3 == null) {
                }
                SubmitUserAccountSelectionRequest.Delete delete = new SubmitUserAccountSelectionRequest.Delete(str6);
                c427761.L$0 = paymentApiImpl3;
                c427761.L$1 = str8;
                c427761.L$2 = uuid3;
                c427761.L$3 = str9;
                c427761.L$4 = str6;
                c427761.I$0 = i3;
                c427761.label = i7;
                C427761 c4277613 = c427761;
                String str11 = str9;
                objSubmitUserAccountSelection = paymentApiService.submitUserAccountSelection(bearerToken, string, str11, delete, c4277613);
                if (objSubmitUserAccountSelection != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427761.I$0;
            str6 = (String) c427761.L$4;
            String str12 = (String) c427761.L$3;
            UUID uuid5 = (UUID) c427761.L$2;
            str8 = (String) c427761.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427761.L$0;
            ResultKt.throwOnFailure(objSubmitUserAccountSelection);
            C427761 c4277614 = c427761;
            UUID uuid6 = uuid5;
            PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
            Response response = (Response) objSubmitUserAccountSelection;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str13 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str13, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i9 = i3;
                NetworkError.HttpError httpError = new NetworkError.HttpError(response.code(), null, null, i9, strString, str13, url, 6, null);
                String str14 = strString;
                if (str14 == null || str14.length() == 0) {
                    uuid4 = uuid6;
                    i3 = i9;
                    fail = new Fail(httpError);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str10 = str14;
                        i3 = i9;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str14), i9, str14, str13, url, 2, null);
                    uuid4 = uuid6;
                    i3 = i9;
                    str10 = str14;
                    String str15 = str13;
                    String str16 = url;
                    fail = new Fail(httpError2);
                }
            }
            if (Request2.shouldRetry(i3, i4)) {
                C427761 c4277615 = c4277614;
                i = i3;
                str5 = str12;
                c4277612 = c4277615;
                uuid2 = uuid4;
                str7 = str8;
                paymentApiImpl2 = paymentApiImpl4;
                i7 = 2;
                i8 = 1;
                jDelayTime = Request2.delayTime(i);
                c4277612.L$0 = paymentApiImpl2;
                c4277612.L$1 = str7;
                c4277612.L$2 = uuid2;
                c4277612.L$3 = str5;
                c4277612.L$4 = str6;
                c4277612.I$0 = i;
                c4277612.label = i8;
                if (DelayKt.delay(jDelayTime, c4277612) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i10 = i;
                uuid3 = uuid2;
                c427761 = c4277612;
                str9 = str5;
                i2 = i10;
                paymentApiImpl3 = paymentApiImpl2;
                str8 = str7;
                i3 = i2 + i8;
                PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str8);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                SubmitUserAccountSelectionRequest.Delete delete2 = new SubmitUserAccountSelectionRequest.Delete(str6);
                c427761.L$0 = paymentApiImpl3;
                c427761.L$1 = str8;
                c427761.L$2 = uuid3;
                c427761.L$3 = str9;
                c427761.L$4 = str6;
                c427761.I$0 = i3;
                c427761.label = i7;
                C427761 c42776132 = c427761;
                String str112 = str9;
                objSubmitUserAccountSelection = paymentApiService2.submitUserAccountSelection(bearerToken2, string2, str112, delete2, c42776132);
                if (objSubmitUserAccountSelection != coroutine_suspended) {
                    uuid6 = uuid3;
                    str12 = str112;
                    c4277614 = c42776132;
                    PaymentApiImpl paymentApiImpl42 = paymentApiImpl3;
                    Response response2 = (Response) objSubmitUserAccountSelection;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i3, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (fail instanceof Ok) {
                fail = new Ok(((com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fail instanceof Ok) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objSubmitUserAccountSelection);
        str5 = str2;
        str6 = str3;
        i = 0;
        c4277612 = c427761;
        paymentApiImpl2 = paymentApiImpl;
        str7 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4277612.L$0 = paymentApiImpl2;
        c4277612.L$1 = str7;
        c4277612.L$2 = uuid2;
        c4277612.L$3 = str5;
        c4277612.L$4 = str6;
        c4277612.I$0 = i;
        c4277612.label = i8;
        if (DelayKt.delay(jDelayTime, c4277612) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:132)|54|55|126|56|57|130|58|59|128|60) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01db, code lost:
    
        r37 = r1;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e1, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e7, code lost:
    
        r37 = r1;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01eb, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        if (r13.code() >= 500) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fc, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0202, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:36:0x00cf, B:38:0x00dc, B:77:0x0213, B:24:0x007f, B:28:0x009d, B:30:0x00a6, B:32:0x00af, B:39:0x00ee, B:41:0x00f4, B:43:0x00fd, B:45:0x0119, B:46:0x015c, B:48:0x0166, B:49:0x0178, B:51:0x0190, B:72:0x01f4, B:74:0x01fc, B:75:0x0202, B:76:0x020e, B:21:0x006e), top: B:124:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c8 -> B:15:0x004c). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object useNewUserAccount(String str, UUID uuid, String str2, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427861 c427861;
        PaymentApiImpl paymentApiImpl;
        String str3;
        Object validationError;
        Object fail;
        String str4;
        int i;
        C427861 c4278612;
        PaymentApiImpl paymentApiImpl2;
        String str5;
        UUID uuid2;
        PaymentApiImpl paymentApiImpl3;
        String str6;
        UUID uuid3;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        int i5;
        String str8;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427861) {
            c427861 = (C427861) continuation;
            int i6 = c427861.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427861.label = i6 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427861 = paymentApiImpl.new C427861(continuation);
            }
        }
        Object objSubmitUserAccountSelection = c427861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427861.label;
        int i8 = 2;
        int i9 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i7 != 0) {
            if (i7 == 1) {
                i2 = c427861.I$0;
                str7 = (String) c427861.L$3;
                uuid3 = (UUID) c427861.L$2;
                str6 = (String) c427861.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427861.L$0;
                ResultKt.throwOnFailure(objSubmitUserAccountSelection);
                i3 = i2 + i9;
                PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str6);
                if (uuid3 == null) {
                }
                SubmitUserAccountSelectionRequest.New r18 = SubmitUserAccountSelectionRequest.New.INSTANCE;
                c427861.L$0 = paymentApiImpl3;
                c427861.L$1 = str6;
                c427861.L$2 = uuid3;
                c427861.L$3 = str7;
                c427861.I$0 = i3;
                c427861.label = i8;
                C427861 c4278613 = c427861;
                String str9 = str7;
                objSubmitUserAccountSelection = paymentApiService.submitUserAccountSelection(bearerToken, string, str9, r18, c4278613);
                if (objSubmitUserAccountSelection != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c427861.I$0;
            String str10 = (String) c427861.L$3;
            UUID uuid5 = (UUID) c427861.L$2;
            str6 = (String) c427861.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427861.L$0;
            ResultKt.throwOnFailure(objSubmitUserAccountSelection);
            C427861 c4278614 = c427861;
            UUID uuid6 = uuid5;
            PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
            Response response = (Response) objSubmitUserAccountSelection;
            int iCode = response.code();
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.checkNotNull(objBody);
                fail = new Ok(objBody);
                uuid4 = uuid6;
                i5 = i3;
                i4 = iCode;
            } else {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str11 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i3 > 0) {
                    TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str11, url, 17, null));
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                }
                i4 = iCode;
                int i10 = i3;
                NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i10, strString, str11, url, 6, null);
                String str12 = strString;
                if (str12 == null || str12.length() == 0) {
                    uuid4 = uuid6;
                    i5 = i10;
                    fail = new Fail(httpError2);
                } else {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        uuid4 = uuid6;
                        str8 = str12;
                        httpError = httpError2;
                    }
                    Json jsonDefault = JsonConverter2.getJsonDefault();
                    jsonDefault.getSerializersModule();
                    Object objDecodeFromString = jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str12);
                    httpError = httpError2;
                    NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, objDecodeFromString, i10, str12, str11, url, 2, null);
                    uuid4 = uuid6;
                    i5 = i10;
                    str8 = str12;
                    String str13 = str11;
                    String str14 = url;
                    fail = new Fail(httpError3);
                }
            }
            if (Request2.shouldRetry(i5, i4)) {
                uuid2 = uuid4;
                str4 = str10;
                c4278612 = c4278614;
                str5 = str6;
                i = i5;
                paymentApiImpl2 = paymentApiImpl4;
                i8 = 2;
                i9 = 1;
                jDelayTime = Request2.delayTime(i);
                c4278612.L$0 = paymentApiImpl2;
                c4278612.L$1 = str5;
                c4278612.L$2 = uuid2;
                c4278612.L$3 = str4;
                c4278612.I$0 = i;
                c4278612.label = i9;
                if (DelayKt.delay(jDelayTime, c4278612) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i11 = i;
                uuid3 = uuid2;
                c427861 = c4278612;
                str7 = str4;
                i2 = i11;
                paymentApiImpl3 = paymentApiImpl2;
                str6 = str5;
                i3 = i2 + i9;
                PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
                String bearerToken2 = ExtensionsKt.toBearerToken(str6);
                String string2 = uuid3 == null ? uuid3.toString() : null;
                SubmitUserAccountSelectionRequest.New r182 = SubmitUserAccountSelectionRequest.New.INSTANCE;
                c427861.L$0 = paymentApiImpl3;
                c427861.L$1 = str6;
                c427861.L$2 = uuid3;
                c427861.L$3 = str7;
                c427861.I$0 = i3;
                c427861.label = i8;
                C427861 c42786132 = c427861;
                String str92 = str7;
                objSubmitUserAccountSelection = paymentApiService2.submitUserAccountSelection(bearerToken2, string2, str92, r182, c42786132);
                if (objSubmitUserAccountSelection != coroutine_suspended) {
                    uuid6 = uuid3;
                    str10 = str92;
                    c4278614 = c42786132;
                    PaymentApiImpl paymentApiImpl42 = paymentApiImpl3;
                    Response response2 = (Response) objSubmitUserAccountSelection;
                    int iCode2 = response2.code();
                    if (response2.isSuccessful()) {
                    }
                    if (Request2.shouldRetry(i5, i4)) {
                    }
                }
                return coroutine_suspended;
            }
            if (!(fail instanceof Ok)) {
                fail = new Ok(((com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse) ((Ok) fail).getValue()).intoDomain2());
            } else if (!(fail instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(fail instanceof Ok)) {
                return fail;
            }
            if (fail instanceof Fail) {
                return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objSubmitUserAccountSelection);
        str4 = str2;
        i = 0;
        c4278612 = c427861;
        paymentApiImpl2 = paymentApiImpl;
        str5 = str;
        uuid2 = uuid;
        jDelayTime = Request2.delayTime(i);
        c4278612.L$0 = paymentApiImpl2;
        c4278612.L$1 = str5;
        c4278612.L$2 = uuid2;
        c4278612.L$3 = str4;
        c4278612.I$0 = i;
        c4278612.label = i9;
        if (DelayKt.delay(jDelayTime, c4278612) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:123)|52|53|117|54|55|121|56|57|119|58) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ca, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01cb, code lost:
    
        r37 = r23;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d1, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d7, code lost:
    
        r37 = r23;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01db, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ea, code lost:
    
        if (r13.code() >= 500) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ec, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f2, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:34:0x00bf, B:36:0x00cc, B:75:0x0203, B:23:0x007f, B:27:0x009d, B:29:0x00a6, B:31:0x00ac, B:37:0x00de, B:39:0x00e4, B:41:0x00ed, B:43:0x0109, B:44:0x014c, B:46:0x0156, B:47:0x0168, B:49:0x0180, B:70:0x01e4, B:72:0x01ec, B:73:0x01f2, B:74:0x01fe, B:20:0x006e), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:34:0x00bf, B:36:0x00cc, B:75:0x0203, B:23:0x007f, B:27:0x009d, B:29:0x00a6, B:31:0x00ac, B:37:0x00de, B:39:0x00e4, B:41:0x00ed, B:43:0x0109, B:44:0x014c, B:46:0x0156, B:47:0x0168, B:49:0x0180, B:70:0x01e4, B:72:0x01ec, B:73:0x01f2, B:74:0x01fe, B:20:0x006e), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f2 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:34:0x00bf, B:36:0x00cc, B:75:0x0203, B:23:0x007f, B:27:0x009d, B:29:0x00a6, B:31:0x00ac, B:37:0x00de, B:39:0x00e4, B:41:0x00ed, B:43:0x0109, B:44:0x014c, B:46:0x0156, B:47:0x0168, B:49:0x0180, B:70:0x01e4, B:72:0x01ec, B:73:0x01f2, B:74:0x01fe, B:20:0x006e), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bc -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.payments.api.PaymentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveUserAccount(String str, UUID uuid, String str2, Continuation<? super Outcome<Unit, ? extends CoreError>> continuation) {
        C427791 c427791;
        PaymentApiImpl paymentApiImpl;
        String str3;
        Object validationError;
        Object fail;
        String str4;
        int i;
        C427791 c4277912;
        PaymentApiImpl paymentApiImpl2;
        String str5;
        UUID uuid2;
        PaymentApiImpl paymentApiImpl3;
        String str6;
        UUID uuid3;
        String str7;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        UUID uuid4;
        int i5;
        String str8;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427791) {
            c427791 = (C427791) continuation;
            int i6 = c427791.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427791.label = i6 - Integer.MIN_VALUE;
                paymentApiImpl = this;
            } else {
                paymentApiImpl = this;
                c427791 = paymentApiImpl.new C427791(continuation);
            }
        }
        Object objSaveUserAccount = c427791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427791.label;
        int i8 = 2;
        int i9 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str3 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str3, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str3, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str3, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(objSaveUserAccount);
            str4 = str2;
            i = 0;
            c4277912 = c427791;
            paymentApiImpl2 = paymentApiImpl;
            str5 = str;
            uuid2 = uuid;
            jDelayTime = Request2.delayTime(i);
            c4277912.L$0 = paymentApiImpl2;
            c4277912.L$1 = str5;
            c4277912.L$2 = uuid2;
            c4277912.L$3 = str4;
            c4277912.I$0 = i;
            c4277912.label = i9;
            if (DelayKt.delay(jDelayTime, c4277912) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427791.I$0;
                str7 = (String) c427791.L$3;
                uuid3 = (UUID) c427791.L$2;
                str6 = (String) c427791.L$1;
                paymentApiImpl3 = (PaymentApiImpl) c427791.L$0;
                ResultKt.throwOnFailure(objSaveUserAccount);
                UUID uuid5 = uuid3;
                C427791 c4277913 = c427791;
                PaymentApiImpl paymentApiImpl4 = paymentApiImpl3;
                Response response = (Response) objSaveUserAccount;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
                    uuid4 = uuid5;
                    i5 = i3;
                    i4 = iCode;
                } else {
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    String str9 = response.headers().get("tl-trace-id");
                    String url = response.raw().getRequest().getUrl().getUrl();
                    if (i3 > 0) {
                        TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str9, url, 17, null));
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                    }
                    i4 = iCode;
                    int i10 = i3;
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i10, strString, str9, url, 6, null);
                    String str10 = strString;
                    if (str10 == null || str10.length() == 0) {
                        uuid4 = uuid5;
                        i5 = i10;
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            uuid4 = uuid5;
                            str8 = str10;
                            httpError = httpError2;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        Object objDecodeFromString = jsonDefault.decodeFromString(PaymentApiError.INSTANCE.serializer(), str10);
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, objDecodeFromString, i10, str10, str9, url, 2, null);
                        uuid4 = uuid5;
                        i5 = i10;
                        str8 = str10;
                        String str11 = str9;
                        String str12 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    uuid2 = uuid4;
                    str4 = str7;
                    c4277912 = c4277913;
                    str5 = str6;
                    i = i5;
                    paymentApiImpl2 = paymentApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4277912.L$0 = paymentApiImpl2;
                    c4277912.L$1 = str5;
                    c4277912.L$2 = uuid2;
                    c4277912.L$3 = str4;
                    c4277912.I$0 = i;
                    c4277912.label = i9;
                    if (DelayKt.delay(jDelayTime, c4277912) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    uuid3 = uuid2;
                    c427791 = c4277912;
                    str7 = str4;
                    i2 = i11;
                    paymentApiImpl3 = paymentApiImpl2;
                    str6 = str5;
                    i3 = i2 + i9;
                    PaymentApiService paymentApiService = paymentApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str6);
                    String string2 = uuid3 == null ? uuid3.toString() : null;
                    c427791.L$0 = paymentApiImpl3;
                    c427791.L$1 = str6;
                    c427791.L$2 = uuid3;
                    c427791.L$3 = str7;
                    c427791.I$0 = i3;
                    c427791.label = i8;
                    objSaveUserAccount = paymentApiService.saveUserAccount(bearerToken, string2, str7, c427791);
                }
                if (!(fail instanceof Ok)) {
                    return fail;
                }
                if (fail instanceof Fail) {
                    return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
                }
                throw new NoWhenBranchMatchedException();
            }
            i2 = c427791.I$0;
            str7 = (String) c427791.L$3;
            uuid3 = (UUID) c427791.L$2;
            str6 = (String) c427791.L$1;
            paymentApiImpl3 = (PaymentApiImpl) c427791.L$0;
            ResultKt.throwOnFailure(objSaveUserAccount);
            i3 = i2 + i9;
            PaymentApiService paymentApiService2 = paymentApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str6);
            if (uuid3 == null) {
            }
            c427791.L$0 = paymentApiImpl3;
            c427791.L$1 = str6;
            c427791.L$2 = uuid3;
            c427791.L$3 = str7;
            c427791.I$0 = i3;
            c427791.label = i8;
            objSaveUserAccount = paymentApiService2.saveUserAccount(bearerToken2, string2, str7, c427791);
        }
    }
}
