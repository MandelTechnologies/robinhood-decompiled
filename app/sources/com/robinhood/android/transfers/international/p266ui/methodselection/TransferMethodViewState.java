package com.robinhood.android.transfers.international.p266ui.methodselection;

import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferMethodViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState;", "", "Loading", "Loaded", "Row", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Loaded;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Loading;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface TransferMethodViewState {

    /* compiled from: TransferMethodViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Loading;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements TransferMethodViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1760946475;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: TransferMethodViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Loaded;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "rows", "", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Row;", "isDisclosureVisible", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;Z)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getRows", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements TransferMethodViewState {
        public static final int $stable = 8;
        private final boolean isDisclosureVisible;
        private final List<Row> rows;
        private final StringResource title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.title;
            }
            if ((i & 2) != 0) {
                list = loaded.rows;
            }
            if ((i & 4) != 0) {
                z = loaded.isDisclosureVisible;
            }
            return loaded.copy(stringResource, list, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        public final List<Row> component2() {
            return this.rows;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsDisclosureVisible() {
            return this.isDisclosureVisible;
        }

        public final Loaded copy(StringResource title, List<? extends Row> rows, boolean isDisclosureVisible) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Loaded(title, rows, isDisclosureVisible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.rows, loaded.rows) && this.isDisclosureVisible == loaded.isDisclosureVisible;
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.rows.hashCode()) * 31) + Boolean.hashCode(this.isDisclosureVisible);
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", rows=" + this.rows + ", isDisclosureVisible=" + this.isDisclosureVisible + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(StringResource title, List<? extends Row> rows, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.title = title;
            this.rows = rows;
            this.isDisclosureVisible = z;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final List<Row> getRows() {
            return this.rows;
        }

        public final boolean isDisclosureVisible() {
            return this.isDisclosureVisible;
        }
    }

    /* compiled from: TransferMethodViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Row;", "", "FastTransfer", "WireTransfer", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Row$FastTransfer;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Row$WireTransfer;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Row {

        /* compiled from: TransferMethodViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Row$FastTransfer;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Row;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FastTransfer implements Row {
            public static final int $stable = 0;
            public static final FastTransfer INSTANCE = new FastTransfer();

            public boolean equals(Object other) {
                return this == other || (other instanceof FastTransfer);
            }

            public int hashCode() {
                return 1938646284;
            }

            public String toString() {
                return "FastTransfer";
            }

            private FastTransfer() {
            }
        }

        /* compiled from: TransferMethodViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Row$WireTransfer;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState$Row;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class WireTransfer implements Row {
            public static final int $stable = StringResource.$stable;
            private final StringResource subtitle;

            public static /* synthetic */ WireTransfer copy$default(WireTransfer wireTransfer, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = wireTransfer.subtitle;
                }
                return wireTransfer.copy(stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getSubtitle() {
                return this.subtitle;
            }

            public final WireTransfer copy(StringResource subtitle) {
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new WireTransfer(subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WireTransfer) && Intrinsics.areEqual(this.subtitle, ((WireTransfer) other).subtitle);
            }

            public int hashCode() {
                return this.subtitle.hashCode();
            }

            public String toString() {
                return "WireTransfer(subtitle=" + this.subtitle + ")";
            }

            public WireTransfer(StringResource subtitle) {
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.subtitle = subtitle;
            }

            public final StringResource getSubtitle() {
                return this.subtitle;
            }
        }
    }
}
