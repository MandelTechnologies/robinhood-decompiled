package com.robinhood.android.serialization.moshi.p252di;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.JsonAdapterBinding;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoshiModule_ProvideJsonAdapterMapFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0002\b\u00050\u0001:\u0001\rB \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0002\b\u0005H\u0016R\u001f\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/serialization/moshi/di/MoshiModule_ProvideJsonAdapterMapFactory;", "Ldagger/internal/Factory;", "", "Ljava/lang/reflect/Type;", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "bindings", "Ljavax/inject/Provider;", "", "Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-serialization-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MoshiModule_ProvideJsonAdapterMapFactory implements Factory<Map<Type, JsonAdapter<?>>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Set<JsonAdapterBinding>> bindings;

    @JvmStatic
    public static final MoshiModule_ProvideJsonAdapterMapFactory create(Provider<Set<JsonAdapterBinding>> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Map<Type, JsonAdapter<?>> provideJsonAdapterMap(Set<JsonAdapterBinding> set) {
        return INSTANCE.provideJsonAdapterMap(set);
    }

    public MoshiModule_ProvideJsonAdapterMapFactory(Provider<Set<JsonAdapterBinding>> bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        this.bindings = bindings;
    }

    @Override // javax.inject.Provider
    public Map<Type, JsonAdapter<?>> get() {
        Companion companion = INSTANCE;
        Set<JsonAdapterBinding> set = this.bindings.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        return companion.provideJsonAdapterMap(set);
    }

    /* compiled from: MoshiModule_ProvideJsonAdapterMapFactory.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u0007H\u0007J0\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\f¢\u0006\u0002\b\n2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/serialization/moshi/di/MoshiModule_ProvideJsonAdapterMapFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/serialization/moshi/di/MoshiModule_ProvideJsonAdapterMapFactory;", "bindings", "Ljavax/inject/Provider;", "", "Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideJsonAdapterMap", "", "Ljava/lang/reflect/Type;", "Lcom/squareup/moshi/JsonAdapter;", "lib-serialization-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MoshiModule_ProvideJsonAdapterMapFactory create(Provider<Set<JsonAdapterBinding>> bindings) {
            Intrinsics.checkNotNullParameter(bindings, "bindings");
            return new MoshiModule_ProvideJsonAdapterMapFactory(bindings);
        }

        @JvmStatic
        public final Map<Type, JsonAdapter<?>> provideJsonAdapterMap(Set<JsonAdapterBinding> bindings) {
            Intrinsics.checkNotNullParameter(bindings, "bindings");
            Object objCheckNotNull = Preconditions.checkNotNull(MoshiModule.INSTANCE.provideJsonAdapterMap(bindings), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Map) objCheckNotNull;
        }
    }
}
