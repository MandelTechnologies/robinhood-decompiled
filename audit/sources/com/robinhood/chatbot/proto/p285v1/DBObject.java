package com.robinhood.chatbot.proto.p285v1;

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
import p479j$.time.Instant;

/* compiled from: DBObject.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/DBObject;", "Lcom/squareup/wire/Message;", "", "", "rowValue", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "createdAt", "updatedAt", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/chatbot/proto/v1/DBObject;", "Ljava/lang/String;", "getRowValue", "Lj$/time/Instant;", "getCreatedAt", "()Lj$/time/Instant;", "getUpdatedAt", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DBObject extends Message {

    @JvmField
    public static final ProtoAdapter<DBObject> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant createdAt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rowValue;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant updatedAt;

    public DBObject() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20483newBuilder();
    }

    public final String getRowValue() {
        return this.rowValue;
    }

    public /* synthetic */ DBObject(String str, Instant instant, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBObject(String rowValue, Instant instant, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rowValue, "rowValue");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rowValue = rowValue;
        this.createdAt = instant;
        this.updatedAt = instant2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20483newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DBObject)) {
            return false;
        }
        DBObject dBObject = (DBObject) other;
        return Intrinsics.areEqual(unknownFields(), dBObject.unknownFields()) && Intrinsics.areEqual(this.rowValue, dBObject.rowValue) && Intrinsics.areEqual(this.createdAt, dBObject.createdAt) && Intrinsics.areEqual(this.updatedAt, dBObject.updatedAt);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.rowValue.hashCode()) * 37;
        Instant instant = this.createdAt;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updatedAt;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rowValue=" + Internal.sanitize(this.rowValue));
        Instant instant = this.createdAt;
        if (instant != null) {
            arrayList.add("createdAt=" + instant);
        }
        Instant instant2 = this.updatedAt;
        if (instant2 != null) {
            arrayList.add("updatedAt=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DBObject{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DBObject copy$default(DBObject dBObject, String str, Instant instant, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dBObject.rowValue;
        }
        if ((i & 2) != 0) {
            instant = dBObject.createdAt;
        }
        if ((i & 4) != 0) {
            instant2 = dBObject.updatedAt;
        }
        if ((i & 8) != 0) {
            byteString = dBObject.unknownFields();
        }
        return dBObject.copy(str, instant, instant2, byteString);
    }

    public final DBObject copy(String rowValue, Instant createdAt, Instant updatedAt, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rowValue, "rowValue");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DBObject(rowValue, createdAt, updatedAt, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DBObject.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DBObject>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.DBObject$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DBObject value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRowValue(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRowValue());
                }
                if (value.getCreatedAt() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getCreatedAt());
                }
                return value.getUpdatedAt() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getUpdatedAt()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DBObject value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRowValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRowValue());
                }
                if (value.getCreatedAt() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getCreatedAt());
                }
                if (value.getUpdatedAt() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getUpdatedAt());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DBObject value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUpdatedAt() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getUpdatedAt());
                }
                if (value.getCreatedAt() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getCreatedAt());
                }
                if (Intrinsics.areEqual(value.getRowValue(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRowValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DBObject redact(DBObject value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant createdAt = value.getCreatedAt();
                Instant instantRedact = createdAt != null ? ProtoAdapter.INSTANT.redact(createdAt) : null;
                Instant updatedAt = value.getUpdatedAt();
                return DBObject.copy$default(value, null, instantRedact, updatedAt != null ? ProtoAdapter.INSTANT.redact(updatedAt) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DBObject decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DBObject(strDecode, instantDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
