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

/* compiled from: SetChartSettings.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B-\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J,\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettings;", "Lcom/squareup/wire/Message;", "", "sections", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSection;", "y_axis_section", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSection;Lokio/ByteString;)V", "getY_axis_section", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSection;", "getSections", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SetChartSettings extends Message {

    @JvmField
    public static final ProtoAdapter<SetChartSettings> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 3)
    private final List<ChartSettingSection> sections;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingSection#ADAPTER", jsonName = "yAxisSection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 4)
    private final ChartSettingSection y_axis_section;

    public SetChartSettings() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8653newBuilder();
    }

    public /* synthetic */ SetChartSettings(List list, ChartSettingSection chartSettingSection, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : chartSettingSection, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ChartSettingSection getY_axis_section() {
        return this.y_axis_section;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetChartSettings(List<ChartSettingSection> sections, ChartSettingSection chartSettingSection, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.y_axis_section = chartSettingSection;
        this.sections = Internal.immutableCopyOf("sections", sections);
    }

    public final List<ChartSettingSection> getSections() {
        return this.sections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8653newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetChartSettings)) {
            return false;
        }
        SetChartSettings setChartSettings = (SetChartSettings) other;
        return Intrinsics.areEqual(unknownFields(), setChartSettings.unknownFields()) && Intrinsics.areEqual(this.sections, setChartSettings.sections) && Intrinsics.areEqual(this.y_axis_section, setChartSettings.y_axis_section);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.sections.hashCode()) * 37;
        ChartSettingSection chartSettingSection = this.y_axis_section;
        int iHashCode2 = iHashCode + (chartSettingSection != null ? chartSettingSection.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.sections.isEmpty()) {
            arrayList.add("sections=" + this.sections);
        }
        ChartSettingSection chartSettingSection = this.y_axis_section;
        if (chartSettingSection != null) {
            arrayList.add("y_axis_section=" + chartSettingSection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetChartSettings{", "}", 0, null, null, 56, null);
    }

    public final SetChartSettings copy(List<ChartSettingSection> sections, ChartSettingSection y_axis_section, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetChartSettings(sections, y_axis_section, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetChartSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetChartSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.SetChartSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetChartSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<ChartSettingSection> protoAdapter = ChartSettingSection.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getSections());
                return value.getY_axis_section() != null ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getY_axis_section()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetChartSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<ChartSettingSection> protoAdapter = ChartSettingSection.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getSections());
                if (value.getY_axis_section() != null) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getY_axis_section());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetChartSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getY_axis_section() != null) {
                    ChartSettingSection.ADAPTER.encodeWithTag(writer, 4, (int) value.getY_axis_section());
                }
                ChartSettingSection.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSections());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetChartSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                ChartSettingSection chartSettingSectionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetChartSettings(arrayList, chartSettingSectionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 3) {
                        arrayList.add(ChartSettingSection.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        chartSettingSectionDecode = ChartSettingSection.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetChartSettings redact(SetChartSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<ChartSettingSection> sections = value.getSections();
                ProtoAdapter<ChartSettingSection> protoAdapter = ChartSettingSection.ADAPTER;
                List<ChartSettingSection> listM26823redactElements = Internal.m26823redactElements(sections, protoAdapter);
                ChartSettingSection y_axis_section = value.getY_axis_section();
                return value.copy(listM26823redactElements, y_axis_section != null ? protoAdapter.redact(y_axis_section) : null, ByteString.EMPTY);
            }
        };
    }
}
