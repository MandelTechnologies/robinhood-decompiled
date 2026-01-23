package gold_flow.proto.p466v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import gold_flow.proto.p466v1.FullAgreementCardDto;
import gold_flow.proto.p466v1.FullAgreementDto;
import gold_flow.proto.p466v1.GoldPaymentInstrumentDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rosetta.identi.agreements.AgreementType;
import rosetta.identi.agreements.AgreementTypeDto;

/* compiled from: FullAgreementDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008f\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0006\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,¨\u00061"}, m3636d2 = {"Lgold_flow/proto/v1/FullAgreementDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/FullAgreement;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/FullAgreementDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/FullAgreementDto$Surrogate;)V", "", "title", "description_markdown", "Lrosetta/identi/agreements/AgreementTypeDto;", "agreement_type", "content", "sha256", "agreement_id", Footer.f10637type, "Lgold_flow/proto/v1/FullAgreementCardDto;", "card", "", "additional_checkboxes", "", "force_dark_mode", "Lgold_flow/proto/v1/GoldPaymentInstrumentDto;", "backup_payment_instrument", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/FullAgreementCardDto;Ljava/util/List;Ljava/lang/Boolean;Lgold_flow/proto/v1/GoldPaymentInstrumentDto;)V", "toProto", "()Lgold_flow/proto/v1/FullAgreement;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/FullAgreementDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class FullAgreementDto implements Dto3<FullAgreement>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FullAgreementDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FullAgreementDto, FullAgreement>> binaryBase64Serializer$delegate;
    private static final FullAgreementDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FullAgreementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FullAgreementDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ FullAgreementDto(String str, String str2, AgreementTypeDto agreementTypeDto, String str3, String str4, String str5, String str6, FullAgreementCardDto fullAgreementCardDto, List list, Boolean bool, GoldPaymentInstrumentDto goldPaymentInstrumentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? AgreementTypeDto.INSTANCE.getZeroValue() : agreementTypeDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : fullAgreementCardDto, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : goldPaymentInstrumentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullAgreementDto(String str, String str2, AgreementTypeDto agreement_type, String str3, String str4, String str5, String str6, FullAgreementCardDto fullAgreementCardDto, List<String> additional_checkboxes, Boolean bool, GoldPaymentInstrumentDto goldPaymentInstrumentDto) {
        this(new Surrogate(str, str2, agreement_type, str3, str4, str5, str6, fullAgreementCardDto, additional_checkboxes, bool, goldPaymentInstrumentDto));
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(additional_checkboxes, "additional_checkboxes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FullAgreement toProto() {
        String title = this.surrogate.getTitle();
        String description_markdown = this.surrogate.getDescription_markdown();
        AgreementType agreementType = (AgreementType) this.surrogate.getAgreement_type().toProto();
        String content = this.surrogate.getContent();
        String sha256 = this.surrogate.getSha256();
        String agreement_id = this.surrogate.getAgreement_id();
        String footer = this.surrogate.getFooter();
        FullAgreementCardDto card = this.surrogate.getCard();
        FullAgreementCard proto = card != null ? card.toProto() : null;
        List<String> additional_checkboxes = this.surrogate.getAdditional_checkboxes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(additional_checkboxes, 10));
        Iterator<T> it = additional_checkboxes.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        Boolean force_dark_mode = this.surrogate.getForce_dark_mode();
        GoldPaymentInstrumentDto backup_payment_instrument = this.surrogate.getBackup_payment_instrument();
        return new FullAgreement(title, description_markdown, agreementType, content, sha256, agreement_id, footer, proto, arrayList, force_dark_mode, backup_payment_instrument != null ? backup_payment_instrument.toProto() : null, null, 2048, null);
    }

    public String toString() {
        return "[FullAgreementDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FullAgreementDto) && Intrinsics.areEqual(((FullAgreementDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FullAgreementDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b/\b\u0083\b\u0018\u0000 L2\u00020\u0001:\u0002MLB\u008d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010$R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010$R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b3\u0010-\u001a\u0004\b1\u00102R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b7\u0010-\u001a\u0004\b6\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b9\u0010-\u001a\u0004\b8\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b;\u0010-\u001a\u0004\b:\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010<\u0012\u0004\b?\u0010-\u001a\u0004\b=\u0010>R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010@\u0012\u0004\bC\u0010-\u001a\u0004\bA\u0010BR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\bG\u0010-\u001a\u0004\bE\u0010FR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010H\u0012\u0004\bK\u0010-\u001a\u0004\bI\u0010J¨\u0006N"}, m3636d2 = {"Lgold_flow/proto/v1/FullAgreementDto$Surrogate;", "", "", "title", "description_markdown", "Lrosetta/identi/agreements/AgreementTypeDto;", "agreement_type", "content", "sha256", "agreement_id", Footer.f10637type, "Lgold_flow/proto/v1/FullAgreementCardDto;", "card", "", "additional_checkboxes", "", "force_dark_mode", "Lgold_flow/proto/v1/GoldPaymentInstrumentDto;", "backup_payment_instrument", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/FullAgreementCardDto;Ljava/util/List;Ljava/lang/Boolean;Lgold_flow/proto/v1/GoldPaymentInstrumentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/FullAgreementCardDto;Ljava/util/List;Ljava/lang/Boolean;Lgold_flow/proto/v1/GoldPaymentInstrumentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/FullAgreementDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription_markdown", "getDescription_markdown$annotations", "Lrosetta/identi/agreements/AgreementTypeDto;", "getAgreement_type", "()Lrosetta/identi/agreements/AgreementTypeDto;", "getAgreement_type$annotations", "getContent", "getContent$annotations", "getSha256", "getSha256$annotations", "getAgreement_id", "getAgreement_id$annotations", "getFooter", "getFooter$annotations", "Lgold_flow/proto/v1/FullAgreementCardDto;", "getCard", "()Lgold_flow/proto/v1/FullAgreementCardDto;", "getCard$annotations", "Ljava/util/List;", "getAdditional_checkboxes", "()Ljava/util/List;", "getAdditional_checkboxes$annotations", "Ljava/lang/Boolean;", "getForce_dark_mode", "()Ljava/lang/Boolean;", "getForce_dark_mode$annotations", "Lgold_flow/proto/v1/GoldPaymentInstrumentDto;", "getBackup_payment_instrument", "()Lgold_flow/proto/v1/GoldPaymentInstrumentDto;", "getBackup_payment_instrument$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<String> additional_checkboxes;
        private final String agreement_id;
        private final AgreementTypeDto agreement_type;
        private final GoldPaymentInstrumentDto backup_payment_instrument;
        private final FullAgreementCardDto card;
        private final String content;
        private final String description_markdown;
        private final String footer;
        private final Boolean force_dark_mode;
        private final String sha256;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gold_flow.proto.v1.FullAgreementDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FullAgreementDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (String) null, (AgreementTypeDto) null, (String) null, (String) null, (String) null, (String) null, (FullAgreementCardDto) null, (List) null, (Boolean) null, (GoldPaymentInstrumentDto) null, 2047, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description_markdown, surrogate.description_markdown) && this.agreement_type == surrogate.agreement_type && Intrinsics.areEqual(this.content, surrogate.content) && Intrinsics.areEqual(this.sha256, surrogate.sha256) && Intrinsics.areEqual(this.agreement_id, surrogate.agreement_id) && Intrinsics.areEqual(this.footer, surrogate.footer) && Intrinsics.areEqual(this.card, surrogate.card) && Intrinsics.areEqual(this.additional_checkboxes, surrogate.additional_checkboxes) && Intrinsics.areEqual(this.force_dark_mode, surrogate.force_dark_mode) && Intrinsics.areEqual(this.backup_payment_instrument, surrogate.backup_payment_instrument);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description_markdown;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.agreement_type.hashCode()) * 31;
            String str3 = this.content;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sha256;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.agreement_id;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.footer;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            FullAgreementCardDto fullAgreementCardDto = this.card;
            int iHashCode7 = (((iHashCode6 + (fullAgreementCardDto == null ? 0 : fullAgreementCardDto.hashCode())) * 31) + this.additional_checkboxes.hashCode()) * 31;
            Boolean bool = this.force_dark_mode;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            GoldPaymentInstrumentDto goldPaymentInstrumentDto = this.backup_payment_instrument;
            return iHashCode8 + (goldPaymentInstrumentDto != null ? goldPaymentInstrumentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", description_markdown=" + this.description_markdown + ", agreement_type=" + this.agreement_type + ", content=" + this.content + ", sha256=" + this.sha256 + ", agreement_id=" + this.agreement_id + ", footer=" + this.footer + ", card=" + this.card + ", additional_checkboxes=" + this.additional_checkboxes + ", force_dark_mode=" + this.force_dark_mode + ", backup_payment_instrument=" + this.backup_payment_instrument + ")";
        }

        /* compiled from: FullAgreementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/FullAgreementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/FullAgreementDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FullAgreementDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, AgreementTypeDto agreementTypeDto, String str3, String str4, String str5, String str6, FullAgreementCardDto fullAgreementCardDto, List list, Boolean bool, GoldPaymentInstrumentDto goldPaymentInstrumentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.description_markdown = null;
            } else {
                this.description_markdown = str2;
            }
            if ((i & 4) == 0) {
                this.agreement_type = AgreementTypeDto.INSTANCE.getZeroValue();
            } else {
                this.agreement_type = agreementTypeDto;
            }
            if ((i & 8) == 0) {
                this.content = null;
            } else {
                this.content = str3;
            }
            if ((i & 16) == 0) {
                this.sha256 = null;
            } else {
                this.sha256 = str4;
            }
            if ((i & 32) == 0) {
                this.agreement_id = null;
            } else {
                this.agreement_id = str5;
            }
            if ((i & 64) == 0) {
                this.footer = null;
            } else {
                this.footer = str6;
            }
            if ((i & 128) == 0) {
                this.card = null;
            } else {
                this.card = fullAgreementCardDto;
            }
            if ((i & 256) == 0) {
                this.additional_checkboxes = CollectionsKt.emptyList();
            } else {
                this.additional_checkboxes = list;
            }
            if ((i & 512) == 0) {
                this.force_dark_mode = null;
            } else {
                this.force_dark_mode = bool;
            }
            if ((i & 1024) == 0) {
                this.backup_payment_instrument = null;
            } else {
                this.backup_payment_instrument = goldPaymentInstrumentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            String str = self.title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            String str2 = self.description_markdown;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
            }
            if (self.agreement_type != AgreementTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, AgreementTypeDto.Serializer.INSTANCE, self.agreement_type);
            }
            String str3 = self.content;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.sha256;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.agreement_id;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str5);
            }
            String str6 = self.footer;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str6);
            }
            FullAgreementCardDto fullAgreementCardDto = self.card;
            if (fullAgreementCardDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, FullAgreementCardDto.Serializer.INSTANCE, fullAgreementCardDto);
            }
            if (!Intrinsics.areEqual(self.additional_checkboxes, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.additional_checkboxes);
            }
            Boolean bool = self.force_dark_mode;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, BooleanSerializer.INSTANCE, bool);
            }
            GoldPaymentInstrumentDto goldPaymentInstrumentDto = self.backup_payment_instrument;
            if (goldPaymentInstrumentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, GoldPaymentInstrumentDto.Serializer.INSTANCE, goldPaymentInstrumentDto);
            }
        }

        public Surrogate(String str, String str2, AgreementTypeDto agreement_type, String str3, String str4, String str5, String str6, FullAgreementCardDto fullAgreementCardDto, List<String> additional_checkboxes, Boolean bool, GoldPaymentInstrumentDto goldPaymentInstrumentDto) {
            Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
            Intrinsics.checkNotNullParameter(additional_checkboxes, "additional_checkboxes");
            this.title = str;
            this.description_markdown = str2;
            this.agreement_type = agreement_type;
            this.content = str3;
            this.sha256 = str4;
            this.agreement_id = str5;
            this.footer = str6;
            this.card = fullAgreementCardDto;
            this.additional_checkboxes = additional_checkboxes;
            this.force_dark_mode = bool;
            this.backup_payment_instrument = goldPaymentInstrumentDto;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription_markdown() {
            return this.description_markdown;
        }

        public final AgreementTypeDto getAgreement_type() {
            return this.agreement_type;
        }

        public /* synthetic */ Surrogate(String str, String str2, AgreementTypeDto agreementTypeDto, String str3, String str4, String str5, String str6, FullAgreementCardDto fullAgreementCardDto, List list, Boolean bool, GoldPaymentInstrumentDto goldPaymentInstrumentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? AgreementTypeDto.INSTANCE.getZeroValue() : agreementTypeDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : fullAgreementCardDto, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : goldPaymentInstrumentDto);
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

        public final FullAgreementCardDto getCard() {
            return this.card;
        }

        public final List<String> getAdditional_checkboxes() {
            return this.additional_checkboxes;
        }

        public final Boolean getForce_dark_mode() {
            return this.force_dark_mode;
        }

        public final GoldPaymentInstrumentDto getBackup_payment_instrument() {
            return this.backup_payment_instrument;
        }
    }

    /* compiled from: FullAgreementDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/FullAgreementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/FullAgreementDto;", "Lgold_flow/proto/v1/FullAgreement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/FullAgreementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FullAgreementDto, FullAgreement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FullAgreementDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FullAgreementDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FullAgreementDto> getBinaryBase64Serializer() {
            return (KSerializer) FullAgreementDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FullAgreement> getProtoAdapter() {
            return FullAgreement.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FullAgreementDto getZeroValue() {
            return FullAgreementDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FullAgreementDto fromProto(FullAgreement proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String description_markdown = proto.getDescription_markdown();
            AgreementTypeDto agreementTypeDtoFromProto = AgreementTypeDto.INSTANCE.fromProto(proto.getAgreement_type());
            String content = proto.getContent();
            String sha256 = proto.getSha256();
            String agreement_id = proto.getAgreement_id();
            String footer = proto.getFooter();
            FullAgreementCard card = proto.getCard();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FullAgreementCardDto fullAgreementCardDtoFromProto = card != null ? FullAgreementCardDto.INSTANCE.fromProto(card) : null;
            List<String> additional_checkboxes = proto.getAdditional_checkboxes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(additional_checkboxes, 10));
            Iterator<T> it = additional_checkboxes.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            Boolean force_dark_mode = proto.getForce_dark_mode();
            GoldPaymentInstrument backup_payment_instrument = proto.getBackup_payment_instrument();
            return new FullAgreementDto(new Surrogate(title, description_markdown, agreementTypeDtoFromProto, content, sha256, agreement_id, footer, fullAgreementCardDtoFromProto, arrayList, force_dark_mode, backup_payment_instrument != null ? GoldPaymentInstrumentDto.INSTANCE.fromProto(backup_payment_instrument) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.FullAgreementDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FullAgreementDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new FullAgreementDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FullAgreementDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/FullAgreementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/FullAgreementDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/FullAgreementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<FullAgreementDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.FullAgreement", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FullAgreementDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FullAgreementDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FullAgreementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FullAgreementDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/FullAgreementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.FullAgreementDto";
        }
    }
}
