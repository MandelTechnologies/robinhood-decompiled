package com.withpersona.sdk2.inquiry.document.network;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DocumentFileUploadWorker.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1", m3645f = "DocumentFileUploadWorker.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "emit")
/* renamed from: com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1$emit$1, reason: use source file name */
/* loaded from: classes18.dex */
final class DocumentFileUploadWorker2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DocumentFileUploadWorker.C435731.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DocumentFileUploadWorker2(DocumentFileUploadWorker.C435731.AnonymousClass1<? super T> anonymousClass1, Continuation<? super DocumentFileUploadWorker2> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((DocumentFileUploadWorker.Response) null, (Continuation<? super Unit>) this);
    }
}
