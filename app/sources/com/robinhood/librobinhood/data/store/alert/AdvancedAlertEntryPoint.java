package com.robinhood.librobinhood.data.store.alert;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvancedAlertEntryPoint.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertEntryPoint;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "SDP_NAV_BAR_BUTTON", "CDP_NAV_BAR_BUTTON", "ACP_NAV_BAR_BUTTON", "SDP_HERO_CARD", "CDP_HERO_CARD", "TOOLTIP", "WATCH_LIST_TOOLTIP", "ALERT_HUB_SETTING", "SEARCH", "NONE", "Companion", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AdvancedAlertEntryPoint {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvancedAlertEntryPoint[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<String, AdvancedAlertEntryPoint> MAPPINGS;
    private final String serverValue;
    public static final AdvancedAlertEntryPoint SDP_NAV_BAR_BUTTON = new AdvancedAlertEntryPoint("SDP_NAV_BAR_BUTTON", 0, "sdp-nav-bar-button");
    public static final AdvancedAlertEntryPoint CDP_NAV_BAR_BUTTON = new AdvancedAlertEntryPoint("CDP_NAV_BAR_BUTTON", 1, "cdp-nav-bar-button");
    public static final AdvancedAlertEntryPoint ACP_NAV_BAR_BUTTON = new AdvancedAlertEntryPoint("ACP_NAV_BAR_BUTTON", 2, "acp-nav-bar-button");
    public static final AdvancedAlertEntryPoint SDP_HERO_CARD = new AdvancedAlertEntryPoint("SDP_HERO_CARD", 3, "sdp-hero-card");
    public static final AdvancedAlertEntryPoint CDP_HERO_CARD = new AdvancedAlertEntryPoint("CDP_HERO_CARD", 4, "cdp-hero-card");
    public static final AdvancedAlertEntryPoint TOOLTIP = new AdvancedAlertEntryPoint("TOOLTIP", 5, "tool-tip");
    public static final AdvancedAlertEntryPoint WATCH_LIST_TOOLTIP = new AdvancedAlertEntryPoint("WATCH_LIST_TOOLTIP", 6, "watch-list-tool-tip");
    public static final AdvancedAlertEntryPoint ALERT_HUB_SETTING = new AdvancedAlertEntryPoint("ALERT_HUB_SETTING", 7, "alert-hub-setting");
    public static final AdvancedAlertEntryPoint SEARCH = new AdvancedAlertEntryPoint("SEARCH", 8, "search");
    public static final AdvancedAlertEntryPoint NONE = new AdvancedAlertEntryPoint("NONE", 9, "");

    private static final /* synthetic */ AdvancedAlertEntryPoint[] $values() {
        return new AdvancedAlertEntryPoint[]{SDP_NAV_BAR_BUTTON, CDP_NAV_BAR_BUTTON, ACP_NAV_BAR_BUTTON, SDP_HERO_CARD, CDP_HERO_CARD, TOOLTIP, WATCH_LIST_TOOLTIP, ALERT_HUB_SETTING, SEARCH, NONE};
    }

    @JvmStatic
    public static final AdvancedAlertEntryPoint fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<AdvancedAlertEntryPoint> getEntries() {
        return $ENTRIES;
    }

    private AdvancedAlertEntryPoint(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        AdvancedAlertEntryPoint[] advancedAlertEntryPointArr$values = $values();
        $VALUES = advancedAlertEntryPointArr$values;
        $ENTRIES = EnumEntries2.enumEntries(advancedAlertEntryPointArr$values);
        INSTANCE = new Companion(null);
        AdvancedAlertEntryPoint[] advancedAlertEntryPointArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(advancedAlertEntryPointArrValues.length), 16));
        for (AdvancedAlertEntryPoint advancedAlertEntryPoint : advancedAlertEntryPointArrValues) {
            linkedHashMap.put(advancedAlertEntryPoint.serverValue, advancedAlertEntryPoint);
        }
        MAPPINGS = linkedHashMap;
    }

    /* compiled from: AdvancedAlertEntryPoint.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertEntryPoint$Companion;", "", "<init>", "()V", "MAPPINGS", "", "", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertEntryPoint;", "fromServerValue", "serverValue", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvancedAlertEntryPoint fromServerValue(String serverValue) {
            AdvancedAlertEntryPoint advancedAlertEntryPoint;
            return (serverValue == null || (advancedAlertEntryPoint = (AdvancedAlertEntryPoint) AdvancedAlertEntryPoint.MAPPINGS.get(serverValue)) == null) ? AdvancedAlertEntryPoint.NONE : advancedAlertEntryPoint;
        }
    }

    public static AdvancedAlertEntryPoint valueOf(String str) {
        return (AdvancedAlertEntryPoint) Enum.valueOf(AdvancedAlertEntryPoint.class, str);
    }

    public static AdvancedAlertEntryPoint[] values() {
        return (AdvancedAlertEntryPoint[]) $VALUES.clone();
    }
}
