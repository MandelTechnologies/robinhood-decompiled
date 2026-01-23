package array;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Sort.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Larray/SortOrder;", "", "()V", "Ascending", "Descending", "Unknown", "Larray/SortOrder$Ascending;", "Larray/SortOrder$Descending;", "Larray/SortOrder$Unknown;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: array.SortOrder, reason: use source file name */
/* loaded from: classes16.dex */
abstract class Sort4 {
    public /* synthetic */ Sort4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: Sort.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Larray/SortOrder$Descending;", "Larray/SortOrder;", "()V", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: array.SortOrder$Descending */
    public static final class Descending extends Sort4 {
        public static final Descending INSTANCE = new Descending();

        private Descending() {
            super(null);
        }
    }

    private Sort4() {
    }

    /* compiled from: Sort.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Larray/SortOrder$Ascending;", "Larray/SortOrder;", "()V", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: array.SortOrder$Ascending */
    public static final class Ascending extends Sort4 {
        public static final Ascending INSTANCE = new Ascending();

        private Ascending() {
            super(null);
        }
    }

    /* compiled from: Sort.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Larray/SortOrder$Unknown;", "Larray/SortOrder;", "()V", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: array.SortOrder$Unknown */
    public static final class Unknown extends Sort4 {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(null);
        }
    }
}
