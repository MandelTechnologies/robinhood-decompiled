package com.robinhood.shared.security.store.trusteddevice;

import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.api.DisableRemoveDeviceResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: TrustedDeviceStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore$isRemoveDevicesDisabledEndpoint$1", m3645f = "TrustedDeviceStore.kt", m3646l = {53}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore$isRemoveDevicesDisabledEndpoint$1, reason: use source file name */
/* loaded from: classes6.dex */
final class TrustedDeviceStore4 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ TrustedDeviceStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrustedDeviceStore4(TrustedDeviceStore trustedDeviceStore, Continuation<? super TrustedDeviceStore4> continuation) {
        super(2, continuation);
        this.this$0 = trustedDeviceStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrustedDeviceStore4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Boolean> continuation) {
        return ((TrustedDeviceStore4) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Sheriff sheriff = this.this$0.sheriff;
            this.label = 1;
            obj = sheriff.getRemoveDevicesStatus(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxBoolean(((DisableRemoveDeviceResponse) obj).getDisableRemoveDevice());
    }
}
