package com.robinhood.android.regiongate;

import com.robinhood.hammer.android.RequiresHammerPlugin;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RegionGate.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/regiongate/RegionGate;", "Lcom/robinhood/hammer/android/RequiresHammerPlugin;", "name", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/regiongate/RegionGateConfiguration;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/regiongate/RegionGateConfiguration;)V", "getName", "()Ljava/lang/String;", "getConfiguration", "()Lcom/robinhood/android/regiongate/RegionGateConfiguration;", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class RegionGate implements RequiresHammerPlugin {
    private final RegionGateConfiguration configuration;
    private final String name;

    public RegionGate(String name, RegionGateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.name = name;
        this.configuration = configuration;
    }

    public final String getName() {
        return this.name;
    }

    public final RegionGateConfiguration getConfiguration() {
        return this.configuration;
    }
}
