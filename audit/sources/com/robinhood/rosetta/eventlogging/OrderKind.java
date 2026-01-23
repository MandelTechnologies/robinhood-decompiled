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

/* compiled from: OrderKind.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OrderKind;", "Lcom/squareup/wire/Message;", "", "type", "", "is_disabled", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLokio/ByteString;)V", "getType", "()Ljava/lang/String;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OrderKind extends Message {

    @JvmField
    public static final ProtoAdapter<OrderKind> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_disabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String type;

    public OrderKind() {
        this(null, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24452newBuilder();
    }

    public final String getType() {
        return this.type;
    }

    public /* synthetic */ OrderKind(String str, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderKind(String type2, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.is_disabled = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24452newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderKind)) {
            return false;
        }
        OrderKind orderKind = (OrderKind) other;
        return Intrinsics.areEqual(unknownFields(), orderKind.unknownFields()) && Intrinsics.areEqual(this.type, orderKind.type) && this.is_disabled == orderKind.is_disabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_disabled);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("is_disabled=" + this.is_disabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderKind{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderKind copy$default(OrderKind orderKind, String str, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderKind.type;
        }
        if ((i & 2) != 0) {
            z = orderKind.is_disabled;
        }
        if ((i & 4) != 0) {
            byteString = orderKind.unknownFields();
        }
        return orderKind.copy(str, z, byteString);
    }

    public final OrderKind copy(String type2, boolean is_disabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderKind(type2, is_disabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderKind.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderKind>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OrderKind$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderKind value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getType());
                }
                return value.getIs_disabled() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getIs_disabled())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderKind value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getIs_disabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderKind value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getIs_disabled()));
                }
                if (Intrinsics.areEqual(value.getType(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderKind redact(OrderKind value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OrderKind.copy$default(value, null, false, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderKind decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderKind(strDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
