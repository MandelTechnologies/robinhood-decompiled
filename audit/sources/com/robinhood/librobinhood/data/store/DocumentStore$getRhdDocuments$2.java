package com.robinhood.librobinhood.data.store;

import com.robinhood.android.documents.models.ApiRhdDocument;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.dao.DocumentDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: DocumentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class DocumentStore$getRhdDocuments$2 extends AdaptedFunctionReference implements Function2<PaginatedResult<? extends ApiRhdDocument>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    DocumentStore$getRhdDocuments$2(Object obj) {
        super(2, obj, DocumentDao.class, "insertRhdStatements", "insertRhdStatements(Lcom/robinhood/models/PaginatedResult;)V", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiRhdDocument> paginatedResult, Continuation<? super Unit> continuation) {
        return DocumentStore.getRhdDocuments$insertRhdStatements((DocumentDao) this.receiver, paginatedResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiRhdDocument> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiRhdDocument>) paginatedResult, continuation);
    }
}
