package com.robinhood.ceres.p284v1;

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
import rosetta.identi.agreements.AgreementType;

/* compiled from: Attestation.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/ceres/v1/Attestation;", "Lcom/squareup/wire/Message;", "", "id", "", "account_id", "attestation_type", "Lrosetta/identi/agreements/AgreementType;", "created_at", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementType;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAccount_id", "getAttestation_type", "()Lrosetta/identi/agreements/AgreementType;", "getCreated_at", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class Attestation extends Message {

    @JvmField
    public static final ProtoAdapter<Attestation> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "rosetta.identi.agreements.AgreementType#ADAPTER", jsonName = "attestationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AgreementType attestation_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    public Attestation() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ Attestation(String str, String str2, AgreementType agreementType, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? AgreementType.AGREEMENT_TYPE_UNSPECIFIED : agreementType, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20255newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final AgreementType getAttestation_type() {
        return this.attestation_type;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Attestation(String id, String account_id, AgreementType attestation_type, String created_at, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(attestation_type, "attestation_type");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_id = account_id;
        this.attestation_type = attestation_type;
        this.created_at = created_at;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20255newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Attestation)) {
            return false;
        }
        Attestation attestation = (Attestation) other;
        return Intrinsics.areEqual(unknownFields(), attestation.unknownFields()) && Intrinsics.areEqual(this.id, attestation.id) && Intrinsics.areEqual(this.account_id, attestation.account_id) && this.attestation_type == attestation.attestation_type && Intrinsics.areEqual(this.created_at, attestation.created_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.attestation_type.hashCode()) * 37) + this.created_at.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("attestation_type=" + this.attestation_type);
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Attestation{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Attestation copy$default(Attestation attestation, String str, String str2, AgreementType agreementType, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attestation.id;
        }
        if ((i & 2) != 0) {
            str2 = attestation.account_id;
        }
        if ((i & 4) != 0) {
            agreementType = attestation.attestation_type;
        }
        if ((i & 8) != 0) {
            str3 = attestation.created_at;
        }
        if ((i & 16) != 0) {
            byteString = attestation.unknownFields();
        }
        ByteString byteString2 = byteString;
        AgreementType agreementType2 = agreementType;
        return attestation.copy(str, str2, agreementType2, str3, byteString2);
    }

    public final Attestation copy(String id, String account_id, AgreementType attestation_type, String created_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(attestation_type, "attestation_type");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Attestation(id, account_id, attestation_type, created_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Attestation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Attestation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.Attestation$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Attestation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                if (value.getAttestation_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    size += AgreementType.ADAPTER.encodedSizeWithTag(3, value.getAttestation_type());
                }
                return !Intrinsics.areEqual(value.getCreated_at(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCreated_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Attestation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (value.getAttestation_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    AgreementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAttestation_type());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Attestation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getAttestation_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    AgreementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAttestation_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Attestation decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AgreementType agreementTypeDecode = AgreementType.AGREEMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    AgreementType agreementType = agreementTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Attestation(strDecode, strDecode2, agreementType, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                agreementTypeDecode = AgreementType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Attestation redact(Attestation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Attestation.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
