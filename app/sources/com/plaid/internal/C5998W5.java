package com.plaid.internal;

import com.plaid.link.SubmissionData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.preload.PreloadLinkController$preloadWebview$2", m3645f = "PreloadLinkController.kt", m3646l = {87}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.W5 */
/* loaded from: classes16.dex */
public final class C5998W5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f1803a;

    /* renamed from: b */
    public /* synthetic */ Object f1804b;

    /* renamed from: c */
    public final /* synthetic */ C6025Z5 f1805c;

    /* renamed from: d */
    public final /* synthetic */ String f1806d;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.preload.PreloadLinkController$preloadWebview$2$1", m3645f = "PreloadLinkController.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.W5$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C6025Z5 f1807a;

        /* renamed from: b */
        public final /* synthetic */ C5927O5 f1808b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6025Z5 c6025z5, C5927O5 c5927o5, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1807a = c6025z5;
            this.f1808b = c5927o5;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f1807a, this.f1808b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new a(this.f1807a, this.f1808b, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SubmissionData submissionData = this.f1807a.f1876g;
            if (submissionData == null) {
                return null;
            }
            this.f1808b.m1278a(submissionData.getPhoneNumber(), submissionData.getDateOfBirth());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5998W5(C6025Z5 c6025z5, String str, Continuation<? super C5998W5> continuation) {
        super(2, continuation);
        this.f1805c = c6025z5;
        this.f1806d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C5998W5 c5998w5 = new C5998W5(this.f1805c, this.f1806d, continuation);
        c5998w5.f1804b = obj;
        return c5998w5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C5998W5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1803a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f1804b;
            if (!JobKt.isActive(coroutineScope.getCoroutineContext())) {
                return Unit.INSTANCE;
            }
            C5927O5 c5927o5M1210b = this.f1805c.f1872c.m1210b();
            if (!JobKt.isActive(coroutineScope.getCoroutineContext())) {
                return Unit.INSTANCE;
            }
            C6025Z5 c6025z5 = this.f1805c;
            C6045b6 listener = c6025z5.f1874e;
            C7199r7 c7199r7 = c6025z5.f1875f;
            String url = this.f1806d;
            c7199r7.getClass();
            Intrinsics.checkNotNullParameter(url, "uri");
            Intrinsics.checkNotNullParameter(listener, "interceptor");
            Intrinsics.checkNotNullParameter(url, "url");
            C5996W3 c5996w3 = c5927o5M1210b.f1591a;
            c5996w3.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            c5996w3.f1800a = listener;
            c5927o5M1210b.loadUrl(url);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this.f1805c, c5927o5M1210b, null);
            this.f1803a = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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
