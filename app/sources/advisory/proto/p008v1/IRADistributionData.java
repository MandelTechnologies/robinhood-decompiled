package advisory.proto.p008v1;

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

/* compiled from: IRADistributionData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Ladvisory/proto/v1/IRADistributionData;", "Lcom/squareup/wire/Message;", "", "federal_tax_withholding_rate", "", "state_tax_withholding_rate", "postal_state", "", "unknownFields", "Lokio/ByteString;", "<init>", "(DDLjava/lang/String;Lokio/ByteString;)V", "getFederal_tax_withholding_rate", "()D", "getState_tax_withholding_rate", "getPostal_state", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class IRADistributionData extends Message {

    @JvmField
    public static final ProtoAdapter<IRADistributionData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "federalTaxWithholdingRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double federal_tax_withholding_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "postalState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String postal_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "stateTaxWithholdingRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double state_tax_withholding_rate;

    public IRADistributionData() {
        this(0.0d, 0.0d, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4504newBuilder();
    }

    public final double getFederal_tax_withholding_rate() {
        return this.federal_tax_withholding_rate;
    }

    public final double getState_tax_withholding_rate() {
        return this.state_tax_withholding_rate;
    }

    public final String getPostal_state() {
        return this.postal_state;
    }

    public /* synthetic */ IRADistributionData(double d, double d2, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IRADistributionData(double d, double d2, String postal_state, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(postal_state, "postal_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.federal_tax_withholding_rate = d;
        this.state_tax_withholding_rate = d2;
        this.postal_state = postal_state;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4504newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IRADistributionData)) {
            return false;
        }
        IRADistributionData iRADistributionData = (IRADistributionData) other;
        return Intrinsics.areEqual(unknownFields(), iRADistributionData.unknownFields()) && this.federal_tax_withholding_rate == iRADistributionData.federal_tax_withholding_rate && this.state_tax_withholding_rate == iRADistributionData.state_tax_withholding_rate && Intrinsics.areEqual(this.postal_state, iRADistributionData.postal_state);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Double.hashCode(this.federal_tax_withholding_rate)) * 37) + Double.hashCode(this.state_tax_withholding_rate)) * 37) + this.postal_state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("federal_tax_withholding_rate=" + this.federal_tax_withholding_rate);
        arrayList.add("state_tax_withholding_rate=" + this.state_tax_withholding_rate);
        arrayList.add("postal_state=" + Internal.sanitize(this.postal_state));
        return CollectionsKt.joinToString$default(arrayList, ", ", "IRADistributionData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IRADistributionData copy$default(IRADistributionData iRADistributionData, double d, double d2, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = iRADistributionData.federal_tax_withholding_rate;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = iRADistributionData.state_tax_withholding_rate;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            str = iRADistributionData.postal_state;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            byteString = iRADistributionData.unknownFields();
        }
        return iRADistributionData.copy(d3, d4, str2, byteString);
    }

    public final IRADistributionData copy(double federal_tax_withholding_rate, double state_tax_withholding_rate, String postal_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(postal_state, "postal_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IRADistributionData(federal_tax_withholding_rate, state_tax_withholding_rate, postal_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IRADistributionData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IRADistributionData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.IRADistributionData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IRADistributionData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getFederal_tax_withholding_rate());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getFederal_tax_withholding_rate()));
                }
                if (!Double.valueOf(value.getState_tax_withholding_rate()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getState_tax_withholding_rate()));
                }
                return !Intrinsics.areEqual(value.getPostal_state(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPostal_state()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IRADistributionData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getFederal_tax_withholding_rate());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getFederal_tax_withholding_rate()));
                }
                if (!Double.valueOf(value.getState_tax_withholding_rate()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getState_tax_withholding_rate()));
                }
                if (!Intrinsics.areEqual(value.getPostal_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPostal_state());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IRADistributionData value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPostal_state(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPostal_state());
                }
                if (!Double.valueOf(value.getState_tax_withholding_rate()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getState_tax_withholding_rate()));
                }
                if (Double.valueOf(value.getFederal_tax_withholding_rate()).equals(dValueOf)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getFederal_tax_withholding_rate()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IRADistributionData redact(IRADistributionData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IRADistributionData.copy$default(value, 0.0d, 0.0d, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IRADistributionData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IRADistributionData(dDoubleValue, dDoubleValue2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 2) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
