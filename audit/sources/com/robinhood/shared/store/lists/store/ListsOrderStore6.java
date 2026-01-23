package com.robinhood.shared.store.lists.store;

import com.robinhood.models.dao.ListsOrderDao;
import com.robinhood.models.p320db.bonfire.ListsOrder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ListsOrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.store.lists.store.ListsOrderStore$updateOrderedListsEndpoint$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class ListsOrderStore6 extends AdaptedFunctionReference implements Function2<ListsOrder, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    ListsOrderStore6(Object obj) {
        super(2, obj, ListsOrderDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ListsOrder listsOrder, Continuation<? super Unit> continuation) {
        return ListsOrderStore.updateOrderedListsEndpoint$insert$3((ListsOrderDao) this.receiver, listsOrder, continuation);
    }
}
