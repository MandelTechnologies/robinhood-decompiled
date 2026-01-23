package com.robinhood.librobinhood.data.store;

import android.app.Application;
import android.os.PowerManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.Batch;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.api.ApiAggregateOptionQuote;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.AggregateOptionStrategyQuoteDao;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.OptionStrategyInfo;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.PowerManagers;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: AggregateOptionStrategyQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0018\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00120\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0#2\u0006\u0010 \u001a\u00020\u0013¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\"\u0010+\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R(\u00100\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130.\u0012\u0006\u0012\u0004\u0018\u00010/0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R(\u00102\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130.\u0012\u0006\u0012\u0004\u0018\u00010/0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001d038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b4\u00105\u0012\u0004\b6\u00107R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001d038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b8\u00105\u0012\u0004\b9\u00107¨\u0006;"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsApi", "Landroid/app/Application;", "application", "Landroid/os/PowerManager;", "powerManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/AggregateOptionStrategyQuoteDao;", "dao", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsApi;Landroid/app/Application;Landroid/os/PowerManager;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/AggregateOptionStrategyQuoteDao;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;)V", "", "Lcom/robinhood/models/db/OptionStrategyInfo;", "strategyInfoList", "", "force", "", "refreshQuotes", "(Ljava/util/List;Z)V", "", "strategyCodes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/AggregateOptionStrategyQuote;", "streamQuotes", "(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "optionStrategyInfo", "streamAndPollQuote", "(Lcom/robinhood/models/db/OptionStrategyInfo;)Lkotlinx/coroutines/flow/Flow;", "Lio/reactivex/Observable;", "streamAndPollQuoteObservable", "(Lcom/robinhood/models/db/OptionStrategyInfo;)Lio/reactivex/Observable;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "Lcom/robinhood/models/dao/AggregateOptionStrategyQuoteDao;", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "j$/time/Duration", "kotlin.jvm.PlatformType", "pollIntervalObs", "Lio/reactivex/Observable;", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/ApiAggregateOptionQuote;", "endpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "extendedHoursEndpoint", "Lcom/robinhood/android/moria/db/Query;", "query", "Lcom/robinhood/android/moria/db/Query;", "getQuery$annotations", "()V", "extendedHoursQuery", "getExtendedHoursQuery$annotations", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AggregateOptionStrategyQuoteStore extends Store {
    private static final int MAX_BATCH_SIZE = 17;
    private final AggregateOptionStrategyQuoteDao dao;
    private final PaginatedEndpoint<Iterable<OptionStrategyInfo>, ApiAggregateOptionQuote> endpoint;
    private final PaginatedEndpoint<Iterable<OptionStrategyInfo>, ApiAggregateOptionQuote> extendedHoursEndpoint;
    private final Query<OptionStrategyInfo, AggregateOptionStrategyQuote> extendedHoursQuery;
    private final OptionsApi optionsApi;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;
    private final Observable<Duration> pollIntervalObs;
    private final Query<OptionStrategyInfo, AggregateOptionStrategyQuote> query;

    private static /* synthetic */ void getExtendedHoursQuery$annotations() {
    }

    private static /* synthetic */ void getQuery$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregateOptionStrategyQuoteStore(OptionsApi optionsApi, Application application, PowerManager powerManager, Clock clock, StoreBundle storeBundle, AggregateOptionStrategyQuoteDao dao, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        this.optionsApi = optionsApi;
        this.dao = dao;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        Observable<Duration> observableAutoConnect = PowerManagers.powerSaveModeChanges(powerManager, application).map(new Function() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$pollIntervalObs$1
            @Override // io.reactivex.functions.Function
            public final Duration apply(Boolean isInPowerSaveMode) {
                Intrinsics.checkNotNullParameter(isInPowerSaveMode, "isInPowerSaveMode");
                return Duration.ofSeconds(isInPowerSaveMode.booleanValue() ? 5L : 1L);
            }
        }).replay(1).autoConnect();
        Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "autoConnect(...)");
        this.pollIntervalObs = observableAutoConnect;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        this.endpoint = PaginatedEndpoint.Companion.createWeightedBatched$default(companion, 17, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AggregateOptionStrategyQuoteStore.endpoint$lambda$0((OptionStrategyInfo) obj));
            }
        }, new AggregateOptionStrategyQuoteStore2(this, null), getLogoutKillswitch(), new AggregateOptionStrategyQuoteStore3(this, clock, null), storeBundle.getClock(), null, 64, null);
        this.extendedHoursEndpoint = PaginatedEndpoint.Companion.createWeightedBatched$default(companion, 17, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AggregateOptionStrategyQuoteStore.extendedHoursEndpoint$lambda$1((OptionStrategyInfo) obj));
            }
        }, new AggregateOptionStrategyQuoteStore4(this, null), getLogoutKillswitch(), new AggregateOptionStrategyQuoteStore5(this, clock, null), storeBundle.getClock(), null, 64, null);
        Query.Companion companion2 = Query.INSTANCE;
        boolean z = false;
        long j = 0;
        this.query = Store.create$default(this, companion2, "streamAggregateOptionStrategyQuote", CollectionsKt.listOf(new Batch(getStoreScope(), 17, z, j, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionStrategyQuoteStore.query$lambda$3(this.f$0, (Collection) obj);
            }
        }, 12, null)), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionStrategyQuoteStore.query$lambda$4(this.f$0, (OptionStrategyInfo) obj);
            }
        }, false, 8, null);
        this.extendedHoursQuery = Store.create$default(this, companion2, "streamAggregateOptionStrategyQuote", CollectionsKt.listOf(new Batch(getStoreScope(), 17, false, 0L, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionStrategyQuoteStore.extendedHoursQuery$lambda$6(this.f$0, (Collection) obj);
            }
        }, 12, null)), new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AggregateOptionStrategyQuoteStore.extendedHoursQuery$lambda$7(this.f$0, (OptionStrategyInfo) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int endpoint$lambda$0(OptionStrategyInfo optionStrategyInfo) {
        Intrinsics.checkNotNullParameter(optionStrategyInfo, "optionStrategyInfo");
        return optionStrategyInfo.getLegs().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int extendedHoursEndpoint$lambda$1(OptionStrategyInfo optionStrategyInfo) {
        Intrinsics.checkNotNullParameter(optionStrategyInfo, "optionStrategyInfo");
        return optionStrategyInfo.getLegs().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$3(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, Collection strategyInfoList) {
        Intrinsics.checkNotNullParameter(strategyInfoList, "strategyInfoList");
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(aggregateOptionStrategyQuoteStore.pollIntervalObs), Integer.MAX_VALUE, null, 2, null), new C33596x80fe02b4(null, aggregateOptionStrategyQuoteStore, strategyInfoList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$4(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, OptionStrategyInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return aggregateOptionStrategyQuoteStore.dao.getAggregateOptionStrategyQuote(it.getStrategyCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow extendedHoursQuery$lambda$6(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, Collection strategyInfoList) {
        Intrinsics.checkNotNullParameter(strategyInfoList, "strategyInfoList");
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(aggregateOptionStrategyQuoteStore.pollIntervalObs), Integer.MAX_VALUE, null, 2, null), new C33595x20f36ccb(null, aggregateOptionStrategyQuoteStore, strategyInfoList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow extendedHoursQuery$lambda$7(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, OptionStrategyInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return aggregateOptionStrategyQuoteStore.dao.getAggregateOptionStrategyQuote(it.getStrategyCode());
    }

    /* compiled from: AggregateOptionStrategyQuoteStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$refreshQuotes$1", m3645f = "AggregateOptionStrategyQuoteStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$refreshQuotes$1 */
    static final class C335981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        final /* synthetic */ List<OptionStrategyInfo> $strategyInfoList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C335981(List<OptionStrategyInfo> list, boolean z, Continuation<? super C335981> continuation) {
            super(2, continuation);
            this.$strategyInfoList = list;
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AggregateOptionStrategyQuoteStore.this.new C335981(this.$strategyInfoList, this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C335981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowIsIndexOptionsExtendedHoursEnabled = AggregateOptionStrategyQuoteStore.this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled();
                this.label = 1;
                obj = FlowKt.firstOrNull(flowIsIndexOptionsExtendedHoursEnabled, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (Intrinsics.areEqual((Boolean) obj, boxing.boxBoolean(true))) {
                AggregateOptionStrategyQuoteStore.this.extendedHoursEndpoint.refreshAllPages(this.$strategyInfoList, this.$force);
            } else {
                AggregateOptionStrategyQuoteStore.this.endpoint.refreshAllPages(this.$strategyInfoList, this.$force);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void refreshQuotes$default(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        aggregateOptionStrategyQuoteStore.refreshQuotes(list, z);
    }

    public final void refreshQuotes(List<OptionStrategyInfo> strategyInfoList, boolean force) {
        Intrinsics.checkNotNullParameter(strategyInfoList, "strategyInfoList");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C335981(strategyInfoList, force, null), 3, null);
    }

    public final Flow<List<AggregateOptionStrategyQuote>> streamQuotes(List<String> strategyCodes) {
        Intrinsics.checkNotNullParameter(strategyCodes, "strategyCodes");
        return this.dao.getAggregateOptionStrategyQuotes(strategyCodes);
    }

    public final Flow<AggregateOptionStrategyQuote> streamAndPollQuote(OptionStrategyInfo optionStrategyInfo) {
        Intrinsics.checkNotNullParameter(optionStrategyInfo, "optionStrategyInfo");
        return FlowKt.transformLatest(this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled(), new C33597xe79512a0(null, this, optionStrategyInfo));
    }

    public final Observable<AggregateOptionStrategyQuote> streamAndPollQuoteObservable(OptionStrategyInfo optionStrategyInfo) {
        Intrinsics.checkNotNullParameter(optionStrategyInfo, "optionStrategyInfo");
        return asObservable(streamAndPollQuote(optionStrategyInfo));
    }
}
