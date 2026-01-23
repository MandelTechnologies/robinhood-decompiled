package kotlinx.datetime.format;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.datetime.internal.format.FieldSpec5;
import kotlinx.datetime.internal.format.FieldSpec6;
import kotlinx.datetime.internal.format.FieldSpec7;

/* compiled from: LocalDateFormat.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lkotlinx/datetime/format/DateFields;", "", "<init>", "()V", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "Lkotlinx/datetime/format/DateFieldContainer;", "", "year", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "getYear", "()Lkotlinx/datetime/internal/format/GenericFieldSpec;", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getMonth", "()Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "dayOfMonth", "getDayOfMonth", "isoDayOfWeek", "getIsoDayOfWeek", "dayOfYear", "getDayOfYear", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class DateFields {
    public static final DateFields INSTANCE = new DateFields();
    private static final FieldSpec5<DateFieldContainer, Integer> year = new FieldSpec5<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.DateFields$year$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((DateFieldContainer) obj).getYear();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((DateFieldContainer) obj).setYear((Integer) obj2);
        }
    }), null, null, null, 14, null);
    private static final FieldSpec7<DateFieldContainer> month = new FieldSpec7<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.DateFields$month$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((DateFieldContainer) obj).getMonthNumber();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((DateFieldContainer) obj).setMonthNumber((Integer) obj2);
        }
    }), 1, 12, null, null, null, 56, null);
    private static final FieldSpec7<DateFieldContainer> dayOfMonth = new FieldSpec7<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.DateFields$dayOfMonth$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((DateFieldContainer) obj).getDayOfMonth();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((DateFieldContainer) obj).setDayOfMonth((Integer) obj2);
        }
    }), 1, 31, null, null, null, 56, null);
    private static final FieldSpec7<DateFieldContainer> isoDayOfWeek = new FieldSpec7<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.DateFields$isoDayOfWeek$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((DateFieldContainer) obj).getIsoDayOfWeek();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((DateFieldContainer) obj).setIsoDayOfWeek((Integer) obj2);
        }
    }), 1, 7, null, null, null, 56, null);
    private static final FieldSpec7<DateFieldContainer> dayOfYear = new FieldSpec7<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.DateFields$dayOfYear$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((DateFieldContainer) obj).getDayOfYear();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((DateFieldContainer) obj).setDayOfYear((Integer) obj2);
        }
    }), 1, 366, null, null, null, 56, null);

    private DateFields() {
    }

    public final FieldSpec5<DateFieldContainer, Integer> getYear() {
        return year;
    }

    public final FieldSpec7<DateFieldContainer> getMonth() {
        return month;
    }

    public final FieldSpec7<DateFieldContainer> getDayOfMonth() {
        return dayOfMonth;
    }

    public final FieldSpec7<DateFieldContainer> getIsoDayOfWeek() {
        return isoDayOfWeek;
    }
}
