package com.robinhood.android.api.creditcard;

import com.robinhood.android.models.creditcard.api.ApiCreditCardLog;
import com.robinhood.android.models.creditcard.api.AuthExchangeResponse;
import com.robinhood.android.models.creditcard.api.graphql.AddressChallengeQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.AddressChallengeResponse;
import com.robinhood.android.models.creditcard.api.graphql.AddressValidityQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.AddressValidityResponse;
import com.robinhood.android.models.creditcard.api.graphql.ApplyReferralCodeMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.ApplyReferralCodeResponse;
import com.robinhood.android.models.creditcard.api.graphql.ClaimSolidGoldCashPrizeRequest;
import com.robinhood.android.models.creditcard.api.graphql.ClaimSolidGoldCashPrizeResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditAccountMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditAccountResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditApplicationMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditApplicationResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationPageQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationPageResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationsQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationsResponse;
import com.robinhood.android.models.creditcard.api.graphql.FeaturesQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.FeaturesResponse;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeManualReviewMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeManualReviewResponse;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeResponse;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeSubmitMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeSubmitResponse;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse;
import com.robinhood.android.models.creditcard.api.graphql.IdentityEditabilityQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.IdentityEditabilityResponse;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportRequest;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportResponse;
import com.robinhood.android.models.creditcard.api.graphql.ManageSolidGoldOfferRequest;
import com.robinhood.android.models.creditcard.api.graphql.ManageSolidGoldOfferResponse;
import com.robinhood.android.models.creditcard.api.graphql.MobileClientContextRequest;
import com.robinhood.android.models.creditcard.api.graphql.MobileClientContextResponse;
import com.robinhood.android.models.creditcard.api.graphql.OfferQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.OfferQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.PutAddressMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.PutAddressResponse;
import com.robinhood.android.models.creditcard.api.graphql.PutPremiumCreditLimitChoiceMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.PutPremiumCreditLimitResponse;
import com.robinhood.android.models.creditcard.api.graphql.ReferralCodeQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.ReferralCodeResponse;
import com.robinhood.android.models.creditcard.api.graphql.ReferralContextQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.ReferralContextResponse;
import com.robinhood.android.models.creditcard.api.graphql.RequestSsnVerificationMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.RequestSsnVerificationResponse;
import com.robinhood.android.models.creditcard.api.graphql.RerunCreditReportMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.RerunCreditReportResponse;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOptionsQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOptionsResponse;
import com.robinhood.android.models.creditcard.api.graphql.SubmitAddressChallengeMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.SubmitAddressChallengeResponse;
import com.robinhood.android.models.creditcard.api.graphql.TaskQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.TaskResponse;
import com.robinhood.android.models.creditcard.api.graphql.UnderwriteApplicationMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.UnderwriteApplicationResponse;
import com.robinhood.android.models.creditcard.api.graphql.UpdateCreditApplicationMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.UpdateCreditApplicationResponse;
import com.robinhood.android.models.creditcard.api.graphql.UpdateIdentityMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.UpdateIdentityResponse;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: CreditCardApi.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0004\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u0004\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\b\b\u0001\u0010\u0004\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\b\b\u0001\u0010\u0004\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\f2\b\b\u0001\u0010\u0004\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\f2\b\b\u0001\u0010\u0004\u001a\u00020\"H§@¢\u0006\u0002\u0010#J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\f2\b\b\u0001\u0010\u0004\u001a\u00020&H§@¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\f2\b\b\u0001\u0010\u0004\u001a\u00020*H§@¢\u0006\u0002\u0010+J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\f2\b\b\u0001\u0010\u0004\u001a\u00020.H§@¢\u0006\u0002\u0010/J\u001e\u00100\u001a\b\u0012\u0004\u0012\u0002010\f2\b\b\u0001\u0010\u0004\u001a\u000202H§@¢\u0006\u0002\u00103J\u001e\u00104\u001a\b\u0012\u0004\u0012\u0002050\f2\b\b\u0001\u0010\u0004\u001a\u000206H§@¢\u0006\u0002\u00107J\u001e\u00108\u001a\b\u0012\u0004\u0012\u0002090\f2\b\b\u0001\u0010\u0004\u001a\u00020:H§@¢\u0006\u0002\u0010;J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\f2\b\b\u0001\u0010\u0004\u001a\u00020>H§@¢\u0006\u0002\u0010?J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\f2\b\b\u0001\u0010\u0004\u001a\u00020BH§@¢\u0006\u0002\u0010CJ\u001e\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\f2\b\b\u0001\u0010\u0004\u001a\u00020FH§@¢\u0006\u0002\u0010GJ\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\f2\b\b\u0001\u0010\u0004\u001a\u00020JH§@¢\u0006\u0002\u0010KJ\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\f2\b\b\u0001\u0010\u0004\u001a\u00020NH§@¢\u0006\u0002\u0010OJ\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\f2\b\b\u0001\u0010\u0004\u001a\u00020RH§@¢\u0006\u0002\u0010SJ\u001e\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\f2\b\b\u0001\u0010\u0004\u001a\u00020VH§@¢\u0006\u0002\u0010WJ\u001e\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\f2\b\b\u0001\u0010\u0004\u001a\u00020ZH§@¢\u0006\u0002\u0010[J\u001e\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\f2\b\b\u0001\u0010\u0004\u001a\u00020^H§@¢\u0006\u0002\u0010_J\u001e\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\f2\b\b\u0001\u0010\u0004\u001a\u00020bH§@¢\u0006\u0002\u0010cJ\u001e\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\f2\b\b\u0001\u0010\u0004\u001a\u00020fH§@¢\u0006\u0002\u0010gJ\u001e\u0010h\u001a\b\u0012\u0004\u0012\u00020i0\f2\b\b\u0001\u0010\u0004\u001a\u00020jH§@¢\u0006\u0002\u0010kJ\u001e\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\f2\b\b\u0001\u0010\u0004\u001a\u00020nH§@¢\u0006\u0002\u0010oJ\u001e\u0010p\u001a\b\u0012\u0004\u0012\u00020q0\f2\b\b\u0001\u0010\u0004\u001a\u00020rH§@¢\u0006\u0002\u0010sJ\u001e\u0010t\u001a\b\u0012\u0004\u0012\u00020u0\f2\b\b\u0001\u0010\u0004\u001a\u00020vH§@¢\u0006\u0002\u0010wJ\u001e\u0010x\u001a\b\u0012\u0004\u0012\u00020y0\f2\b\b\u0001\u0010\u0004\u001a\u00020zH§@¢\u0006\u0002\u0010{J\u001e\u0010|\u001a\b\u0012\u0004\u0012\u00020}0\f2\b\b\u0001\u0010\u0004\u001a\u00020~H§@¢\u0006\u0002\u0010\u007fJ\"\u0010\u0080\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\f2\t\b\u0001\u0010\u0004\u001a\u00030\u0082\u0001H§@¢\u0006\u0003\u0010\u0083\u0001J\"\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\f2\t\b\u0001\u0010\u0004\u001a\u00030\u0086\u0001H§@¢\u0006\u0003\u0010\u0087\u0001¨\u0006\u0088\u0001"}, m3636d2 = {"Lcom/robinhood/android/api/creditcard/CreditCardApi;", "", "log", "", "request", "Lcom/robinhood/android/models/creditcard/api/ApiCreditCardLog;", "(Lcom/robinhood/android/models/creditcard/api/ApiCreditCardLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authExchange", "Lretrofit2/Response;", "Lcom/robinhood/android/models/creditcard/api/AuthExchangeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validCreditApplicationInvites", "Lcom/robinhood/android/models/creditcard/api/graphql/GraphqlQueryResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/ValidCreditApplicationInviteResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/ValidCreditApplicationInviteQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/ValidCreditApplicationInviteQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "creditApplications", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "creditApplicationPage", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationPageResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationPageQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationPageQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "identityDetailsPrefill", "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addressValidity", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressValidityResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressValidityQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressValidityQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCreditApplication", "Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditApplicationResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditApplicationMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditApplicationMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCreditApplication", "Lcom/robinhood/android/models/creditcard/api/graphql/UpdateCreditApplicationResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/UpdateCreditApplicationMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/UpdateCreditApplicationMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "underwriteApplication", "Lcom/robinhood/android/models/creditcard/api/graphql/UnderwriteApplicationResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/UnderwriteApplicationMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/UnderwriteApplicationMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addressChallenge", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressChallengeResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressChallengeQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressChallengeQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitAddressChallenge", "Lcom/robinhood/android/models/creditcard/api/graphql/SubmitAddressChallengeResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/SubmitAddressChallengeMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/SubmitAddressChallengeMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateIdentity", "Lcom/robinhood/android/models/creditcard/api/graphql/UpdateIdentityResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/UpdateIdentityMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/UpdateIdentityMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollTask", "Lcom/robinhood/android/models/creditcard/api/graphql/TaskResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/TaskQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/TaskQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shipmentOptions", "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOptionsResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOptionsQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOptionsQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putAddress", "Lcom/robinhood/android/models/creditcard/api/graphql/PutAddressResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/PutAddressMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/PutAddressMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fraudAlertChallenge", "Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fraudAlertChallengeSubmit", "Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeSubmitResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeSubmitMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeSubmitMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fraudAlertChallengeManualReview", "Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeManualReviewResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeManualReviewMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeManualReviewMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCreditAccount", "Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditAccountResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditAccountMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditAccountMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rerunCreditReport", "Lcom/robinhood/android/models/creditcard/api/graphql/RerunCreditReportResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/RerunCreditReportMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/RerunCreditReportMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "identityEditability", "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityEditabilityResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityEditabilityQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/IdentityEditabilityQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "referralContext", "Lcom/robinhood/android/models/creditcard/api/graphql/ReferralContextResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/ReferralContextQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/ReferralContextQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileClientContext", "Lcom/robinhood/android/models/creditcard/api/graphql/MobileClientContextResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/MobileClientContextRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/MobileClientContextRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "manageSolidGoldOffer", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageSolidGoldOfferResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageSolidGoldOfferRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/ManageSolidGoldOfferRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "claimSolidGoldCashPrize", "Lcom/robinhood/android/models/creditcard/api/graphql/ClaimSolidGoldCashPrizeResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/ClaimSolidGoldCashPrizeRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/ClaimSolidGoldCashPrizeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestSsnVerification", "Lcom/robinhood/android/models/creditcard/api/graphql/RequestSsnVerificationResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/RequestSsnVerificationMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/RequestSsnVerificationMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "referralCode", "Lcom/robinhood/android/models/creditcard/api/graphql/ReferralCodeResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/ReferralCodeQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/ReferralCodeQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyReferralCode", "Lcom/robinhood/android/models/creditcard/api/graphql/ApplyReferralCodeResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/ApplyReferralCodeMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/ApplyReferralCodeMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putPremiumCreditLimitChoice", "Lcom/robinhood/android/models/creditcard/api/graphql/PutPremiumCreditLimitResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/PutPremiumCreditLimitChoiceMutationRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/PutPremiumCreditLimitChoiceMutationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOffers", "Lcom/robinhood/android/models/creditcard/api/graphql/OfferQueryResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/OfferQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/OfferQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "manageCreditApplicationAssetReport", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageCreditApplicationAssetReportResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageCreditApplicationAssetReportRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/ManageCreditApplicationAssetReportRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "features", "Lcom/robinhood/android/models/creditcard/api/graphql/FeaturesResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/FeaturesQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/FeaturesQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface CreditCardApi {
    @POST("graphql")
    Object addressChallenge(@Body AddressChallengeQueryRequest addressChallengeQueryRequest, Continuation<? super GraphqlQueryResponse<AddressChallengeResponse>> continuation);

    @POST("graphql")
    Object addressValidity(@Body AddressValidityQueryRequest addressValidityQueryRequest, Continuation<? super GraphqlQueryResponse<AddressValidityResponse>> continuation);

    @POST("graphql")
    Object applyReferralCode(@Body ApplyReferralCodeMutationRequest applyReferralCodeMutationRequest, Continuation<? super GraphqlQueryResponse<ApplyReferralCodeResponse>> continuation);

    @POST("auth/exchange")
    Object authExchange(Continuation<? super Response<AuthExchangeResponse>> continuation);

    @POST("graphql")
    Object claimSolidGoldCashPrize(@Body ClaimSolidGoldCashPrizeRequest claimSolidGoldCashPrizeRequest, Continuation<? super GraphqlQueryResponse<ClaimSolidGoldCashPrizeResponse>> continuation);

    @POST("graphql")
    Object createCreditAccount(@Body CreateCreditAccountMutationRequest createCreditAccountMutationRequest, Continuation<? super GraphqlQueryResponse<CreateCreditAccountResponse>> continuation);

    @POST("graphql")
    Object createCreditApplication(@Body CreateCreditApplicationMutationRequest createCreditApplicationMutationRequest, Continuation<? super GraphqlQueryResponse<CreateCreditApplicationResponse>> continuation);

    @POST("graphql")
    Object creditApplicationPage(@Body CreditApplicationPageQueryRequest creditApplicationPageQueryRequest, Continuation<? super GraphqlQueryResponse<CreditApplicationPageResponse>> continuation);

    @POST("graphql")
    Object creditApplications(@Body CreditApplicationsQueryRequest creditApplicationsQueryRequest, Continuation<? super GraphqlQueryResponse<CreditApplicationsResponse>> continuation);

    @POST("graphql")
    Object features(@Body FeaturesQueryRequest featuresQueryRequest, Continuation<? super GraphqlQueryResponse<FeaturesResponse>> continuation);

    @POST("graphql")
    Object fraudAlertChallenge(@Body FraudAlertChallengeMutationRequest fraudAlertChallengeMutationRequest, Continuation<? super GraphqlQueryResponse<FraudAlertChallengeResponse>> continuation);

    @POST("graphql")
    Object fraudAlertChallengeManualReview(@Body FraudAlertChallengeManualReviewMutationRequest fraudAlertChallengeManualReviewMutationRequest, Continuation<? super GraphqlQueryResponse<FraudAlertChallengeManualReviewResponse>> continuation);

    @POST("graphql")
    Object fraudAlertChallengeSubmit(@Body FraudAlertChallengeSubmitMutationRequest fraudAlertChallengeSubmitMutationRequest, Continuation<? super GraphqlQueryResponse<FraudAlertChallengeSubmitResponse>> continuation);

    @POST("graphql")
    Object getOffers(@Body OfferQueryRequest offerQueryRequest, Continuation<? super GraphqlQueryResponse<OfferQueryResponse>> continuation);

    @POST("graphql")
    Object identityDetailsPrefill(@Body IdentityDetailsPrefillQueryRequest identityDetailsPrefillQueryRequest, Continuation<? super GraphqlQueryResponse<IdentityDetailsPrefillResponse>> continuation);

    @POST("graphql")
    Object identityEditability(@Body IdentityEditabilityQueryRequest identityEditabilityQueryRequest, Continuation<? super GraphqlQueryResponse<IdentityEditabilityResponse>> continuation);

    @POST("log")
    Object log(@Body ApiCreditCardLog apiCreditCardLog, Continuation<? super Unit> continuation);

    @POST("graphql")
    Object manageCreditApplicationAssetReport(@Body ManageCreditApplicationAssetReportRequest manageCreditApplicationAssetReportRequest, Continuation<? super GraphqlQueryResponse<ManageCreditApplicationAssetReportResponse>> continuation);

    @POST("graphql")
    Object manageSolidGoldOffer(@Body ManageSolidGoldOfferRequest manageSolidGoldOfferRequest, Continuation<? super GraphqlQueryResponse<ManageSolidGoldOfferResponse>> continuation);

    @POST("graphql")
    Object mobileClientContext(@Body MobileClientContextRequest mobileClientContextRequest, Continuation<? super GraphqlQueryResponse<MobileClientContextResponse>> continuation);

    @POST("graphql")
    Object pollTask(@Body TaskQueryRequest taskQueryRequest, Continuation<? super GraphqlQueryResponse<TaskResponse>> continuation);

    @POST("graphql")
    Object putAddress(@Body PutAddressMutationRequest putAddressMutationRequest, Continuation<? super GraphqlQueryResponse<PutAddressResponse>> continuation);

    @POST("graphql")
    Object putPremiumCreditLimitChoice(@Body PutPremiumCreditLimitChoiceMutationRequest putPremiumCreditLimitChoiceMutationRequest, Continuation<? super GraphqlQueryResponse<PutPremiumCreditLimitResponse>> continuation);

    @POST("graphql")
    Object referralCode(@Body ReferralCodeQueryRequest referralCodeQueryRequest, Continuation<? super GraphqlQueryResponse<ReferralCodeResponse>> continuation);

    @POST("graphql")
    Object referralContext(@Body ReferralContextQueryRequest referralContextQueryRequest, Continuation<? super GraphqlQueryResponse<ReferralContextResponse>> continuation);

    @POST("graphql")
    Object requestSsnVerification(@Body RequestSsnVerificationMutationRequest requestSsnVerificationMutationRequest, Continuation<? super GraphqlQueryResponse<RequestSsnVerificationResponse>> continuation);

    @POST("graphql")
    Object rerunCreditReport(@Body RerunCreditReportMutationRequest rerunCreditReportMutationRequest, Continuation<? super GraphqlQueryResponse<RerunCreditReportResponse>> continuation);

    @POST("graphql")
    Object shipmentOptions(@Body ShipmentOptionsQueryRequest shipmentOptionsQueryRequest, Continuation<? super GraphqlQueryResponse<ShipmentOptionsResponse>> continuation);

    @POST("graphql")
    Object submitAddressChallenge(@Body SubmitAddressChallengeMutationRequest submitAddressChallengeMutationRequest, Continuation<? super GraphqlQueryResponse<SubmitAddressChallengeResponse>> continuation);

    @POST("graphql")
    Object underwriteApplication(@Body UnderwriteApplicationMutationRequest underwriteApplicationMutationRequest, Continuation<? super GraphqlQueryResponse<UnderwriteApplicationResponse>> continuation);

    @POST("graphql")
    Object updateCreditApplication(@Body UpdateCreditApplicationMutationRequest updateCreditApplicationMutationRequest, Continuation<? super GraphqlQueryResponse<UpdateCreditApplicationResponse>> continuation);

    @POST("graphql")
    Object updateIdentity(@Body UpdateIdentityMutationRequest updateIdentityMutationRequest, Continuation<? super GraphqlQueryResponse<UpdateIdentityResponse>> continuation);

    @POST("graphql")
    Object validCreditApplicationInvites(@Body ValidCreditApplicationInviteQueryRequest validCreditApplicationInviteQueryRequest, Continuation<? super GraphqlQueryResponse<ValidCreditApplicationInviteResponse>> continuation);
}
