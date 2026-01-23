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

/* compiled from: ChartSettingMultiSelectGroup.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingMultiSelectGroup;", "Lcom/squareup/wire/Message;", "", "title", "", "selected_values", "", "options", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSelectionOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSelected_values", "()Ljava/util/List;", "getOptions", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ChartSettingMultiSelectGroup extends Message {

    @JvmField
    public static final ProtoAdapter<ChartSettingMultiSelectGroup> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingSelectionOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<ChartSettingSelectionOption> options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedValues", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> selected_values;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public ChartSettingMultiSelectGroup() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8563newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ ChartSettingMultiSelectGroup(String str, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartSettingMultiSelectGroup(String title, List<String> selected_values, List<ChartSettingSelectionOption> options, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selected_values, "selected_values");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.selected_values = Internal.immutableCopyOf("selected_values", selected_values);
        this.options = Internal.immutableCopyOf("options", options);
    }

    public final List<String> getSelected_values() {
        return this.selected_values;
    }

    public final List<ChartSettingSelectionOption> getOptions() {
        return this.options;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8563newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartSettingMultiSelectGroup)) {
            return false;
        }
        ChartSettingMultiSelectGroup chartSettingMultiSelectGroup = (ChartSettingMultiSelectGroup) other;
        return Intrinsics.areEqual(unknownFields(), chartSettingMultiSelectGroup.unknownFields()) && Intrinsics.areEqual(this.title, chartSettingMultiSelectGroup.title) && Intrinsics.areEqual(this.selected_values, chartSettingMultiSelectGroup.selected_values) && Intrinsics.areEqual(this.options, chartSettingMultiSelectGroup.options);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.selected_values.hashCode()) * 37) + this.options.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.selected_values.isEmpty()) {
            arrayList.add("selected_values=" + Internal.sanitize(this.selected_values));
        }
        if (!this.options.isEmpty()) {
            arrayList.add("options=" + this.options);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartSettingMultiSelectGroup{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartSettingMultiSelectGroup copy$default(ChartSettingMultiSelectGroup chartSettingMultiSelectGroup, String str, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartSettingMultiSelectGroup.title;
        }
        if ((i & 2) != 0) {
            list = chartSettingMultiSelectGroup.selected_values;
        }
        if ((i & 4) != 0) {
            list2 = chartSettingMultiSelectGroup.options;
        }
        if ((i & 8) != 0) {
            byteString = chartSettingMultiSelectGroup.unknownFields();
        }
        return chartSettingMultiSelectGroup.copy(str, list, list2, byteString);
    }

    public final ChartSettingMultiSelectGroup copy(String title, List<String> selected_values, List<ChartSettingSelectionOption> options, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selected_values, "selected_values");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartSettingMultiSelectGroup(title, selected_values, options, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartSettingMultiSelectGroup.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartSettingMultiSelectGroup>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingMultiSelectGroup$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartSettingMultiSelectGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.getSelected_values()) + ChartSettingSelectionOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getOptions());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartSettingMultiSelectGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getSelected_values());
                ChartSettingSelectionOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOptions());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartSettingMultiSelectGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ChartSettingSelectionOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOptions());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getSelected_values());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ChartSettingMultiSelectGroup decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ChartSettingMultiSelectGroup(strDecode, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(ChartSettingSelectionOption.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartSettingMultiSelectGroup redact(ChartSettingMultiSelectGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ChartSettingMultiSelectGroup.copy$default(value, null, null, Internal.m26823redactElements(value.getOptions(), ChartSettingSelectionOption.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}
