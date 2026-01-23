package com.robinhood.cbc.service.tax_lot.p283v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.cbc.service.tax_lot.p283v1.DisposalMethodDto;
import com.robinhood.cbc.service.tax_lot.p283v1.InstrumentTypeDto;
import com.robinhood.cbc.service.tax_lot.p283v1.OrderEarmarkRequestDto;
import com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
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

/* compiled from: OrderEarmarkRequestDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/012B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0014JH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020(H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00063"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto$Surrogate;)V", "account_number", "", "order_id", "Lokio/ByteString;", "instrument_id", "disposal_method", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "selected_lots", "", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionDto;", "instrument_type", "Lcom/robinhood/cbc/service/tax_lot/v1/InstrumentTypeDto;", "(Ljava/lang/String;Lokio/ByteString;Lokio/ByteString;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Ljava/util/List;Lcom/robinhood/cbc/service/tax_lot/v1/InstrumentTypeDto;)V", "getAccount_number", "()Ljava/lang/String;", "getOrder_id", "()Lokio/ByteString;", "getInstrument_id", "getDisposal_method", "()Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "getSelected_lots", "()Ljava/util/List;", "getInstrument_type", "()Lcom/robinhood/cbc/service/tax_lot/v1/InstrumentTypeDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderEarmarkRequestDto implements Dto3<OrderEarmarkRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderEarmarkRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderEarmarkRequestDto, OrderEarmarkRequest>> binaryBase64Serializer$delegate;
    private static final OrderEarmarkRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderEarmarkRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderEarmarkRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final ByteString getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final ByteString getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final DisposalMethodDto getDisposal_method() {
        return this.surrogate.getDisposal_method();
    }

    public final List<TaxLotSelectionDto> getSelected_lots() {
        return this.surrogate.getSelected_lots();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public /* synthetic */ OrderEarmarkRequestDto(String str, ByteString byteString, ByteString byteString2, DisposalMethodDto disposalMethodDto, List list, InstrumentTypeDto instrumentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString, (i & 4) != 0 ? ByteString.EMPTY : byteString2, (i & 8) != 0 ? DisposalMethodDto.INSTANCE.getZeroValue() : disposalMethodDto, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderEarmarkRequestDto(String account_number, ByteString order_id, ByteString instrument_id, DisposalMethodDto disposal_method, List<TaxLotSelectionDto> selected_lots, InstrumentTypeDto instrument_type) {
        this(new Surrogate(account_number, order_id, instrument_id, disposal_method, selected_lots, instrument_type));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(disposal_method, "disposal_method");
        Intrinsics.checkNotNullParameter(selected_lots, "selected_lots");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
    }

    public static /* synthetic */ OrderEarmarkRequestDto copy$default(OrderEarmarkRequestDto orderEarmarkRequestDto, String str, ByteString byteString, ByteString byteString2, DisposalMethodDto disposalMethodDto, List list, InstrumentTypeDto instrumentTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderEarmarkRequestDto.surrogate.getAccount_number();
        }
        if ((i & 2) != 0) {
            byteString = orderEarmarkRequestDto.surrogate.getOrder_id();
        }
        if ((i & 4) != 0) {
            byteString2 = orderEarmarkRequestDto.surrogate.getInstrument_id();
        }
        if ((i & 8) != 0) {
            disposalMethodDto = orderEarmarkRequestDto.surrogate.getDisposal_method();
        }
        if ((i & 16) != 0) {
            list = orderEarmarkRequestDto.surrogate.getSelected_lots();
        }
        if ((i & 32) != 0) {
            instrumentTypeDto = orderEarmarkRequestDto.surrogate.getInstrument_type();
        }
        List list2 = list;
        InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
        return orderEarmarkRequestDto.copy(str, byteString, byteString2, disposalMethodDto, list2, instrumentTypeDto2);
    }

    public final OrderEarmarkRequestDto copy(String account_number, ByteString order_id, ByteString instrument_id, DisposalMethodDto disposal_method, List<TaxLotSelectionDto> selected_lots, InstrumentTypeDto instrument_type) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(disposal_method, "disposal_method");
        Intrinsics.checkNotNullParameter(selected_lots, "selected_lots");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        return new OrderEarmarkRequestDto(new Surrogate(account_number, order_id, instrument_id, disposal_method, selected_lots, instrument_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OrderEarmarkRequest toProto() {
        String account_number = this.surrogate.getAccount_number();
        ByteString order_id = this.surrogate.getOrder_id();
        ByteString instrument_id = this.surrogate.getInstrument_id();
        DisposalMethod disposalMethod = (DisposalMethod) this.surrogate.getDisposal_method().toProto();
        List<TaxLotSelectionDto> selected_lots = this.surrogate.getSelected_lots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_lots, 10));
        Iterator<T> it = selected_lots.iterator();
        while (it.hasNext()) {
            arrayList.add(((TaxLotSelectionDto) it.next()).toProto());
        }
        return new OrderEarmarkRequest(account_number, order_id, instrument_id, disposalMethod, arrayList, (InstrumentType) this.surrogate.getInstrument_type().toProto(), null, 64, null);
    }

    public String toString() {
        return "[OrderEarmarkRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderEarmarkRequestDto) && Intrinsics.areEqual(((OrderEarmarkRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderEarmarkRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002>?Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012B]\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0018\u0010+\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010,\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003Ji\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0014HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR+\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001eR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010#R\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010&R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010)¨\u0006@"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto$Surrogate;", "", "account_number", "", "order_id", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "instrument_id", "disposal_method", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "selected_lots", "", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionDto;", "instrument_type", "Lcom/robinhood/cbc/service/tax_lot/v1/InstrumentTypeDto;", "<init>", "(Ljava/lang/String;Lokio/ByteString;Lokio/ByteString;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Ljava/util/List;Lcom/robinhood/cbc/service/tax_lot/v1/InstrumentTypeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lokio/ByteString;Lokio/ByteString;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Ljava/util/List;Lcom/robinhood/cbc/service/tax_lot/v1/InstrumentTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_number$annotations", "()V", "getAccount_number", "()Ljava/lang/String;", "getOrder_id$annotations", "getOrder_id", "()Lokio/ByteString;", "getInstrument_id$annotations", "getInstrument_id", "getDisposal_method$annotations", "getDisposal_method", "()Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "getSelected_lots$annotations", "getSelected_lots", "()Ljava/util/List;", "getInstrument_type$annotations", "getInstrument_type", "()Lcom/robinhood/cbc/service/tax_lot/v1/InstrumentTypeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$cbc_tax_lots_externalRelease", "$serializer", "Companion", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final DisposalMethodDto disposal_method;
        private final ByteString instrument_id;
        private final InstrumentTypeDto instrument_type;
        private final ByteString order_id;
        private final List<TaxLotSelectionDto> selected_lots;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.cbc.service.tax_lot.v1.OrderEarmarkRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderEarmarkRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (ByteString) null, (ByteString) null, (DisposalMethodDto) null, (List) null, (InstrumentTypeDto) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TaxLotSelectionDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, ByteString byteString, ByteString byteString2, DisposalMethodDto disposalMethodDto, List list, InstrumentTypeDto instrumentTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.account_number;
            }
            if ((i & 2) != 0) {
                byteString = surrogate.order_id;
            }
            if ((i & 4) != 0) {
                byteString2 = surrogate.instrument_id;
            }
            if ((i & 8) != 0) {
                disposalMethodDto = surrogate.disposal_method;
            }
            if ((i & 16) != 0) {
                list = surrogate.selected_lots;
            }
            if ((i & 32) != 0) {
                instrumentTypeDto = surrogate.instrument_type;
            }
            List list2 = list;
            InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
            return surrogate.copy(str, byteString, byteString2, disposalMethodDto, list2, instrumentTypeDto2);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("disposalMethod")
        @JsonAnnotations2(names = {"disposal_method"})
        public static /* synthetic */ void getDisposal_method$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("instrumentType")
        @JsonAnnotations2(names = {"instrument_type"})
        public static /* synthetic */ void getInstrument_type$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("selectedLots")
        @JsonAnnotations2(names = {"selected_lots"})
        public static /* synthetic */ void getSelected_lots$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component2, reason: from getter */
        public final ByteString getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component3, reason: from getter */
        public final ByteString getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component4, reason: from getter */
        public final DisposalMethodDto getDisposal_method() {
            return this.disposal_method;
        }

        public final List<TaxLotSelectionDto> component5() {
            return this.selected_lots;
        }

        /* renamed from: component6, reason: from getter */
        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final Surrogate copy(String account_number, ByteString order_id, ByteString instrument_id, DisposalMethodDto disposal_method, List<TaxLotSelectionDto> selected_lots, InstrumentTypeDto instrument_type) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(disposal_method, "disposal_method");
            Intrinsics.checkNotNullParameter(selected_lots, "selected_lots");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            return new Surrogate(account_number, order_id, instrument_id, disposal_method, selected_lots, instrument_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && this.disposal_method == surrogate.disposal_method && Intrinsics.areEqual(this.selected_lots, surrogate.selected_lots) && this.instrument_type == surrogate.instrument_type;
        }

        public int hashCode() {
            return (((((((((this.account_number.hashCode() * 31) + this.order_id.hashCode()) * 31) + this.instrument_id.hashCode()) * 31) + this.disposal_method.hashCode()) * 31) + this.selected_lots.hashCode()) * 31) + this.instrument_type.hashCode();
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", order_id=" + this.order_id + ", instrument_id=" + this.instrument_id + ", disposal_method=" + this.disposal_method + ", selected_lots=" + this.selected_lots + ", instrument_type=" + this.instrument_type + ")";
        }

        /* compiled from: OrderEarmarkRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto$Surrogate;", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderEarmarkRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ByteString byteString, ByteString byteString2, DisposalMethodDto disposalMethodDto, List list, InstrumentTypeDto instrumentTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.order_id = ByteString.EMPTY;
            } else {
                this.order_id = byteString;
            }
            if ((i & 4) == 0) {
                this.instrument_id = ByteString.EMPTY;
            } else {
                this.instrument_id = byteString2;
            }
            if ((i & 8) == 0) {
                this.disposal_method = DisposalMethodDto.INSTANCE.getZeroValue();
            } else {
                this.disposal_method = disposalMethodDto;
            }
            if ((i & 16) == 0) {
                this.selected_lots = CollectionsKt.emptyList();
            } else {
                this.selected_lots = list;
            }
            if ((i & 32) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$cbc_tax_lots_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            ByteString byteString = self.order_id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 1, ByteStringSerializer.INSTANCE, self.order_id);
            }
            if (!Intrinsics.areEqual(self.instrument_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 2, ByteStringSerializer.INSTANCE, self.instrument_id);
            }
            if (self.disposal_method != DisposalMethodDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, DisposalMethodDto.Serializer.INSTANCE, self.disposal_method);
            }
            if (!Intrinsics.areEqual(self.selected_lots, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.selected_lots);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
        }

        public Surrogate(String account_number, ByteString order_id, ByteString instrument_id, DisposalMethodDto disposal_method, List<TaxLotSelectionDto> selected_lots, InstrumentTypeDto instrument_type) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(disposal_method, "disposal_method");
            Intrinsics.checkNotNullParameter(selected_lots, "selected_lots");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            this.account_number = account_number;
            this.order_id = order_id;
            this.instrument_id = instrument_id;
            this.disposal_method = disposal_method;
            this.selected_lots = selected_lots;
            this.instrument_type = instrument_type;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public /* synthetic */ Surrogate(String str, ByteString byteString, ByteString byteString2, DisposalMethodDto disposalMethodDto, List list, InstrumentTypeDto instrumentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString, (i & 4) != 0 ? ByteString.EMPTY : byteString2, (i & 8) != 0 ? DisposalMethodDto.INSTANCE.getZeroValue() : disposalMethodDto, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
        }

        public final ByteString getOrder_id() {
            return this.order_id;
        }

        public final ByteString getInstrument_id() {
            return this.instrument_id;
        }

        public final DisposalMethodDto getDisposal_method() {
            return this.disposal_method;
        }

        public final List<TaxLotSelectionDto> getSelected_lots() {
            return this.selected_lots;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }
    }

    /* compiled from: OrderEarmarkRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderEarmarkRequestDto, OrderEarmarkRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderEarmarkRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderEarmarkRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderEarmarkRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderEarmarkRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderEarmarkRequest> getProtoAdapter() {
            return OrderEarmarkRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderEarmarkRequestDto getZeroValue() {
            return OrderEarmarkRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderEarmarkRequestDto fromProto(OrderEarmarkRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            ByteString order_id = proto.getOrder_id();
            ByteString instrument_id = proto.getInstrument_id();
            DisposalMethodDto disposalMethodDtoFromProto = DisposalMethodDto.INSTANCE.fromProto(proto.getDisposal_method());
            List<TaxLotSelection> selected_lots = proto.getSelected_lots();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_lots, 10));
            Iterator<T> it = selected_lots.iterator();
            while (it.hasNext()) {
                arrayList.add(TaxLotSelectionDto.INSTANCE.fromProto((TaxLotSelection) it.next()));
            }
            return new OrderEarmarkRequestDto(new Surrogate(account_number, order_id, instrument_id, disposalMethodDtoFromProto, arrayList, InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.cbc.service.tax_lot.v1.OrderEarmarkRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderEarmarkRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new OrderEarmarkRequestDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderEarmarkRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderEarmarkRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/cbc.service.tax_lot.v1.OrderEarmarkRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderEarmarkRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderEarmarkRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderEarmarkRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderEarmarkRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.cbc.service.tax_lot.v1.OrderEarmarkRequestDto";
        }
    }
}
