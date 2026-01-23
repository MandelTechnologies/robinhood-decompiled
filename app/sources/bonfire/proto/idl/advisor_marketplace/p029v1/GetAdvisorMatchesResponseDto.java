package bonfire.proto.idl.advisor_marketplace.p029v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMatchCardDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMatchFeedbackFormDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMatchFooterCtaDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.GetAdvisorMatchesResponseDto;
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

/* compiled from: GetAdvisorMatchesResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010)¨\u0006/"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$Surrogate;)V", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchCardDto;", "cards", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;", "initial_footer", "final_footer", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackFormDto;", "feedback_form", "(Ljava/util/List;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackFormDto;)V", "toProto", "()Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$Surrogate;", "getCards", "()Ljava/util/List;", "getInitial_footer", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;", "getFinal_footer", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class GetAdvisorMatchesResponseDto implements Dto3<GetAdvisorMatchesResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAdvisorMatchesResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAdvisorMatchesResponseDto, GetAdvisorMatchesResponse>> binaryBase64Serializer$delegate;
    private static final GetAdvisorMatchesResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAdvisorMatchesResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAdvisorMatchesResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<AdvisorMatchCardDto> getCards() {
        return this.surrogate.getCards();
    }

    public final AdvisorMatchFooterCtaDto getInitial_footer() {
        return this.surrogate.getInitial_footer();
    }

    public final AdvisorMatchFooterCtaDto getFinal_footer() {
        return this.surrogate.getFinal_footer();
    }

    public /* synthetic */ GetAdvisorMatchesResponseDto(List list, AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto, AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto2, AdvisorMatchFeedbackFormDto advisorMatchFeedbackFormDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : advisorMatchFooterCtaDto, (i & 4) != 0 ? null : advisorMatchFooterCtaDto2, (i & 8) != 0 ? null : advisorMatchFeedbackFormDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAdvisorMatchesResponseDto(List<AdvisorMatchCardDto> cards, AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto, AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto2, AdvisorMatchFeedbackFormDto advisorMatchFeedbackFormDto) {
        this(new Surrogate(cards, advisorMatchFooterCtaDto, advisorMatchFooterCtaDto2, advisorMatchFeedbackFormDto));
        Intrinsics.checkNotNullParameter(cards, "cards");
    }

    @Override // com.robinhood.idl.Dto
    public GetAdvisorMatchesResponse toProto() {
        List<AdvisorMatchCardDto> cards = this.surrogate.getCards();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cards, 10));
        Iterator<T> it = cards.iterator();
        while (it.hasNext()) {
            arrayList.add(((AdvisorMatchCardDto) it.next()).toProto());
        }
        AdvisorMatchFooterCtaDto initial_footer = this.surrogate.getInitial_footer();
        AdvisorMatchFooterCta proto = initial_footer != null ? initial_footer.toProto() : null;
        AdvisorMatchFooterCtaDto final_footer = this.surrogate.getFinal_footer();
        AdvisorMatchFooterCta proto2 = final_footer != null ? final_footer.toProto() : null;
        AdvisorMatchFeedbackFormDto feedback_form = this.surrogate.getFeedback_form();
        return new GetAdvisorMatchesResponse(arrayList, proto, proto2, feedback_form != null ? feedback_form.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[GetAdvisorMatchesResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAdvisorMatchesResponseDto) && Intrinsics.areEqual(((GetAdvisorMatchesResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAdvisorMatchesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B;\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010*R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010'\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$Surrogate;", "", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchCardDto;", "cards", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;", "initial_footer", "final_footer", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackFormDto;", "feedback_form", "<init>", "(Ljava/util/List;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackFormDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackFormDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "getCards$annotations", "()V", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;", "getInitial_footer", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFooterCtaDto;", "getInitial_footer$annotations", "getFinal_footer", "getFinal_footer$annotations", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackFormDto;", "getFeedback_form", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackFormDto;", "getFeedback_form$annotations", "Companion", "$serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<AdvisorMatchCardDto> cards;
        private final AdvisorMatchFeedbackFormDto feedback_form;
        private final AdvisorMatchFooterCtaDto final_footer;
        private final AdvisorMatchFooterCtaDto initial_footer;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.GetAdvisorMatchesResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAdvisorMatchesResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((List) null, (AdvisorMatchFooterCtaDto) null, (AdvisorMatchFooterCtaDto) null, (AdvisorMatchFeedbackFormDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AdvisorMatchCardDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.cards, surrogate.cards) && Intrinsics.areEqual(this.initial_footer, surrogate.initial_footer) && Intrinsics.areEqual(this.final_footer, surrogate.final_footer) && Intrinsics.areEqual(this.feedback_form, surrogate.feedback_form);
        }

        public int hashCode() {
            int iHashCode = this.cards.hashCode() * 31;
            AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto = this.initial_footer;
            int iHashCode2 = (iHashCode + (advisorMatchFooterCtaDto == null ? 0 : advisorMatchFooterCtaDto.hashCode())) * 31;
            AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto2 = this.final_footer;
            int iHashCode3 = (iHashCode2 + (advisorMatchFooterCtaDto2 == null ? 0 : advisorMatchFooterCtaDto2.hashCode())) * 31;
            AdvisorMatchFeedbackFormDto advisorMatchFeedbackFormDto = this.feedback_form;
            return iHashCode3 + (advisorMatchFeedbackFormDto != null ? advisorMatchFeedbackFormDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(cards=" + this.cards + ", initial_footer=" + this.initial_footer + ", final_footer=" + this.final_footer + ", feedback_form=" + this.feedback_form + ")";
        }

        /* compiled from: GetAdvisorMatchesResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$Surrogate;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAdvisorMatchesResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto, AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto2, AdvisorMatchFeedbackFormDto advisorMatchFeedbackFormDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.cards = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.initial_footer = null;
            } else {
                this.initial_footer = advisorMatchFooterCtaDto;
            }
            if ((i & 4) == 0) {
                this.final_footer = null;
            } else {
                this.final_footer = advisorMatchFooterCtaDto2;
            }
            if ((i & 8) == 0) {
                this.feedback_form = null;
            } else {
                this.feedback_form = advisorMatchFeedbackFormDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease */
        public static final /* synthetic */ void m736x79713acb(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.cards, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.cards);
            }
            AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto = self.initial_footer;
            if (advisorMatchFooterCtaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, AdvisorMatchFooterCtaDto.Serializer.INSTANCE, advisorMatchFooterCtaDto);
            }
            AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto2 = self.final_footer;
            if (advisorMatchFooterCtaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, AdvisorMatchFooterCtaDto.Serializer.INSTANCE, advisorMatchFooterCtaDto2);
            }
            AdvisorMatchFeedbackFormDto advisorMatchFeedbackFormDto = self.feedback_form;
            if (advisorMatchFeedbackFormDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AdvisorMatchFeedbackFormDto.Serializer.INSTANCE, advisorMatchFeedbackFormDto);
            }
        }

        public Surrogate(List<AdvisorMatchCardDto> cards, AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto, AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto2, AdvisorMatchFeedbackFormDto advisorMatchFeedbackFormDto) {
            Intrinsics.checkNotNullParameter(cards, "cards");
            this.cards = cards;
            this.initial_footer = advisorMatchFooterCtaDto;
            this.final_footer = advisorMatchFooterCtaDto2;
            this.feedback_form = advisorMatchFeedbackFormDto;
        }

        public final List<AdvisorMatchCardDto> getCards() {
            return this.cards;
        }

        public /* synthetic */ Surrogate(List list, AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto, AdvisorMatchFooterCtaDto advisorMatchFooterCtaDto2, AdvisorMatchFeedbackFormDto advisorMatchFeedbackFormDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : advisorMatchFooterCtaDto, (i & 4) != 0 ? null : advisorMatchFooterCtaDto2, (i & 8) != 0 ? null : advisorMatchFeedbackFormDto);
        }

        public final AdvisorMatchFooterCtaDto getInitial_footer() {
            return this.initial_footer;
        }

        public final AdvisorMatchFooterCtaDto getFinal_footer() {
            return this.final_footer;
        }

        public final AdvisorMatchFeedbackFormDto getFeedback_form() {
            return this.feedback_form;
        }
    }

    /* compiled from: GetAdvisorMatchesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAdvisorMatchesResponseDto, GetAdvisorMatchesResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAdvisorMatchesResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAdvisorMatchesResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAdvisorMatchesResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAdvisorMatchesResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAdvisorMatchesResponse> getProtoAdapter() {
            return GetAdvisorMatchesResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAdvisorMatchesResponseDto getZeroValue() {
            return GetAdvisorMatchesResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAdvisorMatchesResponseDto fromProto(GetAdvisorMatchesResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<AdvisorMatchCard> cards = proto.getCards();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cards, 10));
            Iterator<T> it = cards.iterator();
            while (it.hasNext()) {
                arrayList.add(AdvisorMatchCardDto.INSTANCE.fromProto((AdvisorMatchCard) it.next()));
            }
            AdvisorMatchFooterCta initial_footer = proto.getInitial_footer();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AdvisorMatchFooterCtaDto advisorMatchFooterCtaDtoFromProto = initial_footer != null ? AdvisorMatchFooterCtaDto.INSTANCE.fromProto(initial_footer) : null;
            AdvisorMatchFooterCta final_footer = proto.getFinal_footer();
            AdvisorMatchFooterCtaDto advisorMatchFooterCtaDtoFromProto2 = final_footer != null ? AdvisorMatchFooterCtaDto.INSTANCE.fromProto(final_footer) : null;
            AdvisorMatchFeedbackForm feedback_form = proto.getFeedback_form();
            return new GetAdvisorMatchesResponseDto(new Surrogate(arrayList, advisorMatchFooterCtaDtoFromProto, advisorMatchFooterCtaDtoFromProto2, feedback_form != null ? AdvisorMatchFeedbackFormDto.INSTANCE.fromProto(feedback_form) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.GetAdvisorMatchesResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAdvisorMatchesResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetAdvisorMatchesResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAdvisorMatchesResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAdvisorMatchesResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.advisor_marketplace.v1.GetAdvisorMatchesResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAdvisorMatchesResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAdvisorMatchesResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAdvisorMatchesResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAdvisorMatchesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetAdvisorMatchesResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.advisor_marketplace.v1.GetAdvisorMatchesResponseDto";
        }
    }
}
