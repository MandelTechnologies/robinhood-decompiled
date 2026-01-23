package com.robinhood.prediction_markets.proto.p361v1.idl;

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

/* compiled from: ReserveHighlightComponent.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponent;", "Lcom/squareup/wire/Message;", "", "node_id", "", "header_text", "show_live_indicator", "", "primary_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "getNode_id", "()Ljava/lang/String;", "getHeader_text", "getShow_live_indicator", "()Z", "getPrimary_text", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ReserveHighlightComponent extends Message {

    @JvmField
    public static final ProtoAdapter<ReserveHighlightComponent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "headerText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String header_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nodeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String node_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String primary_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showLiveIndicator", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean show_live_indicator;

    public ReserveHighlightComponent() {
        this(null, null, false, null, null, 31, null);
    }

    public /* synthetic */ ReserveHighlightComponent(String str, String str2, boolean z, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23840newBuilder();
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final String getHeader_text() {
        return this.header_text;
    }

    public final boolean getShow_live_indicator() {
        return this.show_live_indicator;
    }

    public final String getPrimary_text() {
        return this.primary_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReserveHighlightComponent(String node_id, String header_text, boolean z, String primary_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(header_text, "header_text");
        Intrinsics.checkNotNullParameter(primary_text, "primary_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.node_id = node_id;
        this.header_text = header_text;
        this.show_live_indicator = z;
        this.primary_text = primary_text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23840newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReserveHighlightComponent)) {
            return false;
        }
        ReserveHighlightComponent reserveHighlightComponent = (ReserveHighlightComponent) other;
        return Intrinsics.areEqual(unknownFields(), reserveHighlightComponent.unknownFields()) && Intrinsics.areEqual(this.node_id, reserveHighlightComponent.node_id) && Intrinsics.areEqual(this.header_text, reserveHighlightComponent.header_text) && this.show_live_indicator == reserveHighlightComponent.show_live_indicator && Intrinsics.areEqual(this.primary_text, reserveHighlightComponent.primary_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.node_id.hashCode()) * 37) + this.header_text.hashCode()) * 37) + Boolean.hashCode(this.show_live_indicator)) * 37) + this.primary_text.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("node_id=" + Internal.sanitize(this.node_id));
        arrayList.add("header_text=" + Internal.sanitize(this.header_text));
        arrayList.add("show_live_indicator=" + this.show_live_indicator);
        arrayList.add("primary_text=" + Internal.sanitize(this.primary_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReserveHighlightComponent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ReserveHighlightComponent copy$default(ReserveHighlightComponent reserveHighlightComponent, String str, String str2, boolean z, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reserveHighlightComponent.node_id;
        }
        if ((i & 2) != 0) {
            str2 = reserveHighlightComponent.header_text;
        }
        if ((i & 4) != 0) {
            z = reserveHighlightComponent.show_live_indicator;
        }
        if ((i & 8) != 0) {
            str3 = reserveHighlightComponent.primary_text;
        }
        if ((i & 16) != 0) {
            byteString = reserveHighlightComponent.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z2 = z;
        return reserveHighlightComponent.copy(str, str2, z2, str3, byteString2);
    }

    public final ReserveHighlightComponent copy(String node_id, String header_text, boolean show_live_indicator, String primary_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(header_text, "header_text");
        Intrinsics.checkNotNullParameter(primary_text, "primary_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReserveHighlightComponent(node_id, header_text, show_live_indicator, primary_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReserveHighlightComponent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReserveHighlightComponent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ReserveHighlightComponent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReserveHighlightComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getNode_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getNode_id());
                }
                if (!Intrinsics.areEqual(value.getHeader_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getHeader_text());
                }
                if (value.getShow_live_indicator()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getShow_live_indicator()));
                }
                return !Intrinsics.areEqual(value.getPrimary_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPrimary_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReserveHighlightComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getNode_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNode_id());
                }
                if (!Intrinsics.areEqual(value.getHeader_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeader_text());
                }
                if (value.getShow_live_indicator()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShow_live_indicator()));
                }
                if (!Intrinsics.areEqual(value.getPrimary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrimary_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReserveHighlightComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrimary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrimary_text());
                }
                if (value.getShow_live_indicator()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShow_live_indicator()));
                }
                if (!Intrinsics.areEqual(value.getHeader_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeader_text());
                }
                if (Intrinsics.areEqual(value.getNode_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNode_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReserveHighlightComponent redact(ReserveHighlightComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ReserveHighlightComponent.copy$default(value, null, null, false, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReserveHighlightComponent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                boolean zBooleanValue = false;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ReserveHighlightComponent(strDecode, strDecode3, zBooleanValue, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
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
