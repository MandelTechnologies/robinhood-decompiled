package com.robinhood.p2p.common;

import android.app.Application;
import coil.ImageLoader;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* compiled from: ProfileAvatarModule_ProvideImageLoaderFactory.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB(\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/p2p/common/ProfileAvatarModule_ProvideImageLoaderFactory;", "Ldagger/internal/Factory;", "Lcoil/ImageLoader;", "application", "Ljavax/inject/Provider;", "Landroid/app/Application;", "okHttpClient", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ProfileAvatarModule_ProvideImageLoaderFactory implements Factory<ImageLoader> {
    private final Provider<Application> application;
    private final Provider<OkHttpClient> okHttpClient;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ProfileAvatarModule_ProvideImageLoaderFactory create(Provider<Application> provider, Provider<OkHttpClient> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final ImageLoader provideImageLoader(Application application, Lazy<OkHttpClient> lazy) {
        return INSTANCE.provideImageLoader(application, lazy);
    }

    public ProfileAvatarModule_ProvideImageLoaderFactory(Provider<Application> application, Provider<OkHttpClient> okHttpClient) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.application = application;
        this.okHttpClient = okHttpClient;
    }

    @Override // javax.inject.Provider
    public ImageLoader get() {
        Companion companion = INSTANCE;
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        Lazy<OkHttpClient> lazy = DoubleCheck.lazy(this.okHttpClient);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideImageLoader(application, lazy);
    }

    /* compiled from: ProfileAvatarModule_ProvideImageLoaderFactory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0007H\u0007J#\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u000eH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/p2p/common/ProfileAvatarModule_ProvideImageLoaderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/p2p/common/ProfileAvatarModule_ProvideImageLoaderFactory;", "application", "Ljavax/inject/Provider;", "Landroid/app/Application;", "okHttpClient", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideImageLoader", "Lcoil/ImageLoader;", "Ldagger/Lazy;", "lib-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProfileAvatarModule_ProvideImageLoaderFactory create(Provider<Application> application, Provider<OkHttpClient> okHttpClient) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return new ProfileAvatarModule_ProvideImageLoaderFactory(application, okHttpClient);
        }

        @JvmStatic
        public final ImageLoader provideImageLoader(Application application, Lazy<OkHttpClient> okHttpClient) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Object objCheckNotNull = Preconditions.checkNotNull(ProfileAvatarModule.INSTANCE.provideImageLoader(application, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ImageLoader) objCheckNotNull;
        }
    }
}
