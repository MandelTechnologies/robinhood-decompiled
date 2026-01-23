package options_product.service;

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

/* compiled from: SimulatedReturnsParams.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\bH\u0016J~\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001b¨\u0006)"}, m3636d2 = {"Loptions_product/service/SimulatedReturnsParams;", "Lcom/squareup/wire/Message;", "", "implied_volatility", "", "yield_input", "interest_rate", "option_id", "", "is_valid_iv", "", "strike_price", "spot_price", "tau", "mark_price", "is_put", "is_european", "unknownFields", "Lokio/ByteString;", "<init>", "(DDDLjava/lang/String;ZDDDDZZLokio/ByteString;)V", "getImplied_volatility", "()D", "getYield_input", "getInterest_rate", "getOption_id", "()Ljava/lang/String;", "()Z", "getStrike_price", "getSpot_price", "getTau", "getMark_price", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class SimulatedReturnsParams extends Message {

    @JvmField
    public static final ProtoAdapter<SimulatedReturnsParams> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "impliedVolatility", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double implied_volatility;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "interestRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double interest_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEuropean", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final boolean is_european;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPut", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean is_put;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isValidIv", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_valid_iv;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "markPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final double mark_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "optionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String option_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "spotPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double spot_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "strikePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double strike_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final double tau;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "yieldInput", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double yield_input;

    public SimulatedReturnsParams() {
        this(0.0d, 0.0d, 0.0d, null, false, 0.0d, 0.0d, 0.0d, 0.0d, false, false, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29561newBuilder();
    }

    public final double getImplied_volatility() {
        return this.implied_volatility;
    }

    public final double getYield_input() {
        return this.yield_input;
    }

    public final double getInterest_rate() {
        return this.interest_rate;
    }

    public final String getOption_id() {
        return this.option_id;
    }

    public /* synthetic */ SimulatedReturnsParams(double d, double d2, double d3, String str, boolean z, double d4, double d5, double d6, double d7, boolean z2, boolean z3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 0.0d : d4, (i & 64) != 0 ? 0.0d : d5, (i & 128) != 0 ? 0.0d : d6, (i & 256) != 0 ? 0.0d : d7, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_valid_iv, reason: from getter */
    public final boolean getIs_valid_iv() {
        return this.is_valid_iv;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimulatedReturnsParams(double d, double d2, double d3, String option_id, boolean z, double d4, double d5, double d6, double d7, boolean z2, boolean z3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(option_id, "option_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.implied_volatility = d;
        this.yield_input = d2;
        this.interest_rate = d3;
        this.option_id = option_id;
        this.is_valid_iv = z;
        this.strike_price = d4;
        this.spot_price = d5;
        this.tau = d6;
        this.mark_price = d7;
        this.is_put = z2;
        this.is_european = z3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29561newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SimulatedReturnsParams)) {
            return false;
        }
        SimulatedReturnsParams simulatedReturnsParams = (SimulatedReturnsParams) other;
        return Intrinsics.areEqual(unknownFields(), simulatedReturnsParams.unknownFields()) && this.implied_volatility == simulatedReturnsParams.implied_volatility && this.yield_input == simulatedReturnsParams.yield_input && this.interest_rate == simulatedReturnsParams.interest_rate && Intrinsics.areEqual(this.option_id, simulatedReturnsParams.option_id) && this.is_valid_iv == simulatedReturnsParams.is_valid_iv && this.strike_price == simulatedReturnsParams.strike_price && this.spot_price == simulatedReturnsParams.spot_price && this.tau == simulatedReturnsParams.tau && this.mark_price == simulatedReturnsParams.mark_price && this.is_put == simulatedReturnsParams.is_put && this.is_european == simulatedReturnsParams.is_european;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((unknownFields().hashCode() * 37) + Double.hashCode(this.implied_volatility)) * 37) + Double.hashCode(this.yield_input)) * 37) + Double.hashCode(this.interest_rate)) * 37) + this.option_id.hashCode()) * 37) + Boolean.hashCode(this.is_valid_iv)) * 37) + Double.hashCode(this.strike_price)) * 37) + Double.hashCode(this.spot_price)) * 37) + Double.hashCode(this.tau)) * 37) + Double.hashCode(this.mark_price)) * 37) + Boolean.hashCode(this.is_put)) * 37) + Boolean.hashCode(this.is_european);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("implied_volatility=" + this.implied_volatility);
        arrayList.add("yield_input=" + this.yield_input);
        arrayList.add("interest_rate=" + this.interest_rate);
        arrayList.add("option_id=" + Internal.sanitize(this.option_id));
        arrayList.add("is_valid_iv=" + this.is_valid_iv);
        arrayList.add("strike_price=" + this.strike_price);
        arrayList.add("spot_price=" + this.spot_price);
        arrayList.add("tau=" + this.tau);
        arrayList.add("mark_price=" + this.mark_price);
        arrayList.add("is_put=" + this.is_put);
        arrayList.add("is_european=" + this.is_european);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SimulatedReturnsParams{", "}", 0, null, null, 56, null);
    }

    public final SimulatedReturnsParams copy(double implied_volatility, double yield_input, double interest_rate, String option_id, boolean is_valid_iv, double strike_price, double spot_price, double tau, double mark_price, boolean is_put, boolean is_european, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(option_id, "option_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SimulatedReturnsParams(implied_volatility, yield_input, interest_rate, option_id, is_valid_iv, strike_price, spot_price, tau, mark_price, is_put, is_european, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SimulatedReturnsParams.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SimulatedReturnsParams>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.SimulatedReturnsParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SimulatedReturnsParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getImplied_volatility());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getImplied_volatility()));
                }
                if (!Double.valueOf(value.getYield_input()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getYield_input()));
                }
                if (!Double.valueOf(value.getInterest_rate()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getInterest_rate()));
                }
                if (!Intrinsics.areEqual(value.getOption_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOption_id());
                }
                if (value.getIs_valid_iv()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_valid_iv()));
                }
                if (!Double.valueOf(value.getStrike_price()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getStrike_price()));
                }
                if (!Double.valueOf(value.getSpot_price()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getSpot_price()));
                }
                if (!Double.valueOf(value.getTau()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(8, Double.valueOf(value.getTau()));
                }
                if (!Double.valueOf(value.getMark_price()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(9, Double.valueOf(value.getMark_price()));
                }
                if (value.getIs_put()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getIs_put()));
                }
                return value.getIs_european() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(11, Boolean.valueOf(value.getIs_european())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SimulatedReturnsParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getImplied_volatility());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getImplied_volatility()));
                }
                if (!Double.valueOf(value.getYield_input()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getYield_input()));
                }
                if (!Double.valueOf(value.getInterest_rate()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getInterest_rate()));
                }
                if (!Intrinsics.areEqual(value.getOption_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOption_id());
                }
                if (value.getIs_valid_iv()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_valid_iv()));
                }
                if (!Double.valueOf(value.getStrike_price()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getStrike_price()));
                }
                if (!Double.valueOf(value.getSpot_price()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getSpot_price()));
                }
                if (!Double.valueOf(value.getTau()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getTau()));
                }
                if (!Double.valueOf(value.getMark_price()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getMark_price()));
                }
                if (value.getIs_put()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getIs_put()));
                }
                if (value.getIs_european()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) Boolean.valueOf(value.getIs_european()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SimulatedReturnsParams value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_european()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) Boolean.valueOf(value.getIs_european()));
                }
                if (value.getIs_put()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getIs_put()));
                }
                if (!Double.valueOf(value.getMark_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getMark_price()));
                }
                if (!Double.valueOf(value.getTau()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getTau()));
                }
                if (!Double.valueOf(value.getSpot_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getSpot_price()));
                }
                if (!Double.valueOf(value.getStrike_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getStrike_price()));
                }
                if (value.getIs_valid_iv()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_valid_iv()));
                }
                if (!Intrinsics.areEqual(value.getOption_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOption_id());
                }
                if (!Double.valueOf(value.getInterest_rate()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getInterest_rate()));
                }
                if (!Double.valueOf(value.getYield_input()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getYield_input()));
                }
                if (Double.valueOf(value.getImplied_volatility()).equals(dValueOf)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getImplied_volatility()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SimulatedReturnsParams redact(SimulatedReturnsParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((2047 & 1) != 0 ? value.implied_volatility : 0.0d, (2047 & 2) != 0 ? value.yield_input : 0.0d, (2047 & 4) != 0 ? value.interest_rate : 0.0d, (2047 & 8) != 0 ? value.option_id : null, (2047 & 16) != 0 ? value.is_valid_iv : false, (2047 & 32) != 0 ? value.strike_price : 0.0d, (2047 & 64) != 0 ? value.spot_price : 0.0d, (2047 & 128) != 0 ? value.tau : 0.0d, (2047 & 256) != 0 ? value.mark_price : 0.0d, (2047 & 512) != 0 ? value.is_put : false, (2047 & 1024) != 0 ? value.is_european : false, (2047 & 2048) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SimulatedReturnsParams decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                double dDoubleValue5 = 0.0d;
                double dDoubleValue6 = 0.0d;
                double dDoubleValue7 = 0.0d;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
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
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 7:
                                dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 8:
                                dDoubleValue6 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 9:
                                dDoubleValue7 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 10:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 11:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new SimulatedReturnsParams(dDoubleValue, dDoubleValue2, dDoubleValue3, strDecode, zBooleanValue, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, zBooleanValue2, zBooleanValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
