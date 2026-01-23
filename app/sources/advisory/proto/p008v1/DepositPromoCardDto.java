package advisory.proto.p008v1;

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
import rh_server_driven_ui.p531v1.ThemedColor;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: DepositPromoCardDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/DepositPromoCard;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/DepositPromoCardDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/DepositPromoCardDto$Surrogate;)V", "", "image_url_light", "image_url_dark", "title", "cta_title", "Lrh_server_driven_ui/v1/ThemedColorDto;", "cta_color", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "toProto", "()Ladvisory/proto/v1/DepositPromoCard;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/DepositPromoCardDto$Surrogate;", "getImage_url_light", "getImage_url_dark", "getTitle", "getCta_title", "getCta_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class DepositPromoCardDto implements Dto3<DepositPromoCard>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DepositPromoCardDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DepositPromoCardDto, DepositPromoCard>> binaryBase64Serializer$delegate;
    private static final DepositPromoCardDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DepositPromoCardDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DepositPromoCardDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getImage_url_light() {
        return this.surrogate.getImage_url_light();
    }

    public final String getImage_url_dark() {
        return this.surrogate.getImage_url_dark();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getCta_title() {
        return this.surrogate.getCta_title();
    }

    public final ThemedColorDto getCta_color() {
        return this.surrogate.getCta_color();
    }

    public /* synthetic */ DepositPromoCardDto(String str, String str2, String str3, String str4, ThemedColorDto themedColorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : themedColorDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DepositPromoCardDto(String image_url_light, String image_url_dark, String title, String cta_title, ThemedColorDto themedColorDto) {
        this(new Surrogate(image_url_light, image_url_dark, title, cta_title, themedColorDto));
        Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
        Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta_title, "cta_title");
    }

    @Override // com.robinhood.idl.Dto
    public DepositPromoCard toProto() {
        String image_url_light = this.surrogate.getImage_url_light();
        String image_url_dark = this.surrogate.getImage_url_dark();
        String title = this.surrogate.getTitle();
        String cta_title = this.surrogate.getCta_title();
        ThemedColorDto cta_color = this.surrogate.getCta_color();
        return new DepositPromoCard(image_url_light, image_url_dark, title, cta_title, cta_color != null ? cta_color.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[DepositPromoCardDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DepositPromoCardDto) && Intrinsics.areEqual(((DepositPromoCardDto) other).surrogate, this.surrogate);
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
    /* compiled from: DepositPromoCardDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardDto$Surrogate;", "", "", "image_url_light", "image_url_dark", "title", "cta_title", "Lrh_server_driven_ui/v1/ThemedColorDto;", "cta_color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/DepositPromoCardDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage_url_light", "getImage_url_light$annotations", "()V", "getImage_url_dark", "getImage_url_dark$annotations", "getTitle", "getTitle$annotations", "getCta_title", "getCta_title$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getCta_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getCta_color$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemedColorDto cta_color;
        private final String cta_title;
        private final String image_url_dark;
        private final String image_url_light;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (ThemedColorDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.image_url_light, surrogate.image_url_light) && Intrinsics.areEqual(this.image_url_dark, surrogate.image_url_dark) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.cta_title, surrogate.cta_title) && Intrinsics.areEqual(this.cta_color, surrogate.cta_color);
        }

        public int hashCode() {
            int iHashCode = ((((((this.image_url_light.hashCode() * 31) + this.image_url_dark.hashCode()) * 31) + this.title.hashCode()) * 31) + this.cta_title.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.cta_color;
            return iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode());
        }

        public String toString() {
            return "Surrogate(image_url_light=" + this.image_url_light + ", image_url_dark=" + this.image_url_dark + ", title=" + this.title + ", cta_title=" + this.cta_title + ", cta_color=" + this.cta_color + ")";
        }

        /* compiled from: DepositPromoCardDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/DepositPromoCardDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DepositPromoCardDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, ThemedColorDto themedColorDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.image_url_light = "";
            } else {
                this.image_url_light = str;
            }
            if ((i & 2) == 0) {
                this.image_url_dark = "";
            } else {
                this.image_url_dark = str2;
            }
            if ((i & 4) == 0) {
                this.title = "";
            } else {
                this.title = str3;
            }
            if ((i & 8) == 0) {
                this.cta_title = "";
            } else {
                this.cta_title = str4;
            }
            if ((i & 16) == 0) {
                this.cta_color = null;
            } else {
                this.cta_color = themedColorDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.image_url_light, "")) {
                output.encodeStringElement(serialDesc, 0, self.image_url_light);
            }
            if (!Intrinsics.areEqual(self.image_url_dark, "")) {
                output.encodeStringElement(serialDesc, 1, self.image_url_dark);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 2, self.title);
            }
            if (!Intrinsics.areEqual(self.cta_title, "")) {
                output.encodeStringElement(serialDesc, 3, self.cta_title);
            }
            ThemedColorDto themedColorDto = self.cta_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
        }

        public Surrogate(String image_url_light, String image_url_dark, String title, String cta_title, ThemedColorDto themedColorDto) {
            Intrinsics.checkNotNullParameter(image_url_light, "image_url_light");
            Intrinsics.checkNotNullParameter(image_url_dark, "image_url_dark");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cta_title, "cta_title");
            this.image_url_light = image_url_light;
            this.image_url_dark = image_url_dark;
            this.title = title;
            this.cta_title = cta_title;
            this.cta_color = themedColorDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, ThemedColorDto themedColorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : themedColorDto);
        }

        public final String getImage_url_light() {
            return this.image_url_light;
        }

        public final String getImage_url_dark() {
            return this.image_url_dark;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getCta_title() {
            return this.cta_title;
        }

        public final ThemedColorDto getCta_color() {
            return this.cta_color;
        }
    }

    /* compiled from: DepositPromoCardDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/DepositPromoCardDto;", "Ladvisory/proto/v1/DepositPromoCard;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/DepositPromoCardDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DepositPromoCardDto, DepositPromoCard> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DepositPromoCardDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DepositPromoCardDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DepositPromoCardDto> getBinaryBase64Serializer() {
            return (KSerializer) DepositPromoCardDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DepositPromoCard> getProtoAdapter() {
            return DepositPromoCard.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DepositPromoCardDto getZeroValue() {
            return DepositPromoCardDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DepositPromoCardDto fromProto(DepositPromoCard proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String image_url_light = proto.getImage_url_light();
            String image_url_dark = proto.getImage_url_dark();
            String title = proto.getTitle();
            String cta_title = proto.getCta_title();
            ThemedColor cta_color = proto.getCta_color();
            return new DepositPromoCardDto(new Surrogate(image_url_light, image_url_dark, title, cta_title, cta_color != null ? ThemedColorDto.INSTANCE.fromProto(cta_color) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.DepositPromoCardDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositPromoCardDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DepositPromoCardDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DepositPromoCardDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/DepositPromoCardDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/DepositPromoCardDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<DepositPromoCardDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.DepositPromoCard", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DepositPromoCardDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DepositPromoCardDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DepositPromoCardDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DepositPromoCardDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/DepositPromoCardDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "advisory.proto.v1.DepositPromoCardDto";
        }
    }
}
