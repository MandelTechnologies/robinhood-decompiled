package bonfire.proto.idl.windsor.p041v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.regiongate.StocksAndSharesIsaRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rosetta.account.BrokerageAccountTypeDto;
import windsor.transactions.p552v1.TransactionTypeDto;

/* compiled from: WindsorServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JP\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\f\u0010\rJP\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0016\u0010\u0017J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/WindsorServiceRetrofit;", "", "", "", "headers", "account_number", "Lrosetta/account/BrokerageAccountTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lwindsor/transactions/v1/TransactionTypeDto;", "transaction_type", "Lretrofit2/Response;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2ResponseDto;", "GetContributionAllowanceV2", "(Ljava/util/Map;Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lwindsor/transactions/v1/TransactionTypeDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "cursor", "Lbonfire/proto/idl/windsor/v1/GetTransfersResponseDto;", "GetTransfers", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "Lbonfire/proto/idl/windsor/v1/GetTransferDetailResponseDto;", "GetTransferDetail", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/windsor/v1/CancelTransferRequestDto;", CarResultComposable2.BODY, "CancelTransfer", "(Ljava/util/Map;Lbonfire/proto/idl/windsor/v1/CancelTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface WindsorServiceRetrofit {
    @POST("rad/windsor/transfer/cancel")
    @RequiresRegionGate(logIfNotInRegionGate = false, regionGates = {StocksAndSharesIsaRegionGate.class})
    Object CancelTransfer(@HeaderMap Map<String, String> map, @Body CancelTransferRequestDto cancelTransferRequestDto, Continuation<Response<Object>> continuation);

    @GET("rad/windsor/allowance")
    @RequiresRegionGate(logIfNotInRegionGate = false, regionGates = {StocksAndSharesIsaRegionGate.class})
    Object GetContributionAllowanceV2(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, @Query("accountType") BrokerageAccountTypeDto brokerageAccountTypeDto, @Query("transactionType") TransactionTypeDto transactionTypeDto, Continuation<Response<GetContributionAllowanceV2ResponseDto>> continuation);

    @GET("rad/windsor/transfer")
    @RequiresRegionGate(logIfNotInRegionGate = false, regionGates = {StocksAndSharesIsaRegionGate.class})
    Object GetTransferDetail(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("transferId") String str, Continuation<Response<GetTransferDetailResponseDto>> continuation);

    @GET("rad/windsor/transfers")
    @RequiresRegionGate(logIfNotInRegionGate = false, regionGates = {StocksAndSharesIsaRegionGate.class})
    Object GetTransfers(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, @IdlField(protoType = "int32") @Query("limit") Integer num, @IdlField(protoType = "string") @Query("cursor") String str2, Continuation<Response<GetTransfersResponseDto>> continuation);
}
