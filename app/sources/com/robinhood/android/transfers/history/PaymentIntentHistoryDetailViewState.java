package com.robinhood.android.transfers.history;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: PaymentIntentHistoryDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState;", "", "<init>", "()V", "Loading", "Content", "DataRow", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState$Content;", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState$Loading;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class PaymentIntentHistoryDetailViewState {
    public static final int $stable = 0;

    public /* synthetic */ PaymentIntentHistoryDetailViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaymentIntentHistoryDetailViewState() {
    }

    /* compiled from: PaymentIntentHistoryDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState$Loading;", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends PaymentIntentHistoryDetailViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -570080221;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: PaymentIntentHistoryDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState$Content;", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState;", "title", "", "subtitle", "rows", "", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState$DataRow;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getRows", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content extends PaymentIntentHistoryDetailViewState {
        public static final int $stable = 8;
        private final List<DataRow> rows;
        private final String subtitle;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = content.title;
            }
            if ((i & 2) != 0) {
                str2 = content.subtitle;
            }
            if ((i & 4) != 0) {
                list = content.rows;
            }
            return content.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<DataRow> component3() {
            return this.rows;
        }

        public final Content copy(String title, String subtitle, List<DataRow> rows) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Content(title, subtitle, rows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.subtitle, content.subtitle) && Intrinsics.areEqual(this.rows, content.rows);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.rows.hashCode();
        }

        public String toString() {
            return "Content(title=" + this.title + ", subtitle=" + this.subtitle + ", rows=" + this.rows + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<DataRow> getRows() {
            return this.rows;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(String title, String subtitle, List<DataRow> rows) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.title = title;
            this.subtitle = subtitle;
            this.rows = rows;
        }
    }

    /* compiled from: PaymentIntentHistoryDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState$DataRow;", "", AnnotatedPrivateKey.LABEL, "", "value", "showExchangeRateInfo", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getLabel", "()Ljava/lang/String;", "getValue", "getShowExchangeRateInfo", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DataRow {
        public static final int $stable = 0;
        private final String label;
        private final boolean showExchangeRateInfo;
        private final String value;

        public static /* synthetic */ DataRow copy$default(DataRow dataRow, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dataRow.label;
            }
            if ((i & 2) != 0) {
                str2 = dataRow.value;
            }
            if ((i & 4) != 0) {
                z = dataRow.showExchangeRateInfo;
            }
            return dataRow.copy(str, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowExchangeRateInfo() {
            return this.showExchangeRateInfo;
        }

        public final DataRow copy(String label, String value, boolean showExchangeRateInfo) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            return new DataRow(label, value, showExchangeRateInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataRow)) {
                return false;
            }
            DataRow dataRow = (DataRow) other;
            return Intrinsics.areEqual(this.label, dataRow.label) && Intrinsics.areEqual(this.value, dataRow.value) && this.showExchangeRateInfo == dataRow.showExchangeRateInfo;
        }

        public int hashCode() {
            return (((this.label.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.showExchangeRateInfo);
        }

        public String toString() {
            return "DataRow(label=" + this.label + ", value=" + this.value + ", showExchangeRateInfo=" + this.showExchangeRateInfo + ")";
        }

        public DataRow(String label, String value, boolean z) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.label = label;
            this.value = value;
            this.showExchangeRateInfo = z;
        }

        public /* synthetic */ DataRow(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getValue() {
            return this.value;
        }

        public final boolean getShowExchangeRateInfo() {
            return this.showExchangeRateInfo;
        }
    }
}
