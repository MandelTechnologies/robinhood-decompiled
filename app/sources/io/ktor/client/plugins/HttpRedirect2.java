package io.ktor.client.plugins;

import io.ktor.client.plugins.HttpRedirect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpRedirect.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.HttpRedirect$Plugin", m3645f = "HttpRedirect.kt", m3646l = {113}, m3647m = "handleCall")
/* renamed from: io.ktor.client.plugins.HttpRedirect$Plugin$handleCall$1, reason: use source file name */
/* loaded from: classes14.dex */
final class HttpRedirect2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpRedirect.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRedirect2(HttpRedirect.Companion companion, Continuation<? super HttpRedirect2> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handleCall(null, null, null, false, null, this);
    }
}
