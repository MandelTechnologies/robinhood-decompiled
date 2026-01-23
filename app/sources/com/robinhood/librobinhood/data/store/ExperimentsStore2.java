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
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore", m3645f = "ExperimentsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "coGetDeviceIdExperiments-IoAF18A$suspendImpl")
/* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$coGetDeviceIdExperiments$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ExperimentsStore2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExperimentsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExperimentsStore2(ExperimentsStore experimentsStore, Continuation<? super ExperimentsStore2> continuation) {
        super(continuation);
        this.this$0 = experimentsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM22649coGetDeviceIdExperimentsIoAF18A$suspendImpl = ExperimentsStore.m22649coGetDeviceIdExperimentsIoAF18A$suspendImpl(this.this$0, this);
        return objM22649coGetDeviceIdExperimentsIoAF18A$suspendImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM22649coGetDeviceIdExperimentsIoAF18A$suspendImpl : Result.m28549boximpl(objM22649coGetDeviceIdExperimentsIoAF18A$suspendImpl);
    }
}
