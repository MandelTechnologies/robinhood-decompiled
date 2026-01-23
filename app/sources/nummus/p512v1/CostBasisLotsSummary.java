package nummus.p512v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: CostBasisLotsSummary.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010 \u001a\u00020\u0006H\u0016JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006#"}, m3636d2 = {"Lnummus/v1/CostBasisLotsSummary;", "Lcom/squareup/wire/Message;", "", "total_lots", "", "total_quantity", "", "available_quantity", "cost_basis_input_quantity", "closed_quantity", "completed", "", "attested", "unknownFields", "Lokio/ByteString;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLokio/ByteString;)V", "getTotal_lots", "()I", "getTotal_quantity", "()Ljava/lang/String;", "getAvailable_quantity", "getCost_basis_input_quantity", "getClosed_quantity", "getCompleted", "()Z", "getAttested", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CostBasisLotsSummary extends Message {

    @JvmField
    public static final ProtoAdapter<CostBasisLotsSummary> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean attested;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "availableQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String available_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "closedQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String closed_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean completed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "costBasisInputQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String cost_basis_input_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalLots", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int total_lots;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String total_quantity;

    public CostBasisLotsSummary() {
        this(0, null, null, null, null, false, false, null, 255, null);
    }

    public /* synthetic */ CostBasisLotsSummary(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29411newBuilder();
    }

    public final int getTotal_lots() {
        return this.total_lots;
    }

    public final String getTotal_quantity() {
        return this.total_quantity;
    }

    public final String getAvailable_quantity() {
        return this.available_quantity;
    }

    public final String getCost_basis_input_quantity() {
        return this.cost_basis_input_quantity;
    }

    public final String getClosed_quantity() {
        return this.closed_quantity;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final boolean getAttested() {
        return this.attested;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CostBasisLotsSummary(int i, String total_quantity, String available_quantity, String cost_basis_input_quantity, String closed_quantity, boolean z, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(total_quantity, "total_quantity");
        Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
        Intrinsics.checkNotNullParameter(cost_basis_input_quantity, "cost_basis_input_quantity");
        Intrinsics.checkNotNullParameter(closed_quantity, "closed_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_lots = i;
        this.total_quantity = total_quantity;
        this.available_quantity = available_quantity;
        this.cost_basis_input_quantity = cost_basis_input_quantity;
        this.closed_quantity = closed_quantity;
        this.completed = z;
        this.attested = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29411newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CostBasisLotsSummary)) {
            return false;
        }
        CostBasisLotsSummary costBasisLotsSummary = (CostBasisLotsSummary) other;
        return Intrinsics.areEqual(unknownFields(), costBasisLotsSummary.unknownFields()) && this.total_lots == costBasisLotsSummary.total_lots && Intrinsics.areEqual(this.total_quantity, costBasisLotsSummary.total_quantity) && Intrinsics.areEqual(this.available_quantity, costBasisLotsSummary.available_quantity) && Intrinsics.areEqual(this.cost_basis_input_quantity, costBasisLotsSummary.cost_basis_input_quantity) && Intrinsics.areEqual(this.closed_quantity, costBasisLotsSummary.closed_quantity) && this.completed == costBasisLotsSummary.completed && this.attested == costBasisLotsSummary.attested;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.total_lots)) * 37) + this.total_quantity.hashCode()) * 37) + this.available_quantity.hashCode()) * 37) + this.cost_basis_input_quantity.hashCode()) * 37) + this.closed_quantity.hashCode()) * 37) + Boolean.hashCode(this.completed)) * 37) + Boolean.hashCode(this.attested);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("total_lots=" + this.total_lots);
        arrayList.add("total_quantity=" + Internal.sanitize(this.total_quantity));
        arrayList.add("available_quantity=" + Internal.sanitize(this.available_quantity));
        arrayList.add("cost_basis_input_quantity=" + Internal.sanitize(this.cost_basis_input_quantity));
        arrayList.add("closed_quantity=" + Internal.sanitize(this.closed_quantity));
        arrayList.add("completed=" + this.completed);
        arrayList.add("attested=" + this.attested);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CostBasisLotsSummary{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CostBasisLotsSummary copy$default(CostBasisLotsSummary costBasisLotsSummary, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = costBasisLotsSummary.total_lots;
        }
        if ((i2 & 2) != 0) {
            str = costBasisLotsSummary.total_quantity;
        }
        if ((i2 & 4) != 0) {
            str2 = costBasisLotsSummary.available_quantity;
        }
        if ((i2 & 8) != 0) {
            str3 = costBasisLotsSummary.cost_basis_input_quantity;
        }
        if ((i2 & 16) != 0) {
            str4 = costBasisLotsSummary.closed_quantity;
        }
        if ((i2 & 32) != 0) {
            z = costBasisLotsSummary.completed;
        }
        if ((i2 & 64) != 0) {
            z2 = costBasisLotsSummary.attested;
        }
        if ((i2 & 128) != 0) {
            byteString = costBasisLotsSummary.unknownFields();
        }
        boolean z3 = z2;
        ByteString byteString2 = byteString;
        String str5 = str4;
        boolean z4 = z;
        return costBasisLotsSummary.copy(i, str, str2, str3, str5, z4, z3, byteString2);
    }

    public final CostBasisLotsSummary copy(int total_lots, String total_quantity, String available_quantity, String cost_basis_input_quantity, String closed_quantity, boolean completed, boolean attested, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(total_quantity, "total_quantity");
        Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
        Intrinsics.checkNotNullParameter(cost_basis_input_quantity, "cost_basis_input_quantity");
        Intrinsics.checkNotNullParameter(closed_quantity, "closed_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CostBasisLotsSummary(total_lots, total_quantity, available_quantity, cost_basis_input_quantity, closed_quantity, completed, attested, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CostBasisLotsSummary.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CostBasisLotsSummary>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.CostBasisLotsSummary$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CostBasisLotsSummary value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_lots() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTotal_lots()));
                }
                if (!Intrinsics.areEqual(value.getTotal_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTotal_quantity());
                }
                if (!Intrinsics.areEqual(value.getAvailable_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAvailable_quantity());
                }
                if (!Intrinsics.areEqual(value.getCost_basis_input_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCost_basis_input_quantity());
                }
                if (!Intrinsics.areEqual(value.getClosed_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getClosed_quantity());
                }
                if (value.getCompleted()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getCompleted()));
                }
                return value.getAttested() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getAttested())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CostBasisLotsSummary value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_lots() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTotal_lots()));
                }
                if (!Intrinsics.areEqual(value.getTotal_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_quantity());
                }
                if (!Intrinsics.areEqual(value.getAvailable_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAvailable_quantity());
                }
                if (!Intrinsics.areEqual(value.getCost_basis_input_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCost_basis_input_quantity());
                }
                if (!Intrinsics.areEqual(value.getClosed_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getClosed_quantity());
                }
                if (value.getCompleted()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getCompleted()));
                }
                if (value.getAttested()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getAttested()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CostBasisLotsSummary value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAttested()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getAttested()));
                }
                if (value.getCompleted()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getCompleted()));
                }
                if (!Intrinsics.areEqual(value.getClosed_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getClosed_quantity());
                }
                if (!Intrinsics.areEqual(value.getCost_basis_input_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCost_basis_input_quantity());
                }
                if (!Intrinsics.areEqual(value.getAvailable_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAvailable_quantity());
                }
                if (!Intrinsics.areEqual(value.getTotal_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_quantity());
                }
                if (value.getTotal_lots() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTotal_lots()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CostBasisLotsSummary redact(CostBasisLotsSummary value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CostBasisLotsSummary.copy$default(value, 0, null, null, null, null, false, false, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CostBasisLotsSummary decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CostBasisLotsSummary(iIntValue, strDecode, strDecode2, strDecode3, strDecode4, zBooleanValue, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
