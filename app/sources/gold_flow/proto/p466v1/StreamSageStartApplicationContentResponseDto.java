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
import gold_flow.proto.p466v1.CtaDto;
import gold_flow.proto.p466v1.GoldSageMortgageOptionDto;
import gold_flow.proto.p466v1.GoldSageMortgageTypeDto;
import gold_flow.proto.p466v1.StreamSageStartApplicationContentResponseDto;
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
import rh_server_driven_ui.p531v1.Icon;
import rh_server_driven_ui.p531v1.IconDto;

/* compiled from: StreamSageStartApplicationContentResponseDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0089\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0006\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-¨\u00062"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/StreamSageStartApplicationContentResponse;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$Surrogate;)V", "", "title", "description_markdown", "", "Lgold_flow/proto/v1/GoldSageMortgageOptionDto;", "options", "cta_disclosure", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "agreement_type", "Lrh_server_driven_ui/v1/IconDto;", "cta_icon", "Lgold_flow/proto/v1/GoldSageMortgageTypeDto;", "selected_mortgage_type", "Lgold_flow/proto/v1/WebSidebarContentDto;", "web_sidebar_content", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/CtaDto;Ljava/util/List;Lrh_server_driven_ui/v1/IconDto;Lgold_flow/proto/v1/GoldSageMortgageTypeDto;Lgold_flow/proto/v1/WebSidebarContentDto;)V", "toProto", "()Lgold_flow/proto/v1/StreamSageStartApplicationContentResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class StreamSageStartApplicationContentResponseDto implements Dto3<StreamSageStartApplicationContentResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamSageStartApplicationContentResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamSageStartApplicationContentResponseDto, StreamSageStartApplicationContentResponse>> binaryBase64Serializer$delegate;
    private static final StreamSageStartApplicationContentResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamSageStartApplicationContentResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamSageStartApplicationContentResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamSageStartApplicationContentResponseDto(String str, String str2, List list, String str3, CtaDto ctaDto, CtaDto ctaDto2, List list2, IconDto iconDto, GoldSageMortgageTypeDto goldSageMortgageTypeDto, WebSidebarContentDto webSidebarContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : ctaDto, (i & 32) != 0 ? null : ctaDto2, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? null : iconDto, (i & 256) != 0 ? null : goldSageMortgageTypeDto, (i & 512) != 0 ? null : webSidebarContentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamSageStartApplicationContentResponseDto(String str, String str2, List<GoldSageMortgageOptionDto> options, String str3, CtaDto ctaDto, CtaDto ctaDto2, List<String> agreement_type, IconDto iconDto, GoldSageMortgageTypeDto goldSageMortgageTypeDto, WebSidebarContentDto webSidebarContentDto) {
        this(new Surrogate(str, str2, options, str3, ctaDto, ctaDto2, agreement_type, iconDto, goldSageMortgageTypeDto, webSidebarContentDto));
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamSageStartApplicationContentResponse toProto() {
        String title = this.surrogate.getTitle();
        String description_markdown = this.surrogate.getDescription_markdown();
        List<GoldSageMortgageOptionDto> options = this.surrogate.getOptions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(((GoldSageMortgageOptionDto) it.next()).toProto());
        }
        String cta_disclosure = this.surrogate.getCta_disclosure();
        CtaDto cta = this.surrogate.getCta();
        Cta proto = cta != null ? cta.toProto() : null;
        CtaDto secondary_cta = this.surrogate.getSecondary_cta();
        Cta proto2 = secondary_cta != null ? secondary_cta.toProto() : null;
        List<String> agreement_type = this.surrogate.getAgreement_type();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreement_type, 10));
        Iterator<T> it2 = agreement_type.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        IconDto cta_icon = this.surrogate.getCta_icon();
        Icon icon = cta_icon != null ? (Icon) cta_icon.toProto() : null;
        GoldSageMortgageTypeDto selected_mortgage_type = this.surrogate.getSelected_mortgage_type();
        GoldSageMortgageType goldSageMortgageType = selected_mortgage_type != null ? (GoldSageMortgageType) selected_mortgage_type.toProto() : null;
        WebSidebarContentDto web_sidebar_content = this.surrogate.getWeb_sidebar_content();
        return new StreamSageStartApplicationContentResponse(title, description_markdown, arrayList, cta_disclosure, proto, proto2, arrayList2, icon, goldSageMortgageType, web_sidebar_content != null ? web_sidebar_content.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[StreamSageStartApplicationContentResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamSageStartApplicationContentResponseDto) && Intrinsics.areEqual(((StreamSageStartApplicationContentResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamSageStartApplicationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b%\b\u0083\b\u0018\u0000 K2\u00020\u0001:\u0002LKB\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010$R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010$R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b4\u0010.\u001a\u0004\b2\u00103R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b<\u0010.\u001a\u0004\b;\u00109R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b>\u0010.\u001a\u0004\b=\u00103R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010?\u0012\u0004\bB\u0010.\u001a\u0004\b@\u0010AR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010C\u0012\u0004\bF\u0010.\u001a\u0004\bD\u0010ER\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010G\u0012\u0004\bJ\u0010.\u001a\u0004\bH\u0010I¨\u0006M"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$Surrogate;", "", "", "title", "description_markdown", "", "Lgold_flow/proto/v1/GoldSageMortgageOptionDto;", "options", "cta_disclosure", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "agreement_type", "Lrh_server_driven_ui/v1/IconDto;", "cta_icon", "Lgold_flow/proto/v1/GoldSageMortgageTypeDto;", "selected_mortgage_type", "Lgold_flow/proto/v1/WebSidebarContentDto;", "web_sidebar_content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/CtaDto;Ljava/util/List;Lrh_server_driven_ui/v1/IconDto;Lgold_flow/proto/v1/GoldSageMortgageTypeDto;Lgold_flow/proto/v1/WebSidebarContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Lgold_flow/proto/v1/CtaDto;Ljava/util/List;Lrh_server_driven_ui/v1/IconDto;Lgold_flow/proto/v1/GoldSageMortgageTypeDto;Lgold_flow/proto/v1/WebSidebarContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription_markdown", "getDescription_markdown$annotations", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "getOptions$annotations", "getCta_disclosure", "getCta_disclosure$annotations", "Lgold_flow/proto/v1/CtaDto;", "getCta", "()Lgold_flow/proto/v1/CtaDto;", "getCta$annotations", "getSecondary_cta", "getSecondary_cta$annotations", "getAgreement_type", "getAgreement_type$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getCta_icon", "()Lrh_server_driven_ui/v1/IconDto;", "getCta_icon$annotations", "Lgold_flow/proto/v1/GoldSageMortgageTypeDto;", "getSelected_mortgage_type", "()Lgold_flow/proto/v1/GoldSageMortgageTypeDto;", "getSelected_mortgage_type$annotations", "Lgold_flow/proto/v1/WebSidebarContentDto;", "getWeb_sidebar_content", "()Lgold_flow/proto/v1/WebSidebarContentDto;", "getWeb_sidebar_content$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> agreement_type;
        private final CtaDto cta;
        private final String cta_disclosure;
        private final IconDto cta_icon;
        private final String description_markdown;
        private final List<GoldSageMortgageOptionDto> options;
        private final CtaDto secondary_cta;
        private final GoldSageMortgageTypeDto selected_mortgage_type;
        private final String title;
        private final WebSidebarContentDto web_sidebar_content;

        public Surrogate() {
            this((String) null, (String) null, (List) null, (String) null, (CtaDto) null, (CtaDto) null, (List) null, (IconDto) null, (GoldSageMortgageTypeDto) null, (WebSidebarContentDto) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(GoldSageMortgageOptionDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description_markdown, surrogate.description_markdown) && Intrinsics.areEqual(this.options, surrogate.options) && Intrinsics.areEqual(this.cta_disclosure, surrogate.cta_disclosure) && Intrinsics.areEqual(this.cta, surrogate.cta) && Intrinsics.areEqual(this.secondary_cta, surrogate.secondary_cta) && Intrinsics.areEqual(this.agreement_type, surrogate.agreement_type) && this.cta_icon == surrogate.cta_icon && this.selected_mortgage_type == surrogate.selected_mortgage_type && Intrinsics.areEqual(this.web_sidebar_content, surrogate.web_sidebar_content);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description_markdown;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.options.hashCode()) * 31;
            String str3 = this.cta_disclosure;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CtaDto ctaDto = this.cta;
            int iHashCode4 = (iHashCode3 + (ctaDto == null ? 0 : ctaDto.hashCode())) * 31;
            CtaDto ctaDto2 = this.secondary_cta;
            int iHashCode5 = (((iHashCode4 + (ctaDto2 == null ? 0 : ctaDto2.hashCode())) * 31) + this.agreement_type.hashCode()) * 31;
            IconDto iconDto = this.cta_icon;
            int iHashCode6 = (iHashCode5 + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
            GoldSageMortgageTypeDto goldSageMortgageTypeDto = this.selected_mortgage_type;
            int iHashCode7 = (iHashCode6 + (goldSageMortgageTypeDto == null ? 0 : goldSageMortgageTypeDto.hashCode())) * 31;
            WebSidebarContentDto webSidebarContentDto = this.web_sidebar_content;
            return iHashCode7 + (webSidebarContentDto != null ? webSidebarContentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", description_markdown=" + this.description_markdown + ", options=" + this.options + ", cta_disclosure=" + this.cta_disclosure + ", cta=" + this.cta + ", secondary_cta=" + this.secondary_cta + ", agreement_type=" + this.agreement_type + ", cta_icon=" + this.cta_icon + ", selected_mortgage_type=" + this.selected_mortgage_type + ", web_sidebar_content=" + this.web_sidebar_content + ")";
        }

        /* compiled from: StreamSageStartApplicationContentResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamSageStartApplicationContentResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: gold_flow.proto.v1.StreamSageStartApplicationContentResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamSageStartApplicationContentResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: gold_flow.proto.v1.StreamSageStartApplicationContentResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamSageStartApplicationContentResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, String str3, CtaDto ctaDto, CtaDto ctaDto2, List list2, IconDto iconDto, GoldSageMortgageTypeDto goldSageMortgageTypeDto, WebSidebarContentDto webSidebarContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.description_markdown = null;
            } else {
                this.description_markdown = str2;
            }
            if ((i & 4) == 0) {
                this.options = CollectionsKt.emptyList();
            } else {
                this.options = list;
            }
            if ((i & 8) == 0) {
                this.cta_disclosure = null;
            } else {
                this.cta_disclosure = str3;
            }
            if ((i & 16) == 0) {
                this.cta = null;
            } else {
                this.cta = ctaDto;
            }
            if ((i & 32) == 0) {
                this.secondary_cta = null;
            } else {
                this.secondary_cta = ctaDto2;
            }
            if ((i & 64) == 0) {
                this.agreement_type = CollectionsKt.emptyList();
            } else {
                this.agreement_type = list2;
            }
            if ((i & 128) == 0) {
                this.cta_icon = null;
            } else {
                this.cta_icon = iconDto;
            }
            if ((i & 256) == 0) {
                this.selected_mortgage_type = null;
            } else {
                this.selected_mortgage_type = goldSageMortgageTypeDto;
            }
            if ((i & 512) == 0) {
                this.web_sidebar_content = null;
            } else {
                this.web_sidebar_content = webSidebarContentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            String str = self.title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            String str2 = self.description_markdown;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
            }
            if (!Intrinsics.areEqual(self.options, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.options);
            }
            String str3 = self.cta_disclosure;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str3);
            }
            CtaDto ctaDto = self.cta;
            if (ctaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CtaDto.Serializer.INSTANCE, ctaDto);
            }
            CtaDto ctaDto2 = self.secondary_cta;
            if (ctaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, CtaDto.Serializer.INSTANCE, ctaDto2);
            }
            if (!Intrinsics.areEqual(self.agreement_type, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.agreement_type);
            }
            IconDto iconDto = self.cta_icon;
            if (iconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, IconDto.Serializer.INSTANCE, iconDto);
            }
            GoldSageMortgageTypeDto goldSageMortgageTypeDto = self.selected_mortgage_type;
            if (goldSageMortgageTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, GoldSageMortgageTypeDto.Serializer.INSTANCE, goldSageMortgageTypeDto);
            }
            WebSidebarContentDto webSidebarContentDto = self.web_sidebar_content;
            if (webSidebarContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, WebSidebarContentDto.Serializer.INSTANCE, webSidebarContentDto);
            }
        }

        public Surrogate(String str, String str2, List<GoldSageMortgageOptionDto> options, String str3, CtaDto ctaDto, CtaDto ctaDto2, List<String> agreement_type, IconDto iconDto, GoldSageMortgageTypeDto goldSageMortgageTypeDto, WebSidebarContentDto webSidebarContentDto) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
            this.title = str;
            this.description_markdown = str2;
            this.options = options;
            this.cta_disclosure = str3;
            this.cta = ctaDto;
            this.secondary_cta = ctaDto2;
            this.agreement_type = agreement_type;
            this.cta_icon = iconDto;
            this.selected_mortgage_type = goldSageMortgageTypeDto;
            this.web_sidebar_content = webSidebarContentDto;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription_markdown() {
            return this.description_markdown;
        }

        public final List<GoldSageMortgageOptionDto> getOptions() {
            return this.options;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, String str3, CtaDto ctaDto, CtaDto ctaDto2, List list2, IconDto iconDto, GoldSageMortgageTypeDto goldSageMortgageTypeDto, WebSidebarContentDto webSidebarContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : ctaDto, (i & 32) != 0 ? null : ctaDto2, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? null : iconDto, (i & 256) != 0 ? null : goldSageMortgageTypeDto, (i & 512) != 0 ? null : webSidebarContentDto);
        }

        public final String getCta_disclosure() {
            return this.cta_disclosure;
        }

        public final CtaDto getCta() {
            return this.cta;
        }

        public final CtaDto getSecondary_cta() {
            return this.secondary_cta;
        }

        public final List<String> getAgreement_type() {
            return this.agreement_type;
        }

        public final IconDto getCta_icon() {
            return this.cta_icon;
        }

        public final GoldSageMortgageTypeDto getSelected_mortgage_type() {
            return this.selected_mortgage_type;
        }

        public final WebSidebarContentDto getWeb_sidebar_content() {
            return this.web_sidebar_content;
        }
    }

    /* compiled from: StreamSageStartApplicationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto;", "Lgold_flow/proto/v1/StreamSageStartApplicationContentResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamSageStartApplicationContentResponseDto, StreamSageStartApplicationContentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamSageStartApplicationContentResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamSageStartApplicationContentResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamSageStartApplicationContentResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamSageStartApplicationContentResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamSageStartApplicationContentResponse> getProtoAdapter() {
            return StreamSageStartApplicationContentResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamSageStartApplicationContentResponseDto getZeroValue() {
            return StreamSageStartApplicationContentResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamSageStartApplicationContentResponseDto fromProto(StreamSageStartApplicationContentResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String description_markdown = proto.getDescription_markdown();
            List<GoldSageMortgageOption> options = proto.getOptions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                arrayList.add(GoldSageMortgageOptionDto.INSTANCE.fromProto((GoldSageMortgageOption) it.next()));
            }
            String cta_disclosure = proto.getCta_disclosure();
            Cta cta = proto.getCta();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CtaDto ctaDtoFromProto = cta != null ? CtaDto.INSTANCE.fromProto(cta) : null;
            Cta secondary_cta = proto.getSecondary_cta();
            CtaDto ctaDtoFromProto2 = secondary_cta != null ? CtaDto.INSTANCE.fromProto(secondary_cta) : null;
            List<String> agreement_type = proto.getAgreement_type();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreement_type, 10));
            Iterator<T> it2 = agreement_type.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            Icon cta_icon = proto.getCta_icon();
            IconDto iconDtoFromProto = cta_icon != null ? IconDto.INSTANCE.fromProto(cta_icon) : null;
            GoldSageMortgageType selected_mortgage_type = proto.getSelected_mortgage_type();
            GoldSageMortgageTypeDto goldSageMortgageTypeDtoFromProto = selected_mortgage_type != null ? GoldSageMortgageTypeDto.INSTANCE.fromProto(selected_mortgage_type) : null;
            WebSidebarContent web_sidebar_content = proto.getWeb_sidebar_content();
            return new StreamSageStartApplicationContentResponseDto(new Surrogate(title, description_markdown, arrayList, cta_disclosure, ctaDtoFromProto, ctaDtoFromProto2, arrayList2, iconDtoFromProto, goldSageMortgageTypeDtoFromProto, web_sidebar_content != null ? WebSidebarContentDto.INSTANCE.fromProto(web_sidebar_content) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.StreamSageStartApplicationContentResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamSageStartApplicationContentResponseDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new StreamSageStartApplicationContentResponseDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamSageStartApplicationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamSageStartApplicationContentResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.StreamSageStartApplicationContentResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamSageStartApplicationContentResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamSageStartApplicationContentResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamSageStartApplicationContentResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamSageStartApplicationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.StreamSageStartApplicationContentResponseDto";
        }
    }
}
