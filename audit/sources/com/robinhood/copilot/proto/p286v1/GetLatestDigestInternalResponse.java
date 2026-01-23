package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: GetLatestDigestInternalResponse.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B9\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponse;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/copilot/proto/v1/DigestV2;", "digest", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/CopilotStatus;", "copilot_status", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/copilot/proto/v1/DigestV2;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatus;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/copilot/proto/v1/DigestV2;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatus;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponse;", "Lcom/robinhood/copilot/proto/v1/DigestV2;", "getDigest", "()Lcom/robinhood/copilot/proto/v1/DigestV2;", "Lj$/time/Instant;", "getLast_updated_at", "()Lj$/time/Instant;", "Lcom/robinhood/copilot/proto/v1/CopilotStatus;", "getCopilot_status", "()Lcom/robinhood/copilot/proto/v1/CopilotStatus;", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetLatestDigestInternalResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetLatestDigestInternalResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.CopilotStatus#ADAPTER", jsonName = "copilotStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CopilotStatus copilot_status;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.DigestV2#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final DigestV2 digest;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastUpdatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant last_updated_at;

    public GetLatestDigestInternalResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22118newBuilder();
    }

    public final DigestV2 getDigest() {
        return this.digest;
    }

    public final Instant getLast_updated_at() {
        return this.last_updated_at;
    }

    public final CopilotStatus getCopilot_status() {
        return this.copilot_status;
    }

    public /* synthetic */ GetLatestDigestInternalResponse(DigestV2 digestV2, Instant instant, CopilotStatus copilotStatus, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : digestV2, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? CopilotStatus.COPILOT_STATUS_UNSPECIFIED : copilotStatus, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestDigestInternalResponse(DigestV2 digestV2, Instant instant, CopilotStatus copilot_status, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.digest = digestV2;
        this.last_updated_at = instant;
        this.copilot_status = copilot_status;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22118newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLatestDigestInternalResponse)) {
            return false;
        }
        GetLatestDigestInternalResponse getLatestDigestInternalResponse = (GetLatestDigestInternalResponse) other;
        return Intrinsics.areEqual(unknownFields(), getLatestDigestInternalResponse.unknownFields()) && Intrinsics.areEqual(this.digest, getLatestDigestInternalResponse.digest) && Intrinsics.areEqual(this.last_updated_at, getLatestDigestInternalResponse.last_updated_at) && this.copilot_status == getLatestDigestInternalResponse.copilot_status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        DigestV2 digestV2 = this.digest;
        int iHashCode2 = (iHashCode + (digestV2 != null ? digestV2.hashCode() : 0)) * 37;
        Instant instant = this.last_updated_at;
        int iHashCode3 = ((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37) + this.copilot_status.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        DigestV2 digestV2 = this.digest;
        if (digestV2 != null) {
            arrayList.add("digest=" + digestV2);
        }
        Instant instant = this.last_updated_at;
        if (instant != null) {
            arrayList.add("last_updated_at=" + instant);
        }
        arrayList.add("copilot_status=" + this.copilot_status);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLatestDigestInternalResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetLatestDigestInternalResponse copy$default(GetLatestDigestInternalResponse getLatestDigestInternalResponse, DigestV2 digestV2, Instant instant, CopilotStatus copilotStatus, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            digestV2 = getLatestDigestInternalResponse.digest;
        }
        if ((i & 2) != 0) {
            instant = getLatestDigestInternalResponse.last_updated_at;
        }
        if ((i & 4) != 0) {
            copilotStatus = getLatestDigestInternalResponse.copilot_status;
        }
        if ((i & 8) != 0) {
            byteString = getLatestDigestInternalResponse.unknownFields();
        }
        return getLatestDigestInternalResponse.copy(digestV2, instant, copilotStatus, byteString);
    }

    public final GetLatestDigestInternalResponse copy(DigestV2 digest, Instant last_updated_at, CopilotStatus copilot_status, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLatestDigestInternalResponse(digest, last_updated_at, copilot_status, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLatestDigestInternalResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLatestDigestInternalResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetLatestDigestInternalResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLatestDigestInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDigest() != null) {
                    size += DigestV2.ADAPTER.encodedSizeWithTag(1, value.getDigest());
                }
                if (value.getLast_updated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getLast_updated_at());
                }
                return value.getCopilot_status() != CopilotStatus.COPILOT_STATUS_UNSPECIFIED ? size + CopilotStatus.ADAPTER.encodedSizeWithTag(3, value.getCopilot_status()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLatestDigestInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDigest() != null) {
                    DigestV2.ADAPTER.encodeWithTag(writer, 1, (int) value.getDigest());
                }
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getLast_updated_at());
                }
                if (value.getCopilot_status() != CopilotStatus.COPILOT_STATUS_UNSPECIFIED) {
                    CopilotStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getCopilot_status());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetLatestDigestInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCopilot_status() != CopilotStatus.COPILOT_STATUS_UNSPECIFIED) {
                    CopilotStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getCopilot_status());
                }
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getLast_updated_at());
                }
                if (value.getDigest() != null) {
                    DigestV2.ADAPTER.encodeWithTag(writer, 1, (int) value.getDigest());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestDigestInternalResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CopilotStatus copilotStatusDecode = CopilotStatus.COPILOT_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                DigestV2 digestV2Decode = null;
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetLatestDigestInternalResponse(digestV2Decode, instantDecode, copilotStatusDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        digestV2Decode = DigestV2.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            copilotStatusDecode = CopilotStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestDigestInternalResponse redact(GetLatestDigestInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DigestV2 digest = value.getDigest();
                DigestV2 digestV2Redact = digest != null ? DigestV2.ADAPTER.redact(digest) : null;
                Instant last_updated_at = value.getLast_updated_at();
                return GetLatestDigestInternalResponse.copy$default(value, digestV2Redact, last_updated_at != null ? ProtoAdapter.INSTANT.redact(last_updated_at) : null, null, ByteString.EMPTY, 4, null);
            }
        };
    }
}
