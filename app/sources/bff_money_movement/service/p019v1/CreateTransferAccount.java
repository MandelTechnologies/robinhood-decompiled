package bff_money_movement.service.p019v1;

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

/* compiled from: CreateTransferAccount.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lbff_money_movement/service/v1/CreateTransferAccount;", "Lcom/squareup/wire/Message;", "", "id", "", "type", "Lbff_money_movement/service/v1/TransferAccountType;", "access_token", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/TransferAccountType;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getType", "()Lbff_money_movement/service/v1/TransferAccountType;", "getAccess_token", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class CreateTransferAccount extends Message {

    @JvmField
    public static final ProtoAdapter<CreateTransferAccount> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accessToken", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String access_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "bff_money_movement.service.v1.TransferAccountType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TransferAccountType type;

    public CreateTransferAccount() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ CreateTransferAccount(String str, TransferAccountType transferAccountType, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED : transferAccountType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8403newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final TransferAccountType getType() {
        return this.type;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTransferAccount(String id, TransferAccountType type2, String access_token, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(access_token, "access_token");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.type = type2;
        this.access_token = access_token;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8403newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateTransferAccount)) {
            return false;
        }
        CreateTransferAccount createTransferAccount = (CreateTransferAccount) other;
        return Intrinsics.areEqual(unknownFields(), createTransferAccount.unknownFields()) && Intrinsics.areEqual(this.id, createTransferAccount.id) && this.type == createTransferAccount.type && Intrinsics.areEqual(this.access_token, createTransferAccount.access_token);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.type.hashCode()) * 37) + this.access_token.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("type=" + this.type);
        arrayList.add("access_token=" + Internal.sanitize(this.access_token));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateTransferAccount{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateTransferAccount copy$default(CreateTransferAccount createTransferAccount, String str, TransferAccountType transferAccountType, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createTransferAccount.id;
        }
        if ((i & 2) != 0) {
            transferAccountType = createTransferAccount.type;
        }
        if ((i & 4) != 0) {
            str2 = createTransferAccount.access_token;
        }
        if ((i & 8) != 0) {
            byteString = createTransferAccount.unknownFields();
        }
        return createTransferAccount.copy(str, transferAccountType, str2, byteString);
    }

    public final CreateTransferAccount copy(String id, TransferAccountType type2, String access_token, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(access_token, "access_token");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateTransferAccount(id, type2, access_token, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateTransferAccount.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateTransferAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.CreateTransferAccount$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateTransferAccount value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getType() != TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += TransferAccountType.ADAPTER.encodedSizeWithTag(2, value.getType());
                }
                return !Intrinsics.areEqual(value.getAccess_token(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccess_token()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateTransferAccount value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getType() != TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED) {
                    TransferAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getAccess_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccess_token());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateTransferAccount value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccess_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccess_token());
                }
                if (value.getType() != TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED) {
                    TransferAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateTransferAccount decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TransferAccountType transferAccountTypeDecode = TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateTransferAccount(strDecode, transferAccountTypeDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            transferAccountTypeDecode = TransferAccountType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateTransferAccount redact(CreateTransferAccount value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CreateTransferAccount.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
