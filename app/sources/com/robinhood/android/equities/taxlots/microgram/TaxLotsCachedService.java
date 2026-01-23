package com.robinhood.android.equities.taxlots.microgram;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.job.CachedJobManager7;
import equity_trading_tax_lots.proto.p460v1.AvailableSelectionStrategyOption;
import equity_trading_tax_lots.proto.p460v1.EditSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.RequestNextPageInTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.SelectionAction;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.SetSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.SetTaxLotsSelectionMethodResponse;
import equity_trading_tax_lots.proto.p460v1.StreamSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotInformationResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategyResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategySummaryResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryResponse;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatus;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.contracts.equity_order_context.proto.p487v1.EquityOrderContextService;

/* compiled from: TaxLotsCachedService.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JJ\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H&J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH&J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\nH&J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0013H&J4\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH¦@¢\u0006\u0002\u0010!J&\u0010\"\u001a\u00020#2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0002\u0010$J<\u0010%\u001a\u00020&2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010'\u001a\u00020(H¦@¢\u0006\u0002\u0010)J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001fH¦@¢\u0006\u0002\u0010,J&\u0010-\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0002\u0010$J4\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u00100\u001a\u000201H¦@¢\u0006\u0002\u00102J,\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0002\u0010$J8\u00105\u001a\u0002062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u0002082\b\u00100\u001a\u0004\u0018\u000101H¦@¢\u0006\u0002\u00109R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "equityOrderContextService", "Lmicrogram/contracts/equity_order_context/proto/v1/EquityOrderContextService;", "getEquityOrderContextService", "()Lmicrogram/contracts/equity_order_context/proto/v1/EquityOrderContextService;", "streamTaxLots", "Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponse;", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "sortDirection", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "taxLotStatus", "Lequity_trading_tax_lots/proto/v1/TaxLotStatus;", "streamSelectedTaxLots", "Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse;", "streamTaxLotInformation", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponse;", "lotId", "streamTaxLotSummary", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;", "lotStatus", "setSelectedTaxLots", "Lequity_trading_tax_lots/proto/v1/SetSelectedTaxLotsResponse;", "selectedTaxLots", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestNextPage", "Lequity_trading_tax_lots/proto/v1/RequestNextPageInTaxLotsResponse;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editSelectedTaxLots", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponse;", "action", "Lequity_trading_tax_lots/proto/v1/SelectionAction;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/List;Lequity_trading_tax_lots/proto/v1/SelectionAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSelectionStrategyOptions", "Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSelectedTaxLots", "streamTaxLotsSelectionStrategySummary", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryResponse;", "quantity", "Ljava/math/BigDecimal;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamTaxLotsSelectionStrategy", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategyResponse;", "setTaxLotsSelectionMethod", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponse;", "selectionStrategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface TaxLotsCachedService extends CachedJobManager7 {
    Object clearSelectedTaxLots(String str, UUID uuid, UUID uuid2, Continuation<? super SetSelectedTaxLotsResponse> continuation);

    Object editSelectedTaxLots(String str, UUID uuid, UUID uuid2, List<TaxLotSelection> list, SelectionAction selectionAction, Continuation<? super EditSelectedTaxLotsResponse> continuation);

    EquityOrderContextService getEquityOrderContextService();

    Object getSelectionStrategyOptions(Continuation<? super List<AvailableSelectionStrategyOption>> continuation);

    Object requestNextPage(String str, UUID uuid, UUID uuid2, Continuation<? super RequestNextPageInTaxLotsResponse> continuation);

    Object setSelectedTaxLots(String str, UUID uuid, UUID uuid2, List<TaxLotSelection> list, Continuation<? super SetSelectedTaxLotsResponse> continuation);

    Object setTaxLotsSelectionMethod(String str, UUID uuid, UUID uuid2, SelectionStrategy selectionStrategy, BigDecimal bigDecimal, Continuation<? super SetTaxLotsSelectionMethodResponse> continuation);

    Flow<StreamSelectedTaxLotsResponse> streamSelectedTaxLots(String accountNumber, UUID orderId, UUID instrumentId);

    Flow<StreamTaxLotInformationResponse> streamTaxLotInformation(String accountNumber, UUID orderId, UUID instrumentId, String lotId);

    Flow<StreamTaxLotsSummaryResponse> streamTaxLotSummary(String accountNumber, UUID orderId, UUID instrumentId, TaxLotStatus lotStatus);

    Flow<StreamTaxLotsResponse> streamTaxLots(String accountNumber, UUID orderId, UUID instrumentId, TaxLotSort sort, TaxLotSortDirection sortDirection, TaxLotStatus taxLotStatus);

    Object streamTaxLotsSelectionStrategy(String str, UUID uuid, UUID uuid2, Continuation<? super Flow<StreamTaxLotsSelectionStrategyResponse>> continuation);

    Object streamTaxLotsSelectionStrategySummary(String str, UUID uuid, UUID uuid2, BigDecimal bigDecimal, Continuation<? super Flow<StreamTaxLotsSelectionStrategySummaryResponse>> continuation);

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Flow streamTaxLots$default(TaxLotsCachedService taxLotsCachedService, String str, UUID uuid, UUID uuid2, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, TaxLotStatus taxLotStatus, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamTaxLots");
            }
            if ((i & 8) != 0) {
                taxLotSort = null;
            }
            if ((i & 16) != 0) {
                taxLotSortDirection = null;
            }
            if ((i & 32) != 0) {
                taxLotStatus = TaxLotStatus.OPEN;
            }
            return taxLotsCachedService.streamTaxLots(str, uuid, uuid2, taxLotSort, taxLotSortDirection, taxLotStatus);
        }
    }
}
