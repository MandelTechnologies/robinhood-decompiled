package com.robinhood.android.eventcontracts.experiments;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGate;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractsSportsRegionGate_HammerModule_ProvideFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/experiments/EventContractsSportsRegionGate_HammerModule_ProvideFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventContractsSportsRegionGate_HammerModule_ProvideFactory implements Factory<RegionGate> {
    public static final EventContractsSportsRegionGate_HammerModule_ProvideFactory INSTANCE = new EventContractsSportsRegionGate_HammerModule_ProvideFactory();

    private EventContractsSportsRegionGate_HammerModule_ProvideFactory() {
    }

    @Override // javax.inject.Provider
    public RegionGate get() {
        return provide();
    }

    @JvmStatic
    public static final EventContractsSportsRegionGate_HammerModule_ProvideFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final RegionGate provide() {
        Object objCheckNotNull = Preconditions.checkNotNull(EventContractsSportsRegionGate_HammerModule.INSTANCE.provide(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (RegionGate) objCheckNotNull;
    }
}
