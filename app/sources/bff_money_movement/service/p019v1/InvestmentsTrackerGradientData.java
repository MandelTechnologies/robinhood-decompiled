package bff_money_movement.service.p019v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: InvestmentsTrackerGradientData.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerGradientData;", "Lcom/squareup/wire/Message;", "", "color_stops", "", "Lbff_money_movement/service/v1/InvestmentsTrackerColorStop;", "angle", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;DLokio/ByteString;)V", "getAngle", "()D", "getColor_stops", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerGradientData extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerGradientData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double angle;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerColorStop#ADAPTER", jsonName = "colorStops", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<InvestmentsTrackerColorStop> color_stops;

    public InvestmentsTrackerGradientData() {
        this(null, 0.0d, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8477newBuilder();
    }

    public /* synthetic */ InvestmentsTrackerGradientData(List list, double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final double getAngle() {
        return this.angle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerGradientData(List<InvestmentsTrackerColorStop> color_stops, double d, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(color_stops, "color_stops");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.angle = d;
        this.color_stops = Internal.immutableCopyOf("color_stops", color_stops);
    }

    public final List<InvestmentsTrackerColorStop> getColor_stops() {
        return this.color_stops;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8477newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerGradientData)) {
            return false;
        }
        InvestmentsTrackerGradientData investmentsTrackerGradientData = (InvestmentsTrackerGradientData) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerGradientData.unknownFields()) && Intrinsics.areEqual(this.color_stops, investmentsTrackerGradientData.color_stops) && this.angle == investmentsTrackerGradientData.angle;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.color_stops.hashCode()) * 37) + Double.hashCode(this.angle);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.color_stops.isEmpty()) {
            arrayList.add("color_stops=" + this.color_stops);
        }
        arrayList.add("angle=" + this.angle);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerGradientData{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestmentsTrackerGradientData copy$default(InvestmentsTrackerGradientData investmentsTrackerGradientData, List list, double d, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investmentsTrackerGradientData.color_stops;
        }
        if ((i & 2) != 0) {
            d = investmentsTrackerGradientData.angle;
        }
        if ((i & 4) != 0) {
            byteString = investmentsTrackerGradientData.unknownFields();
        }
        return investmentsTrackerGradientData.copy(list, d, byteString);
    }

    public final InvestmentsTrackerGradientData copy(List<InvestmentsTrackerColorStop> color_stops, double angle, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(color_stops, "color_stops");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerGradientData(color_stops, angle, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerGradientData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerGradientData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerGradientData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerGradientData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + InvestmentsTrackerColorStop.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getColor_stops());
                return !Double.valueOf(value.getAngle()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getAngle())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerGradientData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                InvestmentsTrackerColorStop.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getColor_stops());
                if (!Double.valueOf(value.getAngle()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getAngle()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerGradientData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Double.valueOf(value.getAngle()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getAngle()));
                }
                InvestmentsTrackerColorStop.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getColor_stops());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerGradientData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerGradientData(arrayList, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(InvestmentsTrackerColorStop.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerGradientData redact(InvestmentsTrackerGradientData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerGradientData.copy$default(value, Internal.m26823redactElements(value.getColor_stops(), InvestmentsTrackerColorStop.ADAPTER), 0.0d, ByteString.EMPTY, 2, null);
            }
        };
    }
}
