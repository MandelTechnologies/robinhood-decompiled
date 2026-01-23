package io.ktor.client.plugins.contentnegotiation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContentNegotiation.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation", m3645f = "ContentNegotiation.kt", m3646l = {182}, m3647m = "convertRequest$ktor_client_content_negotiation")
/* renamed from: io.ktor.client.plugins.contentnegotiation.ContentNegotiation$convertRequest$1, reason: use source file name */
/* loaded from: classes14.dex */
final class ContentNegotiation6 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContentNegotiation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentNegotiation6(ContentNegotiation contentNegotiation, Continuation<? super ContentNegotiation6> continuation) {
        super(continuation);
        this.this$0 = contentNegotiation;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.convertRequest$ktor_client_content_negotiation(null, null, this);
    }
}
