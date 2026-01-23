package com.plaid.internal;

import androidx.lifecycle.ViewModel2;
import com.plaid.internal.C5953R5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewViewModel$2", m3645f = "WebviewViewModel.kt", m3646l = {125}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.x7 */
/* loaded from: classes16.dex */
public final class C7254x7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3306a;

    /* renamed from: b */
    public final /* synthetic */ C5800A7 f3307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7254x7(C5800A7 c5800a7, Continuation<? super C7254x7> continuation) {
        super(2, continuation);
        this.f3307b = c5800a7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7254x7(this.f3307b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C7254x7(this.f3307b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3306a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC7136l6 interfaceC7136l6 = this.f3307b.f1244i;
            if (interfaceC7136l6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
                interfaceC7136l6 = null;
            }
            this.f3306a = 1;
            obj = interfaceC7136l6.mo1158b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C5792A channelInfo = (C5792A) obj;
        if (channelInfo == null) {
            C5953R5.a.m1309e(C5953R5.f1671a, "No Out Of Process Polling Info Available");
            return Unit.INSTANCE;
        }
        C5837F c5837f = this.f3307b.f1245j;
        if (c5837f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
            c5837f = null;
        }
        CoroutineScope coroutineScope = ViewModel2.getViewModelScope(this.f3307b);
        C7272z7 pollingCallback = this.f3307b.f1251p;
        c5837f.getClass();
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(channelInfo, "channelInfo");
        Intrinsics.checkNotNullParameter(pollingCallback, "pollingCallback");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C5819D(c5837f, channelInfo, pollingCallback, null), 3, null);
        return Unit.INSTANCE;
    }
}
