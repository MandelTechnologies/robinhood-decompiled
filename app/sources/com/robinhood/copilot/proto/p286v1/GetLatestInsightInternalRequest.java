package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.rosetta.i18n.Locality;
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

/* compiled from: GetLatestInsightInternalRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalRequest;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", MatchaQrCodeDuxo6.USER_ID_KEY, "timezone_id", "locality", "Lcom/robinhood/rosetta/i18n/Locality;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/i18n/Locality;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getUser_id", "getTimezone_id", "getLocality", "()Lcom/robinhood/rosetta/i18n/Locality;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetLatestInsightInternalRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetLatestInsightInternalRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final Locality locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "timezoneId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final String timezone_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final String user_id;

    public GetLatestInsightInternalRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ GetLatestInsightInternalRequest(String str, String str2, String str3, Locality locality, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22122newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getTimezone_id() {
        return this.timezone_id;
    }

    public final Locality getLocality() {
        return this.locality;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestInsightInternalRequest(String instrument_id, String user_id, String timezone_id, Locality locality, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.user_id = user_id;
        this.timezone_id = timezone_id;
        this.locality = locality;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22122newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLatestInsightInternalRequest)) {
            return false;
        }
        GetLatestInsightInternalRequest getLatestInsightInternalRequest = (GetLatestInsightInternalRequest) other;
        return Intrinsics.areEqual(unknownFields(), getLatestInsightInternalRequest.unknownFields()) && Intrinsics.areEqual(this.instrument_id, getLatestInsightInternalRequest.instrument_id) && Intrinsics.areEqual(this.user_id, getLatestInsightInternalRequest.user_id) && Intrinsics.areEqual(this.timezone_id, getLatestInsightInternalRequest.timezone_id) && this.locality == getLatestInsightInternalRequest.locality;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.user_id.hashCode()) * 37) + this.timezone_id.hashCode()) * 37) + this.locality.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("timezone_id=" + Internal.sanitize(this.timezone_id));
        arrayList.add("locality=" + this.locality);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLatestInsightInternalRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetLatestInsightInternalRequest copy$default(GetLatestInsightInternalRequest getLatestInsightInternalRequest, String str, String str2, String str3, Locality locality, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLatestInsightInternalRequest.instrument_id;
        }
        if ((i & 2) != 0) {
            str2 = getLatestInsightInternalRequest.user_id;
        }
        if ((i & 4) != 0) {
            str3 = getLatestInsightInternalRequest.timezone_id;
        }
        if ((i & 8) != 0) {
            locality = getLatestInsightInternalRequest.locality;
        }
        if ((i & 16) != 0) {
            byteString = getLatestInsightInternalRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return getLatestInsightInternalRequest.copy(str, str2, str4, locality, byteString2);
    }

    public final GetLatestInsightInternalRequest copy(String instrument_id, String user_id, String timezone_id, Locality locality, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLatestInsightInternalRequest(instrument_id, user_id, timezone_id, locality, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLatestInsightInternalRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLatestInsightInternalRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetLatestInsightInternalRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLatestInsightInternalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getTimezone_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTimezone_id());
                }
                return value.getLocality() != Locality.LOCALITY_UNSPECIFIED ? size + Locality.ADAPTER.encodedSizeWithTag(5, value.getLocality()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLatestInsightInternalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getTimezone_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTimezone_id());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 5, (int) value.getLocality());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetLatestInsightInternalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 5, (int) value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getTimezone_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTimezone_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUser_id());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestInsightInternalRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Locality localityDecode = Locality.LOCALITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    Locality locality = localityDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetLatestInsightInternalRequest(strDecode, strDecode2, strDecode3, locality, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            try {
                                localityDecode = Locality.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestInsightInternalRequest redact(GetLatestInsightInternalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetLatestInsightInternalRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
