package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.OptionChainDetailsDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.robinhood.rosetta.mainst.UnderlyingInstrumentDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
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
import rosetta.mainst.InstrumentState;
import rosetta.mainst.InstrumentStateDto;
import rosetta.mainst.Tradability;
import rosetta.mainst.TradabilityDto;

/* compiled from: OptionChainDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004;<=>B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B}\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0006\u0010\u001aJz\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0018J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020\u000eH\u0016J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\b\u00103\u001a\u000204H\u0016J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u000204H\u0016J\b\u0010:\u001a\u000204H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b+\u0010*¨\u0006?"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/OptionChainDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto$Surrogate;)V", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "chain_id", "state", "Lrosetta/mainst/InstrumentStateDto;", "symbol", "", "trade_value_multiplier", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "underlying_instruments", "", "Lcom/robinhood/rosetta/mainst/UnderlyingInstrumentDto;", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "updated_at", "tradability_for_late_closing_etfs", "Lrosetta/mainst/TradabilityDto;", "extended_hours_tradability", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/InstrumentStateDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getChain_id", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getSymbol", "()Ljava/lang/String;", "getTrade_value_multiplier", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getUnderlying_instruments", "()Ljava/util/List;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getUpdated_at", "getTradability_for_late_closing_etfs", "()Lrosetta/mainst/TradabilityDto;", "getExtended_hours_tradability", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class OptionChainDetailsDto implements Dto3<OptionChainDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionChainDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionChainDetailsDto, OptionChainDetails>> binaryBase64Serializer$delegate;
    private static final OptionChainDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionChainDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionChainDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final UUIDDto getChain_id() {
        return this.surrogate.getChain_id();
    }

    public final InstrumentStateDto getState() {
        return this.surrogate.getState();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final DecimalDto getTrade_value_multiplier() {
        return this.surrogate.getTrade_value_multiplier();
    }

    public final List<UnderlyingInstrumentDto> getUnderlying_instruments() {
        return this.surrogate.getUnderlying_instruments();
    }

    public final TimeDto getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final TimeDto getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final TradabilityDto getTradability_for_late_closing_etfs() {
        return this.surrogate.getTradability_for_late_closing_etfs();
    }

    public final TradabilityDto getExtended_hours_tradability() {
        return this.surrogate.getExtended_hours_tradability();
    }

    public /* synthetic */ OptionChainDetailsDto(UUIDDto uUIDDto, UUIDDto uUIDDto2, InstrumentStateDto instrumentStateDto, String str, DecimalDto decimalDto, List list, TimeDto timeDto, TimeDto timeDto2, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? null : uUIDDto2, (i & 4) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : decimalDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : timeDto, (i & 128) != 0 ? null : timeDto2, (i & 256) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 512) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionChainDetailsDto(UUIDDto uUIDDto, UUIDDto uUIDDto2, InstrumentStateDto state, String symbol, DecimalDto decimalDto, List<UnderlyingInstrumentDto> underlying_instruments, TimeDto timeDto, TimeDto timeDto2, TradabilityDto tradability_for_late_closing_etfs, TradabilityDto extended_hours_tradability) {
        this(new Surrogate(uUIDDto, uUIDDto2, state, symbol, decimalDto, underlying_instruments, timeDto, timeDto2, tradability_for_late_closing_etfs, extended_hours_tradability));
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(underlying_instruments, "underlying_instruments");
        Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
        Intrinsics.checkNotNullParameter(extended_hours_tradability, "extended_hours_tradability");
    }

    public static /* synthetic */ OptionChainDetailsDto copy$default(OptionChainDetailsDto optionChainDetailsDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, InstrumentStateDto instrumentStateDto, String str, DecimalDto decimalDto, List list, TimeDto timeDto, TimeDto timeDto2, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            uUIDDto = optionChainDetailsDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            uUIDDto2 = optionChainDetailsDto.surrogate.getChain_id();
        }
        if ((i & 4) != 0) {
            instrumentStateDto = optionChainDetailsDto.surrogate.getState();
        }
        if ((i & 8) != 0) {
            str = optionChainDetailsDto.surrogate.getSymbol();
        }
        if ((i & 16) != 0) {
            decimalDto = optionChainDetailsDto.surrogate.getTrade_value_multiplier();
        }
        if ((i & 32) != 0) {
            list = optionChainDetailsDto.surrogate.getUnderlying_instruments();
        }
        if ((i & 64) != 0) {
            timeDto = optionChainDetailsDto.surrogate.getCreated_at();
        }
        if ((i & 128) != 0) {
            timeDto2 = optionChainDetailsDto.surrogate.getUpdated_at();
        }
        if ((i & 256) != 0) {
            tradabilityDto = optionChainDetailsDto.surrogate.getTradability_for_late_closing_etfs();
        }
        if ((i & 512) != 0) {
            tradabilityDto2 = optionChainDetailsDto.surrogate.getExtended_hours_tradability();
        }
        TradabilityDto tradabilityDto3 = tradabilityDto;
        TradabilityDto tradabilityDto4 = tradabilityDto2;
        TimeDto timeDto3 = timeDto;
        TimeDto timeDto4 = timeDto2;
        DecimalDto decimalDto2 = decimalDto;
        List list2 = list;
        return optionChainDetailsDto.copy(uUIDDto, uUIDDto2, instrumentStateDto, str, decimalDto2, list2, timeDto3, timeDto4, tradabilityDto3, tradabilityDto4);
    }

    public final OptionChainDetailsDto copy(UUIDDto id, UUIDDto chain_id, InstrumentStateDto state, String symbol, DecimalDto trade_value_multiplier, List<UnderlyingInstrumentDto> underlying_instruments, TimeDto created_at, TimeDto updated_at, TradabilityDto tradability_for_late_closing_etfs, TradabilityDto extended_hours_tradability) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(underlying_instruments, "underlying_instruments");
        Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
        Intrinsics.checkNotNullParameter(extended_hours_tradability, "extended_hours_tradability");
        return new OptionChainDetailsDto(new Surrogate(id, chain_id, state, symbol, trade_value_multiplier, underlying_instruments, created_at, updated_at, tradability_for_late_closing_etfs, extended_hours_tradability));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionChainDetails toProto() {
        UUIDDto id = this.surrogate.getId();
        UUID proto = id != null ? id.toProto() : null;
        UUIDDto chain_id = this.surrogate.getChain_id();
        UUID proto2 = chain_id != null ? chain_id.toProto() : null;
        InstrumentState instrumentState = (InstrumentState) this.surrogate.getState().toProto();
        String symbol = this.surrogate.getSymbol();
        DecimalDto trade_value_multiplier = this.surrogate.getTrade_value_multiplier();
        Decimal proto3 = trade_value_multiplier != null ? trade_value_multiplier.toProto() : null;
        List<UnderlyingInstrumentDto> underlying_instruments = this.surrogate.getUnderlying_instruments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(underlying_instruments, 10));
        Iterator<T> it = underlying_instruments.iterator();
        while (it.hasNext()) {
            arrayList.add(((UnderlyingInstrumentDto) it.next()).toProto());
        }
        TimeDto created_at = this.surrogate.getCreated_at();
        Time proto4 = created_at != null ? created_at.toProto() : null;
        TimeDto updated_at = this.surrogate.getUpdated_at();
        return new OptionChainDetails(proto, proto2, instrumentState, symbol, proto3, arrayList, proto4, updated_at != null ? updated_at.toProto() : null, (Tradability) this.surrogate.getTradability_for_late_closing_etfs().toProto(), (Tradability) this.surrogate.getExtended_hours_tradability().toProto(), null, 1024, null);
    }

    public String toString() {
        return "[OptionChainDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionChainDetailsDto) && Intrinsics.areEqual(((OptionChainDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionChainDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002OPB{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0014\u0010\u001aJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010?\u001a\u00020\u0012HÆ\u0003J\t\u0010@\u001a\u00020\u0012HÆ\u0003J}\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0017HÖ\u0001J\t\u0010F\u001a\u00020\bHÖ\u0001J%\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0001¢\u0006\u0002\bNR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010)R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010,R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010/R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010/R\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001c\u001a\u0004\b3\u00104R\u001c\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u001c\u001a\u0004\b6\u00104¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto$Surrogate;", "", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "chain_id", "state", "Lrosetta/mainst/InstrumentStateDto;", "symbol", "", "trade_value_multiplier", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "underlying_instruments", "", "Lcom/robinhood/rosetta/mainst/UnderlyingInstrumentDto;", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "updated_at", "tradability_for_late_closing_etfs", "Lrosetta/mainst/TradabilityDto;", "extended_hours_tradability", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/InstrumentStateDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/InstrumentStateDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getChain_id$annotations", "getChain_id", "getState$annotations", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getSymbol$annotations", "getSymbol", "()Ljava/lang/String;", "getTrade_value_multiplier$annotations", "getTrade_value_multiplier", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getUnderlying_instruments$annotations", "getUnderlying_instruments", "()Ljava/util/List;", "getCreated_at$annotations", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getUpdated_at$annotations", "getUpdated_at", "getTradability_for_late_closing_etfs$annotations", "getTradability_for_late_closing_etfs", "()Lrosetta/mainst/TradabilityDto;", "getExtended_hours_tradability$annotations", "getExtended_hours_tradability", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final UUIDDto chain_id;
        private final TimeDto created_at;
        private final TradabilityDto extended_hours_tradability;
        private final UUIDDto id;
        private final InstrumentStateDto state;
        private final String symbol;
        private final TradabilityDto tradability_for_late_closing_etfs;
        private final DecimalDto trade_value_multiplier;
        private final List<UnderlyingInstrumentDto> underlying_instruments;
        private final TimeDto updated_at;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.mainst.OptionChainDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionChainDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((UUIDDto) null, (UUIDDto) null, (InstrumentStateDto) null, (String) null, (DecimalDto) null, (List) null, (TimeDto) null, (TimeDto) null, (TradabilityDto) null, (TradabilityDto) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(UnderlyingInstrumentDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, UUIDDto uUIDDto2, InstrumentStateDto instrumentStateDto, String str, DecimalDto decimalDto, List list, TimeDto timeDto, TimeDto timeDto2, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, int i, Object obj) {
            if ((i & 1) != 0) {
                uUIDDto = surrogate.id;
            }
            if ((i & 2) != 0) {
                uUIDDto2 = surrogate.chain_id;
            }
            if ((i & 4) != 0) {
                instrumentStateDto = surrogate.state;
            }
            if ((i & 8) != 0) {
                str = surrogate.symbol;
            }
            if ((i & 16) != 0) {
                decimalDto = surrogate.trade_value_multiplier;
            }
            if ((i & 32) != 0) {
                list = surrogate.underlying_instruments;
            }
            if ((i & 64) != 0) {
                timeDto = surrogate.created_at;
            }
            if ((i & 128) != 0) {
                timeDto2 = surrogate.updated_at;
            }
            if ((i & 256) != 0) {
                tradabilityDto = surrogate.tradability_for_late_closing_etfs;
            }
            if ((i & 512) != 0) {
                tradabilityDto2 = surrogate.extended_hours_tradability;
            }
            TradabilityDto tradabilityDto3 = tradabilityDto;
            TradabilityDto tradabilityDto4 = tradabilityDto2;
            TimeDto timeDto3 = timeDto;
            TimeDto timeDto4 = timeDto2;
            DecimalDto decimalDto2 = decimalDto;
            List list2 = list;
            return surrogate.copy(uUIDDto, uUIDDto2, instrumentStateDto, str, decimalDto2, list2, timeDto3, timeDto4, tradabilityDto3, tradabilityDto4);
        }

        @SerialName("chainId")
        @JsonAnnotations2(names = {"chain_id"})
        public static /* synthetic */ void getChain_id$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("extendedHoursTradability")
        @JsonAnnotations2(names = {"extended_hours_tradability"})
        public static /* synthetic */ void getExtended_hours_tradability$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tradabilityForLateClosingEtfs")
        @JsonAnnotations2(names = {"tradability_for_late_closing_etfs"})
        public static /* synthetic */ void getTradability_for_late_closing_etfs$annotations() {
        }

        @SerialName("tradeValueMultiplier")
        @JsonAnnotations2(names = {"trade_value_multiplier"})
        public static /* synthetic */ void getTrade_value_multiplier$annotations() {
        }

        @SerialName("underlyingInstruments")
        @JsonAnnotations2(names = {"underlying_instruments"})
        public static /* synthetic */ void getUnderlying_instruments$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final TradabilityDto getExtended_hours_tradability() {
            return this.extended_hours_tradability;
        }

        /* renamed from: component2, reason: from getter */
        public final UUIDDto getChain_id() {
            return this.chain_id;
        }

        /* renamed from: component3, reason: from getter */
        public final InstrumentStateDto getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component5, reason: from getter */
        public final DecimalDto getTrade_value_multiplier() {
            return this.trade_value_multiplier;
        }

        public final List<UnderlyingInstrumentDto> component6() {
            return this.underlying_instruments;
        }

        /* renamed from: component7, reason: from getter */
        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component8, reason: from getter */
        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component9, reason: from getter */
        public final TradabilityDto getTradability_for_late_closing_etfs() {
            return this.tradability_for_late_closing_etfs;
        }

        public final Surrogate copy(UUIDDto id, UUIDDto chain_id, InstrumentStateDto state, String symbol, DecimalDto trade_value_multiplier, List<UnderlyingInstrumentDto> underlying_instruments, TimeDto created_at, TimeDto updated_at, TradabilityDto tradability_for_late_closing_etfs, TradabilityDto extended_hours_tradability) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(underlying_instruments, "underlying_instruments");
            Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
            Intrinsics.checkNotNullParameter(extended_hours_tradability, "extended_hours_tradability");
            return new Surrogate(id, chain_id, state, symbol, trade_value_multiplier, underlying_instruments, created_at, updated_at, tradability_for_late_closing_etfs, extended_hours_tradability);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.chain_id, surrogate.chain_id) && this.state == surrogate.state && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.trade_value_multiplier, surrogate.trade_value_multiplier) && Intrinsics.areEqual(this.underlying_instruments, surrogate.underlying_instruments) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && this.tradability_for_late_closing_etfs == surrogate.tradability_for_late_closing_etfs && this.extended_hours_tradability == surrogate.extended_hours_tradability;
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.id;
            int iHashCode = (uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31;
            UUIDDto uUIDDto2 = this.chain_id;
            int iHashCode2 = (((((iHashCode + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31) + this.state.hashCode()) * 31) + this.symbol.hashCode()) * 31;
            DecimalDto decimalDto = this.trade_value_multiplier;
            int iHashCode3 = (((iHashCode2 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31) + this.underlying_instruments.hashCode()) * 31;
            TimeDto timeDto = this.created_at;
            int iHashCode4 = (iHashCode3 + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.updated_at;
            return ((((iHashCode4 + (timeDto2 != null ? timeDto2.hashCode() : 0)) * 31) + this.tradability_for_late_closing_etfs.hashCode()) * 31) + this.extended_hours_tradability.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", chain_id=" + this.chain_id + ", state=" + this.state + ", symbol=" + this.symbol + ", trade_value_multiplier=" + this.trade_value_multiplier + ", underlying_instruments=" + this.underlying_instruments + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", tradability_for_late_closing_etfs=" + this.tradability_for_late_closing_etfs + ", extended_hours_tradability=" + this.extended_hours_tradability + ")";
        }

        /* compiled from: OptionChainDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionChainDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, UUIDDto uUIDDto2, InstrumentStateDto instrumentStateDto, String str, DecimalDto decimalDto, List list, TimeDto timeDto, TimeDto timeDto2, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.chain_id = null;
            } else {
                this.chain_id = uUIDDto2;
            }
            if ((i & 4) == 0) {
                this.state = InstrumentStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = instrumentStateDto;
            }
            if ((i & 8) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str;
            }
            if ((i & 16) == 0) {
                this.trade_value_multiplier = null;
            } else {
                this.trade_value_multiplier = decimalDto;
            }
            if ((i & 32) == 0) {
                this.underlying_instruments = CollectionsKt.emptyList();
            } else {
                this.underlying_instruments = list;
            }
            if ((i & 64) == 0) {
                this.created_at = null;
            } else {
                this.created_at = timeDto;
            }
            if ((i & 128) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = timeDto2;
            }
            if ((i & 256) == 0) {
                this.tradability_for_late_closing_etfs = TradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.tradability_for_late_closing_etfs = tradabilityDto;
            }
            if ((i & 512) == 0) {
                this.extended_hours_tradability = TradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.extended_hours_tradability = tradabilityDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            UUIDDto uUIDDto = self.id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            UUIDDto uUIDDto2 = self.chain_id;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            if (self.state != InstrumentStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, InstrumentStateDto.Serializer.INSTANCE, self.state);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 3, self.symbol);
            }
            DecimalDto decimalDto = self.trade_value_multiplier;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            if (!Intrinsics.areEqual(self.underlying_instruments, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.underlying_instruments);
            }
            TimeDto timeDto = self.created_at;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.updated_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            TradabilityDto tradabilityDto = self.tradability_for_late_closing_etfs;
            TradabilityDto.Companion companion = TradabilityDto.INSTANCE;
            if (tradabilityDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, TradabilityDto.Serializer.INSTANCE, self.tradability_for_late_closing_etfs);
            }
            if (self.extended_hours_tradability != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, TradabilityDto.Serializer.INSTANCE, self.extended_hours_tradability);
            }
        }

        public Surrogate(UUIDDto uUIDDto, UUIDDto uUIDDto2, InstrumentStateDto state, String symbol, DecimalDto decimalDto, List<UnderlyingInstrumentDto> underlying_instruments, TimeDto timeDto, TimeDto timeDto2, TradabilityDto tradability_for_late_closing_etfs, TradabilityDto extended_hours_tradability) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(underlying_instruments, "underlying_instruments");
            Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
            Intrinsics.checkNotNullParameter(extended_hours_tradability, "extended_hours_tradability");
            this.id = uUIDDto;
            this.chain_id = uUIDDto2;
            this.state = state;
            this.symbol = symbol;
            this.trade_value_multiplier = decimalDto;
            this.underlying_instruments = underlying_instruments;
            this.created_at = timeDto;
            this.updated_at = timeDto2;
            this.tradability_for_late_closing_etfs = tradability_for_late_closing_etfs;
            this.extended_hours_tradability = extended_hours_tradability;
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final UUIDDto getChain_id() {
            return this.chain_id;
        }

        public final InstrumentStateDto getState() {
            return this.state;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, UUIDDto uUIDDto2, InstrumentStateDto instrumentStateDto, String str, DecimalDto decimalDto, List list, TimeDto timeDto, TimeDto timeDto2, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? null : uUIDDto2, (i & 4) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : decimalDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : timeDto, (i & 128) != 0 ? null : timeDto2, (i & 256) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 512) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto2);
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final DecimalDto getTrade_value_multiplier() {
            return this.trade_value_multiplier;
        }

        public final List<UnderlyingInstrumentDto> getUnderlying_instruments() {
            return this.underlying_instruments;
        }

        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        public final TradabilityDto getTradability_for_late_closing_etfs() {
            return this.tradability_for_late_closing_etfs;
        }

        public final TradabilityDto getExtended_hours_tradability() {
            return this.extended_hours_tradability;
        }
    }

    /* compiled from: OptionChainDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;", "Lcom/robinhood/rosetta/mainst/OptionChainDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OptionChainDetailsDto, OptionChainDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionChainDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionChainDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionChainDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionChainDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionChainDetails> getProtoAdapter() {
            return OptionChainDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionChainDetailsDto getZeroValue() {
            return OptionChainDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionChainDetailsDto fromProto(OptionChainDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID id = proto.getId();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            UUID chain_id = proto.getChain_id();
            UUIDDto uUIDDtoFromProto2 = chain_id != null ? UUIDDto.INSTANCE.fromProto(chain_id) : null;
            InstrumentStateDto instrumentStateDtoFromProto = InstrumentStateDto.INSTANCE.fromProto(proto.getState());
            String symbol = proto.getSymbol();
            Decimal trade_value_multiplier = proto.getTrade_value_multiplier();
            DecimalDto decimalDtoFromProto = trade_value_multiplier != null ? DecimalDto.INSTANCE.fromProto(trade_value_multiplier) : null;
            List<UnderlyingInstrument> underlying_instruments = proto.getUnderlying_instruments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(underlying_instruments, 10));
            Iterator<T> it = underlying_instruments.iterator();
            while (it.hasNext()) {
                arrayList.add(UnderlyingInstrumentDto.INSTANCE.fromProto((UnderlyingInstrument) it.next()));
            }
            Time created_at = proto.getCreated_at();
            TimeDto timeDtoFromProto = created_at != null ? TimeDto.INSTANCE.fromProto(created_at) : null;
            Time updated_at = proto.getUpdated_at();
            TimeDto timeDtoFromProto2 = updated_at != null ? TimeDto.INSTANCE.fromProto(updated_at) : null;
            TradabilityDto.Companion companion = TradabilityDto.INSTANCE;
            return new OptionChainDetailsDto(new Surrogate(uUIDDtoFromProto, uUIDDtoFromProto2, instrumentStateDtoFromProto, symbol, decimalDtoFromProto, arrayList, timeDtoFromProto, timeDtoFromProto2, companion.fromProto(proto.getTradability_for_late_closing_etfs()), companion.fromProto(proto.getExtended_hours_tradability())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.OptionChainDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionChainDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new OptionChainDetailsDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionChainDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionChainDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.OptionChainDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionChainDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionChainDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionChainDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionChainDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.OptionChainDetailsDto";
        }
    }
}
