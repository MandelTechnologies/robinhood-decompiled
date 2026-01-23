package microgram.android.haptic;

import com.robinhood.microgram.haptic.HapticManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.extension.ServiceExtension;

/* compiled from: RealMicrogramHapticManager_Provisions_ProvideServiceExtensionFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/haptic/RealMicrogramHapticManager_Provisions_ProvideServiceExtensionFactory;", "Ldagger/internal/Factory;", "Lmicrogram/android/extension/ServiceExtension;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.haptic.RealMicrogramHapticManager_Provisions_ProvideServiceExtensionFactory */
/* loaded from: classes14.dex */
public final class C46244x296ea73a implements Factory<ServiceExtension> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final ServiceExtension provideServiceExtension(CoroutineScope coroutineScope, HostMessageDispatcher hostMessageDispatcher, Json json, HapticManager hapticManager) {
        return INSTANCE.provideServiceExtension(coroutineScope, hostMessageDispatcher, json, hapticManager);
    }

    /* compiled from: RealMicrogramHapticManager_Provisions_ProvideServiceExtensionFactory.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/android/haptic/RealMicrogramHapticManager_Provisions_ProvideServiceExtensionFactory$Companion;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lmicrogram/android/HostMessageDispatcher;", "messageDispatcher", "Lkotlinx/serialization/json/Json;", "json", "Lcom/robinhood/microgram/haptic/MicrogramHapticManager;", "service", "Lmicrogram/android/extension/ServiceExtension;", "provideServiceExtension", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/HostMessageDispatcher;Lkotlinx/serialization/json/Json;Lcom/robinhood/microgram/haptic/MicrogramHapticManager;)Lmicrogram/android/extension/ServiceExtension;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.haptic.RealMicrogramHapticManager_Provisions_ProvideServiceExtensionFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ServiceExtension provideServiceExtension(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, Json json, HapticManager service) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(service, "service");
            Object objCheckNotNull = Preconditions.checkNotNull(RealMicrogramHapticManager_Hammer.INSTANCE.provideServiceExtension(coroutineScope, messageDispatcher, json, service), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ServiceExtension) objCheckNotNull;
        }
    }
}
