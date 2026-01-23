package com.robinhood.android.doc.p109ui.initial;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DocUploadInitialIdentiDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo", m3645f = "DocUploadInitialIdentiDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, 81}, m3647m = "getGdprApplicable$feature_doc_upload_externalRelease")
/* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$getGdprApplicable$1, reason: use source file name */
/* loaded from: classes7.dex */
final class DocUploadInitialIdentiDuxo7 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DocUploadInitialIdentiDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocUploadInitialIdentiDuxo7(DocUploadInitialIdentiDuxo docUploadInitialIdentiDuxo, Continuation<? super DocUploadInitialIdentiDuxo7> continuation) {
        super(continuation);
        this.this$0 = docUploadInitialIdentiDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getGdprApplicable$feature_doc_upload_externalRelease(this);
    }
}
