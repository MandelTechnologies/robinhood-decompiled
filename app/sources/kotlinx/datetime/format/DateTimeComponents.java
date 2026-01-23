package kotlinx.datetime.format;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.UtcOffsetJvm;
import kotlinx.datetime.format.DateTimeComponentsFormat;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.internal.format.Builder2;
import kotlinx.datetime.internal.mathJvm;

/* compiled from: DateTimeComponents.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b9\u0018\u0000 I2\u00020\u0001:\u0002IJB\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R/\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R/\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R/\u0010#\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R/\u0010'\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R/\u0010+\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019R/\u0010/\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R/\u00103\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010\u0019R/\u00107\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0015\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u0010\u0019R/\u0010;\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0015\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010\u0019R/\u0010?\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u0015\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010\u0019R/\u0010D\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b@\u0010\u0017\"\u0004\bA\u0010\u0019*\u0004\bB\u0010CR(\u0010H\u001a\u0004\u0018\u00010\u00122\b\u0010E\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010\u0017\"\u0004\bG\u0010\u0019¨\u0006K"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeComponents;", "", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "contents", "<init>", "(Lkotlinx/datetime/format/DateTimeComponentsContents;)V", "Lkotlinx/datetime/UtcOffset;", "toUtcOffset", "()Lkotlinx/datetime/UtcOffset;", "Lkotlinx/datetime/LocalTime;", "toLocalTime", "()Lkotlinx/datetime/LocalTime;", "Lkotlinx/datetime/Instant;", "toInstantUsingOffset", "()Lkotlinx/datetime/Instant;", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "getContents$kotlinx_datetime", "()Lkotlinx/datetime/format/DateTimeComponentsContents;", "", "<set-?>", "monthNumber$delegate", "Lkotlinx/datetime/format/TwoDigitNumber;", "getMonthNumber", "()Ljava/lang/Integer;", "setMonthNumber", "(Ljava/lang/Integer;)V", "monthNumber", "dayOfMonth$delegate", "getDayOfMonth", "setDayOfMonth", "dayOfMonth", "dayOfYear$delegate", "Lkotlinx/datetime/format/ThreeDigitNumber;", "getDayOfYear", "setDayOfYear", "dayOfYear", "hour$delegate", "getHour", "setHour", "hour", "hourOfAmPm$delegate", "getHourOfAmPm", "setHourOfAmPm", "hourOfAmPm", "minute$delegate", "getMinute", "setMinute", "minute", "second$delegate", "getSecond", "setSecond", "second", "offsetHours$delegate", "getOffsetHours", "setOffsetHours", "offsetHours", "offsetMinutesOfHour$delegate", "getOffsetMinutesOfHour", "setOffsetMinutesOfHour", "offsetMinutesOfHour", "offsetSecondsOfMinute$delegate", "getOffsetSecondsOfMinute", "setOffsetSecondsOfMinute", "offsetSecondsOfMinute", "getYear", "setYear", "getYear$delegate", "(Lkotlinx/datetime/format/DateTimeComponents;)Ljava/lang/Object;", "year", "value", "getNanosecond", "setNanosecond", "nanosecond", "Companion", "Formats", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class DateTimeComponents {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateTimeComponents.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateTimeComponents.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateTimeComponents.class, "dayOfYear", "getDayOfYear()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateTimeComponents.class, "hour", "getHour()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateTimeComponents.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateTimeComponents.class, "minute", "getMinute()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateTimeComponents.class, "second", "getSecond()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateTimeComponents.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateTimeComponents.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateTimeComponents.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DateTimeComponentsContents contents;

    /* renamed from: dayOfMonth$delegate, reason: from kotlin metadata */
    private final TwoDigitNumber dayOfMonth;

    /* renamed from: dayOfYear$delegate, reason: from kotlin metadata */
    private final ThreeDigitNumber dayOfYear;

    /* renamed from: hour$delegate, reason: from kotlin metadata */
    private final TwoDigitNumber hour;

    /* renamed from: hourOfAmPm$delegate, reason: from kotlin metadata */
    private final TwoDigitNumber hourOfAmPm;

    /* renamed from: minute$delegate, reason: from kotlin metadata */
    private final TwoDigitNumber minute;

    /* renamed from: monthNumber$delegate, reason: from kotlin metadata */
    private final TwoDigitNumber monthNumber;

    /* renamed from: offsetHours$delegate, reason: from kotlin metadata */
    private final TwoDigitNumber offsetHours;

    /* renamed from: offsetMinutesOfHour$delegate, reason: from kotlin metadata */
    private final TwoDigitNumber offsetMinutesOfHour;

    /* renamed from: offsetSecondsOfMinute$delegate, reason: from kotlin metadata */
    private final TwoDigitNumber offsetSecondsOfMinute;

    /* renamed from: second$delegate, reason: from kotlin metadata */
    private final TwoDigitNumber second;

    /* JADX WARN: Multi-variable type inference failed */
    public DateTimeComponents() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* compiled from: DateTimeComponents.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeComponents$Companion;", "", "()V", "Format", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "block", "Lkotlin/Function1;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "", "Lkotlin/ExtensionFunctionType;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DateTimeFormat<DateTimeComponents> Format(Function1<? super DateTimeFormatBuilder.WithDateTimeComponents, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            DateTimeComponentsFormat.Builder builder = new DateTimeComponentsFormat.Builder(new Builder2());
            block.invoke(builder);
            return new DateTimeComponentsFormat(builder.build());
        }
    }

    public DateTimeComponents(DateTimeComponentsContents contents) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        this.contents = contents;
        contents.getDate();
        final IncompleteLocalDate date = contents.getDate();
        this.monthNumber = new TwoDigitNumber(new MutablePropertyReference0Impl(date) { // from class: kotlinx.datetime.format.DateTimeComponents$monthNumber$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((IncompleteLocalDate) this.receiver).getMonthNumber();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((IncompleteLocalDate) this.receiver).setMonthNumber((Integer) obj);
            }
        });
        final IncompleteLocalDate date2 = contents.getDate();
        this.dayOfMonth = new TwoDigitNumber(new MutablePropertyReference0Impl(date2) { // from class: kotlinx.datetime.format.DateTimeComponents$dayOfMonth$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((IncompleteLocalDate) this.receiver).getDayOfMonth();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((IncompleteLocalDate) this.receiver).setDayOfMonth((Integer) obj);
            }
        });
        final IncompleteLocalDate date3 = contents.getDate();
        this.dayOfYear = new ThreeDigitNumber(new MutablePropertyReference0Impl(date3) { // from class: kotlinx.datetime.format.DateTimeComponents$dayOfYear$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((IncompleteLocalDate) this.receiver).getDayOfYear();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((IncompleteLocalDate) this.receiver).setDayOfYear((Integer) obj);
            }
        });
        final IncompleteLocalTime time = contents.getTime();
        this.hour = new TwoDigitNumber(new MutablePropertyReference0Impl(time) { // from class: kotlinx.datetime.format.DateTimeComponents$hour$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((IncompleteLocalTime) this.receiver).getHour();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((IncompleteLocalTime) this.receiver).setHour((Integer) obj);
            }
        });
        final IncompleteLocalTime time2 = contents.getTime();
        this.hourOfAmPm = new TwoDigitNumber(new MutablePropertyReference0Impl(time2) { // from class: kotlinx.datetime.format.DateTimeComponents$hourOfAmPm$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((IncompleteLocalTime) this.receiver).getHourOfAmPm();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((IncompleteLocalTime) this.receiver).setHourOfAmPm((Integer) obj);
            }
        });
        contents.getTime();
        final IncompleteLocalTime time3 = contents.getTime();
        this.minute = new TwoDigitNumber(new MutablePropertyReference0Impl(time3) { // from class: kotlinx.datetime.format.DateTimeComponents$minute$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((IncompleteLocalTime) this.receiver).getMinute();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((IncompleteLocalTime) this.receiver).setMinute((Integer) obj);
            }
        });
        final IncompleteLocalTime time4 = contents.getTime();
        this.second = new TwoDigitNumber(new MutablePropertyReference0Impl(time4) { // from class: kotlinx.datetime.format.DateTimeComponents$second$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((IncompleteLocalTime) this.receiver).getSecond();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((IncompleteLocalTime) this.receiver).setSecond((Integer) obj);
            }
        });
        contents.getOffset();
        final IncompleteUtcOffset offset = contents.getOffset();
        this.offsetHours = new TwoDigitNumber(new MutablePropertyReference0Impl(offset) { // from class: kotlinx.datetime.format.DateTimeComponents$offsetHours$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((IncompleteUtcOffset) this.receiver).getTotalHoursAbs();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((IncompleteUtcOffset) this.receiver).setTotalHoursAbs((Integer) obj);
            }
        });
        final IncompleteUtcOffset offset2 = contents.getOffset();
        this.offsetMinutesOfHour = new TwoDigitNumber(new MutablePropertyReference0Impl(offset2) { // from class: kotlinx.datetime.format.DateTimeComponents$offsetMinutesOfHour$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((IncompleteUtcOffset) this.receiver).getMinutesOfHour();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((IncompleteUtcOffset) this.receiver).setMinutesOfHour((Integer) obj);
            }
        });
        final IncompleteUtcOffset offset3 = contents.getOffset();
        this.offsetSecondsOfMinute = new TwoDigitNumber(new MutablePropertyReference0Impl(offset3) { // from class: kotlinx.datetime.format.DateTimeComponents$offsetSecondsOfMinute$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((IncompleteUtcOffset) this.receiver).getSecondsOfMinute();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((IncompleteUtcOffset) this.receiver).setSecondsOfMinute((Integer) obj);
            }
        });
    }

    public /* synthetic */ DateTimeComponents(DateTimeComponentsContents dateTimeComponentsContents, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            dateTimeComponentsContents = new DateTimeComponentsContents(null, null, null, null, 15, null);
        }
        this(dateTimeComponentsContents);
    }

    /* compiled from: DateTimeComponents.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeComponents$Formats;", "", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "ISO_DATE_TIME_OFFSET", "Lkotlinx/datetime/format/DateTimeFormat;", "getISO_DATE_TIME_OFFSET", "()Lkotlinx/datetime/format/DateTimeFormat;", "RFC_1123", "getRFC_1123", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Formats {
        public static final Formats INSTANCE = new Formats();
        private static final DateTimeFormat<DateTimeComponents> ISO_DATE_TIME_OFFSET;
        private static final DateTimeFormat<DateTimeComponents> RFC_1123;

        private Formats() {
        }

        static {
            Companion companion = DateTimeComponents.INSTANCE;
            ISO_DATE_TIME_OFFSET = companion.Format(new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                    invoke2(withDateTimeComponents);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents Format) {
                    Intrinsics.checkNotNullParameter(Format, "$this$Format");
                    Format.date(LocalDateFormatKt.getISO_DATE());
                    DateTimeFormatBuilder3.alternativeParsing(Format, new Function1[]{new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            DateTimeFormatBuilder3.m28853char(alternativeParsing, 't');
                        }
                    }}, new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            DateTimeFormatBuilder3.m28853char(alternativeParsing, 'T');
                        }
                    });
                    DateTimeFormatBuilder.WithTime.DefaultImpls.hour$default(Format, null, 1, null);
                    DateTimeFormatBuilder3.m28853char(Format, ':');
                    DateTimeFormatBuilder.WithTime.DefaultImpls.minute$default(Format, null, 1, null);
                    DateTimeFormatBuilder3.m28853char(Format, ':');
                    DateTimeFormatBuilder.WithTime.DefaultImpls.second$default(Format, null, 1, null);
                    DateTimeFormatBuilder3.optional$default(Format, null, new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents optional) {
                            Intrinsics.checkNotNullParameter(optional, "$this$optional");
                            DateTimeFormatBuilder3.m28853char(optional, '.');
                            optional.secondFraction(1, 9);
                        }
                    }, 1, null);
                    DateTimeFormatBuilder3.alternativeParsing(Format, new Function1[]{new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            DateTimeFormatBuilder.WithUtcOffset.DefaultImpls.offsetHours$default(alternativeParsing, null, 1, null);
                        }
                    }}, new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$ISO_DATE_TIME_OFFSET$1.5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            alternativeParsing.offset(UtcOffsetJvm.Formats.INSTANCE.getISO());
                        }
                    });
                }
            });
            RFC_1123 = companion.Format(new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                    invoke2(withDateTimeComponents);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents Format) {
                    Intrinsics.checkNotNullParameter(Format, "$this$Format");
                    DateTimeFormatBuilder3.alternativeParsing(Format, new Function1[]{new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }
                    }}, new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            alternativeParsing.dayOfWeek(DayOfWeekNames.INSTANCE.getENGLISH_ABBREVIATED());
                            alternativeParsing.chars(", ");
                        }
                    });
                    Format.dayOfMonth(DateTimeFormat3.NONE);
                    DateTimeFormatBuilder3.m28853char(Format, ' ');
                    Format.monthName(MonthNames.INSTANCE.getENGLISH_ABBREVIATED());
                    DateTimeFormatBuilder3.m28853char(Format, ' ');
                    DateTimeFormatBuilder.WithDate.DefaultImpls.year$default(Format, null, 1, null);
                    DateTimeFormatBuilder3.m28853char(Format, ' ');
                    DateTimeFormatBuilder.WithTime.DefaultImpls.hour$default(Format, null, 1, null);
                    DateTimeFormatBuilder3.m28853char(Format, ':');
                    DateTimeFormatBuilder.WithTime.DefaultImpls.minute$default(Format, null, 1, null);
                    DateTimeFormatBuilder3.optional$default(Format, null, new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents optional) {
                            Intrinsics.checkNotNullParameter(optional, "$this$optional");
                            DateTimeFormatBuilder3.m28853char(optional, ':');
                            DateTimeFormatBuilder.WithTime.DefaultImpls.second$default(optional, null, 1, null);
                        }
                    }, 1, null);
                    Format.chars(PlaceholderUtils.XXShortPlaceholderText);
                    DateTimeFormatBuilder3.alternativeParsing(Format, new Function1[]{new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            alternativeParsing.chars("UT");
                        }
                    }, new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            alternativeParsing.chars("Z");
                        }
                    }}, new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents$Formats$RFC_1123$1.6
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                            invoke2(withDateTimeComponents);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            DateTimeFormatBuilder3.optional(alternativeParsing, "GMT", new Function1<DateTimeFormatBuilder.WithDateTimeComponents, Unit>() { // from class: kotlinx.datetime.format.DateTimeComponents.Formats.RFC_1123.1.6.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
                                    invoke2(withDateTimeComponents);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DateTimeFormatBuilder.WithDateTimeComponents optional) {
                                    Intrinsics.checkNotNullParameter(optional, "$this$optional");
                                    optional.offset(UtcOffsetJvm.Formats.INSTANCE.getFOUR_DIGITS());
                                }
                            });
                        }
                    });
                }
            });
        }

        public final DateTimeFormat<DateTimeComponents> getISO_DATE_TIME_OFFSET() {
            return ISO_DATE_TIME_OFFSET;
        }
    }

    public final Integer getYear() {
        return this.contents.getDate().getYear();
    }

    public final Integer getNanosecond() {
        return this.contents.getTime().getNanosecond();
    }

    public final UtcOffsetJvm toUtcOffset() {
        return this.contents.getOffset().toUtcOffset();
    }

    public final LocalTime toLocalTime() {
        return this.contents.getTime().toLocalTime();
    }

    public final Instant toInstantUsingOffset() {
        UtcOffsetJvm utcOffset = toUtcOffset();
        LocalTime localTime = toLocalTime();
        IncompleteLocalDate incompleteLocalDateCopy2 = this.contents.getDate().copy();
        incompleteLocalDateCopy2.setYear(Integer.valueOf(((Number) LocalDateFormatKt.requireParsedField(incompleteLocalDateCopy2.getYear(), "year")).intValue() % 10000));
        try {
            Intrinsics.checkNotNull(getYear());
            long jSafeAdd = mathJvm.safeAdd(mathJvm.safeMultiply(r4.intValue() / 10000, 315569520000L), ((incompleteLocalDateCopy2.toLocalDate().toEpochDays() * OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC) + localTime.toSecondOfDay()) - utcOffset.getTotalSeconds());
            Instant.Companion companion = Instant.INSTANCE;
            if (jSafeAdd < companion.getMIN$kotlinx_datetime().getEpochSeconds() || jSafeAdd > companion.getMAX$kotlinx_datetime().getEpochSeconds()) {
                throw new DateTimeFormatException("The parsed date is outside the range representable by Instant");
            }
            Integer nanosecond = getNanosecond();
            return companion.fromEpochSeconds(jSafeAdd, nanosecond != null ? nanosecond.intValue() : 0);
        } catch (ArithmeticException e) {
            throw new DateTimeFormatException("The parsed date is outside the range representable by Instant", e);
        }
    }
}
