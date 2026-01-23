package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.OrderCancelReasonDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CancelFuturesOrderRequestDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto$Surrogate;)V", "order_id", "", "account_id", "cancel_reason", "Lcom/robinhood/ceres/v1/OrderCancelReasonDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderCancelReasonDto;)V", "getOrder_id", "()Ljava/lang/String;", "getAccount_id", "getCancel_reason", "()Lcom/robinhood/ceres/v1/OrderCancelReasonDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class CancelFuturesOrderRequestDto implements Dto3<CancelFuturesOrderRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CancelFuturesOrderRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CancelFuturesOrderRequestDto, CancelFuturesOrderRequest>> binaryBase64Serializer$delegate;
    private static final CancelFuturesOrderRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CancelFuturesOrderRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CancelFuturesOrderRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final OrderCancelReasonDto getCancel_reason() {
        return this.surrogate.getCancel_reason();
    }

    public /* synthetic */ CancelFuturesOrderRequestDto(String str, String str2, OrderCancelReasonDto orderCancelReasonDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : orderCancelReasonDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CancelFuturesOrderRequestDto(String order_id, String account_id, OrderCancelReasonDto orderCancelReasonDto) {
        this(new Surrogate(order_id, account_id, orderCancelReasonDto));
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
    }

    public static /* synthetic */ CancelFuturesOrderRequestDto copy$default(CancelFuturesOrderRequestDto cancelFuturesOrderRequestDto, String str, String str2, OrderCancelReasonDto orderCancelReasonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelFuturesOrderRequestDto.surrogate.getOrder_id();
        }
        if ((i & 2) != 0) {
            str2 = cancelFuturesOrderRequestDto.surrogate.getAccount_id();
        }
        if ((i & 4) != 0) {
            orderCancelReasonDto = cancelFuturesOrderRequestDto.surrogate.getCancel_reason();
        }
        return cancelFuturesOrderRequestDto.copy(str, str2, orderCancelReasonDto);
    }

    public final CancelFuturesOrderRequestDto copy(String order_id, String account_id, OrderCancelReasonDto cancel_reason) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        return new CancelFuturesOrderRequestDto(new Surrogate(order_id, account_id, cancel_reason));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CancelFuturesOrderRequest toProto() {
        String order_id = this.surrogate.getOrder_id();
        String account_id = this.surrogate.getAccount_id();
        OrderCancelReasonDto cancel_reason = this.surrogate.getCancel_reason();
        return new CancelFuturesOrderRequest(order_id, account_id, cancel_reason != null ? (OrderCancelReason) cancel_reason.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[CancelFuturesOrderRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CancelFuturesOrderRequestDto) && Intrinsics.areEqual(((CancelFuturesOrderRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CancelFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto$Surrogate;", "", "order_id", "", "account_id", "cancel_reason", "Lcom/robinhood/ceres/v1/OrderCancelReasonDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderCancelReasonDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderCancelReasonDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Ljava/lang/String;", "getAccount_id$annotations", "getAccount_id", "getCancel_reason$annotations", "getCancel_reason", "()Lcom/robinhood/ceres/v1/OrderCancelReasonDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final OrderCancelReasonDto cancel_reason;
        private final String order_id;

        public Surrogate() {
            this((String) null, (String) null, (OrderCancelReasonDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, OrderCancelReasonDto orderCancelReasonDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.order_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.account_id;
            }
            if ((i & 4) != 0) {
                orderCancelReasonDto = surrogate.cancel_reason;
            }
            return surrogate.copy(str, str2, orderCancelReasonDto);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("cancelReason")
        @JsonAnnotations2(names = {"cancel_reason"})
        public static /* synthetic */ void getCancel_reason$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderCancelReasonDto getCancel_reason() {
            return this.cancel_reason;
        }

        public final Surrogate copy(String order_id, String account_id, OrderCancelReasonDto cancel_reason) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            return new Surrogate(order_id, account_id, cancel_reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && this.cancel_reason == surrogate.cancel_reason;
        }

        public int hashCode() {
            int iHashCode = ((this.order_id.hashCode() * 31) + this.account_id.hashCode()) * 31;
            OrderCancelReasonDto orderCancelReasonDto = this.cancel_reason;
            return iHashCode + (orderCancelReasonDto == null ? 0 : orderCancelReasonDto.hashCode());
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", account_id=" + this.account_id + ", cancel_reason=" + this.cancel_reason + ")";
        }

        /* compiled from: CancelFuturesOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CancelFuturesOrderRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, OrderCancelReasonDto orderCancelReasonDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str;
            }
            if ((i & 2) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 4) == 0) {
                this.cancel_reason = null;
            } else {
                this.cancel_reason = orderCancelReasonDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.order_id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_id);
            }
            OrderCancelReasonDto orderCancelReasonDto = self.cancel_reason;
            if (orderCancelReasonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, OrderCancelReasonDto.Serializer.INSTANCE, orderCancelReasonDto);
            }
        }

        public Surrogate(String order_id, String account_id, OrderCancelReasonDto orderCancelReasonDto) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            this.order_id = order_id;
            this.account_id = account_id;
            this.cancel_reason = orderCancelReasonDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, OrderCancelReasonDto orderCancelReasonDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : orderCancelReasonDto);
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final OrderCancelReasonDto getCancel_reason() {
            return this.cancel_reason;
        }
    }

    /* compiled from: CancelFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto;", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CancelFuturesOrderRequestDto, CancelFuturesOrderRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CancelFuturesOrderRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CancelFuturesOrderRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CancelFuturesOrderRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CancelFuturesOrderRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CancelFuturesOrderRequest> getProtoAdapter() {
            return CancelFuturesOrderRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CancelFuturesOrderRequestDto getZeroValue() {
            return CancelFuturesOrderRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CancelFuturesOrderRequestDto fromProto(CancelFuturesOrderRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String order_id = proto.getOrder_id();
            String account_id = proto.getAccount_id();
            OrderCancelReason cancel_reason = proto.getCancel_reason();
            return new CancelFuturesOrderRequestDto(new Surrogate(order_id, account_id, cancel_reason != null ? OrderCancelReasonDto.INSTANCE.fromProto(cancel_reason) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.CancelFuturesOrderRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CancelFuturesOrderRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CancelFuturesOrderRequestDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CancelFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CancelFuturesOrderRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.CancelFuturesOrderRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CancelFuturesOrderRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CancelFuturesOrderRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CancelFuturesOrderRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CancelFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.CancelFuturesOrderRequestDto";
        }
    }
}
