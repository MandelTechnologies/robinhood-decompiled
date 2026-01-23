package com.robinhood.shared.security.store.trusteddevice;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiTrustedDevice;
import com.robinhood.models.p320db.TrustedDevice;
import com.robinhood.models.p320db.TrustedDevice2;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.utils.buildconfig.BuildVariant;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TrustedDeviceStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/TrustedDevice;", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore$reportTrustedDeviceEndpoint$1", m3645f = "TrustedDeviceStore.kt", m3646l = {34}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore$reportTrustedDeviceEndpoint$1, reason: use source file name */
/* loaded from: classes6.dex */
final class TrustedDeviceStore8 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super TrustedDevice>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TrustedDeviceStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrustedDeviceStore8(TrustedDeviceStore trustedDeviceStore, Continuation<? super TrustedDeviceStore8> continuation) {
        super(2, continuation);
        this.this$0 = trustedDeviceStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrustedDeviceStore8 trustedDeviceStore8 = new TrustedDeviceStore8(this.this$0, continuation);
        trustedDeviceStore8.L$0 = obj;
        return trustedDeviceStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super TrustedDevice> continuation) {
        return ((TrustedDeviceStore8) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            Brokeback brokeback = this.this$0.brokeback;
            String releaseChannel = BuildVariant.INSTANCE.toReleaseChannel();
            this.label = 1;
            obj = brokeback.reportTrustedDevice(uuid, releaseChannel, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return TrustedDevice2.toDbModel((ApiTrustedDevice) obj);
    }
}
