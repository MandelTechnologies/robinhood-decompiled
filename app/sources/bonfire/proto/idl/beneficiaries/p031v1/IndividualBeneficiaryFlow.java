package bonfire.proto.idl.beneficiaries.p031v1;

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

/* compiled from: IndividualBeneficiaryFlow.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016JL\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlow;", "Lcom/squareup/wire/Message;", "", "legal_name_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModel;", "relationship_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModel;", "dob_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModel;", "email_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "account_view_model", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;Lokio/ByteString;)V", "getLegal_name_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModel;", "getRelationship_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModel;", "getDob_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModel;", "getEmail_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "getAccount_view_model", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndividualBeneficiaryFlow extends Message {

    @JvmField
    public static final ProtoAdapter<IndividualBeneficiaryFlow> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowAccountViewModel#ADAPTER", jsonName = "accountViewModel", schemaIndex = 4, tag = 5)
    private final BeneficiaryFlowAccountViewModel account_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowDOBViewModel#ADAPTER", jsonName = "dobViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final BeneficiaryFlowDOBViewModel dob_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowEmailViewModel#ADAPTER", jsonName = "emailViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final BeneficiaryFlowEmailViewModel email_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowLegalNameViewModel#ADAPTER", jsonName = "legalNameViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BeneficiaryFlowLegalNameViewModel legal_name_view_model;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowRelationshipViewModel#ADAPTER", jsonName = "relationshipViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BeneficiaryFlowRelationshipViewModel relationship_view_model;

    public IndividualBeneficiaryFlow() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8833newBuilder();
    }

    public final BeneficiaryFlowLegalNameViewModel getLegal_name_view_model() {
        return this.legal_name_view_model;
    }

    public final BeneficiaryFlowRelationshipViewModel getRelationship_view_model() {
        return this.relationship_view_model;
    }

    public final BeneficiaryFlowDOBViewModel getDob_view_model() {
        return this.dob_view_model;
    }

    public final BeneficiaryFlowEmailViewModel getEmail_view_model() {
        return this.email_view_model;
    }

    public final BeneficiaryFlowAccountViewModel getAccount_view_model() {
        return this.account_view_model;
    }

    public /* synthetic */ IndividualBeneficiaryFlow(BeneficiaryFlowLegalNameViewModel beneficiaryFlowLegalNameViewModel, BeneficiaryFlowRelationshipViewModel beneficiaryFlowRelationshipViewModel, BeneficiaryFlowDOBViewModel beneficiaryFlowDOBViewModel, BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel, BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : beneficiaryFlowLegalNameViewModel, (i & 2) != 0 ? null : beneficiaryFlowRelationshipViewModel, (i & 4) != 0 ? null : beneficiaryFlowDOBViewModel, (i & 8) != 0 ? null : beneficiaryFlowEmailViewModel, (i & 16) != 0 ? null : beneficiaryFlowAccountViewModel, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndividualBeneficiaryFlow(BeneficiaryFlowLegalNameViewModel beneficiaryFlowLegalNameViewModel, BeneficiaryFlowRelationshipViewModel beneficiaryFlowRelationshipViewModel, BeneficiaryFlowDOBViewModel beneficiaryFlowDOBViewModel, BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel, BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.legal_name_view_model = beneficiaryFlowLegalNameViewModel;
        this.relationship_view_model = beneficiaryFlowRelationshipViewModel;
        this.dob_view_model = beneficiaryFlowDOBViewModel;
        this.email_view_model = beneficiaryFlowEmailViewModel;
        this.account_view_model = beneficiaryFlowAccountViewModel;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8833newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IndividualBeneficiaryFlow)) {
            return false;
        }
        IndividualBeneficiaryFlow individualBeneficiaryFlow = (IndividualBeneficiaryFlow) other;
        return Intrinsics.areEqual(unknownFields(), individualBeneficiaryFlow.unknownFields()) && Intrinsics.areEqual(this.legal_name_view_model, individualBeneficiaryFlow.legal_name_view_model) && Intrinsics.areEqual(this.relationship_view_model, individualBeneficiaryFlow.relationship_view_model) && Intrinsics.areEqual(this.dob_view_model, individualBeneficiaryFlow.dob_view_model) && Intrinsics.areEqual(this.email_view_model, individualBeneficiaryFlow.email_view_model) && Intrinsics.areEqual(this.account_view_model, individualBeneficiaryFlow.account_view_model);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BeneficiaryFlowLegalNameViewModel beneficiaryFlowLegalNameViewModel = this.legal_name_view_model;
        int iHashCode2 = (iHashCode + (beneficiaryFlowLegalNameViewModel != null ? beneficiaryFlowLegalNameViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowRelationshipViewModel beneficiaryFlowRelationshipViewModel = this.relationship_view_model;
        int iHashCode3 = (iHashCode2 + (beneficiaryFlowRelationshipViewModel != null ? beneficiaryFlowRelationshipViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowDOBViewModel beneficiaryFlowDOBViewModel = this.dob_view_model;
        int iHashCode4 = (iHashCode3 + (beneficiaryFlowDOBViewModel != null ? beneficiaryFlowDOBViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel = this.email_view_model;
        int iHashCode5 = (iHashCode4 + (beneficiaryFlowEmailViewModel != null ? beneficiaryFlowEmailViewModel.hashCode() : 0)) * 37;
        BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel = this.account_view_model;
        int iHashCode6 = iHashCode5 + (beneficiaryFlowAccountViewModel != null ? beneficiaryFlowAccountViewModel.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        BeneficiaryFlowLegalNameViewModel beneficiaryFlowLegalNameViewModel = this.legal_name_view_model;
        if (beneficiaryFlowLegalNameViewModel != null) {
            arrayList.add("legal_name_view_model=" + beneficiaryFlowLegalNameViewModel);
        }
        BeneficiaryFlowRelationshipViewModel beneficiaryFlowRelationshipViewModel = this.relationship_view_model;
        if (beneficiaryFlowRelationshipViewModel != null) {
            arrayList.add("relationship_view_model=" + beneficiaryFlowRelationshipViewModel);
        }
        BeneficiaryFlowDOBViewModel beneficiaryFlowDOBViewModel = this.dob_view_model;
        if (beneficiaryFlowDOBViewModel != null) {
            arrayList.add("dob_view_model=" + beneficiaryFlowDOBViewModel);
        }
        BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel = this.email_view_model;
        if (beneficiaryFlowEmailViewModel != null) {
            arrayList.add("email_view_model=" + beneficiaryFlowEmailViewModel);
        }
        BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel = this.account_view_model;
        if (beneficiaryFlowAccountViewModel != null) {
            arrayList.add("account_view_model=" + beneficiaryFlowAccountViewModel);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IndividualBeneficiaryFlow{", "}", 0, null, null, 56, null);
    }

    public final IndividualBeneficiaryFlow copy(BeneficiaryFlowLegalNameViewModel legal_name_view_model, BeneficiaryFlowRelationshipViewModel relationship_view_model, BeneficiaryFlowDOBViewModel dob_view_model, BeneficiaryFlowEmailViewModel email_view_model, BeneficiaryFlowAccountViewModel account_view_model, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IndividualBeneficiaryFlow(legal_name_view_model, relationship_view_model, dob_view_model, email_view_model, account_view_model, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndividualBeneficiaryFlow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IndividualBeneficiaryFlow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.IndividualBeneficiaryFlow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IndividualBeneficiaryFlow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLegal_name_view_model() != null) {
                    size += BeneficiaryFlowLegalNameViewModel.ADAPTER.encodedSizeWithTag(1, value.getLegal_name_view_model());
                }
                if (value.getRelationship_view_model() != null) {
                    size += BeneficiaryFlowRelationshipViewModel.ADAPTER.encodedSizeWithTag(2, value.getRelationship_view_model());
                }
                if (value.getDob_view_model() != null) {
                    size += BeneficiaryFlowDOBViewModel.ADAPTER.encodedSizeWithTag(3, value.getDob_view_model());
                }
                if (value.getEmail_view_model() != null) {
                    size += BeneficiaryFlowEmailViewModel.ADAPTER.encodedSizeWithTag(4, value.getEmail_view_model());
                }
                return size + BeneficiaryFlowAccountViewModel.ADAPTER.encodedSizeWithTag(5, value.getAccount_view_model());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IndividualBeneficiaryFlow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLegal_name_view_model() != null) {
                    BeneficiaryFlowLegalNameViewModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getLegal_name_view_model());
                }
                if (value.getRelationship_view_model() != null) {
                    BeneficiaryFlowRelationshipViewModel.ADAPTER.encodeWithTag(writer, 2, (int) value.getRelationship_view_model());
                }
                if (value.getDob_view_model() != null) {
                    BeneficiaryFlowDOBViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getDob_view_model());
                }
                if (value.getEmail_view_model() != null) {
                    BeneficiaryFlowEmailViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getEmail_view_model());
                }
                BeneficiaryFlowAccountViewModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getAccount_view_model());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IndividualBeneficiaryFlow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BeneficiaryFlowAccountViewModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getAccount_view_model());
                if (value.getEmail_view_model() != null) {
                    BeneficiaryFlowEmailViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getEmail_view_model());
                }
                if (value.getDob_view_model() != null) {
                    BeneficiaryFlowDOBViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getDob_view_model());
                }
                if (value.getRelationship_view_model() != null) {
                    BeneficiaryFlowRelationshipViewModel.ADAPTER.encodeWithTag(writer, 2, (int) value.getRelationship_view_model());
                }
                if (value.getLegal_name_view_model() != null) {
                    BeneficiaryFlowLegalNameViewModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getLegal_name_view_model());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IndividualBeneficiaryFlow redact(IndividualBeneficiaryFlow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BeneficiaryFlowLegalNameViewModel legal_name_view_model = value.getLegal_name_view_model();
                BeneficiaryFlowLegalNameViewModel beneficiaryFlowLegalNameViewModelRedact = legal_name_view_model != null ? BeneficiaryFlowLegalNameViewModel.ADAPTER.redact(legal_name_view_model) : null;
                BeneficiaryFlowRelationshipViewModel relationship_view_model = value.getRelationship_view_model();
                BeneficiaryFlowRelationshipViewModel beneficiaryFlowRelationshipViewModelRedact = relationship_view_model != null ? BeneficiaryFlowRelationshipViewModel.ADAPTER.redact(relationship_view_model) : null;
                BeneficiaryFlowDOBViewModel dob_view_model = value.getDob_view_model();
                BeneficiaryFlowDOBViewModel beneficiaryFlowDOBViewModelRedact = dob_view_model != null ? BeneficiaryFlowDOBViewModel.ADAPTER.redact(dob_view_model) : null;
                BeneficiaryFlowEmailViewModel email_view_model = value.getEmail_view_model();
                BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModelRedact = email_view_model != null ? BeneficiaryFlowEmailViewModel.ADAPTER.redact(email_view_model) : null;
                BeneficiaryFlowAccountViewModel account_view_model = value.getAccount_view_model();
                return value.copy(beneficiaryFlowLegalNameViewModelRedact, beneficiaryFlowRelationshipViewModelRedact, beneficiaryFlowDOBViewModelRedact, beneficiaryFlowEmailViewModelRedact, account_view_model != null ? BeneficiaryFlowAccountViewModel.ADAPTER.redact(account_view_model) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IndividualBeneficiaryFlow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BeneficiaryFlowLegalNameViewModel beneficiaryFlowLegalNameViewModelDecode = null;
                BeneficiaryFlowRelationshipViewModel beneficiaryFlowRelationshipViewModelDecode = null;
                BeneficiaryFlowDOBViewModel beneficiaryFlowDOBViewModelDecode = null;
                BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModelDecode = null;
                BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModelDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IndividualBeneficiaryFlow(beneficiaryFlowLegalNameViewModelDecode, beneficiaryFlowRelationshipViewModelDecode, beneficiaryFlowDOBViewModelDecode, beneficiaryFlowEmailViewModelDecode, beneficiaryFlowAccountViewModelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        beneficiaryFlowLegalNameViewModelDecode = BeneficiaryFlowLegalNameViewModel.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        beneficiaryFlowRelationshipViewModelDecode = BeneficiaryFlowRelationshipViewModel.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        beneficiaryFlowDOBViewModelDecode = BeneficiaryFlowDOBViewModel.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        beneficiaryFlowEmailViewModelDecode = BeneficiaryFlowEmailViewModel.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        beneficiaryFlowAccountViewModelDecode = BeneficiaryFlowAccountViewModel.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
