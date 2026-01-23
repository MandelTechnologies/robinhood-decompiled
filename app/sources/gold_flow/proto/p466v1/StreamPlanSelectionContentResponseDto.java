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
import gold_flow.proto.p466v1.GoldPlanSelectionOptionDto;
import gold_flow.proto.p466v1.StreamPlanSelectionContentResponseDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.p508v1.ProgressBar;
import microgram.p507ui.p508v1.ProgressBarDto;

/* compiled from: StreamPlanSelectionContentResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007By\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*¨\u0006/"}, m3636d2 = {"Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponse;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$Surrogate;)V", "", "title", "subtitle", "", "Lgold_flow/proto/v1/GoldPlanSelectionOptionDto;", "plans", "disclosure_markdown", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, "", "disable_sparkle_button_styling", "Lmicrogram/ui/v1/ProgressBarDto;", "progress_bar", "navigation_bar_title", "is_header_centered", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Lmicrogram/ui/v1/ProgressBarDto;Ljava/lang/String;Ljava/lang/Boolean;)V", "toProto", "()Lgold_flow/proto/v1/StreamPlanSelectionContentResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class StreamPlanSelectionContentResponseDto implements Dto3<StreamPlanSelectionContentResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamPlanSelectionContentResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamPlanSelectionContentResponseDto, StreamPlanSelectionContentResponse>> binaryBase64Serializer$delegate;
    private static final StreamPlanSelectionContentResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamPlanSelectionContentResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamPlanSelectionContentResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamPlanSelectionContentResponseDto(String str, String str2, List list, String str3, CtaDto ctaDto, Boolean bool, ProgressBarDto progressBarDto, String str4, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : ctaDto, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : progressBarDto, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : bool2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamPlanSelectionContentResponseDto(String str, String str2, List<GoldPlanSelectionOptionDto> plans, String str3, CtaDto ctaDto, Boolean bool, ProgressBarDto progressBarDto, String str4, Boolean bool2) {
        this(new Surrogate(str, str2, plans, str3, ctaDto, bool, progressBarDto, str4, bool2));
        Intrinsics.checkNotNullParameter(plans, "plans");
    }

    @Override // com.robinhood.idl.Dto
    public StreamPlanSelectionContentResponse toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        List<GoldPlanSelectionOptionDto> plans = this.surrogate.getPlans();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plans, 10));
        Iterator<T> it = plans.iterator();
        while (it.hasNext()) {
            arrayList.add(((GoldPlanSelectionOptionDto) it.next()).toProto());
        }
        String disclosure_markdown = this.surrogate.getDisclosure_markdown();
        CtaDto cta = this.surrogate.getCta();
        Cta proto = cta != null ? cta.toProto() : null;
        Boolean disable_sparkle_button_styling = this.surrogate.getDisable_sparkle_button_styling();
        ProgressBarDto progress_bar = this.surrogate.getProgress_bar();
        return new StreamPlanSelectionContentResponse(title, subtitle, arrayList, disclosure_markdown, proto, disable_sparkle_button_styling, progress_bar != null ? progress_bar.toProto() : null, this.surrogate.getNavigation_bar_title(), this.surrogate.getIs_header_centered(), null, 512, null);
    }

    public String toString() {
        return "[StreamPlanSelectionContentResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamPlanSelectionContentResponseDto) && Intrinsics.areEqual(((StreamPlanSelectionContentResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamPlanSelectionContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b(\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCBw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012B{\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\"R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b1\u0010+\u001a\u0004\b/\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010(\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00108\u0012\u0004\b;\u0010+\u001a\u0004\b9\u0010:R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010<\u0012\u0004\b?\u0010+\u001a\u0004\b=\u0010>R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010(\u0012\u0004\bA\u0010+\u001a\u0004\b@\u0010\"R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00108\u0012\u0004\bB\u0010+\u001a\u0004\b\u0010\u0010:¨\u0006E"}, m3636d2 = {"Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$Surrogate;", "", "", "title", "subtitle", "", "Lgold_flow/proto/v1/GoldPlanSelectionOptionDto;", "plans", "disclosure_markdown", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, "", "disable_sparkle_button_styling", "Lmicrogram/ui/v1/ProgressBarDto;", "progress_bar", "navigation_bar_title", "is_header_centered", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Lmicrogram/ui/v1/ProgressBarDto;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Lmicrogram/ui/v1/ProgressBarDto;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Ljava/util/List;", "getPlans", "()Ljava/util/List;", "getPlans$annotations", "getDisclosure_markdown", "getDisclosure_markdown$annotations", "Lgold_flow/proto/v1/CtaDto;", "getCta", "()Lgold_flow/proto/v1/CtaDto;", "getCta$annotations", "Ljava/lang/Boolean;", "getDisable_sparkle_button_styling", "()Ljava/lang/Boolean;", "getDisable_sparkle_button_styling$annotations", "Lmicrogram/ui/v1/ProgressBarDto;", "getProgress_bar", "()Lmicrogram/ui/v1/ProgressBarDto;", "getProgress_bar$annotations", "getNavigation_bar_title", "getNavigation_bar_title$annotations", "is_header_centered$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final CtaDto cta;
        private final Boolean disable_sparkle_button_styling;
        private final String disclosure_markdown;
        private final Boolean is_header_centered;
        private final String navigation_bar_title;
        private final List<GoldPlanSelectionOptionDto> plans;
        private final ProgressBarDto progress_bar;
        private final String subtitle;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gold_flow.proto.v1.StreamPlanSelectionContentResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamPlanSelectionContentResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (List) null, (String) null, (CtaDto) null, (Boolean) null, (ProgressBarDto) null, (String) null, (Boolean) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(GoldPlanSelectionOptionDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.plans, surrogate.plans) && Intrinsics.areEqual(this.disclosure_markdown, surrogate.disclosure_markdown) && Intrinsics.areEqual(this.cta, surrogate.cta) && Intrinsics.areEqual(this.disable_sparkle_button_styling, surrogate.disable_sparkle_button_styling) && Intrinsics.areEqual(this.progress_bar, surrogate.progress_bar) && Intrinsics.areEqual(this.navigation_bar_title, surrogate.navigation_bar_title) && Intrinsics.areEqual(this.is_header_centered, surrogate.is_header_centered);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.plans.hashCode()) * 31;
            String str3 = this.disclosure_markdown;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CtaDto ctaDto = this.cta;
            int iHashCode4 = (iHashCode3 + (ctaDto == null ? 0 : ctaDto.hashCode())) * 31;
            Boolean bool = this.disable_sparkle_button_styling;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            ProgressBarDto progressBarDto = this.progress_bar;
            int iHashCode6 = (iHashCode5 + (progressBarDto == null ? 0 : progressBarDto.hashCode())) * 31;
            String str4 = this.navigation_bar_title;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool2 = this.is_header_centered;
            return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", plans=" + this.plans + ", disclosure_markdown=" + this.disclosure_markdown + ", cta=" + this.cta + ", disable_sparkle_button_styling=" + this.disable_sparkle_button_styling + ", progress_bar=" + this.progress_bar + ", navigation_bar_title=" + this.navigation_bar_title + ", is_header_centered=" + this.is_header_centered + ")";
        }

        /* compiled from: StreamPlanSelectionContentResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamPlanSelectionContentResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, String str3, CtaDto ctaDto, Boolean bool, ProgressBarDto progressBarDto, String str4, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.plans = CollectionsKt.emptyList();
            } else {
                this.plans = list;
            }
            if ((i & 8) == 0) {
                this.disclosure_markdown = null;
            } else {
                this.disclosure_markdown = str3;
            }
            if ((i & 16) == 0) {
                this.cta = null;
            } else {
                this.cta = ctaDto;
            }
            if ((i & 32) == 0) {
                this.disable_sparkle_button_styling = null;
            } else {
                this.disable_sparkle_button_styling = bool;
            }
            if ((i & 64) == 0) {
                this.progress_bar = null;
            } else {
                this.progress_bar = progressBarDto;
            }
            if ((i & 128) == 0) {
                this.navigation_bar_title = null;
            } else {
                this.navigation_bar_title = str4;
            }
            if ((i & 256) == 0) {
                this.is_header_centered = null;
            } else {
                this.is_header_centered = bool2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            String str = self.title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            String str2 = self.subtitle;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
            }
            if (!Intrinsics.areEqual(self.plans, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.plans);
            }
            String str3 = self.disclosure_markdown;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str3);
            }
            CtaDto ctaDto = self.cta;
            if (ctaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CtaDto.Serializer.INSTANCE, ctaDto);
            }
            Boolean bool = self.disable_sparkle_button_styling;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, bool);
            }
            ProgressBarDto progressBarDto = self.progress_bar;
            if (progressBarDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ProgressBarDto.Serializer.INSTANCE, progressBarDto);
            }
            String str4 = self.navigation_bar_title;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str4);
            }
            Boolean bool2 = self.is_header_centered;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, bool2);
            }
        }

        public Surrogate(String str, String str2, List<GoldPlanSelectionOptionDto> plans, String str3, CtaDto ctaDto, Boolean bool, ProgressBarDto progressBarDto, String str4, Boolean bool2) {
            Intrinsics.checkNotNullParameter(plans, "plans");
            this.title = str;
            this.subtitle = str2;
            this.plans = plans;
            this.disclosure_markdown = str3;
            this.cta = ctaDto;
            this.disable_sparkle_button_styling = bool;
            this.progress_bar = progressBarDto;
            this.navigation_bar_title = str4;
            this.is_header_centered = bool2;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<GoldPlanSelectionOptionDto> getPlans() {
            return this.plans;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, String str3, CtaDto ctaDto, Boolean bool, ProgressBarDto progressBarDto, String str4, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : ctaDto, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : progressBarDto, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : bool2);
        }

        public final String getDisclosure_markdown() {
            return this.disclosure_markdown;
        }

        public final CtaDto getCta() {
            return this.cta;
        }

        public final Boolean getDisable_sparkle_button_styling() {
            return this.disable_sparkle_button_styling;
        }

        public final ProgressBarDto getProgress_bar() {
            return this.progress_bar;
        }

        public final String getNavigation_bar_title() {
            return this.navigation_bar_title;
        }

        /* renamed from: is_header_centered, reason: from getter */
        public final Boolean getIs_header_centered() {
            return this.is_header_centered;
        }
    }

    /* compiled from: StreamPlanSelectionContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto;", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamPlanSelectionContentResponseDto, StreamPlanSelectionContentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamPlanSelectionContentResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamPlanSelectionContentResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamPlanSelectionContentResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamPlanSelectionContentResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamPlanSelectionContentResponse> getProtoAdapter() {
            return StreamPlanSelectionContentResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamPlanSelectionContentResponseDto getZeroValue() {
            return StreamPlanSelectionContentResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamPlanSelectionContentResponseDto fromProto(StreamPlanSelectionContentResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            List<GoldPlanSelectionOption> plans = proto.getPlans();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plans, 10));
            Iterator<T> it = plans.iterator();
            while (it.hasNext()) {
                arrayList.add(GoldPlanSelectionOptionDto.INSTANCE.fromProto((GoldPlanSelectionOption) it.next()));
            }
            String disclosure_markdown = proto.getDisclosure_markdown();
            Cta cta = proto.getCta();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CtaDto ctaDtoFromProto = cta != null ? CtaDto.INSTANCE.fromProto(cta) : null;
            Boolean disable_sparkle_button_styling = proto.getDisable_sparkle_button_styling();
            ProgressBar progress_bar = proto.getProgress_bar();
            return new StreamPlanSelectionContentResponseDto(new Surrogate(title, subtitle, arrayList, disclosure_markdown, ctaDtoFromProto, disable_sparkle_button_styling, progress_bar != null ? ProgressBarDto.INSTANCE.fromProto(progress_bar) : null, proto.getNavigation_bar_title(), proto.getIs_header_centered()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.StreamPlanSelectionContentResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamPlanSelectionContentResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new StreamPlanSelectionContentResponseDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamPlanSelectionContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamPlanSelectionContentResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.StreamPlanSelectionContentResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamPlanSelectionContentResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamPlanSelectionContentResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamPlanSelectionContentResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamPlanSelectionContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.StreamPlanSelectionContentResponseDto";
        }
    }
}
