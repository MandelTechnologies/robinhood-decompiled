package com.robinhood.android.mcw.homesection;

import com.robinhood.android.lib.store.mcw.data.McwHomeSectionData;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardMcwSectionState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState;", "", "<init>", "()V", "Data", "View", "Companion", "feature-lib-mcw-home-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DashboardMcwSectionState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: DashboardMcwSectionState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$Data;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;", "<init>", "(Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;)V", "getData", "()Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-mcw-home-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Data {
        public static final int $stable = McwHomeSectionData.$stable;
        private final McwHomeSectionData data;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Data copy$default(Data data, McwHomeSectionData mcwHomeSectionData, int i, Object obj) {
            if ((i & 1) != 0) {
                mcwHomeSectionData = data.data;
            }
            return data.copy(mcwHomeSectionData);
        }

        /* renamed from: component1, reason: from getter */
        public final McwHomeSectionData getData() {
            return this.data;
        }

        public final Data copy(McwHomeSectionData data) {
            return new Data(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.areEqual(this.data, ((Data) other).data);
        }

        public int hashCode() {
            McwHomeSectionData mcwHomeSectionData = this.data;
            if (mcwHomeSectionData == null) {
                return 0;
            }
            return mcwHomeSectionData.hashCode();
        }

        public String toString() {
            return "Data(data=" + this.data + ")";
        }

        public Data(McwHomeSectionData mcwHomeSectionData) {
            this.data = mcwHomeSectionData;
        }

        public /* synthetic */ Data(McwHomeSectionData mcwHomeSectionData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : mcwHomeSectionData);
        }

        public final McwHomeSectionData getData() {
            return this.data;
        }
    }

    /* compiled from: DashboardMcwSectionState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View;", "", "Loading", "Loaded", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View$Loaded;", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View$Loading;", "feature-lib-mcw-home-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface View {

        /* compiled from: DashboardMcwSectionState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View$Loading;", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-mcw-home-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements View {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 727337279;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: DashboardMcwSectionState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View$Loaded;", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;", "<init>", "(Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;)V", "getData", "()Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-mcw-home-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements View {
            public static final int $stable = McwHomeSectionData.$stable;
            private final McwHomeSectionData data;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, McwHomeSectionData mcwHomeSectionData, int i, Object obj) {
                if ((i & 1) != 0) {
                    mcwHomeSectionData = loaded.data;
                }
                return loaded.copy(mcwHomeSectionData);
            }

            /* renamed from: component1, reason: from getter */
            public final McwHomeSectionData getData() {
                return this.data;
            }

            public final Loaded copy(McwHomeSectionData data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new Loaded(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loaded) && Intrinsics.areEqual(this.data, ((Loaded) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Loaded(data=" + this.data + ")";
            }

            public Loaded(McwHomeSectionData data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            public final McwHomeSectionData getData() {
                return this.data;
            }
        }
    }

    /* compiled from: DashboardMcwSectionState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$Data;", "Lcom/robinhood/android/mcw/homesection/DashboardMcwSectionState$View;", "<init>", "()V", "reduce", "dataState", "feature-lib-mcw-home-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<Data, View> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public View reduce(Data dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            return dataState.getData() == null ? View.Loading.INSTANCE : new View.Loaded(dataState.getData());
        }
    }
}
