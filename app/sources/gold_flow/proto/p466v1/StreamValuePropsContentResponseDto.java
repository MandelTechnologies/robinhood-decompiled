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
import com.squareup.wire.ProtoAdapter;
import gold_flow.proto.p466v1.CtaDto;
import gold_flow.proto.p466v1.GoldPlanSelectionSectionDto;
import gold_flow.proto.p466v1.GoldValuePropsInfoTagDto;
import gold_flow.proto.p466v1.StreamValuePropsContentResponseDto;
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

/* compiled from: StreamValuePropsContentResponseDto.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B©\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0006\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020&H\u0016¢\u0006\u0004\b/\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100¨\u00065"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsContentResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/StreamValuePropsContentResponse;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$Surrogate;)V", "", "image_path", "Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "info_tag", "title", "subtitle_markdown", "", "Lgold_flow/proto/v1/ValuePropDto;", "value_props", "gold_monthly_cost", "gold_free_days", "Lgold_flow/proto/v1/CtaDto;", "learn_more_cta", "disclosure_markdown", AccountOverviewOptionsSettingCard4.CTA, "Lgold_flow/proto/v1/GoldPlanSelectionSectionDto;", "plan_selection_section", "cta_disclosure_markdown", "Lgold_flow/proto/v1/WebSidebarContentDto;", "web_sidebar_content", "(Ljava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/GoldPlanSelectionSectionDto;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContentDto;)V", "toProto", "()Lgold_flow/proto/v1/StreamValuePropsContentResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class StreamValuePropsContentResponseDto implements Dto3<StreamValuePropsContentResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamValuePropsContentResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamValuePropsContentResponseDto, StreamValuePropsContentResponse>> binaryBase64Serializer$delegate;
    private static final StreamValuePropsContentResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamValuePropsContentResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamValuePropsContentResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamValuePropsContentResponseDto(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, List list, String str4, String str5, CtaDto ctaDto, String str6, CtaDto ctaDto2, GoldPlanSelectionSectionDto goldPlanSelectionSectionDto, String str7, WebSidebarContentDto webSidebarContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : goldValuePropsInfoTagDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : ctaDto, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : ctaDto2, (i & 1024) != 0 ? null : goldPlanSelectionSectionDto, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : webSidebarContentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamValuePropsContentResponseDto(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, List<ValuePropDto> value_props, String str4, String str5, CtaDto ctaDto, String str6, CtaDto ctaDto2, GoldPlanSelectionSectionDto goldPlanSelectionSectionDto, String str7, WebSidebarContentDto webSidebarContentDto) {
        this(new Surrogate(str, goldValuePropsInfoTagDto, str2, str3, value_props, str4, str5, ctaDto, str6, ctaDto2, goldPlanSelectionSectionDto, str7, webSidebarContentDto));
        Intrinsics.checkNotNullParameter(value_props, "value_props");
    }

    @Override // com.robinhood.idl.Dto
    public StreamValuePropsContentResponse toProto() {
        String image_path = this.surrogate.getImage_path();
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
        String gold_monthly_cost = this.surrogate.getGold_monthly_cost();
        String gold_free_days = this.surrogate.getGold_free_days();
        CtaDto learn_more_cta = this.surrogate.getLearn_more_cta();
        Cta proto2 = learn_more_cta != null ? learn_more_cta.toProto() : null;
        String disclosure_markdown = this.surrogate.getDisclosure_markdown();
        CtaDto cta = this.surrogate.getCta();
        Cta proto3 = cta != null ? cta.toProto() : null;
        GoldPlanSelectionSectionDto plan_selection_section = this.surrogate.getPlan_selection_section();
        GoldPlanSelectionSection proto4 = plan_selection_section != null ? plan_selection_section.toProto() : null;
        String cta_disclosure_markdown = this.surrogate.getCta_disclosure_markdown();
        WebSidebarContentDto web_sidebar_content = this.surrogate.getWeb_sidebar_content();
        return new StreamValuePropsContentResponse(image_path, proto, title, subtitle_markdown, arrayList, gold_monthly_cost, gold_free_days, proto2, disclosure_markdown, proto3, proto4, cta_disclosure_markdown, web_sidebar_content != null ? web_sidebar_content.toProto() : null, null, 8192, null);
    }

    public String toString() {
        return "[StreamValuePropsContentResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamValuePropsContentResponseDto) && Intrinsics.areEqual(((StreamValuePropsContentResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamValuePropsContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b+\b\u0083\b\u0018\u0000 T2\u00020\u0001:\u0002UTB§\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B£\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010'R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010:\u0012\u0004\b=\u00101\u001a\u0004\b;\u0010<R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b?\u00101\u001a\u0004\b>\u0010'R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010.\u0012\u0004\bA\u00101\u001a\u0004\b@\u0010'R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bE\u00101\u001a\u0004\bC\u0010DR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010.\u0012\u0004\bG\u00101\u001a\u0004\bF\u0010'R\"\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010B\u0012\u0004\bI\u00101\u001a\u0004\bH\u0010DR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010J\u0012\u0004\bM\u00101\u001a\u0004\bK\u0010LR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010.\u0012\u0004\bO\u00101\u001a\u0004\bN\u0010'R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010P\u0012\u0004\bS\u00101\u001a\u0004\bQ\u0010R¨\u0006V"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$Surrogate;", "", "", "image_path", "Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "info_tag", "title", "subtitle_markdown", "", "Lgold_flow/proto/v1/ValuePropDto;", "value_props", "gold_monthly_cost", "gold_free_days", "Lgold_flow/proto/v1/CtaDto;", "learn_more_cta", "disclosure_markdown", AccountOverviewOptionsSettingCard4.CTA, "Lgold_flow/proto/v1/GoldPlanSelectionSectionDto;", "plan_selection_section", "cta_disclosure_markdown", "Lgold_flow/proto/v1/WebSidebarContentDto;", "web_sidebar_content", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/GoldPlanSelectionSectionDto;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/GoldPlanSelectionSectionDto;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage_path", "getImage_path$annotations", "()V", "Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "getInfo_tag", "()Lgold_flow/proto/v1/GoldValuePropsInfoTagDto;", "getInfo_tag$annotations", "getTitle", "getTitle$annotations", "getSubtitle_markdown", "getSubtitle_markdown$annotations", "Ljava/util/List;", "getValue_props", "()Ljava/util/List;", "getValue_props$annotations", "getGold_monthly_cost", "getGold_monthly_cost$annotations", "getGold_free_days", "getGold_free_days$annotations", "Lgold_flow/proto/v1/CtaDto;", "getLearn_more_cta", "()Lgold_flow/proto/v1/CtaDto;", "getLearn_more_cta$annotations", "getDisclosure_markdown", "getDisclosure_markdown$annotations", "getCta", "getCta$annotations", "Lgold_flow/proto/v1/GoldPlanSelectionSectionDto;", "getPlan_selection_section", "()Lgold_flow/proto/v1/GoldPlanSelectionSectionDto;", "getPlan_selection_section$annotations", "getCta_disclosure_markdown", "getCta_disclosure_markdown$annotations", "Lgold_flow/proto/v1/WebSidebarContentDto;", "getWeb_sidebar_content", "()Lgold_flow/proto/v1/WebSidebarContentDto;", "getWeb_sidebar_content$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final CtaDto cta;
        private final String cta_disclosure_markdown;
        private final String disclosure_markdown;
        private final String gold_free_days;
        private final String gold_monthly_cost;
        private final String image_path;
        private final GoldValuePropsInfoTagDto info_tag;
        private final CtaDto learn_more_cta;
        private final GoldPlanSelectionSectionDto plan_selection_section;
        private final String subtitle_markdown;
        private final String title;
        private final List<ValuePropDto> value_props;
        private final WebSidebarContentDto web_sidebar_content;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gold_flow.proto.v1.StreamValuePropsContentResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamValuePropsContentResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (GoldValuePropsInfoTagDto) null, (String) null, (String) null, (List) null, (String) null, (String) null, (CtaDto) null, (String) null, (CtaDto) null, (GoldPlanSelectionSectionDto) null, (String) null, (WebSidebarContentDto) null, 8191, (DefaultConstructorMarker) null);
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
            return Intrinsics.areEqual(this.image_path, surrogate.image_path) && Intrinsics.areEqual(this.info_tag, surrogate.info_tag) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle_markdown, surrogate.subtitle_markdown) && Intrinsics.areEqual(this.value_props, surrogate.value_props) && Intrinsics.areEqual(this.gold_monthly_cost, surrogate.gold_monthly_cost) && Intrinsics.areEqual(this.gold_free_days, surrogate.gold_free_days) && Intrinsics.areEqual(this.learn_more_cta, surrogate.learn_more_cta) && Intrinsics.areEqual(this.disclosure_markdown, surrogate.disclosure_markdown) && Intrinsics.areEqual(this.cta, surrogate.cta) && Intrinsics.areEqual(this.plan_selection_section, surrogate.plan_selection_section) && Intrinsics.areEqual(this.cta_disclosure_markdown, surrogate.cta_disclosure_markdown) && Intrinsics.areEqual(this.web_sidebar_content, surrogate.web_sidebar_content);
        }

        public int hashCode() {
            String str = this.image_path;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            GoldValuePropsInfoTagDto goldValuePropsInfoTagDto = this.info_tag;
            int iHashCode2 = (iHashCode + (goldValuePropsInfoTagDto == null ? 0 : goldValuePropsInfoTagDto.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle_markdown;
            int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.value_props.hashCode()) * 31;
            String str4 = this.gold_monthly_cost;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gold_free_days;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            CtaDto ctaDto = this.learn_more_cta;
            int iHashCode7 = (iHashCode6 + (ctaDto == null ? 0 : ctaDto.hashCode())) * 31;
            String str6 = this.disclosure_markdown;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            CtaDto ctaDto2 = this.cta;
            int iHashCode9 = (iHashCode8 + (ctaDto2 == null ? 0 : ctaDto2.hashCode())) * 31;
            GoldPlanSelectionSectionDto goldPlanSelectionSectionDto = this.plan_selection_section;
            int iHashCode10 = (iHashCode9 + (goldPlanSelectionSectionDto == null ? 0 : goldPlanSelectionSectionDto.hashCode())) * 31;
            String str7 = this.cta_disclosure_markdown;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            WebSidebarContentDto webSidebarContentDto = this.web_sidebar_content;
            return iHashCode11 + (webSidebarContentDto != null ? webSidebarContentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(image_path=" + this.image_path + ", info_tag=" + this.info_tag + ", title=" + this.title + ", subtitle_markdown=" + this.subtitle_markdown + ", value_props=" + this.value_props + ", gold_monthly_cost=" + this.gold_monthly_cost + ", gold_free_days=" + this.gold_free_days + ", learn_more_cta=" + this.learn_more_cta + ", disclosure_markdown=" + this.disclosure_markdown + ", cta=" + this.cta + ", plan_selection_section=" + this.plan_selection_section + ", cta_disclosure_markdown=" + this.cta_disclosure_markdown + ", web_sidebar_content=" + this.web_sidebar_content + ")";
        }

        /* compiled from: StreamValuePropsContentResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamValuePropsContentResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, List list, String str4, String str5, CtaDto ctaDto, String str6, CtaDto ctaDto2, GoldPlanSelectionSectionDto goldPlanSelectionSectionDto, String str7, WebSidebarContentDto webSidebarContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.image_path = null;
            } else {
                this.image_path = str;
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
                this.gold_monthly_cost = null;
            } else {
                this.gold_monthly_cost = str4;
            }
            if ((i & 64) == 0) {
                this.gold_free_days = null;
            } else {
                this.gold_free_days = str5;
            }
            if ((i & 128) == 0) {
                this.learn_more_cta = null;
            } else {
                this.learn_more_cta = ctaDto;
            }
            if ((i & 256) == 0) {
                this.disclosure_markdown = null;
            } else {
                this.disclosure_markdown = str6;
            }
            if ((i & 512) == 0) {
                this.cta = null;
            } else {
                this.cta = ctaDto2;
            }
            if ((i & 1024) == 0) {
                this.plan_selection_section = null;
            } else {
                this.plan_selection_section = goldPlanSelectionSectionDto;
            }
            if ((i & 2048) == 0) {
                this.cta_disclosure_markdown = null;
            } else {
                this.cta_disclosure_markdown = str7;
            }
            if ((i & 4096) == 0) {
                this.web_sidebar_content = null;
            } else {
                this.web_sidebar_content = webSidebarContentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            String str = self.image_path;
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
            String str4 = self.gold_monthly_cost;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.gold_free_days;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str5);
            }
            CtaDto ctaDto = self.learn_more_cta;
            if (ctaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, CtaDto.Serializer.INSTANCE, ctaDto);
            }
            String str6 = self.disclosure_markdown;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str6);
            }
            CtaDto ctaDto2 = self.cta;
            if (ctaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, CtaDto.Serializer.INSTANCE, ctaDto2);
            }
            GoldPlanSelectionSectionDto goldPlanSelectionSectionDto = self.plan_selection_section;
            if (goldPlanSelectionSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, GoldPlanSelectionSectionDto.Serializer.INSTANCE, goldPlanSelectionSectionDto);
            }
            String str7 = self.cta_disclosure_markdown;
            if (str7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str7);
            }
            WebSidebarContentDto webSidebarContentDto = self.web_sidebar_content;
            if (webSidebarContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, WebSidebarContentDto.Serializer.INSTANCE, webSidebarContentDto);
            }
        }

        public Surrogate(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, List<ValuePropDto> value_props, String str4, String str5, CtaDto ctaDto, String str6, CtaDto ctaDto2, GoldPlanSelectionSectionDto goldPlanSelectionSectionDto, String str7, WebSidebarContentDto webSidebarContentDto) {
            Intrinsics.checkNotNullParameter(value_props, "value_props");
            this.image_path = str;
            this.info_tag = goldValuePropsInfoTagDto;
            this.title = str2;
            this.subtitle_markdown = str3;
            this.value_props = value_props;
            this.gold_monthly_cost = str4;
            this.gold_free_days = str5;
            this.learn_more_cta = ctaDto;
            this.disclosure_markdown = str6;
            this.cta = ctaDto2;
            this.plan_selection_section = goldPlanSelectionSectionDto;
            this.cta_disclosure_markdown = str7;
            this.web_sidebar_content = webSidebarContentDto;
        }

        public final String getImage_path() {
            return this.image_path;
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

        public /* synthetic */ Surrogate(String str, GoldValuePropsInfoTagDto goldValuePropsInfoTagDto, String str2, String str3, List list, String str4, String str5, CtaDto ctaDto, String str6, CtaDto ctaDto2, GoldPlanSelectionSectionDto goldPlanSelectionSectionDto, String str7, WebSidebarContentDto webSidebarContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : goldValuePropsInfoTagDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : ctaDto, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : ctaDto2, (i & 1024) != 0 ? null : goldPlanSelectionSectionDto, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : webSidebarContentDto);
        }

        public final String getGold_monthly_cost() {
            return this.gold_monthly_cost;
        }

        public final String getGold_free_days() {
            return this.gold_free_days;
        }

        public final CtaDto getLearn_more_cta() {
            return this.learn_more_cta;
        }

        public final String getDisclosure_markdown() {
            return this.disclosure_markdown;
        }

        public final CtaDto getCta() {
            return this.cta;
        }

        public final GoldPlanSelectionSectionDto getPlan_selection_section() {
            return this.plan_selection_section;
        }

        public final String getCta_disclosure_markdown() {
            return this.cta_disclosure_markdown;
        }

        public final WebSidebarContentDto getWeb_sidebar_content() {
            return this.web_sidebar_content;
        }
    }

    /* compiled from: StreamValuePropsContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/StreamValuePropsContentResponseDto;", "Lgold_flow/proto/v1/StreamValuePropsContentResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/StreamValuePropsContentResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamValuePropsContentResponseDto, StreamValuePropsContentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamValuePropsContentResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamValuePropsContentResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamValuePropsContentResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamValuePropsContentResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamValuePropsContentResponse> getProtoAdapter() {
            return StreamValuePropsContentResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamValuePropsContentResponseDto getZeroValue() {
            return StreamValuePropsContentResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamValuePropsContentResponseDto fromProto(StreamValuePropsContentResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String image_path = proto.getImage_path();
            GoldValuePropsInfoTag info_tag = proto.getInfo_tag();
            DefaultConstructorMarker defaultConstructorMarker = null;
            GoldValuePropsInfoTagDto goldValuePropsInfoTagDtoFromProto = info_tag != null ? GoldValuePropsInfoTagDto.INSTANCE.fromProto(info_tag) : null;
            String title = proto.getTitle();
            String subtitle_markdown = proto.getSubtitle_markdown();
            List<ValueProp> value_props = proto.getValue_props();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value_props, 10));
            Iterator<T> it = value_props.iterator();
            while (it.hasNext()) {
                arrayList.add(ValuePropDto.INSTANCE.fromProto((ValueProp) it.next()));
            }
            String gold_monthly_cost = proto.getGold_monthly_cost();
            String gold_free_days = proto.getGold_free_days();
            Cta learn_more_cta = proto.getLearn_more_cta();
            CtaDto ctaDtoFromProto = learn_more_cta != null ? CtaDto.INSTANCE.fromProto(learn_more_cta) : null;
            String disclosure_markdown = proto.getDisclosure_markdown();
            Cta cta = proto.getCta();
            CtaDto ctaDtoFromProto2 = cta != null ? CtaDto.INSTANCE.fromProto(cta) : null;
            GoldPlanSelectionSection plan_selection_section = proto.getPlan_selection_section();
            GoldPlanSelectionSectionDto goldPlanSelectionSectionDtoFromProto = plan_selection_section != null ? GoldPlanSelectionSectionDto.INSTANCE.fromProto(plan_selection_section) : null;
            String cta_disclosure_markdown = proto.getCta_disclosure_markdown();
            WebSidebarContent web_sidebar_content = proto.getWeb_sidebar_content();
            return new StreamValuePropsContentResponseDto(new Surrogate(image_path, goldValuePropsInfoTagDtoFromProto, title, subtitle_markdown, arrayList, gold_monthly_cost, gold_free_days, ctaDtoFromProto, disclosure_markdown, ctaDtoFromProto2, goldPlanSelectionSectionDtoFromProto, cta_disclosure_markdown, web_sidebar_content != null ? WebSidebarContentDto.INSTANCE.fromProto(web_sidebar_content) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.StreamValuePropsContentResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamValuePropsContentResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new StreamValuePropsContentResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamValuePropsContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamValuePropsContentResponseDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<StreamValuePropsContentResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.StreamValuePropsContentResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamValuePropsContentResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamValuePropsContentResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamValuePropsContentResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamValuePropsContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/StreamValuePropsContentResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.StreamValuePropsContentResponseDto";
        }
    }
}
