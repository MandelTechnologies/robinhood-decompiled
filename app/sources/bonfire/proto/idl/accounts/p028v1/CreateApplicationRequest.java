package bonfire.proto.idl.accounts.p028v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: CreateApplicationRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\rH\u0016JX\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/CreateApplicationRequest;", "Lcom/squareup/wire/Message;", "", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/BrokerageAccountType;", "management_type", "Lrosetta/account/ManagementType;", "attempt_auto_approval", "", "is_margin_allowed", "is_slip_allowed", "is_sweep_allowed", "nickname", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/account/BrokerageAccountType;Lrosetta/account/ManagementType;ZZZZLjava/lang/String;Lokio/ByteString;)V", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountType;", "getManagement_type", "()Lrosetta/account/ManagementType;", "getAttempt_auto_approval", "()Z", "getNickname", "()Ljava/lang/String;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CreateApplicationRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateApplicationRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "attemptAutoApproval", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean attempt_auto_approval;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "brokerageAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BrokerageAccountType brokerage_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMarginAllowed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_margin_allowed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSlipAllowed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_slip_allowed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSweepAllowed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_sweep_allowed;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "managementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ManagementType management_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String nickname;

    public CreateApplicationRequest() {
        this(null, null, false, false, false, false, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8720newBuilder();
    }

    public final BrokerageAccountType getBrokerage_account_type() {
        return this.brokerage_account_type;
    }

    public /* synthetic */ CreateApplicationRequest(BrokerageAccountType brokerageAccountType, ManagementType managementType, boolean z, boolean z2, boolean z3, boolean z4, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 2) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? null : str, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ManagementType getManagement_type() {
        return this.management_type;
    }

    public final boolean getAttempt_auto_approval() {
        return this.attempt_auto_approval;
    }

    /* renamed from: is_margin_allowed, reason: from getter */
    public final boolean getIs_margin_allowed() {
        return this.is_margin_allowed;
    }

    /* renamed from: is_slip_allowed, reason: from getter */
    public final boolean getIs_slip_allowed() {
        return this.is_slip_allowed;
    }

    /* renamed from: is_sweep_allowed, reason: from getter */
    public final boolean getIs_sweep_allowed() {
        return this.is_sweep_allowed;
    }

    public final String getNickname() {
        return this.nickname;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateApplicationRequest(BrokerageAccountType brokerage_account_type, ManagementType management_type, boolean z, boolean z2, boolean z3, boolean z4, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.brokerage_account_type = brokerage_account_type;
        this.management_type = management_type;
        this.attempt_auto_approval = z;
        this.is_margin_allowed = z2;
        this.is_slip_allowed = z3;
        this.is_sweep_allowed = z4;
        this.nickname = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8720newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateApplicationRequest)) {
            return false;
        }
        CreateApplicationRequest createApplicationRequest = (CreateApplicationRequest) other;
        return Intrinsics.areEqual(unknownFields(), createApplicationRequest.unknownFields()) && this.brokerage_account_type == createApplicationRequest.brokerage_account_type && this.management_type == createApplicationRequest.management_type && this.attempt_auto_approval == createApplicationRequest.attempt_auto_approval && this.is_margin_allowed == createApplicationRequest.is_margin_allowed && this.is_slip_allowed == createApplicationRequest.is_slip_allowed && this.is_sweep_allowed == createApplicationRequest.is_sweep_allowed && Intrinsics.areEqual(this.nickname, createApplicationRequest.nickname);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.brokerage_account_type.hashCode()) * 37) + this.management_type.hashCode()) * 37) + Boolean.hashCode(this.attempt_auto_approval)) * 37) + Boolean.hashCode(this.is_margin_allowed)) * 37) + Boolean.hashCode(this.is_slip_allowed)) * 37) + Boolean.hashCode(this.is_sweep_allowed)) * 37;
        String str = this.nickname;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("brokerage_account_type=" + this.brokerage_account_type);
        arrayList.add("management_type=" + this.management_type);
        arrayList.add("attempt_auto_approval=" + this.attempt_auto_approval);
        arrayList.add("is_margin_allowed=" + this.is_margin_allowed);
        arrayList.add("is_slip_allowed=" + this.is_slip_allowed);
        arrayList.add("is_sweep_allowed=" + this.is_sweep_allowed);
        String str = this.nickname;
        if (str != null) {
            arrayList.add("nickname=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateApplicationRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateApplicationRequest copy$default(CreateApplicationRequest createApplicationRequest, BrokerageAccountType brokerageAccountType, ManagementType managementType, boolean z, boolean z2, boolean z3, boolean z4, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = createApplicationRequest.brokerage_account_type;
        }
        if ((i & 2) != 0) {
            managementType = createApplicationRequest.management_type;
        }
        if ((i & 4) != 0) {
            z = createApplicationRequest.attempt_auto_approval;
        }
        if ((i & 8) != 0) {
            z2 = createApplicationRequest.is_margin_allowed;
        }
        if ((i & 16) != 0) {
            z3 = createApplicationRequest.is_slip_allowed;
        }
        if ((i & 32) != 0) {
            z4 = createApplicationRequest.is_sweep_allowed;
        }
        if ((i & 64) != 0) {
            str = createApplicationRequest.nickname;
        }
        if ((i & 128) != 0) {
            byteString = createApplicationRequest.unknownFields();
        }
        String str2 = str;
        ByteString byteString2 = byteString;
        boolean z5 = z3;
        boolean z6 = z4;
        return createApplicationRequest.copy(brokerageAccountType, managementType, z, z2, z5, z6, str2, byteString2);
    }

    public final CreateApplicationRequest copy(BrokerageAccountType brokerage_account_type, ManagementType management_type, boolean attempt_auto_approval, boolean is_margin_allowed, boolean is_slip_allowed, boolean is_sweep_allowed, String nickname, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateApplicationRequest(brokerage_account_type, management_type, attempt_auto_approval, is_margin_allowed, is_slip_allowed, is_sweep_allowed, nickname, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateApplicationRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateApplicationRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.CreateApplicationRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateApplicationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(1, value.getBrokerage_account_type());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    size += ManagementType.ADAPTER.encodedSizeWithTag(2, value.getManagement_type());
                }
                if (value.getAttempt_auto_approval()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getAttempt_auto_approval()));
                }
                if (value.getIs_margin_allowed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_margin_allowed()));
                }
                if (value.getIs_slip_allowed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_slip_allowed()));
                }
                if (value.getIs_sweep_allowed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_sweep_allowed()));
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getNickname());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateApplicationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBrokerage_account_type());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 2, (int) value.getManagement_type());
                }
                if (value.getAttempt_auto_approval()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getAttempt_auto_approval()));
                }
                if (value.getIs_margin_allowed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_margin_allowed()));
                }
                if (value.getIs_slip_allowed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_slip_allowed()));
                }
                if (value.getIs_sweep_allowed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_sweep_allowed()));
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getNickname());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateApplicationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getNickname());
                if (value.getIs_sweep_allowed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_sweep_allowed()));
                }
                if (value.getIs_slip_allowed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_slip_allowed()));
                }
                if (value.getIs_margin_allowed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_margin_allowed()));
                }
                if (value.getAttempt_auto_approval()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getAttempt_auto_approval()));
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 2, (int) value.getManagement_type());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBrokerage_account_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateApplicationRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BrokerageAccountType brokerageAccountTypeDecode = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                boolean zBooleanValue4 = false;
                ManagementType managementTypeDecode = managementType;
                while (true) {
                    BrokerageAccountType brokerageAccountType = brokerageAccountTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    try {
                                        managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 3:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 4:
                                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 5:
                                    zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 6:
                                    zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 7:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new CreateApplicationRequest(brokerageAccountType, managementTypeDecode, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateApplicationRequest redact(CreateApplicationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CreateApplicationRequest.copy$default(value, null, null, false, false, false, false, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        };
    }
}
