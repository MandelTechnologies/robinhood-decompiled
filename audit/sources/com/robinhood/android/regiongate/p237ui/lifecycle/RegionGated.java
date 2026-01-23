package com.robinhood.android.regiongate.p237ui.lifecycle;

import com.robinhood.android.regiongate.RegionGate;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: RegionGated.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "onDismissUnsupportedFeatureDialog", "", "lib-region-gate-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface RegionGated {

    /* compiled from: RegionGated.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static boolean onDismissUnsupportedFeatureDialog(RegionGated regionGated) {
            return false;
        }
    }

    Set<RegionGate> getRequiresRegionGates();

    boolean onDismissUnsupportedFeatureDialog();
}
