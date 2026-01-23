package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.TaxLotSelectionDto;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import com.robinhood.rosetta.eventlogging.TaxLotsContextDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: TaxLotsContextDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006345678B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0006\u0010\u0015Jd\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020,H\u0016J\b\u00102\u001a\u00020,H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$Surrogate;)V", "lots_available", "", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "tax_lot_selections", "targeted_lot", "sort_type", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "estimated_credit", "", "estimated_gain_loss", "total_shares", "tax_lot_selection_method", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "(Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;DDDLcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;)V", "getLots_available", "()Ljava/util/List;", "getTax_lot_selections", "getTargeted_lot", "()Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "getSort_type", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "getEstimated_credit", "()D", "getEstimated_gain_loss", "getTotal_shares", "getTax_lot_selection_method", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SelectionStrategyDto", "SortTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class TaxLotsContextDto implements Dto3<TaxLotsContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLotsContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLotsContextDto, TaxLotsContext>> binaryBase64Serializer$delegate;
    private static final TaxLotsContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLotsContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLotsContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final java.util.List<TaxLotSelectionDto> getLots_available() {
        return this.surrogate.getLots_available();
    }

    public final java.util.List<TaxLotSelectionDto> getTax_lot_selections() {
        return this.surrogate.getTax_lot_selections();
    }

    public final TaxLotSelectionDto getTargeted_lot() {
        return this.surrogate.getTargeted_lot();
    }

    public final SortTypeDto getSort_type() {
        return this.surrogate.getSort_type();
    }

    public final double getEstimated_credit() {
        return this.surrogate.getEstimated_credit();
    }

    public final double getEstimated_gain_loss() {
        return this.surrogate.getEstimated_gain_loss();
    }

    public final double getTotal_shares() {
        return this.surrogate.getTotal_shares();
    }

    public final SelectionStrategyDto getTax_lot_selection_method() {
        return this.surrogate.getTax_lot_selection_method();
    }

    public /* synthetic */ TaxLotsContextDto(java.util.List list, java.util.List list2, TaxLotSelectionDto taxLotSelectionDto, SortTypeDto sortTypeDto, double d, double d2, double d3, SelectionStrategyDto selectionStrategyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : taxLotSelectionDto, (i & 8) != 0 ? SortTypeDto.INSTANCE.getZeroValue() : sortTypeDto, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? 0.0d : d2, (i & 64) != 0 ? 0.0d : d3, (i & 128) != 0 ? SelectionStrategyDto.INSTANCE.getZeroValue() : selectionStrategyDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLotsContextDto(java.util.List<TaxLotSelectionDto> lots_available, java.util.List<TaxLotSelectionDto> tax_lot_selections, TaxLotSelectionDto taxLotSelectionDto, SortTypeDto sort_type, double d, double d2, double d3, SelectionStrategyDto tax_lot_selection_method) {
        this(new Surrogate(lots_available, tax_lot_selections, taxLotSelectionDto, sort_type, d, d2, d3, tax_lot_selection_method));
        Intrinsics.checkNotNullParameter(lots_available, "lots_available");
        Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
        Intrinsics.checkNotNullParameter(sort_type, "sort_type");
        Intrinsics.checkNotNullParameter(tax_lot_selection_method, "tax_lot_selection_method");
    }

    public static /* synthetic */ TaxLotsContextDto copy$default(TaxLotsContextDto taxLotsContextDto, java.util.List list, java.util.List list2, TaxLotSelectionDto taxLotSelectionDto, SortTypeDto sortTypeDto, double d, double d2, double d3, SelectionStrategyDto selectionStrategyDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taxLotsContextDto.surrogate.getLots_available();
        }
        if ((i & 2) != 0) {
            list2 = taxLotsContextDto.surrogate.getTax_lot_selections();
        }
        if ((i & 4) != 0) {
            taxLotSelectionDto = taxLotsContextDto.surrogate.getTargeted_lot();
        }
        if ((i & 8) != 0) {
            sortTypeDto = taxLotsContextDto.surrogate.getSort_type();
        }
        if ((i & 16) != 0) {
            d = taxLotsContextDto.surrogate.getEstimated_credit();
        }
        if ((i & 32) != 0) {
            d2 = taxLotsContextDto.surrogate.getEstimated_gain_loss();
        }
        if ((i & 64) != 0) {
            d3 = taxLotsContextDto.surrogate.getTotal_shares();
        }
        if ((i & 128) != 0) {
            selectionStrategyDto = taxLotsContextDto.surrogate.getTax_lot_selection_method();
        }
        SelectionStrategyDto selectionStrategyDto2 = selectionStrategyDto;
        double d4 = d3;
        double d5 = d2;
        double d6 = d;
        return taxLotsContextDto.copy(list, list2, taxLotSelectionDto, sortTypeDto, d6, d5, d4, selectionStrategyDto2);
    }

    public final TaxLotsContextDto copy(java.util.List<TaxLotSelectionDto> lots_available, java.util.List<TaxLotSelectionDto> tax_lot_selections, TaxLotSelectionDto targeted_lot, SortTypeDto sort_type, double estimated_credit, double estimated_gain_loss, double total_shares, SelectionStrategyDto tax_lot_selection_method) {
        Intrinsics.checkNotNullParameter(lots_available, "lots_available");
        Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
        Intrinsics.checkNotNullParameter(sort_type, "sort_type");
        Intrinsics.checkNotNullParameter(tax_lot_selection_method, "tax_lot_selection_method");
        return new TaxLotsContextDto(new Surrogate(lots_available, tax_lot_selections, targeted_lot, sort_type, estimated_credit, estimated_gain_loss, total_shares, tax_lot_selection_method));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TaxLotsContext toProto() {
        java.util.List<TaxLotSelectionDto> lots_available = this.surrogate.getLots_available();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lots_available, 10));
        Iterator<T> it = lots_available.iterator();
        while (it.hasNext()) {
            arrayList.add(((TaxLotSelectionDto) it.next()).toProto());
        }
        java.util.List<TaxLotSelectionDto> tax_lot_selections = this.surrogate.getTax_lot_selections();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lot_selections, 10));
        Iterator<T> it2 = tax_lot_selections.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((TaxLotSelectionDto) it2.next()).toProto());
        }
        TaxLotSelectionDto targeted_lot = this.surrogate.getTargeted_lot();
        return new TaxLotsContext(arrayList, arrayList2, targeted_lot != null ? targeted_lot.toProto() : null, (TaxLotsContext.SortType) this.surrogate.getSort_type().toProto(), this.surrogate.getEstimated_credit(), this.surrogate.getEstimated_gain_loss(), this.surrogate.getTotal_shares(), (TaxLotsContext.SelectionStrategy) this.surrogate.getTax_lot_selection_method().toProto(), null, 256, null);
    }

    public String toString() {
        return "[TaxLotsContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLotsContextDto) && Intrinsics.areEqual(((TaxLotsContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLotsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002FGB\u0092\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013Bq\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u0018\u00103\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u00104\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u00105\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u00106\u001a\u00020\u0011HÆ\u0003J\u0094\u0001\u00107\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0015HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001J%\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0001¢\u0006\u0002\bER\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$R+\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010'R+\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010'R+\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010'R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010.¨\u0006H"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$Surrogate;", "", "lots_available", "", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "tax_lot_selections", "targeted_lot", "sort_type", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "estimated_credit", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "estimated_gain_loss", "total_shares", "tax_lot_selection_method", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;DDDLcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;DDDLcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLots_available$annotations", "()V", "getLots_available", "()Ljava/util/List;", "getTax_lot_selections$annotations", "getTax_lot_selections", "getTargeted_lot$annotations", "getTargeted_lot", "()Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "getSort_type$annotations", "getSort_type", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "getEstimated_credit$annotations", "getEstimated_credit", "()D", "getEstimated_gain_loss$annotations", "getEstimated_gain_loss", "getTotal_shares$annotations", "getTotal_shares", "getTax_lot_selection_method$annotations", "getTax_lot_selection_method", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double estimated_credit;
        private final double estimated_gain_loss;
        private final java.util.List<TaxLotSelectionDto> lots_available;
        private final SortTypeDto sort_type;
        private final TaxLotSelectionDto targeted_lot;
        private final SelectionStrategyDto tax_lot_selection_method;
        private final java.util.List<TaxLotSelectionDto> tax_lot_selections;
        private final double total_shares;

        public Surrogate() {
            this((java.util.List) null, (java.util.List) null, (TaxLotSelectionDto) null, (SortTypeDto) null, 0.0d, 0.0d, 0.0d, (SelectionStrategyDto) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TaxLotSelectionDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(TaxLotSelectionDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, java.util.List list, java.util.List list2, TaxLotSelectionDto taxLotSelectionDto, SortTypeDto sortTypeDto, double d, double d2, double d3, SelectionStrategyDto selectionStrategyDto, int i, Object obj) {
            if ((i & 1) != 0) {
                list = surrogate.lots_available;
            }
            if ((i & 2) != 0) {
                list2 = surrogate.tax_lot_selections;
            }
            if ((i & 4) != 0) {
                taxLotSelectionDto = surrogate.targeted_lot;
            }
            if ((i & 8) != 0) {
                sortTypeDto = surrogate.sort_type;
            }
            if ((i & 16) != 0) {
                d = surrogate.estimated_credit;
            }
            if ((i & 32) != 0) {
                d2 = surrogate.estimated_gain_loss;
            }
            if ((i & 64) != 0) {
                d3 = surrogate.total_shares;
            }
            if ((i & 128) != 0) {
                selectionStrategyDto = surrogate.tax_lot_selection_method;
            }
            SelectionStrategyDto selectionStrategyDto2 = selectionStrategyDto;
            double d4 = d3;
            double d5 = d2;
            double d6 = d;
            return surrogate.copy(list, list2, taxLotSelectionDto, sortTypeDto, d6, d5, d4, selectionStrategyDto2);
        }

        @SerialName("estimatedCredit")
        @JsonAnnotations2(names = {"estimated_credit"})
        public static /* synthetic */ void getEstimated_credit$annotations() {
        }

        @SerialName("estimatedGainLoss")
        @JsonAnnotations2(names = {"estimated_gain_loss"})
        public static /* synthetic */ void getEstimated_gain_loss$annotations() {
        }

        @SerialName("lotsAvailable")
        @JsonAnnotations2(names = {"lots_available"})
        public static /* synthetic */ void getLots_available$annotations() {
        }

        @SerialName("sortType")
        @JsonAnnotations2(names = {"sort_type"})
        public static /* synthetic */ void getSort_type$annotations() {
        }

        @SerialName("targetedLot")
        @JsonAnnotations2(names = {"targeted_lot"})
        public static /* synthetic */ void getTargeted_lot$annotations() {
        }

        @SerialName("taxLotSelectionMethod")
        @JsonAnnotations2(names = {"tax_lot_selection_method"})
        public static /* synthetic */ void getTax_lot_selection_method$annotations() {
        }

        @SerialName("taxLotSelections")
        @JsonAnnotations2(names = {"tax_lot_selections"})
        public static /* synthetic */ void getTax_lot_selections$annotations() {
        }

        @SerialName("totalShares")
        @JsonAnnotations2(names = {"total_shares"})
        public static /* synthetic */ void getTotal_shares$annotations() {
        }

        public final java.util.List<TaxLotSelectionDto> component1() {
            return this.lots_available;
        }

        public final java.util.List<TaxLotSelectionDto> component2() {
            return this.tax_lot_selections;
        }

        /* renamed from: component3, reason: from getter */
        public final TaxLotSelectionDto getTargeted_lot() {
            return this.targeted_lot;
        }

        /* renamed from: component4, reason: from getter */
        public final SortTypeDto getSort_type() {
            return this.sort_type;
        }

        /* renamed from: component5, reason: from getter */
        public final double getEstimated_credit() {
            return this.estimated_credit;
        }

        /* renamed from: component6, reason: from getter */
        public final double getEstimated_gain_loss() {
            return this.estimated_gain_loss;
        }

        /* renamed from: component7, reason: from getter */
        public final double getTotal_shares() {
            return this.total_shares;
        }

        /* renamed from: component8, reason: from getter */
        public final SelectionStrategyDto getTax_lot_selection_method() {
            return this.tax_lot_selection_method;
        }

        public final Surrogate copy(java.util.List<TaxLotSelectionDto> lots_available, java.util.List<TaxLotSelectionDto> tax_lot_selections, TaxLotSelectionDto targeted_lot, SortTypeDto sort_type, double estimated_credit, double estimated_gain_loss, double total_shares, SelectionStrategyDto tax_lot_selection_method) {
            Intrinsics.checkNotNullParameter(lots_available, "lots_available");
            Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
            Intrinsics.checkNotNullParameter(sort_type, "sort_type");
            Intrinsics.checkNotNullParameter(tax_lot_selection_method, "tax_lot_selection_method");
            return new Surrogate(lots_available, tax_lot_selections, targeted_lot, sort_type, estimated_credit, estimated_gain_loss, total_shares, tax_lot_selection_method);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.lots_available, surrogate.lots_available) && Intrinsics.areEqual(this.tax_lot_selections, surrogate.tax_lot_selections) && Intrinsics.areEqual(this.targeted_lot, surrogate.targeted_lot) && this.sort_type == surrogate.sort_type && Double.compare(this.estimated_credit, surrogate.estimated_credit) == 0 && Double.compare(this.estimated_gain_loss, surrogate.estimated_gain_loss) == 0 && Double.compare(this.total_shares, surrogate.total_shares) == 0 && this.tax_lot_selection_method == surrogate.tax_lot_selection_method;
        }

        public int hashCode() {
            int iHashCode = ((this.lots_available.hashCode() * 31) + this.tax_lot_selections.hashCode()) * 31;
            TaxLotSelectionDto taxLotSelectionDto = this.targeted_lot;
            return ((((((((((iHashCode + (taxLotSelectionDto == null ? 0 : taxLotSelectionDto.hashCode())) * 31) + this.sort_type.hashCode()) * 31) + Double.hashCode(this.estimated_credit)) * 31) + Double.hashCode(this.estimated_gain_loss)) * 31) + Double.hashCode(this.total_shares)) * 31) + this.tax_lot_selection_method.hashCode();
        }

        public String toString() {
            return "Surrogate(lots_available=" + this.lots_available + ", tax_lot_selections=" + this.tax_lot_selections + ", targeted_lot=" + this.targeted_lot + ", sort_type=" + this.sort_type + ", estimated_credit=" + this.estimated_credit + ", estimated_gain_loss=" + this.estimated_gain_loss + ", total_shares=" + this.total_shares + ", tax_lot_selection_method=" + this.tax_lot_selection_method + ")";
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLotsContextDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.eventlogging.TaxLotsContextDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TaxLotsContextDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.eventlogging.TaxLotsContextDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TaxLotsContextDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, java.util.List list, java.util.List list2, TaxLotSelectionDto taxLotSelectionDto, SortTypeDto sortTypeDto, double d, double d2, double d3, SelectionStrategyDto selectionStrategyDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.lots_available = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.tax_lot_selections = CollectionsKt.emptyList();
            } else {
                this.tax_lot_selections = list2;
            }
            if ((i & 4) == 0) {
                this.targeted_lot = null;
            } else {
                this.targeted_lot = taxLotSelectionDto;
            }
            if ((i & 8) == 0) {
                this.sort_type = SortTypeDto.INSTANCE.getZeroValue();
            } else {
                this.sort_type = sortTypeDto;
            }
            if ((i & 16) == 0) {
                this.estimated_credit = 0.0d;
            } else {
                this.estimated_credit = d;
            }
            if ((i & 32) == 0) {
                this.estimated_gain_loss = 0.0d;
            } else {
                this.estimated_gain_loss = d2;
            }
            if ((i & 64) == 0) {
                this.total_shares = 0.0d;
            } else {
                this.total_shares = d3;
            }
            if ((i & 128) == 0) {
                this.tax_lot_selection_method = SelectionStrategyDto.INSTANCE.getZeroValue();
            } else {
                this.tax_lot_selection_method = selectionStrategyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.lots_available, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.lots_available);
            }
            if (!Intrinsics.areEqual(self.tax_lot_selections, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.tax_lot_selections);
            }
            TaxLotSelectionDto taxLotSelectionDto = self.targeted_lot;
            if (taxLotSelectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TaxLotSelectionDto.Serializer.INSTANCE, taxLotSelectionDto);
            }
            if (self.sort_type != SortTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, SortTypeDto.Serializer.INSTANCE, self.sort_type);
            }
            if (Double.compare(self.estimated_credit, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.estimated_credit));
            }
            if (Double.compare(self.estimated_gain_loss, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.estimated_gain_loss));
            }
            if (Double.compare(self.total_shares, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_shares));
            }
            if (self.tax_lot_selection_method != SelectionStrategyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, SelectionStrategyDto.Serializer.INSTANCE, self.tax_lot_selection_method);
            }
        }

        public Surrogate(java.util.List<TaxLotSelectionDto> lots_available, java.util.List<TaxLotSelectionDto> tax_lot_selections, TaxLotSelectionDto taxLotSelectionDto, SortTypeDto sort_type, double d, double d2, double d3, SelectionStrategyDto tax_lot_selection_method) {
            Intrinsics.checkNotNullParameter(lots_available, "lots_available");
            Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
            Intrinsics.checkNotNullParameter(sort_type, "sort_type");
            Intrinsics.checkNotNullParameter(tax_lot_selection_method, "tax_lot_selection_method");
            this.lots_available = lots_available;
            this.tax_lot_selections = tax_lot_selections;
            this.targeted_lot = taxLotSelectionDto;
            this.sort_type = sort_type;
            this.estimated_credit = d;
            this.estimated_gain_loss = d2;
            this.total_shares = d3;
            this.tax_lot_selection_method = tax_lot_selection_method;
        }

        public final java.util.List<TaxLotSelectionDto> getLots_available() {
            return this.lots_available;
        }

        public /* synthetic */ Surrogate(java.util.List list, java.util.List list2, TaxLotSelectionDto taxLotSelectionDto, SortTypeDto sortTypeDto, double d, double d2, double d3, SelectionStrategyDto selectionStrategyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : taxLotSelectionDto, (i & 8) != 0 ? SortTypeDto.INSTANCE.getZeroValue() : sortTypeDto, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? 0.0d : d2, (i & 64) != 0 ? 0.0d : d3, (i & 128) != 0 ? SelectionStrategyDto.INSTANCE.getZeroValue() : selectionStrategyDto);
        }

        public final java.util.List<TaxLotSelectionDto> getTax_lot_selections() {
            return this.tax_lot_selections;
        }

        public final TaxLotSelectionDto getTargeted_lot() {
            return this.targeted_lot;
        }

        public final SortTypeDto getSort_type() {
            return this.sort_type;
        }

        public final double getEstimated_credit() {
            return this.estimated_credit;
        }

        public final double getEstimated_gain_loss() {
            return this.estimated_gain_loss;
        }

        public final double getTotal_shares() {
            return this.total_shares;
        }

        public final SelectionStrategyDto getTax_lot_selection_method() {
            return this.tax_lot_selection_method;
        }
    }

    /* compiled from: TaxLotsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLotsContextDto, TaxLotsContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLotsContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotsContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotsContextDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLotsContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLotsContext> getProtoAdapter() {
            return TaxLotsContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotsContextDto getZeroValue() {
            return TaxLotsContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotsContextDto fromProto(TaxLotsContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            java.util.List<TaxLotSelection> lots_available = proto.getLots_available();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lots_available, 10));
            Iterator<T> it = lots_available.iterator();
            while (it.hasNext()) {
                arrayList.add(TaxLotSelectionDto.INSTANCE.fromProto((TaxLotSelection) it.next()));
            }
            java.util.List<TaxLotSelection> tax_lot_selections = proto.getTax_lot_selections();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lot_selections, 10));
            Iterator<T> it2 = tax_lot_selections.iterator();
            while (it2.hasNext()) {
                arrayList2.add(TaxLotSelectionDto.INSTANCE.fromProto((TaxLotSelection) it2.next()));
            }
            TaxLotSelection targeted_lot = proto.getTargeted_lot();
            return new TaxLotsContextDto(new Surrogate(arrayList, arrayList2, targeted_lot != null ? TaxLotSelectionDto.INSTANCE.fromProto(targeted_lot) : null, SortTypeDto.INSTANCE.fromProto(proto.getSort_type()), proto.getEstimated_credit(), proto.getEstimated_gain_loss(), proto.getTotal_shares(), SelectionStrategyDto.INSTANCE.fromProto(proto.getTax_lot_selection_method())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TaxLotsContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLotsContextDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new TaxLotsContextDto(null, null, null, null, 0.0d, 0.0d, 0.0d, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TaxLotsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SELECTION_STRATEGY_UNSPECIFIED", "FIRST_IN", "LAST_IN", "LOWEST_COST", "HIGHEST_COST", "CUSTOM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static final class SelectionStrategyDto implements Dto2<TaxLotsContext.SelectionStrategy>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SelectionStrategyDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SelectionStrategyDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SelectionStrategyDto, TaxLotsContext.SelectionStrategy>> binaryBase64Serializer$delegate;
        public static final SelectionStrategyDto SELECTION_STRATEGY_UNSPECIFIED = new SELECTION_STRATEGY_UNSPECIFIED("SELECTION_STRATEGY_UNSPECIFIED", 0);
        public static final SelectionStrategyDto FIRST_IN = new FIRST_IN("FIRST_IN", 1);
        public static final SelectionStrategyDto LAST_IN = new LAST_IN("LAST_IN", 2);
        public static final SelectionStrategyDto LOWEST_COST = new LOWEST_COST("LOWEST_COST", 3);
        public static final SelectionStrategyDto HIGHEST_COST = new HIGHEST_COST("HIGHEST_COST", 4);
        public static final SelectionStrategyDto CUSTOM = new CUSTOM("CUSTOM", 5);

        private static final /* synthetic */ SelectionStrategyDto[] $values() {
            return new SelectionStrategyDto[]{SELECTION_STRATEGY_UNSPECIFIED, FIRST_IN, LAST_IN, LOWEST_COST, HIGHEST_COST, CUSTOM};
        }

        public /* synthetic */ SelectionStrategyDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SelectionStrategyDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotsContextDto.SelectionStrategyDto.SELECTION_STRATEGY_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELECTION_STRATEGY_UNSPECIFIED extends SelectionStrategyDto {
            SELECTION_STRATEGY_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotsContext.SelectionStrategy toProto() {
                return TaxLotsContext.SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
            }
        }

        private SelectionStrategyDto(String str, int i) {
        }

        static {
            SelectionStrategyDto[] selectionStrategyDtoArr$values = $values();
            $VALUES = selectionStrategyDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(selectionStrategyDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TaxLotsContextDto$SelectionStrategyDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TaxLotsContextDto.SelectionStrategyDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotsContextDto.SelectionStrategyDto.FIRST_IN", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIRST_IN extends SelectionStrategyDto {
            FIRST_IN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotsContext.SelectionStrategy toProto() {
                return TaxLotsContext.SelectionStrategy.FIRST_IN;
            }
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotsContextDto.SelectionStrategyDto.LAST_IN", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LAST_IN extends SelectionStrategyDto {
            LAST_IN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotsContext.SelectionStrategy toProto() {
                return TaxLotsContext.SelectionStrategy.LAST_IN;
            }
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotsContextDto.SelectionStrategyDto.LOWEST_COST", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOWEST_COST extends SelectionStrategyDto {
            LOWEST_COST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotsContext.SelectionStrategy toProto() {
                return TaxLotsContext.SelectionStrategy.LOWEST_COST;
            }
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotsContextDto.SelectionStrategyDto.HIGHEST_COST", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HIGHEST_COST extends SelectionStrategyDto {
            HIGHEST_COST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotsContext.SelectionStrategy toProto() {
                return TaxLotsContext.SelectionStrategy.HIGHEST_COST;
            }
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotsContextDto.SelectionStrategyDto.CUSTOM", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CUSTOM extends SelectionStrategyDto {
            CUSTOM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotsContext.SelectionStrategy toProto() {
                return TaxLotsContext.SelectionStrategy.CUSTOM;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SelectionStrategyDto, TaxLotsContext.SelectionStrategy> {

            /* compiled from: TaxLotsContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TaxLotsContext.SelectionStrategy.values().length];
                    try {
                        iArr[TaxLotsContext.SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TaxLotsContext.SelectionStrategy.FIRST_IN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TaxLotsContext.SelectionStrategy.LAST_IN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TaxLotsContext.SelectionStrategy.LOWEST_COST.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TaxLotsContext.SelectionStrategy.HIGHEST_COST.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TaxLotsContext.SelectionStrategy.CUSTOM.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SelectionStrategyDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SelectionStrategyDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SelectionStrategyDto> getBinaryBase64Serializer() {
                return (KSerializer) SelectionStrategyDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TaxLotsContext.SelectionStrategy> getProtoAdapter() {
                return TaxLotsContext.SelectionStrategy.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SelectionStrategyDto getZeroValue() {
                return SelectionStrategyDto.SELECTION_STRATEGY_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SelectionStrategyDto fromProto(TaxLotsContext.SelectionStrategy proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return SelectionStrategyDto.SELECTION_STRATEGY_UNSPECIFIED;
                    case 2:
                        return SelectionStrategyDto.FIRST_IN;
                    case 3:
                        return SelectionStrategyDto.LAST_IN;
                    case 4:
                        return SelectionStrategyDto.LOWEST_COST;
                    case 5:
                        return SelectionStrategyDto.HIGHEST_COST;
                    case 6:
                        return SelectionStrategyDto.CUSTOM;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SelectionStrategyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<SelectionStrategyDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SelectionStrategyDto, TaxLotsContext.SelectionStrategy> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TaxLotsContext.SelectionStrategy", SelectionStrategyDto.getEntries(), SelectionStrategyDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SelectionStrategyDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SelectionStrategyDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SelectionStrategyDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SelectionStrategyDto valueOf(String str) {
            return (SelectionStrategyDto) Enum.valueOf(SelectionStrategyDto.class, str);
        }

        public static SelectionStrategyDto[] values() {
            return (SelectionStrategyDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TaxLotsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SORT_TYPE_UNSPECIFIED", "DATE", "COST_SHARE", "GAIN_LOSS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SortTypeDto implements Dto2<TaxLotsContext.SortType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SortTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SortTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SortTypeDto, TaxLotsContext.SortType>> binaryBase64Serializer$delegate;
        public static final SortTypeDto SORT_TYPE_UNSPECIFIED = new SORT_TYPE_UNSPECIFIED("SORT_TYPE_UNSPECIFIED", 0);
        public static final SortTypeDto DATE = new DATE("DATE", 1);
        public static final SortTypeDto COST_SHARE = new COST_SHARE("COST_SHARE", 2);
        public static final SortTypeDto GAIN_LOSS = new GAIN_LOSS("GAIN_LOSS", 3);

        private static final /* synthetic */ SortTypeDto[] $values() {
            return new SortTypeDto[]{SORT_TYPE_UNSPECIFIED, DATE, COST_SHARE, GAIN_LOSS};
        }

        public /* synthetic */ SortTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SortTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotsContextDto.SortTypeDto.SORT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SORT_TYPE_UNSPECIFIED extends SortTypeDto {
            SORT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotsContext.SortType toProto() {
                return TaxLotsContext.SortType.SORT_TYPE_UNSPECIFIED;
            }
        }

        private SortTypeDto(String str, int i) {
        }

        static {
            SortTypeDto[] sortTypeDtoArr$values = $values();
            $VALUES = sortTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sortTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TaxLotsContextDto$SortTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TaxLotsContextDto.SortTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotsContextDto.SortTypeDto.DATE", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DATE extends SortTypeDto {
            DATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotsContext.SortType toProto() {
                return TaxLotsContext.SortType.DATE;
            }
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotsContextDto.SortTypeDto.COST_SHARE", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COST_SHARE extends SortTypeDto {
            COST_SHARE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotsContext.SortType toProto() {
                return TaxLotsContext.SortType.COST_SHARE;
            }
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TaxLotsContextDto.SortTypeDto.GAIN_LOSS", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GAIN_LOSS extends SortTypeDto {
            GAIN_LOSS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TaxLotsContext.SortType toProto() {
                return TaxLotsContext.SortType.GAIN_LOSS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SortTypeDto, TaxLotsContext.SortType> {

            /* compiled from: TaxLotsContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TaxLotsContext.SortType.values().length];
                    try {
                        iArr[TaxLotsContext.SortType.SORT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TaxLotsContext.SortType.DATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TaxLotsContext.SortType.COST_SHARE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TaxLotsContext.SortType.GAIN_LOSS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SortTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SortTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SortTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) SortTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TaxLotsContext.SortType> getProtoAdapter() {
                return TaxLotsContext.SortType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SortTypeDto getZeroValue() {
                return SortTypeDto.SORT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SortTypeDto fromProto(TaxLotsContext.SortType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return SortTypeDto.SORT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return SortTypeDto.DATE;
                }
                if (i == 3) {
                    return SortTypeDto.COST_SHARE;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return SortTypeDto.GAIN_LOSS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TaxLotsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$SortTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SortTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SortTypeDto, TaxLotsContext.SortType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TaxLotsContext.SortType", SortTypeDto.getEntries(), SortTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SortTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SortTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SortTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SortTypeDto valueOf(String str) {
            return (SortTypeDto) Enum.valueOf(SortTypeDto.class, str);
        }

        public static SortTypeDto[] values() {
            return (SortTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TaxLotsContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<TaxLotsContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.TaxLotsContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLotsContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLotsContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLotsContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLotsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.TaxLotsContextDto";
        }
    }
}
