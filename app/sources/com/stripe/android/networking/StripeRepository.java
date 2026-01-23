package com.stripe.android.networking;

import com.stripe.android.cards.Bin;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.MobileCardElementConfig;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.RadarSessionWithHCaptcha;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: StripeRepository.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J<\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J<\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u000bJ,\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0016J4\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u001bJ,\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\b2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J,\u00105\u001a\b\u0012\u0004\u0012\u0002020\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J$\u00109\u001a\b\u0012\u0004\u0012\u0002060\b2\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J,\u0010?\u001a\b\u0012\u0004\u0012\u00020<0\b2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J,\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\b2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ,\u0010H\u001a\b\u0012\u0004\u0012\u00020C0\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010\u0016J$\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\b2\u0006\u0010B\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u00108J>\u0010Q\u001a\b\u0012\u0004\u0012\u00020I0\b2\u0006\u0010L\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\b\u0010N\u001a\u0004\u0018\u00010\u00022\u0006\u0010B\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010PJ,\u0010W\u001a\b\u0012\u0004\u0012\u00020T0\b2\u0006\u0010S\u001a\u00020R2\u0006\u0010B\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010VJ4\u0010[\u001a\b\u0012\u0004\u0012\u00020T0\b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010S\u001a\u00020X2\u0006\u0010B\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bY\u0010ZJ4\u0010]\u001a\b\u0012\u0004\u0012\u00020T0\b2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010S\u001a\u00020X2\u0006\u0010B\u001a\u00020\u0004H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010ZJJ\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b_\u0010`JJ\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010`J<\u0010h\u001a\b\u0012\u0004\u0012\u00020e0\b2\u0006\u0010B\u001a\u00020\u00042\u0016\b\u0002\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010dH§@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010g\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006i"}, m3636d2 = {"Lcom/stripe/android/networking/StripeRepository;", "", "", "clientSecret", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "options", "", "expandFields", "Lkotlin/Result;", "Lcom/stripe/android/model/StripeIntent;", "retrieveStripeIntent-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveStripeIntent", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntent-BWLJW6A", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "retrievePaymentIntent-BWLJW6A", "retrievePaymentIntent", "refreshPaymentIntent-0E7RQCE", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshPaymentIntent", "paymentIntentId", "sourceId", "cancelPaymentIntentSource-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPaymentIntentSource", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntentParams", "Lcom/stripe/android/model/SetupIntent;", "confirmSetupIntent-BWLJW6A", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "retrieveSetupIntent-BWLJW6A", "retrieveSetupIntent", "refreshSetupIntent-0E7RQCE", "refreshSetupIntent", "setupIntentId", "cancelSetupIntentSource-BWLJW6A", "cancelSetupIntentSource", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod-0E7RQCE", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/model/TokenParams;", "tokenParams", "Lcom/stripe/android/model/Token;", "createToken-0E7RQCE", "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createToken", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatus-gIAlu-s", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFpxBankStatus", "Lcom/stripe/android/cards/Bin;", "bin", "Lcom/stripe/android/model/CardMetadata;", "getCardMetadata-0E7RQCE", "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardMetadata", "Lcom/stripe/android/model/Stripe3ds2AuthParams;", "authParams", "requestOptions", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "start3ds2Auth-0E7RQCE", "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start3ds2Auth", "complete3ds2Auth-0E7RQCE", "complete3ds2Auth", "Lcom/stripe/android/model/RadarSessionWithHCaptcha;", "createRadarSession-gIAlu-s", "createRadarSession", "radarSessionToken", "hcaptchaToken", "hcaptchaEKey", "attachHCaptchaToRadarSession-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachHCaptchaToRadarSession", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;", "params", "Lcom/stripe/android/model/FinancialConnectionsSession;", "createFinancialConnectionsSessionForDeferredPayments-0E7RQCE", "(Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFinancialConnectionsSessionForDeferredPayments", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "createPaymentIntentFinancialConnectionsSession-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentIntentFinancialConnectionsSession", "createSetupIntentFinancialConnectionsSession-BWLJW6A", "createSetupIntentFinancialConnectionsSession", "financialConnectionsSessionId", "attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachFinancialConnectionsSessionToPaymentIntent", "attachFinancialConnectionsSessionToSetupIntent-hUnOzRk", "attachFinancialConnectionsSessionToSetupIntent", "", "Lcom/stripe/android/model/MobileCardElementConfig;", "retrieveCardElementConfig-0E7RQCE", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveCardElementConfig", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public interface StripeRepository {
    /* renamed from: attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk */
    Object mo26866attachFinancialConnectionsSessionToPaymentIntenthUnOzRk(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: attachFinancialConnectionsSessionToSetupIntent-hUnOzRk */
    Object mo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: attachHCaptchaToRadarSession-yxL6bBk */
    Object mo26868attachHCaptchaToRadarSessionyxL6bBk(String str, String str2, String str3, ApiRequest.Options options, Continuation<? super Result<RadarSessionWithHCaptcha>> continuation);

    /* renamed from: cancelPaymentIntentSource-BWLJW6A */
    Object mo26869cancelPaymentIntentSourceBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: cancelSetupIntentSource-BWLJW6A */
    Object mo26870cancelSetupIntentSourceBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: complete3ds2Auth-0E7RQCE */
    Object mo26871complete3ds2Auth0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<Stripe3ds2AuthResult>> continuation);

    /* renamed from: confirmPaymentIntent-BWLJW6A */
    Object mo26872confirmPaymentIntentBWLJW6A(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: confirmSetupIntent-BWLJW6A */
    Object mo26873confirmSetupIntentBWLJW6A(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: createFinancialConnectionsSessionForDeferredPayments-0E7RQCE */
    Object mo26874createFinancialConnectionsSessionForDeferredPayments0E7RQCE(CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation);

    /* renamed from: createPaymentIntentFinancialConnectionsSession-BWLJW6A */
    Object mo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation);

    /* renamed from: createPaymentMethod-0E7RQCE */
    Object mo26876createPaymentMethod0E7RQCE(PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation);

    /* renamed from: createRadarSession-gIAlu-s */
    Object mo26877createRadarSessiongIAlus(ApiRequest.Options options, Continuation<? super Result<RadarSessionWithHCaptcha>> continuation);

    /* renamed from: createSetupIntentFinancialConnectionsSession-BWLJW6A */
    Object mo26878createSetupIntentFinancialConnectionsSessionBWLJW6A(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation);

    /* renamed from: createToken-0E7RQCE */
    Object mo26879createToken0E7RQCE(TokenParams tokenParams, ApiRequest.Options options, Continuation<? super Result<Token>> continuation);

    /* renamed from: getCardMetadata-0E7RQCE */
    Object mo26880getCardMetadata0E7RQCE(Bin bin, ApiRequest.Options options, Continuation<? super Result<CardMetadata>> continuation);

    /* renamed from: getFpxBankStatus-gIAlu-s */
    Object mo26881getFpxBankStatusgIAlus(ApiRequest.Options options, Continuation<? super Result<BankStatuses>> continuation);

    /* renamed from: refreshPaymentIntent-0E7RQCE */
    Object mo26882refreshPaymentIntent0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: refreshSetupIntent-0E7RQCE */
    Object mo26883refreshSetupIntent0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: retrieveCardElementConfig-0E7RQCE */
    Object mo26884retrieveCardElementConfig0E7RQCE(ApiRequest.Options options, Map<String, String> map, Continuation<? super Result<MobileCardElementConfig>> continuation);

    /* renamed from: retrievePaymentIntent-BWLJW6A */
    Object mo26885retrievePaymentIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: retrieveSetupIntent-BWLJW6A */
    Object mo26886retrieveSetupIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: retrieveStripeIntent-BWLJW6A */
    Object mo26887retrieveStripeIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<? extends StripeIntent>> continuation);

    /* renamed from: start3ds2Auth-0E7RQCE */
    Object mo26888start3ds2Auth0E7RQCE(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, Continuation<? super Result<Stripe3ds2AuthResult>> continuation);

    /* compiled from: StripeRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: retrieveStripeIntent-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m26910retrieveStripeIntentBWLJW6A$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveStripeIntent-BWLJW6A");
            }
            if ((i & 4) != 0) {
                list = CollectionsKt.emptyList();
            }
            return stripeRepository.mo26887retrieveStripeIntentBWLJW6A(str, options, list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: retrievePaymentIntent-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m26908retrievePaymentIntentBWLJW6A$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrievePaymentIntent-BWLJW6A");
            }
            if ((i & 4) != 0) {
                list = CollectionsKt.emptyList();
            }
            return stripeRepository.mo26885retrievePaymentIntentBWLJW6A(str, options, list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: retrieveSetupIntent-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m26909retrieveSetupIntentBWLJW6A$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSetupIntent-BWLJW6A");
            }
            if ((i & 4) != 0) {
                list = CollectionsKt.emptyList();
            }
            return stripeRepository.mo26886retrieveSetupIntentBWLJW6A(str, options, list, continuation);
        }
    }
}
