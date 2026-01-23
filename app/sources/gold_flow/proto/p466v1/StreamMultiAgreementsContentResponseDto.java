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
import gold_flow.proto.p466v1.GoldPaymentInstrumentDto;
import gold_flow.proto.p466v1.MultiAgreementsOptionDto;
import gold_flow.proto.p466v1.StreamMultiAgreementsContentResponseDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.p508v1.ProgressBar;
import microgram.p507ui.p508v1.ProgressBarDto;

/* compiled from: StreamMultiAgreementsContentResponseDto.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B©\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0006\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020&H\u0016¢\u0006\u0004\b/\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100¨\u00065"}, m3636d2 = {"Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/StreamMultiAgreementsContentResponse;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$Surrogate;)V", "", "title", "description", "", "Lgold_flow/proto/v1/MultiAgreementsOptionDto;", "options", "disclaimer_markdown", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, "", "disable_sparkle_button_styling", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "force_dark_mode", "Lgold_flow/proto/v1/GoldPaymentInstrumentDto;", "backup_payment_instrument", "Lmicrogram/ui/v1/ProgressBarDto;", "progress_bar", "is_header_centered", "navigation_bar_title", "Lgold_flow/proto/v1/WebSidebarContentDto;", "web_sidebar_content", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Lgold_flow/proto/v1/GoldPaymentInstrumentDto;Lmicrogram/ui/v1/ProgressBarDto;Ljava/lang/Boolean;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContentDto;)V", "toProto", "()Lgold_flow/proto/v1/StreamMultiAgreementsContentResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class StreamMultiAgreementsContentResponseDto implements Dto3<StreamMultiAgreementsContentResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamMultiAgreementsContentResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamMultiAgreementsContentResponseDto, StreamMultiAgreementsContentResponse>> binaryBase64Serializer$delegate;
    private static final StreamMultiAgreementsContentResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamMultiAgreementsContentResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamMultiAgreementsContentResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamMultiAgreementsContentResponseDto(String str, String str2, List list, String str3, CtaDto ctaDto, Boolean bool, CtaDto ctaDto2, Boolean bool2, GoldPaymentInstrumentDto goldPaymentInstrumentDto, ProgressBarDto progressBarDto, Boolean bool3, String str4, WebSidebarContentDto webSidebarContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : ctaDto, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : ctaDto2, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : goldPaymentInstrumentDto, (i & 512) != 0 ? null : progressBarDto, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : webSidebarContentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamMultiAgreementsContentResponseDto(String str, String str2, List<MultiAgreementsOptionDto> options, String str3, CtaDto ctaDto, Boolean bool, CtaDto ctaDto2, Boolean bool2, GoldPaymentInstrumentDto goldPaymentInstrumentDto, ProgressBarDto progressBarDto, Boolean bool3, String str4, WebSidebarContentDto webSidebarContentDto) {
        this(new Surrogate(str, str2, options, str3, ctaDto, bool, ctaDto2, bool2, goldPaymentInstrumentDto, progressBarDto, bool3, str4, webSidebarContentDto));
        Intrinsics.checkNotNullParameter(options, "options");
    }

    @Override // com.robinhood.idl.Dto
    public StreamMultiAgreementsContentResponse toProto() {
        String title = this.surrogate.getTitle();
        String description = this.surrogate.getDescription();
        List<MultiAgreementsOptionDto> options = this.surrogate.getOptions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(((MultiAgreementsOptionDto) it.next()).toProto());
        }
        String disclaimer_markdown = this.surrogate.getDisclaimer_markdown();
        CtaDto cta = this.surrogate.getCta();
        Cta proto = cta != null ? cta.toProto() : null;
        Boolean disable_sparkle_button_styling = this.surrogate.getDisable_sparkle_button_styling();
        CtaDto secondary_cta = this.surrogate.getSecondary_cta();
        Cta proto2 = secondary_cta != null ? secondary_cta.toProto() : null;
        Boolean force_dark_mode = this.surrogate.getForce_dark_mode();
        GoldPaymentInstrumentDto backup_payment_instrument = this.surrogate.getBackup_payment_instrument();
        GoldPaymentInstrument proto3 = backup_payment_instrument != null ? backup_payment_instrument.toProto() : null;
        ProgressBarDto progress_bar = this.surrogate.getProgress_bar();
        ProgressBar proto4 = progress_bar != null ? progress_bar.toProto() : null;
        Boolean is_header_centered = this.surrogate.getIs_header_centered();
        String navigation_bar_title = this.surrogate.getNavigation_bar_title();
        WebSidebarContentDto web_sidebar_content = this.surrogate.getWeb_sidebar_content();
        return new StreamMultiAgreementsContentResponse(title, description, arrayList, disclaimer_markdown, proto, disable_sparkle_button_styling, proto2, force_dark_mode, proto3, proto4, is_header_centered, navigation_bar_title, web_sidebar_content != null ? web_sidebar_content.toProto() : null, null, 8192, null);
    }

    public String toString() {
        return "[StreamMultiAgreementsContentResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamMultiAgreementsContentResponseDto) && Intrinsics.areEqual(((StreamMultiAgreementsContentResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamMultiAgreementsContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b4\b\u0083\b\u0018\u0000 U2\u00020\u0001:\u0002VUB§\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B£\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010(R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010(R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b7\u00101\u001a\u0004\b5\u00106R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010:\u0012\u0004\b=\u00101\u001a\u0004\b;\u0010<R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010>\u0012\u0004\bA\u00101\u001a\u0004\b?\u0010@R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\bC\u00101\u001a\u0004\bB\u0010<R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010>\u0012\u0004\bE\u00101\u001a\u0004\bD\u0010@R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010F\u0012\u0004\bI\u00101\u001a\u0004\bG\u0010HR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010J\u0012\u0004\bM\u00101\u001a\u0004\bK\u0010LR\"\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010>\u0012\u0004\bN\u00101\u001a\u0004\b\u0013\u0010@R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010.\u0012\u0004\bP\u00101\u001a\u0004\bO\u0010(R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010Q\u0012\u0004\bT\u00101\u001a\u0004\bR\u0010S¨\u0006W"}, m3636d2 = {"Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$Surrogate;", "", "", "title", "description", "", "Lgold_flow/proto/v1/MultiAgreementsOptionDto;", "options", "disclaimer_markdown", "Lgold_flow/proto/v1/CtaDto;", AccountOverviewOptionsSettingCard4.CTA, "", "disable_sparkle_button_styling", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "force_dark_mode", "Lgold_flow/proto/v1/GoldPaymentInstrumentDto;", "backup_payment_instrument", "Lmicrogram/ui/v1/ProgressBarDto;", "progress_bar", "is_header_centered", "navigation_bar_title", "Lgold_flow/proto/v1/WebSidebarContentDto;", "web_sidebar_content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Lgold_flow/proto/v1/GoldPaymentInstrumentDto;Lmicrogram/ui/v1/ProgressBarDto;Ljava/lang/Boolean;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Lgold_flow/proto/v1/CtaDto;Ljava/lang/Boolean;Lgold_flow/proto/v1/GoldPaymentInstrumentDto;Lmicrogram/ui/v1/ProgressBarDto;Ljava/lang/Boolean;Ljava/lang/String;Lgold_flow/proto/v1/WebSidebarContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "getOptions$annotations", "getDisclaimer_markdown", "getDisclaimer_markdown$annotations", "Lgold_flow/proto/v1/CtaDto;", "getCta", "()Lgold_flow/proto/v1/CtaDto;", "getCta$annotations", "Ljava/lang/Boolean;", "getDisable_sparkle_button_styling", "()Ljava/lang/Boolean;", "getDisable_sparkle_button_styling$annotations", "getSecondary_cta", "getSecondary_cta$annotations", "getForce_dark_mode", "getForce_dark_mode$annotations", "Lgold_flow/proto/v1/GoldPaymentInstrumentDto;", "getBackup_payment_instrument", "()Lgold_flow/proto/v1/GoldPaymentInstrumentDto;", "getBackup_payment_instrument$annotations", "Lmicrogram/ui/v1/ProgressBarDto;", "getProgress_bar", "()Lmicrogram/ui/v1/ProgressBarDto;", "getProgress_bar$annotations", "is_header_centered$annotations", "getNavigation_bar_title", "getNavigation_bar_title$annotations", "Lgold_flow/proto/v1/WebSidebarContentDto;", "getWeb_sidebar_content", "()Lgold_flow/proto/v1/WebSidebarContentDto;", "getWeb_sidebar_content$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final GoldPaymentInstrumentDto backup_payment_instrument;
        private final CtaDto cta;
        private final String description;
        private final Boolean disable_sparkle_button_styling;
        private final String disclaimer_markdown;
        private final Boolean force_dark_mode;
        private final Boolean is_header_centered;
        private final String navigation_bar_title;
        private final List<MultiAgreementsOptionDto> options;
        private final ProgressBarDto progress_bar;
        private final CtaDto secondary_cta;
        private final String title;
        private final WebSidebarContentDto web_sidebar_content;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gold_flow.proto.v1.StreamMultiAgreementsContentResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamMultiAgreementsContentResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (List) null, (String) null, (CtaDto) null, (Boolean) null, (CtaDto) null, (Boolean) null, (GoldPaymentInstrumentDto) null, (ProgressBarDto) null, (Boolean) null, (String) null, (WebSidebarContentDto) null, 8191, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MultiAgreementsOptionDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.options, surrogate.options) && Intrinsics.areEqual(this.disclaimer_markdown, surrogate.disclaimer_markdown) && Intrinsics.areEqual(this.cta, surrogate.cta) && Intrinsics.areEqual(this.disable_sparkle_button_styling, surrogate.disable_sparkle_button_styling) && Intrinsics.areEqual(this.secondary_cta, surrogate.secondary_cta) && Intrinsics.areEqual(this.force_dark_mode, surrogate.force_dark_mode) && Intrinsics.areEqual(this.backup_payment_instrument, surrogate.backup_payment_instrument) && Intrinsics.areEqual(this.progress_bar, surrogate.progress_bar) && Intrinsics.areEqual(this.is_header_centered, surrogate.is_header_centered) && Intrinsics.areEqual(this.navigation_bar_title, surrogate.navigation_bar_title) && Intrinsics.areEqual(this.web_sidebar_content, surrogate.web_sidebar_content);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.options.hashCode()) * 31;
            String str3 = this.disclaimer_markdown;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CtaDto ctaDto = this.cta;
            int iHashCode4 = (iHashCode3 + (ctaDto == null ? 0 : ctaDto.hashCode())) * 31;
            Boolean bool = this.disable_sparkle_button_styling;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            CtaDto ctaDto2 = this.secondary_cta;
            int iHashCode6 = (iHashCode5 + (ctaDto2 == null ? 0 : ctaDto2.hashCode())) * 31;
            Boolean bool2 = this.force_dark_mode;
            int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            GoldPaymentInstrumentDto goldPaymentInstrumentDto = this.backup_payment_instrument;
            int iHashCode8 = (iHashCode7 + (goldPaymentInstrumentDto == null ? 0 : goldPaymentInstrumentDto.hashCode())) * 31;
            ProgressBarDto progressBarDto = this.progress_bar;
            int iHashCode9 = (iHashCode8 + (progressBarDto == null ? 0 : progressBarDto.hashCode())) * 31;
            Boolean bool3 = this.is_header_centered;
            int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str4 = this.navigation_bar_title;
            int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
            WebSidebarContentDto webSidebarContentDto = this.web_sidebar_content;
            return iHashCode11 + (webSidebarContentDto != null ? webSidebarContentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", description=" + this.description + ", options=" + this.options + ", disclaimer_markdown=" + this.disclaimer_markdown + ", cta=" + this.cta + ", disable_sparkle_button_styling=" + this.disable_sparkle_button_styling + ", secondary_cta=" + this.secondary_cta + ", force_dark_mode=" + this.force_dark_mode + ", backup_payment_instrument=" + this.backup_payment_instrument + ", progress_bar=" + this.progress_bar + ", is_header_centered=" + this.is_header_centered + ", navigation_bar_title=" + this.navigation_bar_title + ", web_sidebar_content=" + this.web_sidebar_content + ")";
        }

        /* compiled from: StreamMultiAgreementsContentResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamMultiAgreementsContentResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, String str3, CtaDto ctaDto, Boolean bool, CtaDto ctaDto2, Boolean bool2, GoldPaymentInstrumentDto goldPaymentInstrumentDto, ProgressBarDto progressBarDto, Boolean bool3, String str4, WebSidebarContentDto webSidebarContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.description = null;
            } else {
                this.description = str2;
            }
            if ((i & 4) == 0) {
                this.options = CollectionsKt.emptyList();
            } else {
                this.options = list;
            }
            if ((i & 8) == 0) {
                this.disclaimer_markdown = null;
            } else {
                this.disclaimer_markdown = str3;
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
                this.secondary_cta = null;
            } else {
                this.secondary_cta = ctaDto2;
            }
            if ((i & 128) == 0) {
                this.force_dark_mode = null;
            } else {
                this.force_dark_mode = bool2;
            }
            if ((i & 256) == 0) {
                this.backup_payment_instrument = null;
            } else {
                this.backup_payment_instrument = goldPaymentInstrumentDto;
            }
            if ((i & 512) == 0) {
                this.progress_bar = null;
            } else {
                this.progress_bar = progressBarDto;
            }
            if ((i & 1024) == 0) {
                this.is_header_centered = null;
            } else {
                this.is_header_centered = bool3;
            }
            if ((i & 2048) == 0) {
                this.navigation_bar_title = null;
            } else {
                this.navigation_bar_title = str4;
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
            String str = self.title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            String str2 = self.description;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
            }
            if (!Intrinsics.areEqual(self.options, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.options);
            }
            String str3 = self.disclaimer_markdown;
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
            CtaDto ctaDto2 = self.secondary_cta;
            if (ctaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, CtaDto.Serializer.INSTANCE, ctaDto2);
            }
            Boolean bool2 = self.force_dark_mode;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, bool2);
            }
            GoldPaymentInstrumentDto goldPaymentInstrumentDto = self.backup_payment_instrument;
            if (goldPaymentInstrumentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, GoldPaymentInstrumentDto.Serializer.INSTANCE, goldPaymentInstrumentDto);
            }
            ProgressBarDto progressBarDto = self.progress_bar;
            if (progressBarDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ProgressBarDto.Serializer.INSTANCE, progressBarDto);
            }
            Boolean bool3 = self.is_header_centered;
            if (bool3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, BooleanSerializer.INSTANCE, bool3);
            }
            String str4 = self.navigation_bar_title;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str4);
            }
            WebSidebarContentDto webSidebarContentDto = self.web_sidebar_content;
            if (webSidebarContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, WebSidebarContentDto.Serializer.INSTANCE, webSidebarContentDto);
            }
        }

        public Surrogate(String str, String str2, List<MultiAgreementsOptionDto> options, String str3, CtaDto ctaDto, Boolean bool, CtaDto ctaDto2, Boolean bool2, GoldPaymentInstrumentDto goldPaymentInstrumentDto, ProgressBarDto progressBarDto, Boolean bool3, String str4, WebSidebarContentDto webSidebarContentDto) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.title = str;
            this.description = str2;
            this.options = options;
            this.disclaimer_markdown = str3;
            this.cta = ctaDto;
            this.disable_sparkle_button_styling = bool;
            this.secondary_cta = ctaDto2;
            this.force_dark_mode = bool2;
            this.backup_payment_instrument = goldPaymentInstrumentDto;
            this.progress_bar = progressBarDto;
            this.is_header_centered = bool3;
            this.navigation_bar_title = str4;
            this.web_sidebar_content = webSidebarContentDto;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final List<MultiAgreementsOptionDto> getOptions() {
            return this.options;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, String str3, CtaDto ctaDto, Boolean bool, CtaDto ctaDto2, Boolean bool2, GoldPaymentInstrumentDto goldPaymentInstrumentDto, ProgressBarDto progressBarDto, Boolean bool3, String str4, WebSidebarContentDto webSidebarContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : ctaDto, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : ctaDto2, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : goldPaymentInstrumentDto, (i & 512) != 0 ? null : progressBarDto, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : webSidebarContentDto);
        }

        public final String getDisclaimer_markdown() {
            return this.disclaimer_markdown;
        }

        public final CtaDto getCta() {
            return this.cta;
        }

        public final Boolean getDisable_sparkle_button_styling() {
            return this.disable_sparkle_button_styling;
        }

        public final CtaDto getSecondary_cta() {
            return this.secondary_cta;
        }

        public final Boolean getForce_dark_mode() {
            return this.force_dark_mode;
        }

        public final GoldPaymentInstrumentDto getBackup_payment_instrument() {
            return this.backup_payment_instrument;
        }

        public final ProgressBarDto getProgress_bar() {
            return this.progress_bar;
        }

        /* renamed from: is_header_centered, reason: from getter */
        public final Boolean getIs_header_centered() {
            return this.is_header_centered;
        }

        public final String getNavigation_bar_title() {
            return this.navigation_bar_title;
        }

        public final WebSidebarContentDto getWeb_sidebar_content() {
            return this.web_sidebar_content;
        }
    }

    /* compiled from: StreamMultiAgreementsContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto;", "Lgold_flow/proto/v1/StreamMultiAgreementsContentResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamMultiAgreementsContentResponseDto, StreamMultiAgreementsContentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamMultiAgreementsContentResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamMultiAgreementsContentResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamMultiAgreementsContentResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamMultiAgreementsContentResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamMultiAgreementsContentResponse> getProtoAdapter() {
            return StreamMultiAgreementsContentResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamMultiAgreementsContentResponseDto getZeroValue() {
            return StreamMultiAgreementsContentResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamMultiAgreementsContentResponseDto fromProto(StreamMultiAgreementsContentResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String description = proto.getDescription();
            List<MultiAgreementsOption> options = proto.getOptions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                arrayList.add(MultiAgreementsOptionDto.INSTANCE.fromProto((MultiAgreementsOption) it.next()));
            }
            String disclaimer_markdown = proto.getDisclaimer_markdown();
            Cta cta = proto.getCta();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CtaDto ctaDtoFromProto = cta != null ? CtaDto.INSTANCE.fromProto(cta) : null;
            Boolean disable_sparkle_button_styling = proto.getDisable_sparkle_button_styling();
            Cta secondary_cta = proto.getSecondary_cta();
            CtaDto ctaDtoFromProto2 = secondary_cta != null ? CtaDto.INSTANCE.fromProto(secondary_cta) : null;
            Boolean force_dark_mode = proto.getForce_dark_mode();
            GoldPaymentInstrument backup_payment_instrument = proto.getBackup_payment_instrument();
            GoldPaymentInstrumentDto goldPaymentInstrumentDtoFromProto = backup_payment_instrument != null ? GoldPaymentInstrumentDto.INSTANCE.fromProto(backup_payment_instrument) : null;
            ProgressBar progress_bar = proto.getProgress_bar();
            ProgressBarDto progressBarDtoFromProto = progress_bar != null ? ProgressBarDto.INSTANCE.fromProto(progress_bar) : null;
            Boolean is_header_centered = proto.getIs_header_centered();
            String navigation_bar_title = proto.getNavigation_bar_title();
            WebSidebarContent web_sidebar_content = proto.getWeb_sidebar_content();
            return new StreamMultiAgreementsContentResponseDto(new Surrogate(title, description, arrayList, disclaimer_markdown, ctaDtoFromProto, disable_sparkle_button_styling, ctaDtoFromProto2, force_dark_mode, goldPaymentInstrumentDtoFromProto, progressBarDtoFromProto, is_header_centered, navigation_bar_title, web_sidebar_content != null ? WebSidebarContentDto.INSTANCE.fromProto(web_sidebar_content) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.StreamMultiAgreementsContentResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamMultiAgreementsContentResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new StreamMultiAgreementsContentResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamMultiAgreementsContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<StreamMultiAgreementsContentResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.StreamMultiAgreementsContentResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamMultiAgreementsContentResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamMultiAgreementsContentResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamMultiAgreementsContentResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamMultiAgreementsContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.StreamMultiAgreementsContentResponseDto";
        }
    }
}
