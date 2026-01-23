package com.robinhood.librobinhood.data.store;

import com.robinhood.android.models.taxcenter.dao.TaxDocumentDao;
import com.robinhood.android.models.taxcenter.p195db.TaxDocument;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: TaxCenterStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.TaxCenterStore$taxDocumentEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class TaxCenterStore5 extends AdaptedFunctionReference implements Function2<TaxDocument, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    TaxCenterStore5(Object obj) {
        super(2, obj, TaxDocumentDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TaxDocument taxDocument, Continuation<? super Unit> continuation) {
        return TaxCenterStore.taxDocumentEndpoint$insert$1((TaxDocumentDao) this.receiver, taxDocument, continuation);
    }
}
