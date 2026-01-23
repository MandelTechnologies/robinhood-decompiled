package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExperimentsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore", m3645f = "ExperimentsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "coGetState-0E7RQCE$suspendImpl")
/* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coGetState$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ExperimentsStore3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExperimentsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExperimentsStore3(ExperimentsStore experimentsStore, Continuation<? super ExperimentsStore3> continuation) {
        super(continuation);
        this.this$0 = experimentsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM22651coGetState0E7RQCE$suspendImpl = ExperimentsStore.m22651coGetState0E7RQCE$suspendImpl(this.this$0, null, false, this);
        return objM22651coGetState0E7RQCE$suspendImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM22651coGetState0E7RQCE$suspendImpl : Result.m28549boximpl(objM22651coGetState0E7RQCE$suspendImpl);
    }
}
