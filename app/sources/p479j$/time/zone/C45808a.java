package p479j$.time.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import p479j$.time.ZoneOffset;

/* renamed from: j$.time.zone.a */
/* loaded from: classes29.dex */
public final class C45808a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a */
    public byte f6979a;

    /* renamed from: b */
    public Object f6980b;

    public C45808a() {
    }

    public C45808a(byte b, Object obj) {
        this.f6979a = b;
        this.f6980b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f6979a;
        Object obj = this.f6980b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                C45809b c45809b = (C45809b) obj;
                m3627c(c45809b.f6982a, objectOutput);
                m3628d(c45809b.f6984c, objectOutput);
                m3628d(c45809b.f6985d, objectOutput);
                return;
            }
            if (b == 3) {
                ((C45812e) obj).m3631b(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((ZoneRules) obj).f6977g.getID());
                return;
            }
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        objectOutput.writeInt(zoneRules.f6971a.length);
        for (long j : zoneRules.f6971a) {
            m3627c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : zoneRules.f6972b) {
            m3628d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(zoneRules.f6973c.length);
        for (long j2 : zoneRules.f6973c) {
            m3627c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : zoneRules.f6975e) {
            m3628d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(zoneRules.f6976f.length);
        for (C45812e c45812e : zoneRules.f6976f) {
            c45812e.m3631b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object zoneRules;
        byte b = objectInput.readByte();
        this.f6979a = b;
        if (b == 1) {
            long[] jArr = ZoneRules.f6967i;
            int i = objectInput.readInt();
            long[] jArr2 = i == 0 ? jArr : new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr2[i2] = m3625a(objectInput);
            }
            int i3 = i + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                zoneOffsetArr[i4] = m3626b(objectInput);
            }
            int i5 = objectInput.readInt();
            if (i5 != 0) {
                jArr = new long[i5];
            }
            long[] jArr3 = jArr;
            for (int i6 = 0; i6 < i5; i6++) {
                jArr3[i6] = m3625a(objectInput);
            }
            int i7 = i5 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                zoneOffsetArr2[i8] = m3626b(objectInput);
            }
            int i9 = objectInput.readByte();
            C45812e[] c45812eArr = i9 == 0 ? ZoneRules.f6968j : new C45812e[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                c45812eArr[i10] = C45812e.m3630a(objectInput);
            }
            zoneRules = new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, c45812eArr);
        } else if (b == 2) {
            int i11 = C45809b.f6981e;
            long jM3625a = m3625a(objectInput);
            ZoneOffset zoneOffsetM3626b = m3626b(objectInput);
            ZoneOffset zoneOffsetM3626b2 = m3626b(objectInput);
            if (zoneOffsetM3626b.equals(zoneOffsetM3626b2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            zoneRules = new C45809b(jM3625a, zoneOffsetM3626b, zoneOffsetM3626b2);
        } else if (b == 3) {
            zoneRules = C45812e.m3630a(objectInput);
        } else {
            if (b != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            zoneRules = new ZoneRules(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f6980b = zoneRules;
    }

    private Object readResolve() {
        return this.f6980b;
    }

    /* renamed from: d */
    public static void m3628d(ZoneOffset zoneOffset, DataOutput dataOutput) throws IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    /* renamed from: b */
    public static ZoneOffset m3626b(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? ZoneOffset.ofTotalSeconds(dataInput.readInt()) : ZoneOffset.ofTotalSeconds(b * 900);
    }

    /* renamed from: c */
    public static void m3627c(long j, DataOutput dataOutput) throws IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    /* renamed from: a */
    public static long m3625a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }
}
