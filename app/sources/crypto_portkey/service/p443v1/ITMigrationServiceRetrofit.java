package crypto_portkey.service.p443v1;

import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ITMigrationServiceRetrofit.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"crypto_portkey/service/v1/ITMigrationServiceRetrofit$ProcessSettlementBodyTransformer", "Ljava/util/function/UnaryOperator;", "Lcrypto_portkey/service/v1/ProcessSettlementRequest;", "<init>", "()V", "value", "apply", "(Lcrypto_portkey/service/v1/ProcessSettlementRequest;)Lcrypto_portkey/service/v1/ProcessSettlementRequest;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: crypto_portkey.service.v1.ITMigrationServiceRetrofit$ProcessSettlementBodyTransformer, reason: use source file name */
/* loaded from: classes18.dex */
public final class ITMigrationServiceRetrofit implements UnaryOperator<ProcessSettlementRequest> {
    public static final ITMigrationServiceRetrofit INSTANCE = new ITMigrationServiceRetrofit();

    private ITMigrationServiceRetrofit() {
    }

    @Override // java.util.function.Function
    public ProcessSettlementRequest apply(ProcessSettlementRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return ProcessSettlementRequest.copy$default(value, "", null, null, false, null, 30, null);
    }
}
