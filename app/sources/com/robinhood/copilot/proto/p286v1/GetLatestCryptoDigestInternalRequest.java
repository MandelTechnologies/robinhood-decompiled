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

/* compiled from: GetLatestCryptoDigestInternalRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006 "}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequest;", "Lcom/squareup/wire/Message;", "", "crypto_currency_id", "", MatchaQrCodeDuxo6.USER_ID_KEY, "force_get_agreement", "", "locality", "Lcom/robinhood/rosetta/i18n/Locality;", "timezone_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/rosetta/i18n/Locality;Ljava/lang/String;Lokio/ByteString;)V", "getCrypto_currency_id", "()Ljava/lang/String;", "getUser_id", "getForce_get_agreement", "()Z", "getLocality", "()Lcom/robinhood/rosetta/i18n/Locality;", "getTimezone_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetLatestCryptoDigestInternalRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetLatestCryptoDigestInternalRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cryptoCurrencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String crypto_currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "forceGetAgreement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean force_get_agreement;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Locality locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "timezoneId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String timezone_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String user_id;

    public GetLatestCryptoDigestInternalRequest() {
        this(null, null, false, null, null, null, 63, null);
    }

    public /* synthetic */ GetLatestCryptoDigestInternalRequest(String str, String str2, boolean z, Locality locality, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22115newBuilder();
    }

    public final String getCrypto_currency_id() {
        return this.crypto_currency_id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final boolean getForce_get_agreement() {
        return this.force_get_agreement;
    }

    public final Locality getLocality() {
        return this.locality;
    }

    public final String getTimezone_id() {
        return this.timezone_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestCryptoDigestInternalRequest(String crypto_currency_id, String user_id, boolean z, Locality locality, String timezone_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.crypto_currency_id = crypto_currency_id;
        this.user_id = user_id;
        this.force_get_agreement = z;
        this.locality = locality;
        this.timezone_id = timezone_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22115newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLatestCryptoDigestInternalRequest)) {
            return false;
        }
        GetLatestCryptoDigestInternalRequest getLatestCryptoDigestInternalRequest = (GetLatestCryptoDigestInternalRequest) other;
        return Intrinsics.areEqual(unknownFields(), getLatestCryptoDigestInternalRequest.unknownFields()) && Intrinsics.areEqual(this.crypto_currency_id, getLatestCryptoDigestInternalRequest.crypto_currency_id) && Intrinsics.areEqual(this.user_id, getLatestCryptoDigestInternalRequest.user_id) && this.force_get_agreement == getLatestCryptoDigestInternalRequest.force_get_agreement && this.locality == getLatestCryptoDigestInternalRequest.locality && Intrinsics.areEqual(this.timezone_id, getLatestCryptoDigestInternalRequest.timezone_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.crypto_currency_id.hashCode()) * 37) + this.user_id.hashCode()) * 37) + Boolean.hashCode(this.force_get_agreement)) * 37) + this.locality.hashCode()) * 37) + this.timezone_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("crypto_currency_id=" + Internal.sanitize(this.crypto_currency_id));
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("force_get_agreement=" + this.force_get_agreement);
        arrayList.add("locality=" + this.locality);
        arrayList.add("timezone_id=" + Internal.sanitize(this.timezone_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLatestCryptoDigestInternalRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetLatestCryptoDigestInternalRequest copy$default(GetLatestCryptoDigestInternalRequest getLatestCryptoDigestInternalRequest, String str, String str2, boolean z, Locality locality, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLatestCryptoDigestInternalRequest.crypto_currency_id;
        }
        if ((i & 2) != 0) {
            str2 = getLatestCryptoDigestInternalRequest.user_id;
        }
        if ((i & 4) != 0) {
            z = getLatestCryptoDigestInternalRequest.force_get_agreement;
        }
        if ((i & 8) != 0) {
            locality = getLatestCryptoDigestInternalRequest.locality;
        }
        if ((i & 16) != 0) {
            str3 = getLatestCryptoDigestInternalRequest.timezone_id;
        }
        if ((i & 32) != 0) {
            byteString = getLatestCryptoDigestInternalRequest.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        return getLatestCryptoDigestInternalRequest.copy(str, str2, z, locality, str4, byteString2);
    }

    public final GetLatestCryptoDigestInternalRequest copy(String crypto_currency_id, String user_id, boolean force_get_agreement, Locality locality, String timezone_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLatestCryptoDigestInternalRequest(crypto_currency_id, user_id, force_get_agreement, locality, timezone_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLatestCryptoDigestInternalRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLatestCryptoDigestInternalRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetLatestCryptoDigestInternalRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLatestCryptoDigestInternalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCrypto_currency_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCrypto_currency_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUser_id());
                }
                if (value.getForce_get_agreement()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getForce_get_agreement()));
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    size += Locality.ADAPTER.encodedSizeWithTag(4, value.getLocality());
                }
                return !Intrinsics.areEqual(value.getTimezone_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTimezone_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLatestCryptoDigestInternalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCrypto_currency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCrypto_currency_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (value.getForce_get_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getForce_get_agreement()));
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
            public void encode(ReverseProtoWriter writer, GetLatestCryptoDigestInternalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTimezone_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTimezone_id());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 4, (int) value.getLocality());
                }
                if (value.getForce_get_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getForce_get_agreement()));
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (Intrinsics.areEqual(value.getCrypto_currency_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCrypto_currency_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestCryptoDigestInternalRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Locality locality = Locality.LOCALITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                boolean zBooleanValue = false;
                Locality localityDecode = locality;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetLatestCryptoDigestInternalRequest(strDecode3, strDecode, zBooleanValue, localityDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 4) {
                        try {
                            localityDecode = Locality.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 5) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestCryptoDigestInternalRequest redact(GetLatestCryptoDigestInternalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetLatestCryptoDigestInternalRequest.copy$default(value, null, null, false, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
