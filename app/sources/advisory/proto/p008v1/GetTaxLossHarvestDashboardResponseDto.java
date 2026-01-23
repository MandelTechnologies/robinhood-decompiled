package advisory.proto.p008v1;

import advisory.proto.p008v1.GetTaxLossHarvestDashboardResponseDto;
import advisory.proto.p008v1.TaxLossHarvestDashboardCtaButtonDto;
import advisory.proto.p008v1.TaxLossHarvestDashboardGainsAndLossesHeaderDto;
import advisory.proto.p008v1.TaxLossHarvestDashboardStatusDto;
import advisory.proto.p008v1.TaxLossHarvestDashboardTimelineDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetTaxLossHarvestDashboardResponseDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000498:;B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u0010\u001a¨\u0006<"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$Surrogate;)V", "", "title", "subtitle_markdown", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;", "status", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineDto;", "timeline", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;", "gains_and_losses_header", "Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButtonDto;", "cta_button", "", "available_years", "year", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineDto;Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButtonDto;Ljava/util/List;Ljava/lang/String;)V", "toProto", "()Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$Surrogate;", "getTitle", "getSubtitle_markdown", "getStatus", "()Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;", "getTimeline", "()Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineDto;", "getGains_and_losses_header", "()Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;", "getCta_button", "()Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButtonDto;", "getAvailable_years", "()Ljava/util/List;", "getYear", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class GetTaxLossHarvestDashboardResponseDto implements Dto3<GetTaxLossHarvestDashboardResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetTaxLossHarvestDashboardResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetTaxLossHarvestDashboardResponseDto, GetTaxLossHarvestDashboardResponse>> binaryBase64Serializer$delegate;
    private static final GetTaxLossHarvestDashboardResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetTaxLossHarvestDashboardResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetTaxLossHarvestDashboardResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle_markdown() {
        return this.surrogate.getSubtitle_markdown();
    }

    public final TaxLossHarvestDashboardStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final TaxLossHarvestDashboardTimelineDto getTimeline() {
        return this.surrogate.getTimeline();
    }

    public final TaxLossHarvestDashboardGainsAndLossesHeaderDto getGains_and_losses_header() {
        return this.surrogate.getGains_and_losses_header();
    }

    public final TaxLossHarvestDashboardCtaButtonDto getCta_button() {
        return this.surrogate.getCta_button();
    }

    public final List<String> getAvailable_years() {
        return this.surrogate.getAvailable_years();
    }

    public final String getYear() {
        return this.surrogate.getYear();
    }

    public /* synthetic */ GetTaxLossHarvestDashboardResponseDto(String str, String str2, TaxLossHarvestDashboardStatusDto taxLossHarvestDashboardStatusDto, TaxLossHarvestDashboardTimelineDto taxLossHarvestDashboardTimelineDto, TaxLossHarvestDashboardGainsAndLossesHeaderDto taxLossHarvestDashboardGainsAndLossesHeaderDto, TaxLossHarvestDashboardCtaButtonDto taxLossHarvestDashboardCtaButtonDto, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : taxLossHarvestDashboardStatusDto, (i & 8) != 0 ? null : taxLossHarvestDashboardTimelineDto, (i & 16) != 0 ? null : taxLossHarvestDashboardGainsAndLossesHeaderDto, (i & 32) != 0 ? null : taxLossHarvestDashboardCtaButtonDto, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetTaxLossHarvestDashboardResponseDto(String title, String subtitle_markdown, TaxLossHarvestDashboardStatusDto taxLossHarvestDashboardStatusDto, TaxLossHarvestDashboardTimelineDto taxLossHarvestDashboardTimelineDto, TaxLossHarvestDashboardGainsAndLossesHeaderDto taxLossHarvestDashboardGainsAndLossesHeaderDto, TaxLossHarvestDashboardCtaButtonDto taxLossHarvestDashboardCtaButtonDto, List<String> available_years, String year) {
        this(new Surrogate(title, subtitle_markdown, taxLossHarvestDashboardStatusDto, taxLossHarvestDashboardTimelineDto, taxLossHarvestDashboardGainsAndLossesHeaderDto, taxLossHarvestDashboardCtaButtonDto, available_years, year));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(available_years, "available_years");
        Intrinsics.checkNotNullParameter(year, "year");
    }

    @Override // com.robinhood.idl.Dto
    public GetTaxLossHarvestDashboardResponse toProto() {
        String title = this.surrogate.getTitle();
        String subtitle_markdown = this.surrogate.getSubtitle_markdown();
        TaxLossHarvestDashboardStatusDto status = this.surrogate.getStatus();
        TaxLossHarvestDashboardStatus proto = status != null ? status.toProto() : null;
        TaxLossHarvestDashboardTimelineDto timeline = this.surrogate.getTimeline();
        TaxLossHarvestDashboardTimeline proto2 = timeline != null ? timeline.toProto() : null;
        TaxLossHarvestDashboardGainsAndLossesHeaderDto gains_and_losses_header = this.surrogate.getGains_and_losses_header();
        TaxLossHarvestDashboardGainsAndLossesHeader proto3 = gains_and_losses_header != null ? gains_and_losses_header.toProto() : null;
        TaxLossHarvestDashboardCtaButtonDto cta_button = this.surrogate.getCta_button();
        TaxLossHarvestDashboardCtaButton proto4 = cta_button != null ? cta_button.toProto() : null;
        List<String> available_years = this.surrogate.getAvailable_years();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_years, 10));
        Iterator<T> it = available_years.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new GetTaxLossHarvestDashboardResponse(title, subtitle_markdown, proto, proto2, proto3, proto4, arrayList, this.surrogate.getYear(), null, 256, null);
    }

    public String toString() {
        return "[GetTaxLossHarvestDashboardResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetTaxLossHarvestDashboardResponseDto) && Intrinsics.areEqual(((GetTaxLossHarvestDashboardResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetTaxLossHarvestDashboardResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDBe\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010!R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b1\u0010+\u001a\u0004\b/\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b9\u0010+\u001a\u0004\b7\u00108R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010:\u0012\u0004\b=\u0010+\u001a\u0004\b;\u0010<R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010>\u0012\u0004\bA\u0010+\u001a\u0004\b?\u0010@R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010(\u0012\u0004\bC\u0010+\u001a\u0004\bB\u0010!¨\u0006F"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$Surrogate;", "", "", "title", "subtitle_markdown", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;", "status", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineDto;", "timeline", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;", "gains_and_losses_header", "Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButtonDto;", "cta_button", "", "available_years", "year", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineDto;Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButtonDto;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineDto;Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButtonDto;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle_markdown", "getSubtitle_markdown$annotations", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;", "getStatus", "()Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;", "getStatus$annotations", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineDto;", "getTimeline", "()Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineDto;", "getTimeline$annotations", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;", "getGains_and_losses_header", "()Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;", "getGains_and_losses_header$annotations", "Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButtonDto;", "getCta_button", "()Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButtonDto;", "getCta_button$annotations", "Ljava/util/List;", "getAvailable_years", "()Ljava/util/List;", "getAvailable_years$annotations", "getYear", "getYear$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<String> available_years;
        private final TaxLossHarvestDashboardCtaButtonDto cta_button;
        private final TaxLossHarvestDashboardGainsAndLossesHeaderDto gains_and_losses_header;
        private final TaxLossHarvestDashboardStatusDto status;
        private final String subtitle_markdown;
        private final TaxLossHarvestDashboardTimelineDto timeline;
        private final String title;
        private final String year;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.proto.v1.GetTaxLossHarvestDashboardResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTaxLossHarvestDashboardResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (String) null, (TaxLossHarvestDashboardStatusDto) null, (TaxLossHarvestDashboardTimelineDto) null, (TaxLossHarvestDashboardGainsAndLossesHeaderDto) null, (TaxLossHarvestDashboardCtaButtonDto) null, (List) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
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
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle_markdown, surrogate.subtitle_markdown) && Intrinsics.areEqual(this.status, surrogate.status) && Intrinsics.areEqual(this.timeline, surrogate.timeline) && Intrinsics.areEqual(this.gains_and_losses_header, surrogate.gains_and_losses_header) && Intrinsics.areEqual(this.cta_button, surrogate.cta_button) && Intrinsics.areEqual(this.available_years, surrogate.available_years) && Intrinsics.areEqual(this.year, surrogate.year);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.subtitle_markdown.hashCode()) * 31;
            TaxLossHarvestDashboardStatusDto taxLossHarvestDashboardStatusDto = this.status;
            int iHashCode2 = (iHashCode + (taxLossHarvestDashboardStatusDto == null ? 0 : taxLossHarvestDashboardStatusDto.hashCode())) * 31;
            TaxLossHarvestDashboardTimelineDto taxLossHarvestDashboardTimelineDto = this.timeline;
            int iHashCode3 = (iHashCode2 + (taxLossHarvestDashboardTimelineDto == null ? 0 : taxLossHarvestDashboardTimelineDto.hashCode())) * 31;
            TaxLossHarvestDashboardGainsAndLossesHeaderDto taxLossHarvestDashboardGainsAndLossesHeaderDto = this.gains_and_losses_header;
            int iHashCode4 = (iHashCode3 + (taxLossHarvestDashboardGainsAndLossesHeaderDto == null ? 0 : taxLossHarvestDashboardGainsAndLossesHeaderDto.hashCode())) * 31;
            TaxLossHarvestDashboardCtaButtonDto taxLossHarvestDashboardCtaButtonDto = this.cta_button;
            return ((((iHashCode4 + (taxLossHarvestDashboardCtaButtonDto != null ? taxLossHarvestDashboardCtaButtonDto.hashCode() : 0)) * 31) + this.available_years.hashCode()) * 31) + this.year.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle_markdown=" + this.subtitle_markdown + ", status=" + this.status + ", timeline=" + this.timeline + ", gains_and_losses_header=" + this.gains_and_losses_header + ", cta_button=" + this.cta_button + ", available_years=" + this.available_years + ", year=" + this.year + ")";
        }

        /* compiled from: GetTaxLossHarvestDashboardResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetTaxLossHarvestDashboardResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, TaxLossHarvestDashboardStatusDto taxLossHarvestDashboardStatusDto, TaxLossHarvestDashboardTimelineDto taxLossHarvestDashboardTimelineDto, TaxLossHarvestDashboardGainsAndLossesHeaderDto taxLossHarvestDashboardGainsAndLossesHeaderDto, TaxLossHarvestDashboardCtaButtonDto taxLossHarvestDashboardCtaButtonDto, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle_markdown = "";
            } else {
                this.subtitle_markdown = str2;
            }
            if ((i & 4) == 0) {
                this.status = null;
            } else {
                this.status = taxLossHarvestDashboardStatusDto;
            }
            if ((i & 8) == 0) {
                this.timeline = null;
            } else {
                this.timeline = taxLossHarvestDashboardTimelineDto;
            }
            if ((i & 16) == 0) {
                this.gains_and_losses_header = null;
            } else {
                this.gains_and_losses_header = taxLossHarvestDashboardGainsAndLossesHeaderDto;
            }
            if ((i & 32) == 0) {
                this.cta_button = null;
            } else {
                this.cta_button = taxLossHarvestDashboardCtaButtonDto;
            }
            if ((i & 64) == 0) {
                this.available_years = CollectionsKt.emptyList();
            } else {
                this.available_years = list;
            }
            if ((i & 128) == 0) {
                this.year = "";
            } else {
                this.year = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle_markdown, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle_markdown);
            }
            TaxLossHarvestDashboardStatusDto taxLossHarvestDashboardStatusDto = self.status;
            if (taxLossHarvestDashboardStatusDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TaxLossHarvestDashboardStatusDto.Serializer.INSTANCE, taxLossHarvestDashboardStatusDto);
            }
            TaxLossHarvestDashboardTimelineDto taxLossHarvestDashboardTimelineDto = self.timeline;
            if (taxLossHarvestDashboardTimelineDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TaxLossHarvestDashboardTimelineDto.Serializer.INSTANCE, taxLossHarvestDashboardTimelineDto);
            }
            TaxLossHarvestDashboardGainsAndLossesHeaderDto taxLossHarvestDashboardGainsAndLossesHeaderDto = self.gains_and_losses_header;
            if (taxLossHarvestDashboardGainsAndLossesHeaderDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TaxLossHarvestDashboardGainsAndLossesHeaderDto.Serializer.INSTANCE, taxLossHarvestDashboardGainsAndLossesHeaderDto);
            }
            TaxLossHarvestDashboardCtaButtonDto taxLossHarvestDashboardCtaButtonDto = self.cta_button;
            if (taxLossHarvestDashboardCtaButtonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TaxLossHarvestDashboardCtaButtonDto.Serializer.INSTANCE, taxLossHarvestDashboardCtaButtonDto);
            }
            if (!Intrinsics.areEqual(self.available_years, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.available_years);
            }
            if (Intrinsics.areEqual(self.year, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 7, self.year);
        }

        public Surrogate(String title, String subtitle_markdown, TaxLossHarvestDashboardStatusDto taxLossHarvestDashboardStatusDto, TaxLossHarvestDashboardTimelineDto taxLossHarvestDashboardTimelineDto, TaxLossHarvestDashboardGainsAndLossesHeaderDto taxLossHarvestDashboardGainsAndLossesHeaderDto, TaxLossHarvestDashboardCtaButtonDto taxLossHarvestDashboardCtaButtonDto, List<String> available_years, String year) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
            Intrinsics.checkNotNullParameter(available_years, "available_years");
            Intrinsics.checkNotNullParameter(year, "year");
            this.title = title;
            this.subtitle_markdown = subtitle_markdown;
            this.status = taxLossHarvestDashboardStatusDto;
            this.timeline = taxLossHarvestDashboardTimelineDto;
            this.gains_and_losses_header = taxLossHarvestDashboardGainsAndLossesHeaderDto;
            this.cta_button = taxLossHarvestDashboardCtaButtonDto;
            this.available_years = available_years;
            this.year = year;
        }

        public /* synthetic */ Surrogate(String str, String str2, TaxLossHarvestDashboardStatusDto taxLossHarvestDashboardStatusDto, TaxLossHarvestDashboardTimelineDto taxLossHarvestDashboardTimelineDto, TaxLossHarvestDashboardGainsAndLossesHeaderDto taxLossHarvestDashboardGainsAndLossesHeaderDto, TaxLossHarvestDashboardCtaButtonDto taxLossHarvestDashboardCtaButtonDto, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : taxLossHarvestDashboardStatusDto, (i & 8) != 0 ? null : taxLossHarvestDashboardTimelineDto, (i & 16) != 0 ? null : taxLossHarvestDashboardGainsAndLossesHeaderDto, (i & 32) != 0 ? null : taxLossHarvestDashboardCtaButtonDto, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? "" : str3);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle_markdown() {
            return this.subtitle_markdown;
        }

        public final TaxLossHarvestDashboardStatusDto getStatus() {
            return this.status;
        }

        public final TaxLossHarvestDashboardTimelineDto getTimeline() {
            return this.timeline;
        }

        public final TaxLossHarvestDashboardGainsAndLossesHeaderDto getGains_and_losses_header() {
            return this.gains_and_losses_header;
        }

        public final TaxLossHarvestDashboardCtaButtonDto getCta_button() {
            return this.cta_button;
        }

        public final List<String> getAvailable_years() {
            return this.available_years;
        }

        public final String getYear() {
            return this.year;
        }
    }

    /* compiled from: GetTaxLossHarvestDashboardResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto;", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetTaxLossHarvestDashboardResponseDto, GetTaxLossHarvestDashboardResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetTaxLossHarvestDashboardResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxLossHarvestDashboardResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxLossHarvestDashboardResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetTaxLossHarvestDashboardResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetTaxLossHarvestDashboardResponse> getProtoAdapter() {
            return GetTaxLossHarvestDashboardResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxLossHarvestDashboardResponseDto getZeroValue() {
            return GetTaxLossHarvestDashboardResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxLossHarvestDashboardResponseDto fromProto(GetTaxLossHarvestDashboardResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle_markdown = proto.getSubtitle_markdown();
            TaxLossHarvestDashboardStatus status = proto.getStatus();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TaxLossHarvestDashboardStatusDto taxLossHarvestDashboardStatusDtoFromProto = status != null ? TaxLossHarvestDashboardStatusDto.INSTANCE.fromProto(status) : null;
            TaxLossHarvestDashboardTimeline timeline = proto.getTimeline();
            TaxLossHarvestDashboardTimelineDto taxLossHarvestDashboardTimelineDtoFromProto = timeline != null ? TaxLossHarvestDashboardTimelineDto.INSTANCE.fromProto(timeline) : null;
            TaxLossHarvestDashboardGainsAndLossesHeader gains_and_losses_header = proto.getGains_and_losses_header();
            TaxLossHarvestDashboardGainsAndLossesHeaderDto taxLossHarvestDashboardGainsAndLossesHeaderDtoFromProto = gains_and_losses_header != null ? TaxLossHarvestDashboardGainsAndLossesHeaderDto.INSTANCE.fromProto(gains_and_losses_header) : null;
            TaxLossHarvestDashboardCtaButton cta_button = proto.getCta_button();
            TaxLossHarvestDashboardCtaButtonDto taxLossHarvestDashboardCtaButtonDtoFromProto = cta_button != null ? TaxLossHarvestDashboardCtaButtonDto.INSTANCE.fromProto(cta_button) : null;
            List<String> available_years = proto.getAvailable_years();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_years, 10));
            Iterator<T> it = available_years.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new GetTaxLossHarvestDashboardResponseDto(new Surrogate(title, subtitle_markdown, taxLossHarvestDashboardStatusDtoFromProto, taxLossHarvestDashboardTimelineDtoFromProto, taxLossHarvestDashboardGainsAndLossesHeaderDtoFromProto, taxLossHarvestDashboardCtaButtonDtoFromProto, arrayList, proto.getYear()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetTaxLossHarvestDashboardResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTaxLossHarvestDashboardResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetTaxLossHarvestDashboardResponseDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetTaxLossHarvestDashboardResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetTaxLossHarvestDashboardResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetTaxLossHarvestDashboardResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetTaxLossHarvestDashboardResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetTaxLossHarvestDashboardResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetTaxLossHarvestDashboardResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetTaxLossHarvestDashboardResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetTaxLossHarvestDashboardResponseDto";
        }
    }
}
