package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.UtcOffsetJvm;
import kotlinx.datetime.format.DateTimeFormat;

/* compiled from: UtcOffset.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lkotlinx/datetime/UtcOffset;", "Lkotlinx/datetime/FixedOffsetTimeZone;", "asTimeZone", "(Lkotlinx/datetime/UtcOffset;)Lkotlinx/datetime/FixedOffsetTimeZone;", "Lkotlinx/datetime/format/DateTimeFormat;", "getIsoUtcOffsetFormat", "()Lkotlinx/datetime/format/DateTimeFormat;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.UtcOffsetKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class UtcOffset2 {
    public static final TimeZoneJvm asTimeZone(UtcOffsetJvm utcOffsetJvm) {
        Intrinsics.checkNotNullParameter(utcOffsetJvm, "<this>");
        return new TimeZoneJvm(utcOffsetJvm);
    }

    public static final DateTimeFormat<UtcOffsetJvm> getIsoUtcOffsetFormat() {
        return UtcOffsetJvm.Formats.INSTANCE.getISO();
    }
}
