package com.robinhood.android.api.transfers;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.bonfire.ApiConfirmTransferResponse;
import com.robinhood.models.api.bonfire.ApiCreateQueuedDepositRequest;
import com.robinhood.models.api.bonfire.ApiCreateQueuedDepositResponse;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import com.robinhood.models.api.bonfire.ApiIraContributionQuestionnaire;
import com.robinhood.models.api.bonfire.ApiIraDistributionQuestionnaire;
import com.robinhood.models.api.bonfire.ApiPaycheckModuleResponse;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.api.bonfire.ApiRecurringIraContributionInfo;
import com.robinhood.models.api.bonfire.ApiSkipAchDepositScheduleRequest;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccountsResponse;
import com.robinhood.models.api.bonfire.PlaidLinkResult;
import com.robinhood.models.api.bonfire.ValidateContributionTypeRequest;
import com.robinhood.models.api.bonfire.ValidateContributionTypeResponse;
import com.robinhood.models.api.bonfire.instantinfo.ApiPostDepositInstantInfoResponse;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransferIraInfo;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferResponse;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.api.bonfire.transfer.ApiSuggestedAmountsResponse;
import com.robinhood.models.api.bonfire.transfer.ApiThirdPartyWireDocumentRequestIdResponse;
import com.robinhood.models.api.bonfire.transfer.ApiTransferAction;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubBulkResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.api.bonfire.transfer.limitsv1.details.ApiLimitsHubDetailsResponse;
import com.robinhood.models.api.bonfire.transfer.rewarddetail.ApiTransferRewardDetailResponse;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireDetails;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireValidationRequest;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireDetailsResponse;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableCashOverview;
import com.robinhood.models.api.cashier.RhAccountType;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.transfers.api.ApiPaymentTransfer;
import com.robinhood.transfers.api.ApiPaymentTransferUpdateResponse;
import com.robinhood.transfers.api.SduiResponse;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.transfers.api.accounts.DDBrokerageRoutingDetailsResponse;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import okhttp3.ResponseBody;
import p479j$.time.LocalDate;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: TransfersBonfireApi.kt */
@Metadata(m3635d1 = {"\u0000¤\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\"\u001a\u00020!2\u0010\b\u0003\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0010\b\u0001\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001cH§@¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H§@¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H§@¢\u0006\u0004\b(\u0010&JV\u00104\u001a\u0002032\b\b\u0001\u0010*\u001a\u00020)2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\r2\n\b\u0003\u00100\u001a\u0004\u0018\u00010/2\n\b\u0003\u00102\u001a\u0004\u0018\u000101H§@¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\b\u0001\u0010\u0014\u001a\u000206H§@¢\u0006\u0004\b8\u00109J*\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u001c2\b\b\u0001\u0010:\u001a\u00020\u00022\b\b\u0001\u0010<\u001a\u00020;H§@¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020A2\b\b\u0001\u0010:\u001a\u00020@H§@¢\u0006\u0004\bB\u0010CJ:\u0010I\u001a\b\u0012\u0004\u0012\u00020A0H2\n\b\u0003\u0010E\u001a\u0004\u0018\u00010D2\n\b\u0003\u0010F\u001a\u0004\u0018\u0001012\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bI\u0010JJ$\u0010L\u001a\u00020A2\b\b\u0001\u0010:\u001a\u00020@2\b\b\u0001\u0010\u0014\u001a\u00020KH§@¢\u0006\u0004\bL\u0010MJ\u001a\u0010N\u001a\u00020\u00162\b\b\u0001\u0010:\u001a\u00020@H§@¢\u0006\u0004\bN\u0010CJ\u001a\u0010P\u001a\u00020O2\b\b\u0001\u0010:\u001a\u00020@H§@¢\u0006\u0004\bP\u0010CJ\u001a\u0010R\u001a\u00020Q2\b\b\u0001\u0010:\u001a\u00020@H§@¢\u0006\u0004\bR\u0010CJ\u001a\u0010S\u001a\u00020Q2\b\b\u0001\u0010:\u001a\u00020@H§@¢\u0006\u0004\bS\u0010CJ\u001a\u0010T\u001a\u00020Q2\b\b\u0001\u0010:\u001a\u00020@H§@¢\u0006\u0004\bT\u0010CJ\u001a\u0010W\u001a\u00020V2\b\b\u0001\u0010\u0014\u001a\u00020UH§@¢\u0006\u0004\bW\u0010XJ$\u0010[\u001a\u00020\u00162\b\b\u0001\u0010Y\u001a\u00020\u00022\b\b\u0001\u0010Z\u001a\u00020\u0002H§@¢\u0006\u0004\b[\u0010\\J \u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u00152\b\b\u0001\u0010\u0014\u001a\u00020]H§@¢\u0006\u0004\b_\u0010`J\u001a\u0010b\u001a\u00020\u00162\b\b\u0001\u0010\b\u001a\u00020aH§@¢\u0006\u0004\bb\u0010cJ \u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u00152\b\b\u0001\u0010\u0014\u001a\u00020UH§@¢\u0006\u0004\be\u0010XJ*\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u00152\b\b\u0001\u0010:\u001a\u00020\u00022\b\b\u0001\u00102\u001a\u000201H§@¢\u0006\u0004\bg\u0010hJ2\u0010m\u001a\u00020l2\b\b\u0003\u0010i\u001a\u00020\u000e2\n\b\u0003\u0010k\u001a\u0004\u0018\u00010j2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010+H§@¢\u0006\u0004\bm\u0010nJ7\u0010p\u001a\b\u0012\u0004\u0012\u00020l0o2\b\b\u0003\u0010i\u001a\u00020\u000e2\n\b\u0003\u0010k\u001a\u0004\u0018\u00010j2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010+H'¢\u0006\u0004\bp\u0010qJ\u0010\u0010s\u001a\u00020rH§@¢\u0006\u0004\bs\u0010&J\u001c\u0010v\u001a\u00020u2\n\b\u0003\u0010t\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0004\bv\u0010wJ&\u0010z\u001a\u00020y2\b\b\u0001\u0010\b\u001a\u00020\r2\n\b\u0003\u0010x\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bz\u0010{J\u001a\u0010}\u001a\u00020|2\b\b\u0001\u0010:\u001a\u00020@H§@¢\u0006\u0004\b}\u0010CJ\u001d\u0010\u0080\u0001\u001a\u00020\u007f2\b\b\u0001\u0010\u0014\u001a\u00020~H§@¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001e\u0010\u0084\u0001\u001a\u00030\u0083\u00012\t\b\u0001\u0010\u0082\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0084\u0001\u0010\u0006J(\u0010\u0087\u0001\u001a\u00030\u0086\u00012\t\b\u0001\u0010\u0085\u0001\u001a\u00020\u00022\b\b\u0001\u0010:\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0087\u0001\u0010\\J\u0013\u0010\u0089\u0001\u001a\u00030\u0088\u0001H§@¢\u0006\u0005\b\u0089\u0001\u0010&J>\u0010\u008b\u0001\u001a\u00030\u008a\u00012\b\b\u0001\u00100\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\r2\b\b\u0001\u0010.\u001a\u00020\r2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010+H§@¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J6\u0010\u008e\u0001\u001a\u00030\u008d\u00012\b\b\u0001\u0010,\u001a\u00020+2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J \u0010\u0092\u0001\u001a\u00030\u0091\u00012\u000b\b\u0003\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0005\b\u0092\u0001\u0010\u0006J\u0013\u0010\u0094\u0001\u001a\u00030\u0093\u0001H§@¢\u0006\u0005\b\u0094\u0001\u0010&J\u0013\u0010\u0096\u0001\u001a\u00030\u0095\u0001H§@¢\u0006\u0005\b\u0096\u0001\u0010&J\u0013\u0010\u0098\u0001\u001a\u00030\u0097\u0001H§@¢\u0006\u0005\b\u0098\u0001\u0010&J\u001f\u0010\u009b\u0001\u001a\u00030\u009a\u00012\t\b\u0001\u0010\u0014\u001a\u00030\u0099\u0001H§@¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J'\u0010\u009d\u0001\u001a\u00030\u009a\u00012\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009d\u0001\u0010\\J\u001d\u0010\u009f\u0001\u001a\u00030\u009e\u00012\b\b\u0001\u0010\u0014\u001a\u00020UH§@¢\u0006\u0005\b\u009f\u0001\u0010XJ\u0013\u0010¡\u0001\u001a\u00030 \u0001H§@¢\u0006\u0005\b¡\u0001\u0010&¨\u0006¢\u0001"}, m3636d2 = {"Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "", "", "id", "Lcom/robinhood/models/api/ApiAutomaticDeposit;", "pauseAchDepositSchedule", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/entity/RhEntity;", "accountType", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsResponse;", "getWireDetails", "(Lcom/robinhood/models/entity/RhEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountId", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "", "removeRoutingAndAccount", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireDetails;", "getOutgoingWireDetails", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireValidationRequest;", "request", "Lretrofit2/Response;", "", "validateOutgoingWire", "(Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireValidationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/ApiSkipAchDepositScheduleRequest;", "skipAchDepositSchedule", "(Lcom/robinhood/models/api/bonfire/ApiSkipAchDepositScheduleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/robinhood/models/db/TransferDirection;", "directions", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "productTypes", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubBulkResponse;", "getTransferLimitsV1", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/details/ApiLimitsHubDetailsResponse;", "getLimitsHubDetails", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/withdrawablecash/ApiWithdrawableCashOverview;", "getWithdrawableCashOverview", "Lcom/robinhood/android/api/transfers/DisclosureLocation;", "location", "Lcom/robinhood/transfers/api/TransferType;", "transferType", "sourceAccountType", "sinkAccountType", "Ljava/math/BigDecimal;", "amount", "", "entryPoint", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "getDisclosure", "(Lcom/robinhood/android/api/transfers/DisclosureLocation;Lcom/robinhood/transfers/api/TransferType;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Ljava/math/BigDecimal;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryResponse;", "postTransferSummary", "(Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferId", "Lcom/robinhood/models/api/bonfire/PlaidLinkResult;", "plaidLinkResult", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage;", "getPostTransferPageByTransferId", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/PlaidLinkResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "Lcom/robinhood/transfers/api/ApiPaymentTransfer;", "getPaymentTransfer", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j$/time/LocalDate", "updateAtGte", "pageSize", "cursor", "Lcom/robinhood/models/PaginatedResult;", "getPaymentTransfers", "(Lj$/time/LocalDate;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferAction;", "postPaymentTransferAction", "(Ljava/util/UUID;Lcom/robinhood/models/api/bonfire/transfer/ApiTransferAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "abortPaymentTransfer", "Lcom/robinhood/transfers/api/ApiPaymentTransferUpdateResponse;", "cancelPaymentTransfer", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransferIraInfo;", "getPaymentTransferContributionInfo", "getPaymentTransferDistributionInfo", "getPaymentTransferRothConversionInfo", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "Lcom/robinhood/models/api/bonfire/transfer/ApiPreCreateTransferResponse;", "getPreCreateTransferContent", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentInstrumentType", "paymentInstrumentId", "unlinkPaymentInstrument", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/ApiCreateQueuedDepositRequest;", "Lcom/robinhood/models/api/bonfire/ApiCreateQueuedDepositResponse;", "createQueuedDeposit", "(Lcom/robinhood/models/api/bonfire/ApiCreateQueuedDepositRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/cashier/RhAccountType;", "getQueuedDeposit", "(Lcom/robinhood/models/api/cashier/RhAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "createTransfer", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage$DynamicPostTransferTimeline;", "getTransferTimeline", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasRhsApplicationPending", "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "recipientType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccountsResponse;", "getTransferAccounts", "(ZLcom/robinhood/models/api/bonfire/wires/RecipientType;Lcom/robinhood/transfers/api/TransferType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/Single;", "getTransferAccountsSingle", "(ZLcom/robinhood/models/api/bonfire/wires/RecipientType;Lcom/robinhood/transfers/api/TransferType;)Lio/reactivex/Single;", "Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;", "getTransferBanners", "allowNoAccounts", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire;", "getIraContributionQuestionnaire", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferAccountAccountId", "Lcom/robinhood/models/api/bonfire/ApiIraDistributionQuestionnaire;", "getIraDistributionQuestionnaire", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/ApiConfirmTransferResponse;", "confirmTransfer", "Lcom/robinhood/models/api/bonfire/ValidateContributionTypeRequest;", "Lcom/robinhood/models/api/bonfire/ValidateContributionTypeResponse;", "validateContributionType", "(Lcom/robinhood/models/api/bonfire/ValidateContributionTypeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "achDepositScheduleId", "Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;", "getRecurringIraContributionInfo", "accountNumber", "Lcom/robinhood/models/api/bonfire/instantinfo/ApiPostDepositInstantInfoResponse;", "getPostDepositInstantInfo", "Lcom/robinhood/models/api/bonfire/ApiPaycheckModuleResponse;", "getPaycheckModule", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "getServiceFee", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/transfers/api/TransferType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "getServiceFeeParams", "(Lcom/robinhood/transfers/api/TransferType;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "guidedTransfersVariant", "Lcom/robinhood/models/api/bonfire/transfer/ApiSuggestedAmountsResponse;", "getSuggestedAmounts", "Lcom/robinhood/transfers/api/accounts/DDBrokerageRoutingDetailsResponse;", "getRoutingDetails", "Lcom/robinhood/transfers/api/SduiResponse;", "getQueuedDepositLearnMore", "Lokhttp3/ResponseBody;", "getDynamicPillAmounts", "Lcom/robinhood/models/api/bonfire/ApiEarlyPayEnrollment$Request;", "Lcom/robinhood/models/api/bonfire/ApiEarlyPayEnrollment;", "updateEarlyPayEnrollment", "(Lcom/robinhood/models/api/bonfire/ApiEarlyPayEnrollment$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEarlyPayEnrollment", "Lcom/robinhood/models/api/bonfire/transfer/rewarddetail/ApiTransferRewardDetailResponse;", "getTransferRewardDetails", "Lcom/robinhood/models/api/bonfire/transfer/ApiThirdPartyWireDocumentRequestIdResponse;", "getThirdPartyWireDocumentRequestId", "lib-api-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface TransfersBonfireApi {
    @POST("paymenthub/unified_transfers/{transferId}/abort/")
    Object abortPaymentTransfer(@Path("transferId") UUID uuid, Continuation<? super Unit> continuation);

    @POST("paymenthub/unified_transfers/{transferId}/cancel/")
    Object cancelPaymentTransfer(@Path("transferId") UUID uuid, Continuation<? super ApiPaymentTransferUpdateResponse> continuation);

    @POST("transfer/{transferId}/confirm/")
    Object confirmTransfer(@Path("transferId") UUID uuid, Continuation<? super ApiConfirmTransferResponse> continuation);

    @POST("payment_instruments/queued_deposit/")
    Object createQueuedDeposit(@Body ApiCreateQueuedDepositRequest apiCreateQueuedDepositRequest, Continuation<? super Response<ApiCreateQueuedDepositResponse>> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 40", "X-Write-Timeout-Seconds-Override: 40"})
    @POST("transfer/create/")
    Object createTransfer(@Body ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super Response<ApiCreateTransferResponse>> continuation);

    @GET("transfer/disclosures/")
    @JvmSuppressWildcards
    Object getDisclosure(@Query("location") DisclosureLocation disclosureLocation, @Query("transfer_type") TransferType transferType, @Query("source_account_type") ApiTransferAccount.TransferAccountType transferAccountType, @Query("sink_account_type") ApiTransferAccount.TransferAccountType transferAccountType2, @Query("amount") BigDecimal bigDecimal, @Query("entry_point") Integer num, Continuation<ApiDisclosureUIResponse> continuation);

    @GET("transfer/dynamic_suggested_amounts")
    Object getDynamicPillAmounts(Continuation<? super ResponseBody> continuation);

    @GET("early_pay/enrollment/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getEarlyPayEnrollment(@Query("account_id") String str, @Query(InstantCashConstants.ACCOUNT_TYPE_KEY) String str2, Continuation<? super ApiEarlyPayEnrollment> continuation);

    @GET("transfer/ira_contributions_questionnaire/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getIraContributionQuestionnaire(@Query("allow_no_accounts") Boolean bool, Continuation<? super ApiIraContributionQuestionnaire> continuation);

    @GET("transfer/ira_distributions_questionnaire/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getIraDistributionQuestionnaire(@Query(InstantCashConstants.ACCOUNT_TYPE_KEY) ApiTransferAccount.TransferAccountType transferAccountType, @Query("transfer_account_account_id") String str, Continuation<? super ApiIraDistributionQuestionnaire> continuation);

    @GET("limitshub/details")
    Object getLimitsHubDetails(Continuation<? super ApiLimitsHubDetailsResponse> continuation);

    @GET("wires/outgoing_wire/details/")
    Object getOutgoingWireDetails(@Query("account_id") String str, @Query(InstantCashConstants.ACCOUNT_TYPE_KEY) ApiTransferAccount.TransferAccountType transferAccountType, @Query("remove_routing_and_account") boolean z, Continuation<? super ApiOutgoingWireDetails> continuation);

    @GET("transfer/paycheck_module/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getPaycheckModule(Continuation<? super ApiPaycheckModuleResponse> continuation);

    @GET("paymenthub/unified_transfers/{transferId}")
    Object getPaymentTransfer(@Path("transferId") UUID uuid, Continuation<? super ApiPaymentTransfer> continuation);

    @GET("paymenthub/transfers/{transfer_id}/contribution/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getPaymentTransferContributionInfo(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) UUID uuid, Continuation<? super ApiRhyTransferIraInfo> continuation);

    @GET("paymenthub/transfers/{transfer_id}/distribution/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getPaymentTransferDistributionInfo(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) UUID uuid, Continuation<? super ApiRhyTransferIraInfo> continuation);

    @GET("paymenthub/transfers/{transfer_id}/roth_conversion/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getPaymentTransferRothConversionInfo(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) UUID uuid, Continuation<? super ApiRhyTransferIraInfo> continuation);

    @GET("paymenthub/unified_transfers/")
    Object getPaymentTransfers(@Query("updated_at_gte") LocalDate localDate, @Query("page_size") Integer num, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiPaymentTransfer>> continuation);

    @GET("accounts/{accountNumber}/post_deposit_instant_info/{transferId}/")
    Object getPostDepositInstantInfo(@Path("accountNumber") String str, @Path("transferId") String str2, Continuation<? super ApiPostDepositInstantInfoResponse> continuation);

    @GET("money_movement/transfer/post_transfer_pages/{transferId}")
    Object getPostTransferPageByTransferId(@Path("transferId") String str, @Query("plaid_link_result") PlaidLinkResult plaidLinkResult, Continuation<? super List<? extends ApiPostTransferPage>> continuation);

    @POST("transfer/pre_create/")
    Object getPreCreateTransferContent(@Body ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super ApiPreCreateTransferResponse> continuation);

    @GET("payment_instruments/queued_deposit/{accountType}")
    Object getQueuedDeposit(@Path("accountType") RhAccountType rhAccountType, Continuation<? super Unit> continuation);

    @GET("queued_deposit/learn_more")
    Object getQueuedDepositLearnMore(Continuation<? super SduiResponse> continuation);

    @GET("transfer/recurring_deposits/{achDepositScheduleId}/contribution/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRecurringIraContributionInfo(@Path("achDepositScheduleId") String str, Continuation<? super ApiRecurringIraContributionInfo> continuation);

    @GET("transfer/accounts/routing_detail_page")
    Object getRoutingDetails(Continuation<? super DDBrokerageRoutingDetailsResponse> continuation);

    @GET("transfer/service_fee")
    Object getServiceFee(@Query("amount") String str, @Query("source_account_type") ApiTransferAccount.TransferAccountType transferAccountType, @Query("sink_account_type") ApiTransferAccount.TransferAccountType transferAccountType2, @Query("transfer_type") TransferType transferType, Continuation<? super ApiServiceFeeResponse> continuation);

    @GET("transfer/service_fee_params")
    Object getServiceFeeParams(@Query("transfer_type") TransferType transferType, @Query("source_account_type") ApiTransferAccount.TransferAccountType transferAccountType, @Query("sink_account_type") ApiTransferAccount.TransferAccountType transferAccountType2, Continuation<? super ApiServiceFeeParams> continuation);

    @GET("transfer/suggested_amounts/")
    Object getSuggestedAmounts(@Query("guided_transfers_variant") String str, Continuation<? super ApiSuggestedAmountsResponse> continuation);

    @GET("money_movement/transfer/third_party_wire_document_request_id/")
    Object getThirdPartyWireDocumentRequestId(Continuation<? super ApiThirdPartyWireDocumentRequestIdResponse> continuation);

    @GET("transfer/accounts/")
    Object getTransferAccounts(@Query("has_rhs_application_pending") boolean z, @Query("recipient_type") RecipientType recipientType, @Query("transfer_type") TransferType transferType, Continuation<? super ApiTransferAccountsResponse> continuation);

    @GET("transfer/accounts/")
    Single<ApiTransferAccountsResponse> getTransferAccountsSingle(@Query("has_rhs_application_pending") boolean hasRhsApplicationPending, @Query("recipient_type") RecipientType recipientType, @Query("transfer_type") TransferType transferType);

    @GET("transfer/accounts/banners")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getTransferBanners(Continuation<? super ApiTransferBanners> continuation);

    @GET("limitshub/v1/limits/")
    @JvmSuppressWildcards
    Object getTransferLimitsV1(@Query("directions") List<TransferDirection> list, @Query("product_types") List<TransferProductType> list2, Continuation<ApiLimitsHubBulkResponse> continuation);

    @POST("incentives/transfer/get-reward-details/")
    Object getTransferRewardDetails(@Body ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super ApiTransferRewardDetailResponse> continuation);

    @GET("transfer/{transferId}/timeline/")
    Object getTransferTimeline(@Path("transferId") String str, @Query("entry_point") int i, Continuation<? super Response<ApiPostTransferPage.DynamicPostTransferTimeline>> continuation);

    @GET("wires/van/details")
    Object getWireDetails(@Query(InstantCashConstants.ACCOUNT_TYPE_KEY) RhEntity rhEntity, Continuation<? super ApiWireDetailsResponse> continuation);

    @GET("withdrawable_cash/overview/")
    Object getWithdrawableCashOverview(Continuation<? super ApiWithdrawableCashOverview> continuation);

    @PATCH("ach/deposit_schedules/pause")
    Object pauseAchDepositSchedule(@Query("id") String str, Continuation<? super ApiAutomaticDeposit> continuation);

    @POST("paymenthub/unified_transfers/{transferId}/action/")
    Object postPaymentTransferAction(@Path("transferId") UUID uuid, @Body ApiTransferAction apiTransferAction, Continuation<? super ApiPaymentTransfer> continuation);

    @POST("transfer/summary/")
    @JvmSuppressWildcards
    Object postTransferSummary(@Body ApiTransferSummaryRequest apiTransferSummaryRequest, Continuation<ApiTransferSummaryResponse> continuation);

    @PUT("ach/deposit_schedules/skip/")
    Object skipAchDepositSchedule(@Body ApiSkipAchDepositScheduleRequest apiSkipAchDepositScheduleRequest, Continuation<? super Response<ApiAutomaticDeposit>> continuation);

    @POST("payment_instruments/{payment_instrument_type}/{payment_instrument_id}/unlink")
    Object unlinkPaymentInstrument(@Path("payment_instrument_type") String str, @Path("payment_instrument_id") String str2, Continuation<? super Unit> continuation);

    @POST("early_pay/enrollment/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object updateEarlyPayEnrollment(@Body ApiEarlyPayEnrollment.Request request, Continuation<? super ApiEarlyPayEnrollment> continuation);

    @POST("transfer/validate/contribution_type/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object validateContributionType(@Body ValidateContributionTypeRequest validateContributionTypeRequest, Continuation<? super ValidateContributionTypeResponse> continuation);

    @POST("wires/outgoing_wire/details/validate")
    Object validateOutgoingWire(@Body ApiOutgoingWireValidationRequest apiOutgoingWireValidationRequest, Continuation<? super Response<Unit>> continuation);

    /* compiled from: TransfersBonfireApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getOutgoingWireDetails$default(TransfersBonfireApi transfersBonfireApi, String str, ApiTransferAccount.TransferAccountType transferAccountType, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOutgoingWireDetails");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return transfersBonfireApi.getOutgoingWireDetails(str, transferAccountType, z, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getTransferLimitsV1$default(TransfersBonfireApi transfersBonfireApi, List list, List list2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransferLimitsV1");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return transfersBonfireApi.getTransferLimitsV1(list, list2, continuation);
        }

        public static /* synthetic */ Object getDisclosure$default(TransfersBonfireApi transfersBonfireApi, DisclosureLocation disclosureLocation, TransferType transferType, ApiTransferAccount.TransferAccountType transferAccountType, ApiTransferAccount.TransferAccountType transferAccountType2, BigDecimal bigDecimal, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDisclosure");
            }
            if ((i & 2) != 0) {
                transferType = null;
            }
            if ((i & 4) != 0) {
                transferAccountType = null;
            }
            if ((i & 8) != 0) {
                transferAccountType2 = null;
            }
            if ((i & 16) != 0) {
                bigDecimal = null;
            }
            if ((i & 32) != 0) {
                num = null;
            }
            return transfersBonfireApi.getDisclosure(disclosureLocation, transferType, transferAccountType, transferAccountType2, bigDecimal, num, continuation);
        }

        public static /* synthetic */ Object getPaymentTransfers$default(TransfersBonfireApi transfersBonfireApi, LocalDate localDate, Integer num, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPaymentTransfers");
            }
            if ((i & 1) != 0) {
                localDate = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return transfersBonfireApi.getPaymentTransfers(localDate, num, str, continuation);
        }

        public static /* synthetic */ Object getTransferAccounts$default(TransfersBonfireApi transfersBonfireApi, boolean z, RecipientType recipientType, TransferType transferType, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransferAccounts");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                recipientType = null;
            }
            if ((i & 4) != 0) {
                transferType = null;
            }
            return transfersBonfireApi.getTransferAccounts(z, recipientType, transferType, continuation);
        }

        public static /* synthetic */ Single getTransferAccountsSingle$default(TransfersBonfireApi transfersBonfireApi, boolean z, RecipientType recipientType, TransferType transferType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransferAccountsSingle");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                recipientType = null;
            }
            if ((i & 4) != 0) {
                transferType = null;
            }
            return transfersBonfireApi.getTransferAccountsSingle(z, recipientType, transferType);
        }

        public static /* synthetic */ Object getIraContributionQuestionnaire$default(TransfersBonfireApi transfersBonfireApi, Boolean bool, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIraContributionQuestionnaire");
            }
            if ((i & 1) != 0) {
                bool = null;
            }
            return transfersBonfireApi.getIraContributionQuestionnaire(bool, continuation);
        }

        public static /* synthetic */ Object getIraDistributionQuestionnaire$default(TransfersBonfireApi transfersBonfireApi, ApiTransferAccount.TransferAccountType transferAccountType, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIraDistributionQuestionnaire");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return transfersBonfireApi.getIraDistributionQuestionnaire(transferAccountType, str, continuation);
        }

        public static /* synthetic */ Object getServiceFee$default(TransfersBonfireApi transfersBonfireApi, String str, ApiTransferAccount.TransferAccountType transferAccountType, ApiTransferAccount.TransferAccountType transferAccountType2, TransferType transferType, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getServiceFee");
            }
            if ((i & 8) != 0) {
                transferType = null;
            }
            return transfersBonfireApi.getServiceFee(str, transferAccountType, transferAccountType2, transferType, continuation);
        }

        public static /* synthetic */ Object getServiceFeeParams$default(TransfersBonfireApi transfersBonfireApi, TransferType transferType, ApiTransferAccount.TransferAccountType transferAccountType, ApiTransferAccount.TransferAccountType transferAccountType2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getServiceFeeParams");
            }
            if ((i & 2) != 0) {
                transferAccountType = null;
            }
            if ((i & 4) != 0) {
                transferAccountType2 = null;
            }
            return transfersBonfireApi.getServiceFeeParams(transferType, transferAccountType, transferAccountType2, continuation);
        }

        public static /* synthetic */ Object getSuggestedAmounts$default(TransfersBonfireApi transfersBonfireApi, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSuggestedAmounts");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return transfersBonfireApi.getSuggestedAmounts(str, continuation);
        }
    }
}
