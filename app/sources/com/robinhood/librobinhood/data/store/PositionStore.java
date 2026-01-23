package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.experiments.PositionsBackendPolling;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiPosition;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.PositionDao;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Maybes2;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: PositionStore.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 V2\u00020\u0001:\u0003WXVB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00142\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0018J\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001f¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J'\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001a¢\u0006\u0004\b&\u0010'J/\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0(2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001a¢\u0006\u0004\b)\u0010*J3\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0-0\u00142\u0006\u0010+\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u0012¢\u0006\u0004\b.\u0010/J-\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010+\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u0012¢\u0006\u0004\b0\u0010/J\u0015\u00102\u001a\u0002012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u0002012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b4\u00105J-\u00108\u001a\b\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010+\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u0002012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J \u0010>\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010+\u001a\u00020$H\u0086@¢\u0006\u0004\b>\u0010?J'\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0(2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00160H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR&\u0010M\u001a\u0014\u0012\u0004\u0012\u00020I\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160L0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010KR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR&\u0010S\u001a\u0014\u0012\u0004\u0012\u00020R\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0-0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR&\u0010U\u001a\u0014\u0012\u0004\u0012\u00020R\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0-0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010T¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PositionStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/PositionDao;", "dao", "Lcom/robinhood/api/retrofit/Brokeback;", "brokeback", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/PositionDao;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "", "accountNumber", "", "force", "Lio/reactivex/Observable;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiPosition;", "getNetworkObservable", "(Ljava/lang/String;Z)Lio/reactivex/Observable;", "filledOnly", "", "Lcom/robinhood/models/db/Position;", "getIndividualAccountPositions", "(Z)Lio/reactivex/Observable;", "getAccountPositions", "Lio/reactivex/Single;", "hasIndividualAccountPositions", "()Lio/reactivex/Single;", "hasAccountPositions", "(Ljava/lang/String;)Lio/reactivex/Single;", "Ljava/util/UUID;", "ids", "getIndividualAccountPositionsForInstruments", "(Ljava/util/List;)Lio/reactivex/Observable;", "Lkotlinx/coroutines/flow/Flow;", "getAccountPositionsForInstruments", "(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "instrumentId", "includeEmptyPosition", "Lcom/robinhood/utils/Optional;", "getPositionForAccountOptional", "(Ljava/util/UUID;Ljava/lang/String;Z)Lio/reactivex/Observable;", "getPositionForAccount", "", "refreshIndividualAccount", "(Z)V", "refreshAccount", "(Ljava/lang/String;Z)V", "j$/time/Duration", "duration", "pollForAccount", "(Ljava/util/UUID;Ljava/lang/String;Lj$/time/Duration;)Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Order;", Card.Icon.ORDER, "refreshForOrder", "(Lcom/robinhood/models/db/Order;)V", "fetchPositionForInstrument", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountNumbers", "refreshAndStreamPositions", "(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/dao/PositionDao;", "Lcom/robinhood/api/retrofit/Brokeback;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/PositionStore$RequestPosition;", "positionEndpointForAccount", "Lcom/robinhood/android/moria/network/Endpoint;", "Lretrofit2/Response;", "positionEndpointWithHeadersForAccount", "Lcom/robinhood/api/PaginatedEndpoint;", "positionsEndpointForAccount", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/librobinhood/data/store/PositionStore$RequestPositionForAccount;", "streamPositionForAccount", "Lcom/robinhood/android/moria/db/Query;", "streamPositionForAccountWithBackendPolling", "Companion", "RequestPositionForAccount", "RequestPosition", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PositionStore extends Store {
    private static final int POSITIONS_BUFFER_SIZE = 900;
    private final AccountProvider accountProvider;
    private final Brokeback brokeback;
    private final PositionDao dao;
    private final ExperimentsStore experimentsStore;
    private final InstrumentStore instrumentStore;
    private final Endpoint<RequestPosition, ApiPosition> positionEndpointForAccount;
    private final Endpoint<RequestPosition, Response<ApiPosition>> positionEndpointWithHeadersForAccount;
    private final PaginatedEndpoint<String, ApiPosition> positionsEndpointForAccount;
    private final Query<RequestPositionForAccount, Optional<Position>> streamPositionForAccount;
    private final Query<RequestPositionForAccount, Optional<Position>> streamPositionForAccountWithBackendPolling;

    /* compiled from: PositionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PositionStore", m3645f = "PositionStore.kt", m3646l = {332}, m3647m = "fetchPositionForInstrument")
    /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$fetchPositionForInstrument$1 */
    static final class C342451 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C342451(Continuation<? super C342451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PositionStore.this.fetchPositionForInstrument(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionStore(StoreBundle storeBundle, PositionDao dao, Brokeback brokeback, AccountProvider accountProvider, InstrumentStore instrumentStore, ExperimentsStore experimentsStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.dao = dao;
        this.brokeback = brokeback;
        this.accountProvider = accountProvider;
        this.instrumentStore = instrumentStore;
        this.experimentsStore = experimentsStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.positionEndpointForAccount = Endpoint.Companion.create$default(companion, new PositionStore3(this, null), getLogoutKillswitch(), new PositionStore4(dao), storeBundle.getClock(), null, 16, null);
        this.positionEndpointWithHeadersForAccount = Endpoint.Companion.create$default(companion, new PositionStore5(this, null), getLogoutKillswitch(), new PositionStore6(this, null), storeBundle.getClock(), null, 16, null);
        this.positionsEndpointForAccount = PaginatedEndpoint.Companion.createWithParams$default(PaginatedEndpoint.INSTANCE, new PositionStore7(this, null), getLogoutKillswitch(), new PositionStore8(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.streamPositionForAccount = Store.createOptional$default(this, companion2, "streamPosition", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.PositionStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionStore.streamPositionForAccount$lambda$0(this.f$0, (PositionStore.RequestPositionForAccount) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.PositionStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionStore.streamPositionForAccount$lambda$1(this.f$0, (PositionStore.RequestPositionForAccount) obj);
            }
        }, false, 8, null);
        this.streamPositionForAccountWithBackendPolling = Store.createOptional$default(this, companion2, "streamPosition", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.PositionStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionStore.streamPositionForAccountWithBackendPolling$lambda$2(this.f$0, (PositionStore.RequestPositionForAccount) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.PositionStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionStore.streamPositionForAccountWithBackendPolling$lambda$3(this.f$0, (PositionStore.RequestPositionForAccount) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: PositionStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PositionStore$RequestPositionForAccount;", "", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "includeEmptyPosition", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Z)V", "getInstrumentId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "getIncludeEmptyPosition", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestPositionForAccount {
        private final String accountNumber;
        private final boolean includeEmptyPosition;
        private final UUID instrumentId;

        public static /* synthetic */ RequestPositionForAccount copy$default(RequestPositionForAccount requestPositionForAccount, UUID uuid, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = requestPositionForAccount.instrumentId;
            }
            if ((i & 2) != 0) {
                str = requestPositionForAccount.accountNumber;
            }
            if ((i & 4) != 0) {
                z = requestPositionForAccount.includeEmptyPosition;
            }
            return requestPositionForAccount.copy(uuid, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIncludeEmptyPosition() {
            return this.includeEmptyPosition;
        }

        public final RequestPositionForAccount copy(UUID instrumentId, String accountNumber, boolean includeEmptyPosition) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new RequestPositionForAccount(instrumentId, accountNumber, includeEmptyPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestPositionForAccount)) {
                return false;
            }
            RequestPositionForAccount requestPositionForAccount = (RequestPositionForAccount) other;
            return Intrinsics.areEqual(this.instrumentId, requestPositionForAccount.instrumentId) && Intrinsics.areEqual(this.accountNumber, requestPositionForAccount.accountNumber) && this.includeEmptyPosition == requestPositionForAccount.includeEmptyPosition;
        }

        public int hashCode() {
            return (((this.instrumentId.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.includeEmptyPosition);
        }

        public String toString() {
            return "RequestPositionForAccount(instrumentId=" + this.instrumentId + ", accountNumber=" + this.accountNumber + ", includeEmptyPosition=" + this.includeEmptyPosition + ")";
        }

        public RequestPositionForAccount(UUID instrumentId, String accountNumber, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.instrumentId = instrumentId;
            this.accountNumber = accountNumber;
            this.includeEmptyPosition = z;
        }

        public /* synthetic */ RequestPositionForAccount(UUID uuid, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, (i & 4) != 0 ? false : z);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getIncludeEmptyPosition() {
            return this.includeEmptyPosition;
        }
    }

    /* compiled from: PositionStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PositionStore$RequestPosition;", "", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestPosition {
        private final String accountNumber;
        private final UUID instrumentId;

        public static /* synthetic */ RequestPosition copy$default(RequestPosition requestPosition, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = requestPosition.instrumentId;
            }
            if ((i & 2) != 0) {
                str = requestPosition.accountNumber;
            }
            return requestPosition.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final RequestPosition copy(UUID instrumentId, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new RequestPosition(instrumentId, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestPosition)) {
                return false;
            }
            RequestPosition requestPosition = (RequestPosition) other;
            return Intrinsics.areEqual(this.instrumentId, requestPosition.instrumentId) && Intrinsics.areEqual(this.accountNumber, requestPosition.accountNumber);
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "RequestPosition(instrumentId=" + this.instrumentId + ", accountNumber=" + this.accountNumber + ")";
        }

        public RequestPosition(UUID instrumentId, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.instrumentId = instrumentId;
            this.accountNumber = accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object positionEndpointForAccount$insert(PositionDao positionDao, ApiPosition apiPosition, Continuation continuation) {
        positionDao.insert(apiPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamPositionForAccount$lambda$0(PositionStore positionStore, RequestPositionForAccount requestPositionForAccount) {
        Intrinsics.checkNotNullParameter(requestPositionForAccount, "<destruct>");
        return Endpoint.DefaultImpls.poll$default(positionStore.positionEndpointForAccount, new RequestPosition(requestPositionForAccount.getInstrumentId(), requestPositionForAccount.getAccountNumber()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamPositionForAccount$lambda$1(PositionStore positionStore, RequestPositionForAccount requestPositionForAccount) {
        Intrinsics.checkNotNullParameter(requestPositionForAccount, "<destruct>");
        return positionStore.dao.getPosition(requestPositionForAccount.getInstrumentId(), requestPositionForAccount.getAccountNumber(), requestPositionForAccount.getIncludeEmptyPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamPositionForAccountWithBackendPolling$lambda$2(PositionStore positionStore, RequestPositionForAccount requestPositionForAccount) {
        Intrinsics.checkNotNullParameter(requestPositionForAccount, "<destruct>");
        return Endpoint8.backendPoll$default(positionStore.positionEndpointWithHeadersForAccount, new RequestPosition(requestPositionForAccount.getInstrumentId(), requestPositionForAccount.getAccountNumber()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamPositionForAccountWithBackendPolling$lambda$3(PositionStore positionStore, RequestPositionForAccount requestPositionForAccount) {
        Intrinsics.checkNotNullParameter(requestPositionForAccount, "<destruct>");
        return positionStore.dao.getPosition(requestPositionForAccount.getInstrumentId(), requestPositionForAccount.getAccountNumber(), requestPositionForAccount.getIncludeEmptyPosition());
    }

    public final Observable<List<Position>> getIndividualAccountPositions(final boolean filledOnly) {
        Observable observableFlatMapObservable = this.accountProvider.getIndividualAccountNumberMaybe().flatMapObservable(new Function() { // from class: com.robinhood.librobinhood.data.store.PositionStore.getIndividualAccountPositions.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Position>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return PositionStore.this.getAccountPositions(accountNumber, filledOnly);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        return observableFlatMapObservable;
    }

    public final Observable<List<Position>> getAccountPositions(String accountNumber, final boolean filledOnly) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final Flow<List<Position>> positions = this.dao.getPositions(accountNumber);
        return asObservable(takeWhileLoggedIn(new Flow<List<? extends Position>>() { // from class: com.robinhood.librobinhood.data.store.PositionStore$getAccountPositions$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Position>> flowCollector, Continuation continuation) {
                Object objCollect = positions.collect(new C342412(flowCollector, filledOnly), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$getAccountPositions$$inlined$map$1$2 */
            public static final class C342412<T> implements FlowCollector {
                final /* synthetic */ boolean $filledOnly$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PositionStore$getAccountPositions$$inlined$map$1$2", m3645f = "PositionStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$getAccountPositions$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C342412.this.emit(null, this);
                    }
                }

                public C342412(FlowCollector flowCollector, boolean z) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$filledOnly$inlined = z;
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
                        if (this.$filledOnly$inlined) {
                            ArrayList arrayList = new ArrayList();
                            for (T t : list) {
                                if (Position5.getHasPosition((Position) t)) {
                                    arrayList.add(t);
                                }
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
        }));
    }

    public final Single<Boolean> hasIndividualAccountPositions() {
        Single<Boolean> singleOnErrorReturnItem = this.accountProvider.getIndividualAccountNumberMaybe().flatMapSingle(new Function() { // from class: com.robinhood.librobinhood.data.store.PositionStore.hasIndividualAccountPositions.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return PositionStore.this.hasAccountPositions(accountNumber);
            }
        }).onErrorReturnItem(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        return singleOnErrorReturnItem;
    }

    /* compiled from: PositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PositionStore$hasAccountPositions$1", m3645f = "PositionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$hasAccountPositions$1 */
    static final class C342511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342511(String str, Continuation<? super C342511> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionStore.this.new C342511(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C342511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PositionDao positionDao = PositionStore.this.dao;
            String str = this.$accountNumber;
            this.label = 1;
            Object positionCount = positionDao.getPositionCount(str, this);
            return positionCount == coroutine_suspended ? coroutine_suspended : positionCount;
        }
    }

    public final Single<Boolean> hasAccountPositions(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Single<Boolean> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C342511(accountNumber, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.PositionStore.hasAccountPositions.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.intValue() > 0);
            }
        }).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.PositionStore.hasAccountPositions.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(Boolean hasPositions) {
                Intrinsics.checkNotNullParameter(hasPositions, "hasPositions");
                if (hasPositions.booleanValue()) {
                    return Single.just(hasPositions);
                }
                return PositionStore.this.getNetworkObservable(accountNumber, true).map(new Function() { // from class: com.robinhood.librobinhood.data.store.PositionStore.hasAccountPositions.3.1
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(PaginatedResult<ApiPosition> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(!it.getResults().isEmpty());
                    }
                }).first(Boolean.FALSE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Observable<List<Position>> getIndividualAccountPositionsForInstruments(List<UUID> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        final List listChunked = CollectionsKt.chunked(ids, POSITIONS_BUFFER_SIZE);
        Observable observableSwitchMap = this.accountProvider.streamIndividualAccountNumberOptional().distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.PositionStore.getIndividualAccountPositionsForInstruments.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Position>> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                final String strComponent1 = optional.component1();
                if (strComponent1 == null) {
                    return Observable.just(CollectionsKt.emptyList());
                }
                Observable observableFromIterable = Observable.fromIterable(listChunked);
                final PositionStore positionStore = this;
                return observableFromIterable.concatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.PositionStore.getIndividualAccountPositionsForInstruments.1.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends List<Position>> apply(List<UUID> idChunk) {
                        Intrinsics.checkNotNullParameter(idChunk, "idChunk");
                        PositionStore positionStore2 = positionStore;
                        return positionStore2.asObservable(FlowKt.take(positionStore2.takeWhileLoggedIn(positionStore2.dao.getPositionsForInstruments(strComponent1, idChunk)), 1));
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Flow<List<Position>> getAccountPositionsForInstruments(String accountNumber, List<UUID> ids) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(ids, "ids");
        return FlowKt.flatMapConcat(FlowKt.asFlow(CollectionsKt.chunked(ids, POSITIONS_BUFFER_SIZE)), new C342461(accountNumber, null));
    }

    /* compiled from: PositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/db/Position;", "idChunk", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PositionStore$getAccountPositionsForInstruments$1", m3645f = "PositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$getAccountPositionsForInstruments$1 */
    static final class C342461 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super Flow<? extends List<? extends Position>>>, Object> {
        final /* synthetic */ String $accountNumber;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342461(String str, Continuation<? super C342461> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C342461 c342461 = PositionStore.this.new C342461(this.$accountNumber, continuation);
            c342461.L$0 = obj;
            return c342461;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super Flow<? extends List<? extends Position>>> continuation) {
            return invoke2((List<UUID>) list, (Continuation<? super Flow<? extends List<Position>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<UUID> list, Continuation<? super Flow<? extends List<Position>>> continuation) {
            return ((C342461) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<UUID> list = (List) this.L$0;
            PositionStore positionStore = PositionStore.this;
            return positionStore.takeWhileLoggedIn(positionStore.dao.getPositionsForInstruments(this.$accountNumber, list));
        }
    }

    public static /* synthetic */ Observable getPositionForAccountOptional$default(PositionStore positionStore, UUID uuid, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return positionStore.getPositionForAccountOptional(uuid, str, z);
    }

    public final Observable<Optional<Position>> getPositionForAccountOptional(final UUID instrumentId, final String accountNumber, final boolean includeEmptyPosition) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable<Optional<Position>> observableFlatMap = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{PositionsBackendPolling.INSTANCE}, false, null, 6, null).distinctUntilChanged().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.PositionStore.getPositionForAccountOptional.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Position>> apply(Boolean inPositionsPolling) {
                Intrinsics.checkNotNullParameter(inPositionsPolling, "inPositionsPolling");
                return (inPositionsPolling.booleanValue() ? PositionStore.this.streamPositionForAccountWithBackendPolling : PositionStore.this.streamPositionForAccount).asObservable(new RequestPositionForAccount(instrumentId, accountNumber, includeEmptyPosition));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    public static /* synthetic */ Observable getPositionForAccount$default(PositionStore positionStore, UUID uuid, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return positionStore.getPositionForAccount(uuid, str, z);
    }

    public final Observable<Position> getPositionForAccount(UUID instrumentId, String accountNumber, boolean includeEmptyPosition) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return ObservablesKt.filterIsPresent(getPositionForAccountOptional(instrumentId, accountNumber, includeEmptyPosition));
    }

    public final void refreshIndividualAccount(final boolean force) {
        ScopedSubscriptionKt.subscribeIn(this.accountProvider.getIndividualAccountNumberMaybe(), getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.PositionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionStore.refreshIndividualAccount$lambda$6(this.f$0, force, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshIndividualAccount$lambda$6(PositionStore positionStore, boolean z, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        positionStore.refreshAccount(accountNumber, z);
        return Unit.INSTANCE;
    }

    public final void refreshAccount(String accountNumber, boolean force) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        ScopedSubscriptionKt.subscribeIn(getNetworkObservable(accountNumber, force), getStoreScope());
    }

    public static /* synthetic */ Observable pollForAccount$default(PositionStore positionStore, UUID uuid, String str, Duration duration, int i, Object obj) {
        if ((i & 4) != 0) {
            duration = Position.INSTANCE.getNormalStaleTimeout();
        }
        return positionStore.pollForAccount(uuid, str, duration);
    }

    public final Observable<ApiPosition> pollForAccount(final UUID instrumentId, final String accountNumber, final Duration duration) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Observable<ApiPosition> observableSwitchMap = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{PositionsBackendPolling.INSTANCE}, false, null, 6, null).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.PositionStore.pollForAccount.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiPosition> apply(Boolean polling) {
                Intrinsics.checkNotNullParameter(polling, "polling");
                if (polling.booleanValue()) {
                    PositionStore positionStore = PositionStore.this;
                    final Flow flowBackendPoll$default = Endpoint8.backendPoll$default(positionStore.positionEndpointWithHeadersForAccount, new RequestPosition(instrumentId, accountNumber), duration, null, 4, null);
                    return positionStore.asObservable(new Flow<ApiPosition>() { // from class: com.robinhood.librobinhood.data.store.PositionStore$pollForAccount$1$apply$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super ApiPosition> flowCollector, Continuation continuation) {
                            Object objCollect = flowBackendPoll$default.collect(new C342422(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$pollForAccount$1$apply$$inlined$mapNotNull$1$2 */
                        public static final class C342422<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PositionStore$pollForAccount$1$apply$$inlined$mapNotNull$1$2", m3645f = "PositionStore.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$pollForAccount$1$apply$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    return C342422.this.emit(null, this);
                                }
                            }

                            public C342422(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
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
                                    Object objBody = ((Response) obj).body();
                                    if (objBody != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(objBody, anonymousClass1) == coroutine_suspended) {
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
                    });
                }
                PositionStore positionStore2 = PositionStore.this;
                return positionStore2.asObservable(Endpoint.DefaultImpls.poll$default(positionStore2.positionEndpointForAccount, new RequestPosition(instrumentId, accountNumber), duration, null, 4, null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final void refreshForOrder(final Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        final UUID instrument = order.getInstrument();
        final boolean z = order.getState() == EquityOrderState.FILLED && order.getSide() == EquityOrderSide.BUY;
        Maybe maybeDoOnSuccess = Maybes2.ignoreNetworkExceptions(RxFactory.DefaultImpls.rxMaybe$default(this, null, new C342571(instrument, order, null), 1, null)).doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.PositionStore.refreshForOrder.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiPosition apiPosition) {
                boolean z2 = apiPosition == null || apiPosition.getQuantity().compareTo(order.getQuantity()) < 0;
                if (z && z2) {
                    PositionStore2 positionStore2 = new PositionStore2(instrument);
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, positionStore2, false, null, 4, null);
                    throw positionStore2;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeDoOnSuccess, "doOnSuccess(...)");
        Maybe maybeOnErrorResumeNext = Maybes2.retryExponential(maybeDoOnSuccess, 5, new Function1() { // from class: com.robinhood.librobinhood.data.store.PositionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PositionStore.refreshForOrder$lambda$7((Throwable) obj));
            }
        }).onErrorResumeNext(new Function() { // from class: com.robinhood.librobinhood.data.store.PositionStore.refreshForOrder.4
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends ApiPosition> apply(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof PositionStore2) {
                    return Maybe.empty();
                }
                return Maybe.error(throwable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeOnErrorResumeNext, "onErrorResumeNext(...)");
        ScopedSubscriptionKt.subscribeIn(maybeOnErrorResumeNext, getStoreScope());
    }

    /* compiled from: PositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiPosition;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PositionStore$refreshForOrder$1", m3645f = "PositionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$refreshForOrder$1 */
    static final class C342571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiPosition>, Object> {
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ Order $order;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342571(UUID uuid, Order order, Continuation<? super C342571> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$order = order;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionStore.this.new C342571(this.$instrumentId, this.$order, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiPosition> continuation) {
            return ((C342571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = PositionStore.this.positionEndpointForAccount;
            RequestPosition requestPosition = new RequestPosition(this.$instrumentId, this.$order.getAccountNumber());
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, requestPosition, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshForOrder$lambda$7(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof PositionStore2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<PaginatedResult<ApiPosition>> getNetworkObservable(String accountNumber, boolean force) {
        Flow<PaginatedResult<ApiPosition>> flowFetchAllPages;
        if (force) {
            flowFetchAllPages = this.positionsEndpointForAccount.forceFetchAllPages(accountNumber);
        } else {
            flowFetchAllPages = this.positionsEndpointForAccount.fetchAllPages(accountNumber);
        }
        Observable<PaginatedResult<ApiPosition>> observableDoOnNext = ObservablesKt.ignoreNetworkExceptions(asObservable(flowFetchAllPages)).doOnNext(new C342491());
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    /* compiled from: PositionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$getNetworkObservable$1 */
    static final class C342491<T> implements Consumer {
        C342491() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID accept$lambda$0(ApiPosition it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getInstrument_id();
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(PaginatedResult<ApiPosition> paginatedResult) {
            InstrumentStore instrumentStore = PositionStore.this.instrumentStore;
            Intrinsics.checkNotNull(paginatedResult);
            instrumentStore.pingInstruments(paginatedResult, new Function1() { // from class: com.robinhood.librobinhood.data.store.PositionStore$getNetworkObservable$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionStore.C342491.accept$lambda$0((ApiPosition) obj);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchPositionForInstrument(String str, UUID uuid, Continuation<? super Position> continuation) {
        C342451 c342451;
        if (continuation instanceof C342451) {
            c342451 = (C342451) continuation;
            int i = c342451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342451.label = i - Integer.MIN_VALUE;
            } else {
                c342451 = new C342451(continuation);
            }
        }
        C342451 c3424512 = c342451;
        Object objForceFetch$default = c3424512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3424512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<RequestPosition, ApiPosition> endpoint = this.positionEndpointForAccount;
            RequestPosition requestPosition = new RequestPosition(uuid, str);
            c3424512.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, requestPosition, null, c3424512, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((ApiPosition) objForceFetch$default).toDbPosition();
    }

    public final Flow<List<Position>> refreshAndStreamPositions(List<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        List<String> list = accountNumbers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.dao.getPositions((String) it.next()));
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]);
        return FlowKt.onStart(new Flow<List<? extends Position>>() { // from class: com.robinhood.librobinhood.data.store.PositionStore$refreshAndStreamPositions$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Position>> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<List<? extends Position>[]>() { // from class: com.robinhood.librobinhood.data.store.PositionStore$refreshAndStreamPositions$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends Position>[] invoke() {
                        return new List[flowArr2.length];
                    }
                }, new C342443(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PositionStore$refreshAndStreamPositions$$inlined$combine$1$3", m3645f = "PositionStore.kt", m3646l = {288}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$refreshAndStreamPositions$$inlined$combine$1$3 */
            public static final class C342443 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends Position>>, List<? extends Position>[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C342443(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super List<? extends Position>> flowCollector, List<? extends Position>[] listArr, Continuation<? super Unit> continuation) {
                    C342443 c342443 = new C342443(continuation);
                    c342443.L$0 = flowCollector;
                    c342443.L$1 = listArr;
                    return c342443.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        List listFlatten = CollectionsKt.flatten(ArraysKt.toList((List[]) ((Object[]) this.L$1)));
                        this.label = 1;
                        if (flowCollector.emit(listFlatten, this) == coroutine_suspended) {
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
        }, new C342563(accountNumbers, this, null));
    }

    /* compiled from: PositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/models/db/Position;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PositionStore$refreshAndStreamPositions$3", m3645f = "PositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.PositionStore$refreshAndStreamPositions$3 */
    static final class C342563 extends ContinuationImpl7 implements Function2<FlowCollector<? super List<? extends Position>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $accountNumbers;
        int label;
        final /* synthetic */ PositionStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342563(List<String> list, PositionStore positionStore, Continuation<? super C342563> continuation) {
            super(2, continuation);
            this.$accountNumbers = list;
            this.this$0 = positionStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C342563(this.$accountNumbers, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends Position>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<Position>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<Position>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C342563) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<String> list = this.$accountNumbers;
            PositionStore positionStore = this.this$0;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                positionStore.refreshAccount((String) it.next(), false);
            }
            return Unit.INSTANCE;
        }
    }
}
