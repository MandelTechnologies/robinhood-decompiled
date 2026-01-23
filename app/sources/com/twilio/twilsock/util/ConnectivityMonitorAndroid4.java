package com.twilio.twilsock.util;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConnectivityMonitorAndroid.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.twilsock.util.ConnectivityMonitorImpl$isNetworkAvailable$2$1", m3645f = "ConnectivityMonitorAndroid.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.twilio.twilsock.util.ConnectivityMonitorImpl$isNetworkAvailable$2$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ConnectivityMonitorAndroid4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConnectivityMonitorAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectivityMonitorAndroid4(ConnectivityMonitorAndroid connectivityMonitorAndroid, Continuation<? super ConnectivityMonitorAndroid4> continuation) {
        super(2, continuation);
        this.this$0 = connectivityMonitorAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConnectivityMonitorAndroid4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConnectivityMonitorAndroid4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.getOnChanged().invoke();
        return Unit.INSTANCE;
    }
}
