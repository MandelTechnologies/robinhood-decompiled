package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: ChartSettingChartType.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingChartType;", "Lcom/squareup/wire/Message;", "", "selected_type_value", "", "types", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getSelected_type_value", "()Ljava/lang/String;", "getTypes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ChartSettingChartType extends Message {

    @JvmField
    public static final ProtoAdapter<ChartSettingChartType> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedTypeValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String selected_type_value;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<ChartType> types;

    public ChartSettingChartType() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8558newBuilder();
    }

    public final String getSelected_type_value() {
        return this.selected_type_value;
    }

    public /* synthetic */ ChartSettingChartType(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartSettingChartType(String selected_type_value, List<ChartType> types, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(selected_type_value, "selected_type_value");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.selected_type_value = selected_type_value;
        this.types = Internal.immutableCopyOf("types", types);
    }

    public final List<ChartType> getTypes() {
        return this.types;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8558newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartSettingChartType)) {
            return false;
        }
        ChartSettingChartType chartSettingChartType = (ChartSettingChartType) other;
        return Intrinsics.areEqual(unknownFields(), chartSettingChartType.unknownFields()) && Intrinsics.areEqual(this.selected_type_value, chartSettingChartType.selected_type_value) && Intrinsics.areEqual(this.types, chartSettingChartType.types);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.selected_type_value.hashCode()) * 37) + this.types.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("selected_type_value=" + Internal.sanitize(this.selected_type_value));
        if (!this.types.isEmpty()) {
            arrayList.add("types=" + this.types);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartSettingChartType{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartSettingChartType copy$default(ChartSettingChartType chartSettingChartType, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartSettingChartType.selected_type_value;
        }
        if ((i & 2) != 0) {
            list = chartSettingChartType.types;
        }
        if ((i & 4) != 0) {
            byteString = chartSettingChartType.unknownFields();
        }
        return chartSettingChartType.copy(str, list, byteString);
    }

    public final ChartSettingChartType copy(String selected_type_value, List<ChartType> types, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(selected_type_value, "selected_type_value");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartSettingChartType(selected_type_value, types, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartSettingChartType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartSettingChartType>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingChartType$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartSettingChartType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSelected_type_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSelected_type_value());
                }
                return size + ChartType.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getTypes());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartSettingChartType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSelected_type_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSelected_type_value());
                }
                ChartType.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getTypes());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartSettingChartType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ChartType.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getTypes());
                if (Intrinsics.areEqual(value.getSelected_type_value(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSelected_type_value());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ChartSettingChartType decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ChartSettingChartType(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ChartType.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartSettingChartType redact(ChartSettingChartType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ChartSettingChartType.copy$default(value, null, Internal.m26823redactElements(value.getTypes(), ChartType.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
