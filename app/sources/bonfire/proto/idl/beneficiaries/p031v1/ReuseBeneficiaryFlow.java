package bonfire.proto.idl.beneficiaries.p031v1;

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

/* compiled from: ReuseBeneficiaryFlow.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/ReuseBeneficiaryFlow;", "Lcom/squareup/wire/Message;", "", "beneficiary_account_number", "", "beneficiary_info", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "spousal_consent_agreement", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "account_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;Lokio/ByteString;)V", "getBeneficiary_account_number", "()Ljava/lang/String;", "getBeneficiary_info", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "getSpousal_consent_agreement", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "getAccount_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ReuseBeneficiaryFlow extends Message {

    @JvmField
    public static final ProtoAdapter<ReuseBeneficiaryFlow> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAccountViewModel#ADAPTER", jsonName = "accountViewModel", schemaIndex = 3, tag = 4)
    private final BeneficiaryFlowAccountViewModel account_view_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "beneficiaryAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String beneficiary_account_number;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfo#ADAPTER", jsonName = "beneficiaryInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BeneficiaryInfo beneficiary_info;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAgreementViewModel#ADAPTER", jsonName = "spousalConsentAgreement", schemaIndex = 2, tag = 3)
    private final BeneficiaryFlowAgreementViewModel spousal_consent_agreement;

    public ReuseBeneficiaryFlow() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8837newBuilder();
    }

    public final String getBeneficiary_account_number() {
        return this.beneficiary_account_number;
    }

    public /* synthetic */ ReuseBeneficiaryFlow(String str, BeneficiaryInfo beneficiaryInfo, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : beneficiaryInfo, (i & 4) != 0 ? null : beneficiaryFlowAgreementViewModel, (i & 8) != 0 ? null : beneficiaryFlowAccountViewModel, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final BeneficiaryInfo getBeneficiary_info() {
        return this.beneficiary_info;
    }

    public final BeneficiaryFlowAgreementViewModel getSpousal_consent_agreement() {
        return this.spousal_consent_agreement;
    }

    public final BeneficiaryFlowAccountViewModel getAccount_view_model() {
        return this.account_view_model;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReuseBeneficiaryFlow(String beneficiary_account_number, BeneficiaryInfo beneficiaryInfo, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(beneficiary_account_number, "beneficiary_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.beneficiary_account_number = beneficiary_account_number;
        this.beneficiary_info = beneficiaryInfo;
        this.spousal_consent_agreement = beneficiaryFlowAgreementViewModel;
        this.account_view_model = beneficiaryFlowAccountViewModel;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8837newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReuseBeneficiaryFlow)) {
            return false;
        }
        ReuseBeneficiaryFlow reuseBeneficiaryFlow = (ReuseBeneficiaryFlow) other;
        return Intrinsics.areEqual(unknownFields(), reuseBeneficiaryFlow.unknownFields()) && Intrinsics.areEqual(this.beneficiary_account_number, reuseBeneficiaryFlow.beneficiary_account_number) && Intrinsics.areEqual(this.beneficiary_info, reuseBeneficiaryFlow.beneficiary_info) && Intrinsics.areEqual(this.spousal_consent_agreement, reuseBeneficiaryFlow.spousal_consent_agreement) && Intrinsics.areEqual(this.account_view_model, reuseBeneficiaryFlow.account_view_model);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.beneficiary_account_number.hashCode()) * 37;
        BeneficiaryInfo beneficiaryInfo = this.beneficiary_info;
        int iHashCode2 = (iHashCode + (beneficiaryInfo != null ? beneficiaryInfo.hashCode() : 0)) * 37;
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel = this.spousal_consent_agreement;
        int iHashCode3 = (iHashCode2 + (beneficiaryFlowAgreementViewModel != null ? beneficiaryFlowAgreementViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel = this.account_view_model;
        int iHashCode4 = iHashCode3 + (beneficiaryFlowAccountViewModel != null ? beneficiaryFlowAccountViewModel.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("beneficiary_account_number=" + Internal.sanitize(this.beneficiary_account_number));
        BeneficiaryInfo beneficiaryInfo = this.beneficiary_info;
        if (beneficiaryInfo != null) {
            arrayList.add("beneficiary_info=" + beneficiaryInfo);
        }
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel = this.spousal_consent_agreement;
        if (beneficiaryFlowAgreementViewModel != null) {
            arrayList.add("spousal_consent_agreement=" + beneficiaryFlowAgreementViewModel);
        }
        BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel = this.account_view_model;
        if (beneficiaryFlowAccountViewModel != null) {
            arrayList.add("account_view_model=" + beneficiaryFlowAccountViewModel);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReuseBeneficiaryFlow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ReuseBeneficiaryFlow copy$default(ReuseBeneficiaryFlow reuseBeneficiaryFlow, String str, BeneficiaryInfo beneficiaryInfo, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reuseBeneficiaryFlow.beneficiary_account_number;
        }
        if ((i & 2) != 0) {
            beneficiaryInfo = reuseBeneficiaryFlow.beneficiary_info;
        }
        if ((i & 4) != 0) {
            beneficiaryFlowAgreementViewModel = reuseBeneficiaryFlow.spousal_consent_agreement;
        }
        if ((i & 8) != 0) {
            beneficiaryFlowAccountViewModel = reuseBeneficiaryFlow.account_view_model;
        }
        if ((i & 16) != 0) {
            byteString = reuseBeneficiaryFlow.unknownFields();
        }
        ByteString byteString2 = byteString;
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel2 = beneficiaryFlowAgreementViewModel;
        return reuseBeneficiaryFlow.copy(str, beneficiaryInfo, beneficiaryFlowAgreementViewModel2, beneficiaryFlowAccountViewModel, byteString2);
    }

    public final ReuseBeneficiaryFlow copy(String beneficiary_account_number, BeneficiaryInfo beneficiary_info, BeneficiaryFlowAgreementViewModel spousal_consent_agreement, BeneficiaryFlowAccountViewModel account_view_model, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(beneficiary_account_number, "beneficiary_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReuseBeneficiaryFlow(beneficiary_account_number, beneficiary_info, spousal_consent_agreement, account_view_model, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReuseBeneficiaryFlow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReuseBeneficiaryFlow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.ReuseBeneficiaryFlow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReuseBeneficiaryFlow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBeneficiary_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBeneficiary_account_number());
                }
                if (value.getBeneficiary_info() != null) {
                    size += BeneficiaryInfo.ADAPTER.encodedSizeWithTag(2, value.getBeneficiary_info());
                }
                return size + BeneficiaryFlowAgreementViewModel.ADAPTER.encodedSizeWithTag(3, value.getSpousal_consent_agreement()) + BeneficiaryFlowAccountViewModel.ADAPTER.encodedSizeWithTag(4, value.getAccount_view_model());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReuseBeneficiaryFlow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBeneficiary_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBeneficiary_account_number());
                }
                if (value.getBeneficiary_info() != null) {
                    BeneficiaryInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getBeneficiary_info());
                }
                BeneficiaryFlowAgreementViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getSpousal_consent_agreement());
                BeneficiaryFlowAccountViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getAccount_view_model());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReuseBeneficiaryFlow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BeneficiaryFlowAccountViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getAccount_view_model());
                BeneficiaryFlowAgreementViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getSpousal_consent_agreement());
                if (value.getBeneficiary_info() != null) {
                    BeneficiaryInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getBeneficiary_info());
                }
                if (Intrinsics.areEqual(value.getBeneficiary_account_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBeneficiary_account_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReuseBeneficiaryFlow redact(ReuseBeneficiaryFlow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BeneficiaryInfo beneficiary_info = value.getBeneficiary_info();
                BeneficiaryInfo beneficiaryInfoRedact = beneficiary_info != null ? BeneficiaryInfo.ADAPTER.redact(beneficiary_info) : null;
                BeneficiaryFlowAgreementViewModel spousal_consent_agreement = value.getSpousal_consent_agreement();
                BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModelRedact = spousal_consent_agreement != null ? BeneficiaryFlowAgreementViewModel.ADAPTER.redact(spousal_consent_agreement) : null;
                BeneficiaryFlowAccountViewModel account_view_model = value.getAccount_view_model();
                return ReuseBeneficiaryFlow.copy$default(value, null, beneficiaryInfoRedact, beneficiaryFlowAgreementViewModelRedact, account_view_model != null ? BeneficiaryFlowAccountViewModel.ADAPTER.redact(account_view_model) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReuseBeneficiaryFlow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                BeneficiaryInfo beneficiaryInfoDecode = null;
                BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModelDecode = null;
                BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModelDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ReuseBeneficiaryFlow(strDecode, beneficiaryInfoDecode, beneficiaryFlowAgreementViewModelDecode, beneficiaryFlowAccountViewModelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        beneficiaryInfoDecode = BeneficiaryInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        beneficiaryFlowAgreementViewModelDecode = BeneficiaryFlowAgreementViewModel.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        beneficiaryFlowAccountViewModelDecode = BeneficiaryFlowAccountViewModel.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
