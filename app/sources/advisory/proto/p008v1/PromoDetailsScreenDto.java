package advisory.proto.p008v1;

import advisory.proto.p008v1.PromoDetailsAssetDto;
import advisory.proto.p008v1.PromoDetailsScreenBackgroundDto;
import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: PromoDetailsScreenDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045467B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u00101R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, m3636d2 = {"Ladvisory/proto/v1/PromoDetailsScreenDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/PromoDetailsScreen;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/PromoDetailsScreenDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/PromoDetailsScreenDto$Surrogate;)V", "Ladvisory/proto/v1/PromoDetailsAssetDto;", "video", "image", "", "title", "description", "disclosure_markdown", "cta_title", "cta_deeplink", "", "is_user_gold_member", "Ladvisory/proto/v1/PromoDetailsScreenBackgroundDto;", "background", "(Ladvisory/proto/v1/PromoDetailsAssetDto;Ladvisory/proto/v1/PromoDetailsAssetDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLadvisory/proto/v1/PromoDetailsScreenBackgroundDto;)V", "toProto", "()Ladvisory/proto/v1/PromoDetailsScreen;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/PromoDetailsScreenDto$Surrogate;", "getVideo", "()Ladvisory/proto/v1/PromoDetailsAssetDto;", "getImage", "getTitle", "getDescription", "getDisclosure_markdown", "getCta_title", "getCta_deeplink", "()Z", "getBackground", "()Ladvisory/proto/v1/PromoDetailsScreenBackgroundDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class PromoDetailsScreenDto implements Dto3<PromoDetailsScreen>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PromoDetailsScreenDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PromoDetailsScreenDto, PromoDetailsScreen>> binaryBase64Serializer$delegate;
    private static final PromoDetailsScreenDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PromoDetailsScreenDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PromoDetailsScreenDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PromoDetailsAssetDto getVideo() {
        return this.surrogate.getVideo();
    }

    public final PromoDetailsAssetDto getImage() {
        return this.surrogate.getImage();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getDisclosure_markdown() {
        return this.surrogate.getDisclosure_markdown();
    }

    public final String getCta_title() {
        return this.surrogate.getCta_title();
    }

    public final String getCta_deeplink() {
        return this.surrogate.getCta_deeplink();
    }

    public final boolean is_user_gold_member() {
        return this.surrogate.getIs_user_gold_member();
    }

    public final PromoDetailsScreenBackgroundDto getBackground() {
        return this.surrogate.getBackground();
    }

    public /* synthetic */ PromoDetailsScreenDto(PromoDetailsAssetDto promoDetailsAssetDto, PromoDetailsAssetDto promoDetailsAssetDto2, String str, String str2, String str3, String str4, String str5, boolean z, PromoDetailsScreenBackgroundDto promoDetailsScreenBackgroundDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : promoDetailsAssetDto, (i & 2) != 0 ? null : promoDetailsAssetDto2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? false : z, (i & 256) != 0 ? PromoDetailsScreenBackgroundDto.INSTANCE.getZeroValue() : promoDetailsScreenBackgroundDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoDetailsScreenDto(PromoDetailsAssetDto promoDetailsAssetDto, PromoDetailsAssetDto promoDetailsAssetDto2, String title, String description, String disclosure_markdown, String cta_title, String cta_deeplink, boolean z, PromoDetailsScreenBackgroundDto background) {
        this(new Surrogate(promoDetailsAssetDto, promoDetailsAssetDto2, title, description, disclosure_markdown, cta_title, cta_deeplink, z, background));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(cta_title, "cta_title");
        Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
        Intrinsics.checkNotNullParameter(background, "background");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PromoDetailsScreen toProto() {
        PromoDetailsAssetDto video = this.surrogate.getVideo();
        PromoDetailsAsset proto = video != null ? video.toProto() : null;
        PromoDetailsAssetDto image = this.surrogate.getImage();
        return new PromoDetailsScreen(proto, image != null ? image.toProto() : null, this.surrogate.getTitle(), this.surrogate.getDescription(), this.surrogate.getDisclosure_markdown(), this.surrogate.getCta_title(), this.surrogate.getCta_deeplink(), this.surrogate.getIs_user_gold_member(), (PromoDetailsScreenBackground) this.surrogate.getBackground().toProto(), null, 512, null);
    }

    public String toString() {
        return "[PromoDetailsScreenDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PromoDetailsScreenDto) && Intrinsics.areEqual(((PromoDetailsScreenDto) other).surrogate, this.surrogate);
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
    /* compiled from: PromoDetailsScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010(R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010 R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010 R \u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010 R \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b5\u0010*\u001a\u0004\b4\u0010 R \u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b7\u0010*\u001a\u0004\b6\u0010 R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00108\u0012\u0004\b:\u0010*\u001a\u0004\b\f\u00109R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\b>\u0010*\u001a\u0004\b<\u0010=¨\u0006A"}, m3636d2 = {"Ladvisory/proto/v1/PromoDetailsScreenDto$Surrogate;", "", "Ladvisory/proto/v1/PromoDetailsAssetDto;", "video", "image", "", "title", "description", "disclosure_markdown", "cta_title", "cta_deeplink", "", "is_user_gold_member", "Ladvisory/proto/v1/PromoDetailsScreenBackgroundDto;", "background", "<init>", "(Ladvisory/proto/v1/PromoDetailsAssetDto;Ladvisory/proto/v1/PromoDetailsAssetDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLadvisory/proto/v1/PromoDetailsScreenBackgroundDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/proto/v1/PromoDetailsAssetDto;Ladvisory/proto/v1/PromoDetailsAssetDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLadvisory/proto/v1/PromoDetailsScreenBackgroundDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/PromoDetailsScreenDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/PromoDetailsAssetDto;", "getVideo", "()Ladvisory/proto/v1/PromoDetailsAssetDto;", "getVideo$annotations", "()V", "getImage", "getImage$annotations", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "getDisclosure_markdown", "getDisclosure_markdown$annotations", "getCta_title", "getCta_title$annotations", "getCta_deeplink", "getCta_deeplink$annotations", "Z", "()Z", "is_user_gold_member$annotations", "Ladvisory/proto/v1/PromoDetailsScreenBackgroundDto;", "getBackground", "()Ladvisory/proto/v1/PromoDetailsScreenBackgroundDto;", "getBackground$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final PromoDetailsScreenBackgroundDto background;
        private final String cta_deeplink;
        private final String cta_title;
        private final String description;
        private final String disclosure_markdown;
        private final PromoDetailsAssetDto image;
        private final boolean is_user_gold_member;
        private final String title;
        private final PromoDetailsAssetDto video;

        public Surrogate() {
            this((PromoDetailsAssetDto) null, (PromoDetailsAssetDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (PromoDetailsScreenBackgroundDto) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.video, surrogate.video) && Intrinsics.areEqual(this.image, surrogate.image) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.disclosure_markdown, surrogate.disclosure_markdown) && Intrinsics.areEqual(this.cta_title, surrogate.cta_title) && Intrinsics.areEqual(this.cta_deeplink, surrogate.cta_deeplink) && this.is_user_gold_member == surrogate.is_user_gold_member && this.background == surrogate.background;
        }

        public int hashCode() {
            PromoDetailsAssetDto promoDetailsAssetDto = this.video;
            int iHashCode = (promoDetailsAssetDto == null ? 0 : promoDetailsAssetDto.hashCode()) * 31;
            PromoDetailsAssetDto promoDetailsAssetDto2 = this.image;
            return ((((((((((((((iHashCode + (promoDetailsAssetDto2 != null ? promoDetailsAssetDto2.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.disclosure_markdown.hashCode()) * 31) + this.cta_title.hashCode()) * 31) + this.cta_deeplink.hashCode()) * 31) + Boolean.hashCode(this.is_user_gold_member)) * 31) + this.background.hashCode();
        }

        public String toString() {
            return "Surrogate(video=" + this.video + ", image=" + this.image + ", title=" + this.title + ", description=" + this.description + ", disclosure_markdown=" + this.disclosure_markdown + ", cta_title=" + this.cta_title + ", cta_deeplink=" + this.cta_deeplink + ", is_user_gold_member=" + this.is_user_gold_member + ", background=" + this.background + ")";
        }

        /* compiled from: PromoDetailsScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/PromoDetailsScreenDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/PromoDetailsScreenDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PromoDetailsScreenDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PromoDetailsAssetDto promoDetailsAssetDto, PromoDetailsAssetDto promoDetailsAssetDto2, String str, String str2, String str3, String str4, String str5, boolean z, PromoDetailsScreenBackgroundDto promoDetailsScreenBackgroundDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.video = null;
            } else {
                this.video = promoDetailsAssetDto;
            }
            if ((i & 2) == 0) {
                this.image = null;
            } else {
                this.image = promoDetailsAssetDto2;
            }
            if ((i & 4) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 8) == 0) {
                this.description = "";
            } else {
                this.description = str2;
            }
            if ((i & 16) == 0) {
                this.disclosure_markdown = "";
            } else {
                this.disclosure_markdown = str3;
            }
            if ((i & 32) == 0) {
                this.cta_title = "";
            } else {
                this.cta_title = str4;
            }
            if ((i & 64) == 0) {
                this.cta_deeplink = "";
            } else {
                this.cta_deeplink = str5;
            }
            if ((i & 128) == 0) {
                this.is_user_gold_member = false;
            } else {
                this.is_user_gold_member = z;
            }
            if ((i & 256) == 0) {
                this.background = PromoDetailsScreenBackgroundDto.INSTANCE.getZeroValue();
            } else {
                this.background = promoDetailsScreenBackgroundDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            PromoDetailsAssetDto promoDetailsAssetDto = self.video;
            if (promoDetailsAssetDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, PromoDetailsAssetDto.Serializer.INSTANCE, promoDetailsAssetDto);
            }
            PromoDetailsAssetDto promoDetailsAssetDto2 = self.image;
            if (promoDetailsAssetDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, PromoDetailsAssetDto.Serializer.INSTANCE, promoDetailsAssetDto2);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 2, self.title);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 3, self.description);
            }
            if (!Intrinsics.areEqual(self.disclosure_markdown, "")) {
                output.encodeStringElement(serialDesc, 4, self.disclosure_markdown);
            }
            if (!Intrinsics.areEqual(self.cta_title, "")) {
                output.encodeStringElement(serialDesc, 5, self.cta_title);
            }
            if (!Intrinsics.areEqual(self.cta_deeplink, "")) {
                output.encodeStringElement(serialDesc, 6, self.cta_deeplink);
            }
            boolean z = self.is_user_gold_member;
            if (z) {
                output.encodeBooleanElement(serialDesc, 7, z);
            }
            if (self.background != PromoDetailsScreenBackgroundDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, PromoDetailsScreenBackgroundDto.Serializer.INSTANCE, self.background);
            }
        }

        public Surrogate(PromoDetailsAssetDto promoDetailsAssetDto, PromoDetailsAssetDto promoDetailsAssetDto2, String title, String description, String disclosure_markdown, String cta_title, String cta_deeplink, boolean z, PromoDetailsScreenBackgroundDto background) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
            Intrinsics.checkNotNullParameter(cta_title, "cta_title");
            Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
            Intrinsics.checkNotNullParameter(background, "background");
            this.video = promoDetailsAssetDto;
            this.image = promoDetailsAssetDto2;
            this.title = title;
            this.description = description;
            this.disclosure_markdown = disclosure_markdown;
            this.cta_title = cta_title;
            this.cta_deeplink = cta_deeplink;
            this.is_user_gold_member = z;
            this.background = background;
        }

        public /* synthetic */ Surrogate(PromoDetailsAssetDto promoDetailsAssetDto, PromoDetailsAssetDto promoDetailsAssetDto2, String str, String str2, String str3, String str4, String str5, boolean z, PromoDetailsScreenBackgroundDto promoDetailsScreenBackgroundDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : promoDetailsAssetDto, (i & 2) != 0 ? null : promoDetailsAssetDto2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? false : z, (i & 256) != 0 ? PromoDetailsScreenBackgroundDto.INSTANCE.getZeroValue() : promoDetailsScreenBackgroundDto);
        }

        public final PromoDetailsAssetDto getVideo() {
            return this.video;
        }

        public final PromoDetailsAssetDto getImage() {
            return this.image;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDisclosure_markdown() {
            return this.disclosure_markdown;
        }

        public final String getCta_title() {
            return this.cta_title;
        }

        public final String getCta_deeplink() {
            return this.cta_deeplink;
        }

        /* renamed from: is_user_gold_member, reason: from getter */
        public final boolean getIs_user_gold_member() {
            return this.is_user_gold_member;
        }

        public final PromoDetailsScreenBackgroundDto getBackground() {
            return this.background;
        }
    }

    /* compiled from: PromoDetailsScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/PromoDetailsScreenDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/PromoDetailsScreenDto;", "Ladvisory/proto/v1/PromoDetailsScreen;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/PromoDetailsScreenDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PromoDetailsScreenDto, PromoDetailsScreen> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PromoDetailsScreenDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PromoDetailsScreenDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PromoDetailsScreenDto> getBinaryBase64Serializer() {
            return (KSerializer) PromoDetailsScreenDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PromoDetailsScreen> getProtoAdapter() {
            return PromoDetailsScreen.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PromoDetailsScreenDto getZeroValue() {
            return PromoDetailsScreenDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PromoDetailsScreenDto fromProto(PromoDetailsScreen proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            PromoDetailsAsset video = proto.getVideo();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PromoDetailsAssetDto promoDetailsAssetDtoFromProto = video != null ? PromoDetailsAssetDto.INSTANCE.fromProto(video) : null;
            PromoDetailsAsset image = proto.getImage();
            return new PromoDetailsScreenDto(new Surrogate(promoDetailsAssetDtoFromProto, image != null ? PromoDetailsAssetDto.INSTANCE.fromProto(image) : null, proto.getTitle(), proto.getDescription(), proto.getDisclosure_markdown(), proto.getCta_title(), proto.getCta_deeplink(), proto.getIs_user_gold_member(), PromoDetailsScreenBackgroundDto.INSTANCE.fromProto(proto.getBackground())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.PromoDetailsScreenDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PromoDetailsScreenDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PromoDetailsScreenDto(null, null, null, null, null, null, null, false, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PromoDetailsScreenDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/PromoDetailsScreenDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/PromoDetailsScreenDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/PromoDetailsScreenDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PromoDetailsScreenDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.PromoDetailsScreen", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PromoDetailsScreenDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PromoDetailsScreenDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PromoDetailsScreenDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PromoDetailsScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/PromoDetailsScreenDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "advisory.proto.v1.PromoDetailsScreenDto";
        }
    }
}
