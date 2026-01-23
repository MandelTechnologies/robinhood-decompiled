package microgram.android.extension;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.MessageHandler;
import microgram.android.service.ServiceLocator;

/* compiled from: ServiceExtension.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0002\t\nJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/extension/ServiceExtension;", "", "instance", "getInstance", "()Ljava/lang/Object;", "createMessageHandlers", "", "", "Lmicrogram/android/MessageHandler;", "Factory", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ServiceExtension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ServiceExtension.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lmicrogram/android/extension/ServiceExtension$Factory;", "", "createServiceExtension", "Lmicrogram/android/extension/ServiceExtension;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "serviceLocator", "Lmicrogram/android/service/ServiceLocator;", "json", "Lkotlinx/serialization/json/Json;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory {
        ServiceExtension createServiceExtension(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, ServiceLocator serviceLocator, Json json);
    }

    Map<String, MessageHandler> createMessageHandlers();

    Object getInstance();

    /* compiled from: ServiceExtension.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/extension/ServiceExtension$Companion;", "", "<init>", "()V", "wrapping", "Lmicrogram/android/extension/ServiceExtension;", "get", "Lkotlin/Function0;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ServiceExtension wrapping(final Function0<? extends ServiceExtension> get) {
            Intrinsics.checkNotNullParameter(get, "get");
            return new ServiceExtension(get) { // from class: microgram.android.extension.ServiceExtension$Companion$wrapping$1

                /* renamed from: delegate$delegate, reason: from kotlin metadata */
                private final Lazy delegate;

                {
                    this.delegate = LazyKt.lazy(get);
                }

                private final ServiceExtension getDelegate() {
                    return (ServiceExtension) this.delegate.getValue();
                }

                @Override // microgram.android.extension.ServiceExtension
                public Object getInstance() {
                    return getDelegate().getInstance();
                }

                @Override // microgram.android.extension.ServiceExtension
                public Map<String, MessageHandler> createMessageHandlers() {
                    return getDelegate().createMessageHandlers();
                }
            };
        }
    }
}
