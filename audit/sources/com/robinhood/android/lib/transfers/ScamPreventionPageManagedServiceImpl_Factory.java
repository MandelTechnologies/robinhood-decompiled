package com.robinhood.android.lib.transfers;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScamPreventionPageManagedServiceImpl_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/ScamPreventionPageManagedServiceImpl_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/transfers/ScamPreventionPageManagedServiceImpl;", "scamPreventionEventBus", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/transfers/ScamPreventionEventBus;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ScamPreventionPageManagedServiceImpl_Factory implements Factory<ScamPreventionPageManagedServiceImpl> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ScamPreventionEventBus> scamPreventionEventBus;

    @JvmStatic
    public static final ScamPreventionPageManagedServiceImpl_Factory create(Provider<ScamPreventionEventBus> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final ScamPreventionPageManagedServiceImpl newInstance(ScamPreventionEventBus scamPreventionEventBus) {
        return INSTANCE.newInstance(scamPreventionEventBus);
    }

    public ScamPreventionPageManagedServiceImpl_Factory(Provider<ScamPreventionEventBus> scamPreventionEventBus) {
        Intrinsics.checkNotNullParameter(scamPreventionEventBus, "scamPreventionEventBus");
        this.scamPreventionEventBus = scamPreventionEventBus;
    }

    @Override // javax.inject.Provider
    public ScamPreventionPageManagedServiceImpl get() {
        Companion companion = INSTANCE;
        ScamPreventionEventBus scamPreventionEventBus = this.scamPreventionEventBus.get();
        Intrinsics.checkNotNullExpressionValue(scamPreventionEventBus, "get(...)");
        return companion.newInstance(scamPreventionEventBus);
    }

    /* compiled from: ScamPreventionPageManagedServiceImpl_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/ScamPreventionPageManagedServiceImpl_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/transfers/ScamPreventionPageManagedServiceImpl_Factory;", "scamPreventionEventBus", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/transfers/ScamPreventionEventBus;", "newInstance", "Lcom/robinhood/android/lib/transfers/ScamPreventionPageManagedServiceImpl;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ScamPreventionPageManagedServiceImpl_Factory create(Provider<ScamPreventionEventBus> scamPreventionEventBus) {
            Intrinsics.checkNotNullParameter(scamPreventionEventBus, "scamPreventionEventBus");
            return new ScamPreventionPageManagedServiceImpl_Factory(scamPreventionEventBus);
        }

        @JvmStatic
        public final ScamPreventionPageManagedServiceImpl newInstance(ScamPreventionEventBus scamPreventionEventBus) {
            Intrinsics.checkNotNullParameter(scamPreventionEventBus, "scamPreventionEventBus");
            return new ScamPreventionPageManagedServiceImpl(scamPreventionEventBus);
        }
    }
}
