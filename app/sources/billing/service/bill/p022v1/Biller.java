package billing.service.bill.p022v1;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.rosetta.common.AccountType;
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

/* compiled from: Biller.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lbilling/service/bill/v1/Biller;", "Lcom/squareup/wire/Message;", "", "rh_account_id", "", "rh_account_type", "Lcom/robinhood/rosetta/common/AccountType;", MatchaQrCodeDuxo6.USER_ID_KEY, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountType;Ljava/lang/String;Lokio/ByteString;)V", "getRh_account_id", "()Ljava/lang/String;", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountType;", "getUser_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "billing.bill_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Biller extends Message {

    @JvmField
    public static final ProtoAdapter<Biller> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhAccountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rh_account_id;

    @WireField(adapter = "com.robinhood.rosetta.common.AccountType#ADAPTER", jsonName = "rhAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AccountType rh_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String user_id;

    public Biller() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ Biller(String str, AccountType accountType, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8543newBuilder();
    }

    public final String getRh_account_id() {
        return this.rh_account_id;
    }

    public final AccountType getRh_account_type() {
        return this.rh_account_type;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Biller(String rh_account_id, AccountType rh_account_type, String user_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rh_account_id, "rh_account_id");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rh_account_id = rh_account_id;
        this.rh_account_type = rh_account_type;
        this.user_id = user_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8543newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Biller)) {
            return false;
        }
        Biller biller = (Biller) other;
        return Intrinsics.areEqual(unknownFields(), biller.unknownFields()) && Intrinsics.areEqual(this.rh_account_id, biller.rh_account_id) && this.rh_account_type == biller.rh_account_type && Intrinsics.areEqual(this.user_id, biller.user_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.rh_account_id.hashCode()) * 37) + this.rh_account_type.hashCode()) * 37) + this.user_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rh_account_id=" + Internal.sanitize(this.rh_account_id));
        arrayList.add("rh_account_type=" + this.rh_account_type);
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Biller{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Biller copy$default(Biller biller, String str, AccountType accountType, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = biller.rh_account_id;
        }
        if ((i & 2) != 0) {
            accountType = biller.rh_account_type;
        }
        if ((i & 4) != 0) {
            str2 = biller.user_id;
        }
        if ((i & 8) != 0) {
            byteString = biller.unknownFields();
        }
        return biller.copy(str, accountType, str2, byteString);
    }

    public final Biller copy(String rh_account_id, AccountType rh_account_type, String user_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rh_account_id, "rh_account_id");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Biller(rh_account_id, rh_account_type, user_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Biller.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Biller>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: billing.service.bill.v1.Biller$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Biller value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRh_account_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRh_account_id());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    size += AccountType.ADAPTER.encodedSizeWithTag(2, value.getRh_account_type());
                }
                return !Intrinsics.areEqual(value.getUser_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUser_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Biller value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRh_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRh_account_id());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getRh_account_type());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUser_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Biller value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUser_id());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getRh_account_type());
                }
                if (Intrinsics.areEqual(value.getRh_account_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRh_account_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Biller decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AccountType accountTypeDecode = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Biller(strDecode, accountTypeDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            accountTypeDecode = AccountType.ADAPTER.decode(reader);
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
            public Biller redact(Biller value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Biller.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
