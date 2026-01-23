package contracts.money_movement.crypto_account_selection.proto.p432v1;

import bff_money_movement.service.p019v1.BillingAccount;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: DidSelectAccountRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/DidSelectAccountRequest;", "Lcom/squareup/wire/Message;", "", "account", "Lbff_money_movement/service/v1/BillingAccount;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/BillingAccount;Lokio/ByteString;)V", "getAccount", "()Lbff_money_movement/service/v1/BillingAccount;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DidSelectAccountRequest extends Message {

    @JvmField
    public static final ProtoAdapter<DidSelectAccountRequest> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.BillingAccount#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BillingAccount account;

    /* JADX WARN: Multi-variable type inference failed */
    public DidSelectAccountRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27766newBuilder();
    }

    public final BillingAccount getAccount() {
        return this.account;
    }

    public /* synthetic */ DidSelectAccountRequest(BillingAccount billingAccount, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : billingAccount, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DidSelectAccountRequest(BillingAccount billingAccount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account = billingAccount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27766newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DidSelectAccountRequest)) {
            return false;
        }
        DidSelectAccountRequest didSelectAccountRequest = (DidSelectAccountRequest) other;
        return Intrinsics.areEqual(unknownFields(), didSelectAccountRequest.unknownFields()) && Intrinsics.areEqual(this.account, didSelectAccountRequest.account);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BillingAccount billingAccount = this.account;
        int iHashCode2 = iHashCode + (billingAccount != null ? billingAccount.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        BillingAccount billingAccount = this.account;
        if (billingAccount != null) {
            arrayList.add("account=" + billingAccount);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DidSelectAccountRequest{", "}", 0, null, null, 56, null);
    }

    public final DidSelectAccountRequest copy(BillingAccount account, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DidSelectAccountRequest(account, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DidSelectAccountRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DidSelectAccountRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.money_movement.crypto_account_selection.proto.v1.DidSelectAccountRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DidSelectAccountRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getAccount() != null ? size + BillingAccount.ADAPTER.encodedSizeWithTag(1, value.getAccount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DidSelectAccountRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAccount() != null) {
                    BillingAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DidSelectAccountRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAccount() != null) {
                    BillingAccount.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DidSelectAccountRequest redact(DidSelectAccountRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BillingAccount account = value.getAccount();
                return value.copy(account != null ? BillingAccount.ADAPTER.redact(account) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DidSelectAccountRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BillingAccount billingAccountDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DidSelectAccountRequest(billingAccountDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        billingAccountDecode = BillingAccount.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
