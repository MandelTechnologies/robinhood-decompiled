package com.robinhood.tooltips;

import androidx.lifecycle.Lifecycle;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TooltipManagerViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB3\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÂ\u0003J5\u0010\u0016\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipManagerViewState;", "", "tooltips", "", "", "Lcom/robinhood/tooltips/TooltipManagerViewState$Tooltip;", "forceTooltipId", "isActive", "", "<init>", "(Ljava/util/Map;Ljava/lang/String;Z)V", "getTooltips", "()Ljava/util/Map;", "getForceTooltipId", "()Ljava/lang/String;", "activeTooltip", "getActiveTooltip", "()Lcom/robinhood/tooltips/TooltipManagerViewState$Tooltip;", "selectActiveTooltip", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Tooltip", "Status", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class TooltipManagerViewState {
    public static final int $stable = 8;
    private final Tooltip activeTooltip;
    private final String forceTooltipId;
    private final boolean isActive;
    private final Map<String, Tooltip> tooltips;

    public TooltipManagerViewState() {
        this(null, null, false, 7, null);
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TooltipManagerViewState copy$default(TooltipManagerViewState tooltipManagerViewState, Map map, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            map = tooltipManagerViewState.tooltips;
        }
        if ((i & 2) != 0) {
            str = tooltipManagerViewState.forceTooltipId;
        }
        if ((i & 4) != 0) {
            z = tooltipManagerViewState.isActive;
        }
        return tooltipManagerViewState.copy(map, str, z);
    }

    public final Map<String, Tooltip> component1() {
        return this.tooltips;
    }

    /* renamed from: component2, reason: from getter */
    public final String getForceTooltipId() {
        return this.forceTooltipId;
    }

    public final TooltipManagerViewState copy(Map<String, Tooltip> tooltips, String forceTooltipId, boolean isActive) {
        Intrinsics.checkNotNullParameter(tooltips, "tooltips");
        return new TooltipManagerViewState(tooltips, forceTooltipId, isActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipManagerViewState)) {
            return false;
        }
        TooltipManagerViewState tooltipManagerViewState = (TooltipManagerViewState) other;
        return Intrinsics.areEqual(this.tooltips, tooltipManagerViewState.tooltips) && Intrinsics.areEqual(this.forceTooltipId, tooltipManagerViewState.forceTooltipId) && this.isActive == tooltipManagerViewState.isActive;
    }

    public int hashCode() {
        int iHashCode = this.tooltips.hashCode() * 31;
        String str = this.forceTooltipId;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isActive);
    }

    public String toString() {
        return "TooltipManagerViewState(tooltips=" + this.tooltips + ", forceTooltipId=" + this.forceTooltipId + ", isActive=" + this.isActive + ")";
    }

    public TooltipManagerViewState(Map<String, Tooltip> tooltips, String str, boolean z) {
        Tooltip tooltipSelectActiveTooltip;
        Intrinsics.checkNotNullParameter(tooltips, "tooltips");
        this.tooltips = tooltips;
        this.forceTooltipId = str;
        this.isActive = z;
        if (str != null) {
            tooltipSelectActiveTooltip = tooltips.get(str);
        } else {
            tooltipSelectActiveTooltip = !z ? null : selectActiveTooltip();
        }
        this.activeTooltip = tooltipSelectActiveTooltip;
    }

    public /* synthetic */ TooltipManagerViewState(Map map, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? true : z);
    }

    public final Map<String, Tooltip> getTooltips() {
        return this.tooltips;
    }

    public final String getForceTooltipId() {
        return this.forceTooltipId;
    }

    public final Tooltip getActiveTooltip() {
        return this.activeTooltip;
    }

    private final Tooltip selectActiveTooltip() {
        Object next;
        Object next2;
        List list = CollectionsKt.toList(this.tooltips.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Tooltip) obj).canDisplay()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            next = null;
            if (!it.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it.next();
            Tooltip tooltip = (Tooltip) next2;
            if (tooltip.getStatus() == Status.DISPLAYED || tooltip.getStatus() == Status.DISPLAYING) {
                break;
            }
        }
        Tooltip tooltip2 = (Tooltip) next2;
        if (tooltip2 != null) {
            return tooltip2;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                Integer priority = ((Tooltip) next).getData().getBehavior().getPriority();
                int iIntValue = priority != null ? priority.intValue() : Integer.MAX_VALUE;
                do {
                    Object next3 = it2.next();
                    Integer priority2 = ((Tooltip) next3).getData().getBehavior().getPriority();
                    int iIntValue2 = priority2 != null ? priority2.intValue() : Integer.MAX_VALUE;
                    if (iIntValue > iIntValue2) {
                        next = next3;
                        iIntValue = iIntValue2;
                    }
                } while (it2.hasNext());
            }
        }
        return (Tooltip) next;
    }

    /* compiled from: TooltipManagerViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipManagerViewState$Tooltip;", "", "status", "Lcom/robinhood/tooltips/TooltipManagerViewState$Status;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/tooltips/TooltipData;", "<init>", "(Lcom/robinhood/tooltips/TooltipManagerViewState$Status;Lcom/robinhood/tooltips/TooltipData;)V", "getStatus", "()Lcom/robinhood/tooltips/TooltipManagerViewState$Status;", "getData", "()Lcom/robinhood/tooltips/TooltipData;", "canDisplay", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Tooltip {
        public static final int $stable = 8;
        private final TooltipData data;
        private final Status status;

        public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, Status status, TooltipData tooltipData, int i, Object obj) {
            if ((i & 1) != 0) {
                status = tooltip.status;
            }
            if ((i & 2) != 0) {
                tooltipData = tooltip.data;
            }
            return tooltip.copy(status, tooltipData);
        }

        /* renamed from: component1, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final TooltipData getData() {
            return this.data;
        }

        public final Tooltip copy(Status status, TooltipData data) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(data, "data");
            return new Tooltip(status, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) other;
            return this.status == tooltip.status && Intrinsics.areEqual(this.data, tooltip.data);
        }

        public int hashCode() {
            return (this.status.hashCode() * 31) + this.data.hashCode();
        }

        public String toString() {
            return "Tooltip(status=" + this.status + ", data=" + this.data + ")";
        }

        public Tooltip(Status status, TooltipData data) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(data, "data");
            this.status = status;
            this.data = data;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final TooltipData getData() {
            return this.data;
        }

        public final boolean canDisplay() {
            Lifecycle.State state;
            TooltipData tooltipData = this.data;
            if (Intrinsics.areEqual(tooltipData.getBehavior().isActive(), Boolean.FALSE)) {
                return false;
            }
            Lifecycle lifecycleOwner = tooltipData.getBehavior().getLifecycleOwner();
            return (lifecycleOwner == null || (state = lifecycleOwner.getState()) == null || state.isAtLeast(Lifecycle.State.STARTED)) && tooltipData.getTarget() != null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TooltipManagerViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipManagerViewState$Status;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAYED", "DISPLAYING", "READY", "REMOVING", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status DISPLAYED = new Status("DISPLAYED", 0);
        public static final Status DISPLAYING = new Status("DISPLAYING", 1);
        public static final Status READY = new Status("READY", 2);
        public static final Status REMOVING = new Status("REMOVING", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{DISPLAYED, DISPLAYING, READY, REMOVING};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i) {
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }
}
