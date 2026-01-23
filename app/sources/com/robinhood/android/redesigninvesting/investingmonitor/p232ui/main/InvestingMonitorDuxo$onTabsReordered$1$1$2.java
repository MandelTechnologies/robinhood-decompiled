package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.robinhood.models.api.bonfire.ApiListsOrder4;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.bonfire.ListRecord;
import com.robinhood.models.p320db.bonfire.ListsOrder;
import com.robinhood.shared.store.lists.store.ListsOrderStore;
import io.reactivex.Observable;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: InvestingMonitorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onTabsReordered$1$1$2", m3645f = "InvestingMonitorDuxo.kt", m3646l = {455}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes5.dex */
final class InvestingMonitorDuxo$onTabsReordered$1$1$2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CuratedList> $newTabList;
    int label;
    final /* synthetic */ InvestingMonitorDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestingMonitorDuxo$onTabsReordered$1$1$2(InvestingMonitorDuxo investingMonitorDuxo, List<CuratedList> list, Continuation<? super InvestingMonitorDuxo$onTabsReordered$1$1$2> continuation) {
        super(2, continuation);
        this.this$0 = investingMonitorDuxo;
        this.$newTabList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestingMonitorDuxo$onTabsReordered$1$1$2(this.this$0, this.$newTabList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestingMonitorDuxo$onTabsReordered$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ListsOrderStore listsOrderStore = this.this$0.listOrderStore;
            List<CuratedList> list = this.$newTabList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ListRecord(((CuratedList) it.next()).getId(), ApiListsOrder4.CUSTOM));
            }
            Observable<ListsOrder> observableSaveOrderedLists = listsOrderStore.saveOrderedLists(new ListsOrder(0, arrayList, 1, null));
            this.label = 1;
            if (RxAwait3.awaitFirstOrNull(observableSaveOrderedLists, this) == coroutine_suspended) {
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
