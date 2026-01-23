package com.robinhood.ceres.p284v1;

import com.robinhood.rosetta.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PnL.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J4\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PnL;", "Lcom/squareup/wire/Message;", "", "open_pnl", "Lcom/robinhood/rosetta/common/Money;", "day_pnl", "day_open_pnl", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getOpen_pnl", "()Lcom/robinhood/rosetta/common/Money;", "getDay_pnl", "getDay_open_pnl", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PnL extends Message {

    @JvmField
    public static final ProtoAdapter<PnL> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dayOpenPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money day_open_pnl;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dayPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money day_pnl;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "openPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money open_pnl;

    public PnL() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20401newBuilder();
    }

    public final Money getOpen_pnl() {
        return this.open_pnl;
    }

    public final Money getDay_pnl() {
        return this.day_pnl;
    }

    public final Money getDay_open_pnl() {
        return this.day_open_pnl;
    }

    public /* synthetic */ PnL(Money money, Money money2, Money money3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PnL(Money money, Money money2, Money money3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.open_pnl = money;
        this.day_pnl = money2;
        this.day_open_pnl = money3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20401newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PnL)) {
            return false;
        }
        PnL pnL = (PnL) other;
        return Intrinsics.areEqual(unknownFields(), pnL.unknownFields()) && Intrinsics.areEqual(this.open_pnl, pnL.open_pnl) && Intrinsics.areEqual(this.day_pnl, pnL.day_pnl) && Intrinsics.areEqual(this.day_open_pnl, pnL.day_open_pnl);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.open_pnl;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.day_pnl;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.day_open_pnl;
        int iHashCode4 = iHashCode3 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.open_pnl;
        if (money != null) {
            arrayList.add("open_pnl=" + money);
        }
        Money money2 = this.day_pnl;
        if (money2 != null) {
            arrayList.add("day_pnl=" + money2);
        }
        Money money3 = this.day_open_pnl;
        if (money3 != null) {
            arrayList.add("day_open_pnl=" + money3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PnL{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PnL copy$default(PnL pnL, Money money, Money money2, Money money3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = pnL.open_pnl;
        }
        if ((i & 2) != 0) {
            money2 = pnL.day_pnl;
        }
        if ((i & 4) != 0) {
            money3 = pnL.day_open_pnl;
        }
        if ((i & 8) != 0) {
            byteString = pnL.unknownFields();
        }
        return pnL.copy(money, money2, money3, byteString);
    }

    public final PnL copy(Money open_pnl, Money day_pnl, Money day_open_pnl, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PnL(open_pnl, day_pnl, day_open_pnl, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PnL.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PnL>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.PnL$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PnL value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOpen_pnl() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getOpen_pnl());
                }
                if (value.getDay_pnl() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getDay_pnl());
                }
                return value.getDay_open_pnl() != null ? size + Money.ADAPTER.encodedSizeWithTag(3, value.getDay_open_pnl()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PnL value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOpen_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getOpen_pnl());
                }
                if (value.getDay_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getDay_pnl());
                }
                if (value.getDay_open_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getDay_open_pnl());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PnL value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDay_open_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getDay_open_pnl());
                }
                if (value.getDay_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getDay_pnl());
                }
                if (value.getOpen_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getOpen_pnl());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PnL redact(PnL value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money open_pnl = value.getOpen_pnl();
                Money moneyRedact = open_pnl != null ? Money.ADAPTER.redact(open_pnl) : null;
                Money day_pnl = value.getDay_pnl();
                Money moneyRedact2 = day_pnl != null ? Money.ADAPTER.redact(day_pnl) : null;
                Money day_open_pnl = value.getDay_open_pnl();
                return value.copy(moneyRedact, moneyRedact2, day_open_pnl != null ? Money.ADAPTER.redact(day_open_pnl) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PnL decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PnL(moneyDecode, moneyDecode2, moneyDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode3 = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
