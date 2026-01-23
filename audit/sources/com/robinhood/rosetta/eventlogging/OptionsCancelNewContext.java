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

/* compiled from: OptionsCancelNewContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsCancelNewContext;", "Lcom/squareup/wire/Message;", "", "old_order_id", "", "new_order_id", "identifier", "timestamp", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLokio/ByteString;)V", "getOld_order_id", "()Ljava/lang/String;", "getNew_order_id", "getIdentifier", "getTimestamp", "()J", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionsCancelNewContext extends Message {

    @JvmField
    public static final ProtoAdapter<OptionsCancelNewContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String new_order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "oldOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String old_order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final long timestamp;

    public OptionsCancelNewContext() {
        this(null, null, null, 0L, null, 31, null);
    }

    public /* synthetic */ OptionsCancelNewContext(String str, String str2, String str3, long j, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24441newBuilder();
    }

    public final String getOld_order_id() {
        return this.old_order_id;
    }

    public final String getNew_order_id() {
        return this.new_order_id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsCancelNewContext(String old_order_id, String new_order_id, String identifier, long j, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(old_order_id, "old_order_id");
        Intrinsics.checkNotNullParameter(new_order_id, "new_order_id");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.old_order_id = old_order_id;
        this.new_order_id = new_order_id;
        this.identifier = identifier;
        this.timestamp = j;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24441newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionsCancelNewContext)) {
            return false;
        }
        OptionsCancelNewContext optionsCancelNewContext = (OptionsCancelNewContext) other;
        return Intrinsics.areEqual(unknownFields(), optionsCancelNewContext.unknownFields()) && Intrinsics.areEqual(this.old_order_id, optionsCancelNewContext.old_order_id) && Intrinsics.areEqual(this.new_order_id, optionsCancelNewContext.new_order_id) && Intrinsics.areEqual(this.identifier, optionsCancelNewContext.identifier) && this.timestamp == optionsCancelNewContext.timestamp;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.old_order_id.hashCode()) * 37) + this.new_order_id.hashCode()) * 37) + this.identifier.hashCode()) * 37) + Long.hashCode(this.timestamp);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("old_order_id=" + Internal.sanitize(this.old_order_id));
        arrayList.add("new_order_id=" + Internal.sanitize(this.new_order_id));
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        arrayList.add("timestamp=" + this.timestamp);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionsCancelNewContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionsCancelNewContext copy$default(OptionsCancelNewContext optionsCancelNewContext, String str, String str2, String str3, long j, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsCancelNewContext.old_order_id;
        }
        if ((i & 2) != 0) {
            str2 = optionsCancelNewContext.new_order_id;
        }
        if ((i & 4) != 0) {
            str3 = optionsCancelNewContext.identifier;
        }
        if ((i & 8) != 0) {
            j = optionsCancelNewContext.timestamp;
        }
        if ((i & 16) != 0) {
            byteString = optionsCancelNewContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return optionsCancelNewContext.copy(str, str2, str4, j, byteString2);
    }

    public final OptionsCancelNewContext copy(String old_order_id, String new_order_id, String identifier, long timestamp, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(old_order_id, "old_order_id");
        Intrinsics.checkNotNullParameter(new_order_id, "new_order_id");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionsCancelNewContext(old_order_id, new_order_id, identifier, timestamp, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionsCancelNewContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionsCancelNewContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionsCancelNewContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionsCancelNewContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOld_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOld_order_id());
                }
                if (!Intrinsics.areEqual(value.getNew_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNew_order_id());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getIdentifier());
                }
                return value.getTimestamp() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(4, Long.valueOf(value.getTimestamp())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionsCancelNewContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOld_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOld_order_id());
                }
                if (!Intrinsics.areEqual(value.getNew_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNew_order_id());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIdentifier());
                }
                if (value.getTimestamp() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getTimestamp()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionsCancelNewContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTimestamp() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getTimestamp()));
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIdentifier());
                }
                if (!Intrinsics.areEqual(value.getNew_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNew_order_id());
                }
                if (Intrinsics.areEqual(value.getOld_order_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOld_order_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionsCancelNewContext redact(OptionsCancelNewContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionsCancelNewContext.copy$default(value, null, null, null, 0L, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionsCancelNewContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OptionsCancelNewContext(strDecode, strDecode2, strDecode3, jLongValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
