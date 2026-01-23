package com.robinhood.android.gold.hub.boost;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GoldDepositBoostTab.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "displayName", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getIndex", "()I", "getDisplayName", "()Ljava/lang/String;", "INDIVIDUAL", "JOINT", "Companion", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldDepositBoostTab {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GoldDepositBoostTab[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final GoldDepositBoostTab INDIVIDUAL = new GoldDepositBoostTab("INDIVIDUAL", 0, 0, "individual");
    public static final GoldDepositBoostTab JOINT = new GoldDepositBoostTab("JOINT", 1, 1, "joint");
    private final String displayName;
    private final int index;

    private static final /* synthetic */ GoldDepositBoostTab[] $values() {
        return new GoldDepositBoostTab[]{INDIVIDUAL, JOINT};
    }

    public static EnumEntries<GoldDepositBoostTab> getEntries() {
        return $ENTRIES;
    }

    private GoldDepositBoostTab(String str, int i, int i2, String str2) {
        this.index = i2;
        this.displayName = str2;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getIndex() {
        return this.index;
    }

    static {
        GoldDepositBoostTab[] goldDepositBoostTabArr$values = $values();
        $VALUES = goldDepositBoostTabArr$values;
        $ENTRIES = EnumEntries2.enumEntries(goldDepositBoostTabArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: GoldDepositBoostTab.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab$Companion;", "", "<init>", "()V", "fromInt", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "fromString", "name", "", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GoldDepositBoostTab fromInt(int index) {
            GoldDepositBoostTab next;
            Iterator<GoldDepositBoostTab> it = GoldDepositBoostTab.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getIndex() == index) {
                    break;
                }
            }
            GoldDepositBoostTab goldDepositBoostTab = next;
            return goldDepositBoostTab == null ? GoldDepositBoostTab.INDIVIDUAL : goldDepositBoostTab;
        }

        public final GoldDepositBoostTab fromString(String name) {
            GoldDepositBoostTab next;
            Intrinsics.checkNotNullParameter(name, "name");
            Iterator<GoldDepositBoostTab> it = GoldDepositBoostTab.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getDisplayName(), name)) {
                    break;
                }
            }
            GoldDepositBoostTab goldDepositBoostTab = next;
            return goldDepositBoostTab == null ? GoldDepositBoostTab.INDIVIDUAL : goldDepositBoostTab;
        }
    }

    public static GoldDepositBoostTab valueOf(String str) {
        return (GoldDepositBoostTab) Enum.valueOf(GoldDepositBoostTab.class, str);
    }

    public static GoldDepositBoostTab[] values() {
        return (GoldDepositBoostTab[]) $VALUES.clone();
    }
}
