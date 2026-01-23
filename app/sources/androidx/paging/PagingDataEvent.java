package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PagingDataEvent.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Landroidx/paging/PagingDataEvent;", "T", "", "()V", "Append", "DropAppend", "DropPrepend", "Prepend", "Refresh", "Landroidx/paging/PagingDataEvent$Append;", "Landroidx/paging/PagingDataEvent$DropAppend;", "Landroidx/paging/PagingDataEvent$DropPrepend;", "Landroidx/paging/PagingDataEvent$Prepend;", "Landroidx/paging/PagingDataEvent$Refresh;", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public abstract class PagingDataEvent<T> {
    public /* synthetic */ PagingDataEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PagingDataEvent() {
    }

    /* compiled from: PagingDataEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B'\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Landroidx/paging/PagingDataEvent$Prepend;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "inserted", "", "newPlaceholdersBefore", "oldPlaceholdersBefore", "<init>", "(Ljava/util/List;II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getInserted", "()Ljava/util/List;", "I", "getNewPlaceholdersBefore", "getOldPlaceholdersBefore", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Prepend<T> extends PagingDataEvent<T> {
        private final List<T> inserted;
        private final int newPlaceholdersBefore;
        private final int oldPlaceholdersBefore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Prepend(List<? extends T> inserted, int i, int i2) {
            super(null);
            Intrinsics.checkNotNullParameter(inserted, "inserted");
            this.inserted = inserted;
            this.newPlaceholdersBefore = i;
            this.oldPlaceholdersBefore = i2;
        }

        public boolean equals(Object other) {
            if (!(other instanceof Prepend)) {
                return false;
            }
            Prepend prepend = (Prepend) other;
            return Intrinsics.areEqual(this.inserted, prepend.inserted) && this.newPlaceholdersBefore == prepend.newPlaceholdersBefore && this.oldPlaceholdersBefore == prepend.oldPlaceholdersBefore;
        }

        public int hashCode() {
            return this.inserted.hashCode() + Integer.hashCode(this.newPlaceholdersBefore) + Integer.hashCode(this.oldPlaceholdersBefore);
        }

        public String toString() {
            return StringsKt.trimMargin$default("PagingDataEvent.Prepend loaded " + this.inserted.size() + " items (\n                    |   first item: " + CollectionsKt.firstOrNull((List) this.inserted) + "\n                    |   last item: " + CollectionsKt.lastOrNull((List) this.inserted) + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersBefore + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersBefore + "\n                    |)\n                    |", null, 1, null);
        }
    }

    /* compiled from: PagingDataEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Landroidx/paging/PagingDataEvent$Append;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "startIndex", "", "inserted", "newPlaceholdersAfter", "oldPlaceholdersAfter", "<init>", "(ILjava/util/List;II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getStartIndex", "Ljava/util/List;", "getInserted", "()Ljava/util/List;", "getNewPlaceholdersAfter", "getOldPlaceholdersAfter", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Append<T> extends PagingDataEvent<T> {
        private final List<T> inserted;
        private final int newPlaceholdersAfter;
        private final int oldPlaceholdersAfter;
        private final int startIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Append(int i, List<? extends T> inserted, int i2, int i3) {
            super(null);
            Intrinsics.checkNotNullParameter(inserted, "inserted");
            this.startIndex = i;
            this.inserted = inserted;
            this.newPlaceholdersAfter = i2;
            this.oldPlaceholdersAfter = i3;
        }

        public boolean equals(Object other) {
            if (!(other instanceof Append)) {
                return false;
            }
            Append append = (Append) other;
            return this.startIndex == append.startIndex && Intrinsics.areEqual(this.inserted, append.inserted) && this.newPlaceholdersAfter == append.newPlaceholdersAfter && this.oldPlaceholdersAfter == append.oldPlaceholdersAfter;
        }

        public int hashCode() {
            return Integer.hashCode(this.startIndex) + this.inserted.hashCode() + Integer.hashCode(this.newPlaceholdersAfter) + Integer.hashCode(this.oldPlaceholdersAfter);
        }

        public String toString() {
            return StringsKt.trimMargin$default("PagingDataEvent.Append loaded " + this.inserted.size() + " items (\n                    |   startIndex: " + this.startIndex + "\n                    |   first item: " + CollectionsKt.firstOrNull((List) this.inserted) + "\n                    |   last item: " + CollectionsKt.lastOrNull((List) this.inserted) + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersAfter + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersAfter + "\n                    |)\n                    |", null, 1, null);
        }
    }

    /* compiled from: PagingDataEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B%\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m3636d2 = {"Landroidx/paging/PagingDataEvent$Refresh;", "", "T", "Landroidx/paging/PagingDataEvent;", "Landroidx/paging/PlaceholderPaddedList;", "newList", "previousList", "<init>", "(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/paging/PlaceholderPaddedList;", "getNewList", "()Landroidx/paging/PlaceholderPaddedList;", "getPreviousList", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Refresh<T> extends PagingDataEvent<T> {
        private final PlaceholderPaddedList<T> newList;
        private final PlaceholderPaddedList<T> previousList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Refresh(PlaceholderPaddedList<T> newList, PlaceholderPaddedList<T> previousList) {
            super(null);
            Intrinsics.checkNotNullParameter(newList, "newList");
            Intrinsics.checkNotNullParameter(previousList, "previousList");
            this.newList = newList;
            this.previousList = previousList;
        }

        public boolean equals(Object other) {
            if (!(other instanceof Refresh)) {
                return false;
            }
            Refresh refresh = (Refresh) other;
            return this.newList.getPlaceholdersBefore() == refresh.newList.getPlaceholdersBefore() && this.newList.getPlaceholdersAfter() == refresh.newList.getPlaceholdersAfter() && this.newList.getSize() == refresh.newList.getSize() && this.newList.getDataCount() == refresh.newList.getDataCount() && this.previousList.getPlaceholdersBefore() == refresh.previousList.getPlaceholdersBefore() && this.previousList.getPlaceholdersAfter() == refresh.previousList.getPlaceholdersAfter() && this.previousList.getSize() == refresh.previousList.getSize() && this.previousList.getDataCount() == refresh.previousList.getDataCount();
        }

        public int hashCode() {
            return this.newList.hashCode() + this.previousList.hashCode();
        }

        public String toString() {
            return StringsKt.trimMargin$default("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + this.newList.getPlaceholdersBefore() + "\n                    |       placeholdersAfter: " + this.newList.getPlaceholdersAfter() + "\n                    |       size: " + this.newList.getSize() + "\n                    |       dataCount: " + this.newList.getDataCount() + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + this.previousList.getPlaceholdersBefore() + "\n                    |       placeholdersAfter: " + this.previousList.getPlaceholdersAfter() + "\n                    |       size: " + this.previousList.getSize() + "\n                    |       dataCount: " + this.previousList.getDataCount() + "\n                    |   )\n                    |", null, 1, null);
        }
    }

    /* compiled from: PagingDataEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Landroidx/paging/PagingDataEvent$DropPrepend;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "dropCount", "newPlaceholdersBefore", "oldPlaceholdersBefore", "<init>", "(III)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getDropCount", "getNewPlaceholdersBefore", "getOldPlaceholdersBefore", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DropPrepend<T> extends PagingDataEvent<T> {
        private final int dropCount;
        private final int newPlaceholdersBefore;
        private final int oldPlaceholdersBefore;

        public DropPrepend(int i, int i2, int i3) {
            super(null);
            this.dropCount = i;
            this.newPlaceholdersBefore = i2;
            this.oldPlaceholdersBefore = i3;
        }

        public boolean equals(Object other) {
            if (!(other instanceof DropPrepend)) {
                return false;
            }
            DropPrepend dropPrepend = (DropPrepend) other;
            return this.dropCount == dropPrepend.dropCount && this.newPlaceholdersBefore == dropPrepend.newPlaceholdersBefore && this.oldPlaceholdersBefore == dropPrepend.oldPlaceholdersBefore;
        }

        public int hashCode() {
            return Integer.hashCode(this.dropCount) + Integer.hashCode(this.newPlaceholdersBefore) + Integer.hashCode(this.oldPlaceholdersBefore);
        }

        public String toString() {
            return StringsKt.trimMargin$default("PagingDataEvent.DropPrepend dropped " + this.dropCount + " items (\n                    |   dropCount: " + this.dropCount + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersBefore + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersBefore + "\n                    |)\n                    |", null, 1, null);
        }
    }

    /* compiled from: PagingDataEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Landroidx/paging/PagingDataEvent$DropAppend;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "startIndex", "dropCount", "newPlaceholdersAfter", "oldPlaceholdersAfter", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getStartIndex", "getDropCount", "getNewPlaceholdersAfter", "getOldPlaceholdersAfter", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DropAppend<T> extends PagingDataEvent<T> {
        private final int dropCount;
        private final int newPlaceholdersAfter;
        private final int oldPlaceholdersAfter;
        private final int startIndex;

        public DropAppend(int i, int i2, int i3, int i4) {
            super(null);
            this.startIndex = i;
            this.dropCount = i2;
            this.newPlaceholdersAfter = i3;
            this.oldPlaceholdersAfter = i4;
        }

        public boolean equals(Object other) {
            if (!(other instanceof DropAppend)) {
                return false;
            }
            DropAppend dropAppend = (DropAppend) other;
            return this.startIndex == dropAppend.startIndex && this.dropCount == dropAppend.dropCount && this.newPlaceholdersAfter == dropAppend.newPlaceholdersAfter && this.oldPlaceholdersAfter == dropAppend.oldPlaceholdersAfter;
        }

        public int hashCode() {
            return Integer.hashCode(this.startIndex) + Integer.hashCode(this.dropCount) + Integer.hashCode(this.newPlaceholdersAfter) + Integer.hashCode(this.oldPlaceholdersAfter);
        }

        public String toString() {
            return StringsKt.trimMargin$default("PagingDataEvent.DropAppend dropped " + this.dropCount + " items (\n                    |   startIndex: " + this.startIndex + "\n                    |   dropCount: " + this.dropCount + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersAfter + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersAfter + "\n                    |)\n                    |", null, 1, null);
        }
    }
}
