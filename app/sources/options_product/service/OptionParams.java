package options_product.service;

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

/* compiled from: OptionParams.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016JV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m3636d2 = {"Loptions_product/service/OptionParams;", "Lcom/squareup/wire/Message;", "", "strike_price", "", "spot_price", "tau", "mark_price", "is_put", "", "is_european", "option_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(DDDDZZLjava/lang/String;Lokio/ByteString;)V", "getStrike_price", "()D", "getSpot_price", "getTau", "getMark_price", "()Z", "getOption_id", "()Ljava/lang/String;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OptionParams extends Message {

    @JvmField
    public static final ProtoAdapter<OptionParams> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEuropean", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_european;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPut", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_put;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "markPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double mark_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "optionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String option_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "spotPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double spot_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "strikePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double strike_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double tau;

    public OptionParams() {
        this(0.0d, 0.0d, 0.0d, 0.0d, false, false, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29523newBuilder();
    }

    public final double getStrike_price() {
        return this.strike_price;
    }

    public final double getSpot_price() {
        return this.spot_price;
    }

    public final double getTau() {
        return this.tau;
    }

    public final double getMark_price() {
        return this.mark_price;
    }

    /* renamed from: is_put, reason: from getter */
    public final boolean getIs_put() {
        return this.is_put;
    }

    /* renamed from: is_european, reason: from getter */
    public final boolean getIs_european() {
        return this.is_european;
    }

    public final String getOption_id() {
        return this.option_id;
    }

    public /* synthetic */ OptionParams(double d, double d2, double d3, double d4, boolean z, boolean z2, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) == 0 ? d4 : 0.0d, (i & 16) != 0 ? false : z, (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionParams(double d, double d2, double d3, double d4, boolean z, boolean z2, String option_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(option_id, "option_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.strike_price = d;
        this.spot_price = d2;
        this.tau = d3;
        this.mark_price = d4;
        this.is_put = z;
        this.is_european = z2;
        this.option_id = option_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29523newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionParams)) {
            return false;
        }
        OptionParams optionParams = (OptionParams) other;
        return Intrinsics.areEqual(unknownFields(), optionParams.unknownFields()) && this.strike_price == optionParams.strike_price && this.spot_price == optionParams.spot_price && this.tau == optionParams.tau && this.mark_price == optionParams.mark_price && this.is_put == optionParams.is_put && this.is_european == optionParams.is_european && Intrinsics.areEqual(this.option_id, optionParams.option_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + Double.hashCode(this.strike_price)) * 37) + Double.hashCode(this.spot_price)) * 37) + Double.hashCode(this.tau)) * 37) + Double.hashCode(this.mark_price)) * 37) + Boolean.hashCode(this.is_put)) * 37) + Boolean.hashCode(this.is_european)) * 37) + this.option_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("strike_price=" + this.strike_price);
        arrayList.add("spot_price=" + this.spot_price);
        arrayList.add("tau=" + this.tau);
        arrayList.add("mark_price=" + this.mark_price);
        arrayList.add("is_put=" + this.is_put);
        arrayList.add("is_european=" + this.is_european);
        arrayList.add("option_id=" + Internal.sanitize(this.option_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionParams copy$default(OptionParams optionParams, double d, double d2, double d3, double d4, boolean z, boolean z2, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = optionParams.strike_price;
        }
        return optionParams.copy(d, (i & 2) != 0 ? optionParams.spot_price : d2, (i & 4) != 0 ? optionParams.tau : d3, (i & 8) != 0 ? optionParams.mark_price : d4, (i & 16) != 0 ? optionParams.is_put : z, (i & 32) != 0 ? optionParams.is_european : z2, (i & 64) != 0 ? optionParams.option_id : str, (i & 128) != 0 ? optionParams.unknownFields() : byteString);
    }

    public final OptionParams copy(double strike_price, double spot_price, double tau, double mark_price, boolean is_put, boolean is_european, String option_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(option_id, "option_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionParams(strike_price, spot_price, tau, mark_price, is_put, is_european, option_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionParams.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionParams>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.OptionParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getStrike_price());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getStrike_price()));
                }
                if (!Double.valueOf(value.getSpot_price()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getSpot_price()));
                }
                if (!Double.valueOf(value.getTau()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getTau()));
                }
                if (!Double.valueOf(value.getMark_price()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getMark_price()));
                }
                if (value.getIs_put()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_put()));
                }
                if (value.getIs_european()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_european()));
                }
                return !Intrinsics.areEqual(value.getOption_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getOption_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getStrike_price());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getStrike_price()));
                }
                if (!Double.valueOf(value.getSpot_price()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getSpot_price()));
                }
                if (!Double.valueOf(value.getTau()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getTau()));
                }
                if (!Double.valueOf(value.getMark_price()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getMark_price()));
                }
                if (value.getIs_put()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_put()));
                }
                if (value.getIs_european()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_european()));
                }
                if (!Intrinsics.areEqual(value.getOption_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getOption_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionParams value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getOption_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getOption_id());
                }
                if (value.getIs_european()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_european()));
                }
                if (value.getIs_put()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_put()));
                }
                if (!Double.valueOf(value.getMark_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getMark_price()));
                }
                if (!Double.valueOf(value.getTau()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getTau()));
                }
                if (!Double.valueOf(value.getSpot_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getSpot_price()));
                }
                if (Double.valueOf(value.getStrike_price()).equals(dValueOf)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getStrike_price()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionParams redact(OptionParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionParams.copy$default(value, 0.0d, 0.0d, 0.0d, 0.0d, false, false, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionParams decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 2:
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 3:
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 4:
                                dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new OptionParams(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, zBooleanValue, zBooleanValue2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
