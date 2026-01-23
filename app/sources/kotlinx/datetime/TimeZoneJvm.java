package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.serializers.TimeZoneSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import p479j$.time.ZoneId;

/* compiled from: TimeZoneJvm.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lkotlinx/datetime/FixedOffsetTimeZone;", "Lkotlinx/datetime/TimeZone;", "Lkotlinx/datetime/UtcOffset;", "offset", "j$/time/ZoneId", "zoneId", "<init>", "(Lkotlinx/datetime/UtcOffset;Lj$/time/ZoneId;)V", "(Lkotlinx/datetime/UtcOffset;)V", "Lkotlinx/datetime/UtcOffset;", "getOffset", "()Lkotlinx/datetime/UtcOffset;", "Companion", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = TimeZoneSerializers.class)
/* renamed from: kotlinx.datetime.FixedOffsetTimeZone, reason: use source file name */
/* loaded from: classes14.dex */
public final class TimeZoneJvm extends TimeZoneJvm2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final UtcOffsetJvm offset;

    /* compiled from: TimeZoneJvm.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lkotlinx/datetime/FixedOffsetTimeZone$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/FixedOffsetTimeZone;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.FixedOffsetTimeZone$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TimeZoneJvm> serializer() {
            return TimeZoneSerializers.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeZoneJvm(UtcOffsetJvm offset, ZoneId zoneId) {
        super(zoneId);
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        this.offset = offset;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeZoneJvm(UtcOffsetJvm offset) {
        this(offset, offset.getZoneOffset());
        Intrinsics.checkNotNullParameter(offset, "offset");
    }
}
