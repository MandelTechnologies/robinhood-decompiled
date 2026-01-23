package p479j$.time.chrono;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;
import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.x */
/* loaded from: classes29.dex */
public final class C45750x implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a */
    public byte f6771a;

    /* renamed from: b */
    public Object f6772b;

    public C45750x() {
    }

    public C45750x(byte b, Object obj) {
        this.f6771a = b;
        this.f6772b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f6771a;
        Object obj = this.f6772b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractChronology) obj).getId());
                return;
            case 2:
                C45730d c45730d = (C45730d) obj;
                objectOutput.writeObject(c45730d.f6722a);
                objectOutput.writeObject(c45730d.f6723b);
                return;
            case 3:
                C45734h c45734h = (C45734h) obj;
                objectOutput.writeObject(c45734h.f6731a);
                objectOutput.writeObject(c45734h.f6732b);
                objectOutput.writeObject(c45734h.f6733c);
                return;
            case 4:
                C45743q c45743q = (C45743q) obj;
                c45743q.getClass();
                objectOutput.writeInt(c45743q.get(ChronoField.YEAR));
                objectOutput.writeByte(c45743q.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(c45743q.get(ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((C45744r) obj).f6763a);
                return;
            case 6:
                C45738l c45738l = (C45738l) obj;
                objectOutput.writeObject(c45738l.f6748a);
                objectOutput.writeInt(c45738l.get(ChronoField.YEAR));
                objectOutput.writeByte(c45738l.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(c45738l.get(ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                C45748v c45748v = (C45748v) obj;
                c45748v.getClass();
                objectOutput.writeInt(c45748v.get(ChronoField.YEAR));
                objectOutput.writeByte(c45748v.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(c45748v.get(ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                C45725B c45725b = (C45725B) obj;
                c45725b.getClass();
                objectOutput.writeInt(c45725b.get(ChronoField.YEAR));
                objectOutput.writeByte(c45725b.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(c45725b.get(ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                C45731e c45731e = (C45731e) obj;
                objectOutput.writeUTF(c45731e.f6725a.getId());
                objectOutput.writeInt(c45731e.f6726b);
                objectOutput.writeInt(c45731e.f6727c);
                objectOutput.writeInt(c45731e.f6728d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objM3486of;
        byte b = objectInput.readByte();
        this.f6771a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractChronology.f6712a;
                objM3486of = Chronology.m3486of(objectInput.readUTF());
                break;
            case 2:
                objM3486of = ((ChronoLocalDate) objectInput.readObject()).atTime((LocalTime) objectInput.readObject());
                break;
            case 3:
                objM3486of = ((ChronoLocalDateTime) objectInput.readObject()).mo3396g((ZoneOffset) objectInput.readObject()).mo3462f((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = C45743q.f6757d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                C45741o.f6755d.getClass();
                objM3486of = new C45743q(LocalDate.m3377of(i, b2, b3));
                break;
            case 5:
                C45744r c45744r = C45744r.f6761d;
                objM3486of = C45744r.m3522i(objectInput.readByte());
                break;
            case 6:
                C45736j c45736j = (C45736j) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                c45736j.getClass();
                objM3486of = new C45738l(c45736j, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                C45746t.f6767d.getClass();
                objM3486of = new C45748v(LocalDate.m3377of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                C45752z.f6774d.getClass();
                objM3486of = new C45725B(LocalDate.m3377of(i4 - 543, b8, b9));
                break;
            case 9:
                List list = C45731e.f6724e;
                objM3486of = new C45731e(Chronology.m3486of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f6772b = objM3486of;
    }

    private Object readResolve() {
        return this.f6772b;
    }
}
