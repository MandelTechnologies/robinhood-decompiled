package com.withpersona.sdk2.inquiry.nfc;

import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ScanNfcWorker.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1$1", m3645f = "ScanNfcWorker.kt", m3646l = {91, 96}, m3647m = "emit")
/* renamed from: com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1$1$emit$1, reason: use source file name */
/* loaded from: classes18.dex */
final class ScanNfcWorker2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScanNfcWorker.C437011.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ScanNfcWorker2(ScanNfcWorker.C437011.AnonymousClass1<? super T> anonymousClass1, Continuation<? super ScanNfcWorker2> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((PassportNfcReaderOutput) null, (Continuation<? super Unit>) this);
    }
}
