package com.plaid.internal;

import com.plaid.link.SubmissionData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.preload.PreloadLinkController$setSubmissionData$2", m3645f = "PreloadLinkController.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.Y5 */
/* loaded from: classes16.dex */
public final class C6016Y5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C5927O5 f1852a;

    /* renamed from: b */
    public final /* synthetic */ SubmissionData f1853b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6016Y5(C5927O5 c5927o5, SubmissionData submissionData, Continuation<? super C6016Y5> continuation) {
        super(2, continuation);
        this.f1852a = c5927o5;
        this.f1853b = submissionData;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6016Y5(this.f1852a, this.f1853b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C6016Y5(this.f1852a, this.f1853b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f1852a.m1278a(this.f1853b.getPhoneNumber(), this.f1853b.getDateOfBirth());
        return Unit.INSTANCE;
    }
}
