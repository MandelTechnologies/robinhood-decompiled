package internal_asset_transfers.proto.p475v1;

import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
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
import rosetta.account.BrokerageAccountType;
import rosetta.account.ManagementType;

/* compiled from: IATAccount.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016Jl\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATAccount;", "Lcom/squareup/wire/Message;", "", "rhs_account_number", "", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/BrokerageAccountType;", "is_eligible_sink_account", "", "is_eligible_source_account", "rhf_account_number", "management_type", "Lrosetta/account/ManagementType;", "nickname", "created_at", "source_ineligibility_reason", "Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountType;ZZLjava/lang/String;Lrosetta/account/ManagementType;Ljava/lang/String;Ljava/lang/String;Linternal_asset_transfers/proto/v1/IATIneligibilityReason;Lokio/ByteString;)V", "getRhs_account_number", "()Ljava/lang/String;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountType;", "()Z", "getRhf_account_number", "getManagement_type", "()Lrosetta/account/ManagementType;", "getNickname", "getCreated_at", "getSource_ineligibility_reason", "()Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class IATAccount extends Message {

    @JvmField
    public static final ProtoAdapter<IATAccount> ADAPTER;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "brokerageAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BrokerageAccountType brokerage_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEligibleSinkAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_eligible_sink_account;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEligibleSourceAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_eligible_source_account;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "managementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final ManagementType management_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhfAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String rhf_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rhs_account_number;

    @WireField(adapter = "internal_asset_transfers.proto.v1.IATIneligibilityReason#ADAPTER", jsonName = "sourceIneligibilityReason", schemaIndex = 8, tag = 9)
    private final IATIneligibilityReason source_ineligibility_reason;

    public IATAccount() {
        this(null, null, false, false, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ IATAccount(String str, BrokerageAccountType brokerageAccountType, boolean z, boolean z2, String str2, ManagementType managementType, String str3, String str4, IATIneligibilityReason iATIneligibilityReason, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? null : iATIneligibilityReason, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28455newBuilder();
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final BrokerageAccountType getBrokerage_account_type() {
        return this.brokerage_account_type;
    }

    /* renamed from: is_eligible_sink_account, reason: from getter */
    public final boolean getIs_eligible_sink_account() {
        return this.is_eligible_sink_account;
    }

    /* renamed from: is_eligible_source_account, reason: from getter */
    public final boolean getIs_eligible_source_account() {
        return this.is_eligible_source_account;
    }

    public final String getRhf_account_number() {
        return this.rhf_account_number;
    }

    public final ManagementType getManagement_type() {
        return this.management_type;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final IATIneligibilityReason getSource_ineligibility_reason() {
        return this.source_ineligibility_reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IATAccount(String rhs_account_number, BrokerageAccountType brokerage_account_type, boolean z, boolean z2, String rhf_account_number, ManagementType management_type, String nickname, String created_at, IATIneligibilityReason iATIneligibilityReason, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rhs_account_number = rhs_account_number;
        this.brokerage_account_type = brokerage_account_type;
        this.is_eligible_sink_account = z;
        this.is_eligible_source_account = z2;
        this.rhf_account_number = rhf_account_number;
        this.management_type = management_type;
        this.nickname = nickname;
        this.created_at = created_at;
        this.source_ineligibility_reason = iATIneligibilityReason;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28455newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IATAccount)) {
            return false;
        }
        IATAccount iATAccount = (IATAccount) other;
        return Intrinsics.areEqual(unknownFields(), iATAccount.unknownFields()) && Intrinsics.areEqual(this.rhs_account_number, iATAccount.rhs_account_number) && this.brokerage_account_type == iATAccount.brokerage_account_type && this.is_eligible_sink_account == iATAccount.is_eligible_sink_account && this.is_eligible_source_account == iATAccount.is_eligible_source_account && Intrinsics.areEqual(this.rhf_account_number, iATAccount.rhf_account_number) && this.management_type == iATAccount.management_type && Intrinsics.areEqual(this.nickname, iATAccount.nickname) && Intrinsics.areEqual(this.created_at, iATAccount.created_at) && this.source_ineligibility_reason == iATAccount.source_ineligibility_reason;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((unknownFields().hashCode() * 37) + this.rhs_account_number.hashCode()) * 37) + this.brokerage_account_type.hashCode()) * 37) + Boolean.hashCode(this.is_eligible_sink_account)) * 37) + Boolean.hashCode(this.is_eligible_source_account)) * 37) + this.rhf_account_number.hashCode()) * 37) + this.management_type.hashCode()) * 37) + this.nickname.hashCode()) * 37) + this.created_at.hashCode()) * 37;
        IATIneligibilityReason iATIneligibilityReason = this.source_ineligibility_reason;
        int iHashCode2 = iHashCode + (iATIneligibilityReason != null ? iATIneligibilityReason.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("brokerage_account_type=" + this.brokerage_account_type);
        arrayList.add("is_eligible_sink_account=" + this.is_eligible_sink_account);
        arrayList.add("is_eligible_source_account=" + this.is_eligible_source_account);
        arrayList.add("rhf_account_number=" + Internal.sanitize(this.rhf_account_number));
        arrayList.add("management_type=" + this.management_type);
        arrayList.add("nickname=" + Internal.sanitize(this.nickname));
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        IATIneligibilityReason iATIneligibilityReason = this.source_ineligibility_reason;
        if (iATIneligibilityReason != null) {
            arrayList.add("source_ineligibility_reason=" + iATIneligibilityReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IATAccount{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IATAccount copy$default(IATAccount iATAccount, String str, BrokerageAccountType brokerageAccountType, boolean z, boolean z2, String str2, ManagementType managementType, String str3, String str4, IATIneligibilityReason iATIneligibilityReason, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iATAccount.rhs_account_number;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = iATAccount.brokerage_account_type;
        }
        if ((i & 4) != 0) {
            z = iATAccount.is_eligible_sink_account;
        }
        if ((i & 8) != 0) {
            z2 = iATAccount.is_eligible_source_account;
        }
        if ((i & 16) != 0) {
            str2 = iATAccount.rhf_account_number;
        }
        if ((i & 32) != 0) {
            managementType = iATAccount.management_type;
        }
        if ((i & 64) != 0) {
            str3 = iATAccount.nickname;
        }
        if ((i & 128) != 0) {
            str4 = iATAccount.created_at;
        }
        if ((i & 256) != 0) {
            iATIneligibilityReason = iATAccount.source_ineligibility_reason;
        }
        if ((i & 512) != 0) {
            byteString = iATAccount.unknownFields();
        }
        IATIneligibilityReason iATIneligibilityReason2 = iATIneligibilityReason;
        ByteString byteString2 = byteString;
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        ManagementType managementType2 = managementType;
        return iATAccount.copy(str, brokerageAccountType, z, z2, str7, managementType2, str5, str6, iATIneligibilityReason2, byteString2);
    }

    public final IATAccount copy(String rhs_account_number, BrokerageAccountType brokerage_account_type, boolean is_eligible_sink_account, boolean is_eligible_source_account, String rhf_account_number, ManagementType management_type, String nickname, String created_at, IATIneligibilityReason source_ineligibility_reason, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IATAccount(rhs_account_number, brokerage_account_type, is_eligible_sink_account, is_eligible_source_account, rhf_account_number, management_type, nickname, created_at, source_ineligibility_reason, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IATAccount.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IATAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: internal_asset_transfers.proto.v1.IATAccount$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IATAccount value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRhs_account_number());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(2, value.getBrokerage_account_type());
                }
                if (value.getIs_eligible_sink_account()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_eligible_sink_account()));
                }
                if (value.getIs_eligible_source_account()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_eligible_source_account()));
                }
                if (!Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getRhf_account_number());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    size += ManagementType.ADAPTER.encodedSizeWithTag(6, value.getManagement_type());
                }
                if (!Intrinsics.areEqual(value.getNickname(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getNickname());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getCreated_at());
                }
                return size + IATIneligibilityReason.ADAPTER.encodedSizeWithTag(9, value.getSource_ineligibility_reason());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IATAccount value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrokerage_account_type());
                }
                if (value.getIs_eligible_sink_account()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_eligible_sink_account()));
                }
                if (value.getIs_eligible_source_account()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_eligible_source_account()));
                }
                if (!Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRhf_account_number());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 6, (int) value.getManagement_type());
                }
                if (!Intrinsics.areEqual(value.getNickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getNickname());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCreated_at());
                }
                IATIneligibilityReason.ADAPTER.encodeWithTag(writer, 9, (int) value.getSource_ineligibility_reason());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IATAccount value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                IATIneligibilityReason.ADAPTER.encodeWithTag(writer, 9, (int) value.getSource_ineligibility_reason());
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getNickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getNickname());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 6, (int) value.getManagement_type());
                }
                if (!Intrinsics.areEqual(value.getRhf_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRhf_account_number());
                }
                if (value.getIs_eligible_source_account()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_eligible_source_account()));
                }
                if (value.getIs_eligible_sink_account()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_eligible_sink_account()));
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrokerage_account_type());
                }
                if (Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IATAccount decode(ProtoReader reader) throws IOException {
                ManagementType managementType;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                ManagementType managementType2 = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                IATIneligibilityReason iATIneligibilityReasonDecode = null;
                ManagementType managementTypeDecode = managementType2;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                managementType = managementTypeDecode;
                                str = strDecode3;
                                str2 = strDecode4;
                                try {
                                    brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                strDecode4 = str2;
                                managementTypeDecode = managementType;
                                strDecode3 = str;
                                break;
                            case 3:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 4:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                managementType = managementTypeDecode;
                                str = strDecode3;
                                try {
                                    managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    str2 = strDecode4;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode3 = str;
                                break;
                            case 7:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                try {
                                    iATIneligibilityReasonDecode = IATIneligibilityReason.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    managementType = managementTypeDecode;
                                    str = strDecode3;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                managementType = managementTypeDecode;
                                str = strDecode3;
                                str2 = strDecode4;
                                strDecode4 = str2;
                                managementTypeDecode = managementType;
                                strDecode3 = str;
                                break;
                        }
                    } else {
                        return new IATAccount(strDecode3, brokerageAccountTypeDecode, zBooleanValue, zBooleanValue2, strDecode4, managementTypeDecode, strDecode, strDecode2, iATIneligibilityReasonDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IATAccount redact(IATAccount value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IATAccount.copy$default(value, null, null, false, false, null, null, null, null, null, ByteString.EMPTY, 511, null);
            }
        };
    }
}
