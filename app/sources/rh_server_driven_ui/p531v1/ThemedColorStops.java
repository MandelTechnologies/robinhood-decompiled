package rh_server_driven_ui.p531v1;

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

/* compiled from: ThemedColorStops.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J0\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lrh_server_driven_ui/v1/ThemedColorStops;", "Lcom/squareup/wire/Message;", "", "light", "", "Lrh_server_driven_ui/v1/ColorStopData;", "dark", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getLight", "()Ljava/util/List;", "getDark", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ThemedColorStops extends Message {

    @JvmField
    public static final ProtoAdapter<ThemedColorStops> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ColorStopData#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<ColorStopData> dark;

    @WireField(adapter = "rh_server_driven_ui.v1.ColorStopData#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<ColorStopData> light;

    public ThemedColorStops() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29846newBuilder();
    }

    public /* synthetic */ ThemedColorStops(List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemedColorStops(List<ColorStopData> light, List<ColorStopData> dark, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.light = Internal.immutableCopyOf("light", light);
        this.dark = Internal.immutableCopyOf("dark", dark);
    }

    public final List<ColorStopData> getLight() {
        return this.light;
    }

    public final List<ColorStopData> getDark() {
        return this.dark;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29846newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ThemedColorStops)) {
            return false;
        }
        ThemedColorStops themedColorStops = (ThemedColorStops) other;
        return Intrinsics.areEqual(unknownFields(), themedColorStops.unknownFields()) && Intrinsics.areEqual(this.light, themedColorStops.light) && Intrinsics.areEqual(this.dark, themedColorStops.dark);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.light.hashCode()) * 37) + this.dark.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.light.isEmpty()) {
            arrayList.add("light=" + this.light);
        }
        if (!this.dark.isEmpty()) {
            arrayList.add("dark=" + this.dark);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThemedColorStops{", "}", 0, null, null, 56, null);
    }

    public final ThemedColorStops copy(List<ColorStopData> light, List<ColorStopData> dark, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ThemedColorStops(light, dark, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ThemedColorStops.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ThemedColorStops>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ThemedColorStops$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ThemedColorStops value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<ColorStopData> protoAdapter = ColorStopData.ADAPTER;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getLight()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getDark());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ThemedColorStops value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<ColorStopData> protoAdapter = ColorStopData.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getLight());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getDark());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ThemedColorStops value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<ColorStopData> protoAdapter = ColorStopData.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getDark());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getLight());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ThemedColorStops decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ThemedColorStops(arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ColorStopData.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        arrayList2.add(ColorStopData.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ThemedColorStops redact(ThemedColorStops value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<ColorStopData> light = value.getLight();
                ProtoAdapter<ColorStopData> protoAdapter = ColorStopData.ADAPTER;
                return value.copy(Internal.m26823redactElements(light, protoAdapter), Internal.m26823redactElements(value.getDark(), protoAdapter), ByteString.EMPTY);
            }
        };
    }
}
