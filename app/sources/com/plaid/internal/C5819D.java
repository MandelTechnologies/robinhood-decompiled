package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.ChannelPolling$getNewPollingJob$1", m3645f = "ChannelPolling.kt", m3646l = {38}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.D */
/* loaded from: classes16.dex */
public final class C5819D extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f1311a;

    /* renamed from: b */
    public final /* synthetic */ C5837F f1312b;

    /* renamed from: c */
    public final /* synthetic */ C5792A f1313c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC5846G f1314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5819D(C5837F c5837f, C5792A c5792a, AbstractC5846G abstractC5846G, Continuation<? super C5819D> continuation) {
        super(2, continuation);
        this.f1312b = c5837f;
        this.f1313c = c5792a;
        this.f1314d = abstractC5846G;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5819D(this.f1312b, this.f1313c, this.f1314d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C5819D) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1311a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C5837F c5837f = this.f1312b;
            C5792A c5792a = this.f1313c;
            AbstractC5846G abstractC5846G = this.f1314d;
            this.f1311a = 1;
            if (C5837F.m1191a(c5837f, c5792a, abstractC5846G, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
