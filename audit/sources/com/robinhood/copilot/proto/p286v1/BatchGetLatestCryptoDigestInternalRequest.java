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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: BatchGetLatestCryptoDigestInternalRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB?\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J>\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequest;", "Lcom/squareup/wire/Message;", "", "crypto_currency_ids", "", "", MatchaQrCodeDuxo6.USER_ID_KEY, "force_get_agreement", "", "locality", "Lcom/robinhood/rosetta/i18n/Locality;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLcom/robinhood/rosetta/i18n/Locality;Lokio/ByteString;)V", "getUser_id", "()Ljava/lang/String;", "getForce_get_agreement", "()Z", "getLocality", "()Lcom/robinhood/rosetta/i18n/Locality;", "getCrypto_currency_ids", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BatchGetLatestCryptoDigestInternalRequest extends Message {

    @JvmField
    public static final ProtoAdapter<BatchGetLatestCryptoDigestInternalRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cryptoCurrencyIds", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> crypto_currency_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "forceGetAgreement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean force_get_agreement;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Locality locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String user_id;

    public BatchGetLatestCryptoDigestInternalRequest() {
        this(null, null, false, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22067newBuilder();
    }

    public /* synthetic */ BatchGetLatestCryptoDigestInternalRequest(List list, String str, boolean z, Locality locality, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 16) != 0 ? ByteString.EMPTY : byteString);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchGetLatestCryptoDigestInternalRequest(List<String> crypto_currency_ids, String user_id, boolean z, Locality locality, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(crypto_currency_ids, "crypto_currency_ids");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.force_get_agreement = z;
        this.locality = locality;
        this.crypto_currency_ids = Internal.immutableCopyOf("crypto_currency_ids", crypto_currency_ids);
    }

    public final List<String> getCrypto_currency_ids() {
        return this.crypto_currency_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22067newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BatchGetLatestCryptoDigestInternalRequest)) {
            return false;
        }
        BatchGetLatestCryptoDigestInternalRequest batchGetLatestCryptoDigestInternalRequest = (BatchGetLatestCryptoDigestInternalRequest) other;
        return Intrinsics.areEqual(unknownFields(), batchGetLatestCryptoDigestInternalRequest.unknownFields()) && Intrinsics.areEqual(this.crypto_currency_ids, batchGetLatestCryptoDigestInternalRequest.crypto_currency_ids) && Intrinsics.areEqual(this.user_id, batchGetLatestCryptoDigestInternalRequest.user_id) && this.force_get_agreement == batchGetLatestCryptoDigestInternalRequest.force_get_agreement && this.locality == batchGetLatestCryptoDigestInternalRequest.locality;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.crypto_currency_ids.hashCode()) * 37) + this.user_id.hashCode()) * 37) + Boolean.hashCode(this.force_get_agreement)) * 37) + this.locality.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.crypto_currency_ids.isEmpty()) {
            arrayList.add("crypto_currency_ids=" + Internal.sanitize(this.crypto_currency_ids));
        }
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("force_get_agreement=" + this.force_get_agreement);
        arrayList.add("locality=" + this.locality);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchGetLatestCryptoDigestInternalRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BatchGetLatestCryptoDigestInternalRequest copy$default(BatchGetLatestCryptoDigestInternalRequest batchGetLatestCryptoDigestInternalRequest, List list, String str, boolean z, Locality locality, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = batchGetLatestCryptoDigestInternalRequest.crypto_currency_ids;
        }
        if ((i & 2) != 0) {
            str = batchGetLatestCryptoDigestInternalRequest.user_id;
        }
        if ((i & 4) != 0) {
            z = batchGetLatestCryptoDigestInternalRequest.force_get_agreement;
        }
        if ((i & 8) != 0) {
            locality = batchGetLatestCryptoDigestInternalRequest.locality;
        }
        if ((i & 16) != 0) {
            byteString = batchGetLatestCryptoDigestInternalRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z2 = z;
        return batchGetLatestCryptoDigestInternalRequest.copy(list, str, z2, locality, byteString2);
    }

    public final BatchGetLatestCryptoDigestInternalRequest copy(List<String> crypto_currency_ids, String user_id, boolean force_get_agreement, Locality locality, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(crypto_currency_ids, "crypto_currency_ids");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BatchGetLatestCryptoDigestInternalRequest(crypto_currency_ids, user_id, force_get_agreement, locality, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BatchGetLatestCryptoDigestInternalRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BatchGetLatestCryptoDigestInternalRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.BatchGetLatestCryptoDigestInternalRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BatchGetLatestCryptoDigestInternalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getCrypto_currency_ids());
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, value.getUser_id());
                }
                if (value.getForce_get_agreement()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getForce_get_agreement()));
                }
                return value.getLocality() != Locality.LOCALITY_UNSPECIFIED ? iEncodedSizeWithTag + Locality.ADAPTER.encodedSizeWithTag(4, value.getLocality()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BatchGetLatestCryptoDigestInternalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getCrypto_currency_ids());
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (value.getForce_get_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getForce_get_agreement()));
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 4, (int) value.getLocality());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BatchGetLatestCryptoDigestInternalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 4, (int) value.getLocality());
                }
                if (value.getForce_get_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getForce_get_agreement()));
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getCrypto_currency_ids());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BatchGetLatestCryptoDigestInternalRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                Locality localityDecode = Locality.LOCALITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = "";
                while (true) {
                    Locality locality = localityDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new BatchGetLatestCryptoDigestInternalRequest(arrayList, strDecode, zBooleanValue, locality, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 4) {
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
            public BatchGetLatestCryptoDigestInternalRequest redact(BatchGetLatestCryptoDigestInternalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BatchGetLatestCryptoDigestInternalRequest.copy$default(value, null, null, false, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
