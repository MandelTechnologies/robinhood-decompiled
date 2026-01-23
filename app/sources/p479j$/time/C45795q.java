package p479j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;
import p479j$.time.zone.C45813f;
import p479j$.time.zone.C45815h;
import p479j$.time.zone.ZoneRules;

/* renamed from: j$.time.q */
/* loaded from: classes29.dex */
public final class C45795q extends ZoneId {

    /* renamed from: c */
    public static final /* synthetic */ int f6909c = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: a */
    public final String f6910a;

    /* renamed from: b */
    public final transient ZoneRules f6911b;

    /* renamed from: m */
    public static C45795q m3594m(String str, boolean z) {
        ZoneRules zoneRulesM3632a;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                zoneRulesM3632a = C45815h.m3632a(str);
            } catch (C45813f e) {
                if (z) {
                    throw e;
                }
                zoneRulesM3632a = null;
            }
            return new C45795q(str, zoneRulesM3632a);
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public C45795q(String str, ZoneRules zoneRules) {
        this.f6910a = str;
        this.f6911b = zoneRules;
    }

    @Override // p479j$.time.ZoneId
    public final String getId() {
        return this.f6910a;
    }

    @Override // p479j$.time.ZoneId
    public final ZoneRules getRules() {
        ZoneRules zoneRules = this.f6911b;
        return zoneRules != null ? zoneRules : C45815h.m3632a(this.f6910a);
    }

    private Object writeReplace() {
        return new C45792n((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p479j$.time.ZoneId
    /* renamed from: l */
    public final void mo3450l(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f6910a);
    }
}
