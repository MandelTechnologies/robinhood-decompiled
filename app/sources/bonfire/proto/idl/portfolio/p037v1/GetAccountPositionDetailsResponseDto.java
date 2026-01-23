package bonfire.proto.idl.portfolio.p037v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.portfolio.p037v1.GetAccountPositionDetailsResponseDto;
import bonfire.proto.idl.portfolio.p037v1.PositionChartDto;
import bonfire.proto.idl.portfolio.p037v1.PositionDetailChartTypeDto;
import bonfire.proto.idl.portfolio.p037v1.PositionDetailsDisplayConfigurationDto;
import bonfire.proto.idl.portfolio.p037v1.PositionMetadataDto;
import bonfire.proto.idl.portfolio.p037v1.PositionSwipeBehaviorDto;
import bonfire.proto.idl.portfolio.p037v1.PositionTextDto;
import bonfire.proto.idl.portfolio.p037v1.PositionValueDto;
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

/* compiled from: GetAccountPositionDetailsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004FEGHB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B«\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020)H\u0016¢\u0006\u0004\b2\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010#R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010#R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b9\u00108R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b>\u00108R\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b?\u0010#R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bD\u0010#¨\u0006I"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$Surrogate;)V", "", "account_number", "instrument_id", "display_type", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "title", "subtitle", "Lbonfire/proto/idl/portfolio/v1/PositionChartDto;", "chart", "Lbonfire/proto/idl/portfolio/v1/PositionValueDto;", "value", "sub_value", "instrument_type", "Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;", "chart_type", "Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfigurationDto;", "display_configuration", "Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;", "metadata", "", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto;", "swiping_behaviors", "display_currency_code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Lbonfire/proto/idl/portfolio/v1/PositionChartDto;Lbonfire/proto/idl/portfolio/v1/PositionValueDto;Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfigurationDto;Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;Ljava/util/List;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$Surrogate;", "getAccount_number", "getInstrument_id", "getDisplay_type", "getTitle", "()Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "getSubtitle", "getChart", "()Lbonfire/proto/idl/portfolio/v1/PositionChartDto;", "getValue", "()Lbonfire/proto/idl/portfolio/v1/PositionValueDto;", "getSub_value", "getInstrument_type", "getDisplay_configuration", "()Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfigurationDto;", "getSwiping_behaviors", "()Ljava/util/List;", "getDisplay_currency_code", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class GetAccountPositionDetailsResponseDto implements Dto3<GetAccountPositionDetailsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAccountPositionDetailsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAccountPositionDetailsResponseDto, GetAccountPositionDetailsResponse>> binaryBase64Serializer$delegate;
    private static final GetAccountPositionDetailsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAccountPositionDetailsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAccountPositionDetailsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getDisplay_type() {
        return this.surrogate.getDisplay_type();
    }

    public final PositionTextDto getTitle() {
        return this.surrogate.getTitle();
    }

    public final PositionTextDto getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final PositionChartDto getChart() {
        return this.surrogate.getChart();
    }

    public final PositionValueDto getValue() {
        return this.surrogate.getValue();
    }

    public final PositionTextDto getSub_value() {
        return this.surrogate.getSub_value();
    }

    public final String getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final PositionDetailsDisplayConfigurationDto getDisplay_configuration() {
        return this.surrogate.getDisplay_configuration();
    }

    public final List<PositionSwipeBehaviorDto> getSwiping_behaviors() {
        return this.surrogate.getSwiping_behaviors();
    }

    public final String getDisplay_currency_code() {
        return this.surrogate.getDisplay_currency_code();
    }

    public /* synthetic */ GetAccountPositionDetailsResponseDto(String str, String str2, String str3, PositionTextDto positionTextDto, PositionTextDto positionTextDto2, PositionChartDto positionChartDto, PositionValueDto positionValueDto, PositionTextDto positionTextDto3, String str4, PositionDetailChartTypeDto positionDetailChartTypeDto, PositionDetailsDisplayConfigurationDto positionDetailsDisplayConfigurationDto, PositionMetadataDto positionMetadataDto, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : positionTextDto, (i & 16) != 0 ? null : positionTextDto2, (i & 32) != 0 ? null : positionChartDto, (i & 64) != 0 ? null : positionValueDto, (i & 128) != 0 ? null : positionTextDto3, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? PositionDetailChartTypeDto.INSTANCE.getZeroValue() : positionDetailChartTypeDto, (i & 1024) != 0 ? null : positionDetailsDisplayConfigurationDto, (i & 2048) != 0 ? null : positionMetadataDto, (i & 4096) != 0 ? CollectionsKt.emptyList() : list, (i & 8192) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAccountPositionDetailsResponseDto(String account_number, String instrument_id, String display_type, PositionTextDto positionTextDto, PositionTextDto positionTextDto2, PositionChartDto positionChartDto, PositionValueDto positionValueDto, PositionTextDto positionTextDto3, String instrument_type, PositionDetailChartTypeDto chart_type, PositionDetailsDisplayConfigurationDto positionDetailsDisplayConfigurationDto, PositionMetadataDto positionMetadataDto, List<PositionSwipeBehaviorDto> swiping_behaviors, String str) {
        this(new Surrogate(account_number, instrument_id, display_type, positionTextDto, positionTextDto2, positionChartDto, positionValueDto, positionTextDto3, instrument_type, chart_type, positionDetailsDisplayConfigurationDto, positionMetadataDto, swiping_behaviors, str));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(display_type, "display_type");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(swiping_behaviors, "swiping_behaviors");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAccountPositionDetailsResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        String instrument_id = this.surrogate.getInstrument_id();
        String display_type = this.surrogate.getDisplay_type();
        PositionTextDto title = this.surrogate.getTitle();
        PositionText proto = title != null ? title.toProto() : null;
        PositionTextDto subtitle = this.surrogate.getSubtitle();
        PositionText proto2 = subtitle != null ? subtitle.toProto() : null;
        PositionChartDto chart = this.surrogate.getChart();
        PositionChart proto3 = chart != null ? chart.toProto() : null;
        PositionValueDto value = this.surrogate.getValue();
        PositionValue proto4 = value != null ? value.toProto() : null;
        PositionTextDto sub_value = this.surrogate.getSub_value();
        PositionText proto5 = sub_value != null ? sub_value.toProto() : null;
        String instrument_type = this.surrogate.getInstrument_type();
        PositionDetailChartType positionDetailChartType = (PositionDetailChartType) this.surrogate.getChart_type().toProto();
        PositionDetailsDisplayConfigurationDto display_configuration = this.surrogate.getDisplay_configuration();
        PositionDetailsDisplayConfiguration proto6 = display_configuration != null ? display_configuration.toProto() : null;
        PositionMetadataDto metadata = this.surrogate.getMetadata();
        PositionMetadata proto7 = metadata != null ? metadata.toProto() : null;
        List<PositionSwipeBehaviorDto> swiping_behaviors = this.surrogate.getSwiping_behaviors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(swiping_behaviors, 10));
        Iterator<T> it = swiping_behaviors.iterator();
        while (it.hasNext()) {
            arrayList.add(((PositionSwipeBehaviorDto) it.next()).toProto());
        }
        return new GetAccountPositionDetailsResponse(account_number, instrument_id, display_type, proto, proto2, proto3, proto4, proto5, instrument_type, positionDetailChartType, proto6, proto7, arrayList, this.surrogate.getDisplay_currency_code(), null, 16384, null);
    }

    public String toString() {
        return "[GetAccountPositionDetailsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAccountPositionDetailsResponseDto) && Intrinsics.areEqual(((GetAccountPositionDetailsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAccountPositionDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b1\b\u0083\b\u0018\u0000 ]2\u00020\u0001:\u0002^]B©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aB\u00ad\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010*R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010*R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00109\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010;R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00109\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010;R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bB\u00104\u001a\u0004\b@\u0010AR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010C\u0012\u0004\bF\u00104\u001a\u0004\bD\u0010ER\"\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00109\u0012\u0004\bH\u00104\u001a\u0004\bG\u0010;R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00101\u0012\u0004\bJ\u00104\u001a\u0004\bI\u0010*R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010K\u0012\u0004\bN\u00104\u001a\u0004\bL\u0010MR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010O\u0012\u0004\bR\u00104\u001a\u0004\bP\u0010QR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010S\u0012\u0004\bV\u00104\u001a\u0004\bT\u0010UR&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010W\u0012\u0004\bZ\u00104\u001a\u0004\bX\u0010YR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00101\u0012\u0004\b\\\u00104\u001a\u0004\b[\u0010*¨\u0006_"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$Surrogate;", "", "", "account_number", "instrument_id", "display_type", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "title", "subtitle", "Lbonfire/proto/idl/portfolio/v1/PositionChartDto;", "chart", "Lbonfire/proto/idl/portfolio/v1/PositionValueDto;", "value", "sub_value", "instrument_type", "Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;", "chart_type", "Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfigurationDto;", "display_configuration", "Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;", "metadata", "", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto;", "swiping_behaviors", "display_currency_code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Lbonfire/proto/idl/portfolio/v1/PositionChartDto;Lbonfire/proto/idl/portfolio/v1/PositionValueDto;Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfigurationDto;Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Lbonfire/proto/idl/portfolio/v1/PositionChartDto;Lbonfire/proto/idl/portfolio/v1/PositionValueDto;Lbonfire/proto/idl/portfolio/v1/PositionTextDto;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfigurationDto;Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_portfolio_v1_externalRelease", "(Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "getInstrument_id", "getInstrument_id$annotations", "getDisplay_type", "getDisplay_type$annotations", "Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "getTitle", "()Lbonfire/proto/idl/portfolio/v1/PositionTextDto;", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Lbonfire/proto/idl/portfolio/v1/PositionChartDto;", "getChart", "()Lbonfire/proto/idl/portfolio/v1/PositionChartDto;", "getChart$annotations", "Lbonfire/proto/idl/portfolio/v1/PositionValueDto;", "getValue", "()Lbonfire/proto/idl/portfolio/v1/PositionValueDto;", "getValue$annotations", "getSub_value", "getSub_value$annotations", "getInstrument_type", "getInstrument_type$annotations", "Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;", "getChart_type", "()Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;", "getChart_type$annotations", "Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfigurationDto;", "getDisplay_configuration", "()Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfigurationDto;", "getDisplay_configuration$annotations", "Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;", "getMetadata", "()Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;", "getMetadata$annotations", "Ljava/util/List;", "getSwiping_behaviors", "()Ljava/util/List;", "getSwiping_behaviors$annotations", "getDisplay_currency_code", "getDisplay_currency_code$annotations", "Companion", "$serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final PositionChartDto chart;
        private final PositionDetailChartTypeDto chart_type;
        private final PositionDetailsDisplayConfigurationDto display_configuration;
        private final String display_currency_code;
        private final String display_type;
        private final String instrument_id;
        private final String instrument_type;
        private final PositionMetadataDto metadata;
        private final PositionTextDto sub_value;
        private final PositionTextDto subtitle;
        private final List<PositionSwipeBehaviorDto> swiping_behaviors;
        private final PositionTextDto title;
        private final PositionValueDto value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionDetailsResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountPositionDetailsResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (PositionTextDto) null, (PositionTextDto) null, (PositionChartDto) null, (PositionValueDto) null, (PositionTextDto) null, (String) null, (PositionDetailChartTypeDto) null, (PositionDetailsDisplayConfigurationDto) null, (PositionMetadataDto) null, (List) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PositionSwipeBehaviorDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.display_type, surrogate.display_type) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.chart, surrogate.chart) && Intrinsics.areEqual(this.value, surrogate.value) && Intrinsics.areEqual(this.sub_value, surrogate.sub_value) && Intrinsics.areEqual(this.instrument_type, surrogate.instrument_type) && this.chart_type == surrogate.chart_type && Intrinsics.areEqual(this.display_configuration, surrogate.display_configuration) && Intrinsics.areEqual(this.metadata, surrogate.metadata) && Intrinsics.areEqual(this.swiping_behaviors, surrogate.swiping_behaviors) && Intrinsics.areEqual(this.display_currency_code, surrogate.display_currency_code);
        }

        public int hashCode() {
            int iHashCode = ((((this.account_number.hashCode() * 31) + this.instrument_id.hashCode()) * 31) + this.display_type.hashCode()) * 31;
            PositionTextDto positionTextDto = this.title;
            int iHashCode2 = (iHashCode + (positionTextDto == null ? 0 : positionTextDto.hashCode())) * 31;
            PositionTextDto positionTextDto2 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (positionTextDto2 == null ? 0 : positionTextDto2.hashCode())) * 31;
            PositionChartDto positionChartDto = this.chart;
            int iHashCode4 = (iHashCode3 + (positionChartDto == null ? 0 : positionChartDto.hashCode())) * 31;
            PositionValueDto positionValueDto = this.value;
            int iHashCode5 = (iHashCode4 + (positionValueDto == null ? 0 : positionValueDto.hashCode())) * 31;
            PositionTextDto positionTextDto3 = this.sub_value;
            int iHashCode6 = (((((iHashCode5 + (positionTextDto3 == null ? 0 : positionTextDto3.hashCode())) * 31) + this.instrument_type.hashCode()) * 31) + this.chart_type.hashCode()) * 31;
            PositionDetailsDisplayConfigurationDto positionDetailsDisplayConfigurationDto = this.display_configuration;
            int iHashCode7 = (iHashCode6 + (positionDetailsDisplayConfigurationDto == null ? 0 : positionDetailsDisplayConfigurationDto.hashCode())) * 31;
            PositionMetadataDto positionMetadataDto = this.metadata;
            int iHashCode8 = (((iHashCode7 + (positionMetadataDto == null ? 0 : positionMetadataDto.hashCode())) * 31) + this.swiping_behaviors.hashCode()) * 31;
            String str = this.display_currency_code;
            return iHashCode8 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", instrument_id=" + this.instrument_id + ", display_type=" + this.display_type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", chart=" + this.chart + ", value=" + this.value + ", sub_value=" + this.sub_value + ", instrument_type=" + this.instrument_type + ", chart_type=" + this.chart_type + ", display_configuration=" + this.display_configuration + ", metadata=" + this.metadata + ", swiping_behaviors=" + this.swiping_behaviors + ", display_currency_code=" + this.display_currency_code + ")";
        }

        /* compiled from: GetAccountPositionDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$Surrogate;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAccountPositionDetailsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, PositionTextDto positionTextDto, PositionTextDto positionTextDto2, PositionChartDto positionChartDto, PositionValueDto positionValueDto, PositionTextDto positionTextDto3, String str4, PositionDetailChartTypeDto positionDetailChartTypeDto, PositionDetailsDisplayConfigurationDto positionDetailsDisplayConfigurationDto, PositionMetadataDto positionMetadataDto, List list, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str2;
            }
            if ((i & 4) == 0) {
                this.display_type = "";
            } else {
                this.display_type = str3;
            }
            if ((i & 8) == 0) {
                this.title = null;
            } else {
                this.title = positionTextDto;
            }
            if ((i & 16) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = positionTextDto2;
            }
            if ((i & 32) == 0) {
                this.chart = null;
            } else {
                this.chart = positionChartDto;
            }
            if ((i & 64) == 0) {
                this.value = null;
            } else {
                this.value = positionValueDto;
            }
            if ((i & 128) == 0) {
                this.sub_value = null;
            } else {
                this.sub_value = positionTextDto3;
            }
            if ((i & 256) == 0) {
                this.instrument_type = "";
            } else {
                this.instrument_type = str4;
            }
            if ((i & 512) == 0) {
                this.chart_type = PositionDetailChartTypeDto.INSTANCE.getZeroValue();
            } else {
                this.chart_type = positionDetailChartTypeDto;
            }
            if ((i & 1024) == 0) {
                this.display_configuration = null;
            } else {
                this.display_configuration = positionDetailsDisplayConfigurationDto;
            }
            if ((i & 2048) == 0) {
                this.metadata = null;
            } else {
                this.metadata = positionMetadataDto;
            }
            this.swiping_behaviors = (i & 4096) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 8192) == 0) {
                this.display_currency_code = null;
            } else {
                this.display_currency_code = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_portfolio_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.display_type, "")) {
                output.encodeStringElement(serialDesc, 2, self.display_type);
            }
            PositionTextDto positionTextDto = self.title;
            if (positionTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, PositionTextDto.Serializer.INSTANCE, positionTextDto);
            }
            PositionTextDto positionTextDto2 = self.subtitle;
            if (positionTextDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, PositionTextDto.Serializer.INSTANCE, positionTextDto2);
            }
            PositionChartDto positionChartDto = self.chart;
            if (positionChartDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, PositionChartDto.Serializer.INSTANCE, positionChartDto);
            }
            PositionValueDto positionValueDto = self.value;
            if (positionValueDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, PositionValueDto.Serializer.INSTANCE, positionValueDto);
            }
            PositionTextDto positionTextDto3 = self.sub_value;
            if (positionTextDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, PositionTextDto.Serializer.INSTANCE, positionTextDto3);
            }
            if (!Intrinsics.areEqual(self.instrument_type, "")) {
                output.encodeStringElement(serialDesc, 8, self.instrument_type);
            }
            if (self.chart_type != PositionDetailChartTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, PositionDetailChartTypeDto.Serializer.INSTANCE, self.chart_type);
            }
            PositionDetailsDisplayConfigurationDto positionDetailsDisplayConfigurationDto = self.display_configuration;
            if (positionDetailsDisplayConfigurationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, PositionDetailsDisplayConfigurationDto.Serializer.INSTANCE, positionDetailsDisplayConfigurationDto);
            }
            PositionMetadataDto positionMetadataDto = self.metadata;
            if (positionMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, PositionMetadataDto.Serializer.INSTANCE, positionMetadataDto);
            }
            if (!Intrinsics.areEqual(self.swiping_behaviors, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 12, lazyArr[12].getValue(), self.swiping_behaviors);
            }
            String str = self.display_currency_code;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String account_number, String instrument_id, String display_type, PositionTextDto positionTextDto, PositionTextDto positionTextDto2, PositionChartDto positionChartDto, PositionValueDto positionValueDto, PositionTextDto positionTextDto3, String instrument_type, PositionDetailChartTypeDto chart_type, PositionDetailsDisplayConfigurationDto positionDetailsDisplayConfigurationDto, PositionMetadataDto positionMetadataDto, List<PositionSwipeBehaviorDto> swiping_behaviors, String str) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(display_type, "display_type");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(chart_type, "chart_type");
            Intrinsics.checkNotNullParameter(swiping_behaviors, "swiping_behaviors");
            this.account_number = account_number;
            this.instrument_id = instrument_id;
            this.display_type = display_type;
            this.title = positionTextDto;
            this.subtitle = positionTextDto2;
            this.chart = positionChartDto;
            this.value = positionValueDto;
            this.sub_value = positionTextDto3;
            this.instrument_type = instrument_type;
            this.chart_type = chart_type;
            this.display_configuration = positionDetailsDisplayConfigurationDto;
            this.metadata = positionMetadataDto;
            this.swiping_behaviors = swiping_behaviors;
            this.display_currency_code = str;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, PositionTextDto positionTextDto, PositionTextDto positionTextDto2, PositionChartDto positionChartDto, PositionValueDto positionValueDto, PositionTextDto positionTextDto3, String str4, PositionDetailChartTypeDto positionDetailChartTypeDto, PositionDetailsDisplayConfigurationDto positionDetailsDisplayConfigurationDto, PositionMetadataDto positionMetadataDto, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : positionTextDto, (i & 16) != 0 ? null : positionTextDto2, (i & 32) != 0 ? null : positionChartDto, (i & 64) != 0 ? null : positionValueDto, (i & 128) != 0 ? null : positionTextDto3, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? PositionDetailChartTypeDto.INSTANCE.getZeroValue() : positionDetailChartTypeDto, (i & 1024) != 0 ? null : positionDetailsDisplayConfigurationDto, (i & 2048) != 0 ? null : positionMetadataDto, (i & 4096) != 0 ? CollectionsKt.emptyList() : list, (i & 8192) != 0 ? null : str5);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getDisplay_type() {
            return this.display_type;
        }

        public final PositionTextDto getTitle() {
            return this.title;
        }

        public final PositionTextDto getSubtitle() {
            return this.subtitle;
        }

        public final PositionChartDto getChart() {
            return this.chart;
        }

        public final PositionValueDto getValue() {
            return this.value;
        }

        public final PositionTextDto getSub_value() {
            return this.sub_value;
        }

        public final String getInstrument_type() {
            return this.instrument_type;
        }

        public final PositionDetailChartTypeDto getChart_type() {
            return this.chart_type;
        }

        public final PositionDetailsDisplayConfigurationDto getDisplay_configuration() {
            return this.display_configuration;
        }

        public final PositionMetadataDto getMetadata() {
            return this.metadata;
        }

        public final List<PositionSwipeBehaviorDto> getSwiping_behaviors() {
            return this.swiping_behaviors;
        }

        public final String getDisplay_currency_code() {
            return this.display_currency_code;
        }
    }

    /* compiled from: GetAccountPositionDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAccountPositionDetailsResponseDto, GetAccountPositionDetailsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAccountPositionDetailsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountPositionDetailsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountPositionDetailsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAccountPositionDetailsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAccountPositionDetailsResponse> getProtoAdapter() {
            return GetAccountPositionDetailsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountPositionDetailsResponseDto getZeroValue() {
            return GetAccountPositionDetailsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountPositionDetailsResponseDto fromProto(GetAccountPositionDetailsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            String instrument_id = proto.getInstrument_id();
            String display_type = proto.getDisplay_type();
            PositionText title = proto.getTitle();
            PositionTextDto positionTextDtoFromProto = title != null ? PositionTextDto.INSTANCE.fromProto(title) : null;
            PositionText subtitle = proto.getSubtitle();
            PositionTextDto positionTextDtoFromProto2 = subtitle != null ? PositionTextDto.INSTANCE.fromProto(subtitle) : null;
            PositionChart chart = proto.getChart();
            PositionChartDto positionChartDtoFromProto = chart != null ? PositionChartDto.INSTANCE.fromProto(chart) : null;
            PositionValue value = proto.getValue();
            PositionValueDto positionValueDtoFromProto = value != null ? PositionValueDto.INSTANCE.fromProto(value) : null;
            PositionText sub_value = proto.getSub_value();
            PositionTextDto positionTextDtoFromProto3 = sub_value != null ? PositionTextDto.INSTANCE.fromProto(sub_value) : null;
            String instrument_type = proto.getInstrument_type();
            PositionDetailChartTypeDto positionDetailChartTypeDtoFromProto = PositionDetailChartTypeDto.INSTANCE.fromProto(proto.getChart_type());
            PositionDetailsDisplayConfiguration display_configuration = proto.getDisplay_configuration();
            PositionDetailsDisplayConfigurationDto positionDetailsDisplayConfigurationDtoFromProto = display_configuration != null ? PositionDetailsDisplayConfigurationDto.INSTANCE.fromProto(display_configuration) : null;
            PositionMetadata metadata = proto.getMetadata();
            PositionMetadataDto positionMetadataDtoFromProto = metadata != null ? PositionMetadataDto.INSTANCE.fromProto(metadata) : null;
            List<PositionSwipeBehavior> swiping_behaviors = proto.getSwiping_behaviors();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(swiping_behaviors, 10));
            Iterator<T> it = swiping_behaviors.iterator();
            while (it.hasNext()) {
                arrayList.add(PositionSwipeBehaviorDto.INSTANCE.fromProto((PositionSwipeBehavior) it.next()));
                positionTextDtoFromProto = positionTextDtoFromProto;
            }
            return new GetAccountPositionDetailsResponseDto(new Surrogate(account_number, instrument_id, display_type, positionTextDtoFromProto, positionTextDtoFromProto2, positionChartDtoFromProto, positionValueDtoFromProto, positionTextDtoFromProto3, instrument_type, positionDetailChartTypeDtoFromProto, positionDetailsDisplayConfigurationDtoFromProto, positionMetadataDtoFromProto, arrayList, proto.getDisplay_currency_code()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionDetailsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountPositionDetailsResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetAccountPositionDetailsResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAccountPositionDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAccountPositionDetailsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.portfolio.v1.GetAccountPositionDetailsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAccountPositionDetailsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAccountPositionDetailsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAccountPositionDetailsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAccountPositionDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.portfolio.v1.GetAccountPositionDetailsResponseDto";
        }
    }
}
