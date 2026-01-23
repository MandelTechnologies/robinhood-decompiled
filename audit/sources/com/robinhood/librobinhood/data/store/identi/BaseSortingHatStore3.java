package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.models.dao.SortingHatDaoV2;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: BaseSortingHatStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$getSortingHatExperienceEndpoint$2, reason: use source file name */
/* loaded from: classes20.dex */
/* synthetic */ class BaseSortingHatStore3 extends AdaptedFunctionReference implements Function2<SortingHatRecord, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    BaseSortingHatStore3(Object obj) {
        super(2, obj, SortingHatDaoV2.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SortingHatRecord sortingHatRecord, Continuation<? super Unit> continuation) {
        return BaseSortingHatStore.getSortingHatExperienceEndpoint$insert$2((SortingHatDaoV2) this.receiver, sortingHatRecord, continuation);
    }
}
