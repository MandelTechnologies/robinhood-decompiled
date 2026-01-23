package com.robinhood.android.doc.p109ui.initial;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocUploadInitialIdentiDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$onCreate$1$isGdpr$1", m3645f = "DocUploadInitialIdentiDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$onCreate$1$isGdpr$1, reason: use source file name */
/* loaded from: classes7.dex */
final class DocUploadInitialIdentiDuxo9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ DocUploadInitialIdentiDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocUploadInitialIdentiDuxo9(DocUploadInitialIdentiDuxo docUploadInitialIdentiDuxo, Continuation<? super DocUploadInitialIdentiDuxo9> continuation) {
        super(2, continuation);
        this.this$0 = docUploadInitialIdentiDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocUploadInitialIdentiDuxo9(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((DocUploadInitialIdentiDuxo9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        DocUploadInitialIdentiDuxo docUploadInitialIdentiDuxo = this.this$0;
        this.label = 1;
        Object gdprApplicable$feature_doc_upload_externalRelease = docUploadInitialIdentiDuxo.getGdprApplicable$feature_doc_upload_externalRelease(this);
        return gdprApplicable$feature_doc_upload_externalRelease == coroutine_suspended ? coroutine_suspended : gdprApplicable$feature_doc_upload_externalRelease;
    }
}
