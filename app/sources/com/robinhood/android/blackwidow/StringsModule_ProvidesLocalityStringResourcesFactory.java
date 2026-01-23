package com.robinhood.android.blackwidow;

import com.robinhood.android.blackwidow.LocalityStringResources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringsModule_ProvidesLocalityStringResourcesFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/StringsModule_ProvidesLocalityStringResourcesFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/blackwidow/LocalityStringResources;", "impl", "Ljavax/inject/Provider;", "Lcom/robinhood/android/blackwidow/LocalityStringResources$Impl;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class StringsModule_ProvidesLocalityStringResourcesFactory implements Factory<LocalityStringResources> {
    private final Provider<LocalityStringResources.Impl> impl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final StringsModule_ProvidesLocalityStringResourcesFactory create(Provider<LocalityStringResources.Impl> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final LocalityStringResources providesLocalityStringResources(LocalityStringResources.Impl impl) {
        return INSTANCE.providesLocalityStringResources(impl);
    }

    public StringsModule_ProvidesLocalityStringResourcesFactory(Provider<LocalityStringResources.Impl> impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @Override // javax.inject.Provider
    public LocalityStringResources get() {
        Companion companion = INSTANCE;
        LocalityStringResources.Impl impl = this.impl.get();
        Intrinsics.checkNotNullExpressionValue(impl, "get(...)");
        return companion.providesLocalityStringResources(impl);
    }

    /* compiled from: StringsModule_ProvidesLocalityStringResourcesFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/StringsModule_ProvidesLocalityStringResourcesFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/blackwidow/StringsModule_ProvidesLocalityStringResourcesFactory;", "impl", "Ljavax/inject/Provider;", "Lcom/robinhood/android/blackwidow/LocalityStringResources$Impl;", "providesLocalityStringResources", "Lcom/robinhood/android/blackwidow/LocalityStringResources;", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StringsModule_ProvidesLocalityStringResourcesFactory create(Provider<LocalityStringResources.Impl> impl) {
            Intrinsics.checkNotNullParameter(impl, "impl");
            return new StringsModule_ProvidesLocalityStringResourcesFactory(impl);
        }

        @JvmStatic
        public final LocalityStringResources providesLocalityStringResources(LocalityStringResources.Impl impl) {
            Intrinsics.checkNotNullParameter(impl, "impl");
            Object objCheckNotNull = Preconditions.checkNotNull(StringsModule.INSTANCE.providesLocalityStringResources(impl), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (LocalityStringResources) objCheckNotNull;
        }
    }
}
