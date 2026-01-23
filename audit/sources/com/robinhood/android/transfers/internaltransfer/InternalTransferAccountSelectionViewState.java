package com.robinhood.android.transfers.internaltransfer;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalTransferAccountSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState;", "", "Loading", "Loaded", "Row", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState$Loaded;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState$Loading;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface InternalTransferAccountSelectionViewState {

    /* compiled from: InternalTransferAccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState$Loading;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements InternalTransferAccountSelectionViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1115917895;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: InternalTransferAccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState$Loaded;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState;", "rows", "", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState$Row;", "<init>", "(Ljava/util/List;)V", "getRows", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements InternalTransferAccountSelectionViewState {
        public static final int $stable = 8;
        private final List<Row> rows;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.rows;
            }
            return loaded.copy(list);
        }

        public final List<Row> component1() {
            return this.rows;
        }

        public final Loaded copy(List<Row> rows) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Loaded(rows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.rows, ((Loaded) other).rows);
        }

        public int hashCode() {
            return this.rows.hashCode();
        }

        public String toString() {
            return "Loaded(rows=" + this.rows + ")";
        }

        public Loaded(List<Row> rows) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.rows = rows;
        }

        public final List<Row> getRows() {
            return this.rows;
        }
    }

    /* compiled from: InternalTransferAccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState$Row;", "", "accountId", "", "title", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getAccountId", "()Ljava/lang/String;", "getTitle", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = 0;
        private final String accountId;
        private final ServerToBentoAssetMapper2 icon;
        private final String title;

        public static /* synthetic */ Row copy$default(Row row, String str, String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = row.accountId;
            }
            if ((i & 2) != 0) {
                str2 = row.title;
            }
            if ((i & 4) != 0) {
                serverToBentoAssetMapper2 = row.icon;
            }
            return row.copy(str, str2, serverToBentoAssetMapper2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final Row copy(String accountId, String title, ServerToBentoAssetMapper2 icon) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Row(accountId, title, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.accountId, row.accountId) && Intrinsics.areEqual(this.title, row.title) && this.icon == row.icon;
        }

        public int hashCode() {
            return (((this.accountId.hashCode() * 31) + this.title.hashCode()) * 31) + this.icon.hashCode();
        }

        public String toString() {
            return "Row(accountId=" + this.accountId + ", title=" + this.title + ", icon=" + this.icon + ")";
        }

        public Row(String accountId, String title, ServerToBentoAssetMapper2 icon) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.accountId = accountId;
            this.title = title;
            this.icon = icon;
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }
    }
}
