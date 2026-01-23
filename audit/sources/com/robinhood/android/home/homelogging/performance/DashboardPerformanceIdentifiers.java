package com.robinhood.android.home.homelogging.performance;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: DashboardPerformanceIdentifiers.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/home/homelogging/performance/DashboardPerformanceIdentifier;", "", "<init>", "()V", "Internal", "Component", "lib-home-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.home.homelogging.performance.DashboardPerformanceIdentifier, reason: use source file name */
/* loaded from: classes10.dex */
public final class DashboardPerformanceIdentifiers {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DashboardPerformanceIdentifiers.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/home/homelogging/performance/DashboardPerformanceIdentifier$Internal;", "", "<init>", "(Ljava/lang/String;I)V", "DASHBOARD_DUXO", "DASHBOARD_APP_BAR_DUXO", "DASHBOARD_BROKERAGE_ACCOUNT_HEADER", "lib-home-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.home.homelogging.performance.DashboardPerformanceIdentifier$Internal */
    public static final class Internal {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Internal[] $VALUES;
        public static final Internal DASHBOARD_DUXO = new Internal("DASHBOARD_DUXO", 0);
        public static final Internal DASHBOARD_APP_BAR_DUXO = new Internal("DASHBOARD_APP_BAR_DUXO", 1);
        public static final Internal DASHBOARD_BROKERAGE_ACCOUNT_HEADER = new Internal("DASHBOARD_BROKERAGE_ACCOUNT_HEADER", 2);

        private static final /* synthetic */ Internal[] $values() {
            return new Internal[]{DASHBOARD_DUXO, DASHBOARD_APP_BAR_DUXO, DASHBOARD_BROKERAGE_ACCOUNT_HEADER};
        }

        public static EnumEntries<Internal> getEntries() {
            return $ENTRIES;
        }

        private Internal(String str, int i) {
        }

        static {
            Internal[] internalArr$values = $values();
            $VALUES = internalArr$values;
            $ENTRIES = EnumEntries2.enumEntries(internalArr$values);
        }

        public static Internal valueOf(String str) {
            return (Internal) Enum.valueOf(Internal.class, str);
        }

        public static Internal[] values() {
            return (Internal[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DashboardPerformanceIdentifiers.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/home/homelogging/performance/DashboardPerformanceIdentifier$Component;", "", "<init>", "(Ljava/lang/String;I)V", "DASHBOARD_CHART", "lib-home-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.home.homelogging.performance.DashboardPerformanceIdentifier$Component */
    public static final class Component {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Component[] $VALUES;
        public static final Component DASHBOARD_CHART = new Component("DASHBOARD_CHART", 0);

        private static final /* synthetic */ Component[] $values() {
            return new Component[]{DASHBOARD_CHART};
        }

        public static EnumEntries<Component> getEntries() {
            return $ENTRIES;
        }

        private Component(String str, int i) {
        }

        static {
            Component[] componentArr$values = $values();
            $VALUES = componentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(componentArr$values);
        }

        public static Component valueOf(String str) {
            return (Component) Enum.valueOf(Component.class, str);
        }

        public static Component[] values() {
            return (Component[]) $VALUES.clone();
        }
    }
}
