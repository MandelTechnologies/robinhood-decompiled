package com.salesforce.android.smi.core.internal.data.repository;

import com.salesforce.android.smi.core.internal.data.repository.FileRepository;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileRepository.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.FileRepository$read$4", m3645f = "FileRepository.kt", m3646l = {85}, m3647m = "saveProcessedResult")
/* renamed from: com.salesforce.android.smi.core.internal.data.repository.FileRepository$read$4$saveProcessedResult$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FileRepository4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileRepository.C421244 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileRepository4(FileRepository.C421244 c421244, Continuation<? super FileRepository4> continuation) {
        super(continuation);
        this.this$0 = c421244;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.saveProcessedResult((File) null, (Continuation<? super File>) this);
    }
}
