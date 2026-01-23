package com.robinhood.android.doc.p109ui.initial;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DocUploadInitialIdentiDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo", m3645f = "DocUploadInitialIdentiDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "getDocumentRequestsStates$feature_doc_upload_externalRelease")
/* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$getDocumentRequestsStates$1, reason: use source file name */
/* loaded from: classes7.dex */
final class DocUploadInitialIdentiDuxo2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DocUploadInitialIdentiDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocUploadInitialIdentiDuxo2(DocUploadInitialIdentiDuxo docUploadInitialIdentiDuxo, Continuation<? super DocUploadInitialIdentiDuxo2> continuation) {
        super(continuation);
        this.this$0 = docUploadInitialIdentiDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getDocumentRequestsStates$feature_doc_upload_externalRelease(this);
    }
}
