package midas.service.p509v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsDuxo;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import midas.service.p509v1.AgreementDto;
import midas.service.p509v1.GoldSweepAgreementsDto;

/* compiled from: GoldPlanSelectionOptionDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006+"}, m3636d2 = {"Lmidas/service/v1/GoldPlanSelectionOptionDto;", "Lcom/robinhood/idl/MessageDto;", "Lmidas/service/v1/GoldPlanSelectionOption;", "Landroid/os/Parcelable;", "Lmidas/service/v1/GoldPlanSelectionOptionDto$Surrogate;", "surrogate", "<init>", "(Lmidas/service/v1/GoldPlanSelectionOptionDto$Surrogate;)V", "", "title", "plan_id", "badge", "description", "Lmidas/service/v1/AgreementDto;", FinalTermsDuxo.GOLD_AGREEMENT_NAME, "Lmidas/service/v1/GoldSweepAgreementsDto;", "gold_sweep_agreements", "select_text", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/AgreementDto;Lmidas/service/v1/GoldSweepAgreementsDto;Ljava/lang/String;)V", "toProto", "()Lmidas/service/v1/GoldPlanSelectionOption;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmidas/service/v1/GoldPlanSelectionOptionDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GoldPlanSelectionOptionDto implements Dto3<GoldPlanSelectionOption>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GoldPlanSelectionOptionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GoldPlanSelectionOptionDto, GoldPlanSelectionOption>> binaryBase64Serializer$delegate;
    private static final GoldPlanSelectionOptionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GoldPlanSelectionOptionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GoldPlanSelectionOptionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ GoldPlanSelectionOptionDto(String str, String str2, String str3, String str4, AgreementDto agreementDto, GoldSweepAgreementsDto goldSweepAgreementsDto, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : agreementDto, (i & 32) != 0 ? null : goldSweepAgreementsDto, (i & 64) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoldPlanSelectionOptionDto(String title, String plan_id, String str, String description, AgreementDto agreementDto, GoldSweepAgreementsDto goldSweepAgreementsDto, String str2) {
        this(new Surrogate(title, plan_id, str, description, agreementDto, goldSweepAgreementsDto, str2));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(plan_id, "plan_id");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    @Override // com.robinhood.idl.Dto
    public GoldPlanSelectionOption toProto() {
        String title = this.surrogate.getTitle();
        String plan_id = this.surrogate.getPlan_id();
        String badge = this.surrogate.getBadge();
        String description = this.surrogate.getDescription();
        AgreementDto gold_agreement = this.surrogate.getGold_agreement();
        Agreement proto = gold_agreement != null ? gold_agreement.toProto() : null;
        GoldSweepAgreementsDto gold_sweep_agreements = this.surrogate.getGold_sweep_agreements();
        return new GoldPlanSelectionOption(title, plan_id, badge, description, proto, gold_sweep_agreements != null ? gold_sweep_agreements.toProto() : null, this.surrogate.getSelect_text(), null, 128, null);
    }

    public String toString() {
        return "[GoldPlanSelectionOptionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GoldPlanSelectionOptionDto) && Intrinsics.areEqual(((GoldPlanSelectionOptionDto) other).surrogate, this.surrogate);
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
    /* compiled from: GoldPlanSelectionOptionDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u001dR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b1\u0010'\u001a\u0004\b/\u00100R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b5\u0010'\u001a\u0004\b3\u00104R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010$\u0012\u0004\b7\u0010'\u001a\u0004\b6\u0010\u001d¨\u0006:"}, m3636d2 = {"Lmidas/service/v1/GoldPlanSelectionOptionDto$Surrogate;", "", "", "title", "plan_id", "badge", "description", "Lmidas/service/v1/AgreementDto;", FinalTermsDuxo.GOLD_AGREEMENT_NAME, "Lmidas/service/v1/GoldSweepAgreementsDto;", "gold_sweep_agreements", "select_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/AgreementDto;Lmidas/service/v1/GoldSweepAgreementsDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/AgreementDto;Lmidas/service/v1/GoldSweepAgreementsDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$midas_service_v1_externalRelease", "(Lmidas/service/v1/GoldPlanSelectionOptionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getPlan_id", "getPlan_id$annotations", "getBadge", "getBadge$annotations", "getDescription", "getDescription$annotations", "Lmidas/service/v1/AgreementDto;", "getGold_agreement", "()Lmidas/service/v1/AgreementDto;", "getGold_agreement$annotations", "Lmidas/service/v1/GoldSweepAgreementsDto;", "getGold_sweep_agreements", "()Lmidas/service/v1/GoldSweepAgreementsDto;", "getGold_sweep_agreements$annotations", "getSelect_text", "getSelect_text$annotations", "Companion", "$serializer", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String badge;
        private final String description;
        private final AgreementDto gold_agreement;
        private final GoldSweepAgreementsDto gold_sweep_agreements;
        private final String plan_id;
        private final String select_text;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (AgreementDto) null, (GoldSweepAgreementsDto) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.plan_id, surrogate.plan_id) && Intrinsics.areEqual(this.badge, surrogate.badge) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.gold_agreement, surrogate.gold_agreement) && Intrinsics.areEqual(this.gold_sweep_agreements, surrogate.gold_sweep_agreements) && Intrinsics.areEqual(this.select_text, surrogate.select_text);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.plan_id.hashCode()) * 31;
            String str = this.badge;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.description.hashCode()) * 31;
            AgreementDto agreementDto = this.gold_agreement;
            int iHashCode3 = (iHashCode2 + (agreementDto == null ? 0 : agreementDto.hashCode())) * 31;
            GoldSweepAgreementsDto goldSweepAgreementsDto = this.gold_sweep_agreements;
            int iHashCode4 = (iHashCode3 + (goldSweepAgreementsDto == null ? 0 : goldSweepAgreementsDto.hashCode())) * 31;
            String str2 = this.select_text;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", plan_id=" + this.plan_id + ", badge=" + this.badge + ", description=" + this.description + ", gold_agreement=" + this.gold_agreement + ", gold_sweep_agreements=" + this.gold_sweep_agreements + ", select_text=" + this.select_text + ")";
        }

        /* compiled from: GoldPlanSelectionOptionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmidas/service/v1/GoldPlanSelectionOptionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmidas/service/v1/GoldPlanSelectionOptionDto$Surrogate;", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GoldPlanSelectionOptionDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, AgreementDto agreementDto, GoldSweepAgreementsDto goldSweepAgreementsDto, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.plan_id = "";
            } else {
                this.plan_id = str2;
            }
            if ((i & 4) == 0) {
                this.badge = null;
            } else {
                this.badge = str3;
            }
            if ((i & 8) == 0) {
                this.description = "";
            } else {
                this.description = str4;
            }
            if ((i & 16) == 0) {
                this.gold_agreement = null;
            } else {
                this.gold_agreement = agreementDto;
            }
            if ((i & 32) == 0) {
                this.gold_sweep_agreements = null;
            } else {
                this.gold_sweep_agreements = goldSweepAgreementsDto;
            }
            if ((i & 64) == 0) {
                this.select_text = null;
            } else {
                this.select_text = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$midas_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.plan_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.plan_id);
            }
            String str = self.badge;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 3, self.description);
            }
            AgreementDto agreementDto = self.gold_agreement;
            if (agreementDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, AgreementDto.Serializer.INSTANCE, agreementDto);
            }
            GoldSweepAgreementsDto goldSweepAgreementsDto = self.gold_sweep_agreements;
            if (goldSweepAgreementsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, GoldSweepAgreementsDto.Serializer.INSTANCE, goldSweepAgreementsDto);
            }
            String str2 = self.select_text;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(String title, String plan_id, String str, String description, AgreementDto agreementDto, GoldSweepAgreementsDto goldSweepAgreementsDto, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(plan_id, "plan_id");
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = title;
            this.plan_id = plan_id;
            this.badge = str;
            this.description = description;
            this.gold_agreement = agreementDto;
            this.gold_sweep_agreements = goldSweepAgreementsDto;
            this.select_text = str2;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, AgreementDto agreementDto, GoldSweepAgreementsDto goldSweepAgreementsDto, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : agreementDto, (i & 32) != 0 ? null : goldSweepAgreementsDto, (i & 64) != 0 ? null : str5);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getPlan_id() {
            return this.plan_id;
        }

        public final String getBadge() {
            return this.badge;
        }

        public final String getDescription() {
            return this.description;
        }

        public final AgreementDto getGold_agreement() {
            return this.gold_agreement;
        }

        public final GoldSweepAgreementsDto getGold_sweep_agreements() {
            return this.gold_sweep_agreements;
        }

        public final String getSelect_text() {
            return this.select_text;
        }
    }

    /* compiled from: GoldPlanSelectionOptionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmidas/service/v1/GoldPlanSelectionOptionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmidas/service/v1/GoldPlanSelectionOptionDto;", "Lmidas/service/v1/GoldPlanSelectionOption;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmidas/service/v1/GoldPlanSelectionOptionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GoldPlanSelectionOptionDto, GoldPlanSelectionOption> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GoldPlanSelectionOptionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GoldPlanSelectionOptionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GoldPlanSelectionOptionDto> getBinaryBase64Serializer() {
            return (KSerializer) GoldPlanSelectionOptionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GoldPlanSelectionOption> getProtoAdapter() {
            return GoldPlanSelectionOption.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GoldPlanSelectionOptionDto getZeroValue() {
            return GoldPlanSelectionOptionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GoldPlanSelectionOptionDto fromProto(GoldPlanSelectionOption proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String plan_id = proto.getPlan_id();
            String badge = proto.getBadge();
            String description = proto.getDescription();
            Agreement gold_agreement = proto.getGold_agreement();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AgreementDto agreementDtoFromProto = gold_agreement != null ? AgreementDto.INSTANCE.fromProto(gold_agreement) : null;
            GoldSweepAgreements gold_sweep_agreements = proto.getGold_sweep_agreements();
            return new GoldPlanSelectionOptionDto(new Surrogate(title, plan_id, badge, description, agreementDtoFromProto, gold_sweep_agreements != null ? GoldSweepAgreementsDto.INSTANCE.fromProto(gold_sweep_agreements) : null, proto.getSelect_text()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: midas.service.v1.GoldPlanSelectionOptionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoldPlanSelectionOptionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GoldPlanSelectionOptionDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GoldPlanSelectionOptionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmidas/service/v1/GoldPlanSelectionOptionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmidas/service/v1/GoldPlanSelectionOptionDto;", "<init>", "()V", "surrogateSerializer", "Lmidas/service/v1/GoldPlanSelectionOptionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GoldPlanSelectionOptionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/midas.service.v1.GoldPlanSelectionOption", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GoldPlanSelectionOptionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GoldPlanSelectionOptionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GoldPlanSelectionOptionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GoldPlanSelectionOptionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmidas/service/v1/GoldPlanSelectionOptionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "midas.service.v1.GoldPlanSelectionOptionDto";
        }
    }
}
