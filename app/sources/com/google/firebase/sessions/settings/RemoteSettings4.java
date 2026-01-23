package com.google.firebase.sessions.settings;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RemoteSettings.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "msg", ""}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m3645f = "RemoteSettings.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2, reason: use source file name */
/* loaded from: classes.dex */
final class RemoteSettings4 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    RemoteSettings4(Continuation<? super RemoteSettings4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteSettings4 remoteSettings4 = new RemoteSettings4(continuation);
        remoteSettings4.L$0 = obj;
        return remoteSettings4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((RemoteSettings4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.L$0));
        return Unit.INSTANCE;
    }
}
