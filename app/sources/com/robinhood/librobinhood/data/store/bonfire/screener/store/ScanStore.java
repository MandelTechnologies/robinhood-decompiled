package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.equityscreener.models.LocalScreenerMetadata;
import com.robinhood.equityscreener.models.dao.ScanResultResponseDao;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ScanStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;", "scanResultDao", "Lcom/robinhood/equityscreener/models/dao/ScanResultResponseDao;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;Lcom/robinhood/equityscreener/models/dao/ScanResultResponseDao;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;Lcom/robinhood/store/StoreBundle;)V", "scanEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore$ScanRequest;", "Lcom/robinhood/equityscreener/models/db/ScanResultResponse;", "scanQuery", "Lcom/robinhood/android/moria/db/Query;", "scan", "Lio/reactivex/Observable;", "screenerId", "", "shouldPoll", "", "accountNumber", "ScanRequest", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ScanStore extends Store {
    private final ScreenersApi api;
    private final IndicatorsStore indicatorsStore;
    private final Endpoint<ScanRequest, ScanResultResponse> scanEndpoint;
    private final Query<ScanRequest, ScanResultResponse> scanQuery;
    private final ScanResultResponseDao scanResultDao;
    private final ScreenersStore screenersStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanStore(ScreenersApi api, ScanResultResponseDao scanResultDao, IndicatorsStore indicatorsStore, ScreenersStore screenersStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(scanResultDao, "scanResultDao");
        Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.scanResultDao = scanResultDao;
        this.indicatorsStore = indicatorsStore;
        this.screenersStore = screenersStore;
        this.scanEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ScanStore2(this, null), getLogoutKillswitch(), new ScanStore3(scanResultDao), storeBundle.getClock(), null, 16, null);
        this.scanQuery = Store.create$default(this, Query.INSTANCE, "scan query", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScanStore.scanQuery$lambda$0(this.f$0, (ScanStore.ScanRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScanStore.scanQuery$lambda$1(this.f$0, (ScanStore.ScanRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object scanEndpoint$insert(ScanResultResponseDao scanResultResponseDao, ScanResultResponse scanResultResponse, Continuation continuation) {
        scanResultResponseDao.insert(scanResultResponse);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow scanQuery$lambda$0(ScanStore scanStore, ScanRequest params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.poll$default(scanStore.scanEndpoint, params, Durations.FIVE_MINUTES, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow scanQuery$lambda$1(ScanStore scanStore, ScanRequest params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return scanStore.scanResultDao.getScanResults(params.toString());
    }

    public static /* synthetic */ Observable scan$default(ScanStore scanStore, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return scanStore.scan(str, z, str2);
    }

    public final Observable<ScanResultResponse> scan(String screenerId, final boolean shouldPoll, final String accountNumber) {
        Observables observables = Observables.INSTANCE;
        ObservableSource map = this.screenersStore.getLocalScreener(screenerId).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore.scan.1
            @Override // io.reactivex.functions.Function
            public final Screener apply(LocalScreenerMetadata it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getScreener();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableCombineLatest = Observable.combineLatest(map, this.indicatorsStore.getDefaultIndicatorKeys(), this.indicatorsStore.getDefaultColumnKeys(), new Function3<T1, T2, T3, R>() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore$scan$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return (R) new ScanStore.ScanRequest((Screener) t1, (List) t2, accountNumber, (List) t3, shouldPoll);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Observable<ScanResultResponse> observableSwitchMap = observableCombineLatest.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore.scan.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ScanResultResponse> apply(ScanRequest request) {
                Intrinsics.checkNotNullParameter(request, "request");
                return ScanStore.this.scanQuery.asObservable(request);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* compiled from: ScanStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore$ScanRequest;", "", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "defaultIndicators", "", "", "accountNumber", "defaultColumns", "shouldPoll", "", "<init>", "(Lcom/robinhood/equityscreener/models/db/Screener;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Z)V", "getScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "getDefaultIndicators", "()Ljava/util/List;", "getAccountNumber", "()Ljava/lang/String;", "getDefaultColumns", "getShouldPoll", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScanRequest {
        private final String accountNumber;
        private final List<String> defaultColumns;
        private final List<String> defaultIndicators;
        private final Screener screener;
        private final boolean shouldPoll;

        public static /* synthetic */ ScanRequest copy$default(ScanRequest scanRequest, Screener screener, List list, String str, List list2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                screener = scanRequest.screener;
            }
            if ((i & 2) != 0) {
                list = scanRequest.defaultIndicators;
            }
            if ((i & 4) != 0) {
                str = scanRequest.accountNumber;
            }
            if ((i & 8) != 0) {
                list2 = scanRequest.defaultColumns;
            }
            if ((i & 16) != 0) {
                z = scanRequest.shouldPoll;
            }
            boolean z2 = z;
            String str2 = str;
            return scanRequest.copy(screener, list, str2, list2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final Screener getScreener() {
            return this.screener;
        }

        public final List<String> component2() {
            return this.defaultIndicators;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final List<String> component4() {
            return this.defaultColumns;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldPoll() {
            return this.shouldPoll;
        }

        public final ScanRequest copy(Screener screener, List<String> defaultIndicators, String accountNumber, List<String> defaultColumns, boolean shouldPoll) {
            Intrinsics.checkNotNullParameter(screener, "screener");
            Intrinsics.checkNotNullParameter(defaultIndicators, "defaultIndicators");
            Intrinsics.checkNotNullParameter(defaultColumns, "defaultColumns");
            return new ScanRequest(screener, defaultIndicators, accountNumber, defaultColumns, shouldPoll);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScanRequest)) {
                return false;
            }
            ScanRequest scanRequest = (ScanRequest) other;
            return Intrinsics.areEqual(this.screener, scanRequest.screener) && Intrinsics.areEqual(this.defaultIndicators, scanRequest.defaultIndicators) && Intrinsics.areEqual(this.accountNumber, scanRequest.accountNumber) && Intrinsics.areEqual(this.defaultColumns, scanRequest.defaultColumns) && this.shouldPoll == scanRequest.shouldPoll;
        }

        public int hashCode() {
            int iHashCode = ((this.screener.hashCode() * 31) + this.defaultIndicators.hashCode()) * 31;
            String str = this.accountNumber;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.defaultColumns.hashCode()) * 31) + Boolean.hashCode(this.shouldPoll);
        }

        public String toString() {
            return "ScanRequest(screener=" + this.screener + ", defaultIndicators=" + this.defaultIndicators + ", accountNumber=" + this.accountNumber + ", defaultColumns=" + this.defaultColumns + ", shouldPoll=" + this.shouldPoll + ")";
        }

        public ScanRequest(Screener screener, List<String> defaultIndicators, String str, List<String> defaultColumns, boolean z) {
            Intrinsics.checkNotNullParameter(screener, "screener");
            Intrinsics.checkNotNullParameter(defaultIndicators, "defaultIndicators");
            Intrinsics.checkNotNullParameter(defaultColumns, "defaultColumns");
            this.screener = screener;
            this.defaultIndicators = defaultIndicators;
            this.accountNumber = str;
            this.defaultColumns = defaultColumns;
            this.shouldPoll = z;
        }

        public final Screener getScreener() {
            return this.screener;
        }

        public final List<String> getDefaultIndicators() {
            return this.defaultIndicators;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final List<String> getDefaultColumns() {
            return this.defaultColumns;
        }

        public final boolean getShouldPoll() {
            return this.shouldPoll;
        }
    }
}
