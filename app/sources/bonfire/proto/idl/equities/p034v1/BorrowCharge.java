package bonfire.proto.idl.equities.p034v1;

import com.robinhood.rosetta.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
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

/* compiled from: BorrowCharge.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/BorrowCharge;", "Lcom/squareup/wire/Message;", "", "id", "", "instrument_id", "charge", "Lcom/robinhood/rosetta/common/Money;", "symbol", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getInstrument_id", "getCharge", "()Lcom/robinhood/rosetta/common/Money;", "getSymbol", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BorrowCharge extends Message {

    @JvmField
    public static final ProtoAdapter<BorrowCharge> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money charge;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String symbol;

    public BorrowCharge() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ BorrowCharge(String str, String str2, Money money, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8963newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final Money getCharge() {
        return this.charge;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowCharge(String id, String instrument_id, Money money, String symbol, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.instrument_id = instrument_id;
        this.charge = money;
        this.symbol = symbol;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8963newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BorrowCharge)) {
            return false;
        }
        BorrowCharge borrowCharge = (BorrowCharge) other;
        return Intrinsics.areEqual(unknownFields(), borrowCharge.unknownFields()) && Intrinsics.areEqual(this.id, borrowCharge.id) && Intrinsics.areEqual(this.instrument_id, borrowCharge.instrument_id) && Intrinsics.areEqual(this.charge, borrowCharge.charge) && Intrinsics.areEqual(this.symbol, borrowCharge.symbol);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.instrument_id.hashCode()) * 37;
        Money money = this.charge;
        int iHashCode2 = ((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.symbol.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        Money money = this.charge;
        if (money != null) {
            arrayList.add("charge=" + money);
        }
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        return CollectionsKt.joinToString$default(arrayList, ", ", "BorrowCharge{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BorrowCharge copy$default(BorrowCharge borrowCharge, String str, String str2, Money money, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = borrowCharge.id;
        }
        if ((i & 2) != 0) {
            str2 = borrowCharge.instrument_id;
        }
        if ((i & 4) != 0) {
            money = borrowCharge.charge;
        }
        if ((i & 8) != 0) {
            str3 = borrowCharge.symbol;
        }
        if ((i & 16) != 0) {
            byteString = borrowCharge.unknownFields();
        }
        ByteString byteString2 = byteString;
        Money money2 = money;
        return borrowCharge.copy(str, str2, money2, str3, byteString2);
    }

    public final BorrowCharge copy(String id, String instrument_id, Money charge, String symbol, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BorrowCharge(id, instrument_id, charge, symbol, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BorrowCharge.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BorrowCharge>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.equities.v1.BorrowCharge$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BorrowCharge value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_id());
                }
                if (value.getCharge() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getCharge());
                }
                return !Intrinsics.areEqual(value.getSymbol(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSymbol()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BorrowCharge value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (value.getCharge() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getCharge());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BorrowCharge value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (value.getCharge() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getCharge());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BorrowCharge redact(BorrowCharge value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money charge = value.getCharge();
                return BorrowCharge.copy$default(value, null, null, charge != null ? Money.ADAPTER.redact(charge) : null, null, ByteString.EMPTY, 11, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BorrowCharge decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Money moneyDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BorrowCharge(strDecode, strDecode3, moneyDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
