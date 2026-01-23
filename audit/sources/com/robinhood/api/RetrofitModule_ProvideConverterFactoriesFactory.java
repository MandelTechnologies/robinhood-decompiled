package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;

/* compiled from: RetrofitModule_ProvideConverterFactoriesFactory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\rB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule_ProvideConverterFactoriesFactory;", "Ldagger/internal/Factory;", "", "Lretrofit2/Converter$Factory;", "Lkotlin/jvm/JvmSuppressWildcards;", "module", "Lcom/robinhood/api/RetrofitModule;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/api/RetrofitModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RetrofitModule_ProvideConverterFactoriesFactory implements Factory<List<Converter.Factory>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RetrofitModule module;
    private final Provider<LazyMoshi> moshi;

    @JvmStatic
    public static final RetrofitModule_ProvideConverterFactoriesFactory create(RetrofitModule retrofitModule, Provider<LazyMoshi> provider) {
        return INSTANCE.create(retrofitModule, provider);
    }

    @JvmStatic
    public static final List<Converter.Factory> provideConverterFactories(RetrofitModule retrofitModule, LazyMoshi lazyMoshi) {
        return INSTANCE.provideConverterFactories(retrofitModule, lazyMoshi);
    }

    public RetrofitModule_ProvideConverterFactoriesFactory(RetrofitModule module, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.module = module;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public List<Converter.Factory> get() {
        Companion companion = INSTANCE;
        RetrofitModule retrofitModule = this.module;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.provideConverterFactories(retrofitModule, lazyMoshi);
    }

    /* compiled from: RetrofitModule_ProvideConverterFactoriesFactory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J#\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule_ProvideConverterFactoriesFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/RetrofitModule_ProvideConverterFactoriesFactory;", "module", "Lcom/robinhood/api/RetrofitModule;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideConverterFactories", "", "Lretrofit2/Converter$Factory;", "Lkotlin/jvm/JvmSuppressWildcards;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RetrofitModule_ProvideConverterFactoriesFactory create(RetrofitModule module, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new RetrofitModule_ProvideConverterFactoriesFactory(module, moshi);
        }

        @JvmStatic
        public final List<Converter.Factory> provideConverterFactories(RetrofitModule module, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideConverterFactories(moshi), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (List) objCheckNotNull;
        }
    }
}
