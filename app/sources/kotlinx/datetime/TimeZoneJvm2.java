package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.serializers.TimeZoneSerializers2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import p479j$.time.DateTimeException;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;

/* compiled from: TimeZoneJvm.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lkotlinx/datetime/TimeZone;", "", "j$/time/ZoneId", "zoneId", "<init>", "(Lj$/time/ZoneId;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lj$/time/ZoneId;", "getZoneId$kotlinx_datetime", "()Lj$/time/ZoneId;", "getId", "id", "Companion", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = TimeZoneSerializers2.class)
/* renamed from: kotlinx.datetime.TimeZone, reason: use source file name */
/* loaded from: classes14.dex */
public class TimeZoneJvm2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TimeZoneJvm UTC;
    private final ZoneId zoneId;

    public TimeZoneJvm2(ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        this.zoneId = zoneId;
    }

    /* renamed from: getZoneId$kotlinx_datetime, reason: from getter */
    public final ZoneId getZoneId() {
        return this.zoneId;
    }

    public final String getId() {
        String id = this.zoneId.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        return id;
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof TimeZoneJvm2) && Intrinsics.areEqual(this.zoneId, ((TimeZoneJvm2) other).zoneId);
        }
        return true;
    }

    public int hashCode() {
        return this.zoneId.hashCode();
    }

    public String toString() {
        String string2 = this.zoneId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* compiled from: TimeZoneJvm.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lkotlinx/datetime/TimeZone$Companion;", "", "<init>", "()V", "Lkotlinx/datetime/TimeZone;", "currentSystemDefault", "()Lkotlinx/datetime/TimeZone;", "", "zoneId", "of", "(Ljava/lang/String;)Lkotlinx/datetime/TimeZone;", "j$/time/ZoneId", "ofZone$kotlinx_datetime", "(Lj$/time/ZoneId;)Lkotlinx/datetime/TimeZone;", "ofZone", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/FixedOffsetTimeZone;", "UTC", "Lkotlinx/datetime/FixedOffsetTimeZone;", "getUTC", "()Lkotlinx/datetime/FixedOffsetTimeZone;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.TimeZone$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TimeZoneJvm2> serializer() {
            return TimeZoneSerializers2.INSTANCE;
        }

        public final TimeZoneJvm2 currentSystemDefault() {
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
            return ofZone$kotlinx_datetime(zoneIdSystemDefault);
        }

        public final TimeZoneJvm getUTC() {
            return TimeZoneJvm2.UTC;
        }

        /* renamed from: of */
        public final TimeZoneJvm2 m3732of(String zoneId) {
            Intrinsics.checkNotNullParameter(zoneId, "zoneId");
            try {
                ZoneId zoneIdM3448of = ZoneId.m3448of(zoneId);
                Intrinsics.checkNotNullExpressionValue(zoneIdM3448of, "of(...)");
                return ofZone$kotlinx_datetime(zoneIdM3448of);
            } catch (Exception e) {
                if (e instanceof DateTimeException) {
                    throw new IllegalTimeZoneException(e);
                }
                throw e;
            }
        }

        public final TimeZoneJvm2 ofZone$kotlinx_datetime(ZoneId zoneId) {
            Intrinsics.checkNotNullParameter(zoneId, "zoneId");
            if (!(zoneId instanceof ZoneOffset)) {
                if (TimeZoneJvm3.isFixedOffset$TimeZoneKt__TimeZoneJvmKt(zoneId)) {
                    ZoneId zoneIdNormalized = zoneId.normalized();
                    Intrinsics.checkNotNull(zoneIdNormalized, "null cannot be cast to non-null type java.time.ZoneOffset");
                    return new TimeZoneJvm(new UtcOffsetJvm((ZoneOffset) zoneIdNormalized), zoneId);
                }
                return new TimeZoneJvm2(zoneId);
            }
            return new TimeZoneJvm(new UtcOffsetJvm((ZoneOffset) zoneId));
        }
    }

    static {
        ZoneOffset UTC2 = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(UTC2, "UTC");
        UTC = UtcOffset2.asTimeZone(new UtcOffsetJvm(UTC2));
    }
}
