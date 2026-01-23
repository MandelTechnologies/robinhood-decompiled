package microgram.android.service;

import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServiceLocator.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H&¢\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/service/ServiceLocator;", "", "getClient", "T", "contractInterface", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getHostImplementation", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ServiceLocator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    <T> T getClient(Class<T> contractInterface);

    <T> T getHostImplementation(Class<T> contractInterface);

    /* compiled from: ServiceLocator.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/service/ServiceLocator$Companion;", "", "<init>", "()V", "Ldagger/Lazy;", "Lmicrogram/android/service/ServiceLocator;", "lazy", "wrapping", "(Ldagger/Lazy;)Lmicrogram/android/service/ServiceLocator;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ServiceLocator wrapping(final Lazy<? extends ServiceLocator> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return new ServiceLocator() { // from class: microgram.android.service.ServiceLocator$Companion$wrapping$1
                @Override // microgram.android.service.ServiceLocator
                public <T> T getClient(Class<T> contractInterface) {
                    Intrinsics.checkNotNullParameter(contractInterface, "contractInterface");
                    return (T) lazy.get().getClient(contractInterface);
                }

                @Override // microgram.android.service.ServiceLocator
                public <T> T getHostImplementation(Class<T> contractInterface) {
                    Intrinsics.checkNotNullParameter(contractInterface, "contractInterface");
                    return (T) lazy.get().getHostImplementation(contractInterface);
                }
            };
        }
    }
}
