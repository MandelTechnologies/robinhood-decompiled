package rosetta.nummus.service;

import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: NummusServiceRetrofit.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"rosetta/nummus/service/NummusServiceRetrofit$EligibilityPartialUpdateBodyTransformer", "Ljava/util/function/UnaryOperator;", "Lrosetta/nummus/service/EligibilityPatchRequest;", "<init>", "()V", "value", "apply", "(Lrosetta/nummus/service/EligibilityPatchRequest;)Lrosetta/nummus/service/EligibilityPatchRequest;", "rosetta.nummus.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: rosetta.nummus.service.NummusServiceRetrofit$EligibilityPartialUpdateBodyTransformer, reason: use source file name */
/* loaded from: classes25.dex */
public final class NummusServiceRetrofit3 implements UnaryOperator<EligibilityPatchRequest> {
    public static final NummusServiceRetrofit3 INSTANCE = new NummusServiceRetrofit3();

    private NummusServiceRetrofit3() {
    }

    @Override // java.util.function.Function
    public EligibilityPatchRequest apply(EligibilityPatchRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return EligibilityPatchRequest.copy$default(value, ByteString.EMPTY, null, null, 6, null);
    }
}
