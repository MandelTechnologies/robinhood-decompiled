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
import java.util.List;
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

/* compiled from: MarkAttestationsSignedRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "signed_attestations", "", "Lrosetta/identi/agreements/AgreementType;", "signed_attestations_as_strings", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getSigned_attestations", "()Ljava/util/List;", "getSigned_attestations_as_strings", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class MarkAttestationsSignedRequest extends Message {

    @JvmField
    public static final ProtoAdapter<MarkAttestationsSignedRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "rosetta.identi.agreements.AgreementType#ADAPTER", jsonName = "signedAttestations", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<AgreementType> signed_attestations;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "signedAttestationsAsStrings", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> signed_attestations_as_strings;

    public MarkAttestationsSignedRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20391newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ MarkAttestationsSignedRequest(String str, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkAttestationsSignedRequest(String account_id, List<? extends AgreementType> signed_attestations, List<String> signed_attestations_as_strings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(signed_attestations, "signed_attestations");
        Intrinsics.checkNotNullParameter(signed_attestations_as_strings, "signed_attestations_as_strings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.signed_attestations = Internal.immutableCopyOf("signed_attestations", signed_attestations);
        this.signed_attestations_as_strings = Internal.immutableCopyOf("signed_attestations_as_strings", signed_attestations_as_strings);
    }

    public final List<AgreementType> getSigned_attestations() {
        return this.signed_attestations;
    }

    public final List<String> getSigned_attestations_as_strings() {
        return this.signed_attestations_as_strings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20391newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarkAttestationsSignedRequest)) {
            return false;
        }
        MarkAttestationsSignedRequest markAttestationsSignedRequest = (MarkAttestationsSignedRequest) other;
        return Intrinsics.areEqual(unknownFields(), markAttestationsSignedRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, markAttestationsSignedRequest.account_id) && Intrinsics.areEqual(this.signed_attestations, markAttestationsSignedRequest.signed_attestations) && Intrinsics.areEqual(this.signed_attestations_as_strings, markAttestationsSignedRequest.signed_attestations_as_strings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.signed_attestations.hashCode()) * 37) + this.signed_attestations_as_strings.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.signed_attestations.isEmpty()) {
            arrayList.add("signed_attestations=" + this.signed_attestations);
        }
        if (!this.signed_attestations_as_strings.isEmpty()) {
            arrayList.add("signed_attestations_as_strings=" + Internal.sanitize(this.signed_attestations_as_strings));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarkAttestationsSignedRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarkAttestationsSignedRequest copy$default(MarkAttestationsSignedRequest markAttestationsSignedRequest, String str, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = markAttestationsSignedRequest.account_id;
        }
        if ((i & 2) != 0) {
            list = markAttestationsSignedRequest.signed_attestations;
        }
        if ((i & 4) != 0) {
            list2 = markAttestationsSignedRequest.signed_attestations_as_strings;
        }
        if ((i & 8) != 0) {
            byteString = markAttestationsSignedRequest.unknownFields();
        }
        return markAttestationsSignedRequest.copy(str, list, list2, byteString);
    }

    public final MarkAttestationsSignedRequest copy(String account_id, List<? extends AgreementType> signed_attestations, List<String> signed_attestations_as_strings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(signed_attestations, "signed_attestations");
        Intrinsics.checkNotNullParameter(signed_attestations_as_strings, "signed_attestations_as_strings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarkAttestationsSignedRequest(account_id, signed_attestations, signed_attestations_as_strings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarkAttestationsSignedRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarkAttestationsSignedRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.MarkAttestationsSignedRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarkAttestationsSignedRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                return size + AgreementType.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getSigned_attestations()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, value.getSigned_attestations_as_strings());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarkAttestationsSignedRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                AgreementType.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSigned_attestations());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 3, (int) value.getSigned_attestations_as_strings());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarkAttestationsSignedRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getSigned_attestations_as_strings());
                AgreementType.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSigned_attestations());
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarkAttestationsSignedRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarkAttestationsSignedRequest(strDecode, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            AgreementType.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarkAttestationsSignedRequest redact(MarkAttestationsSignedRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MarkAttestationsSignedRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
