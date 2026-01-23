package com.robinhood.android.doc.p109ui.initial;

import com.robinhood.android.doc.p109ui.initial.DocUploadInitialIdentiFragment;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocUploadInitialIdentiDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/ui/DocumentRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$getDocumentRequestsStates$docUploadSingle$1", m3645f = "DocUploadInitialIdentiDuxo.kt", m3646l = {98, 106}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiDuxo$getDocumentRequestsStates$docUploadSingle$1, reason: use source file name */
/* loaded from: classes7.dex */
final class DocUploadInitialIdentiDuxo6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends DocumentRequest>>, Object> {
    int label;
    final /* synthetic */ DocUploadInitialIdentiDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocUploadInitialIdentiDuxo6(DocUploadInitialIdentiDuxo docUploadInitialIdentiDuxo, Continuation<? super DocUploadInitialIdentiDuxo6> continuation) {
        super(2, continuation);
        this.this$0 = docUploadInitialIdentiDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocUploadInitialIdentiDuxo6(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends DocumentRequest>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<DocumentRequest>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<DocumentRequest>> continuation) {
        return ((DocUploadInitialIdentiDuxo6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r11 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (r11 == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (((DocUploadInitialIdentiFragment.Args) DocUploadInitialIdentiDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).isOnboardingOnly()) {
                DocumentRequestStore documentRequestStore = this.this$0.documentRequestStore;
                ApiDocumentRequest.State state = ApiDocumentRequest.State.PENDING_UPLOAD;
                this.label = 1;
                obj = DocumentRequestStore.getDocumentRequests$default(documentRequestStore, null, state, this, 1, null);
            } else {
                DocumentRequestStore documentRequestStore2 = this.this$0.documentRequestStore;
                ApiDocumentRequest.State state2 = ApiDocumentRequest.State.PENDING_UPLOAD;
                this.label = 2;
                obj = DocumentRequestStore.getDocumentRequests$default(documentRequestStore2, null, state2, this, 1, null);
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (List) obj;
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            List<ApiDocumentRequest.Reason> reasons = ((DocumentRequest) obj2).getReasons();
            if (!(reasons instanceof Collection) || !reasons.isEmpty()) {
                Iterator<T> it = reasons.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ApiDocumentRequest.Reason.INSTANCE.getONBOARDING_SUPPORTED_REASONS().contains((ApiDocumentRequest.Reason) it.next())) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
