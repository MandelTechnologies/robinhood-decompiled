package crypto_portkey.service.p443v1;

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

/* compiled from: MigrationFinalizeTransaction.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationFinalizeTransaction;", "Lcom/squareup/wire/Message;", "", "asset_symbol", "", "transaction_id", "amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAsset_symbol", "()Ljava/lang/String;", "getTransaction_id", "getAmount", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class MigrationFinalizeTransaction extends Message {

    @JvmField
    public static final ProtoAdapter<MigrationFinalizeTransaction> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String asset_symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String transaction_id;

    public MigrationFinalizeTransaction() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ MigrationFinalizeTransaction(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27904newBuilder();
    }

    public final String getAsset_symbol() {
        return this.asset_symbol;
    }

    public final String getTransaction_id() {
        return this.transaction_id;
    }

    public final String getAmount() {
        return this.amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationFinalizeTransaction(String asset_symbol, String transaction_id, String amount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(asset_symbol, "asset_symbol");
        Intrinsics.checkNotNullParameter(transaction_id, "transaction_id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_symbol = asset_symbol;
        this.transaction_id = transaction_id;
        this.amount = amount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27904newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MigrationFinalizeTransaction)) {
            return false;
        }
        MigrationFinalizeTransaction migrationFinalizeTransaction = (MigrationFinalizeTransaction) other;
        return Intrinsics.areEqual(unknownFields(), migrationFinalizeTransaction.unknownFields()) && Intrinsics.areEqual(this.asset_symbol, migrationFinalizeTransaction.asset_symbol) && Intrinsics.areEqual(this.transaction_id, migrationFinalizeTransaction.transaction_id) && Intrinsics.areEqual(this.amount, migrationFinalizeTransaction.amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.asset_symbol.hashCode()) * 37) + this.transaction_id.hashCode()) * 37) + this.amount.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("asset_symbol=" + Internal.sanitize(this.asset_symbol));
        arrayList.add("transaction_id=" + Internal.sanitize(this.transaction_id));
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        return CollectionsKt.joinToString$default(arrayList, ", ", "MigrationFinalizeTransaction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MigrationFinalizeTransaction copy$default(MigrationFinalizeTransaction migrationFinalizeTransaction, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = migrationFinalizeTransaction.asset_symbol;
        }
        if ((i & 2) != 0) {
            str2 = migrationFinalizeTransaction.transaction_id;
        }
        if ((i & 4) != 0) {
            str3 = migrationFinalizeTransaction.amount;
        }
        if ((i & 8) != 0) {
            byteString = migrationFinalizeTransaction.unknownFields();
        }
        return migrationFinalizeTransaction.copy(str, str2, str3, byteString);
    }

    public final MigrationFinalizeTransaction copy(String asset_symbol, String transaction_id, String amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(asset_symbol, "asset_symbol");
        Intrinsics.checkNotNullParameter(transaction_id, "transaction_id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MigrationFinalizeTransaction(asset_symbol, transaction_id, amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MigrationFinalizeTransaction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MigrationFinalizeTransaction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.MigrationFinalizeTransaction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MigrationFinalizeTransaction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAsset_symbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAsset_symbol());
                }
                if (!Intrinsics.areEqual(value.getTransaction_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTransaction_id());
                }
                return !Intrinsics.areEqual(value.getAmount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAmount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MigrationFinalizeTransaction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAsset_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_symbol());
                }
                if (!Intrinsics.areEqual(value.getTransaction_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTransaction_id());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MigrationFinalizeTransaction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getTransaction_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTransaction_id());
                }
                if (Intrinsics.areEqual(value.getAsset_symbol(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_symbol());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MigrationFinalizeTransaction redact(MigrationFinalizeTransaction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MigrationFinalizeTransaction.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MigrationFinalizeTransaction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MigrationFinalizeTransaction(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
