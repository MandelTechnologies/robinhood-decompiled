package com.robinhood.shared.feature.discovery.p382ui;

import com.robinhood.models.api.FeatureDiscoveryLocation;
import com.robinhood.models.p320db.bonfire.FeatureDiscoveryResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureDiscoveryResponse.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0006"}, m3636d2 = {"isFromLocation", "", "Lcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;", "targetLocation", "Lcom/robinhood/models/api/FeatureDiscoveryLocation;", "hasContent", "lib-feature-discovery_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryResponseKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class FeatureDiscoveryResponse3 {
    public static final boolean isFromLocation(FeatureDiscoveryResponse featureDiscoveryResponse, FeatureDiscoveryLocation targetLocation) {
        Intrinsics.checkNotNullParameter(featureDiscoveryResponse, "<this>");
        Intrinsics.checkNotNullParameter(targetLocation, "targetLocation");
        return featureDiscoveryResponse.getLocation() == targetLocation;
    }

    public static final boolean hasContent(FeatureDiscoveryResponse featureDiscoveryResponse) {
        Intrinsics.checkNotNullParameter(featureDiscoveryResponse, "<this>");
        return featureDiscoveryResponse.getComponent() != null;
    }
}
