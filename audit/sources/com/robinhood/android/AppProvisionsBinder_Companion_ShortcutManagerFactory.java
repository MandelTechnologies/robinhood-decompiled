package com.robinhood.android;

import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.util.RhShortcutManagerImpl;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppProvisionsBinder_Companion_ShortcutManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001a\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/AppProvisionsBinder_Companion_ShortcutManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/util/RhShortcutManager;", "delegate", "Ljavax/inject/Provider;", "Lcom/robinhood/android/util/RhShortcutManagerImpl;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AppProvisionsBinder_Companion_ShortcutManagerFactory implements Factory<RhShortcutManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RhShortcutManagerImpl> delegate;

    @JvmStatic
    public static final AppProvisionsBinder_Companion_ShortcutManagerFactory create(Provider<RhShortcutManagerImpl> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final RhShortcutManager shortcutManager(Lazy<RhShortcutManagerImpl> lazy) {
        return INSTANCE.shortcutManager(lazy);
    }

    public AppProvisionsBinder_Companion_ShortcutManagerFactory(Provider<RhShortcutManagerImpl> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // javax.inject.Provider
    public RhShortcutManager get() {
        Companion companion = INSTANCE;
        Lazy<RhShortcutManagerImpl> lazy = DoubleCheck.lazy(this.delegate);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.shortcutManager(lazy);
    }

    /* compiled from: AppProvisionsBinder_Companion_ShortcutManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007H\u0007J\u001b\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/AppProvisionsBinder_Companion_ShortcutManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/AppProvisionsBinder_Companion_ShortcutManagerFactory;", "delegate", "Ljavax/inject/Provider;", "Lcom/robinhood/android/util/RhShortcutManagerImpl;", "Lkotlin/jvm/JvmSuppressWildcards;", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "Ldagger/Lazy;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AppProvisionsBinder_Companion_ShortcutManagerFactory create(Provider<RhShortcutManagerImpl> delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return new AppProvisionsBinder_Companion_ShortcutManagerFactory(delegate);
        }

        @JvmStatic
        public final RhShortcutManager shortcutManager(Lazy<RhShortcutManagerImpl> delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Object objCheckNotNull = Preconditions.checkNotNull(AppProvisionsBinder.INSTANCE.shortcutManager(delegate), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (RhShortcutManager) objCheckNotNull;
        }
    }
}
