package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.models.p320db.identi.sortinghat.SortingHatRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BaseSortingHatStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$getSortingHatExperienceWithDynamicStaleEndpoint$1, reason: use source file name */
/* loaded from: classes20.dex */
/* synthetic */ class BaseSortingHatStore4 extends FunctionReferenceImpl implements Function2<SortingHatQueryArgs, Continuation<? super SortingHatRecord>, Object>, ContinuationImpl6 {
    BaseSortingHatStore4(Object obj) {
        super(2, obj, BaseSortingHatStore.class, "getSortingHatRecord", "getSortingHatRecord(Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SortingHatQueryArgs sortingHatQueryArgs, Continuation<? super SortingHatRecord> continuation) {
        return ((BaseSortingHatStore) this.receiver).getSortingHatRecord(sortingHatQueryArgs, continuation);
    }
}
