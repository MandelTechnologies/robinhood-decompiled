package com.robinhood.ceres.p284v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: CeresClient.kt */
@Metadata(m3635d1 = {"\u0000à\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003H&J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0003H&J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0003H&J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0003H&J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0003H&J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0003H&J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u0003H&J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0003H&J\u0014\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u0003H&J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u0003H&J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u0003H&J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u0003H&J\u0014\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\u0003H&J\u0014\u00100\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002020\u0003H&J\u0014\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050\u0003H&J\u0014\u00106\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002080\u0003H&J\u0014\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0\u0003H&J\u0014\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0\u0003H&J\u0014\u0010?\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0\u0003H&J\u0014\u0010B\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0\u0003H&J\u0014\u0010E\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020F0\u0003H&J\u0014\u0010G\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0\u0003H&J\u0014\u0010J\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020L0\u0003H&J\u0014\u0010M\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020O0\u0003H&J\u0014\u0010P\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0\u0003H&J\u0014\u0010S\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020U0\u0003H&J\u0014\u0010V\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020X0\u0003H&J\u0014\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020]0\u0003H&J\u0014\u0010^\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`0\u0003H&J\u0014\u0010a\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0\u0003H&J\u0014\u0010d\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020f0\u0003H&J\u0014\u0010g\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020i0\u0003H&¨\u0006j"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CeresClient;", "Lcom/squareup/wire/Service;", "CreateFuturesOrder", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequest;", "Lcom/robinhood/ceres/v1/FuturesOrder;", "CreateEventContractOrder", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequest;", "CreateFuturesAccount", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequest;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponse;", "CheckAccountFuturesEligibility", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityRequest;", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityResponse;", "GetCheckpointSuitability", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequest;", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityResponse;", "EvaluateCheckpointSuitability", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityRequest;", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityResponse;", "GetAgreementType", "Lcom/robinhood/ceres/v1/GetAgreementTypeRequest;", "Lcom/robinhood/ceres/v1/GetAgreementTypeResponse;", "GetPresubmitOrderValidation", "Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationRequest;", "Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationResponse;", "GetOrderByAccountIDAndOrderID", "Lcom/robinhood/ceres/v1/GetOrderByIDRequest;", "GetOrderByID", "GetOrdersByAccountID", "Lcom/robinhood/ceres/v1/GetOrdersRequest;", "Lcom/robinhood/ceres/v1/GetOrdersResponse;", "GetCashSettlementExecutionByID", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionByIDRequest;", "Lcom/robinhood/ceres/v1/FuturesExecution;", "GetCashSettlementExecutions", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequest;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsResponse;", "GetOrders", "CancelFuturesOrder", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequest;", "Lcom/robinhood/ceres/v1/CancelFuturesOrderResponse;", "CancelEventContractOrder", "Lcom/robinhood/ceres/v1/CancelEventContractOrderRequest;", "Lcom/robinhood/ceres/v1/CancelEventContractOrderResponse;", "GetAccounts", "Lcom/robinhood/ceres/v1/GetAccountsRequest;", "Lcom/robinhood/ceres/v1/GetAccountsResponse;", "GetCurrentCashBalance", "Lcom/robinhood/ceres/v1/GetCurrentCashBalanceRequest;", "Lcom/robinhood/ceres/v1/CashBalance;", "GetCurrentPositions", "Lcom/robinhood/ceres/v1/GetCurrentPositionsRequest;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsResponse;", "GetCurrentPositionsByContractID", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDRequest;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDResponse;", "GetCurrentAggregatedPositions", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequest;", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsResponse;", "GetContractQuantities", "Lcom/robinhood/ceres/v1/GetContractQuantitiesRequest;", "Lcom/robinhood/ceres/v1/GetContractQuantitiesResponse;", "CreatePositionSellout", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequest;", "Lcom/robinhood/ceres/v1/CreatePositionSelloutResponse;", "GetPnL", "Lcom/robinhood/ceres/v1/GetPnLRequest;", "Lcom/robinhood/ceres/v1/PnL;", "GetPnLCostBasis", "Lcom/robinhood/ceres/v1/PnLCostBasis;", "GetBuyingPowerEffect", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectRequest;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponse;", "GetFeesForTentativeOrder", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderRequest;", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponse;", "ValidateOrder", "Lcom/robinhood/ceres/v1/ValidateOrderRequest;", "Lcom/robinhood/ceres/v1/ValidateOrderResponse;", "GetRealizedPnlForOrders", "Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersRequest;", "Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersResponse;", "GetEventContractRealizedPnlByContract", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractRequest;", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractResponse;", "FlattenPositions", "Lcom/robinhood/ceres/v1/FlattenPositionsRequest;", "Lcom/robinhood/ceres/v1/FlattenPositionsResponse;", "ReplaceFuturesOrder", "Lcom/robinhood/ceres/v1/ReplaceFuturesOrderRequest;", "ListManualCashCorrections", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsRequest;", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsResponse;", "MarkAttestationsSigned", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequest;", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedResponse;", "GetUserSettings", "Lcom/robinhood/ceres/v1/GetUserSettingsRequest;", "Lcom/robinhood/ceres/v1/GetUserSettingsResponse;", "UpdateUserSettings", "Lcom/robinhood/ceres/v1/UpdateUserSettingsRequest;", "Lcom/robinhood/ceres/v1/UpdateUserSettingsResponse;", "GetFuturesIntervalPerformance", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceRequest;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponse;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface CeresClient extends Service {
    GrpcCall<CancelEventContractOrderRequest, CancelEventContractOrderResponse> CancelEventContractOrder();

    GrpcCall<CancelFuturesOrderRequest, CancelFuturesOrderResponse> CancelFuturesOrder();

    GrpcCall<CheckAccountFuturesEligibilityRequest, CheckAccountFuturesEligibilityResponse> CheckAccountFuturesEligibility();

    GrpcCall<CreateEventContractOrderRequest, FuturesOrder> CreateEventContractOrder();

    GrpcCall<CreateFuturesAccountRequest, CreateFuturesAccountResponse> CreateFuturesAccount();

    GrpcCall<CreateFuturesOrderRequest, FuturesOrder> CreateFuturesOrder();

    GrpcCall<CreatePositionSelloutRequest, CreatePositionSelloutResponse> CreatePositionSellout();

    GrpcCall<EvaluateCheckpointSuitabilityRequest, EvaluateCheckpointSuitabilityResponse> EvaluateCheckpointSuitability();

    GrpcCall<FlattenPositionsRequest, FlattenPositionsResponse> FlattenPositions();

    GrpcCall<GetAccountsRequest, GetAccountsResponse> GetAccounts();

    GrpcCall<GetAgreementTypeRequest, GetAgreementTypeResponse> GetAgreementType();

    GrpcCall<GetBuyingPowerEffectRequest, GetBuyingPowerEffectResponse> GetBuyingPowerEffect();

    GrpcCall<GetCashSettlementExecutionByIDRequest, FuturesExecution> GetCashSettlementExecutionByID();

    GrpcCall<GetCashSettlementExecutionsRequest, GetCashSettlementExecutionsResponse> GetCashSettlementExecutions();

    GrpcCall<GetCheckpointSuitabilityRequest, GetCheckpointSuitabilityResponse> GetCheckpointSuitability();

    GrpcCall<GetContractQuantitiesRequest, GetContractQuantitiesResponse> GetContractQuantities();

    GrpcCall<GetCurrentAggregatedPositionsRequest, GetCurrentAggregatedPositionsResponse> GetCurrentAggregatedPositions();

    GrpcCall<GetCurrentCashBalanceRequest, CashBalance> GetCurrentCashBalance();

    GrpcCall<GetCurrentPositionsRequest, GetCurrentPositionsResponse> GetCurrentPositions();

    GrpcCall<GetCurrentPositionsByContractIDRequest, GetCurrentPositionsByContractIDResponse> GetCurrentPositionsByContractID();

    GrpcCall<GetEventContractRealizedPnlByContractRequest, GetEventContractRealizedPnlByContractResponse> GetEventContractRealizedPnlByContract();

    GrpcCall<GetFeesForTentativeOrderRequest, GetFeesForTentativeOrderResponse> GetFeesForTentativeOrder();

    GrpcCall<GetFuturesIntervalPerformanceRequest, GetFuturesIntervalPerformanceResponse> GetFuturesIntervalPerformance();

    GrpcCall<GetOrderByIDRequest, FuturesOrder> GetOrderByAccountIDAndOrderID();

    GrpcCall<GetOrderByIDRequest, FuturesOrder> GetOrderByID();

    GrpcCall<GetOrdersRequest, GetOrdersResponse> GetOrders();

    GrpcCall<GetOrdersRequest, GetOrdersResponse> GetOrdersByAccountID();

    GrpcCall<GetPnLRequest, PnL> GetPnL();

    GrpcCall<GetPnLRequest, PnLCostBasis> GetPnLCostBasis();

    GrpcCall<GetPresubmitOrderValidationRequest, GetPresubmitOrderValidationResponse> GetPresubmitOrderValidation();

    GrpcCall<GetRealizedPnlForOrdersRequest, GetRealizedPnlForOrdersResponse> GetRealizedPnlForOrders();

    GrpcCall<GetUserSettingsRequest, GetUserSettingsResponse> GetUserSettings();

    GrpcCall<ListManualCashCorrectionsRequest, ListManualCashCorrectionsResponse> ListManualCashCorrections();

    GrpcCall<MarkAttestationsSignedRequest, MarkAttestationsSignedResponse> MarkAttestationsSigned();

    GrpcCall<ReplaceFuturesOrderRequest, FuturesOrder> ReplaceFuturesOrder();

    GrpcCall<UpdateUserSettingsRequest, UpdateUserSettingsResponse> UpdateUserSettings();

    GrpcCall<ValidateOrderRequest, ValidateOrderResponse> ValidateOrder();
}
