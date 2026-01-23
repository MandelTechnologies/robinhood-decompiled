package options_product.service;

import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiscoveryRetrofit.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"options_product/service/DiscoveryRetrofit$UpdateSeenUserContextBodyTransformer", "Ljava/util/function/UnaryOperator;", "Loptions_product/service/SeenUserContextRequest;", "<init>", "()V", "value", "apply", "(Loptions_product/service/SeenUserContextRequest;)Loptions_product/service/SeenUserContextRequest;", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: options_product.service.DiscoveryRetrofit$UpdateSeenUserContextBodyTransformer, reason: use source file name */
/* loaded from: classes25.dex */
public final class DiscoveryRetrofit3 implements UnaryOperator<SeenUserContextRequest> {
    public static final DiscoveryRetrofit3 INSTANCE = new DiscoveryRetrofit3();

    private DiscoveryRetrofit3() {
    }

    @Override // java.util.function.Function
    public SeenUserContextRequest apply(SeenUserContextRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return SeenUserContextRequest.copy$default(value, null, "", null, 5, null);
    }
}
