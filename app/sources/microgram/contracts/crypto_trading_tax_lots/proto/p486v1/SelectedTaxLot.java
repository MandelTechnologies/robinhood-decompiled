package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

import cbc.service.p048v1.TermType;
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

/* compiled from: SelectedTaxLot.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/SelectedTaxLot;", "Lcom/squareup/wire/Message;", "", "id", "", "quantity", "term_type", "Lcbc/service/v1/TermType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcbc/service/v1/TermType;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getQuantity", "getTerm_type", "()Lcbc/service/v1/TermType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SelectedTaxLot extends Message {

    @JvmField
    public static final ProtoAdapter<SelectedTaxLot> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String quantity;

    @WireField(adapter = "cbc.service.v1.TermType#ADAPTER", jsonName = "termType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TermType term_type;

    public SelectedTaxLot() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ SelectedTaxLot(String str, String str2, TermType termType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? TermType.TERM_TYPE_UNSPECIFIED : termType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28978newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final TermType getTerm_type() {
        return this.term_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedTaxLot(String id, String quantity, TermType term_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(term_type, "term_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.quantity = quantity;
        this.term_type = term_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28978newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SelectedTaxLot)) {
            return false;
        }
        SelectedTaxLot selectedTaxLot = (SelectedTaxLot) other;
        return Intrinsics.areEqual(unknownFields(), selectedTaxLot.unknownFields()) && Intrinsics.areEqual(this.id, selectedTaxLot.id) && Intrinsics.areEqual(this.quantity, selectedTaxLot.quantity) && this.term_type == selectedTaxLot.term_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.term_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("term_type=" + this.term_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectedTaxLot{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SelectedTaxLot copy$default(SelectedTaxLot selectedTaxLot, String str, String str2, TermType termType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectedTaxLot.id;
        }
        if ((i & 2) != 0) {
            str2 = selectedTaxLot.quantity;
        }
        if ((i & 4) != 0) {
            termType = selectedTaxLot.term_type;
        }
        if ((i & 8) != 0) {
            byteString = selectedTaxLot.unknownFields();
        }
        return selectedTaxLot.copy(str, str2, termType, byteString);
    }

    public final SelectedTaxLot copy(String id, String quantity, TermType term_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(term_type, "term_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SelectedTaxLot(id, quantity, term_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SelectedTaxLot.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SelectedTaxLot>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.SelectedTaxLot$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SelectedTaxLot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getQuantity());
                }
                return value.getTerm_type() != TermType.TERM_TYPE_UNSPECIFIED ? size + TermType.ADAPTER.encodedSizeWithTag(3, value.getTerm_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SelectedTaxLot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuantity());
                }
                if (value.getTerm_type() != TermType.TERM_TYPE_UNSPECIFIED) {
                    TermType.ADAPTER.encodeWithTag(writer, 3, (int) value.getTerm_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SelectedTaxLot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTerm_type() != TermType.TERM_TYPE_UNSPECIFIED) {
                    TermType.ADAPTER.encodeWithTag(writer, 3, (int) value.getTerm_type());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuantity());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelectedTaxLot decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TermType termTypeDecode = TermType.TERM_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SelectedTaxLot(strDecode, strDecode2, termTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            termTypeDecode = TermType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelectedTaxLot redact(SelectedTaxLot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SelectedTaxLot.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
