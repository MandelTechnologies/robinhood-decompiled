package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.DocumentDao;
import com.robinhood.models.p320db.Document;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: DocumentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class DocumentStore$documentQuery$2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends Document>> {
    DocumentStore$documentQuery$2(Object obj) {
        super(1, obj, DocumentDao.class, "getDocument", "getDocument(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<Document> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((DocumentDao) this.receiver).getDocument(p0);
    }
}
