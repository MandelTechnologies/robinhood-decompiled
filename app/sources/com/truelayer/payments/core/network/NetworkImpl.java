package com.truelayer.payments.core.network;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import com.truelayer.payments.core.configuration.Configuration;
import com.truelayer.payments.core.configuration.HttpClientConfig3;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.core.domain.experience.scheme.SchemeSelection;
import com.truelayer.payments.core.domain.payments.AdditionalInput;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow2;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.Branch;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.ProviderConfig;
import com.truelayer.payments.core.domain.payments.UserAccount;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.domain.utils.Outcome4;
import com.truelayer.payments.core.network.common.SingleValueTimedCache;
import com.truelayer.payments.core.network.experience.TranslationProvider;
import com.truelayer.payments.core.network.experience.TranslationProviderImpl;
import com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi;
import com.truelayer.payments.core.network.experience.api.PaymentsExperienceApiImpl;
import com.truelayer.payments.core.network.mandates.api.MandatesApi;
import com.truelayer.payments.core.network.mandates.api.MandatesApiImpl;
import com.truelayer.payments.core.network.payments.api.PaymentApi;
import com.truelayer.payments.core.network.payments.api.PaymentApiImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Deferred;
import okhttp3.OkHttpClient;

/* compiled from: NetworkImpl.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ*\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u001e\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J*\u0010,\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010-\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010.J(\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u0011\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ2\u00101\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00103\u001a\u00020!2\u0006\u00104\u001a\u000205H\u0096@¢\u0006\u0002\u00106J\"\u00107\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ*\u0010;\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J(\u0010=\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dJ0\u0010>\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0011\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J8\u0010@\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020!2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020!0\u0011H\u0096@¢\u0006\u0002\u0010DJ8\u0010E\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020G0F\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u00010!H\u0096@¢\u0006\u0002\u0010\"J*\u0010H\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J<\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0018\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u00180LH\u0082@¢\u0006\u0002\u0010MJ\"\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ6\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0FH\u0096@¢\u0006\u0002\u0010SJ*\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J*\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J*\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J\"\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006Y"}, m3636d2 = {"Lcom/truelayer/payments/core/network/NetworkImpl;", "Lcom/truelayer/payments/core/network/Network;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/truelayer/payments/core/configuration/Configuration;", "(Lcom/truelayer/payments/core/configuration/Configuration;)V", "experienceApi", "Lcom/truelayer/payments/core/network/experience/api/PaymentsExperienceApi;", "mandatesApi", "Lcom/truelayer/payments/core/network/mandates/api/MandatesApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "paymentsApi", "Lcom/truelayer/payments/core/network/payments/api/PaymentApi;", "providersConfigCache", "Lcom/truelayer/payments/core/network/common/SingleValueTimedCache;", "", "Lcom/truelayer/payments/core/domain/payments/ProviderConfig;", "translationProvider", "Lcom/truelayer/payments/core/network/experience/TranslationProvider;", "getTranslationProvider", "()Lcom/truelayer/payments/core/network/experience/TranslationProvider;", "cancelPayment", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "paymentContext", "Lcom/truelayer/payments/core/domain/payments/PaymentContext;", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSavedUserAccount", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "userAccountId", "", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enhanceAuthorizationFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "authorizationFlow", "providersConfig", "enhanceAuthorizationFlowResponse", "response", "enhanceProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "provider", "enhanceProviderInfo", "paymentProvider", "(Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/core/domain/payments/PaymentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdditionalInputs", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput;", "getLocalisedLegals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "countryCode", "isSignupPlus", "", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getPayment", "Lcom/truelayer/payments/core/domain/payments/Payment;", "getPaymentProvider", "providerId", "getProvidersConfig", "getRecommendedProvidersIds", "userId", "getSchemeSelection", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelection;", "currencyCode", "schemeIds", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTranslations", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "getUserPriming", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "preprocessAuthResponse", "authRes", "Lkotlinx/coroutines/Deferred;", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserAccount", "startAuthorizationFlow", "submitConsent", "submitForm", "inputs", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitProviderSelection", "submitSchemeSelection", "schemeId", "submitUserAccountSelection", "useNewUserAccount", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class NetworkImpl implements Network {
    private final PaymentsExperienceApi experienceApi;
    private final MandatesApi mandatesApi;
    private final OkHttpClient okHttpClient;
    private final PaymentApi paymentsApi;
    private final SingleValueTimedCache<List<ProviderConfig>> providersConfigCache;
    private final TranslationProvider translationProvider;

    /* compiled from: NetworkImpl.kt */
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

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl", m3645f = "NetworkImpl.kt", m3646l = {CompanyFinancialsSection.BAR_ANIMATION_DURATION}, m3647m = "enhanceProviderInfo")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$enhanceProviderInfo$1 */
    static final class C427271 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C427271(Continuation<? super C427271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkImpl.this.enhanceProviderInfo(null, null, this);
        }
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl", m3645f = "NetworkImpl.kt", m3646l = {87, 94, 102}, m3647m = "getPayment")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$getPayment$1 */
    static final class C427281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C427281(Continuation<? super C427281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkImpl.this.getPayment(null, this);
        }
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl", m3645f = "NetworkImpl.kt", m3646l = {378, 386}, m3647m = "getPaymentProvider")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$getPaymentProvider$1 */
    static final class C427291 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C427291(Continuation<? super C427291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkImpl.this.getPaymentProvider(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkImpl(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.providersConfigCache = new SingleValueTimedCache<>(5L, TimeUnit.MINUTES);
        this.okHttpClient = HttpClientConfig3.intoClient(configuration.getHttpClientConfig()).build();
        this.paymentsApi = new PaymentApiImpl(configuration.getHttpClientConfig().getUri(), getOkHttpClient());
        PaymentsExperienceApiImpl paymentsExperienceApiImpl = new PaymentsExperienceApiImpl(configuration.getHttpClientConfig().getPaymentsExperienceUri(), getOkHttpClient());
        this.experienceApi = paymentsExperienceApiImpl;
        this.mandatesApi = new MandatesApiImpl(configuration.getHttpClientConfig().getUri(), getOkHttpClient());
        this.translationProvider = new TranslationProviderImpl(paymentsExperienceApiImpl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.truelayer.payments.core.network.Network
    public TranslationProvider getTranslationProvider() {
        return this.translationProvider;
    }

    @Override // com.truelayer.payments.core.network.Network
    public OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.truelayer.payments.core.network.Network
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPayment(PaymentContext paymentContext, Continuation<? super Outcome<? extends Payment, ? extends CoreError>> continuation) {
        C427281 c427281;
        NetworkImpl networkImpl;
        Outcome outcome;
        Payment payment;
        NetworkImpl networkImpl2;
        Outcome outcome2;
        if (continuation instanceof C427281) {
            c427281 = (C427281) continuation;
            int i = c427281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c427281.label = i - Integer.MIN_VALUE;
            } else {
                c427281 = new C427281(continuation);
            }
        }
        Object payment2 = c427281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c427281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(payment2);
            int i3 = WhenMappings.$EnumSwitchMapping$0[paymentContext.getPaymentType().ordinal()];
            if (i3 == 1) {
                PaymentApi paymentApi = this.paymentsApi;
                String resourceToken = paymentContext.getResourceToken();
                String paymentId = paymentContext.getPaymentId();
                c427281.L$0 = this;
                c427281.L$1 = paymentContext;
                c427281.label = 1;
                payment2 = paymentApi.getPayment(resourceToken, paymentId, c427281);
                if (payment2 != coroutine_suspended) {
                    networkImpl = this;
                    outcome = (Outcome) payment2;
                }
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                MandatesApi mandatesApi = this.mandatesApi;
                String resourceToken2 = paymentContext.getResourceToken();
                String paymentId2 = paymentContext.getPaymentId();
                c427281.L$0 = this;
                c427281.L$1 = paymentContext;
                c427281.label = 2;
                payment2 = mandatesApi.getMandate(resourceToken2, paymentId2, c427281);
                if (payment2 != coroutine_suspended) {
                    networkImpl = this;
                    outcome = (Outcome) payment2;
                }
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            paymentContext = (PaymentContext) c427281.L$1;
            networkImpl = (NetworkImpl) c427281.L$0;
            ResultKt.throwOnFailure(payment2);
            outcome = (Outcome) payment2;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                payment = (Payment) c427281.L$1;
                networkImpl2 = (NetworkImpl) c427281.L$0;
                ResultKt.throwOnFailure(payment2);
                outcome2 = (Outcome) payment2;
                if (!(outcome2 instanceof Ok)) {
                    Payment.Authorizing authorizing = (Payment.Authorizing) payment;
                    return new Ok(Payment.Authorizing.copy$default(authorizing, null, null, null, null, null, false, null, networkImpl2.enhanceAuthorizationFlow(authorizing.getAuthorizationFlow(), (List) ((Ok) outcome2).getValue()), EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null));
                }
                if (outcome2 instanceof Fail) {
                    return outcome2;
                }
                throw new NoWhenBranchMatchedException();
            }
            paymentContext = (PaymentContext) c427281.L$1;
            networkImpl = (NetworkImpl) c427281.L$0;
            ResultKt.throwOnFailure(payment2);
            outcome = (Outcome) payment2;
        }
        if (outcome instanceof Ok) {
            Payment payment3 = (Payment) ((Ok) outcome).getValue();
            if (payment3 instanceof Payment.Authorizing) {
                c427281.L$0 = networkImpl;
                c427281.L$1 = payment3;
                c427281.label = 3;
                Object providersConfig = networkImpl.getProvidersConfig(paymentContext, c427281);
                if (providersConfig != coroutine_suspended) {
                    payment2 = providersConfig;
                    payment = payment3;
                    networkImpl2 = networkImpl;
                    outcome2 = (Outcome) payment2;
                    if (!(outcome2 instanceof Ok)) {
                    }
                }
                return coroutine_suspended;
            }
            return new Ok(payment3);
        }
        if (outcome instanceof Fail) {
            return outcome;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object cancelPayment(PaymentContext paymentContext, Continuation<? super Outcome<Unit, ? extends CoreError>> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$0[paymentContext.getPaymentType().ordinal()];
        if (i == 1) {
            return this.paymentsApi.cancelPayment(paymentContext.getResourceToken(), paymentContext.getIdempotencyKey(), paymentContext.getPaymentId(), continuation);
        }
        if (i == 2) {
            return new Ok(Unit.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$startAuthorizationFlow$2", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$startAuthorizationFlow$2 */
    static final class C427322 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ PaymentContext $paymentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427322(PaymentContext paymentContext, Continuation<? super C427322> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427322 c427322 = NetworkImpl.this.new C427322(this.$paymentContext, continuation);
            c427322.L$0 = obj;
            return c427322;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C427322) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new NetworkImpl$startAuthorizationFlow$2$authRes$1(this.$paymentContext, NetworkImpl.this, null), 3, null);
            NetworkImpl networkImpl = NetworkImpl.this;
            PaymentContext paymentContext = this.$paymentContext;
            this.label = 1;
            Object objPreprocessAuthResponse = networkImpl.preprocessAuthResponse(paymentContext, deferredAsync$default, this);
            return objPreprocessAuthResponse == coroutine_suspended ? coroutine_suspended : objPreprocessAuthResponse;
        }
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object startAuthorizationFlow(PaymentContext paymentContext, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return CoroutineScope2.coroutineScope(new C427322(paymentContext, null), continuation);
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$preprocessAuthResponse$2", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$preprocessAuthResponse$2 */
    static final class C427312 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ Deferred<Outcome<AuthorizationFlowResponse, CoreError>> $authRes;
        final /* synthetic */ PaymentContext $paymentContext;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NetworkImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C427312(Deferred<? extends Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> deferred, NetworkImpl networkImpl, PaymentContext paymentContext, Continuation<? super C427312> continuation) {
            super(2, continuation);
            this.$authRes = deferred;
            this.this$0 = networkImpl;
            this.$paymentContext = paymentContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427312 c427312 = new C427312(this.$authRes, this.this$0, this.$paymentContext, continuation);
            c427312.L$0 = obj;
            return c427312;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C427312) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Deferred deferred;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new NetworkImpl$preprocessAuthResponse$2$providersConfigResponse$1(this.this$0, this.$paymentContext, null), 3, null);
                Deferred[] deferredArr = {this.$authRes, deferredAsync$default};
                this.L$0 = deferredAsync$default;
                this.label = 1;
                if (Await2.awaitAll(deferredArr, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deferred = deferredAsync$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                deferred = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Outcome<AuthorizationFlowResponse, CoreError> completed = this.$authRes.getCompleted();
            NetworkImpl networkImpl = this.this$0;
            if (!(completed instanceof Ok)) {
                if (completed instanceof Fail) {
                    return completed;
                }
                throw new NoWhenBranchMatchedException();
            }
            AuthorizationFlowResponse authorizationFlowResponse = (AuthorizationFlowResponse) ((Ok) completed).getValue();
            Outcome outcome = (Outcome) deferred.getCompleted();
            if (outcome instanceof Ok) {
                return new Ok(networkImpl.enhanceAuthorizationFlowResponse(authorizationFlowResponse, (List) ((Ok) outcome).getValue()));
            }
            if (outcome instanceof Fail) {
                return outcome;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object preprocessAuthResponse(PaymentContext paymentContext, Deferred<? extends Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> deferred, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return CoroutineScope2.coroutineScope(new C427312(deferred, this, paymentContext, null), continuation);
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$submitProviderSelection$2", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$submitProviderSelection$2 */
    static final class C427352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ PaymentContext $paymentContext;
        final /* synthetic */ String $providerId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427352(PaymentContext paymentContext, String str, Continuation<? super C427352> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
            this.$providerId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427352 c427352 = NetworkImpl.this.new C427352(this.$paymentContext, this.$providerId, continuation);
            c427352.L$0 = obj;
            return c427352;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C427352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new NetworkImpl$submitProviderSelection$2$authRes$1(this.$paymentContext, NetworkImpl.this, this.$providerId, null), 3, null);
            NetworkImpl networkImpl = NetworkImpl.this;
            PaymentContext paymentContext = this.$paymentContext;
            this.label = 1;
            Object objPreprocessAuthResponse = networkImpl.preprocessAuthResponse(paymentContext, deferredAsync$default, this);
            return objPreprocessAuthResponse == coroutine_suspended ? coroutine_suspended : objPreprocessAuthResponse;
        }
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object submitProviderSelection(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return CoroutineScope2.coroutineScope(new C427352(paymentContext, str, null), continuation);
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$submitForm$2", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$submitForm$2 */
    static final class C427342 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ Map<String, String> $inputs;
        final /* synthetic */ PaymentContext $paymentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427342(PaymentContext paymentContext, Map<String, String> map, Continuation<? super C427342> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
            this.$inputs = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427342 c427342 = NetworkImpl.this.new C427342(this.$paymentContext, this.$inputs, continuation);
            c427342.L$0 = obj;
            return c427342;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C427342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new NetworkImpl$submitForm$2$authRes$1(NetworkImpl.this, this.$paymentContext, this.$inputs, null), 3, null);
            NetworkImpl networkImpl = NetworkImpl.this;
            PaymentContext paymentContext = this.$paymentContext;
            this.label = 1;
            Object objPreprocessAuthResponse = networkImpl.preprocessAuthResponse(paymentContext, deferredAsync$default, this);
            return objPreprocessAuthResponse == coroutine_suspended ? coroutine_suspended : objPreprocessAuthResponse;
        }
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object submitForm(PaymentContext paymentContext, Map<String, String> map, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return CoroutineScope2.coroutineScope(new C427342(paymentContext, map, null), continuation);
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$submitConsent$2", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$submitConsent$2 */
    static final class C427332 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ PaymentContext $paymentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427332(PaymentContext paymentContext, Continuation<? super C427332> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427332 c427332 = NetworkImpl.this.new C427332(this.$paymentContext, continuation);
            c427332.L$0 = obj;
            return c427332;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C427332) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new NetworkImpl$submitConsent$2$authRes$1(this.$paymentContext, NetworkImpl.this, null), 3, null);
            NetworkImpl networkImpl = NetworkImpl.this;
            PaymentContext paymentContext = this.$paymentContext;
            this.label = 1;
            Object objPreprocessAuthResponse = networkImpl.preprocessAuthResponse(paymentContext, deferredAsync$default, this);
            return objPreprocessAuthResponse == coroutine_suspended ? coroutine_suspended : objPreprocessAuthResponse;
        }
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object submitConsent(PaymentContext paymentContext, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return CoroutineScope2.coroutineScope(new C427332(paymentContext, null), continuation);
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$submitSchemeSelection$2", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.f2776x87e624cb}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$submitSchemeSelection$2 */
    static final class C427362 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ PaymentContext $paymentContext;
        final /* synthetic */ String $schemeId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427362(PaymentContext paymentContext, String str, Continuation<? super C427362> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
            this.$schemeId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427362 c427362 = NetworkImpl.this.new C427362(this.$paymentContext, this.$schemeId, continuation);
            c427362.L$0 = obj;
            return c427362;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C427362) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new NetworkImpl$submitSchemeSelection$2$authRes$1(NetworkImpl.this, this.$paymentContext, this.$schemeId, null), 3, null);
            NetworkImpl networkImpl = NetworkImpl.this;
            PaymentContext paymentContext = this.$paymentContext;
            this.label = 1;
            Object objPreprocessAuthResponse = networkImpl.preprocessAuthResponse(paymentContext, deferredAsync$default, this);
            return objPreprocessAuthResponse == coroutine_suspended ? coroutine_suspended : objPreprocessAuthResponse;
        }
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object submitSchemeSelection(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return CoroutineScope2.coroutineScope(new C427362(paymentContext, str, null), continuation);
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$submitUserAccountSelection$2", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$submitUserAccountSelection$2 */
    static final class C427372 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ PaymentContext $paymentContext;
        final /* synthetic */ String $userAccountId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427372(PaymentContext paymentContext, String str, Continuation<? super C427372> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
            this.$userAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427372 c427372 = NetworkImpl.this.new C427372(this.$paymentContext, this.$userAccountId, continuation);
            c427372.L$0 = obj;
            return c427372;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C427372) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new NetworkImpl$submitUserAccountSelection$2$authRes$1(NetworkImpl.this, this.$paymentContext, this.$userAccountId, null), 3, null);
            NetworkImpl networkImpl = NetworkImpl.this;
            PaymentContext paymentContext = this.$paymentContext;
            this.label = 1;
            Object objPreprocessAuthResponse = networkImpl.preprocessAuthResponse(paymentContext, deferredAsync$default, this);
            return objPreprocessAuthResponse == coroutine_suspended ? coroutine_suspended : objPreprocessAuthResponse;
        }
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object submitUserAccountSelection(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return CoroutineScope2.coroutineScope(new C427372(paymentContext, str, null), continuation);
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$deleteSavedUserAccount$2", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.f2775xbcb7e6f3}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$deleteSavedUserAccount$2 */
    static final class C427262 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ PaymentContext $paymentContext;
        final /* synthetic */ String $userAccountId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427262(PaymentContext paymentContext, String str, Continuation<? super C427262> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
            this.$userAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427262 c427262 = NetworkImpl.this.new C427262(this.$paymentContext, this.$userAccountId, continuation);
            c427262.L$0 = obj;
            return c427262;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C427262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new NetworkImpl$deleteSavedUserAccount$2$authRes$1(NetworkImpl.this, this.$paymentContext, this.$userAccountId, null), 3, null);
            NetworkImpl networkImpl = NetworkImpl.this;
            PaymentContext paymentContext = this.$paymentContext;
            this.label = 1;
            Object objPreprocessAuthResponse = networkImpl.preprocessAuthResponse(paymentContext, deferredAsync$default, this);
            return objPreprocessAuthResponse == coroutine_suspended ? coroutine_suspended : objPreprocessAuthResponse;
        }
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object deleteSavedUserAccount(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return CoroutineScope2.coroutineScope(new C427262(paymentContext, str, null), continuation);
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$useNewUserAccount$2", m3645f = "NetworkImpl.kt", m3646l = {337}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$useNewUserAccount$2 */
    static final class C427382 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ PaymentContext $paymentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427382(PaymentContext paymentContext, Continuation<? super C427382> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C427382 c427382 = NetworkImpl.this.new C427382(this.$paymentContext, continuation);
            c427382.L$0 = obj;
            return c427382;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C427382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new NetworkImpl$useNewUserAccount$2$authRes$1(NetworkImpl.this, this.$paymentContext, null), 3, null);
            NetworkImpl networkImpl = NetworkImpl.this;
            PaymentContext paymentContext = this.$paymentContext;
            this.label = 1;
            Object objPreprocessAuthResponse = networkImpl.preprocessAuthResponse(paymentContext, deferredAsync$default, this);
            return objPreprocessAuthResponse == coroutine_suspended ? coroutine_suspended : objPreprocessAuthResponse;
        }
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object useNewUserAccount(PaymentContext paymentContext, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return CoroutineScope2.coroutineScope(new C427382(paymentContext, null), continuation);
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object saveUserAccount(PaymentContext paymentContext, Continuation<? super Outcome<Unit, ? extends CoreError>> continuation) {
        return this.paymentsApi.saveUserAccount(paymentContext.getResourceToken(), paymentContext.getIdempotencyKey(), paymentContext.getPaymentId(), continuation);
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object getMerchantConfig(PaymentContext paymentContext, Continuation<? super Outcome<MerchantConfig, ? extends CoreError>> continuation) {
        return this.experienceApi.getMerchantConfig(paymentContext.getResourceToken(), paymentContext.getPaymentId(), continuation);
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object getLocalisedLegals(PaymentContext paymentContext, String str, boolean z, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$0[paymentContext.getPaymentType().ordinal()];
        if (i == 1) {
            return this.experienceApi.getLegals(paymentContext.getResourceToken(), str, z, continuation);
        }
        if (i == 2) {
            return this.experienceApi.getMandatesLegals(paymentContext.getResourceToken(), str, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object getTranslations(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends Map<String, LocalisedText>, ? extends CoreError>> continuation) {
        return this.experienceApi.getTranslations(paymentContext.getResourceToken(), str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.truelayer.payments.core.network.Network
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPaymentProvider(PaymentContext paymentContext, String str, Continuation<? super Outcome<PaymentProvider, ? extends CoreError>> continuation) {
        C427291 c427291;
        NetworkImpl networkImpl;
        PaymentProvider paymentProvider;
        if (continuation instanceof C427291) {
            c427291 = (C427291) continuation;
            int i = c427291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c427291.label = i - Integer.MIN_VALUE;
            } else {
                c427291 = new C427291(continuation);
            }
        }
        Object paymentProvider2 = c427291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c427291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(paymentProvider2);
            PaymentApi paymentApi = this.paymentsApi;
            String resourceToken = paymentContext.getResourceToken();
            PaymentContext.PaymentType paymentType = paymentContext.getPaymentType();
            c427291.L$0 = this;
            c427291.L$1 = paymentContext;
            c427291.label = 1;
            paymentProvider2 = paymentApi.getPaymentProvider(resourceToken, str, paymentType, c427291);
            if (paymentProvider2 != coroutine_suspended) {
                networkImpl = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentProvider = (PaymentProvider) c427291.L$0;
            ResultKt.throwOnFailure(paymentProvider2);
            return new Ok((PaymentProvider) Outcome4.orDefault((Outcome) paymentProvider2, paymentProvider));
        }
        paymentContext = (PaymentContext) c427291.L$1;
        networkImpl = (NetworkImpl) c427291.L$0;
        ResultKt.throwOnFailure(paymentProvider2);
        Outcome outcome = (Outcome) paymentProvider2;
        if (!(outcome instanceof Ok)) {
            if (outcome instanceof Fail) {
                return outcome;
            }
            throw new NoWhenBranchMatchedException();
        }
        PaymentProvider paymentProvider3 = (PaymentProvider) ((Ok) outcome).getValue();
        c427291.L$0 = paymentProvider3;
        c427291.L$1 = null;
        c427291.label = 2;
        Object objEnhanceProviderInfo = networkImpl.enhanceProviderInfo(paymentProvider3, paymentContext, c427291);
        if (objEnhanceProviderInfo != coroutine_suspended) {
            paymentProvider2 = objEnhanceProviderInfo;
            paymentProvider = paymentProvider3;
            return new Ok((PaymentProvider) Outcome4.orDefault((Outcome) paymentProvider2, paymentProvider));
        }
        return coroutine_suspended;
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object getAdditionalInputs(PaymentContext paymentContext, Continuation<? super Outcome<? extends List<? extends AdditionalInput>, ? extends CoreError>> continuation) {
        return this.experienceApi.getAdditionalInputs(paymentContext.getResourceToken(), continuation);
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object getUserPriming(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends UserPriming, ? extends CoreError>> continuation) {
        return this.experienceApi.getUserPriming(paymentContext.getResourceToken(), str, paymentContext.getPaymentId(), continuation);
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object getSchemeSelection(PaymentContext paymentContext, String str, List<String> list, Continuation<? super Outcome<? extends SchemeSelection, ? extends CoreError>> continuation) {
        return this.experienceApi.getSchemeSelection(paymentContext.getResourceToken(), str, list, continuation);
    }

    @Override // com.truelayer.payments.core.network.Network
    public Object getRecommendedProvidersIds(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends List<String>, ? extends CoreError>> continuation) {
        return this.experienceApi.getRecommendedProvidersIds(paymentContext.getPaymentId(), str, paymentContext.getPaymentType(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object enhanceProviderInfo(PaymentProvider paymentProvider, PaymentContext paymentContext, Continuation<? super Outcome<PaymentProvider, ? extends CoreError>> continuation) {
        C427271 c427271;
        PaymentProvider paymentProvider2;
        Object next;
        if (continuation instanceof C427271) {
            c427271 = (C427271) continuation;
            int i = c427271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c427271.label = i - Integer.MIN_VALUE;
            } else {
                c427271 = new C427271(continuation);
            }
        }
        Object obj = c427271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c427271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c427271.L$0 = paymentProvider;
            c427271.label = 1;
            Object providersConfig = getProvidersConfig(paymentContext, c427271);
            if (providersConfig == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentProvider2 = paymentProvider;
            obj = providersConfig;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PaymentProvider paymentProvider3 = (PaymentProvider) c427271.L$0;
            ResultKt.throwOnFailure(obj);
            paymentProvider2 = paymentProvider3;
        }
        Outcome outcome = (Outcome) obj;
        if (!(outcome instanceof Ok)) {
            if (outcome instanceof Fail) {
                return outcome;
            }
            throw new NoWhenBranchMatchedException();
        }
        Iterator it = ((List) ((Ok) outcome).getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ProviderConfig) next).getId(), paymentProvider2.getId())) {
                break;
            }
        }
        ProviderConfig providerConfig = (ProviderConfig) next;
        if (providerConfig != null) {
            PaymentProvider paymentProviderCopy$default = PaymentProvider.copy$default(paymentProvider2, null, null, null, null, null, null, null, providerConfig.getOrder(), providerConfig.getHasUserPriming(), null, providerConfig.getBranches(), null, 2687, null);
            if (paymentProviderCopy$default != null) {
                paymentProvider2 = paymentProviderCopy$default;
            }
        }
        return new Ok(paymentProvider2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getProvidersConfig(PaymentContext paymentContext, Continuation<? super Outcome<? extends List<ProviderConfig>, ? extends CoreError>> continuation) {
        List<ProviderConfig> list = this.providersConfigCache.get();
        if (list != null) {
            return new Ok(list);
        }
        return CoroutineScope2.coroutineScope(new C427303(paymentContext, null), continuation);
    }

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/payments/ProviderConfig;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$getProvidersConfig$3", m3645f = "NetworkImpl.kt", m3646l = {450}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.core.network.NetworkImpl$getProvidersConfig$3 */
    static final class C427303 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends List<? extends ProviderConfig>, ? extends CoreError>>, Object> {
        final /* synthetic */ PaymentContext $paymentContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427303(PaymentContext paymentContext, Continuation<? super C427303> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NetworkImpl.this.new C427303(this.$paymentContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends List<? extends ProviderConfig>, ? extends CoreError>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Outcome<? extends List<ProviderConfig>, ? extends CoreError>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends List<ProviderConfig>, ? extends CoreError>> continuation) {
            return ((C427303) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentsExperienceApi paymentsExperienceApi = NetworkImpl.this.experienceApi;
                String resourceToken = this.$paymentContext.getResourceToken();
                this.label = 1;
                obj = paymentsExperienceApi.getProvidersConfig(resourceToken, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Outcome outcome = (Outcome) obj;
            NetworkImpl networkImpl = NetworkImpl.this;
            boolean z = outcome instanceof Ok;
            if (z) {
                networkImpl.providersConfigCache.put((List) ((Ok) outcome).getValue());
            } else if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            NetworkImpl networkImpl2 = NetworkImpl.this;
            if (z) {
                return outcome;
            }
            if (outcome instanceof Fail) {
                networkImpl2.providersConfigCache.get();
                return outcome;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthorizationFlowResponse enhanceAuthorizationFlowResponse(AuthorizationFlowResponse response, List<ProviderConfig> providersConfig) {
        if (response instanceof AuthorizationFlowResponse.Authorizing) {
            AuthorizationFlowResponse.Authorizing authorizing = (AuthorizationFlowResponse.Authorizing) response;
            return authorizing.copy(enhanceAuthorizationFlow(authorizing.getAuthorizationFlow(), providersConfig));
        }
        if (response instanceof AuthorizationFlowResponse.AuthorizationFailed) {
            return response;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final PaymentProvider enhanceProvider(PaymentProvider provider, List<ProviderConfig> providersConfig) {
        Object next;
        Iterator<T> it = providersConfig.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ProviderConfig) next).getId(), provider.getId())) {
                break;
            }
        }
        ProviderConfig providerConfig = (ProviderConfig) next;
        if (providerConfig != null) {
            float order = providerConfig.getOrder();
            List<Branch> branches = providerConfig.getBranches();
            PaymentProvider paymentProviderCopy$default = PaymentProvider.copy$default(provider, null, null, null, providerConfig.getIconExtended(), null, null, null, order, providerConfig.getHasUserPriming(), null, branches, null, 2679, null);
            if (paymentProviderCopy$default != null) {
                return paymentProviderCopy$default;
            }
        }
        return provider;
    }

    private final AuthorizationFlow enhanceAuthorizationFlow(AuthorizationFlow authorizationFlow, List<ProviderConfig> providersConfig) {
        AuthorizationFlow.FlowActions actions = authorizationFlow.getActions();
        AuthorizationFlow2 next = actions != null ? actions.getNext() : null;
        if (next == null) {
            return authorizationFlow;
        }
        if (next instanceof AuthorizationFlow2.ProviderSelection) {
            AuthorizationFlow.FlowActions actions2 = authorizationFlow.getActions();
            AuthorizationFlow2.ProviderSelection providerSelection = (AuthorizationFlow2.ProviderSelection) next;
            List<PaymentProvider> providers = providerSelection.getProviders();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(providers, 10));
            Iterator<T> it = providers.iterator();
            while (it.hasNext()) {
                arrayList.add(enhanceProvider((PaymentProvider) it.next(), providersConfig));
            }
            return authorizationFlow.copy(actions2.copy(providerSelection.copy(arrayList)));
        }
        if (!(next instanceof AuthorizationFlow2.UserAccountSelection)) {
            return authorizationFlow;
        }
        AuthorizationFlow.FlowActions actions3 = authorizationFlow.getActions();
        AuthorizationFlow2.UserAccountSelection userAccountSelection = (AuthorizationFlow2.UserAccountSelection) next;
        List<UserAccount> userAccounts = userAccountSelection.getUserAccounts();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(userAccounts, 10));
        for (UserAccount userAccount : userAccounts) {
            arrayList2.add(UserAccount.copy$default(userAccount, null, enhanceProvider(userAccount.getProvider(), providersConfig), null, null, 13, null));
        }
        return authorizationFlow.copy(actions3.copy(userAccountSelection.copy(arrayList2)));
    }
}
