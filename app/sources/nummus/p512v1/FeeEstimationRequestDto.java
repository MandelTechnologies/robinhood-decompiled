package nummus.p512v1;

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
import kotlinx.serialization.internal.StringSerializer;
import nummus.p512v1.CurrencyTypeDto;
import rosetta.nummus.FeeType;
import rosetta.nummus.FeeTypeDto;
import rosetta.nummus.order.Side;
import rosetta.nummus.order.SideDto;
import rosetta.nummus.order.Type;
import rosetta.nummus.order.TypeDto;

/* compiled from: FeeEstimationRequestDto.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u007f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,¨\u00061"}, m3636d2 = {"Lnummus/v1/FeeEstimationRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/FeeEstimationRequest;", "Landroid/os/Parcelable;", "Lnummus/v1/FeeEstimationRequestDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/FeeEstimationRequestDto$Surrogate;)V", "", "currency_pair_id", "Lrosetta/nummus/order/SideDto;", "side", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "Lrosetta/nummus/order/TypeDto;", "order_type", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "limit_price", "stop_price", "Lrosetta/nummus/FeeTypeDto;", "fee_type", "account_id", "Lnummus/v1/CurrencyTypeDto;", "currency_type", "(Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/order/TypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/FeeTypeDto;Ljava/lang/String;Lnummus/v1/CurrencyTypeDto;)V", "toProto", "()Lnummus/v1/FeeEstimationRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/FeeEstimationRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class FeeEstimationRequestDto implements Dto3<FeeEstimationRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FeeEstimationRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeeEstimationRequestDto, FeeEstimationRequest>> binaryBase64Serializer$delegate;
    private static final FeeEstimationRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FeeEstimationRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeeEstimationRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FeeEstimationRequestDto(java.lang.String r2, rosetta.nummus.order.SideDto r3, com.robinhood.idl.IdlDecimal r4, rosetta.nummus.order.TypeDto r5, com.robinhood.idl.IdlDecimal r6, com.robinhood.idl.IdlDecimal r7, com.robinhood.idl.IdlDecimal r8, rosetta.nummus.FeeTypeDto r9, java.lang.String r10, nummus.p512v1.CurrencyTypeDto r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto Lc
            r3 = r0
        Lc:
            r13 = r12 & 4
            if (r13 == 0) goto L11
            r4 = r0
        L11:
            r13 = r12 & 8
            if (r13 == 0) goto L16
            r5 = r0
        L16:
            r13 = r12 & 16
            if (r13 == 0) goto L1b
            r6 = r0
        L1b:
            r13 = r12 & 32
            if (r13 == 0) goto L20
            r7 = r0
        L20:
            r13 = r12 & 64
            if (r13 == 0) goto L25
            r8 = r0
        L25:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L2a
            r9 = r0
        L2a:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L2f
            r10 = r0
        L2f:
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L3f
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L4a
        L3f:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L4a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nummus.p512v1.FeeEstimationRequestDto.<init>(java.lang.String, rosetta.nummus.order.SideDto, com.robinhood.idl.IdlDecimal, rosetta.nummus.order.TypeDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, rosetta.nummus.FeeTypeDto, java.lang.String, nummus.v1.CurrencyTypeDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeeEstimationRequestDto(String currency_pair_id, SideDto sideDto, IdlDecimal idlDecimal, TypeDto typeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, FeeTypeDto feeTypeDto, String str, CurrencyTypeDto currencyTypeDto) {
        this(new Surrogate(currency_pair_id, sideDto, idlDecimal, typeDto, idlDecimal2, idlDecimal3, idlDecimal4, feeTypeDto, str, currencyTypeDto));
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FeeEstimationRequest toProto() {
        String currency_pair_id = this.surrogate.getCurrency_pair_id();
        SideDto side = this.surrogate.getSide();
        Side side2 = side != null ? (Side) side.toProto() : null;
        IdlDecimal quantity = this.surrogate.getQuantity();
        String stringValue = quantity != null ? quantity.getStringValue() : null;
        TypeDto order_type = this.surrogate.getOrder_type();
        Type type2 = order_type != null ? (Type) order_type.toProto() : null;
        IdlDecimal price = this.surrogate.getPrice();
        String stringValue2 = price != null ? price.getStringValue() : null;
        IdlDecimal limit_price = this.surrogate.getLimit_price();
        String stringValue3 = limit_price != null ? limit_price.getStringValue() : null;
        IdlDecimal stop_price = this.surrogate.getStop_price();
        String stringValue4 = stop_price != null ? stop_price.getStringValue() : null;
        FeeTypeDto fee_type = this.surrogate.getFee_type();
        FeeType feeType = fee_type != null ? (FeeType) fee_type.toProto() : null;
        String account_id = this.surrogate.getAccount_id();
        CurrencyTypeDto currency_type = this.surrogate.getCurrency_type();
        return new FeeEstimationRequest(currency_pair_id, side2, stringValue, type2, stringValue2, stringValue3, stringValue4, feeType, account_id, currency_type != null ? (CurrencyType) currency_type.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[FeeEstimationRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FeeEstimationRequestDto) && Intrinsics.areEqual(((FeeEstimationRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: FeeEstimationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b%\b\u0083\b\u0018\u0000 M2\u00020\u0001:\u0002NMB¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0019\b\u0002\u0010\r\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\u000e\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\u000f\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u007f\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010&R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b4\u00100\u001a\u0004\b2\u00103R1\u0010\n\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b<\u00100\u001a\u0004\b:\u0010;R1\u0010\r\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b>\u00100\u001a\u0004\b=\u00107R1\u0010\u000e\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\b@\u00100\u001a\u0004\b?\u00107R1\u0010\u000f\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00105\u0012\u0004\bB\u00100\u001a\u0004\bA\u00107R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010C\u0012\u0004\bF\u00100\u001a\u0004\bD\u0010ER\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010-\u0012\u0004\bH\u00100\u001a\u0004\bG\u0010&R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010I\u0012\u0004\bL\u00100\u001a\u0004\bJ\u0010K¨\u0006O"}, m3636d2 = {"Lnummus/v1/FeeEstimationRequestDto$Surrogate;", "", "", "currency_pair_id", "Lrosetta/nummus/order/SideDto;", "side", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "Lrosetta/nummus/order/TypeDto;", "order_type", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "limit_price", "stop_price", "Lrosetta/nummus/FeeTypeDto;", "fee_type", "account_id", "Lnummus/v1/CurrencyTypeDto;", "currency_type", "<init>", "(Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/order/TypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/FeeTypeDto;Ljava/lang/String;Lnummus/v1/CurrencyTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrosetta/nummus/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/order/TypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/FeeTypeDto;Ljava/lang/String;Lnummus/v1/CurrencyTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/FeeEstimationRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "()V", "Lrosetta/nummus/order/SideDto;", "getSide", "()Lrosetta/nummus/order/SideDto;", "getSide$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity$annotations", "Lrosetta/nummus/order/TypeDto;", "getOrder_type", "()Lrosetta/nummus/order/TypeDto;", "getOrder_type$annotations", "getPrice", "getPrice$annotations", "getLimit_price", "getLimit_price$annotations", "getStop_price", "getStop_price$annotations", "Lrosetta/nummus/FeeTypeDto;", "getFee_type", "()Lrosetta/nummus/FeeTypeDto;", "getFee_type$annotations", "getAccount_id", "getAccount_id$annotations", "Lnummus/v1/CurrencyTypeDto;", "getCurrency_type", "()Lnummus/v1/CurrencyTypeDto;", "getCurrency_type$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String currency_pair_id;
        private final CurrencyTypeDto currency_type;
        private final FeeTypeDto fee_type;
        private final IdlDecimal limit_price;
        private final TypeDto order_type;
        private final IdlDecimal price;
        private final IdlDecimal quantity;
        private final SideDto side;
        private final IdlDecimal stop_price;

        public Surrogate() {
            this((String) null, (SideDto) null, (IdlDecimal) null, (TypeDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (FeeTypeDto) null, (String) null, (CurrencyTypeDto) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && this.side == surrogate.side && Intrinsics.areEqual(this.quantity, surrogate.quantity) && this.order_type == surrogate.order_type && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.limit_price, surrogate.limit_price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && this.fee_type == surrogate.fee_type && Intrinsics.areEqual(this.account_id, surrogate.account_id) && this.currency_type == surrogate.currency_type;
        }

        public int hashCode() {
            int iHashCode = this.currency_pair_id.hashCode() * 31;
            SideDto sideDto = this.side;
            int iHashCode2 = (iHashCode + (sideDto == null ? 0 : sideDto.hashCode())) * 31;
            IdlDecimal idlDecimal = this.quantity;
            int iHashCode3 = (iHashCode2 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            TypeDto typeDto = this.order_type;
            int iHashCode4 = (iHashCode3 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.price;
            int iHashCode5 = (iHashCode4 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            IdlDecimal idlDecimal3 = this.limit_price;
            int iHashCode6 = (iHashCode5 + (idlDecimal3 == null ? 0 : idlDecimal3.hashCode())) * 31;
            IdlDecimal idlDecimal4 = this.stop_price;
            int iHashCode7 = (iHashCode6 + (idlDecimal4 == null ? 0 : idlDecimal4.hashCode())) * 31;
            FeeTypeDto feeTypeDto = this.fee_type;
            int iHashCode8 = (iHashCode7 + (feeTypeDto == null ? 0 : feeTypeDto.hashCode())) * 31;
            String str = this.account_id;
            int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
            CurrencyTypeDto currencyTypeDto = this.currency_type;
            return iHashCode9 + (currencyTypeDto != null ? currencyTypeDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(currency_pair_id=" + this.currency_pair_id + ", side=" + this.side + ", quantity=" + this.quantity + ", order_type=" + this.order_type + ", price=" + this.price + ", limit_price=" + this.limit_price + ", stop_price=" + this.stop_price + ", fee_type=" + this.fee_type + ", account_id=" + this.account_id + ", currency_type=" + this.currency_type + ")";
        }

        /* compiled from: FeeEstimationRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/FeeEstimationRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/FeeEstimationRequestDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FeeEstimationRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, SideDto sideDto, IdlDecimal idlDecimal, TypeDto typeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, FeeTypeDto feeTypeDto, String str2, CurrencyTypeDto currencyTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.currency_pair_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.side = null;
            } else {
                this.side = sideDto;
            }
            if ((i & 4) == 0) {
                this.quantity = null;
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.order_type = null;
            } else {
                this.order_type = typeDto;
            }
            if ((i & 16) == 0) {
                this.price = null;
            } else {
                this.price = idlDecimal2;
            }
            if ((i & 32) == 0) {
                this.limit_price = null;
            } else {
                this.limit_price = idlDecimal3;
            }
            if ((i & 64) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = idlDecimal4;
            }
            if ((i & 128) == 0) {
                this.fee_type = null;
            } else {
                this.fee_type = feeTypeDto;
            }
            if ((i & 256) == 0) {
                this.account_id = null;
            } else {
                this.account_id = str2;
            }
            if ((i & 512) == 0) {
                this.currency_type = null;
            } else {
                this.currency_type = currencyTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.currency_pair_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.currency_pair_id);
            }
            SideDto sideDto = self.side;
            if (sideDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SideDto.Serializer.INSTANCE, sideDto);
            }
            IdlDecimal idlDecimal = self.quantity;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            TypeDto typeDto = self.order_type;
            if (typeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TypeDto.Serializer.INSTANCE, typeDto);
            }
            IdlDecimal idlDecimal2 = self.price;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            IdlDecimal idlDecimal3 = self.limit_price;
            if (idlDecimal3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, idlDecimal3);
            }
            IdlDecimal idlDecimal4 = self.stop_price;
            if (idlDecimal4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, idlDecimal4);
            }
            FeeTypeDto feeTypeDto = self.fee_type;
            if (feeTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, FeeTypeDto.Serializer.INSTANCE, feeTypeDto);
            }
            String str = self.account_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str);
            }
            CurrencyTypeDto currencyTypeDto = self.currency_type;
            if (currencyTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, CurrencyTypeDto.Serializer.INSTANCE, currencyTypeDto);
            }
        }

        public Surrogate(String currency_pair_id, SideDto sideDto, IdlDecimal idlDecimal, TypeDto typeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, FeeTypeDto feeTypeDto, String str, CurrencyTypeDto currencyTypeDto) {
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            this.currency_pair_id = currency_pair_id;
            this.side = sideDto;
            this.quantity = idlDecimal;
            this.order_type = typeDto;
            this.price = idlDecimal2;
            this.limit_price = idlDecimal3;
            this.stop_price = idlDecimal4;
            this.fee_type = feeTypeDto;
            this.account_id = str;
            this.currency_type = currencyTypeDto;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, rosetta.nummus.order.SideDto r3, com.robinhood.idl.IdlDecimal r4, rosetta.nummus.order.TypeDto r5, com.robinhood.idl.IdlDecimal r6, com.robinhood.idl.IdlDecimal r7, com.robinhood.idl.IdlDecimal r8, rosetta.nummus.FeeTypeDto r9, java.lang.String r10, nummus.p512v1.CurrencyTypeDto r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r1 = this;
                r13 = r12 & 1
                if (r13 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r13 = r12 & 2
                r0 = 0
                if (r13 == 0) goto Lc
                r3 = r0
            Lc:
                r13 = r12 & 4
                if (r13 == 0) goto L11
                r4 = r0
            L11:
                r13 = r12 & 8
                if (r13 == 0) goto L16
                r5 = r0
            L16:
                r13 = r12 & 16
                if (r13 == 0) goto L1b
                r6 = r0
            L1b:
                r13 = r12 & 32
                if (r13 == 0) goto L20
                r7 = r0
            L20:
                r13 = r12 & 64
                if (r13 == 0) goto L25
                r8 = r0
            L25:
                r13 = r12 & 128(0x80, float:1.794E-43)
                if (r13 == 0) goto L2a
                r9 = r0
            L2a:
                r13 = r12 & 256(0x100, float:3.59E-43)
                if (r13 == 0) goto L2f
                r10 = r0
            L2f:
                r12 = r12 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L3f
                r13 = r0
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L4a
            L3f:
                r13 = r11
                r12 = r10
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L4a:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nummus.p512v1.FeeEstimationRequestDto.Surrogate.<init>(java.lang.String, rosetta.nummus.order.SideDto, com.robinhood.idl.IdlDecimal, rosetta.nummus.order.TypeDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, rosetta.nummus.FeeTypeDto, java.lang.String, nummus.v1.CurrencyTypeDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final TypeDto getOrder_type() {
            return this.order_type;
        }

        public final IdlDecimal getPrice() {
            return this.price;
        }

        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        public final FeeTypeDto getFee_type() {
            return this.fee_type;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final CurrencyTypeDto getCurrency_type() {
            return this.currency_type;
        }
    }

    /* compiled from: FeeEstimationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/FeeEstimationRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/FeeEstimationRequestDto;", "Lnummus/v1/FeeEstimationRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/FeeEstimationRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FeeEstimationRequestDto, FeeEstimationRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeeEstimationRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeEstimationRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeEstimationRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) FeeEstimationRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeeEstimationRequest> getProtoAdapter() {
            return FeeEstimationRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeEstimationRequestDto getZeroValue() {
            return FeeEstimationRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeEstimationRequestDto fromProto(FeeEstimationRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String currency_pair_id = proto.getCurrency_pair_id();
            Side side = proto.getSide();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SideDto sideDtoFromProto = side != null ? SideDto.INSTANCE.fromProto(side) : null;
            String quantity = proto.getQuantity();
            IdlDecimal idlDecimal = quantity != null ? new IdlDecimal(quantity) : null;
            Type order_type = proto.getOrder_type();
            TypeDto typeDtoFromProto = order_type != null ? TypeDto.INSTANCE.fromProto(order_type) : null;
            String price = proto.getPrice();
            IdlDecimal idlDecimal2 = price != null ? new IdlDecimal(price) : null;
            String limit_price = proto.getLimit_price();
            IdlDecimal idlDecimal3 = limit_price != null ? new IdlDecimal(limit_price) : null;
            String stop_price = proto.getStop_price();
            IdlDecimal idlDecimal4 = stop_price != null ? new IdlDecimal(stop_price) : null;
            FeeType fee_type = proto.getFee_type();
            FeeTypeDto feeTypeDtoFromProto = fee_type != null ? FeeTypeDto.INSTANCE.fromProto(fee_type) : null;
            String account_id = proto.getAccount_id();
            CurrencyType currency_type = proto.getCurrency_type();
            return new FeeEstimationRequestDto(new Surrogate(currency_pair_id, sideDtoFromProto, idlDecimal, typeDtoFromProto, idlDecimal2, idlDecimal3, idlDecimal4, feeTypeDtoFromProto, account_id, currency_type != null ? CurrencyTypeDto.INSTANCE.fromProto(currency_type) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.FeeEstimationRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeEstimationRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FeeEstimationRequestDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeeEstimationRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/FeeEstimationRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/FeeEstimationRequestDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/FeeEstimationRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<FeeEstimationRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.FeeEstimationRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeeEstimationRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FeeEstimationRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FeeEstimationRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FeeEstimationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/FeeEstimationRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "nummus.v1.FeeEstimationRequestDto";
        }
    }
}
