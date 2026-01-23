package com.robinhood.rosetta.brokerage;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto;
import com.robinhood.rosetta.brokerage.CashAdjustmentDto;
import com.robinhood.rosetta.brokerage.CashHoldDto;
import com.robinhood.rosetta.brokerage.CashLimitationDto;
import com.robinhood.rosetta.brokerage.MovingCashDto;
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
import okio.ByteString;

/* compiled from: BrokerageAccountingDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041234B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0006\u0010\u0015JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0013\u0010&\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*H\u0016J\b\u00100\u001a\u00020*H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto$Surrogate;)V", "source_id", "Lokio/ByteString;", "cash_hold", "Lcom/robinhood/rosetta/brokerage/CashHoldDto;", "cash_adjustment", "", "Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto;", "moving_cash", "Lcom/robinhood/rosetta/brokerage/MovingCashDto;", "cash_limitation", "Lcom/robinhood/rosetta/brokerage/CashLimitationDto;", "process_cash_hold_last", "", "(Lokio/ByteString;Lcom/robinhood/rosetta/brokerage/CashHoldDto;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/MovingCashDto;Lcom/robinhood/rosetta/brokerage/CashLimitationDto;Z)V", "getSource_id", "()Lokio/ByteString;", "getCash_hold", "()Lcom/robinhood/rosetta/brokerage/CashHoldDto;", "getCash_adjustment", "()Ljava/util/List;", "getMoving_cash", "()Lcom/robinhood/rosetta/brokerage/MovingCashDto;", "getCash_limitation", "()Lcom/robinhood/rosetta/brokerage/CashLimitationDto;", "getProcess_cash_hold_last", "()Z", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class BrokerageAccountingDetailsDto implements Dto3<BrokerageAccountingDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BrokerageAccountingDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BrokerageAccountingDetailsDto, BrokerageAccountingDetails>> binaryBase64Serializer$delegate;
    private static final BrokerageAccountingDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BrokerageAccountingDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BrokerageAccountingDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getSource_id() {
        return this.surrogate.getSource_id();
    }

    public final CashHoldDto getCash_hold() {
        return this.surrogate.getCash_hold();
    }

    public final List<CashAdjustmentDto> getCash_adjustment() {
        return this.surrogate.getCash_adjustment();
    }

    public final MovingCashDto getMoving_cash() {
        return this.surrogate.getMoving_cash();
    }

    public final CashLimitationDto getCash_limitation() {
        return this.surrogate.getCash_limitation();
    }

    public final boolean getProcess_cash_hold_last() {
        return this.surrogate.getProcess_cash_hold_last();
    }

    public /* synthetic */ BrokerageAccountingDetailsDto(ByteString byteString, CashHoldDto cashHoldDto, List list, MovingCashDto movingCashDto, CashLimitationDto cashLimitationDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? null : cashHoldDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : movingCashDto, (i & 16) != 0 ? null : cashLimitationDto, (i & 32) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrokerageAccountingDetailsDto(ByteString source_id, CashHoldDto cashHoldDto, List<CashAdjustmentDto> cash_adjustment, MovingCashDto movingCashDto, CashLimitationDto cashLimitationDto, boolean z) {
        this(new Surrogate(source_id, cashHoldDto, cash_adjustment, movingCashDto, cashLimitationDto, z));
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(cash_adjustment, "cash_adjustment");
    }

    public static /* synthetic */ BrokerageAccountingDetailsDto copy$default(BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, ByteString byteString, CashHoldDto cashHoldDto, List list, MovingCashDto movingCashDto, CashLimitationDto cashLimitationDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = brokerageAccountingDetailsDto.surrogate.getSource_id();
        }
        if ((i & 2) != 0) {
            cashHoldDto = brokerageAccountingDetailsDto.surrogate.getCash_hold();
        }
        if ((i & 4) != 0) {
            list = brokerageAccountingDetailsDto.surrogate.getCash_adjustment();
        }
        if ((i & 8) != 0) {
            movingCashDto = brokerageAccountingDetailsDto.surrogate.getMoving_cash();
        }
        if ((i & 16) != 0) {
            cashLimitationDto = brokerageAccountingDetailsDto.surrogate.getCash_limitation();
        }
        if ((i & 32) != 0) {
            z = brokerageAccountingDetailsDto.surrogate.getProcess_cash_hold_last();
        }
        CashLimitationDto cashLimitationDto2 = cashLimitationDto;
        boolean z2 = z;
        return brokerageAccountingDetailsDto.copy(byteString, cashHoldDto, list, movingCashDto, cashLimitationDto2, z2);
    }

    public final BrokerageAccountingDetailsDto copy(ByteString source_id, CashHoldDto cash_hold, List<CashAdjustmentDto> cash_adjustment, MovingCashDto moving_cash, CashLimitationDto cash_limitation, boolean process_cash_hold_last) {
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(cash_adjustment, "cash_adjustment");
        return new BrokerageAccountingDetailsDto(new Surrogate(source_id, cash_hold, cash_adjustment, moving_cash, cash_limitation, process_cash_hold_last));
    }

    @Override // com.robinhood.idl.Dto
    public BrokerageAccountingDetails toProto() {
        ByteString source_id = this.surrogate.getSource_id();
        CashHoldDto cash_hold = this.surrogate.getCash_hold();
        CashHold proto = cash_hold != null ? cash_hold.toProto() : null;
        List<CashAdjustmentDto> cash_adjustment = this.surrogate.getCash_adjustment();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cash_adjustment, 10));
        Iterator<T> it = cash_adjustment.iterator();
        while (it.hasNext()) {
            arrayList.add(((CashAdjustmentDto) it.next()).toProto());
        }
        MovingCashDto moving_cash = this.surrogate.getMoving_cash();
        MovingCash proto2 = moving_cash != null ? moving_cash.toProto() : null;
        CashLimitationDto cash_limitation = this.surrogate.getCash_limitation();
        return new BrokerageAccountingDetails(source_id, proto, arrayList, proto2, cash_limitation != null ? cash_limitation.toProto() : null, this.surrogate.getProcess_cash_hold_last(), null, 64, null);
    }

    public String toString() {
        return "[BrokerageAccountingDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BrokerageAccountingDetailsDto) && Intrinsics.areEqual(((BrokerageAccountingDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: BrokerageAccountingDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002@AB^\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013B[\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\u0018\u0010,\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00101\u001a\u00020\u0011HÆ\u0003J`\u00102\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00103\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0015HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001J%\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0001¢\u0006\u0002\b?R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\"R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010%R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010(R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+¨\u0006B"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto$Surrogate;", "", "source_id", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "cash_hold", "Lcom/robinhood/rosetta/brokerage/CashHoldDto;", "cash_adjustment", "", "Lcom/robinhood/rosetta/brokerage/CashAdjustmentDto;", "moving_cash", "Lcom/robinhood/rosetta/brokerage/MovingCashDto;", "cash_limitation", "Lcom/robinhood/rosetta/brokerage/CashLimitationDto;", "process_cash_hold_last", "", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/brokerage/CashHoldDto;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/MovingCashDto;Lcom/robinhood/rosetta/brokerage/CashLimitationDto;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILokio/ByteString;Lcom/robinhood/rosetta/brokerage/CashHoldDto;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/MovingCashDto;Lcom/robinhood/rosetta/brokerage/CashLimitationDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSource_id$annotations", "()V", "getSource_id", "()Lokio/ByteString;", "getCash_hold$annotations", "getCash_hold", "()Lcom/robinhood/rosetta/brokerage/CashHoldDto;", "getCash_adjustment$annotations", "getCash_adjustment", "()Ljava/util/List;", "getMoving_cash$annotations", "getMoving_cash", "()Lcom/robinhood/rosetta/brokerage/MovingCashDto;", "getCash_limitation$annotations", "getCash_limitation", "()Lcom/robinhood/rosetta/brokerage/CashLimitationDto;", "getProcess_cash_hold_last$annotations", "getProcess_cash_hold_last", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_brokerage_externalRelease", "$serializer", "Companion", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<CashAdjustmentDto> cash_adjustment;
        private final CashHoldDto cash_hold;
        private final CashLimitationDto cash_limitation;
        private final MovingCashDto moving_cash;
        private final boolean process_cash_hold_last;
        private final ByteString source_id;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrokerageAccountingDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((ByteString) null, (CashHoldDto) null, (List) null, (MovingCashDto) null, (CashLimitationDto) null, false, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(CashAdjustmentDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, CashHoldDto cashHoldDto, List list, MovingCashDto movingCashDto, CashLimitationDto cashLimitationDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = surrogate.source_id;
            }
            if ((i & 2) != 0) {
                cashHoldDto = surrogate.cash_hold;
            }
            if ((i & 4) != 0) {
                list = surrogate.cash_adjustment;
            }
            if ((i & 8) != 0) {
                movingCashDto = surrogate.moving_cash;
            }
            if ((i & 16) != 0) {
                cashLimitationDto = surrogate.cash_limitation;
            }
            if ((i & 32) != 0) {
                z = surrogate.process_cash_hold_last;
            }
            CashLimitationDto cashLimitationDto2 = cashLimitationDto;
            boolean z2 = z;
            return surrogate.copy(byteString, cashHoldDto, list, movingCashDto, cashLimitationDto2, z2);
        }

        @SerialName("cashAdjustment")
        @JsonAnnotations2(names = {"cash_adjustment"})
        public static /* synthetic */ void getCash_adjustment$annotations() {
        }

        @SerialName("cashHold")
        @JsonAnnotations2(names = {"cash_hold"})
        public static /* synthetic */ void getCash_hold$annotations() {
        }

        @SerialName("cashLimitation")
        @JsonAnnotations2(names = {"cash_limitation"})
        public static /* synthetic */ void getCash_limitation$annotations() {
        }

        @SerialName("movingCash")
        @JsonAnnotations2(names = {"moving_cash"})
        public static /* synthetic */ void getMoving_cash$annotations() {
        }

        @SerialName("processCashHoldLast")
        @JsonAnnotations2(names = {"process_cash_hold_last"})
        public static /* synthetic */ void getProcess_cash_hold_last$annotations() {
        }

        @SerialName("sourceId")
        @JsonAnnotations2(names = {"source_id"})
        public static /* synthetic */ void getSource_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getSource_id() {
            return this.source_id;
        }

        /* renamed from: component2, reason: from getter */
        public final CashHoldDto getCash_hold() {
            return this.cash_hold;
        }

        public final List<CashAdjustmentDto> component3() {
            return this.cash_adjustment;
        }

        /* renamed from: component4, reason: from getter */
        public final MovingCashDto getMoving_cash() {
            return this.moving_cash;
        }

        /* renamed from: component5, reason: from getter */
        public final CashLimitationDto getCash_limitation() {
            return this.cash_limitation;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getProcess_cash_hold_last() {
            return this.process_cash_hold_last;
        }

        public final Surrogate copy(ByteString source_id, CashHoldDto cash_hold, List<CashAdjustmentDto> cash_adjustment, MovingCashDto moving_cash, CashLimitationDto cash_limitation, boolean process_cash_hold_last) {
            Intrinsics.checkNotNullParameter(source_id, "source_id");
            Intrinsics.checkNotNullParameter(cash_adjustment, "cash_adjustment");
            return new Surrogate(source_id, cash_hold, cash_adjustment, moving_cash, cash_limitation, process_cash_hold_last);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.source_id, surrogate.source_id) && Intrinsics.areEqual(this.cash_hold, surrogate.cash_hold) && Intrinsics.areEqual(this.cash_adjustment, surrogate.cash_adjustment) && Intrinsics.areEqual(this.moving_cash, surrogate.moving_cash) && Intrinsics.areEqual(this.cash_limitation, surrogate.cash_limitation) && this.process_cash_hold_last == surrogate.process_cash_hold_last;
        }

        public int hashCode() {
            int iHashCode = this.source_id.hashCode() * 31;
            CashHoldDto cashHoldDto = this.cash_hold;
            int iHashCode2 = (((iHashCode + (cashHoldDto == null ? 0 : cashHoldDto.hashCode())) * 31) + this.cash_adjustment.hashCode()) * 31;
            MovingCashDto movingCashDto = this.moving_cash;
            int iHashCode3 = (iHashCode2 + (movingCashDto == null ? 0 : movingCashDto.hashCode())) * 31;
            CashLimitationDto cashLimitationDto = this.cash_limitation;
            return ((iHashCode3 + (cashLimitationDto != null ? cashLimitationDto.hashCode() : 0)) * 31) + Boolean.hashCode(this.process_cash_hold_last);
        }

        public String toString() {
            return "Surrogate(source_id=" + this.source_id + ", cash_hold=" + this.cash_hold + ", cash_adjustment=" + this.cash_adjustment + ", moving_cash=" + this.moving_cash + ", cash_limitation=" + this.cash_limitation + ", process_cash_hold_last=" + this.process_cash_hold_last + ")";
        }

        /* compiled from: BrokerageAccountingDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto$Surrogate;", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BrokerageAccountingDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, CashHoldDto cashHoldDto, List list, MovingCashDto movingCashDto, CashLimitationDto cashLimitationDto, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.source_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.cash_hold = null;
            } else {
                this.cash_hold = cashHoldDto;
            }
            if ((i & 4) == 0) {
                this.cash_adjustment = CollectionsKt.emptyList();
            } else {
                this.cash_adjustment = list;
            }
            if ((i & 8) == 0) {
                this.moving_cash = null;
            } else {
                this.moving_cash = movingCashDto;
            }
            if ((i & 16) == 0) {
                this.cash_limitation = null;
            } else {
                this.cash_limitation = cashLimitationDto;
            }
            if ((i & 32) == 0) {
                this.process_cash_hold_last = false;
            } else {
                this.process_cash_hold_last = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_brokerage_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.source_id, ByteString.EMPTY)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.source_id);
            }
            CashHoldDto cashHoldDto = self.cash_hold;
            if (cashHoldDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CashHoldDto.Serializer.INSTANCE, cashHoldDto);
            }
            if (!Intrinsics.areEqual(self.cash_adjustment, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.cash_adjustment);
            }
            MovingCashDto movingCashDto = self.moving_cash;
            if (movingCashDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MovingCashDto.Serializer.INSTANCE, movingCashDto);
            }
            CashLimitationDto cashLimitationDto = self.cash_limitation;
            if (cashLimitationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CashLimitationDto.Serializer.INSTANCE, cashLimitationDto);
            }
            boolean z = self.process_cash_hold_last;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
        }

        public Surrogate(ByteString source_id, CashHoldDto cashHoldDto, List<CashAdjustmentDto> cash_adjustment, MovingCashDto movingCashDto, CashLimitationDto cashLimitationDto, boolean z) {
            Intrinsics.checkNotNullParameter(source_id, "source_id");
            Intrinsics.checkNotNullParameter(cash_adjustment, "cash_adjustment");
            this.source_id = source_id;
            this.cash_hold = cashHoldDto;
            this.cash_adjustment = cash_adjustment;
            this.moving_cash = movingCashDto;
            this.cash_limitation = cashLimitationDto;
            this.process_cash_hold_last = z;
        }

        public final ByteString getSource_id() {
            return this.source_id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, CashHoldDto cashHoldDto, List list, MovingCashDto movingCashDto, CashLimitationDto cashLimitationDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? null : cashHoldDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : movingCashDto, (i & 16) != 0 ? null : cashLimitationDto, (i & 32) != 0 ? false : z);
        }

        public final CashHoldDto getCash_hold() {
            return this.cash_hold;
        }

        public final List<CashAdjustmentDto> getCash_adjustment() {
            return this.cash_adjustment;
        }

        public final MovingCashDto getMoving_cash() {
            return this.moving_cash;
        }

        public final CashLimitationDto getCash_limitation() {
            return this.cash_limitation;
        }

        public final boolean getProcess_cash_hold_last() {
            return this.process_cash_hold_last;
        }
    }

    /* compiled from: BrokerageAccountingDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BrokerageAccountingDetailsDto, BrokerageAccountingDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BrokerageAccountingDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BrokerageAccountingDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BrokerageAccountingDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) BrokerageAccountingDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BrokerageAccountingDetails> getProtoAdapter() {
            return BrokerageAccountingDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BrokerageAccountingDetailsDto getZeroValue() {
            return BrokerageAccountingDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BrokerageAccountingDetailsDto fromProto(BrokerageAccountingDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString source_id = proto.getSource_id();
            CashHold cash_hold = proto.getCash_hold();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CashHoldDto cashHoldDtoFromProto = cash_hold != null ? CashHoldDto.INSTANCE.fromProto(cash_hold) : null;
            List<CashAdjustment> cash_adjustment = proto.getCash_adjustment();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cash_adjustment, 10));
            Iterator<T> it = cash_adjustment.iterator();
            while (it.hasNext()) {
                arrayList.add(CashAdjustmentDto.INSTANCE.fromProto((CashAdjustment) it.next()));
            }
            MovingCash moving_cash = proto.getMoving_cash();
            MovingCashDto movingCashDtoFromProto = moving_cash != null ? MovingCashDto.INSTANCE.fromProto(moving_cash) : null;
            CashLimitation cash_limitation = proto.getCash_limitation();
            return new BrokerageAccountingDetailsDto(new Surrogate(source_id, cashHoldDtoFromProto, arrayList, movingCashDtoFromProto, cash_limitation != null ? CashLimitationDto.INSTANCE.fromProto(cash_limitation) : null, proto.getProcess_cash_hold_last()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrokerageAccountingDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new BrokerageAccountingDetailsDto(null, null, null, null, null, false, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BrokerageAccountingDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<BrokerageAccountingDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.brokerage.BrokerageAccountingDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BrokerageAccountingDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BrokerageAccountingDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BrokerageAccountingDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BrokerageAccountingDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto";
        }
    }
}
