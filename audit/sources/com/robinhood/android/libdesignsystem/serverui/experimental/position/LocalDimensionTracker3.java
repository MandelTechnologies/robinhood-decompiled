package com.robinhood.android.libdesignsystem.serverui.experimental.position;

import com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LocalDimensionTracker.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/RealDimensionTracker;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker;", "<init>", "()V", "dimensions", "", "", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker$PositionData;", "getPositionData", "id", "setPositionData", "", WebsocketGatewayConstants.DATA_KEY, "getVerticalDimensionInRoot", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker$VerticalDimension;", "clearPosition", "identifier", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.position.RealDimensionTracker, reason: use source file name */
/* loaded from: classes8.dex */
final class LocalDimensionTracker3 implements LocalDimensionTracker {
    private final Map<String, LocalDimensionTracker.PositionData> dimensions = new LinkedHashMap();

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker
    public LocalDimensionTracker.PositionData getPositionData(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.dimensions.get(id);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker
    public void setPositionData(String id, LocalDimensionTracker.PositionData data) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        this.dimensions.put(id, data);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker
    public LocalDimensionTracker.VerticalDimension getVerticalDimensionInRoot(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        LocalDimensionTracker.PositionData positionData = this.dimensions.get(id);
        if (positionData == null) {
            return null;
        }
        long jM16064getPositionF1C5BW0 = positionData.m16064getPositionF1C5BW0();
        return new LocalDimensionTracker.VerticalDimension(Float.intBitsToFloat((int) (jM16064getPositionF1C5BW0 & 4294967295L)), (int) (positionData.m16065getSizeYbymL2g() & 4294967295L));
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker
    public void clearPosition(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.dimensions.remove(identifier);
    }
}
