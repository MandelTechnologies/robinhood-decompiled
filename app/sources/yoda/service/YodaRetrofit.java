package yoda.service;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Query;
import yoda.service.dashboard.GetFutureReturnsResponseDto;
import yoda.service.dashboard.ListAdvisorTradesResponseDto;
import yoda.service.insight.GetChildrenAccountInsightsRequest;
import yoda.service.insight.UpdateAccountInsightAsReadRequest;
import yoda.service.portfolio.ApproveModelPortfolioGroupRequest;
import yoda.service.portfolio.SubmitModelPortfolioGroupForApprovalRequest;
import yoda.service.withdrawal.GetAccountTransferSummaryResponseDto;

/* compiled from: YodaRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\b\u0010\tJ8\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u000b\u0010\tJ8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\r\u0010\t¨\u0006\u0012"}, m3636d2 = {"Lyoda/service/YodaRetrofit;", "", "", "", "headers", "account_number", "Lretrofit2/Response;", "Lyoda/service/withdrawal/GetAccountTransferSummaryResponseDto;", "GetAccountTransferSummary", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyoda/service/dashboard/ListAdvisorTradesResponseDto;", "ListAdvisorTrades", "Lyoda/service/dashboard/GetFutureReturnsResponseDto;", "GetFutureReturns", "ApproveModelPortfolioGroupBodyTransformer", "SubmitModelPortfolioGroupForApprovalBodyTransformer", "UpdateAccountInsightAsReadBodyTransformer", "GetChildrenAccountInsightsBodyTransformer", "yoda.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes28.dex */
public interface YodaRetrofit {
    @GET("yoda/v1/account_transfer_summary")
    Object GetAccountTransferSummary(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, Continuation<Response<GetAccountTransferSummaryResponseDto>> continuation);

    @GET("yoda/v1/future_returns")
    Object GetFutureReturns(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, Continuation<Response<GetFutureReturnsResponseDto>> continuation);

    @GET("yoda/v1/list_advisor_trades")
    Object ListAdvisorTrades(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, Continuation<Response<ListAdvisorTradesResponseDto>> continuation);

    /* compiled from: YodaRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lyoda/service/YodaRetrofit$ApproveModelPortfolioGroupBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lyoda/service/portfolio/ApproveModelPortfolioGroupRequest;", "<init>", "()V", "apply", "value", "yoda.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApproveModelPortfolioGroupBodyTransformer implements UnaryOperator<ApproveModelPortfolioGroupRequest> {
        public static final ApproveModelPortfolioGroupBodyTransformer INSTANCE = new ApproveModelPortfolioGroupBodyTransformer();

        private ApproveModelPortfolioGroupBodyTransformer() {
        }

        @Override // java.util.function.Function
        public ApproveModelPortfolioGroupRequest apply(ApproveModelPortfolioGroupRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return ApproveModelPortfolioGroupRequest.copy$default(value, "", null, false, null, 14, null);
        }
    }

    /* compiled from: YodaRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lyoda/service/YodaRetrofit$SubmitModelPortfolioGroupForApprovalBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lyoda/service/portfolio/SubmitModelPortfolioGroupForApprovalRequest;", "<init>", "()V", "apply", "value", "yoda.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SubmitModelPortfolioGroupForApprovalBodyTransformer implements UnaryOperator<SubmitModelPortfolioGroupForApprovalRequest> {
        public static final SubmitModelPortfolioGroupForApprovalBodyTransformer INSTANCE = new SubmitModelPortfolioGroupForApprovalBodyTransformer();

        private SubmitModelPortfolioGroupForApprovalBodyTransformer() {
        }

        @Override // java.util.function.Function
        public SubmitModelPortfolioGroupForApprovalRequest apply(SubmitModelPortfolioGroupForApprovalRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return SubmitModelPortfolioGroupForApprovalRequest.copy$default(value, "", null, null, 6, null);
        }
    }

    /* compiled from: YodaRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lyoda/service/YodaRetrofit$UpdateAccountInsightAsReadBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lyoda/service/insight/UpdateAccountInsightAsReadRequest;", "<init>", "()V", "apply", "value", "yoda.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateAccountInsightAsReadBodyTransformer implements UnaryOperator<UpdateAccountInsightAsReadRequest> {
        public static final UpdateAccountInsightAsReadBodyTransformer INSTANCE = new UpdateAccountInsightAsReadBodyTransformer();

        private UpdateAccountInsightAsReadBodyTransformer() {
        }

        @Override // java.util.function.Function
        public UpdateAccountInsightAsReadRequest apply(UpdateAccountInsightAsReadRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return UpdateAccountInsightAsReadRequest.copy$default(value, "", null, null, 6, null);
        }
    }

    /* compiled from: YodaRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lyoda/service/YodaRetrofit$GetChildrenAccountInsightsBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lyoda/service/insight/GetChildrenAccountInsightsRequest;", "<init>", "()V", "apply", "value", "yoda.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetChildrenAccountInsightsBodyTransformer implements UnaryOperator<GetChildrenAccountInsightsRequest> {
        public static final GetChildrenAccountInsightsBodyTransformer INSTANCE = new GetChildrenAccountInsightsBodyTransformer();

        private GetChildrenAccountInsightsBodyTransformer() {
        }

        @Override // java.util.function.Function
        public GetChildrenAccountInsightsRequest apply(GetChildrenAccountInsightsRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return GetChildrenAccountInsightsRequest.copy$default(value, "", null, null, 6, null);
        }
    }
}
