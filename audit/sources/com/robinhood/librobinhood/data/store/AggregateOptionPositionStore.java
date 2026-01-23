package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAggregateOptionPosition;
import com.robinhood.models.api.ApiAggregateOptionPositionRequest;
import com.robinhood.models.api.ApiAggregateOptionPositionStrategyCodeRequest;
import com.robinhood.models.api.ApiAggregateOptionPositionWithIdsRequest;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.AggregateOptionPositionDao;
import com.robinhood.models.p320db.AggregateOptionPosition;
import com.robinhood.models.p320db.AggregateOptionPositionLeg;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiAggregateOptionPositionLeg;
import com.robinhood.models.p355ui.UiAggregateOptionPositionSimple;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderLeg;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.HttpUrls;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmName;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Clock;

/* compiled from: AggregateOptionPositionStore.kt */
@Metadata(m3635d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\"J\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0&0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d022\u0006\u00103\u001a\u00020+J \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0&0\u001c2\f\u00105\u001a\b\u0012\u0004\u0012\u00020+0&J\u001a\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0&0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fJ,\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070&022\u0006\u0010\u001e\u001a\u00020\u001f2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010&J(\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070&022\u0006\u0010\u001e\u001a\u00020\u001f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020+0&J\"\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070&022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020+J\"\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0&0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020+J\u001a\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0018022\u0006\u0010=\u001a\u00020>J,\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0&0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010&J\"\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u001c*\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`AH\u0002J\u0012\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u0019H\u0002J\u001e\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0&0\u001c*\b\u0012\u0004\u0012\u00020\u00190&H\u0002J\"\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\"2\n\b\u0002\u00103\u001a\u0004\u0018\u00010+2\u0006\u0010\u001e\u001a\u00020\u001fJ$\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020\"2\f\u00109\u001a\b\u0012\u0004\u0012\u00020+0&2\u0006\u0010\u001e\u001a\u00020\u001fJ \u0010G\u001a\u00020D2\u0006\u0010E\u001a\u00020\"2\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010&J.\u0010H\u001a\u00020D2\u0006\u0010E\u001a\u00020\"2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010&2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001f0&H\u0002J \u0010J\u001a\u00020D2\u0006\u0010E\u001a\u00020\"2\u0006\u00103\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u0010K\u001a\u00020D2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MH\u0002J\u001b\u0010K\u001a\u00020D2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020+0MH\u0003¢\u0006\u0002\bPJ\u0018\u0010Q\u001a\u00020\"2\u0006\u0010=\u001a\u00020>2\u0006\u0010R\u001a\u00020\u001dH\u0002J\u0018\u0010S\u001a\u00020\"2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0&0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010*\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190&0\u0017¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R&\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f00\u0012\u0004\u0012\u00020\u00150/X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006X"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "dao", "Lcom/robinhood/models/dao/AggregateOptionPositionDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/models/dao/AggregateOptionPositionDao;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;)V", "getAggregateOptionPositionFromStrategyCode", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/models/api/ApiAggregateOptionPositionStrategyCodeRequest;", "Lcom/robinhood/models/api/ApiAggregateOptionPosition;", "pollAggregateOptionPositionFromStrategyCode", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/AggregateOptionPosition;", "pollAggregateOptionPositionFromStrategyCodeIncludingZeroQuantity", "pollUiAggregateOptionPositionFullFromStrategyCode", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "accountNumber", "", "strategyCode", "includingZeroQuantity", "", "getAggregateOptionPositionsEndpoint", "Lcom/robinhood/models/api/ApiAggregateOptionPositionRequest;", "aggregateOptionPositionsQuery", "", "streamUiAggregateOptionPositionsFlow", "getAggregateOptionPositionsWithIdsEndpoint", "Lcom/robinhood/models/api/ApiAggregateOptionPositionWithIdsRequest;", "streamPositionsFromAggregateIdsIncludingZeroQuantity", "Ljava/util/UUID;", "getStreamPositionsFromAggregateIdsIncludingZeroQuantity", "()Lcom/robinhood/android/moria/db/Query;", "getAggregateOptionPositionEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "streamUiAggregateOptionPosition", "Lio/reactivex/Observable;", "aggregateOptionPositionId", "streamUiAggregateOptionPositions", "aggregateOptionPositionIds", "streamUiAggregateOptionPositionsSimple", "Lcom/robinhood/models/ui/UiAggregateOptionPositionSimple;", "streamUiAggregateOptionPositionsForChainIds", "optionChainIds", "streamUiAggregateOptionPositionsByUnderlyingId", "underlyingId", "streamUiAggregateOptionPositionFullListByUnderlyingId", Card.Icon.ORDER, "Lcom/robinhood/models/ui/UiOptionOrder;", "streamUiAggregateOptionPositionsFull", "streamUiPosition", "Lcom/robinhood/librobinhood/data/store/OptionalAggregatePosition;", "streamUiAggregateOptionPositionFull", "refresh", "", "force", "refreshWithChainIds", "refreshWithAllAccounts", "refreshAll", "accountNumbers", "refreshSingle", "pingOptionInstruments", "legs", "Lkotlin/sequences/Sequence;", "Lcom/robinhood/models/api/ApiAggregateOptionPosition$Leg;", "optionInstrumentIds", "pingOptionInstrumentsRaw", "matchesLegs", "position", "matches", "orderLeg", "Lcom/robinhood/models/ui/UiOptionOrderLeg;", "positionLeg", "Lcom/robinhood/models/db/AggregateOptionPositionLeg;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AggregateOptionPositionStore extends Store {
    private final AccountProvider accountProvider;
    private final Query<String, List<UiAggregateOptionPositionFull>> aggregateOptionPositionsQuery;
    private final AggregateOptionPositionDao dao;
    private final Endpoint<Tuples2<UUID, String>, ApiAggregateOptionPosition> getAggregateOptionPositionEndpoint;
    private final PaginatedEndpoint<ApiAggregateOptionPositionStrategyCodeRequest, ApiAggregateOptionPosition> getAggregateOptionPositionFromStrategyCode;
    private final PaginatedEndpoint<ApiAggregateOptionPositionRequest, ApiAggregateOptionPosition> getAggregateOptionPositionsEndpoint;
    private final PaginatedEndpoint<ApiAggregateOptionPositionWithIdsRequest, ApiAggregateOptionPosition> getAggregateOptionPositionsWithIdsEndpoint;
    private final OptionChainStore optionChainStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionsApi optionsApi;
    private final Query<ApiAggregateOptionPositionStrategyCodeRequest, Optional<AggregateOptionPosition>> pollAggregateOptionPositionFromStrategyCode;
    private final Query<ApiAggregateOptionPositionStrategyCodeRequest, Optional<AggregateOptionPosition>> pollAggregateOptionPositionFromStrategyCodeIncludingZeroQuantity;
    private final Query<List<UUID>, List<AggregateOptionPosition>> streamPositionsFromAggregateIdsIncludingZeroQuantity;

    /* compiled from: AggregateOptionPositionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregateOptionPositionStore(StoreBundle storeBundle, AccountProvider accountProvider, AggregateOptionPositionDao dao, OptionsApi optionsApi, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionPositionStore optionPositionStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        this.accountProvider = accountProvider;
        this.dao = dao;
        this.optionsApi = optionsApi;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionPositionStore = optionPositionStore;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        PaginatedEndpoint<ApiAggregateOptionPositionStrategyCodeRequest, ApiAggregateOptionPosition> paginatedEndpointCreateWithParams$default = PaginatedEndpoint.Companion.createWithParams$default(companion, new C33555x1caa395e(this, null), getLogoutKillswitch(), new C33556x1caa395f(this, null), storeBundle.getClock(), null, 16, null);
        this.getAggregateOptionPositionFromStrategyCode = paginatedEndpointCreateWithParams$default;
        Query.Companion companion2 = Query.INSTANCE;
        this.pollAggregateOptionPositionFromStrategyCode = Store.createOptional$default(this, companion2, "pollAggregateOptionPositionFromStrategyCode", CollectionsKt.listOf(new PollEach(getStoreScope(), new C33561x11388f15(paginatedEndpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionPositionStore.pollAggregateOptionPositionFromStrategyCode$lambda$0(this.f$0, (ApiAggregateOptionPositionStrategyCodeRequest) obj);
            }
        }, false, 8, null);
        this.pollAggregateOptionPositionFromStrategyCodeIncludingZeroQuantity = Store.createOptional$default(this, companion2, "pollAggregateOptionPositionFromStrategyCodeIncludingZeroQuantity", CollectionsKt.listOf(new PollEach(getStoreScope(), new C33562xdd942c3d(paginatedEndpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionPositionStore.m2606x3afec709(this.f$0, (ApiAggregateOptionPositionStrategyCodeRequest) obj);
            }
        }, false, 8, null);
        this.getAggregateOptionPositionsEndpoint = PaginatedEndpoint.Companion.createWithParams$default(companion, new C33557x7dd39d2e(this, null), getLogoutKillswitch(), new C33558x7dd39d2f(this, null), storeBundle.getClock(), null, 16, null);
        this.aggregateOptionPositionsQuery = Store.create$default(this, companion2, "aggregateOptionPositionsQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionPositionStore.aggregateOptionPositionsQuery$lambda$4(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionPositionStore.aggregateOptionPositionsQuery$lambda$6(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.getAggregateOptionPositionsWithIdsEndpoint = PaginatedEndpoint.Companion.createWithParams$default(companion, new C33559x6b7c34c8(this, null), getLogoutKillswitch(), new C33560x6b7c34c9(this, null), storeBundle.getClock(), null, 16, null);
        this.streamPositionsFromAggregateIdsIncludingZeroQuantity = Store.create$default(this, companion2, "streamPositionsFromAggregateIdsIncludingZeroQuantity", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionPositionStore.streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$7(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionPositionStore.streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12(this.f$0, (List) obj);
            }
        }, false, 8, null);
        Endpoint.Companion companion3 = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        this.getAggregateOptionPositionEndpoint = Endpoint.Companion.create$default(companion3, new C33554xe4b1b66a(this, null), logoutKillswitch, new C33553xe4b1b669(dao), clock, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollAggregateOptionPositionFromStrategyCode$lambda$0(AggregateOptionPositionStore aggregateOptionPositionStore, ApiAggregateOptionPositionStrategyCodeRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return aggregateOptionPositionStore.dao.getAggregateOptionPosition(request.getAccountNumbers(), request.getStrategyCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pollAggregateOptionPositionFromStrategyCodeIncludingZeroQuantity$lambda$2 */
    public static final Flow m2606x3afec709(AggregateOptionPositionStore aggregateOptionPositionStore, ApiAggregateOptionPositionStrategyCodeRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return aggregateOptionPositionStore.dao.getAggregateOptionPositionIncludingZeroQuantity(request.getAccountNumbers(), request.getStrategyCode());
    }

    public static /* synthetic */ Flow pollUiAggregateOptionPositionFullFromStrategyCode$default(AggregateOptionPositionStore aggregateOptionPositionStore, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return aggregateOptionPositionStore.pollUiAggregateOptionPositionFullFromStrategyCode(str, str2, z);
    }

    public final Flow<Optional<UiAggregateOptionPositionFull>> pollUiAggregateOptionPositionFullFromStrategyCode(String accountNumber, String strategyCode, boolean includingZeroQuantity) {
        Query<ApiAggregateOptionPositionStrategyCodeRequest, Optional<AggregateOptionPosition>> query;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        if (includingZeroQuantity) {
            query = this.pollAggregateOptionPositionFromStrategyCodeIncludingZeroQuantity;
        } else {
            query = this.pollAggregateOptionPositionFromStrategyCode;
        }
        return takeWhileLoggedIn(FlowKt.transformLatest(query.asFlow(new ApiAggregateOptionPositionStrategyCodeRequest(CollectionsKt.listOf(accountNumber), strategyCode)), new C33541x2878dafb(null, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow aggregateOptionPositionsQuery$lambda$4(AggregateOptionPositionStore aggregateOptionPositionStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return PaginatedEndpoint.DefaultImpls.pollAllPages$default(aggregateOptionPositionStore.getAggregateOptionPositionsEndpoint, new ApiAggregateOptionPositionRequest(CollectionsKt.listOf(accountNumber), null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow aggregateOptionPositionsQuery$lambda$6(AggregateOptionPositionStore aggregateOptionPositionStore, String request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.transformLatest(aggregateOptionPositionStore.dao.getAggregateOptionPositions(request), new C33540x709dd473(null, aggregateOptionPositionStore));
    }

    public final Flow<List<UiAggregateOptionPositionFull>> streamUiAggregateOptionPositionsFlow(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return FlowKt.distinctUntilChanged(takeWhileLoggedIn(FlowKt.onEach(this.aggregateOptionPositionsQuery.asFlow(accountNumber), new C335671(accountNumber, null))));
    }

    /* compiled from: AggregateOptionPositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "positions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionsFlow$1", m3645f = "AggregateOptionPositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionsFlow$1 */
    static final class C335671 extends ContinuationImpl7 implements Function2<List<? extends UiAggregateOptionPositionFull>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C335671(String str, Continuation<? super C335671> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C335671 c335671 = AggregateOptionPositionStore.this.new C335671(this.$accountNumber, continuation);
            c335671.L$0 = obj;
            return c335671;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends UiAggregateOptionPositionFull> list, Continuation<? super Unit> continuation) {
            return invoke2((List<UiAggregateOptionPositionFull>) list, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<UiAggregateOptionPositionFull> list, Continuation<? super Unit> continuation) {
            return ((C335671) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AggregateOptionPositionStore.this.pingOptionInstrumentsRaw(SequencesKt.map(SequencesKt.flatMap(CollectionsKt.asSequence((List) this.L$0), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionsFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AggregateOptionPositionStore.C335671.invokeSuspend$lambda$0((UiAggregateOptionPositionFull) obj2);
                }
            }), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionsFlow$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ((AggregateOptionPositionLeg) obj2).getOptionInstrumentId();
                }
            }));
            OptionPositionStore.refresh$default(AggregateOptionPositionStore.this.optionPositionStore, false, (UUID) null, this.$accountNumber, 2, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Sequence invokeSuspend$lambda$0(UiAggregateOptionPositionFull uiAggregateOptionPositionFull) {
            return CollectionsKt.asSequence(uiAggregateOptionPositionFull.getLegs());
        }
    }

    public final Query<List<UUID>, List<AggregateOptionPosition>> getStreamPositionsFromAggregateIdsIncludingZeroQuantity() {
        return this.streamPositionsFromAggregateIdsIncludingZeroQuantity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$7(AggregateOptionPositionStore aggregateOptionPositionStore, List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return PaginatedEndpoint.DefaultImpls.refreshAllPages$default(aggregateOptionPositionStore.getAggregateOptionPositionsWithIdsEndpoint, new ApiAggregateOptionPositionWithIdsRequest(null, ids, false), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12(AggregateOptionPositionStore aggregateOptionPositionStore, List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(ids);
        final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            linkedHashMap.put((UUID) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
        final Flow<List<AggregateOptionPosition>> aggregateOptionPositions = aggregateOptionPositionStore.dao.getAggregateOptionPositions((List<UUID>) ids);
        return new Flow<List<? extends AggregateOptionPosition>>() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends AggregateOptionPosition>> flowCollector, Continuation continuation) {
                Object objCollect = aggregateOptionPositions.collect(new AnonymousClass2(flowCollector, linkedHashMap), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Map $idToIndexMap$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$$inlined$map$1$2", m3645f = "AggregateOptionPositionStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, Map map) {
                    this.$this_unsafeFlow = flowCollector;
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
                        final Map map = this.$idToIndexMap$inlined;
                        List listSortedWith = CollectionsKt.sortedWith((List) obj, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: INVOKE (r6v3 'listSortedWith' java.util.List) = 
                              (wrap:java.util.List:0x0036: CHECK_CAST (java.util.List) (r6v0 'obj' java.lang.Object))
                              (wrap:java.util.Comparator:0x003e: CONSTRUCTOR (r4v0 'map' java.util.Map A[DONT_INLINE]) A[MD:(java.util.Map):void (m), WRAPPED] (LINE:1056) call: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$lambda$11$$inlined$sortedBy$1.<init>(java.util.Map):void type: CONSTRUCTOR)
                             STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:1056) in method: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes13.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$lambda$11$$inlined$sortedBy$1, state: NOT_LOADED
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
                            boolean r0 = r7 instanceof com.robinhood.librobinhood.data.store.C33542xfd61a2eb.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$$inlined$map$1$2$1 r0 = (com.robinhood.librobinhood.data.store.C33542xfd61a2eb.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$$inlined$map$1$2$1 r0 = new com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$$inlined$map$1$2$1
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
                            com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$lambda$11$$inlined$sortedBy$1 r2 = new com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamPositionsFromAggregateIdsIncludingZeroQuantity$lambda$12$lambda$11$$inlined$sortedBy$1
                            java.util.Map r4 = r5.$idToIndexMap$inlined
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
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.librobinhood.data.store.C33542xfd61a2eb.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object getAggregateOptionPositionEndpoint$insert(AggregateOptionPositionDao aggregateOptionPositionDao, ApiAggregateOptionPosition apiAggregateOptionPosition, Continuation continuation) {
            aggregateOptionPositionDao.insert(apiAggregateOptionPosition);
            return Unit.INSTANCE;
        }

        public final Observable<UiAggregateOptionPositionFull> streamUiAggregateOptionPosition(UUID aggregateOptionPositionId) {
            Intrinsics.checkNotNullParameter(aggregateOptionPositionId, "aggregateOptionPositionId");
            return asObservable(takeWhileLoggedIn(FlowKt.transformLatest(FlowKt.filterNotNull(this.dao.getAggregateOptionPosition(aggregateOptionPositionId)), new C33544x9fea86f5(null, this))));
        }

        /* compiled from: AggregateOptionPositionStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "optionPositions", "Lcom/robinhood/models/db/AggregateOptionPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositions$1", m3645f = "AggregateOptionPositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositions$1 */
        static final class C335661 extends ContinuationImpl7 implements Function2<List<? extends AggregateOptionPosition>, Continuation<? super Flow<? extends List<? extends UiAggregateOptionPositionFull>>>, Object> {
            /* synthetic */ Object L$0;
            int label;

            C335661(Continuation<? super C335661> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C335661 c335661 = AggregateOptionPositionStore.this.new C335661(continuation);
                c335661.L$0 = obj;
                return c335661;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends AggregateOptionPosition> list, Continuation<? super Flow<? extends List<? extends UiAggregateOptionPositionFull>>> continuation) {
                return invoke2((List<AggregateOptionPosition>) list, (Continuation<? super Flow<? extends List<UiAggregateOptionPositionFull>>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<AggregateOptionPosition> list, Continuation<? super Flow<? extends List<UiAggregateOptionPositionFull>>> continuation) {
                return ((C335661) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    return AggregateOptionPositionStore.this.streamUiAggregateOptionPositionFull((List) this.L$0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public final Flow<List<UiAggregateOptionPositionFull>> streamUiAggregateOptionPositions(List<UUID> aggregateOptionPositionIds) {
            Intrinsics.checkNotNullParameter(aggregateOptionPositionIds, "aggregateOptionPositionIds");
            return FlowKt.flatMapConcat(this.streamPositionsFromAggregateIdsIncludingZeroQuantity.asFlow(aggregateOptionPositionIds), new C335661(null));
        }

        public final Flow<List<UiAggregateOptionPositionFull>> streamUiAggregateOptionPositions(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return FlowKt.distinctUntilChanged(takeWhileLoggedIn(FlowKt.transformLatest(this.dao.getAggregateOptionPositions(accountNumber), new C33549xde9f3394(null, this))));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Observable streamUiAggregateOptionPositionsSimple$default(AggregateOptionPositionStore aggregateOptionPositionStore, String str, List list, int i, Object obj) {
            if ((i & 2) != 0) {
                list = null;
            }
            return aggregateOptionPositionStore.streamUiAggregateOptionPositionsSimple(str, list);
        }

        public final Observable<List<UiAggregateOptionPositionSimple>> streamUiAggregateOptionPositionsSimple(String accountNumber, List<UUID> aggregateOptionPositionIds) {
            Flow<List<UiAggregateOptionPositionSimple>> uiAggregateOptionPositions;
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            if (aggregateOptionPositionIds != null) {
                uiAggregateOptionPositions = this.dao.getUiAggregateOptionPositions(aggregateOptionPositionIds);
            } else {
                uiAggregateOptionPositions = this.dao.getUiAggregateOptionPositions(accountNumber);
            }
            return asObservable(FlowKt.distinctUntilChanged(takeWhileLoggedIn(uiAggregateOptionPositions)));
        }

        public final Observable<List<UiAggregateOptionPositionSimple>> streamUiAggregateOptionPositionsForChainIds(String accountNumber, List<UUID> optionChainIds) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(optionChainIds, "optionChainIds");
            return asObservable(FlowKt.distinctUntilChanged(takeWhileLoggedIn(this.dao.getUiAggregateOptionPositionsByChainIds(accountNumber, optionChainIds))));
        }

        public final Observable<List<UiAggregateOptionPositionSimple>> streamUiAggregateOptionPositionsByUnderlyingId(String accountNumber, UUID underlyingId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
            return asObservable(FlowKt.distinctUntilChanged(takeWhileLoggedIn(this.dao.getUiAggregateOptionPositionsByUnderlyingId(accountNumber, underlyingId))));
        }

        public final Flow<List<UiAggregateOptionPositionFull>> streamUiAggregateOptionPositionFullListByUnderlyingId(String accountNumber, UUID underlyingId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
            return FlowKt.transformLatest(FlowKt.distinctUntilChanged(takeWhileLoggedIn(this.dao.getUiAggregateOptionPositionsByUnderlyingId(accountNumber, underlyingId))), new C33548x6b4eda99(null, this));
        }

        public final Observable<Optional<UiAggregateOptionPositionFull>> streamUiAggregateOptionPosition(final UiOptionOrder order) {
            Intrinsics.checkNotNullParameter(order, "order");
            final Flow<List<UiAggregateOptionPositionFull>> flowStreamUiAggregateOptionPositions = streamUiAggregateOptionPositions(order.getAccountNumber());
            return asObservable(new Flow<Optional<? extends UiAggregateOptionPositionFull>>() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPosition$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Optional<? extends UiAggregateOptionPositionFull>> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamUiAggregateOptionPositions.collect(new AnonymousClass2(flowCollector, this, order), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPosition$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ UiOptionOrder $order$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ AggregateOptionPositionStore this$0;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPosition$$inlined$map$1$2", m3645f = "AggregateOptionPositionStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPosition$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, AggregateOptionPositionStore aggregateOptionPositionStore, UiOptionOrder uiOptionOrder) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = aggregateOptionPositionStore;
                        this.$order$inlined = uiOptionOrder;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        Optional optionalAsOptional;
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
                            Iterator it = ((List) obj).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    UiAggregateOptionPositionFull uiAggregateOptionPositionFull = (UiAggregateOptionPositionFull) it.next();
                                    if (this.this$0.matchesLegs(this.$order$inlined, uiAggregateOptionPositionFull)) {
                                        optionalAsOptional = Optional3.asOptional(uiAggregateOptionPositionFull);
                                        break;
                                    }
                                } else {
                                    optionalAsOptional = Optional2.INSTANCE;
                                    break;
                                }
                            }
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
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow streamUiAggregateOptionPositionsFull$default(AggregateOptionPositionStore aggregateOptionPositionStore, String str, List list, int i, Object obj) {
            if ((i & 2) != 0) {
                list = null;
            }
            return aggregateOptionPositionStore.streamUiAggregateOptionPositionsFull(str, list);
        }

        public final Flow<List<UiAggregateOptionPositionFull>> streamUiAggregateOptionPositionsFull(String accountNumber, List<UUID> aggregateOptionPositionIds) {
            Flow<List<UiAggregateOptionPositionFull>> flowStreamUiAggregateOptionPositions;
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            if (aggregateOptionPositionIds != null) {
                flowStreamUiAggregateOptionPositions = streamUiAggregateOptionPositions(aggregateOptionPositionIds);
            } else {
                flowStreamUiAggregateOptionPositions = streamUiAggregateOptionPositions(accountNumber);
            }
            return FlowKt.distinctUntilChanged(takeWhileLoggedIn(flowStreamUiAggregateOptionPositions));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Flow<Optional<UiAggregateOptionPositionFull>> streamUiPosition(Optional<AggregateOptionPosition> optional) {
            Flow<UiAggregateOptionPositionFull> flowStreamUiPosition;
            Flow<Optional<UiAggregateOptionPositionFull>> optionals;
            AggregateOptionPosition orNull = optional.getOrNull();
            return (orNull == null || (flowStreamUiPosition = streamUiPosition(orNull)) == null || (optionals = Operators.toOptionals(flowStreamUiPosition)) == null) ? FlowKt.flowOf(Optional2.INSTANCE) : optionals;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Flow<UiAggregateOptionPositionFull> streamUiPosition(final AggregateOptionPosition aggregateOptionPosition) {
            Flow<UiOptionChain> flowAsFlow = this.optionChainStore.getStreamUiOptionChain().asFlow(aggregateOptionPosition.getOptionChainId());
            final Flow<List<UiAggregateOptionPositionLeg>> allLegsFromMultipleUiAggregateOptionPositions = this.dao.getAllLegsFromMultipleUiAggregateOptionPositions(CollectionsKt.listOf(aggregateOptionPosition.getId()));
            return FlowKt.combine(flowAsFlow, new Flow<List<? extends UiAggregateOptionPositionLeg>>() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiPosition$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends UiAggregateOptionPositionLeg>> flowCollector, Continuation continuation) {
                    Object objCollect = allLegsFromMultipleUiAggregateOptionPositions.collect(new C335522(flowCollector, aggregateOptionPosition), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiPosition$$inlined$filter$1$2 */
                public static final class C335522<T> implements FlowCollector {
                    final /* synthetic */ AggregateOptionPosition $this_streamUiPosition$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiPosition$$inlined$filter$1$2", m3645f = "AggregateOptionPositionStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiPosition$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C335522.this.emit(null, this);
                        }
                    }

                    public C335522(FlowCollector flowCollector, AggregateOptionPosition aggregateOptionPosition) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$this_streamUiPosition$inlined = aggregateOptionPosition;
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
                            if (this.$this_streamUiPosition$inlined.getNumLegs() == ((List) obj).size()) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
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
            }, new C335681(aggregateOptionPosition, null));
        }

        /* compiled from: AggregateOptionPositionStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", TransitionReason.OPTION_TRADE_CHAIN, "Lcom/robinhood/models/ui/UiOptionChain;", "legs", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionLeg;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiPosition$1", m3645f = "AggregateOptionPositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiPosition$1 */
        static final class C335681 extends ContinuationImpl7 implements Function3<UiOptionChain, List<? extends UiAggregateOptionPositionLeg>, Continuation<? super UiAggregateOptionPositionFull>, Object> {
            final /* synthetic */ AggregateOptionPosition $this_streamUiPosition;
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C335681(AggregateOptionPosition aggregateOptionPosition, Continuation<? super C335681> continuation) {
                super(3, continuation);
                this.$this_streamUiPosition = aggregateOptionPosition;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(UiOptionChain uiOptionChain, List<UiAggregateOptionPositionLeg> list, Continuation<? super UiAggregateOptionPositionFull> continuation) {
                C335681 c335681 = new C335681(this.$this_streamUiPosition, continuation);
                c335681.L$0 = uiOptionChain;
                c335681.L$1 = list;
                return c335681.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(UiOptionChain uiOptionChain, List<? extends UiAggregateOptionPositionLeg> list, Continuation<? super UiAggregateOptionPositionFull> continuation) {
                return invoke2(uiOptionChain, (List<UiAggregateOptionPositionLeg>) list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new UiAggregateOptionPositionFull(this.$this_streamUiPosition, (UiOptionChain) this.L$0, (List) this.L$1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Flow<List<UiAggregateOptionPositionFull>> streamUiAggregateOptionPositionFull(List<AggregateOptionPosition> list) {
            List<AggregateOptionPosition> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AggregateOptionPosition) it.next()).getOptionChainId());
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AggregateOptionPosition) it2.next()).getId());
            }
            final Flow<List<UiOptionChain>> flowAsFlow = this.optionChainStore.getStreamUiOptionChains().asFlow(arrayList);
            Flow<Map<UUID, ? extends UiOptionChain>> flow = new Flow<Map<UUID, ? extends UiOptionChain>>() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionFull$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Map<UUID, ? extends UiOptionChain>> flowCollector, Continuation continuation) {
                    Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionFull$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionFull$$inlined$map$1$2", m3645f = "AggregateOptionPositionStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionFull$$inlined$map$1$2$1, reason: invalid class name */
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
                                linkedHashMap.put(((UiOptionChain) t).getOptionChain().getId(), t);
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
            };
            final Flow<List<UiAggregateOptionPositionLeg>> allLegsFromMultipleUiAggregateOptionPositions = this.dao.getAllLegsFromMultipleUiAggregateOptionPositions(arrayList2);
            return FlowKt.distinctUntilChanged(FlowKt.combine(flow, new Flow<Map<UUID, ? extends List<? extends UiAggregateOptionPositionLeg>>>() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionFull$$inlined$map$2
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Map<UUID, ? extends List<? extends UiAggregateOptionPositionLeg>>> flowCollector, Continuation continuation) {
                    Object objCollect = allLegsFromMultipleUiAggregateOptionPositions.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionFull$$inlined$map$2$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionFull$$inlined$map$2$2", m3645f = "AggregateOptionPositionStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionFull$$inlined$map$2$2$1, reason: invalid class name */
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
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (T t : (List) obj) {
                                UUID aggregateOptionPositionId = ((UiAggregateOptionPositionLeg) t).getAggregateOptionPositionId();
                                Object arrayList = linkedHashMap.get(aggregateOptionPositionId);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    linkedHashMap.put(aggregateOptionPositionId, arrayList);
                                }
                                ((List) arrayList).add(t);
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
            }, new C335651(list, null)));
        }

        /* compiled from: AggregateOptionPositionStore.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00010\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "chainIdToUiOptionChainMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/UiOptionChain;", "positionIdToLegsMap", "Lcom/robinhood/models/ui/UiAggregateOptionPositionLeg;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionFull$1", m3645f = "AggregateOptionPositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$streamUiAggregateOptionPositionFull$1 */
        static final class C335651 extends ContinuationImpl7 implements Function3<Map<UUID, ? extends UiOptionChain>, Map<UUID, ? extends List<? extends UiAggregateOptionPositionLeg>>, Continuation<? super List<? extends UiAggregateOptionPositionFull>>, Object> {
            final /* synthetic */ List<AggregateOptionPosition> $this_streamUiAggregateOptionPositionFull;
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C335651(List<AggregateOptionPosition> list, Continuation<? super C335651> continuation) {
                super(3, continuation);
                this.$this_streamUiAggregateOptionPositionFull = list;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends UiOptionChain> map, Map<UUID, ? extends List<? extends UiAggregateOptionPositionLeg>> map2, Continuation<? super List<? extends UiAggregateOptionPositionFull>> continuation) {
                return invoke2((Map<UUID, UiOptionChain>) map, (Map<UUID, ? extends List<UiAggregateOptionPositionLeg>>) map2, (Continuation<? super List<UiAggregateOptionPositionFull>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<UUID, UiOptionChain> map, Map<UUID, ? extends List<UiAggregateOptionPositionLeg>> map2, Continuation<? super List<UiAggregateOptionPositionFull>> continuation) {
                C335651 c335651 = new C335651(this.$this_streamUiAggregateOptionPositionFull, continuation);
                c335651.L$0 = map;
                c335651.L$1 = map2;
                return c335651.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Map map = (Map) this.L$0;
                Map map2 = (Map) this.L$1;
                List<AggregateOptionPosition> list = this.$this_streamUiAggregateOptionPositionFull;
                ArrayList arrayList = new ArrayList();
                for (AggregateOptionPosition aggregateOptionPosition : list) {
                    UiOptionChain uiOptionChain = (UiOptionChain) map.get(aggregateOptionPosition.getOptionChainId());
                    List list2 = (List) map2.get(aggregateOptionPosition.getId());
                    boolean z = false;
                    if (list2 != null && list2.size() == aggregateOptionPosition.getNumLegs()) {
                        z = true;
                    }
                    UiAggregateOptionPositionFull uiAggregateOptionPositionFull = (uiOptionChain == null || list2 == null || !z) ? null : new UiAggregateOptionPositionFull(aggregateOptionPosition, uiOptionChain, list2);
                    if (uiAggregateOptionPositionFull != null) {
                        arrayList.add(uiAggregateOptionPositionFull);
                    }
                }
                return arrayList;
            }
        }

        public static /* synthetic */ void refresh$default(AggregateOptionPositionStore aggregateOptionPositionStore, boolean z, UUID uuid, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                uuid = null;
            }
            aggregateOptionPositionStore.refresh(z, uuid, str);
        }

        public final void refresh(boolean force, UUID aggregateOptionPositionId, String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            if (aggregateOptionPositionId == null) {
                refreshAll(force, null, CollectionsKt.listOf(accountNumber));
            } else {
                refreshSingle(force, aggregateOptionPositionId, accountNumber);
            }
        }

        public final void refreshWithChainIds(boolean force, List<UUID> optionChainIds, String accountNumber) {
            Intrinsics.checkNotNullParameter(optionChainIds, "optionChainIds");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            refreshAll(force, optionChainIds, CollectionsKt.listOf(accountNumber));
        }

        /* compiled from: AggregateOptionPositionStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$refreshWithAllAccounts$1", m3645f = "AggregateOptionPositionStore.kt", m3646l = {496}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$refreshWithAllAccounts$1 */
        static final class C335641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $force;
            final /* synthetic */ List<UUID> $optionChainIds;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C335641(boolean z, List<UUID> list, Continuation<? super C335641> continuation) {
                super(2, continuation);
                this.$force = z;
                this.$optionChainIds = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return AggregateOptionPositionStore.this.new C335641(this.$force, this.$optionChainIds, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C335641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Observable<List<String>> observableStreamAllSelfDirectedAccountNumbers = AggregateOptionPositionStore.this.accountProvider.streamAllSelfDirectedAccountNumbers();
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
                List list = (List) obj;
                if (list != null) {
                    AggregateOptionPositionStore.this.refreshAll(this.$force, this.$optionChainIds, list);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void refreshWithAllAccounts$default(AggregateOptionPositionStore aggregateOptionPositionStore, boolean z, List list, int i, Object obj) {
            if ((i & 2) != 0) {
                list = null;
            }
            aggregateOptionPositionStore.refreshWithAllAccounts(z, list);
        }

        public final void refreshWithAllAccounts(boolean force, List<UUID> optionChainIds) {
            BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C335641(force, optionChainIds, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void refreshAll(final boolean force, List<UUID> optionChainIds, final List<String> accountNumbers) {
            Flow<PaginatedResult<ApiAggregateOptionPosition>> flowFetchAllPages;
            ApiAggregateOptionPositionRequest apiAggregateOptionPositionRequest = new ApiAggregateOptionPositionRequest(accountNumbers, optionChainIds);
            if (force) {
                flowFetchAllPages = this.getAggregateOptionPositionsEndpoint.forceFetchAllPages(apiAggregateOptionPositionRequest);
            } else {
                flowFetchAllPages = this.getAggregateOptionPositionsEndpoint.fetchAllPages(apiAggregateOptionPositionRequest);
            }
            ScopedSubscriptionKt.subscribeIn(ObservablesKt.ignoreNetworkExceptions(asObservable(flowFetchAllPages)), getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AggregateOptionPositionStore.refreshAll$lambda$26(this.f$0, force, accountNumbers, (PaginatedResult) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit refreshAll$lambda$26(AggregateOptionPositionStore aggregateOptionPositionStore, boolean z, List list, PaginatedResult positions) {
            Intrinsics.checkNotNullParameter(positions, "positions");
            aggregateOptionPositionStore.pingOptionInstruments(SequencesKt.flatMap(CollectionsKt.asSequence(positions), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AggregateOptionPositionStore.refreshAll$lambda$26$lambda$25((ApiAggregateOptionPosition) obj);
                }
            }));
            OptionPositionStore.refresh$default(aggregateOptionPositionStore.optionPositionStore, z, (UUID) null, list, 2, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Sequence refreshAll$lambda$26$lambda$25(ApiAggregateOptionPosition it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.asSequence(it.getLegs());
        }

        /* compiled from: AggregateOptionPositionStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$refreshSingle$1", m3645f = "AggregateOptionPositionStore.kt", m3646l = {437, 439}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$refreshSingle$1 */
        static final class C335631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ UUID $aggregateOptionPositionId;
            final /* synthetic */ boolean $force;
            int label;
            final /* synthetic */ AggregateOptionPositionStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C335631(boolean z, AggregateOptionPositionStore aggregateOptionPositionStore, UUID uuid, String str, Continuation<? super C335631> continuation) {
                super(2, continuation);
                this.$force = z;
                this.this$0 = aggregateOptionPositionStore;
                this.$aggregateOptionPositionId = uuid;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C335631(this.$force, this.this$0, this.$aggregateOptionPositionId, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C335631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
            
                if (r12 == r0) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
            
                if (r12 == r0) goto L18;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                C335631 c335631;
                ApiAggregateOptionPosition apiAggregateOptionPosition;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$force) {
                        Endpoint endpoint = this.this$0.getAggregateOptionPositionEndpoint;
                        Tuples2 tuples2M3642to = Tuples4.m3642to(this.$aggregateOptionPositionId, this.$accountNumber);
                        this.label = 1;
                        obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, this, 2, null);
                        c335631 = this;
                    } else {
                        c335631 = this;
                        Endpoint endpoint2 = c335631.this$0.getAggregateOptionPositionEndpoint;
                        Tuples2 tuples2M3642to2 = Tuples4.m3642to(c335631.$aggregateOptionPositionId, c335631.$accountNumber);
                        c335631.label = 2;
                        obj = Endpoint.DefaultImpls.fetch$default(endpoint2, tuples2M3642to2, null, c335631, 2, null);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    c335631 = this;
                    apiAggregateOptionPosition = (ApiAggregateOptionPosition) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c335631 = this;
                    apiAggregateOptionPosition = (ApiAggregateOptionPosition) obj;
                }
                if (apiAggregateOptionPosition != null) {
                    c335631.this$0.pingOptionInstruments(CollectionsKt.asSequence(apiAggregateOptionPosition.getLegs()));
                    OptionPositionStore.refresh$default(c335631.this$0.optionPositionStore, c335631.$force, (UUID) null, CollectionsKt.listOf(c335631.$accountNumber), 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        private final void refreshSingle(boolean force, UUID aggregateOptionPositionId, String accountNumber) {
            BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C335631(force, this, aggregateOptionPositionId, accountNumber, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void pingOptionInstruments(Sequence<ApiAggregateOptionPosition.Leg> legs) {
            pingOptionInstrumentsRaw(SequencesKt.map(legs, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AggregateOptionPositionStore.pingOptionInstruments$lambda$27((ApiAggregateOptionPosition.Leg) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID pingOptionInstruments$lambda$27(ApiAggregateOptionPosition.Leg it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt.toUuid(HttpUrls.lastNonEmptyPathSegment(it.getOption()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmName
        public final void pingOptionInstrumentsRaw(Sequence<UUID> optionInstrumentIds) {
            OptionInstrumentStore.pingOptionInstruments$default(this.optionInstrumentStore, SequencesKt.asIterable(optionInstrumentIds), false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean matchesLegs(UiOptionOrder order, UiAggregateOptionPositionFull position) {
            Object next;
            if (position.getLegs().size() != order.getLegs().size()) {
                return false;
            }
            for (UiOptionOrderLeg uiOptionOrder2 : order.getLegs()) {
                Iterator<T> it = position.getLegs().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (matches(uiOptionOrder2, (AggregateOptionPositionLeg) next)) {
                        break;
                    }
                }
                if (next == null) {
                    return false;
                }
            }
            return true;
        }

        private final boolean matches(UiOptionOrderLeg orderLeg, AggregateOptionPositionLeg positionLeg) {
            OptionPositionType optionPositionType;
            int i = WhenMappings.$EnumSwitchMapping$0[orderLeg.getLeg().getSide().ordinal()];
            if (i == 1) {
                optionPositionType = OptionPositionType.LONG;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                optionPositionType = OptionPositionType.SHORT;
            }
            return optionPositionType == positionLeg.getPositionType() && Intrinsics.areEqual(orderLeg.getOptionInstrument().getId(), positionLeg.getOptionInstrumentId()) && orderLeg.getLeg().getRatioQuantity() == positionLeg.getRatioQuantity().intValue();
        }
    }
