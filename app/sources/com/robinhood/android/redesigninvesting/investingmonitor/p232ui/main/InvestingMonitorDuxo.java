package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.data.CuratedListEligibleItemsFetcher;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorAsset;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.android.redesigninvesting.investingmonitor.modes.InvestingMonitorViewMode;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main.InvestingMonitorDuxo;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.sorting.InvestingMonitorSortType;
import com.robinhood.android.redesigninvesting.investingmonitor.prefs.InvestingMonitorViewModePref;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.lists.store.ListsOrderStore;
import dispatch.core.Launch;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import timber.log.Timber;

/* compiled from: InvestingMonitorDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u0012\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001aJ\u000e\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#J\u0016\u0010*\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010+\u001a\u00020,J\u0006\u0010.\u001a\u00020\u0016J\u000e\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0010J\u001d\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u0002032\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b4J\u0014\u00105\u001a\u00020\u00182\f\u00106\u001a\b\u0012\u0004\u0012\u00020#0\u001cJ&\u00107\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u001c090\u001c08H\u0002JV\u0010;\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u001c090\u001c2\u001e\u0010<\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u001c090\u001c2\u0006\u0010=\u001a\u00020>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:0\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDataState;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "listOrderStore", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "curatedListEligibleItemsFetcher", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "pref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/shared/store/lists/store/ListsOrderStore;Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "onAssetOrderChanged", "Lkotlinx/coroutines/Job;", "page", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;", "reorderedAssets", "", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;", "refreshAllStores", "forceRefresh", "", "onListCreated", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "onRecentlyCreatedPageProcessed", "investingMonitorPage", "onScreenerCreated", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "onWatchlistDeleteRequested", "onWatchlistRenamed", "newName", "", "onWatchlistTempRenamed", "onWatchlistRenameCancelled", "onSwitchViewMode", "currentViewMode", "onSortOrderChanged", "selectedSortType", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/sorting/InvestingMonitorSortType;", "onSortOrderChanged$feature_investing_monitor_externalDebug", "onTabsReordered", "newTabList", "streamCuratedLists", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/robinhood/models/ui/CuratedListEligible;", "recreateCuratedListInfoPairs", "curatedListInfoPairs", "targetListId", "Ljava/util/UUID;", "newList", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InvestingMonitorDuxo extends BaseDuxo<InvestingMonitorDataState, InvestingMonitorViewState> {
    public static final int $stable = 8;
    private final CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher;
    private final CuratedListItemViewModeStore curatedListItemViewModeStore;
    private final CuratedListItemsStore curatedListItemsStore;
    private final CuratedListStore curatedListStore;
    private final ListsOrderStore listOrderStore;
    private final EnumPreference<InvestingMonitorViewMode> pref;

    public final void onScreenerCreated(Screener screener) {
        Intrinsics.checkNotNullParameter(screener, "screener");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingMonitorDuxo(CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, ListsOrderStore listOrderStore, CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher, CuratedListItemViewModeStore curatedListItemViewModeStore, @InvestingMonitorViewModePref EnumPreference<InvestingMonitorViewMode> pref, DuxoBundle duxoBundle) {
        super(new InvestingMonitorDataState(false, true, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null), new InvestingMonitorStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(listOrderStore, "listOrderStore");
        Intrinsics.checkNotNullParameter(curatedListEligibleItemsFetcher, "curatedListEligibleItemsFetcher");
        Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.curatedListStore = curatedListStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.listOrderStore = listOrderStore;
        this.curatedListEligibleItemsFetcher = curatedListEligibleItemsFetcher;
        this.curatedListItemViewModeStore = curatedListItemViewModeStore;
        this.pref = pref;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        refreshAllStores$default(this, false, 1, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C266061(null));
    }

    /* compiled from: InvestingMonitorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onCreate$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onCreate$1 */
    static final class C266061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C266061(Continuation<? super C266061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestingMonitorDuxo.this.new C266061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C266061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamCuratedLists = InvestingMonitorDuxo.this.streamCuratedLists();
                InvestingMonitorDuxo investingMonitorDuxo = InvestingMonitorDuxo.this;
                investingMonitorDuxo.applyMutation(new AnonymousClass1(investingMonitorDuxo, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InvestingMonitorDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCuratedLists, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: InvestingMonitorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onCreate$1$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestingMonitorDataState, Continuation<? super InvestingMonitorDataState>, Object> {
            int I$0;
            int I$1;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestingMonitorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InvestingMonitorDuxo investingMonitorDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = investingMonitorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InvestingMonitorDataState investingMonitorDataState, Continuation<? super InvestingMonitorDataState> continuation) {
                return ((AnonymousClass1) create(investingMonitorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object objCoGet;
                int i;
                InvestingMonitorDataState investingMonitorDataState;
                int i2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InvestingMonitorDataState investingMonitorDataState2 = (InvestingMonitorDataState) this.L$0;
                    EnumPreference enumPreference = this.this$0.pref;
                    this.L$0 = investingMonitorDataState2;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objCoGet = enumPreference.coGet(this);
                    if (objCoGet == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = 0;
                    investingMonitorDataState = investingMonitorDataState2;
                    i2 = 0;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$1;
                    int i4 = this.I$0;
                    InvestingMonitorDataState investingMonitorDataState3 = (InvestingMonitorDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    investingMonitorDataState = investingMonitorDataState3;
                    i2 = i4;
                    objCoGet = obj;
                }
                return InvestingMonitorDataState.copy$default(investingMonitorDataState, i2 != 0, i != 0, null, null, null, null, null, (InvestingMonitorViewMode) objCoGet, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        }

        /* compiled from: InvestingMonitorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "curatedLists", "", "Lkotlin/Pair;", "Lcom/robinhood/models/db/CuratedList;", "Lcom/robinhood/models/ui/CuratedListEligible;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onCreate$1$2", m3645f = "InvestingMonitorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestingMonitorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InvestingMonitorDuxo investingMonitorDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = investingMonitorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>> list, Continuation<? super Unit> continuation) {
                return invoke2((List<? extends Tuples2<CuratedList, ? extends List<? extends CuratedListEligible>>>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<? extends Tuples2<CuratedList, ? extends List<? extends CuratedListEligible>>> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                Timber.Companion companion = Timber.INSTANCE;
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CuratedList) ((Tuples2) it.next()).getFirst()).getDisplayName());
                }
                companion.mo3350d("Collected flow: " + arrayList, new Object[0]);
                this.this$0.applyMutation(new C504982(list, null));
                return Unit.INSTANCE;
            }

            /* compiled from: InvestingMonitorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onCreate$1$2$2", m3645f = "InvestingMonitorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C504982 extends ContinuationImpl7 implements Function2<InvestingMonitorDataState, Continuation<? super InvestingMonitorDataState>, Object> {
                final /* synthetic */ List<Tuples2<CuratedList, List<CuratedListEligible>>> $curatedLists;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C504982(List<? extends Tuples2<CuratedList, ? extends List<? extends CuratedListEligible>>> list, Continuation<? super C504982> continuation) {
                    super(2, continuation);
                    this.$curatedLists = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504982 c504982 = new C504982(this.$curatedLists, continuation);
                    c504982.L$0 = obj;
                    return c504982;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InvestingMonitorDataState investingMonitorDataState, Continuation<? super InvestingMonitorDataState> continuation) {
                    return ((C504982) create(investingMonitorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InvestingMonitorDataState.copy$default((InvestingMonitorDataState) this.L$0, false, false, null, this.$curatedLists, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, null);
                }
            }
        }
    }

    /* compiled from: InvestingMonitorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onAssetOrderChanged$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onAssetOrderChanged$1 */
    static final class C266051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InvestingMonitorPage $page;
        final /* synthetic */ List<InvestingMonitorAsset> $reorderedAssets;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C266051(InvestingMonitorPage investingMonitorPage, List<InvestingMonitorAsset> list, Continuation<? super C266051> continuation) {
            super(2, continuation);
            this.$page = investingMonitorPage;
            this.$reorderedAssets = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C266051 c266051 = InvestingMonitorDuxo.this.new C266051(this.$page, this.$reorderedAssets, continuation);
            c266051.L$0 = obj;
            return c266051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C266051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final InvestingMonitorDuxo investingMonitorDuxo = InvestingMonitorDuxo.this;
            final InvestingMonitorPage investingMonitorPage = this.$page;
            final List<InvestingMonitorAsset> list = this.$reorderedAssets;
            investingMonitorDuxo.withDataState(new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onAssetOrderChanged$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InvestingMonitorDuxo.C266051.invokeSuspend$lambda$2(investingMonitorPage, list, investingMonitorDuxo, coroutineScope, (InvestingMonitorDataState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(InvestingMonitorPage investingMonitorPage, List list, final InvestingMonitorDuxo investingMonitorDuxo, CoroutineScope coroutineScope, InvestingMonitorDataState investingMonitorDataState) {
            UUID id = investingMonitorPage.getCuratedList().getId();
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((InvestingMonitorAsset) it.next()).getCuratedListEligibleItem());
            }
            investingMonitorDuxo.applyMutation(new InvestingMonitorDuxo$onAssetOrderChanged$1$1$1(investingMonitorDuxo, investingMonitorDataState, id, arrayList, null));
            Observable observable = investingMonitorDuxo.curatedListItemsStore.updateListItems(id, investingMonitorPage.getCuratedList().getOwnerType(), arrayList).toObservable();
            Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
            FlowKt.launchIn(Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null), coroutineScope).invokeOnCompletion(new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onAssetOrderChanged$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestingMonitorDuxo.C266051.invokeSuspend$lambda$2$lambda$1(investingMonitorDuxo, (Throwable) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$1(InvestingMonitorDuxo investingMonitorDuxo, Throwable th) {
            investingMonitorDuxo.applyMutation(new InvestingMonitorDuxo$onAssetOrderChanged$1$1$2$1(null));
            return Unit.INSTANCE;
        }
    }

    public final Job onAssetOrderChanged(InvestingMonitorPage page, List<InvestingMonitorAsset> reorderedAssets) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(reorderedAssets, "reorderedAssets");
        return Launch.launchDefault$default(getLifecycleScope(), null, null, new C266051(page, reorderedAssets, null), 3, null);
    }

    static /* synthetic */ void refreshAllStores$default(InvestingMonitorDuxo investingMonitorDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        investingMonitorDuxo.refreshAllStores(z);
    }

    private final void refreshAllStores(boolean forceRefresh) {
        this.curatedListStore.refreshFollowedLists(forceRefresh);
    }

    public final void onListCreated(final CuratedList curatedList) {
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        withDataState(new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestingMonitorDuxo.onListCreated$lambda$0(this.f$0, curatedList, (InvestingMonitorDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onListCreated$lambda$0(InvestingMonitorDuxo investingMonitorDuxo, CuratedList curatedList, InvestingMonitorDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Launch.launchDefault$default(investingMonitorDuxo.getLifecycleScope(), null, null, new InvestingMonitorDuxo$onListCreated$1$1(dataState, curatedList, investingMonitorDuxo, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void onRecentlyCreatedPageProcessed(final InvestingMonitorPage investingMonitorPage) {
        Intrinsics.checkNotNullParameter(investingMonitorPage, "investingMonitorPage");
        Timber.INSTANCE.mo3350d("Processed recently created page: " + investingMonitorPage.getCuratedList().getDisplayName(), new Object[0]);
        withDataState(new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestingMonitorDuxo.onRecentlyCreatedPageProcessed$lambda$1(investingMonitorPage, (InvestingMonitorDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRecentlyCreatedPageProcessed$lambda$1(InvestingMonitorPage investingMonitorPage, InvestingMonitorDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        dataState.getRecentlyCreatedCuratedListItems().remove(investingMonitorPage.getCuratedList());
        return Unit.INSTANCE;
    }

    /* compiled from: InvestingMonitorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onWatchlistDeleteRequested$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {451}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onWatchlistDeleteRequested$1 */
    static final class C266111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CuratedList $curatedList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C266111(CuratedList curatedList, Continuation<? super C266111> continuation) {
            super(2, continuation);
            this.$curatedList = curatedList;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestingMonitorDuxo.this.new C266111(this.$curatedList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C266111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Completable completableDeleteList = InvestingMonitorDuxo.this.curatedListStore.deleteList(this.$curatedList.getId(), this.$curatedList.getOwnerType());
                this.label = 1;
                if (RxAwait3.await(completableDeleteList, this) == coroutine_suspended) {
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

    public final void onWatchlistDeleteRequested(CuratedList curatedList) {
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        Launch.launchDefault$default(getLifecycleScope(), null, null, new C266111(curatedList, null), 3, null);
    }

    /* compiled from: InvestingMonitorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onWatchlistRenamed$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {451}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onWatchlistRenamed$1 */
    static final class C266121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CuratedList $curatedList;
        final /* synthetic */ String $newName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C266121(CuratedList curatedList, String str, Continuation<? super C266121> continuation) {
            super(2, continuation);
            this.$curatedList = curatedList;
            this.$newName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestingMonitorDuxo.this.new C266121(this.$curatedList, this.$newName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C266121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Single singleUpdateList$default = CuratedListStore.updateList$default(InvestingMonitorDuxo.this.curatedListStore, this.$curatedList.getId(), this.$newName, null, null, null, 28, null);
                this.label = 1;
                if (RxAwait3.await(singleUpdateList$default, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final InvestingMonitorDuxo investingMonitorDuxo = InvestingMonitorDuxo.this;
            investingMonitorDuxo.withDataState(new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onWatchlistRenamed$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InvestingMonitorDuxo.C266121.invokeSuspend$lambda$0(investingMonitorDuxo, (InvestingMonitorDataState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(InvestingMonitorDuxo investingMonitorDuxo, InvestingMonitorDataState investingMonitorDataState) {
            investingMonitorDuxo.applyMutation(new InvestingMonitorDuxo$onWatchlistRenamed$1$1$1(null));
            return Unit.INSTANCE;
        }
    }

    public final void onWatchlistRenamed(CuratedList curatedList, String newName) {
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        Intrinsics.checkNotNullParameter(newName, "newName");
        Launch.launchDefault$default(getLifecycleScope(), null, null, new C266121(curatedList, newName, null), 3, null);
    }

    public final void onWatchlistTempRenamed(final CuratedList curatedList, final String newName) {
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        Intrinsics.checkNotNullParameter(newName, "newName");
        withDataState(new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestingMonitorDuxo.onWatchlistTempRenamed$lambda$2(this.f$0, curatedList, newName, (InvestingMonitorDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWatchlistTempRenamed$lambda$2(InvestingMonitorDuxo investingMonitorDuxo, CuratedList curatedList, String str, InvestingMonitorDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        investingMonitorDuxo.applyMutation(new InvestingMonitorDuxo$onWatchlistTempRenamed$1$1(dataState, curatedList, str, null));
        return Unit.INSTANCE;
    }

    public final void onWatchlistRenameCancelled() {
        withDataState(new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestingMonitorDuxo.onWatchlistRenameCancelled$lambda$3(this.f$0, (InvestingMonitorDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWatchlistRenameCancelled$lambda$3(InvestingMonitorDuxo investingMonitorDuxo, InvestingMonitorDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        investingMonitorDuxo.applyMutation(new InvestingMonitorDuxo$onWatchlistRenameCancelled$1$1(dataState, null));
        return Unit.INSTANCE;
    }

    /* compiled from: InvestingMonitorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onSwitchViewMode$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onSwitchViewMode$1 */
    static final class C266091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InvestingMonitorViewMode $currentViewMode;
        int label;
        final /* synthetic */ InvestingMonitorDuxo this$0;

        /* compiled from: InvestingMonitorDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onSwitchViewMode$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InvestingMonitorViewMode.values().length];
                try {
                    iArr[InvestingMonitorViewMode.LIST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InvestingMonitorViewMode.GRID.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InvestingMonitorViewMode.HEAT_MAP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C266091(InvestingMonitorViewMode investingMonitorViewMode, InvestingMonitorDuxo investingMonitorDuxo, Continuation<? super C266091> continuation) {
            super(2, continuation);
            this.$currentViewMode = investingMonitorViewMode;
            this.this$0 = investingMonitorDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C266091(this.$currentViewMode, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C266091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            InvestingMonitorViewMode investingMonitorViewMode;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$currentViewMode.ordinal()];
                if (i2 == 1) {
                    investingMonitorViewMode = InvestingMonitorViewMode.GRID;
                } else if (i2 == 2) {
                    investingMonitorViewMode = InvestingMonitorViewMode.HEAT_MAP;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    investingMonitorViewMode = InvestingMonitorViewMode.LIST;
                }
                this.this$0.applyMutation(new AnonymousClass1(investingMonitorViewMode, null));
                EnumPreference enumPreference = this.this$0.pref;
                this.label = 1;
                if (enumPreference.coSet(investingMonitorViewMode, this) == coroutine_suspended) {
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

        /* compiled from: InvestingMonitorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onSwitchViewMode$1$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onSwitchViewMode$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestingMonitorDataState, Continuation<? super InvestingMonitorDataState>, Object> {
            final /* synthetic */ InvestingMonitorViewMode $newViewMode;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InvestingMonitorViewMode investingMonitorViewMode, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$newViewMode = investingMonitorViewMode;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$newViewMode, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InvestingMonitorDataState investingMonitorDataState, Continuation<? super InvestingMonitorDataState> continuation) {
                return ((AnonymousClass1) create(investingMonitorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InvestingMonitorDataState.copy$default((InvestingMonitorDataState) this.L$0, false, false, null, null, null, null, null, this.$newViewMode, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        }
    }

    public final void onSwitchViewMode(InvestingMonitorViewMode currentViewMode) {
        Intrinsics.checkNotNullParameter(currentViewMode, "currentViewMode");
        Launch.launchDefault$default(getLifecycleScope(), null, null, new C266091(currentViewMode, this, null), 3, null);
    }

    public final void onSortOrderChanged$feature_investing_monitor_externalDebug(InvestingMonitorSortType selectedSortType, InvestingMonitorPage page) {
        Intrinsics.checkNotNullParameter(selectedSortType, "selectedSortType");
        Intrinsics.checkNotNullParameter(page, "page");
        Launch.launchDefault$default(getLifecycleScope(), null, null, new InvestingMonitorDuxo$onSortOrderChanged$1(this, page, selectedSortType, null), 3, null);
    }

    /* compiled from: InvestingMonitorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onTabsReordered$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onTabsReordered$1 */
    static final class C266101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<CuratedList> $newTabList;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C266101(List<CuratedList> list, Continuation<? super C266101> continuation) {
            super(2, continuation);
            this.$newTabList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C266101 c266101 = InvestingMonitorDuxo.this.new C266101(this.$newTabList, continuation);
            c266101.L$0 = obj;
            return c266101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C266101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final InvestingMonitorDuxo investingMonitorDuxo = InvestingMonitorDuxo.this;
            final List<CuratedList> list = this.$newTabList;
            investingMonitorDuxo.withDataState(new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onTabsReordered$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InvestingMonitorDuxo.C266101.invokeSuspend$lambda$2(list, investingMonitorDuxo, coroutineScope, (InvestingMonitorDataState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(List list, InvestingMonitorDuxo investingMonitorDuxo, CoroutineScope coroutineScope, InvestingMonitorDataState investingMonitorDataState) {
            List list2 = list;
            final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((CuratedList) it.next()).getId());
            }
            investingMonitorDuxo.applyMutation(new InvestingMonitorDuxo$onTabsReordered$1$1$1(CollectionsKt.sortedWith(investingMonitorDataState.getCuratedListInfoPairs(), new Comparator() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onTabsReordered$1$invokeSuspend$lambda$2$$inlined$compareBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(arrayList.indexOf(((CuratedList) ((Tuples2) t).getFirst()).getId())), Integer.valueOf(arrayList.indexOf(((CuratedList) ((Tuples2) t2).getFirst()).getId())));
                }
            }), null));
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new InvestingMonitorDuxo$onTabsReordered$1$1$2(investingMonitorDuxo, list, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public final Job onTabsReordered(List<CuratedList> newTabList) {
        Intrinsics.checkNotNullParameter(newTabList, "newTabList");
        return Launch.launchDefault$default(getLifecycleScope(), null, null, new C266101(newTabList, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<Tuples2<CuratedList, List<CuratedListEligible>>>> streamCuratedLists() {
        Timber.INSTANCE.mo3350d("Begin stream of curated lists", new Object[0]);
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.curatedListStore.streamCuratedListsByOwnerType(ApiCuratedList.OwnerType.CUSTOM)), Integer.MAX_VALUE, null, 2, null)), new InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$1(null, this))), new InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$2(null, FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.listOrderStore.getOrderedLists()), Integer.MAX_VALUE, null, 2, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Tuples2<CuratedList, List<CuratedListEligible>>> recreateCuratedListInfoPairs(List<? extends Tuples2<CuratedList, ? extends List<? extends CuratedListEligible>>> curatedListInfoPairs, UUID targetListId, List<? extends CuratedListEligible> newList) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = curatedListInfoPairs.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            if (Intrinsics.areEqual(((CuratedList) tuples2.getFirst()).getId(), targetListId)) {
                arrayList.add(Tuples4.m3642to(tuples2.getFirst(), newList));
            } else {
                arrayList.add(tuples2);
            }
        }
        return arrayList;
    }
}
