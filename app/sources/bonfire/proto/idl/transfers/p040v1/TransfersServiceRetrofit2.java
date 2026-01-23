package bonfire.proto.idl.transfers.p040v1;

import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransfersServiceRetrofit.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"bonfire/proto/idl/transfers/v1/TransfersServiceRetrofit$RhsRtpFirmTransferActionBodyTransformer", "Ljava/util/function/UnaryOperator;", "Lbonfire/proto/idl/transfers/v1/RhsRtpFirmTransferActionRequest;", "<init>", "()V", "value", "apply", "(Lbonfire/proto/idl/transfers/v1/RhsRtpFirmTransferActionRequest;)Lbonfire/proto/idl/transfers/v1/RhsRtpFirmTransferActionRequest;", "bonfire.transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: bonfire.proto.idl.transfers.v1.TransfersServiceRetrofit$RhsRtpFirmTransferActionBodyTransformer, reason: use source file name */
/* loaded from: classes16.dex */
public final class TransfersServiceRetrofit2 implements UnaryOperator<RhsRtpFirmTransferActionRequest> {
    public static final TransfersServiceRetrofit2 INSTANCE = new TransfersServiceRetrofit2();

    private TransfersServiceRetrofit2() {
    }

    @Override // java.util.function.Function
    public RhsRtpFirmTransferActionRequest apply(RhsRtpFirmTransferActionRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return RhsRtpFirmTransferActionRequest.copy$default(value, "", null, null, null, 14, null);
    }
}
