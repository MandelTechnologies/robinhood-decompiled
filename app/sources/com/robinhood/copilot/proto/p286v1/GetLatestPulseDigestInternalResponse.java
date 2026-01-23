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
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: GetLatestPulseDigestInternalResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BC\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u001aR \u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001aR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponse;", "Lcom/squareup/wire/Message;", "", "", "payload", ErrorBundle.SUMMARY_ENTRY, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/StrategiesDigest;", "strategies_digest", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/StrategiesDigest;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/StrategiesDigest;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/GetLatestPulseDigestInternalResponse;", "Ljava/lang/String;", "getPayload", "getPayload$annotations", "()V", "getSummary", "getSummary$annotations", "Lj$/time/Instant;", "getLast_updated_at", "()Lj$/time/Instant;", "Lcom/robinhood/copilot/proto/v1/StrategiesDigest;", "getStrategies_digest", "()Lcom/robinhood/copilot/proto/v1/StrategiesDigest;", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetLatestPulseDigestInternalResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetLatestPulseDigestInternalResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastUpdatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant last_updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String payload;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.StrategiesDigest#ADAPTER", jsonName = "strategiesDigest", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final StrategiesDigest strategies_digest;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String summary;

    public GetLatestPulseDigestInternalResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Deprecated
    public static /* synthetic */ void getPayload$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getSummary$annotations() {
    }

    public /* synthetic */ GetLatestPulseDigestInternalResponse(String str, String str2, Instant instant, StrategiesDigest strategiesDigest, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : strategiesDigest, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22134newBuilder();
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final Instant getLast_updated_at() {
        return this.last_updated_at;
    }

    public final StrategiesDigest getStrategies_digest() {
        return this.strategies_digest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestPulseDigestInternalResponse(String payload, String summary, Instant instant, StrategiesDigest strategiesDigest, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.payload = payload;
        this.summary = summary;
        this.last_updated_at = instant;
        this.strategies_digest = strategiesDigest;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22134newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLatestPulseDigestInternalResponse)) {
            return false;
        }
        GetLatestPulseDigestInternalResponse getLatestPulseDigestInternalResponse = (GetLatestPulseDigestInternalResponse) other;
        return Intrinsics.areEqual(unknownFields(), getLatestPulseDigestInternalResponse.unknownFields()) && Intrinsics.areEqual(this.payload, getLatestPulseDigestInternalResponse.payload) && Intrinsics.areEqual(this.summary, getLatestPulseDigestInternalResponse.summary) && Intrinsics.areEqual(this.last_updated_at, getLatestPulseDigestInternalResponse.last_updated_at) && Intrinsics.areEqual(this.strategies_digest, getLatestPulseDigestInternalResponse.strategies_digest);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.payload.hashCode()) * 37) + this.summary.hashCode()) * 37;
        Instant instant = this.last_updated_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        StrategiesDigest strategiesDigest = this.strategies_digest;
        int iHashCode3 = iHashCode2 + (strategiesDigest != null ? strategiesDigest.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("payload=" + Internal.sanitize(this.payload));
        arrayList.add("summary=" + Internal.sanitize(this.summary));
        Instant instant = this.last_updated_at;
        if (instant != null) {
            arrayList.add("last_updated_at=" + instant);
        }
        StrategiesDigest strategiesDigest = this.strategies_digest;
        if (strategiesDigest != null) {
            arrayList.add("strategies_digest=" + strategiesDigest);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLatestPulseDigestInternalResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetLatestPulseDigestInternalResponse copy$default(GetLatestPulseDigestInternalResponse getLatestPulseDigestInternalResponse, String str, String str2, Instant instant, StrategiesDigest strategiesDigest, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLatestPulseDigestInternalResponse.payload;
        }
        if ((i & 2) != 0) {
            str2 = getLatestPulseDigestInternalResponse.summary;
        }
        if ((i & 4) != 0) {
            instant = getLatestPulseDigestInternalResponse.last_updated_at;
        }
        if ((i & 8) != 0) {
            strategiesDigest = getLatestPulseDigestInternalResponse.strategies_digest;
        }
        if ((i & 16) != 0) {
            byteString = getLatestPulseDigestInternalResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        Instant instant2 = instant;
        return getLatestPulseDigestInternalResponse.copy(str, str2, instant2, strategiesDigest, byteString2);
    }

    public final GetLatestPulseDigestInternalResponse copy(String payload, String summary, Instant last_updated_at, StrategiesDigest strategies_digest, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLatestPulseDigestInternalResponse(payload, summary, last_updated_at, strategies_digest, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLatestPulseDigestInternalResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLatestPulseDigestInternalResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetLatestPulseDigestInternalResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLatestPulseDigestInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPayload(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPayload());
                }
                if (!Intrinsics.areEqual(value.getSummary(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSummary());
                }
                if (value.getLast_updated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getLast_updated_at());
                }
                return value.getStrategies_digest() != null ? size + StrategiesDigest.ADAPTER.encodedSizeWithTag(4, value.getStrategies_digest()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLatestPulseDigestInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPayload(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPayload());
                }
                if (!Intrinsics.areEqual(value.getSummary(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSummary());
                }
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getLast_updated_at());
                }
                if (value.getStrategies_digest() != null) {
                    StrategiesDigest.ADAPTER.encodeWithTag(writer, 4, (int) value.getStrategies_digest());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetLatestPulseDigestInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getStrategies_digest() != null) {
                    StrategiesDigest.ADAPTER.encodeWithTag(writer, 4, (int) value.getStrategies_digest());
                }
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getLast_updated_at());
                }
                if (!Intrinsics.areEqual(value.getSummary(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSummary());
                }
                if (Intrinsics.areEqual(value.getPayload(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPayload());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestPulseDigestInternalResponse redact(GetLatestPulseDigestInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant last_updated_at = value.getLast_updated_at();
                Instant instantRedact = last_updated_at != null ? ProtoAdapter.INSTANT.redact(last_updated_at) : null;
                StrategiesDigest strategies_digest = value.getStrategies_digest();
                return GetLatestPulseDigestInternalResponse.copy$default(value, null, null, instantRedact, strategies_digest != null ? StrategiesDigest.ADAPTER.redact(strategies_digest) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestPulseDigestInternalResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                StrategiesDigest strategiesDigestDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetLatestPulseDigestInternalResponse(strDecode, strDecode2, instantDecode, strategiesDigestDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 4) {
                        strategiesDigestDecode = StrategiesDigest.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
