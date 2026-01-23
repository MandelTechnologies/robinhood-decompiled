package com.plaid.internal;

import com.plaid.internal.C5953R5;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@DebugMetadata(m3644c = "com.plaid.internal.link.LinkActivityViewModel$startLinkEventQueue$1", m3645f = "LinkActivityViewModel.kt", m3646l = {90}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.i2 */
/* loaded from: classes16.dex */
public final class C7104i2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f2850a;

    /* renamed from: b */
    public /* synthetic */ Object f2851b;

    /* renamed from: c */
    public final /* synthetic */ C7094h2 f2852c;

    @DebugMetadata(m3644c = "com.plaid.internal.link.LinkActivityViewModel$startLinkEventQueue$1$1", m3645f = "LinkActivityViewModel.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.i2$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ LinkEvent f2853a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LinkEvent linkEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f2853a = linkEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f2853a, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new a(this.f2853a, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C5953R5.a.m1299a(C5953R5.f1671a, "delivering " + this.f2853a);
            Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(this.f2853a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7104i2(C7094h2 c7094h2, Continuation<? super C7104i2> continuation) {
        super(2, continuation);
        this.f2852c = c7094h2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C7104i2 c7104i2 = new C7104i2(this.f2852c, continuation);
        c7104i2.f2851b = obj;
        return c7104i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        C7104i2 c7104i2 = new C7104i2(this.f2852c, continuation);
        c7104i2.f2851b = coroutineScope;
        return c7104i2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2850a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.f2851b;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f2851b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException unused) {
                C5953R5.a.m1309e(C5953R5.f1671a, "Link event consumer has ended. This is normal at the end of the activity lifecycle.If it occurs at any other time, it may result in loss of link events delivered.");
                return Unit.INSTANCE;
            }
        }
        while (CoroutineScope2.isActive(coroutineScope)) {
            C7258y2 c7258y2 = this.f2852c.f2830e;
            if (c7258y2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkEventQueue");
                c7258y2 = null;
            }
            DelayedC7247x0 delayedC7247x0 = (DelayedC7247x0) c7258y2.f3320a.poll(200L, TimeUnit.MILLISECONDS);
            LinkEvent linkEvent = delayedC7247x0 != null ? delayedC7247x0.f3291a : null;
            if (linkEvent != null) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(linkEvent, null);
                this.f2851b = coroutineScope;
                this.f2850a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
