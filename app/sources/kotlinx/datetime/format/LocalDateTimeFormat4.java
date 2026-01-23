package kotlinx.datetime.format;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.format.DateTimeFormatBuilder;

/* compiled from: LocalDateTimeFormat.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\"\u001b\u0010\u0000\u001a\u00020\u00018@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"ISO_DATETIME", "Lkotlinx/datetime/format/LocalDateTimeFormat;", "getISO_DATETIME", "()Lkotlinx/datetime/format/LocalDateTimeFormat;", "ISO_DATETIME$delegate", "Lkotlin/Lazy;", "emptyIncompleteLocalDateTime", "Lkotlinx/datetime/format/IncompleteLocalDateTime;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.format.LocalDateTimeFormatKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class LocalDateTimeFormat4 {
    private static final Lazy ISO_DATETIME$delegate = LazyKt.lazy(new Function0<LocalDateTimeFormat>() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$ISO_DATETIME$2
        @Override // kotlin.jvm.functions.Function0
        public final LocalDateTimeFormat invoke() {
            return LocalDateTimeFormat.INSTANCE.build(new Function1<DateTimeFormatBuilder.WithDateTime, Unit>() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$ISO_DATETIME$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTime withDateTime) {
                    invoke2(withDateTime);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DateTimeFormatBuilder.WithDateTime build) {
                    Intrinsics.checkNotNullParameter(build, "$this$build");
                    build.date(LocalDateFormatKt.getISO_DATE());
                    DateTimeFormatBuilder3.alternativeParsing(build, new Function1[]{new Function1<DateTimeFormatBuilder.WithDateTime, Unit>() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt.ISO_DATETIME.2.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTime withDateTime) {
                            invoke2(withDateTime);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTime alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            DateTimeFormatBuilder3.m28853char(alternativeParsing, 't');
                        }
                    }}, new Function1<DateTimeFormatBuilder.WithDateTime, Unit>() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt.ISO_DATETIME.2.1.2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDateTime withDateTime) {
                            invoke2(withDateTime);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DateTimeFormatBuilder.WithDateTime alternativeParsing) {
                            Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
                            DateTimeFormatBuilder3.m28853char(alternativeParsing, 'T');
                        }
                    });
                    build.time(LocalTimeFormatKt.getISO_TIME());
                }
            });
        }
    });
    private static final LocalDateTimeFormat3 emptyIncompleteLocalDateTime = new LocalDateTimeFormat3(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    public static final LocalDateTimeFormat getISO_DATETIME() {
        return (LocalDateTimeFormat) ISO_DATETIME$delegate.getValue();
    }
}
