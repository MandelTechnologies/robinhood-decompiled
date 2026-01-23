package com.robinhood.android.libdesignsystem.serverui.experimental.position;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.IntSize;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LocalDimensionTracker.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\r\u000eJ\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker;", "", "getVerticalDimensionInRoot", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker$VerticalDimension;", "id", "", "setPositionData", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker$PositionData;", "getPositionData", "clearPosition", "identifier", "VerticalDimension", "PositionData", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.position.DimensionTracker, reason: use source file name */
/* loaded from: classes8.dex */
public interface LocalDimensionTracker {
    void clearPosition(String identifier);

    PositionData getPositionData(String id);

    VerticalDimension getVerticalDimensionInRoot(String id);

    void setPositionData(String id, PositionData data);

    /* compiled from: LocalDimensionTracker.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker$VerticalDimension;", "", "position", "", "height", "", "<init>", "(FI)V", "getPosition", "()F", "getHeight", "()I", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.position.DimensionTracker$VerticalDimension */
    public static final class VerticalDimension {
        public static final int $stable = 0;
        private final int height;
        private final float position;

        public VerticalDimension(float f, int i) {
            this.position = f;
            this.height = i;
        }

        public final int getHeight() {
            return this.height;
        }

        public final float getPosition() {
            return this.position;
        }
    }

    /* compiled from: LocalDimensionTracker.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\tJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker$PositionData;", "", "position", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/unit/IntSize;", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPosition-F1C5BW0", "()J", "J", "getSize-YbymL2g", "component1", "component1-F1C5BW0", "component2", "component2-YbymL2g", "copy", "copy-CowoxoA", "(JJ)Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker$PositionData;", "equals", "", "other", "hashCode", "", "toString", "", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.position.DimensionTracker$PositionData, reason: from toString */
    public static final /* data */ class PositionData {
        public static final int $stable = 0;
        private final long position;
        private final long size;

        public /* synthetic */ PositionData(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        /* renamed from: copy-CowoxoA$default, reason: not valid java name */
        public static /* synthetic */ PositionData m16060copyCowoxoA$default(PositionData positionData, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = positionData.position;
            }
            if ((i & 2) != 0) {
                j2 = positionData.size;
            }
            return positionData.m16063copyCowoxoA(j, j2);
        }

        /* renamed from: component1-F1C5BW0, reason: not valid java name and from getter */
        public final long getPosition() {
            return this.position;
        }

        /* renamed from: component2-YbymL2g, reason: not valid java name and from getter */
        public final long getSize() {
            return this.size;
        }

        /* renamed from: copy-CowoxoA, reason: not valid java name */
        public final PositionData m16063copyCowoxoA(long position, long size) {
            return new PositionData(position, size, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionData)) {
                return false;
            }
            PositionData positionData = (PositionData) other;
            return Offset.m6540equalsimpl0(this.position, positionData.position) && IntSize.m8058equalsimpl0(this.size, positionData.size);
        }

        public int hashCode() {
            return (Offset.m6545hashCodeimpl(this.position) * 31) + IntSize.m8061hashCodeimpl(this.size);
        }

        public String toString() {
            return "PositionData(position=" + Offset.m6549toStringimpl(this.position) + ", size=" + IntSize.m8062toStringimpl(this.size) + ")";
        }

        private PositionData(long j, long j2) {
            this.position = j;
            this.size = j2;
        }

        /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
        public final long m16064getPositionF1C5BW0() {
            return this.position;
        }

        /* renamed from: getSize-YbymL2g, reason: not valid java name */
        public final long m16065getSizeYbymL2g() {
            return this.size;
        }
    }
}
