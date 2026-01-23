package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.librobinhood.data.store.OptionHistoricalStore;
import com.robinhood.models.api.ApiOptionHistorical;
import com.robinhood.models.dao.OptionHistoricalDao;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionDataPoint;
import com.robinhood.models.p320db.OptionHistorical;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.p355ui.UiOptionHistorical;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: OptionHistoricalStore.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001*B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00190%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00190%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006+"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionHistoricalStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsApi", "Lcom/robinhood/models/dao/OptionHistoricalDao;", "dao", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/models/dao/OptionHistoricalDao;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "optionInstrumentId", "Lcom/robinhood/models/ui/GraphSelection;", "graphSelection", "Lcom/robinhood/models/db/OptionChain;", "optionChain", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "j$/time/LocalDate", "expirationDate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/ui/UiOptionHistorical;", "streamOptionHistorical", "(Ljava/util/UUID;Lcom/robinhood/models/ui/GraphSelection;Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Lj$/time/LocalDate;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "Lcom/robinhood/models/dao/OptionHistoricalDao;", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalStore$QueryParams;", "Lcom/robinhood/models/api/ApiOptionHistorical;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "query", "Lcom/robinhood/android/moria/db/Query;", "extendedHoursEndpoint", "extendedHoursQuery", "QueryParams", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionHistoricalStore extends Store {
    private final OptionHistoricalDao dao;
    private final Endpoint<QueryParams, ApiOptionHistorical> endpoint;
    private final Endpoint<QueryParams, ApiOptionHistorical> extendedHoursEndpoint;
    private final Query<QueryParams, UiOptionHistorical> extendedHoursQuery;
    private final MarketHoursStore marketHoursStore;
    private final OptionsApi optionsApi;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;
    private final Query<QueryParams, UiOptionHistorical> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionHistoricalStore(OptionsApi optionsApi, OptionHistoricalDao dao, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, MarketHoursStore marketHoursStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionsApi = optionsApi;
        this.dao = dao;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.marketHoursStore = marketHoursStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        OptionHistoricalStore2 optionHistoricalStore2 = new OptionHistoricalStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        OptionHistoricalStore3 optionHistoricalStore3 = new OptionHistoricalStore3(this, null);
        Clock clock = storeBundle.getClock();
        OptionHistorical.Companion companion2 = OptionHistorical.INSTANCE;
        Endpoint<QueryParams, ApiOptionHistorical> endpointCreateWithParams = companion.createWithParams(optionHistoricalStore2, logoutKillswitch, optionHistoricalStore3, clock, new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.endpoint = endpointCreateWithParams;
        Query.Companion companion3 = Query.INSTANCE;
        this.query = Store.create$default(this, companion3, "streamOptionHistorical", CollectionsKt.listOf(new RefreshEach(new OptionHistoricalStore7(endpointCreateWithParams))), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionHistoricalStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionHistoricalStore.query$lambda$0(this.f$0, (OptionHistoricalStore.QueryParams) obj);
            }
        }, false, 8, null);
        Endpoint<QueryParams, ApiOptionHistorical> endpointCreateWithParams2 = companion.createWithParams(new OptionHistoricalStore4(this, null), getLogoutKillswitch(), new OptionHistoricalStore5(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.extendedHoursEndpoint = endpointCreateWithParams2;
        this.extendedHoursQuery = Store.create$default(this, companion3, "streamOptionHistorical", CollectionsKt.listOf(new RefreshEach(new OptionHistoricalStore6(endpointCreateWithParams2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionHistoricalStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionHistoricalStore.extendedHoursQuery$lambda$2(this.f$0, (OptionHistoricalStore.QueryParams) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(OptionHistoricalStore optionHistoricalStore, QueryParams queryParams) {
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return optionHistoricalStore.dao.getOptionHistorical(OptionHistorical.INSTANCE.getIdentifier(queryParams.getOptionInstrumentId(), queryParams.getGraphSelection()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow extendedHoursQuery$lambda$2(OptionHistoricalStore optionHistoricalStore, QueryParams queryParams) {
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return optionHistoricalStore.dao.getOptionHistorical(OptionHistorical.INSTANCE.getIdentifier(queryParams.getOptionInstrumentId(), queryParams.getGraphSelection()));
    }

    public final Flow<UiOptionHistorical> streamOptionHistorical(UUID optionInstrumentId, GraphSelection graphSelection, OptionChain optionChain, OptionChain.UnderlyingType underlyingType, LocalDate expirationDate) {
        Flow<UiOptionHistorical> flowAsFlow;
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        Intrinsics.checkNotNullParameter(optionChain, "optionChain");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        QueryParams queryParams = new QueryParams(optionInstrumentId, graphSelection, optionChain);
        if (underlyingType != OptionChain.UnderlyingType.INDEX || optionChain.getExtendedHoursState() != OptionChain.ExtendedHoursState.ENABLED) {
            flowAsFlow = this.query.asFlow(queryParams);
        } else {
            flowAsFlow = FlowKt.transformLatest(this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled(), new C34033x2137bebd(null, this, queryParams));
        }
        this.marketHoursStore.refreshWithoutEviction(false, expirationDate);
        return FlowKt.combine(flowAsFlow, Context7.buffer$default(RxConvert.asFlow(this.marketHoursStore.getMarketHours(expirationDate)), Integer.MAX_VALUE, null, 2, null), new C340341(graphSelection, expirationDate, optionChain, underlyingType, null));
    }

    /* compiled from: OptionHistoricalStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/UiOptionHistorical;", "uiOptionHistorical", "marketHoursOnExpirationDate", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionHistoricalStore$streamOptionHistorical$1", m3645f = "OptionHistoricalStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.OptionHistoricalStore$streamOptionHistorical$1 */
    static final class C340341 extends ContinuationImpl7 implements Function3<UiOptionHistorical, MarketHours, Continuation<? super UiOptionHistorical>, Object> {
        final /* synthetic */ LocalDate $expirationDate;
        final /* synthetic */ GraphSelection $graphSelection;
        final /* synthetic */ OptionChain $optionChain;
        final /* synthetic */ OptionChain.UnderlyingType $underlyingType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* compiled from: OptionHistoricalStore.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.librobinhood.data.store.OptionHistoricalStore$streamOptionHistorical$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Historical.Interval.values().length];
                try {
                    iArr[Historical.Interval.MONTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Historical.Interval.WEEK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Historical.Interval.ONE_DAY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Historical.Interval.ONE_HOUR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Historical.Interval.THIRTY_MINUTES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Historical.Interval.TEN_MINUTES.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Historical.Interval.FIVE_MINUTES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Historical.Interval.FIFTEEN_SECONDS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Historical.Interval.ALL_LOCAL_ONLY.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340341(GraphSelection graphSelection, LocalDate localDate, OptionChain optionChain, OptionChain.UnderlyingType underlyingType, Continuation<? super C340341> continuation) {
            super(3, continuation);
            this.$graphSelection = graphSelection;
            this.$expirationDate = localDate;
            this.$optionChain = optionChain;
            this.$underlyingType = underlyingType;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(UiOptionHistorical uiOptionHistorical, MarketHours marketHours, Continuation<? super UiOptionHistorical> continuation) {
            C340341 c340341 = new C340341(this.$graphSelection, this.$expirationDate, this.$optionChain, this.$underlyingType, continuation);
            c340341.L$0 = uiOptionHistorical;
            c340341.L$1 = marketHours;
            return c340341.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Instant indexOption0DteClosesAt;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UiOptionHistorical uiOptionHistorical = (UiOptionHistorical) this.L$0;
            MarketHours marketHours = (MarketHours) this.L$1;
            UiOptionHistorical uiOptionHistorical2 = new UiOptionHistorical(uiOptionHistorical.getOptionHistorical());
            List<OptionDataPoint> optionHistoricals = uiOptionHistorical.getOptionHistoricals();
            LocalDate localDate = this.$expirationDate;
            OptionChain optionChain = this.$optionChain;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : optionHistoricals) {
                OptionDataPoint optionDataPoint = (OptionDataPoint) obj2;
                Instant beginsAt = optionDataPoint.getBeginsAt();
                ZoneIds zoneIds = ZoneIds.INSTANCE;
                if (Instants.toLocalDate(beginsAt, zoneIds.getNEW_YORK()).compareTo((ChronoLocalDate) localDate) <= 0 && (!optionChain.getSettleOnOpen() || Instants.toLocalDate(optionDataPoint.getBeginsAt(), zoneIds.getNEW_YORK()).compareTo((ChronoLocalDate) localDate) < 0)) {
                    arrayList.add(obj2);
                }
            }
            uiOptionHistorical2.setOptionHistoricals(arrayList);
            switch (WhenMappings.$EnumSwitchMapping$0[this.$graphSelection.getIntervalForOptions().ordinal()]) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    List<OptionDataPoint> optionHistoricals2 = uiOptionHistorical2.getOptionHistoricals();
                    OptionChain.UnderlyingType underlyingType = this.$underlyingType;
                    OptionChain optionChain2 = this.$optionChain;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : optionHistoricals2) {
                        OptionDataPoint optionDataPoint2 = (OptionDataPoint) obj3;
                        if (optionDataPoint2.getSession() != DataPoint.Session.CLOSED && (underlyingType != OptionChain.UnderlyingType.INDEX || optionChain2.getSettleOnOpen() || (indexOption0DteClosesAt = marketHours.getIndexOption0DteClosesAt()) == null || optionDataPoint2.getBeginsAt().compareTo(indexOption0DteClosesAt) < 0)) {
                            arrayList2.add(obj3);
                        }
                    }
                    uiOptionHistorical2.setOptionHistoricals(arrayList2);
                    break;
                case 1:
                case 2:
                case 3:
                    return uiOptionHistorical2;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OptionHistoricalStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionHistoricalStore$QueryParams;", "", "optionInstrumentId", "Ljava/util/UUID;", "graphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "optionChain", "Lcom/robinhood/models/db/OptionChain;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/GraphSelection;Lcom/robinhood/models/db/OptionChain;)V", "getOptionInstrumentId", "()Ljava/util/UUID;", "getGraphSelection", "()Lcom/robinhood/models/ui/GraphSelection;", "getOptionChain", "()Lcom/robinhood/models/db/OptionChain;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class QueryParams {
        private final GraphSelection graphSelection;
        private final OptionChain optionChain;
        private final UUID optionInstrumentId;

        public static /* synthetic */ QueryParams copy$default(QueryParams queryParams, UUID uuid, GraphSelection graphSelection, OptionChain optionChain, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = queryParams.optionInstrumentId;
            }
            if ((i & 2) != 0) {
                graphSelection = queryParams.graphSelection;
            }
            if ((i & 4) != 0) {
                optionChain = queryParams.optionChain;
            }
            return queryParams.copy(uuid, graphSelection, optionChain);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOptionInstrumentId() {
            return this.optionInstrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final GraphSelection getGraphSelection() {
            return this.graphSelection;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionChain getOptionChain() {
            return this.optionChain;
        }

        public final QueryParams copy(UUID optionInstrumentId, GraphSelection graphSelection, OptionChain optionChain) {
            Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
            Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
            Intrinsics.checkNotNullParameter(optionChain, "optionChain");
            return new QueryParams(optionInstrumentId, graphSelection, optionChain);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QueryParams)) {
                return false;
            }
            QueryParams queryParams = (QueryParams) other;
            return Intrinsics.areEqual(this.optionInstrumentId, queryParams.optionInstrumentId) && this.graphSelection == queryParams.graphSelection && Intrinsics.areEqual(this.optionChain, queryParams.optionChain);
        }

        public int hashCode() {
            return (((this.optionInstrumentId.hashCode() * 31) + this.graphSelection.hashCode()) * 31) + this.optionChain.hashCode();
        }

        public String toString() {
            return "QueryParams(optionInstrumentId=" + this.optionInstrumentId + ", graphSelection=" + this.graphSelection + ", optionChain=" + this.optionChain + ")";
        }

        public QueryParams(UUID optionInstrumentId, GraphSelection graphSelection, OptionChain optionChain) {
            Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
            Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
            Intrinsics.checkNotNullParameter(optionChain, "optionChain");
            this.optionInstrumentId = optionInstrumentId;
            this.graphSelection = graphSelection;
            this.optionChain = optionChain;
        }

        public final UUID getOptionInstrumentId() {
            return this.optionInstrumentId;
        }

        public final GraphSelection getGraphSelection() {
            return this.graphSelection;
        }

        public final OptionChain getOptionChain() {
            return this.optionChain;
        }
    }
}
