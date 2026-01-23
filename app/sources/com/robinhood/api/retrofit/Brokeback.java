package com.robinhood.api.retrofit;

import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.odyssey.lib.Constants4;
import com.robinhood.android.regiongate.AcatsRegionGate;
import com.robinhood.android.regiongate.CryptoDetailRegionGate;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.directipo.models.api.ApiIpoQuote;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.AgreementAcceptRequest;
import com.robinhood.models.api.ApiBuyingPowerBreakdown;
import com.robinhood.models.api.ApiCancelOrderRequest;
import com.robinhood.models.api.ApiCryptoDescription;
import com.robinhood.models.api.ApiCryptoHistorical;
import com.robinhood.models.api.ApiCryptoQuote;
import com.robinhood.models.api.ApiDayTrades;
import com.robinhood.models.api.ApiDividend;
import com.robinhood.models.api.ApiInstrumentSplitPayment;
import com.robinhood.models.api.ApiLegacyStockLoanPayment;
import com.robinhood.models.api.ApiMarginInterestCharge;
import com.robinhood.models.api.ApiMarginSubscriptionFee;
import com.robinhood.models.api.ApiMarkThreadsAsReadRequest;
import com.robinhood.models.api.ApiMarketHours;
import com.robinhood.models.api.ApiMessage;
import com.robinhood.models.api.ApiMessageResult;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.models.api.ApiOrder;
import com.robinhood.models.api.ApiPosition;
import com.robinhood.models.api.ApiPricebook;
import com.robinhood.models.api.ApiProfile;
import com.robinhood.models.api.ApiProfilePage;
import com.robinhood.models.api.ApiQuickTradeAmounts;
import com.robinhood.models.api.ApiReceivedAchSettings;
import com.robinhood.models.api.ApiSubmitMessageRequest;
import com.robinhood.models.api.ApiSubmitResponseRequest;
import com.robinhood.models.api.ApiThread;
import com.robinhood.models.api.ApiTrustedDevice;
import com.robinhood.models.api.LegacyApiAcatsTransfer;
import com.robinhood.models.api.Mfa;
import com.robinhood.models.api.OrderRequest;
import com.robinhood.models.api.UserAdditionalInfo;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.subscription.api.ApiMarginSubscription;
import com.robinhood.models.subscription.api.MarginUpgradePlans;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.shared.equities.models.instrumentdetails.api.ApiEarning2;
import com.robinhood.shared.equities.models.instrumentdetails.api.ApiFundamental;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p479j$.time.LocalDate;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: Brokeback.kt */
@Metadata(m3635d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0015\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0004J&\u0010\u001b\u001a\u00020\u001a2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0019\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001e\u001a\u00020\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001e\u0010\u001cJ\u001c\u0010 \u001a\u00020\u001f2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b \u0010!J&\u0010\"\u001a\u00020\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u0005H§@¢\u0006\u0004\b\"\u0010\u001cJ$\u0010%\u001a\u00020$2\b\b\u0001\u0010\u001d\u001a\u00020\u00052\b\b\u0001\u0010#\u001a\u00020\u0005H§@¢\u0006\u0004\b%\u0010&J,\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b*\u0010&J.\u0010-\u001a\u00020)2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010,\u001a\u00020+H§@¢\u0006\u0004\b-\u0010.J4\u00100\u001a\b\u0012\u0004\u0012\u00020)0/2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010,\u001a\u00020+H§@¢\u0006\u0004\b0\u0010.J\u0016\u00102\u001a\b\u0012\u0004\u0012\u0002010(H§@¢\u0006\u0004\b2\u0010\u0004J\u001a\u00104\u001a\u0002012\b\b\u0001\u00103\u001a\u00020\u000fH§@¢\u0006\u0004\b4\u0010!J\u001a\u00106\u001a\u00020\u001a2\b\b\u0001\u00105\u001a\u00020\u000fH§@¢\u0006\u0004\b6\u0010!J.\u0010:\u001a\b\u0012\u0004\u0012\u0002090(2\n\b\u0001\u00108\u001a\u0004\u0018\u0001072\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u0002092\b\b\u0001\u0010<\u001a\u00020\u000fH§@¢\u0006\u0004\b=\u0010!J&\u0010?\u001a\u00020\u001a2\b\b\u0001\u0010<\u001a\u00020\u000f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010>H§@¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u0002092\b\b\u0001\u0010B\u001a\u00020AH§@¢\u0006\u0004\bC\u0010DJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00020E0(2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\bF\u0010\tJ\"\u0010H\u001a\b\u0012\u0004\u0012\u00020G0(2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\bH\u0010\tJ\"\u0010J\u001a\b\u0012\u0004\u0012\u00020I0(2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\bJ\u0010\tJ\"\u0010L\u001a\b\u0012\u0004\u0012\u00020K0(2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\bL\u0010\tJ\u0010\u0010N\u001a\u00020MH§@¢\u0006\u0004\bN\u0010\u0004J\"\u0010P\u001a\b\u0012\u0004\u0012\u00020O0(2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\bP\u0010\tJ$\u0010T\u001a\u00020S2\b\b\u0001\u0010Q\u001a\u00020\u00052\b\b\u0001\u0010R\u001a\u000207H§@¢\u0006\u0004\bT\u0010UJ$\u0010X\u001a\u00020W2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010V\u001a\u00020\u0005H§@¢\u0006\u0004\bX\u0010\u001cJ\u001a\u0010Z\u001a\u00020Y2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\bZ\u0010!J(\u0010^\u001a\u00020]2\n\b\u0001\u0010[\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\\\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b^\u0010&J4\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0(2\u000e\b\u0001\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000f0_2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\bb\u0010cJ*\u0010g\u001a\b\u0012\u0004\u0012\u00020f0/2\b\b\u0001\u00103\u001a\u00020\u000f2\b\b\u0001\u0010e\u001a\u00020dH§@¢\u0006\u0004\bg\u0010hJ4\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010f0(2\u000e\b\u0001\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000f0_2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\bj\u0010cJ0\u0010n\u001a\u00020m2\b\b\u0001\u00103\u001a\u00020\u000f2\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010l\u001a\u00020\u0005H§@¢\u0006\u0004\bn\u0010oJB\u0010q\u001a\b\u0012\u0004\u0012\u00020m0(2\b\b\u0001\u0010p\u001a\u00020\u00052\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010l\u001a\u00020\u00052\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\bq\u0010rJ\u001a\u0010u\u001a\u00020t2\b\b\u0001\u0010s\u001a\u00020\u000fH§@¢\u0006\u0004\bu\u0010!J\"\u0010x\u001a\b\u0012\u0004\u0012\u00020w0(2\n\b\u0001\u0010v\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\bx\u0010\tJ\u001a\u0010z\u001a\u00020w2\b\b\u0001\u0010y\u001a\u00020\u0005H§@¢\u0006\u0004\bz\u0010\tJ \u0010|\u001a\b\u0012\u0004\u0012\u00020w0(2\b\b\u0001\u0010\u000b\u001a\u00020{H§@¢\u0006\u0004\b|\u0010}J<\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010/2\b\b\u0001\u0010y\u001a\u00020\u00052\n\b\u0001\u0010~\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u007f\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J*\u0010\u0086\u0001\u001a\u00030\u0085\u00012\b\b\u0001\u0010y\u001a\u00020\u00052\n\b\u0001\u0010\u0084\u0001\u001a\u00030\u0083\u0001H§@¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J5\u0010\u008b\u0001\u001a\u00030\u0085\u00012\b\b\u0001\u0010y\u001a\u00020\u00052\t\b\u0001\u0010\u0088\u0001\u001a\u00020\u00052\n\b\u0001\u0010\u008a\u0001\u001a\u00030\u0089\u0001H§@¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001d\u0010\u008e\u0001\u001a\u00030\u008d\u00012\b\b\u0001\u0010y\u001a\u00020\u0005H§@¢\u0006\u0005\b\u008e\u0001\u0010\tJ\u0013\u0010\u0090\u0001\u001a\u00030\u008f\u0001H§@¢\u0006\u0005\b\u0090\u0001\u0010\u0004J\u0013\u0010\u0092\u0001\u001a\u00030\u0091\u0001H§@¢\u0006\u0005\b\u0092\u0001\u0010\u0004J\u001e\u0010\u0094\u0001\u001a\u00020\u001a2\t\b\u0001\u0010\u000b\u001a\u00030\u0093\u0001H§@¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J%\u0010\u0097\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010(2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0005\b\u0097\u0001\u0010\tJ\u001e\u0010\u0099\u0001\u001a\u00030\u0096\u00012\t\b\u0001\u0010\u0098\u0001\u001a\u00020\u000fH§@¢\u0006\u0005\b\u0099\u0001\u0010!J)\u0010\u009b\u0001\u001a\u00030\u0096\u00012\t\b\u0001\u0010\u0098\u0001\u001a\u00020\u000f2\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u0005H§@¢\u0006\u0005\b\u009b\u0001\u0010\u001cJ\u001d\u0010\u009c\u0001\u001a\u00020\u001a2\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u0005H§@¢\u0006\u0005\b\u009c\u0001\u0010\tJ\u001e\u0010\u009e\u0001\u001a\u00020\u001a2\t\b\u0001\u0010\u000b\u001a\u00030\u009d\u0001H§@¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J?\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u00030¡\u00010(2\n\b\u0001\u00108\u001a\u0004\u0018\u0001072\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u00052\u000b\b\u0001\u0010 \u0001\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0006\b¢\u0001\u0010£\u0001¨\u0006¤\u0001"}, m3636d2 = {"Lcom/robinhood/api/retrofit/Brokeback;", "", "Lcom/robinhood/models/api/UserAdditionalInfo;", "getUserAdditionalInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "accountNumber", "Lcom/robinhood/models/api/ApiDayTrades;", "getRecentDayTrades", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiReceivedAchSettings$UpdateRequest;", "request", "Lcom/robinhood/models/api/ApiReceivedAchSettings;", "updateReceivedAchSettings", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiReceivedAchSettings$UpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "instrumentId", "Lcom/robinhood/models/api/ApiQuickTradeAmounts;", "getQuickTradeAmounts", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiBuyingPowerBreakdown;", "getBuyingPowerBreakdown", "Lcom/robinhood/models/api/Mfa;", "getMfa", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "phoneNumber", "", "requestSmsMfa", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mfaCode", "verifySmsMfa", "Lcom/robinhood/models/api/Mfa$EnableAppMfaResponse;", "requestAppMfa", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyAppMfa", "enrollmentToken", "Lcom/robinhood/models/api/Mfa$RecoverAppMfaResponse;", "recoverAppMfa", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paginationCursor", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiPosition;", "getPositions", "", "fetchTaxLotRelatedInfo", "getPosition", "(Ljava/lang/String;Ljava/util/UUID;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "getPositionWithHeaders", "Lcom/robinhood/models/api/LegacyApiAcatsTransfer;", "getLegacyAcatsTransfers", "id", "getLegacyAcatsTransfer", "acatsTransferId", "cancelLegacyAcatsTransfer", "j$/time/LocalDate", "updatedAt", "Lcom/robinhood/models/api/ApiOrder;", "getOrders", "(Lj$/time/LocalDate;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderId", "getOrder", "Lcom/robinhood/models/api/ApiCancelOrderRequest;", "cancelOrder", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiCancelOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/OrderRequest;", Card.Icon.ORDER, "postOrder", "(Lcom/robinhood/models/api/OrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiDividend;", "getDividends", "Lcom/robinhood/models/api/ApiMarginSubscriptionFee;", "getMarginSubscriptionFees", "Lcom/robinhood/models/api/ApiMarginInterestCharge;", "getMarginInterestCharges", "Lcom/robinhood/models/api/ApiLegacyStockLoanPayment;", "getLegacyStockLoanPayments", "Lcom/robinhood/models/subscription/api/MarginUpgradePlans;", "getMarginSubscriptionPlans", "Lcom/robinhood/models/subscription/api/ApiMarginSubscription;", "getCurrentMarginPlan", "mic", InquiryField.DateField.TYPE, "Lcom/robinhood/models/api/ApiMarketHours;", "getMarketHours", "(Ljava/lang/String;Lj$/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bounds", "Lcom/robinhood/shared/equities/models/instrumentdetails/api/ApiFundamental;", "getFundamental", "Lcom/robinhood/models/api/ApiPricebook;", "getPricebook", "instrumentPath", "range", "Lcom/robinhood/shared/equities/models/instrumentdetails/api/ApiEarnings;", "getEarnings", "Lcom/robinhood/models/CommaSeparatedList;", "ids", "Lcom/robinhood/directipo/models/api/ApiIpoQuote;", "getIpoQuotesByInstrumentIds", "(Lcom/robinhood/models/CommaSeparatedList;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/fee/MonetizationModel;", "routingGroup", "Lcom/robinhood/models/api/ApiCryptoQuote;", "fetchCryptoQuote", "(Ljava/util/UUID;Lcom/robinhood/models/api/fee/MonetizationModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commaSeparatedIds", "fetchCryptoQuotesV2", "interval", "span", "Lcom/robinhood/models/api/ApiCryptoHistorical;", "fetchCryptoHistoricals", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currencyPairIds", "fetchCryptoHistoricalsMulti", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currencyPairId", "Lcom/robinhood/models/api/ApiCryptoDescription;", "getCryptoDescription", "cursor", "Lcom/robinhood/models/api/ApiThread;", "getThreads", "threadId", "getThread", "Lcom/robinhood/models/api/ApiMarkThreadsAsReadRequest;", "markThreadsAsRead", "(Lcom/robinhood/models/api/ApiMarkThreadsAsReadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "beforeMessageId", "afterMessageId", "Lcom/robinhood/models/api/ApiMessageResult;", "getThreadMessages", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiSubmitMessageRequest;", "message", "Lcom/robinhood/models/api/ApiMessage;", "submitMessage", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiSubmitMessageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messageId", "Lcom/robinhood/models/api/ApiSubmitResponseRequest;", "response", "submitResponse", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/ApiSubmitResponseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "getThreadNotificationSettings", "Lcom/robinhood/models/api/ApiProfilePage;", "getProfilePage", "Lcom/robinhood/models/api/ApiProfile;", "getProfile", "Lcom/robinhood/models/api/ApiProfile$Request;", "updateProfile", "(Lcom/robinhood/models/api/ApiProfile$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiTrustedDevice;", "getTrustedDevices", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "getTrustedDevice", "build", "reportTrustedDevice", "removeAllOtherDevices", "Lcom/robinhood/models/api/AgreementAcceptRequest;", "acceptAgreement", "(Lcom/robinhood/models/api/AgreementAcceptRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instrumentIds", "Lcom/robinhood/models/api/ApiInstrumentSplitPayment;", "getInstrumentSplitPayments", "(Lj$/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Brokeback {
    @POST("user/agreements/accept/")
    Object acceptAgreement(@Body AgreementAcceptRequest agreementAcceptRequest, Continuation<? super Unit> continuation);

    @POST("acats/{acatsTransferId}/cancel/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object cancelLegacyAcatsTransfer(@Path("acatsTransferId") UUID uuid, Continuation<? super Unit> continuation);

    @POST("orders/{orderId}/cancel/")
    Object cancelOrder(@Path("orderId") UUID uuid, @Body ApiCancelOrderRequest apiCancelOrderRequest, Continuation<? super Unit> continuation);

    @GET("marketdata/forex/historicals/{id}/?bounds=24_7")
    @RequiresRegionGate(regionGates = {CryptoDetailRegionGate.class})
    Object fetchCryptoHistoricals(@Path("id") UUID uuid, @Query("interval") String str, @Query("span") String str2, Continuation<? super ApiCryptoHistorical> continuation);

    @GET("marketdata/forex/historicals/?bounds=24_7")
    @RequiresRegionGate(regionGates = {CryptoDetailRegionGate.class})
    Object fetchCryptoHistoricalsMulti(@Query("ids") String str, @Query("interval") String str2, @Query("span") String str3, @Query("cursor") String str4, Continuation<? super PaginatedResult<ApiCryptoHistorical>> continuation);

    @GET("marketdata/forex/quotes/{id}/")
    @RequiresRegionGate(regionGates = {CryptoDetailRegionGate.class})
    Object fetchCryptoQuote(@Path("id") UUID uuid, @Query("routing_group") MonetizationModel monetizationModel, Continuation<? super Response<ApiCryptoQuote>> continuation);

    @GET("marketdata/forex/quotes/")
    @RequiresRegionGate(regionGates = {CryptoDetailRegionGate.class})
    Object fetchCryptoQuotesV2(@Query("ids") CommaSeparatedList<UUID> commaSeparatedList, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiCryptoQuote>> continuation);

    @GET("accounts/{accountNumber}/buying_power_breakdown")
    Object getBuyingPowerBreakdown(@Path("accountNumber") String str, Continuation<? super ApiBuyingPowerBreakdown> continuation);

    @GET("marketdata/forex/fundamentals/{id}/")
    @RequiresRegionGate(regionGates = {CryptoDetailRegionGate.class})
    Object getCryptoDescription(@Path("id") UUID uuid, Continuation<? super ApiCryptoDescription> continuation);

    @GET("subscription/subscriptions/?active=true")
    @RequiresRegionGate(regionGates = {GoldRegionGate.class})
    Object getCurrentMarginPlan(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiMarginSubscription>> continuation);

    @GET("dividends/?default_to_all_accounts=true&include_managed=true")
    Object getDividends(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiDividend>> continuation);

    @GET("marketdata/earnings/")
    Object getEarnings(@Query("instrument") String str, @Query("range") String str2, Continuation<? super ApiEarning2> continuation);

    @GET("marketdata/fundamentals/{id}/?include_inactive=true")
    Object getFundamental(@Path("id") UUID uuid, @Query("bounds") String str, Continuation<? super ApiFundamental> continuation);

    @GET("corp_actions/v2/split_payments/?default_to_all_accounts=true")
    Object getInstrumentSplitPayments(@Query("updated_at[gte]") LocalDate localDate, @Query("cursor") String str, @Query("instrument_ids") String str2, Continuation<? super PaginatedResult<ApiInstrumentSplitPayment>> continuation);

    @GET("marketdata/ipo/?include_inactive=true")
    Object getIpoQuotesByInstrumentIds(@Query("ids") CommaSeparatedList<UUID> commaSeparatedList, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiIpoQuote>> continuation);

    @GET("acats/{acatsTransferId}/?direction=incoming")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getLegacyAcatsTransfer(@Path("acatsTransferId") UUID uuid, Continuation<? super LegacyApiAcatsTransfer> continuation);

    @GET("acats/?direction=incoming")
    @RequiresRegionGate(regionGates = {AcatsRegionGate.class})
    Object getLegacyAcatsTransfers(Continuation<? super PaginatedResult<LegacyApiAcatsTransfer>> continuation);

    @GET("stock_loan/payments/")
    Object getLegacyStockLoanPayments(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiLegacyStockLoanPayment>> continuation);

    @GET("cash_journal/margin_interest_charges/?default_to_all_accounts=true")
    Object getMarginInterestCharges(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiMarginInterestCharge>> continuation);

    @GET("subscription/subscription_fees/")
    @RequiresRegionGate(regionGates = {GoldRegionGate.class})
    Object getMarginSubscriptionFees(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiMarginSubscriptionFee>> continuation);

    @GET("subscription/plans/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {GoldRegionGate.class})
    Object getMarginSubscriptionPlans(Continuation<? super MarginUpgradePlans> continuation);

    @GET("markets/{mic}/hours/{date}/")
    Object getMarketHours(@Path("mic") String str, @Path(InquiryField.DateField.TYPE) LocalDate localDate, Continuation<? super ApiMarketHours> continuation);

    @GET("mfa/")
    Object getMfa(Continuation<? super Mfa> continuation);

    @GET("orders/{orderId}/")
    Object getOrder(@Path("orderId") UUID uuid, Continuation<? super ApiOrder> continuation);

    @GET("orders/?default_to_all_accounts=true&include_managed=true")
    Object getOrders(@Query("updated_at[gte]") LocalDate localDate, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiOrder>> continuation);

    @GET("positions/{accountNumber}/{instrumentId}/")
    Object getPosition(@Path("accountNumber") String str, @Path("instrumentId") UUID uuid, @Query("fetch_tax_lot_related_info") boolean z, Continuation<? super ApiPosition> continuation);

    @GET("positions/{accountNumber}/{instrumentId}/")
    Object getPositionWithHeaders(@Path("accountNumber") String str, @Path("instrumentId") UUID uuid, @Query("fetch_tax_lot_related_info") boolean z, Continuation<? super Response<ApiPosition>> continuation);

    @GET("positions/")
    Object getPositions(@Query("account_number") String str, @Query("cursor") String str2, Continuation<? super PaginatedResult<ApiPosition>> continuation);

    @GET("marketdata/pricebook/snapshots/{instrumentId}/")
    Object getPricebook(@Path("instrumentId") UUID uuid, Continuation<? super ApiPricebook> continuation);

    @GET("profile/user/")
    Object getProfile(Continuation<? super ApiProfile> continuation);

    @GET("profile/page/")
    Object getProfilePage(Continuation<? super ApiProfilePage> continuation);

    @GET("accounts/quick_trade_amounts/{accountNumber}/{instrumentId}/")
    Object getQuickTradeAmounts(@Path("accountNumber") String str, @Path("instrumentId") UUID uuid, Continuation<? super ApiQuickTradeAmounts> continuation);

    @GET("accounts/{accountNumber}/recent_day_trades/")
    Object getRecentDayTrades(@Path("accountNumber") String str, Continuation<? super ApiDayTrades> continuation);

    @GET("inbox/threads/{threadId}/")
    Object getThread(@Path("threadId") String str, Continuation<? super ApiThread> continuation);

    @GET("inbox/threads/{threadId}/messages/")
    Object getThreadMessages(@Path("threadId") String str, @Query("before") String str2, @Query("after") String str3, Continuation<? super Response<ApiMessageResult>> continuation);

    @GET("inbox/settings/thread/{threadId}/")
    Object getThreadNotificationSettings(@Path("threadId") String str, Continuation<? super ApiNotificationThreadSettingsItem> continuation);

    @GET("inbox/threads_v2/")
    Object getThreads(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiThread>> continuation);

    @GET("devices/{id}/")
    Object getTrustedDevice(@Path("id") UUID uuid, Continuation<? super ApiTrustedDevice> continuation);

    @GET("devices/")
    Object getTrustedDevices(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiTrustedDevice>> continuation);

    @GET("user/additional_info/")
    Object getUserAdditionalInfo(Continuation<? super UserAdditionalInfo> continuation);

    @POST("inbox/threads/read/")
    Object markThreadsAsRead(@Body ApiMarkThreadsAsReadRequest apiMarkThreadsAsReadRequest, Continuation<? super PaginatedResult<ApiThread>> continuation);

    @POST("orders/")
    Object postOrder(@Body OrderRequest orderRequest, Continuation<? super ApiOrder> continuation);

    @FormUrlEncoded
    @Headers({"X-Dont-Intercept-For-OAuth: 1", "X-Omit-Auth-Header: 1"})
    @PUT("mfa/app/recovery/")
    Object recoverAppMfa(@Field("mfa_code") String str, @Field("enrollment_token") String str2, Continuation<? super Mfa.RecoverAppMfaResponse> continuation);

    @FormUrlEncoded
    @POST("devices/remove_all_other/")
    Object removeAllOtherDevices(@Field("build") String str, Continuation<? super Unit> continuation);

    @FormUrlEncoded
    @POST("devices/{id}/report/")
    Object reportTrustedDevice(@Path("id") UUID uuid, @Field("build") String str, Continuation<? super ApiTrustedDevice> continuation);

    @PUT("mfa/app/request/")
    Object requestAppMfa(@Header(com.robinhood.utils.http.Headers.CHALLENGE_RESPONSE_ID) UUID uuid, Continuation<? super Mfa.EnableAppMfaResponse> continuation);

    @FormUrlEncoded
    @PUT("mfa/sms/request/")
    Object requestSmsMfa(@Header(com.robinhood.utils.http.Headers.CHALLENGE_RESPONSE_ID) UUID uuid, @Field(Constants4.ENTITY_FIELD_PHONE_NUMBER) String str, Continuation<? super Unit> continuation);

    @POST("inbox/threads/{threadId}/messages/")
    Object submitMessage(@Path("threadId") String str, @Body ApiSubmitMessageRequest apiSubmitMessageRequest, Continuation<? super ApiMessage> continuation);

    @POST("inbox/threads/{threadId}/messages/{messageId}/")
    Object submitResponse(@Path("threadId") String str, @Path("messageId") String str2, @Body ApiSubmitResponseRequest apiSubmitResponseRequest, Continuation<? super ApiMessage> continuation);

    @PATCH("profile/user/")
    Object updateProfile(@Body ApiProfile.Request request, Continuation<? super Unit> continuation);

    @PATCH("accounts/{accountNumber}/received_ach_settings/")
    Object updateReceivedAchSettings(@Path("accountNumber") String str, @Body ApiReceivedAchSettings.UpdateRequest updateRequest, Continuation<? super ApiReceivedAchSettings> continuation);

    @FormUrlEncoded
    @PUT("mfa/app/verify/")
    Object verifyAppMfa(@Header(com.robinhood.utils.http.Headers.CHALLENGE_RESPONSE_ID) UUID uuid, @Field("mfa_code") String str, Continuation<? super Mfa> continuation);

    @FormUrlEncoded
    @PUT("mfa/sms/verify/")
    Object verifySmsMfa(@Header(com.robinhood.utils.http.Headers.CHALLENGE_RESPONSE_ID) UUID uuid, @Field("mfa_code") String str, Continuation<? super Mfa> continuation);

    /* compiled from: Brokeback.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getPosition$default(Brokeback brokeback, String str, UUID uuid, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPosition");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return brokeback.getPosition(str, uuid, z, continuation);
        }

        public static /* synthetic */ Object getPositionWithHeaders$default(Brokeback brokeback, String str, UUID uuid, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPositionWithHeaders");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return brokeback.getPositionWithHeaders(str, uuid, z, continuation);
        }
    }
}
