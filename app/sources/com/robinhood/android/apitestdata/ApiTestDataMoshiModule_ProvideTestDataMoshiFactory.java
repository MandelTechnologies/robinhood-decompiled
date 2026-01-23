package com.robinhood.android.apitestdata;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiTestDataMoshiModule_ProvideTestDataMoshiFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/apitestdata/ApiTestDataMoshiModule_ProvideTestDataMoshiFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Ljavax/inject/Provider;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-api-fixtures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ApiTestDataMoshiModule_ProvideTestDataMoshiFactory implements Factory<LazyMoshi> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<LazyMoshi> moshi;

    @JvmStatic
    public static final ApiTestDataMoshiModule_ProvideTestDataMoshiFactory create(Provider<LazyMoshi> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final LazyMoshi provideTestDataMoshi(LazyMoshi lazyMoshi) {
        return INSTANCE.provideTestDataMoshi(lazyMoshi);
    }

    public ApiTestDataMoshiModule_ProvideTestDataMoshiFactory(Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public LazyMoshi get() {
        Companion companion = INSTANCE;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.provideTestDataMoshi(lazyMoshi);
    }

    /* compiled from: ApiTestDataMoshiModule_ProvideTestDataMoshiFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/apitestdata/ApiTestDataMoshiModule_ProvideTestDataMoshiFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/apitestdata/ApiTestDataMoshiModule_ProvideTestDataMoshiFactory;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideTestDataMoshi", "lib-api-fixtures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ApiTestDataMoshiModule_ProvideTestDataMoshiFactory create(Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new ApiTestDataMoshiModule_ProvideTestDataMoshiFactory(moshi);
        }

        @JvmStatic
        public final LazyMoshi provideTestDataMoshi(LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Object objCheckNotNull = Preconditions.checkNotNull(ApiTestDataMoshiModule.INSTANCE.provideTestDataMoshi(moshi), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (LazyMoshi) objCheckNotNull;
        }
    }
}
