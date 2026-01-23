package gold_flow.proto.p466v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import gold_flow.proto.p466v1.GoldValuePropsInfoTagDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: WebSidebarContentDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008d\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006."}, m3636d2 = {"Lgold_flow/proto/v1/WebSidebarContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/WebSidebarContent;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/WebSidebarContentDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/WebSidebarContentDto$Surrogate;)V", "", "title", "Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "info_tag", "subtitle_markdown", "footer_image_url", "", "footer_image_width", "footer_image_height", "background_color", "web_logo_name", "web_logo_color", "title_color", "", "is_full_bleed", "(Ljava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "toProto", "()Lgold_flow/proto/v1/WebSidebarContent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/WebSidebarContentDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class WebSidebarContentDto implements Dto3<WebSidebarContent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<WebSidebarContentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WebSidebarContentDto, WebSidebarContent>> binaryBase64Serializer$delegate;
    private static final WebSidebarContentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ WebSidebarContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WebSidebarContentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ WebSidebarContentDto(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : goldValuePropsInfoTagDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : bool);
    }

    public WebSidebarContentDto(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, Boolean bool) {
        this(new Surrogate(str, goldValuePropsInfoTagDto, str2, str3, num, num2, str4, str5, str6, str7, bool));
    }

    @Override // com.robinhood.idl.Dto
    public WebSidebarContent toProto() {
        String title = this.surrogate.getTitle();
        GoldValuePropsInfoTagDto info_tag = this.surrogate.getInfo_tag();
        return new WebSidebarContent(title, info_tag != null ? info_tag.toProto() : null, this.surrogate.getSubtitle_markdown(), this.surrogate.getFooter_image_url(), this.surrogate.getFooter_image_width(), this.surrogate.getFooter_image_height(), this.surrogate.getBackground_color(), this.surrogate.getWeb_logo_name(), this.surrogate.getWeb_logo_color(), this.surrogate.getTitle_color(), this.surrogate.getIs_full_bleed(), null, 2048, null);
    }

    public String toString() {
        return "[WebSidebarContentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof WebSidebarContentDto) && Intrinsics.areEqual(((WebSidebarContentDto) other).surrogate, this.surrogate);
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
    /* compiled from: WebSidebarContentDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002HGB©\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0019\b\u0002\u0010\r\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010$R1\u0010\f\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R1\u0010\r\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\b;\u0010-\u001a\u0004\b:\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010*\u0012\u0004\b=\u0010-\u001a\u0004\b<\u0010$R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010*\u0012\u0004\b?\u0010-\u001a\u0004\b>\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010*\u0012\u0004\bA\u0010-\u001a\u0004\b@\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010*\u0012\u0004\bC\u0010-\u001a\u0004\bB\u0010$R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010D\u0012\u0004\bF\u0010-\u001a\u0004\b\u0013\u0010E¨\u0006I"}, m3636d2 = {"Lgold_flow/proto/v1/WebSidebarContentDto$Surrogate;", "", "", "title", "Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "info_tag", "subtitle_markdown", "footer_image_url", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "footer_image_width", "footer_image_height", "background_color", "web_logo_name", "web_logo_color", "title_color", "", "is_full_bleed", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/WebSidebarContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "getInfo_tag", "()Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "getInfo_tag$annotations", "getSubtitle_markdown", "getSubtitle_markdown$annotations", "getFooter_image_url", "getFooter_image_url$annotations", "Ljava/lang/Integer;", "getFooter_image_width", "()Ljava/lang/Integer;", "getFooter_image_width$annotations", "getFooter_image_height", "getFooter_image_height$annotations", "getBackground_color", "getBackground_color$annotations", "getWeb_logo_name", "getWeb_logo_name$annotations", "getWeb_logo_color", "getWeb_logo_color$annotations", "getTitle_color", "getTitle_color$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "is_full_bleed$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String background_color;
        private final Integer footer_image_height;
        private final String footer_image_url;
        private final Integer footer_image_width;
        private final GoldValuePropsInfoTagDto info_tag;
        private final Boolean is_full_bleed;
        private final String subtitle_markdown;
        private final String title;
        private final String title_color;
        private final String web_logo_color;
        private final String web_logo_name;

        public Surrogate() {
            this((String) null, (GoldValuePropsInfoTagDto) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.info_tag, surrogate.info_tag) && Intrinsics.areEqual(this.subtitle_markdown, surrogate.subtitle_markdown) && Intrinsics.areEqual(this.footer_image_url, surrogate.footer_image_url) && Intrinsics.areEqual(this.footer_image_width, surrogate.footer_image_width) && Intrinsics.areEqual(this.footer_image_height, surrogate.footer_image_height) && Intrinsics.areEqual(this.background_color, surrogate.background_color) && Intrinsics.areEqual(this.web_logo_name, surrogate.web_logo_name) && Intrinsics.areEqual(this.web_logo_color, surrogate.web_logo_color) && Intrinsics.areEqual(this.title_color, surrogate.title_color) && Intrinsics.areEqual(this.is_full_bleed, surrogate.is_full_bleed);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            GoldValuePropsInfoTagDto goldValuePropsInfoTagDto = this.info_tag;
            int iHashCode2 = (iHashCode + (goldValuePropsInfoTagDto == null ? 0 : goldValuePropsInfoTagDto.hashCode())) * 31;
            String str2 = this.subtitle_markdown;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.footer_image_url;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.footer_image_width;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.footer_image_height;
            int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.background_color;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.web_logo_name;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.web_logo_color;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.title_color;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this.is_full_bleed;
            return iHashCode10 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", info_tag=" + this.info_tag + ", subtitle_markdown=" + this.subtitle_markdown + ", footer_image_url=" + this.footer_image_url + ", footer_image_width=" + this.footer_image_width + ", footer_image_height=" + this.footer_image_height + ", background_color=" + this.background_color + ", web_logo_name=" + this.web_logo_name + ", web_logo_color=" + this.web_logo_color + ", title_color=" + this.title_color + ", is_full_bleed=" + this.is_full_bleed + ")";
        }

        /* compiled from: WebSidebarContentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/WebSidebarContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/WebSidebarContentDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return WebSidebarContentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.info_tag = null;
            } else {
                this.info_tag = goldValuePropsInfoTagDto;
            }
            if ((i & 4) == 0) {
                this.subtitle_markdown = null;
            } else {
                this.subtitle_markdown = str2;
            }
            if ((i & 8) == 0) {
                this.footer_image_url = null;
            } else {
                this.footer_image_url = str3;
            }
            if ((i & 16) == 0) {
                this.footer_image_width = null;
            } else {
                this.footer_image_width = num;
            }
            if ((i & 32) == 0) {
                this.footer_image_height = null;
            } else {
                this.footer_image_height = num2;
            }
            if ((i & 64) == 0) {
                this.background_color = null;
            } else {
                this.background_color = str4;
            }
            if ((i & 128) == 0) {
                this.web_logo_name = null;
            } else {
                this.web_logo_name = str5;
            }
            if ((i & 256) == 0) {
                this.web_logo_color = null;
            } else {
                this.web_logo_color = str6;
            }
            if ((i & 512) == 0) {
                this.title_color = null;
            } else {
                this.title_color = str7;
            }
            if ((i & 1024) == 0) {
                this.is_full_bleed = null;
            } else {
                this.is_full_bleed = bool;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            GoldValuePropsInfoTagDto goldValuePropsInfoTagDto = self.info_tag;
            if (goldValuePropsInfoTagDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, GoldValuePropsInfoTagDto.Serializer.INSTANCE, goldValuePropsInfoTagDto);
            }
            String str2 = self.subtitle_markdown;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.footer_image_url;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str3);
            }
            Integer num = self.footer_image_width;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            Integer num2 = self.footer_image_height;
            if (num2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, num2);
            }
            String str4 = self.background_color;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.web_logo_name;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str5);
            }
            String str6 = self.web_logo_color;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str6);
            }
            String str7 = self.title_color;
            if (str7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str7);
            }
            Boolean bool = self.is_full_bleed;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, BooleanSerializer.INSTANCE, bool);
            }
        }

        public Surrogate(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, Boolean bool) {
            this.title = str;
            this.info_tag = goldValuePropsInfoTagDto;
            this.subtitle_markdown = str2;
            this.footer_image_url = str3;
            this.footer_image_width = num;
            this.footer_image_height = num2;
            this.background_color = str4;
            this.web_logo_name = str5;
            this.web_logo_color = str6;
            this.title_color = str7;
            this.is_full_bleed = bool;
        }

        public /* synthetic */ Surrogate(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : goldValuePropsInfoTagDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : bool);
        }

        public final String getTitle() {
            return this.title;
        }

        public final GoldValuePropsInfoTagDto getInfo_tag() {
            return this.info_tag;
        }

        public final String getSubtitle_markdown() {
            return this.subtitle_markdown;
        }

        public final String getFooter_image_url() {
            return this.footer_image_url;
        }

        public final Integer getFooter_image_width() {
            return this.footer_image_width;
        }

        public final Integer getFooter_image_height() {
            return this.footer_image_height;
        }

        public final String getBackground_color() {
            return this.background_color;
        }

        public final String getWeb_logo_name() {
            return this.web_logo_name;
        }

        public final String getWeb_logo_color() {
            return this.web_logo_color;
        }

        public final String getTitle_color() {
            return this.title_color;
        }

        /* renamed from: is_full_bleed, reason: from getter */
        public final Boolean getIs_full_bleed() {
            return this.is_full_bleed;
        }
    }

    /* compiled from: WebSidebarContentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/WebSidebarContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/WebSidebarContentDto;", "Lgold_flow/proto/v1/WebSidebarContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/WebSidebarContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<WebSidebarContentDto, WebSidebarContent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WebSidebarContentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WebSidebarContentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WebSidebarContentDto> getBinaryBase64Serializer() {
            return (KSerializer) WebSidebarContentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WebSidebarContent> getProtoAdapter() {
            return WebSidebarContent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WebSidebarContentDto getZeroValue() {
            return WebSidebarContentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WebSidebarContentDto fromProto(WebSidebarContent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            GoldValuePropsInfoTag info_tag = proto.getInfo_tag();
            return new WebSidebarContentDto(new Surrogate(title, info_tag != null ? GoldValuePropsInfoTagDto.INSTANCE.fromProto(info_tag) : null, proto.getSubtitle_markdown(), proto.getFooter_image_url(), proto.getFooter_image_width(), proto.getFooter_image_height(), proto.getBackground_color(), proto.getWeb_logo_name(), proto.getWeb_logo_color(), proto.getTitle_color(), proto.getIs_full_bleed()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.WebSidebarContentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebSidebarContentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new WebSidebarContentDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: WebSidebarContentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/WebSidebarContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/WebSidebarContentDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/WebSidebarContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<WebSidebarContentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.WebSidebarContent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WebSidebarContentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public WebSidebarContentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new WebSidebarContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: WebSidebarContentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/WebSidebarContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.WebSidebarContentDto";
        }
    }
}
