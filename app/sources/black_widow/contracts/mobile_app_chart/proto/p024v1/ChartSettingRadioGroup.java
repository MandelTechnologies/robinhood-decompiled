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

/* compiled from: ChartSettingRadioGroup.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingRadioGroup;", "Lcom/squareup/wire/Message;", "", "title", "", "selected_value", "options", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSelectionOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSelected_value", "getOptions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ChartSettingRadioGroup extends Message {

    @JvmField
    public static final ProtoAdapter<ChartSettingRadioGroup> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingSelectionOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<ChartSettingSelectionOption> options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String selected_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public ChartSettingRadioGroup() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ ChartSettingRadioGroup(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8567newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSelected_value() {
        return this.selected_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartSettingRadioGroup(String title, String selected_value, List<ChartSettingSelectionOption> options, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selected_value, "selected_value");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.selected_value = selected_value;
        this.options = Internal.immutableCopyOf("options", options);
    }

    public final List<ChartSettingSelectionOption> getOptions() {
        return this.options;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8567newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartSettingRadioGroup)) {
            return false;
        }
        ChartSettingRadioGroup chartSettingRadioGroup = (ChartSettingRadioGroup) other;
        return Intrinsics.areEqual(unknownFields(), chartSettingRadioGroup.unknownFields()) && Intrinsics.areEqual(this.title, chartSettingRadioGroup.title) && Intrinsics.areEqual(this.selected_value, chartSettingRadioGroup.selected_value) && Intrinsics.areEqual(this.options, chartSettingRadioGroup.options);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.selected_value.hashCode()) * 37) + this.options.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("selected_value=" + Internal.sanitize(this.selected_value));
        if (!this.options.isEmpty()) {
            arrayList.add("options=" + this.options);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartSettingRadioGroup{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartSettingRadioGroup copy$default(ChartSettingRadioGroup chartSettingRadioGroup, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartSettingRadioGroup.title;
        }
        if ((i & 2) != 0) {
            str2 = chartSettingRadioGroup.selected_value;
        }
        if ((i & 4) != 0) {
            list = chartSettingRadioGroup.options;
        }
        if ((i & 8) != 0) {
            byteString = chartSettingRadioGroup.unknownFields();
        }
        return chartSettingRadioGroup.copy(str, str2, list, byteString);
    }

    public final ChartSettingRadioGroup copy(String title, String selected_value, List<ChartSettingSelectionOption> options, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selected_value, "selected_value");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartSettingRadioGroup(title, selected_value, options, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartSettingRadioGroup.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartSettingRadioGroup>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.ChartSettingRadioGroup$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartSettingRadioGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSelected_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSelected_value());
                }
                return size + ChartSettingSelectionOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getOptions());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartSettingRadioGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSelected_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSelected_value());
                }
                ChartSettingSelectionOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOptions());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartSettingRadioGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ChartSettingSelectionOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOptions());
                if (!Intrinsics.areEqual(value.getSelected_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSelected_value());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ChartSettingRadioGroup decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ChartSettingRadioGroup(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(ChartSettingSelectionOption.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartSettingRadioGroup redact(ChartSettingRadioGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ChartSettingRadioGroup.copy$default(value, null, null, Internal.m26823redactElements(value.getOptions(), ChartSettingSelectionOption.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}
