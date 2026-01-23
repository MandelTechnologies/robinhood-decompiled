package com.robinhood.android.libdesignsystem.serverui.experimental.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* compiled from: RetrofitModule_ProvidePaginatedListPageRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/api/RetrofitModule_ProvidePaginatedListPageRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "retrofit", "Ljavax/inject/Provider;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RetrofitModule_ProvidePaginatedListPageRetrofitFactory implements Factory<Retrofit> {
    private final Provider<Retrofit> retrofit;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RetrofitModule_ProvidePaginatedListPageRetrofitFactory create(Provider<Retrofit> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Retrofit providePaginatedListPageRetrofit(Retrofit retrofit) {
        return INSTANCE.providePaginatedListPageRetrofit(retrofit);
    }

    public RetrofitModule_ProvidePaginatedListPageRetrofitFactory(Provider<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        Retrofit retrofit = this.retrofit.get();
        Intrinsics.checkNotNullExpressionValue(retrofit, "get(...)");
        return companion.providePaginatedListPageRetrofit(retrofit);
    }

    /* compiled from: RetrofitModule_ProvidePaginatedListPageRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/api/RetrofitModule_ProvidePaginatedListPageRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/libdesignsystem/serverui/experimental/api/RetrofitModule_ProvidePaginatedListPageRetrofitFactory;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "providePaginatedListPageRetrofit", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RetrofitModule_ProvidePaginatedListPageRetrofitFactory create(Provider<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            return new RetrofitModule_ProvidePaginatedListPageRetrofitFactory(retrofit);
        }

        @JvmStatic
        public final Retrofit providePaginatedListPageRetrofit(Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCheckNotNull = Preconditions.checkNotNull(RetrofitModule.INSTANCE.providePaginatedListPageRetrofit(retrofit), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
