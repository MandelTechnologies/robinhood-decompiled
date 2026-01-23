package kotlinx.datetime.format;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.format.DateTimeFormatBuilder;

/* compiled from: UtcOffsetFormat.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0005\u001a\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\b\u001a\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001b\u0010\u000b\u001a\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lkotlinx/datetime/format/UtcOffsetFormat;", "ISO_OFFSET$delegate", "Lkotlin/Lazy;", "getISO_OFFSET", "()Lkotlinx/datetime/format/UtcOffsetFormat;", "ISO_OFFSET", "ISO_OFFSET_BASIC$delegate", "getISO_OFFSET_BASIC", "ISO_OFFSET_BASIC", "FOUR_DIGIT_OFFSET$delegate", "getFOUR_DIGIT_OFFSET", "FOUR_DIGIT_OFFSET", "Lkotlinx/datetime/format/IncompleteUtcOffset;", "emptyIncompleteUtcOffset", "Lkotlinx/datetime/format/IncompleteUtcOffset;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class UtcOffsetFormatKt {
    private static final Lazy ISO_OFFSET$delegate = LazyKt.lazy(new Function0<UtcOffsetFormat>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$ISO_OFFSET$2
        @Override // kotlin.jvm.functions.Function0
        public final UtcOffsetFormat invoke() {
            return UtcOffsetFormat.INSTANCE.build(new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$ISO_OFFSET$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                    invoke2(withUtcOffset);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DateTimeFormatBuilder.WithUtcOffset build) {
                    Intrinsics.checkNotNullParameter(build, "$this$build");
                    DateTimeFormatBuilder3.alternativeParsing(build, new Function1[]{new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt.ISO_OFFSET.2.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                            invoke2(withUtcOffset);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithUtcOffset alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            alternativeParsing.chars("z");
                        }
                    }}, new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt.ISO_OFFSET.2.1.2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                            invoke2(withUtcOffset);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithUtcOffset alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            DateTimeFormatBuilder3.optional(alternativeParsing, "Z", new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt.ISO_OFFSET.2.1.2.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                                    invoke2(withUtcOffset);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DateTimeFormatBuilder.WithUtcOffset optional) {
                                    Intrinsics.checkNotNullParameter(optional, "$this$optional");
                                    DateTimeFormatBuilder.WithUtcOffset.DefaultImpls.offsetHours$default(optional, null, 1, null);
                                    DateTimeFormatBuilder3.m28853char(optional, ':');
                                    DateTimeFormatBuilder.WithUtcOffset.DefaultImpls.offsetMinutesOfHour$default(optional, null, 1, null);
                                    DateTimeFormatBuilder3.optional$default(optional, null, new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt.ISO_OFFSET.2.1.2.1.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                                            invoke2(withUtcOffset);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(DateTimeFormatBuilder.WithUtcOffset optional2) {
                                            Intrinsics.checkNotNullParameter(optional2, "$this$optional");
                                            DateTimeFormatBuilder3.m28853char(optional2, ':');
                                            DateTimeFormatBuilder.WithUtcOffset.DefaultImpls.offsetSecondsOfMinute$default(optional2, null, 1, null);
                                        }
                                    }, 1, null);
                                }
                            });
                        }
                    });
                }
            });
        }
    });
    private static final Lazy ISO_OFFSET_BASIC$delegate = LazyKt.lazy(new Function0<UtcOffsetFormat>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$ISO_OFFSET_BASIC$2
        @Override // kotlin.jvm.functions.Function0
        public final UtcOffsetFormat invoke() {
            return UtcOffsetFormat.INSTANCE.build(new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$ISO_OFFSET_BASIC$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                    invoke2(withUtcOffset);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DateTimeFormatBuilder.WithUtcOffset build) {
                    Intrinsics.checkNotNullParameter(build, "$this$build");
                    DateTimeFormatBuilder3.alternativeParsing(build, new Function1[]{new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt.ISO_OFFSET_BASIC.2.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                            invoke2(withUtcOffset);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithUtcOffset alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            alternativeParsing.chars("z");
                        }
                    }}, new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt.ISO_OFFSET_BASIC.2.1.2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                            invoke2(withUtcOffset);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithUtcOffset alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            DateTimeFormatBuilder3.optional(alternativeParsing, "Z", new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt.ISO_OFFSET_BASIC.2.1.2.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                                    invoke2(withUtcOffset);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DateTimeFormatBuilder.WithUtcOffset optional) {
                                    Intrinsics.checkNotNullParameter(optional, "$this$optional");
                                    DateTimeFormatBuilder.WithUtcOffset.DefaultImpls.offsetHours$default(optional, null, 1, null);
                                    DateTimeFormatBuilder3.optional$default(optional, null, new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt.ISO_OFFSET_BASIC.2.1.2.1.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                                            invoke2(withUtcOffset);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(DateTimeFormatBuilder.WithUtcOffset optional2) {
                                            Intrinsics.checkNotNullParameter(optional2, "$this$optional");
                                            DateTimeFormatBuilder.WithUtcOffset.DefaultImpls.offsetMinutesOfHour$default(optional2, null, 1, null);
                                            DateTimeFormatBuilder3.optional$default(optional2, null, new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt.ISO_OFFSET_BASIC.2.1.2.1.1.1
                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                                                    invoke2(withUtcOffset);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(DateTimeFormatBuilder.WithUtcOffset optional3) {
                                                    Intrinsics.checkNotNullParameter(optional3, "$this$optional");
                                                    DateTimeFormatBuilder.WithUtcOffset.DefaultImpls.offsetSecondsOfMinute$default(optional3, null, 1, null);
                                                }
                                            }, 1, null);
                                        }
                                    }, 1, null);
                                }
                            });
                        }
                    });
                }
            });
        }
    });
    private static final Lazy FOUR_DIGIT_OFFSET$delegate = LazyKt.lazy(new Function0<UtcOffsetFormat>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$FOUR_DIGIT_OFFSET$2
        @Override // kotlin.jvm.functions.Function0
        public final UtcOffsetFormat invoke() {
            return UtcOffsetFormat.INSTANCE.build(new Function1<DateTimeFormatBuilder.WithUtcOffset, Unit>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$FOUR_DIGIT_OFFSET$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
                    invoke2(withUtcOffset);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DateTimeFormatBuilder.WithUtcOffset build) {
                    Intrinsics.checkNotNullParameter(build, "$this$build");
                    DateTimeFormatBuilder.WithUtcOffset.DefaultImpls.offsetHours$default(build, null, 1, null);
                    DateTimeFormatBuilder.WithUtcOffset.DefaultImpls.offsetMinutesOfHour$default(build, null, 1, null);
                }
            });
        }
    });
    private static final IncompleteUtcOffset emptyIncompleteUtcOffset = new IncompleteUtcOffset(null, null, null, null, 15, null);

    public static final UtcOffsetFormat getISO_OFFSET() {
        return (UtcOffsetFormat) ISO_OFFSET$delegate.getValue();
    }

    public static final UtcOffsetFormat getISO_OFFSET_BASIC() {
        return (UtcOffsetFormat) ISO_OFFSET_BASIC$delegate.getValue();
    }

    public static final UtcOffsetFormat getFOUR_DIGIT_OFFSET() {
        return (UtcOffsetFormat) FOUR_DIGIT_OFFSET$delegate.getValue();
    }
}
