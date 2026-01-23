package com.robinhood.copilot.proto.p286v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.ErrorResponse;
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

/* compiled from: BatchGetLatestCryptoDigestInternalResponseItem.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ]\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b+\u0010\u001dR\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b,\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItem;", "Lcom/squareup/wire/Message;", "", "", "crypto_currency_id", "Lcom/robinhood/copilot/proto/v1/DigestV2;", "digest", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/CopilotStatus;", "copilot_status", ErrorResponse.ERROR_CODE, "error_message", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/DigestV2;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatus;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/DigestV2;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatus;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponseItem;", "Ljava/lang/String;", "getCrypto_currency_id", "Lcom/robinhood/copilot/proto/v1/DigestV2;", "getDigest", "()Lcom/robinhood/copilot/proto/v1/DigestV2;", "Lj$/time/Instant;", "getLast_updated_at", "()Lj$/time/Instant;", "Lcom/robinhood/copilot/proto/v1/CopilotStatus;", "getCopilot_status", "()Lcom/robinhood/copilot/proto/v1/CopilotStatus;", "getError_code", "getError_message", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BatchGetLatestCryptoDigestInternalResponseItem extends Message {

    @JvmField
    public static final ProtoAdapter<BatchGetLatestCryptoDigestInternalResponseItem> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.CopilotStatus#ADAPTER", jsonName = "copilotStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CopilotStatus copilot_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cryptoCurrencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String crypto_currency_id;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.DigestV2#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final DigestV2 digest;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String error_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastUpdatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant last_updated_at;

    public BatchGetLatestCryptoDigestInternalResponseItem() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ BatchGetLatestCryptoDigestInternalResponseItem(String str, DigestV2 digestV2, Instant instant, CopilotStatus copilotStatus, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : digestV2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? CopilotStatus.COPILOT_STATUS_UNSPECIFIED : copilotStatus, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22070newBuilder();
    }

    public final String getCrypto_currency_id() {
        return this.crypto_currency_id;
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

    public final String getError_code() {
        return this.error_code;
    }

    public final String getError_message() {
        return this.error_message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchGetLatestCryptoDigestInternalResponseItem(String crypto_currency_id, DigestV2 digestV2, Instant instant, CopilotStatus copilot_status, String error_code, String error_message, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.crypto_currency_id = crypto_currency_id;
        this.digest = digestV2;
        this.last_updated_at = instant;
        this.copilot_status = copilot_status;
        this.error_code = error_code;
        this.error_message = error_message;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22070newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BatchGetLatestCryptoDigestInternalResponseItem)) {
            return false;
        }
        BatchGetLatestCryptoDigestInternalResponseItem batchGetLatestCryptoDigestInternalResponseItem = (BatchGetLatestCryptoDigestInternalResponseItem) other;
        return Intrinsics.areEqual(unknownFields(), batchGetLatestCryptoDigestInternalResponseItem.unknownFields()) && Intrinsics.areEqual(this.crypto_currency_id, batchGetLatestCryptoDigestInternalResponseItem.crypto_currency_id) && Intrinsics.areEqual(this.digest, batchGetLatestCryptoDigestInternalResponseItem.digest) && Intrinsics.areEqual(this.last_updated_at, batchGetLatestCryptoDigestInternalResponseItem.last_updated_at) && this.copilot_status == batchGetLatestCryptoDigestInternalResponseItem.copilot_status && Intrinsics.areEqual(this.error_code, batchGetLatestCryptoDigestInternalResponseItem.error_code) && Intrinsics.areEqual(this.error_message, batchGetLatestCryptoDigestInternalResponseItem.error_message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.crypto_currency_id.hashCode()) * 37;
        DigestV2 digestV2 = this.digest;
        int iHashCode2 = (iHashCode + (digestV2 != null ? digestV2.hashCode() : 0)) * 37;
        Instant instant = this.last_updated_at;
        int iHashCode3 = ((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37) + this.copilot_status.hashCode()) * 37) + this.error_code.hashCode()) * 37) + this.error_message.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("crypto_currency_id=" + Internal.sanitize(this.crypto_currency_id));
        DigestV2 digestV2 = this.digest;
        if (digestV2 != null) {
            arrayList.add("digest=" + digestV2);
        }
        Instant instant = this.last_updated_at;
        if (instant != null) {
            arrayList.add("last_updated_at=" + instant);
        }
        arrayList.add("copilot_status=" + this.copilot_status);
        arrayList.add("error_code=" + Internal.sanitize(this.error_code));
        arrayList.add("error_message=" + Internal.sanitize(this.error_message));
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchGetLatestCryptoDigestInternalResponseItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BatchGetLatestCryptoDigestInternalResponseItem copy$default(BatchGetLatestCryptoDigestInternalResponseItem batchGetLatestCryptoDigestInternalResponseItem, String str, DigestV2 digestV2, Instant instant, CopilotStatus copilotStatus, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchGetLatestCryptoDigestInternalResponseItem.crypto_currency_id;
        }
        if ((i & 2) != 0) {
            digestV2 = batchGetLatestCryptoDigestInternalResponseItem.digest;
        }
        if ((i & 4) != 0) {
            instant = batchGetLatestCryptoDigestInternalResponseItem.last_updated_at;
        }
        if ((i & 8) != 0) {
            copilotStatus = batchGetLatestCryptoDigestInternalResponseItem.copilot_status;
        }
        if ((i & 16) != 0) {
            str2 = batchGetLatestCryptoDigestInternalResponseItem.error_code;
        }
        if ((i & 32) != 0) {
            str3 = batchGetLatestCryptoDigestInternalResponseItem.error_message;
        }
        if ((i & 64) != 0) {
            byteString = batchGetLatestCryptoDigestInternalResponseItem.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        String str5 = str2;
        Instant instant2 = instant;
        return batchGetLatestCryptoDigestInternalResponseItem.copy(str, digestV2, instant2, copilotStatus, str5, str4, byteString2);
    }

    public final BatchGetLatestCryptoDigestInternalResponseItem copy(String crypto_currency_id, DigestV2 digest, Instant last_updated_at, CopilotStatus copilot_status, String error_code, String error_message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BatchGetLatestCryptoDigestInternalResponseItem(crypto_currency_id, digest, last_updated_at, copilot_status, error_code, error_message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BatchGetLatestCryptoDigestInternalResponseItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BatchGetLatestCryptoDigestInternalResponseItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.BatchGetLatestCryptoDigestInternalResponseItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BatchGetLatestCryptoDigestInternalResponseItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCrypto_currency_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCrypto_currency_id());
                }
                if (value.getDigest() != null) {
                    size += DigestV2.ADAPTER.encodedSizeWithTag(2, value.getDigest());
                }
                if (value.getLast_updated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getLast_updated_at());
                }
                if (value.getCopilot_status() != CopilotStatus.COPILOT_STATUS_UNSPECIFIED) {
                    size += CopilotStatus.ADAPTER.encodedSizeWithTag(4, value.getCopilot_status());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getError_code());
                }
                return !Intrinsics.areEqual(value.getError_message(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getError_message()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BatchGetLatestCryptoDigestInternalResponseItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCrypto_currency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCrypto_currency_id());
                }
                if (value.getDigest() != null) {
                    DigestV2.ADAPTER.encodeWithTag(writer, 2, (int) value.getDigest());
                }
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getLast_updated_at());
                }
                if (value.getCopilot_status() != CopilotStatus.COPILOT_STATUS_UNSPECIFIED) {
                    CopilotStatus.ADAPTER.encodeWithTag(writer, 4, (int) value.getCopilot_status());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getError_message());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BatchGetLatestCryptoDigestInternalResponseItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getError_code());
                }
                if (value.getCopilot_status() != CopilotStatus.COPILOT_STATUS_UNSPECIFIED) {
                    CopilotStatus.ADAPTER.encodeWithTag(writer, 4, (int) value.getCopilot_status());
                }
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getLast_updated_at());
                }
                if (value.getDigest() != null) {
                    DigestV2.ADAPTER.encodeWithTag(writer, 2, (int) value.getDigest());
                }
                if (Intrinsics.areEqual(value.getCrypto_currency_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCrypto_currency_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BatchGetLatestCryptoDigestInternalResponseItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CopilotStatus copilotStatus = CopilotStatus.COPILOT_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                DigestV2 digestV2Decode = null;
                Instant instantDecode = null;
                CopilotStatus copilotStatusDecode = copilotStatus;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                digestV2Decode = DigestV2.ADAPTER.decode(reader);
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                try {
                                    copilotStatusDecode = CopilotStatus.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new BatchGetLatestCryptoDigestInternalResponseItem(strDecode3, digestV2Decode, instantDecode, copilotStatusDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BatchGetLatestCryptoDigestInternalResponseItem redact(BatchGetLatestCryptoDigestInternalResponseItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DigestV2 digest = value.getDigest();
                DigestV2 digestV2Redact = digest != null ? DigestV2.ADAPTER.redact(digest) : null;
                Instant last_updated_at = value.getLast_updated_at();
                return BatchGetLatestCryptoDigestInternalResponseItem.copy$default(value, null, digestV2Redact, last_updated_at != null ? ProtoAdapter.INSTANT.redact(last_updated_at) : null, null, null, null, ByteString.EMPTY, 57, null);
            }
        };
    }
}
