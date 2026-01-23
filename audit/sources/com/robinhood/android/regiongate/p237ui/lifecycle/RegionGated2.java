package com.robinhood.android.regiongate.p237ui.lifecycle;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RegionGated.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGatedDelegate;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "(Ljava/util/Set;)V", "", "([Lcom/robinhood/android/regiongate/RegionGate;)V", "getRequiresRegionGates", "()Ljava/util/Set;", "lib-region-gate-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.regiongate.ui.lifecycle.RegionGatedDelegate, reason: use source file name */
/* loaded from: classes5.dex */
public final class RegionGated2 implements RegionGated {
    private final Set<RegionGate> requiresRegionGates;

    /* JADX WARN: Multi-variable type inference failed */
    public RegionGated2(Set<? extends RegionGate> requiresRegionGates) {
        Intrinsics.checkNotNullParameter(requiresRegionGates, "requiresRegionGates");
        this.requiresRegionGates = requiresRegionGates;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.requiresRegionGates;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return RegionGated.DefaultImpls.onDismissUnsupportedFeatureDialog(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RegionGated2(RegionGate... requiresRegionGates) {
        this((Set<? extends RegionGate>) ArraysKt.toSet(requiresRegionGates));
        Intrinsics.checkNotNullParameter(requiresRegionGates, "requiresRegionGates");
    }
}
