package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.extensions.SortOrders;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.sorting.InvestingMonitorSortType;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import io.reactivex.Completable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import timber.log.Timber;

/* compiled from: InvestingMonitorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onSortOrderChanged$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {451, 452, EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes5.dex */
final class InvestingMonitorDuxo$onSortOrderChanged$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestingMonitorPage $page;
    final /* synthetic */ InvestingMonitorSortType $selectedSortType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InvestingMonitorDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestingMonitorDuxo$onSortOrderChanged$1(InvestingMonitorDuxo investingMonitorDuxo, InvestingMonitorPage investingMonitorPage, InvestingMonitorSortType investingMonitorSortType, Continuation<? super InvestingMonitorDuxo$onSortOrderChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = investingMonitorDuxo;
        this.$page = investingMonitorPage;
        this.$selectedSortType = investingMonitorSortType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestingMonitorDuxo$onSortOrderChanged$1(this.this$0, this.$page, this.$selectedSortType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestingMonitorDuxo$onSortOrderChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f6, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r20) != r0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a4  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Tuples2 tuples2;
        ApiCuratedList.SortDirection sortDirection;
        Tuples2 tuples22;
        Single singleUpdateList$default;
        ApiCuratedList.SortOrder sortOrder;
        ApiCuratedList.SortDirection sortDirection2;
        ApiCuratedList.SortDirection sortDirection3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C266071(this.$page, null));
                ApiCuratedList.SortOrder childSortOrder = this.$page.getCuratedList().getChildSortOrder();
                ApiCuratedList.SortDirection childSortDirection = this.$page.getCuratedList().getChildSortDirection();
                Timber.Companion companion = Timber.INSTANCE;
                companion.mo3350d("Sort changing: selectedSortType=" + this.$selectedSortType + ", currentSortOrder=" + childSortOrder + ", currentSortDirection=" + childSortDirection + ", ", new Object[0]);
                InvestingMonitorSortType investingMonitorSortType = this.$selectedSortType;
                InvestingMonitorSortType investingMonitorSortType2 = InvestingMonitorSortType.SYMBOL;
                if (investingMonitorSortType == investingMonitorSortType2) {
                    if (childSortOrder == ApiCuratedList.SortOrder.CUSTOM) {
                        tuples22 = new Tuples2(investingMonitorSortType2, ApiCuratedList.SortDirection.DESCENDING);
                    } else {
                        ApiCuratedList.SortOrder sortOrder2 = ApiCuratedList.SortOrder.SYMBOL;
                        if (childSortOrder == sortOrder2 && childSortDirection == ApiCuratedList.SortDirection.DESCENDING) {
                            tuples22 = new Tuples2(investingMonitorSortType2, ApiCuratedList.SortDirection.ASCENDING);
                        } else if (childSortOrder == sortOrder2 && childSortDirection == (sortDirection3 = ApiCuratedList.SortDirection.ASCENDING)) {
                            tuples2 = new Tuples2(InvestingMonitorSortType.CUSTOM, sortDirection3);
                            tuples22 = tuples2;
                        } else {
                            tuples22 = new Tuples2(investingMonitorSortType2, ApiCuratedList.SortDirection.DESCENDING);
                        }
                    }
                    InvestingMonitorSortType investingMonitorSortType3 = (InvestingMonitorSortType) tuples22.component1();
                    ApiCuratedList.SortDirection sortDirection4 = (ApiCuratedList.SortDirection) tuples22.component2();
                    ApiCuratedList.SortOrder sortOrder3 = investingMonitorSortType3.getSortOrder();
                    companion.mo3350d("Switching sort order selected=" + this.$selectedSortType.name() + PlaceholderUtils.XXShortPlaceholderText + childSortOrder + " / " + childSortDirection + " -> " + sortOrder3 + " -> " + sortDirection4, new Object[0]);
                    singleUpdateList$default = CuratedListStore.updateList$default(this.this$0.curatedListStore, this.$page.getCuratedList().getId(), null, null, sortOrder3, sortDirection4, 6, null);
                    this.L$0 = sortDirection4;
                    this.L$1 = sortOrder3;
                    this.label = 1;
                    if (RxAwait3.await(singleUpdateList$default, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sortOrder = sortOrder3;
                    sortDirection2 = sortDirection4;
                } else {
                    if (childSortOrder == ApiCuratedList.SortOrder.CUSTOM) {
                        tuples22 = new Tuples2(InvestingMonitorSortType.PRICE, ApiCuratedList.SortDirection.DESCENDING);
                    } else {
                        InvestingMonitorSortType investingMonitorSortType4 = InvestingMonitorSortType.PRICE;
                        if (childSortOrder == investingMonitorSortType4.getSortOrder() && childSortDirection == ApiCuratedList.SortDirection.DESCENDING) {
                            tuples2 = new Tuples2(investingMonitorSortType4, ApiCuratedList.SortDirection.ASCENDING);
                        } else if (childSortOrder == investingMonitorSortType4.getSortOrder() && childSortDirection == ApiCuratedList.SortDirection.ASCENDING) {
                            tuples22 = new Tuples2(InvestingMonitorSortType.ONE_DAY_CHANGE, ApiCuratedList.SortDirection.DESCENDING);
                        } else {
                            InvestingMonitorSortType investingMonitorSortType5 = InvestingMonitorSortType.ONE_DAY_CHANGE;
                            if (childSortOrder == investingMonitorSortType5.getSortOrder() && childSortDirection == ApiCuratedList.SortDirection.DESCENDING) {
                                tuples22 = new Tuples2(investingMonitorSortType5, ApiCuratedList.SortDirection.ASCENDING);
                            } else if (childSortOrder == investingMonitorSortType5.getSortOrder() && childSortDirection == (sortDirection = ApiCuratedList.SortDirection.ASCENDING)) {
                                tuples22 = new Tuples2(InvestingMonitorSortType.CUSTOM, sortDirection);
                            } else {
                                tuples2 = new Tuples2(investingMonitorSortType4, ApiCuratedList.SortDirection.DESCENDING);
                            }
                        }
                        tuples22 = tuples2;
                    }
                    InvestingMonitorSortType investingMonitorSortType32 = (InvestingMonitorSortType) tuples22.component1();
                    ApiCuratedList.SortDirection sortDirection42 = (ApiCuratedList.SortDirection) tuples22.component2();
                    ApiCuratedList.SortOrder sortOrder32 = investingMonitorSortType32.getSortOrder();
                    companion.mo3350d("Switching sort order selected=" + this.$selectedSortType.name() + PlaceholderUtils.XXShortPlaceholderText + childSortOrder + " / " + childSortDirection + " -> " + sortOrder32 + " -> " + sortDirection42, new Object[0]);
                    singleUpdateList$default = CuratedListStore.updateList$default(this.this$0.curatedListStore, this.$page.getCuratedList().getId(), null, null, sortOrder32, sortDirection42, 6, null);
                    this.L$0 = sortDirection42;
                    this.L$1 = sortOrder32;
                    this.label = 1;
                    if (RxAwait3.await(singleUpdateList$default, this) != coroutine_suspended) {
                    }
                }
            } else if (i == 1) {
                ApiCuratedList.SortOrder sortOrder4 = (ApiCuratedList.SortOrder) this.L$1;
                ApiCuratedList.SortDirection sortDirection5 = (ApiCuratedList.SortDirection) this.L$0;
                ResultKt.throwOnFailure(obj);
                sortOrder = sortOrder4;
                sortDirection2 = sortDirection5;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C266082(null));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.label = 3;
            }
            this.this$0.curatedListItemViewModeStore.updateViewMode(this.$page.getCuratedList().getId(), SortOrders.getViewMode(sortOrder));
            Completable completableRefreshListItems$default = CuratedListItemsStore.refreshListItems$default(this.this$0.curatedListItemsStore, true, this.$page.getCuratedList().getId(), this.$page.getCuratedList().getOwnerType(), sortOrder, sortDirection2, null, 32, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (RxAwait3.await(completableRefreshListItems$default, this) != coroutine_suspended) {
                this.label = 3;
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            this.this$0.applyMutation(new C266082(null));
            throw th;
        }
    }

    /* compiled from: InvestingMonitorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onSortOrderChanged$1$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onSortOrderChanged$1$1 */
    static final class C266071 extends ContinuationImpl7 implements Function2<InvestingMonitorDataState, Continuation<? super InvestingMonitorDataState>, Object> {
        final /* synthetic */ InvestingMonitorPage $page;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C266071(InvestingMonitorPage investingMonitorPage, Continuation<? super C266071> continuation) {
            super(2, continuation);
            this.$page = investingMonitorPage;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C266071 c266071 = new C266071(this.$page, continuation);
            c266071.L$0 = obj;
            return c266071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestingMonitorDataState investingMonitorDataState, Continuation<? super InvestingMonitorDataState> continuation) {
            return ((C266071) create(investingMonitorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestingMonitorDataState.copy$default((InvestingMonitorDataState) this.L$0, false, false, null, null, null, null, this.$page.getCuratedList().getId(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
        }
    }

    /* compiled from: InvestingMonitorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onSortOrderChanged$1$2", m3645f = "InvestingMonitorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onSortOrderChanged$1$2 */
    static final class C266082 extends ContinuationImpl7 implements Function2<InvestingMonitorDataState, Continuation<? super InvestingMonitorDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C266082(Continuation<? super C266082> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C266082 c266082 = new C266082(continuation);
            c266082.L$0 = obj;
            return c266082;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestingMonitorDataState investingMonitorDataState, Continuation<? super InvestingMonitorDataState> continuation) {
            return ((C266082) create(investingMonitorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestingMonitorDataState.copy$default((InvestingMonitorDataState) this.L$0, false, false, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
        }
    }
}
