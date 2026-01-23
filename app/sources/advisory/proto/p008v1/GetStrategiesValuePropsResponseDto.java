package advisory.proto.p008v1;

import advisory.proto.p008v1.StrategiesValuePropsTermsSheetDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
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

/* compiled from: GetStrategiesValuePropsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043245B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Be\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0013\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010*¨\u00066"}, m3636d2 = {"Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetStrategiesValuePropsResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$Surrogate;)V", "", "video_url", "", "show_gold_pill", "title", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "terms_cta_text", "continue_cta_text", "Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;", "terms_sheet", "is_gold_variant", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;Z)V", "toProto", "()Ladvisory/proto/v1/GetStrategiesValuePropsResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$Surrogate;", "getVideo_url", "getShow_gold_pill", "()Z", "getTitle", "getSubtitle", "getDisclosure", "getTerms_cta_text", "getContinue_cta_text", "getTerms_sheet", "()Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GetStrategiesValuePropsResponseDto implements Dto3<GetStrategiesValuePropsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetStrategiesValuePropsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetStrategiesValuePropsResponseDto, GetStrategiesValuePropsResponse>> binaryBase64Serializer$delegate;
    private static final GetStrategiesValuePropsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetStrategiesValuePropsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetStrategiesValuePropsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getVideo_url() {
        return this.surrogate.getVideo_url();
    }

    public final boolean getShow_gold_pill() {
        return this.surrogate.getShow_gold_pill();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final String getDisclosure() {
        return this.surrogate.getDisclosure();
    }

    public final String getTerms_cta_text() {
        return this.surrogate.getTerms_cta_text();
    }

    public final String getContinue_cta_text() {
        return this.surrogate.getContinue_cta_text();
    }

    public final StrategiesValuePropsTermsSheetDto getTerms_sheet() {
        return this.surrogate.getTerms_sheet();
    }

    public final boolean is_gold_variant() {
        return this.surrogate.getIs_gold_variant();
    }

    public /* synthetic */ GetStrategiesValuePropsResponseDto(String str, boolean z, String str2, String str3, String str4, String str5, String str6, StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : strategiesValuePropsTermsSheetDto, (i & 256) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetStrategiesValuePropsResponseDto(String video_url, boolean z, String title, String subtitle, String disclosure, String terms_cta_text, String continue_cta_text, StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto, boolean z2) {
        this(new Surrogate(video_url, z, title, subtitle, disclosure, terms_cta_text, continue_cta_text, strategiesValuePropsTermsSheetDto, z2));
        Intrinsics.checkNotNullParameter(video_url, "video_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(terms_cta_text, "terms_cta_text");
        Intrinsics.checkNotNullParameter(continue_cta_text, "continue_cta_text");
    }

    @Override // com.robinhood.idl.Dto
    public GetStrategiesValuePropsResponse toProto() {
        String video_url = this.surrogate.getVideo_url();
        boolean show_gold_pill = this.surrogate.getShow_gold_pill();
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        String disclosure = this.surrogate.getDisclosure();
        String terms_cta_text = this.surrogate.getTerms_cta_text();
        String continue_cta_text = this.surrogate.getContinue_cta_text();
        StrategiesValuePropsTermsSheetDto terms_sheet = this.surrogate.getTerms_sheet();
        return new GetStrategiesValuePropsResponse(video_url, show_gold_pill, title, subtitle, disclosure, terms_cta_text, continue_cta_text, terms_sheet != null ? terms_sheet.toProto() : null, this.surrogate.getIs_gold_variant(), null, 512, null);
    }

    public String toString() {
        return "[GetStrategiesValuePropsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetStrategiesValuePropsResponseDto) && Intrinsics.areEqual(((GetStrategiesValuePropsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetStrategiesValuePropsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fBq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001fR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010\u001fR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010%\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010\u001fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010\u001fR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b6\u0010(\u001a\u0004\b5\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010(\u001a\u0004\b8\u00109R \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010)\u0012\u0004\b;\u0010(\u001a\u0004\b\r\u0010+¨\u0006>"}, m3636d2 = {"Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$Surrogate;", "", "", "video_url", "", "show_gold_pill", "title", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "terms_cta_text", "continue_cta_text", "Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;", "terms_sheet", "is_gold_variant", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVideo_url", "getVideo_url$annotations", "()V", "Z", "getShow_gold_pill", "()Z", "getShow_gold_pill$annotations", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getDisclosure", "getDisclosure$annotations", "getTerms_cta_text", "getTerms_cta_text$annotations", "getContinue_cta_text", "getContinue_cta_text$annotations", "Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;", "getTerms_sheet", "()Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;", "getTerms_sheet$annotations", "is_gold_variant$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String continue_cta_text;
        private final String disclosure;
        private final boolean is_gold_variant;
        private final boolean show_gold_pill;
        private final String subtitle;
        private final String terms_cta_text;
        private final StrategiesValuePropsTermsSheetDto terms_sheet;
        private final String title;
        private final String video_url;

        public Surrogate() {
            this((String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (StrategiesValuePropsTermsSheetDto) null, false, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.video_url, surrogate.video_url) && this.show_gold_pill == surrogate.show_gold_pill && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.disclosure, surrogate.disclosure) && Intrinsics.areEqual(this.terms_cta_text, surrogate.terms_cta_text) && Intrinsics.areEqual(this.continue_cta_text, surrogate.continue_cta_text) && Intrinsics.areEqual(this.terms_sheet, surrogate.terms_sheet) && this.is_gold_variant == surrogate.is_gold_variant;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.video_url.hashCode() * 31) + Boolean.hashCode(this.show_gold_pill)) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.terms_cta_text.hashCode()) * 31) + this.continue_cta_text.hashCode()) * 31;
            StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto = this.terms_sheet;
            return ((iHashCode + (strategiesValuePropsTermsSheetDto == null ? 0 : strategiesValuePropsTermsSheetDto.hashCode())) * 31) + Boolean.hashCode(this.is_gold_variant);
        }

        public String toString() {
            return "Surrogate(video_url=" + this.video_url + ", show_gold_pill=" + this.show_gold_pill + ", title=" + this.title + ", subtitle=" + this.subtitle + ", disclosure=" + this.disclosure + ", terms_cta_text=" + this.terms_cta_text + ", continue_cta_text=" + this.continue_cta_text + ", terms_sheet=" + this.terms_sheet + ", is_gold_variant=" + this.is_gold_variant + ")";
        }

        /* compiled from: GetStrategiesValuePropsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetStrategiesValuePropsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, boolean z, String str2, String str3, String str4, String str5, String str6, StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.video_url = "";
            } else {
                this.video_url = str;
            }
            if ((i & 2) == 0) {
                this.show_gold_pill = false;
            } else {
                this.show_gold_pill = z;
            }
            if ((i & 4) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 8) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str3;
            }
            if ((i & 16) == 0) {
                this.disclosure = "";
            } else {
                this.disclosure = str4;
            }
            if ((i & 32) == 0) {
                this.terms_cta_text = "";
            } else {
                this.terms_cta_text = str5;
            }
            if ((i & 64) == 0) {
                this.continue_cta_text = "";
            } else {
                this.continue_cta_text = str6;
            }
            if ((i & 128) == 0) {
                this.terms_sheet = null;
            } else {
                this.terms_sheet = strategiesValuePropsTermsSheetDto;
            }
            if ((i & 256) == 0) {
                this.is_gold_variant = false;
            } else {
                this.is_gold_variant = z2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.video_url, "")) {
                output.encodeStringElement(serialDesc, 0, self.video_url);
            }
            boolean z = self.show_gold_pill;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 2, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 3, self.subtitle);
            }
            if (!Intrinsics.areEqual(self.disclosure, "")) {
                output.encodeStringElement(serialDesc, 4, self.disclosure);
            }
            if (!Intrinsics.areEqual(self.terms_cta_text, "")) {
                output.encodeStringElement(serialDesc, 5, self.terms_cta_text);
            }
            if (!Intrinsics.areEqual(self.continue_cta_text, "")) {
                output.encodeStringElement(serialDesc, 6, self.continue_cta_text);
            }
            StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto = self.terms_sheet;
            if (strategiesValuePropsTermsSheetDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StrategiesValuePropsTermsSheetDto.Serializer.INSTANCE, strategiesValuePropsTermsSheetDto);
            }
            boolean z2 = self.is_gold_variant;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 8, z2);
            }
        }

        public Surrogate(String video_url, boolean z, String title, String subtitle, String disclosure, String terms_cta_text, String continue_cta_text, StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto, boolean z2) {
            Intrinsics.checkNotNullParameter(video_url, "video_url");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(terms_cta_text, "terms_cta_text");
            Intrinsics.checkNotNullParameter(continue_cta_text, "continue_cta_text");
            this.video_url = video_url;
            this.show_gold_pill = z;
            this.title = title;
            this.subtitle = subtitle;
            this.disclosure = disclosure;
            this.terms_cta_text = terms_cta_text;
            this.continue_cta_text = continue_cta_text;
            this.terms_sheet = strategiesValuePropsTermsSheetDto;
            this.is_gold_variant = z2;
        }

        public /* synthetic */ Surrogate(String str, boolean z, String str2, String str3, String str4, String str5, String str6, StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : strategiesValuePropsTermsSheetDto, (i & 256) != 0 ? false : z2);
        }

        public final String getVideo_url() {
            return this.video_url;
        }

        public final boolean getShow_gold_pill() {
            return this.show_gold_pill;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final String getTerms_cta_text() {
            return this.terms_cta_text;
        }

        public final String getContinue_cta_text() {
            return this.continue_cta_text;
        }

        public final StrategiesValuePropsTermsSheetDto getTerms_sheet() {
            return this.terms_sheet;
        }

        /* renamed from: is_gold_variant, reason: from getter */
        public final boolean getIs_gold_variant() {
            return this.is_gold_variant;
        }
    }

    /* compiled from: GetStrategiesValuePropsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto;", "Ladvisory/proto/v1/GetStrategiesValuePropsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetStrategiesValuePropsResponseDto, GetStrategiesValuePropsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetStrategiesValuePropsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetStrategiesValuePropsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetStrategiesValuePropsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetStrategiesValuePropsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetStrategiesValuePropsResponse> getProtoAdapter() {
            return GetStrategiesValuePropsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetStrategiesValuePropsResponseDto getZeroValue() {
            return GetStrategiesValuePropsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetStrategiesValuePropsResponseDto fromProto(GetStrategiesValuePropsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String video_url = proto.getVideo_url();
            boolean show_gold_pill = proto.getShow_gold_pill();
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            String disclosure = proto.getDisclosure();
            String terms_cta_text = proto.getTerms_cta_text();
            String continue_cta_text = proto.getContinue_cta_text();
            StrategiesValuePropsTermsSheet terms_sheet = proto.getTerms_sheet();
            return new GetStrategiesValuePropsResponseDto(new Surrogate(video_url, show_gold_pill, title, subtitle, disclosure, terms_cta_text, continue_cta_text, terms_sheet != null ? StrategiesValuePropsTermsSheetDto.INSTANCE.fromProto(terms_sheet) : null, proto.getIs_gold_variant()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetStrategiesValuePropsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetStrategiesValuePropsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetStrategiesValuePropsResponseDto(null, false, null, null, null, null, null, null, false, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetStrategiesValuePropsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetStrategiesValuePropsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetStrategiesValuePropsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetStrategiesValuePropsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetStrategiesValuePropsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetStrategiesValuePropsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetStrategiesValuePropsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetStrategiesValuePropsResponseDto";
        }
    }
}
