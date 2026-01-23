package bonfire.proto.idl.accounts.p028v1;

import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
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
import rosetta.account.BrokerageAccountType;
import rosetta.account.ManagementType;

/* compiled from: AccountOnboardingEligibilityRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityRequest;", "Lcom/squareup/wire/Message;", "", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/BrokerageAccountType;", "management_type", "Lrosetta/account/ManagementType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/account/BrokerageAccountType;Lrosetta/account/ManagementType;Lokio/ByteString;)V", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountType;", "getManagement_type", "()Lrosetta/account/ManagementType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AccountOnboardingEligibilityRequest extends Message {

    @JvmField
    public static final ProtoAdapter<AccountOnboardingEligibilityRequest> ADAPTER;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "brokerageAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BrokerageAccountType brokerage_account_type;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "managementType", schemaIndex = 1, tag = 2)
    private final ManagementType management_type;

    public AccountOnboardingEligibilityRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8716newBuilder();
    }

    public final BrokerageAccountType getBrokerage_account_type() {
        return this.brokerage_account_type;
    }

    public /* synthetic */ AccountOnboardingEligibilityRequest(BrokerageAccountType brokerageAccountType, ManagementType managementType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 2) != 0 ? null : managementType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ManagementType getManagement_type() {
        return this.management_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountOnboardingEligibilityRequest(BrokerageAccountType brokerage_account_type, ManagementType managementType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.brokerage_account_type = brokerage_account_type;
        this.management_type = managementType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8716newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountOnboardingEligibilityRequest)) {
            return false;
        }
        AccountOnboardingEligibilityRequest accountOnboardingEligibilityRequest = (AccountOnboardingEligibilityRequest) other;
        return Intrinsics.areEqual(unknownFields(), accountOnboardingEligibilityRequest.unknownFields()) && this.brokerage_account_type == accountOnboardingEligibilityRequest.brokerage_account_type && this.management_type == accountOnboardingEligibilityRequest.management_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.brokerage_account_type.hashCode()) * 37;
        ManagementType managementType = this.management_type;
        int iHashCode2 = iHashCode + (managementType != null ? managementType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("brokerage_account_type=" + this.brokerage_account_type);
        ManagementType managementType = this.management_type;
        if (managementType != null) {
            arrayList.add("management_type=" + managementType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountOnboardingEligibilityRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AccountOnboardingEligibilityRequest copy$default(AccountOnboardingEligibilityRequest accountOnboardingEligibilityRequest, BrokerageAccountType brokerageAccountType, ManagementType managementType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = accountOnboardingEligibilityRequest.brokerage_account_type;
        }
        if ((i & 2) != 0) {
            managementType = accountOnboardingEligibilityRequest.management_type;
        }
        if ((i & 4) != 0) {
            byteString = accountOnboardingEligibilityRequest.unknownFields();
        }
        return accountOnboardingEligibilityRequest.copy(brokerageAccountType, managementType, byteString);
    }

    public final AccountOnboardingEligibilityRequest copy(BrokerageAccountType brokerage_account_type, ManagementType management_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountOnboardingEligibilityRequest(brokerage_account_type, management_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountOnboardingEligibilityRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountOnboardingEligibilityRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.AccountOnboardingEligibilityRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountOnboardingEligibilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(1, value.getBrokerage_account_type());
                }
                return size + ManagementType.ADAPTER.encodedSizeWithTag(2, value.getManagement_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountOnboardingEligibilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBrokerage_account_type());
                }
                ManagementType.ADAPTER.encodeWithTag(writer, 2, (int) value.getManagement_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountOnboardingEligibilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ManagementType.ADAPTER.encodeWithTag(writer, 2, (int) value.getManagement_type());
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBrokerage_account_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountOnboardingEligibilityRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BrokerageAccountType brokerageAccountTypeDecode = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ManagementType managementTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AccountOnboardingEligibilityRequest(brokerageAccountTypeDecode, managementTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountOnboardingEligibilityRequest redact(AccountOnboardingEligibilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AccountOnboardingEligibilityRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
