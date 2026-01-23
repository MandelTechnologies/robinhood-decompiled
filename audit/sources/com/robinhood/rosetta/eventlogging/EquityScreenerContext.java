package com.robinhood.rosetta.eventlogging;

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

/* compiled from: EquityScreenerContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityScreenerContext;", "Lcom/squareup/wire/Message;", "", "name", "", "selected_indicator_keys", "", "visible_column_keys", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getSelected_indicator_keys", "()Ljava/util/List;", "getVisible_column_keys", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EquityScreenerContext extends Message {

    @JvmField
    public static final ProtoAdapter<EquityScreenerContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedIndicatorKeys", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final java.util.List<String> selected_indicator_keys;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "visibleColumnKeys", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final java.util.List<String> visible_column_keys;

    public EquityScreenerContext() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24252newBuilder();
    }

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ EquityScreenerContext(String str, java.util.List list, java.util.List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityScreenerContext(String name, java.util.List<String> selected_indicator_keys, java.util.List<String> visible_column_keys, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selected_indicator_keys, "selected_indicator_keys");
        Intrinsics.checkNotNullParameter(visible_column_keys, "visible_column_keys");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.selected_indicator_keys = Internal.immutableCopyOf("selected_indicator_keys", selected_indicator_keys);
        this.visible_column_keys = Internal.immutableCopyOf("visible_column_keys", visible_column_keys);
    }

    public final java.util.List<String> getSelected_indicator_keys() {
        return this.selected_indicator_keys;
    }

    public final java.util.List<String> getVisible_column_keys() {
        return this.visible_column_keys;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24252newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EquityScreenerContext)) {
            return false;
        }
        EquityScreenerContext equityScreenerContext = (EquityScreenerContext) other;
        return Intrinsics.areEqual(unknownFields(), equityScreenerContext.unknownFields()) && Intrinsics.areEqual(this.name, equityScreenerContext.name) && Intrinsics.areEqual(this.selected_indicator_keys, equityScreenerContext.selected_indicator_keys) && Intrinsics.areEqual(this.visible_column_keys, equityScreenerContext.visible_column_keys);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.selected_indicator_keys.hashCode()) * 37) + this.visible_column_keys.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + Internal.sanitize(this.name));
        if (!this.selected_indicator_keys.isEmpty()) {
            arrayList.add("selected_indicator_keys=" + Internal.sanitize(this.selected_indicator_keys));
        }
        if (!this.visible_column_keys.isEmpty()) {
            arrayList.add("visible_column_keys=" + Internal.sanitize(this.visible_column_keys));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EquityScreenerContext{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EquityScreenerContext copy$default(EquityScreenerContext equityScreenerContext, String str, java.util.List list, java.util.List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = equityScreenerContext.name;
        }
        if ((i & 2) != 0) {
            list = equityScreenerContext.selected_indicator_keys;
        }
        if ((i & 4) != 0) {
            list2 = equityScreenerContext.visible_column_keys;
        }
        if ((i & 8) != 0) {
            byteString = equityScreenerContext.unknownFields();
        }
        return equityScreenerContext.copy(str, list, list2, byteString);
    }

    public final EquityScreenerContext copy(String name, java.util.List<String> selected_indicator_keys, java.util.List<String> visible_column_keys, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selected_indicator_keys, "selected_indicator_keys");
        Intrinsics.checkNotNullParameter(visible_column_keys, "visible_column_keys");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EquityScreenerContext(name, selected_indicator_keys, visible_column_keys, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquityScreenerContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EquityScreenerContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EquityScreenerContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EquityScreenerContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getSelected_indicator_keys()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getVisible_column_keys());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EquityScreenerContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getSelected_indicator_keys());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getVisible_column_keys());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EquityScreenerContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getVisible_column_keys());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getSelected_indicator_keys());
                if (Intrinsics.areEqual(value.getName(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getName());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EquityScreenerContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EquityScreenerContext(strDecode, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EquityScreenerContext redact(EquityScreenerContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EquityScreenerContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
