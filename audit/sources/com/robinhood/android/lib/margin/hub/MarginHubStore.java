package com.robinhood.android.lib.margin.hub;

import bonfire.proto.idl.margin.p036v1.GetMaintenanceTableResponseDto;
import bonfire.proto.idl.margin.p036v1.MaintenanceTableService;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.lib.margin.hub.MarginHubStore;
import com.robinhood.android.lib.margin.hub.api.MarginHubApi;
import com.robinhood.android.lib.margin.hub.api.models.ApiBuyingPowerHubView;
import com.robinhood.android.lib.margin.hub.api.models.MarginStatusDetailViewResponse;
import com.robinhood.android.lib.margin.hub.p168db.models.BuyingPowerHubView;
import com.robinhood.android.lib.margin.hub.p168db.models.MarginMaintenanceTableView;
import com.robinhood.android.lib.margin.hub.p168db.models.MarginStatusDetailView;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;

/* compiled from: MarginHubStore.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\u00020\u0001:\u00041234B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\fJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020$0\u00162\u0006\u0010\u0017\u001a\u00020\fJ\"\u0010-\u001a\u00020.2\u0006\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010'H\u0086@¢\u0006\u0002\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020$0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/hub/MarginHubStore;", "Lcom/robinhood/store/Store;", "marginHubApi", "Lcom/robinhood/android/lib/margin/hub/api/MarginHubApi;", "maintenanceTableService", "Lbonfire/proto/idl/margin/v1/MaintenanceTableService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/margin/hub/api/MarginHubApi;Lbonfire/proto/idl/margin/v1/MaintenanceTableService;Lcom/robinhood/store/StoreBundle;)V", "buyingPowerHubRelays", "", "", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/lib/margin/hub/db/models/BuyingPowerHubView;", "buyingPowerHubEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/lib/margin/hub/MarginHubStore$BuyingPowerHubRequestParams;", "Lcom/robinhood/android/lib/margin/hub/api/models/ApiBuyingPowerHubView;", "buyingPowerHubQuery", "Lcom/robinhood/android/moria/db/Query;", "streamBuyingPowerHub", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "marginStatusDetailRelays", "Lcom/robinhood/android/lib/margin/hub/db/models/MarginStatusDetailView;", "marginStatusDetailEndpoint", "Lcom/robinhood/android/lib/margin/hub/api/models/MarginStatusDetailViewResponse;", "marginStatusDetailQuery", "streamMarginStatusDetail", "refreshMarginStatusDetail", "Lkotlinx/coroutines/Job;", "marginMaintenanceTableViews", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/android/lib/margin/hub/db/models/MarginMaintenanceTableView;", "marginMaintenanceTableSortParams", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/lib/margin/hub/MarginHubStore$MarginMaintenanceTableSortParams;", "marginMaintenanceTableEndpoint", "Lcom/robinhood/android/lib/margin/hub/MarginHubStore$MarginMaintenanceTableRequestParams;", "Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponseDto;", "marginMaintenanceTableQuery", "streamMarginMaintenanceTable", "refreshMarginMaintenanceTable", "", "sortParams", "(Ljava/lang/String;Lcom/robinhood/android/lib/margin/hub/MarginHubStore$MarginMaintenanceTableSortParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "BuyingPowerHubRequestParams", "MarginMaintenanceTableRequestParams", "MarginMaintenanceTableSortParams", "Companion", "lib-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginHubStore extends Store {
    private static final long POLLING_DURATION_SECONDS = 30;
    private final Endpoint<BuyingPowerHubRequestParams, ApiBuyingPowerHubView> buyingPowerHubEndpoint;
    private final Query<BuyingPowerHubRequestParams, BuyingPowerHubView> buyingPowerHubQuery;
    private final Map<String, BehaviorRelay<BuyingPowerHubView>> buyingPowerHubRelays;
    private final MaintenanceTableService maintenanceTableService;
    private final MarginHubApi marginHubApi;
    private final Endpoint<MarginMaintenanceTableRequestParams, GetMaintenanceTableResponseDto> marginMaintenanceTableEndpoint;
    private final Query<String, MarginMaintenanceTableView> marginMaintenanceTableQuery;
    private final StateFlow2<MarginMaintenanceTableSortParams> marginMaintenanceTableSortParams;
    private final Map<String, SharedFlow2<MarginMaintenanceTableView>> marginMaintenanceTableViews;
    private final Endpoint<String, MarginStatusDetailViewResponse> marginStatusDetailEndpoint;
    private final Query<String, MarginStatusDetailView> marginStatusDetailQuery;
    private final Map<String, BehaviorRelay<MarginStatusDetailView>> marginStatusDetailRelays;

    /* compiled from: MarginHubStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.margin.hub.MarginHubStore", m3645f = "MarginHubStore.kt", m3646l = {188}, m3647m = "refreshMarginMaintenanceTable")
    /* renamed from: com.robinhood.android.lib.margin.hub.MarginHubStore$refreshMarginMaintenanceTable$1 */
    static final class C203241 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C203241(Continuation<? super C203241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MarginHubStore.this.refreshMarginMaintenanceTable(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginHubStore(MarginHubApi marginHubApi, MaintenanceTableService maintenanceTableService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(marginHubApi, "marginHubApi");
        Intrinsics.checkNotNullParameter(maintenanceTableService, "maintenanceTableService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.marginHubApi = marginHubApi;
        this.maintenanceTableService = maintenanceTableService;
        this.buyingPowerHubRelays = new LinkedHashMap();
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.buyingPowerHubEndpoint = Endpoint.Companion.create$default(companion, new MarginHubStore2(this, null), getLogoutKillswitch(), new MarginHubStore3(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.buyingPowerHubQuery = Store.create$default(this, companion2, "buyingPowerHubQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.margin.hub.MarginHubStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginHubStore.buyingPowerHubQuery$lambda$0(this.f$0, (MarginHubStore.BuyingPowerHubRequestParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.lib.margin.hub.MarginHubStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginHubStore.buyingPowerHubQuery$lambda$2(this.f$0, (MarginHubStore.BuyingPowerHubRequestParams) obj);
            }
        }, false, 8, null);
        this.marginStatusDetailRelays = new LinkedHashMap();
        this.marginStatusDetailEndpoint = Endpoint.Companion.create$default(companion, new MarginHubStore7(this, null), getLogoutKillswitch(), new MarginHubStore8(this, null), storeBundle.getClock(), null, 16, null);
        this.marginStatusDetailQuery = Store.create$default(this, companion2, "marginStatusDetailQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.margin.hub.MarginHubStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginHubStore.marginStatusDetailQuery$lambda$3(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.lib.margin.hub.MarginHubStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginHubStore.marginStatusDetailQuery$lambda$5(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.marginMaintenanceTableViews = new LinkedHashMap();
        this.marginMaintenanceTableSortParams = StateFlow4.MutableStateFlow(new MarginMaintenanceTableSortParams("maint_req", "desc"));
        this.marginMaintenanceTableEndpoint = Endpoint.Companion.create$default(companion, new MarginHubStore4(this, null), getLogoutKillswitch(), new MarginHubStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.marginMaintenanceTableQuery = Store.create$default(this, companion2, "marginMaintenanceTableQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.margin.hub.MarginHubStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginHubStore.marginMaintenanceTableQuery$lambda$6(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.lib.margin.hub.MarginHubStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginHubStore.marginMaintenanceTableQuery$lambda$8(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow buyingPowerHubQuery$lambda$0(MarginHubStore marginHubStore, BuyingPowerHubRequestParams request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Endpoint<BuyingPowerHubRequestParams, ApiBuyingPowerHubView> endpoint = marginHubStore.buyingPowerHubEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, request, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow buyingPowerHubQuery$lambda$2(MarginHubStore marginHubStore, BuyingPowerHubRequestParams request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Map<String, BehaviorRelay<BuyingPowerHubView>> map = marginHubStore.buyingPowerHubRelays;
        String accountNumber = request.getAccountNumber();
        BehaviorRelay<BuyingPowerHubView> behaviorRelayCreate = map.get(accountNumber);
        if (behaviorRelayCreate == null) {
            behaviorRelayCreate = BehaviorRelay.create();
            Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
            map.put(accountNumber, behaviorRelayCreate);
        }
        return Context7.buffer$default(RxConvert.asFlow(behaviorRelayCreate), Integer.MAX_VALUE, null, 2, null);
    }

    public static /* synthetic */ Flow streamBuyingPowerHub$default(MarginHubStore marginHubStore, String str, DisplayCurrency displayCurrency, int i, Object obj) {
        if ((i & 2) != 0) {
            displayCurrency = null;
        }
        return marginHubStore.streamBuyingPowerHub(str, displayCurrency);
    }

    public final Flow<BuyingPowerHubView> streamBuyingPowerHub(String accountNumber, DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.buyingPowerHubQuery.asFlow(new BuyingPowerHubRequestParams(accountNumber, displayCurrency));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MarginHubStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/hub/MarginHubStore$BuyingPowerHubRequestParams;", "", "accountNumber", "", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)V", "getAccountNumber", "()Ljava/lang/String;", "getDisplayCurrency", "()Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class BuyingPowerHubRequestParams {
        private final String accountNumber;
        private final DisplayCurrency displayCurrency;

        public static /* synthetic */ BuyingPowerHubRequestParams copy$default(BuyingPowerHubRequestParams buyingPowerHubRequestParams, String str, DisplayCurrency displayCurrency, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buyingPowerHubRequestParams.accountNumber;
            }
            if ((i & 2) != 0) {
                displayCurrency = buyingPowerHubRequestParams.displayCurrency;
            }
            return buyingPowerHubRequestParams.copy(str, displayCurrency);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }

        public final BuyingPowerHubRequestParams copy(String accountNumber, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new BuyingPowerHubRequestParams(accountNumber, displayCurrency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BuyingPowerHubRequestParams)) {
                return false;
            }
            BuyingPowerHubRequestParams buyingPowerHubRequestParams = (BuyingPowerHubRequestParams) other;
            return Intrinsics.areEqual(this.accountNumber, buyingPowerHubRequestParams.accountNumber) && this.displayCurrency == buyingPowerHubRequestParams.displayCurrency;
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            DisplayCurrency displayCurrency = this.displayCurrency;
            return iHashCode + (displayCurrency == null ? 0 : displayCurrency.hashCode());
        }

        public String toString() {
            return "BuyingPowerHubRequestParams(accountNumber=" + this.accountNumber + ", displayCurrency=" + this.displayCurrency + ")";
        }

        public BuyingPowerHubRequestParams(String accountNumber, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.displayCurrency = displayCurrency;
        }

        public /* synthetic */ BuyingPowerHubRequestParams(String str, DisplayCurrency displayCurrency, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : displayCurrency);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow marginStatusDetailQuery$lambda$3(MarginHubStore marginHubStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint<String, MarginStatusDetailViewResponse> endpoint = marginHubStore.marginStatusDetailEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, accountNumber, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow marginStatusDetailQuery$lambda$5(MarginHubStore marginHubStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, BehaviorRelay<MarginStatusDetailView>> map = marginHubStore.marginStatusDetailRelays;
        BehaviorRelay<MarginStatusDetailView> behaviorRelayCreate = map.get(accountNumber);
        if (behaviorRelayCreate == null) {
            behaviorRelayCreate = BehaviorRelay.create();
            Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
            map.put(accountNumber, behaviorRelayCreate);
        }
        return Context7.buffer$default(RxConvert.asFlow(behaviorRelayCreate), Integer.MAX_VALUE, null, 2, null);
    }

    public final Flow<MarginStatusDetailView> streamMarginStatusDetail(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.marginStatusDetailQuery.asFlow(accountNumber);
    }

    public final Job refreshMarginStatusDetail(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.refresh$default(this.marginStatusDetailEndpoint, accountNumber, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow marginMaintenanceTableQuery$lambda$6(MarginHubStore marginHubStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint<MarginMaintenanceTableRequestParams, GetMaintenanceTableResponseDto> endpoint = marginHubStore.marginMaintenanceTableEndpoint;
        MarginHubStore6 marginHubStore6 = new MarginHubStore6(marginHubStore, accountNumber, null);
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.pollWithDynamicParams$default(endpoint, marginHubStore6, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow marginMaintenanceTableQuery$lambda$8(MarginHubStore marginHubStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, SharedFlow2<MarginMaintenanceTableView>> map = marginHubStore.marginMaintenanceTableViews;
        SharedFlow2<MarginMaintenanceTableView> sharedFlow2MutableSharedFlow$default = map.get(accountNumber);
        if (sharedFlow2MutableSharedFlow$default == null) {
            sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
            map.put(accountNumber, sharedFlow2MutableSharedFlow$default);
        }
        return sharedFlow2MutableSharedFlow$default;
    }

    public final Flow<MarginMaintenanceTableView> streamMarginMaintenanceTable(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.marginMaintenanceTableQuery.asFlow(accountNumber);
    }

    public static /* synthetic */ Object refreshMarginMaintenanceTable$default(MarginHubStore marginHubStore, String str, MarginMaintenanceTableSortParams marginMaintenanceTableSortParams, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            marginMaintenanceTableSortParams = null;
        }
        return marginHubStore.refreshMarginMaintenanceTable(str, marginMaintenanceTableSortParams, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshMarginMaintenanceTable(String str, MarginMaintenanceTableSortParams marginMaintenanceTableSortParams, Continuation<? super Unit> continuation) {
        C203241 c203241;
        if (continuation instanceof C203241) {
            c203241 = (C203241) continuation;
            int i = c203241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c203241.label = i - Integer.MIN_VALUE;
            } else {
                c203241 = new C203241(continuation);
            }
        }
        Object obj = c203241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c203241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (marginMaintenanceTableSortParams != null) {
                StateFlow2<MarginMaintenanceTableSortParams> stateFlow2 = this.marginMaintenanceTableSortParams;
                c203241.L$0 = str;
                c203241.label = 1;
                if (stateFlow2.emit(marginMaintenanceTableSortParams, c203241) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c203241.L$0;
            ResultKt.throwOnFailure(obj);
        }
        MarginMaintenanceTableSortParams value = this.marginMaintenanceTableSortParams.getValue();
        Endpoint.DefaultImpls.refresh$default(this.marginMaintenanceTableEndpoint, new MarginMaintenanceTableRequestParams(str, value.getSortBy(), value.getSortDirection()), true, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MarginHubStore.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/hub/MarginHubStore$MarginMaintenanceTableRequestParams;", "", "accountNumber", "", "sortBy", "sortDirection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getSortBy", "getSortDirection", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class MarginMaintenanceTableRequestParams {
        private final String accountNumber;
        private final String sortBy;
        private final String sortDirection;

        public static /* synthetic */ MarginMaintenanceTableRequestParams copy$default(MarginMaintenanceTableRequestParams marginMaintenanceTableRequestParams, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marginMaintenanceTableRequestParams.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = marginMaintenanceTableRequestParams.sortBy;
            }
            if ((i & 4) != 0) {
                str3 = marginMaintenanceTableRequestParams.sortDirection;
            }
            return marginMaintenanceTableRequestParams.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSortBy() {
            return this.sortBy;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSortDirection() {
            return this.sortDirection;
        }

        public final MarginMaintenanceTableRequestParams copy(String accountNumber, String sortBy, String sortDirection) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new MarginMaintenanceTableRequestParams(accountNumber, sortBy, sortDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginMaintenanceTableRequestParams)) {
                return false;
            }
            MarginMaintenanceTableRequestParams marginMaintenanceTableRequestParams = (MarginMaintenanceTableRequestParams) other;
            return Intrinsics.areEqual(this.accountNumber, marginMaintenanceTableRequestParams.accountNumber) && Intrinsics.areEqual(this.sortBy, marginMaintenanceTableRequestParams.sortBy) && Intrinsics.areEqual(this.sortDirection, marginMaintenanceTableRequestParams.sortDirection);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            String str = this.sortBy;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sortDirection;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MarginMaintenanceTableRequestParams(accountNumber=" + this.accountNumber + ", sortBy=" + this.sortBy + ", sortDirection=" + this.sortDirection + ")";
        }

        public MarginMaintenanceTableRequestParams(String accountNumber, String str, String str2) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.sortBy = str;
            this.sortDirection = str2;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getSortBy() {
            return this.sortBy;
        }

        public final String getSortDirection() {
            return this.sortDirection;
        }
    }

    /* compiled from: MarginHubStore.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/hub/MarginHubStore$MarginMaintenanceTableSortParams;", "", "sortBy", "", "sortDirection", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSortBy", "()Ljava/lang/String;", "getSortDirection", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarginMaintenanceTableSortParams {
        private final String sortBy;
        private final String sortDirection;

        public static /* synthetic */ MarginMaintenanceTableSortParams copy$default(MarginMaintenanceTableSortParams marginMaintenanceTableSortParams, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marginMaintenanceTableSortParams.sortBy;
            }
            if ((i & 2) != 0) {
                str2 = marginMaintenanceTableSortParams.sortDirection;
            }
            return marginMaintenanceTableSortParams.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSortBy() {
            return this.sortBy;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSortDirection() {
            return this.sortDirection;
        }

        public final MarginMaintenanceTableSortParams copy(String sortBy, String sortDirection) {
            return new MarginMaintenanceTableSortParams(sortBy, sortDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginMaintenanceTableSortParams)) {
                return false;
            }
            MarginMaintenanceTableSortParams marginMaintenanceTableSortParams = (MarginMaintenanceTableSortParams) other;
            return Intrinsics.areEqual(this.sortBy, marginMaintenanceTableSortParams.sortBy) && Intrinsics.areEqual(this.sortDirection, marginMaintenanceTableSortParams.sortDirection);
        }

        public int hashCode() {
            String str = this.sortBy;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sortDirection;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MarginMaintenanceTableSortParams(sortBy=" + this.sortBy + ", sortDirection=" + this.sortDirection + ")";
        }

        public MarginMaintenanceTableSortParams(String str, String str2) {
            this.sortBy = str;
            this.sortDirection = str2;
        }

        public final String getSortBy() {
            return this.sortBy;
        }

        public final String getSortDirection() {
            return this.sortDirection;
        }
    }
}
