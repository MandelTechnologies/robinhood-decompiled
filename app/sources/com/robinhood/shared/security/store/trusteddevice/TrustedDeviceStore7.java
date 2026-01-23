package com.robinhood.shared.security.store.trusteddevice;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TrustedDeviceStore.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore$removeDevicesEndpoint$2", m3645f = "TrustedDeviceStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore$removeDevicesEndpoint$2, reason: use source file name */
/* loaded from: classes6.dex */
final class TrustedDeviceStore7 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;

    TrustedDeviceStore7(Continuation<? super TrustedDeviceStore7> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrustedDeviceStore7(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((TrustedDeviceStore7) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
