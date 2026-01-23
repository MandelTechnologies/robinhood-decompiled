package com.truelayer.payments.core.network.experience.api;

import android.util.Log;
import com.jakewharton.retrofit2.converter.kotlinx.serialization.Factory2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.domain.configuration.HttpConnectionConfiguration2;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.core.domain.experience.scheme.SchemeSelection;
import com.truelayer.payments.core.domain.payments.AdditionalInput;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.payments.ProviderConfig;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.domain.utils.Outcome4;
import com.truelayer.payments.core.network.NetworkError;
import com.truelayer.payments.core.network.common.Request2;
import com.truelayer.payments.core.network.experience.entity.PaymentsExperienceApiError;
import com.truelayer.payments.core.network.experience.entity.request.SchemeSelectionRequest;
import com.truelayer.payments.core.network.experience.entity.request.SubmitEncryptedFormRequest;
import com.truelayer.payments.core.network.experience.entity.response.FingerprintResponse;
import com.truelayer.payments.core.network.experience.entity.response.LocalisationLegalsResponse;
import com.truelayer.payments.core.network.experience.entity.response.MerchantConfigResponse;
import com.truelayer.payments.core.network.experience.entity.response.ProvidersConfigResponse;
import com.truelayer.payments.core.network.experience.entity.response.SchemeSelectionResponse;
import com.truelayer.payments.core.network.payments.entity.PaymentApiError;
import com.truelayer.payments.core.network.payments.entity.request.SubmitFormRequest;
import com.truelayer.payments.core.utils.ErrorUtils2;
import com.truelayer.payments.core.utils.ExtensionsKt;
import com.truelayer.payments.core.utils.JsonConverter2;
import com.truelayer.payments.core.utils.RSAEncryptionHelper;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;

/* compiled from: PaymentsExperienceApiImpl.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J2\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0018J*\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0018J(\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J8\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J8\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0096@¢\u0006\u0002\u0010'J8\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*0)\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010\u0018J2\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010.JH\u0010/\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u001b\u001a\u00020\u000f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0)H\u0096@¢\u0006\u0002\u00104J\f\u00105\u001a\u00020\u000f*\u00020!H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/api/PaymentsExperienceApiImpl;", "Lcom/truelayer/payments/core/network/experience/api/PaymentsExperienceApi;", "uri", "Lokhttp3/HttpUrl;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)V", "apiService", "Lcom/truelayer/payments/core/network/experience/api/PaymentsExperienceApiService;", "getAdditionalInputs", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "resourceToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLegals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "countryCode", "isSignupPlus", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMandatesLegals", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "paymentId", "getProvidersConfig", "Lcom/truelayer/payments/core/domain/payments/ProviderConfig;", "getRecommendedProvidersIds", "userId", "paymentType", "Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSchemeSelection", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelection;", "currencyCode", "schemeIds", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTranslations", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "getUserPriming", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "providerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitEncryptedForm", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "idempotencyKey", "Ljava/util/UUID;", "inputs", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intoRecommendationApiValue", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PaymentsExperienceApiImpl implements PaymentsExperienceApi {
    private final PaymentsExperienceApiService apiService;

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentContext.PaymentType.values().length];
            try {
                iArr[PaymentContext.PaymentType.SinglePayment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentContext.PaymentType.Mandate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl", m3645f = "PaymentsExperienceApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "getAdditionalInputs")
    /* renamed from: com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl$getAdditionalInputs$1 */
    static final class C427451 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C427451(Continuation<? super C427451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentsExperienceApiImpl.this.getAdditionalInputs(null, this);
        }
    }

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl", m3645f = "PaymentsExperienceApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 64}, m3647m = "getLegals")
    /* renamed from: com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl$getLegals$1 */
    static final class C427461 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C427461(Continuation<? super C427461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentsExperienceApiImpl.this.getLegals(null, null, false, this);
        }
    }

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl", m3645f = "PaymentsExperienceApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 77}, m3647m = "getMandatesLegals")
    /* renamed from: com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl$getMandatesLegals$1 */
    static final class C427471 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C427471(Continuation<? super C427471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentsExperienceApiImpl.this.getMandatesLegals(null, null, this);
        }
    }

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl", m3645f = "PaymentsExperienceApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "getMerchantConfig")
    /* renamed from: com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl$getMerchantConfig$1 */
    static final class C427481 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C427481(Continuation<? super C427481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentsExperienceApiImpl.this.getMerchantConfig(null, null, this);
        }
    }

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl", m3645f = "PaymentsExperienceApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "getProvidersConfig")
    /* renamed from: com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl$getProvidersConfig$1 */
    static final class C427491 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C427491(Continuation<? super C427491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentsExperienceApiImpl.this.getProvidersConfig(null, this);
        }
    }

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl", m3645f = "PaymentsExperienceApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "getRecommendedProvidersIds")
    /* renamed from: com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl$getRecommendedProvidersIds$1 */
    static final class C427501 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C427501(Continuation<? super C427501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentsExperienceApiImpl.this.getRecommendedProvidersIds(null, null, null, this);
        }
    }

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl", m3645f = "PaymentsExperienceApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 151}, m3647m = "getSchemeSelection")
    /* renamed from: com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl$getSchemeSelection$1 */
    static final class C427511 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C427511(Continuation<? super C427511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentsExperienceApiImpl.this.getSchemeSelection(null, null, null, this);
        }
    }

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl", m3645f = "PaymentsExperienceApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 93}, m3647m = "getTranslations")
    /* renamed from: com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl$getTranslations$1 */
    static final class C427521 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C427521(Continuation<? super C427521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentsExperienceApiImpl.this.getTranslations(null, null, this);
        }
    }

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl", m3645f = "PaymentsExperienceApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 112}, m3647m = "getUserPriming")
    /* renamed from: com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl$getUserPriming$1 */
    static final class C427531 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C427531(Continuation<? super C427531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentsExperienceApiImpl.this.getUserPriming(null, null, null, this);
        }
    }

    /* compiled from: PaymentsExperienceApiImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl", m3645f = "PaymentsExperienceApiImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, 391, 239}, m3647m = "submitEncryptedForm")
    /* renamed from: com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl$submitEncryptedForm$1 */
    static final class C427541 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C427541(Continuation<? super C427541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentsExperienceApiImpl.this.submitEncryptedForm(null, null, null, null, this);
        }
    }

    public PaymentsExperienceApiImpl(HttpUrl uri, OkHttpClient client) throws SecurityException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(client, "client");
        Object objCreate = new Retrofit.Builder().client(client).addConverterFactory(Factory2.create(JsonConverter2.getJsonDefault(), MediaType.INSTANCE.get("application/json"))).baseUrl(uri).build().create(PaymentsExperienceApiService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.apiService = (PaymentsExperienceApiService) objCreate;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:118|48|49|120|50|51|124|52|53|122|54) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01be, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bf, code lost:
    
        r37 = r23;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c5, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ca, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cb, code lost:
    
        r37 = r23;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01cf, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01de, code lost:
    
        if (r13.code() >= 500) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e0, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e6, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e0 A[Catch: all -> 0x004e, TryCatch #4 {all -> 0x004e, blocks: (B:13:0x0042, B:30:0x00b3, B:32:0x00c0, B:71:0x01f7, B:23:0x007b, B:27:0x0099, B:33:0x00d2, B:35:0x00d8, B:37:0x00e1, B:39:0x00fd, B:40:0x0140, B:42:0x014a, B:43:0x015c, B:45:0x0174, B:66:0x01d8, B:68:0x01e0, B:69:0x01e6, B:70:0x01f2, B:20:0x006a), top: B:126:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e6 A[Catch: all -> 0x004e, TryCatch #4 {all -> 0x004e, blocks: (B:13:0x0042, B:30:0x00b3, B:32:0x00c0, B:71:0x01f7, B:23:0x007b, B:27:0x0099, B:33:0x00d2, B:35:0x00d8, B:37:0x00e1, B:39:0x00fd, B:40:0x0140, B:42:0x014a, B:43:0x015c, B:45:0x0174, B:66:0x01d8, B:68:0x01e0, B:69:0x01e6, B:70:0x01f2, B:20:0x006a), top: B:126:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b0 -> B:14:0x0045). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getLegals(String str, String str2, boolean z, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation) {
        C427461 c427461;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl;
        String str3;
        Object validationError;
        Object fail;
        boolean z2;
        int i;
        C427461 c4274612;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl2;
        String str4;
        String str5;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl3;
        String str6;
        String str7;
        boolean z3;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        String str8;
        int i5;
        String str9;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427461) {
            c427461 = (C427461) continuation;
            int i6 = c427461.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427461.label = i6 - Integer.MIN_VALUE;
                paymentsExperienceApiImpl = this;
            } else {
                paymentsExperienceApiImpl = this;
                c427461 = paymentsExperienceApiImpl.new C427461(continuation);
            }
        }
        Object legals = c427461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427461.label;
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
            ResultKt.throwOnFailure(legals);
            z2 = z;
            i = 0;
            c4274612 = c427461;
            paymentsExperienceApiImpl2 = paymentsExperienceApiImpl;
            str4 = str;
            str5 = str2;
            jDelayTime = Request2.delayTime(i);
            c4274612.L$0 = paymentsExperienceApiImpl2;
            c4274612.L$1 = str4;
            c4274612.L$2 = str5;
            c4274612.Z$0 = z2;
            c4274612.I$0 = i;
            c4274612.label = i9;
            if (DelayKt.delay(jDelayTime, c4274612) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427461.I$0;
                z3 = c427461.Z$0;
                str7 = (String) c427461.L$2;
                str6 = (String) c427461.L$1;
                paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427461.L$0;
                ResultKt.throwOnFailure(legals);
                String str10 = str7;
                C427461 c4274613 = c427461;
                PaymentsExperienceApiImpl paymentsExperienceApiImpl4 = paymentsExperienceApiImpl3;
                Response response = (Response) legals;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
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
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            str8 = str10;
                            str9 = str12;
                            httpError = httpError2;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        Object objDecodeFromString = jsonDefault.decodeFromString(PaymentsExperienceApiError.INSTANCE.serializer(), str12);
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, objDecodeFromString, i10, str12, str11, url, 2, null);
                        str8 = str10;
                        i5 = i10;
                        str9 = str12;
                        String str13 = str11;
                        String str14 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    str5 = str8;
                    z2 = z3;
                    c4274612 = c4274613;
                    str4 = str6;
                    i = i5;
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4274612.L$0 = paymentsExperienceApiImpl2;
                    c4274612.L$1 = str4;
                    c4274612.L$2 = str5;
                    c4274612.Z$0 = z2;
                    c4274612.I$0 = i;
                    c4274612.label = i9;
                    if (DelayKt.delay(jDelayTime, c4274612) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    str7 = str5;
                    c427461 = c4274612;
                    z3 = z2;
                    i2 = i11;
                    paymentsExperienceApiImpl3 = paymentsExperienceApiImpl2;
                    str6 = str4;
                    i3 = i2 + i9;
                    PaymentsExperienceApiService paymentsExperienceApiService = paymentsExperienceApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str6);
                    c427461.L$0 = paymentsExperienceApiImpl3;
                    c427461.L$1 = str6;
                    c427461.L$2 = str7;
                    c427461.Z$0 = z3;
                    c427461.I$0 = i3;
                    c427461.label = i8;
                    legals = paymentsExperienceApiService.getLegals(bearerToken, str7, z3, c427461);
                }
                if (!(fail instanceof Ok)) {
                    fail = new Ok(((LocalisationLegalsResponse) ((Ok) fail).getValue()).intoDomain2());
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
            i2 = c427461.I$0;
            z3 = c427461.Z$0;
            str7 = (String) c427461.L$2;
            str6 = (String) c427461.L$1;
            paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427461.L$0;
            ResultKt.throwOnFailure(legals);
            i3 = i2 + i9;
            PaymentsExperienceApiService paymentsExperienceApiService2 = paymentsExperienceApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str6);
            c427461.L$0 = paymentsExperienceApiImpl3;
            c427461.L$1 = str6;
            c427461.L$2 = str7;
            c427461.Z$0 = z3;
            c427461.I$0 = i3;
            c427461.label = i8;
            legals = paymentsExperienceApiService2.getLegals(bearerToken2, str7, z3, c427461);
        }
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
    @Override // com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getMandatesLegals(String str, String str2, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation) {
        C427471 c427471;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl;
        String str3;
        Object validationError;
        Object fail;
        int i;
        C427471 c4274712;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl2;
        String str4;
        String str5;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl3;
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
        if (continuation instanceof C427471) {
            c427471 = (C427471) continuation;
            int i6 = c427471.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427471.label = i6 - Integer.MIN_VALUE;
                paymentsExperienceApiImpl = this;
            } else {
                paymentsExperienceApiImpl = this;
                c427471 = paymentsExperienceApiImpl.new C427471(continuation);
            }
        }
        Object mandatesLegals = c427471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427471.label;
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
            ResultKt.throwOnFailure(mandatesLegals);
            i = 0;
            c4274712 = c427471;
            paymentsExperienceApiImpl2 = paymentsExperienceApiImpl;
            str4 = str;
            str5 = str2;
            jDelayTime = Request2.delayTime(i);
            c4274712.L$0 = paymentsExperienceApiImpl2;
            c4274712.L$1 = str4;
            c4274712.L$2 = str5;
            c4274712.I$0 = i;
            c4274712.label = i9;
            if (DelayKt.delay(jDelayTime, c4274712) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427471.I$0;
                str7 = (String) c427471.L$2;
                str6 = (String) c427471.L$1;
                paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427471.L$0;
                ResultKt.throwOnFailure(mandatesLegals);
                String str11 = str7;
                C427471 c4274713 = c427471;
                str5 = str11;
                PaymentsExperienceApiImpl paymentsExperienceApiImpl4 = paymentsExperienceApiImpl3;
                Response response = (Response) mandatesLegals;
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
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentsExperienceApiError.INSTANCE.serializer(), str13), i10, str13, str12, url, 2, null);
                        i5 = i10;
                        str10 = str13;
                        str8 = str12;
                        str9 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    c4274712 = c4274713;
                    str4 = str6;
                    i = i5;
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4274712.L$0 = paymentsExperienceApiImpl2;
                    c4274712.L$1 = str4;
                    c4274712.L$2 = str5;
                    c4274712.I$0 = i;
                    c4274712.label = i9;
                    if (DelayKt.delay(jDelayTime, c4274712) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    str7 = str5;
                    c427471 = c4274712;
                    i2 = i11;
                    paymentsExperienceApiImpl3 = paymentsExperienceApiImpl2;
                    str6 = str4;
                    i3 = i2 + i9;
                    PaymentsExperienceApiService paymentsExperienceApiService = paymentsExperienceApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str6);
                    c427471.L$0 = paymentsExperienceApiImpl3;
                    c427471.L$1 = str6;
                    c427471.L$2 = str7;
                    c427471.I$0 = i3;
                    c427471.label = i8;
                    mandatesLegals = paymentsExperienceApiService.getMandatesLegals(bearerToken, str7, c427471);
                }
                if (fail instanceof Ok) {
                    fail = new Ok(((LocalisationLegalsResponse) ((Ok) fail).getValue()).intoDomain2());
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
            i2 = c427471.I$0;
            str7 = (String) c427471.L$2;
            str6 = (String) c427471.L$1;
            paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427471.L$0;
            ResultKt.throwOnFailure(mandatesLegals);
            i3 = i2 + i9;
            PaymentsExperienceApiService paymentsExperienceApiService2 = paymentsExperienceApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str6);
            c427471.L$0 = paymentsExperienceApiImpl3;
            c427471.L$1 = str6;
            c427471.L$2 = str7;
            c427471.I$0 = i3;
            c427471.label = i8;
            mandatesLegals = paymentsExperienceApiService2.getMandatesLegals(bearerToken2, str7, c427471);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:131)|48|49|137|50|51|133|52|53|129|54|55|139|56) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:131|48|49|137|50|51|133|52|53|129|54|55|139|56) */
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
    /* JADX WARN: Removed duplicated region for block: B:116:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d5 A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:13:0x0040, B:30:0x00a7, B:32:0x00b4, B:74:0x01ec, B:23:0x0074, B:27:0x008f, B:33:0x00c4, B:35:0x00ca, B:37:0x00d3, B:39:0x00ef, B:40:0x0132, B:42:0x013c, B:43:0x014e, B:45:0x016d, B:69:0x01cd, B:71:0x01d5, B:72:0x01db, B:73:0x01e7, B:20:0x0065), top: B:135:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01db A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:13:0x0040, B:30:0x00a7, B:32:0x00b4, B:74:0x01ec, B:23:0x0074, B:27:0x008f, B:33:0x00c4, B:35:0x00ca, B:37:0x00d3, B:39:0x00ef, B:40:0x0132, B:42:0x013c, B:43:0x014e, B:45:0x016d, B:69:0x01cd, B:71:0x01d5, B:72:0x01db, B:73:0x01e7, B:20:0x0065), top: B:135:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a4 -> B:14:0x0043). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTranslations(String str, String str2, Continuation<? super Outcome<? extends Map<String, LocalisedText>, ? extends CoreError>> continuation) {
        C427521 c427521;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl;
        Object validationError;
        Object fail;
        int i;
        C427521 c4275212;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl2;
        String str3;
        String str4;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl3;
        String str5;
        String str6;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        int i5;
        NetworkError.HttpError httpError;
        String str7;
        String str8;
        String str9;
        if (continuation instanceof C427521) {
            c427521 = (C427521) continuation;
            int i6 = c427521.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427521.label = i6 - Integer.MIN_VALUE;
                paymentsExperienceApiImpl = this;
            } else {
                paymentsExperienceApiImpl = this;
                c427521 = paymentsExperienceApiImpl.new C427521(continuation);
            }
        }
        Object translations = c427521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427521.label;
        int i8 = 2;
        int i9 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            String str10 = stackTraceElement != null ? stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() : null;
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str10, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str10, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str10, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(translations);
            i = 0;
            c4275212 = c427521;
            paymentsExperienceApiImpl2 = paymentsExperienceApiImpl;
            str3 = str;
            str4 = str2;
            jDelayTime = Request2.delayTime(i);
            c4275212.L$0 = paymentsExperienceApiImpl2;
            c4275212.L$1 = str3;
            c4275212.L$2 = str4;
            c4275212.I$0 = i;
            c4275212.label = i9;
            if (DelayKt.delay(jDelayTime, c4275212) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427521.I$0;
                str6 = (String) c427521.L$2;
                str5 = (String) c427521.L$1;
                paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427521.L$0;
                ResultKt.throwOnFailure(translations);
                String str11 = str6;
                C427521 c4275213 = c427521;
                str4 = str11;
                PaymentsExperienceApiImpl paymentsExperienceApiImpl4 = paymentsExperienceApiImpl3;
                Response response = (Response) translations;
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
                            str7 = str12;
                            str8 = url;
                            str9 = str13;
                            i5 = i10;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentsExperienceApiError.INSTANCE.serializer(), str13), i10, str13, str12, url, 2, null);
                        i5 = i10;
                        str9 = str13;
                        str7 = str12;
                        str8 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    c4275212 = c4275213;
                    str3 = str5;
                    i = i5;
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4275212.L$0 = paymentsExperienceApiImpl2;
                    c4275212.L$1 = str3;
                    c4275212.L$2 = str4;
                    c4275212.I$0 = i;
                    c4275212.label = i9;
                    if (DelayKt.delay(jDelayTime, c4275212) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    str6 = str4;
                    c427521 = c4275212;
                    i2 = i11;
                    paymentsExperienceApiImpl3 = paymentsExperienceApiImpl2;
                    str5 = str3;
                    i3 = i2 + i9;
                    PaymentsExperienceApiService paymentsExperienceApiService = paymentsExperienceApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str5);
                    c427521.L$0 = paymentsExperienceApiImpl3;
                    c427521.L$1 = str5;
                    c427521.L$2 = str6;
                    c427521.I$0 = i3;
                    c427521.label = i8;
                    translations = paymentsExperienceApiService.getTranslations(bearerToken, str6, c427521);
                }
                if (fail instanceof Ok) {
                    List list = (List) ((Ok) fail).getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.truelayer.payments.core.network.experience.entity.response.LocalisedText) it.next()).intoDomain2());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
                    for (Object obj : arrayList) {
                        linkedHashMap.put(((LocalisedText) obj).getKey(), obj);
                    }
                    fail = new Ok(linkedHashMap);
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
            i2 = c427521.I$0;
            str6 = (String) c427521.L$2;
            str5 = (String) c427521.L$1;
            paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427521.L$0;
            ResultKt.throwOnFailure(translations);
            i3 = i2 + i9;
            PaymentsExperienceApiService paymentsExperienceApiService2 = paymentsExperienceApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str5);
            c427521.L$0 = paymentsExperienceApiImpl3;
            c427521.L$1 = str5;
            c427521.L$2 = str6;
            c427521.I$0 = i3;
            c427521.label = i8;
            translations = paymentsExperienceApiService2.getTranslations(bearerToken2, str6, c427521);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:124)|48|49|126|50|51|122|52|53|118|54) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:124|48|49|126|50|51|122|52|53|118|54) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c3, code lost:
    
        r37 = r23;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c9, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ce, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cf, code lost:
    
        r37 = r23;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d3, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e2, code lost:
    
        if (r13.code() >= 500) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e4, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ea, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4 A[Catch: all -> 0x0050, TryCatch #1 {all -> 0x0050, blocks: (B:13:0x0044, B:30:0x00b7, B:32:0x00c4, B:71:0x01fb, B:23:0x007f, B:27:0x009d, B:33:0x00d6, B:35:0x00dc, B:37:0x00e5, B:39:0x0101, B:40:0x0144, B:42:0x014e, B:43:0x0160, B:45:0x0178, B:66:0x01dc, B:68:0x01e4, B:69:0x01ea, B:70:0x01f6, B:20:0x006e), top: B:120:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea A[Catch: all -> 0x0050, TryCatch #1 {all -> 0x0050, blocks: (B:13:0x0044, B:30:0x00b7, B:32:0x00c4, B:71:0x01fb, B:23:0x007f, B:27:0x009d, B:33:0x00d6, B:35:0x00dc, B:37:0x00e5, B:39:0x0101, B:40:0x0144, B:42:0x014e, B:43:0x0160, B:45:0x0178, B:66:0x01dc, B:68:0x01e4, B:69:0x01ea, B:70:0x01f6, B:20:0x006e), top: B:120:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUserPriming(String str, String str2, String str3, Continuation<? super Outcome<? extends UserPriming, ? extends CoreError>> continuation) {
        C427531 c427531;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl;
        String str4;
        Object validationError;
        Object fail;
        String str5;
        int i;
        C427531 c4275312;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl2;
        String str6;
        String str7;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl3;
        String str8;
        String str9;
        String str10;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        String str11;
        int i5;
        String str12;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427531) {
            c427531 = (C427531) continuation;
            int i6 = c427531.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427531.label = i6 - Integer.MIN_VALUE;
                paymentsExperienceApiImpl = this;
            } else {
                paymentsExperienceApiImpl = this;
                c427531 = paymentsExperienceApiImpl.new C427531(continuation);
            }
        }
        Object userPriming = c427531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427531.label;
        int i8 = 2;
        int i9 = 1;
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
        if (i7 == 0) {
            ResultKt.throwOnFailure(userPriming);
            str5 = str3;
            i = 0;
            c4275312 = c427531;
            paymentsExperienceApiImpl2 = paymentsExperienceApiImpl;
            str6 = str;
            str7 = str2;
            jDelayTime = Request2.delayTime(i);
            c4275312.L$0 = paymentsExperienceApiImpl2;
            c4275312.L$1 = str6;
            c4275312.L$2 = str7;
            c4275312.L$3 = str5;
            c4275312.I$0 = i;
            c4275312.label = i9;
            if (DelayKt.delay(jDelayTime, c4275312) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427531.I$0;
                str10 = (String) c427531.L$3;
                str9 = (String) c427531.L$2;
                str8 = (String) c427531.L$1;
                paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427531.L$0;
                ResultKt.throwOnFailure(userPriming);
                String str13 = str9;
                C427531 c4275313 = c427531;
                PaymentsExperienceApiImpl paymentsExperienceApiImpl4 = paymentsExperienceApiImpl3;
                Response response = (Response) userPriming;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
                    str11 = str13;
                    i5 = i3;
                    i4 = iCode;
                } else {
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    String str14 = response.headers().get("tl-trace-id");
                    String url = response.raw().getRequest().getUrl().getUrl();
                    if (i3 > 0) {
                        TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, strString, str14, url, 17, null));
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                    }
                    i4 = iCode;
                    int i10 = i3;
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i10, strString, str14, url, 6, null);
                    String str15 = strString;
                    if (str15 == null || str15.length() == 0) {
                        str11 = str13;
                        i5 = i10;
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            str11 = str13;
                            str12 = str15;
                            httpError = httpError2;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        Object objDecodeFromString = jsonDefault.decodeFromString(PaymentsExperienceApiError.INSTANCE.serializer(), str15);
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, objDecodeFromString, i10, str15, str14, url, 2, null);
                        str11 = str13;
                        i5 = i10;
                        str12 = str15;
                        String str16 = str14;
                        String str17 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    str7 = str11;
                    str5 = str10;
                    c4275312 = c4275313;
                    str6 = str8;
                    i = i5;
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4275312.L$0 = paymentsExperienceApiImpl2;
                    c4275312.L$1 = str6;
                    c4275312.L$2 = str7;
                    c4275312.L$3 = str5;
                    c4275312.I$0 = i;
                    c4275312.label = i9;
                    if (DelayKt.delay(jDelayTime, c4275312) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    str9 = str7;
                    c427531 = c4275312;
                    str10 = str5;
                    i2 = i11;
                    paymentsExperienceApiImpl3 = paymentsExperienceApiImpl2;
                    str8 = str6;
                    i3 = i2 + i9;
                    PaymentsExperienceApiService paymentsExperienceApiService = paymentsExperienceApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str8);
                    c427531.L$0 = paymentsExperienceApiImpl3;
                    c427531.L$1 = str8;
                    c427531.L$2 = str9;
                    c427531.L$3 = str10;
                    c427531.I$0 = i3;
                    c427531.label = i8;
                    userPriming = paymentsExperienceApiService.getUserPriming(bearerToken, str9, str10, c427531);
                }
                if (!(fail instanceof Ok)) {
                    fail = new Ok(((com.truelayer.payments.core.network.experience.entity.response.UserPriming) ((Ok) fail).getValue()).intoDomain2());
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
            i2 = c427531.I$0;
            str10 = (String) c427531.L$3;
            str9 = (String) c427531.L$2;
            str8 = (String) c427531.L$1;
            paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427531.L$0;
            ResultKt.throwOnFailure(userPriming);
            i3 = i2 + i9;
            PaymentsExperienceApiService paymentsExperienceApiService2 = paymentsExperienceApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str8);
            c427531.L$0 = paymentsExperienceApiImpl3;
            c427531.L$1 = str8;
            c427531.L$2 = str9;
            c427531.L$3 = str10;
            c427531.I$0 = i3;
            c427531.label = i8;
            userPriming = paymentsExperienceApiService2.getUserPriming(bearerToken2, str9, str10, c427531);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:131)|48|49|125|50|51|135|52|53|133|54|55|129|56) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:131|48|49|125|50|51|135|52|53|133|54|55|129|56) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0194, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0196, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0197, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0199, code lost:
    
        r12 = r17;
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019f, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a2, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ad, code lost:
    
        if (r11.code() < 500) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01af, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b5, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r11, r12, r13));
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01af A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:13:0x003c, B:30:0x008f, B:32:0x009c, B:74:0x01c6, B:23:0x0064, B:27:0x0079, B:33:0x00ab, B:35:0x00b1, B:37:0x00ba, B:39:0x00d6, B:40:0x0121, B:42:0x012b, B:43:0x013d, B:45:0x0156, B:69:0x01a7, B:71:0x01af, B:72:0x01b5, B:73:0x01c1, B:20:0x0058), top: B:127:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b5 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:13:0x003c, B:30:0x008f, B:32:0x009c, B:74:0x01c6, B:23:0x0064, B:27:0x0079, B:33:0x00ab, B:35:0x00b1, B:37:0x00ba, B:39:0x00d6, B:40:0x0121, B:42:0x012b, B:43:0x013d, B:45:0x0156, B:69:0x01a7, B:71:0x01af, B:72:0x01b5, B:73:0x01c1, B:20:0x0058), top: B:127:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008c -> B:14:0x003f). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAdditionalInputs(String str, Continuation<? super Outcome<? extends List<? extends AdditionalInput>, ? extends CoreError>> continuation) {
        C427451 c427451;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl;
        String str2;
        Object validationError;
        Object fail;
        int i;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl2;
        String str3;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl3;
        String str4;
        int i2;
        long jDelayTime;
        int i3;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427451) {
            c427451 = (C427451) continuation;
            int i4 = c427451.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c427451.label = i4 - Integer.MIN_VALUE;
                paymentsExperienceApiImpl = this;
            } else {
                paymentsExperienceApiImpl = this;
                c427451 = paymentsExperienceApiImpl.new C427451(continuation);
            }
        }
        Object additionalInputs = c427451.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c427451.label;
        int i6 = 2;
        int i7 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str2 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str2 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str2, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str2, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str2, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i5 == 0) {
            ResultKt.throwOnFailure(additionalInputs);
            i = 0;
            paymentsExperienceApiImpl2 = paymentsExperienceApiImpl;
            str3 = str;
            jDelayTime = Request2.delayTime(i);
            c427451.L$0 = paymentsExperienceApiImpl2;
            c427451.L$1 = str3;
            c427451.I$0 = i;
            c427451.label = i7;
            if (DelayKt.delay(jDelayTime, c427451) != coroutine_suspended) {
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = c427451.I$0;
                str4 = (String) c427451.L$1;
                paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427451.L$0;
                ResultKt.throwOnFailure(additionalInputs);
                int i8 = i2;
                PaymentsExperienceApiImpl paymentsExperienceApiImpl4 = paymentsExperienceApiImpl3;
                Response response = (Response) additionalInputs;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
                    i3 = iCode;
                } else {
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    String str5 = response.headers().get("tl-trace-id");
                    String url = response.raw().getRequest().getUrl().getUrl();
                    if (i8 > 0) {
                        TrueLayerAnalytics analytics$payments_core_release = TrueLayerCore.INSTANCE.getAnalytics$payments_core_release();
                        String str6 = strString;
                        AnalyticsEvents.BackgroundError backgroundError = new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i8 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, str6, str5, url, 17, null);
                        strString = str6;
                        str5 = str5;
                        url = url;
                        analytics$payments_core_release.track(backgroundError);
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                    }
                    i3 = iCode;
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i8, strString, str5, url, 6, null);
                    String str7 = strString;
                    if (str7 == null || str7.length() == 0) {
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            httpError = httpError2;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentsExperienceApiError.INSTANCE.serializer(), str7), i8, str7, str5, url, 2, null);
                        str7 = str7;
                        String str8 = str5;
                        String str9 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i8, i3)) {
                    str3 = str4;
                    i6 = 2;
                    i7 = 1;
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl4;
                    i = i8;
                    jDelayTime = Request2.delayTime(i);
                    c427451.L$0 = paymentsExperienceApiImpl2;
                    c427451.L$1 = str3;
                    c427451.I$0 = i;
                    c427451.label = i7;
                    if (DelayKt.delay(jDelayTime, c427451) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    paymentsExperienceApiImpl3 = paymentsExperienceApiImpl2;
                    str4 = str3;
                    i2 = i + i7;
                    PaymentsExperienceApiService paymentsExperienceApiService = paymentsExperienceApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str4);
                    c427451.L$0 = paymentsExperienceApiImpl3;
                    c427451.L$1 = str4;
                    c427451.I$0 = i2;
                    c427451.label = i6;
                    additionalInputs = paymentsExperienceApiService.getAdditionalInputs(bearerToken, c427451);
                }
                if (!(fail instanceof Ok)) {
                    if (!(fail instanceof Fail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    List list = (List) ((Ok) fail).getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.truelayer.payments.core.network.experience.entity.response.AdditionalInput) it.next()).intoDomain2());
                    }
                    fail = new Ok(arrayList);
                }
                if (fail instanceof Ok) {
                    return fail;
                }
                if (fail instanceof Fail) {
                    return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
                }
                throw new NoWhenBranchMatchedException();
            }
            i = c427451.I$0;
            str4 = (String) c427451.L$1;
            paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427451.L$0;
            ResultKt.throwOnFailure(additionalInputs);
            i2 = i + i7;
            PaymentsExperienceApiService paymentsExperienceApiService2 = paymentsExperienceApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str4);
            c427451.L$0 = paymentsExperienceApiImpl3;
            c427451.L$1 = str4;
            c427451.I$0 = i2;
            c427451.label = i6;
            additionalInputs = paymentsExperienceApiService2.getAdditionalInputs(bearerToken2, c427451);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:131)|48|49|125|50|51|135|52|53|133|54|55|129|56) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:131|48|49|125|50|51|135|52|53|133|54|55|129|56) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0194, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0196, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0197, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0199, code lost:
    
        r12 = r17;
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019f, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a2, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ad, code lost:
    
        if (r11.code() < 500) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01af, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b5, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r11, r12, r13));
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01af A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:13:0x003c, B:30:0x008f, B:32:0x009c, B:74:0x01c6, B:23:0x0064, B:27:0x0079, B:33:0x00ab, B:35:0x00b1, B:37:0x00ba, B:39:0x00d6, B:40:0x0121, B:42:0x012b, B:43:0x013d, B:45:0x0156, B:69:0x01a7, B:71:0x01af, B:72:0x01b5, B:73:0x01c1, B:20:0x0058), top: B:127:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b5 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:13:0x003c, B:30:0x008f, B:32:0x009c, B:74:0x01c6, B:23:0x0064, B:27:0x0079, B:33:0x00ab, B:35:0x00b1, B:37:0x00ba, B:39:0x00d6, B:40:0x0121, B:42:0x012b, B:43:0x013d, B:45:0x0156, B:69:0x01a7, B:71:0x01af, B:72:0x01b5, B:73:0x01c1, B:20:0x0058), top: B:127:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008c -> B:14:0x003f). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getProvidersConfig(String str, Continuation<? super Outcome<? extends List<ProviderConfig>, ? extends CoreError>> continuation) {
        C427491 c427491;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl;
        String str2;
        Object validationError;
        Object fail;
        int i;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl2;
        String str3;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl3;
        String str4;
        int i2;
        long jDelayTime;
        int i3;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427491) {
            c427491 = (C427491) continuation;
            int i4 = c427491.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c427491.label = i4 - Integer.MIN_VALUE;
                paymentsExperienceApiImpl = this;
            } else {
                paymentsExperienceApiImpl = this;
                c427491 = paymentsExperienceApiImpl.new C427491(continuation);
            }
        }
        Object providersConfig = c427491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c427491.label;
        int i6 = 2;
        int i7 = 1;
        try {
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
            if (stackTraceElement != null) {
                str2 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str2 = null;
            }
            if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, str2, 4, null);
            } else if ((th instanceof SocketTimeoutException) || (th instanceof IOException)) {
                validationError = new NetworkError.ConnectionError(th, th.toString(), null, str2, 4, null);
            } else {
                validationError = new NetworkError.ValidationError(th, th.toString(), null, str2, 4, null);
            }
            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th);
            }
            fail = new Fail(validationError);
        }
        if (i5 == 0) {
            ResultKt.throwOnFailure(providersConfig);
            i = 0;
            paymentsExperienceApiImpl2 = paymentsExperienceApiImpl;
            str3 = str;
            jDelayTime = Request2.delayTime(i);
            c427491.L$0 = paymentsExperienceApiImpl2;
            c427491.L$1 = str3;
            c427491.I$0 = i;
            c427491.label = i7;
            if (DelayKt.delay(jDelayTime, c427491) != coroutine_suspended) {
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = c427491.I$0;
                str4 = (String) c427491.L$1;
                paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427491.L$0;
                ResultKt.throwOnFailure(providersConfig);
                int i8 = i2;
                PaymentsExperienceApiImpl paymentsExperienceApiImpl4 = paymentsExperienceApiImpl3;
                Response response = (Response) providersConfig;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
                    i3 = iCode;
                } else {
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    String str5 = response.headers().get("tl-trace-id");
                    String url = response.raw().getRequest().getUrl().getUrl();
                    if (i8 > 0) {
                        TrueLayerAnalytics analytics$payments_core_release = TrueLayerCore.INSTANCE.getAnalytics$payments_core_release();
                        String str6 = strString;
                        AnalyticsEvents.BackgroundError backgroundError = new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i8 + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, str6, str5, url, 17, null);
                        strString = str6;
                        str5 = str5;
                        url = url;
                        analytics$payments_core_release.track(backgroundError);
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
                    }
                    i3 = iCode;
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response.code(), null, null, i8, strString, str5, url, 6, null);
                    String str7 = strString;
                    if (str7 == null || str7.length() == 0) {
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            httpError = httpError2;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(PaymentsExperienceApiError.INSTANCE.serializer(), str7), i8, str7, str5, url, 2, null);
                        str7 = str7;
                        String str8 = str5;
                        String str9 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i8, i3)) {
                    str3 = str4;
                    i6 = 2;
                    i7 = 1;
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl4;
                    i = i8;
                    jDelayTime = Request2.delayTime(i);
                    c427491.L$0 = paymentsExperienceApiImpl2;
                    c427491.L$1 = str3;
                    c427491.I$0 = i;
                    c427491.label = i7;
                    if (DelayKt.delay(jDelayTime, c427491) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    paymentsExperienceApiImpl3 = paymentsExperienceApiImpl2;
                    str4 = str3;
                    i2 = i + i7;
                    PaymentsExperienceApiService paymentsExperienceApiService = paymentsExperienceApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str4);
                    c427491.L$0 = paymentsExperienceApiImpl3;
                    c427491.L$1 = str4;
                    c427491.I$0 = i2;
                    c427491.label = i6;
                    providersConfig = paymentsExperienceApiService.getProvidersConfig(bearerToken, c427491);
                }
                if (!(fail instanceof Ok)) {
                    if (!(fail instanceof Fail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    List list = (List) ((Ok) fail).getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ProvidersConfigResponse) it.next()).intoDomain2());
                    }
                    fail = new Ok(arrayList);
                }
                if (fail instanceof Ok) {
                    return fail;
                }
                if (fail instanceof Fail) {
                    return new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
                }
                throw new NoWhenBranchMatchedException();
            }
            i = c427491.I$0;
            str4 = (String) c427491.L$1;
            paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427491.L$0;
            ResultKt.throwOnFailure(providersConfig);
            i2 = i + i7;
            PaymentsExperienceApiService paymentsExperienceApiService2 = paymentsExperienceApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str4);
            c427491.L$0 = paymentsExperienceApiImpl3;
            c427491.L$1 = str4;
            c427491.I$0 = i2;
            c427491.label = i6;
            providersConfig = paymentsExperienceApiService2.getProvidersConfig(bearerToken2, c427491);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:126)|48|49|120|50|51|124|52|53|122|54) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c8, code lost:
    
        r37 = r23;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ce, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d4, code lost:
    
        r37 = r23;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d8, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e7, code lost:
    
        if (r13.code() >= 500) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e9, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ef, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:30:0x00bc, B:32:0x00c9, B:71:0x0200, B:23:0x007f, B:27:0x009d, B:33:0x00db, B:35:0x00e1, B:37:0x00ea, B:39:0x0106, B:40:0x0149, B:42:0x0153, B:43:0x0165, B:45:0x017d, B:66:0x01e1, B:68:0x01e9, B:69:0x01ef, B:70:0x01fb, B:20:0x006e), top: B:118:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ef A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:13:0x0044, B:30:0x00bc, B:32:0x00c9, B:71:0x0200, B:23:0x007f, B:27:0x009d, B:33:0x00db, B:35:0x00e1, B:37:0x00ea, B:39:0x0106, B:40:0x0149, B:42:0x0153, B:43:0x0165, B:45:0x017d, B:66:0x01e1, B:68:0x01e9, B:69:0x01ef, B:70:0x01fb, B:20:0x006e), top: B:118:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b9 -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSchemeSelection(String str, String str2, List<String> list, Continuation<? super Outcome<? extends SchemeSelection, ? extends CoreError>> continuation) {
        C427511 c427511;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl;
        String str3;
        Object validationError;
        Object fail;
        List<String> list2;
        int i;
        C427511 c4275112;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl2;
        String str4;
        String str5;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl3;
        String str6;
        String str7;
        List<String> list3;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        String str8;
        int i5;
        String str9;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427511) {
            c427511 = (C427511) continuation;
            int i6 = c427511.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427511.label = i6 - Integer.MIN_VALUE;
                paymentsExperienceApiImpl = this;
            } else {
                paymentsExperienceApiImpl = this;
                c427511 = paymentsExperienceApiImpl.new C427511(continuation);
            }
        }
        Object schemeSelection = c427511.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427511.label;
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
            ResultKt.throwOnFailure(schemeSelection);
            list2 = list;
            i = 0;
            c4275112 = c427511;
            paymentsExperienceApiImpl2 = paymentsExperienceApiImpl;
            str4 = str;
            str5 = str2;
            jDelayTime = Request2.delayTime(i);
            c4275112.L$0 = paymentsExperienceApiImpl2;
            c4275112.L$1 = str4;
            c4275112.L$2 = str5;
            c4275112.L$3 = list2;
            c4275112.I$0 = i;
            c4275112.label = i9;
            if (DelayKt.delay(jDelayTime, c4275112) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427511.I$0;
                list3 = (List) c427511.L$3;
                str7 = (String) c427511.L$2;
                str6 = (String) c427511.L$1;
                paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427511.L$0;
                ResultKt.throwOnFailure(schemeSelection);
                String str10 = str7;
                C427511 c4275113 = c427511;
                PaymentsExperienceApiImpl paymentsExperienceApiImpl4 = paymentsExperienceApiImpl3;
                Response response = (Response) schemeSelection;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
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
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            str8 = str10;
                            str9 = str12;
                            httpError = httpError2;
                        }
                        Json jsonDefault = JsonConverter2.getJsonDefault();
                        jsonDefault.getSerializersModule();
                        Object objDecodeFromString = jsonDefault.decodeFromString(PaymentsExperienceApiError.INSTANCE.serializer(), str12);
                        httpError = httpError2;
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response.code(), null, objDecodeFromString, i10, str12, str11, url, 2, null);
                        str8 = str10;
                        i5 = i10;
                        str9 = str12;
                        String str13 = str11;
                        String str14 = url;
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    str5 = str8;
                    list2 = list3;
                    c4275112 = c4275113;
                    str4 = str6;
                    i = i5;
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4275112.L$0 = paymentsExperienceApiImpl2;
                    c4275112.L$1 = str4;
                    c4275112.L$2 = str5;
                    c4275112.L$3 = list2;
                    c4275112.I$0 = i;
                    c4275112.label = i9;
                    if (DelayKt.delay(jDelayTime, c4275112) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    str7 = str5;
                    c427511 = c4275112;
                    list3 = list2;
                    i2 = i11;
                    paymentsExperienceApiImpl3 = paymentsExperienceApiImpl2;
                    str6 = str4;
                    i3 = i2 + i9;
                    PaymentsExperienceApiService paymentsExperienceApiService = paymentsExperienceApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str6);
                    SchemeSelectionRequest schemeSelectionRequest = new SchemeSelectionRequest(str7, list3);
                    c427511.L$0 = paymentsExperienceApiImpl3;
                    c427511.L$1 = str6;
                    c427511.L$2 = str7;
                    c427511.L$3 = list3;
                    c427511.I$0 = i3;
                    c427511.label = i8;
                    schemeSelection = paymentsExperienceApiService.getSchemeSelection(bearerToken, schemeSelectionRequest, c427511);
                }
                if (!(fail instanceof Ok)) {
                    fail = new Ok(((SchemeSelectionResponse) ((Ok) fail).getValue()).intoDomain2());
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
            i2 = c427511.I$0;
            list3 = (List) c427511.L$3;
            str7 = (String) c427511.L$2;
            str6 = (String) c427511.L$1;
            paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427511.L$0;
            ResultKt.throwOnFailure(schemeSelection);
            i3 = i2 + i9;
            PaymentsExperienceApiService paymentsExperienceApiService2 = paymentsExperienceApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str6);
            SchemeSelectionRequest schemeSelectionRequest2 = new SchemeSelectionRequest(str7, list3);
            c427511.L$0 = paymentsExperienceApiImpl3;
            c427511.L$1 = str6;
            c427511.L$2 = str7;
            c427511.L$3 = list3;
            c427511.I$0 = i3;
            c427511.label = i8;
            schemeSelection = paymentsExperienceApiService2.getSchemeSelection(bearerToken2, schemeSelectionRequest2, c427511);
        }
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
    @Override // com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getMerchantConfig(String str, String str2, Continuation<? super Outcome<MerchantConfig, ? extends CoreError>> continuation) {
        C427481 c427481;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl;
        String str3;
        Object validationError;
        Object fail;
        int i;
        C427481 c4274812;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl2;
        String str4;
        String str5;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl3;
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
        if (continuation instanceof C427481) {
            c427481 = (C427481) continuation;
            int i6 = c427481.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427481.label = i6 - Integer.MIN_VALUE;
                paymentsExperienceApiImpl = this;
            } else {
                paymentsExperienceApiImpl = this;
                c427481 = paymentsExperienceApiImpl.new C427481(continuation);
            }
        }
        Object merchantConfig = c427481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427481.label;
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
            ResultKt.throwOnFailure(merchantConfig);
            i = 0;
            c4274812 = c427481;
            paymentsExperienceApiImpl2 = paymentsExperienceApiImpl;
            str4 = str;
            str5 = str2;
            jDelayTime = Request2.delayTime(i);
            c4274812.L$0 = paymentsExperienceApiImpl2;
            c4274812.L$1 = str4;
            c4274812.L$2 = str5;
            c4274812.I$0 = i;
            c4274812.label = i9;
            if (DelayKt.delay(jDelayTime, c4274812) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427481.I$0;
                str7 = (String) c427481.L$2;
                str6 = (String) c427481.L$1;
                paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427481.L$0;
                ResultKt.throwOnFailure(merchantConfig);
                String str11 = str7;
                C427481 c4274813 = c427481;
                str5 = str11;
                PaymentsExperienceApiImpl paymentsExperienceApiImpl4 = paymentsExperienceApiImpl3;
                Response response = (Response) merchantConfig;
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
                    c4274812 = c4274813;
                    str4 = str6;
                    i = i5;
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4274812.L$0 = paymentsExperienceApiImpl2;
                    c4274812.L$1 = str4;
                    c4274812.L$2 = str5;
                    c4274812.I$0 = i;
                    c4274812.label = i9;
                    if (DelayKt.delay(jDelayTime, c4274812) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    str7 = str5;
                    c427481 = c4274812;
                    i2 = i11;
                    paymentsExperienceApiImpl3 = paymentsExperienceApiImpl2;
                    str6 = str4;
                    i3 = i2 + i9;
                    PaymentsExperienceApiService paymentsExperienceApiService = paymentsExperienceApiImpl3.apiService;
                    String bearerToken = ExtensionsKt.toBearerToken(str6);
                    c427481.L$0 = paymentsExperienceApiImpl3;
                    c427481.L$1 = str6;
                    c427481.L$2 = str7;
                    c427481.I$0 = i3;
                    c427481.label = i8;
                    merchantConfig = paymentsExperienceApiService.getMerchantConfig(bearerToken, str7, c427481);
                }
                if (fail instanceof Ok) {
                    fail = new Ok(((MerchantConfigResponse) ((Ok) fail).getValue()).intoDomain2());
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
            i2 = c427481.I$0;
            str7 = (String) c427481.L$2;
            str6 = (String) c427481.L$1;
            paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427481.L$0;
            ResultKt.throwOnFailure(merchantConfig);
            i3 = i2 + i9;
            PaymentsExperienceApiService paymentsExperienceApiService2 = paymentsExperienceApiImpl3.apiService;
            String bearerToken2 = ExtensionsKt.toBearerToken(str6);
            c427481.L$0 = paymentsExperienceApiImpl3;
            c427481.L$1 = str6;
            c427481.L$2 = str7;
            c427481.I$0 = i3;
            c427481.label = i8;
            merchantConfig = paymentsExperienceApiService2.getMerchantConfig(bearerToken2, str7, c427481);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:124)|48|49|126|50|51|122|52|53|118|54) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:124|48|49|126|50|51|122|52|53|118|54) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r0 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c3, code lost:
    
        r37 = r23;
        r13 = r17;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c9, code lost:
    
        r15 = r19;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ce, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cf, code lost:
    
        r37 = r23;
        r14 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d3, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e2, code lost:
    
        if (r13.code() >= 500) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e4, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ea, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r14, r15, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4 A[Catch: all -> 0x0050, TryCatch #1 {all -> 0x0050, blocks: (B:13:0x0044, B:30:0x00b7, B:32:0x00c4, B:71:0x01fb, B:23:0x007f, B:27:0x009d, B:33:0x00d6, B:35:0x00dc, B:37:0x00e5, B:39:0x0101, B:40:0x0144, B:42:0x014e, B:43:0x0160, B:45:0x0178, B:66:0x01dc, B:68:0x01e4, B:69:0x01ea, B:70:0x01f6, B:20:0x006e), top: B:120:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea A[Catch: all -> 0x0050, TryCatch #1 {all -> 0x0050, blocks: (B:13:0x0044, B:30:0x00b7, B:32:0x00c4, B:71:0x01fb, B:23:0x007f, B:27:0x009d, B:33:0x00d6, B:35:0x00dc, B:37:0x00e5, B:39:0x0101, B:40:0x0144, B:42:0x014e, B:43:0x0160, B:45:0x0178, B:66:0x01dc, B:68:0x01e4, B:69:0x01ea, B:70:0x01f6, B:20:0x006e), top: B:120:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRecommendedProvidersIds(String str, String str2, PaymentContext.PaymentType paymentType, Continuation<? super Outcome<? extends List<String>, ? extends CoreError>> continuation) {
        C427501 c427501;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl;
        String str3;
        Object validationError;
        Object fail;
        PaymentContext.PaymentType paymentType2;
        int i;
        C427501 c4275012;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl2;
        String str4;
        String str5;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl3;
        String str6;
        String str7;
        PaymentContext.PaymentType paymentType3;
        int i2;
        int i3;
        long jDelayTime;
        int i4;
        String str8;
        int i5;
        String str9;
        NetworkError.HttpError httpError;
        if (continuation instanceof C427501) {
            c427501 = (C427501) continuation;
            int i6 = c427501.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c427501.label = i6 - Integer.MIN_VALUE;
                paymentsExperienceApiImpl = this;
            } else {
                paymentsExperienceApiImpl = this;
                c427501 = paymentsExperienceApiImpl.new C427501(continuation);
            }
        }
        Object recommendedProvidersIds = c427501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c427501.label;
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
            ResultKt.throwOnFailure(recommendedProvidersIds);
            paymentType2 = paymentType;
            i = 0;
            c4275012 = c427501;
            paymentsExperienceApiImpl2 = paymentsExperienceApiImpl;
            str4 = str;
            str5 = str2;
            jDelayTime = Request2.delayTime(i);
            c4275012.L$0 = paymentsExperienceApiImpl2;
            c4275012.L$1 = str4;
            c4275012.L$2 = str5;
            c4275012.L$3 = paymentType2;
            c4275012.I$0 = i;
            c4275012.label = i9;
            if (DelayKt.delay(jDelayTime, c4275012) != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c427501.I$0;
                paymentType3 = (PaymentContext.PaymentType) c427501.L$3;
                str7 = (String) c427501.L$2;
                str6 = (String) c427501.L$1;
                paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427501.L$0;
                ResultKt.throwOnFailure(recommendedProvidersIds);
                String str10 = str7;
                C427501 c4275013 = c427501;
                PaymentsExperienceApiImpl paymentsExperienceApiImpl4 = paymentsExperienceApiImpl3;
                Response response = (Response) recommendedProvidersIds;
                int iCode = response.code();
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody);
                    fail = new Ok(objBody);
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
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
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
                        fail = new Fail(httpError3);
                    }
                }
                if (Request2.shouldRetry(i5, i4)) {
                    str5 = str8;
                    paymentType2 = paymentType3;
                    c4275012 = c4275013;
                    str4 = str6;
                    i = i5;
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl4;
                    i8 = 2;
                    i9 = 1;
                    jDelayTime = Request2.delayTime(i);
                    c4275012.L$0 = paymentsExperienceApiImpl2;
                    c4275012.L$1 = str4;
                    c4275012.L$2 = str5;
                    c4275012.L$3 = paymentType2;
                    c4275012.I$0 = i;
                    c4275012.label = i9;
                    if (DelayKt.delay(jDelayTime, c4275012) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i11 = i;
                    str7 = str5;
                    c427501 = c4275012;
                    paymentType3 = paymentType2;
                    i2 = i11;
                    paymentsExperienceApiImpl3 = paymentsExperienceApiImpl2;
                    str6 = str4;
                    i3 = i2 + i9;
                    PaymentsExperienceApiService paymentsExperienceApiService = paymentsExperienceApiImpl3.apiService;
                    String strIntoRecommendationApiValue = paymentsExperienceApiImpl3.intoRecommendationApiValue(paymentType3);
                    c427501.L$0 = paymentsExperienceApiImpl3;
                    c427501.L$1 = str6;
                    c427501.L$2 = str7;
                    c427501.L$3 = paymentType3;
                    c427501.I$0 = i3;
                    c427501.label = i8;
                    recommendedProvidersIds = paymentsExperienceApiService.getRecommendedProvidersIds(str7, str6, strIntoRecommendationApiValue, c427501);
                }
                if (!(fail instanceof Ok)) {
                    fail = new Ok((List) ((Ok) fail).getValue());
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
            i2 = c427501.I$0;
            paymentType3 = (PaymentContext.PaymentType) c427501.L$3;
            str7 = (String) c427501.L$2;
            str6 = (String) c427501.L$1;
            paymentsExperienceApiImpl3 = (PaymentsExperienceApiImpl) c427501.L$0;
            ResultKt.throwOnFailure(recommendedProvidersIds);
            i3 = i2 + i9;
            PaymentsExperienceApiService paymentsExperienceApiService2 = paymentsExperienceApiImpl3.apiService;
            String strIntoRecommendationApiValue2 = paymentsExperienceApiImpl3.intoRecommendationApiValue(paymentType3);
            c427501.L$0 = paymentsExperienceApiImpl3;
            c427501.L$1 = str6;
            c427501.L$2 = str7;
            c427501.L$3 = paymentType3;
            c427501.I$0 = i3;
            c427501.label = i8;
            recommendedProvidersIds = paymentsExperienceApiService2.getRecommendedProvidersIds(str7, str6, strIntoRecommendationApiValue2, c427501);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:352)|240|241|339|242|243|327|244|245|323|246) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:364)|88|89|358|90|91|354|92|57) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0327, code lost:
    
        r13 = r39.code();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x032b, code lost:
    
        r39 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x032f, code lost:
    
        if (r13 < 500) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0331, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0337, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0338, code lost:
    
        r2 = r36;
        r13 = r37;
        r12 = r38;
        r14 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0346, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r5, r6, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0352, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x06ec, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x06ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x06ef, code lost:
    
        r38 = r6;
        r39 = r7;
        r21 = r8;
        r3 = r27;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x06f9, code lost:
    
        r6 = r29;
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x06fe, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x06ff, code lost:
    
        r38 = r6;
        r39 = r7;
        r21 = r8;
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x070c, code lost:
    
        r8 = r21.code();
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0714, code lost:
    
        if (r8 >= 500) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0716, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x071c, code lost:
    
        r0 = new com.truelayer.payments.core.domain.utils.Fail(new com.truelayer.payments.core.network.NetworkError.ValidationError(r0, r5, r6, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x030a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x030c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x030d, code lost:
    
        r39 = r6;
        r21 = r12;
        r22 = r13;
        r1 = r25;
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0317, code lost:
    
        r6 = r27;
        r12 = r28;
     */
    /* JADX WARN: Path cross not found for [B:60:0x0200, B:333:0x01de], limit reached: 358 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0346 A[Catch: all -> 0x0337, TryCatch #11 {all -> 0x0337, blocks: (B:115:0x0367, B:104:0x0331, B:108:0x0346, B:114:0x0362), top: B:335:0x0331 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05cf A[Catch: all -> 0x066b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x066b, blocks: (B:198:0x0599, B:194:0x0572, B:206:0x05cf, B:211:0x05de, B:216:0x0642, B:218:0x064c), top: B:321:0x0599 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0716 A[Catch: all -> 0x0663, TryCatch #0 {all -> 0x0663, blocks: (B:261:0x0727, B:222:0x065f, B:230:0x0676, B:232:0x0691, B:238:0x069e, B:257:0x070c, B:259:0x0716, B:260:0x071c), top: B:313:0x065f }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x071c A[Catch: all -> 0x0663, TryCatch #0 {all -> 0x0663, blocks: (B:261:0x0727, B:222:0x065f, B:230:0x0676, B:232:0x0691, B:238:0x069e, B:257:0x070c, B:259:0x0716, B:260:0x071c), top: B:313:0x065f }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x055a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0331 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0200 A[Catch: all -> 0x038a, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x038a, blocks: (B:53:0x01d4, B:60:0x0200, B:65:0x020f), top: B:356:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:264:0x072f -> B:348:0x052d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01bf -> B:360:0x01cf). Please report as a decompilation issue!!! */
    @Override // com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitEncryptedForm(String str, UUID uuid, String str2, Map<String, String> map, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        C427541 c427541;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl;
        String strEncodeToString;
        C427541 c4275412;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        String str7;
        UUID uuid2;
        String str8;
        String str9;
        Throwable th;
        StackTraceElement stackTraceElement;
        C427541 c4275413;
        String str10;
        String string2;
        Object validationError;
        String str11;
        Outcome fail;
        C427541 c4275414;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl2;
        String str12;
        UUID uuid3;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl3;
        String str13;
        int i2;
        int i3;
        Object fingerprint;
        int i4;
        Object obj;
        String str14;
        String str15;
        UUID uuid4;
        UUID uuid5;
        String str16;
        long jDelayTime;
        String str17;
        String str18;
        String str19;
        Throwable th2;
        String str20;
        String str21;
        boolean z;
        Throwable th3;
        StackTraceElement stackTraceElement2;
        Object fail2;
        String str22;
        UUID uuid6;
        C427541 c4275415;
        Response response;
        int iCode;
        String str23;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl4;
        String str24;
        Object obj2;
        int i5;
        String str25;
        int i6;
        String str26;
        List<String> list;
        String str27;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl5;
        List<String> list2;
        String str28;
        int i7;
        String string3;
        Object objSubmitEncryptedForm;
        long jDelayTime2;
        String fingerprint2;
        String str29;
        String str30;
        Response response2;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl6;
        int iCode2;
        String str31;
        String str32;
        Response response3;
        if (continuation instanceof C427541) {
            c427541 = (C427541) continuation;
            int i8 = c427541.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c427541.label = i8 - Integer.MIN_VALUE;
                paymentsExperienceApiImpl = this;
            } else {
                paymentsExperienceApiImpl = this;
                c427541 = paymentsExperienceApiImpl.new C427541(continuation);
            }
        }
        Object obj3 = c427541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = c427541.label;
        String str33 = " failed with status ";
        String str34 = "HttpFailure response \n ";
        String str35 = "TL-HttpError-Logger";
        String str36 = null;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj3);
            Json jsonDefault = JsonConverter2.getJsonDefault();
            SubmitFormRequest submitFormRequest = new SubmitFormRequest(map);
            jsonDefault.getSerializersModule();
            strEncodeToString = jsonDefault.encodeToString(SubmitFormRequest.INSTANCE.serializer(), submitFormRequest);
            c4275412 = c427541;
            str3 = "/payments/" + str2 + "/authorization-flow/actions/form";
            str4 = " caused by ";
            str5 = ".";
            i = 0;
            str6 = str;
            uuid5 = uuid;
            jDelayTime = Request2.delayTime(i);
            c4275412.L$0 = paymentsExperienceApiImpl;
            c4275412.L$1 = str6;
            c4275412.L$2 = uuid5;
            c4275412.L$3 = strEncodeToString;
            c4275412.L$4 = str3;
            c4275412.I$0 = i;
            str16 = str6;
            i2 = 1;
            c4275412.label = 1;
            if (DelayKt.delay(jDelayTime, c4275412) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i9 == 1) {
            int i10 = c427541.I$0;
            str9 = (String) c427541.L$4;
            str8 = (String) c427541.L$3;
            uuid2 = (UUID) c427541.L$2;
            str7 = (String) c427541.L$1;
            PaymentsExperienceApiImpl paymentsExperienceApiImpl7 = (PaymentsExperienceApiImpl) c427541.L$0;
            try {
                ResultKt.throwOnFailure(obj3);
                str4 = " caused by ";
                str13 = str7;
                i = i10;
                paymentsExperienceApiImpl3 = paymentsExperienceApiImpl7;
                str5 = ".";
                strEncodeToString = str8;
                c4275412 = c427541;
                i2 = 1;
                i3 = i + i2;
                PaymentsExperienceApiService paymentsExperienceApiService = paymentsExperienceApiImpl3.apiService;
                c4275412.L$0 = paymentsExperienceApiImpl3;
                c4275412.L$1 = str13;
                c4275412.L$2 = uuid2;
                c4275412.L$3 = strEncodeToString;
                c4275412.L$4 = str9;
                c4275412.I$0 = i3;
                c4275412.label = 2;
                fingerprint = paymentsExperienceApiService.getFingerprint(c4275412);
                if (fingerprint != coroutine_suspended) {
                }
            } catch (Throwable th4) {
                th = th4;
                str4 = " caused by ";
                str5 = ".";
                paymentsExperienceApiImpl = paymentsExperienceApiImpl7;
            }
            return coroutine_suspended;
        }
        if (i9 != 2) {
            try {
            } catch (Throwable th5) {
                th2 = th5;
                str19 = " caused by ";
                str17 = ".";
                str18 = "getStackTrace(...)";
                str20 = str35;
                str21 = str34;
                z = true;
                th3 = th2;
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, str18);
                stackTraceElement2 = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
                if (stackTraceElement2 != null) {
                }
                String str37 = str36;
                if (th3 instanceof CertificateExpiredException ? z : th3 instanceof CertificateException ? z : th3 instanceof SSLHandshakeException ? z : th3 instanceof SSLPeerUnverifiedException) {
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                }
                fail2 = new Fail(connectionError);
                if (!(fail2 instanceof Ok)) {
                }
                if (!(fail2 instanceof Ok)) {
                }
            }
            if (i9 == 3) {
                int i11 = c427541.I$0;
                List<String> list3 = (List) c427541.L$5;
                String str38 = (String) c427541.L$4;
                String str39 = (String) c427541.L$3;
                UUID uuid7 = (UUID) c427541.L$2;
                String str40 = (String) c427541.L$1;
                PaymentsExperienceApiImpl paymentsExperienceApiImpl8 = (PaymentsExperienceApiImpl) c427541.L$0;
                ResultKt.throwOnFailure(obj3);
                c4275415 = c427541;
                str19 = " caused by ";
                str17 = ".";
                str18 = "getStackTrace(...)";
                str26 = str39;
                uuid6 = uuid7;
                str7 = str40;
                list2 = list3;
                str28 = str38;
                paymentsExperienceApiImpl5 = paymentsExperienceApiImpl8;
                i6 = i11;
                z = true;
                i7 = i6 + 1;
                PaymentsExperienceApiService paymentsExperienceApiService2 = paymentsExperienceApiImpl5.apiService;
                String bearerToken = ExtensionsKt.toBearerToken(str7);
                if (uuid6 == null) {
                }
                str22 = str34;
                SubmitEncryptedFormRequest submitEncryptedFormRequest = new SubmitEncryptedFormRequest(str28, str26, list2);
                c4275415.L$0 = paymentsExperienceApiImpl5;
                c4275415.L$1 = str7;
                c4275415.L$2 = uuid6;
                c4275415.L$3 = str26;
                c4275415.L$4 = str28;
                c4275415.L$5 = list2;
                c4275415.I$0 = i7;
                String str41 = str28;
                c4275415.label = 4;
                objSubmitEncryptedForm = paymentsExperienceApiService2.submitEncryptedForm(bearerToken, string3, submitEncryptedFormRequest, c4275415);
                if (objSubmitEncryptedForm != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i9 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = c427541.I$0;
            List<String> list4 = (List) c427541.L$5;
            String str42 = (String) c427541.L$4;
            String str43 = (String) c427541.L$3;
            UUID uuid8 = (UUID) c427541.L$2;
            String str44 = (String) c427541.L$1;
            PaymentsExperienceApiImpl paymentsExperienceApiImpl9 = (PaymentsExperienceApiImpl) c427541.L$0;
            ResultKt.throwOnFailure(obj3);
            c4275415 = c427541;
            str17 = ".";
            str18 = "getStackTrace(...)";
            String str45 = "TL-HttpError-Logger";
            String str46 = str42;
            str22 = "HttpFailure response \n ";
            z = true;
            uuid6 = uuid8;
            String str47 = str44;
            PaymentsExperienceApiImpl paymentsExperienceApiImpl10 = paymentsExperienceApiImpl9;
            Object obj4 = obj3;
            str19 = " caused by ";
            int i13 = i12;
            try {
                response = (Response) obj4;
                iCode = response.code();
            } catch (Throwable th6) {
                th2 = th6;
                str20 = str45;
                str21 = str22;
            }
            if (response.isSuccessful()) {
                ResponseBody responseBodyErrorBody = response.errorBody();
                String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                String str48 = response.headers().get("tl-trace-id");
                String url = response.raw().getRequest().getUrl().getUrl();
                if (i13 > 0) {
                    TrueLayerAnalytics analytics$payments_core_release = TrueLayerCore.INSTANCE.getAnalytics$payments_core_release();
                    str23 = str46;
                    String str49 = strString;
                    AnalyticsEvents.BackgroundError backgroundError = new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i13 + str33 + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, str49, str48, url, 17, null);
                    strString = str49;
                    str48 = str48;
                    url = url;
                    analytics$payments_core_release.track(backgroundError);
                } else {
                    str23 = str46;
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    try {
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str21);
                            sb.append(response);
                            Log.e(str20, sb.toString());
                        } catch (Throwable th7) {
                            th2 = th7;
                            th3 = th2;
                            StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
                            Intrinsics.checkNotNullExpressionValue(stackTrace2, str18);
                            stackTraceElement2 = (StackTraceElement) ArraysKt.firstOrNull(stackTrace2);
                            if (stackTraceElement2 != null) {
                                str36 = stackTraceElement2.getClassName() + str17 + stackTraceElement2.getMethodName();
                            }
                            String str372 = str36;
                            Object connectionError = th3 instanceof CertificateExpiredException ? z : th3 instanceof CertificateException ? z : th3 instanceof SSLHandshakeException ? z : th3 instanceof SSLPeerUnverifiedException ? new NetworkError.CertificateValidationError(th3, th3.toString(), null, str372, 4, null) : ((th3 instanceof SocketTimeoutException) || (th3 instanceof IOException)) ? new NetworkError.ConnectionError(th3, th3.toString(), null, str372, 4, null) : new NetworkError.ValidationError(th3, th3.toString(), null, str372, 4, null);
                            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                                Log.e(str20, str21 + connectionError + str19 + th3);
                            }
                            fail2 = new Fail(connectionError);
                            if (!(fail2 instanceof Ok)) {
                            }
                            if (!(fail2 instanceof Ok)) {
                            }
                        }
                        str20 = str45;
                    } catch (Throwable th8) {
                        th2 = th8;
                        str20 = str45;
                        th3 = th2;
                        StackTraceElement[] stackTrace22 = new Throwable().getStackTrace();
                        Intrinsics.checkNotNullExpressionValue(stackTrace22, str18);
                        stackTraceElement2 = (StackTraceElement) ArraysKt.firstOrNull(stackTrace22);
                        if (stackTraceElement2 != null) {
                        }
                        String str3722 = str36;
                        if (th3 instanceof CertificateExpiredException ? z : th3 instanceof CertificateException ? z : th3 instanceof SSLHandshakeException ? z : th3 instanceof SSLPeerUnverifiedException) {
                        }
                        if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        }
                        fail2 = new Fail(connectionError);
                        if (!(fail2 instanceof Ok)) {
                        }
                        if (!(fail2 instanceof Ok)) {
                        }
                    }
                    str21 = str22;
                } else {
                    str20 = str45;
                    str21 = str22;
                }
                int i14 = i13;
                NetworkError.HttpError httpError = new NetworkError.HttpError(response.code(), null, null, i14, strString, str48, url, 6, null);
                C427541 c4275416 = c4275415;
                String str50 = strString;
                if ((str50 == null || str50.length() == 0) ? z : false) {
                    fail2 = new Fail(httpError);
                    obj2 = coroutine_suspended;
                    paymentsExperienceApiImpl4 = paymentsExperienceApiImpl10;
                    str24 = str47;
                    str25 = str33;
                    i5 = i14;
                    if (Request2.shouldRetry(i5, iCode)) {
                        c4275415 = c4275416;
                        str34 = str21;
                        i6 = i5;
                        str35 = str20;
                        str26 = str43;
                        list = list4;
                        str33 = str25;
                        coroutine_suspended = obj2;
                        str27 = str23;
                        paymentsExperienceApiImpl5 = paymentsExperienceApiImpl4;
                        str7 = str24;
                        try {
                            jDelayTime2 = Request2.delayTime(i6);
                            c4275415.L$0 = paymentsExperienceApiImpl5;
                            c4275415.L$1 = str7;
                            c4275415.L$2 = uuid6;
                            c4275415.L$3 = str26;
                            c4275415.L$4 = str27;
                            c4275415.L$5 = list;
                            c4275415.I$0 = i6;
                            String str51 = str27;
                            c4275415.label = 3;
                            if (DelayKt.delay(jDelayTime2, c4275415) != coroutine_suspended) {
                                try {
                                    list2 = list;
                                    str28 = str51;
                                    z = true;
                                    PaymentsExperienceApiService paymentsExperienceApiService22 = paymentsExperienceApiImpl5.apiService;
                                    String bearerToken2 = ExtensionsKt.toBearerToken(str7);
                                    if (uuid6 == null) {
                                        try {
                                            str45 = str35;
                                            string3 = uuid6.toString();
                                        } catch (Throwable th9) {
                                            th3 = th9;
                                            str20 = str35;
                                            str21 = str34;
                                            StackTraceElement[] stackTrace222 = new Throwable().getStackTrace();
                                            Intrinsics.checkNotNullExpressionValue(stackTrace222, str18);
                                            stackTraceElement2 = (StackTraceElement) ArraysKt.firstOrNull(stackTrace222);
                                            if (stackTraceElement2 != null) {
                                            }
                                            String str37222 = str36;
                                            if (th3 instanceof CertificateExpiredException ? z : th3 instanceof CertificateException ? z : th3 instanceof SSLHandshakeException ? z : th3 instanceof SSLPeerUnverifiedException) {
                                            }
                                            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                                            }
                                            fail2 = new Fail(connectionError);
                                            if (!(fail2 instanceof Ok)) {
                                            }
                                            if (!(fail2 instanceof Ok)) {
                                            }
                                        }
                                    } else {
                                        str45 = str35;
                                        string3 = null;
                                    }
                                    str22 = str34;
                                    SubmitEncryptedFormRequest submitEncryptedFormRequest2 = new SubmitEncryptedFormRequest(str28, str26, list2);
                                    c4275415.L$0 = paymentsExperienceApiImpl5;
                                    c4275415.L$1 = str7;
                                    c4275415.L$2 = uuid6;
                                    c4275415.L$3 = str26;
                                    c4275415.L$4 = str28;
                                    c4275415.L$5 = list2;
                                    c4275415.I$0 = i7;
                                    String str412 = str28;
                                    c4275415.label = 4;
                                    objSubmitEncryptedForm = paymentsExperienceApiService22.submitEncryptedForm(bearerToken2, string3, submitEncryptedFormRequest2, c4275415);
                                    if (objSubmitEncryptedForm != coroutine_suspended) {
                                        str47 = str7;
                                        list4 = list2;
                                        paymentsExperienceApiImpl10 = paymentsExperienceApiImpl5;
                                        str43 = str26;
                                        i13 = i7;
                                        obj4 = objSubmitEncryptedForm;
                                        str46 = str412;
                                        response = (Response) obj4;
                                        iCode = response.code();
                                        if (response.isSuccessful()) {
                                            try {
                                                Object objBody = response.body();
                                                Intrinsics.checkNotNull(objBody);
                                                fail2 = new Ok(objBody);
                                                str23 = str46;
                                                c4275416 = c4275415;
                                                paymentsExperienceApiImpl4 = paymentsExperienceApiImpl10;
                                                str24 = str47;
                                                str20 = str45;
                                                str21 = str22;
                                                obj2 = coroutine_suspended;
                                                i5 = i13;
                                            } catch (Throwable th10) {
                                                th3 = th10;
                                                str20 = str45;
                                                str21 = str22;
                                                StackTraceElement[] stackTrace2222 = new Throwable().getStackTrace();
                                                Intrinsics.checkNotNullExpressionValue(stackTrace2222, str18);
                                                stackTraceElement2 = (StackTraceElement) ArraysKt.firstOrNull(stackTrace2222);
                                                if (stackTraceElement2 != null) {
                                                }
                                                String str372222 = str36;
                                                if (th3 instanceof CertificateExpiredException ? z : th3 instanceof CertificateException ? z : th3 instanceof SSLHandshakeException ? z : th3 instanceof SSLPeerUnverifiedException) {
                                                }
                                                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                                                }
                                                fail2 = new Fail(connectionError);
                                                if (!(fail2 instanceof Ok)) {
                                                }
                                                if (!(fail2 instanceof Ok)) {
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th11) {
                                    th2 = th11;
                                    str20 = str35;
                                    str21 = str34;
                                    th3 = th2;
                                    StackTraceElement[] stackTrace22222 = new Throwable().getStackTrace();
                                    Intrinsics.checkNotNullExpressionValue(stackTrace22222, str18);
                                    stackTraceElement2 = (StackTraceElement) ArraysKt.firstOrNull(stackTrace22222);
                                    if (stackTraceElement2 != null) {
                                    }
                                    String str3722222 = str36;
                                    if (th3 instanceof CertificateExpiredException ? z : th3 instanceof CertificateException ? z : th3 instanceof SSLHandshakeException ? z : th3 instanceof SSLPeerUnverifiedException) {
                                    }
                                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                                    }
                                    fail2 = new Fail(connectionError);
                                    if (!(fail2 instanceof Ok)) {
                                    }
                                    if (!(fail2 instanceof Ok)) {
                                    }
                                }
                                i7 = i6 + 1;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th12) {
                            th2 = th12;
                            str20 = str35;
                            str21 = str34;
                            z = true;
                            th3 = th2;
                            StackTraceElement[] stackTrace222222 = new Throwable().getStackTrace();
                            Intrinsics.checkNotNullExpressionValue(stackTrace222222, str18);
                            stackTraceElement2 = (StackTraceElement) ArraysKt.firstOrNull(stackTrace222222);
                            if (stackTraceElement2 != null) {
                            }
                            String str37222222 = str36;
                            if (th3 instanceof CertificateExpiredException ? z : th3 instanceof CertificateException ? z : th3 instanceof SSLHandshakeException ? z : th3 instanceof SSLPeerUnverifiedException) {
                            }
                            if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                            }
                            fail2 = new Fail(connectionError);
                            if (!(fail2 instanceof Ok)) {
                            }
                            if (!(fail2 instanceof Ok)) {
                            }
                        }
                    }
                    if (!(fail2 instanceof Ok)) {
                        fail2 = new Ok(((com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse) ((Ok) fail2).getValue()).intoDomain2());
                    } else if (!(fail2 instanceof Fail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(fail2 instanceof Ok)) {
                        return fail2;
                    }
                    if (fail2 instanceof Fail) {
                        return new Fail(((NetworkError) ((Fail) fail2).getError()).intoCoreError());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                try {
                } catch (Throwable th13) {
                    th = th13;
                    obj2 = coroutine_suspended;
                }
                Json jsonDefault2 = JsonConverter2.getJsonDefault();
                jsonDefault2.getSerializersModule();
                obj2 = coroutine_suspended;
                paymentsExperienceApiImpl4 = paymentsExperienceApiImpl10;
                str24 = str47;
                Response response4 = response;
                i5 = i14;
                String str52 = str48;
                String str53 = url;
                fail2 = new Fail(new NetworkError.HttpError(response.code(), null, jsonDefault2.decodeFromString(PaymentApiError.INSTANCE.serializer(), str50), i14, str50, str48, url, 2, null));
            }
            str25 = str33;
            if (Request2.shouldRetry(i5, iCode)) {
            }
            if (!(fail2 instanceof Ok)) {
            }
            if (!(fail2 instanceof Ok)) {
            }
        } else {
            int i15 = c427541.I$0;
            str9 = (String) c427541.L$4;
            str8 = (String) c427541.L$3;
            uuid2 = (UUID) c427541.L$2;
            str7 = (String) c427541.L$1;
            PaymentsExperienceApiImpl paymentsExperienceApiImpl11 = (PaymentsExperienceApiImpl) c427541.L$0;
            try {
                ResultKt.throwOnFailure(obj3);
                str15 = str9;
                uuid4 = uuid2;
                obj = obj3;
                paymentsExperienceApiImpl = paymentsExperienceApiImpl11;
                str4 = " caused by ";
                str5 = ".";
                str14 = str8;
                c4275412 = c427541;
                i4 = i15;
                try {
                    try {
                        response2 = (Response) obj;
                        iCode2 = response2.code();
                    } catch (Throwable th14) {
                        th = th14;
                        uuid = uuid4;
                        str29 = str14;
                    }
                    paymentsExperienceApiImpl6 = paymentsExperienceApiImpl;
                } catch (Throwable th15) {
                    th = th15;
                    uuid = uuid4;
                    str29 = str14;
                    c4275414 = c4275412;
                    str30 = str15;
                }
            } catch (Throwable th16) {
                th = th16;
                str4 = " caused by ";
                paymentsExperienceApiImpl = paymentsExperienceApiImpl11;
                str5 = ".";
            }
            if (response2.isSuccessful()) {
                try {
                    ResponseBody responseBodyErrorBody2 = response2.errorBody();
                    String strString2 = responseBodyErrorBody2 != null ? responseBodyErrorBody2.string() : null;
                    String str54 = response2.headers().get("tl-trace-id");
                    String url2 = response2.raw().getRequest().getUrl().getUrl();
                    if (i4 > 0) {
                        try {
                            try {
                                try {
                                    TrueLayerAnalytics analytics$payments_core_release2 = TrueLayerCore.INSTANCE.getAnalytics$payments_core_release();
                                    String str55 = strString2;
                                    AnalyticsEvents.BackgroundError backgroundError2 = new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i4 + " failed with status " + response2.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, str55, str54, url2, 17, null);
                                    strString2 = str55;
                                    str54 = str54;
                                    url2 = url2;
                                    analytics$payments_core_release2.track(backgroundError2);
                                } catch (Throwable th17) {
                                    th = th17;
                                    paymentsExperienceApiImpl = paymentsExperienceApiImpl6;
                                    c427541 = c4275412;
                                    str9 = str15;
                                    uuid2 = uuid;
                                    str8 = str29;
                                    StackTraceElement[] stackTrace3 = new Throwable().getStackTrace();
                                    Intrinsics.checkNotNullExpressionValue(stackTrace3, "getStackTrace(...)");
                                    stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace3);
                                    if (stackTraceElement != null) {
                                    }
                                    if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                                    }
                                    Object obj5 = validationError;
                                    PaymentsExperienceApiImpl paymentsExperienceApiImpl12 = paymentsExperienceApiImpl;
                                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                                    }
                                    fail = new Fail(obj5);
                                    c4275414 = c4275413;
                                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl12;
                                    str12 = str9;
                                    uuid3 = uuid2;
                                    if (!(fail instanceof Ok)) {
                                    }
                                    if (!(fail instanceof Fail)) {
                                    }
                                }
                                str29 = str14;
                            } catch (Throwable th18) {
                                th = th18;
                                str29 = str14;
                                paymentsExperienceApiImpl = paymentsExperienceApiImpl6;
                                c427541 = c4275412;
                                str9 = str15;
                                uuid2 = uuid;
                                str8 = str29;
                                StackTraceElement[] stackTrace32 = new Throwable().getStackTrace();
                                Intrinsics.checkNotNullExpressionValue(stackTrace32, "getStackTrace(...)");
                                stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace32);
                                if (stackTraceElement != null) {
                                }
                                if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                                }
                                Object obj52 = validationError;
                                PaymentsExperienceApiImpl paymentsExperienceApiImpl122 = paymentsExperienceApiImpl;
                                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                                }
                                fail = new Fail(obj52);
                                c4275414 = c4275413;
                                paymentsExperienceApiImpl2 = paymentsExperienceApiImpl122;
                                str12 = str9;
                                uuid3 = uuid2;
                                if (!(fail instanceof Ok)) {
                                }
                                if (!(fail instanceof Fail)) {
                                }
                            }
                            uuid = uuid4;
                        } catch (Throwable th19) {
                            th = th19;
                            uuid = uuid4;
                        }
                    } else {
                        uuid = uuid4;
                        str29 = str14;
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response2);
                    }
                    int i16 = i4;
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(response2.code(), null, null, i16, strString2, str54, url2, 6, null);
                    String str56 = strString2;
                    if (str56 == null || str56.length() == 0) {
                        c4275414 = c4275412;
                        str30 = str15;
                        str31 = str7;
                        i4 = i16;
                        fail = new Fail(httpError2);
                    } else {
                        try {
                        } catch (Throwable th20) {
                            th = th20;
                            str32 = str56;
                            response3 = response2;
                            c4275414 = c4275412;
                            str30 = str15;
                            i4 = i16;
                        }
                        Json jsonDefault3 = JsonConverter2.getJsonDefault();
                        jsonDefault3.getSerializersModule();
                        NetworkError.HttpError httpError3 = new NetworkError.HttpError(response2.code(), null, jsonDefault3.decodeFromString(PaymentsExperienceApiError.INSTANCE.serializer(), str56), i16, str56, str54, url2, 2, null);
                        response3 = response2;
                        str30 = str15;
                        i4 = i16;
                        str32 = str56;
                        String str57 = str54;
                        c4275414 = c4275412;
                        String str58 = url2;
                        fail = new Fail(httpError3);
                        str31 = str7;
                    }
                } catch (Throwable th21) {
                    th = th21;
                    c4275414 = c4275412;
                    str30 = str15;
                    paymentsExperienceApiImpl = paymentsExperienceApiImpl6;
                    uuid2 = uuid;
                    str8 = str29;
                    c427541 = c4275414;
                    str9 = str30;
                    StackTraceElement[] stackTrace322 = new Throwable().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace322, "getStackTrace(...)");
                    stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace322);
                    if (stackTraceElement != null) {
                    }
                    if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                    }
                    Object obj522 = validationError;
                    PaymentsExperienceApiImpl paymentsExperienceApiImpl1222 = paymentsExperienceApiImpl;
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    }
                    fail = new Fail(obj522);
                    c4275414 = c4275413;
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl1222;
                    str12 = str9;
                    uuid3 = uuid2;
                    if (!(fail instanceof Ok)) {
                    }
                    if (!(fail instanceof Fail)) {
                    }
                }
                if (Request2.shouldRetry(i4, iCode2)) {
                    paymentsExperienceApiImpl2 = paymentsExperienceApiImpl6;
                    uuid3 = uuid;
                    str8 = str29;
                    str7 = str31;
                    str11 = str4;
                    str10 = str5;
                    str12 = str30;
                    if (!(fail instanceof Ok)) {
                        if (!(fail instanceof Fail)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fail = new Fail(((NetworkError) ((Fail) fail).getError()).intoCoreError());
                    }
                    if (!(fail instanceof Fail)) {
                        return fail;
                    }
                    FingerprintResponse fingerprintResponse = (FingerprintResponse) Outcome4.okOrNull(fail);
                    if (fingerprintResponse == null || (fingerprint2 = fingerprintResponse.getFingerprint()) == null) {
                        fingerprint2 = "";
                    }
                    RSAEncryptionHelper rSAEncryptionHelper = RSAEncryptionHelper.INSTANCE;
                    String str59 = rSAEncryptionHelper.getKeys().get(fingerprint2);
                    if (str59 == null) {
                        return new Fail(new CoreError.ValidationError(null, null, null, str12, "Unable to locate key for the fingerprint: " + fingerprint2, 7, null));
                    }
                    List<String> listEncryptText = rSAEncryptionHelper.encryptText(str8, str59);
                    if (listEncryptText == null) {
                        return new Fail(new CoreError.ValidationError(null, null, null, str12, "Unable to encrypt the body with the key for the fingerprint: " + fingerprint2, 7, null));
                    }
                    paymentsExperienceApiImpl5 = paymentsExperienceApiImpl2;
                    uuid6 = uuid3;
                    str19 = str11;
                    str17 = str10;
                    str18 = "getStackTrace(...)";
                    c4275415 = c4275414;
                    str26 = str12;
                    list = listEncryptText;
                    str27 = fingerprint2;
                    i6 = 0;
                    jDelayTime2 = Request2.delayTime(i6);
                    c4275415.L$0 = paymentsExperienceApiImpl5;
                    c4275415.L$1 = str7;
                    c4275415.L$2 = uuid6;
                    c4275415.L$3 = str26;
                    c4275415.L$4 = str27;
                    c4275415.L$5 = list;
                    c4275415.I$0 = i6;
                    String str512 = str27;
                    c4275415.label = 3;
                    if (DelayKt.delay(jDelayTime2, c4275415) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                try {
                    try {
                        paymentsExperienceApiImpl = paymentsExperienceApiImpl6;
                        strEncodeToString = str29;
                        i = i4;
                        c4275412 = c4275414;
                        str3 = str30;
                        str6 = str31;
                        jDelayTime = Request2.delayTime(i);
                        c4275412.L$0 = paymentsExperienceApiImpl;
                        c4275412.L$1 = str6;
                        c4275412.L$2 = uuid5;
                        c4275412.L$3 = strEncodeToString;
                        c4275412.L$4 = str3;
                        c4275412.I$0 = i;
                        c4275412.label = 1;
                        if (DelayKt.delay(jDelayTime, c4275412) != coroutine_suspended) {
                            try {
                                String str60 = str3;
                                uuid2 = uuid5;
                                str9 = str60;
                                paymentsExperienceApiImpl3 = paymentsExperienceApiImpl;
                                str13 = str16;
                                PaymentsExperienceApiService paymentsExperienceApiService3 = paymentsExperienceApiImpl3.apiService;
                                c4275412.L$0 = paymentsExperienceApiImpl3;
                                c4275412.L$1 = str13;
                                c4275412.L$2 = uuid2;
                                c4275412.L$3 = strEncodeToString;
                                c4275412.L$4 = str9;
                                c4275412.I$0 = i3;
                                c4275412.label = 2;
                                fingerprint = paymentsExperienceApiService3.getFingerprint(c4275412);
                                if (fingerprint != coroutine_suspended) {
                                    i4 = i3;
                                    obj = fingerprint;
                                    String str61 = strEncodeToString;
                                    str7 = str13;
                                    paymentsExperienceApiImpl = paymentsExperienceApiImpl3;
                                    str14 = str61;
                                    UUID uuid9 = uuid2;
                                    str15 = str9;
                                    uuid4 = uuid9;
                                    response2 = (Response) obj;
                                    paymentsExperienceApiImpl6 = paymentsExperienceApiImpl;
                                    iCode2 = response2.code();
                                    if (response2.isSuccessful()) {
                                        try {
                                            Object objBody2 = response2.body();
                                            Intrinsics.checkNotNull(objBody2);
                                            fail = new Ok(objBody2);
                                            uuid = uuid4;
                                            str29 = str14;
                                            c4275414 = c4275412;
                                            str30 = str15;
                                            str31 = str7;
                                            if (Request2.shouldRetry(i4, iCode2)) {
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            String str62 = str15;
                                            uuid2 = uuid4;
                                            str9 = str62;
                                            paymentsExperienceApiImpl = paymentsExperienceApiImpl6;
                                            c427541 = c4275412;
                                            str8 = str14;
                                        }
                                    }
                                }
                            } catch (Throwable th23) {
                                th = th23;
                                c427541 = c4275412;
                                str8 = strEncodeToString;
                                str7 = str13;
                                paymentsExperienceApiImpl = paymentsExperienceApiImpl3;
                            }
                            i3 = i + i2;
                        }
                    } catch (Throwable th24) {
                        th = th24;
                        String str63 = str3;
                        uuid2 = uuid5;
                        str9 = str63;
                        c427541 = c4275412;
                        str8 = strEncodeToString;
                        str7 = str16;
                        StackTraceElement[] stackTrace3222 = new Throwable().getStackTrace();
                        Intrinsics.checkNotNullExpressionValue(stackTrace3222, "getStackTrace(...)");
                        stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace3222);
                        if (stackTraceElement != null) {
                        }
                        if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
                        }
                        Object obj5222 = validationError;
                        PaymentsExperienceApiImpl paymentsExperienceApiImpl12222 = paymentsExperienceApiImpl;
                        if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        }
                        fail = new Fail(obj5222);
                        c4275414 = c4275413;
                        paymentsExperienceApiImpl2 = paymentsExperienceApiImpl12222;
                        str12 = str9;
                        uuid3 = uuid2;
                        if (!(fail instanceof Ok)) {
                        }
                        if (!(fail instanceof Fail)) {
                        }
                    }
                    str16 = str6;
                    i2 = 1;
                } catch (Throwable th25) {
                    th = th25;
                    str16 = str6;
                }
                uuid5 = uuid;
                return coroutine_suspended;
            }
        }
        StackTraceElement[] stackTrace32222 = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace32222, "getStackTrace(...)");
        stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace32222);
        if (stackTraceElement != null) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            c4275413 = c427541;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(className);
            str10 = str5;
            sb2.append(str10);
            sb2.append(methodName);
            string2 = sb2.toString();
        } else {
            c4275413 = c427541;
            str10 = str5;
            string2 = null;
        }
        if (th instanceof CertificateExpiredException ? true : th instanceof CertificateException ? true : th instanceof SSLHandshakeException ? true : th instanceof SSLPeerUnverifiedException) {
            validationError = new NetworkError.CertificateValidationError(th, th.toString(), null, string2, 4, null);
        } else if (th instanceof SocketTimeoutException) {
            validationError = new NetworkError.ConnectionError(th, th.toString(), null, string2, 4, null);
        } else if (th instanceof IOException) {
            validationError = new NetworkError.ConnectionError(th, th.toString(), null, string2, 4, null);
        } else {
            Throwable th26 = th;
            validationError = new NetworkError.ValidationError(th26, th26.toString(), null, string2, 4, null);
        }
        Object obj52222 = validationError;
        PaymentsExperienceApiImpl paymentsExperienceApiImpl122222 = paymentsExperienceApiImpl;
        if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("HttpFailure response \n ");
            sb3.append(obj52222);
            str11 = str4;
            sb3.append(str11);
            sb3.append(th);
            Log.e("TL-HttpError-Logger", sb3.toString());
        } else {
            str11 = str4;
        }
        fail = new Fail(obj52222);
        c4275414 = c4275413;
        paymentsExperienceApiImpl2 = paymentsExperienceApiImpl122222;
        str12 = str9;
        uuid3 = uuid2;
        if (!(fail instanceof Ok)) {
        }
        if (!(fail instanceof Fail)) {
        }
    }

    private final String intoRecommendationApiValue(PaymentContext.PaymentType paymentType) {
        int i = WhenMappings.$EnumSwitchMapping$0[paymentType.ordinal()];
        if (i == 1) {
            return Card.Icon.PAYMENT;
        }
        if (i == 2) {
            return "mandate";
        }
        throw new NoWhenBranchMatchedException();
    }
}
