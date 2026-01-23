package gold_flow.proto.p466v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
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

/* compiled from: FullAgreement.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010*\u001a\u00020\u0002H\u0017J\u0013\u0010+\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0004H\u0016J\u009b\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u00102R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u00064"}, m3636d2 = {"Lgold_flow/proto/v1/FullAgreement;", "Lcom/squareup/wire/Message;", "", "title", "", "description_markdown", "agreement_type", "Lrosetta/identi/agreements/AgreementType;", "content", "sha256", "agreement_id", Footer.f10637type, "card", "Lgold_flow/proto/v1/FullAgreementCard;", "additional_checkboxes", "", "force_dark_mode", "", "backup_payment_instrument", "Lgold_flow/proto/v1/GoldPaymentInstrument;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/FullAgreementCard;Ljava/util/List;Ljava/lang/Boolean;Lgold_flow/proto/v1/GoldPaymentInstrument;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription_markdown", "getAgreement_type", "()Lrosetta/identi/agreements/AgreementType;", "getContent", "getSha256", "getAgreement_id", "getFooter", "getCard", "()Lgold_flow/proto/v1/FullAgreementCard;", "getForce_dark_mode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackup_payment_instrument", "()Lgold_flow/proto/v1/GoldPaymentInstrument;", "getAdditional_checkboxes", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/FullAgreementCard;Ljava/util/List;Ljava/lang/Boolean;Lgold_flow/proto/v1/GoldPaymentInstrument;Lokio/ByteString;)Lgold_flow/proto/v1/FullAgreement;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FullAgreement extends Message {

    @JvmField
    public static final ProtoAdapter<FullAgreement> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "additionalCheckboxes", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
    private final List<String> additional_checkboxes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementId", schemaIndex = 5, tag = 6)
    private final String agreement_id;

    @WireField(adapter = "rosetta.identi.agreements.AgreementType#ADAPTER", jsonName = "agreementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AgreementType agreement_type;

    @WireField(adapter = "gold_flow.proto.v1.GoldPaymentInstrument#ADAPTER", jsonName = "backupPaymentInstrument", schemaIndex = 10, tag = 11)
    private final GoldPaymentInstrument backup_payment_instrument;

    @WireField(adapter = "gold_flow.proto.v1.FullAgreementCard#ADAPTER", schemaIndex = 7, tag = 8)
    private final FullAgreementCard card;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionMarkdown", schemaIndex = 1, tag = 2)
    private final String description_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String footer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "forceDarkMode", schemaIndex = 9, tag = 10)
    private final Boolean force_dark_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String sha256;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String title;

    public FullAgreement() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28150newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription_markdown() {
        return this.description_markdown;
    }

    public final AgreementType getAgreement_type() {
        return this.agreement_type;
    }

    public /* synthetic */ FullAgreement(String str, String str2, AgreementType agreementType, String str3, String str4, String str5, String str6, FullAgreementCard fullAgreementCard, List list, Boolean bool, GoldPaymentInstrument goldPaymentInstrument, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? AgreementType.AGREEMENT_TYPE_UNSPECIFIED : agreementType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : fullAgreementCard, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : goldPaymentInstrument, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final String getAgreement_id() {
        return this.agreement_id;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final FullAgreementCard getCard() {
        return this.card;
    }

    public final Boolean getForce_dark_mode() {
        return this.force_dark_mode;
    }

    public final GoldPaymentInstrument getBackup_payment_instrument() {
        return this.backup_payment_instrument;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullAgreement(String str, String str2, AgreementType agreement_type, String str3, String str4, String str5, String str6, FullAgreementCard fullAgreementCard, List<String> additional_checkboxes, Boolean bool, GoldPaymentInstrument goldPaymentInstrument, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(additional_checkboxes, "additional_checkboxes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.description_markdown = str2;
        this.agreement_type = agreement_type;
        this.content = str3;
        this.sha256 = str4;
        this.agreement_id = str5;
        this.footer = str6;
        this.card = fullAgreementCard;
        this.force_dark_mode = bool;
        this.backup_payment_instrument = goldPaymentInstrument;
        this.additional_checkboxes = Internal.immutableCopyOf("additional_checkboxes", additional_checkboxes);
    }

    public final List<String> getAdditional_checkboxes() {
        return this.additional_checkboxes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28150newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FullAgreement)) {
            return false;
        }
        FullAgreement fullAgreement = (FullAgreement) other;
        return Intrinsics.areEqual(unknownFields(), fullAgreement.unknownFields()) && Intrinsics.areEqual(this.title, fullAgreement.title) && Intrinsics.areEqual(this.description_markdown, fullAgreement.description_markdown) && this.agreement_type == fullAgreement.agreement_type && Intrinsics.areEqual(this.content, fullAgreement.content) && Intrinsics.areEqual(this.sha256, fullAgreement.sha256) && Intrinsics.areEqual(this.agreement_id, fullAgreement.agreement_id) && Intrinsics.areEqual(this.footer, fullAgreement.footer) && Intrinsics.areEqual(this.card, fullAgreement.card) && Intrinsics.areEqual(this.additional_checkboxes, fullAgreement.additional_checkboxes) && Intrinsics.areEqual(this.force_dark_mode, fullAgreement.force_dark_mode) && Intrinsics.areEqual(this.backup_payment_instrument, fullAgreement.backup_payment_instrument);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description_markdown;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.agreement_type.hashCode()) * 37;
        String str3 = this.content;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.sha256;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.agreement_id;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.footer;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        FullAgreementCard fullAgreementCard = this.card;
        int iHashCode8 = (((iHashCode7 + (fullAgreementCard != null ? fullAgreementCard.hashCode() : 0)) * 37) + this.additional_checkboxes.hashCode()) * 37;
        Boolean bool = this.force_dark_mode;
        int iHashCode9 = (iHashCode8 + (bool != null ? bool.hashCode() : 0)) * 37;
        GoldPaymentInstrument goldPaymentInstrument = this.backup_payment_instrument;
        int iHashCode10 = iHashCode9 + (goldPaymentInstrument != null ? goldPaymentInstrument.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        String str2 = this.description_markdown;
        if (str2 != null) {
            arrayList.add("description_markdown=" + Internal.sanitize(str2));
        }
        arrayList.add("agreement_type=" + this.agreement_type);
        String str3 = this.content;
        if (str3 != null) {
            arrayList.add("content=" + Internal.sanitize(str3));
        }
        String str4 = this.sha256;
        if (str4 != null) {
            arrayList.add("sha256=" + Internal.sanitize(str4));
        }
        String str5 = this.agreement_id;
        if (str5 != null) {
            arrayList.add("agreement_id=" + Internal.sanitize(str5));
        }
        String str6 = this.footer;
        if (str6 != null) {
            arrayList.add("footer=" + Internal.sanitize(str6));
        }
        FullAgreementCard fullAgreementCard = this.card;
        if (fullAgreementCard != null) {
            arrayList.add("card=" + fullAgreementCard);
        }
        if (!this.additional_checkboxes.isEmpty()) {
            arrayList.add("additional_checkboxes=" + Internal.sanitize(this.additional_checkboxes));
        }
        Boolean bool = this.force_dark_mode;
        if (bool != null) {
            arrayList.add("force_dark_mode=" + bool);
        }
        GoldPaymentInstrument goldPaymentInstrument = this.backup_payment_instrument;
        if (goldPaymentInstrument != null) {
            arrayList.add("backup_payment_instrument=" + goldPaymentInstrument);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FullAgreement{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FullAgreement copy$default(FullAgreement fullAgreement, String str, String str2, AgreementType agreementType, String str3, String str4, String str5, String str6, FullAgreementCard fullAgreementCard, List list, Boolean bool, GoldPaymentInstrument goldPaymentInstrument, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fullAgreement.title;
        }
        if ((i & 2) != 0) {
            str2 = fullAgreement.description_markdown;
        }
        if ((i & 4) != 0) {
            agreementType = fullAgreement.agreement_type;
        }
        if ((i & 8) != 0) {
            str3 = fullAgreement.content;
        }
        if ((i & 16) != 0) {
            str4 = fullAgreement.sha256;
        }
        if ((i & 32) != 0) {
            str5 = fullAgreement.agreement_id;
        }
        if ((i & 64) != 0) {
            str6 = fullAgreement.footer;
        }
        if ((i & 128) != 0) {
            fullAgreementCard = fullAgreement.card;
        }
        if ((i & 256) != 0) {
            list = fullAgreement.additional_checkboxes;
        }
        if ((i & 512) != 0) {
            bool = fullAgreement.force_dark_mode;
        }
        if ((i & 1024) != 0) {
            goldPaymentInstrument = fullAgreement.backup_payment_instrument;
        }
        if ((i & 2048) != 0) {
            byteString = fullAgreement.unknownFields();
        }
        GoldPaymentInstrument goldPaymentInstrument2 = goldPaymentInstrument;
        ByteString byteString2 = byteString;
        List list2 = list;
        Boolean bool2 = bool;
        String str7 = str6;
        FullAgreementCard fullAgreementCard2 = fullAgreementCard;
        String str8 = str4;
        String str9 = str5;
        return fullAgreement.copy(str, str2, agreementType, str3, str8, str9, str7, fullAgreementCard2, list2, bool2, goldPaymentInstrument2, byteString2);
    }

    public final FullAgreement copy(String title, String description_markdown, AgreementType agreement_type, String content, String sha256, String agreement_id, String footer, FullAgreementCard card, List<String> additional_checkboxes, Boolean force_dark_mode, GoldPaymentInstrument backup_payment_instrument, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(additional_checkboxes, "additional_checkboxes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FullAgreement(title, description_markdown, agreement_type, content, sha256, agreement_id, footer, card, additional_checkboxes, force_dark_mode, backup_payment_instrument, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FullAgreement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FullAgreement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.FullAgreement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FullAgreement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getTitle()) + protoAdapter.encodedSizeWithTag(2, value.getDescription_markdown());
                if (value.getAgreement_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += AgreementType.ADAPTER.encodedSizeWithTag(3, value.getAgreement_type());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getContent()) + protoAdapter.encodedSizeWithTag(5, value.getSha256()) + protoAdapter.encodedSizeWithTag(6, value.getAgreement_id()) + protoAdapter.encodedSizeWithTag(7, value.getFooter()) + FullAgreementCard.ADAPTER.encodedSizeWithTag(8, value.getCard()) + protoAdapter.asRepeated().encodedSizeWithTag(9, value.getAdditional_checkboxes()) + ProtoAdapter.BOOL.encodedSizeWithTag(10, value.getForce_dark_mode()) + GoldPaymentInstrument.ADAPTER.encodedSizeWithTag(11, value.getBackup_payment_instrument());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FullAgreement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                if (value.getAgreement_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    AgreementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAgreement_type());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getContent());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSha256());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getAgreement_id());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getFooter());
                FullAgreementCard.ADAPTER.encodeWithTag(writer, 8, (int) value.getCard());
                protoAdapter.asRepeated().encodeWithTag(writer, 9, (int) value.getAdditional_checkboxes());
                ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) value.getForce_dark_mode());
                GoldPaymentInstrument.ADAPTER.encodeWithTag(writer, 11, (int) value.getBackup_payment_instrument());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FullAgreement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GoldPaymentInstrument.ADAPTER.encodeWithTag(writer, 11, (int) value.getBackup_payment_instrument());
                ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) value.getForce_dark_mode());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 9, (int) value.getAdditional_checkboxes());
                FullAgreementCard.ADAPTER.encodeWithTag(writer, 8, (int) value.getCard());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getFooter());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getAgreement_id());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSha256());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getContent());
                if (value.getAgreement_type() != AgreementType.AGREEMENT_TYPE_UNSPECIFIED) {
                    AgreementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAgreement_type());
                }
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription_markdown());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0024. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public gold_flow.proto.p466v1.FullAgreement decode(com.squareup.wire.ProtoReader r20) {
                /*
                    Method dump skipped, instructions count: 252
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: gold_flow.proto.p466v1.FullAgreement2.decode(com.squareup.wire.ProtoReader):gold_flow.proto.v1.FullAgreement");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FullAgreement redact(FullAgreement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FullAgreementCard card = value.getCard();
                FullAgreementCard fullAgreementCardRedact = card != null ? FullAgreementCard.ADAPTER.redact(card) : null;
                GoldPaymentInstrument backup_payment_instrument = value.getBackup_payment_instrument();
                return FullAgreement.copy$default(value, null, null, null, null, null, null, null, fullAgreementCardRedact, null, null, backup_payment_instrument != null ? GoldPaymentInstrument.ADAPTER.redact(backup_payment_instrument) : null, ByteString.EMPTY, 895, null);
            }
        };
    }
}
