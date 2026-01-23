package bonfire.proto.idl.slip.p039v1;

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

/* compiled from: SlipGroupedPaymentItem.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J@\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentItem;", "Lcom/squareup/wire/Message;", "", "symbol", "", "amount", "Lcom/robinhood/rosetta/common/Money;", "instrument_id", "id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getSymbol", "()Ljava/lang/String;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getInstrument_id", "getId", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.slip.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SlipGroupedPaymentItem extends Message {

    @JvmField
    public static final ProtoAdapter<SlipGroupedPaymentItem> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", schemaIndex = 2, tag = 3)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String symbol;

    public SlipGroupedPaymentItem() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9049newBuilder();
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ SlipGroupedPaymentItem(String str, Money money, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipGroupedPaymentItem(String str, Money money, String str2, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.symbol = str;
        this.amount = money;
        this.instrument_id = str2;
        this.id = str3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9049newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SlipGroupedPaymentItem)) {
            return false;
        }
        SlipGroupedPaymentItem slipGroupedPaymentItem = (SlipGroupedPaymentItem) other;
        return Intrinsics.areEqual(unknownFields(), slipGroupedPaymentItem.unknownFields()) && Intrinsics.areEqual(this.symbol, slipGroupedPaymentItem.symbol) && Intrinsics.areEqual(this.amount, slipGroupedPaymentItem.amount) && Intrinsics.areEqual(this.instrument_id, slipGroupedPaymentItem.instrument_id) && Intrinsics.areEqual(this.id, slipGroupedPaymentItem.id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.symbol;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int iHashCode3 = (iHashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.instrument_id;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.id;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.symbol;
        if (str != null) {
            arrayList.add("symbol=" + Internal.sanitize(str));
        }
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        String str2 = this.instrument_id;
        if (str2 != null) {
            arrayList.add("instrument_id=" + Internal.sanitize(str2));
        }
        String str3 = this.id;
        if (str3 != null) {
            arrayList.add("id=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SlipGroupedPaymentItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SlipGroupedPaymentItem copy$default(SlipGroupedPaymentItem slipGroupedPaymentItem, String str, Money money, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slipGroupedPaymentItem.symbol;
        }
        if ((i & 2) != 0) {
            money = slipGroupedPaymentItem.amount;
        }
        if ((i & 4) != 0) {
            str2 = slipGroupedPaymentItem.instrument_id;
        }
        if ((i & 8) != 0) {
            str3 = slipGroupedPaymentItem.id;
        }
        if ((i & 16) != 0) {
            byteString = slipGroupedPaymentItem.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return slipGroupedPaymentItem.copy(str, money, str4, str3, byteString2);
    }

    public final SlipGroupedPaymentItem copy(String symbol, Money amount, String instrument_id, String id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SlipGroupedPaymentItem(symbol, amount, instrument_id, id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SlipGroupedPaymentItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SlipGroupedPaymentItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.slip.v1.SlipGroupedPaymentItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SlipGroupedPaymentItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getSymbol());
                if (value.getAmount() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(2, value.getAmount());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getInstrument_id()) + protoAdapter.encodedSizeWithTag(4, value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SlipGroupedPaymentItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getSymbol());
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                protoAdapter.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getId());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SlipGroupedPaymentItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getId());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getSymbol());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SlipGroupedPaymentItem redact(SlipGroupedPaymentItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                return SlipGroupedPaymentItem.copy$default(value, null, amount != null ? Money.ADAPTER.redact(amount) : null, null, null, ByteString.EMPTY, 13, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SlipGroupedPaymentItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Money moneyDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SlipGroupedPaymentItem(strDecode, moneyDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
