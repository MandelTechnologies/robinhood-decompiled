package com.robinhood.librobinhood.data.store;

import com.robinhood.android.documents.models.DocumentsBrokebackApi;
import com.robinhood.models.api.ApiDocument;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DocumentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class DocumentStore$documentEndpoint$1 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiDocument>, Object>, ContinuationImpl6 {
    DocumentStore$documentEndpoint$1(Object obj) {
        super(2, obj, DocumentsBrokebackApi.class, "getDocument", "getDocument(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiDocument> continuation) {
        return ((DocumentsBrokebackApi) this.receiver).getDocument(uuid, continuation);
    }
}
