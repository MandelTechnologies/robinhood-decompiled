package bonfire.proto.idl.copilot.p032v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.copilot.p032v1.ArticleSourceDto;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestDetailChartDto;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestDetailDto;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestDetailLottieAnimationDto;
import com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.UIComponent;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: PortfolioDigestDetailDto.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005;:<=>B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B}\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0006\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u00102R\u0019\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b7\u00106R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006?"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetail;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$Surrogate;)V", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "content_list", "Lbonfire/proto/idl/copilot/v1/ArticleSourceDto;", "article_sources", "", "disclosure_markdown", "navigation_title", "", "is_positive", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "next_generation_at", "pre_header_content", "title_content", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto;", "header_content", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/UIComponentDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto;)V", "toProto", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetail;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$Surrogate;", "getContent_list", "()Ljava/util/List;", "getArticle_sources", "getDisclosure_markdown", "getNavigation_title", "()Z", "getNext_generation_at", "()Lj$/time/Instant;", "getPre_header_content", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getTitle_content", "getHeader_content", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto;", "Companion", "Surrogate", "HeaderContentDto", "Serializer", "MultibindingModule", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PortfolioDigestDetailDto implements Dto3<PortfolioDigestDetail>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PortfolioDigestDetailDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PortfolioDigestDetailDto, PortfolioDigestDetail>> binaryBase64Serializer$delegate;
    private static final PortfolioDigestDetailDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PortfolioDigestDetailDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PortfolioDigestDetailDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<UIComponentDto> getContent_list() {
        return this.surrogate.getContent_list();
    }

    public final List<ArticleSourceDto> getArticle_sources() {
        return this.surrogate.getArticle_sources();
    }

    public final String getDisclosure_markdown() {
        return this.surrogate.getDisclosure_markdown();
    }

    public final String getNavigation_title() {
        return this.surrogate.getNavigation_title();
    }

    public final boolean is_positive() {
        return this.surrogate.getIs_positive();
    }

    public final Instant getNext_generation_at() {
        return this.surrogate.getNext_generation_at();
    }

    public final UIComponentDto getPre_header_content() {
        return this.surrogate.getPre_header_content();
    }

    public final UIComponentDto getTitle_content() {
        return this.surrogate.getTitle_content();
    }

    public final HeaderContentDto getHeader_content() {
        if (this.surrogate.getLottie_animation() != null) {
            return new HeaderContentDto.LottieAnimation(this.surrogate.getLottie_animation());
        }
        if (this.surrogate.getChart() != null) {
            return new HeaderContentDto.Chart(this.surrogate.getChart());
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PortfolioDigestDetailDto(java.util.List r2, java.util.List r3, java.lang.String r4, java.lang.String r5, boolean r6, p479j$.time.Instant r7, rh_server_driven_ui.p531v1.UIComponentDto r8, rh_server_driven_ui.p531v1.UIComponentDto r9, bonfire.proto.idl.copilot.v1.PortfolioDigestDetailDto.HeaderContentDto r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r12 = r11 & 2
            if (r12 == 0) goto L10
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L10:
            r12 = r11 & 4
            java.lang.String r0 = ""
            if (r12 == 0) goto L17
            r4 = r0
        L17:
            r12 = r11 & 8
            if (r12 == 0) goto L1c
            r5 = r0
        L1c:
            r12 = r11 & 16
            if (r12 == 0) goto L21
            r6 = 0
        L21:
            r12 = r11 & 32
            r0 = 0
            if (r12 == 0) goto L27
            r7 = r0
        L27:
            r12 = r11 & 64
            if (r12 == 0) goto L2c
            r8 = r0
        L2c:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L31
            r9 = r0
        L31:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L40
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L4a
        L40:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L4a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.copilot.p032v1.PortfolioDigestDetailDto.<init>(java.util.List, java.util.List, java.lang.String, java.lang.String, boolean, j$.time.Instant, rh_server_driven_ui.v1.UIComponentDto, rh_server_driven_ui.v1.UIComponentDto, bonfire.proto.idl.copilot.v1.PortfolioDigestDetailDto$HeaderContentDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PortfolioDigestDetailDto(List<UIComponentDto> content_list, List<ArticleSourceDto> article_sources, String disclosure_markdown, String navigation_title, boolean z, Instant instant, UIComponentDto uIComponentDto, UIComponentDto uIComponentDto2, HeaderContentDto headerContentDto) {
        Intrinsics.checkNotNullParameter(content_list, "content_list");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(navigation_title, "navigation_title");
        HeaderContentDto.LottieAnimation lottieAnimation = headerContentDto instanceof HeaderContentDto.LottieAnimation ? (HeaderContentDto.LottieAnimation) headerContentDto : null;
        PortfolioDigestDetailLottieAnimationDto value = lottieAnimation != null ? lottieAnimation.getValue() : null;
        HeaderContentDto.Chart chart = headerContentDto instanceof HeaderContentDto.Chart ? (HeaderContentDto.Chart) headerContentDto : null;
        this(new Surrogate(content_list, article_sources, disclosure_markdown, navigation_title, z, instant, uIComponentDto, uIComponentDto2, value, chart != null ? chart.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public PortfolioDigestDetail toProto() {
        List<UIComponentDto> content_list = this.surrogate.getContent_list();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(content_list, 10));
        Iterator<T> it = content_list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UIComponentDto) it.next()).toProto());
        }
        List<ArticleSourceDto> article_sources = this.surrogate.getArticle_sources();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(article_sources, 10));
        Iterator<T> it2 = article_sources.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ArticleSourceDto) it2.next()).toProto());
        }
        String disclosure_markdown = this.surrogate.getDisclosure_markdown();
        String navigation_title = this.surrogate.getNavigation_title();
        boolean is_positive = this.surrogate.getIs_positive();
        Instant next_generation_at = this.surrogate.getNext_generation_at();
        UIComponentDto pre_header_content = this.surrogate.getPre_header_content();
        UIComponent proto = pre_header_content != null ? pre_header_content.toProto() : null;
        UIComponentDto title_content = this.surrogate.getTitle_content();
        UIComponent proto2 = title_content != null ? title_content.toProto() : null;
        PortfolioDigestDetailLottieAnimationDto lottie_animation = this.surrogate.getLottie_animation();
        PortfolioDigestDetailLottieAnimation proto3 = lottie_animation != null ? lottie_animation.toProto() : null;
        PortfolioDigestDetailChartDto chart = this.surrogate.getChart();
        return new PortfolioDigestDetail(arrayList, arrayList2, disclosure_markdown, navigation_title, is_positive, next_generation_at, proto, proto2, proto3, chart != null ? chart.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[PortfolioDigestDetailDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PortfolioDigestDetailDto) && Intrinsics.areEqual(((PortfolioDigestDetailDto) other).surrogate, this.surrogate);
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
    /* compiled from: PortfolioDigestDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b.\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002QPB¥\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0089\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b5\u00103\u001a\u0004\b4\u00101R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b8\u00103\u001a\u0004\b7\u0010)R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b:\u00103\u001a\u0004\b9\u0010)R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b=\u00103\u001a\u0004\b\u000b\u0010<RF\u0010\u0011\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010>\u0012\u0004\bA\u00103\u001a\u0004\b?\u0010@R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010B\u0012\u0004\bE\u00103\u001a\u0004\bC\u0010DR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010B\u0012\u0004\bG\u00103\u001a\u0004\bF\u0010DR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010H\u0012\u0004\bK\u00103\u001a\u0004\bI\u0010JR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010L\u0012\u0004\bO\u00103\u001a\u0004\bM\u0010N¨\u0006R"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$Surrogate;", "", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "content_list", "Lbonfire/proto/idl/copilot/v1/ArticleSourceDto;", "article_sources", "", "disclosure_markdown", "navigation_title", "", "is_positive", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "next_generation_at", "pre_header_content", "title_content", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimationDto;", PortfolioDigestDetailComposableKt.TAG_LOTTIE_ANIMATION, "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChartDto;", "chart", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/UIComponentDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimationDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChartDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/UIComponentDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimationDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChartDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_v1_externalRelease", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContent_list", "()Ljava/util/List;", "getContent_list$annotations", "()V", "getArticle_sources", "getArticle_sources$annotations", "Ljava/lang/String;", "getDisclosure_markdown", "getDisclosure_markdown$annotations", "getNavigation_title", "getNavigation_title$annotations", "Z", "()Z", "is_positive$annotations", "Lj$/time/Instant;", "getNext_generation_at", "()Lj$/time/Instant;", "getNext_generation_at$annotations", "Lrh_server_driven_ui/v1/UIComponentDto;", "getPre_header_content", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getPre_header_content$annotations", "getTitle_content", "getTitle_content$annotations", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimationDto;", "getLottie_animation", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimationDto;", "getLottie_animation$annotations", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChartDto;", "getChart", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChartDto;", "getChart$annotations", "Companion", "$serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<ArticleSourceDto> article_sources;
        private final PortfolioDigestDetailChartDto chart;
        private final List<UIComponentDto> content_list;
        private final String disclosure_markdown;
        private final boolean is_positive;
        private final PortfolioDigestDetailLottieAnimationDto lottie_animation;
        private final String navigation_title;
        private final Instant next_generation_at;
        private final UIComponentDto pre_header_content;
        private final UIComponentDto title_content;

        public Surrogate() {
            this((List) null, (List) null, (String) null, (String) null, false, (Instant) null, (UIComponentDto) null, (UIComponentDto) null, (PortfolioDigestDetailLottieAnimationDto) null, (PortfolioDigestDetailChartDto) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(UIComponentDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(ArticleSourceDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.content_list, surrogate.content_list) && Intrinsics.areEqual(this.article_sources, surrogate.article_sources) && Intrinsics.areEqual(this.disclosure_markdown, surrogate.disclosure_markdown) && Intrinsics.areEqual(this.navigation_title, surrogate.navigation_title) && this.is_positive == surrogate.is_positive && Intrinsics.areEqual(this.next_generation_at, surrogate.next_generation_at) && Intrinsics.areEqual(this.pre_header_content, surrogate.pre_header_content) && Intrinsics.areEqual(this.title_content, surrogate.title_content) && Intrinsics.areEqual(this.lottie_animation, surrogate.lottie_animation) && Intrinsics.areEqual(this.chart, surrogate.chart);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.content_list.hashCode() * 31) + this.article_sources.hashCode()) * 31) + this.disclosure_markdown.hashCode()) * 31) + this.navigation_title.hashCode()) * 31) + Boolean.hashCode(this.is_positive)) * 31;
            Instant instant = this.next_generation_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            UIComponentDto uIComponentDto = this.pre_header_content;
            int iHashCode3 = (iHashCode2 + (uIComponentDto == null ? 0 : uIComponentDto.hashCode())) * 31;
            UIComponentDto uIComponentDto2 = this.title_content;
            int iHashCode4 = (iHashCode3 + (uIComponentDto2 == null ? 0 : uIComponentDto2.hashCode())) * 31;
            PortfolioDigestDetailLottieAnimationDto portfolioDigestDetailLottieAnimationDto = this.lottie_animation;
            int iHashCode5 = (iHashCode4 + (portfolioDigestDetailLottieAnimationDto == null ? 0 : portfolioDigestDetailLottieAnimationDto.hashCode())) * 31;
            PortfolioDigestDetailChartDto portfolioDigestDetailChartDto = this.chart;
            return iHashCode5 + (portfolioDigestDetailChartDto != null ? portfolioDigestDetailChartDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(content_list=" + this.content_list + ", article_sources=" + this.article_sources + ", disclosure_markdown=" + this.disclosure_markdown + ", navigation_title=" + this.navigation_title + ", is_positive=" + this.is_positive + ", next_generation_at=" + this.next_generation_at + ", pre_header_content=" + this.pre_header_content + ", title_content=" + this.title_content + ", lottie_animation=" + this.lottie_animation + ", chart=" + this.chart + ")";
        }

        /* compiled from: PortfolioDigestDetailDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$Surrogate;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PortfolioDigestDetailDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.copilot.v1.PortfolioDigestDetailDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioDigestDetailDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.copilot.v1.PortfolioDigestDetailDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioDigestDetailDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, List list, List list2, String str, String str2, boolean z, Instant instant, UIComponentDto uIComponentDto, UIComponentDto uIComponentDto2, PortfolioDigestDetailLottieAnimationDto portfolioDigestDetailLottieAnimationDto, PortfolioDigestDetailChartDto portfolioDigestDetailChartDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.content_list = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.article_sources = CollectionsKt.emptyList();
            } else {
                this.article_sources = list2;
            }
            if ((i & 4) == 0) {
                this.disclosure_markdown = "";
            } else {
                this.disclosure_markdown = str;
            }
            if ((i & 8) == 0) {
                this.navigation_title = "";
            } else {
                this.navigation_title = str2;
            }
            if ((i & 16) == 0) {
                this.is_positive = false;
            } else {
                this.is_positive = z;
            }
            if ((i & 32) == 0) {
                this.next_generation_at = null;
            } else {
                this.next_generation_at = instant;
            }
            if ((i & 64) == 0) {
                this.pre_header_content = null;
            } else {
                this.pre_header_content = uIComponentDto;
            }
            if ((i & 128) == 0) {
                this.title_content = null;
            } else {
                this.title_content = uIComponentDto2;
            }
            if ((i & 256) == 0) {
                this.lottie_animation = null;
            } else {
                this.lottie_animation = portfolioDigestDetailLottieAnimationDto;
            }
            if ((i & 512) == 0) {
                this.chart = null;
            } else {
                this.chart = portfolioDigestDetailChartDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.content_list, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.content_list);
            }
            if (!Intrinsics.areEqual(self.article_sources, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.article_sources);
            }
            if (!Intrinsics.areEqual(self.disclosure_markdown, "")) {
                output.encodeStringElement(serialDesc, 2, self.disclosure_markdown);
            }
            if (!Intrinsics.areEqual(self.navigation_title, "")) {
                output.encodeStringElement(serialDesc, 3, self.navigation_title);
            }
            boolean z = self.is_positive;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            Instant instant = self.next_generation_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
            UIComponentDto uIComponentDto = self.pre_header_content;
            if (uIComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, UIComponentDto.Serializer.INSTANCE, uIComponentDto);
            }
            UIComponentDto uIComponentDto2 = self.title_content;
            if (uIComponentDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, UIComponentDto.Serializer.INSTANCE, uIComponentDto2);
            }
            PortfolioDigestDetailLottieAnimationDto portfolioDigestDetailLottieAnimationDto = self.lottie_animation;
            if (portfolioDigestDetailLottieAnimationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, PortfolioDigestDetailLottieAnimationDto.Serializer.INSTANCE, portfolioDigestDetailLottieAnimationDto);
            }
            PortfolioDigestDetailChartDto portfolioDigestDetailChartDto = self.chart;
            if (portfolioDigestDetailChartDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, PortfolioDigestDetailChartDto.Serializer.INSTANCE, portfolioDigestDetailChartDto);
            }
        }

        public Surrogate(List<UIComponentDto> content_list, List<ArticleSourceDto> article_sources, String disclosure_markdown, String navigation_title, boolean z, Instant instant, UIComponentDto uIComponentDto, UIComponentDto uIComponentDto2, PortfolioDigestDetailLottieAnimationDto portfolioDigestDetailLottieAnimationDto, PortfolioDigestDetailChartDto portfolioDigestDetailChartDto) {
            Intrinsics.checkNotNullParameter(content_list, "content_list");
            Intrinsics.checkNotNullParameter(article_sources, "article_sources");
            Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
            Intrinsics.checkNotNullParameter(navigation_title, "navigation_title");
            this.content_list = content_list;
            this.article_sources = article_sources;
            this.disclosure_markdown = disclosure_markdown;
            this.navigation_title = navigation_title;
            this.is_positive = z;
            this.next_generation_at = instant;
            this.pre_header_content = uIComponentDto;
            this.title_content = uIComponentDto2;
            this.lottie_animation = portfolioDigestDetailLottieAnimationDto;
            this.chart = portfolioDigestDetailChartDto;
        }

        public final List<UIComponentDto> getContent_list() {
            return this.content_list;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.util.List r2, java.util.List r3, java.lang.String r4, java.lang.String r5, boolean r6, p479j$.time.Instant r7, rh_server_driven_ui.p531v1.UIComponentDto r8, rh_server_driven_ui.p531v1.UIComponentDto r9, bonfire.proto.idl.copilot.p032v1.PortfolioDigestDetailLottieAnimationDto r10, bonfire.proto.idl.copilot.p032v1.PortfolioDigestDetailChartDto r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r1 = this;
                r13 = r12 & 1
                if (r13 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r13 = r12 & 2
                if (r13 == 0) goto L10
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            L10:
                r13 = r12 & 4
                java.lang.String r0 = ""
                if (r13 == 0) goto L17
                r4 = r0
            L17:
                r13 = r12 & 8
                if (r13 == 0) goto L1c
                r5 = r0
            L1c:
                r13 = r12 & 16
                if (r13 == 0) goto L21
                r6 = 0
            L21:
                r13 = r12 & 32
                r0 = 0
                if (r13 == 0) goto L27
                r7 = r0
            L27:
                r13 = r12 & 64
                if (r13 == 0) goto L2c
                r8 = r0
            L2c:
                r13 = r12 & 128(0x80, float:1.794E-43)
                if (r13 == 0) goto L31
                r9 = r0
            L31:
                r13 = r12 & 256(0x100, float:3.59E-43)
                if (r13 == 0) goto L36
                r10 = r0
            L36:
                r12 = r12 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L46
                r13 = r0
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L51
            L46:
                r13 = r11
                r12 = r10
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L51:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.copilot.p032v1.PortfolioDigestDetailDto.Surrogate.<init>(java.util.List, java.util.List, java.lang.String, java.lang.String, boolean, j$.time.Instant, rh_server_driven_ui.v1.UIComponentDto, rh_server_driven_ui.v1.UIComponentDto, bonfire.proto.idl.copilot.v1.PortfolioDigestDetailLottieAnimationDto, bonfire.proto.idl.copilot.v1.PortfolioDigestDetailChartDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<ArticleSourceDto> getArticle_sources() {
            return this.article_sources;
        }

        public final String getDisclosure_markdown() {
            return this.disclosure_markdown;
        }

        public final String getNavigation_title() {
            return this.navigation_title;
        }

        /* renamed from: is_positive, reason: from getter */
        public final boolean getIs_positive() {
            return this.is_positive;
        }

        public final Instant getNext_generation_at() {
            return this.next_generation_at;
        }

        public final UIComponentDto getPre_header_content() {
            return this.pre_header_content;
        }

        public final UIComponentDto getTitle_content() {
            return this.title_content;
        }

        public final PortfolioDigestDetailLottieAnimationDto getLottie_animation() {
            return this.lottie_animation;
        }

        public final PortfolioDigestDetailChartDto getChart() {
            return this.chart;
        }
    }

    /* compiled from: PortfolioDigestDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetail;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PortfolioDigestDetailDto, PortfolioDigestDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PortfolioDigestDetailDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestDetailDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestDetailDto> getBinaryBase64Serializer() {
            return (KSerializer) PortfolioDigestDetailDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PortfolioDigestDetail> getProtoAdapter() {
            return PortfolioDigestDetail.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestDetailDto getZeroValue() {
            return PortfolioDigestDetailDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestDetailDto fromProto(PortfolioDigestDetail proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<UIComponent> content_list = proto.getContent_list();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(content_list, 10));
            Iterator<T> it = content_list.iterator();
            while (it.hasNext()) {
                arrayList.add(UIComponentDto.INSTANCE.fromProto((UIComponent) it.next()));
            }
            List<ArticleSource> article_sources = proto.getArticle_sources();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(article_sources, 10));
            Iterator<T> it2 = article_sources.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ArticleSourceDto.INSTANCE.fromProto((ArticleSource) it2.next()));
            }
            String disclosure_markdown = proto.getDisclosure_markdown();
            String navigation_title = proto.getNavigation_title();
            boolean is_positive = proto.getIs_positive();
            Instant next_generation_at = proto.getNext_generation_at();
            UIComponent pre_header_content = proto.getPre_header_content();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UIComponentDto uIComponentDtoFromProto = pre_header_content != null ? UIComponentDto.INSTANCE.fromProto(pre_header_content) : null;
            UIComponent title_content = proto.getTitle_content();
            UIComponentDto uIComponentDtoFromProto2 = title_content != null ? UIComponentDto.INSTANCE.fromProto(title_content) : null;
            PortfolioDigestDetailLottieAnimation lottie_animation = proto.getLottie_animation();
            PortfolioDigestDetailLottieAnimationDto portfolioDigestDetailLottieAnimationDtoFromProto = lottie_animation != null ? PortfolioDigestDetailLottieAnimationDto.INSTANCE.fromProto(lottie_animation) : null;
            PortfolioDigestDetailChart chart = proto.getChart();
            return new PortfolioDigestDetailDto(new Surrogate(arrayList, arrayList2, disclosure_markdown, navigation_title, is_positive, next_generation_at, uIComponentDtoFromProto, uIComponentDtoFromProto2, portfolioDigestDetailLottieAnimationDtoFromProto, chart != null ? PortfolioDigestDetailChartDto.INSTANCE.fromProto(chart) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.copilot.v1.PortfolioDigestDetailDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioDigestDetailDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new PortfolioDigestDetailDto(null, null, null, null, false, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PortfolioDigestDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "LottieAnimation", "Chart", "Companion", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto$Chart;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto$LottieAnimation;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class HeaderContentDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ HeaderContentDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private HeaderContentDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: PortfolioDigestDetailDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto$LottieAnimation;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimationDto;", "value", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimationDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimationDto;", "getValue", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailLottieAnimationDto;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LottieAnimation extends HeaderContentDto {
            private final PortfolioDigestDetailLottieAnimationDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LottieAnimation) && Intrinsics.areEqual(this.value, ((LottieAnimation) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "LottieAnimation(value=" + this.value + ")";
            }

            public final PortfolioDigestDetailLottieAnimationDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LottieAnimation(PortfolioDigestDetailLottieAnimationDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PortfolioDigestDetailDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto$Chart;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChartDto;", "value", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChartDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChartDto;", "getValue", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailChartDto;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Chart extends HeaderContentDto {
            private final PortfolioDigestDetailChartDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Chart) && Intrinsics.areEqual(this.value, ((Chart) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Chart(value=" + this.value + ")";
            }

            public final PortfolioDigestDetailChartDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Chart(PortfolioDigestDetailChartDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PortfolioDigestDetailDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$HeaderContentDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetail;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<HeaderContentDto, PortfolioDigestDetail> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PortfolioDigestDetail> getProtoAdapter() {
                return PortfolioDigestDetail.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public HeaderContentDto fromProto(PortfolioDigestDetail proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getLottie_animation() != null) {
                    return new LottieAnimation(PortfolioDigestDetailLottieAnimationDto.INSTANCE.fromProto(proto.getLottie_animation()));
                }
                if (proto.getChart() != null) {
                    return new Chart(PortfolioDigestDetailChartDto.INSTANCE.fromProto(proto.getChart()));
                }
                return null;
            }
        }
    }

    /* compiled from: PortfolioDigestDetailDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PortfolioDigestDetailDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.copilot.v1.PortfolioDigestDetail", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PortfolioDigestDetailDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PortfolioDigestDetailDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PortfolioDigestDetailDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PortfolioDigestDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.copilot.v1.PortfolioDigestDetailDto";
        }
    }
}
