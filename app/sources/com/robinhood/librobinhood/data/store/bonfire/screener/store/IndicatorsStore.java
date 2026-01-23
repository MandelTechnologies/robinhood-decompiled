package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.equityscreener.models.api.ColumnInformation;
import com.robinhood.equityscreener.models.dao.IndicatorsDao;
import com.robinhood.equityscreener.models.p294db.AllIndicatorsResponse;
import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicatorGroup;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Duration;

/* compiled from: IndicatorsStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0011J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140\u0011J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00140\u0011J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u0011J\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\r0\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;", "allIndicatorsDao", "Lcom/robinhood/equityscreener/models/dao/IndicatorsDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;Lcom/robinhood/equityscreener/models/dao/IndicatorsDao;Lcom/robinhood/store/StoreBundle;)V", "indicatorsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/equityscreener/models/db/AllIndicatorsResponse;", "allIndicatorsQuery", "Lcom/robinhood/android/moria/db/Query;", "allIndicatorsObs", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "getIndicatorGroups", "", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicatorGroup;", "getIndicator", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicator;", "key", "", "getAvailableColumns", "Lcom/robinhood/equityscreener/models/api/ColumnInformation;", "getIndicators", "getDefaultColumnKeys", "getDefaultIndicatorKeys", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class IndicatorsStore extends Store {
    private final IndicatorsDao allIndicatorsDao;
    private final Observable<AllIndicatorsResponse> allIndicatorsObs;
    private final Query<Unit, AllIndicatorsResponse> allIndicatorsQuery;
    private final ScreenersApi api;
    private final Endpoint<Unit, AllIndicatorsResponse> indicatorsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorsStore(ScreenersApi api, IndicatorsDao allIndicatorsDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(allIndicatorsDao, "allIndicatorsDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.allIndicatorsDao = allIndicatorsDao;
        this.indicatorsEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new IndicatorsStore2(this, null), getLogoutKillswitch(), new IndicatorsStore3(allIndicatorsDao), storeBundle.getClock(), null, 16, null);
        Query<Unit, AllIndicatorsResponse> queryCreate$default = Store.create$default(this, Query.INSTANCE, "pollAllIndicators", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndicatorsStore.allIndicatorsQuery$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndicatorsStore.allIndicatorsQuery$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.allIndicatorsQuery = queryCreate$default;
        Observable<AllIndicatorsResponse> observableRefCount = QueryKt.asObservable(queryCreate$default).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        this.allIndicatorsObs = observableRefCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object indicatorsEndpoint$insert(IndicatorsDao indicatorsDao, AllIndicatorsResponse allIndicatorsResponse, Continuation continuation) {
        indicatorsDao.insert(allIndicatorsResponse);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow allIndicatorsQuery$lambda$0(IndicatorsStore indicatorsStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<Unit, AllIndicatorsResponse> endpoint = indicatorsStore.indicatorsEndpoint;
        Unit unit = Unit.INSTANCE;
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, unit, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow allIndicatorsQuery$lambda$1(IndicatorsStore indicatorsStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return indicatorsStore.allIndicatorsDao.getAllIndicators();
    }

    public final Observable<List<ScreenerIndicatorGroup>> getIndicatorGroups() {
        Observable map = this.allIndicatorsObs.map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore.getIndicatorGroups.1
            @Override // io.reactivex.functions.Function
            public final List<ScreenerIndicatorGroup> apply(AllIndicatorsResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return response.getGroups();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<ScreenerIndicator> getIndicator(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Observable<R> map = getIndicatorGroups().map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore$getIndicator$$inlined$mapNotNull$1
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                ScreenerIndicator screenerIndicator;
                Intrinsics.checkNotNullParameter(it, "it");
                Iterator<T> it2 = ((List) it).iterator();
                do {
                    screenerIndicator = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Iterator<T> it3 = ((ScreenerIndicatorGroup) it2.next()).getIndicators().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        T next = it3.next();
                        if (Intrinsics.areEqual(((ScreenerIndicator) next).getKey(), key)) {
                            screenerIndicator = next;
                            break;
                        }
                    }
                    screenerIndicator = screenerIndicator;
                } while (screenerIndicator == null);
                return Optional3.asOptional(screenerIndicator);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((IndicatorsStore$getIndicator$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ObservablesKt.filterIsPresent(map);
    }

    public final Observable<List<ColumnInformation>> getAvailableColumns() {
        Observable map = this.allIndicatorsObs.map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore.getAvailableColumns.1
            @Override // io.reactivex.functions.Function
            public final List<ColumnInformation> apply(AllIndicatorsResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return response.getAllColumns();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<List<ScreenerIndicator>> getIndicators() {
        Observable map = getIndicatorGroups().map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore.getIndicators.1
            @Override // io.reactivex.functions.Function
            public final List<ScreenerIndicator> apply(List<ScreenerIndicatorGroup> groups) {
                Intrinsics.checkNotNullParameter(groups, "groups");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = groups.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, ((ScreenerIndicatorGroup) it.next()).getIndicators());
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<List<String>> getDefaultColumnKeys() {
        Observable map = this.allIndicatorsObs.map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore.getDefaultColumnKeys.1
            @Override // io.reactivex.functions.Function
            public final List<String> apply(AllIndicatorsResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return response.getDefaultColumns();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<List<String>> getDefaultIndicatorKeys() {
        Observable<AllIndicatorsResponse> observable = this.allIndicatorsObs;
        final C347461 c347461 = new PropertyReference1Impl() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore.getDefaultIndicatorKeys.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((AllIndicatorsResponse) obj).getDefaultIndicatorKeys();
            }
        };
        Observable<List<String>> observableAutoConnect = observable.map(new Function(c347461) { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c347461, "function");
                this.function = c347461;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged((Function<? super R, K>) C347472.INSTANCE).replay(1).autoConnect();
        Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "autoConnect(...)");
        return observableAutoConnect;
    }

    /* compiled from: IndicatorsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore$getDefaultIndicatorKeys$2 */
    static final class C347472<T, R> implements Function {
        public static final C347472<T, R> INSTANCE = new C347472<>();

        C347472() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence apply$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }

        @Override // io.reactivex.functions.Function
        public final String apply(List<String> keys) {
            Intrinsics.checkNotNullParameter(keys, "keys");
            return CollectionsKt.joinToString$default(CollectionsKt.sorted(keys), null, null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore$getDefaultIndicatorKeys$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IndicatorsStore.C347472.apply$lambda$0((String) obj);
                }
            }, 31, null);
        }
    }
}
