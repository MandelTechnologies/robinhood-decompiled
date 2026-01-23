package io.ktor.client.plugins.contentnegotiation;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContentNegotiation.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation", m3645f = "ContentNegotiation.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m3647m = "convertResponse$ktor_client_content_negotiation")
/* renamed from: io.ktor.client.plugins.contentnegotiation.ContentNegotiation$convertResponse$1, reason: use source file name */
/* loaded from: classes14.dex */
final class ContentNegotiation8 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContentNegotiation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentNegotiation8(ContentNegotiation contentNegotiation, Continuation<? super ContentNegotiation8> continuation) {
        super(continuation);
        this.this$0 = contentNegotiation;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.convertResponse$ktor_client_content_negotiation(null, null, null, null, null, this);
    }
}
