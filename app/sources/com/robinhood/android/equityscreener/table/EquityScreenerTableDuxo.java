package com.robinhood.android.equityscreener.table;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equities.contracts.EquityScreenerTableFragmentKey;
import com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.equityscreener.models.LocalScreenerMetadata;
import com.robinhood.equityscreener.models.ScreenerLoggingKeys;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.equityscreener.models.p294db.ScreenerTableRow;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.annotations.ShowScreenerIntroEntryPointPref;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityScreenerContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: EquityScreenerTableDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00018Bc\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\u000e\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020#J\u0016\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020#J\u0006\u00101\u001a\u00020(J\u0006\u00102\u001a\u00020*J\u0016\u00103\u001a\u00020*2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010$\u001a&\u0012\f\u0012\n &*\u0004\u0018\u00010#0# &*\u0012\u0012\f\u0012\n &*\u0004\u0018\u00010#0#\u0018\u00010%0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDataState;", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "showScreenerIntroEntryPointPref", "Lcom/robinhood/prefs/BooleanPreference;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "scanStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/equityscreener/table/EquityScreenerTableStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "getShowScreenerIntroEntryPointPref", "()Lcom/robinhood/prefs/BooleanPreference;", "screenerIdRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "screenerIdStream", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "sortJob", "Lkotlinx/coroutines/Job;", "onStart", "", "onCreate", "loadScreener", "screenerId", "sortTableBy", "sortBy", "sortDirection", "clearDraftState", "logOnScreenerSaved", "onWatchlistToggled", "isInstrumentInUserLists", "", "id", "Ljava/util/UUID;", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityScreenerTableDuxo extends BaseDuxo<EquityScreenerTableDataState, EquityScreenerTableViewState> implements HasSavedState {
    private static final String SAVED_SCREENER_ID = "saved_screener_id";
    private final EventLogger eventLogger;
    private final IndicatorsStore indicatorsStore;
    private final InstrumentStore instrumentStore;
    private final ListItemIdToUserListIdsStore listItemIdToUserListIdsStore;
    private final SavedStateHandle savedStateHandle;
    private final ScanStore scanStore;
    private final BehaviorRelay<String> screenerIdRelay;
    private final Observable<String> screenerIdStream;
    private final ScreenersStore screenersStore;
    private final BooleanPreference showScreenerIntroEntryPointPref;
    private Job sortJob;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final BooleanPreference getShowScreenerIntroEntryPointPref() {
        return this.showScreenerIntroEntryPointPref;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EquityScreenerTableDuxo(SavedStateHandle savedStateHandle, @ShowScreenerIntroEntryPointPref BooleanPreference showScreenerIntroEntryPointPref, IndicatorsStore indicatorsStore, ScanStore scanStore, ScreenersStore screenersStore, InstrumentStore instrumentStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, EventLogger eventLogger, UserStore userStore, EquityScreenerTableViewState3 stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(showScreenerIntroEntryPointPref, "showScreenerIntroEntryPointPref");
        Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
        Intrinsics.checkNotNullParameter(scanStore, "scanStore");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new EquityScreenerTableDataState(StringsKt.isBlank(companion.screenerId(savedStateHandle)) ? new ComposeUiEvent(Unit.INSTANCE) : null, null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.showScreenerIntroEntryPointPref = showScreenerIntroEntryPointPref;
        this.indicatorsStore = indicatorsStore;
        this.scanStore = scanStore;
        this.screenersStore = screenersStore;
        this.instrumentStore = instrumentStore;
        this.listItemIdToUserListIdsStore = listItemIdToUserListIdsStore;
        this.eventLogger = eventLogger;
        this.userStore = userStore;
        BehaviorRelay<String> behaviorRelayCreateDefault = BehaviorRelay.createDefault(companion.screenerId(getSavedStateHandle()));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.screenerIdRelay = behaviorRelayCreateDefault;
        this.screenerIdStream = behaviorRelayCreateDefault.distinctUntilChanged();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.showScreenerIntroEntryPointPref.set(false);
        Observable<R> observableSwitchMap = this.screenerIdStream.switchMap(new Function() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$onStart$scanResultsObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ScanResultResponse> apply(String screenerId) {
                Intrinsics.checkNotNullParameter(screenerId, "screenerId");
                return this.this$0.scanStore.scan(screenerId, true, ((EquityScreenerTableFragmentKey) EquityScreenerTableDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber());
            }
        });
        Intrinsics.checkNotNull(observableSwitchMap);
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerTableDuxo.onStart$lambda$0(this.f$0, (ScanResultResponse) obj);
            }
        });
        Observable observableSwitchMap2 = observableSwitchMap.map(new Function() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final List<UUID> apply(ScanResultResponse results) {
                Intrinsics.checkNotNullParameter(results, "results");
                List<ScreenerTableRow> rows = results.getRows();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = rows.iterator();
                while (it.hasNext()) {
                    String instrumentId = ((ScreenerTableRow) it.next()).getInstrumentId();
                    if (StringsKt.isBlank(instrumentId)) {
                        instrumentId = null;
                    }
                    if (instrumentId != null) {
                        arrayList.add(instrumentId);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator<T> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(UUID.fromString((String) it2.next()));
                }
                return arrayList2;
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Map<UUID, List<UUID>>> apply(List<UUID> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EquityScreenerTableDuxo.this.listItemIdToUserListIdsStore.stream(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerTableDuxo.onStart$lambda$1(this.f$0, (Map) obj);
            }
        });
        Observable<R> observableSwitchMap3 = this.screenerIdStream.switchMap(new Function() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo.onStart.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends LocalScreenerMetadata> apply(String screenerId) {
                Intrinsics.checkNotNullParameter(screenerId, "screenerId");
                return EquityScreenerTableDuxo.this.screenersStore.getLocalScreener(screenerId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerTableDuxo.onStart$lambda$2(this.f$0, (LocalScreenerMetadata) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.indicatorsStore.getIndicators(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerTableDuxo.onStart$lambda$3(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerTableDuxo.onStart$lambda$4(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(EquityScreenerTableDuxo equityScreenerTableDuxo, ScanResultResponse scanResultResponse) {
        equityScreenerTableDuxo.applyMutation(new EquityScreenerTableDuxo2(scanResultResponse, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(EquityScreenerTableDuxo equityScreenerTableDuxo, Map map) {
        equityScreenerTableDuxo.applyMutation(new EquityScreenerTableDuxo3(map, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(EquityScreenerTableDuxo equityScreenerTableDuxo, LocalScreenerMetadata localScreenerMetadata) {
        equityScreenerTableDuxo.applyMutation(new EquityScreenerTableDuxo4(localScreenerMetadata, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(EquityScreenerTableDuxo equityScreenerTableDuxo, List indicators) {
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        equityScreenerTableDuxo.applyMutation(new EquityScreenerTableDuxo5(indicators, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(EquityScreenerTableDuxo equityScreenerTableDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        equityScreenerTableDuxo.applyMutation(new EquityScreenerTableDuxo6(user, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Observable<R> observableSwitchMap = this.screenerIdStream.switchMap(new Function() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends LocalScreenerMetadata> apply(String screenerId) {
                Intrinsics.checkNotNullParameter(screenerId, "screenerId");
                return EquityScreenerTableDuxo.this.screenersStore.getLocalScreener(screenerId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerTableDuxo.onCreate$lambda$6(this.f$0, (LocalScreenerMetadata) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(EquityScreenerTableDuxo equityScreenerTableDuxo, LocalScreenerMetadata localScreenerMetadata) {
        String str;
        Screener screener = localScreenerMetadata.getScreener();
        if (screener.isPreset()) {
            str = ScreenerLoggingKeys.SCREENER_PRESET_PREFIX;
        } else {
            str = ScreenerLoggingKeys.SCREENER_PREFIX;
        }
        EventLogger eventLogger = equityScreenerTableDuxo.eventLogger;
        Screen.Name name = Screen.Name.SCREENER_DETAIL;
        String str2 = str + screener.getId();
        String source = ((EquityScreenerTableFragmentKey) INSTANCE.getArgs((HasSavedState) equityScreenerTableDuxo)).getSource();
        if (source == null) {
            source = "";
        }
        Screen screen = new Screen(name, source, str2, null, 8, null);
        String displayName = screener.getDisplayName();
        List<Screener.Filter> filters = screener.getFilters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList.add(((Screener.Filter) it.next()).getKey());
        }
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EquityScreenerContext(displayName, arrayList, screener.getColumns(), null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -16777217, -1, -1, 16383, null), 13, null);
        return Unit.INSTANCE;
    }

    public final void loadScreener(String screenerId) {
        Intrinsics.checkNotNullParameter(screenerId, "screenerId");
        getSavedStateHandle().set(SAVED_SCREENER_ID, screenerId);
        this.screenerIdRelay.accept(screenerId);
    }

    /* compiled from: EquityScreenerTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$sortTableBy$1", m3645f = "EquityScreenerTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$sortTableBy$1 */
    static final class C157531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sortBy;
        final /* synthetic */ String $sortDirection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C157531(String str, String str2, Continuation<? super C157531> continuation) {
            super(2, continuation);
            this.$sortBy = str;
            this.$sortDirection = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityScreenerTableDuxo.this.new C157531(this.$sortBy, this.$sortDirection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C157531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(50, r7) != r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observable = EquityScreenerTableDuxo.this.screenerIdStream;
                Intrinsics.checkNotNullExpressionValue(observable, "access$getScreenerIdStream$p(...)");
                this.label = 1;
                obj = RxAwait3.awaitFirst(observable, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.label = 3;
            }
            ScreenersStore screenersStore = EquityScreenerTableDuxo.this.screenersStore;
            final String str = this.$sortBy;
            final String str2 = this.$sortDirection;
            Single<Boolean> singleUpdateDraftScreener = screenersStore.updateDraftScreener((String) obj, new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$sortTableBy$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EquityScreenerTableDuxo.C157531.invokeSuspend$lambda$0(str, str2, (Screener) obj2);
                }
            });
            this.label = 2;
            if (RxAwait3.await(singleUpdateDraftScreener, this) != coroutine_suspended) {
                this.label = 3;
            }
            return coroutine_suspended;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Screener invokeSuspend$lambda$0(String str, String str2, Screener screener) {
            return Screener.copy$default(screener, null, null, null, null, null, str, str2, null, false, 0, null, null, false, 8095, null);
        }
    }

    public final void sortTableBy(String sortBy, String sortDirection) {
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Intrinsics.checkNotNullParameter(sortDirection, "sortDirection");
        Job job = this.sortJob;
        if (job == null || !job.isActive()) {
            this.sortJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C157531(sortBy, sortDirection, null), 3, null);
        }
    }

    /* compiled from: EquityScreenerTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$clearDraftState$1", m3645f = "EquityScreenerTableDuxo.kt", m3646l = {202}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$clearDraftState$1 */
    static final class C157471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C157471(Continuation<? super C157471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityScreenerTableDuxo.this.new C157471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C157471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScreenersStore screenersStore = EquityScreenerTableDuxo.this.screenersStore;
                this.label = 1;
                if (screenersStore.clearDrafts(this) == coroutine_suspended) {
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

    public final Job clearDraftState() {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C157471(null), 3, null);
    }

    public final void logOnScreenerSaved() {
        Observable<R> observableSwitchMap = this.screenerIdStream.switchMap(new Function() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo.logOnScreenerSaved.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends LocalScreenerMetadata> apply(String screenerId) {
                Intrinsics.checkNotNullParameter(screenerId, "screenerId");
                return EquityScreenerTableDuxo.this.screenersStore.getLocalScreener(screenerId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerTableDuxo.logOnScreenerSaved$lambda$8(this.f$0, (LocalScreenerMetadata) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOnScreenerSaved$lambda$8(EquityScreenerTableDuxo equityScreenerTableDuxo, LocalScreenerMetadata localScreenerMetadata) {
        Screener screener = localScreenerMetadata.getScreener();
        EventLogger eventLogger = equityScreenerTableDuxo.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SAVE;
        Component component = new Component(Component.ComponentType.BUTTON, ScreenerLoggingKeys.SAVE_SCREENER_NEW, null, 4, null);
        String displayName = screener.getDisplayName();
        List<Screener.Filter> filters = screener.getFilters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList.add(((Screener.Filter) it.next()).getKey());
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, null, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EquityScreenerContext(displayName, arrayList, screener.getColumns(), null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -16777217, -1, -1, 16383, null), false, 42, null);
        return Unit.INSTANCE;
    }

    public final void onWatchlistToggled(final boolean isInstrumentInUserLists, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.instrumentStore.refresh(false, id);
        Observable<Instrument> observableTake = this.instrumentStore.getInstrument(id).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerTableDuxo.onWatchlistToggled$lambda$9(this.f$0, isInstrumentInUserLists, (Instrument) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWatchlistToggled$lambda$9(EquityScreenerTableDuxo equityScreenerTableDuxo, boolean z, Instrument instrument) {
        equityScreenerTableDuxo.applyMutation(new EquityScreenerTableDuxo8(instrument, z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityScreenerTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\b\u001a\u00020\u0007*\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDuxo;", "Lcom/robinhood/android/equities/contracts/EquityScreenerTableFragmentKey;", "<init>", "()V", "SAVED_SCREENER_ID", "", "screenerId", "Landroidx/lifecycle/SavedStateHandle;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EquityScreenerTableDuxo, EquityScreenerTableFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityScreenerTableFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (EquityScreenerTableFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityScreenerTableFragmentKey getArgs(EquityScreenerTableDuxo equityScreenerTableDuxo) {
            return (EquityScreenerTableFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, equityScreenerTableDuxo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String screenerId(SavedStateHandle savedStateHandle) {
            String str = (String) savedStateHandle.get(EquityScreenerTableDuxo.SAVED_SCREENER_ID);
            return str == null ? ((EquityScreenerTableFragmentKey) getArgs(savedStateHandle)).getScreenerId() : str;
        }
    }
}
