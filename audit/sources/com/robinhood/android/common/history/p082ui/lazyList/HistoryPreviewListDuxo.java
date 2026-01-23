package com.robinhood.android.common.history.p082ui.lazyList;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryPreviewListDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListDataState;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListViewState;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "stateProvider", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "buildHistoryPager", "Landroidx/paging/Pager;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "params", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;", "setParams", "", "setListItemsState", "state", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState;", "Companion", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class HistoryPreviewListDuxo extends BaseDuxo<HistoryPreviewListDataState, HistoryPreviewListViewState> {
    public static final int ADDITIONAL_REQUEST_SIZE = 1;
    private final HistoryStore historyStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryPreviewListDuxo(HistoryStore historyStore, HistoryPreviewListStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new HistoryPreviewListDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.historyStore = historyStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> buildHistoryPager(HistoryPreviewListParams params) {
        HistoryStore historyStore = this.historyStore;
        Observable observableJust = Observable.just(Optional3.asOptional(params.getHistoryEventState()));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable observableJust2 = Observable.just(params.getTransactionTypes());
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        return HistoryStore.buildPager$default(historyStore, observableJust, observableJust2, null, null, HistoryStaticFilter.copy$default(params.getStaticFilter(), null, null, null, null, null, null, null, null, true, null, null, 1791, null), new PagingConfig(params.getCount() + 1, 0, false, 0, 0, 0, 62, null), 12, null);
    }

    /* compiled from: HistoryPreviewListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.history.ui.lazyList.HistoryPreviewListDuxo$setParams$1", m3645f = "HistoryPreviewListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewListDuxo$setParams$1 */
    static final class C112101 extends ContinuationImpl7 implements Function2<HistoryPreviewListDataState, Continuation<? super HistoryPreviewListDataState>, Object> {
        final /* synthetic */ HistoryPreviewListParams $params;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HistoryPreviewListDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112101(HistoryPreviewListParams historyPreviewListParams, HistoryPreviewListDuxo historyPreviewListDuxo, Continuation<? super C112101> continuation) {
            super(2, continuation);
            this.$params = historyPreviewListParams;
            this.this$0 = historyPreviewListDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C112101 c112101 = new C112101(this.$params, this.this$0, continuation);
            c112101.L$0 = obj;
            return c112101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HistoryPreviewListDataState historyPreviewListDataState, Continuation<? super HistoryPreviewListDataState> continuation) {
            return ((C112101) create(historyPreviewListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HistoryPreviewListDataState historyPreviewListDataState = (HistoryPreviewListDataState) this.L$0;
            if (Intrinsics.areEqual(this.$params, historyPreviewListDataState.getParams())) {
                return historyPreviewListDataState;
            }
            HistoryPreviewListParams historyPreviewListParams = this.$params;
            return HistoryPreviewListDataState.copy$default(historyPreviewListDataState, historyPreviewListParams, this.this$0.buildHistoryPager(historyPreviewListParams), null, 4, null);
        }
    }

    public final void setParams(HistoryPreviewListParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        applyMutation(new C112101(params, this, null));
    }

    /* compiled from: HistoryPreviewListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.history.ui.lazyList.HistoryPreviewListDuxo$setListItemsState$1", m3645f = "HistoryPreviewListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.history.ui.lazyList.HistoryPreviewListDuxo$setListItemsState$1 */
    static final class C112091 extends ContinuationImpl7 implements Function2<HistoryPreviewListDataState, Continuation<? super HistoryPreviewListDataState>, Object> {
        final /* synthetic */ HistoryPreviewListItemsState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112091(HistoryPreviewListItemsState historyPreviewListItemsState, Continuation<? super C112091> continuation) {
            super(2, continuation);
            this.$state = historyPreviewListItemsState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C112091 c112091 = new C112091(this.$state, continuation);
            c112091.L$0 = obj;
            return c112091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HistoryPreviewListDataState historyPreviewListDataState, Continuation<? super HistoryPreviewListDataState> continuation) {
            return ((C112091) create(historyPreviewListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return HistoryPreviewListDataState.copy$default((HistoryPreviewListDataState) this.L$0, null, null, this.$state, 3, null);
        }
    }

    public final void setListItemsState(HistoryPreviewListItemsState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        applyMutation(new C112091(state, null));
    }
}
