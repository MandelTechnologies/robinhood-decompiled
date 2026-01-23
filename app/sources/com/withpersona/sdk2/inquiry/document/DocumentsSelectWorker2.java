package com.withpersona.sdk2.inquiry.document;

import android.net.Uri;
import com.withpersona.sdk2.inquiry.launchers.DocumentsSelectLauncherResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DocumentsSelectWorker.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$documentSelectResult$1", m3645f = "DocumentsSelectWorker.kt", m3646l = {41}, m3647m = "invokeSuspend")
/* renamed from: com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$documentSelectResult$1, reason: use source file name */
/* loaded from: classes18.dex */
final class DocumentsSelectWorker2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends Uri>>, Object> {
    int label;

    DocumentsSelectWorker2(Continuation<? super DocumentsSelectWorker2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocumentsSelectWorker2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Uri>> continuation) {
        return ((DocumentsSelectWorker2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        DocumentsSelectLauncherResult documentsSelectLauncherResult = new DocumentsSelectLauncherResult();
        this.label = 1;
        Object objFirstOrNull = FlowKt.firstOrNull(documentsSelectLauncherResult, this);
        return objFirstOrNull == coroutine_suspended ? coroutine_suspended : objFirstOrNull;
    }
}
