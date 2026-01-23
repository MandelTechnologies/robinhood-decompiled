package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiOptionStrategyChainTemplate;
import com.robinhood.models.api.strategybuilder.ApiOptionStrategyBuilder;
import com.robinhood.models.api.strategybuilder.ApiOptionStrategyBuilderNuxStates;
import com.robinhood.models.api.strategybuilder.ApiOptionStrategyBuilderTourStates;
import com.robinhood.models.dao.OptionStrategyBuilderDao;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionStrategyBuilder;
import com.robinhood.models.p320db.OptionStrategyBuilderNuxStates;
import com.robinhood.models.p320db.OptionStrategyBuilderTourStates;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Clock;
import p479j$.time.LocalDate;

/* compiled from: OptionStrategyBuilderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00014B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001f0(J\u000e\u0010 \u001a\u00020)2\u0006\u0010*\u001a\u00020\u0016J\u000e\u0010'\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.J\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000(2\u0006\u00102\u001a\u000203R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020#0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020%0\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c0!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "dao", "Lcom/robinhood/models/dao/OptionStrategyBuilderDao;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;Lcom/robinhood/models/dao/OptionStrategyBuilderDao;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/store/StoreBundle;)V", "getOptionStrategyBuilder", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "Lcom/robinhood/models/api/strategybuilder/ApiOptionStrategyBuilder;", "streamOptionStrategyBuilder", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/OptionStrategyBuilder;", "getStreamOptionStrategyBuilder", "()Lcom/robinhood/android/moria/db/Query;", "getOptionsStrategyChainTemplate", "", "Lcom/robinhood/models/api/ApiOptionStrategyChainTemplate;", "streamOptionStrategyChainTemplate", "Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "getStreamOptionStrategyChainTemplate", "getShouldShowStrategyBuilderNux", "", "Lcom/robinhood/models/api/strategybuilder/ApiOptionStrategyBuilderNuxStates;", "streamShouldShowStrategyBuilderNux", "Lcom/robinhood/models/db/OptionStrategyBuilderNuxStates;", "updateShouldShowStrategyBuilderNux", "Lcom/robinhood/android/moria/network/PostEndpoint;", "getShouldShowStrategyBuilderTour", "Lcom/robinhood/models/api/strategybuilder/ApiOptionStrategyBuilderTourStates;", "streamShouldShowStrategyBuilderTour", "Lcom/robinhood/models/db/OptionStrategyBuilderTourStates;", "getStreamShouldShowStrategyBuilderTour", "updateShouldShowStrategyBuilderTour", "Lio/reactivex/Observable;", "Lio/reactivex/Completable;", "optionStrategyType", "strategy", "refreshOptionInstruments", "params", "Lcom/robinhood/librobinhood/data/store/GetOptionInstrumentsParams;", "streamLegOptionInstruments", "", "Lcom/robinhood/models/db/OptionInstrument;", "args", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;", "LegStreamingArgs", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionStrategyBuilderStore extends Store {
    private final OptionsBonfireApi bonfireApi;
    private final OptionStrategyBuilderDao dao;
    private final Endpoint<OptionChain.UnderlyingType, ApiOptionStrategyBuilder> getOptionStrategyBuilder;
    private final Endpoint<String, ApiOptionStrategyChainTemplate> getOptionsStrategyChainTemplate;
    private final Endpoint<Unit, ApiOptionStrategyBuilderNuxStates> getShouldShowStrategyBuilderNux;
    private final Endpoint<Unit, ApiOptionStrategyBuilderTourStates> getShouldShowStrategyBuilderTour;
    private final OptionInstrumentStore optionInstrumentStore;
    private final Query<OptionChain.UnderlyingType, OptionStrategyBuilder> streamOptionStrategyBuilder;
    private final Query<String, OptionStrategyChainTemplate> streamOptionStrategyChainTemplate;
    private final Query<Unit, OptionStrategyBuilderNuxStates> streamShouldShowStrategyBuilderNux;
    private final Query<Unit, OptionStrategyBuilderTourStates> streamShouldShowStrategyBuilderTour;
    private final PostEndpoint<String, Unit> updateShouldShowStrategyBuilderNux;
    private final PostEndpoint<String, Unit> updateShouldShowStrategyBuilderTour;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getShouldShowStrategyBuilderNux$lambda$3(Long l) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getShouldShowStrategyBuilderTour$lambda$6(Long l) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyBuilderStore(OptionsBonfireApi bonfireApi, OptionStrategyBuilderDao dao, OptionInstrumentStore optionInstrumentStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        this.dao = dao;
        this.optionInstrumentStore = optionInstrumentStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Durations durations = Durations.INSTANCE;
        Endpoint<OptionChain.UnderlyingType, ApiOptionStrategyBuilder> endpointCreate = companion.create(new OptionStrategyBuilderStore$getOptionStrategyBuilder$1(this, null), logoutKillswitch, new OptionStrategyBuilderStore$getOptionStrategyBuilder$2(this, null), clock, new DefaultStaleDecider(durations.getONE_HOUR(), storeBundle.getClock()));
        this.getOptionStrategyBuilder = endpointCreate;
        Query.Companion companion2 = Query.INSTANCE;
        this.streamOptionStrategyBuilder = Store.create$default(this, companion2, "getOptionStrategyBuilder", CollectionsKt.listOf(new RefreshEach(new OptionStrategyBuilderStore$streamOptionStrategyBuilder$1(endpointCreate))), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderStore.streamOptionStrategyBuilder$lambda$0(this.f$0, (OptionChain.UnderlyingType) obj);
            }
        }, false, 8, null);
        Endpoint<String, ApiOptionStrategyChainTemplate> endpointCreate2 = companion.create(new OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$1(this, null), getLogoutKillswitch(), new OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getONE_HOUR(), storeBundle.getClock()));
        this.getOptionsStrategyChainTemplate = endpointCreate2;
        this.streamOptionStrategyChainTemplate = Store.create$default(this, companion2, "getOptionsStrategyChainTemplate", CollectionsKt.listOf(new RefreshEach(new OptionStrategyBuilderStore$streamOptionStrategyChainTemplate$1(endpointCreate2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderStore.streamOptionStrategyChainTemplate$lambda$2(this.f$0, (String) obj);
            }
        }, false, 8, null);
        Endpoint<Unit, ApiOptionStrategyBuilderNuxStates> endpointCreate3 = companion.create(new C341261(null), getLogoutKillswitch(), new C341272(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionStrategyBuilderStore.getShouldShowStrategyBuilderNux$lambda$3((Long) obj));
            }
        });
        this.getShouldShowStrategyBuilderNux = endpointCreate3;
        this.streamShouldShowStrategyBuilderNux = Store.create$default(this, companion2, "getShouldShowStrategyBuilderNux", CollectionsKt.listOf(new RefreshEach(new OptionStrategyBuilderStore$streamShouldShowStrategyBuilderNux$1(endpointCreate3))), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderStore.streamShouldShowStrategyBuilderNux$lambda$5(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        PostEndpoint.Companion companion3 = PostEndpoint.INSTANCE;
        this.updateShouldShowStrategyBuilderNux = companion3.create(new C341301(null), new C341312(null));
        Endpoint<Unit, ApiOptionStrategyBuilderTourStates> endpointCreate4 = companion.create(new OptionStrategyBuilderStore$getShouldShowStrategyBuilderTour$1(this, null), getLogoutKillswitch(), new OptionStrategyBuilderStore$getShouldShowStrategyBuilderTour$2(this, null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionStrategyBuilderStore.getShouldShowStrategyBuilderTour$lambda$6((Long) obj));
            }
        });
        this.getShouldShowStrategyBuilderTour = endpointCreate4;
        this.streamShouldShowStrategyBuilderTour = Store.create$default(this, companion2, "getShouldShowStrategyBuilderTour", CollectionsKt.listOf(new RefreshEach(new OptionStrategyBuilderStore$streamShouldShowStrategyBuilderTour$1(endpointCreate4))), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderStore.streamShouldShowStrategyBuilderTour$lambda$8(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.updateShouldShowStrategyBuilderTour = companion3.create(new C341331(bonfireApi), new C341342(null));
    }

    public final Query<OptionChain.UnderlyingType, OptionStrategyBuilder> getStreamOptionStrategyBuilder() {
        return this.streamOptionStrategyBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamOptionStrategyBuilder$lambda$0(OptionStrategyBuilderStore optionStrategyBuilderStore, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        return optionStrategyBuilderStore.dao.getStrategyBuilder(underlyingType);
    }

    public final Query<String, OptionStrategyChainTemplate> getStreamOptionStrategyChainTemplate() {
        return this.streamOptionStrategyChainTemplate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamOptionStrategyChainTemplate$lambda$2(OptionStrategyBuilderStore optionStrategyBuilderStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return optionStrategyBuilderStore.dao.getStrategyChainTemplate(it);
    }

    /* compiled from: OptionStrategyBuilderStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/strategybuilder/ApiOptionStrategyBuilderNuxStates;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$getShouldShowStrategyBuilderNux$1", m3645f = "OptionStrategyBuilderStore.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$getShouldShowStrategyBuilderNux$1 */
    static final class C341261 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiOptionStrategyBuilderNuxStates>, Object> {
        int label;

        C341261(Continuation<? super C341261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStrategyBuilderStore.this.new C341261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super ApiOptionStrategyBuilderNuxStates> continuation) {
            return ((C341261) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
            OptionsBonfireApi optionsBonfireApi = OptionStrategyBuilderStore.this.bonfireApi;
            this.label = 1;
            Object shouldShowStrategyBuilderNux = optionsBonfireApi.getShouldShowStrategyBuilderNux(this);
            return shouldShowStrategyBuilderNux == coroutine_suspended ? coroutine_suspended : shouldShowStrategyBuilderNux;
        }
    }

    /* compiled from: OptionStrategyBuilderStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/strategybuilder/ApiOptionStrategyBuilderNuxStates;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$getShouldShowStrategyBuilderNux$2", m3645f = "OptionStrategyBuilderStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$getShouldShowStrategyBuilderNux$2 */
    static final class C341272 extends ContinuationImpl7 implements Function2<ApiOptionStrategyBuilderNuxStates, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C341272(Continuation<? super C341272> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C341272 c341272 = OptionStrategyBuilderStore.this.new C341272(continuation);
            c341272.L$0 = obj;
            return c341272;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiOptionStrategyBuilderNuxStates apiOptionStrategyBuilderNuxStates, Continuation<? super Unit> continuation) {
            return ((C341272) create(apiOptionStrategyBuilderNuxStates, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionStrategyBuilderStore.this.dao.insert(((ApiOptionStrategyBuilderNuxStates) this.L$0).toDbModel());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamShouldShowStrategyBuilderNux$lambda$5(OptionStrategyBuilderStore optionStrategyBuilderStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return optionStrategyBuilderStore.dao.getStrategyBuilderNuxStates();
    }

    /* compiled from: OptionStrategyBuilderStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderNux$1", m3645f = "OptionStrategyBuilderStore.kt", m3646l = {81}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderNux$1 */
    static final class C341301 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C341301(Continuation<? super C341301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C341301 c341301 = OptionStrategyBuilderStore.this.new C341301(continuation);
            c341301.L$0 = obj;
            return c341301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C341301) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.L$0;
                OptionsBonfireApi optionsBonfireApi = OptionStrategyBuilderStore.this.bonfireApi;
                this.label = 1;
                if (optionsBonfireApi.updateShouldShowStrategyBuilderNux(str, this) == coroutine_suspended) {
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

    /* compiled from: OptionStrategyBuilderStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderNux$2", m3645f = "OptionStrategyBuilderStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderNux$2 */
    static final class C341312 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        C341312(Continuation<? super C341312> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C341312(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C341312) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public final Query<Unit, OptionStrategyBuilderTourStates> getStreamShouldShowStrategyBuilderTour() {
        return this.streamShouldShowStrategyBuilderTour;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamShouldShowStrategyBuilderTour$lambda$8(OptionStrategyBuilderStore optionStrategyBuilderStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return optionStrategyBuilderStore.dao.getStrategyBuilderTours();
    }

    /* compiled from: OptionStrategyBuilderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderTour$1 */
    /* synthetic */ class C341331 extends FunctionReferenceImpl implements Function2<String, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C341331(Object obj) {
            super(2, obj, OptionsBonfireApi.class, "updateShouldShowStrategyBuilderShow", "updateShouldShowStrategyBuilderShow(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((OptionsBonfireApi) this.receiver).updateShouldShowStrategyBuilderShow(str, continuation);
        }
    }

    /* compiled from: OptionStrategyBuilderStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderTour$2", m3645f = "OptionStrategyBuilderStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderTour$2 */
    static final class C341342 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        C341342(Continuation<? super C341342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C341342(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C341342) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public final Observable<OptionStrategyBuilderNuxStates> getShouldShowStrategyBuilderNux() {
        Observable<OptionStrategyBuilderNuxStates> observableOnErrorReturn = this.streamShouldShowStrategyBuilderNux.asObservable(Unit.INSTANCE).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore.getShouldShowStrategyBuilderNux.4
            @Override // io.reactivex.functions.Function
            public final OptionStrategyBuilderNuxStates apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new OptionStrategyBuilderNuxStates(0, CollectionsKt.emptyList(), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
        return observableOnErrorReturn;
    }

    /* compiled from: OptionStrategyBuilderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderNux$3", m3645f = "OptionStrategyBuilderStore.kt", m3646l = {111}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderNux$3 */
    static final class C341323 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $optionStrategyType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341323(String str, Continuation<? super C341323> continuation) {
            super(2, continuation);
            this.$optionStrategyType = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStrategyBuilderStore.this.new C341323(this.$optionStrategyType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C341323) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C341323 c341323;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = OptionStrategyBuilderStore.this.updateShouldShowStrategyBuilderNux;
                String str = this.$optionStrategyType;
                this.label = 1;
                c341323 = this;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, str, null, c341323, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c341323 = this;
            }
            Endpoint endpoint = OptionStrategyBuilderStore.this.getShouldShowStrategyBuilderNux;
            Unit unit = Unit.INSTANCE;
            Endpoint.DefaultImpls.refresh$default(endpoint, unit, false, null, 6, null);
            return unit;
        }
    }

    public final Completable updateShouldShowStrategyBuilderNux(String optionStrategyType) {
        Intrinsics.checkNotNullParameter(optionStrategyType, "optionStrategyType");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C341323(optionStrategyType, null), 1, null);
    }

    /* compiled from: OptionStrategyBuilderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderTour$3", m3645f = "OptionStrategyBuilderStore.kt", m3646l = {118}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$updateShouldShowStrategyBuilderTour$3 */
    static final class C341353 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $strategy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341353(String str, Continuation<? super C341353> continuation) {
            super(2, continuation);
            this.$strategy = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStrategyBuilderStore.this.new C341353(this.$strategy, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C341353) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C341353 c341353;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = OptionStrategyBuilderStore.this.updateShouldShowStrategyBuilderTour;
                String str = this.$strategy;
                this.label = 1;
                c341353 = this;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, str, null, c341353, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c341353 = this;
            }
            Endpoint endpoint = OptionStrategyBuilderStore.this.getShouldShowStrategyBuilderTour;
            Unit unit = Unit.INSTANCE;
            Endpoint.DefaultImpls.refresh$default(endpoint, unit, false, null, 6, null);
            return unit;
        }
    }

    public final Completable updateShouldShowStrategyBuilderTour(String strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C341353(strategy, null), 1, null);
    }

    public final void refreshOptionInstruments(GetOptionInstrumentsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.optionInstrumentStore.getGetOptionInstruments(), params, false, 2, null);
    }

    public final Observable<List<OptionInstrument>> streamLegOptionInstruments(final LegStreamingArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Observable map = this.optionInstrumentStore.getTradeableOptionInstruments(args.getChainId(), args.getContractType(), args.getExpirationDate()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore.streamLegOptionInstruments.1

            /* compiled from: OptionStrategyBuilderStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$streamLegOptionInstruments$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OptionStrategyChainTemplate.SortOrder.values().length];
                    try {
                        iArr[OptionStrategyChainTemplate.SortOrder.ASCENDING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OptionStrategyChainTemplate.SortOrder.DESCENDING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OptionStrategyChainTemplate.SortOrder.UNKNOWN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final List<OptionInstrument> apply(List<OptionInstrument> optionInstruments) {
                Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
                int i = WhenMappings.$EnumSwitchMapping$0[args.getSortOrder().ordinal()];
                if (i == 1) {
                    return CollectionsKt.sortedWith(optionInstruments, new Comparator() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$streamLegOptionInstruments$1$apply$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(((OptionInstrument) t).getStrikePrice(), ((OptionInstrument) t2).getStrikePrice());
                        }
                    });
                }
                if (i == 2) {
                    return CollectionsKt.sortedWith(optionInstruments, new Comparator() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$streamLegOptionInstruments$1$apply$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(((OptionInstrument) t2).getStrikePrice(), ((OptionInstrument) t).getStrikePrice());
                        }
                    });
                }
                if (i == 3) {
                    return optionInstruments;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: OptionStrategyBuilderStore.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013¨\u0006("}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;", "", "Ljava/util/UUID;", "chainId", "Lcom/robinhood/models/db/OptionContractType;", "contractType", "j$/time/LocalDate", "expirationDate", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$SortOrder;", "sortOrder", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/OptionContractType;Lj$/time/LocalDate;Lcom/robinhood/models/db/OptionStrategyChainTemplate$SortOrder;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/models/db/OptionContractType;", "component3", "()Lj$/time/LocalDate;", "component4", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate$SortOrder;", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/db/OptionContractType;Lj$/time/LocalDate;Lcom/robinhood/models/db/OptionStrategyChainTemplate$SortOrder;)Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getChainId", "Lcom/robinhood/models/db/OptionContractType;", "getContractType", "Lj$/time/LocalDate;", "getExpirationDate", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$SortOrder;", "getSortOrder", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LegStreamingArgs {
        private final UUID chainId;
        private final OptionContractType contractType;
        private final LocalDate expirationDate;
        private final OptionStrategyChainTemplate.SortOrder sortOrder;

        public static /* synthetic */ LegStreamingArgs copy$default(LegStreamingArgs legStreamingArgs, UUID uuid, OptionContractType optionContractType, LocalDate localDate, OptionStrategyChainTemplate.SortOrder sortOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = legStreamingArgs.chainId;
            }
            if ((i & 2) != 0) {
                optionContractType = legStreamingArgs.contractType;
            }
            if ((i & 4) != 0) {
                localDate = legStreamingArgs.expirationDate;
            }
            if ((i & 8) != 0) {
                sortOrder = legStreamingArgs.sortOrder;
            }
            return legStreamingArgs.copy(uuid, optionContractType, localDate, sortOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getChainId() {
            return this.chainId;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionContractType getContractType() {
            return this.contractType;
        }

        /* renamed from: component3, reason: from getter */
        public final LocalDate getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionStrategyChainTemplate.SortOrder getSortOrder() {
            return this.sortOrder;
        }

        public final LegStreamingArgs copy(UUID chainId, OptionContractType contractType, LocalDate expirationDate, OptionStrategyChainTemplate.SortOrder sortOrder) {
            Intrinsics.checkNotNullParameter(chainId, "chainId");
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
            Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
            return new LegStreamingArgs(chainId, contractType, expirationDate, sortOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LegStreamingArgs)) {
                return false;
            }
            LegStreamingArgs legStreamingArgs = (LegStreamingArgs) other;
            return Intrinsics.areEqual(this.chainId, legStreamingArgs.chainId) && this.contractType == legStreamingArgs.contractType && Intrinsics.areEqual(this.expirationDate, legStreamingArgs.expirationDate) && this.sortOrder == legStreamingArgs.sortOrder;
        }

        public int hashCode() {
            return (((((this.chainId.hashCode() * 31) + this.contractType.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.sortOrder.hashCode();
        }

        public String toString() {
            return "LegStreamingArgs(chainId=" + this.chainId + ", contractType=" + this.contractType + ", expirationDate=" + this.expirationDate + ", sortOrder=" + this.sortOrder + ")";
        }

        public LegStreamingArgs(UUID chainId, OptionContractType contractType, LocalDate expirationDate, OptionStrategyChainTemplate.SortOrder sortOrder) {
            Intrinsics.checkNotNullParameter(chainId, "chainId");
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
            Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
            this.chainId = chainId;
            this.contractType = contractType;
            this.expirationDate = expirationDate;
            this.sortOrder = sortOrder;
        }

        public final UUID getChainId() {
            return this.chainId;
        }

        public final OptionContractType getContractType() {
            return this.contractType;
        }

        public final LocalDate getExpirationDate() {
            return this.expirationDate;
        }

        public final OptionStrategyChainTemplate.SortOrder getSortOrder() {
            return this.sortOrder;
        }
    }
}
