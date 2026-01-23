package com.robinhood.ceres.p284v1;

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
import rosetta.identi.agreements.AgreementType;

/* compiled from: GetAgreementTypeResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetAgreementTypeResponse;", "Lcom/squareup/wire/Message;", "", "agreement_type", "Lrosetta/identi/agreements/AgreementType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/identi/agreements/AgreementType;Lokio/ByteString;)V", "getAgreement_type", "()Lrosetta/identi/agreements/AgreementType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetAgreementTypeResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAgreementTypeResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rosetta.identi.agreements.AgreementType#ADAPTER", jsonName = "agreementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AgreementType agreement_type;

    /* JADX WARN: Multi-variable type inference failed */
    public GetAgreementTypeResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20334newBuilder();
    }

    public final AgreementType getAgreement_type() {
        return this.agreement_type;
    }

    public /* synthetic */ GetAgreementTypeResponse(AgreementType agreementType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AgreementType.AGREEMENT_TYPE_UNSPECIFIED : agreementType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAgreementTypeResponse(AgreementType agreement_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.agreement_type = agreement_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20334newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAgreementTypeResponse)) {
            return false;
        }
        GetAgreementTypeResponse getAgreementTypeResponse = (GetAgreementTypeResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAgreementTypeResponse.unknownFields()) && this.agreement_type == getAgreementTypeResponse.agreement_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.agreement_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("agreement_type=" + this.agreement_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAgreementTypeResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAgreementTypeResponse copy$default(GetAgreementTypeResponse getAgreementTypeResponse, AgreementType agreementType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            agreementType = getAgreementTypeResponse.agreement_type;
        }
        if ((i & 2) != 0) {
            byteString = getAgreementTypeResponse.unknownFields();
        }
        return getAgreementTypeResponse.copy(agreementType, byteString);
    }

    public final GetAgreementTypeResponse copy(AgreementType agreement_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAgreementTypeResponse(agreement_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAgreementTypeResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAgreementTypeResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetAgreementTypeResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAgreementTypeResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getAgreement_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED ? size + AgreementType.ADAPTER.encodedSizeWithTag(1, value.getAgreement_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAgreementTypeResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAgreement_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    AgreementType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAgreement_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAgreementTypeResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAgreement_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    AgreementType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAgreement_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAgreementTypeResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AgreementType agreementTypeDecode = AgreementType.AGREEMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAgreementTypeResponse(agreementTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            agreementTypeDecode = AgreementType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAgreementTypeResponse redact(GetAgreementTypeResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAgreementTypeResponse.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
