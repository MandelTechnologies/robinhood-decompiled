package com.robinhood.shared.security.store.trusteddevice;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.utils.buildconfig.BuildVariant;
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
@DebugMetadata(m3644c = "com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore$removeDevicesEndpoint$1", m3645f = "TrustedDeviceStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore$removeDevicesEndpoint$1, reason: use source file name */
/* loaded from: classes6.dex */
final class TrustedDeviceStore6 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TrustedDeviceStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrustedDeviceStore6(TrustedDeviceStore trustedDeviceStore, Continuation<? super TrustedDeviceStore6> continuation) {
        super(2, continuation);
        this.this$0 = trustedDeviceStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrustedDeviceStore6(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((TrustedDeviceStore6) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Brokeback brokeback = this.this$0.brokeback;
            String releaseChannel = BuildVariant.INSTANCE.toReleaseChannel();
            this.label = 1;
            if (brokeback.removeAllOtherDevices(releaseChannel, this) == coroutine_suspended) {
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
