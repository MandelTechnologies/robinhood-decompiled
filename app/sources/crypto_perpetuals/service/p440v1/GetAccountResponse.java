package crypto_perpetuals.service.p440v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.AccountStatus;
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

/* compiled from: GetAccountResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BI\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b%\u0010$¨\u0006'"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetAccountResponse;", "Lcom/squareup/wire/Message;", "", "", "account_id", "Lcrypto_perpetuals/common/v1/AccountStatus;", "account_status", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lcrypto_perpetuals/common/v1/AccountStatus;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcrypto_perpetuals/common/v1/AccountStatus;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lcrypto_perpetuals/service/v1/GetAccountResponse;", "Ljava/lang/String;", "getAccount_id", "Lcrypto_perpetuals/common/v1/AccountStatus;", "getAccount_status", "()Lcrypto_perpetuals/common/v1/AccountStatus;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetAccountResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "crypto_perpetuals.common.v1.AccountStatus#ADAPTER", jsonName = "accountStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AccountStatus account_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant updated_at;

    public GetAccountResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27863newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ GetAccountResponse(String str, AccountStatus accountStatus, Instant instant, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AccountStatus.ACCOUNT_STATUS_UNSPECIFIED : accountStatus, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AccountStatus getAccount_status() {
        return this.account_status;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountResponse(String account_id, AccountStatus account_status, Instant instant, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(account_status, "account_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.account_status = account_status;
        this.created_at = instant;
        this.updated_at = instant2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27863newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountResponse)) {
            return false;
        }
        GetAccountResponse getAccountResponse = (GetAccountResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAccountResponse.unknownFields()) && Intrinsics.areEqual(this.account_id, getAccountResponse.account_id) && this.account_status == getAccountResponse.account_status && Intrinsics.areEqual(this.created_at, getAccountResponse.created_at) && Intrinsics.areEqual(this.updated_at, getAccountResponse.updated_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.account_status.hashCode()) * 37;
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
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("account_status=" + this.account_status);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccountResponse copy$default(GetAccountResponse getAccountResponse, String str, AccountStatus accountStatus, Instant instant, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAccountResponse.account_id;
        }
        if ((i & 2) != 0) {
            accountStatus = getAccountResponse.account_status;
        }
        if ((i & 4) != 0) {
            instant = getAccountResponse.created_at;
        }
        if ((i & 8) != 0) {
            instant2 = getAccountResponse.updated_at;
        }
        if ((i & 16) != 0) {
            byteString = getAccountResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        Instant instant3 = instant;
        return getAccountResponse.copy(str, accountStatus, instant3, instant2, byteString2);
    }

    public final GetAccountResponse copy(String account_id, AccountStatus account_status, Instant created_at, Instant updated_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(account_status, "account_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountResponse(account_id, account_status, created_at, updated_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.GetAccountResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                if (value.getAccount_status() != AccountStatus.ACCOUNT_STATUS_UNSPECIFIED) {
                    size += AccountStatus.ADAPTER.encodedSizeWithTag(2, value.getAccount_status());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getCreated_at());
                }
                return value.getUpdated_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getUpdated_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                if (value.getAccount_status() != AccountStatus.ACCOUNT_STATUS_UNSPECIFIED) {
                    AccountStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount_status());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getUpdated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getCreated_at());
                }
                if (value.getAccount_status() != AccountStatus.ACCOUNT_STATUS_UNSPECIFIED) {
                    AccountStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getAccount_status());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AccountStatus accountStatusDecode = AccountStatus.ACCOUNT_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                String strDecode = "";
                while (true) {
                    AccountStatus accountStatus = accountStatusDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetAccountResponse(strDecode, accountStatus, instantDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                accountStatusDecode = AccountStatus.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        } else if (iNextTag == 4) {
                            instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountResponse redact(GetAccountResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                return GetAccountResponse.copy$default(value, null, null, instantRedact, updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
