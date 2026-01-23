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

/* compiled from: GetLatestPortfolioDigestInternalRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestPortfolioDigestInternalRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", MatchaQrCodeDuxo6.USER_ID_KEY, "locality", "Lcom/robinhood/rosetta/i18n/Locality;", "timezone_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/i18n/Locality;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getUser_id", "getLocality", "()Lcom/robinhood/rosetta/i18n/Locality;", "getTimezone_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetLatestPortfolioDigestInternalRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetLatestPortfolioDigestInternalRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final Locality locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "timezoneId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final String timezone_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String user_id;

    public GetLatestPortfolioDigestInternalRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ GetLatestPortfolioDigestInternalRequest(String str, String str2, Locality locality, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22129newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final Locality getLocality() {
        return this.locality;
    }

    public final String getTimezone_id() {
        return this.timezone_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestPortfolioDigestInternalRequest(String account_id, String user_id, Locality locality, String timezone_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.user_id = user_id;
        this.locality = locality;
        this.timezone_id = timezone_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22129newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLatestPortfolioDigestInternalRequest)) {
            return false;
        }
        GetLatestPortfolioDigestInternalRequest getLatestPortfolioDigestInternalRequest = (GetLatestPortfolioDigestInternalRequest) other;
        return Intrinsics.areEqual(unknownFields(), getLatestPortfolioDigestInternalRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getLatestPortfolioDigestInternalRequest.account_id) && Intrinsics.areEqual(this.user_id, getLatestPortfolioDigestInternalRequest.user_id) && this.locality == getLatestPortfolioDigestInternalRequest.locality && Intrinsics.areEqual(this.timezone_id, getLatestPortfolioDigestInternalRequest.timezone_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.user_id.hashCode()) * 37) + this.locality.hashCode()) * 37) + this.timezone_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("locality=" + this.locality);
        arrayList.add("timezone_id=" + Internal.sanitize(this.timezone_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLatestPortfolioDigestInternalRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetLatestPortfolioDigestInternalRequest copy$default(GetLatestPortfolioDigestInternalRequest getLatestPortfolioDigestInternalRequest, String str, String str2, Locality locality, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLatestPortfolioDigestInternalRequest.account_id;
        }
        if ((i & 2) != 0) {
            str2 = getLatestPortfolioDigestInternalRequest.user_id;
        }
        if ((i & 4) != 0) {
            locality = getLatestPortfolioDigestInternalRequest.locality;
        }
        if ((i & 8) != 0) {
            str3 = getLatestPortfolioDigestInternalRequest.timezone_id;
        }
        if ((i & 16) != 0) {
            byteString = getLatestPortfolioDigestInternalRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        Locality locality2 = locality;
        return getLatestPortfolioDigestInternalRequest.copy(str, str2, locality2, str3, byteString2);
    }

    public final GetLatestPortfolioDigestInternalRequest copy(String account_id, String user_id, Locality locality, String timezone_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLatestPortfolioDigestInternalRequest(account_id, user_id, locality, timezone_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLatestPortfolioDigestInternalRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLatestPortfolioDigestInternalRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetLatestPortfolioDigestInternalRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLatestPortfolioDigestInternalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUser_id());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    size += Locality.ADAPTER.encodedSizeWithTag(4, value.getLocality());
                }
                return !Intrinsics.areEqual(value.getTimezone_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTimezone_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLatestPortfolioDigestInternalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 4, (int) value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getTimezone_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTimezone_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetLatestPortfolioDigestInternalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTimezone_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTimezone_id());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 4, (int) value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestPortfolioDigestInternalRequest decode(ProtoReader reader) throws IOException {
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
                            return new GetLatestPortfolioDigestInternalRequest(strDecode, strDecode2, locality, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                localityDecode = Locality.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 5) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestPortfolioDigestInternalRequest redact(GetLatestPortfolioDigestInternalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetLatestPortfolioDigestInternalRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
