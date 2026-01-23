package midas.service.p509v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import midas.service.p509v1.AgreementDto;
import midas.service.p509v1.GoldAgreementCardDto;
import rosetta.identi.agreements.AgreementType;
import rosetta.identi.agreements.AgreementTypeDto;

/* compiled from: AgreementDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006,"}, m3636d2 = {"Lmidas/service/v1/AgreementDto;", "Lcom/robinhood/idl/MessageDto;", "Lmidas/service/v1/Agreement;", "Landroid/os/Parcelable;", "Lmidas/service/v1/AgreementDto$Surrogate;", "surrogate", "<init>", "(Lmidas/service/v1/AgreementDto$Surrogate;)V", "", "title", "description", "agreement_id", "Lrosetta/identi/agreements/AgreementTypeDto;", "agreement_type", Footer.f10637type, "Lmidas/service/v1/GoldAgreementCardDto;", "card", "", "additional_checkboxes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementTypeDto;Ljava/lang/String;Lmidas/service/v1/GoldAgreementCardDto;Ljava/util/List;)V", "toProto", "()Lmidas/service/v1/Agreement;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmidas/service/v1/AgreementDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class AgreementDto implements Dto3<Agreement>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AgreementDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AgreementDto, Agreement>> binaryBase64Serializer$delegate;
    private static final AgreementDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AgreementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AgreementDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ AgreementDto(String str, String str2, String str3, AgreementTypeDto agreementTypeDto, String str4, GoldAgreementCardDto goldAgreementCardDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? AgreementTypeDto.INSTANCE.getZeroValue() : agreementTypeDto, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : goldAgreementCardDto, (i & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AgreementDto(String title, String str, String agreement_id, AgreementTypeDto agreement_type, String str2, GoldAgreementCardDto goldAgreementCardDto, List<String> additional_checkboxes) {
        this(new Surrogate(title, str, agreement_id, agreement_type, str2, goldAgreementCardDto, additional_checkboxes));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(agreement_id, "agreement_id");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(additional_checkboxes, "additional_checkboxes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Agreement toProto() {
        String title = this.surrogate.getTitle();
        String description = this.surrogate.getDescription();
        String agreement_id = this.surrogate.getAgreement_id();
        AgreementType agreementType = (AgreementType) this.surrogate.getAgreement_type().toProto();
        String footer = this.surrogate.getFooter();
        GoldAgreementCardDto card = this.surrogate.getCard();
        GoldAgreementCard proto = card != null ? card.toProto() : null;
        List<String> additional_checkboxes = this.surrogate.getAdditional_checkboxes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(additional_checkboxes, 10));
        Iterator<T> it = additional_checkboxes.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new Agreement(title, description, agreement_id, agreementType, footer, proto, arrayList, null, 128, null);
    }

    public String toString() {
        return "[AgreementDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AgreementDto) && Intrinsics.areEqual(((AgreementDto) other).surrogate, this.surrogate);
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
    /* compiled from: AgreementDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010%\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b6\u0010(\u001a\u0004\b4\u00105R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010(\u001a\u0004\b8\u00109¨\u0006="}, m3636d2 = {"Lmidas/service/v1/AgreementDto$Surrogate;", "", "", "title", "description", "agreement_id", "Lrosetta/identi/agreements/AgreementTypeDto;", "agreement_type", Footer.f10637type, "Lmidas/service/v1/GoldAgreementCardDto;", "card", "", "additional_checkboxes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementTypeDto;Ljava/lang/String;Lmidas/service/v1/GoldAgreementCardDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/identi/agreements/AgreementTypeDto;Ljava/lang/String;Lmidas/service/v1/GoldAgreementCardDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$midas_service_v1_externalRelease", "(Lmidas/service/v1/AgreementDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "getAgreement_id", "getAgreement_id$annotations", "Lrosetta/identi/agreements/AgreementTypeDto;", "getAgreement_type", "()Lrosetta/identi/agreements/AgreementTypeDto;", "getAgreement_type$annotations", "getFooter", "getFooter$annotations", "Lmidas/service/v1/GoldAgreementCardDto;", "getCard", "()Lmidas/service/v1/GoldAgreementCardDto;", "getCard$annotations", "Ljava/util/List;", "getAdditional_checkboxes", "()Ljava/util/List;", "getAdditional_checkboxes$annotations", "Companion", "$serializer", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<String> additional_checkboxes;
        private final String agreement_id;
        private final AgreementTypeDto agreement_type;
        private final GoldAgreementCardDto card;
        private final String description;
        private final String footer;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: midas.service.v1.AgreementDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgreementDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (AgreementTypeDto) null, (String) null, (GoldAgreementCardDto) null, (List) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
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
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.agreement_id, surrogate.agreement_id) && this.agreement_type == surrogate.agreement_type && Intrinsics.areEqual(this.footer, surrogate.footer) && Intrinsics.areEqual(this.card, surrogate.card) && Intrinsics.areEqual(this.additional_checkboxes, surrogate.additional_checkboxes);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.description;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.agreement_id.hashCode()) * 31) + this.agreement_type.hashCode()) * 31;
            String str2 = this.footer;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            GoldAgreementCardDto goldAgreementCardDto = this.card;
            return ((iHashCode3 + (goldAgreementCardDto != null ? goldAgreementCardDto.hashCode() : 0)) * 31) + this.additional_checkboxes.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", description=" + this.description + ", agreement_id=" + this.agreement_id + ", agreement_type=" + this.agreement_type + ", footer=" + this.footer + ", card=" + this.card + ", additional_checkboxes=" + this.additional_checkboxes + ")";
        }

        /* compiled from: AgreementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmidas/service/v1/AgreementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmidas/service/v1/AgreementDto$Surrogate;", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AgreementDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, AgreementTypeDto agreementTypeDto, String str4, GoldAgreementCardDto goldAgreementCardDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.description = null;
            } else {
                this.description = str2;
            }
            if ((i & 4) == 0) {
                this.agreement_id = "";
            } else {
                this.agreement_id = str3;
            }
            if ((i & 8) == 0) {
                this.agreement_type = AgreementTypeDto.INSTANCE.getZeroValue();
            } else {
                this.agreement_type = agreementTypeDto;
            }
            if ((i & 16) == 0) {
                this.footer = null;
            } else {
                this.footer = str4;
            }
            if ((i & 32) == 0) {
                this.card = null;
            } else {
                this.card = goldAgreementCardDto;
            }
            if ((i & 64) == 0) {
                this.additional_checkboxes = CollectionsKt.emptyList();
            } else {
                this.additional_checkboxes = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$midas_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            String str = self.description;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.agreement_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.agreement_id);
            }
            if (self.agreement_type != AgreementTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, AgreementTypeDto.Serializer.INSTANCE, self.agreement_type);
            }
            String str2 = self.footer;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str2);
            }
            GoldAgreementCardDto goldAgreementCardDto = self.card;
            if (goldAgreementCardDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, GoldAgreementCardDto.Serializer.INSTANCE, goldAgreementCardDto);
            }
            if (Intrinsics.areEqual(self.additional_checkboxes, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.additional_checkboxes);
        }

        public Surrogate(String title, String str, String agreement_id, AgreementTypeDto agreement_type, String str2, GoldAgreementCardDto goldAgreementCardDto, List<String> additional_checkboxes) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(agreement_id, "agreement_id");
            Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
            Intrinsics.checkNotNullParameter(additional_checkboxes, "additional_checkboxes");
            this.title = title;
            this.description = str;
            this.agreement_id = agreement_id;
            this.agreement_type = agreement_type;
            this.footer = str2;
            this.card = goldAgreementCardDto;
            this.additional_checkboxes = additional_checkboxes;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, AgreementTypeDto agreementTypeDto, String str4, GoldAgreementCardDto goldAgreementCardDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? AgreementTypeDto.INSTANCE.getZeroValue() : agreementTypeDto, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : goldAgreementCardDto, (i & 64) != 0 ? CollectionsKt.emptyList() : list);
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

        public final AgreementTypeDto getAgreement_type() {
            return this.agreement_type;
        }

        public final String getFooter() {
            return this.footer;
        }

        public final GoldAgreementCardDto getCard() {
            return this.card;
        }

        public final List<String> getAdditional_checkboxes() {
            return this.additional_checkboxes;
        }
    }

    /* compiled from: AgreementDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmidas/service/v1/AgreementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmidas/service/v1/AgreementDto;", "Lmidas/service/v1/Agreement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmidas/service/v1/AgreementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AgreementDto, Agreement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AgreementDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AgreementDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AgreementDto> getBinaryBase64Serializer() {
            return (KSerializer) AgreementDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Agreement> getProtoAdapter() {
            return Agreement.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AgreementDto getZeroValue() {
            return AgreementDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AgreementDto fromProto(Agreement proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String description = proto.getDescription();
            String agreement_id = proto.getAgreement_id();
            AgreementTypeDto agreementTypeDtoFromProto = AgreementTypeDto.INSTANCE.fromProto(proto.getAgreement_type());
            String footer = proto.getFooter();
            GoldAgreementCard card = proto.getCard();
            DefaultConstructorMarker defaultConstructorMarker = null;
            GoldAgreementCardDto goldAgreementCardDtoFromProto = card != null ? GoldAgreementCardDto.INSTANCE.fromProto(card) : null;
            List<String> additional_checkboxes = proto.getAdditional_checkboxes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(additional_checkboxes, 10));
            Iterator<T> it = additional_checkboxes.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new AgreementDto(new Surrogate(title, description, agreement_id, agreementTypeDtoFromProto, footer, goldAgreementCardDtoFromProto, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: midas.service.v1.AgreementDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgreementDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new AgreementDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AgreementDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmidas/service/v1/AgreementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmidas/service/v1/AgreementDto;", "<init>", "()V", "surrogateSerializer", "Lmidas/service/v1/AgreementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<AgreementDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/midas.service.v1.Agreement", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AgreementDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AgreementDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AgreementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AgreementDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmidas/service/v1/AgreementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "midas.service.v1.AgreementDto";
        }
    }
}
