package com.robinhood.shared.debug.registry.provisions;

import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.shared.debug.lib.registry.config.Configuration;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.SetsKt;
import kotlin.reflect.KClass;

/* compiled from: NavigationRegistryModule.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\"\u0012\u001e\u0012\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00060\u0005H\u0007J(\u0010\u000b\u001a\"\u0012\u001e\u0012\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u00060\u0005H\u0007J(\u0010\u000e\u001a\"\u0012\u001e\u0012\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\u00060\u0005H\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/debug/registry/provisions/NavigationRegistryModule;", "", "<init>", "()V", "provideDialogFragmentKeyRegistry", "", "Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration$DialogFragment;", "provideIntentKeyRegistry", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration$Intent;", "provideFragmentKeyRegistry", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration$Fragment;", "lib-debug-drawer-registry-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class NavigationRegistryModule {
    public static final NavigationRegistryModule INSTANCE = new NavigationRegistryModule();

    private NavigationRegistryModule() {
    }

    public final Set<Tuples2<KClass<? extends DialogFragmentKey>, List<Configuration.DialogFragment>>> provideDialogFragmentKeyRegistry() {
        return SetsKt.emptySet();
    }

    public final Set<Tuples2<KClass<? extends IntentKey>, List<Configuration.Intent>>> provideIntentKeyRegistry() {
        return SetsKt.emptySet();
    }

    public final Set<Tuples2<KClass<? extends FragmentKey>, List<Configuration.Fragment>>> provideFragmentKeyRegistry() {
        return SetsKt.emptySet();
    }
}
