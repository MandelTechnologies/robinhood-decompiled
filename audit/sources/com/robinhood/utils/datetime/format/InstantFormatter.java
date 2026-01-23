package com.robinhood.utils.datetime.format;

import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.TemporalTransformer;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstantFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/InstantFormatter;", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/Instant", "", "delegate", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/datetime/format/TemporalFormatter;)V", "j$/time/format/DateTimeFormatter", "formatter", "(Ljava/lang/String;ILj$/time/format/DateTimeFormatter;)V", "temporal", "", "format", "(Lj$/time/Instant;)Ljava/lang/String;", "SHORT_TIME_IN_SYSTEM_ZONE_NO_AM_PM", "SHORT_TIME_IN_SYSTEM_ZONE", "SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE", "SHORT_DATE_IN_SYSTEM_ZONE", "SHORT_DATE_WITH_OPTIONAL_YEAR_IN_SYSTEM_ZONE", "DATE_IN_UTC", "DATE_NO_YEAR_IN_UTC", "DATE_IN_SYSTEM_ZONE", "DATE_NO_YEAR_IN_SYSTEM_ZONE", "DATE_WITHOUT_PADDING_NO_YEAR_IN_SYSTEM_ZONE", "DATE_WITHOUT_PADDING_OPTIONAL_YEAR_IN_SYSTEM_ZONE", "DATETIME_IN_SYSTEM_ZONE", "WEEKDAY_DATETIME_IN_SYSTEM_ZONE", "WEEKDAY_DATETIME_IN_SYSTEM_ZONE_REVERSED", "WEEKDAY_IN_SYSTEM_ZONE", "MEDIUM_DATETIME_IN_SYSTEM_ZONE", "MEDIUM_DATE_IN_SYSTEM_ZONE", "LONG_TIMESTAMP_IN_SYSTEM_ZONE", "LONG_NO_YEAR_TIMESTAMP_IN_SYSTEM_ZONE", "LONG_TIMESTAMP_WITH_ZONE_IN_SYSTEM_ZONE", "NATURAL_TIMESTAMP_IN_SYSTEM_ZONE", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class InstantFormatter implements TemporalFormatter<Instant> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstantFormatter[] $VALUES;
    public static final InstantFormatter DATETIME_IN_SYSTEM_ZONE;
    public static final InstantFormatter DATE_IN_SYSTEM_ZONE;
    public static final InstantFormatter DATE_IN_UTC;
    public static final InstantFormatter DATE_NO_YEAR_IN_SYSTEM_ZONE;
    public static final InstantFormatter DATE_NO_YEAR_IN_UTC;
    public static final InstantFormatter DATE_WITHOUT_PADDING_NO_YEAR_IN_SYSTEM_ZONE;
    public static final InstantFormatter DATE_WITHOUT_PADDING_OPTIONAL_YEAR_IN_SYSTEM_ZONE;
    public static final InstantFormatter LONG_NO_YEAR_TIMESTAMP_IN_SYSTEM_ZONE;
    public static final InstantFormatter LONG_TIMESTAMP_IN_SYSTEM_ZONE;
    public static final InstantFormatter LONG_TIMESTAMP_WITH_ZONE_IN_SYSTEM_ZONE;
    public static final InstantFormatter MEDIUM_DATETIME_IN_SYSTEM_ZONE;
    public static final InstantFormatter MEDIUM_DATE_IN_SYSTEM_ZONE;
    public static final InstantFormatter NATURAL_TIMESTAMP_IN_SYSTEM_ZONE;
    public static final InstantFormatter SHORT_DATE_IN_SYSTEM_ZONE;
    public static final InstantFormatter SHORT_DATE_WITH_OPTIONAL_YEAR_IN_SYSTEM_ZONE;
    public static final InstantFormatter SHORT_TIME_IN_SYSTEM_ZONE;
    public static final InstantFormatter SHORT_TIME_IN_SYSTEM_ZONE_NO_AM_PM;
    public static final InstantFormatter SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE;
    public static final InstantFormatter WEEKDAY_DATETIME_IN_SYSTEM_ZONE;
    public static final InstantFormatter WEEKDAY_DATETIME_IN_SYSTEM_ZONE_REVERSED;
    public static final InstantFormatter WEEKDAY_IN_SYSTEM_ZONE;
    private final /* synthetic */ TemporalFormatter<Instant> $$delegate_0;

    private static final /* synthetic */ InstantFormatter[] $values() {
        return new InstantFormatter[]{SHORT_TIME_IN_SYSTEM_ZONE_NO_AM_PM, SHORT_TIME_IN_SYSTEM_ZONE, SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE, SHORT_DATE_IN_SYSTEM_ZONE, SHORT_DATE_WITH_OPTIONAL_YEAR_IN_SYSTEM_ZONE, DATE_IN_UTC, DATE_NO_YEAR_IN_UTC, DATE_IN_SYSTEM_ZONE, DATE_NO_YEAR_IN_SYSTEM_ZONE, DATE_WITHOUT_PADDING_NO_YEAR_IN_SYSTEM_ZONE, DATE_WITHOUT_PADDING_OPTIONAL_YEAR_IN_SYSTEM_ZONE, DATETIME_IN_SYSTEM_ZONE, WEEKDAY_DATETIME_IN_SYSTEM_ZONE, WEEKDAY_DATETIME_IN_SYSTEM_ZONE_REVERSED, WEEKDAY_IN_SYSTEM_ZONE, MEDIUM_DATETIME_IN_SYSTEM_ZONE, MEDIUM_DATE_IN_SYSTEM_ZONE, LONG_TIMESTAMP_IN_SYSTEM_ZONE, LONG_NO_YEAR_TIMESTAMP_IN_SYSTEM_ZONE, LONG_TIMESTAMP_WITH_ZONE_IN_SYSTEM_ZONE, NATURAL_TIMESTAMP_IN_SYSTEM_ZONE};
    }

    public static EnumEntries<InstantFormatter> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.utils.datetime.format.TemporalFormatter
    public String format(Instant temporal) {
        Intrinsics.checkNotNullParameter(temporal, "temporal");
        return this.$$delegate_0.format(temporal);
    }

    private InstantFormatter(String str, int i, TemporalFormatter temporalFormatter) {
        this.$$delegate_0 = temporalFormatter;
    }

    static {
        TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
        final LocalTimeFormatter localTimeFormatter = LocalTimeFormatter.SHORT_NO_AM_PM;
        SHORT_TIME_IN_SYSTEM_ZONE_NO_AM_PM = new InstantFormatter("SHORT_TIME_IN_SYSTEM_ZONE_NO_AM_PM", 0, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localTimeFormatter;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$1.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).toLocalTime();
                    }
                });
            }
        }));
        final LocalTimeFormatter localTimeFormatter2 = LocalTimeFormatter.SHORT;
        SHORT_TIME_IN_SYSTEM_ZONE = new InstantFormatter("SHORT_TIME_IN_SYSTEM_ZONE", 1, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localTimeFormatter2;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$2.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).toLocalTime();
                    }
                });
            }
        }));
        final LocalTimeFormatter localTimeFormatter3 = LocalTimeFormatter.SHORT_OPTIONAL_MINUTE;
        SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE = new InstantFormatter("SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE", 2, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localTimeFormatter3;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$3.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).toLocalTime();
                    }
                });
            }
        }));
        final LocalDateFormatter localDateFormatter = LocalDateFormatter.SHORT;
        SHORT_DATE_IN_SYSTEM_ZONE = new InstantFormatter("SHORT_DATE_IN_SYSTEM_ZONE", 3, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateFormatter;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$4.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3459a();
                    }
                });
            }
        }));
        final LocalDateFormatter localDateFormatter2 = LocalDateFormatter.SHORT_WITH_OPTIONAL_YEAR;
        SHORT_DATE_WITH_OPTIONAL_YEAR_IN_SYSTEM_ZONE = new InstantFormatter("SHORT_DATE_WITH_OPTIONAL_YEAR_IN_SYSTEM_ZONE", 4, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateFormatter2;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$5.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3459a();
                    }
                });
            }
        }));
        final LocalDateFormatter localDateFormatter3 = LocalDateFormatter.MEDIUM;
        DATE_IN_UTC = new InstantFormatter("DATE_IN_UTC", 5, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$6
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateFormatter3;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$6.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atOffset(ZoneOffset.UTC).toLocalDate();
                    }
                });
            }
        }));
        final LocalDateFormatter localDateFormatter4 = LocalDateFormatter.MEDIUM_NO_YEAR;
        DATE_NO_YEAR_IN_UTC = new InstantFormatter("DATE_NO_YEAR_IN_UTC", 6, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$7
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateFormatter4;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$7.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atOffset(ZoneOffset.UTC).toLocalDate();
                    }
                });
            }
        }));
        DATE_IN_SYSTEM_ZONE = new InstantFormatter("DATE_IN_SYSTEM_ZONE", 7, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$8
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateFormatter3;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$8.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3459a();
                    }
                });
            }
        }));
        DATE_NO_YEAR_IN_SYSTEM_ZONE = new InstantFormatter("DATE_NO_YEAR_IN_SYSTEM_ZONE", 8, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$9
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateFormatter4;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$9.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3459a();
                    }
                });
            }
        }));
        final LocalDateFormatter localDateFormatter5 = LocalDateFormatter.MEDIUM_WITHOUT_PADDING_NO_YEAR;
        DATE_WITHOUT_PADDING_NO_YEAR_IN_SYSTEM_ZONE = new InstantFormatter("DATE_WITHOUT_PADDING_NO_YEAR_IN_SYSTEM_ZONE", 9, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$10
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateFormatter5;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$10.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3459a();
                    }
                });
            }
        }));
        final LocalDateFormatter localDateFormatter6 = LocalDateFormatter.MEDIUM_WITHOUT_PADDING_OPTIONAL_YEAR;
        DATE_WITHOUT_PADDING_OPTIONAL_YEAR_IN_SYSTEM_ZONE = new InstantFormatter("DATE_WITHOUT_PADDING_OPTIONAL_YEAR_IN_SYSTEM_ZONE", 10, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$11
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateFormatter6;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$11.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3459a();
                    }
                });
            }
        }));
        final LocalDateTimeFormatter localDateTimeFormatter = LocalDateTimeFormatter.DEFAULT;
        DATETIME_IN_SYSTEM_ZONE = new InstantFormatter("DATETIME_IN_SYSTEM_ZONE", 11, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$12
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateTimeFormatter;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$12.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3461d();
                    }
                });
            }
        }));
        final LocalDateTimeFormatter localDateTimeFormatter2 = LocalDateTimeFormatter.WEEKDAY;
        WEEKDAY_DATETIME_IN_SYSTEM_ZONE = new InstantFormatter("WEEKDAY_DATETIME_IN_SYSTEM_ZONE", 12, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$13
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateTimeFormatter2;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$13.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3461d();
                    }
                });
            }
        }));
        final LocalDateTimeFormatter localDateTimeFormatter3 = LocalDateTimeFormatter.WEEKDAY_REVERSED;
        WEEKDAY_DATETIME_IN_SYSTEM_ZONE_REVERSED = new InstantFormatter("WEEKDAY_DATETIME_IN_SYSTEM_ZONE_REVERSED", 13, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$14
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateTimeFormatter3;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$14.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3461d();
                    }
                });
            }
        }));
        final LocalDateTimeFormatter localDateTimeFormatter4 = LocalDateTimeFormatter.WEEKDAY_ONLY;
        WEEKDAY_IN_SYSTEM_ZONE = new InstantFormatter("WEEKDAY_IN_SYSTEM_ZONE", 14, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$15
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateTimeFormatter4;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$15.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3461d();
                    }
                });
            }
        }));
        final LocalDateTimeFormatter localDateTimeFormatter5 = LocalDateTimeFormatter.MEDIUM;
        MEDIUM_DATETIME_IN_SYSTEM_ZONE = new InstantFormatter("MEDIUM_DATETIME_IN_SYSTEM_ZONE", 15, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$16
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateTimeFormatter5;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$16.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3461d();
                    }
                });
            }
        }));
        MEDIUM_DATE_IN_SYSTEM_ZONE = new InstantFormatter("MEDIUM_DATE_IN_SYSTEM_ZONE", 16, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$17
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateFormatter3;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$17.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        return ((Instant) source).atZone(ZoneId.systemDefault()).mo3459a();
                    }
                });
            }
        }));
        final LocalDateTimeFormatter localDateTimeFormatter6 = LocalDateTimeFormatter.LONG;
        LONG_TIMESTAMP_IN_SYSTEM_ZONE = new InstantFormatter("LONG_TIMESTAMP_IN_SYSTEM_ZONE", 17, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$18
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateTimeFormatter6;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$18.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                        return Instants.toLocalDateTime((Instant) source, zoneIdSystemDefault);
                    }
                });
            }
        }));
        final LocalDateTimeFormatter localDateTimeFormatter7 = LocalDateTimeFormatter.LONG_NO_YEAR;
        LONG_NO_YEAR_TIMESTAMP_IN_SYSTEM_ZONE = new InstantFormatter("LONG_NO_YEAR_TIMESTAMP_IN_SYSTEM_ZONE", 18, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$19
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateTimeFormatter7;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$19.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                        return Instants.toLocalDateTime((Instant) source, zoneIdSystemDefault);
                    }
                });
            }
        }));
        final ZonedDateTimeFormatter zonedDateTimeFormatter = ZonedDateTimeFormatter.LONG_DATE_TIME_WITH_ZONE;
        LONG_TIMESTAMP_WITH_ZONE_IN_SYSTEM_ZONE = new InstantFormatter("LONG_TIMESTAMP_WITH_ZONE_IN_SYSTEM_ZONE", 19, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$20
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = zonedDateTimeFormatter;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$20.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                        return Instants.toZonedDateTime((Instant) source, zoneIdSystemDefault);
                    }
                });
            }
        }));
        final LocalDateTimeFormatter localDateTimeFormatter8 = LocalDateTimeFormatter.NATURAL;
        NATURAL_TIMESTAMP_IN_SYSTEM_ZONE = new InstantFormatter("NATURAL_TIMESTAMP_IN_SYSTEM_ZONE", 20, companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super Instant>>() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$21
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TemporalFormatter<? super Instant> invoke(Function1<? super Integer, ? extends String> function1) {
                return invoke2((Function1<? super Integer, String>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TemporalFormatter<Instant> invoke2(Function1<? super Integer, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                TemporalFormatter temporalFormatter = localDateTimeFormatter8;
                TemporalTransformer.Companion companion3 = TemporalTransformer.INSTANCE;
                return companion2.transforming(temporalFormatter, new TemporalTransformer() { // from class: com.robinhood.utils.datetime.format.InstantFormatter$special$$inlined$transforming$21.1
                    @Override // com.robinhood.utils.datetime.TemporalTransformer
                    public TemporalAccessor transform(TemporalAccessor source) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                        return Instants.toLocalDateTime((Instant) source, zoneIdSystemDefault);
                    }
                });
            }
        }));
        InstantFormatter[] instantFormatterArr$values = $values();
        $VALUES = instantFormatterArr$values;
        $ENTRIES = EnumEntries2.enumEntries(instantFormatterArr$values);
    }

    private InstantFormatter(String str, int i, DateTimeFormatter dateTimeFormatter) {
        this(str, i, TemporalFormatter.INSTANCE.wrapping(dateTimeFormatter));
    }

    public static InstantFormatter valueOf(String str) {
        return (InstantFormatter) Enum.valueOf(InstantFormatter.class, str);
    }

    public static InstantFormatter[] values() {
        return (InstantFormatter[]) $VALUES.clone();
    }
}
