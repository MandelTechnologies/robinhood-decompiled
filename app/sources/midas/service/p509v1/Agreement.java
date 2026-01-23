package midas.service.p509v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
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

/* compiled from: Agreement.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jb\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lmidas/service/v1/Agreement;", "Lcom/squareup/wire/Message;", "", "title", "", "description", "agreement_id", "agreement_type", "Lrosetta/identi/agreements/AgreementType;", Footer.f10637type, "card", "Lmidas/service/v1/GoldAgreementCard;", "additional_checkboxes", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementType;Ljava/lang/String;Lmidas/service/v1/GoldAgreementCard;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getAgreement_id", "getAgreement_type", "()Lrosetta/identi/agreements/AgreementType;", "getFooter", "getCard", "()Lmidas/service/v1/GoldAgreementCard;", "getAdditional_checkboxes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Agreement extends Message {

    @JvmField
    public static final ProtoAdapter<Agreement> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<String> additional_checkboxes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String agreement_id;

    @WireField(adapter = "rosetta.identi.agreements.AgreementType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AgreementType agreement_type;

    @WireField(adapter = "midas.service.v1.GoldAgreementCard#ADAPTER", schemaIndex = 5, tag = 6)
    private final GoldAgreementCard card;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String footer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public Agreement() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ Agreement(String str, String str2, String str3, AgreementType agreementType, String str4, GoldAgreementCard goldAgreementCard, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? AgreementType.AGREEMENT_TYPE_UNSPECIFIED : agreementType, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : goldAgreementCard, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29312newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getAgreement_id() {
        return this.agreement_id;
    }

    public final AgreementType getAgreement_type() {
        return this.agreement_type;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final GoldAgreementCard getCard() {
        return this.card;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Agreement(String title, String str, String agreement_id, AgreementType agreement_type, String str2, GoldAgreementCard goldAgreementCard, List<String> additional_checkboxes, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreement_id, "agreement_id");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(additional_checkboxes, "additional_checkboxes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = str;
        this.agreement_id = agreement_id;
        this.agreement_type = agreement_type;
        this.footer = str2;
        this.card = goldAgreementCard;
        this.additional_checkboxes = Internal.immutableCopyOf("additional_checkboxes", additional_checkboxes);
    }

    public final List<String> getAdditional_checkboxes() {
        return this.additional_checkboxes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29312newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Agreement)) {
            return false;
        }
        Agreement agreement = (Agreement) other;
        return Intrinsics.areEqual(unknownFields(), agreement.unknownFields()) && Intrinsics.areEqual(this.title, agreement.title) && Intrinsics.areEqual(this.description, agreement.description) && Intrinsics.areEqual(this.agreement_id, agreement.agreement_id) && this.agreement_type == agreement.agreement_type && Intrinsics.areEqual(this.footer, agreement.footer) && Intrinsics.areEqual(this.card, agreement.card) && Intrinsics.areEqual(this.additional_checkboxes, agreement.additional_checkboxes);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        String str = this.description;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.agreement_id.hashCode()) * 37) + this.agreement_type.hashCode()) * 37;
        String str2 = this.footer;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        GoldAgreementCard goldAgreementCard = this.card;
        int iHashCode4 = ((iHashCode3 + (goldAgreementCard != null ? goldAgreementCard.hashCode() : 0)) * 37) + this.additional_checkboxes.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        String str = this.description;
        if (str != null) {
            arrayList.add("description=" + Internal.sanitize(str));
        }
        arrayList.add("agreement_id=" + Internal.sanitize(this.agreement_id));
        arrayList.add("agreement_type=" + this.agreement_type);
        String str2 = this.footer;
        if (str2 != null) {
            arrayList.add("footer=" + Internal.sanitize(str2));
        }
        GoldAgreementCard goldAgreementCard = this.card;
        if (goldAgreementCard != null) {
            arrayList.add("card=" + goldAgreementCard);
        }
        if (!this.additional_checkboxes.isEmpty()) {
            arrayList.add("additional_checkboxes=" + Internal.sanitize(this.additional_checkboxes));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Agreement{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Agreement copy$default(Agreement agreement, String str, String str2, String str3, AgreementType agreementType, String str4, GoldAgreementCard goldAgreementCard, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agreement.title;
        }
        if ((i & 2) != 0) {
            str2 = agreement.description;
        }
        if ((i & 4) != 0) {
            str3 = agreement.agreement_id;
        }
        if ((i & 8) != 0) {
            agreementType = agreement.agreement_type;
        }
        if ((i & 16) != 0) {
            str4 = agreement.footer;
        }
        if ((i & 32) != 0) {
            goldAgreementCard = agreement.card;
        }
        if ((i & 64) != 0) {
            list = agreement.additional_checkboxes;
        }
        if ((i & 128) != 0) {
            byteString = agreement.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        String str5 = str4;
        GoldAgreementCard goldAgreementCard2 = goldAgreementCard;
        return agreement.copy(str, str2, str3, agreementType, str5, goldAgreementCard2, list2, byteString2);
    }

    public final Agreement copy(String title, String description, String agreement_id, AgreementType agreement_type, String footer, GoldAgreementCard card, List<String> additional_checkboxes, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreement_id, "agreement_id");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(additional_checkboxes, "additional_checkboxes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Agreement(title, description, agreement_id, agreement_type, footer, card, additional_checkboxes, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Agreement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Agreement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: midas.service.v1.Agreement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Agreement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getDescription());
                if (!Intrinsics.areEqual(value.getAgreement_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getAgreement_id());
                }
                if (value.getAgreement_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += AgreementType.ADAPTER.encodedSizeWithTag(4, value.getAgreement_type());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getFooter()) + GoldAgreementCard.ADAPTER.encodedSizeWithTag(6, value.getCard()) + protoAdapter.asRepeated().encodedSizeWithTag(7, value.getAdditional_checkboxes());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Agreement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription());
                if (!Intrinsics.areEqual(value.getAgreement_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAgreement_id());
                }
                if (value.getAgreement_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    AgreementType.ADAPTER.encodeWithTag(writer, 4, (int) value.getAgreement_type());
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getFooter());
                GoldAgreementCard.ADAPTER.encodeWithTag(writer, 6, (int) value.getCard());
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getAdditional_checkboxes());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Agreement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getAdditional_checkboxes());
                GoldAgreementCard.ADAPTER.encodeWithTag(writer, 6, (int) value.getCard());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getFooter());
                if (value.getAgreement_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    AgreementType.ADAPTER.encodeWithTag(writer, 4, (int) value.getAgreement_type());
                }
                if (!Intrinsics.areEqual(value.getAgreement_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAgreement_id());
                }
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Agreement decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AgreementType agreementType = AgreementType.AGREEMENT_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = null;
                GoldAgreementCard goldAgreementCardDecode = null;
                AgreementType agreementTypeDecode = agreementType;
                String strDecode4 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                try {
                                    agreementTypeDecode = AgreementType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                goldAgreementCardDecode = GoldAgreementCard.ADAPTER.decode(reader);
                                break;
                            case 7:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Agreement(strDecode4, strDecode2, strDecode, agreementTypeDecode, strDecode3, goldAgreementCardDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Agreement redact(Agreement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GoldAgreementCard card = value.getCard();
                return Agreement.copy$default(value, null, null, null, null, null, card != null ? GoldAgreementCard.ADAPTER.redact(card) : null, null, ByteString.EMPTY, 95, null);
            }
        };
    }
}
