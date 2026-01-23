package p479j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

/* renamed from: j$.time.n */
/* loaded from: classes29.dex */
public final class C45792n implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a */
    public byte f6903a;

    /* renamed from: b */
    public Object f6904b;

    public C45792n() {
    }

    public C45792n(byte b, Object obj) {
        this.f6903a = b;
        this.f6904b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f6903a;
        Object obj = this.f6904b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f6666a);
                objectOutput.writeInt(duration.f6667b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f6668a);
                objectOutput.writeInt(instant.f6669b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.f6670a);
                objectOutput.writeByte(localDate.f6671b);
                objectOutput.writeByte(localDate.f6672c);
                return;
            case 4:
                ((LocalTime) obj).m3421v(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.f6673a;
                objectOutput.writeInt(localDate2.f6670a);
                objectOutput.writeByte(localDate2.f6671b);
                objectOutput.writeByte(localDate2.f6672c);
                localDateTime.f6674b.m3421v(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f6706a;
                LocalDate localDate3 = localDateTime2.f6673a;
                objectOutput.writeInt(localDate3.f6670a);
                objectOutput.writeByte(localDate3.f6671b);
                objectOutput.writeByte(localDate3.f6672c);
                localDateTime2.f6674b.m3421v(objectOutput);
                zonedDateTime.f6707b.m3454p(objectOutput);
                zonedDateTime.f6708c.mo3450l(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((C45795q) obj).f6910a);
                return;
            case 8:
                ((ZoneOffset) obj).m3454p(objectOutput);
                return;
            case 9:
                OffsetTime offsetTime = (OffsetTime) obj;
                offsetTime.f6689a.m3421v(objectOutput);
                offsetTime.f6690b.m3454p(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f6686a;
                LocalDate localDate4 = localDateTime3.f6673a;
                objectOutput.writeInt(localDate4.f6670a);
                objectOutput.writeByte(localDate4.f6671b);
                objectOutput.writeByte(localDate4.f6672c);
                localDateTime3.f6674b.m3421v(objectOutput);
                offsetDateTime.f6687b.m3454p(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((Year) obj).f6696a);
                return;
            case 12:
                YearMonth yearMonth = (YearMonth) obj;
                objectOutput.writeInt(yearMonth.f6698a);
                objectOutput.writeByte(yearMonth.f6699b);
                return;
            case 13:
                MonthDay monthDay = (MonthDay) obj;
                objectOutput.writeByte(monthDay.f6683a);
                objectOutput.writeByte(monthDay.f6684b);
                return;
            case 14:
                Period period = (Period) obj;
                objectOutput.writeInt(period.f6692a);
                objectOutput.writeInt(period.f6693b);
                objectOutput.writeInt(period.f6694c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b = objectInput.readByte();
        this.f6903a = b;
        this.f6904b = m3593a(b, objectInput);
    }

    /* renamed from: a */
    public static Object m3593a(byte b, ObjectInput objectInput) throws IOException {
        switch (b) {
            case 1:
                Duration duration = Duration.ZERO;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.MIN;
                return LocalDate.m3377of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.m3410q(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.MIN;
                LocalDate localDate2 = LocalDate.MIN;
                return LocalDateTime.m3393of(LocalDate.m3377of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.m3410q(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.MIN;
                LocalDate localDate3 = LocalDate.MIN;
                LocalDateTime localDateTimeM3393of = LocalDateTime.m3393of(LocalDate.m3377of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.m3410q(objectInput));
                ZoneOffset zoneOffsetM3453o = ZoneOffset.m3453o(objectInput);
                ZoneId zoneId = (ZoneId) m3593a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(localDateTimeM3393of, "localDateTime");
                Objects.requireNonNull(zoneOffsetM3453o, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetM3453o.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeM3393of, zoneId, zoneOffsetM3453o);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = C45795q.f6909c;
                return ZoneId.m3445i(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.m3453o(objectInput);
            case 9:
                int i2 = OffsetTime.f6688c;
                return new OffsetTime(LocalTime.m3410q(objectInput), ZoneOffset.m3453o(objectInput));
            case 10:
                int i3 = OffsetDateTime.f6685c;
                LocalDate localDate4 = LocalDate.MIN;
                return new OffsetDateTime(LocalDateTime.m3393of(LocalDate.m3377of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.m3410q(objectInput)), ZoneOffset.m3453o(objectInput));
            case 11:
                int i4 = Year.f6695b;
                return Year.m3433of(objectInput.readInt());
            case 12:
                int i5 = YearMonth.f6697c;
                return YearMonth.m3437of(objectInput.readInt(), objectInput.readByte());
            case 13:
                int i6 = MonthDay.f6682c;
                return MonthDay.m3423of(Month.m3422of(objectInput.readByte()), objectInput.readByte());
            case 14:
                Period period = Period.ZERO;
                return Period.m3431a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f6904b;
    }
}
