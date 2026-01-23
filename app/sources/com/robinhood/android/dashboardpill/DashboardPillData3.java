package com.robinhood.android.dashboardpill;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardPillData.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/DashboardPillState;", "", "<init>", "()V", "Hidden", "Visible", "Lcom/robinhood/android/dashboardpill/DashboardPillState$Hidden;", "Lcom/robinhood/android/dashboardpill/DashboardPillState$Visible;", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboardpill.DashboardPillState, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class DashboardPillData3 {
    public static final int $stable = 0;

    public /* synthetic */ DashboardPillData3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DashboardPillData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/DashboardPillState$Hidden;", "Lcom/robinhood/android/dashboardpill/DashboardPillState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.DashboardPillState$Hidden */
    public static final /* data */ class Hidden extends DashboardPillData3 {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        public boolean equals(Object other) {
            return this == other || (other instanceof Hidden);
        }

        public int hashCode() {
            return -494173057;
        }

        public String toString() {
            return "Hidden";
        }

        private Hidden() {
            super(null);
        }
    }

    private DashboardPillData3() {
    }

    /* compiled from: DashboardPillData.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/DashboardPillState$Visible;", "Lcom/robinhood/android/dashboardpill/DashboardPillState;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/dashboardpill/DashboardPillData;", "<init>", "(Lcom/robinhood/android/dashboardpill/DashboardPillData;)V", "getData", "()Lcom/robinhood/android/dashboardpill/DashboardPillData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.DashboardPillState$Visible, reason: from toString */
    public static final /* data */ class Visible extends DashboardPillData3 {
        public static final int $stable = 8;
        private final DashboardPillData data;

        public static /* synthetic */ Visible copy$default(Visible visible, DashboardPillData dashboardPillData, int i, Object obj) {
            if ((i & 1) != 0) {
                dashboardPillData = visible.data;
            }
            return visible.copy(dashboardPillData);
        }

        /* renamed from: component1, reason: from getter */
        public final DashboardPillData getData() {
            return this.data;
        }

        public final Visible copy(DashboardPillData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Visible(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Visible) && Intrinsics.areEqual(this.data, ((Visible) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Visible(data=" + this.data + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Visible(DashboardPillData data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final DashboardPillData getData() {
            return this.data;
        }
    }
}
