package gold_flow.proto.p466v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
import com.squareup.wire.ProtoAdapter;
import com.truelayer.payments.p419ui.utils.TestTags;
import gold_flow.proto.p466v1.CtaDto;
import gold_flow.proto.p466v1.GoldLottieAnimationDto;
import gold_flow.proto.p466v1.GoldPromoAdditionalValuePropsDto;
import gold_flow.proto.p466v1.GoldPromoInfoBannerDto;
import gold_flow.proto.p466v1.GoldPromoPlanSectionDto;
import gold_flow.proto.p466v1.GoldPromoPlanSelectionSectionDto;
import gold_flow.proto.p466v1.GoldValuePropsInfoTagDto;
import gold_flow.proto.p466v1.StreamValuePropsPromoContentResponseDto;
import gold_flow.proto.p466v1.ValuePropDto;
import gold_flow.proto.p466v1.WebSidebarContentDto;
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

/* compiled from: StreamValuePropsPromoContentResponseDto.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004:9;<B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÙ\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u0006\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020.H\u0016¢\u0006\u0004\b7\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108¨\u0006="}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponse;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$Surrogate;)V", "", "asset_path", "Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "info_tag", "title", "subtitle_markdown", "", "Lgold_flow/proto/v1/ValuePropDto;", "value_props", "Lgold_flow/proto/v1/GoldPromoPlanSelectionSectionDto;", "plan_selection_section", "gold_free_days", "Lgold_flow/proto/v1/GoldPromoAdditionalValuePropsDto;", "additional_value_props", "disclosure_markdown", "cta_disclosure_markdown", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, "logging_identifier", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lgold_flow/proto/v1/GoldLottieAnimationDto;", "header_lottie_animation", "Lgold_flow/proto/v1/GoldPromoPlanSectionDto;", "plan_section", "Lgold_flow/proto/v1/GoldPromoInfoBannerDto;", TestTags.INFO_BANNER, "Lgold_flow/proto/v1/WebSidebarContentDto;", "web_sidebar_content", "(Ljava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgold_flow/proto/v1/GoldPromoPlanSelectionSectionDto;Ljava/lang/String;Lgold_flow/proto/v1/GoldPromoAdditionalValuePropsDto;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/GoldLottieAnimationDto;Lgold_flow/proto/v1/GoldPromoPlanSectionDto;Lgold_flow/proto/v1/GoldPromoInfoBannerDto;Lgold_flow/proto/v1/WebSidebarContentDto;)V", "toProto", "()Lgold_flow/proto/v1/StreamValuePropsPromoContentResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class StreamValuePropsPromoContentResponseDto implements Dto3<StreamValuePropsPromoContentResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamValuePropsPromoContentResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamValuePropsPromoContentResponseDto, StreamValuePropsPromoContentResponse>> binaryBase64Serializer$delegate;
    private static final StreamValuePropsPromoContentResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamValuePropsPromoContentResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamValuePropsPromoContentResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamValuePropsPromoContentResponseDto(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, List list, GoldPromoPlanSelectionSectionDto goldPromoPlanSelectionSectionDto, String str4, GoldPromoAdditionalValuePropsDto goldPromoAdditionalValuePropsDto, String str5, String str6, CtaDto ctaDto, String str7, CtaDto ctaDto2, GoldLottieAnimationDto goldLottieAnimationDto, GoldPromoPlanSectionDto goldPromoPlanSectionDto, GoldPromoInfoBannerDto goldPromoInfoBannerDto, WebSidebarContentDto webSidebarContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : goldValuePropsInfoTagDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : goldPromoPlanSelectionSectionDto, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : goldPromoAdditionalValuePropsDto, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : ctaDto, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : ctaDto2, (i & 8192) != 0 ? null : goldLottieAnimationDto, (i & 16384) != 0 ? null : goldPromoPlanSectionDto, (i & 32768) != 0 ? null : goldPromoInfoBannerDto, (i & 65536) != 0 ? null : webSidebarContentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamValuePropsPromoContentResponseDto(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, List<ValuePropDto> value_props, GoldPromoPlanSelectionSectionDto goldPromoPlanSelectionSectionDto, String str4, GoldPromoAdditionalValuePropsDto goldPromoAdditionalValuePropsDto, String str5, String str6, CtaDto ctaDto, String str7, CtaDto ctaDto2, GoldLottieAnimationDto goldLottieAnimationDto, GoldPromoPlanSectionDto goldPromoPlanSectionDto, GoldPromoInfoBannerDto goldPromoInfoBannerDto, WebSidebarContentDto webSidebarContentDto) {
        this(new Surrogate(str, goldValuePropsInfoTagDto, str2, str3, value_props, goldPromoPlanSelectionSectionDto, str4, goldPromoAdditionalValuePropsDto, str5, str6, ctaDto, str7, ctaDto2, goldLottieAnimationDto, goldPromoPlanSectionDto, goldPromoInfoBannerDto, webSidebarContentDto));
        Intrinsics.checkNotNullParameter(value_props, "value_props");
    }

    @Override // com.robinhood.idl.Dto
    public StreamValuePropsPromoContentResponse toProto() {
        String asset_path = this.surrogate.getAsset_path();
        GoldValuePropsInfoTagDto info_tag = this.surrogate.getInfo_tag();
        GoldValuePropsInfoTag proto = info_tag != null ? info_tag.toProto() : null;
        String title = this.surrogate.getTitle();
        String subtitle_markdown = this.surrogate.getSubtitle_markdown();
        List<ValuePropDto> value_props = this.surrogate.getValue_props();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value_props, 10));
        Iterator<T> it = value_props.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValuePropDto) it.next()).toProto());
        }
        GoldPromoPlanSelectionSectionDto plan_selection_section = this.surrogate.getPlan_selection_section();
        GoldPromoPlanSelectionSection proto2 = plan_selection_section != null ? plan_selection_section.toProto() : null;
        String gold_free_days = this.surrogate.getGold_free_days();
        GoldPromoAdditionalValuePropsDto additional_value_props = this.surrogate.getAdditional_value_props();
        GoldPromoAdditionalValueProps proto3 = additional_value_props != null ? additional_value_props.toProto() : null;
        String disclosure_markdown = this.surrogate.getDisclosure_markdown();
        String cta_disclosure_markdown = this.surrogate.getCta_disclosure_markdown();
        CtaDto cta = this.surrogate.getCta();
        Cta proto4 = cta != null ? cta.toProto() : null;
        String logging_identifier = this.surrogate.getLogging_identifier();
        CtaDto secondary_cta = this.surrogate.getSecondary_cta();
        Cta proto5 = secondary_cta != null ? secondary_cta.toProto() : null;
        GoldLottieAnimationDto header_lottie_animation = this.surrogate.getHeader_lottie_animation();
        GoldLottieAnimation proto6 = header_lottie_animation != null ? header_lottie_animation.toProto() : null;
        GoldPromoPlanSectionDto plan_section = this.surrogate.getPlan_section();
        GoldPromoPlanSection proto7 = plan_section != null ? plan_section.toProto() : null;
        GoldPromoInfoBannerDto info_banner = this.surrogate.getInfo_banner();
        GoldPromoInfoBanner proto8 = info_banner != null ? info_banner.toProto() : null;
        WebSidebarContentDto web_sidebar_content = this.surrogate.getWeb_sidebar_content();
        return new StreamValuePropsPromoContentResponse(asset_path, proto, title, subtitle_markdown, arrayList, proto2, gold_free_days, proto3, disclosure_markdown, cta_disclosure_markdown, proto4, logging_identifier, proto5, proto6, proto7, proto8, web_sidebar_content != null ? web_sidebar_content.toProto() : null, null, 131072, null);
    }

    public String toString() {
        return "[StreamValuePropsPromoContentResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamValuePropsPromoContentResponseDto) && Intrinsics.areEqual(((StreamValuePropsPromoContentResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamValuePropsPromoContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b;\b\u0083\b\u0018\u0000 l2\u00020\u0001:\u0002mlB×\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fBË\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001e\u0010$J'\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020 HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010/R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\b=\u00109\u001a\u0004\b;\u0010<R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010/R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\bA\u00109\u001a\u0004\b@\u0010/R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010B\u0012\u0004\bE\u00109\u001a\u0004\bC\u0010DR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010F\u0012\u0004\bI\u00109\u001a\u0004\bG\u0010HR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\bK\u00109\u001a\u0004\bJ\u0010/R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010L\u0012\u0004\bO\u00109\u001a\u0004\bM\u0010NR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00106\u0012\u0004\bQ\u00109\u001a\u0004\bP\u0010/R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00106\u0012\u0004\bS\u00109\u001a\u0004\bR\u0010/R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010T\u0012\u0004\bW\u00109\u001a\u0004\bU\u0010VR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00106\u0012\u0004\bY\u00109\u001a\u0004\bX\u0010/R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010T\u0012\u0004\b[\u00109\u001a\u0004\bZ\u0010VR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\\\u0012\u0004\b_\u00109\u001a\u0004\b]\u0010^R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010`\u0012\u0004\bc\u00109\u001a\u0004\ba\u0010bR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010d\u0012\u0004\bg\u00109\u001a\u0004\be\u0010fR\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010h\u0012\u0004\bk\u00109\u001a\u0004\bi\u0010j¨\u0006n"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$Surrogate;", "", "", "asset_path", "Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "info_tag", "title", "subtitle_markdown", "", "Lgold_flow/proto/v1/ValuePropDto;", "value_props", "Lgold_flow/proto/v1/GoldPromoPlanSelectionSectionDto;", "plan_selection_section", "gold_free_days", "Lgold_flow/proto/v1/GoldPromoAdditionalValuePropsDto;", "additional_value_props", "disclosure_markdown", "cta_disclosure_markdown", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, "logging_identifier", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lgold_flow/proto/v1/GoldLottieAnimationDto;", "header_lottie_animation", "Lgold_flow/proto/v1/GoldPromoPlanSectionDto;", "plan_section", "Lgold_flow/proto/v1/GoldPromoInfoBannerDto;", TestTags.INFO_BANNER, "Lgold_flow/proto/v1/WebSidebarContentDto;", "web_sidebar_content", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgold_flow/proto/v1/GoldPromoPlanSelectionSectionDto;Ljava/lang/String;Lgold_flow/proto/v1/GoldPromoAdditionalValuePropsDto;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/GoldLottieAnimationDto;Lgold_flow/proto/v1/GoldPromoPlanSectionDto;Lgold_flow/proto/v1/GoldPromoInfoBannerDto;Lgold_flow/proto/v1/WebSidebarContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgold_flow/proto/v1/GoldPromoPlanSelectionSectionDto;Ljava/lang/String;Lgold_flow/proto/v1/GoldPromoAdditionalValuePropsDto;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/GoldLottieAnimationDto;Lgold_flow/proto/v1/GoldPromoPlanSectionDto;Lgold_flow/proto/v1/GoldPromoInfoBannerDto;Lgold_flow/proto/v1/WebSidebarContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsset_path", "getAsset_path$annotations", "()V", "Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "getInfo_tag", "()Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "getInfo_tag$annotations", "getTitle", "getTitle$annotations", "getSubtitle_markdown", "getSubtitle_markdown$annotations", "Ljava/util/List;", "getValue_props", "()Ljava/util/List;", "getValue_props$annotations", "Lgold_flow/proto/v1/GoldPromoPlanSelectionSectionDto;", "getPlan_selection_section", "()Lgold_flow/proto/v1/GoldPromoPlanSelectionSectionDto;", "getPlan_selection_section$annotations", "getGold_free_days", "getGold_free_days$annotations", "Lgold_flow/proto/v1/GoldPromoAdditionalValuePropsDto;", "getAdditional_value_props", "()Lgold_flow/proto/v1/GoldPromoAdditionalValuePropsDto;", "getAdditional_value_props$annotations", "getDisclosure_markdown", "getDisclosure_markdown$annotations", "getCta_disclosure_markdown", "getCta_disclosure_markdown$annotations", "Lgold_flow/proto/v1/CtaDto;", "getCta", "()Lgold_flow/proto/v1/CtaDto;", "getCta$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "getSecondary_cta", "getSecondary_cta$annotations", "Lgold_flow/proto/v1/GoldLottieAnimationDto;", "getHeader_lottie_animation", "()Lgold_flow/proto/v1/GoldLottieAnimationDto;", "getHeader_lottie_animation$annotations", "Lgold_flow/proto/v1/GoldPromoPlanSectionDto;", "getPlan_section", "()Lgold_flow/proto/v1/GoldPromoPlanSectionDto;", "getPlan_section$annotations", "Lgold_flow/proto/v1/GoldPromoInfoBannerDto;", "getInfo_banner", "()Lgold_flow/proto/v1/GoldPromoInfoBannerDto;", "getInfo_banner$annotations", "Lgold_flow/proto/v1/WebSidebarContentDto;", "getWeb_sidebar_content", "()Lgold_flow/proto/v1/WebSidebarContentDto;", "getWeb_sidebar_content$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final GoldPromoAdditionalValuePropsDto additional_value_props;
        private final String asset_path;
        private final CtaDto cta;
        private final String cta_disclosure_markdown;
        private final String disclosure_markdown;
        private final String gold_free_days;
        private final GoldLottieAnimationDto header_lottie_animation;
        private final GoldPromoInfoBannerDto info_banner;
        private final GoldValuePropsInfoTagDto info_tag;
        private final String logging_identifier;
        private final GoldPromoPlanSectionDto plan_section;
        private final GoldPromoPlanSelectionSectionDto plan_selection_section;
        private final CtaDto secondary_cta;
        private final String subtitle_markdown;
        private final String title;
        private final List<ValuePropDto> value_props;
        private final WebSidebarContentDto web_sidebar_content;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gold_flow.proto.v1.StreamValuePropsPromoContentResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamValuePropsPromoContentResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (GoldValuePropsInfoTagDto) null, (String) null, (String) null, (List) null, (GoldPromoPlanSelectionSectionDto) null, (String) null, (GoldPromoAdditionalValuePropsDto) null, (String) null, (String) null, (CtaDto) null, (String) null, (CtaDto) null, (GoldLottieAnimationDto) null, (GoldPromoPlanSectionDto) null, (GoldPromoInfoBannerDto) null, (WebSidebarContentDto) null, 131071, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ValuePropDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.asset_path, surrogate.asset_path) && Intrinsics.areEqual(this.info_tag, surrogate.info_tag) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle_markdown, surrogate.subtitle_markdown) && Intrinsics.areEqual(this.value_props, surrogate.value_props) && Intrinsics.areEqual(this.plan_selection_section, surrogate.plan_selection_section) && Intrinsics.areEqual(this.gold_free_days, surrogate.gold_free_days) && Intrinsics.areEqual(this.additional_value_props, surrogate.additional_value_props) && Intrinsics.areEqual(this.disclosure_markdown, surrogate.disclosure_markdown) && Intrinsics.areEqual(this.cta_disclosure_markdown, surrogate.cta_disclosure_markdown) && Intrinsics.areEqual(this.cta, surrogate.cta) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.secondary_cta, surrogate.secondary_cta) && Intrinsics.areEqual(this.header_lottie_animation, surrogate.header_lottie_animation) && Intrinsics.areEqual(this.plan_section, surrogate.plan_section) && Intrinsics.areEqual(this.info_banner, surrogate.info_banner) && Intrinsics.areEqual(this.web_sidebar_content, surrogate.web_sidebar_content);
        }

        public int hashCode() {
            String str = this.asset_path;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            GoldValuePropsInfoTagDto goldValuePropsInfoTagDto = this.info_tag;
            int iHashCode2 = (iHashCode + (goldValuePropsInfoTagDto == null ? 0 : goldValuePropsInfoTagDto.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle_markdown;
            int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.value_props.hashCode()) * 31;
            GoldPromoPlanSelectionSectionDto goldPromoPlanSelectionSectionDto = this.plan_selection_section;
            int iHashCode5 = (iHashCode4 + (goldPromoPlanSelectionSectionDto == null ? 0 : goldPromoPlanSelectionSectionDto.hashCode())) * 31;
            String str4 = this.gold_free_days;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            GoldPromoAdditionalValuePropsDto goldPromoAdditionalValuePropsDto = this.additional_value_props;
            int iHashCode7 = (iHashCode6 + (goldPromoAdditionalValuePropsDto == null ? 0 : goldPromoAdditionalValuePropsDto.hashCode())) * 31;
            String str5 = this.disclosure_markdown;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.cta_disclosure_markdown;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            CtaDto ctaDto = this.cta;
            int iHashCode10 = (iHashCode9 + (ctaDto == null ? 0 : ctaDto.hashCode())) * 31;
            String str7 = this.logging_identifier;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            CtaDto ctaDto2 = this.secondary_cta;
            int iHashCode12 = (iHashCode11 + (ctaDto2 == null ? 0 : ctaDto2.hashCode())) * 31;
            GoldLottieAnimationDto goldLottieAnimationDto = this.header_lottie_animation;
            int iHashCode13 = (iHashCode12 + (goldLottieAnimationDto == null ? 0 : goldLottieAnimationDto.hashCode())) * 31;
            GoldPromoPlanSectionDto goldPromoPlanSectionDto = this.plan_section;
            int iHashCode14 = (iHashCode13 + (goldPromoPlanSectionDto == null ? 0 : goldPromoPlanSectionDto.hashCode())) * 31;
            GoldPromoInfoBannerDto goldPromoInfoBannerDto = this.info_banner;
            int iHashCode15 = (iHashCode14 + (goldPromoInfoBannerDto == null ? 0 : goldPromoInfoBannerDto.hashCode())) * 31;
            WebSidebarContentDto webSidebarContentDto = this.web_sidebar_content;
            return iHashCode15 + (webSidebarContentDto != null ? webSidebarContentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(asset_path=" + this.asset_path + ", info_tag=" + this.info_tag + ", title=" + this.title + ", subtitle_markdown=" + this.subtitle_markdown + ", value_props=" + this.value_props + ", plan_selection_section=" + this.plan_selection_section + ", gold_free_days=" + this.gold_free_days + ", additional_value_props=" + this.additional_value_props + ", disclosure_markdown=" + this.disclosure_markdown + ", cta_disclosure_markdown=" + this.cta_disclosure_markdown + ", cta=" + this.cta + ", logging_identifier=" + this.logging_identifier + ", secondary_cta=" + this.secondary_cta + ", header_lottie_animation=" + this.header_lottie_animation + ", plan_section=" + this.plan_section + ", info_banner=" + this.info_banner + ", web_sidebar_content=" + this.web_sidebar_content + ")";
        }

        /* compiled from: StreamValuePropsPromoContentResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamValuePropsPromoContentResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, List list, GoldPromoPlanSelectionSectionDto goldPromoPlanSelectionSectionDto, String str4, GoldPromoAdditionalValuePropsDto goldPromoAdditionalValuePropsDto, String str5, String str6, CtaDto ctaDto, String str7, CtaDto ctaDto2, GoldLottieAnimationDto goldLottieAnimationDto, GoldPromoPlanSectionDto goldPromoPlanSectionDto, GoldPromoInfoBannerDto goldPromoInfoBannerDto, WebSidebarContentDto webSidebarContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.asset_path = null;
            } else {
                this.asset_path = str;
            }
            if ((i & 2) == 0) {
                this.info_tag = null;
            } else {
                this.info_tag = goldValuePropsInfoTagDto;
            }
            if ((i & 4) == 0) {
                this.title = null;
            } else {
                this.title = str2;
            }
            if ((i & 8) == 0) {
                this.subtitle_markdown = null;
            } else {
                this.subtitle_markdown = str3;
            }
            if ((i & 16) == 0) {
                this.value_props = CollectionsKt.emptyList();
            } else {
                this.value_props = list;
            }
            if ((i & 32) == 0) {
                this.plan_selection_section = null;
            } else {
                this.plan_selection_section = goldPromoPlanSelectionSectionDto;
            }
            if ((i & 64) == 0) {
                this.gold_free_days = null;
            } else {
                this.gold_free_days = str4;
            }
            if ((i & 128) == 0) {
                this.additional_value_props = null;
            } else {
                this.additional_value_props = goldPromoAdditionalValuePropsDto;
            }
            if ((i & 256) == 0) {
                this.disclosure_markdown = null;
            } else {
                this.disclosure_markdown = str5;
            }
            if ((i & 512) == 0) {
                this.cta_disclosure_markdown = null;
            } else {
                this.cta_disclosure_markdown = str6;
            }
            if ((i & 1024) == 0) {
                this.cta = null;
            } else {
                this.cta = ctaDto;
            }
            if ((i & 2048) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str7;
            }
            if ((i & 4096) == 0) {
                this.secondary_cta = null;
            } else {
                this.secondary_cta = ctaDto2;
            }
            if ((i & 8192) == 0) {
                this.header_lottie_animation = null;
            } else {
                this.header_lottie_animation = goldLottieAnimationDto;
            }
            if ((i & 16384) == 0) {
                this.plan_section = null;
            } else {
                this.plan_section = goldPromoPlanSectionDto;
            }
            if ((32768 & i) == 0) {
                this.info_banner = null;
            } else {
                this.info_banner = goldPromoInfoBannerDto;
            }
            if ((i & 65536) == 0) {
                this.web_sidebar_content = null;
            } else {
                this.web_sidebar_content = webSidebarContentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            String str = self.asset_path;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            GoldValuePropsInfoTagDto goldValuePropsInfoTagDto = self.info_tag;
            if (goldValuePropsInfoTagDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, GoldValuePropsInfoTagDto.Serializer.INSTANCE, goldValuePropsInfoTagDto);
            }
            String str2 = self.title;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.subtitle_markdown;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str3);
            }
            if (!Intrinsics.areEqual(self.value_props, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.value_props);
            }
            GoldPromoPlanSelectionSectionDto goldPromoPlanSelectionSectionDto = self.plan_selection_section;
            if (goldPromoPlanSelectionSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, GoldPromoPlanSelectionSectionDto.Serializer.INSTANCE, goldPromoPlanSelectionSectionDto);
            }
            String str4 = self.gold_free_days;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str4);
            }
            GoldPromoAdditionalValuePropsDto goldPromoAdditionalValuePropsDto = self.additional_value_props;
            if (goldPromoAdditionalValuePropsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, GoldPromoAdditionalValuePropsDto.Serializer.INSTANCE, goldPromoAdditionalValuePropsDto);
            }
            String str5 = self.disclosure_markdown;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str5);
            }
            String str6 = self.cta_disclosure_markdown;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str6);
            }
            CtaDto ctaDto = self.cta;
            if (ctaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, CtaDto.Serializer.INSTANCE, ctaDto);
            }
            String str7 = self.logging_identifier;
            if (str7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str7);
            }
            CtaDto ctaDto2 = self.secondary_cta;
            if (ctaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, CtaDto.Serializer.INSTANCE, ctaDto2);
            }
            GoldLottieAnimationDto goldLottieAnimationDto = self.header_lottie_animation;
            if (goldLottieAnimationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, GoldLottieAnimationDto.Serializer.INSTANCE, goldLottieAnimationDto);
            }
            GoldPromoPlanSectionDto goldPromoPlanSectionDto = self.plan_section;
            if (goldPromoPlanSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, GoldPromoPlanSectionDto.Serializer.INSTANCE, goldPromoPlanSectionDto);
            }
            GoldPromoInfoBannerDto goldPromoInfoBannerDto = self.info_banner;
            if (goldPromoInfoBannerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, GoldPromoInfoBannerDto.Serializer.INSTANCE, goldPromoInfoBannerDto);
            }
            WebSidebarContentDto webSidebarContentDto = self.web_sidebar_content;
            if (webSidebarContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, WebSidebarContentDto.Serializer.INSTANCE, webSidebarContentDto);
            }
        }

        public Surrogate(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, List<ValuePropDto> value_props, GoldPromoPlanSelectionSectionDto goldPromoPlanSelectionSectionDto, String str4, GoldPromoAdditionalValuePropsDto goldPromoAdditionalValuePropsDto, String str5, String str6, CtaDto ctaDto, String str7, CtaDto ctaDto2, GoldLottieAnimationDto goldLottieAnimationDto, GoldPromoPlanSectionDto goldPromoPlanSectionDto, GoldPromoInfoBannerDto goldPromoInfoBannerDto, WebSidebarContentDto webSidebarContentDto) {
            Intrinsics.checkNotNullParameter(value_props, "value_props");
            this.asset_path = str;
            this.info_tag = goldValuePropsInfoTagDto;
            this.title = str2;
            this.subtitle_markdown = str3;
            this.value_props = value_props;
            this.plan_selection_section = goldPromoPlanSelectionSectionDto;
            this.gold_free_days = str4;
            this.additional_value_props = goldPromoAdditionalValuePropsDto;
            this.disclosure_markdown = str5;
            this.cta_disclosure_markdown = str6;
            this.cta = ctaDto;
            this.logging_identifier = str7;
            this.secondary_cta = ctaDto2;
            this.header_lottie_animation = goldLottieAnimationDto;
            this.plan_section = goldPromoPlanSectionDto;
            this.info_banner = goldPromoInfoBannerDto;
            this.web_sidebar_content = webSidebarContentDto;
        }

        public final String getAsset_path() {
            return this.asset_path;
        }

        public final GoldValuePropsInfoTagDto getInfo_tag() {
            return this.info_tag;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle_markdown() {
            return this.subtitle_markdown;
        }

        public final List<ValuePropDto> getValue_props() {
            return this.value_props;
        }

        public /* synthetic */ Surrogate(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, List list, GoldPromoPlanSelectionSectionDto goldPromoPlanSelectionSectionDto, String str4, GoldPromoAdditionalValuePropsDto goldPromoAdditionalValuePropsDto, String str5, String str6, CtaDto ctaDto, String str7, CtaDto ctaDto2, GoldLottieAnimationDto goldLottieAnimationDto, GoldPromoPlanSectionDto goldPromoPlanSectionDto, GoldPromoInfoBannerDto goldPromoInfoBannerDto, WebSidebarContentDto webSidebarContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : goldValuePropsInfoTagDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : goldPromoPlanSelectionSectionDto, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : goldPromoAdditionalValuePropsDto, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : ctaDto, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : ctaDto2, (i & 8192) != 0 ? null : goldLottieAnimationDto, (i & 16384) != 0 ? null : goldPromoPlanSectionDto, (i & 32768) != 0 ? null : goldPromoInfoBannerDto, (i & 65536) != 0 ? null : webSidebarContentDto);
        }

        public final GoldPromoPlanSelectionSectionDto getPlan_selection_section() {
            return this.plan_selection_section;
        }

        public final String getGold_free_days() {
            return this.gold_free_days;
        }

        public final GoldPromoAdditionalValuePropsDto getAdditional_value_props() {
            return this.additional_value_props;
        }

        public final String getDisclosure_markdown() {
            return this.disclosure_markdown;
        }

        public final String getCta_disclosure_markdown() {
            return this.cta_disclosure_markdown;
        }

        public final CtaDto getCta() {
            return this.cta;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final CtaDto getSecondary_cta() {
            return this.secondary_cta;
        }

        public final GoldLottieAnimationDto getHeader_lottie_animation() {
            return this.header_lottie_animation;
        }

        public final GoldPromoPlanSectionDto getPlan_section() {
            return this.plan_section;
        }

        public final GoldPromoInfoBannerDto getInfo_banner() {
            return this.info_banner;
        }

        public final WebSidebarContentDto getWeb_sidebar_content() {
            return this.web_sidebar_content;
        }
    }

    /* compiled from: StreamValuePropsPromoContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamValuePropsPromoContentResponseDto, StreamValuePropsPromoContentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamValuePropsPromoContentResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamValuePropsPromoContentResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamValuePropsPromoContentResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamValuePropsPromoContentResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamValuePropsPromoContentResponse> getProtoAdapter() {
            return StreamValuePropsPromoContentResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamValuePropsPromoContentResponseDto getZeroValue() {
            return StreamValuePropsPromoContentResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamValuePropsPromoContentResponseDto fromProto(StreamValuePropsPromoContentResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String asset_path = proto.getAsset_path();
            GoldValuePropsInfoTag info_tag = proto.getInfo_tag();
            GoldValuePropsInfoTagDto goldValuePropsInfoTagDtoFromProto = info_tag != null ? GoldValuePropsInfoTagDto.INSTANCE.fromProto(info_tag) : null;
            String title = proto.getTitle();
            String subtitle_markdown = proto.getSubtitle_markdown();
            List<ValueProp> value_props = proto.getValue_props();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value_props, 10));
            Iterator<T> it = value_props.iterator();
            while (it.hasNext()) {
                arrayList.add(ValuePropDto.INSTANCE.fromProto((ValueProp) it.next()));
            }
            GoldPromoPlanSelectionSection plan_selection_section = proto.getPlan_selection_section();
            GoldPromoPlanSelectionSectionDto goldPromoPlanSelectionSectionDtoFromProto = plan_selection_section != null ? GoldPromoPlanSelectionSectionDto.INSTANCE.fromProto(plan_selection_section) : null;
            String gold_free_days = proto.getGold_free_days();
            GoldPromoAdditionalValueProps additional_value_props = proto.getAdditional_value_props();
            GoldPromoAdditionalValuePropsDto goldPromoAdditionalValuePropsDtoFromProto = additional_value_props != null ? GoldPromoAdditionalValuePropsDto.INSTANCE.fromProto(additional_value_props) : null;
            String disclosure_markdown = proto.getDisclosure_markdown();
            String cta_disclosure_markdown = proto.getCta_disclosure_markdown();
            Cta cta = proto.getCta();
            CtaDto ctaDtoFromProto = cta != null ? CtaDto.INSTANCE.fromProto(cta) : null;
            String logging_identifier = proto.getLogging_identifier();
            Cta secondary_cta = proto.getSecondary_cta();
            CtaDto ctaDtoFromProto2 = secondary_cta != null ? CtaDto.INSTANCE.fromProto(secondary_cta) : null;
            GoldLottieAnimation header_lottie_animation = proto.getHeader_lottie_animation();
            GoldLottieAnimationDto goldLottieAnimationDtoFromProto = header_lottie_animation != null ? GoldLottieAnimationDto.INSTANCE.fromProto(header_lottie_animation) : null;
            GoldPromoPlanSection plan_section = proto.getPlan_section();
            GoldValuePropsInfoTagDto goldValuePropsInfoTagDto = goldValuePropsInfoTagDtoFromProto;
            GoldPromoPlanSectionDto goldPromoPlanSectionDtoFromProto = plan_section != null ? GoldPromoPlanSectionDto.INSTANCE.fromProto(plan_section) : null;
            GoldPromoInfoBanner info_banner = proto.getInfo_banner();
            GoldPromoPlanSectionDto goldPromoPlanSectionDto = goldPromoPlanSectionDtoFromProto;
            GoldPromoInfoBannerDto goldPromoInfoBannerDtoFromProto = info_banner != null ? GoldPromoInfoBannerDto.INSTANCE.fromProto(info_banner) : null;
            WebSidebarContent web_sidebar_content = proto.getWeb_sidebar_content();
            return new StreamValuePropsPromoContentResponseDto(new Surrogate(asset_path, goldValuePropsInfoTagDto, title, subtitle_markdown, arrayList, goldPromoPlanSelectionSectionDtoFromProto, gold_free_days, goldPromoAdditionalValuePropsDtoFromProto, disclosure_markdown, cta_disclosure_markdown, ctaDtoFromProto, logging_identifier, ctaDtoFromProto2, goldLottieAnimationDtoFromProto, goldPromoPlanSectionDto, goldPromoInfoBannerDtoFromProto, web_sidebar_content != null ? WebSidebarContentDto.INSTANCE.fromProto(web_sidebar_content) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.StreamValuePropsPromoContentResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamValuePropsPromoContentResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new StreamValuePropsPromoContentResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamValuePropsPromoContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<StreamValuePropsPromoContentResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.StreamValuePropsPromoContentResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamValuePropsPromoContentResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamValuePropsPromoContentResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamValuePropsPromoContentResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamValuePropsPromoContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.StreamValuePropsPromoContentResponseDto";
        }
    }
}
