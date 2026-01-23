package microgram.android.inject;

import dagger.Lazy;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.internal.HostReceiveMessageHandler;
import microgram.android.internal.HostReceiveMessageHandler3;

/* compiled from: MicrogramRuntimeModule_ProvideReceiveMessageHandlerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideReceiveMessageHandlerFactory;", "Ldagger/internal/Factory;", "Lmicrogram/android/internal/HostReceiveMessageHandler;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramRuntimeModule_ProvideReceiveMessageHandlerFactory implements Factory<HostReceiveMessageHandler> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final HostReceiveMessageHandler provideReceiveMessageHandler(Lazy<HostReceiveMessageHandler3> lazy) {
        return INSTANCE.provideReceiveMessageHandler(lazy);
    }

    /* compiled from: MicrogramRuntimeModule_ProvideReceiveMessageHandlerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideReceiveMessageHandlerFactory$Companion;", "", "<init>", "()V", "Ldagger/Lazy;", "Lmicrogram/android/internal/RealHostReceiveMessageHandler;", "Lkotlin/jvm/JvmSuppressWildcards;", "lazy", "Lmicrogram/android/internal/HostReceiveMessageHandler;", "provideReceiveMessageHandler", "(Ldagger/Lazy;)Lmicrogram/android/internal/HostReceiveMessageHandler;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HostReceiveMessageHandler provideReceiveMessageHandler(Lazy<HostReceiveMessageHandler3> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            Object objCheckNotNull = Preconditions.checkNotNull(MicrogramRuntimeModule.INSTANCE.provideReceiveMessageHandler(lazy), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HostReceiveMessageHandler) objCheckNotNull;
        }
    }
}
