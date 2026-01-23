package futures_onboarding_value_props.proto.p463v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import futures_onboarding_value_props.proto.p463v1.ImageInfoDto;
import futures_onboarding_value_props.proto.p463v1.LottieInfoDto;
import futures_onboarding_value_props.proto.p463v1.ThemeDto;
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

/* compiled from: PageDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/PageDto;", "Lcom/robinhood/idl/MessageDto;", "Lfutures_onboarding_value_props/proto/v1/Page;", "Landroid/os/Parcelable;", "Lfutures_onboarding_value_props/proto/v1/PageDto$Surrogate;", "surrogate", "<init>", "(Lfutures_onboarding_value_props/proto/v1/PageDto$Surrogate;)V", "", "title_markdown", "subtitle_markdown", "disclaimer_markdown", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;", "lottie_info", "Lfutures_onboarding_value_props/proto/v1/ImageInfoDto;", "image_info", "Lfutures_onboarding_value_props/proto/v1/ThemeDto;", "theme", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;Lfutures_onboarding_value_props/proto/v1/ImageInfoDto;Lfutures_onboarding_value_props/proto/v1/ThemeDto;)V", "toProto", "()Lfutures_onboarding_value_props/proto/v1/Page;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lfutures_onboarding_value_props/proto/v1/PageDto$Surrogate;", "getTitle_markdown", "getSubtitle_markdown", "getDisclaimer_markdown", "getLottie_info", "()Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;", "getImage_info", "()Lfutures_onboarding_value_props/proto/v1/ImageInfoDto;", "getTheme", "()Lfutures_onboarding_value_props/proto/v1/ThemeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class PageDto implements Dto3<Page>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PageDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PageDto, Page>> binaryBase64Serializer$delegate;
    private static final PageDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PageDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PageDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle_markdown() {
        return this.surrogate.getTitle_markdown();
    }

    public final String getSubtitle_markdown() {
        return this.surrogate.getSubtitle_markdown();
    }

    public final String getDisclaimer_markdown() {
        return this.surrogate.getDisclaimer_markdown();
    }

    public final LottieInfoDto getLottie_info() {
        return this.surrogate.getLottie_info();
    }

    public final ImageInfoDto getImage_info() {
        return this.surrogate.getImage_info();
    }

    public final ThemeDto getTheme() {
        return this.surrogate.getTheme();
    }

    public /* synthetic */ PageDto(String str, String str2, String str3, LottieInfoDto lottieInfoDto, ImageInfoDto imageInfoDto, ThemeDto themeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : lottieInfoDto, (i & 16) != 0 ? null : imageInfoDto, (i & 32) != 0 ? null : themeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PageDto(String title_markdown, String subtitle_markdown, String str, LottieInfoDto lottieInfoDto, ImageInfoDto imageInfoDto, ThemeDto themeDto) {
        this(new Surrogate(title_markdown, subtitle_markdown, str, lottieInfoDto, imageInfoDto, themeDto));
        Intrinsics.checkNotNullParameter(title_markdown, "title_markdown");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Page toProto() {
        String title_markdown = this.surrogate.getTitle_markdown();
        String subtitle_markdown = this.surrogate.getSubtitle_markdown();
        String disclaimer_markdown = this.surrogate.getDisclaimer_markdown();
        LottieInfoDto lottie_info = this.surrogate.getLottie_info();
        LottieInfo proto = lottie_info != null ? lottie_info.toProto() : null;
        ImageInfoDto image_info = this.surrogate.getImage_info();
        ImageInfo proto2 = image_info != null ? image_info.toProto() : null;
        ThemeDto theme = this.surrogate.getTheme();
        return new Page(title_markdown, subtitle_markdown, disclaimer_markdown, proto, proto2, theme != null ? (Theme) theme.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[PageDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PageDto) && Intrinsics.areEqual(((PageDto) other).surrogate, this.surrogate);
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
    /* compiled from: PageDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b7\u0010'\u001a\u0004\b5\u00106¨\u0006:"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/PageDto$Surrogate;", "", "", "title_markdown", "subtitle_markdown", "disclaimer_markdown", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;", "lottie_info", "Lfutures_onboarding_value_props/proto/v1/ImageInfoDto;", "image_info", "Lfutures_onboarding_value_props/proto/v1/ThemeDto;", "theme", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;Lfutures_onboarding_value_props/proto/v1/ImageInfoDto;Lfutures_onboarding_value_props/proto/v1/ThemeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;Lfutures_onboarding_value_props/proto/v1/ImageInfoDto;Lfutures_onboarding_value_props/proto/v1/ThemeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$futures_onboarding_value_props_proto_v1_externalRelease", "(Lfutures_onboarding_value_props/proto/v1/PageDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle_markdown", "getTitle_markdown$annotations", "()V", "getSubtitle_markdown", "getSubtitle_markdown$annotations", "getDisclaimer_markdown", "getDisclaimer_markdown$annotations", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;", "getLottie_info", "()Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;", "getLottie_info$annotations", "Lfutures_onboarding_value_props/proto/v1/ImageInfoDto;", "getImage_info", "()Lfutures_onboarding_value_props/proto/v1/ImageInfoDto;", "getImage_info$annotations", "Lfutures_onboarding_value_props/proto/v1/ThemeDto;", "getTheme", "()Lfutures_onboarding_value_props/proto/v1/ThemeDto;", "getTheme$annotations", "Companion", "$serializer", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String disclaimer_markdown;
        private final ImageInfoDto image_info;
        private final LottieInfoDto lottie_info;
        private final String subtitle_markdown;
        private final ThemeDto theme;
        private final String title_markdown;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (LottieInfoDto) null, (ImageInfoDto) null, (ThemeDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title_markdown, surrogate.title_markdown) && Intrinsics.areEqual(this.subtitle_markdown, surrogate.subtitle_markdown) && Intrinsics.areEqual(this.disclaimer_markdown, surrogate.disclaimer_markdown) && Intrinsics.areEqual(this.lottie_info, surrogate.lottie_info) && Intrinsics.areEqual(this.image_info, surrogate.image_info) && this.theme == surrogate.theme;
        }

        public int hashCode() {
            int iHashCode = ((this.title_markdown.hashCode() * 31) + this.subtitle_markdown.hashCode()) * 31;
            String str = this.disclaimer_markdown;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            LottieInfoDto lottieInfoDto = this.lottie_info;
            int iHashCode3 = (iHashCode2 + (lottieInfoDto == null ? 0 : lottieInfoDto.hashCode())) * 31;
            ImageInfoDto imageInfoDto = this.image_info;
            int iHashCode4 = (iHashCode3 + (imageInfoDto == null ? 0 : imageInfoDto.hashCode())) * 31;
            ThemeDto themeDto = this.theme;
            return iHashCode4 + (themeDto != null ? themeDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title_markdown=" + this.title_markdown + ", subtitle_markdown=" + this.subtitle_markdown + ", disclaimer_markdown=" + this.disclaimer_markdown + ", lottie_info=" + this.lottie_info + ", image_info=" + this.image_info + ", theme=" + this.theme + ")";
        }

        /* compiled from: PageDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/PageDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lfutures_onboarding_value_props/proto/v1/PageDto$Surrogate;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PageDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, LottieInfoDto lottieInfoDto, ImageInfoDto imageInfoDto, ThemeDto themeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title_markdown = "";
            } else {
                this.title_markdown = str;
            }
            if ((i & 2) == 0) {
                this.subtitle_markdown = "";
            } else {
                this.subtitle_markdown = str2;
            }
            if ((i & 4) == 0) {
                this.disclaimer_markdown = null;
            } else {
                this.disclaimer_markdown = str3;
            }
            if ((i & 8) == 0) {
                this.lottie_info = null;
            } else {
                this.lottie_info = lottieInfoDto;
            }
            if ((i & 16) == 0) {
                this.image_info = null;
            } else {
                this.image_info = imageInfoDto;
            }
            if ((i & 32) == 0) {
                this.theme = null;
            } else {
                this.theme = themeDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$futures_onboarding_value_props_proto_v1_externalRelease */
        public static final /* synthetic */ void m3290x9ef7d20e(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title_markdown, "")) {
                output.encodeStringElement(serialDesc, 0, self.title_markdown);
            }
            if (!Intrinsics.areEqual(self.subtitle_markdown, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle_markdown);
            }
            String str = self.disclaimer_markdown;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            LottieInfoDto lottieInfoDto = self.lottie_info;
            if (lottieInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, LottieInfoDto.Serializer.INSTANCE, lottieInfoDto);
            }
            ImageInfoDto imageInfoDto = self.image_info;
            if (imageInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ImageInfoDto.Serializer.INSTANCE, imageInfoDto);
            }
            ThemeDto themeDto = self.theme;
            if (themeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ThemeDto.Serializer.INSTANCE, themeDto);
            }
        }

        public Surrogate(String title_markdown, String subtitle_markdown, String str, LottieInfoDto lottieInfoDto, ImageInfoDto imageInfoDto, ThemeDto themeDto) {
            Intrinsics.checkNotNullParameter(title_markdown, "title_markdown");
            Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
            this.title_markdown = title_markdown;
            this.subtitle_markdown = subtitle_markdown;
            this.disclaimer_markdown = str;
            this.lottie_info = lottieInfoDto;
            this.image_info = imageInfoDto;
            this.theme = themeDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, LottieInfoDto lottieInfoDto, ImageInfoDto imageInfoDto, ThemeDto themeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : lottieInfoDto, (i & 16) != 0 ? null : imageInfoDto, (i & 32) != 0 ? null : themeDto);
        }

        public final String getTitle_markdown() {
            return this.title_markdown;
        }

        public final String getSubtitle_markdown() {
            return this.subtitle_markdown;
        }

        public final String getDisclaimer_markdown() {
            return this.disclaimer_markdown;
        }

        public final LottieInfoDto getLottie_info() {
            return this.lottie_info;
        }

        public final ImageInfoDto getImage_info() {
            return this.image_info;
        }

        public final ThemeDto getTheme() {
            return this.theme;
        }
    }

    /* compiled from: PageDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/PageDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lfutures_onboarding_value_props/proto/v1/PageDto;", "Lfutures_onboarding_value_props/proto/v1/Page;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lfutures_onboarding_value_props/proto/v1/PageDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PageDto, Page> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PageDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PageDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PageDto> getBinaryBase64Serializer() {
            return (KSerializer) PageDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Page> getProtoAdapter() {
            return Page.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PageDto getZeroValue() {
            return PageDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PageDto fromProto(Page proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title_markdown = proto.getTitle_markdown();
            String subtitle_markdown = proto.getSubtitle_markdown();
            String disclaimer_markdown = proto.getDisclaimer_markdown();
            LottieInfo lottie_info = proto.getLottie_info();
            DefaultConstructorMarker defaultConstructorMarker = null;
            LottieInfoDto lottieInfoDtoFromProto = lottie_info != null ? LottieInfoDto.INSTANCE.fromProto(lottie_info) : null;
            ImageInfo image_info = proto.getImage_info();
            ImageInfoDto imageInfoDtoFromProto = image_info != null ? ImageInfoDto.INSTANCE.fromProto(image_info) : null;
            Theme theme = proto.getTheme();
            return new PageDto(new Surrogate(title_markdown, subtitle_markdown, disclaimer_markdown, lottieInfoDtoFromProto, imageInfoDtoFromProto, theme != null ? ThemeDto.INSTANCE.fromProto(theme) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: futures_onboarding_value_props.proto.v1.PageDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PageDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PageDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PageDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/PageDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lfutures_onboarding_value_props/proto/v1/PageDto;", "<init>", "()V", "surrogateSerializer", "Lfutures_onboarding_value_props/proto/v1/PageDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PageDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/futures_onboarding_value_props.proto.v1.Page", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PageDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PageDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PageDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PageDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/PageDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "futures_onboarding_value_props.proto.v1.PageDto";
        }
    }
}
