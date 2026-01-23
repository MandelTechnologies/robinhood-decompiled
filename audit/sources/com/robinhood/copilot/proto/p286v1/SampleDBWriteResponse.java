package com.robinhood.copilot.proto.p286v1;

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

/* compiled from: SampleDBWriteResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/SampleDBWriteResponse;", "Lcom/squareup/wire/Message;", "", "", "row_value", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/SampleDBWriteResponse;", "Ljava/lang/String;", "getRow_value", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class SampleDBWriteResponse extends Message {

    @JvmField
    public static final ProtoAdapter<SampleDBWriteResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rowValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String row_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant updated_at;

    public SampleDBWriteResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22166newBuilder();
    }

    public final String getRow_value() {
        return this.row_value;
    }

    public /* synthetic */ SampleDBWriteResponse(String str, Instant instant, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SampleDBWriteResponse(String row_value, Instant instant, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(row_value, "row_value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.row_value = row_value;
        this.created_at = instant;
        this.updated_at = instant2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22166newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SampleDBWriteResponse)) {
            return false;
        }
        SampleDBWriteResponse sampleDBWriteResponse = (SampleDBWriteResponse) other;
        return Intrinsics.areEqual(unknownFields(), sampleDBWriteResponse.unknownFields()) && Intrinsics.areEqual(this.row_value, sampleDBWriteResponse.row_value) && Intrinsics.areEqual(this.created_at, sampleDBWriteResponse.created_at) && Intrinsics.areEqual(this.updated_at, sampleDBWriteResponse.updated_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.row_value.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("row_value=" + Internal.sanitize(this.row_value));
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SampleDBWriteResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SampleDBWriteResponse copy$default(SampleDBWriteResponse sampleDBWriteResponse, String str, Instant instant, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sampleDBWriteResponse.row_value;
        }
        if ((i & 2) != 0) {
            instant = sampleDBWriteResponse.created_at;
        }
        if ((i & 4) != 0) {
            instant2 = sampleDBWriteResponse.updated_at;
        }
        if ((i & 8) != 0) {
            byteString = sampleDBWriteResponse.unknownFields();
        }
        return sampleDBWriteResponse.copy(str, instant, instant2, byteString);
    }

    public final SampleDBWriteResponse copy(String row_value, Instant created_at, Instant updated_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(row_value, "row_value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SampleDBWriteResponse(row_value, created_at, updated_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SampleDBWriteResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SampleDBWriteResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.SampleDBWriteResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SampleDBWriteResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRow_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRow_value());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getCreated_at());
                }
                return value.getUpdated_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getUpdated_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SampleDBWriteResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRow_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRow_value());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getUpdated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SampleDBWriteResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (Intrinsics.areEqual(value.getRow_value(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRow_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SampleDBWriteResponse redact(SampleDBWriteResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                return SampleDBWriteResponse.copy$default(value, null, instantRedact, updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SampleDBWriteResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SampleDBWriteResponse(strDecode, instantDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
