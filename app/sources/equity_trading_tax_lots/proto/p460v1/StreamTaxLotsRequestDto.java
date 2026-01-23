package equity_trading_tax_lots.proto.p460v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import equity_trading_tax_lots.proto.p460v1.DisposalKindDto;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategyDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsRequestDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirectionDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatusDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotTermDto;
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

/* compiled from: StreamTaxLotsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bs\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0006\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-¨\u00062"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequest;", "Landroid/os/Parcelable;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$Surrogate;", "surrogate", "<init>", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$Surrogate;)V", "", "rhs_account_number", "order_id", "instrument_id", "", "Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;", "selected_terms", "Lequity_trading_tax_lots/proto/v1/DisposalKindDto;", "disposal_kind", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;", "sort_direction", "Lequity_trading_tax_lots/proto/v1/TaxLotStatusDto;", "lot_status", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "selection_strategy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lequity_trading_tax_lots/proto/v1/DisposalKindDto;Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;Lequity_trading_tax_lots/proto/v1/TaxLotStatusDto;Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;)V", "toProto", "()Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class StreamTaxLotsRequestDto implements Dto3<StreamTaxLotsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamTaxLotsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamTaxLotsRequestDto, StreamTaxLotsRequest>> binaryBase64Serializer$delegate;
    private static final StreamTaxLotsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamTaxLotsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamTaxLotsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamTaxLotsRequestDto(String str, String str2, String str3, List list, DisposalKindDto disposalKindDto, TaxLotSortDto taxLotSortDto, TaxLotSortDirectionDto taxLotSortDirectionDto, TaxLotStatusDto taxLotStatusDto, SelectionStrategyDto selectionStrategyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : disposalKindDto, (i & 32) != 0 ? null : taxLotSortDto, (i & 64) != 0 ? null : taxLotSortDirectionDto, (i & 128) != 0 ? null : taxLotStatusDto, (i & 256) != 0 ? null : selectionStrategyDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotsRequestDto(String rhs_account_number, String order_id, String instrument_id, List<? extends TaxLotTermDto> selected_terms, DisposalKindDto disposalKindDto, TaxLotSortDto taxLotSortDto, TaxLotSortDirectionDto taxLotSortDirectionDto, TaxLotStatusDto taxLotStatusDto, SelectionStrategyDto selectionStrategyDto) {
        this(new Surrogate(rhs_account_number, order_id, instrument_id, selected_terms, disposalKindDto, taxLotSortDto, taxLotSortDirectionDto, taxLotStatusDto, selectionStrategyDto));
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(selected_terms, "selected_terms");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamTaxLotsRequest toProto() {
        String rhs_account_number = this.surrogate.getRhs_account_number();
        String order_id = this.surrogate.getOrder_id();
        String instrument_id = this.surrogate.getInstrument_id();
        List<TaxLotTermDto> selected_terms = this.surrogate.getSelected_terms();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_terms, 10));
        Iterator<T> it = selected_terms.iterator();
        while (it.hasNext()) {
            arrayList.add((TaxLotTerm) ((TaxLotTermDto) it.next()).toProto());
        }
        DisposalKindDto disposal_kind = this.surrogate.getDisposal_kind();
        DisposalKind disposalKind = disposal_kind != null ? (DisposalKind) disposal_kind.toProto() : null;
        TaxLotSortDto sort = this.surrogate.getSort();
        TaxLotSort taxLotSort = sort != null ? (TaxLotSort) sort.toProto() : null;
        TaxLotSortDirectionDto sort_direction = this.surrogate.getSort_direction();
        TaxLotSortDirection taxLotSortDirection = sort_direction != null ? (TaxLotSortDirection) sort_direction.toProto() : null;
        TaxLotStatusDto lot_status = this.surrogate.getLot_status();
        TaxLotStatus taxLotStatus = lot_status != null ? (TaxLotStatus) lot_status.toProto() : null;
        SelectionStrategyDto selection_strategy = this.surrogate.getSelection_strategy();
        return new StreamTaxLotsRequest(rhs_account_number, order_id, instrument_id, arrayList, disposalKind, taxLotSort, taxLotSortDirection, taxLotStatus, selection_strategy != null ? (SelectionStrategy) selection_strategy.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[StreamTaxLotsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamTaxLotsRequestDto) && Intrinsics.areEqual(((StreamTaxLotsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamTaxLotsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b%\b\u0083\b\u0018\u0000 K2\u00020\u0001:\u0002LKBq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B{\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010$R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010$R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\b>\u0010.\u001a\u0004\b<\u0010=R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010?\u0012\u0004\bB\u0010.\u001a\u0004\b@\u0010AR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010C\u0012\u0004\bF\u0010.\u001a\u0004\bD\u0010ER\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010G\u0012\u0004\bJ\u0010.\u001a\u0004\bH\u0010I¨\u0006M"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$Surrogate;", "", "", "rhs_account_number", "order_id", "instrument_id", "", "Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;", "selected_terms", "Lequity_trading_tax_lots/proto/v1/DisposalKindDto;", "disposal_kind", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;", "sort_direction", "Lequity_trading_tax_lots/proto/v1/TaxLotStatusDto;", "lot_status", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "selection_strategy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lequity_trading_tax_lots/proto/v1/DisposalKindDto;Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;Lequity_trading_tax_lots/proto/v1/TaxLotStatusDto;Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lequity_trading_tax_lots/proto/v1/DisposalKindDto;Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;Lequity_trading_tax_lots/proto/v1/TaxLotStatusDto;Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_trading_tax_lots_proto_v1_externalRelease", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRhs_account_number", "getRhs_account_number$annotations", "()V", "getOrder_id", "getOrder_id$annotations", "getInstrument_id", "getInstrument_id$annotations", "Ljava/util/List;", "getSelected_terms", "()Ljava/util/List;", "getSelected_terms$annotations", "Lequity_trading_tax_lots/proto/v1/DisposalKindDto;", "getDisposal_kind", "()Lequity_trading_tax_lots/proto/v1/DisposalKindDto;", "getDisposal_kind$annotations", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;", "getSort", "()Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;", "getSort$annotations", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;", "getSort_direction", "()Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;", "getSort_direction$annotations", "Lequity_trading_tax_lots/proto/v1/TaxLotStatusDto;", "getLot_status", "()Lequity_trading_tax_lots/proto/v1/TaxLotStatusDto;", "getLot_status$annotations", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "getSelection_strategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "getSelection_strategy$annotations", "Companion", "$serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final DisposalKindDto disposal_kind;
        private final String instrument_id;
        private final TaxLotStatusDto lot_status;
        private final String order_id;
        private final String rhs_account_number;
        private final List<TaxLotTermDto> selected_terms;
        private final SelectionStrategyDto selection_strategy;
        private final TaxLotSortDto sort;
        private final TaxLotSortDirectionDto sort_direction;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotsRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamTaxLotsRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (List) null, (DisposalKindDto) null, (TaxLotSortDto) null, (TaxLotSortDirectionDto) null, (TaxLotStatusDto) null, (SelectionStrategyDto) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TaxLotTermDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.selected_terms, surrogate.selected_terms) && this.disposal_kind == surrogate.disposal_kind && this.sort == surrogate.sort && this.sort_direction == surrogate.sort_direction && this.lot_status == surrogate.lot_status && this.selection_strategy == surrogate.selection_strategy;
        }

        public int hashCode() {
            int iHashCode = ((((((this.rhs_account_number.hashCode() * 31) + this.order_id.hashCode()) * 31) + this.instrument_id.hashCode()) * 31) + this.selected_terms.hashCode()) * 31;
            DisposalKindDto disposalKindDto = this.disposal_kind;
            int iHashCode2 = (iHashCode + (disposalKindDto == null ? 0 : disposalKindDto.hashCode())) * 31;
            TaxLotSortDto taxLotSortDto = this.sort;
            int iHashCode3 = (iHashCode2 + (taxLotSortDto == null ? 0 : taxLotSortDto.hashCode())) * 31;
            TaxLotSortDirectionDto taxLotSortDirectionDto = this.sort_direction;
            int iHashCode4 = (iHashCode3 + (taxLotSortDirectionDto == null ? 0 : taxLotSortDirectionDto.hashCode())) * 31;
            TaxLotStatusDto taxLotStatusDto = this.lot_status;
            int iHashCode5 = (iHashCode4 + (taxLotStatusDto == null ? 0 : taxLotStatusDto.hashCode())) * 31;
            SelectionStrategyDto selectionStrategyDto = this.selection_strategy;
            return iHashCode5 + (selectionStrategyDto != null ? selectionStrategyDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(rhs_account_number=" + this.rhs_account_number + ", order_id=" + this.order_id + ", instrument_id=" + this.instrument_id + ", selected_terms=" + this.selected_terms + ", disposal_kind=" + this.disposal_kind + ", sort=" + this.sort + ", sort_direction=" + this.sort_direction + ", lot_status=" + this.lot_status + ", selection_strategy=" + this.selection_strategy + ")";
        }

        /* compiled from: StreamTaxLotsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$Surrogate;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamTaxLotsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, List list, DisposalKindDto disposalKindDto, TaxLotSortDto taxLotSortDto, TaxLotSortDirectionDto taxLotSortDirectionDto, TaxLotStatusDto taxLotStatusDto, SelectionStrategyDto selectionStrategyDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str;
            }
            if ((i & 2) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str2;
            }
            if ((i & 4) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str3;
            }
            if ((i & 8) == 0) {
                this.selected_terms = CollectionsKt.emptyList();
            } else {
                this.selected_terms = list;
            }
            if ((i & 16) == 0) {
                this.disposal_kind = null;
            } else {
                this.disposal_kind = disposalKindDto;
            }
            if ((i & 32) == 0) {
                this.sort = null;
            } else {
                this.sort = taxLotSortDto;
            }
            if ((i & 64) == 0) {
                this.sort_direction = null;
            } else {
                this.sort_direction = taxLotSortDirectionDto;
            }
            if ((i & 128) == 0) {
                this.lot_status = null;
            } else {
                this.lot_status = taxLotStatusDto;
            }
            if ((i & 256) == 0) {
                this.selection_strategy = null;
            } else {
                this.selection_strategy = selectionStrategyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.rhs_account_number);
            }
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.order_id);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.selected_terms, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.selected_terms);
            }
            DisposalKindDto disposalKindDto = self.disposal_kind;
            if (disposalKindDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DisposalKindDto.Serializer.INSTANCE, disposalKindDto);
            }
            TaxLotSortDto taxLotSortDto = self.sort;
            if (taxLotSortDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TaxLotSortDto.Serializer.INSTANCE, taxLotSortDto);
            }
            TaxLotSortDirectionDto taxLotSortDirectionDto = self.sort_direction;
            if (taxLotSortDirectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, TaxLotSortDirectionDto.Serializer.INSTANCE, taxLotSortDirectionDto);
            }
            TaxLotStatusDto taxLotStatusDto = self.lot_status;
            if (taxLotStatusDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, TaxLotStatusDto.Serializer.INSTANCE, taxLotStatusDto);
            }
            SelectionStrategyDto selectionStrategyDto = self.selection_strategy;
            if (selectionStrategyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SelectionStrategyDto.Serializer.INSTANCE, selectionStrategyDto);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String rhs_account_number, String order_id, String instrument_id, List<? extends TaxLotTermDto> selected_terms, DisposalKindDto disposalKindDto, TaxLotSortDto taxLotSortDto, TaxLotSortDirectionDto taxLotSortDirectionDto, TaxLotStatusDto taxLotStatusDto, SelectionStrategyDto selectionStrategyDto) {
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(selected_terms, "selected_terms");
            this.rhs_account_number = rhs_account_number;
            this.order_id = order_id;
            this.instrument_id = instrument_id;
            this.selected_terms = selected_terms;
            this.disposal_kind = disposalKindDto;
            this.sort = taxLotSortDto;
            this.sort_direction = taxLotSortDirectionDto;
            this.lot_status = taxLotStatusDto;
            this.selection_strategy = selectionStrategyDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, List list, DisposalKindDto disposalKindDto, TaxLotSortDto taxLotSortDto, TaxLotSortDirectionDto taxLotSortDirectionDto, TaxLotStatusDto taxLotStatusDto, SelectionStrategyDto selectionStrategyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : disposalKindDto, (i & 32) != 0 ? null : taxLotSortDto, (i & 64) != 0 ? null : taxLotSortDirectionDto, (i & 128) != 0 ? null : taxLotStatusDto, (i & 256) != 0 ? null : selectionStrategyDto);
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final List<TaxLotTermDto> getSelected_terms() {
            return this.selected_terms;
        }

        public final DisposalKindDto getDisposal_kind() {
            return this.disposal_kind;
        }

        public final TaxLotSortDto getSort() {
            return this.sort;
        }

        public final TaxLotSortDirectionDto getSort_direction() {
            return this.sort_direction;
        }

        public final TaxLotStatusDto getLot_status() {
            return this.lot_status;
        }

        public final SelectionStrategyDto getSelection_strategy() {
            return this.selection_strategy;
        }
    }

    /* compiled from: StreamTaxLotsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamTaxLotsRequestDto, StreamTaxLotsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamTaxLotsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamTaxLotsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamTaxLotsRequest> getProtoAdapter() {
            return StreamTaxLotsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotsRequestDto getZeroValue() {
            return StreamTaxLotsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotsRequestDto fromProto(StreamTaxLotsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String rhs_account_number = proto.getRhs_account_number();
            String order_id = proto.getOrder_id();
            String instrument_id = proto.getInstrument_id();
            List<TaxLotTerm> selected_terms = proto.getSelected_terms();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_terms, 10));
            Iterator<T> it = selected_terms.iterator();
            while (it.hasNext()) {
                arrayList.add(TaxLotTermDto.INSTANCE.fromProto((TaxLotTerm) it.next()));
            }
            DisposalKind disposal_kind = proto.getDisposal_kind();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DisposalKindDto disposalKindDtoFromProto = disposal_kind != null ? DisposalKindDto.INSTANCE.fromProto(disposal_kind) : null;
            TaxLotSort sort = proto.getSort();
            TaxLotSortDto taxLotSortDtoFromProto = sort != null ? TaxLotSortDto.INSTANCE.fromProto(sort) : null;
            TaxLotSortDirection sort_direction = proto.getSort_direction();
            TaxLotSortDirectionDto taxLotSortDirectionDtoFromProto = sort_direction != null ? TaxLotSortDirectionDto.INSTANCE.fromProto(sort_direction) : null;
            TaxLotStatus lot_status = proto.getLot_status();
            TaxLotStatusDto taxLotStatusDtoFromProto = lot_status != null ? TaxLotStatusDto.INSTANCE.fromProto(lot_status) : null;
            SelectionStrategy selection_strategy = proto.getSelection_strategy();
            return new StreamTaxLotsRequestDto(new Surrogate(rhs_account_number, order_id, instrument_id, arrayList, disposalKindDtoFromProto, taxLotSortDtoFromProto, taxLotSortDirectionDtoFromProto, taxLotStatusDtoFromProto, selection_strategy != null ? SelectionStrategyDto.INSTANCE.fromProto(selection_strategy) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamTaxLotsRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new StreamTaxLotsRequestDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamTaxLotsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<StreamTaxLotsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/equity_trading_tax_lots.proto.v1.StreamTaxLotsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamTaxLotsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamTaxLotsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamTaxLotsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamTaxLotsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "equity_trading_tax_lots.proto.v1.StreamTaxLotsRequestDto";
        }
    }
}
