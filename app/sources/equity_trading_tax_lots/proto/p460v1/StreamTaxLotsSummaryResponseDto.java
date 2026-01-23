package equity_trading_tax_lots.proto.p460v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import equity_trading_tax_lots.proto.p460v1.LotSourceTypeDto;
import equity_trading_tax_lots.proto.p460v1.OrderSummaryDetailsDto;
import equity_trading_tax_lots.proto.p460v1.TableDetailsDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: StreamTaxLotsSummaryResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006-"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;", "Landroid/os/Parcelable;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$Surrogate;", "surrogate", "<init>", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$Surrogate;)V", "Lequity_trading_tax_lots/proto/v1/LotSourceTypeDto;", "lot_source_type", "", "lot_count", "Lcom/robinhood/rosetta/common/MoneyDto;", "realized_gain_loss", "display_value", "", "is_gk_verified", "Lequity_trading_tax_lots/proto/v1/TableDetailsDto;", "table_details", "Lequity_trading_tax_lots/proto/v1/OrderSummaryDetailsDto;", "order_summary_details", "(Lequity_trading_tax_lots/proto/v1/LotSourceTypeDto;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;ZLequity_trading_tax_lots/proto/v1/TableDetailsDto;Lequity_trading_tax_lots/proto/v1/OrderSummaryDetailsDto;)V", "toProto", "()Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class StreamTaxLotsSummaryResponseDto implements Dto3<StreamTaxLotsSummaryResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamTaxLotsSummaryResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamTaxLotsSummaryResponseDto, StreamTaxLotsSummaryResponse>> binaryBase64Serializer$delegate;
    private static final StreamTaxLotsSummaryResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamTaxLotsSummaryResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamTaxLotsSummaryResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StreamTaxLotsSummaryResponseDto(equity_trading_tax_lots.proto.p460v1.LotSourceTypeDto r3, int r4, com.robinhood.rosetta.common.MoneyDto r5, com.robinhood.rosetta.common.MoneyDto r6, boolean r7, equity_trading_tax_lots.proto.p460v1.TableDetailsDto r8, equity_trading_tax_lots.proto.p460v1.OrderSummaryDetailsDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r2 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            equity_trading_tax_lots.proto.v1.LotSourceTypeDto$Companion r3 = equity_trading_tax_lots.proto.p460v1.LotSourceTypeDto.INSTANCE
            equity_trading_tax_lots.proto.v1.LotSourceTypeDto r3 = r3.getZeroValue()
        La:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto L10
            r4 = r0
        L10:
            r11 = r10 & 4
            r1 = 0
            if (r11 == 0) goto L16
            r5 = r1
        L16:
            r11 = r10 & 8
            if (r11 == 0) goto L1b
            r6 = r1
        L1b:
            r11 = r10 & 16
            if (r11 == 0) goto L20
            r7 = r0
        L20:
            r11 = r10 & 32
            if (r11 == 0) goto L25
            r8 = r1
        L25:
            r10 = r10 & 64
            if (r10 == 0) goto L32
            r11 = r1
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L3a
        L32:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L3a:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryResponseDto.<init>(equity_trading_tax_lots.proto.v1.LotSourceTypeDto, int, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, boolean, equity_trading_tax_lots.proto.v1.TableDetailsDto, equity_trading_tax_lots.proto.v1.OrderSummaryDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotsSummaryResponseDto(LotSourceTypeDto lot_source_type, int i, MoneyDto moneyDto, MoneyDto moneyDto2, boolean z, TableDetailsDto tableDetailsDto, OrderSummaryDetailsDto orderSummaryDetailsDto) {
        this(new Surrogate(lot_source_type, i, moneyDto, moneyDto2, z, tableDetailsDto, orderSummaryDetailsDto));
        Intrinsics.checkNotNullParameter(lot_source_type, "lot_source_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamTaxLotsSummaryResponse toProto() {
        LotSourceType lotSourceType = (LotSourceType) this.surrogate.getLot_source_type().toProto();
        int lot_count = this.surrogate.getLot_count();
        MoneyDto realized_gain_loss = this.surrogate.getRealized_gain_loss();
        Money proto = realized_gain_loss != null ? realized_gain_loss.toProto() : null;
        MoneyDto display_value = this.surrogate.getDisplay_value();
        Money proto2 = display_value != null ? display_value.toProto() : null;
        boolean is_gk_verified = this.surrogate.getIs_gk_verified();
        TableDetailsDto table_details = this.surrogate.getTable_details();
        TableDetails proto3 = table_details != null ? table_details.toProto() : null;
        OrderSummaryDetailsDto order_summary_details = this.surrogate.getOrder_summary_details();
        return new StreamTaxLotsSummaryResponse(lotSourceType, lot_count, proto, proto2, is_gk_verified, proto3, order_summary_details != null ? order_summary_details.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[StreamTaxLotsSummaryResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamTaxLotsSummaryResponseDto) && Intrinsics.areEqual(((StreamTaxLotsSummaryResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamTaxLotsSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\b\u0083\b\u0018\u0000 B2\u00020\u0001:\u0002CBBd\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B]\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010-\u001a\u0004\b2\u00103R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b6\u0010-\u001a\u0004\b5\u00103R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\b9\u0010-\u001a\u0004\b\r\u00108R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010:\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010>\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010@¨\u0006D"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$Surrogate;", "", "Lequity_trading_tax_lots/proto/v1/LotSourceTypeDto;", "lot_source_type", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "lot_count", "Lcom/robinhood/rosetta/common/MoneyDto;", "realized_gain_loss", "display_value", "", "is_gk_verified", "Lequity_trading_tax_lots/proto/v1/TableDetailsDto;", "table_details", "Lequity_trading_tax_lots/proto/v1/OrderSummaryDetailsDto;", "order_summary_details", "<init>", "(Lequity_trading_tax_lots/proto/v1/LotSourceTypeDto;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;ZLequity_trading_tax_lots/proto/v1/TableDetailsDto;Lequity_trading_tax_lots/proto/v1/OrderSummaryDetailsDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILequity_trading_tax_lots/proto/v1/LotSourceTypeDto;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;ZLequity_trading_tax_lots/proto/v1/TableDetailsDto;Lequity_trading_tax_lots/proto/v1/OrderSummaryDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_trading_tax_lots_proto_v1_externalRelease", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lequity_trading_tax_lots/proto/v1/LotSourceTypeDto;", "getLot_source_type", "()Lequity_trading_tax_lots/proto/v1/LotSourceTypeDto;", "getLot_source_type$annotations", "()V", "I", "getLot_count", "getLot_count$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getRealized_gain_loss", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getRealized_gain_loss$annotations", "getDisplay_value", "getDisplay_value$annotations", "Z", "()Z", "is_gk_verified$annotations", "Lequity_trading_tax_lots/proto/v1/TableDetailsDto;", "getTable_details", "()Lequity_trading_tax_lots/proto/v1/TableDetailsDto;", "getTable_details$annotations", "Lequity_trading_tax_lots/proto/v1/OrderSummaryDetailsDto;", "getOrder_summary_details", "()Lequity_trading_tax_lots/proto/v1/OrderSummaryDetailsDto;", "getOrder_summary_details$annotations", "Companion", "$serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto display_value;
        private final boolean is_gk_verified;
        private final int lot_count;
        private final LotSourceTypeDto lot_source_type;
        private final OrderSummaryDetailsDto order_summary_details;
        private final MoneyDto realized_gain_loss;
        private final TableDetailsDto table_details;

        public Surrogate() {
            this((LotSourceTypeDto) null, 0, (MoneyDto) null, (MoneyDto) null, false, (TableDetailsDto) null, (OrderSummaryDetailsDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.lot_source_type == surrogate.lot_source_type && this.lot_count == surrogate.lot_count && Intrinsics.areEqual(this.realized_gain_loss, surrogate.realized_gain_loss) && Intrinsics.areEqual(this.display_value, surrogate.display_value) && this.is_gk_verified == surrogate.is_gk_verified && Intrinsics.areEqual(this.table_details, surrogate.table_details) && Intrinsics.areEqual(this.order_summary_details, surrogate.order_summary_details);
        }

        public int hashCode() {
            int iHashCode = ((this.lot_source_type.hashCode() * 31) + Integer.hashCode(this.lot_count)) * 31;
            MoneyDto moneyDto = this.realized_gain_loss;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.display_value;
            int iHashCode3 = (((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + Boolean.hashCode(this.is_gk_verified)) * 31;
            TableDetailsDto tableDetailsDto = this.table_details;
            int iHashCode4 = (iHashCode3 + (tableDetailsDto == null ? 0 : tableDetailsDto.hashCode())) * 31;
            OrderSummaryDetailsDto orderSummaryDetailsDto = this.order_summary_details;
            return iHashCode4 + (orderSummaryDetailsDto != null ? orderSummaryDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(lot_source_type=" + this.lot_source_type + ", lot_count=" + this.lot_count + ", realized_gain_loss=" + this.realized_gain_loss + ", display_value=" + this.display_value + ", is_gk_verified=" + this.is_gk_verified + ", table_details=" + this.table_details + ", order_summary_details=" + this.order_summary_details + ")";
        }

        /* compiled from: StreamTaxLotsSummaryResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$Surrogate;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamTaxLotsSummaryResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, LotSourceTypeDto lotSourceTypeDto, int i2, MoneyDto moneyDto, MoneyDto moneyDto2, boolean z, TableDetailsDto tableDetailsDto, OrderSummaryDetailsDto orderSummaryDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.lot_source_type = (i & 1) == 0 ? LotSourceTypeDto.INSTANCE.getZeroValue() : lotSourceTypeDto;
            if ((i & 2) == 0) {
                this.lot_count = 0;
            } else {
                this.lot_count = i2;
            }
            if ((i & 4) == 0) {
                this.realized_gain_loss = null;
            } else {
                this.realized_gain_loss = moneyDto;
            }
            if ((i & 8) == 0) {
                this.display_value = null;
            } else {
                this.display_value = moneyDto2;
            }
            if ((i & 16) == 0) {
                this.is_gk_verified = false;
            } else {
                this.is_gk_verified = z;
            }
            if ((i & 32) == 0) {
                this.table_details = null;
            } else {
                this.table_details = tableDetailsDto;
            }
            if ((i & 64) == 0) {
                this.order_summary_details = null;
            } else {
                this.order_summary_details = orderSummaryDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.lot_source_type != LotSourceTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, LotSourceTypeDto.Serializer.INSTANCE, self.lot_source_type);
            }
            int i = self.lot_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            MoneyDto moneyDto = self.realized_gain_loss;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.display_value;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            boolean z = self.is_gk_verified;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            TableDetailsDto tableDetailsDto = self.table_details;
            if (tableDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TableDetailsDto.Serializer.INSTANCE, tableDetailsDto);
            }
            OrderSummaryDetailsDto orderSummaryDetailsDto = self.order_summary_details;
            if (orderSummaryDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, OrderSummaryDetailsDto.Serializer.INSTANCE, orderSummaryDetailsDto);
            }
        }

        public Surrogate(LotSourceTypeDto lot_source_type, int i, MoneyDto moneyDto, MoneyDto moneyDto2, boolean z, TableDetailsDto tableDetailsDto, OrderSummaryDetailsDto orderSummaryDetailsDto) {
            Intrinsics.checkNotNullParameter(lot_source_type, "lot_source_type");
            this.lot_source_type = lot_source_type;
            this.lot_count = i;
            this.realized_gain_loss = moneyDto;
            this.display_value = moneyDto2;
            this.is_gk_verified = z;
            this.table_details = tableDetailsDto;
            this.order_summary_details = orderSummaryDetailsDto;
        }

        public final LotSourceTypeDto getLot_source_type() {
            return this.lot_source_type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(equity_trading_tax_lots.proto.p460v1.LotSourceTypeDto r3, int r4, com.robinhood.rosetta.common.MoneyDto r5, com.robinhood.rosetta.common.MoneyDto r6, boolean r7, equity_trading_tax_lots.proto.p460v1.TableDetailsDto r8, equity_trading_tax_lots.proto.p460v1.OrderSummaryDetailsDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r2 = this;
                r11 = r10 & 1
                if (r11 == 0) goto La
                equity_trading_tax_lots.proto.v1.LotSourceTypeDto$Companion r3 = equity_trading_tax_lots.proto.p460v1.LotSourceTypeDto.INSTANCE
                equity_trading_tax_lots.proto.v1.LotSourceTypeDto r3 = r3.getZeroValue()
            La:
                r11 = r10 & 2
                r0 = 0
                if (r11 == 0) goto L10
                r4 = r0
            L10:
                r11 = r10 & 4
                r1 = 0
                if (r11 == 0) goto L16
                r5 = r1
            L16:
                r11 = r10 & 8
                if (r11 == 0) goto L1b
                r6 = r1
            L1b:
                r11 = r10 & 16
                if (r11 == 0) goto L20
                r7 = r0
            L20:
                r11 = r10 & 32
                if (r11 == 0) goto L25
                r8 = r1
            L25:
                r10 = r10 & 64
                if (r10 == 0) goto L32
                r11 = r1
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L3a
            L32:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L3a:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryResponseDto.Surrogate.<init>(equity_trading_tax_lots.proto.v1.LotSourceTypeDto, int, com.robinhood.rosetta.common.MoneyDto, com.robinhood.rosetta.common.MoneyDto, boolean, equity_trading_tax_lots.proto.v1.TableDetailsDto, equity_trading_tax_lots.proto.v1.OrderSummaryDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final int getLot_count() {
            return this.lot_count;
        }

        public final MoneyDto getRealized_gain_loss() {
            return this.realized_gain_loss;
        }

        public final MoneyDto getDisplay_value() {
            return this.display_value;
        }

        /* renamed from: is_gk_verified, reason: from getter */
        public final boolean getIs_gk_verified() {
            return this.is_gk_verified;
        }

        public final TableDetailsDto getTable_details() {
            return this.table_details;
        }

        public final OrderSummaryDetailsDto getOrder_summary_details() {
            return this.order_summary_details;
        }
    }

    /* compiled from: StreamTaxLotsSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamTaxLotsSummaryResponseDto, StreamTaxLotsSummaryResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamTaxLotsSummaryResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotsSummaryResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotsSummaryResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamTaxLotsSummaryResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamTaxLotsSummaryResponse> getProtoAdapter() {
            return StreamTaxLotsSummaryResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotsSummaryResponseDto getZeroValue() {
            return StreamTaxLotsSummaryResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotsSummaryResponseDto fromProto(StreamTaxLotsSummaryResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            LotSourceTypeDto lotSourceTypeDtoFromProto = LotSourceTypeDto.INSTANCE.fromProto(proto.getLot_source_type());
            int lot_count = proto.getLot_count();
            Money realized_gain_loss = proto.getRealized_gain_loss();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = realized_gain_loss != null ? MoneyDto.INSTANCE.fromProto(realized_gain_loss) : null;
            Money display_value = proto.getDisplay_value();
            MoneyDto moneyDtoFromProto2 = display_value != null ? MoneyDto.INSTANCE.fromProto(display_value) : null;
            boolean is_gk_verified = proto.getIs_gk_verified();
            TableDetails table_details = proto.getTable_details();
            TableDetailsDto tableDetailsDtoFromProto = table_details != null ? TableDetailsDto.INSTANCE.fromProto(table_details) : null;
            OrderSummaryDetails order_summary_details = proto.getOrder_summary_details();
            return new StreamTaxLotsSummaryResponseDto(new Surrogate(lotSourceTypeDtoFromProto, lot_count, moneyDtoFromProto, moneyDtoFromProto2, is_gk_verified, tableDetailsDtoFromProto, order_summary_details != null ? OrderSummaryDetailsDto.INSTANCE.fromProto(order_summary_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotsSummaryResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamTaxLotsSummaryResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamTaxLotsSummaryResponseDto(null, 0, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamTaxLotsSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto;", "<init>", "()V", "surrogateSerializer", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<StreamTaxLotsSummaryResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/equity_trading_tax_lots.proto.v1.StreamTaxLotsSummaryResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamTaxLotsSummaryResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamTaxLotsSummaryResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamTaxLotsSummaryResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamTaxLotsSummaryResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "equity_trading_tax_lots.proto.v1.StreamTaxLotsSummaryResponseDto";
        }
    }
}
