package com.robinhood.android.equityscreener.datadisplay;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equities.contracts.ScreenerDataDisplayKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.equityscreener.models.LocalScreenerMetadata;
import com.robinhood.equityscreener.models.api.ColumnInformation;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.Lists4;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: ScreenerDataDisplayDuxo.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00015B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J$\u0010&\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+J$\u0010-\u001a\u00020$2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020$2\u0006\u00103\u001a\u000204R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDataState;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayStateProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayStateProvider;Lcom/robinhood/analytics/EventLogger;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "getIndicatorsStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "setIndicatorsStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;)V", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "getScreenersStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "setScreenersStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;)V", "scanStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "getScanStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "setScanStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;)V", "onResume", "", "onCreate", "updateColumnOrder", "columns", "", "Lcom/robinhood/equityscreener/models/api/ColumnInformation;", "startIndex", "", "targetIndex", "markColumnVisibility", "visibleColumns", "markedColumn", "isVisible", "", "saveLocalScreener", "localScreener", "Lcom/robinhood/equityscreener/models/db/Screener;", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ScreenerDataDisplayDuxo extends BaseDuxo<ScreenerDataDisplayDataState, ScreenerDataDisplayViewState> implements HasSavedState {
    private final EventLogger eventLogger;
    public IndicatorsStore indicatorsStore;
    private final SavedStateHandle savedStateHandle;
    public ScanStore scanStore;
    public ScreenersStore screenersStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenerDataDisplayDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, ScreenerDataDisplayViewState3 stateProvider, EventLogger eventLogger) {
        super(new ScreenerDataDisplayDataState(null, null, false, false, null, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.savedStateHandle = savedStateHandle;
        this.eventLogger = eventLogger;
    }

    public final IndicatorsStore getIndicatorsStore() {
        IndicatorsStore indicatorsStore = this.indicatorsStore;
        if (indicatorsStore != null) {
            return indicatorsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("indicatorsStore");
        return null;
    }

    public final void setIndicatorsStore(IndicatorsStore indicatorsStore) {
        Intrinsics.checkNotNullParameter(indicatorsStore, "<set-?>");
        this.indicatorsStore = indicatorsStore;
    }

    public final ScreenersStore getScreenersStore() {
        ScreenersStore screenersStore = this.screenersStore;
        if (screenersStore != null) {
            return screenersStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenersStore");
        return null;
    }

    public final void setScreenersStore(ScreenersStore screenersStore) {
        Intrinsics.checkNotNullParameter(screenersStore, "<set-?>");
        this.screenersStore = screenersStore;
    }

    public final ScanStore getScanStore() {
        ScanStore scanStore = this.scanStore;
        if (scanStore != null) {
            return scanStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scanStore");
        return null;
    }

    public final void setScanStore(ScanStore scanStore) {
        Intrinsics.checkNotNullParameter(scanStore, "<set-?>");
        this.scanStore = scanStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        ScreenersStore screenersStore = getScreenersStore();
        Companion companion = INSTANCE;
        Observable<LocalScreenerMetadata> observableDistinctUntilChanged = screenersStore.getLocalScreener(((ScreenerDataDisplayKey) companion.getArgs((HasSavedState) this)).getInitialData().getScreenerId()).take(1L).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenerDataDisplayDuxo.onResume$lambda$0(this.f$0, (LocalScreenerMetadata) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getIndicatorsStore().getAvailableColumns(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenerDataDisplayDuxo.onResume$lambda$1(this.f$0, (List) obj);
            }
        });
        Observable observableTake = ScanStore.scan$default(getScanStore(), ((ScreenerDataDisplayKey) companion.getArgs((HasSavedState) this)).getInitialData().getScreenerId(), false, null, 6, null).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenerDataDisplayDuxo.onResume$lambda$2(this.f$0, (ScanResultResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(ScreenerDataDisplayDuxo screenerDataDisplayDuxo, LocalScreenerMetadata localScreenerMetadata) {
        screenerDataDisplayDuxo.applyMutation(new ScreenerDataDisplayDuxo2(localScreenerMetadata, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(ScreenerDataDisplayDuxo screenerDataDisplayDuxo, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        screenerDataDisplayDuxo.applyMutation(new ScreenerDataDisplayDuxo3(it, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(ScreenerDataDisplayDuxo screenerDataDisplayDuxo, ScanResultResponse scanResultResponse) {
        screenerDataDisplayDuxo.applyMutation(new ScreenerDataDisplayDuxo4(scanResultResponse, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.SCREENER_DATA_DISPLAY, null, null, null, 14, null), null, null, null, 29, null);
    }

    public final void updateColumnOrder(List<ColumnInformation> columns, int startIndex, int targetIndex) {
        Intrinsics.checkNotNullParameter(columns, "columns");
        if (startIndex == targetIndex) {
            return;
        }
        ArrayList arrayList = Lists4.toArrayList(columns);
        Object objRemove = arrayList.remove(startIndex);
        Intrinsics.checkNotNullExpressionValue(objRemove, "removeAt(...)");
        arrayList.add(targetIndex, (ColumnInformation) objRemove);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ColumnInformation) it.next()).getKey());
        }
        applyMutation(new C156941(arrayList2, null));
    }

    /* compiled from: ScreenerDataDisplayDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$updateColumnOrder$1", m3645f = "ScreenerDataDisplayDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$updateColumnOrder$1 */
    static final class C156941 extends ContinuationImpl7 implements Function2<ScreenerDataDisplayDataState, Continuation<? super ScreenerDataDisplayDataState>, Object> {
        final /* synthetic */ List<String> $updatedColumns;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C156941(List<String> list, Continuation<? super C156941> continuation) {
            super(2, continuation);
            this.$updatedColumns = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C156941 c156941 = new C156941(this.$updatedColumns, continuation);
            c156941.L$0 = obj;
            return c156941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScreenerDataDisplayDataState screenerDataDisplayDataState, Continuation<? super ScreenerDataDisplayDataState> continuation) {
            return ((C156941) create(screenerDataDisplayDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScreenerDataDisplayDataState screenerDataDisplayDataState = (ScreenerDataDisplayDataState) this.L$0;
            Screener screener = screenerDataDisplayDataState.getScreener();
            return ScreenerDataDisplayDataState.copy$default(screenerDataDisplayDataState, screener != null ? Screener.copy$default(screener, null, null, null, null, null, null, null, null, false, 0, null, this.$updatedColumns, false, 6143, null) : null, null, false, false, null, 30, null);
        }
    }

    public final void markColumnVisibility(List<ColumnInformation> visibleColumns, ColumnInformation markedColumn, boolean isVisible) {
        Intrinsics.checkNotNullParameter(visibleColumns, "visibleColumns");
        Intrinsics.checkNotNullParameter(markedColumn, "markedColumn");
        if (isVisible) {
            visibleColumns = CollectionsKt.plus((Collection<? extends ColumnInformation>) visibleColumns, markedColumn);
        } else if (visibleColumns.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : visibleColumns) {
                if (!Intrinsics.areEqual(((ColumnInformation) obj).getKey(), markedColumn.getKey())) {
                    arrayList.add(obj);
                }
            }
            visibleColumns = arrayList;
        }
        List<ColumnInformation> list = visibleColumns;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ColumnInformation) it.next()).getKey());
        }
        applyMutation(new C156931(arrayList2, null));
    }

    /* compiled from: ScreenerDataDisplayDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$markColumnVisibility$1", m3645f = "ScreenerDataDisplayDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$markColumnVisibility$1 */
    static final class C156931 extends ContinuationImpl7 implements Function2<ScreenerDataDisplayDataState, Continuation<? super ScreenerDataDisplayDataState>, Object> {
        final /* synthetic */ List<String> $updatedColumns;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C156931(List<String> list, Continuation<? super C156931> continuation) {
            super(2, continuation);
            this.$updatedColumns = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C156931 c156931 = new C156931(this.$updatedColumns, continuation);
            c156931.L$0 = obj;
            return c156931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScreenerDataDisplayDataState screenerDataDisplayDataState, Continuation<? super ScreenerDataDisplayDataState> continuation) {
            return ((C156931) create(screenerDataDisplayDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScreenerDataDisplayDataState screenerDataDisplayDataState = (ScreenerDataDisplayDataState) this.L$0;
            Screener screener = screenerDataDisplayDataState.getScreener();
            return ScreenerDataDisplayDataState.copy$default(screenerDataDisplayDataState, screener != null ? Screener.copy$default(screener, null, null, null, null, null, null, null, null, false, 0, null, this.$updatedColumns, false, 6143, null) : null, null, false, false, null, 30, null);
        }
    }

    public final void saveLocalScreener(final Screener localScreener) {
        Intrinsics.checkNotNullParameter(localScreener, "localScreener");
        LifecycleHost.DefaultImpls.bind$default(this, getScreenersStore().updateDraftScreener(((ScreenerDataDisplayKey) INSTANCE.getArgs((HasSavedState) this)).getInitialData().getScreenerId(), new Function1() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenerDataDisplayDuxo.saveLocalScreener$lambda$7(localScreener, (Screener) obj);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenerDataDisplayDuxo.saveLocalScreener$lambda$8(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screener saveLocalScreener$lambda$7(Screener screener, Screener updateDraftScreener) {
        Intrinsics.checkNotNullParameter(updateDraftScreener, "$this$updateDraftScreener");
        return Screener.copy$default(updateDraftScreener, null, null, null, null, null, null, null, null, false, 0, null, screener.getColumns(), false, 6143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveLocalScreener$lambda$8(ScreenerDataDisplayDuxo screenerDataDisplayDuxo, boolean z) {
        screenerDataDisplayDuxo.applyMutation(new ScreenerDataDisplayDuxo5(null));
        return Unit.INSTANCE;
    }

    /* compiled from: ScreenerDataDisplayDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo;", "Lcom/robinhood/android/equities/contracts/ScreenerDataDisplayKey;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ScreenerDataDisplayDuxo, ScreenerDataDisplayKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ScreenerDataDisplayKey getArgs(SavedStateHandle savedStateHandle) {
            return (ScreenerDataDisplayKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ScreenerDataDisplayKey getArgs(ScreenerDataDisplayDuxo screenerDataDisplayDuxo) {
            return (ScreenerDataDisplayKey) DuxoCompanion.DefaultImpls.getArgs(this, screenerDataDisplayDuxo);
        }
    }
}
