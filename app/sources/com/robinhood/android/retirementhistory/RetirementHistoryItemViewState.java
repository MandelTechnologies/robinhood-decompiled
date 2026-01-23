package com.robinhood.android.retirementhistory;

import com.robinhood.models.serverdriven.experimental.api.DataRowStacked;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementHistoryItemViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState;", "", "Loading", "Loaded", "Companion", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState$Loaded;", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState$Loading;", "feature-retirement-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementHistoryItemViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: RetirementHistoryItemViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState$Loading;", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements RetirementHistoryItemViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -446829837;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: RetirementHistoryItemViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0006HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState$Loaded;", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState;", "title", "", "subtitle", WebsocketGatewayConstants.DATA_KEY, "", "Lcom/robinhood/models/serverdriven/experimental/api/DataRowStacked;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", Footer.f10637type, "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getData", "()Ljava/util/List;", "getFooter", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-retirement-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RetirementHistoryItemViewState {
        public static final int $stable = 8;
        private final List<DataRowStacked<GenericAction>> data;
        private final List<UIComponent<GenericAction>> footer;
        private final String subtitle;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                str2 = loaded.subtitle;
            }
            if ((i & 4) != 0) {
                list = loaded.data;
            }
            if ((i & 8) != 0) {
                list2 = loaded.footer;
            }
            return loaded.copy(str, str2, list, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<DataRowStacked<GenericAction>> component3() {
            return this.data;
        }

        public final List<UIComponent<GenericAction>> component4() {
            return this.footer;
        }

        public final Loaded copy(String title, String subtitle, List<? extends DataRowStacked<? extends GenericAction>> data, List<? extends UIComponent<? extends GenericAction>> footer) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(footer, "footer");
            return new Loaded(title, subtitle, data, footer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.data, loaded.data) && Intrinsics.areEqual(this.footer, loaded.footer);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.data.hashCode()) * 31) + this.footer.hashCode();
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", subtitle=" + this.subtitle + ", data=" + this.data + ", footer=" + this.footer + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(String title, String subtitle, List<? extends DataRowStacked<? extends GenericAction>> data, List<? extends UIComponent<? extends GenericAction>> footer) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(footer, "footer");
            this.title = title;
            this.subtitle = subtitle;
            this.data = data;
            this.footer = footer;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<DataRowStacked<GenericAction>> getData() {
            return this.data;
        }

        public final List<UIComponent<GenericAction>> getFooter() {
            return this.footer;
        }
    }

    /* compiled from: RetirementHistoryItemViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState$Loaded;", "getLoadingMock", "()Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState$Loaded;", "feature-retirement-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Loaded loadingMock;

        private Companion() {
        }

        public final Loaded getLoadingMock() {
            return loadingMock;
        }

        static {
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new DataRowStacked("---- ---", null, null, "----- ----", null, null, 54, null));
            }
            loadingMock = new Loaded("--- -------", "---- -------- ----------- ----- ---- ---------- ------- ----", arrayList, CollectionsKt.emptyList());
        }
    }
}
