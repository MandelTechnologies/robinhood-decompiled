package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.equityscreener.models.LocalScreenerMetadata;
import com.robinhood.equityscreener.models.SaveScreenerResult;
import com.robinhood.equityscreener.models.api.ApiSaveScreenerResponseErrorBody;
import com.robinhood.equityscreener.models.api.ScreenerOrder;
import com.robinhood.equityscreener.models.dao.ScreenersDao;
import com.robinhood.equityscreener.models.p294db.DraftScreener;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.equityscreener.models.p294db.ScreenerState;
import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.models.p320db.bonfire.ListsOrder;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import com.robinhood.shared.store.lists.store.ListsOrderStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.moshi.LazyMoshi;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: ScreenersStore.kt */
@Metadata(m3635d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 X2\u00020\u0001:\u0005XYZ[\\B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ0\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#J0\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010$\u001a\u00020#J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00112\u0006\u0010$\u001a\u00020#J;\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010.\u001a\u00020#2\u0019\b\u0002\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001300¢\u0006\u0002\b1J\u0016\u00102\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u00104J/\u00105\u001a\b\u0012\u0004\u0012\u00020#0,2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001300¢\u0006\u0002\b1J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020#0,2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ$\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010:\u001a\u00020\u001fJ(\u0010;\u001a\b\u0012\u0004\u0012\u00020#0,2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010:\u001a\u00020\u001f2\b\u0010<\u001a\u0004\u0018\u00010=J\u000e\u0010>\u001a\u00020?H\u0086@¢\u0006\u0002\u0010@J*\u0010W\u001a\b\u0012\u0004\u0012\u0002090\u0012*\b\u0012\u0004\u0012\u0002090\u00122\u0006\u0010:\u001a\u00020\u001f2\b\u0010<\u001a\u0004\u0018\u00010=H\u0002J,\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120!*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120!2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R5\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R \u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0013080BX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020D0BX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010E\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020(08\u0012\u0004\u0012\u00020D0BX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0BX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0BX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\bJ\u0010KR \u0010L\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120MX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010N\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020(0O\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120MX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020Q0MX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010R\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020S080MX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020#0MX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\bU\u0010KR\u001a\u0010V\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u001f0MX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006]"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;", "screenersDao", "Lcom/robinhood/equityscreener/models/dao/ScreenersDao;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "listsOrderStore", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;Lcom/robinhood/equityscreener/models/dao/ScreenersDao;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;Lcom/robinhood/shared/store/lists/store/ListsOrderStore;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;)V", "screenersObservable", "Lio/reactivex/Observable;", "", "Lcom/robinhood/equityscreener/models/db/Screener;", "kotlin.jvm.PlatformType", "getScreenersObservable", "()Lio/reactivex/Observable;", "screenersObservable$delegate", "Lkotlin/Lazy;", "presetsObservable", "getPresetsObservable", "presetsObservable$delegate", "getLocalScreener", "Lcom/robinhood/equityscreener/models/LocalScreenerMetadata;", "screenerId", "", "getScreeners", "Lkotlinx/coroutines/flow/Flow;", "includeFilters", "", "forSearch", "sorted", "getPresetScreeners", "screenerOrder", "Lcom/robinhood/equityscreener/models/api/ScreenerOrder;", "getScreenersData", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersData;", "saveScreener", "Lio/reactivex/Single;", "Lcom/robinhood/equityscreener/models/SaveScreenerResult;", "alwaysSaveNewCopy", "mutation", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "deleteScreener", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDraftScreener", "resetFilters", "getFilter", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/equityscreener/models/db/Screener$Filter;", "key", "setFilter", "filter", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerFilter;", "clearDrafts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "screenerEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "screenersEndpoint", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersResponse;", "presetsEndpoint", "saveScreenerEndpoint", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$SaveScreenerRequest;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$SaveScreenerResponse;", "deleteScreenerEndpoint", "getDeleteScreenerEndpoint$annotations", "()V", "screenersQuery", "Lcom/robinhood/android/moria/db/Query;", "presetScreenersQuery", "Lkotlin/Pair;", "screenerQuery", "Lcom/robinhood/equityscreener/models/db/ScreenerState;", "draftScreenerQuery", "Lcom/robinhood/equityscreener/models/db/DraftScreener;", "isDuplicateDisplayName", "isDuplicateDisplayName$annotations", "defaultScreenerIdQuery", "updateFilter", "Companion", "ScreenersData", "SaveScreenerResponse", "SaveScreenerRequest", "ScreenersResponse", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ScreenersStore extends Store {
    private static final String DefaultSortBy = "price";
    private final ScreenersApi api;
    private final Query<Unit, String> defaultScreenerIdQuery;
    private final Endpoint<String, String> deleteScreenerEndpoint;
    private final Query<String, Optional<DraftScreener>> draftScreenerQuery;
    private final IndicatorsStore indicatorsStore;
    private final Query<String, Boolean> isDuplicateDisplayName;
    private final ListsOrderStore listsOrderStore;
    private final LazyMoshi moshi;
    private final Query<Tuples2<Boolean, ? extends ScreenerOrder>, List<Screener>> presetScreenersQuery;
    private final Endpoint<Optional<ScreenerOrder>, ScreenersResponse> presetsEndpoint;

    /* renamed from: presetsObservable$delegate, reason: from kotlin metadata */
    private final Lazy presetsObservable;
    private final Endpoint<SaveScreenerRequest, SaveScreenerResponse> saveScreenerEndpoint;
    private final Endpoint<String, Optional<Screener>> screenerEndpoint;
    private final Query<String, ScreenerState> screenerQuery;
    private final ScreenersDao screenersDao;
    private final Endpoint<Unit, ScreenersResponse> screenersEndpoint;

    /* renamed from: screenersObservable$delegate, reason: from kotlin metadata */
    private final Lazy screenersObservable;
    private final Query<Boolean, List<Screener>> screenersQuery;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DefaultEmoji = "💡";
    private static final String DefaultSortDirection = "DESC";
    private static final Screener DefaultScreener = new Screener("", "", null, DefaultEmoji, null, "price", DefaultSortDirection, CollectionsKt.emptyList(), false, 0, MapsKt.emptyMap(), CollectionsKt.emptyList(), true, 512, null);

    private static /* synthetic */ void getDeleteScreenerEndpoint$annotations() {
    }

    private static /* synthetic */ void isDuplicateDisplayName$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screener saveScreener$lambda$2(Screener screener) {
        Intrinsics.checkNotNullParameter(screener, "<this>");
        return screener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenersStore(ScreenersApi api, ScreenersDao screenersDao, IndicatorsStore indicatorsStore, ListsOrderStore listsOrderStore, LazyMoshi moshi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(screenersDao, "screenersDao");
        Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
        Intrinsics.checkNotNullParameter(listsOrderStore, "listsOrderStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.screenersDao = screenersDao;
        this.indicatorsStore = indicatorsStore;
        this.listsOrderStore = listsOrderStore;
        this.moshi = moshi;
        this.screenersObservable = LazyKt.lazy(new Function0() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScreenersStore.screenersObservable_delegate$lambda$0(this.f$0);
            }
        });
        this.presetsObservable = LazyKt.lazy(new Function0() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScreenersStore.presetsObservable_delegate$lambda$1(this.f$0);
            }
        });
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.screenerEndpoint = Endpoint.Companion.create$default(companion, new ScreenersStore$screenerEndpoint$1(this, null), getLogoutKillswitch(), new ScreenersStore$screenerEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.screenersEndpoint = Endpoint.Companion.create$default(companion, new ScreenersStore$screenersEndpoint$1(this, null), getLogoutKillswitch(), new ScreenersStore$screenersEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.presetsEndpoint = Endpoint.Companion.create$default(companion, new ScreenersStore$presetsEndpoint$1(this, null), getLogoutKillswitch(), new ScreenersStore$presetsEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.saveScreenerEndpoint = Endpoint.Companion.create$default(companion, new ScreenersStore$saveScreenerEndpoint$1(this, null), getLogoutKillswitch(), new ScreenersStore$saveScreenerEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.deleteScreenerEndpoint = Endpoint.Companion.create$default(companion, new ScreenersStore$deleteScreenerEndpoint$1(this, null), getLogoutKillswitch(), new ScreenersStore$deleteScreenerEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.screenersQuery = Store.create$default(this, companion2, "pollAllScreeners", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenersStore.screenersQuery$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenersStore.screenersQuery$lambda$4(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, false, 8, null);
        this.presetScreenersQuery = Store.create$default(this, companion2, "pollAllPresets", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenersStore.presetScreenersQuery$lambda$5(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenersStore.presetScreenersQuery$lambda$6(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        this.screenerQuery = Store.create$default(this, companion2, "pollScreener", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenersStore.screenerQuery$lambda$7(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenersStore.screenerQuery$lambda$8(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.draftScreenerQuery = Store.create$default(this, companion2, "draftScreenerQuery", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenersStore.draftScreenerQuery$lambda$10(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.isDuplicateDisplayName = Store.create$default(this, companion2, "isDuplicateName", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenersStore.isDuplicateDisplayName$lambda$11(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.defaultScreenerIdQuery = Store.create$default(this, companion2, "somethign", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenersStore.defaultScreenerIdQuery$lambda$12(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    private final Observable<List<Screener>> getScreenersObservable() {
        return (Observable) this.screenersObservable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable screenersObservable_delegate$lambda$0(ScreenersStore screenersStore) {
        return screenersStore.screenersQuery.asObservable(Boolean.FALSE).replay(1).refCount();
    }

    private final Observable<List<Screener>> getPresetsObservable() {
        return (Observable) this.presetsObservable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable presetsObservable_delegate$lambda$1(ScreenersStore screenersStore) {
        return screenersStore.presetScreenersQuery.asObservable(Tuples4.m3642to(Boolean.FALSE, ScreenerOrder.DEFAULT)).replay(1).refCount();
    }

    public final Observable<LocalScreenerMetadata> getLocalScreener(String screenerId) {
        Observable observableSwitchMap;
        if (screenerId != null) {
            observableSwitchMap = this.screenerQuery.asObservable(screenerId);
        } else {
            observableSwitchMap = this.indicatorsStore.getDefaultColumnKeys().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.getLocalScreener.1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends ScreenerState> apply(final List<String> defaultColumns) {
                    Intrinsics.checkNotNullParameter(defaultColumns, "defaultColumns");
                    Observable<R> map = ScreenersStore.this.draftScreenerQuery.asObservable(ScreenersStore.INSTANCE.getDefaultScreener().getId()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$getLocalScreener$1$apply$$inlined$mapNotNull$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // io.reactivex.functions.Function
                        public final Optional<R> apply(T it) {
                            Screener screenerCopy$default;
                            Intrinsics.checkNotNullParameter(it, "it");
                            DraftScreener draftScreener = (DraftScreener) ((Optional) it).getOrNull();
                            if (draftScreener == null || (screenerCopy$default = draftScreener.getScreener()) == null) {
                                Screener defaultScreener = ScreenersStore.INSTANCE.getDefaultScreener();
                                Intrinsics.checkNotNull(defaultColumns);
                                screenerCopy$default = Screener.copy$default(defaultScreener, null, null, null, null, null, null, null, null, false, 0, null, defaultColumns, false, 6143, null);
                            }
                            return Optional3.asOptional(screenerCopy$default);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // io.reactivex.functions.Function
                        public /* bridge */ /* synthetic */ Object apply(Object obj) {
                            return apply((ScreenersStore$getLocalScreener$1$apply$$inlined$mapNotNull$1<T, R>) obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    return ObservablesKt.filterIsPresent(map).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.getLocalScreener.1.2
                        @Override // io.reactivex.functions.Function
                        public final ScreenerState apply(Screener it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new ScreenerState(it, null, 2, null);
                        }
                    });
                }
            });
        }
        Observable<LocalScreenerMetadata> observableSwitchMap2 = observableSwitchMap.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.getLocalScreener.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends LocalScreenerMetadata> apply(ScreenerState results) {
                Intrinsics.checkNotNullParameter(results, "results");
                boolean z = false;
                if (results.getDraftScreener() != null && !Intrinsics.areEqual(results.getScreener(), results.getDraftScreener())) {
                    z = true;
                }
                Screener draftScreener = results.getDraftScreener();
                if (draftScreener == null) {
                    draftScreener = results.getScreener();
                }
                return Observable.just(new LocalScreenerMetadata(draftScreener, z));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        return observableSwitchMap2;
    }

    public static /* synthetic */ Flow getScreeners$default(ScreenersStore screenersStore, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        return screenersStore.getScreeners(z, z2, z3);
    }

    private final Flow<List<Screener>> includeFilters(final Flow<? extends List<Screener>> flow, final boolean z) {
        return new Flow<List<? extends Screener>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$includeFilters$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Screener>> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C347532(flowCollector, z), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$includeFilters$$inlined$map$1$2 */
            public static final class C347532<T> implements FlowCollector {
                final /* synthetic */ boolean $includeFilters$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$includeFilters$$inlined$map$1$2", m3645f = "ScreenersStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$includeFilters$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C347532.this.emit(null, this);
                    }
                }

                public C347532(FlowCollector flowCollector, boolean z) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$includeFilters$inlined = z;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
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
                        List list = (List) obj;
                        if (!this.$includeFilters$inlined) {
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Screener.copy$default((Screener) it.next(), null, null, null, null, null, null, null, CollectionsKt.emptyList(), false, 0, null, null, false, 8063, null));
                            }
                            list = arrayList;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(list, anonymousClass1) == coroutine_suspended) {
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

    public final Flow<List<Screener>> getScreeners(boolean includeFilters, final boolean forSearch, boolean sorted) {
        Observable<List<Screener>> screenersObservable;
        Observable<Optional<ListsOrder>> observableJust;
        Observables observables = Observables.INSTANCE;
        if (includeFilters) {
            screenersObservable = this.screenersQuery.asObservable(Boolean.TRUE);
        } else {
            screenersObservable = getScreenersObservable();
        }
        if (sorted) {
            observableJust = this.listsOrderStore.getOrderedLists();
        } else {
            observableJust = Observable.just(Optional.INSTANCE.m2972of(null));
            Intrinsics.checkNotNull(observableJust);
        }
        Observable map = observables.combineLatest(screenersObservable, observableJust).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.getScreeners.1
            @Override // io.reactivex.functions.Function
            public final List<Screener> apply(Tuples2<? extends List<Screener>, ? extends Optional<ListsOrder>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return UtilsKt.sort(tuples2.component1(), tuples2.component2().getOrNull());
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.getScreeners.2
            @Override // io.reactivex.functions.Function
            public final List<Screener> apply(List<Screener> screeners) {
                Intrinsics.checkNotNullParameter(screeners, "screeners");
                if (!forSearch) {
                    return screeners;
                }
                ArrayList arrayList = new ArrayList();
                for (T t : screeners) {
                    if (!((Screener) t).getHideFromSearch()) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null);
    }

    public static /* synthetic */ Flow getPresetScreeners$default(ScreenersStore screenersStore, boolean z, ScreenerOrder screenerOrder, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            screenerOrder = ScreenerOrder.DEFAULT;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return screenersStore.getPresetScreeners(z, screenerOrder, z2);
    }

    public final Flow<List<Screener>> getPresetScreeners(boolean includeFilters, ScreenerOrder screenerOrder, final boolean forSearch) {
        Observable<List<Screener>> observableAsObservable;
        Intrinsics.checkNotNullParameter(screenerOrder, "screenerOrder");
        if (includeFilters || screenerOrder != ScreenerOrder.DEFAULT) {
            observableAsObservable = this.presetScreenersQuery.asObservable(Tuples4.m3642to(Boolean.TRUE, screenerOrder));
        } else {
            observableAsObservable = getPresetsObservable();
        }
        ObservableSource map = observableAsObservable.map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.getPresetScreeners.1
            @Override // io.reactivex.functions.Function
            public final List<Screener> apply(List<Screener> screeners) {
                Intrinsics.checkNotNullParameter(screeners, "screeners");
                if (!forSearch) {
                    return screeners;
                }
                ArrayList arrayList = new ArrayList();
                for (T t : screeners) {
                    if (!((Screener) t).getHideFromSearch()) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null);
    }

    public final Observable<ScreenersData> getScreenersData(boolean forSearch) {
        final ScreenersData screenersData = new ScreenersData(null, null, false, 7, null);
        Observable<ScreenersData> observableMergeWith = Observables.INSTANCE.combineLatest(asObservable(getScreeners$default(this, false, forSearch, false, 5, null)), asObservable(getPresetScreeners$default(this, false, null, forSearch, 3, null)), this.defaultScreenerIdQuery.asObservable(Unit.INSTANCE)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.getScreenersData.1
            @Override // io.reactivex.functions.Function
            public final ScreenersData apply(Tuples3<? extends List<Screener>, ? extends List<Screener>, String> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                List<Screener> listComponent1 = tuples3.component1();
                List<Screener> listComponent2 = tuples3.component2();
                return screenersData.copy(CollectionsKt.plus((Collection) listComponent1, (Iterable) listComponent2), tuples3.component3(), false);
            }
        }).onErrorResumeNext(Observable.just(screenersData)).mergeWith(Observable.just(ScreenersData.copy$default(screenersData, null, null, true, 3, null)));
        Intrinsics.checkNotNullExpressionValue(observableMergeWith, "mergeWith(...)");
        return observableMergeWith;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Single saveScreener$default(ScreenersStore screenersStore, String str, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ScreenersStore.saveScreener$lambda$2((Screener) obj2);
                }
            };
        }
        return screenersStore.saveScreener(str, z, function1);
    }

    public final Single<SaveScreenerResult> saveScreener(String screenerId, final boolean alwaysSaveNewCopy, final Function1<? super Screener, Screener> mutation) {
        Intrinsics.checkNotNullParameter(mutation, "mutation");
        Single<LocalScreenerMetadata> singleFirstOrError = getLocalScreener(screenerId).firstOrError();
        final C347642 c347642 = new PropertyReference1Impl() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.saveScreener.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((LocalScreenerMetadata) obj).getScreener();
            }
        };
        Single<SaveScreenerResult> singleOnErrorReturn = singleFirstOrError.map(new Function(c347642) { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c347642, "function");
                this.function = c347642;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.saveScreener.3

            /* compiled from: ScreenersStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/equityscreener/models/SaveScreenerResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$saveScreener$3$1", m3645f = "ScreenersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$saveScreener$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SaveScreenerResult>, Object> {
                final /* synthetic */ boolean $alwaysSaveNewCopy;
                final /* synthetic */ Screener $localScreener;
                final /* synthetic */ Function1<Screener, Screener> $mutation;
                int label;
                final /* synthetic */ ScreenersStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(ScreenersStore screenersStore, Function1<? super Screener, Screener> function1, Screener screener, boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = screenersStore;
                    this.$mutation = function1;
                    this.$localScreener = screener;
                    this.$alwaysSaveNewCopy = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$mutation, this.$localScreener, this.$alwaysSaveNewCopy, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SaveScreenerResult> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[Catch: Exception -> 0x008a, TRY_LEAVE, TryCatch #2 {Exception -> 0x008a, blocks: (B:34:0x0074, B:36:0x0086), top: B:44:0x0074 }] */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    Endpoint endpoint;
                    SaveScreenerRequest saveScreenerRequest;
                    HttpException httpException;
                    Response<?> response;
                    String strExtractErrorBodyString;
                    ApiSaveScreenerResponseErrorBody apiSaveScreenerResponseErrorBody;
                    String oldId;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            endpoint = this.this$0.saveScreenerEndpoint;
                            Function1<Screener, Screener> function1 = this.$mutation;
                            Screener screener = this.$localScreener;
                            Intrinsics.checkNotNull(screener);
                            saveScreenerRequest = new SaveScreenerRequest(function1.invoke(screener), this.$alwaysSaveNewCopy);
                            this.label = 1;
                            anonymousClass1 = this;
                        } catch (HttpException e) {
                            e = e;
                            anonymousClass1 = this;
                            httpException = e;
                            response = httpException.response();
                            String display_error_title = null;
                            if (response != null) {
                                apiSaveScreenerResponseErrorBody = (ApiSaveScreenerResponseErrorBody) anonymousClass1.this$0.moshi.adapter((Class) ApiSaveScreenerResponseErrorBody.class).fromJson(strExtractErrorBodyString);
                                if (apiSaveScreenerResponseErrorBody != null) {
                                }
                            }
                            return new SaveScreenerResult.Error(display_error_title);
                        }
                        try {
                            obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, saveScreenerRequest, null, anonymousClass1, 2, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (HttpException e2) {
                            e = e2;
                            httpException = e;
                            response = httpException.response();
                            String display_error_title2 = null;
                            if (response != null) {
                            }
                            return new SaveScreenerResult.Error(display_error_title2);
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            ResultKt.throwOnFailure(obj);
                            anonymousClass1 = this;
                        } catch (HttpException e3) {
                            httpException = e3;
                            anonymousClass1 = this;
                            response = httpException.response();
                            String display_error_title22 = null;
                            if (response != null && (strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response)) != null) {
                                try {
                                    apiSaveScreenerResponseErrorBody = (ApiSaveScreenerResponseErrorBody) anonymousClass1.this$0.moshi.adapter((Class) ApiSaveScreenerResponseErrorBody.class).fromJson(strExtractErrorBodyString);
                                    if (apiSaveScreenerResponseErrorBody != null) {
                                        display_error_title22 = apiSaveScreenerResponseErrorBody.getDisplay_error_title();
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            return new SaveScreenerResult.Error(display_error_title22);
                        }
                    }
                    SaveScreenerResponse saveScreenerResponse = (SaveScreenerResponse) obj;
                    Screener savedScreener = saveScreenerResponse.getSavedScreener();
                    if (savedScreener == null || (oldId = savedScreener.getId()) == null) {
                        oldId = saveScreenerResponse.getOldId();
                    }
                    return new SaveScreenerResult.Success(oldId);
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends SaveScreenerResult> apply(Screener localScreener) {
                Intrinsics.checkNotNullParameter(localScreener, "localScreener");
                ScreenersStore screenersStore = ScreenersStore.this;
                return RxFactory.DefaultImpls.rxSingle$default(screenersStore, null, new AnonymousClass1(screenersStore, mutation, localScreener, alwaysSaveNewCopy, null), 1, null);
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.saveScreener.4
            @Override // io.reactivex.functions.Function
            public final SaveScreenerResult apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new SaveScreenerResult.Error(null, 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        return singleOnErrorReturn;
    }

    /* compiled from: ScreenersStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$deleteScreener$2", m3645f = "ScreenersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$deleteScreener$2 */
    static final class C347552 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $screenerId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347552(String str, Continuation<? super C347552> continuation) {
            super(2, continuation);
            this.$screenerId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScreenersStore.this.new C347552(this.$screenerId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C347552) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = ScreenersStore.this.deleteScreenerEndpoint;
                String str = this.$screenerId;
                this.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Object deleteScreener(String str, Continuation<? super Job> continuation) {
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C347552(str, null), 3, null);
    }

    public final Single<Boolean> updateDraftScreener(final String screenerId, final Function1<? super Screener, Screener> mutation) {
        Intrinsics.checkNotNullParameter(mutation, "mutation");
        Single map = getLocalScreener(screenerId).firstOrError().observeOn(Schedulers.m3346io()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.updateDraftScreener.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(LocalScreenerMetadata metaData) {
                Intrinsics.checkNotNullParameter(metaData, "metaData");
                Screener screenerInvoke = mutation.invoke(metaData.getScreener());
                ScreenersDao screenersDao = this.screenersDao;
                String str = screenerId;
                if (str == null) {
                    str = "";
                }
                screenersDao.insert(new DraftScreener(str, screenerInvoke));
                return Boolean.valueOf(!Intrinsics.areEqual(metaData.getScreener(), screenerInvoke));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Single<Boolean> resetFilters(String screenerId) {
        Single singleFlatMap = this.indicatorsStore.getDefaultColumnKeys().firstOrError().flatMap(new C347631(screenerId));
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: ScreenersStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$resetFilters$1 */
    static final class C347631<T, R> implements Function {
        final /* synthetic */ String $screenerId;

        C347631(String str) {
            this.$screenerId = str;
        }

        @Override // io.reactivex.functions.Function
        public final SingleSource<? extends Boolean> apply(final List<String> defaultColumns) {
            Intrinsics.checkNotNullParameter(defaultColumns, "defaultColumns");
            return ScreenersStore.this.updateDraftScreener(this.$screenerId, new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$resetFilters$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ScreenersStore.C347631.apply$lambda$0(defaultColumns, (Screener) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Screener apply$lambda$0(List list, Screener updateDraftScreener) {
            Intrinsics.checkNotNullParameter(updateDraftScreener, "$this$updateDraftScreener");
            List listEmptyList = CollectionsKt.emptyList();
            Intrinsics.checkNotNull(list);
            return Screener.copy$default(updateDraftScreener, null, null, null, null, null, null, null, listEmptyList, false, 0, null, list, false, 6015, null);
        }
    }

    public final Observable<Optional<Screener.Filter>> getFilter(String screenerId, final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Observable map = getLocalScreener(screenerId).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore.getFilter.1
            @Override // io.reactivex.functions.Function
            public final Optional<Screener.Filter> apply(LocalScreenerMetadata metaData) {
                Object next;
                Intrinsics.checkNotNullParameter(metaData, "metaData");
                List<Screener.Filter> filters = metaData.getScreener().getFilters();
                String str = key;
                Iterator<T> it = filters.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((Screener.Filter) next).getKey(), str)) {
                        break;
                    }
                }
                return Optional3.asOptional(next);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Single<Boolean> setFilter(String screenerId, String key, ScreenerFilter filter) {
        Intrinsics.checkNotNullParameter(key, "key");
        Single singleFlatMap = this.indicatorsStore.getIndicator(key).firstOrError().flatMap(new C347671(filter, this, screenerId, key));
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: ScreenersStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$setFilter$1 */
    static final class C347671<T, R> implements Function {
        final /* synthetic */ ScreenerFilter $filter;
        final /* synthetic */ String $key;
        final /* synthetic */ String $screenerId;
        final /* synthetic */ ScreenersStore this$0;

        C347671(ScreenerFilter screenerFilter, ScreenersStore screenersStore, String str, String str2) {
            this.$filter = screenerFilter;
            this.this$0 = screenersStore;
            this.$screenerId = str;
            this.$key = str2;
        }

        @Override // io.reactivex.functions.Function
        public final SingleSource<? extends Boolean> apply(ScreenerIndicator indicator) {
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            final List<String> columnKeys = com.robinhood.equityscreener.models.UtilsKt.toColumnKeys(indicator.getFilter_parameters(), this.$filter);
            final ScreenersStore screenersStore = this.this$0;
            String str = this.$screenerId;
            final String str2 = this.$key;
            final ScreenerFilter screenerFilter = this.$filter;
            return screenersStore.updateDraftScreener(str, new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$setFilter$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ScreenersStore.C347671.apply$lambda$1(screenersStore, str2, screenerFilter, columnKeys, (Screener) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Screener apply$lambda$1(ScreenersStore screenersStore, String str, ScreenerFilter screenerFilter, List list, Screener updateDraftScreener) {
            Intrinsics.checkNotNullParameter(updateDraftScreener, "$this$updateDraftScreener");
            List listUpdateFilter = screenersStore.updateFilter(updateDraftScreener.getFilters(), str, screenerFilter);
            LinkedHashSet linkedHashSet = new LinkedHashSet(updateDraftScreener.getColumns());
            if (screenerFilter == null) {
                linkedHashSet.removeAll(CollectionsKt.toSet(list));
            } else {
                linkedHashSet.addAll(list);
            }
            return Screener.copy$default(updateDraftScreener, null, null, null, null, null, null, null, listUpdateFilter, false, 0, null, CollectionsKt.toList(linkedHashSet), false, 6015, null);
        }
    }

    /* compiled from: ScreenersStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$clearDrafts$2", m3645f = "ScreenersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$clearDrafts$2 */
    static final class C347542 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C347542(Continuation<? super C347542> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScreenersStore.this.new C347542(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C347542) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScreenersDao screenersDao = ScreenersStore.this.screenersDao;
                this.label = 1;
                if (screenersDao.deleteDraftScreeners(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Object clearDrafts(Continuation<? super Unit> continuation) {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C347542(null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow screenersQuery$lambda$3(ScreenersStore screenersStore, boolean z) {
        Endpoint<Unit, ScreenersResponse> endpoint = screenersStore.screenersEndpoint;
        Unit unit = Unit.INSTANCE;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, unit, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow screenersQuery$lambda$4(ScreenersStore screenersStore, boolean z) {
        return screenersStore.includeFilters(screenersStore.screenersDao.getUserScreeners(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow presetScreenersQuery$lambda$5(ScreenersStore screenersStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ScreenerOrder screenerOrder = (ScreenerOrder) tuples2.component2();
        Endpoint<Optional<ScreenerOrder>, ScreenersResponse> endpoint = screenersStore.presetsEndpoint;
        Optional optionalAsOptional = Optional3.asOptional(screenerOrder);
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, optionalAsOptional, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Screener.Filter> updateFilter(List<Screener.Filter> list, String str, ScreenerFilter screenerFilter) {
        Iterator<Screener.Filter> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().getKey(), str)) {
                break;
            }
            i++;
        }
        Screener.Filter filter = (Screener.Filter) CollectionsKt.getOrNull(list, i);
        Screener.Filter filter2 = new Screener.Filter(str, screenerFilter, false);
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        if (screenerFilter != null && filter != null) {
            mutableList.set(i, filter2);
        } else if (filter != null) {
            mutableList.remove(i);
        } else if (screenerFilter != null) {
            mutableList.add(filter2);
        }
        return CollectionsKt.toList(mutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow presetScreenersQuery$lambda$6(ScreenersStore screenersStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return screenersStore.includeFilters(screenersStore.screenersDao.getPresetScreeners((ScreenerOrder) tuples2.component2()), ((Boolean) tuples2.component1()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow screenerQuery$lambda$7(ScreenersStore screenersStore, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Endpoint<String, Optional<Screener>> endpoint = screenersStore.screenerEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(60L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, id, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow screenerQuery$lambda$8(ScreenersStore screenersStore, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return screenersStore.screenersDao.getScreenerState(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow draftScreenerQuery$lambda$10(ScreenersStore screenersStore, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final Flow<DraftScreener> draftScreener = screenersStore.screenersDao.getDraftScreener(id);
        return new Flow<Optional<? extends DraftScreener>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$draftScreenerQuery$lambda$10$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends DraftScreener>> flowCollector, Continuation continuation) {
                Object objCollect = draftScreener.collect(new C347522(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$draftScreenerQuery$lambda$10$$inlined$map$1$2 */
            public static final class C347522<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$draftScreenerQuery$lambda$10$$inlined$map$1$2", m3645f = "ScreenersStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$draftScreenerQuery$lambda$10$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C347522.this.emit(null, this);
                    }
                }

                public C347522(FlowCollector flowCollector) {
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
                        Optional optionalAsOptional = Optional3.asOptional((DraftScreener) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow isDuplicateDisplayName$lambda$11(ScreenersStore screenersStore, String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return screenersStore.screenersDao.hasDisplayName(displayName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow defaultScreenerIdQuery$lambda$12(ScreenersStore screenersStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return screenersStore.screenersDao.getDefaultScreenerId();
    }

    /* compiled from: ScreenersStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$Companion;", "", "<init>", "()V", "DefaultEmoji", "", "DefaultSortBy", "DefaultSortDirection", "DefaultScreener", "Lcom/robinhood/equityscreener/models/db/Screener;", "getDefaultScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Screener getDefaultScreener() {
            return ScreenersStore.DefaultScreener;
        }
    }

    /* compiled from: ScreenersStore.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersData;", "", "screeners", "", "Lcom/robinhood/equityscreener/models/db/Screener;", "defaultScreenerId", "", "loading", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "getScreeners", "()Ljava/util/List;", "getDefaultScreenerId", "()Ljava/lang/String;", "getLoading", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScreenersData {
        private final String defaultScreenerId;
        private final boolean loading;
        private final List<Screener> screeners;

        public ScreenersData() {
            this(null, null, false, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ScreenersData copy$default(ScreenersData screenersData, List list, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = screenersData.screeners;
            }
            if ((i & 2) != 0) {
                str = screenersData.defaultScreenerId;
            }
            if ((i & 4) != 0) {
                z = screenersData.loading;
            }
            return screenersData.copy(list, str, z);
        }

        public final List<Screener> component1() {
            return this.screeners;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDefaultScreenerId() {
            return this.defaultScreenerId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        public final ScreenersData copy(List<Screener> screeners, String defaultScreenerId, boolean loading) {
            Intrinsics.checkNotNullParameter(screeners, "screeners");
            return new ScreenersData(screeners, defaultScreenerId, loading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenersData)) {
                return false;
            }
            ScreenersData screenersData = (ScreenersData) other;
            return Intrinsics.areEqual(this.screeners, screenersData.screeners) && Intrinsics.areEqual(this.defaultScreenerId, screenersData.defaultScreenerId) && this.loading == screenersData.loading;
        }

        public int hashCode() {
            int iHashCode = this.screeners.hashCode() * 31;
            String str = this.defaultScreenerId;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.loading);
        }

        public String toString() {
            return "ScreenersData(screeners=" + this.screeners + ", defaultScreenerId=" + this.defaultScreenerId + ", loading=" + this.loading + ")";
        }

        public ScreenersData(List<Screener> screeners, String str, boolean z) {
            Intrinsics.checkNotNullParameter(screeners, "screeners");
            this.screeners = screeners;
            this.defaultScreenerId = str;
            this.loading = z;
        }

        public /* synthetic */ ScreenersData(List list, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
        }

        public final List<Screener> getScreeners() {
            return this.screeners;
        }

        public final String getDefaultScreenerId() {
            return this.defaultScreenerId;
        }

        public final boolean getLoading() {
            return this.loading;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScreenersStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$SaveScreenerResponse;", "", "oldId", "", "savedScreener", "Lcom/robinhood/equityscreener/models/db/Screener;", "<init>", "(Ljava/lang/String;Lcom/robinhood/equityscreener/models/db/Screener;)V", "getOldId", "()Ljava/lang/String;", "getSavedScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class SaveScreenerResponse {
        private final String oldId;
        private final Screener savedScreener;

        public static /* synthetic */ SaveScreenerResponse copy$default(SaveScreenerResponse saveScreenerResponse, String str, Screener screener, int i, Object obj) {
            if ((i & 1) != 0) {
                str = saveScreenerResponse.oldId;
            }
            if ((i & 2) != 0) {
                screener = saveScreenerResponse.savedScreener;
            }
            return saveScreenerResponse.copy(str, screener);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOldId() {
            return this.oldId;
        }

        /* renamed from: component2, reason: from getter */
        public final Screener getSavedScreener() {
            return this.savedScreener;
        }

        public final SaveScreenerResponse copy(String oldId, Screener savedScreener) {
            Intrinsics.checkNotNullParameter(oldId, "oldId");
            return new SaveScreenerResponse(oldId, savedScreener);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveScreenerResponse)) {
                return false;
            }
            SaveScreenerResponse saveScreenerResponse = (SaveScreenerResponse) other;
            return Intrinsics.areEqual(this.oldId, saveScreenerResponse.oldId) && Intrinsics.areEqual(this.savedScreener, saveScreenerResponse.savedScreener);
        }

        public int hashCode() {
            int iHashCode = this.oldId.hashCode() * 31;
            Screener screener = this.savedScreener;
            return iHashCode + (screener == null ? 0 : screener.hashCode());
        }

        public String toString() {
            return "SaveScreenerResponse(oldId=" + this.oldId + ", savedScreener=" + this.savedScreener + ")";
        }

        public SaveScreenerResponse(String oldId, Screener screener) {
            Intrinsics.checkNotNullParameter(oldId, "oldId");
            this.oldId = oldId;
            this.savedScreener = screener;
        }

        public final String getOldId() {
            return this.oldId;
        }

        public final Screener getSavedScreener() {
            return this.savedScreener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScreenersStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$SaveScreenerRequest;", "", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "alwaysSaveNewCopy", "", "<init>", "(Lcom/robinhood/equityscreener/models/db/Screener;Z)V", "getScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "getAlwaysSaveNewCopy", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class SaveScreenerRequest {
        private final boolean alwaysSaveNewCopy;
        private final Screener screener;

        public static /* synthetic */ SaveScreenerRequest copy$default(SaveScreenerRequest saveScreenerRequest, Screener screener, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                screener = saveScreenerRequest.screener;
            }
            if ((i & 2) != 0) {
                z = saveScreenerRequest.alwaysSaveNewCopy;
            }
            return saveScreenerRequest.copy(screener, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Screener getScreener() {
            return this.screener;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAlwaysSaveNewCopy() {
            return this.alwaysSaveNewCopy;
        }

        public final SaveScreenerRequest copy(Screener screener, boolean alwaysSaveNewCopy) {
            Intrinsics.checkNotNullParameter(screener, "screener");
            return new SaveScreenerRequest(screener, alwaysSaveNewCopy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveScreenerRequest)) {
                return false;
            }
            SaveScreenerRequest saveScreenerRequest = (SaveScreenerRequest) other;
            return Intrinsics.areEqual(this.screener, saveScreenerRequest.screener) && this.alwaysSaveNewCopy == saveScreenerRequest.alwaysSaveNewCopy;
        }

        public int hashCode() {
            return (this.screener.hashCode() * 31) + Boolean.hashCode(this.alwaysSaveNewCopy);
        }

        public String toString() {
            return "SaveScreenerRequest(screener=" + this.screener + ", alwaysSaveNewCopy=" + this.alwaysSaveNewCopy + ")";
        }

        public SaveScreenerRequest(Screener screener, boolean z) {
            Intrinsics.checkNotNullParameter(screener, "screener");
            this.screener = screener;
            this.alwaysSaveNewCopy = z;
        }

        public final boolean getAlwaysSaveNewCopy() {
            return this.alwaysSaveNewCopy;
        }

        public final Screener getScreener() {
            return this.screener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScreenersStore.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersResponse;", "", "results", "", "Lcom/robinhood/equityscreener/models/db/Screener;", "screenerOrder", "Lcom/robinhood/equityscreener/models/api/ScreenerOrder;", "<init>", "(Ljava/util/List;Lcom/robinhood/equityscreener/models/api/ScreenerOrder;)V", "getResults", "()Ljava/util/List;", "getScreenerOrder", "()Lcom/robinhood/equityscreener/models/api/ScreenerOrder;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class ScreenersResponse {
        private final List<Screener> results;
        private final ScreenerOrder screenerOrder;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ScreenersResponse copy$default(ScreenersResponse screenersResponse, List list, ScreenerOrder screenerOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                list = screenersResponse.results;
            }
            if ((i & 2) != 0) {
                screenerOrder = screenersResponse.screenerOrder;
            }
            return screenersResponse.copy(list, screenerOrder);
        }

        public final List<Screener> component1() {
            return this.results;
        }

        /* renamed from: component2, reason: from getter */
        public final ScreenerOrder getScreenerOrder() {
            return this.screenerOrder;
        }

        public final ScreenersResponse copy(List<Screener> results, ScreenerOrder screenerOrder) {
            Intrinsics.checkNotNullParameter(results, "results");
            Intrinsics.checkNotNullParameter(screenerOrder, "screenerOrder");
            return new ScreenersResponse(results, screenerOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenersResponse)) {
                return false;
            }
            ScreenersResponse screenersResponse = (ScreenersResponse) other;
            return Intrinsics.areEqual(this.results, screenersResponse.results) && this.screenerOrder == screenersResponse.screenerOrder;
        }

        public int hashCode() {
            return (this.results.hashCode() * 31) + this.screenerOrder.hashCode();
        }

        public String toString() {
            return "ScreenersResponse(results=" + this.results + ", screenerOrder=" + this.screenerOrder + ")";
        }

        public ScreenersResponse(List<Screener> results, ScreenerOrder screenerOrder) {
            Intrinsics.checkNotNullParameter(results, "results");
            Intrinsics.checkNotNullParameter(screenerOrder, "screenerOrder");
            this.results = results;
            this.screenerOrder = screenerOrder;
        }

        public final List<Screener> getResults() {
            return this.results;
        }

        public final ScreenerOrder getScreenerOrder() {
            return this.screenerOrder;
        }
    }
}
