package com.robinhood.shared.navigation.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.ResolverNotFoundHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReleaseNavigationModule_ProvideResolverNotFoundHandlerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/navigation/provisions/ReleaseNavigationModule_ProvideResolverNotFoundHandlerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/navigation/ResolverNotFoundHandler;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideResolverNotFoundHandler", "lib-navigation-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ReleaseNavigationModule_ProvideResolverNotFoundHandlerFactory implements Factory<ResolverNotFoundHandler> {
    public static final int $stable = 0;
    public static final ReleaseNavigationModule_ProvideResolverNotFoundHandlerFactory INSTANCE = new ReleaseNavigationModule_ProvideResolverNotFoundHandlerFactory();

    private ReleaseNavigationModule_ProvideResolverNotFoundHandlerFactory() {
    }

    @Override // javax.inject.Provider
    public ResolverNotFoundHandler get() {
        return provideResolverNotFoundHandler();
    }

    @JvmStatic
    public static final ReleaseNavigationModule_ProvideResolverNotFoundHandlerFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ResolverNotFoundHandler provideResolverNotFoundHandler() {
        Object objCheckNotNull = Preconditions.checkNotNull(ReleaseNavigationModule.INSTANCE.provideResolverNotFoundHandler(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (ResolverNotFoundHandler) objCheckNotNull;
    }
}
