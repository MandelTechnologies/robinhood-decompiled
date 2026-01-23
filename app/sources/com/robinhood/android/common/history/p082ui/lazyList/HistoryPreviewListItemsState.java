package com.robinhood.android.common.history.p082ui.lazyList;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HistoryPreviewListItemsState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState;", "", "totalItemCount", "", "<init>", "(I)V", "getTotalItemCount", "()I", "EmptyWithoutContent", "EmptyWithContent", "Loading", "Loaded", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState$EmptyWithContent;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState$EmptyWithoutContent;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState$Loaded;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState$Loading;", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class HistoryPreviewListItemsState {
    public static final int $stable = 0;
    private final int totalItemCount;

    public /* synthetic */ HistoryPreviewListItemsState(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private HistoryPreviewListItemsState(int i) {
        this.totalItemCount = i;
    }

    public final int getTotalItemCount() {
        return this.totalItemCount;
    }

    /* compiled from: HistoryPreviewListItemsState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState$EmptyWithoutContent;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EmptyWithoutContent extends HistoryPreviewListItemsState {
        public static final int $stable = 0;
        public static final EmptyWithoutContent INSTANCE = new EmptyWithoutContent();

        public boolean equals(Object other) {
            return this == other || (other instanceof EmptyWithoutContent);
        }

        public int hashCode() {
            return -1630246338;
        }

        public String toString() {
            return "EmptyWithoutContent";
        }

        private EmptyWithoutContent() {
            super(0, null);
        }
    }

    /* compiled from: HistoryPreviewListItemsState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState$EmptyWithContent;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EmptyWithContent extends HistoryPreviewListItemsState {
        public static final int $stable = 0;
        public static final EmptyWithContent INSTANCE = new EmptyWithContent();

        public boolean equals(Object other) {
            return this == other || (other instanceof EmptyWithContent);
        }

        public int hashCode() {
            return -1468258234;
        }

        public String toString() {
            return "EmptyWithContent";
        }

        private EmptyWithContent() {
            super(2, null);
        }
    }

    /* compiled from: HistoryPreviewListItemsState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState$Loading;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState;", "placeholders", "", "<init>", "(I)V", "getPlaceholders", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends HistoryPreviewListItemsState {
        public static final int $stable = 0;
        private final int placeholders;

        public static /* synthetic */ Loading copy$default(Loading loading, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = loading.placeholders;
            }
            return loading.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPlaceholders() {
            return this.placeholders;
        }

        public final Loading copy(int placeholders) {
            return new Loading(placeholders);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.placeholders == ((Loading) other).placeholders;
        }

        public int hashCode() {
            return Integer.hashCode(this.placeholders);
        }

        public String toString() {
            return "Loading(placeholders=" + this.placeholders + ")";
        }

        public final int getPlaceholders() {
            return this.placeholders;
        }

        public Loading(int i) {
            super(i + 1, null);
            this.placeholders = i;
        }
    }

    /* compiled from: HistoryPreviewListItemsState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState$Loaded;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState;", "maxRows", "", "itemCount", "<init>", "(II)V", "getMaxRows", "()I", "getItemCount", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends HistoryPreviewListItemsState {
        public static final int $stable = 0;
        private final int itemCount;
        private final int maxRows;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = loaded.maxRows;
            }
            if ((i3 & 2) != 0) {
                i2 = loaded.itemCount;
            }
            return loaded.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxRows() {
            return this.maxRows;
        }

        /* renamed from: component2, reason: from getter */
        public final int getItemCount() {
            return this.itemCount;
        }

        public final Loaded copy(int maxRows, int itemCount) {
            return new Loaded(maxRows, itemCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.maxRows == loaded.maxRows && this.itemCount == loaded.itemCount;
        }

        public int hashCode() {
            return (Integer.hashCode(this.maxRows) * 31) + Integer.hashCode(this.itemCount);
        }

        public String toString() {
            return "Loaded(maxRows=" + this.maxRows + ", itemCount=" + this.itemCount + ")";
        }

        public final int getMaxRows() {
            return this.maxRows;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public Loaded(int i, int i2) {
            super(Math.min(i, i2) + (i2 > i ? 2 : 1), null);
            this.maxRows = i;
            this.itemCount = i2;
        }
    }
}
