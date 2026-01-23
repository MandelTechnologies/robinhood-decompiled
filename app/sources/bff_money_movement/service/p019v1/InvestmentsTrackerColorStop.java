package bff_money_movement.service.p019v1;

import com.robinhood.utils.extensions.ResourceTypes;
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

/* compiled from: InvestmentsTrackerColorStop.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerColorStop;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "", "stop", "", "opacity", "color_dark", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;DDLjava/lang/String;Lokio/ByteString;)V", "getColor", "()Ljava/lang/String;", "getStop", "()D", "getOpacity", "getColor_dark", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerColorStop extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerColorStop> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "colorDark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String color_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double opacity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double stop;

    public InvestmentsTrackerColorStop() {
        this(null, 0.0d, 0.0d, null, null, 31, null);
    }

    public /* synthetic */ InvestmentsTrackerColorStop(String str, double d, double d2, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8449newBuilder();
    }

    public final String getColor() {
        return this.color;
    }

    public final double getStop() {
        return this.stop;
    }

    public final double getOpacity() {
        return this.opacity;
    }

    public final String getColor_dark() {
        return this.color_dark;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerColorStop(String color, double d, double d2, String color_dark, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(color_dark, "color_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.color = color;
        this.stop = d;
        this.opacity = d2;
        this.color_dark = color_dark;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8449newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerColorStop)) {
            return false;
        }
        InvestmentsTrackerColorStop investmentsTrackerColorStop = (InvestmentsTrackerColorStop) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerColorStop.unknownFields()) && Intrinsics.areEqual(this.color, investmentsTrackerColorStop.color) && this.stop == investmentsTrackerColorStop.stop && this.opacity == investmentsTrackerColorStop.opacity && Intrinsics.areEqual(this.color_dark, investmentsTrackerColorStop.color_dark);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.color.hashCode()) * 37) + Double.hashCode(this.stop)) * 37) + Double.hashCode(this.opacity)) * 37) + this.color_dark.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("color=" + Internal.sanitize(this.color));
        arrayList.add("stop=" + this.stop);
        arrayList.add("opacity=" + this.opacity);
        arrayList.add("color_dark=" + Internal.sanitize(this.color_dark));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerColorStop{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerColorStop copy$default(InvestmentsTrackerColorStop investmentsTrackerColorStop, String str, double d, double d2, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerColorStop.color;
        }
        if ((i & 2) != 0) {
            d = investmentsTrackerColorStop.stop;
        }
        if ((i & 4) != 0) {
            d2 = investmentsTrackerColorStop.opacity;
        }
        if ((i & 8) != 0) {
            str2 = investmentsTrackerColorStop.color_dark;
        }
        if ((i & 16) != 0) {
            byteString = investmentsTrackerColorStop.unknownFields();
        }
        double d3 = d2;
        return investmentsTrackerColorStop.copy(str, d, d3, str2, byteString);
    }

    public final InvestmentsTrackerColorStop copy(String color, double stop, double opacity, String color_dark, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(color_dark, "color_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerColorStop(color, stop, opacity, color_dark, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerColorStop.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerColorStop>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerColorStop$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerColorStop value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getColor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getColor());
                }
                if (!Double.valueOf(value.getStop()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getStop()));
                }
                if (!Double.valueOf(value.getOpacity()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getOpacity()));
                }
                return !Intrinsics.areEqual(value.getColor_dark(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getColor_dark()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerColorStop value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getColor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getColor());
                }
                if (!Double.valueOf(value.getStop()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getStop()));
                }
                if (!Double.valueOf(value.getOpacity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getOpacity()));
                }
                if (!Intrinsics.areEqual(value.getColor_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getColor_dark());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerColorStop value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getColor_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getColor_dark());
                }
                if (!Double.valueOf(value.getOpacity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getOpacity()));
                }
                if (!Double.valueOf(value.getStop()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getStop()));
                }
                if (Intrinsics.areEqual(value.getColor(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getColor());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerColorStop redact(InvestmentsTrackerColorStop value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerColorStop.copy$default(value, null, 0.0d, 0.0d, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerColorStop decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerColorStop(strDecode, dDoubleValue, dDoubleValue2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 3) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
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
