package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.datetime.internal.format.FieldSpec5;
import kotlinx.datetime.internal.format.FieldSpec6;
import kotlinx.datetime.internal.format.FieldSpec7;
import kotlinx.datetime.internal.math;

/* compiled from: LocalTimeFormat.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, m3636d2 = {"Lkotlinx/datetime/format/TimeFields;", "", "<init>", "()V", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "Lkotlinx/datetime/format/TimeFieldContainer;", "hour", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getHour", "()Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "minute", "getMinute", "second", "getSecond", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "Lkotlinx/datetime/internal/DecimalFraction;", "fractionOfSecond", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "getFractionOfSecond", "()Lkotlinx/datetime/internal/format/GenericFieldSpec;", "Lkotlinx/datetime/format/AmPmMarker;", "amPm", "getAmPm", "hourOfAmPm", "getHourOfAmPm", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class TimeFields {
    public static final TimeFields INSTANCE = new TimeFields();
    private static final FieldSpec7<TimeFieldContainer> hour = new FieldSpec7<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$hour$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((TimeFieldContainer) obj).getHour();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((TimeFieldContainer) obj).setHour((Integer) obj2);
        }
    }), 0, 23, null, null, null, 56, null);
    private static final FieldSpec7<TimeFieldContainer> minute = new FieldSpec7<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$minute$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((TimeFieldContainer) obj).getMinute();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((TimeFieldContainer) obj).setMinute((Integer) obj2);
        }
    }), 0, 59, null, null, null, 56, null);
    private static final FieldSpec7<TimeFieldContainer> second = new FieldSpec7<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$second$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((TimeFieldContainer) obj).getSecond();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((TimeFieldContainer) obj).setSecond((Integer) obj2);
        }
    }), 0, 59, null, 0, null, 40, null);
    private static final FieldSpec5<TimeFieldContainer, math> fractionOfSecond = new FieldSpec5<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$fractionOfSecond$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((TimeFieldContainer) obj).getFractionOfSecond();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((TimeFieldContainer) obj).setFractionOfSecond((math) obj2);
        }
    }), null, new math(0, 9), null, 10, null);
    private static final FieldSpec5<TimeFieldContainer, AmPmMarker> amPm = new FieldSpec5<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$amPm$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((TimeFieldContainer) obj).getAmPm();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((TimeFieldContainer) obj).setAmPm((AmPmMarker) obj2);
        }
    }), null, null, null, 14, null);
    private static final FieldSpec7<TimeFieldContainer> hourOfAmPm = new FieldSpec7<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$hourOfAmPm$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((TimeFieldContainer) obj).getHourOfAmPm();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((TimeFieldContainer) obj).setHourOfAmPm((Integer) obj2);
        }
    }), 1, 12, null, null, null, 56, null);

    private TimeFields() {
    }

    public final FieldSpec7<TimeFieldContainer> getHour() {
        return hour;
    }

    public final FieldSpec7<TimeFieldContainer> getMinute() {
        return minute;
    }

    public final FieldSpec7<TimeFieldContainer> getSecond() {
        return second;
    }

    public final FieldSpec5<TimeFieldContainer, math> getFractionOfSecond() {
        return fractionOfSecond;
    }
}
