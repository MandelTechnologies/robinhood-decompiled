package rh_server_driven_ui.p531v1;

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
import rh_server_driven_ui.p531v1.MarginRateHeaderDto;
import rh_server_driven_ui.p531v1.MarginRateRowDto;
import rh_server_driven_ui.p531v1.MarginTieredHighlightRowStyleDto;
import rh_server_driven_ui.p531v1.MarginTieredInterestRatesDto;
import rh_server_driven_ui.p531v1.MarginTieredRateTableCalloutDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: MarginTieredInterestRatesDto.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00047689B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BU\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006:"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/MarginTieredInterestRates;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$Surrogate;)V", "Lrh_server_driven_ui/v1/MarginTieredRateTableCalloutDto;", "callout", "Lrh_server_driven_ui/v1/MarginRateHeaderDto;", "header", "Lrh_server_driven_ui/v1/ThemedColorDto;", "highlighted_background_color", "", "highlighted_row_index", "", "Lrh_server_driven_ui/v1/MarginRateRowDto;", "rates", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;", "highlighted_row_style", "(Lrh_server_driven_ui/v1/MarginTieredRateTableCalloutDto;Lrh_server_driven_ui/v1/MarginRateHeaderDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Integer;Ljava/util/List;Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;)V", "toProto", "()Lrh_server_driven_ui/v1/MarginTieredInterestRates;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$Surrogate;", "getCallout", "()Lrh_server_driven_ui/v1/MarginTieredRateTableCalloutDto;", "getHeader", "()Lrh_server_driven_ui/v1/MarginRateHeaderDto;", "getHighlighted_background_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getHighlighted_row_index", "()Ljava/lang/Integer;", "getRates", "()Ljava/util/List;", "getHighlighted_row_style", "()Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class MarginTieredInterestRatesDto implements Dto3<MarginTieredInterestRates>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginTieredInterestRatesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginTieredInterestRatesDto, MarginTieredInterestRates>> binaryBase64Serializer$delegate;
    private static final MarginTieredInterestRatesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginTieredInterestRatesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginTieredInterestRatesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MarginTieredRateTableCalloutDto getCallout() {
        return this.surrogate.getCallout();
    }

    public final MarginRateHeaderDto getHeader() {
        return this.surrogate.getHeader();
    }

    public final ThemedColorDto getHighlighted_background_color() {
        return this.surrogate.getHighlighted_background_color();
    }

    public final Integer getHighlighted_row_index() {
        return this.surrogate.getHighlighted_row_index();
    }

    public final List<MarginRateRowDto> getRates() {
        return this.surrogate.getRates();
    }

    public final MarginTieredHighlightRowStyleDto getHighlighted_row_style() {
        return this.surrogate.getHighlighted_row_style();
    }

    public /* synthetic */ MarginTieredInterestRatesDto(MarginTieredRateTableCalloutDto marginTieredRateTableCalloutDto, MarginRateHeaderDto marginRateHeaderDto, ThemedColorDto themedColorDto, Integer num, List list, MarginTieredHighlightRowStyleDto marginTieredHighlightRowStyleDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marginTieredRateTableCalloutDto, (i & 2) != 0 ? null : marginRateHeaderDto, (i & 4) != 0 ? null : themedColorDto, (i & 8) != 0 ? null : num, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : marginTieredHighlightRowStyleDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginTieredInterestRatesDto(MarginTieredRateTableCalloutDto marginTieredRateTableCalloutDto, MarginRateHeaderDto marginRateHeaderDto, ThemedColorDto themedColorDto, Integer num, List<MarginRateRowDto> rates, MarginTieredHighlightRowStyleDto marginTieredHighlightRowStyleDto) {
        this(new Surrogate(marginTieredRateTableCalloutDto, marginRateHeaderDto, themedColorDto, num, rates, marginTieredHighlightRowStyleDto));
        Intrinsics.checkNotNullParameter(rates, "rates");
    }

    @Override // com.robinhood.idl.Dto
    public MarginTieredInterestRates toProto() {
        MarginTieredRateTableCalloutDto callout = this.surrogate.getCallout();
        MarginTieredRateTableCallout proto = callout != null ? callout.toProto() : null;
        MarginRateHeaderDto header = this.surrogate.getHeader();
        MarginRateHeader proto2 = header != null ? header.toProto() : null;
        ThemedColorDto highlighted_background_color = this.surrogate.getHighlighted_background_color();
        ThemedColor proto3 = highlighted_background_color != null ? highlighted_background_color.toProto() : null;
        Integer highlighted_row_index = this.surrogate.getHighlighted_row_index();
        List<MarginRateRowDto> rates = this.surrogate.getRates();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rates, 10));
        Iterator<T> it = rates.iterator();
        while (it.hasNext()) {
            arrayList.add(((MarginRateRowDto) it.next()).toProto());
        }
        MarginTieredHighlightRowStyleDto highlighted_row_style = this.surrogate.getHighlighted_row_style();
        return new MarginTieredInterestRates(proto, proto2, proto3, highlighted_row_index, arrayList, highlighted_row_style != null ? highlighted_row_style.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[MarginTieredInterestRatesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginTieredInterestRatesDto) && Intrinsics.areEqual(((MarginTieredInterestRatesDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginTieredInterestRatesDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCBb\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B]\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R1\u0010\f\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010;\u0012\u0004\b>\u0010.\u001a\u0004\b<\u0010=R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010?\u0012\u0004\bB\u0010.\u001a\u0004\b@\u0010A¨\u0006E"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$Surrogate;", "", "Lrh_server_driven_ui/v1/MarginTieredRateTableCalloutDto;", "callout", "Lrh_server_driven_ui/v1/MarginRateHeaderDto;", "header", "Lrh_server_driven_ui/v1/ThemedColorDto;", "highlighted_background_color", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "highlighted_row_index", "", "Lrh_server_driven_ui/v1/MarginRateRowDto;", "rates", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;", "highlighted_row_style", "<init>", "(Lrh_server_driven_ui/v1/MarginTieredRateTableCalloutDto;Lrh_server_driven_ui/v1/MarginRateHeaderDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Integer;Ljava/util/List;Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/MarginTieredRateTableCalloutDto;Lrh_server_driven_ui/v1/MarginRateHeaderDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Integer;Ljava/util/List;Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/MarginTieredRateTableCalloutDto;", "getCallout", "()Lrh_server_driven_ui/v1/MarginTieredRateTableCalloutDto;", "getCallout$annotations", "()V", "Lrh_server_driven_ui/v1/MarginRateHeaderDto;", "getHeader", "()Lrh_server_driven_ui/v1/MarginRateHeaderDto;", "getHeader$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getHighlighted_background_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getHighlighted_background_color$annotations", "Ljava/lang/Integer;", "getHighlighted_row_index", "()Ljava/lang/Integer;", "getHighlighted_row_index$annotations", "Ljava/util/List;", "getRates", "()Ljava/util/List;", "getRates$annotations", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;", "getHighlighted_row_style", "()Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;", "getHighlighted_row_style$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final MarginTieredRateTableCalloutDto callout;
        private final MarginRateHeaderDto header;
        private final ThemedColorDto highlighted_background_color;
        private final Integer highlighted_row_index;
        private final MarginTieredHighlightRowStyleDto highlighted_row_style;
        private final List<MarginRateRowDto> rates;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: rh_server_driven_ui.v1.MarginTieredInterestRatesDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginTieredInterestRatesDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((MarginTieredRateTableCalloutDto) null, (MarginRateHeaderDto) null, (ThemedColorDto) null, (Integer) null, (List) null, (MarginTieredHighlightRowStyleDto) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MarginRateRowDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.callout, surrogate.callout) && Intrinsics.areEqual(this.header, surrogate.header) && Intrinsics.areEqual(this.highlighted_background_color, surrogate.highlighted_background_color) && Intrinsics.areEqual(this.highlighted_row_index, surrogate.highlighted_row_index) && Intrinsics.areEqual(this.rates, surrogate.rates) && Intrinsics.areEqual(this.highlighted_row_style, surrogate.highlighted_row_style);
        }

        public int hashCode() {
            MarginTieredRateTableCalloutDto marginTieredRateTableCalloutDto = this.callout;
            int iHashCode = (marginTieredRateTableCalloutDto == null ? 0 : marginTieredRateTableCalloutDto.hashCode()) * 31;
            MarginRateHeaderDto marginRateHeaderDto = this.header;
            int iHashCode2 = (iHashCode + (marginRateHeaderDto == null ? 0 : marginRateHeaderDto.hashCode())) * 31;
            ThemedColorDto themedColorDto = this.highlighted_background_color;
            int iHashCode3 = (iHashCode2 + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            Integer num = this.highlighted_row_index;
            int iHashCode4 = (((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.rates.hashCode()) * 31;
            MarginTieredHighlightRowStyleDto marginTieredHighlightRowStyleDto = this.highlighted_row_style;
            return iHashCode4 + (marginTieredHighlightRowStyleDto != null ? marginTieredHighlightRowStyleDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(callout=" + this.callout + ", header=" + this.header + ", highlighted_background_color=" + this.highlighted_background_color + ", highlighted_row_index=" + this.highlighted_row_index + ", rates=" + this.rates + ", highlighted_row_style=" + this.highlighted_row_style + ")";
        }

        /* compiled from: MarginTieredInterestRatesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginTieredInterestRatesDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MarginTieredRateTableCalloutDto marginTieredRateTableCalloutDto, MarginRateHeaderDto marginRateHeaderDto, ThemedColorDto themedColorDto, Integer num, List list, MarginTieredHighlightRowStyleDto marginTieredHighlightRowStyleDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.callout = null;
            } else {
                this.callout = marginTieredRateTableCalloutDto;
            }
            if ((i & 2) == 0) {
                this.header = null;
            } else {
                this.header = marginRateHeaderDto;
            }
            if ((i & 4) == 0) {
                this.highlighted_background_color = null;
            } else {
                this.highlighted_background_color = themedColorDto;
            }
            if ((i & 8) == 0) {
                this.highlighted_row_index = null;
            } else {
                this.highlighted_row_index = num;
            }
            if ((i & 16) == 0) {
                this.rates = CollectionsKt.emptyList();
            } else {
                this.rates = list;
            }
            if ((i & 32) == 0) {
                this.highlighted_row_style = null;
            } else {
                this.highlighted_row_style = marginTieredHighlightRowStyleDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            MarginTieredRateTableCalloutDto marginTieredRateTableCalloutDto = self.callout;
            if (marginTieredRateTableCalloutDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MarginTieredRateTableCalloutDto.Serializer.INSTANCE, marginTieredRateTableCalloutDto);
            }
            MarginRateHeaderDto marginRateHeaderDto = self.header;
            if (marginRateHeaderDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MarginRateHeaderDto.Serializer.INSTANCE, marginRateHeaderDto);
            }
            ThemedColorDto themedColorDto = self.highlighted_background_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            Integer num = self.highlighted_row_index;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            if (!Intrinsics.areEqual(self.rates, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.rates);
            }
            MarginTieredHighlightRowStyleDto marginTieredHighlightRowStyleDto = self.highlighted_row_style;
            if (marginTieredHighlightRowStyleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MarginTieredHighlightRowStyleDto.Serializer.INSTANCE, marginTieredHighlightRowStyleDto);
            }
        }

        public Surrogate(MarginTieredRateTableCalloutDto marginTieredRateTableCalloutDto, MarginRateHeaderDto marginRateHeaderDto, ThemedColorDto themedColorDto, Integer num, List<MarginRateRowDto> rates, MarginTieredHighlightRowStyleDto marginTieredHighlightRowStyleDto) {
            Intrinsics.checkNotNullParameter(rates, "rates");
            this.callout = marginTieredRateTableCalloutDto;
            this.header = marginRateHeaderDto;
            this.highlighted_background_color = themedColorDto;
            this.highlighted_row_index = num;
            this.rates = rates;
            this.highlighted_row_style = marginTieredHighlightRowStyleDto;
        }

        public final MarginTieredRateTableCalloutDto getCallout() {
            return this.callout;
        }

        public final MarginRateHeaderDto getHeader() {
            return this.header;
        }

        public final ThemedColorDto getHighlighted_background_color() {
            return this.highlighted_background_color;
        }

        public final Integer getHighlighted_row_index() {
            return this.highlighted_row_index;
        }

        public final List<MarginRateRowDto> getRates() {
            return this.rates;
        }

        public /* synthetic */ Surrogate(MarginTieredRateTableCalloutDto marginTieredRateTableCalloutDto, MarginRateHeaderDto marginRateHeaderDto, ThemedColorDto themedColorDto, Integer num, List list, MarginTieredHighlightRowStyleDto marginTieredHighlightRowStyleDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : marginTieredRateTableCalloutDto, (i & 2) != 0 ? null : marginRateHeaderDto, (i & 4) != 0 ? null : themedColorDto, (i & 8) != 0 ? null : num, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : marginTieredHighlightRowStyleDto);
        }

        public final MarginTieredHighlightRowStyleDto getHighlighted_row_style() {
            return this.highlighted_row_style;
        }
    }

    /* compiled from: MarginTieredInterestRatesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;", "Lrh_server_driven_ui/v1/MarginTieredInterestRates;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MarginTieredInterestRatesDto, MarginTieredInterestRates> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginTieredInterestRatesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginTieredInterestRatesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginTieredInterestRatesDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginTieredInterestRatesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginTieredInterestRates> getProtoAdapter() {
            return MarginTieredInterestRates.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginTieredInterestRatesDto getZeroValue() {
            return MarginTieredInterestRatesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginTieredInterestRatesDto fromProto(MarginTieredInterestRates proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            MarginTieredRateTableCallout callout = proto.getCallout();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MarginTieredRateTableCalloutDto marginTieredRateTableCalloutDtoFromProto = callout != null ? MarginTieredRateTableCalloutDto.INSTANCE.fromProto(callout) : null;
            MarginRateHeader header = proto.getHeader();
            MarginRateHeaderDto marginRateHeaderDtoFromProto = header != null ? MarginRateHeaderDto.INSTANCE.fromProto(header) : null;
            ThemedColor highlighted_background_color = proto.getHighlighted_background_color();
            ThemedColorDto themedColorDtoFromProto = highlighted_background_color != null ? ThemedColorDto.INSTANCE.fromProto(highlighted_background_color) : null;
            Integer highlighted_row_index = proto.getHighlighted_row_index();
            List<MarginRateRow> rates = proto.getRates();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rates, 10));
            Iterator<T> it = rates.iterator();
            while (it.hasNext()) {
                arrayList.add(MarginRateRowDto.INSTANCE.fromProto((MarginRateRow) it.next()));
            }
            MarginTieredHighlightRowStyle highlighted_row_style = proto.getHighlighted_row_style();
            return new MarginTieredInterestRatesDto(new Surrogate(marginTieredRateTableCalloutDtoFromProto, marginRateHeaderDtoFromProto, themedColorDtoFromProto, highlighted_row_index, arrayList, highlighted_row_style != null ? MarginTieredHighlightRowStyleDto.INSTANCE.fromProto(highlighted_row_style) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.MarginTieredInterestRatesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginTieredInterestRatesDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new MarginTieredInterestRatesDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MarginTieredInterestRatesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MarginTieredInterestRatesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.MarginTieredInterestRates", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginTieredInterestRatesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginTieredInterestRatesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginTieredInterestRatesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginTieredInterestRatesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.MarginTieredInterestRatesDto";
        }
    }
}
