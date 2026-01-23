package bonfire.proto.idl.advisor_marketplace.p029v1;

import dagger.Lazy;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisorMarketplaceServiceModule_ProvideServiceFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceServiceModule_ProvideServiceFactory;", "Ldagger/internal/Factory;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceService;", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorMarketplaceServiceModule_ProvideServiceFactory implements Factory<AdvisorMarketplaceService> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final AdvisorMarketplaceService provideService(Lazy<RestAdvisorMarketplaceService> lazy) {
        return INSTANCE.provideService(lazy);
    }

    /* compiled from: AdvisorMarketplaceServiceModule_ProvideServiceFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceServiceModule_ProvideServiceFactory$Companion;", "", "<init>", "()V", "Ldagger/Lazy;", "Lbonfire/proto/idl/advisor_marketplace/v1/RestAdvisorMarketplaceService;", "Lkotlin/jvm/JvmSuppressWildcards;", "rest", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceService;", "provideService", "(Ldagger/Lazy;)Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMarketplaceService;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisorMarketplaceService provideService(Lazy<RestAdvisorMarketplaceService> rest) {
            Intrinsics.checkNotNullParameter(rest, "rest");
            Object objCheckNotNull = Preconditions.checkNotNull(AdvisorMarketplaceServiceModule.INSTANCE.provideService(rest), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (AdvisorMarketplaceService) objCheckNotNull;
        }
    }
}
