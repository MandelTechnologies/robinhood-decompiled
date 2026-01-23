package bonfire.proto.idl.advisor_marketplace.p029v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardCardDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardCtaDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
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

/* compiled from: AdvisorDashboardStateFirstBookingDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b+\u0010*¨\u00060"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBooking;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$Surrogate;)V", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCardDto;", "card", "", "title", "description", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCardDto;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;)V", "toProto", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBooking;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$Surrogate;", "getCard", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCardDto;", "getTitle", "getDescription", "getPrimary_cta", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;", "getSecondary_cta", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class AdvisorDashboardStateFirstBookingDto implements Dto3<AdvisorDashboardStateFirstBooking>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisorDashboardStateFirstBookingDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisorDashboardStateFirstBookingDto, AdvisorDashboardStateFirstBooking>> binaryBase64Serializer$delegate;
    private static final AdvisorDashboardStateFirstBookingDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisorDashboardStateFirstBookingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisorDashboardStateFirstBookingDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AdvisorDashboardCardDto getCard() {
        return this.surrogate.getCard();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final AdvisorDashboardCtaDto getPrimary_cta() {
        return this.surrogate.getPrimary_cta();
    }

    public final AdvisorDashboardCtaDto getSecondary_cta() {
        return this.surrogate.getSecondary_cta();
    }

    public /* synthetic */ AdvisorDashboardStateFirstBookingDto(AdvisorDashboardCardDto advisorDashboardCardDto, String str, String str2, AdvisorDashboardCtaDto advisorDashboardCtaDto, AdvisorDashboardCtaDto advisorDashboardCtaDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advisorDashboardCardDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : advisorDashboardCtaDto, (i & 16) != 0 ? null : advisorDashboardCtaDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisorDashboardStateFirstBookingDto(AdvisorDashboardCardDto advisorDashboardCardDto, String title, String description, AdvisorDashboardCtaDto advisorDashboardCtaDto, AdvisorDashboardCtaDto advisorDashboardCtaDto2) {
        this(new Surrogate(advisorDashboardCardDto, title, description, advisorDashboardCtaDto, advisorDashboardCtaDto2));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    @Override // com.robinhood.idl.Dto
    public AdvisorDashboardStateFirstBooking toProto() {
        AdvisorDashboardCardDto card = this.surrogate.getCard();
        AdvisorDashboardCard proto = card != null ? card.toProto() : null;
        String title = this.surrogate.getTitle();
        String description = this.surrogate.getDescription();
        AdvisorDashboardCtaDto primary_cta = this.surrogate.getPrimary_cta();
        AdvisorDashboardCta proto2 = primary_cta != null ? primary_cta.toProto() : null;
        AdvisorDashboardCtaDto secondary_cta = this.surrogate.getSecondary_cta();
        return new AdvisorDashboardStateFirstBooking(proto, title, description, proto2, secondary_cta != null ? secondary_cta.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[AdvisorDashboardStateFirstBookingDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisorDashboardStateFirstBookingDto) && Intrinsics.areEqual(((AdvisorDashboardStateFirstBookingDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisorDashboardStateFirstBookingDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001bR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010&\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b1\u0010&\u001a\u0004\b0\u0010.¨\u00064"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$Surrogate;", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCardDto;", "card", "", "title", "description", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCardDto;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCardDto;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCardDto;", "getCard", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCardDto;", "getCard$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;", "getPrimary_cta", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;", "getPrimary_cta$annotations", "getSecondary_cta", "getSecondary_cta$annotations", "Companion", "$serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdvisorDashboardCardDto card;
        private final String description;
        private final AdvisorDashboardCtaDto primary_cta;
        private final AdvisorDashboardCtaDto secondary_cta;
        private final String title;

        public Surrogate() {
            this((AdvisorDashboardCardDto) null, (String) null, (String) null, (AdvisorDashboardCtaDto) null, (AdvisorDashboardCtaDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.card, surrogate.card) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.primary_cta, surrogate.primary_cta) && Intrinsics.areEqual(this.secondary_cta, surrogate.secondary_cta);
        }

        public int hashCode() {
            AdvisorDashboardCardDto advisorDashboardCardDto = this.card;
            int iHashCode = (((((advisorDashboardCardDto == null ? 0 : advisorDashboardCardDto.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
            AdvisorDashboardCtaDto advisorDashboardCtaDto = this.primary_cta;
            int iHashCode2 = (iHashCode + (advisorDashboardCtaDto == null ? 0 : advisorDashboardCtaDto.hashCode())) * 31;
            AdvisorDashboardCtaDto advisorDashboardCtaDto2 = this.secondary_cta;
            return iHashCode2 + (advisorDashboardCtaDto2 != null ? advisorDashboardCtaDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(card=" + this.card + ", title=" + this.title + ", description=" + this.description + ", primary_cta=" + this.primary_cta + ", secondary_cta=" + this.secondary_cta + ")";
        }

        /* compiled from: AdvisorDashboardStateFirstBookingDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$Surrogate;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisorDashboardStateFirstBookingDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AdvisorDashboardCardDto advisorDashboardCardDto, String str, String str2, AdvisorDashboardCtaDto advisorDashboardCtaDto, AdvisorDashboardCtaDto advisorDashboardCtaDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.card = null;
            } else {
                this.card = advisorDashboardCardDto;
            }
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 4) == 0) {
                this.description = "";
            } else {
                this.description = str2;
            }
            if ((i & 8) == 0) {
                this.primary_cta = null;
            } else {
                this.primary_cta = advisorDashboardCtaDto;
            }
            if ((i & 16) == 0) {
                this.secondary_cta = null;
            } else {
                this.secondary_cta = advisorDashboardCtaDto2;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease */
        public static final /* synthetic */ void m720x79713acb(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            AdvisorDashboardCardDto advisorDashboardCardDto = self.card;
            if (advisorDashboardCardDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, AdvisorDashboardCardDto.Serializer.INSTANCE, advisorDashboardCardDto);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 1, self.title);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 2, self.description);
            }
            AdvisorDashboardCtaDto advisorDashboardCtaDto = self.primary_cta;
            if (advisorDashboardCtaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AdvisorDashboardCtaDto.Serializer.INSTANCE, advisorDashboardCtaDto);
            }
            AdvisorDashboardCtaDto advisorDashboardCtaDto2 = self.secondary_cta;
            if (advisorDashboardCtaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, AdvisorDashboardCtaDto.Serializer.INSTANCE, advisorDashboardCtaDto2);
            }
        }

        public Surrogate(AdvisorDashboardCardDto advisorDashboardCardDto, String title, String description, AdvisorDashboardCtaDto advisorDashboardCtaDto, AdvisorDashboardCtaDto advisorDashboardCtaDto2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.card = advisorDashboardCardDto;
            this.title = title;
            this.description = description;
            this.primary_cta = advisorDashboardCtaDto;
            this.secondary_cta = advisorDashboardCtaDto2;
        }

        public /* synthetic */ Surrogate(AdvisorDashboardCardDto advisorDashboardCardDto, String str, String str2, AdvisorDashboardCtaDto advisorDashboardCtaDto, AdvisorDashboardCtaDto advisorDashboardCtaDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : advisorDashboardCardDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : advisorDashboardCtaDto, (i & 16) != 0 ? null : advisorDashboardCtaDto2);
        }

        public final AdvisorDashboardCardDto getCard() {
            return this.card;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final AdvisorDashboardCtaDto getPrimary_cta() {
            return this.primary_cta;
        }

        public final AdvisorDashboardCtaDto getSecondary_cta() {
            return this.secondary_cta;
        }
    }

    /* compiled from: AdvisorDashboardStateFirstBookingDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBooking;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisorDashboardStateFirstBookingDto, AdvisorDashboardStateFirstBooking> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisorDashboardStateFirstBookingDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorDashboardStateFirstBookingDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorDashboardStateFirstBookingDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisorDashboardStateFirstBookingDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisorDashboardStateFirstBooking> getProtoAdapter() {
            return AdvisorDashboardStateFirstBooking.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorDashboardStateFirstBookingDto getZeroValue() {
            return AdvisorDashboardStateFirstBookingDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorDashboardStateFirstBookingDto fromProto(AdvisorDashboardStateFirstBooking proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AdvisorDashboardCard card = proto.getCard();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AdvisorDashboardCardDto advisorDashboardCardDtoFromProto = card != null ? AdvisorDashboardCardDto.INSTANCE.fromProto(card) : null;
            String title = proto.getTitle();
            String description = proto.getDescription();
            AdvisorDashboardCta primary_cta = proto.getPrimary_cta();
            AdvisorDashboardCtaDto advisorDashboardCtaDtoFromProto = primary_cta != null ? AdvisorDashboardCtaDto.INSTANCE.fromProto(primary_cta) : null;
            AdvisorDashboardCta secondary_cta = proto.getSecondary_cta();
            return new AdvisorDashboardStateFirstBookingDto(new Surrogate(advisorDashboardCardDtoFromProto, title, description, advisorDashboardCtaDtoFromProto, secondary_cta != null ? AdvisorDashboardCtaDto.INSTANCE.fromProto(secondary_cta) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateFirstBookingDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisorDashboardStateFirstBookingDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvisorDashboardStateFirstBookingDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisorDashboardStateFirstBookingDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisorDashboardStateFirstBookingDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateFirstBooking", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisorDashboardStateFirstBookingDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisorDashboardStateFirstBookingDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisorDashboardStateFirstBookingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisorDashboardStateFirstBookingDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateFirstBookingDto";
        }
    }
}
