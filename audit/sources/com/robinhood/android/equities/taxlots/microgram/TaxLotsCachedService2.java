package com.robinhood.android.equities.taxlots.microgram;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.job.CachedJobManager5;
import com.robinhood.coroutines.job.CachedJobManager7;
import com.robinhood.idl.IdlDecimal2;
import equity_trading_tax_lots.proto.p460v1.AvailableSelectionStrategyOption;
import equity_trading_tax_lots.proto.p460v1.EditSelectedTaxLotsRequestDto;
import equity_trading_tax_lots.proto.p460v1.EditSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.EditSelectedTaxLotsResponseDto;
import equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService;
import equity_trading_tax_lots.proto.p460v1.GetAvailableSelectionStrategyOptionsRequestDto;
import equity_trading_tax_lots.proto.p460v1.GetAvailableSelectionStrategyOptionsResponseDto;
import equity_trading_tax_lots.proto.p460v1.RequestNextPageInTaxLotsRequestDto;
import equity_trading_tax_lots.proto.p460v1.RequestNextPageInTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.RequestNextPageInTaxLotsResponseDto;
import equity_trading_tax_lots.proto.p460v1.SelectionAction;
import equity_trading_tax_lots.proto.p460v1.SelectionActionDto;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategyDto;
import equity_trading_tax_lots.proto.p460v1.SetSelectedTaxLotsRequestDto;
import equity_trading_tax_lots.proto.p460v1.SetSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.SetSelectedTaxLotsResponseDto;
import equity_trading_tax_lots.proto.p460v1.SetTaxLotsSelectionMethodRequestDto;
import equity_trading_tax_lots.proto.p460v1.SetTaxLotsSelectionMethodResponse;
import equity_trading_tax_lots.proto.p460v1.SetTaxLotsSelectionMethodResponseDto;
import equity_trading_tax_lots.proto.p460v1.StreamSelectedTaxLotsRequestDto;
import equity_trading_tax_lots.proto.p460v1.StreamSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.StreamSelectedTaxLotsResponseDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotInformationRequestDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotInformationResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotInformationResponseDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsRequestDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsResponseDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategyRequestDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategyResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategyResponseDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategySummaryRequestDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategySummaryResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategySummaryResponseDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryRequestDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryResponseDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelectionDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirectionDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatus;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatusDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import microgram.android.inject.MicrogramCachedComponentManager;
import microgram.android.inject.MicrogramComponent;
import microgram.contracts.equity_order_context.proto.p487v1.EquityOrderContextService;

/* compiled from: TaxLotsCachedService.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJD\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J.\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0016H\u0016J.\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u001eH\u0016J4\u0010'\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0096@¢\u0006\u0002\u0010,J&\u0010-\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010/J<\u00100\u001a\u0002012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u00102\u001a\u000203H\u0096@¢\u0006\u0002\u00104J\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060*H\u0096@¢\u0006\u0002\u00107J&\u00108\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010/J4\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<H\u0096@¢\u0006\u0002\u0010=J,\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010/J8\u0010@\u001a\u00020A2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010B\u001a\u00020C2\b\u0010;\u001a\u0004\u0018\u00010<H\u0096@¢\u0006\u0002\u0010DJ\u000e\u0010E\u001a\u00020FH\u0096A¢\u0006\u0002\u00107R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/microgram/RealTaxLotsCachedService;", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "componentManager", "Lmicrogram/android/inject/MicrogramCachedComponentManager;", "equityOrderContextService", "Lmicrogram/contracts/equity_order_context/proto/v1/EquityOrderContextService;", "<init>", "(Lmicrogram/android/inject/MicrogramCachedComponentManager;Lmicrogram/contracts/equity_order_context/proto/v1/EquityOrderContextService;)V", "getEquityOrderContextService", "()Lmicrogram/contracts/equity_order_context/proto/v1/EquityOrderContextService;", "taxLotsService", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "Lmicrogram/android/inject/MicrogramComponent;", "getTaxLotsService", "(Lmicrogram/android/inject/MicrogramComponent;)Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "savedOrderId", "Ljava/util/UUID;", "streamTaxLots", "Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponse;", "accountNumber", "", "orderId", "instrumentId", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "sortDirection", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "taxLotStatus", "Lequity_trading_tax_lots/proto/v1/TaxLotStatus;", "streamSelectedTaxLots", "Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse;", "streamTaxLotInformation", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponse;", "lotId", "streamTaxLotSummary", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;", "lotStatus", "setSelectedTaxLots", "Lequity_trading_tax_lots/proto/v1/SetSelectedTaxLotsResponse;", "selectedTaxLots", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestNextPage", "Lequity_trading_tax_lots/proto/v1/RequestNextPageInTaxLotsResponse;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editSelectedTaxLots", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponse;", "action", "Lequity_trading_tax_lots/proto/v1/SelectionAction;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/List;Lequity_trading_tax_lots/proto/v1/SelectionAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSelectionStrategyOptions", "Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSelectedTaxLots", "streamTaxLotsSelectionStrategySummary", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryResponse;", "quantity", "Ljava/math/BigDecimal;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamTaxLotsSelectionStrategy", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategyResponse;", "setTaxLotsSelectionMethod", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponse;", "selectionStrategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retainUntilCanceled", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsCachedService2 implements TaxLotsCachedService, CachedJobManager7 {
    public static final int $stable = 8;
    private final MicrogramCachedComponentManager componentManager;
    private final EquityOrderContextService equityOrderContextService;
    private UUID savedOrderId;

    @Override // com.robinhood.coroutines.job.CachedJobManager7
    public Object retainUntilCanceled(Continuation<?> continuation) {
        return this.componentManager.retainUntilCanceled(continuation);
    }

    public TaxLotsCachedService2(MicrogramCachedComponentManager componentManager, EquityOrderContextService equityOrderContextService) {
        Intrinsics.checkNotNullParameter(componentManager, "componentManager");
        Intrinsics.checkNotNullParameter(equityOrderContextService, "equityOrderContextService");
        this.componentManager = componentManager;
        this.equityOrderContextService = equityOrderContextService;
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public EquityOrderContextService getEquityOrderContextService() {
        return this.equityOrderContextService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityTradingTaxLotsService getTaxLotsService(MicrogramComponent microgramComponent) {
        return (EquityTradingTaxLotsService) microgramComponent.getServiceLocator().getClient(EquityTradingTaxLotsService.class);
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLots$1", m3645f = "TaxLotsCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLots$1 */
    static final class C148901 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends StreamTaxLotsResponse>>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        final /* synthetic */ TaxLotSort $sort;
        final /* synthetic */ TaxLotSortDirection $sortDirection;
        final /* synthetic */ TaxLotStatus $taxLotStatus;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148901(String str, UUID uuid, UUID uuid2, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, TaxLotStatus taxLotStatus, Continuation<? super C148901> continuation) {
            super(3, continuation);
            this.$accountNumber = str;
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$sort = taxLotSort;
            this.$sortDirection = taxLotSortDirection;
            this.$taxLotStatus = taxLotStatus;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends StreamTaxLotsResponse>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<StreamTaxLotsResponse>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<StreamTaxLotsResponse>> continuation) {
            C148901 c148901 = TaxLotsCachedService2.this.new C148901(this.$accountNumber, this.$orderId, this.$instrumentId, this.$sort, this.$sortDirection, this.$taxLotStatus, continuation);
            c148901.L$0 = microgramComponent;
            return c148901.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String str = this.$accountNumber;
                String strValueOf = String.valueOf(this.$orderId);
                String string2 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                List listEmptyList = CollectionsKt.emptyList();
                TaxLotSort taxLotSort = this.$sort;
                TaxLotSortDto taxLotSortDtoFromProto = taxLotSort != null ? TaxLotSortDto.INSTANCE.fromProto(taxLotSort) : null;
                TaxLotSortDirection taxLotSortDirection = this.$sortDirection;
                final Flow<StreamTaxLotsResponseDto> flowStreamTaxLots = taxLotsService.StreamTaxLots(new StreamTaxLotsRequestDto(str, strValueOf, string2, listEmptyList, null, taxLotSortDtoFromProto, taxLotSortDirection != null ? TaxLotSortDirectionDto.INSTANCE.fromProto(taxLotSortDirection) : null, TaxLotStatusDto.INSTANCE.fromProto(this.$taxLotStatus), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, null));
                return new Flow<StreamTaxLotsResponse>() { // from class: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLots$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StreamTaxLotsResponse> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamTaxLots.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLots$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLots$1$invokeSuspend$$inlined$map$1$2", m3645f = "TaxLotsCachedService.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLots$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                StreamTaxLotsResponse proto = ((StreamTaxLotsResponseDto) obj).toProto();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Flow<StreamTaxLotsResponse> streamTaxLots(String accountNumber, UUID orderId, UUID instrumentId, TaxLotSort sort, TaxLotSortDirection sortDirection, TaxLotStatus taxLotStatus) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(taxLotStatus, "taxLotStatus");
        this.savedOrderId = orderId == null ? this.savedOrderId : orderId;
        return CachedJobManager5.flowFrom(this.componentManager, new C148901(accountNumber, orderId, instrumentId, sort, sortDirection, taxLotStatus, null));
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamSelectedTaxLots$1", m3645f = "TaxLotsCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamSelectedTaxLots$1 */
    static final class C148871 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends StreamSelectedTaxLotsResponse>>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148871(UUID uuid, UUID uuid2, String str, Continuation<? super C148871> continuation) {
            super(3, continuation);
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$accountNumber = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends StreamSelectedTaxLotsResponse>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<StreamSelectedTaxLotsResponse>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<StreamSelectedTaxLotsResponse>> continuation) {
            C148871 c148871 = TaxLotsCachedService2.this.new C148871(this.$orderId, this.$instrumentId, this.$accountNumber, continuation);
            c148871.L$0 = microgramComponent;
            return c148871.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String strValueOf = String.valueOf(this.$orderId);
                String string2 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                final Flow<StreamSelectedTaxLotsResponseDto> flowStreamSelectedTaxLots = taxLotsService.StreamSelectedTaxLots(new StreamSelectedTaxLotsRequestDto(strValueOf, string2, this.$accountNumber, null, 8, null));
                return new Flow<StreamSelectedTaxLotsResponse>() { // from class: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamSelectedTaxLots$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StreamSelectedTaxLotsResponse> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamSelectedTaxLots.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamSelectedTaxLots$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamSelectedTaxLots$1$invokeSuspend$$inlined$map$1$2", m3645f = "TaxLotsCachedService.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamSelectedTaxLots$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                StreamSelectedTaxLotsResponse proto = ((StreamSelectedTaxLotsResponseDto) obj).toProto();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Flow<StreamSelectedTaxLotsResponse> streamSelectedTaxLots(String accountNumber, UUID orderId, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.savedOrderId = orderId == null ? this.savedOrderId : orderId;
        return CachedJobManager5.flowFrom(this.componentManager, new C148871(orderId, instrumentId, accountNumber, null));
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotInformation$1", m3645f = "TaxLotsCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotInformation$1 */
    static final class C148881 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends StreamTaxLotInformationResponse>>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ String $lotId;
        final /* synthetic */ UUID $orderId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148881(UUID uuid, UUID uuid2, String str, String str2, Continuation<? super C148881> continuation) {
            super(3, continuation);
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$lotId = str;
            this.$accountNumber = str2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends StreamTaxLotInformationResponse>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<StreamTaxLotInformationResponse>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<StreamTaxLotInformationResponse>> continuation) {
            C148881 c148881 = TaxLotsCachedService2.this.new C148881(this.$orderId, this.$instrumentId, this.$lotId, this.$accountNumber, continuation);
            c148881.L$0 = microgramComponent;
            return c148881.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String string2 = this.$orderId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                final Flow<StreamTaxLotInformationResponseDto> flowStreamTaxLotInformation = taxLotsService.StreamTaxLotInformation(new StreamTaxLotInformationRequestDto(this.$lotId, string2, this.$accountNumber, string3, null, 16, null));
                return new Flow<StreamTaxLotInformationResponse>() { // from class: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotInformation$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StreamTaxLotInformationResponse> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamTaxLotInformation.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotInformation$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotInformation$1$invokeSuspend$$inlined$map$1$2", m3645f = "TaxLotsCachedService.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotInformation$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                StreamTaxLotInformationResponse proto = ((StreamTaxLotInformationResponseDto) obj).toProto();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Flow<StreamTaxLotInformationResponse> streamTaxLotInformation(String accountNumber, UUID orderId, UUID instrumentId, String lotId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(lotId, "lotId");
        return CachedJobManager5.flowFrom(this.componentManager, new C148881(orderId, instrumentId, lotId, accountNumber, null));
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotSummary$1", m3645f = "TaxLotsCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotSummary$1 */
    static final class C148891 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends StreamTaxLotsSummaryResponse>>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ TaxLotStatus $lotStatus;
        final /* synthetic */ UUID $orderId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148891(UUID uuid, UUID uuid2, TaxLotStatus taxLotStatus, String str, Continuation<? super C148891> continuation) {
            super(3, continuation);
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$lotStatus = taxLotStatus;
            this.$accountNumber = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends StreamTaxLotsSummaryResponse>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<StreamTaxLotsSummaryResponse>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<StreamTaxLotsSummaryResponse>> continuation) {
            C148891 c148891 = TaxLotsCachedService2.this.new C148891(this.$orderId, this.$instrumentId, this.$lotStatus, this.$accountNumber, continuation);
            c148891.L$0 = microgramComponent;
            return c148891.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String string2 = this.$orderId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                final Flow<StreamTaxLotsSummaryResponseDto> flowStreamTaxLotsSummary = taxLotsService.StreamTaxLotsSummary(new StreamTaxLotsSummaryRequestDto(this.$accountNumber, string2, string3, TaxLotStatusDto.INSTANCE.fromProto(this.$lotStatus)));
                return new Flow<StreamTaxLotsSummaryResponse>() { // from class: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotSummary$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StreamTaxLotsSummaryResponse> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamTaxLotsSummary.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotSummary$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotSummary$1$invokeSuspend$$inlined$map$1$2", m3645f = "TaxLotsCachedService.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotSummary$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                StreamTaxLotsSummaryResponse proto = ((StreamTaxLotsSummaryResponseDto) obj).toProto();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Flow<StreamTaxLotsSummaryResponse> streamTaxLotSummary(String accountNumber, UUID orderId, UUID instrumentId, TaxLotStatus lotStatus) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(lotStatus, "lotStatus");
        return CachedJobManager5.flowFrom(this.componentManager, new C148891(orderId, instrumentId, lotStatus, accountNumber, null));
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lequity_trading_tax_lots/proto/v1/SetSelectedTaxLotsResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$setSelectedTaxLots$2", m3645f = "TaxLotsCachedService.kt", m3646l = {239}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$setSelectedTaxLots$2 */
    static final class C148852 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super SetSelectedTaxLotsResponse>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        final /* synthetic */ List<TaxLotSelection> $selectedTaxLots;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148852(UUID uuid, UUID uuid2, List<TaxLotSelection> list, String str, Continuation<? super C148852> continuation) {
            super(3, continuation);
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$selectedTaxLots = list;
            this.$accountNumber = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super SetSelectedTaxLotsResponse> continuation) {
            C148852 c148852 = TaxLotsCachedService2.this.new C148852(this.$orderId, this.$instrumentId, this.$selectedTaxLots, this.$accountNumber, continuation);
            c148852.L$0 = microgramComponent;
            return c148852.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String string2 = this.$orderId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                List<TaxLotSelection> list = this.$selectedTaxLots;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(TaxLotSelectionDto.INSTANCE.fromProto((TaxLotSelection) it.next()));
                }
                SetSelectedTaxLotsRequestDto setSelectedTaxLotsRequestDto = new SetSelectedTaxLotsRequestDto(arrayList, string2, string3, this.$accountNumber);
                this.label = 1;
                obj = taxLotsService.SetSelectedTaxLots(setSelectedTaxLotsRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((SetSelectedTaxLotsResponseDto) obj).toProto();
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Object setSelectedTaxLots(String str, UUID uuid, UUID uuid2, List<TaxLotSelection> list, Continuation<? super SetSelectedTaxLotsResponse> continuation) {
        return this.componentManager.execute(new C148852(uuid, uuid2, list, str, null), continuation);
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lequity_trading_tax_lots/proto/v1/RequestNextPageInTaxLotsResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$requestNextPage$2", m3645f = "TaxLotsCachedService.kt", m3646l = {256}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$requestNextPage$2 */
    static final class C148842 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super RequestNextPageInTaxLotsResponse>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148842(UUID uuid, UUID uuid2, String str, Continuation<? super C148842> continuation) {
            super(3, continuation);
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$accountNumber = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super RequestNextPageInTaxLotsResponse> continuation) {
            C148842 c148842 = TaxLotsCachedService2.this.new C148842(this.$orderId, this.$instrumentId, this.$accountNumber, continuation);
            c148842.L$0 = microgramComponent;
            return c148842.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String string2 = this.$orderId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                RequestNextPageInTaxLotsRequestDto requestNextPageInTaxLotsRequestDto = new RequestNextPageInTaxLotsRequestDto(string2, string3, null, this.$accountNumber, 4, null);
                this.label = 1;
                obj = taxLotsService.RequestNextPageInTaxLots(requestNextPageInTaxLotsRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((RequestNextPageInTaxLotsResponseDto) obj).toProto();
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Object requestNextPage(String str, UUID uuid, UUID uuid2, Continuation<? super RequestNextPageInTaxLotsResponse> continuation) {
        return this.componentManager.execute(new C148842(uuid, uuid2, str, null), continuation);
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$editSelectedTaxLots$2", m3645f = "TaxLotsCachedService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$editSelectedTaxLots$2 */
    static final class C148822 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super EditSelectedTaxLotsResponse>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ SelectionAction $action;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        final /* synthetic */ List<TaxLotSelection> $selectedTaxLots;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148822(UUID uuid, UUID uuid2, List<TaxLotSelection> list, SelectionAction selectionAction, String str, Continuation<? super C148822> continuation) {
            super(3, continuation);
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$selectedTaxLots = list;
            this.$action = selectionAction;
            this.$accountNumber = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super EditSelectedTaxLotsResponse> continuation) {
            C148822 c148822 = TaxLotsCachedService2.this.new C148822(this.$orderId, this.$instrumentId, this.$selectedTaxLots, this.$action, this.$accountNumber, continuation);
            c148822.L$0 = microgramComponent;
            return c148822.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String string2 = this.$orderId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                List<TaxLotSelection> list = this.$selectedTaxLots;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(TaxLotSelectionDto.INSTANCE.fromProto((TaxLotSelection) it.next()));
                }
                EditSelectedTaxLotsRequestDto editSelectedTaxLotsRequestDto = new EditSelectedTaxLotsRequestDto(arrayList, string2, string3, this.$accountNumber, SelectionActionDto.INSTANCE.fromProto(this.$action));
                this.label = 1;
                obj = taxLotsService.EditSelectedTaxLots(editSelectedTaxLotsRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((EditSelectedTaxLotsResponseDto) obj).toProto();
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Object editSelectedTaxLots(String str, UUID uuid, UUID uuid2, List<TaxLotSelection> list, SelectionAction selectionAction, Continuation<? super EditSelectedTaxLotsResponse> continuation) {
        return this.componentManager.execute(new C148822(uuid, uuid2, list, selectionAction, str, null), continuation);
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$getSelectionStrategyOptions$2", m3645f = "TaxLotsCachedService.kt", m3646l = {288}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$getSelectionStrategyOptions$2 */
    static final class C148832 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super List<? extends AvailableSelectionStrategyOption>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C148832(Continuation<? super C148832> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super List<? extends AvailableSelectionStrategyOption>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super List<AvailableSelectionStrategyOption>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super List<AvailableSelectionStrategyOption>> continuation) {
            C148832 c148832 = TaxLotsCachedService2.this.new C148832(continuation);
            c148832.L$0 = microgramComponent;
            return c148832.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                GetAvailableSelectionStrategyOptionsRequestDto getAvailableSelectionStrategyOptionsRequestDto = new GetAvailableSelectionStrategyOptionsRequestDto();
                this.label = 1;
                obj = taxLotsService.GetAvailableSelectionStrategyOptions(getAvailableSelectionStrategyOptionsRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((GetAvailableSelectionStrategyOptionsResponseDto) obj).toProto().getOptions();
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Object getSelectionStrategyOptions(Continuation<? super List<AvailableSelectionStrategyOption>> continuation) {
        return this.componentManager.execute(new C148832(null), continuation);
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lequity_trading_tax_lots/proto/v1/SetSelectedTaxLotsResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$clearSelectedTaxLots$2", m3645f = "TaxLotsCachedService.kt", m3646l = {300}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$clearSelectedTaxLots$2 */
    static final class C148812 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super SetSelectedTaxLotsResponse>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148812(UUID uuid, UUID uuid2, String str, Continuation<? super C148812> continuation) {
            super(3, continuation);
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$accountNumber = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super SetSelectedTaxLotsResponse> continuation) {
            C148812 c148812 = TaxLotsCachedService2.this.new C148812(this.$orderId, this.$instrumentId, this.$accountNumber, continuation);
            c148812.L$0 = microgramComponent;
            return c148812.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String string2 = this.$orderId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                SetSelectedTaxLotsRequestDto setSelectedTaxLotsRequestDto = new SetSelectedTaxLotsRequestDto(CollectionsKt.emptyList(), string2, string3, this.$accountNumber);
                this.label = 1;
                obj = taxLotsService.SetSelectedTaxLots(setSelectedTaxLotsRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((SetSelectedTaxLotsResponseDto) obj).toProto();
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Object clearSelectedTaxLots(String str, UUID uuid, UUID uuid2, Continuation<? super SetSelectedTaxLotsResponse> continuation) {
        return this.componentManager.execute(new C148812(uuid, uuid2, str, null), continuation);
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategySummary$2", m3645f = "TaxLotsCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategySummary$2 */
    static final class C148922 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends StreamTaxLotsSelectionStrategySummaryResponse>>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        final /* synthetic */ BigDecimal $quantity;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148922(UUID uuid, UUID uuid2, BigDecimal bigDecimal, String str, Continuation<? super C148922> continuation) {
            super(3, continuation);
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$quantity = bigDecimal;
            this.$accountNumber = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends StreamTaxLotsSelectionStrategySummaryResponse>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<StreamTaxLotsSelectionStrategySummaryResponse>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<StreamTaxLotsSelectionStrategySummaryResponse>> continuation) {
            C148922 c148922 = TaxLotsCachedService2.this.new C148922(this.$orderId, this.$instrumentId, this.$quantity, this.$accountNumber, continuation);
            c148922.L$0 = microgramComponent;
            return c148922.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String string2 = this.$orderId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                final Flow<StreamTaxLotsSelectionStrategySummaryResponseDto> flowStreamTaxLotsSelectionStrategySummary = taxLotsService.StreamTaxLotsSelectionStrategySummary(new StreamTaxLotsSelectionStrategySummaryRequestDto(this.$accountNumber, string2, string3, IdlDecimal2.toIdlDecimal(this.$quantity)));
                return new Flow<StreamTaxLotsSelectionStrategySummaryResponse>() { // from class: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategySummary$2$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StreamTaxLotsSelectionStrategySummaryResponse> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamTaxLotsSelectionStrategySummary.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategySummary$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategySummary$2$invokeSuspend$$inlined$map$1$2", m3645f = "TaxLotsCachedService.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategySummary$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                StreamTaxLotsSelectionStrategySummaryResponse proto = ((StreamTaxLotsSelectionStrategySummaryResponseDto) obj).toProto();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Object streamTaxLotsSelectionStrategySummary(String str, UUID uuid, UUID uuid2, BigDecimal bigDecimal, Continuation<? super Flow<StreamTaxLotsSelectionStrategySummaryResponse>> continuation) {
        return CachedJobManager5.flowFrom(this.componentManager, new C148922(uuid, uuid2, bigDecimal, str, null));
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategyResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategy$2", m3645f = "TaxLotsCachedService.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategy$2 */
    static final class C148912 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super Flow<? extends StreamTaxLotsSelectionStrategyResponse>>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148912(UUID uuid, UUID uuid2, String str, Continuation<? super C148912> continuation) {
            super(3, continuation);
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$accountNumber = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<? extends StreamTaxLotsSelectionStrategyResponse>> continuation) {
            return invoke2(coroutineScope, microgramComponent, (Continuation<? super Flow<StreamTaxLotsSelectionStrategyResponse>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super Flow<StreamTaxLotsSelectionStrategyResponse>> continuation) {
            C148912 c148912 = TaxLotsCachedService2.this.new C148912(this.$orderId, this.$instrumentId, this.$accountNumber, continuation);
            c148912.L$0 = microgramComponent;
            return c148912.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String string2 = this.$orderId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                final Flow<StreamTaxLotsSelectionStrategyResponseDto> flowStreamTaxLotsSelectionStrategy = taxLotsService.StreamTaxLotsSelectionStrategy(new StreamTaxLotsSelectionStrategyRequestDto(this.$accountNumber, string2, string3));
                return new Flow<StreamTaxLotsSelectionStrategyResponse>() { // from class: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategy$2$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StreamTaxLotsSelectionStrategyResponse> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamTaxLotsSelectionStrategy.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategy$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategy$2$invokeSuspend$$inlined$map$1$2", m3645f = "TaxLotsCachedService.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$streamTaxLotsSelectionStrategy$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                StreamTaxLotsSelectionStrategyResponse proto = ((StreamTaxLotsSelectionStrategyResponseDto) obj).toProto();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Object streamTaxLotsSelectionStrategy(String str, UUID uuid, UUID uuid2, Continuation<? super Flow<StreamTaxLotsSelectionStrategyResponse>> continuation) {
        return CachedJobManager5.flowFrom(this.componentManager, new C148912(uuid, uuid2, str, null));
    }

    /* compiled from: TaxLotsCachedService.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponse;", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lmicrogram/android/inject/MicrogramComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$setTaxLotsSelectionMethod$2", m3645f = "TaxLotsCachedService.kt", m3646l = {353}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealTaxLotsCachedService$setTaxLotsSelectionMethod$2 */
    static final class C148862 extends ContinuationImpl7 implements Function3<CoroutineScope, MicrogramComponent, Continuation<? super SetTaxLotsSelectionMethodResponse>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        final /* synthetic */ BigDecimal $quantity;
        final /* synthetic */ SelectionStrategy $selectionStrategy;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148862(String str, UUID uuid, UUID uuid2, SelectionStrategy selectionStrategy, BigDecimal bigDecimal, Continuation<? super C148862> continuation) {
            super(3, continuation);
            this.$accountNumber = str;
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$selectionStrategy = selectionStrategy;
            this.$quantity = bigDecimal;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MicrogramComponent microgramComponent, Continuation<? super SetTaxLotsSelectionMethodResponse> continuation) {
            C148862 c148862 = TaxLotsCachedService2.this.new C148862(this.$accountNumber, this.$orderId, this.$instrumentId, this.$selectionStrategy, this.$quantity, continuation);
            c148862.L$0 = microgramComponent;
            return c148862.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingTaxLotsService taxLotsService = TaxLotsCachedService2.this.getTaxLotsService((MicrogramComponent) this.L$0);
                String str = this.$accountNumber;
                String string2 = this.$orderId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                SelectionStrategyDto selectionStrategyDtoFromProto = SelectionStrategyDto.INSTANCE.fromProto(this.$selectionStrategy);
                BigDecimal bigDecimal = this.$quantity;
                SetTaxLotsSelectionMethodRequestDto setTaxLotsSelectionMethodRequestDto = new SetTaxLotsSelectionMethodRequestDto(str, string2, string3, selectionStrategyDtoFromProto, bigDecimal != null ? IdlDecimal2.toIdlDecimal(bigDecimal) : null);
                this.label = 1;
                obj = taxLotsService.SetTaxLotsSelectionMethod(setTaxLotsSelectionMethodRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((SetTaxLotsSelectionMethodResponseDto) obj).toProto();
        }
    }

    @Override // com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService
    public Object setTaxLotsSelectionMethod(String str, UUID uuid, UUID uuid2, SelectionStrategy selectionStrategy, BigDecimal bigDecimal, Continuation<? super SetTaxLotsSelectionMethodResponse> continuation) {
        return this.componentManager.execute(new C148862(str, uuid, uuid2, selectionStrategy, bigDecimal, null), continuation);
    }
}
