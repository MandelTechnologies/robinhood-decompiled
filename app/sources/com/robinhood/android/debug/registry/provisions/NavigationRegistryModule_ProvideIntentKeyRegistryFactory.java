package com.robinhood.android.debug.registry.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.shared.debug.lib.registry.config.Configuration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: NavigationRegistryModule_ProvideIntentKeyRegistryFactory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002-\u0012)\u0012'\u0012\u001e\u0012\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00030\u0002¢\u0006\u0002\b\b0\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000b\u001a'\u0012\u001e\u0012\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00030\u0002¢\u0006\u0002\b\bH\u0016J\b\u0010\f\u001a\u00020\u0000H\u0007J-\u0010\r\u001a'\u0012\u001e\u0012\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00030\u0002¢\u0006\u0002\b\bH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/debug/registry/provisions/NavigationRegistryModule_ProvideIntentKeyRegistryFactory;", "Ldagger/internal/Factory;", "", "Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration$Intent;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideIntentKeyRegistry", "lib-debug-drawer-registry-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class NavigationRegistryModule_ProvideIntentKeyRegistryFactory implements Factory<Set<Tuples2<KClass<? extends IntentKey>, List<Configuration.Intent>>>> {
    public static final NavigationRegistryModule_ProvideIntentKeyRegistryFactory INSTANCE = new NavigationRegistryModule_ProvideIntentKeyRegistryFactory();

    private NavigationRegistryModule_ProvideIntentKeyRegistryFactory() {
    }

    @Override // javax.inject.Provider
    public Set<Tuples2<KClass<? extends IntentKey>, List<Configuration.Intent>>> get() {
        return provideIntentKeyRegistry();
    }

    @JvmStatic
    public static final NavigationRegistryModule_ProvideIntentKeyRegistryFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Set<Tuples2<KClass<? extends IntentKey>, List<Configuration.Intent>>> provideIntentKeyRegistry() {
        Object objCheckNotNull = Preconditions.checkNotNull(NavigationRegistryModule.INSTANCE.provideIntentKeyRegistry(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Set) objCheckNotNull;
    }
}
