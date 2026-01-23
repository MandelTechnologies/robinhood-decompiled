package com.robinhood.android.debug.registry.provisions;

import com.robinhood.android.equities.contracts.AdtInstrumentInfoKey;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.debug.lib.registry.config.Configuration;
import com.robinhood.utils.extensions.StringsKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: DialogFragmentKeyRegistry.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R1\u0010\u0004\u001a\"\u0012\u001e\u0012\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/debug/registry/provisions/DialogFragmentKeyRegistry;", "", "<init>", "()V", "MAPPING", "", "Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration$DialogFragment;", "getMAPPING", "()Ljava/util/Set;", "lib-debug-drawer-registry-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DialogFragmentKeyRegistry {
    public static final DialogFragmentKeyRegistry INSTANCE = new DialogFragmentKeyRegistry();

    private DialogFragmentKeyRegistry() {
    }

    public final Set<Tuples2<KClass<? extends DialogFragmentKey>, List<Configuration.DialogFragment>>> getMAPPING() {
        return SetsKt.setOf(Tuples4.m3642to(Reflection.getOrCreateKotlinClass(AdtInstrumentInfoKey.class), CollectionsKt.listOf(new Configuration.DialogFragment("All Day Trading Stock Info (AAPL)", new AdtInstrumentInfoKey(StringsKt.toUuid("450dfc6d-5510-4d40-abfb-f633b7d9be3e"), new Screen(null, null, null, null, 15, null), new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null))))));
    }
}
