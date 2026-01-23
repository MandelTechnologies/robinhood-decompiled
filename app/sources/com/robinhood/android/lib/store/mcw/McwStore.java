package com.robinhood.android.lib.store.mcw;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.store.mcw.data.CashBalancesDetailsPageData;
import com.robinhood.android.lib.store.mcw.data.ConversionFxRate;
import com.robinhood.android.lib.store.mcw.data.ConvertCurrencyRequest;
import com.robinhood.android.lib.store.mcw.data.ConvertCurrencyResponse;
import com.robinhood.android.lib.store.mcw.data.ConvertibleCurrency;
import com.robinhood.android.lib.store.mcw.data.McwHomeSectionData;
import com.robinhood.android.lib.store.mcw.data.PerformQuickConversionRequest;
import com.robinhood.android.lib.store.mcw.data.PerformQuickConversionResponse;
import com.robinhood.android.lib.store.mcw.exceptions.UnexpectedResponseException;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.contracts.mcw_cash_balances.proto.p497v1.CashBalancesDetailsPageService;
import microgram.contracts.mcw_cash_balances.proto.p497v1.CashBalancesHomeSectionService;
import microgram.contracts.mcw_cash_balances.proto.p497v1.GetCashBalancesDetailsPageFooterRequestDto;
import microgram.contracts.mcw_cash_balances.proto.p497v1.GetCashBalancesHomeSectionRequestDto;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.GetConversionFxRateRequestDto;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.GetConvertibleCurrenciesRequestDto;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.McwCurrencyConversionService;

/* compiled from: McwStore.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0,2\u0006\u0010-\u001a\u00020(J\u0016\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020(H\u0086@¢\u0006\u0002\u0010/J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010-\u001a\u00020(H\u0086@¢\u0006\u0002\u0010/J\u001e\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020(H\u0086@¢\u0006\u0002\u00104J\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\f0,2\u0006\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020(J6\u00106\u001a\u00020\"2\u0006\u0010-\u001a\u00020(2\u0006\u00107\u001a\u00020(2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0086@¢\u0006\u0002\u0010=J&\u0010>\u001a\u00020%2\u0006\u0010-\u001a\u00020(2\u0006\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u000209H\u0086@¢\u0006\u0002\u0010AR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\n0'X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0*\u0012\u0004\u0012\u00020\f0'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/McwStore;", "Lcom/robinhood/store/Store;", "microgramFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/store/StoreBundle;)V", "mcwHomeSectionFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;", "conversionFxRateFlow", "Lcom/robinhood/android/lib/store/mcw/data/ConversionFxRate;", "mcwHomeService", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/CashBalancesHomeSectionService;", "cashBalancesDetailsService", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/CashBalancesDetailsPageService;", "currencyConversionService", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;", "mcwHomeEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionRequestDto;", "cashBalancesDetailPageEndpoint", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterRequestDto;", "Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData;", "convertibleCurrenciesEndpoint", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConvertibleCurrenciesRequestDto;", "", "Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;", "conversionFxRateEndpoint", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateRequestDto;", "convertCurrencyEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/lib/store/mcw/data/ConvertCurrencyRequest;", "Lcom/robinhood/android/lib/store/mcw/data/ConvertCurrencyResponse;", "performQuickConversionEndpoint", "Lcom/robinhood/android/lib/store/mcw/data/PerformQuickConversionRequest;", "Lcom/robinhood/android/lib/store/mcw/data/PerformQuickConversionResponse;", "pollMcwHomeSectionQuery", "Lcom/robinhood/android/moria/db/Query;", "", "pollConversionFxRateQuery", "Lkotlin/Pair;", "pollMcwHomeSection", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "fetchCashBalancesDetailsPage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchConvertibleCurrencies", "fetchConversionFxRate", "from", "to", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollConversionFxRate", "convertCurrency", "symbolId", "amountToConvert", "Ljava/math/BigDecimal;", "fromCurrency", "Ljava/util/Currency;", "toCurrency", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Ljava/util/Currency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performQuickConversion", "sourceCurrency", "usdToPurchase", "(Ljava/lang/String;Ljava/util/Currency;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class McwStore extends Store {
    public static final int $stable = 8;
    private final Endpoint<GetCashBalancesDetailsPageFooterRequestDto, CashBalancesDetailsPageData> cashBalancesDetailPageEndpoint;
    private final CashBalancesDetailsPageService cashBalancesDetailsService;
    private final Endpoint<GetConversionFxRateRequestDto, ConversionFxRate> conversionFxRateEndpoint;
    private final SharedFlow2<ConversionFxRate> conversionFxRateFlow;
    private final PostEndpoint<ConvertCurrencyRequest, ConvertCurrencyResponse> convertCurrencyEndpoint;
    private final Endpoint<GetConvertibleCurrenciesRequestDto, List<ConvertibleCurrency>> convertibleCurrenciesEndpoint;
    private final McwCurrencyConversionService currencyConversionService;
    private final Endpoint<GetCashBalancesHomeSectionRequestDto, McwHomeSectionData> mcwHomeEndpoint;
    private final SharedFlow2<McwHomeSectionData> mcwHomeSectionFlow;
    private final CashBalancesHomeSectionService mcwHomeService;
    private final PostEndpoint<PerformQuickConversionRequest, PerformQuickConversionResponse> performQuickConversionEndpoint;
    private final Query<Tuples2<String, String>, ConversionFxRate> pollConversionFxRateQuery;
    private final Query<String, McwHomeSectionData> pollMcwHomeSectionQuery;

    /* compiled from: McwStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.mcw.McwStore", m3645f = "McwStore.kt", m3646l = {201}, m3647m = "convertCurrency")
    /* renamed from: com.robinhood.android.lib.store.mcw.McwStore$convertCurrency$1 */
    static final class C206121 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C206121(Continuation<? super C206121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return McwStore.this.convertCurrency(null, null, null, null, null, this);
        }
    }

    /* compiled from: McwStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.store.mcw.McwStore", m3645f = "McwStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "performQuickConversion")
    /* renamed from: com.robinhood.android.lib.store.mcw.McwStore$performQuickConversion$1 */
    static final class C206131 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C206131(Continuation<? super C206131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return McwStore.this.performQuickConversion(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McwStore(MicrogramComponent.Factory microgramFactory, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(microgramFactory, "microgramFactory");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        SharedFlow2<McwHomeSectionData> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, bufferOverflow, 2, null);
        this.mcwHomeSectionFlow = sharedFlow2MutableSharedFlow$default;
        SharedFlow2<ConversionFxRate> sharedFlow2MutableSharedFlow$default2 = SharedFlow4.MutableSharedFlow$default(1, 0, bufferOverflow, 2, null);
        this.conversionFxRateFlow = sharedFlow2MutableSharedFlow$default2;
        this.mcwHomeService = (CashBalancesHomeSectionService) MicrogramComponent.Factory.DefaultImpls.create$default(microgramFactory, getStoreScope(), new RemoteMicrogramApplication("app-mcw-cash-balances", null, 2, null), null, 4, null).getServiceLocator().getClient(CashBalancesHomeSectionService.class);
        this.cashBalancesDetailsService = (CashBalancesDetailsPageService) MicrogramComponent.Factory.DefaultImpls.create$default(microgramFactory, getStoreScope(), new RemoteMicrogramApplication("app-mcw-cash-balances", null, 2, null), null, 4, null).getServiceLocator().getClient(CashBalancesDetailsPageService.class);
        this.currencyConversionService = (McwCurrencyConversionService) MicrogramComponent.Factory.DefaultImpls.create$default(microgramFactory, getStoreScope(), new RemoteMicrogramApplication("app-mcw-currency-conversion", null, 2, null), null, 4, null).getServiceLocator().getClient(McwCurrencyConversionService.class);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        McwStore$mcwHomeEndpoint$1 mcwStore$mcwHomeEndpoint$1 = new McwStore$mcwHomeEndpoint$1(sharedFlow2MutableSharedFlow$default);
        this.mcwHomeEndpoint = Endpoint.Companion.create$default(companion, new McwStore$mcwHomeEndpoint$2(this, null), getLogoutKillswitch(), mcwStore$mcwHomeEndpoint$1, storeBundle.getClock(), null, 16, null);
        this.cashBalancesDetailPageEndpoint = Endpoint.Companion.create$default(companion, new McwStore$cashBalancesDetailPageEndpoint$1(this, null), getLogoutKillswitch(), new McwStore$cashBalancesDetailPageEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.convertibleCurrenciesEndpoint = Endpoint.Companion.create$default(companion, new McwStore$convertibleCurrenciesEndpoint$1(this, null), getLogoutKillswitch(), new McwStore$convertibleCurrenciesEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.conversionFxRateEndpoint = Endpoint.Companion.create$default(companion, new McwStore$conversionFxRateEndpoint$1(this, null), getLogoutKillswitch(), new McwStore$conversionFxRateEndpoint$2(sharedFlow2MutableSharedFlow$default2), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion2 = PostEndpoint.INSTANCE;
        this.convertCurrencyEndpoint = companion2.create(new McwStore$convertCurrencyEndpoint$1(this, null), new McwStore$convertCurrencyEndpoint$2(null));
        this.performQuickConversionEndpoint = companion2.create(new McwStore$performQuickConversionEndpoint$1(this, null), new McwStore$performQuickConversionEndpoint$2(null));
        Query.Companion companion3 = Query.INSTANCE;
        this.pollMcwHomeSectionQuery = Store.create$default(this, companion3, "pollMcwHomeSection", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.store.mcw.McwStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwStore.pollMcwHomeSectionQuery$lambda$1(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.lib.store.mcw.McwStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwStore.pollMcwHomeSectionQuery$lambda$2(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.pollConversionFxRateQuery = Store.create$default(this, companion3, "pollConversionFxRate", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.store.mcw.McwStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwStore.pollConversionFxRateQuery$lambda$3(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.lib.store.mcw.McwStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwStore.pollConversionFxRateQuery$lambda$4(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object mcwHomeEndpoint$tryEmit(SharedFlow2 sharedFlow2, McwHomeSectionData mcwHomeSectionData, Continuation continuation) {
        sharedFlow2.tryEmit(mcwHomeSectionData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object conversionFxRateEndpoint$tryEmit$0(SharedFlow2 sharedFlow2, ConversionFxRate conversionFxRate, Continuation continuation) {
        sharedFlow2.tryEmit(conversionFxRate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollMcwHomeSectionQuery$lambda$1(McwStore mcwStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.poll$default(mcwStore.mcwHomeEndpoint, new GetCashBalancesHomeSectionRequestDto(accountNumber), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollMcwHomeSectionQuery$lambda$2(McwStore mcwStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return mcwStore.mcwHomeSectionFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollConversionFxRateQuery$lambda$3(McwStore mcwStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return Endpoint.DefaultImpls.poll$default(mcwStore.conversionFxRateEndpoint, new GetConversionFxRateRequestDto((String) tuples2.component1(), (String) tuples2.component2()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollConversionFxRateQuery$lambda$4(McwStore mcwStore, Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return mcwStore.conversionFxRateFlow;
    }

    public final Flow<McwHomeSectionData> pollMcwHomeSection(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.pollMcwHomeSectionQuery.asFlow(accountNumber);
    }

    public final Object fetchCashBalancesDetailsPage(String str, Continuation<? super CashBalancesDetailsPageData> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.cashBalancesDetailPageEndpoint, new GetCashBalancesDetailsPageFooterRequestDto(str), null, continuation, 2, null);
    }

    public final Object fetchConvertibleCurrencies(String str, Continuation<? super List<ConvertibleCurrency>> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.convertibleCurrenciesEndpoint, new GetConvertibleCurrenciesRequestDto(str), null, continuation, 2, null);
    }

    public final Object fetchConversionFxRate(String str, String str2, Continuation<? super ConversionFxRate> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.conversionFxRateEndpoint, new GetConversionFxRateRequestDto(str, str2), null, continuation, 2, null);
    }

    public final Flow<ConversionFxRate> pollConversionFxRate(String from, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        return this.pollConversionFxRateQuery.asFlow(Tuples4.m3642to(from, to));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object convertCurrency(String str, String str2, BigDecimal bigDecimal, Currency currency, Currency currency2, Continuation<? super ConvertCurrencyResponse> continuation) throws UnexpectedResponseException {
        C206121 c206121;
        UUID uuid;
        if (continuation instanceof C206121) {
            c206121 = (C206121) continuation;
            int i = c206121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c206121.label = i - Integer.MIN_VALUE;
            } else {
                c206121 = new C206121(continuation);
            }
        }
        Object objPost$default = c206121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c206121.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPost$default);
            UUID uuidRandomUUID = UUID.randomUUID();
            PostEndpoint<ConvertCurrencyRequest, ConvertCurrencyResponse> postEndpoint = this.convertCurrencyEndpoint;
            Intrinsics.checkNotNull(uuidRandomUUID);
            ConvertCurrencyRequest convertCurrencyRequest = new ConvertCurrencyRequest(uuidRandomUUID, str, str2, bigDecimal, currency, currency2);
            c206121.L$0 = uuidRandomUUID;
            c206121.label = 1;
            objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, convertCurrencyRequest, null, c206121, 2, null);
            if (objPost$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            uuid = uuidRandomUUID;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) c206121.L$0;
            ResultKt.throwOnFailure(objPost$default);
        }
        ConvertCurrencyResponse convertCurrencyResponse = (ConvertCurrencyResponse) objPost$default;
        if (Intrinsics.areEqual(convertCurrencyResponse.getRefId(), uuid)) {
            return convertCurrencyResponse;
        }
        throw new UnexpectedResponseException("Ref IDs of request and response do not match: request=" + uuid + ", response=" + convertCurrencyResponse.getRefId());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performQuickConversion(String str, Currency currency, BigDecimal bigDecimal, Continuation<? super PerformQuickConversionResponse> continuation) throws UnexpectedResponseException {
        C206131 c206131;
        UUID uuid;
        if (continuation instanceof C206131) {
            c206131 = (C206131) continuation;
            int i = c206131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c206131.label = i - Integer.MIN_VALUE;
            } else {
                c206131 = new C206131(continuation);
            }
        }
        C206131 c2061312 = c206131;
        Object obj = c2061312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2061312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuidRandomUUID = UUID.randomUUID();
            PostEndpoint<PerformQuickConversionRequest, PerformQuickConversionResponse> postEndpoint = this.performQuickConversionEndpoint;
            Intrinsics.checkNotNull(uuidRandomUUID);
            PerformQuickConversionRequest performQuickConversionRequest = new PerformQuickConversionRequest(uuidRandomUUID, str, currency, bigDecimal);
            c2061312.L$0 = uuidRandomUUID;
            c2061312.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, performQuickConversionRequest, null, c2061312, 2, null);
            if (objPost$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objPost$default;
            uuid = uuidRandomUUID;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) c2061312.L$0;
            ResultKt.throwOnFailure(obj);
        }
        PerformQuickConversionResponse performQuickConversionResponse = (PerformQuickConversionResponse) obj;
        if (Intrinsics.areEqual(performQuickConversionResponse.getRefId(), uuid)) {
            return performQuickConversionResponse;
        }
        throw new UnexpectedResponseException("Ref IDs of request and response do not match: request=" + uuid + ", response=" + performQuickConversionResponse.getRefId());
    }
}
