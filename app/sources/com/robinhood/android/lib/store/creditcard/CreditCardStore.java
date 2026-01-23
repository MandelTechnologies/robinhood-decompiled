package com.robinhood.android.lib.store.creditcard;

import android.annotation.SuppressLint;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.creditcard.CreditCardApi;
import com.robinhood.android.api.creditcard.XsellApi;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.creditcard.contracts.CreditCardRhySpendingSunset;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistExperiment;
import com.robinhood.android.lib.store.creditcard.prefs.CreditApplicationIdPref;
import com.robinhood.android.lib.store.creditcard.prefs.IdentityIdPref;
import com.robinhood.android.models.creditcard.api.ApiCreditCardLog;
import com.robinhood.android.models.creditcard.api.IdentityActionType;
import com.robinhood.android.models.creditcard.api.graphql.AddressChallengeResponse;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.AddressValidityResponse;
import com.robinhood.android.models.creditcard.api.graphql.ApplyReferralCodeResponse;
import com.robinhood.android.models.creditcard.api.graphql.ClaimSolidGoldCashPrizeResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditAccountResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditApplicationRequest;
import com.robinhood.android.models.creditcard.api.graphql.CreateCreditApplicationResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationPageResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationPageType;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationStage;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationsResponse;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeManualReviewResponse;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeResponse;
import com.robinhood.android.models.creditcard.api.graphql.FraudAlertChallengeSubmitResponse;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse;
import com.robinhood.android.models.creditcard.api.graphql.IdentityEditabilityResponse;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReport;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportRequest;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportRequest3;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportResponse;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportResponse2;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportVariables;
import com.robinhood.android.models.creditcard.api.graphql.ManageSolidGoldOfferResponse;
import com.robinhood.android.models.creditcard.api.graphql.OfferQueryResponse2;
import com.robinhood.android.models.creditcard.api.graphql.PutPremiumCreditLimitResponse;
import com.robinhood.android.models.creditcard.api.graphql.ReferralCodeResponse;
import com.robinhood.android.models.creditcard.api.graphql.ReferralContextResponse;
import com.robinhood.android.models.creditcard.api.graphql.RequestSsnVerificationResponse;
import com.robinhood.android.models.creditcard.api.graphql.RerunCreditReportResponse;
import com.robinhood.android.models.creditcard.api.graphql.ResidencyPurposeType;
import com.robinhood.android.models.creditcard.api.graphql.ServiceLevelType;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import com.robinhood.android.models.creditcard.api.graphql.SubmitAddressChallengeResponse;
import com.robinhood.android.models.creditcard.api.graphql.TaskQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.TaskQueryRequestVariables;
import com.robinhood.android.models.creditcard.api.graphql.TaskResponse;
import com.robinhood.android.models.creditcard.api.graphql.UnderwriteApplicationResponse;
import com.robinhood.android.models.creditcard.api.graphql.UpdateCreditApplicationResponse;
import com.robinhood.android.models.creditcard.api.graphql.UpdateIdentityResponse;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteResponse;
import com.robinhood.android.models.creditcard.api.idverification.IdVerificationData;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.Account;
import com.robinhood.coroutines.flow.Polling2;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: CreditCardStore.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u001e\b\u0004\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0082H¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001fH\u0086@¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0086@¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'H\u0086@¢\u0006\u0004\b*\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010,H\u0086@¢\u0006\u0004\b-\u0010!J\u001a\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b0\u00101J\u0012\u00103\u001a\u0004\u0018\u000102H\u0086@¢\u0006\u0004\b3\u0010!J\u001a\u00105\u001a\u0004\u0018\u0001042\u0006\u0010\u0004\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b5\u00101J\u0012\u00107\u001a\u0004\u0018\u000106H\u0086@¢\u0006\u0004\b7\u0010!J\u0012\u00109\u001a\u0004\u0018\u000108H\u0086@¢\u0006\u0004\b9\u0010!J\u001a\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010:\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b<\u00101J$\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\u0003\u001a\u00020\u001f2\b\u0010>\u001a\u0004\u0018\u00010=H\u0086@¢\u0006\u0004\b@\u0010AJ\u0012\u0010C\u001a\u0004\u0018\u00010BH\u0086@¢\u0006\u0004\bC\u0010!J\u0012\u0010D\u001a\u0004\u0018\u00010\u001fH\u0086@¢\u0006\u0004\bD\u0010!J \u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G2\u0006\u0010F\u001a\u00020EH\u0086@¢\u0006\u0004\bI\u0010JJ\"\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0086@¢\u0006\u0004\bP\u0010QJ\u001a\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010L\u001a\u00020KH\u0086@¢\u0006\u0004\bS\u0010TJ\u001d\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0V2\u0006\u0010U\u001a\u00020\u001f¢\u0006\u0004\bX\u0010YJ\u0012\u0010[\u001a\u0004\u0018\u00010ZH\u0086@¢\u0006\u0004\b[\u0010!J\u0012\u0010]\u001a\u0004\u0018\u00010\\H\u0086@¢\u0006\u0004\b]\u0010!J\"\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b`\u0010aJ\u0012\u0010c\u001a\u0004\u0018\u00010bH\u0086@¢\u0006\u0004\bc\u0010!J\u001a\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010e\u001a\u00020dH\u0087@¢\u0006\u0004\bg\u0010hJ\u0012\u0010j\u001a\u0004\u0018\u00010iH\u0086@¢\u0006\u0004\bj\u0010!J\u0018\u0010m\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010kH\u0086@¢\u0006\u0004\bm\u0010!J*\u0010r\u001a\u0004\u0018\u00010q2\u0006\u0010n\u001a\u00020l2\u0006\u0010p\u001a\u00020o2\u0006\u0010L\u001a\u00020KH\u0086@¢\u0006\u0004\br\u0010sJ\u0012\u0010u\u001a\u0004\u0018\u00010tH\u0086@¢\u0006\u0004\bu\u0010!J&\u0010x\u001a\b\u0012\u0004\u0012\u00020w0G2\u0006\u0010^\u001a\u00020\u001f2\u0006\u0010v\u001a\u00020\u001fH\u0086@¢\u0006\u0004\bx\u0010aJ\u001e\u0010z\u001a\b\u0012\u0004\u0012\u00020y0G2\u0006\u0010^\u001a\u00020\u001fH\u0086@¢\u0006\u0004\bz\u00101J1\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020o0~2\u0012\u0010}\u001a\n\u0012\u0006\b\u0001\u0012\u00020|0{\"\u00020|H\u0086@¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001b\u0010\u0082\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0081\u0001\u0018\u00010kH\u0086@¢\u0006\u0005\b\u0082\u0001\u0010!J\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001fH\u0086@¢\u0006\u0005\b\u0083\u0001\u0010!J\u0012\u0010\u0084\u0001\u001a\u00020oH\u0086@¢\u0006\u0005\b\u0084\u0001\u0010!J \u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00012\b\u0010\u0085\u0001\u001a\u00030\u0081\u0001H\u0086@¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J=\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0086\u00012\u000b\b\u0002\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001f2\u000b\b\u0002\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001f2\u000b\b\u0002\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001fH\u0086@¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J@\u0010\u008f\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u008e\u00010V2\u000b\b\u0002\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001f2\u000b\b\u0002\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001f2\u000b\b\u0002\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001f¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0017\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020o0\u0091\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0010\u0010\u0094\u0001\u001a\u00020\u001c¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0096\u0001R\u0015\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0096\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0097\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0098\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0099\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u009a\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u009b\u0001R\u001e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020o0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006\u009f\u0001"}, m3636d2 = {"Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/prefs/StringPreference;", "creditApplicationId", "identityId", "Lcom/robinhood/android/api/creditcard/CreditCardApi;", "creditCardApi", "Lcom/robinhood/android/api/creditcard/XsellApi;", "xsellApi", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/api/creditcard/CreditCardApi;Lcom/robinhood/android/api/creditcard/XsellApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/store/user/UserStore;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", CarResultComposable2.BODY, "withScopeContext", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/IdentityActionType;", "action", "Lkotlinx/coroutines/Job;", "log", "(Lcom/robinhood/android/models/creditcard/api/IdentityActionType;)Lkotlinx/coroutines/Job;", "", "getAuthExchange", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditApplicationRequest;", "request", "Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditApplicationResponse;", "createCreditApplication", "(Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditApplicationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/ServiceLevelType;", "serviceLevel", "Lcom/robinhood/android/models/creditcard/api/graphql/UpdateCreditApplicationResponse;", "updateCreditApplication", "(Lcom/robinhood/android/models/creditcard/api/graphql/ServiceLevelType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillResponse;", "getIdentityDetailsPrefill", "phone", "Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeResponse;", "getFraudAlertChallenge", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/RequestSsnVerificationResponse;", "requestSsnVerification", "Lcom/robinhood/android/models/creditcard/api/graphql/ClaimSolidGoldCashPrizeResponse;", "claimSolidGoldCashPrize", "Lcom/robinhood/android/models/creditcard/api/graphql/UnderwriteApplicationResponse;", "underwriteApplication", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse;", "getCreditApplications", "rhUserId", "Lcom/robinhood/android/models/creditcard/api/graphql/ValidCreditApplicationInviteResponse;", "getValidCreditApplicationInvites", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationPageType;", "currPage", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationPageResponse;", "getCreditApplicationPage", "(Ljava/lang/String;Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationPageType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityEditabilityResponse$ApiResponse;", "getIdentityEditability", "getAppStoreUrl", "", "depositAmountMicro", "Lcom/robinhood/android/models/creditcard/api/graphql/GraphqlQueryResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/PutPremiumCreditLimitResponse;", "putPremiumCreditLimitChoice", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/ResidencyPurposeType;", "purpose", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressValidityResponse;", "getAddressValidity", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Lcom/robinhood/android/models/creditcard/api/graphql/ResidencyPurposeType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/SubmitAddressChallengeResponse;", "submitAddressChallenge", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taskId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/creditcard/api/graphql/TaskResponse;", "streamTaskState", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressChallengeResponse;", "getAddressChallenge", "Lcom/robinhood/android/models/creditcard/api/graphql/RerunCreditReportResponse;", "rerunCreditReport", "code", "Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeSubmitResponse;", "submitFraudAlertChallenge", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/FraudAlertChallengeManualReviewResponse;", "submitFraudAlertChallengeManualReview", "Lcom/robinhood/android/models/creditcard/api/idverification/IdVerificationData;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/models/creditcard/api/graphql/UpdateIdentityResponse;", "updateIdentity", "(Lcom/robinhood/android/models/creditcard/api/idverification/IdVerificationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageSolidGoldOfferResponse;", "manageSolidGoldOffer", "", "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "getShipmentOptions", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "", "sigRequired", "Lcom/robinhood/android/models/creditcard/api/graphql/CreateCreditAccountResponse;", "createCreditAccount", "(Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;ZLcom/robinhood/android/models/creditcard/api/graphql/AddressType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/ReferralContextResponse;", "getReferralContext", "email", "Lcom/robinhood/android/models/creditcard/api/graphql/ApplyReferralCodeResponse;", "applyReferralCode", "Lcom/robinhood/android/models/creditcard/api/graphql/ReferralCodeResponse;", "getReferralCode", "", "Lcom/robinhood/android/models/creditcard/api/graphql/OfferQueryType;", "offerType", "", "hasActiveOffers", "([Lcom/robinhood/android/models/creditcard/api/graphql/OfferQueryType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/Account;", "getAccounts", "getPlaidLinkToken", "getGoldBasicEligibility", "account", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageCreditApplicationAssetReportResponse$Response$ManageCreditApplicationAssetReport;", "createAssetReport", "(Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/Account;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "originalAccountLinkId", "updatedAccountLinkId", "plaidToken", "submitPlaidPublicToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageCreditApplicationAssetReportStatus;", "pollAssetReportStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lio/reactivex/Observable;", "streamCreditCardTabEligibility", "()Lio/reactivex/Observable;", "refreshCreditCardTabEligibility", "()Lkotlinx/coroutines/Job;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/android/api/creditcard/CreditCardApi;", "Lcom/robinhood/android/api/creditcard/XsellApi;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/shared/store/user/UserStore;", "Lj$/time/Clock;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "creditCardTabEligibility", "Lkotlinx/coroutines/flow/MutableStateFlow;", "lib-store-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CreditCardStore extends Store {
    public static final int $stable = 8;
    private final Clock clock;
    private final StringPreference creditApplicationId;
    private final CreditCardApi creditCardApi;
    private final StateFlow2<Boolean> creditCardTabEligibility;
    private final ExperimentsStore experimentsStore;
    private final StringPreference identityId;
    private final UserStore userStore;
    private final XsellApi xsellApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardStore(@CreditApplicationIdPref StringPreference creditApplicationId, @IdentityIdPref StringPreference identityId, CreditCardApi creditCardApi, XsellApi xsellApi, ExperimentsStore experimentsStore, UserStore userStore, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        Intrinsics.checkNotNullParameter(creditCardApi, "creditCardApi");
        Intrinsics.checkNotNullParameter(xsellApi, "xsellApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.creditApplicationId = creditApplicationId;
        this.identityId = identityId;
        this.creditCardApi = creditCardApi;
        this.xsellApi = xsellApi;
        this.experimentsStore = experimentsStore;
        this.userStore = userStore;
        this.clock = clock;
        this.creditCardTabEligibility = StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    /* compiled from: CreditCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$log$1", m3645f = "CreditCardStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardStore$log$1 */
    static final class C205551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IdentityActionType $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C205551(IdentityActionType identityActionType, Continuation<? super C205551> continuation) {
            super(2, continuation);
            this.$action = identityActionType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreditCardStore.this.new C205551(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C205551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreditCardApi creditCardApi = CreditCardStore.this.creditCardApi;
                IdentityActionType identityActionType = this.$action;
                String str = CreditCardStore.this.creditApplicationId.get();
                if (str == null) {
                    str = "";
                }
                ApiCreditCardLog apiCreditCardLog = new ApiCreditCardLog(identityActionType, MapsKt.mapOf(new Tuples2("creditApplicationId", str)));
                this.label = 1;
                if (creditCardApi.log(apiCreditCardLog, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Job log(IdentityActionType action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C205551(action, null), 3, null);
    }

    /* compiled from: CreditCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/creditcard/api/graphql/TaskResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$streamTaskState$1", m3645f = "CreditCardStore.kt", m3646l = {340}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardStore$streamTaskState$1 */
    static final class C205581 extends ContinuationImpl7 implements Function1<Continuation<? super TaskResponse>, Object> {
        final /* synthetic */ String $taskId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C205581(String str, Continuation<? super C205581> continuation) {
            super(1, continuation);
            this.$taskId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CreditCardStore.this.new C205581(this.$taskId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super TaskResponse> continuation) {
            return ((C205581) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreditCardApi creditCardApi = CreditCardStore.this.creditCardApi;
                TaskQueryRequest taskQueryRequest = new TaskQueryRequest(null, null, new TaskQueryRequestVariables(this.$taskId), 3, null);
                this.label = 1;
                obj = creditCardApi.pollTask(taskQueryRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((GraphqlQueryResponse) obj).getData();
        }
    }

    public final Flow<TaskResponse> streamTaskState(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Duration durationOfMillis = Duration.ofMillis(500L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        return Polling2.networkPoll(durationOfMillis, new C205581(taskId, null));
    }

    public static /* synthetic */ Object submitPlaidPublicToken$default(CreditCardStore creditCardStore, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return creditCardStore.submitPlaidPublicToken(str, str2, str3, continuation);
    }

    public static /* synthetic */ Flow pollAssetReportStatus$default(CreditCardStore creditCardStore, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return creditCardStore.pollAssetReportStatus(str, str2, str3);
    }

    /* compiled from: CreditCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageCreditApplicationAssetReportStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$pollAssetReportStatus$1", m3645f = "CreditCardStore.kt", m3646l = {644}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardStore$pollAssetReportStatus$1 */
    static final class C205561 extends ContinuationImpl7 implements Function1<Continuation<? super ManageCreditApplicationAssetReportResponse2>, Object> {
        final /* synthetic */ String $originalAccountLinkId;
        final /* synthetic */ String $plaidToken;
        final /* synthetic */ String $updatedAccountLinkId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C205561(String str, String str2, String str3, Continuation<? super C205561> continuation) {
            super(1, continuation);
            this.$originalAccountLinkId = str;
            this.$updatedAccountLinkId = str2;
            this.$plaidToken = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CreditCardStore.this.new C205561(this.$originalAccountLinkId, this.$updatedAccountLinkId, this.$plaidToken, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ManageCreditApplicationAssetReportResponse2> continuation) {
            return ((C205561) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ManageCreditApplicationAssetReportResponse.Response manageCreditApplicationAssetReport;
            ManageCreditApplicationAssetReportResponse.Response.ManageCreditApplicationAssetReport data;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreditCardApi creditCardApi = CreditCardStore.this.creditCardApi;
                String str = CreditCardStore.this.creditApplicationId.get();
                if (str == null) {
                    str = "";
                }
                ManageCreditApplicationAssetReportRequest manageCreditApplicationAssetReportRequest = new ManageCreditApplicationAssetReportRequest(null, null, new ManageCreditApplicationAssetReportVariables(new ManageCreditApplicationAssetReport(str, ManageCreditApplicationAssetReportRequest3.CREATE_ASSET_REPORT.getServerValue(), this.$originalAccountLinkId, this.$updatedAccountLinkId, this.$plaidToken)), 3, null);
                this.label = 1;
                obj = creditCardApi.manageCreditApplicationAssetReport(manageCreditApplicationAssetReportRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ManageCreditApplicationAssetReportResponse manageCreditApplicationAssetReportResponse = (ManageCreditApplicationAssetReportResponse) ((GraphqlQueryResponse) obj).getData();
            if (manageCreditApplicationAssetReportResponse == null || (manageCreditApplicationAssetReport = manageCreditApplicationAssetReportResponse.getManageCreditApplicationAssetReport()) == null || (data = manageCreditApplicationAssetReport.getData()) == null) {
                return null;
            }
            return data.getStatus();
        }
    }

    public final Flow<ManageCreditApplicationAssetReportResponse2> pollAssetReportStatus(String originalAccountLinkId, String updatedAccountLinkId, String plaidToken) {
        Duration durationOfMillis = Duration.ofMillis(3000L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        Flow flowNetworkPoll = Polling2.networkPoll(durationOfMillis, new C205561(originalAccountLinkId, updatedAccountLinkId, plaidToken, null));
        Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return FlowKt.m28821timeoutHG0u8IE(flowNetworkPoll, Duration3.toDuration(30, DurationUnitJvm.SECONDS));
    }

    public final Observable<Boolean> streamCreditCardTabEligibility() {
        return asObservable(this.creditCardTabEligibility);
    }

    /* compiled from: CreditCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$refreshCreditCardTabEligibility$1", m3645f = "CreditCardStore.kt", m3646l = {711, 712, 713, 675, 678}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardStore$refreshCreditCardTabEligibility$1 */
    static final class C205571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C205571(Continuation<? super C205571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreditCardStore.this.new C205571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C205571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x019d A[PHI: r4
          0x019d: PHI (r4v15 kotlinx.coroutines.flow.MutableStateFlow) = 
          (r4v10 kotlinx.coroutines.flow.MutableStateFlow)
          (r4v10 kotlinx.coroutines.flow.MutableStateFlow)
          (r4v10 kotlinx.coroutines.flow.MutableStateFlow)
          (r4v16 kotlinx.coroutines.flow.MutableStateFlow)
         binds: [B:78:0x01a5, B:80:0x01ad, B:82:0x01b3, B:75:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x019f  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objAwaitFirst;
            String string2;
            Object objAwaitFirst2;
            Object objAwaitFirst3;
            Object creditApplications;
            String str;
            Boolean bool;
            List<CreditApplicationsResponse.AuthIdentityObject.CreditApplication> creditApplications2;
            Iterator<T> it;
            Object next;
            CreditApplicationsResponse.AuthIdentityObject.CreditApplication creditApplication;
            StateFlow2 stateFlow2;
            Object validCreditApplicationInvites;
            StateFlow2 stateFlow22;
            CreditApplicationsResponse.AuthIdentityObject authIdentity;
            ValidCreditApplicationInviteResponse validCreditApplicationInviteResponse;
            ValidCreditApplicationInviteResponse.Response creditApplicationInvites;
            List<ValidCreditApplicationInviteResponse.Response.Invite> invites;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = false;
            Object obj2 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<User> user = CreditCardStore.this.userStore.getUser();
                this.label = 1;
                objAwaitFirst = RxAwait3.awaitFirst(user, this);
                if (objAwaitFirst != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    string2 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitFirst2 = obj;
                    if (((Boolean) objAwaitFirst2).booleanValue()) {
                        CreditCardStore.this.creditCardTabEligibility.setValue(boxing.boxBoolean(false));
                        return Unit.INSTANCE;
                    }
                    Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(CreditCardStore.this.experimentsStore, new Experiment[]{CreditCardRhySpendingSunset.INSTANCE}, false, null, 6, null);
                    this.L$0 = string2;
                    this.label = 3;
                    objAwaitFirst3 = RxAwait3.awaitFirst(observableStreamState$default, this);
                    if (objAwaitFirst3 != coroutine_suspended) {
                        Boolean bool2 = (Boolean) objAwaitFirst3;
                        CreditCardStore creditCardStore = CreditCardStore.this;
                        this.L$0 = string2;
                        this.L$1 = bool2;
                        this.label = 4;
                        creditApplications = creditCardStore.getCreditApplications(this);
                        if (creditApplications != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 3) {
                    string2 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitFirst3 = obj;
                    Boolean bool22 = (Boolean) objAwaitFirst3;
                    CreditCardStore creditCardStore2 = CreditCardStore.this;
                    this.L$0 = string2;
                    this.L$1 = bool22;
                    this.label = 4;
                    creditApplications = creditCardStore2.getCreditApplications(this);
                    if (creditApplications != coroutine_suspended) {
                        str = string2;
                        bool = bool22;
                        CreditApplicationsResponse creditApplicationsResponse = (CreditApplicationsResponse) creditApplications;
                        if (creditApplicationsResponse != null) {
                            if (creditApplications2 == null) {
                            }
                            it = creditApplications2.iterator();
                            if (it.hasNext()) {
                            }
                            creditApplication = (CreditApplicationsResponse.AuthIdentityObject.CreditApplication) next;
                            stateFlow2 = CreditCardStore.this.creditCardTabEligibility;
                            if (creditApplication != null) {
                            }
                        }
                        stateFlow2.setValue(boxing.boxBoolean(z));
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    stateFlow22 = (StateFlow2) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    validCreditApplicationInvites = obj;
                    validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) validCreditApplicationInvites;
                    if (validCreditApplicationInviteResponse != null && (creditApplicationInvites = validCreditApplicationInviteResponse.getCreditApplicationInvites()) != null && (invites = creditApplicationInvites.getInvites()) != null) {
                        CreditCardStore creditCardStore3 = CreditCardStore.this;
                        for (Object obj3 : invites) {
                            Long expiresAt = ((ValidCreditApplicationInviteResponse.Response.Invite) obj3).getExpiresAt();
                            if (expiresAt == null || Instant.now(creditCardStore3.clock).compareTo(Instant.ofEpochMilli(expiresAt.longValue())) <= 0) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        obj2 = (ValidCreditApplicationInviteResponse.Response.Invite) obj2;
                    }
                    stateFlow2 = stateFlow22;
                    if (obj2 != null) {
                        z = true;
                    }
                    stateFlow2.setValue(boxing.boxBoolean(z));
                    return Unit.INSTANCE;
                }
                bool = (Boolean) this.L$1;
                String str2 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str2;
                creditApplications = obj;
                CreditApplicationsResponse creditApplicationsResponse2 = (CreditApplicationsResponse) creditApplications;
                creditApplications2 = (creditApplicationsResponse2 != null || (authIdentity = creditApplicationsResponse2.getAuthIdentity()) == null) ? null : authIdentity.getCreditApplications();
                if (creditApplications2 == null) {
                    creditApplications2 = CollectionsKt.emptyList();
                }
                it = creditApplications2.iterator();
                if (it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        long createdAt = ((CreditApplicationsResponse.AuthIdentityObject.CreditApplication) next).getCreatedAt();
                        do {
                            Object next2 = it.next();
                            long createdAt2 = ((CreditApplicationsResponse.AuthIdentityObject.CreditApplication) next2).getCreatedAt();
                            if (createdAt < createdAt2) {
                                next = next2;
                                createdAt = createdAt2;
                            }
                        } while (it.hasNext());
                    }
                }
                creditApplication = (CreditApplicationsResponse.AuthIdentityObject.CreditApplication) next;
                stateFlow2 = CreditCardStore.this.creditCardTabEligibility;
                if (creditApplication != null) {
                    CreditCardStore creditCardStore4 = CreditCardStore.this;
                    this.L$0 = stateFlow2;
                    this.L$1 = null;
                    this.label = 5;
                    validCreditApplicationInvites = creditCardStore4.getValidCreditApplicationInvites(str, this);
                    if (validCreditApplicationInvites != coroutine_suspended) {
                        stateFlow22 = stateFlow2;
                        validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) validCreditApplicationInvites;
                        if (validCreditApplicationInviteResponse != null) {
                            CreditCardStore creditCardStore32 = CreditCardStore.this;
                            while (r2.hasNext()) {
                            }
                            obj2 = (ValidCreditApplicationInviteResponse.Response.Invite) obj2;
                        }
                        stateFlow2 = stateFlow22;
                        if (obj2 != null) {
                        }
                        stateFlow2.setValue(boxing.boxBoolean(z));
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (creditApplication.getStage() == CreditApplicationStage.APPROVED || creditApplication.getStage() == CreditApplicationStage.IN_PROGRESS || bool.booleanValue()) {
                }
                stateFlow2.setValue(boxing.boxBoolean(z));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objAwaitFirst = obj;
            string2 = ((User) objAwaitFirst).getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            Observable observableStreamState$default2 = ExperimentsProvider.DefaultImpls.streamState$default(CreditCardStore.this.experimentsStore, new Experiment[]{CreditCardWaitlistExperiment.INSTANCE}, false, null, 6, null);
            this.L$0 = string2;
            this.label = 2;
            objAwaitFirst2 = RxAwait3.awaitFirst(observableStreamState$default2, this);
            if (objAwaitFirst2 != coroutine_suspended) {
                if (((Boolean) objAwaitFirst2).booleanValue()) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final Job refreshCreditCardTabEligibility() {
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C205571(null), 3, null);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CreditCardStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$withScopeContext$2", m3645f = "CreditCardStore.kt", m3646l = {692}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardStore$withScopeContext$2 */
    public static final class C205592<T> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $body;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C205592(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super C205592> continuation) {
            super(2, continuation);
            this.$body = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C205592(this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C205592) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Function1<Continuation<? super T>, Object> function1 = this.$body;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$body.invoke(this);
        }
    }

    private final <T> Object withScopeContext(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        CoroutineContext coroutineContext = getStoreScope().getCoroutineContext();
        C205592 c205592 = new C205592(function1, null);
        InlineMarker.mark(0);
        Object objWithContext = BuildersKt.withContext(coroutineContext, c205592, continuation);
        InlineMarker.mark(1);
        return objWithContext;
    }

    public final Object applyReferralCode(String str, String str2, Continuation<? super GraphqlQueryResponse<ApplyReferralCodeResponse>> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$applyReferralCode$$inlined$withScopeContext$1(null, this, str, str2), continuation);
    }

    public final Object claimSolidGoldCashPrize(String str, Continuation<? super ClaimSolidGoldCashPrizeResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20538x2212e04b(null, this, str), continuation);
    }

    public final Object createAssetReport(Account account, Continuation<? super ManageCreditApplicationAssetReportResponse.Response.ManageCreditApplicationAssetReport> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$createAssetReport$$inlined$withScopeContext$1(null, this, account), continuation);
    }

    public final Object createCreditAccount(ShipmentOption shipmentOption, boolean z, AddressType addressType, Continuation<? super CreateCreditAccountResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$createCreditAccount$$inlined$withScopeContext$1(null, this, shipmentOption, z, addressType), continuation);
    }

    public final Object createCreditApplication(CreateCreditApplicationRequest createCreditApplicationRequest, Continuation<? super CreateCreditApplicationResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20539xe84a9436(null, this, createCreditApplicationRequest), continuation);
    }

    public final Object getAccounts(Continuation<? super List<Account>> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$getAccounts$$inlined$withScopeContext$1(null, this), continuation);
    }

    public final Object getAddressChallenge(Continuation<? super AddressChallengeResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$getAddressChallenge$$inlined$withScopeContext$1(null, this), continuation);
    }

    public final Object getAddressValidity(AddressType addressType, ResidencyPurposeType residencyPurposeType, Continuation<? super AddressValidityResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$getAddressValidity$$inlined$withScopeContext$1(null, this, addressType, residencyPurposeType), continuation);
    }

    public final Object getAppStoreUrl(Continuation<? super String> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$getAppStoreUrl$$inlined$withScopeContext$1(null, this), continuation);
    }

    public final Object getAuthExchange(Continuation<? super String> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$getAuthExchange$$inlined$withScopeContext$1(null, this), continuation);
    }

    public final Object getCreditApplicationPage(String str, CreditApplicationPageType creditApplicationPageType, Continuation<? super CreditApplicationPageResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20540x7d3dd463(null, this, str, creditApplicationPageType), continuation);
    }

    public final Object getCreditApplications(Continuation<? super CreditApplicationsResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20541x6349de6d(null, this), continuation);
    }

    public final Object getFraudAlertChallenge(String str, Continuation<? super FraudAlertChallengeResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20542x1a06da88(null, this, str), continuation);
    }

    public final Object getGoldBasicEligibility(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20543xf58d5b0(null, this), continuation);
    }

    public final Object getIdentityDetailsPrefill(Continuation<? super IdentityDetailsPrefillResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20544x8d143c13(null, this), continuation);
    }

    public final Object getIdentityEditability(Continuation<? super IdentityEditabilityResponse.ApiResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20545xc5c56c5f(null, this), continuation);
    }

    public final Object getPlaidLinkToken(Continuation<? super String> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$getPlaidLinkToken$$inlined$withScopeContext$1(null, this), continuation);
    }

    public final Object getReferralCode(String str, Continuation<? super GraphqlQueryResponse<ReferralCodeResponse>> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$getReferralCode$$inlined$withScopeContext$1(null, this, str), continuation);
    }

    public final Object getReferralContext(Continuation<? super ReferralContextResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$getReferralContext$$inlined$withScopeContext$1(null, this), continuation);
    }

    public final Object getShipmentOptions(Continuation<? super List<ShipmentOption>> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$getShipmentOptions$$inlined$withScopeContext$1(null, this), continuation);
    }

    public final Object getValidCreditApplicationInvites(String str, Continuation<? super ValidCreditApplicationInviteResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20546x6b879d2c(null, this, str), continuation);
    }

    public final Object hasActiveOffers(OfferQueryResponse2[] offerQueryResponse2Arr, Continuation<? super Map<OfferQueryResponse2, Boolean>> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$hasActiveOffers$$inlined$withScopeContext$1(null, this, offerQueryResponse2Arr), continuation);
    }

    public final Object manageSolidGoldOffer(Continuation<? super ManageSolidGoldOfferResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$manageSolidGoldOffer$$inlined$withScopeContext$1(null, this), continuation);
    }

    public final Object putPremiumCreditLimitChoice(long j, Continuation<? super GraphqlQueryResponse<PutPremiumCreditLimitResponse>> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20547xa187d056(null, this, j), continuation);
    }

    public final Object requestSsnVerification(Continuation<? super RequestSsnVerificationResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20548x730db0d(null, this), continuation);
    }

    public final Object rerunCreditReport(Continuation<? super RerunCreditReportResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$rerunCreditReport$$inlined$withScopeContext$1(null, this), continuation);
    }

    public final Object submitAddressChallenge(AddressType addressType, Continuation<? super SubmitAddressChallengeResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20549x4eeb63da(null, this, addressType), continuation);
    }

    public final Object submitFraudAlertChallenge(String str, String str2, Continuation<? super FraudAlertChallengeSubmitResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20550x9452c2ee(null, this, str, str2), continuation);
    }

    public final Object submitFraudAlertChallengeManualReview(Continuation<? super FraudAlertChallengeManualReviewResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20551x69b31a4c(null, this), continuation);
    }

    public final Object submitPlaidPublicToken(String str, String str2, String str3, Continuation<? super ManageCreditApplicationAssetReportResponse.Response.ManageCreditApplicationAssetReport> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20552xc9c12cbb(null, this, str, str2, str3), continuation);
    }

    public final Object underwriteApplication(Continuation<? super UnderwriteApplicationResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20553xcd3a404(null, this), continuation);
    }

    public final Object updateCreditApplication(ServiceLevelType serviceLevelType, Continuation<? super UpdateCreditApplicationResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new C20554xc535c589(null, this, serviceLevelType), continuation);
    }

    @SuppressLint({"VisibleForTests"})
    public final Object updateIdentity(IdVerificationData idVerificationData, Continuation<? super UpdateIdentityResponse> continuation) {
        return BuildersKt.withContext(getStoreScope().getCoroutineContext(), new CreditCardStore$updateIdentity$$inlined$withScopeContext$1(null, this, idVerificationData), continuation);
    }
}
