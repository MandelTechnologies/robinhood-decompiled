package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiOptionPosition;
import com.robinhood.models.api.ApiOptionPositionRequest;
import com.robinhood.models.api.ApiOptionPositionsFromIdsRequest;
import com.robinhood.models.dao.OptionPositionDao;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: OptionPositionStore.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001LB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ*\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190&0*2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020%J\"\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190&0/2\u0006\u0010+\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0010J(\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190&0*2\u0006\u0010+\u001a\u00020\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100&J \u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u000209080*2\u0006\u0010+\u001a\u00020\u001eJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0&0/2\u0006\u0010+\u001a\u00020\u001eJ\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0&0/2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u0010J*\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0!0*2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020=J$\u0010>\u001a\b\u0012\u0004\u0012\u00020?0*2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u00102\u0006\u0010@\u001a\u00020AJ\"\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u001eJ(\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00102\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001e0&J.\u0010G\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0010\b\u0002\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010&2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001e0&J$\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00100&2\u0006\u0010J\u001a\u00020EJ\u001a\u0010K\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR)\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\u001d\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR/\u0010 \u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190!0\u0018¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR2\u0010#\u001a&\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020%0$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190&0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190&0\u0018¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR;\u00103\u001a,\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100&0!0\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190&0\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001bR/\u00105\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190&0\u0018¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001b¨\u0006M"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "dao", "Lcom/robinhood/models/dao/OptionPositionDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/models/dao/OptionPositionDao;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;)V", "getOptionPosition", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiOptionPosition;", "getOptionPositions", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/models/api/ApiOptionPositionRequest;", "getOptionPositionsFromIds", "Lcom/robinhood/models/api/ApiOptionPositionsFromIdsRequest;", "streamUiOptionInstrumentPosition", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "getStreamUiOptionInstrumentPosition", "()Lcom/robinhood/android/moria/db/Query;", "streamUiOptionInstrumentPositionByInstrument", "Lkotlin/Pair;", "", "getStreamUiOptionInstrumentPositionByInstrument", "streamUiOptionInstrumentPositionByInstrumentIncludingZeroQuantity", "Lcom/robinhood/utils/Optional;", "getStreamUiOptionInstrumentPositionByInstrumentIncludingZeroQuantity", "streamUiOptionPositionsForEarlyAssignment", "Lkotlin/Triple;", "Lcom/robinhood/models/db/OptionContractType;", "", "streamUiOptionPositionsFromPositionIds", "getStreamUiOptionPositionsFromPositionIds", "getUiOptionPositionsForEarlyAssignment", "Lio/reactivex/Observable;", "accountNumber", "optionChainId", "contractType", "getUiOptionPositionsForEquityInstrument", "Lkotlinx/coroutines/flow/Flow;", "equityInstrumentId", "getUiOptionPositionsForEquityInstruments", "equityInstrumentIds", "streamUiOptionPositions", "getStreamUiOptionPositions", "streamUiOptionPositionsByUnderlyingId", "getStreamUiOptionPositionsByUnderlyingId", "getOptionPositionCountsByInstrument", "", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "Lcom/robinhood/models/db/OptionInstrumentPosition;", "optionInstrumentId", "type", "Lcom/robinhood/models/db/OptionPositionType;", "getOrderPositionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "side", "Lcom/robinhood/models/db/OrderSide;", "refresh", "", "force", "", "accountNumbers", "refreshWithChainIds", "optionChainIds", "optionInstrumentPositionIds", "nonzero", "refreshWithAllAccounts", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionPositionStore extends Store {
    private static final int OPTION_POSITION_BUFFER_SIZE = 900;
    private final AccountProvider accountProvider;
    private final OptionPositionDao dao;
    private final Endpoint<UUID, ApiOptionPosition> getOptionPosition;
    private final PaginatedEndpoint<ApiOptionPositionRequest, ApiOptionPosition> getOptionPositions;
    private final PaginatedEndpoint<ApiOptionPositionsFromIdsRequest, ApiOptionPosition> getOptionPositionsFromIds;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionsApi optionsApi;
    private final Query<UUID, UiOptionInstrumentPosition> streamUiOptionInstrumentPosition;
    private final Query<Tuples2<String, UUID>, UiOptionInstrumentPosition> streamUiOptionInstrumentPositionByInstrument;
    private final Query<Tuples2<String, UUID>, Optional<UiOptionInstrumentPosition>> streamUiOptionInstrumentPositionByInstrumentIncludingZeroQuantity;
    private final Query<Tuples2<String, ? extends Optional<? extends List<UUID>>>, List<UiOptionInstrumentPosition>> streamUiOptionPositions;
    private final Query<Tuples2<String, UUID>, List<UiOptionInstrumentPosition>> streamUiOptionPositionsByUnderlyingId;
    private final Query<Tuples3<String, UUID, ? extends OptionContractType>, List<UiOptionInstrumentPosition>> streamUiOptionPositionsForEarlyAssignment;
    private final Query<ApiOptionPositionsFromIdsRequest, List<UiOptionInstrumentPosition>> streamUiOptionPositionsFromPositionIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionPositionStore(StoreBundle storeBundle, AccountProvider accountProvider, OptionPositionDao dao, OptionsApi optionsApi, OptionInstrumentStore optionInstrumentStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        this.accountProvider = accountProvider;
        this.dao = dao;
        this.optionsApi = optionsApi;
        this.optionInstrumentStore = optionInstrumentStore;
        Endpoint<UUID, ApiOptionPosition> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new C340791(null), getLogoutKillswitch(), new C340802(null), storeBundle.getClock(), null, 16, null);
        this.getOptionPosition = endpointCreate$default;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        this.getOptionPositions = PaginatedEndpoint.Companion.createWithParams$default(companion, new C340811(null), getLogoutKillswitch(), new C340822(null), storeBundle.getClock(), null, 16, null);
        this.getOptionPositionsFromIds = PaginatedEndpoint.Companion.createWithParams$default(companion, new OptionPositionStore$getOptionPositionsFromIds$1(this, null), getLogoutKillswitch(), new OptionPositionStore$getOptionPositionsFromIds$2(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.streamUiOptionInstrumentPosition = Store.create$default(this, companion2, "streamUiOptionInstrumentPosition", CollectionsKt.listOf(new PollEach(getStoreScope(), new OptionPositionStore$streamUiOptionInstrumentPosition$1(endpointCreate$default))), new OptionPositionStore$streamUiOptionInstrumentPosition$2(dao), false, 8, null);
        this.streamUiOptionInstrumentPositionByInstrument = Store.create$default(this, companion2, "streamUiOptionInstrumentPositionByInstrument", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.streamUiOptionInstrumentPositionByInstrument$lambda$0(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.streamUiOptionInstrumentPositionByInstrument$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        this.streamUiOptionInstrumentPositionByInstrumentIncludingZeroQuantity = Store.createOptional$default(this, companion2, "streamUiOptionInstrumentPositionByInstrumentIncludingZeroQuantity", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.m2618xe84e2058(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.m2619xe84e2059(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        this.streamUiOptionPositionsForEarlyAssignment = Store.create$default(this, companion2, "streamUiOptionPositionsForEarlyAssignment", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.streamUiOptionPositionsForEarlyAssignment$lambda$4(this.f$0, (Tuples3) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.streamUiOptionPositionsForEarlyAssignment$lambda$7(this.f$0, (Tuples3) obj);
            }
        }, false, 8, null);
        this.streamUiOptionPositionsFromPositionIds = Store.create$default(this, companion2, "streamUiOptionPositionsFromPositionIds", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.streamUiOptionPositionsFromPositionIds$lambda$8(this.f$0, (ApiOptionPositionsFromIdsRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.streamUiOptionPositionsFromPositionIds$lambda$14(this.f$0, (ApiOptionPositionsFromIdsRequest) obj);
            }
        }, false, 8, null);
        this.streamUiOptionPositions = Store.create$default(this, companion2, "streamUiOptionPositions", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.streamUiOptionPositions$lambda$15(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.streamUiOptionPositions$lambda$19(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        this.streamUiOptionPositionsByUnderlyingId = Store.create$default(this, companion2, "streamUiOptionPositionsByUnderlyingId", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.streamUiOptionPositionsByUnderlyingId$lambda$20(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPositionStore.streamUiOptionPositionsByUnderlyingId$lambda$21(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: OptionPositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionPosition;", "optionPositionId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPosition$1", m3645f = "OptionPositionStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPosition$1 */
    static final class C340791 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiOptionPosition>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C340791(Continuation<? super C340791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C340791 c340791 = OptionPositionStore.this.new C340791(continuation);
            c340791.L$0 = obj;
            return c340791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super ApiOptionPosition> continuation) {
            return ((C340791) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            OptionsApi optionsApi = OptionPositionStore.this.optionsApi;
            this.label = 1;
            Object optionPosition = optionsApi.getOptionPosition(uuid, this);
            return optionPosition == coroutine_suspended ? coroutine_suspended : optionPosition;
        }
    }

    /* compiled from: OptionPositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiOptionPosition", "Lcom/robinhood/models/api/ApiOptionPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPosition$2", m3645f = "OptionPositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPosition$2 */
    static final class C340802 extends ContinuationImpl7 implements Function2<ApiOptionPosition, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C340802(Continuation<? super C340802> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C340802 c340802 = OptionPositionStore.this.new C340802(continuation);
            c340802.L$0 = obj;
            return c340802;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiOptionPosition apiOptionPosition, Continuation<? super Unit> continuation) {
            return ((C340802) create(apiOptionPosition, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionPositionStore.this.dao.insert((ApiOptionPosition) this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OptionPositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionPosition;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiOptionPositionRequest;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPositions$1", m3645f = "OptionPositionStore.kt", m3646l = {56}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPositions$1 */
    static final class C340811 extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiOptionPositionRequest, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiOptionPosition>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C340811(Continuation<? super C340811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C340811 c340811 = OptionPositionStore.this.new C340811(continuation);
            c340811.L$0 = obj;
            return c340811;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiOptionPositionRequest, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiOptionPosition>> continuation) {
            return invoke2((Tuples2<ApiOptionPositionRequest, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiOptionPosition>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<ApiOptionPositionRequest, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiOptionPosition>> continuation) {
            return ((C340811) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            ApiOptionPositionRequest apiOptionPositionRequest = (ApiOptionPositionRequest) tuples2.component1();
            PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
            OptionsApi optionsApi = OptionPositionStore.this.optionsApi;
            CommaSeparatedList<String> commaSeparatedList = new CommaSeparatedList<>(apiOptionPositionRequest.getAccountNumbers());
            List<UUID> optionChainIds = apiOptionPositionRequest.getOptionChainIds();
            CommaSeparatedList<UUID> commaSeparatedList2 = optionChainIds != null ? new CommaSeparatedList<>(optionChainIds) : null;
            String value = paginationCursor != null ? paginationCursor.getValue() : null;
            this.label = 1;
            Object optionPositions = optionsApi.getOptionPositions(commaSeparatedList, commaSeparatedList2, value, this);
            return optionPositions == coroutine_suspended ? coroutine_suspended : optionPositions;
        }
    }

    /* compiled from: OptionPositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiOptionPositionRequest;", "Lcom/robinhood/models/PaginationCursor;", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPositions$2", m3645f = "OptionPositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPositions$2 */
    static final class C340822 extends ContinuationImpl7 implements Function3<Tuples2<? extends ApiOptionPositionRequest, ? extends PaginationCursor>, PaginatedResult<? extends ApiOptionPosition>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C340822(Continuation<? super C340822> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiOptionPositionRequest, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiOptionPosition> paginatedResult, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<ApiOptionPositionRequest, PaginationCursor>) tuples2, (PaginatedResult<ApiOptionPosition>) paginatedResult, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<ApiOptionPositionRequest, PaginationCursor> tuples2, PaginatedResult<ApiOptionPosition> paginatedResult, Continuation<? super Unit> continuation) {
            C340822 c340822 = OptionPositionStore.this.new C340822(continuation);
            c340822.L$0 = tuples2;
            c340822.L$1 = paginatedResult;
            return c340822.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                PaginatedResult<ApiOptionPosition> paginatedResult = (PaginatedResult) this.L$1;
                ApiOptionPositionRequest apiOptionPositionRequest = (ApiOptionPositionRequest) tuples2.component1();
                OptionPositionStore.this.dao.insert(apiOptionPositionRequest.getAccountNumbers(), apiOptionPositionRequest.getOptionChainIds(), paginatedResult);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Query<UUID, UiOptionInstrumentPosition> getStreamUiOptionInstrumentPosition() {
        return this.streamUiOptionInstrumentPosition;
    }

    public final Query<Tuples2<String, UUID>, UiOptionInstrumentPosition> getStreamUiOptionInstrumentPositionByInstrument() {
        return this.streamUiOptionInstrumentPositionByInstrument;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamUiOptionInstrumentPositionByInstrument$lambda$0(OptionPositionStore optionPositionStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return PaginatedEndpoint.DefaultImpls.pollAllPages$default(optionPositionStore.getOptionPositions, new ApiOptionPositionRequest(CollectionsKt.listOf((String) tuples2.component1()), null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamUiOptionInstrumentPositionByInstrument$lambda$1(OptionPositionStore optionPositionStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return optionPositionStore.dao.getUiOptionPositionByInstrumentId((String) tuples2.component1(), (UUID) tuples2.component2());
    }

    /* renamed from: getStreamUiOptionInstrumentPositionByInstrumentIncludingZeroQuantity */
    public final Query<Tuples2<String, UUID>, Optional<UiOptionInstrumentPosition>> m2620xb17eeacb() {
        return this.streamUiOptionInstrumentPositionByInstrumentIncludingZeroQuantity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamUiOptionInstrumentPositionByInstrumentIncludingZeroQuantity$lambda$2 */
    public static final Flow m2618xe84e2058(OptionPositionStore optionPositionStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return PaginatedEndpoint.DefaultImpls.pollAllPages$default(optionPositionStore.getOptionPositions, new ApiOptionPositionRequest(CollectionsKt.listOf((String) tuples2.component1()), null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamUiOptionInstrumentPositionByInstrumentIncludingZeroQuantity$lambda$3 */
    public static final Flow m2619xe84e2059(OptionPositionStore optionPositionStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return optionPositionStore.dao.getUiOptionPositionByInstrumentIdIncludingZeroQuantity((String) tuples2.component1(), (UUID) tuples2.component2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamUiOptionPositionsForEarlyAssignment$lambda$4(OptionPositionStore optionPositionStore, Tuples3 tuples3) {
        Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
        String str = (String) tuples3.component1();
        return BuildersKt__Builders_commonKt.launch$default(optionPositionStore.getStoreScope(), null, null, new C34087x62bec8a1(optionPositionStore, (UUID) tuples3.component2(), str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamUiOptionPositionsForEarlyAssignment$lambda$7(OptionPositionStore optionPositionStore, Tuples3 tuples3) {
        Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
        final Flow<List<UiOptionInstrumentPosition>> uiOptionPositionsByAccountNumberAndChainAndContractType = optionPositionStore.dao.getUiOptionPositionsByAccountNumberAndChainAndContractType((String) tuples3.component1(), (UUID) tuples3.component2(), (OptionContractType) tuples3.component3());
        return new Flow<List<? extends UiOptionInstrumentPosition>>() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsForEarlyAssignment$lambda$7$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UiOptionInstrumentPosition>> flowCollector, Continuation continuation) {
                Object objCollect = uiOptionPositionsByAccountNumberAndChainAndContractType.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsForEarlyAssignment$lambda$7$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsForEarlyAssignment$lambda$7$$inlined$map$1$2", m3645f = "OptionPositionStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsForEarlyAssignment$lambda$7$$inlined$map$1$2$1, reason: invalid class name */
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
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            if (((UiOptionInstrumentPosition) t).getOptionInstrumentPosition().getPositionType() == OptionPositionType.LONG) {
                                arrayList.add(t);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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

    public final Query<ApiOptionPositionsFromIdsRequest, List<UiOptionInstrumentPosition>> getStreamUiOptionPositionsFromPositionIds() {
        return this.streamUiOptionPositionsFromPositionIds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamUiOptionPositionsFromPositionIds$lambda$8(OptionPositionStore optionPositionStore, ApiOptionPositionsFromIdsRequest apiOptionPositionsFromIdsRequest) {
        Intrinsics.checkNotNullParameter(apiOptionPositionsFromIdsRequest, "<destruct>");
        return BuildersKt__Builders_commonKt.launch$default(optionPositionStore.getStoreScope(), null, null, new OptionPositionStore$streamUiOptionPositionsFromPositionIds$1$1(optionPositionStore, apiOptionPositionsFromIdsRequest.component1(), apiOptionPositionsFromIdsRequest.getNonzero(), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamUiOptionPositionsFromPositionIds$lambda$14(OptionPositionStore optionPositionStore, ApiOptionPositionsFromIdsRequest apiOptionPositionsFromIdsRequest) {
        Intrinsics.checkNotNullParameter(apiOptionPositionsFromIdsRequest, "<destruct>");
        List<UUID> listComponent1 = apiOptionPositionsFromIdsRequest.component1();
        final boolean nonzero = apiOptionPositionsFromIdsRequest.getNonzero();
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(listComponent1);
        final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            linkedHashMap.put((UUID) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
        final Flow<List<UiOptionInstrumentPosition>> uiOptionPositionsByPositionIdsIncludingZeroQuantity = optionPositionStore.dao.getUiOptionPositionsByPositionIdsIncludingZeroQuantity(listComponent1);
        return new Flow<List<? extends UiOptionInstrumentPosition>>() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UiOptionInstrumentPosition>> flowCollector, Continuation continuation) {
                Object objCollect = uiOptionPositionsByPositionIdsIncludingZeroQuantity.collect(new AnonymousClass2(flowCollector, nonzero, linkedHashMap), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Map $idToIndexMap$inlined;
                final /* synthetic */ boolean $nonzero$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$$inlined$map$1$2", m3645f = "OptionPositionStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, boolean z, Map map) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$nonzero$inlined = z;
                    this.$idToIndexMap$inlined = map;
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
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            UiOptionInstrumentPosition uiOptionInstrumentPosition = (UiOptionInstrumentPosition) t;
                            if (!this.$nonzero$inlined || !Intrinsics.areEqual(uiOptionInstrumentPosition.getOptionInstrumentPosition().getDisplayQuantity(), BigDecimal.ZERO)) {
                                arrayList.add(t);
                            }
                        }
                        final Map map = this.$idToIndexMap$inlined;
                        List listSortedWith = CollectionsKt.sortedWith(arrayList, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006f: INVOKE (r8v5 'listSortedWith' java.util.List) = 
                              (r2v1 'arrayList' java.util.ArrayList)
                              (wrap:java.util.Comparator:0x006c: CONSTRUCTOR (r4v1 'map' java.util.Map A[DONT_INLINE]) A[MD:(java.util.Map):void (m), WRAPPED] (LINE:1056) call: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$lambda$13$$inlined$sortedBy$1.<init>(java.util.Map):void type: CONSTRUCTOR)
                             STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:1056) in method: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes13.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$lambda$13$$inlined$sortedBy$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            boolean r0 = r9 instanceof com.robinhood.librobinhood.data.store.C34077x485260f.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r9
                            com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$$inlined$map$1$2$1 r0 = (com.robinhood.librobinhood.data.store.C34077x485260f.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$$inlined$map$1$2$1 r0 = new com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$$inlined$map$1$2$1
                            r0.<init>(r9)
                        L18:
                            java.lang.Object r9 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.ResultKt.throwOnFailure(r9)
                            goto L7c
                        L29:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L31:
                            kotlin.ResultKt.throwOnFailure(r9)
                            kotlinx.coroutines.flow.FlowCollector r9 = r7.$this_unsafeFlow
                            java.util.List r8 = (java.util.List) r8
                            java.lang.Iterable r8 = (java.lang.Iterable) r8
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            java.util.Iterator r8 = r8.iterator()
                        L43:
                            boolean r4 = r8.hasNext()
                            if (r4 == 0) goto L68
                            java.lang.Object r4 = r8.next()
                            r5 = r4
                            com.robinhood.models.ui.UiOptionInstrumentPosition r5 = (com.robinhood.models.p355ui.UiOptionInstrumentPosition) r5
                            boolean r6 = r7.$nonzero$inlined
                            if (r6 == 0) goto L64
                            com.robinhood.models.db.OptionInstrumentPosition r5 = r5.getOptionInstrumentPosition()
                            java.math.BigDecimal r5 = r5.getDisplayQuantity()
                            java.math.BigDecimal r6 = java.math.BigDecimal.ZERO
                            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                            if (r5 != 0) goto L43
                        L64:
                            r2.add(r4)
                            goto L43
                        L68:
                            com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$lambda$13$$inlined$sortedBy$1 r8 = new com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositionsFromPositionIds$lambda$14$lambda$13$$inlined$sortedBy$1
                            java.util.Map r4 = r7.$idToIndexMap$inlined
                            r8.<init>(r4)
                            java.util.List r8 = kotlin.collections.CollectionsKt.sortedWith(r2, r8)
                            r0.label = r3
                            java.lang.Object r8 = r9.emit(r8, r0)
                            if (r8 != r1) goto L7c
                            return r1
                        L7c:
                            kotlin.Unit r8 = kotlin.Unit.INSTANCE
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.librobinhood.data.store.C34077x485260f.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }
            };
        }

        public final Observable<List<UiOptionInstrumentPosition>> getUiOptionPositionsForEarlyAssignment(String accountNumber, UUID optionChainId, OptionContractType contractType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            return this.streamUiOptionPositionsForEarlyAssignment.asObservable(new Tuples3<>(accountNumber, optionChainId, contractType));
        }

        public final Flow<List<UiOptionInstrumentPosition>> getUiOptionPositionsForEquityInstrument(String accountNumber, UUID equityInstrumentId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(equityInstrumentId, "equityInstrumentId");
            return takeWhileLoggedIn(this.dao.getUiOptionPositionsForEquityInstrument(accountNumber, equityInstrumentId));
        }

        public final Observable<List<UiOptionInstrumentPosition>> getUiOptionPositionsForEquityInstruments(final String accountNumber, List<UUID> equityInstrumentIds) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(equityInstrumentIds, "equityInstrumentIds");
            Observable<List<UiOptionInstrumentPosition>> observableConcatMap = Observable.fromIterable(CollectionsKt.chunked(equityInstrumentIds, OPTION_POSITION_BUFFER_SIZE)).concatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore.getUiOptionPositionsForEquityInstruments.1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends List<UiOptionInstrumentPosition>> apply(List<UUID> idChunk) {
                    Intrinsics.checkNotNullParameter(idChunk, "idChunk");
                    OptionPositionStore optionPositionStore = OptionPositionStore.this;
                    return optionPositionStore.asObservable(optionPositionStore.takeWhileLoggedIn(optionPositionStore.dao.getUiOptionPositionsForEquityInstruments(accountNumber, idChunk)));
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableConcatMap, "concatMap(...)");
            return observableConcatMap;
        }

        public final Query<Tuples2<String, ? extends Optional<? extends List<UUID>>>, List<UiOptionInstrumentPosition>> getStreamUiOptionPositions() {
            return this.streamUiOptionPositions;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Job streamUiOptionPositions$lambda$15(OptionPositionStore optionPositionStore, Tuples2 tuples2) {
            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
            return BuildersKt__Builders_commonKt.launch$default(optionPositionStore.getStoreScope(), null, null, new OptionPositionStore$streamUiOptionPositions$1$1(optionPositionStore, (String) tuples2.component1(), null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow streamUiOptionPositions$lambda$19(OptionPositionStore optionPositionStore, Tuples2 tuples2) {
            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
            String str = (String) tuples2.component1();
            final List<UUID> list = (List) ((Optional) tuples2.component2()).getOrNull();
            OptionPositionDao optionPositionDao = optionPositionStore.dao;
            if (list != null) {
                final Flow<List<UiOptionInstrumentPosition>> uiOptionPositions = optionPositionDao.getUiOptionPositions(str, list);
                return new Flow<List<? extends UiOptionInstrumentPosition>>() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends UiOptionInstrumentPosition>> flowCollector, Continuation continuation) {
                        Object objCollect = uiOptionPositions.collect(new AnonymousClass2(flowCollector, list), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ List $optionPositionIds$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$$inlined$map$1$2", m3645f = "OptionPositionStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, List list) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$optionPositionIds$inlined = list;
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
                                final List list = this.$optionPositionIds$inlined;
                                List listSortedWith = CollectionsKt.sortedWith((List) obj, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: INVOKE (r6v3 'listSortedWith' java.util.List) = 
                                      (wrap:java.util.List:0x0036: CHECK_CAST (java.util.List) (r6v0 'obj' java.lang.Object))
                                      (wrap:java.util.Comparator:0x003e: CONSTRUCTOR (r4v0 'list' java.util.List A[DONT_INLINE]) A[MD:(java.util.List):void (m), WRAPPED] (LINE:1056) call: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$lambda$17$$inlined$sortedBy$1.<init>(java.util.List):void type: CONSTRUCTOR)
                                     STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:1056) in method: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes13.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$lambda$17$$inlined$sortedBy$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 21 more
                                    */
                                /*
                                    this = this;
                                    boolean r0 = r7 instanceof com.robinhood.librobinhood.data.store.C34074xd22ffbef.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r7
                                    com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$$inlined$map$1$2$1 r0 = (com.robinhood.librobinhood.data.store.C34074xd22ffbef.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$$inlined$map$1$2$1 r0 = new com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$$inlined$map$1$2$1
                                    r0.<init>(r7)
                                L18:
                                    java.lang.Object r7 = r0.result
                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L31
                                    if (r2 != r3) goto L29
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L4e
                                L29:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L31:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                                    java.util.List r6 = (java.util.List) r6
                                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                                    com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$lambda$17$$inlined$sortedBy$1 r2 = new com.robinhood.librobinhood.data.store.OptionPositionStore$streamUiOptionPositions$lambda$19$lambda$18$lambda$17$$inlined$sortedBy$1
                                    java.util.List r4 = r5.$optionPositionIds$inlined
                                    r2.<init>(r4)
                                    java.util.List r6 = kotlin.collections.CollectionsKt.sortedWith(r6, r2)
                                    r0.label = r3
                                    java.lang.Object r6 = r7.emit(r6, r0)
                                    if (r6 != r1) goto L4e
                                    return r1
                                L4e:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.librobinhood.data.store.C34074xd22ffbef.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }
                    };
                }
                return optionPositionDao.getUiOptionPositions(str);
            }

            public final Query<Tuples2<String, UUID>, List<UiOptionInstrumentPosition>> getStreamUiOptionPositionsByUnderlyingId() {
                return this.streamUiOptionPositionsByUnderlyingId;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Job streamUiOptionPositionsByUnderlyingId$lambda$20(OptionPositionStore optionPositionStore, Tuples2 tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return BuildersKt__Builders_commonKt.launch$default(optionPositionStore.getStoreScope(), null, null, new OptionPositionStore$streamUiOptionPositionsByUnderlyingId$1$1(optionPositionStore, (String) tuples2.component1(), null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Flow streamUiOptionPositionsByUnderlyingId$lambda$21(OptionPositionStore optionPositionStore, Tuples2 tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return optionPositionStore.dao.getUiOptionPositionsByUnderlyingId((String) tuples2.component1(), (UUID) tuples2.component2());
            }

            public final Observable<Map<UUID, UiOptionPositionCounts>> getOptionPositionCountsByInstrument(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                final Flow<List<UiOptionPositionCounts>> optionPositionCountsByOptionInstrument = this.dao.getOptionPositionCountsByOptionInstrument(accountNumber);
                return asObservable(takeWhileLoggedIn(new Flow<Map<UUID, ? extends UiOptionPositionCounts>>() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPositionCountsByInstrument$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Map<UUID, ? extends UiOptionPositionCounts>> flowCollector, Continuation continuation) {
                        Object objCollect = optionPositionCountsByOptionInstrument.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPositionCountsByInstrument$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPositionCountsByInstrument$$inlined$map$1$2", m3645f = "OptionPositionStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPositionCountsByInstrument$$inlined$map$1$2$1, reason: invalid class name */
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
                                List list = (List) obj;
                                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                                for (T t : list) {
                                    linkedHashMap.put(((UiOptionPositionCounts) t).getOptionInstrumentId(), t);
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
                }));
            }

            public final Flow<List<OptionInstrumentPosition>> getOptionPositions(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return takeWhileLoggedIn(this.dao.getOptionPositions(accountNumber));
            }

            public final Flow<List<OptionInstrumentPosition>> getOptionPositions(String accountNumber, UUID optionInstrumentId) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
                return takeWhileLoggedIn(this.dao.getOptionPositionsForOptionInstrument(accountNumber, optionInstrumentId));
            }

            public final Observable<Optional<OptionInstrumentPosition>> getOptionPosition(String accountNumber, UUID optionInstrumentId, OptionPositionType type2) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
                Intrinsics.checkNotNullParameter(type2, "type");
                return ObservablesKt.mapFirstOptional(asObservable(takeWhileLoggedIn(this.dao.getOptionPositionsForOptionInstrument(accountNumber, optionInstrumentId, type2))));
            }

            public final Observable<OrderPositionEffect> getOrderPositionEffect(String accountNumber, UUID optionInstrumentId, final OrderSide side) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
                Intrinsics.checkNotNullParameter(side, "side");
                final Flow<List<OptionInstrumentPosition>> optionPositions = getOptionPositions(accountNumber, optionInstrumentId);
                return asObservable(new Flow<OrderPositionEffect>() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OrderPositionEffect> flowCollector, Continuation continuation) {
                        Object objCollect = optionPositions.collect(new C340732(flowCollector, side), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1$2 */
                    public static final class C340732<T> implements FlowCollector {
                        final /* synthetic */ OrderSide $side$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1$2", m3645f = "OptionPositionStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C340732.this.emit(null, this);
                            }
                        }

                        public C340732(FlowCollector flowCollector, OrderSide orderSide) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$side$inlined = orderSide;
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
                                Sequence sequenceAsSequence = CollectionsKt.asSequence((List) obj);
                                final OrderSide orderSide = this.$side$inlined;
                                OrderPositionEffect orderPositionEffect = (OrderPositionEffect) SequencesKt.firstOrNull(SequencesKt.filter(SequencesKt.map(sequenceAsSequence, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0053: CHECK_CAST (r6v7 'orderPositionEffect' com.robinhood.models.db.OrderPositionEffect) = (com.robinhood.models.db.OrderPositionEffect) (wrap:java.lang.Object:0x004f: INVOKE 
                                      (wrap:kotlin.sequences.Sequence:0x004b: INVOKE 
                                      (wrap:kotlin.sequences.Sequence:0x0045: INVOKE 
                                      (r6v3 'sequenceAsSequence' kotlin.sequences.Sequence)
                                      (wrap:kotlin.jvm.functions.Function1<com.robinhood.models.db.OptionInstrumentPosition, com.robinhood.models.db.OrderPositionEffect>:0x0042: CONSTRUCTOR (r4v0 'orderSide' com.robinhood.models.db.OrderSide A[DONT_INLINE]) A[MD:(com.robinhood.models.db.OrderSide):void (m), WRAPPED] (LINE:53) call: com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$1$1.<init>(com.robinhood.models.db.OrderSide):void type: CONSTRUCTOR)
                                     STATIC call: kotlin.sequences.SequencesKt.map(kotlin.sequences.Sequence, kotlin.jvm.functions.Function1):kotlin.sequences.Sequence A[MD:<T, R>:(kotlin.sequences.Sequence<? extends T>, kotlin.jvm.functions.Function1<? super T, ? extends R>):kotlin.sequences.Sequence<R> (m), WRAPPED] (LINE:53))
                                      (wrap:com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$1$2:0x0049: SGET  A[WRAPPED] (LINE:55) com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$1$2.INSTANCE com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$1$2)
                                     STATIC call: kotlin.sequences.SequencesKt.filter(kotlin.sequences.Sequence, kotlin.jvm.functions.Function1):kotlin.sequences.Sequence A[MD:<T>:(kotlin.sequences.Sequence<? extends T>, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean>):kotlin.sequences.Sequence<T> (m), WRAPPED] (LINE:55))
                                     STATIC call: kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.Sequence):java.lang.Object A[MD:<T>:(kotlin.sequences.Sequence<? extends T>):T (m), WRAPPED] (LINE:56)) in method: com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes13.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$1$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:345)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 21 more
                                    */
                                /*
                                    this = this;
                                    boolean r0 = r7 instanceof com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1.C340732.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r7
                                    com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1$2$1 r0 = (com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1.C340732.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1$2$1 r0 = new com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1$2$1
                                    r0.<init>(r7)
                                L18:
                                    java.lang.Object r7 = r0.result
                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L31
                                    if (r2 != r3) goto L29
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L62
                                L29:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L31:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                                    java.util.List r6 = (java.util.List) r6
                                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                                    kotlin.sequences.Sequence r6 = kotlin.collections.CollectionsKt.asSequence(r6)
                                    com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$1$1 r2 = new com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$1$1
                                    com.robinhood.models.db.OrderSide r4 = r5.$side$inlined
                                    r2.<init>(r4)
                                    kotlin.sequences.Sequence r6 = kotlin.sequences.SequencesKt.map(r6, r2)
                                    com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$1$2 r2 = com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$1$2.INSTANCE
                                    kotlin.sequences.Sequence r6 = kotlin.sequences.SequencesKt.filter(r6, r2)
                                    java.lang.Object r6 = kotlin.sequences.SequencesKt.firstOrNull(r6)
                                    com.robinhood.models.db.OrderPositionEffect r6 = (com.robinhood.models.p320db.OrderPositionEffect) r6
                                    if (r6 != 0) goto L59
                                    com.robinhood.models.db.OrderPositionEffect r6 = com.robinhood.models.p320db.OrderPositionEffect.OPEN
                                L59:
                                    r0.label = r3
                                    java.lang.Object r6 = r7.emit(r6, r0)
                                    if (r6 != r1) goto L62
                                    return r1
                                L62:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.librobinhood.data.store.OptionPositionStore$getOrderPositionEffect$$inlined$map$1.C340732.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }
                    });
                }

                public static /* synthetic */ void refresh$default(OptionPositionStore optionPositionStore, boolean z, UUID uuid, String str, int i, Object obj) {
                    if ((i & 2) != 0) {
                        uuid = null;
                    }
                    optionPositionStore.refresh(z, uuid, str);
                }

                public final void refresh(boolean force, UUID optionChainId, String accountNumber) {
                    Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                    refresh(force, optionChainId, CollectionsKt.listOf(accountNumber));
                }

                public static /* synthetic */ void refresh$default(OptionPositionStore optionPositionStore, boolean z, UUID uuid, List list, int i, Object obj) {
                    if ((i & 2) != 0) {
                        uuid = null;
                    }
                    optionPositionStore.refresh(z, uuid, (List<String>) list);
                }

                public final void refresh(boolean force, UUID optionChainId, List<String> accountNumbers) {
                    Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
                    refreshWithChainIds(force, optionChainId != null ? CollectionsKt.listOf(optionChainId) : null, accountNumbers);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ void refreshWithChainIds$default(OptionPositionStore optionPositionStore, boolean z, List list, List list2, int i, Object obj) {
                    if ((i & 2) != 0) {
                        list = null;
                    }
                    optionPositionStore.refreshWithChainIds(z, list, list2);
                }

                public final void refreshWithChainIds(boolean force, List<UUID> optionChainIds, List<String> accountNumbers) {
                    Flow<PaginatedResult<ApiOptionPosition>> flowFetchAllPages;
                    Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
                    ApiOptionPositionRequest apiOptionPositionRequest = new ApiOptionPositionRequest(accountNumbers, optionChainIds);
                    if (force) {
                        flowFetchAllPages = this.getOptionPositions.forceFetchAllPages(apiOptionPositionRequest);
                    } else {
                        flowFetchAllPages = this.getOptionPositions.fetchAllPages(apiOptionPositionRequest);
                    }
                    Completable completableFlatMapCompletable = asObservable(flowFetchAllPages).flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore.refreshWithChainIds.1
                        @Override // io.reactivex.functions.Function
                        public final CompletableSource apply(PaginatedResult<ApiOptionPosition> positions) {
                            Intrinsics.checkNotNullParameter(positions, "positions");
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(positions, 10));
                            Iterator<ApiOptionPosition> it = positions.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next().getOptionInstrumentId());
                            }
                            return OptionInstrumentStore.pingOptionInstrumentsCompletable$default(OptionPositionStore.this.optionInstrumentStore, arrayList, false, 2, null);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
                    ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(completableFlatMapCompletable), getStoreScope());
                }

                public final void refresh(boolean force, List<UUID> optionInstrumentPositionIds, boolean nonzero) {
                    Flow<PaginatedResult<ApiOptionPosition>> flowFetchAllPages;
                    Intrinsics.checkNotNullParameter(optionInstrumentPositionIds, "optionInstrumentPositionIds");
                    ApiOptionPositionsFromIdsRequest apiOptionPositionsFromIdsRequest = new ApiOptionPositionsFromIdsRequest(optionInstrumentPositionIds, nonzero);
                    if (force) {
                        flowFetchAllPages = this.getOptionPositionsFromIds.forceFetchAllPages(apiOptionPositionsFromIdsRequest);
                    } else {
                        flowFetchAllPages = this.getOptionPositionsFromIds.fetchAllPages(apiOptionPositionsFromIdsRequest);
                    }
                    Completable completableFlatMapCompletable = asObservable(flowFetchAllPages).flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionPositionStore.refresh.2
                        @Override // io.reactivex.functions.Function
                        public final CompletableSource apply(PaginatedResult<ApiOptionPosition> positions) {
                            Intrinsics.checkNotNullParameter(positions, "positions");
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(positions, 10));
                            Iterator<ApiOptionPosition> it = positions.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next().getOptionInstrumentId());
                            }
                            return OptionInstrumentStore.pingOptionInstrumentsCompletable$default(OptionPositionStore.this.optionInstrumentStore, arrayList, false, 2, null);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
                    ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(completableFlatMapCompletable), getStoreScope());
                }

                /* compiled from: OptionPositionStore.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$refreshWithAllAccounts$1", m3645f = "OptionPositionStore.kt", m3646l = {347}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.OptionPositionStore$refreshWithAllAccounts$1 */
                static final class C340851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ boolean $force;
                    final /* synthetic */ UUID $optionChainId;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C340851(boolean z, UUID uuid, Continuation<? super C340851> continuation) {
                        super(2, continuation);
                        this.$force = z;
                        this.$optionChainId = uuid;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return OptionPositionStore.this.new C340851(this.$force, this.$optionChainId, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C340851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Observable<List<String>> observableStreamAllSelfDirectedAccountNumbers = OptionPositionStore.this.accountProvider.streamAllSelfDirectedAccountNumbers();
                            this.label = 1;
                            obj = RxAwait3.awaitFirstOrNull(observableStreamAllSelfDirectedAccountNumbers, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        List<String> list = (List) obj;
                        if (list != null) {
                            OptionPositionStore.this.refresh(this.$force, this.$optionChainId, list);
                        }
                        return Unit.INSTANCE;
                    }
                }

                public static /* synthetic */ void refreshWithAllAccounts$default(OptionPositionStore optionPositionStore, boolean z, UUID uuid, int i, Object obj) {
                    if ((i & 2) != 0) {
                        uuid = null;
                    }
                    optionPositionStore.refreshWithAllAccounts(z, uuid);
                }

                public final void refreshWithAllAccounts(boolean force, UUID optionChainId) {
                    BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C340851(force, optionChainId, null), 3, null);
                }
            }
