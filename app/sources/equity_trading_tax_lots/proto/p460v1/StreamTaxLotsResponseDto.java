package equity_trading_tax_lots.proto.p460v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsResponseDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotInformationDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirectionDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDto;
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

/* compiled from: StreamTaxLotsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*¨\u0006/"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponse;", "Landroid/os/Parcelable;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$Surrogate;", "surrogate", "<init>", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$Surrogate;)V", "", "Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto;", "lots", "", "order_id", "rhs_account_number", "instrument_id", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;", "sort_direction", "Lcom/robinhood/idl/IdlDecimal;", "max_gain_loss", "max_cost_per_share", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class StreamTaxLotsResponseDto implements Dto3<StreamTaxLotsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamTaxLotsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamTaxLotsResponseDto, StreamTaxLotsResponse>> binaryBase64Serializer$delegate;
    private static final StreamTaxLotsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamTaxLotsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamTaxLotsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StreamTaxLotsResponseDto(java.util.List r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, equity_trading_tax_lots.proto.p460v1.TaxLotSortDto r6, equity_trading_tax_lots.proto.p460v1.TaxLotSortDirectionDto r7, com.robinhood.idl.IdlDecimal r8, com.robinhood.idl.IdlDecimal r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r11 = r10 & 2
            java.lang.String r0 = ""
            if (r11 == 0) goto Lf
            r3 = r0
        Lf:
            r11 = r10 & 4
            if (r11 == 0) goto L14
            r4 = r0
        L14:
            r11 = r10 & 8
            if (r11 == 0) goto L19
            r5 = r0
        L19:
            r11 = r10 & 16
            if (r11 == 0) goto L23
            equity_trading_tax_lots.proto.v1.TaxLotSortDto$Companion r6 = equity_trading_tax_lots.proto.p460v1.TaxLotSortDto.INSTANCE
            equity_trading_tax_lots.proto.v1.TaxLotSortDto r6 = r6.getZeroValue()
        L23:
            r11 = r10 & 32
            if (r11 == 0) goto L2d
            equity_trading_tax_lots.proto.v1.TaxLotSortDirectionDto$Companion r7 = equity_trading_tax_lots.proto.p460v1.TaxLotSortDirectionDto.INSTANCE
            equity_trading_tax_lots.proto.v1.TaxLotSortDirectionDto r7 = r7.getZeroValue()
        L2d:
            r11 = r10 & 64
            r0 = 0
            if (r11 == 0) goto L33
            r8 = r0
        L33:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L41
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L4a
        L41:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L4a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: equity_trading_tax_lots.proto.p460v1.StreamTaxLotsResponseDto.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, equity_trading_tax_lots.proto.v1.TaxLotSortDto, equity_trading_tax_lots.proto.v1.TaxLotSortDirectionDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotsResponseDto(List<TaxLotInformationDto> lots, String order_id, String rhs_account_number, String instrument_id, TaxLotSortDto sort, TaxLotSortDirectionDto sort_direction, IdlDecimal idlDecimal, IdlDecimal idlDecimal2) {
        this(new Surrogate(lots, order_id, rhs_account_number, instrument_id, sort, sort_direction, idlDecimal, idlDecimal2));
        Intrinsics.checkNotNullParameter(lots, "lots");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamTaxLotsResponse toProto() {
        List<TaxLotInformationDto> lots = this.surrogate.getLots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lots, 10));
        Iterator<T> it = lots.iterator();
        while (it.hasNext()) {
            arrayList.add(((TaxLotInformationDto) it.next()).toProto());
        }
        String order_id = this.surrogate.getOrder_id();
        String rhs_account_number = this.surrogate.getRhs_account_number();
        String instrument_id = this.surrogate.getInstrument_id();
        TaxLotSort taxLotSort = (TaxLotSort) this.surrogate.getSort().toProto();
        TaxLotSortDirection taxLotSortDirection = (TaxLotSortDirection) this.surrogate.getSort_direction().toProto();
        IdlDecimal max_gain_loss = this.surrogate.getMax_gain_loss();
        String stringValue = max_gain_loss != null ? max_gain_loss.getStringValue() : null;
        IdlDecimal max_cost_per_share = this.surrogate.getMax_cost_per_share();
        return new StreamTaxLotsResponse(arrayList, order_id, rhs_account_number, instrument_id, taxLotSort, taxLotSortDirection, stringValue, max_cost_per_share != null ? max_cost_per_share.getStringValue() : null, null, 256, null);
    }

    public String toString() {
        return "[StreamTaxLotsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamTaxLotsResponseDto) && Intrinsics.areEqual(((StreamTaxLotsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamTaxLotsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 E2\u00020\u0001:\u0002FEB\u007f\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0019\b\u0002\u0010\u0011\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\u0019\b\u0002\u0010\u0012\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\u0004\b\u0013\u0010\u0014Bq\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010$R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010$R \u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b6\u0010/\u001a\u0004\b5\u0010$R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b:\u0010/\u001a\u0004\b8\u00109R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\b>\u0010/\u001a\u0004\b<\u0010=R1\u0010\u0011\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010?\u0012\u0004\bB\u0010/\u001a\u0004\b@\u0010AR1\u0010\u0012\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010?\u0012\u0004\bD\u0010/\u001a\u0004\bC\u0010A¨\u0006G"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$Surrogate;", "", "", "Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto;", "lots", "", "order_id", "rhs_account_number", "instrument_id", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;", "sort_direction", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "max_gain_loss", "max_cost_per_share", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_trading_tax_lots_proto_v1_externalRelease", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLots", "()Ljava/util/List;", "getLots$annotations", "()V", "Ljava/lang/String;", "getOrder_id", "getOrder_id$annotations", "getRhs_account_number", "getRhs_account_number$annotations", "getInstrument_id", "getInstrument_id$annotations", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;", "getSort", "()Lequity_trading_tax_lots/proto/v1/TaxLotSortDto;", "getSort$annotations", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;", "getSort_direction", "()Lequity_trading_tax_lots/proto/v1/TaxLotSortDirectionDto;", "getSort_direction$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getMax_gain_loss", "()Lcom/robinhood/idl/IdlDecimal;", "getMax_gain_loss$annotations", "getMax_cost_per_share", "getMax_cost_per_share$annotations", "Companion", "$serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String instrument_id;
        private final List<TaxLotInformationDto> lots;
        private final IdlDecimal max_cost_per_share;
        private final IdlDecimal max_gain_loss;
        private final String order_id;
        private final String rhs_account_number;
        private final TaxLotSortDto sort;
        private final TaxLotSortDirectionDto sort_direction;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotsResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamTaxLotsResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null};

        public Surrogate() {
            this((List) null, (String) null, (String) null, (String) null, (TaxLotSortDto) null, (TaxLotSortDirectionDto) null, (IdlDecimal) null, (IdlDecimal) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TaxLotInformationDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.lots, surrogate.lots) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && this.sort == surrogate.sort && this.sort_direction == surrogate.sort_direction && Intrinsics.areEqual(this.max_gain_loss, surrogate.max_gain_loss) && Intrinsics.areEqual(this.max_cost_per_share, surrogate.max_cost_per_share);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.lots.hashCode() * 31) + this.order_id.hashCode()) * 31) + this.rhs_account_number.hashCode()) * 31) + this.instrument_id.hashCode()) * 31) + this.sort.hashCode()) * 31) + this.sort_direction.hashCode()) * 31;
            IdlDecimal idlDecimal = this.max_gain_loss;
            int iHashCode2 = (iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.max_cost_per_share;
            return iHashCode2 + (idlDecimal2 != null ? idlDecimal2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(lots=" + this.lots + ", order_id=" + this.order_id + ", rhs_account_number=" + this.rhs_account_number + ", instrument_id=" + this.instrument_id + ", sort=" + this.sort + ", sort_direction=" + this.sort_direction + ", max_gain_loss=" + this.max_gain_loss + ", max_cost_per_share=" + this.max_cost_per_share + ")";
        }

        /* compiled from: StreamTaxLotsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$Surrogate;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamTaxLotsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, String str, String str2, String str3, TaxLotSortDto taxLotSortDto, TaxLotSortDirectionDto taxLotSortDirectionDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
            this.lots = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str;
            }
            if ((i & 4) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str2;
            }
            if ((i & 8) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str3;
            }
            if ((i & 16) == 0) {
                this.sort = TaxLotSortDto.INSTANCE.getZeroValue();
            } else {
                this.sort = taxLotSortDto;
            }
            if ((i & 32) == 0) {
                this.sort_direction = TaxLotSortDirectionDto.INSTANCE.getZeroValue();
            } else {
                this.sort_direction = taxLotSortDirectionDto;
            }
            if ((i & 64) == 0) {
                this.max_gain_loss = null;
            } else {
                this.max_gain_loss = idlDecimal;
            }
            if ((i & 128) == 0) {
                this.max_cost_per_share = null;
            } else {
                this.max_cost_per_share = idlDecimal2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.lots, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.lots);
            }
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.order_id);
            }
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.rhs_account_number);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.instrument_id);
            }
            if (self.sort != TaxLotSortDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, TaxLotSortDto.Serializer.INSTANCE, self.sort);
            }
            if (self.sort_direction != TaxLotSortDirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, TaxLotSortDirectionDto.Serializer.INSTANCE, self.sort_direction);
            }
            IdlDecimal idlDecimal = self.max_gain_loss;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            IdlDecimal idlDecimal2 = self.max_cost_per_share;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
        }

        public Surrogate(List<TaxLotInformationDto> lots, String order_id, String rhs_account_number, String instrument_id, TaxLotSortDto sort, TaxLotSortDirectionDto sort_direction, IdlDecimal idlDecimal, IdlDecimal idlDecimal2) {
            Intrinsics.checkNotNullParameter(lots, "lots");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(sort, "sort");
            Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
            this.lots = lots;
            this.order_id = order_id;
            this.rhs_account_number = rhs_account_number;
            this.instrument_id = instrument_id;
            this.sort = sort;
            this.sort_direction = sort_direction;
            this.max_gain_loss = idlDecimal;
            this.max_cost_per_share = idlDecimal2;
        }

        public final List<TaxLotInformationDto> getLots() {
            return this.lots;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.util.List r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, equity_trading_tax_lots.proto.p460v1.TaxLotSortDto r6, equity_trading_tax_lots.proto.p460v1.TaxLotSortDirectionDto r7, com.robinhood.idl.IdlDecimal r8, com.robinhood.idl.IdlDecimal r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r11 = r10 & 2
                java.lang.String r0 = ""
                if (r11 == 0) goto Lf
                r3 = r0
            Lf:
                r11 = r10 & 4
                if (r11 == 0) goto L14
                r4 = r0
            L14:
                r11 = r10 & 8
                if (r11 == 0) goto L19
                r5 = r0
            L19:
                r11 = r10 & 16
                if (r11 == 0) goto L23
                equity_trading_tax_lots.proto.v1.TaxLotSortDto$Companion r6 = equity_trading_tax_lots.proto.p460v1.TaxLotSortDto.INSTANCE
                equity_trading_tax_lots.proto.v1.TaxLotSortDto r6 = r6.getZeroValue()
            L23:
                r11 = r10 & 32
                if (r11 == 0) goto L2d
                equity_trading_tax_lots.proto.v1.TaxLotSortDirectionDto$Companion r7 = equity_trading_tax_lots.proto.p460v1.TaxLotSortDirectionDto.INSTANCE
                equity_trading_tax_lots.proto.v1.TaxLotSortDirectionDto r7 = r7.getZeroValue()
            L2d:
                r11 = r10 & 64
                r0 = 0
                if (r11 == 0) goto L33
                r8 = r0
            L33:
                r10 = r10 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L41
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L4a
            L41:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L4a:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: equity_trading_tax_lots.proto.p460v1.StreamTaxLotsResponseDto.Surrogate.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, equity_trading_tax_lots.proto.v1.TaxLotSortDto, equity_trading_tax_lots.proto.v1.TaxLotSortDirectionDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final TaxLotSortDto getSort() {
            return this.sort;
        }

        public final TaxLotSortDirectionDto getSort_direction() {
            return this.sort_direction;
        }

        public final IdlDecimal getMax_gain_loss() {
            return this.max_gain_loss;
        }

        public final IdlDecimal getMax_cost_per_share() {
            return this.max_cost_per_share;
        }
    }

    /* compiled from: StreamTaxLotsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamTaxLotsResponseDto, StreamTaxLotsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamTaxLotsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamTaxLotsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamTaxLotsResponse> getProtoAdapter() {
            return StreamTaxLotsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotsResponseDto getZeroValue() {
            return StreamTaxLotsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotsResponseDto fromProto(StreamTaxLotsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<TaxLotInformation> lots = proto.getLots();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lots, 10));
            Iterator<T> it = lots.iterator();
            while (it.hasNext()) {
                arrayList.add(TaxLotInformationDto.INSTANCE.fromProto((TaxLotInformation) it.next()));
            }
            String order_id = proto.getOrder_id();
            String rhs_account_number = proto.getRhs_account_number();
            String instrument_id = proto.getInstrument_id();
            TaxLotSortDto taxLotSortDtoFromProto = TaxLotSortDto.INSTANCE.fromProto(proto.getSort());
            TaxLotSortDirectionDto taxLotSortDirectionDtoFromProto = TaxLotSortDirectionDto.INSTANCE.fromProto(proto.getSort_direction());
            String max_gain_loss = proto.getMax_gain_loss();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal = max_gain_loss != null ? new IdlDecimal(max_gain_loss) : null;
            String max_cost_per_share = proto.getMax_cost_per_share();
            return new StreamTaxLotsResponseDto(new Surrogate(arrayList, order_id, rhs_account_number, instrument_id, taxLotSortDtoFromProto, taxLotSortDirectionDtoFromProto, idlDecimal, max_cost_per_share != null ? new IdlDecimal(max_cost_per_share) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamTaxLotsResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new StreamTaxLotsResponseDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamTaxLotsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<StreamTaxLotsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/equity_trading_tax_lots.proto.v1.StreamTaxLotsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamTaxLotsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamTaxLotsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamTaxLotsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamTaxLotsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "equity_trading_tax_lots.proto.v1.StreamTaxLotsResponseDto";
        }
    }
}
