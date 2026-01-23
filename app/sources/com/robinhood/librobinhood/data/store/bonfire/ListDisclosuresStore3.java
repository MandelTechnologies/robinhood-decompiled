package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.dao.bonfire.ListDisclosureDao;
import com.robinhood.models.p320db.bonfire.ListDisclosure;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ListDisclosuresStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class ListDisclosuresStore3 extends AdaptedFunctionReference implements Function2<ListDisclosure, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    ListDisclosuresStore3(Object obj) {
        super(2, obj, ListDisclosureDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ListDisclosure listDisclosure, Continuation<? super Unit> continuation) {
        return ListDisclosuresStore.endpoint$insert((ListDisclosureDao) this.receiver, listDisclosure, continuation);
    }
}
