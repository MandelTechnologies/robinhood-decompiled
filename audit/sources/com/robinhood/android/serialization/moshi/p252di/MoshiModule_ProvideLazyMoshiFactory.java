package com.robinhood.android.serialization.moshi.p252di;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.binding.ContentTypeBindingRegistry;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.wire.ProtoAdapter;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoshiModule_ProvideLazyMoshiFactory.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u008d\u0001\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004\u0012!\u0010\u0007\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\b¢\u0006\u0002\b\u00060\u0004\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u00060\u0004\u00125\u0010\u000e\u001a1\u0012-\u0012+\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010¢\u0006\u0002\b\u00060\bj\u0007`\u0012¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\b¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R=\u0010\u000e\u001a1\u0012-\u0012+\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010¢\u0006\u0002\b\u00060\bj\u0007`\u0012¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/serialization/moshi/di/MoshiModule_ProvideLazyMoshiFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "contentTypeBindingRegistry", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "Lkotlin/jvm/JvmSuppressWildcards;", "jsonAdapters", "", "Ljava/lang/reflect/Type;", "Lcom/squareup/moshi/JsonAdapter;", "jsonAdapterFactories", "", "Lcom/squareup/moshi/JsonAdapter$Factory;", "protoAdapterSupplierMap", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-serialization-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MoshiModule_ProvideLazyMoshiFactory implements Factory<LazyMoshi> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ContentTypeBindingRegistry> contentTypeBindingRegistry;
    private final Provider<Set<JsonAdapter.Factory>> jsonAdapterFactories;
    private final Provider<Map<Type, JsonAdapter<?>>> jsonAdapters;
    private final Provider<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap;

    @JvmStatic
    public static final MoshiModule_ProvideLazyMoshiFactory create(Provider<ContentTypeBindingRegistry> provider, Provider<Map<Type, JsonAdapter<?>>> provider2, Provider<Set<JsonAdapter.Factory>> provider3, Provider<Map<String, Function0<ProtoAdapter<?>>>> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final LazyMoshi provideLazyMoshi(Lazy<ContentTypeBindingRegistry> lazy, Lazy<Map<Type, JsonAdapter<?>>> lazy2, Lazy<Set<JsonAdapter.Factory>> lazy3, Lazy<Map<String, Function0<ProtoAdapter<?>>>> lazy4) {
        return INSTANCE.provideLazyMoshi(lazy, lazy2, lazy3, lazy4);
    }

    public MoshiModule_ProvideLazyMoshiFactory(Provider<ContentTypeBindingRegistry> contentTypeBindingRegistry, Provider<Map<Type, JsonAdapter<?>>> jsonAdapters, Provider<Set<JsonAdapter.Factory>> jsonAdapterFactories, Provider<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap) {
        Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
        Intrinsics.checkNotNullParameter(jsonAdapters, "jsonAdapters");
        Intrinsics.checkNotNullParameter(jsonAdapterFactories, "jsonAdapterFactories");
        Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
        this.contentTypeBindingRegistry = contentTypeBindingRegistry;
        this.jsonAdapters = jsonAdapters;
        this.jsonAdapterFactories = jsonAdapterFactories;
        this.protoAdapterSupplierMap = protoAdapterSupplierMap;
    }

    @Override // javax.inject.Provider
    public LazyMoshi get() {
        Companion companion = INSTANCE;
        Lazy<ContentTypeBindingRegistry> lazy = DoubleCheck.lazy(this.contentTypeBindingRegistry);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Lazy<Map<Type, JsonAdapter<?>>> lazy2 = DoubleCheck.lazy(this.jsonAdapters);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        Lazy<Set<JsonAdapter.Factory>> lazy3 = DoubleCheck.lazy(this.jsonAdapterFactories);
        Intrinsics.checkNotNullExpressionValue(lazy3, "lazy(...)");
        Lazy<Map<String, Function0<ProtoAdapter<?>>>> lazy4 = DoubleCheck.lazy(this.protoAdapterSupplierMap);
        Intrinsics.checkNotNullExpressionValue(lazy4, "lazy(...)");
        return companion.provideLazyMoshi(lazy, lazy2, lazy3, lazy4);
    }

    /* compiled from: MoshiModule_ProvideLazyMoshiFactory.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008e\u0001\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00072!\u0010\n\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000b¢\u0006\u0002\b\t0\u00072\u0017\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\t0\u000725\u0010\u0011\u001a1\u0012-\u0012+\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013¢\u0006\u0002\b\t0\u000bj\u0007`\u0015¢\u0006\u0002\b\t¢\u0006\u0002\b\t0\u0007H\u0007J\u008e\u0001\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00182!\u0010\n\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000b¢\u0006\u0002\b\t0\u00182\u0017\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\t0\u001825\u0010\u0011\u001a1\u0012-\u0012+\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013¢\u0006\u0002\b\t0\u000bj\u0007`\u0015¢\u0006\u0002\b\t¢\u0006\u0002\b\t0\u0018H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/serialization/moshi/di/MoshiModule_ProvideLazyMoshiFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/serialization/moshi/di/MoshiModule_ProvideLazyMoshiFactory;", "contentTypeBindingRegistry", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "Lkotlin/jvm/JvmSuppressWildcards;", "jsonAdapters", "", "Ljava/lang/reflect/Type;", "Lcom/squareup/moshi/JsonAdapter;", "jsonAdapterFactories", "", "Lcom/squareup/moshi/JsonAdapter$Factory;", "protoAdapterSupplierMap", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "provideLazyMoshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "Ldagger/Lazy;", "lib-serialization-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MoshiModule_ProvideLazyMoshiFactory create(Provider<ContentTypeBindingRegistry> contentTypeBindingRegistry, Provider<Map<Type, JsonAdapter<?>>> jsonAdapters, Provider<Set<JsonAdapter.Factory>> jsonAdapterFactories, Provider<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap) {
            Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
            Intrinsics.checkNotNullParameter(jsonAdapters, "jsonAdapters");
            Intrinsics.checkNotNullParameter(jsonAdapterFactories, "jsonAdapterFactories");
            Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
            return new MoshiModule_ProvideLazyMoshiFactory(contentTypeBindingRegistry, jsonAdapters, jsonAdapterFactories, protoAdapterSupplierMap);
        }

        @JvmStatic
        public final LazyMoshi provideLazyMoshi(Lazy<ContentTypeBindingRegistry> contentTypeBindingRegistry, Lazy<Map<Type, JsonAdapter<?>>> jsonAdapters, Lazy<Set<JsonAdapter.Factory>> jsonAdapterFactories, Lazy<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap) {
            Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
            Intrinsics.checkNotNullParameter(jsonAdapters, "jsonAdapters");
            Intrinsics.checkNotNullParameter(jsonAdapterFactories, "jsonAdapterFactories");
            Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
            Object objCheckNotNull = Preconditions.checkNotNull(MoshiModule.INSTANCE.provideLazyMoshi(contentTypeBindingRegistry, jsonAdapters, jsonAdapterFactories, protoAdapterSupplierMap), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (LazyMoshi) objCheckNotNull;
        }
    }
}
