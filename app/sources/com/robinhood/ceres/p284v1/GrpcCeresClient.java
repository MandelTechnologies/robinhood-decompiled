package com.robinhood.ceres.p284v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcCeresClient.kt */
@Metadata(m3635d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0007H\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0007H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0007H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0007H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0007H\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0007H\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u0007H\u0016J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0\u0007H\u0016J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u0007H\u0016J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u0007H\u0016J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u0007H\u0016J\u0014\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000\u0007H\u0016J\u0014\u00101\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030\u0007H\u0016J\u0014\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002060\u0007H\u0016J\u0014\u00107\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u0002090\u0007H\u0016J\u0014\u0010:\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0\u0007H\u0016J\u0014\u0010=\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0\u0007H\u0016J\u0014\u0010@\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0\u0007H\u0016J\u0014\u0010C\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0\u0007H\u0016J\u0014\u0010F\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0\u0007H\u0016J\u0014\u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020J0\u0007H\u0016J\u0014\u0010K\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020M0\u0007H\u0016J\u0014\u0010N\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020P0\u0007H\u0016J\u0014\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020S0\u0007H\u0016J\u0014\u0010T\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0\u0007H\u0016J\u0014\u0010W\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020Y0\u0007H\u0016J\u0014\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0\u0007H\u0016J\u0014\u0010]\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010_\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a0\u0007H\u0016J\u0014\u0010b\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0\u0007H\u0016J\u0014\u0010e\u001a\u000e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020g0\u0007H\u0016J\u0014\u0010h\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020j0\u0007H\u0016J\u0014\u0010k\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020m0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GrpcCeresClient;", "Lcom/robinhood/ceres/v1/CeresClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "CreateFuturesOrder", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequest;", "Lcom/robinhood/ceres/v1/FuturesOrder;", "CreateEventContractOrder", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequest;", "CreateFuturesAccount", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequest;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponse;", "CheckAccountFuturesEligibility", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityRequest;", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityResponse;", "GetCheckpointSuitability", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequest;", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityResponse;", "EvaluateCheckpointSuitability", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityRequest;", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityResponse;", "GetAgreementType", "Lcom/robinhood/ceres/v1/GetAgreementTypeRequest;", "Lcom/robinhood/ceres/v1/GetAgreementTypeResponse;", "GetPresubmitOrderValidation", "Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationRequest;", "Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationResponse;", "GetOrderByAccountIDAndOrderID", "Lcom/robinhood/ceres/v1/GetOrderByIDRequest;", "GetOrderByID", "GetOrdersByAccountID", "Lcom/robinhood/ceres/v1/GetOrdersRequest;", "Lcom/robinhood/ceres/v1/GetOrdersResponse;", "GetCashSettlementExecutionByID", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionByIDRequest;", "Lcom/robinhood/ceres/v1/FuturesExecution;", "GetCashSettlementExecutions", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequest;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsResponse;", "GetOrders", "CancelFuturesOrder", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequest;", "Lcom/robinhood/ceres/v1/CancelFuturesOrderResponse;", "CancelEventContractOrder", "Lcom/robinhood/ceres/v1/CancelEventContractOrderRequest;", "Lcom/robinhood/ceres/v1/CancelEventContractOrderResponse;", "GetAccounts", "Lcom/robinhood/ceres/v1/GetAccountsRequest;", "Lcom/robinhood/ceres/v1/GetAccountsResponse;", "GetCurrentCashBalance", "Lcom/robinhood/ceres/v1/GetCurrentCashBalanceRequest;", "Lcom/robinhood/ceres/v1/CashBalance;", "GetCurrentPositions", "Lcom/robinhood/ceres/v1/GetCurrentPositionsRequest;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsResponse;", "GetCurrentPositionsByContractID", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDRequest;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDResponse;", "GetCurrentAggregatedPositions", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequest;", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsResponse;", "GetContractQuantities", "Lcom/robinhood/ceres/v1/GetContractQuantitiesRequest;", "Lcom/robinhood/ceres/v1/GetContractQuantitiesResponse;", "CreatePositionSellout", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequest;", "Lcom/robinhood/ceres/v1/CreatePositionSelloutResponse;", "GetPnL", "Lcom/robinhood/ceres/v1/GetPnLRequest;", "Lcom/robinhood/ceres/v1/PnL;", "GetPnLCostBasis", "Lcom/robinhood/ceres/v1/PnLCostBasis;", "GetBuyingPowerEffect", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectRequest;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponse;", "GetFeesForTentativeOrder", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderRequest;", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponse;", "ValidateOrder", "Lcom/robinhood/ceres/v1/ValidateOrderRequest;", "Lcom/robinhood/ceres/v1/ValidateOrderResponse;", "GetRealizedPnlForOrders", "Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersRequest;", "Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersResponse;", "GetEventContractRealizedPnlByContract", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractRequest;", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractResponse;", "FlattenPositions", "Lcom/robinhood/ceres/v1/FlattenPositionsRequest;", "Lcom/robinhood/ceres/v1/FlattenPositionsResponse;", "ReplaceFuturesOrder", "Lcom/robinhood/ceres/v1/ReplaceFuturesOrderRequest;", "ListManualCashCorrections", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsRequest;", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsResponse;", "MarkAttestationsSigned", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequest;", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedResponse;", "GetUserSettings", "Lcom/robinhood/ceres/v1/GetUserSettingsRequest;", "Lcom/robinhood/ceres/v1/GetUserSettingsResponse;", "UpdateUserSettings", "Lcom/robinhood/ceres/v1/UpdateUserSettingsRequest;", "Lcom/robinhood/ceres/v1/UpdateUserSettingsResponse;", "GetFuturesIntervalPerformance", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceRequest;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponse;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcCeresClient implements CeresClient {
    private final GrpcClient client;

    public GrpcCeresClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<CreateFuturesOrderRequest, FuturesOrder> CreateFuturesOrder() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/CreateFuturesOrder", CreateFuturesOrderRequest.ADAPTER, FuturesOrder.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<CreateEventContractOrderRequest, FuturesOrder> CreateEventContractOrder() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/CreateEventContractOrder", CreateEventContractOrderRequest.ADAPTER, FuturesOrder.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<CreateFuturesAccountRequest, CreateFuturesAccountResponse> CreateFuturesAccount() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/CreateFuturesAccount", CreateFuturesAccountRequest.ADAPTER, CreateFuturesAccountResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<CheckAccountFuturesEligibilityRequest, CheckAccountFuturesEligibilityResponse> CheckAccountFuturesEligibility() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/CheckAccountFuturesEligibility", CheckAccountFuturesEligibilityRequest.ADAPTER, CheckAccountFuturesEligibilityResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetCheckpointSuitabilityRequest, GetCheckpointSuitabilityResponse> GetCheckpointSuitability() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetCheckpointSuitability", GetCheckpointSuitabilityRequest.ADAPTER, GetCheckpointSuitabilityResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<EvaluateCheckpointSuitabilityRequest, EvaluateCheckpointSuitabilityResponse> EvaluateCheckpointSuitability() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/EvaluateCheckpointSuitability", EvaluateCheckpointSuitabilityRequest.ADAPTER, EvaluateCheckpointSuitabilityResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetAgreementTypeRequest, GetAgreementTypeResponse> GetAgreementType() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetAgreementType", GetAgreementTypeRequest.ADAPTER, GetAgreementTypeResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetPresubmitOrderValidationRequest, GetPresubmitOrderValidationResponse> GetPresubmitOrderValidation() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetPresubmitOrderValidation", GetPresubmitOrderValidationRequest.ADAPTER, GetPresubmitOrderValidationResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetOrderByIDRequest, FuturesOrder> GetOrderByAccountIDAndOrderID() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetOrderByAccountIDAndOrderID", GetOrderByIDRequest.ADAPTER, FuturesOrder.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetOrderByIDRequest, FuturesOrder> GetOrderByID() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetOrderByID", GetOrderByIDRequest.ADAPTER, FuturesOrder.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetOrdersRequest, GetOrdersResponse> GetOrdersByAccountID() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetOrdersByAccountID", GetOrdersRequest.ADAPTER, GetOrdersResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetCashSettlementExecutionByIDRequest, FuturesExecution> GetCashSettlementExecutionByID() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetCashSettlementExecutionByID", GetCashSettlementExecutionByIDRequest.ADAPTER, FuturesExecution.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetCashSettlementExecutionsRequest, GetCashSettlementExecutionsResponse> GetCashSettlementExecutions() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetCashSettlementExecutions", GetCashSettlementExecutionsRequest.ADAPTER, GetCashSettlementExecutionsResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetOrdersRequest, GetOrdersResponse> GetOrders() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetOrders", GetOrdersRequest.ADAPTER, GetOrdersResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<CancelFuturesOrderRequest, CancelFuturesOrderResponse> CancelFuturesOrder() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/CancelFuturesOrder", CancelFuturesOrderRequest.ADAPTER, CancelFuturesOrderResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<CancelEventContractOrderRequest, CancelEventContractOrderResponse> CancelEventContractOrder() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/CancelEventContractOrder", CancelEventContractOrderRequest.ADAPTER, CancelEventContractOrderResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetAccountsRequest, GetAccountsResponse> GetAccounts() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetAccounts", GetAccountsRequest.ADAPTER, GetAccountsResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetCurrentCashBalanceRequest, CashBalance> GetCurrentCashBalance() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetCurrentCashBalance", GetCurrentCashBalanceRequest.ADAPTER, CashBalance.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetCurrentPositionsRequest, GetCurrentPositionsResponse> GetCurrentPositions() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetCurrentPositions", GetCurrentPositionsRequest.ADAPTER, GetCurrentPositionsResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetCurrentPositionsByContractIDRequest, GetCurrentPositionsByContractIDResponse> GetCurrentPositionsByContractID() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetCurrentPositionsByContractID", GetCurrentPositionsByContractIDRequest.ADAPTER, GetCurrentPositionsByContractIDResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetCurrentAggregatedPositionsRequest, GetCurrentAggregatedPositionsResponse> GetCurrentAggregatedPositions() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetCurrentAggregatedPositions", GetCurrentAggregatedPositionsRequest.ADAPTER, GetCurrentAggregatedPositionsResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetContractQuantitiesRequest, GetContractQuantitiesResponse> GetContractQuantities() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetContractQuantities", GetContractQuantitiesRequest.ADAPTER, GetContractQuantitiesResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<CreatePositionSelloutRequest, CreatePositionSelloutResponse> CreatePositionSellout() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/CreatePositionSellout", CreatePositionSelloutRequest.ADAPTER, CreatePositionSelloutResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetPnLRequest, PnL> GetPnL() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetPnL", GetPnLRequest.ADAPTER, PnL.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetPnLRequest, PnLCostBasis> GetPnLCostBasis() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetPnLCostBasis", GetPnLRequest.ADAPTER, PnLCostBasis.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetBuyingPowerEffectRequest, GetBuyingPowerEffectResponse> GetBuyingPowerEffect() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetBuyingPowerEffect", GetBuyingPowerEffectRequest.ADAPTER, GetBuyingPowerEffectResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetFeesForTentativeOrderRequest, GetFeesForTentativeOrderResponse> GetFeesForTentativeOrder() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetFeesForTentativeOrder", GetFeesForTentativeOrderRequest.ADAPTER, GetFeesForTentativeOrderResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<ValidateOrderRequest, ValidateOrderResponse> ValidateOrder() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/ValidateOrder", ValidateOrderRequest.ADAPTER, ValidateOrderResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetRealizedPnlForOrdersRequest, GetRealizedPnlForOrdersResponse> GetRealizedPnlForOrders() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetRealizedPnlForOrders", GetRealizedPnlForOrdersRequest.ADAPTER, GetRealizedPnlForOrdersResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetEventContractRealizedPnlByContractRequest, GetEventContractRealizedPnlByContractResponse> GetEventContractRealizedPnlByContract() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetEventContractRealizedPnlByContract", GetEventContractRealizedPnlByContractRequest.ADAPTER, GetEventContractRealizedPnlByContractResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<FlattenPositionsRequest, FlattenPositionsResponse> FlattenPositions() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/FlattenPositions", FlattenPositionsRequest.ADAPTER, FlattenPositionsResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<ReplaceFuturesOrderRequest, FuturesOrder> ReplaceFuturesOrder() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/ReplaceFuturesOrder", ReplaceFuturesOrderRequest.ADAPTER, FuturesOrder.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<ListManualCashCorrectionsRequest, ListManualCashCorrectionsResponse> ListManualCashCorrections() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/ListManualCashCorrections", ListManualCashCorrectionsRequest.ADAPTER, ListManualCashCorrectionsResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<MarkAttestationsSignedRequest, MarkAttestationsSignedResponse> MarkAttestationsSigned() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/MarkAttestationsSigned", MarkAttestationsSignedRequest.ADAPTER, MarkAttestationsSignedResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetUserSettingsRequest, GetUserSettingsResponse> GetUserSettings() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetUserSettings", GetUserSettingsRequest.ADAPTER, GetUserSettingsResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<UpdateUserSettingsRequest, UpdateUserSettingsResponse> UpdateUserSettings() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/UpdateUserSettings", UpdateUserSettingsRequest.ADAPTER, UpdateUserSettingsResponse.ADAPTER));
    }

    @Override // com.robinhood.ceres.p284v1.CeresClient
    public GrpcCall<GetFuturesIntervalPerformanceRequest, GetFuturesIntervalPerformanceResponse> GetFuturesIntervalPerformance() {
        return this.client.newCall(new GrpcMethod("/ceres.service.Ceres/GetFuturesIntervalPerformance", GetFuturesIntervalPerformanceRequest.ADAPTER, GetFuturesIntervalPerformanceResponse.ADAPTER));
    }
}
