package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesOrderLegRequestDto;
import com.robinhood.ceres.p284v1.TentativeFuturesOrderRequestDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.OrderType;
import rosetta.mainst.OrderTypeDto;

/* compiled from: TentativeFuturesOrderRequestDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BS\b\u0016\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0013JP\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, m3636d2 = {"Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto$Surrogate;)V", "legs", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "quantity", "Lcom/robinhood/idl/IdlDecimal;", "order_type", "Lrosetta/mainst/OrderTypeDto;", "limit_price", "stop_price", "quote_id", "", "(Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "getLegs", "()Ljava/util/List;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getOrder_type", "()Lrosetta/mainst/OrderTypeDto;", "getLimit_price", "getStop_price", "getQuote_id", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class TentativeFuturesOrderRequestDto implements Dto3<TentativeFuturesOrderRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TentativeFuturesOrderRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TentativeFuturesOrderRequestDto, TentativeFuturesOrderRequest>> binaryBase64Serializer$delegate;
    private static final TentativeFuturesOrderRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TentativeFuturesOrderRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TentativeFuturesOrderRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<FuturesOrderLegRequestDto> getLegs() {
        return this.surrogate.getLegs();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final OrderTypeDto getOrder_type() {
        return this.surrogate.getOrder_type();
    }

    public final IdlDecimal getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public final IdlDecimal getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final String getQuote_id() {
        return this.surrogate.getQuote_id();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TentativeFuturesOrderRequestDto(java.util.List r2, com.robinhood.idl.IdlDecimal r3, rosetta.mainst.OrderTypeDto r4, com.robinhood.idl.IdlDecimal r5, com.robinhood.idl.IdlDecimal r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r9 = r8 & 2
            if (r9 == 0) goto L13
            com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
            java.lang.String r9 = ""
            r3.<init>(r9)
        L13:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L19
            r4 = r0
        L19:
            r9 = r8 & 8
            if (r9 == 0) goto L1e
            r5 = r0
        L1e:
            r9 = r8 & 16
            if (r9 == 0) goto L23
            r6 = r0
        L23:
            r8 = r8 & 32
            if (r8 == 0) goto L2f
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L36
        L2f:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L36:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.ceres.p284v1.TentativeFuturesOrderRequestDto.<init>(java.util.List, com.robinhood.idl.IdlDecimal, rosetta.mainst.OrderTypeDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TentativeFuturesOrderRequestDto(List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str) {
        this(new Surrogate(legs, quantity, orderTypeDto, idlDecimal, idlDecimal2, str));
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
    }

    public static /* synthetic */ TentativeFuturesOrderRequestDto copy$default(TentativeFuturesOrderRequestDto tentativeFuturesOrderRequestDto, List list, IdlDecimal idlDecimal, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tentativeFuturesOrderRequestDto.surrogate.getLegs();
        }
        if ((i & 2) != 0) {
            idlDecimal = tentativeFuturesOrderRequestDto.surrogate.getQuantity();
        }
        if ((i & 4) != 0) {
            orderTypeDto = tentativeFuturesOrderRequestDto.surrogate.getOrder_type();
        }
        if ((i & 8) != 0) {
            idlDecimal2 = tentativeFuturesOrderRequestDto.surrogate.getLimit_price();
        }
        if ((i & 16) != 0) {
            idlDecimal3 = tentativeFuturesOrderRequestDto.surrogate.getStop_price();
        }
        if ((i & 32) != 0) {
            str = tentativeFuturesOrderRequestDto.surrogate.getQuote_id();
        }
        IdlDecimal idlDecimal4 = idlDecimal3;
        String str2 = str;
        return tentativeFuturesOrderRequestDto.copy(list, idlDecimal, orderTypeDto, idlDecimal2, idlDecimal4, str2);
    }

    public final TentativeFuturesOrderRequestDto copy(List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, OrderTypeDto order_type, IdlDecimal limit_price, IdlDecimal stop_price, String quote_id) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return new TentativeFuturesOrderRequestDto(new Surrogate(legs, quantity, order_type, limit_price, stop_price, quote_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TentativeFuturesOrderRequest toProto() {
        List<FuturesOrderLegRequestDto> legs = this.surrogate.getLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it = legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((FuturesOrderLegRequestDto) it.next()).toProto());
        }
        String stringValue = this.surrogate.getQuantity().getStringValue();
        OrderTypeDto order_type = this.surrogate.getOrder_type();
        OrderType orderType = order_type != null ? (OrderType) order_type.toProto() : null;
        IdlDecimal limit_price = this.surrogate.getLimit_price();
        String stringValue2 = limit_price != null ? limit_price.getStringValue() : null;
        IdlDecimal stop_price = this.surrogate.getStop_price();
        return new TentativeFuturesOrderRequest(arrayList, stringValue, orderType, stringValue2, stop_price != null ? stop_price.getStringValue() : null, this.surrogate.getQuote_id(), null, 64, null);
    }

    public String toString() {
        return "[TentativeFuturesOrderRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TentativeFuturesOrderRequestDto) && Intrinsics.areEqual(((TentativeFuturesOrderRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: TentativeFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002<=B~\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\r\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011B]\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0018\u0010)\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u001a\u0010+\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u001a\u0010,\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0080\u0001\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0019\b\u0002\u0010\r\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0013HÖ\u0001J\t\u00103\u001a\u00020\u000fHÖ\u0001J%\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010 R-\u0010\f\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001dR-\u0010\r\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001dR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010'¨\u0006>"}, m3636d2 = {"Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto$Surrogate;", "", "legs", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "quantity", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "order_type", "Lrosetta/mainst/OrderTypeDto;", "limit_price", "stop_price", "quote_id", "", "<init>", "(Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLegs$annotations", "()V", "getLegs", "()Ljava/util/List;", "getQuantity$annotations", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getOrder_type$annotations", "getOrder_type", "()Lrosetta/mainst/OrderTypeDto;", "getLimit_price$annotations", "getLimit_price", "getStop_price$annotations", "getStop_price", "getQuote_id$annotations", "getQuote_id", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<FuturesOrderLegRequestDto> legs;
        private final IdlDecimal limit_price;
        private final OrderTypeDto order_type;
        private final IdlDecimal quantity;
        private final String quote_id;
        private final IdlDecimal stop_price;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.ceres.v1.TentativeFuturesOrderRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TentativeFuturesOrderRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null};

        public Surrogate() {
            this((List) null, (IdlDecimal) null, (OrderTypeDto) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FuturesOrderLegRequestDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, List list, IdlDecimal idlDecimal, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = surrogate.legs;
            }
            if ((i & 2) != 0) {
                idlDecimal = surrogate.quantity;
            }
            if ((i & 4) != 0) {
                orderTypeDto = surrogate.order_type;
            }
            if ((i & 8) != 0) {
                idlDecimal2 = surrogate.limit_price;
            }
            if ((i & 16) != 0) {
                idlDecimal3 = surrogate.stop_price;
            }
            if ((i & 32) != 0) {
                str = surrogate.quote_id;
            }
            IdlDecimal idlDecimal4 = idlDecimal3;
            String str2 = str;
            return surrogate.copy(list, idlDecimal, orderTypeDto, idlDecimal2, idlDecimal4, str2);
        }

        @SerialName("legs")
        @JsonAnnotations2(names = {"legs"})
        public static /* synthetic */ void getLegs$annotations() {
        }

        @SerialName("limitPrice")
        @JsonAnnotations2(names = {"limit_price"})
        public static /* synthetic */ void getLimit_price$annotations() {
        }

        @SerialName("orderType")
        @JsonAnnotations2(names = {"order_type"})
        public static /* synthetic */ void getOrder_type$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("quoteId")
        @JsonAnnotations2(names = {"quote_id"})
        public static /* synthetic */ void getQuote_id$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        public final List<FuturesOrderLegRequestDto> component1() {
            return this.legs;
        }

        /* renamed from: component2, reason: from getter */
        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component6, reason: from getter */
        public final String getQuote_id() {
            return this.quote_id;
        }

        public final Surrogate copy(List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, OrderTypeDto order_type, IdlDecimal limit_price, IdlDecimal stop_price, String quote_id) {
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            return new Surrogate(legs, quantity, order_type, limit_price, stop_price, quote_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.legs, surrogate.legs) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && this.order_type == surrogate.order_type && Intrinsics.areEqual(this.limit_price, surrogate.limit_price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && Intrinsics.areEqual(this.quote_id, surrogate.quote_id);
        }

        public int hashCode() {
            int iHashCode = ((this.legs.hashCode() * 31) + this.quantity.hashCode()) * 31;
            OrderTypeDto orderTypeDto = this.order_type;
            int iHashCode2 = (iHashCode + (orderTypeDto == null ? 0 : orderTypeDto.hashCode())) * 31;
            IdlDecimal idlDecimal = this.limit_price;
            int iHashCode3 = (iHashCode2 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.stop_price;
            int iHashCode4 = (iHashCode3 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            String str = this.quote_id;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(legs=" + this.legs + ", quantity=" + this.quantity + ", order_type=" + this.order_type + ", limit_price=" + this.limit_price + ", stop_price=" + this.stop_price + ", quote_id=" + this.quote_id + ")";
        }

        /* compiled from: TentativeFuturesOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TentativeFuturesOrderRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, IdlDecimal idlDecimal, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.legs = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.order_type = null;
            } else {
                this.order_type = orderTypeDto;
            }
            if ((i & 8) == 0) {
                this.limit_price = null;
            } else {
                this.limit_price = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = idlDecimal3;
            }
            if ((i & 32) == 0) {
                this.quote_id = null;
            } else {
                this.quote_id = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.legs, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.legs);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            OrderTypeDto orderTypeDto = self.order_type;
            if (orderTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, OrderTypeDto.Serializer.INSTANCE, orderTypeDto);
            }
            IdlDecimal idlDecimal = self.limit_price;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            IdlDecimal idlDecimal2 = self.stop_price;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            String str = self.quote_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, OrderTypeDto orderTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str) {
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.legs = legs;
            this.quantity = quantity;
            this.order_type = orderTypeDto;
            this.limit_price = idlDecimal;
            this.stop_price = idlDecimal2;
            this.quote_id = str;
        }

        public final List<FuturesOrderLegRequestDto> getLegs() {
            return this.legs;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.util.List r2, com.robinhood.idl.IdlDecimal r3, rosetta.mainst.OrderTypeDto r4, com.robinhood.idl.IdlDecimal r5, com.robinhood.idl.IdlDecimal r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r9 = r8 & 2
                if (r9 == 0) goto L13
                com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
                java.lang.String r9 = ""
                r3.<init>(r9)
            L13:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L19
                r4 = r0
            L19:
                r9 = r8 & 8
                if (r9 == 0) goto L1e
                r5 = r0
            L1e:
                r9 = r8 & 16
                if (r9 == 0) goto L23
                r6 = r0
            L23:
                r8 = r8 & 32
                if (r8 == 0) goto L2f
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L36
            L2f:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L36:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.ceres.p284v1.TentativeFuturesOrderRequestDto.Surrogate.<init>(java.util.List, com.robinhood.idl.IdlDecimal, rosetta.mainst.OrderTypeDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        public final String getQuote_id() {
            return this.quote_id;
        }
    }

    /* compiled from: TentativeFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto;", "Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TentativeFuturesOrderRequestDto, TentativeFuturesOrderRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TentativeFuturesOrderRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TentativeFuturesOrderRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TentativeFuturesOrderRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) TentativeFuturesOrderRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TentativeFuturesOrderRequest> getProtoAdapter() {
            return TentativeFuturesOrderRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TentativeFuturesOrderRequestDto getZeroValue() {
            return TentativeFuturesOrderRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TentativeFuturesOrderRequestDto fromProto(TentativeFuturesOrderRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<FuturesOrderLegRequest> legs = proto.getLegs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it = legs.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesOrderLegRequestDto.INSTANCE.fromProto((FuturesOrderLegRequest) it.next()));
            }
            IdlDecimal idlDecimal = new IdlDecimal(proto.getQuantity());
            OrderType order_type = proto.getOrder_type();
            DefaultConstructorMarker defaultConstructorMarker = null;
            OrderTypeDto orderTypeDtoFromProto = order_type != null ? OrderTypeDto.INSTANCE.fromProto(order_type) : null;
            String limit_price = proto.getLimit_price();
            IdlDecimal idlDecimal2 = limit_price != null ? new IdlDecimal(limit_price) : null;
            String stop_price = proto.getStop_price();
            return new TentativeFuturesOrderRequestDto(new Surrogate(arrayList, idlDecimal, orderTypeDtoFromProto, idlDecimal2, stop_price != null ? new IdlDecimal(stop_price) : null, proto.getQuote_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.TentativeFuturesOrderRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TentativeFuturesOrderRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new TentativeFuturesOrderRequestDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TentativeFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TentativeFuturesOrderRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.TentativeFuturesOrderRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TentativeFuturesOrderRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TentativeFuturesOrderRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TentativeFuturesOrderRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TentativeFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/TentativeFuturesOrderRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.TentativeFuturesOrderRequestDto";
        }
    }
}
