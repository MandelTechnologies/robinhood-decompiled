package com.robinhood.android.microgramsdui.control;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.internal.HostCompatibilityFlags;

/* compiled from: LegacyUiController_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/LegacyUiController_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/microgramsdui/control/LegacyUiController;", "json", "Ljavax/inject/Provider;", "Lkotlinx/serialization/json/Json;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "hostCompatibilityFlags", "Lmicrogram/android/internal/HostCompatibilityFlags;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class LegacyUiController_Factory implements Factory<LegacyUiController> {
    private final Provider<HostCompatibilityFlags> hostCompatibilityFlags;
    private final Provider<Json> json;
    private final Provider<HostMessageDispatcher> messageDispatcher;
    private final Provider<LazyMoshi> moshi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final LegacyUiController_Factory create(Provider<Json> provider, Provider<LazyMoshi> provider2, Provider<HostMessageDispatcher> provider3, Provider<HostCompatibilityFlags> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final LegacyUiController newInstance(Json json, LazyMoshi lazyMoshi, HostMessageDispatcher hostMessageDispatcher, HostCompatibilityFlags hostCompatibilityFlags) {
        return INSTANCE.newInstance(json, lazyMoshi, hostMessageDispatcher, hostCompatibilityFlags);
    }

    public LegacyUiController_Factory(Provider<Json> json, Provider<LazyMoshi> moshi, Provider<HostMessageDispatcher> messageDispatcher, Provider<HostCompatibilityFlags> hostCompatibilityFlags) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(hostCompatibilityFlags, "hostCompatibilityFlags");
        this.json = json;
        this.moshi = moshi;
        this.messageDispatcher = messageDispatcher;
        this.hostCompatibilityFlags = hostCompatibilityFlags;
    }

    @Override // javax.inject.Provider
    public LegacyUiController get() {
        Companion companion = INSTANCE;
        Json json = this.json.get();
        Intrinsics.checkNotNullExpressionValue(json, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        HostMessageDispatcher hostMessageDispatcher = this.messageDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(hostMessageDispatcher, "get(...)");
        HostCompatibilityFlags hostCompatibilityFlags = this.hostCompatibilityFlags.get();
        Intrinsics.checkNotNullExpressionValue(hostCompatibilityFlags, "get(...)");
        return companion.newInstance(json, lazyMoshi, hostMessageDispatcher, hostCompatibilityFlags);
    }

    /* compiled from: LegacyUiController_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/LegacyUiController_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/microgramsdui/control/LegacyUiController_Factory;", "json", "Ljavax/inject/Provider;", "Lkotlinx/serialization/json/Json;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "hostCompatibilityFlags", "Lmicrogram/android/internal/HostCompatibilityFlags;", "newInstance", "Lcom/robinhood/android/microgramsdui/control/LegacyUiController;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LegacyUiController_Factory create(Provider<Json> json, Provider<LazyMoshi> moshi, Provider<HostMessageDispatcher> messageDispatcher, Provider<HostCompatibilityFlags> hostCompatibilityFlags) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
            Intrinsics.checkNotNullParameter(hostCompatibilityFlags, "hostCompatibilityFlags");
            return new LegacyUiController_Factory(json, moshi, messageDispatcher, hostCompatibilityFlags);
        }

        @JvmStatic
        public final LegacyUiController newInstance(Json json, LazyMoshi moshi, HostMessageDispatcher messageDispatcher, HostCompatibilityFlags hostCompatibilityFlags) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
            Intrinsics.checkNotNullParameter(hostCompatibilityFlags, "hostCompatibilityFlags");
            return new LegacyUiController(json, moshi, messageDispatcher, hostCompatibilityFlags);
        }
    }
}
