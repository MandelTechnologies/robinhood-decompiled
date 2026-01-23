package bonfire.proto.idl.advisor_marketplace.p029v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardCtaDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardMiniCardDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardStateEnrolledNoBookingDto;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
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

/* compiled from: AdvisorDashboardStateEnrolledNoBookingDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBooking;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$Surrogate;)V", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardMiniCardDto;", "cards", "", "title", "description", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;", AccountOverviewOptionsSettingCard4.CTA, "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;)V", "toProto", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBooking;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$Surrogate;", "getCards", "()Ljava/util/List;", "getTitle", "getDescription", "getCta", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class AdvisorDashboardStateEnrolledNoBookingDto implements Dto3<AdvisorDashboardStateEnrolledNoBooking>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisorDashboardStateEnrolledNoBookingDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisorDashboardStateEnrolledNoBookingDto, AdvisorDashboardStateEnrolledNoBooking>> binaryBase64Serializer$delegate;
    private static final AdvisorDashboardStateEnrolledNoBookingDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisorDashboardStateEnrolledNoBookingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisorDashboardStateEnrolledNoBookingDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<AdvisorDashboardMiniCardDto> getCards() {
        return this.surrogate.getCards();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final AdvisorDashboardCtaDto getCta() {
        return this.surrogate.getCta();
    }

    public /* synthetic */ AdvisorDashboardStateEnrolledNoBookingDto(List list, String str, String str2, AdvisorDashboardCtaDto advisorDashboardCtaDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : advisorDashboardCtaDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisorDashboardStateEnrolledNoBookingDto(List<AdvisorDashboardMiniCardDto> cards, String title, String description, AdvisorDashboardCtaDto advisorDashboardCtaDto) {
        this(new Surrogate(cards, title, description, advisorDashboardCtaDto));
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    @Override // com.robinhood.idl.Dto
    public AdvisorDashboardStateEnrolledNoBooking toProto() {
        List<AdvisorDashboardMiniCardDto> cards = this.surrogate.getCards();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cards, 10));
        Iterator<T> it = cards.iterator();
        while (it.hasNext()) {
            arrayList.add(((AdvisorDashboardMiniCardDto) it.next()).toProto());
        }
        String title = this.surrogate.getTitle();
        String description = this.surrogate.getDescription();
        AdvisorDashboardCtaDto cta = this.surrogate.getCta();
        return new AdvisorDashboardStateEnrolledNoBooking(arrayList, title, description, cta != null ? cta.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[AdvisorDashboardStateEnrolledNoBookingDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisorDashboardStateEnrolledNoBookingDto) && Intrinsics.areEqual(((AdvisorDashboardStateEnrolledNoBookingDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisorDashboardStateEnrolledNoBookingDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001bR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010&\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$Surrogate;", "", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardMiniCardDto;", "cards", "", "title", "description", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;", AccountOverviewOptionsSettingCard4.CTA, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "getCards$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;", "getCta", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardCtaDto;", "getCta$annotations", "Companion", "$serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<AdvisorDashboardMiniCardDto> cards;
        private final AdvisorDashboardCtaDto cta;
        private final String description;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateEnrolledNoBookingDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisorDashboardStateEnrolledNoBookingDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((List) null, (String) null, (String) null, (AdvisorDashboardCtaDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AdvisorDashboardMiniCardDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.cards, surrogate.cards) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.cta, surrogate.cta);
        }

        public int hashCode() {
            int iHashCode = ((((this.cards.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
            AdvisorDashboardCtaDto advisorDashboardCtaDto = this.cta;
            return iHashCode + (advisorDashboardCtaDto == null ? 0 : advisorDashboardCtaDto.hashCode());
        }

        public String toString() {
            return "Surrogate(cards=" + this.cards + ", title=" + this.title + ", description=" + this.description + ", cta=" + this.cta + ")";
        }

        /* compiled from: AdvisorDashboardStateEnrolledNoBookingDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$Surrogate;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisorDashboardStateEnrolledNoBookingDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, String str, String str2, AdvisorDashboardCtaDto advisorDashboardCtaDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.cards = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
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
                this.cta = null;
            } else {
                this.cta = advisorDashboardCtaDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease */
        public static final /* synthetic */ void m719x79713acb(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.cards, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.cards);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 1, self.title);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 2, self.description);
            }
            AdvisorDashboardCtaDto advisorDashboardCtaDto = self.cta;
            if (advisorDashboardCtaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AdvisorDashboardCtaDto.Serializer.INSTANCE, advisorDashboardCtaDto);
            }
        }

        public Surrogate(List<AdvisorDashboardMiniCardDto> cards, String title, String description, AdvisorDashboardCtaDto advisorDashboardCtaDto) {
            Intrinsics.checkNotNullParameter(cards, "cards");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.cards = cards;
            this.title = title;
            this.description = description;
            this.cta = advisorDashboardCtaDto;
        }

        public final List<AdvisorDashboardMiniCardDto> getCards() {
            return this.cards;
        }

        public /* synthetic */ Surrogate(List list, String str, String str2, AdvisorDashboardCtaDto advisorDashboardCtaDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : advisorDashboardCtaDto);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final AdvisorDashboardCtaDto getCta() {
            return this.cta;
        }
    }

    /* compiled from: AdvisorDashboardStateEnrolledNoBookingDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBooking;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisorDashboardStateEnrolledNoBookingDto, AdvisorDashboardStateEnrolledNoBooking> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisorDashboardStateEnrolledNoBookingDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorDashboardStateEnrolledNoBookingDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorDashboardStateEnrolledNoBookingDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisorDashboardStateEnrolledNoBookingDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisorDashboardStateEnrolledNoBooking> getProtoAdapter() {
            return AdvisorDashboardStateEnrolledNoBooking.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorDashboardStateEnrolledNoBookingDto getZeroValue() {
            return AdvisorDashboardStateEnrolledNoBookingDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorDashboardStateEnrolledNoBookingDto fromProto(AdvisorDashboardStateEnrolledNoBooking proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<AdvisorDashboardMiniCard> cards = proto.getCards();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cards, 10));
            Iterator<T> it = cards.iterator();
            while (it.hasNext()) {
                arrayList.add(AdvisorDashboardMiniCardDto.INSTANCE.fromProto((AdvisorDashboardMiniCard) it.next()));
            }
            String title = proto.getTitle();
            String description = proto.getDescription();
            AdvisorDashboardCta cta = proto.getCta();
            return new AdvisorDashboardStateEnrolledNoBookingDto(new Surrogate(arrayList, title, description, cta != null ? AdvisorDashboardCtaDto.INSTANCE.fromProto(cta) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateEnrolledNoBookingDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisorDashboardStateEnrolledNoBookingDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new AdvisorDashboardStateEnrolledNoBookingDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisorDashboardStateEnrolledNoBookingDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisorDashboardStateEnrolledNoBookingDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateEnrolledNoBooking", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisorDashboardStateEnrolledNoBookingDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisorDashboardStateEnrolledNoBookingDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisorDashboardStateEnrolledNoBookingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisorDashboardStateEnrolledNoBookingDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateEnrolledNoBookingDto";
        }
    }
}
