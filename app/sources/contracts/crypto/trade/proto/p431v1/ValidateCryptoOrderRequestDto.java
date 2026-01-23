package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.BillingAccount;
import bff_money_movement.service.p019v1.BillingAccountDto;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.trade.proto.p431v1.OrderPricesDto;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderRequest;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderRequestDto;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rosetta.nummus.CurrencyPair;
import rosetta.nummus.CurrencyPairDto;
import rosetta.nummus.MonetizationModel;
import rosetta.nummus.MonetizationModelDto;
import rosetta.order.InitiatorType;
import rosetta.order.InitiatorTypeDto;

/* compiled from: ValidateCryptoOrderRequestDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006$#%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006)"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;", "order_context", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;", "validation_source", "", "acknowledge_id", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;Ljava/lang/String;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$Surrogate;", "Companion", "Surrogate", "OrderContextDto", "ValidationSourceDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class ValidateCryptoOrderRequestDto implements Dto3<ValidateCryptoOrderRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ValidateCryptoOrderRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ValidateCryptoOrderRequestDto, ValidateCryptoOrderRequest>> binaryBase64Serializer$delegate;
    private static final ValidateCryptoOrderRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ValidateCryptoOrderRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ValidateCryptoOrderRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ ValidateCryptoOrderRequestDto(OrderContextDto orderContextDto, ValidationSourceDto validationSourceDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderContextDto, (i & 2) != 0 ? null : validationSourceDto, (i & 4) != 0 ? null : str);
    }

    public ValidateCryptoOrderRequestDto(OrderContextDto orderContextDto, ValidationSourceDto validationSourceDto, String str) {
        this(new Surrogate(orderContextDto, validationSourceDto, str));
    }

    @Override // com.robinhood.idl.Dto
    public ValidateCryptoOrderRequest toProto() {
        OrderContextDto order_context = this.surrogate.getOrder_context();
        ValidateCryptoOrderRequest.OrderContext proto = order_context != null ? order_context.toProto() : null;
        ValidationSourceDto validation_source = this.surrogate.getValidation_source();
        return new ValidateCryptoOrderRequest(proto, validation_source != null ? validation_source.toProto() : null, this.surrogate.getAcknowledge_id(), null, 8, null);
    }

    public String toString() {
        return "[ValidateCryptoOrderRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ValidateCryptoOrderRequestDto) && Intrinsics.areEqual(((ValidateCryptoOrderRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: ValidateCryptoOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010\u0019¨\u0006."}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;", "order_context", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;", "validation_source", "", "acknowledge_id", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;", "getOrder_context", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;", "getOrder_context$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;", "getValidation_source", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;", "getValidation_source$annotations", "Ljava/lang/String;", "getAcknowledge_id", "getAcknowledge_id$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String acknowledge_id;
        private final OrderContextDto order_context;
        private final ValidationSourceDto validation_source;

        public Surrogate() {
            this((OrderContextDto) null, (ValidationSourceDto) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_context, surrogate.order_context) && Intrinsics.areEqual(this.validation_source, surrogate.validation_source) && Intrinsics.areEqual(this.acknowledge_id, surrogate.acknowledge_id);
        }

        public int hashCode() {
            OrderContextDto orderContextDto = this.order_context;
            int iHashCode = (orderContextDto == null ? 0 : orderContextDto.hashCode()) * 31;
            ValidationSourceDto validationSourceDto = this.validation_source;
            int iHashCode2 = (iHashCode + (validationSourceDto == null ? 0 : validationSourceDto.hashCode())) * 31;
            String str = this.acknowledge_id;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(order_context=" + this.order_context + ", validation_source=" + this.validation_source + ", acknowledge_id=" + this.acknowledge_id + ")";
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ValidateCryptoOrderRequestDto$Surrogate$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, OrderContextDto orderContextDto, ValidationSourceDto validationSourceDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_context = null;
            } else {
                this.order_context = orderContextDto;
            }
            if ((i & 2) == 0) {
                this.validation_source = null;
            } else {
                this.validation_source = validationSourceDto;
            }
            if ((i & 4) == 0) {
                this.acknowledge_id = null;
            } else {
                this.acknowledge_id = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            OrderContextDto orderContextDto = self.order_context;
            if (orderContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, OrderContextDto.Serializer.INSTANCE, orderContextDto);
            }
            ValidationSourceDto validationSourceDto = self.validation_source;
            if (validationSourceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ValidationSourceDto.Serializer.INSTANCE, validationSourceDto);
            }
            String str = self.acknowledge_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(OrderContextDto orderContextDto, ValidationSourceDto validationSourceDto, String str) {
            this.order_context = orderContextDto;
            this.validation_source = validationSourceDto;
            this.acknowledge_id = str;
        }

        public /* synthetic */ Surrogate(OrderContextDto orderContextDto, ValidationSourceDto validationSourceDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : orderContextDto, (i & 2) != 0 ? null : validationSourceDto, (i & 4) != 0 ? null : str);
        }

        public final OrderContextDto getOrder_context() {
            return this.order_context;
        }

        public final ValidationSourceDto getValidation_source() {
            return this.validation_source;
        }

        public final String getAcknowledge_id() {
            return this.acknowledge_id;
        }
    }

    /* compiled from: ValidateCryptoOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ValidateCryptoOrderRequestDto, ValidateCryptoOrderRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ValidateCryptoOrderRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateCryptoOrderRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateCryptoOrderRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) ValidateCryptoOrderRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ValidateCryptoOrderRequest> getProtoAdapter() {
            return ValidateCryptoOrderRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateCryptoOrderRequestDto getZeroValue() {
            return ValidateCryptoOrderRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateCryptoOrderRequestDto fromProto(ValidateCryptoOrderRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ValidateCryptoOrderRequest.OrderContext order_context = proto.getOrder_context();
            DefaultConstructorMarker defaultConstructorMarker = null;
            OrderContextDto orderContextDtoFromProto = order_context != null ? OrderContextDto.INSTANCE.fromProto(order_context) : null;
            ValidateCryptoOrderRequest.ValidationSource validation_source = proto.getValidation_source();
            return new ValidateCryptoOrderRequestDto(new Surrogate(orderContextDtoFromProto, validation_source != null ? ValidationSourceDto.INSTANCE.fromProto(validation_source) : null, proto.getAcknowledge_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValidateCryptoOrderRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ValidateCryptoOrderRequestDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ValidateCryptoOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\t32456789:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0087\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0006\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b0\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101¨\u0006;"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;", "order_side", "", "has_crypto_account", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;", "quote", "Lcontracts/crypto/trade/proto/v1/OrderPricesDto;", "order_prices", "Lrosetta/nummus/CurrencyPairDto;", Content.MarketIndicator.CRYPTO_TYPE, "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;", "user_inputs", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;", "order_info", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;", "account_info", "has_seen_pdt_warning", "Lrosetta/order/InitiatorTypeDto;", "initiator_type", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;ZLcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;Lcontracts/crypto/trade/proto/v1/OrderPricesDto;Lrosetta/nummus/CurrencyPairDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;Lrosetta/nummus/MonetizationModelDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;ZLrosetta/order/InitiatorTypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$Surrogate;", "Companion", "Surrogate", "OrderSideDto", "QuoteDto", "UserInputsDto", "OrderInfoDto", "AccountInfoDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderContextDto implements Dto3<ValidateCryptoOrderRequest.OrderContext>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<OrderContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderContextDto, ValidateCryptoOrderRequest.OrderContext>> binaryBase64Serializer$delegate;
        private static final OrderContextDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ OrderContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OrderContextDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public /* synthetic */ OrderContextDto(OrderSideDto orderSideDto, boolean z, QuoteDto quoteDto, OrderPricesDto orderPricesDto, CurrencyPairDto currencyPairDto, UserInputsDto userInputsDto, OrderInfoDto orderInfoDto, MonetizationModelDto monetizationModelDto, AccountInfoDto accountInfoDto, boolean z2, InitiatorTypeDto initiatorTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : orderSideDto, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : quoteDto, (i & 8) != 0 ? null : orderPricesDto, (i & 16) != 0 ? null : currencyPairDto, (i & 32) != 0 ? null : userInputsDto, (i & 64) != 0 ? null : orderInfoDto, (i & 128) != 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto, (i & 256) != 0 ? null : accountInfoDto, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : initiatorTypeDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OrderContextDto(OrderSideDto orderSideDto, boolean z, QuoteDto quoteDto, OrderPricesDto orderPricesDto, CurrencyPairDto currencyPairDto, UserInputsDto userInputsDto, OrderInfoDto orderInfoDto, MonetizationModelDto monetization_model, AccountInfoDto accountInfoDto, boolean z2, InitiatorTypeDto initiatorTypeDto) {
            this(new Surrogate(orderSideDto, z, quoteDto, orderPricesDto, currencyPairDto, userInputsDto, orderInfoDto, monetization_model, accountInfoDto, z2, initiatorTypeDto));
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public ValidateCryptoOrderRequest.OrderContext toProto() {
            OrderSideDto order_side = this.surrogate.getOrder_side();
            ValidateCryptoOrderRequest.OrderContext.OrderSide proto = order_side != null ? order_side.toProto() : null;
            boolean has_crypto_account = this.surrogate.getHas_crypto_account();
            QuoteDto quote = this.surrogate.getQuote();
            ValidateCryptoOrderRequest.OrderContext.Quote proto2 = quote != null ? quote.toProto() : null;
            OrderPricesDto order_prices = this.surrogate.getOrder_prices();
            OrderPrices proto3 = order_prices != null ? order_prices.toProto() : null;
            CurrencyPairDto currency_pair = this.surrogate.getCurrency_pair();
            CurrencyPair proto4 = currency_pair != null ? currency_pair.toProto() : null;
            UserInputsDto user_inputs = this.surrogate.getUser_inputs();
            ValidateCryptoOrderRequest.OrderContext.UserInputs proto5 = user_inputs != null ? user_inputs.toProto() : null;
            OrderInfoDto order_info = this.surrogate.getOrder_info();
            ValidateCryptoOrderRequest.OrderContext.OrderInfo proto6 = order_info != null ? order_info.toProto() : null;
            MonetizationModel monetizationModel = (MonetizationModel) this.surrogate.getMonetization_model().toProto();
            AccountInfoDto account_info = this.surrogate.getAccount_info();
            ValidateCryptoOrderRequest.OrderContext.AccountInfo proto7 = account_info != null ? account_info.toProto() : null;
            boolean has_seen_pdt_warning = this.surrogate.getHas_seen_pdt_warning();
            InitiatorTypeDto initiator_type = this.surrogate.getInitiator_type();
            return new ValidateCryptoOrderRequest.OrderContext(proto, has_crypto_account, proto2, proto3, proto4, proto5, proto6, monetizationModel, proto7, has_seen_pdt_warning, initiator_type != null ? (InitiatorType) initiator_type.toProto() : null, null, 2048, null);
        }

        public String toString() {
            return "[OrderContextDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof OrderContextDto) && Intrinsics.areEqual(((OrderContextDto) other).surrogate, this.surrogate);
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
        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b5\b\u0083\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZB\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0085\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b7\u00103\u001a\u0004\b5\u00106R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010:R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b?\u00103\u001a\u0004\b=\u0010>R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bC\u00103\u001a\u0004\bA\u0010BR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bG\u00103\u001a\u0004\bE\u0010FR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bK\u00103\u001a\u0004\bI\u0010JR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010L\u0012\u0004\bO\u00103\u001a\u0004\bM\u0010NR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010P\u0012\u0004\bS\u00103\u001a\u0004\bQ\u0010RR \u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00104\u0012\u0004\bU\u00103\u001a\u0004\bT\u00106R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010V\u0012\u0004\bY\u00103\u001a\u0004\bW\u0010X¨\u0006\\"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;", "order_side", "", "has_crypto_account", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;", "quote", "Lcontracts/crypto/trade/proto/v1/OrderPricesDto;", "order_prices", "Lrosetta/nummus/CurrencyPairDto;", Content.MarketIndicator.CRYPTO_TYPE, "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;", "user_inputs", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;", "order_info", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;", "account_info", "has_seen_pdt_warning", "Lrosetta/order/InitiatorTypeDto;", "initiator_type", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;ZLcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;Lcontracts/crypto/trade/proto/v1/OrderPricesDto;Lrosetta/nummus/CurrencyPairDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;Lrosetta/nummus/MonetizationModelDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;ZLrosetta/order/InitiatorTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;ZLcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;Lcontracts/crypto/trade/proto/v1/OrderPricesDto;Lrosetta/nummus/CurrencyPairDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;Lrosetta/nummus/MonetizationModelDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;ZLrosetta/order/InitiatorTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;", "getOrder_side", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;", "getOrder_side$annotations", "()V", "Z", "getHas_crypto_account", "()Z", "getHas_crypto_account$annotations", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;", "getQuote", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;", "getQuote$annotations", "Lcontracts/crypto/trade/proto/v1/OrderPricesDto;", "getOrder_prices", "()Lcontracts/crypto/trade/proto/v1/OrderPricesDto;", "getOrder_prices$annotations", "Lrosetta/nummus/CurrencyPairDto;", "getCurrency_pair", "()Lrosetta/nummus/CurrencyPairDto;", "getCurrency_pair$annotations", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;", "getUser_inputs", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;", "getUser_inputs$annotations", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;", "getOrder_info", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;", "getOrder_info$annotations", "Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model$annotations", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;", "getAccount_info", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;", "getAccount_info$annotations", "getHas_seen_pdt_warning", "getHas_seen_pdt_warning$annotations", "Lrosetta/order/InitiatorTypeDto;", "getInitiator_type", "()Lrosetta/order/InitiatorTypeDto;", "getInitiator_type$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final AccountInfoDto account_info;
            private final CurrencyPairDto currency_pair;
            private final boolean has_crypto_account;
            private final boolean has_seen_pdt_warning;
            private final InitiatorTypeDto initiator_type;
            private final MonetizationModelDto monetization_model;
            private final OrderInfoDto order_info;
            private final OrderPricesDto order_prices;
            private final OrderSideDto order_side;
            private final QuoteDto quote;
            private final UserInputsDto user_inputs;

            public Surrogate() {
                this((OrderSideDto) null, false, (QuoteDto) null, (OrderPricesDto) null, (CurrencyPairDto) null, (UserInputsDto) null, (OrderInfoDto) null, (MonetizationModelDto) null, (AccountInfoDto) null, false, (InitiatorTypeDto) null, 2047, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.order_side, surrogate.order_side) && this.has_crypto_account == surrogate.has_crypto_account && Intrinsics.areEqual(this.quote, surrogate.quote) && Intrinsics.areEqual(this.order_prices, surrogate.order_prices) && Intrinsics.areEqual(this.currency_pair, surrogate.currency_pair) && Intrinsics.areEqual(this.user_inputs, surrogate.user_inputs) && Intrinsics.areEqual(this.order_info, surrogate.order_info) && this.monetization_model == surrogate.monetization_model && Intrinsics.areEqual(this.account_info, surrogate.account_info) && this.has_seen_pdt_warning == surrogate.has_seen_pdt_warning && this.initiator_type == surrogate.initiator_type;
            }

            public int hashCode() {
                OrderSideDto orderSideDto = this.order_side;
                int iHashCode = (((orderSideDto == null ? 0 : orderSideDto.hashCode()) * 31) + Boolean.hashCode(this.has_crypto_account)) * 31;
                QuoteDto quoteDto = this.quote;
                int iHashCode2 = (iHashCode + (quoteDto == null ? 0 : quoteDto.hashCode())) * 31;
                OrderPricesDto orderPricesDto = this.order_prices;
                int iHashCode3 = (iHashCode2 + (orderPricesDto == null ? 0 : orderPricesDto.hashCode())) * 31;
                CurrencyPairDto currencyPairDto = this.currency_pair;
                int iHashCode4 = (iHashCode3 + (currencyPairDto == null ? 0 : currencyPairDto.hashCode())) * 31;
                UserInputsDto userInputsDto = this.user_inputs;
                int iHashCode5 = (iHashCode4 + (userInputsDto == null ? 0 : userInputsDto.hashCode())) * 31;
                OrderInfoDto orderInfoDto = this.order_info;
                int iHashCode6 = (((iHashCode5 + (orderInfoDto == null ? 0 : orderInfoDto.hashCode())) * 31) + this.monetization_model.hashCode()) * 31;
                AccountInfoDto accountInfoDto = this.account_info;
                int iHashCode7 = (((iHashCode6 + (accountInfoDto == null ? 0 : accountInfoDto.hashCode())) * 31) + Boolean.hashCode(this.has_seen_pdt_warning)) * 31;
                InitiatorTypeDto initiatorTypeDto = this.initiator_type;
                return iHashCode7 + (initiatorTypeDto != null ? initiatorTypeDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(order_side=" + this.order_side + ", has_crypto_account=" + this.has_crypto_account + ", quote=" + this.quote + ", order_prices=" + this.order_prices + ", currency_pair=" + this.currency_pair + ", user_inputs=" + this.user_inputs + ", order_info=" + this.order_info + ", monetization_model=" + this.monetization_model + ", account_info=" + this.account_info + ", has_seen_pdt_warning=" + this.has_seen_pdt_warning + ", initiator_type=" + this.initiator_type + ")";
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C44042x51c6e567.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, OrderSideDto orderSideDto, boolean z, QuoteDto quoteDto, OrderPricesDto orderPricesDto, CurrencyPairDto currencyPairDto, UserInputsDto userInputsDto, OrderInfoDto orderInfoDto, MonetizationModelDto monetizationModelDto, AccountInfoDto accountInfoDto, boolean z2, InitiatorTypeDto initiatorTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.order_side = null;
                } else {
                    this.order_side = orderSideDto;
                }
                if ((i & 2) == 0) {
                    this.has_crypto_account = false;
                } else {
                    this.has_crypto_account = z;
                }
                if ((i & 4) == 0) {
                    this.quote = null;
                } else {
                    this.quote = quoteDto;
                }
                if ((i & 8) == 0) {
                    this.order_prices = null;
                } else {
                    this.order_prices = orderPricesDto;
                }
                if ((i & 16) == 0) {
                    this.currency_pair = null;
                } else {
                    this.currency_pair = currencyPairDto;
                }
                if ((i & 32) == 0) {
                    this.user_inputs = null;
                } else {
                    this.user_inputs = userInputsDto;
                }
                if ((i & 64) == 0) {
                    this.order_info = null;
                } else {
                    this.order_info = orderInfoDto;
                }
                if ((i & 128) == 0) {
                    this.monetization_model = MonetizationModelDto.INSTANCE.getZeroValue();
                } else {
                    this.monetization_model = monetizationModelDto;
                }
                if ((i & 256) == 0) {
                    this.account_info = null;
                } else {
                    this.account_info = accountInfoDto;
                }
                if ((i & 512) == 0) {
                    this.has_seen_pdt_warning = false;
                } else {
                    this.has_seen_pdt_warning = z2;
                }
                if ((i & 1024) == 0) {
                    this.initiator_type = null;
                } else {
                    this.initiator_type = initiatorTypeDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                OrderSideDto orderSideDto = self.order_side;
                if (orderSideDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, OrderSideDto.Serializer.INSTANCE, orderSideDto);
                }
                boolean z = self.has_crypto_account;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 1, z);
                }
                QuoteDto quoteDto = self.quote;
                if (quoteDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, QuoteDto.Serializer.INSTANCE, quoteDto);
                }
                OrderPricesDto orderPricesDto = self.order_prices;
                if (orderPricesDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, OrderPricesDto.Serializer.INSTANCE, orderPricesDto);
                }
                CurrencyPairDto currencyPairDto = self.currency_pair;
                if (currencyPairDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, CurrencyPairDto.Serializer.INSTANCE, currencyPairDto);
                }
                UserInputsDto userInputsDto = self.user_inputs;
                if (userInputsDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 5, UserInputsDto.Serializer.INSTANCE, userInputsDto);
                }
                OrderInfoDto orderInfoDto = self.order_info;
                if (orderInfoDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 6, OrderInfoDto.Serializer.INSTANCE, orderInfoDto);
                }
                if (self.monetization_model != MonetizationModelDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 7, MonetizationModelDto.Serializer.INSTANCE, self.monetization_model);
                }
                AccountInfoDto accountInfoDto = self.account_info;
                if (accountInfoDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 8, AccountInfoDto.Serializer.INSTANCE, accountInfoDto);
                }
                boolean z2 = self.has_seen_pdt_warning;
                if (z2) {
                    output.encodeBooleanElement(serialDesc, 9, z2);
                }
                InitiatorTypeDto initiatorTypeDto = self.initiator_type;
                if (initiatorTypeDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 10, InitiatorTypeDto.Serializer.INSTANCE, initiatorTypeDto);
                }
            }

            public Surrogate(OrderSideDto orderSideDto, boolean z, QuoteDto quoteDto, OrderPricesDto orderPricesDto, CurrencyPairDto currencyPairDto, UserInputsDto userInputsDto, OrderInfoDto orderInfoDto, MonetizationModelDto monetization_model, AccountInfoDto accountInfoDto, boolean z2, InitiatorTypeDto initiatorTypeDto) {
                Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
                this.order_side = orderSideDto;
                this.has_crypto_account = z;
                this.quote = quoteDto;
                this.order_prices = orderPricesDto;
                this.currency_pair = currencyPairDto;
                this.user_inputs = userInputsDto;
                this.order_info = orderInfoDto;
                this.monetization_model = monetization_model;
                this.account_info = accountInfoDto;
                this.has_seen_pdt_warning = z2;
                this.initiator_type = initiatorTypeDto;
            }

            public final OrderSideDto getOrder_side() {
                return this.order_side;
            }

            public final boolean getHas_crypto_account() {
                return this.has_crypto_account;
            }

            public final QuoteDto getQuote() {
                return this.quote;
            }

            public final OrderPricesDto getOrder_prices() {
                return this.order_prices;
            }

            public final CurrencyPairDto getCurrency_pair() {
                return this.currency_pair;
            }

            public final UserInputsDto getUser_inputs() {
                return this.user_inputs;
            }

            public final OrderInfoDto getOrder_info() {
                return this.order_info;
            }

            public final MonetizationModelDto getMonetization_model() {
                return this.monetization_model;
            }

            public /* synthetic */ Surrogate(OrderSideDto orderSideDto, boolean z, QuoteDto quoteDto, OrderPricesDto orderPricesDto, CurrencyPairDto currencyPairDto, UserInputsDto userInputsDto, OrderInfoDto orderInfoDto, MonetizationModelDto monetizationModelDto, AccountInfoDto accountInfoDto, boolean z2, InitiatorTypeDto initiatorTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : orderSideDto, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : quoteDto, (i & 8) != 0 ? null : orderPricesDto, (i & 16) != 0 ? null : currencyPairDto, (i & 32) != 0 ? null : userInputsDto, (i & 64) != 0 ? null : orderInfoDto, (i & 128) != 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto, (i & 256) != 0 ? null : accountInfoDto, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : initiatorTypeDto);
            }

            public final AccountInfoDto getAccount_info() {
                return this.account_info;
            }

            public final boolean getHas_seen_pdt_warning() {
                return this.has_seen_pdt_warning;
            }

            public final InitiatorTypeDto getInitiator_type() {
                return this.initiator_type;
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<OrderContextDto, ValidateCryptoOrderRequest.OrderContext> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderContextDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderContextDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderContextDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderContextDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext> getProtoAdapter() {
                return ValidateCryptoOrderRequest.OrderContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderContextDto getZeroValue() {
                return OrderContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderContextDto fromProto(ValidateCryptoOrderRequest.OrderContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                ValidateCryptoOrderRequest.OrderContext.OrderSide order_side = proto.getOrder_side();
                DefaultConstructorMarker defaultConstructorMarker = null;
                OrderSideDto orderSideDtoFromProto = order_side != null ? OrderSideDto.INSTANCE.fromProto(order_side) : null;
                boolean has_crypto_account = proto.getHas_crypto_account();
                ValidateCryptoOrderRequest.OrderContext.Quote quote = proto.getQuote();
                QuoteDto quoteDtoFromProto = quote != null ? QuoteDto.INSTANCE.fromProto(quote) : null;
                OrderPrices order_prices = proto.getOrder_prices();
                OrderPricesDto orderPricesDtoFromProto = order_prices != null ? OrderPricesDto.INSTANCE.fromProto(order_prices) : null;
                CurrencyPair currency_pair = proto.getCurrency_pair();
                CurrencyPairDto currencyPairDtoFromProto = currency_pair != null ? CurrencyPairDto.INSTANCE.fromProto(currency_pair) : null;
                ValidateCryptoOrderRequest.OrderContext.UserInputs user_inputs = proto.getUser_inputs();
                UserInputsDto userInputsDtoFromProto = user_inputs != null ? UserInputsDto.INSTANCE.fromProto(user_inputs) : null;
                ValidateCryptoOrderRequest.OrderContext.OrderInfo order_info = proto.getOrder_info();
                OrderInfoDto orderInfoDtoFromProto = order_info != null ? OrderInfoDto.INSTANCE.fromProto(order_info) : null;
                MonetizationModelDto monetizationModelDtoFromProto = MonetizationModelDto.INSTANCE.fromProto(proto.getMonetization_model());
                ValidateCryptoOrderRequest.OrderContext.AccountInfo account_info = proto.getAccount_info();
                AccountInfoDto accountInfoDtoFromProto = account_info != null ? AccountInfoDto.INSTANCE.fromProto(account_info) : null;
                boolean has_seen_pdt_warning = proto.getHas_seen_pdt_warning();
                InitiatorType initiator_type = proto.getInitiator_type();
                return new OrderContextDto(new Surrogate(orderSideDtoFromProto, has_crypto_account, quoteDtoFromProto, orderPricesDtoFromProto, currencyPairDtoFromProto, userInputsDtoFromProto, orderInfoDtoFromProto, monetizationModelDtoFromProto, accountInfoDtoFromProto, has_seen_pdt_warning, initiator_type != null ? InitiatorTypeDto.INSTANCE.fromProto(initiator_type) : null), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ValidateCryptoOrderRequestDto.OrderContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new OrderContextDto(null, false, null, null, null, null, null, null, null, false, null, 2047, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007! \"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto;", "type", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "BuyDto", "SellDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class OrderSideDto implements Dto3<ValidateCryptoOrderRequest.OrderContext.OrderSide>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<OrderSideDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<OrderSideDto, ValidateCryptoOrderRequest.OrderContext.OrderSide>> binaryBase64Serializer$delegate;
            private static final OrderSideDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ OrderSideDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private OrderSideDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public OrderSideDto(TypeDto typeDto) {
                TypeDto.Buy buy = typeDto instanceof TypeDto.Buy ? (TypeDto.Buy) typeDto : null;
                BuyDto value = buy != null ? buy.getValue() : null;
                TypeDto.Sell sell = typeDto instanceof TypeDto.Sell ? (TypeDto.Sell) typeDto : null;
                this(new Surrogate(value, sell != null ? sell.getValue() : null));
            }

            public /* synthetic */ OrderSideDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : typeDto);
            }

            @Override // com.robinhood.idl.Dto
            public ValidateCryptoOrderRequest.OrderContext.OrderSide toProto() {
                BuyDto buy = this.surrogate.getBuy();
                ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy proto = buy != null ? buy.toProto() : null;
                SellDto sell = this.surrogate.getSell();
                return new ValidateCryptoOrderRequest.OrderContext.OrderSide(proto, sell != null ? sell.toProto() : null, null, 4, null);
            }

            public String toString() {
                return "[OrderSideDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof OrderSideDto) && Intrinsics.areEqual(((OrderSideDto) other).surrogate, this.surrogate);
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
            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;", "buy", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;", "sell", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;", "getBuy", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;", "getBuy$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;", "getSell", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;", "getSell$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final BuyDto buy;
                private final SellDto sell;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((BuyDto) null, (SellDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.buy, surrogate.buy) && Intrinsics.areEqual(this.sell, surrogate.sell);
                }

                public int hashCode() {
                    BuyDto buyDto = this.buy;
                    int iHashCode = (buyDto == null ? 0 : buyDto.hashCode()) * 31;
                    SellDto sellDto = this.sell;
                    return iHashCode + (sellDto != null ? sellDto.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(buy=" + this.buy + ", sell=" + this.sell + ")";
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C44039x5a937023.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, BuyDto buyDto, SellDto sellDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.buy = null;
                    } else {
                        this.buy = buyDto;
                    }
                    if ((i & 2) == 0) {
                        this.sell = null;
                    } else {
                        this.sell = sellDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    BuyDto buyDto = self.buy;
                    if (buyDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, BuyDto.Serializer.INSTANCE, buyDto);
                    }
                    SellDto sellDto = self.sell;
                    if (sellDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, SellDto.Serializer.INSTANCE, sellDto);
                    }
                }

                public Surrogate(BuyDto buyDto, SellDto sellDto) {
                    this.buy = buyDto;
                    this.sell = sellDto;
                }

                public /* synthetic */ Surrogate(BuyDto buyDto, SellDto sellDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : buyDto, (i & 2) != 0 ? null : sellDto);
                }

                public final BuyDto getBuy() {
                    return this.buy;
                }

                public final SellDto getSell() {
                    return this.sell;
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<OrderSideDto, ValidateCryptoOrderRequest.OrderContext.OrderSide> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<OrderSideDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<OrderSideDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<OrderSideDto> getBinaryBase64Serializer() {
                    return (KSerializer) OrderSideDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.OrderSide> getProtoAdapter() {
                    return ValidateCryptoOrderRequest.OrderContext.OrderSide.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public OrderSideDto getZeroValue() {
                    return OrderSideDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public OrderSideDto fromProto(ValidateCryptoOrderRequest.OrderContext.OrderSide proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy buy = proto.getBuy();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    BuyDto buyDtoFromProto = buy != null ? BuyDto.INSTANCE.fromProto(buy) : null;
                    ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell sell = proto.getSell();
                    return new OrderSideDto(new Surrogate(buyDtoFromProto, sell != null ? SellDto.INSTANCE.fromProto(sell) : null), defaultConstructorMarker);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.OrderContextDto.OrderSideDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new OrderSideDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Buy", "Sell", "Companion", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto$Buy;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto$Sell;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @RhGenerated
            public static abstract class TypeDto implements Dto4 {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private TypeDto() {
                }

                @Override // com.robinhood.idl.Dto
                public Void toProto() {
                    return Dto4.DefaultImpls.toProto(this);
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto$Buy;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class Buy extends TypeDto {
                    private final BuyDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Buy) && Intrinsics.areEqual(this.value, ((Buy) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Buy(value=" + this.value + ")";
                    }

                    public final BuyDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Buy(BuyDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto$Sell;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class Sell extends TypeDto {
                    private final SellDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Sell) && Intrinsics.areEqual(this.value, ((Sell) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Sell(value=" + this.value + ")";
                    }

                    public final SellDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Sell(SellDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto4.Creator<TypeDto, ValidateCryptoOrderRequest.OrderContext.OrderSide> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public Void getZeroValue() {
                        return Dto4.Creator.DefaultImpls.getZeroValue(this);
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.OrderSide> getProtoAdapter() {
                        return ValidateCryptoOrderRequest.OrderContext.OrderSide.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public TypeDto fromProto(ValidateCryptoOrderRequest.OrderContext.OrderSide proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        if (proto.getBuy() != null) {
                            return new Buy(BuyDto.INSTANCE.fromProto(proto.getBuy()));
                        }
                        if (proto.getSell() != null) {
                            return new Sell(SellDto.INSTANCE.fromProto(proto.getSell()));
                        }
                        return null;
                    }
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Buy;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "buying_power", "quantity_available", "Lbff_money_movement/service/v1/BillingAccountDto;", "payment_method", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lbff_money_movement/service/v1/BillingAccountDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Buy;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class BuyDto implements Dto3<ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<BuyDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<BuyDto, ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy>> binaryBase64Serializer$delegate;
                private static final BuyDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ BuyDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private BuyDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public /* synthetic */ BuyDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, BillingAccountDto billingAccountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : idlDecimal2, (i & 4) != 0 ? null : billingAccountDto);
                }

                public BuyDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, BillingAccountDto billingAccountDto) {
                    this(new Surrogate(idlDecimal, idlDecimal2, billingAccountDto));
                }

                @Override // com.robinhood.idl.Dto
                public ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy toProto() {
                    IdlDecimal buying_power = this.surrogate.getBuying_power();
                    String stringValue = buying_power != null ? buying_power.getStringValue() : null;
                    IdlDecimal quantity_available = this.surrogate.getQuantity_available();
                    String stringValue2 = quantity_available != null ? quantity_available.getStringValue() : null;
                    BillingAccountDto payment_method = this.surrogate.getPayment_method();
                    return new ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy(stringValue, stringValue2, payment_method != null ? payment_method.toProto() : null, null, 8, null);
                }

                public String toString() {
                    return "[BuyDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof BuyDto) && Intrinsics.areEqual(((BuyDto) other).surrogate, this.surrogate);
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
                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.BI\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB9\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R1\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b-\u0010'\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "buying_power", "quantity_available", "Lbff_money_movement/service/v1/BillingAccountDto;", "payment_method", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lbff_money_movement/service/v1/BillingAccountDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lbff_money_movement/service/v1/BillingAccountDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getBuying_power", "()Lcom/robinhood/idl/IdlDecimal;", "getBuying_power$annotations", "()V", "getQuantity_available", "getQuantity_available$annotations", "Lbff_money_movement/service/v1/BillingAccountDto;", "getPayment_method", "()Lbff_money_movement/service/v1/BillingAccountDto;", "getPayment_method$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final IdlDecimal buying_power;
                    private final BillingAccountDto payment_method;
                    private final IdlDecimal quantity_available;

                    public Surrogate() {
                        this((IdlDecimal) null, (IdlDecimal) null, (BillingAccountDto) null, 7, (DefaultConstructorMarker) null);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.buying_power, surrogate.buying_power) && Intrinsics.areEqual(this.quantity_available, surrogate.quantity_available) && Intrinsics.areEqual(this.payment_method, surrogate.payment_method);
                    }

                    public int hashCode() {
                        IdlDecimal idlDecimal = this.buying_power;
                        int iHashCode = (idlDecimal == null ? 0 : idlDecimal.hashCode()) * 31;
                        IdlDecimal idlDecimal2 = this.quantity_available;
                        int iHashCode2 = (iHashCode + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
                        BillingAccountDto billingAccountDto = this.payment_method;
                        return iHashCode2 + (billingAccountDto != null ? billingAccountDto.hashCode() : 0);
                    }

                    public String toString() {
                        return "Surrogate(buying_power=" + this.buying_power + ", quantity_available=" + this.quantity_available + ", payment_method=" + this.payment_method + ")";
                    }

                    /* compiled from: ValidateCryptoOrderRequestDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C44036x244c3e86.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, BillingAccountDto billingAccountDto, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.buying_power = null;
                        } else {
                            this.buying_power = idlDecimal;
                        }
                        if ((i & 2) == 0) {
                            this.quantity_available = null;
                        } else {
                            this.quantity_available = idlDecimal2;
                        }
                        if ((i & 4) == 0) {
                            this.payment_method = null;
                        } else {
                            this.payment_method = billingAccountDto;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        IdlDecimal idlDecimal = self.buying_power;
                        if (idlDecimal != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
                        }
                        IdlDecimal idlDecimal2 = self.quantity_available;
                        if (idlDecimal2 != null) {
                            output.encodeNullableSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, idlDecimal2);
                        }
                        BillingAccountDto billingAccountDto = self.payment_method;
                        if (billingAccountDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 2, BillingAccountDto.Serializer.INSTANCE, billingAccountDto);
                        }
                    }

                    public Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, BillingAccountDto billingAccountDto) {
                        this.buying_power = idlDecimal;
                        this.quantity_available = idlDecimal2;
                        this.payment_method = billingAccountDto;
                    }

                    public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, BillingAccountDto billingAccountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : idlDecimal2, (i & 4) != 0 ? null : billingAccountDto);
                    }

                    public final IdlDecimal getBuying_power() {
                        return this.buying_power;
                    }

                    public final IdlDecimal getQuantity_available() {
                        return this.quantity_available;
                    }

                    public final BillingAccountDto getPayment_method() {
                        return this.payment_method;
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Buy;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                public static final class Companion implements Dto3.Creator<BuyDto, ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<BuyDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<BuyDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<BuyDto> getBinaryBase64Serializer() {
                        return (KSerializer) BuyDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy> getProtoAdapter() {
                        return ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public BuyDto getZeroValue() {
                        return BuyDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public BuyDto fromProto(ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        String buying_power = proto.getBuying_power();
                        DefaultConstructorMarker defaultConstructorMarker = null;
                        IdlDecimal idlDecimal = buying_power != null ? new IdlDecimal(buying_power) : null;
                        String quantity_available = proto.getQuantity_available();
                        IdlDecimal idlDecimal2 = quantity_available != null ? new IdlDecimal(quantity_available) : null;
                        BillingAccount payment_method = proto.getPayment_method();
                        return new BuyDto(new Surrogate(idlDecimal, idlDecimal2, payment_method != null ? BillingAccountDto.INSTANCE.fromProto(payment_method) : null), defaultConstructorMarker);
                    }
                }

                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ValidateCryptoOrderRequestDto.OrderContextDto.OrderSideDto.BuyDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new BuyDto(null, null, null, 7, null);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<BuyDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.OrderContext.OrderSide.Buy", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, BuyDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public BuyDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new BuyDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4190_6)
                    public final String provideIntoMap() {
                        return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$BuyDto";
                    }
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Sell;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "quantity_available", "quantity_held_for_buy", "quantity_held_for_sell", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Sell;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class SellDto implements Dto3<ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<SellDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<SellDto, ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell>> binaryBase64Serializer$delegate;
                private static final SellDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ SellDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private SellDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public /* synthetic */ SellDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public SellDto(IdlDecimal quantity_available, IdlDecimal quantity_held_for_buy, IdlDecimal quantity_held_for_sell) {
                    this(new Surrogate(quantity_available, quantity_held_for_buy, quantity_held_for_sell));
                    Intrinsics.checkNotNullParameter(quantity_available, "quantity_available");
                    Intrinsics.checkNotNullParameter(quantity_held_for_buy, "quantity_held_for_buy");
                    Intrinsics.checkNotNullParameter(quantity_held_for_sell, "quantity_held_for_sell");
                }

                @Override // com.robinhood.idl.Dto
                public ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell toProto() {
                    return new ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell(this.surrogate.getQuantity_available().getStringValue(), this.surrogate.getQuantity_held_for_buy().getStringValue(), this.surrogate.getQuantity_held_for_sell().getStringValue(), null, 8, null);
                }

                public String toString() {
                    return "[SellDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof SellDto) && Intrinsics.areEqual(((SellDto) other).surrogate, this.surrogate);
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
                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002,+BR\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\t\u0010\nB9\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R/\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$¨\u0006-"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity_available", "quantity_held_for_buy", "quantity_held_for_sell", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity_available", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity_available$annotations", "()V", "getQuantity_held_for_buy", "getQuantity_held_for_buy$annotations", "getQuantity_held_for_sell", "getQuantity_held_for_sell$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final IdlDecimal quantity_available;
                    private final IdlDecimal quantity_held_for_buy;
                    private final IdlDecimal quantity_held_for_sell;

                    public Surrogate() {
                        this((IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 7, (DefaultConstructorMarker) null);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.quantity_available, surrogate.quantity_available) && Intrinsics.areEqual(this.quantity_held_for_buy, surrogate.quantity_held_for_buy) && Intrinsics.areEqual(this.quantity_held_for_sell, surrogate.quantity_held_for_sell);
                    }

                    public int hashCode() {
                        return (((this.quantity_available.hashCode() * 31) + this.quantity_held_for_buy.hashCode()) * 31) + this.quantity_held_for_sell.hashCode();
                    }

                    public String toString() {
                        return "Surrogate(quantity_available=" + this.quantity_available + ", quantity_held_for_buy=" + this.quantity_held_for_buy + ", quantity_held_for_sell=" + this.quantity_held_for_sell + ")";
                    }

                    /* compiled from: ValidateCryptoOrderRequestDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C44038x8b50acc.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
                        this.quantity_available = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
                        if ((i & 2) == 0) {
                            this.quantity_held_for_buy = new IdlDecimal("");
                        } else {
                            this.quantity_held_for_buy = idlDecimal2;
                        }
                        if ((i & 4) == 0) {
                            this.quantity_held_for_sell = new IdlDecimal("");
                        } else {
                            this.quantity_held_for_sell = idlDecimal3;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        if (!Intrinsics.areEqual(self.quantity_available, new IdlDecimal(""))) {
                            output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.quantity_available);
                        }
                        if (!Intrinsics.areEqual(self.quantity_held_for_buy, new IdlDecimal(""))) {
                            output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.quantity_held_for_buy);
                        }
                        if (Intrinsics.areEqual(self.quantity_held_for_sell, new IdlDecimal(""))) {
                            return;
                        }
                        output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.quantity_held_for_sell);
                    }

                    public Surrogate(IdlDecimal quantity_available, IdlDecimal quantity_held_for_buy, IdlDecimal quantity_held_for_sell) {
                        Intrinsics.checkNotNullParameter(quantity_available, "quantity_available");
                        Intrinsics.checkNotNullParameter(quantity_held_for_buy, "quantity_held_for_buy");
                        Intrinsics.checkNotNullParameter(quantity_held_for_sell, "quantity_held_for_sell");
                        this.quantity_available = quantity_available;
                        this.quantity_held_for_buy = quantity_held_for_buy;
                        this.quantity_held_for_sell = quantity_held_for_sell;
                    }

                    public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3);
                    }

                    public final IdlDecimal getQuantity_available() {
                        return this.quantity_available;
                    }

                    public final IdlDecimal getQuantity_held_for_buy() {
                        return this.quantity_held_for_buy;
                    }

                    public final IdlDecimal getQuantity_held_for_sell() {
                        return this.quantity_held_for_sell;
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderSide$Sell;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<SellDto, ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<SellDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<SellDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<SellDto> getBinaryBase64Serializer() {
                        return (KSerializer) SellDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell> getProtoAdapter() {
                        return ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public SellDto getZeroValue() {
                        return SellDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public SellDto fromProto(ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new SellDto(new Surrogate(new IdlDecimal(proto.getQuantity_available()), new IdlDecimal(proto.getQuantity_held_for_buy()), new IdlDecimal(proto.getQuantity_held_for_sell())), null);
                    }
                }

                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ValidateCryptoOrderRequestDto.OrderContextDto.OrderSideDto.SellDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new SellDto(null, null, null, 7, null);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<SellDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.OrderContext.OrderSide.Sell", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, SellDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public SellDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new SellDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4184_0)
                    public final String provideIntoMap() {
                        return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$SellDto";
                    }
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<OrderSideDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.OrderContext.OrderSide", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, OrderSideDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public OrderSideDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new OrderSideDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$OrderSideDto";
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$Quote;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", BidAskDetails3.ASK_PRICE, BidAskDetails3.BID_PRICE, "mid_price", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$Quote;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class QuoteDto implements Dto3<ValidateCryptoOrderRequest.OrderContext.Quote>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<QuoteDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<QuoteDto, ValidateCryptoOrderRequest.OrderContext.Quote>> binaryBase64Serializer$delegate;
            private static final QuoteDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ QuoteDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private QuoteDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public /* synthetic */ QuoteDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public QuoteDto(IdlDecimal ask_price, IdlDecimal bid_price, IdlDecimal mid_price) {
                this(new Surrogate(ask_price, bid_price, mid_price));
                Intrinsics.checkNotNullParameter(ask_price, "ask_price");
                Intrinsics.checkNotNullParameter(bid_price, "bid_price");
                Intrinsics.checkNotNullParameter(mid_price, "mid_price");
            }

            @Override // com.robinhood.idl.Dto
            public ValidateCryptoOrderRequest.OrderContext.Quote toProto() {
                return new ValidateCryptoOrderRequest.OrderContext.Quote(this.surrogate.getAsk_price().getStringValue(), this.surrogate.getBid_price().getStringValue(), this.surrogate.getMid_price().getStringValue(), null, 8, null);
            }

            public String toString() {
                return "[QuoteDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof QuoteDto) && Intrinsics.areEqual(((QuoteDto) other).surrogate, this.surrogate);
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
            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002,+BR\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\t\u0010\nB9\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R/\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$¨\u0006-"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", BidAskDetails3.ASK_PRICE, BidAskDetails3.BID_PRICE, "mid_price", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getAsk_price", "()Lcom/robinhood/idl/IdlDecimal;", "getAsk_price$annotations", "()V", "getBid_price", "getBid_price$annotations", "getMid_price", "getMid_price$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal ask_price;
                private final IdlDecimal bid_price;
                private final IdlDecimal mid_price;

                public Surrogate() {
                    this((IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.mid_price, surrogate.mid_price);
                }

                public int hashCode() {
                    return (((this.ask_price.hashCode() * 31) + this.bid_price.hashCode()) * 31) + this.mid_price.hashCode();
                }

                public String toString() {
                    return "Surrogate(ask_price=" + this.ask_price + ", bid_price=" + this.bid_price + ", mid_price=" + this.mid_price + ")";
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C44041xf35768cc.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
                    this.ask_price = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
                    if ((i & 2) == 0) {
                        this.bid_price = new IdlDecimal("");
                    } else {
                        this.bid_price = idlDecimal2;
                    }
                    if ((i & 4) == 0) {
                        this.mid_price = new IdlDecimal("");
                    } else {
                        this.mid_price = idlDecimal3;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.ask_price, new IdlDecimal(""))) {
                        output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.ask_price);
                    }
                    if (!Intrinsics.areEqual(self.bid_price, new IdlDecimal(""))) {
                        output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.bid_price);
                    }
                    if (Intrinsics.areEqual(self.mid_price, new IdlDecimal(""))) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.mid_price);
                }

                public Surrogate(IdlDecimal ask_price, IdlDecimal bid_price, IdlDecimal mid_price) {
                    Intrinsics.checkNotNullParameter(ask_price, "ask_price");
                    Intrinsics.checkNotNullParameter(bid_price, "bid_price");
                    Intrinsics.checkNotNullParameter(mid_price, "mid_price");
                    this.ask_price = ask_price;
                    this.bid_price = bid_price;
                    this.mid_price = mid_price;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3);
                }

                public final IdlDecimal getAsk_price() {
                    return this.ask_price;
                }

                public final IdlDecimal getBid_price() {
                    return this.bid_price;
                }

                public final IdlDecimal getMid_price() {
                    return this.mid_price;
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$Quote;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<QuoteDto, ValidateCryptoOrderRequest.OrderContext.Quote> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<QuoteDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<QuoteDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<QuoteDto> getBinaryBase64Serializer() {
                    return (KSerializer) QuoteDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.Quote> getProtoAdapter() {
                    return ValidateCryptoOrderRequest.OrderContext.Quote.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public QuoteDto getZeroValue() {
                    return QuoteDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public QuoteDto fromProto(ValidateCryptoOrderRequest.OrderContext.Quote proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new QuoteDto(new Surrogate(new IdlDecimal(proto.getAsk_price()), new IdlDecimal(proto.getBid_price()), new IdlDecimal(proto.getMid_price())), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.OrderContextDto.QuoteDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new QuoteDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<QuoteDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.OrderContext.Quote", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, QuoteDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public QuoteDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new QuoteDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4188_4)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$QuoteDto";
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007! \"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto;", "type", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "QuoteDto", "AssetDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class UserInputsDto implements Dto3<ValidateCryptoOrderRequest.OrderContext.UserInputs>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<UserInputsDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<UserInputsDto, ValidateCryptoOrderRequest.OrderContext.UserInputs>> binaryBase64Serializer$delegate;
            private static final UserInputsDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ UserInputsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private UserInputsDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public UserInputsDto(TypeDto typeDto) {
                TypeDto.Quote quote = typeDto instanceof TypeDto.Quote ? (TypeDto.Quote) typeDto : null;
                QuoteDto value = quote != null ? quote.getValue() : null;
                TypeDto.Asset asset = typeDto instanceof TypeDto.Asset ? (TypeDto.Asset) typeDto : null;
                this(new Surrogate(value, asset != null ? asset.getValue() : null));
            }

            public /* synthetic */ UserInputsDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : typeDto);
            }

            @Override // com.robinhood.idl.Dto
            public ValidateCryptoOrderRequest.OrderContext.UserInputs toProto() {
                QuoteDto quote = this.surrogate.getQuote();
                ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote proto = quote != null ? quote.toProto() : null;
                AssetDto asset = this.surrogate.getAsset();
                return new ValidateCryptoOrderRequest.OrderContext.UserInputs(proto, asset != null ? asset.toProto() : null, null, 4, null);
            }

            public String toString() {
                return "[UserInputsDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof UserInputsDto) && Intrinsics.areEqual(((UserInputsDto) other).surrogate, this.surrogate);
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
            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;", "quote", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;", "asset", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;", "getQuote", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;", "getQuote$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;", "getAsset", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;", "getAsset$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final AssetDto asset;
                private final QuoteDto quote;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((QuoteDto) null, (AssetDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.quote, surrogate.quote) && Intrinsics.areEqual(this.asset, surrogate.asset);
                }

                public int hashCode() {
                    QuoteDto quoteDto = this.quote;
                    int iHashCode = (quoteDto == null ? 0 : quoteDto.hashCode()) * 31;
                    AssetDto assetDto = this.asset;
                    return iHashCode + (assetDto != null ? assetDto.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(quote=" + this.quote + ", asset=" + this.asset + ")";
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C44048x2263724e.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, QuoteDto quoteDto, AssetDto assetDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.quote = null;
                    } else {
                        this.quote = quoteDto;
                    }
                    if ((i & 2) == 0) {
                        this.asset = null;
                    } else {
                        this.asset = assetDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    QuoteDto quoteDto = self.quote;
                    if (quoteDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, QuoteDto.Serializer.INSTANCE, quoteDto);
                    }
                    AssetDto assetDto = self.asset;
                    if (assetDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, AssetDto.Serializer.INSTANCE, assetDto);
                    }
                }

                public Surrogate(QuoteDto quoteDto, AssetDto assetDto) {
                    this.quote = quoteDto;
                    this.asset = assetDto;
                }

                public /* synthetic */ Surrogate(QuoteDto quoteDto, AssetDto assetDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : quoteDto, (i & 2) != 0 ? null : assetDto);
                }

                public final QuoteDto getQuote() {
                    return this.quote;
                }

                public final AssetDto getAsset() {
                    return this.asset;
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<UserInputsDto, ValidateCryptoOrderRequest.OrderContext.UserInputs> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<UserInputsDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<UserInputsDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<UserInputsDto> getBinaryBase64Serializer() {
                    return (KSerializer) UserInputsDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.UserInputs> getProtoAdapter() {
                    return ValidateCryptoOrderRequest.OrderContext.UserInputs.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public UserInputsDto getZeroValue() {
                    return UserInputsDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public UserInputsDto fromProto(ValidateCryptoOrderRequest.OrderContext.UserInputs proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote quote = proto.getQuote();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    QuoteDto quoteDtoFromProto = quote != null ? QuoteDto.INSTANCE.fromProto(quote) : null;
                    ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset asset = proto.getAsset();
                    return new UserInputsDto(new Surrogate(quoteDtoFromProto, asset != null ? AssetDto.INSTANCE.fromProto(asset) : null), defaultConstructorMarker);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.OrderContextDto.UserInputsDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new UserInputsDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", DxFeedData.TYPE_QUOTE, "Asset", "Companion", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto$Asset;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto$Quote;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @RhGenerated
            public static abstract class TypeDto implements Dto4 {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private TypeDto() {
                }

                @Override // com.robinhood.idl.Dto
                public Void toProto() {
                    return Dto4.DefaultImpls.toProto(this);
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto$Quote;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class Quote extends TypeDto {
                    private final QuoteDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Quote) && Intrinsics.areEqual(this.value, ((Quote) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Quote(value=" + this.value + ")";
                    }

                    public final QuoteDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Quote(QuoteDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto$Asset;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class Asset extends TypeDto {
                    private final AssetDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Asset) && Intrinsics.areEqual(this.value, ((Asset) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Asset(value=" + this.value + ")";
                    }

                    public final AssetDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Asset(AssetDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto4.Creator<TypeDto, ValidateCryptoOrderRequest.OrderContext.UserInputs> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public Void getZeroValue() {
                        return Dto4.Creator.DefaultImpls.getZeroValue(this);
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.UserInputs> getProtoAdapter() {
                        return ValidateCryptoOrderRequest.OrderContext.UserInputs.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public TypeDto fromProto(ValidateCryptoOrderRequest.OrderContext.UserInputs proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        if (proto.getQuote() != null) {
                            return new Quote(QuoteDto.INSTANCE.fromProto(proto.getQuote()));
                        }
                        if (proto.getAsset() != null) {
                            return new Asset(AssetDto.INSTANCE.fromProto(proto.getAsset()));
                        }
                        return null;
                    }
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006$"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Quote;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "amount", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Quote;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class QuoteDto implements Dto3<ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<QuoteDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<QuoteDto, ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote>> binaryBase64Serializer$delegate;
                private static final QuoteDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ QuoteDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private QuoteDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public QuoteDto(IdlDecimal amount) {
                    this(new Surrogate(amount));
                    Intrinsics.checkNotNullParameter(amount, "amount");
                }

                public /* synthetic */ QuoteDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote toProto() {
                    return new ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote(this.surrogate.getAmount().getStringValue(), null, 2, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[QuoteDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof QuoteDto) && Intrinsics.areEqual(((QuoteDto) other).surrogate, this.surrogate);
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
                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getAmount", "()Lcom/robinhood/idl/IdlDecimal;", "getAmount$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final IdlDecimal amount;

                    /* JADX WARN: Multi-variable type inference failed */
                    public Surrogate() {
                        this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Surrogate) && Intrinsics.areEqual(this.amount, ((Surrogate) other).amount);
                    }

                    public int hashCode() {
                        return this.amount.hashCode();
                    }

                    public String toString() {
                        return "Surrogate(amount=" + this.amount + ")";
                    }

                    /* compiled from: ValidateCryptoOrderRequestDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C44047xaa5d6fc5.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.amount = new IdlDecimal("");
                        } else {
                            this.amount = idlDecimal;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        if (Intrinsics.areEqual(self.amount, new IdlDecimal(""))) {
                            return;
                        }
                        output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.amount);
                    }

                    public Surrogate(IdlDecimal amount) {
                        Intrinsics.checkNotNullParameter(amount, "amount");
                        this.amount = amount;
                    }

                    public final IdlDecimal getAmount() {
                        return this.amount;
                    }

                    public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Quote;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<QuoteDto, ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<QuoteDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<QuoteDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<QuoteDto> getBinaryBase64Serializer() {
                        return (KSerializer) QuoteDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote> getProtoAdapter() {
                        return ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public QuoteDto getZeroValue() {
                        return QuoteDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public QuoteDto fromProto(ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new QuoteDto(new Surrogate(new IdlDecimal(proto.getAmount())), null);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ValidateCryptoOrderRequestDto.OrderContextDto.UserInputsDto.QuoteDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new QuoteDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<QuoteDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.OrderContext.UserInputs.Quote", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, QuoteDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public QuoteDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new QuoteDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4189_5)
                    public final String provideIntoMap() {
                        return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$QuoteDto";
                    }
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006$"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Asset;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "amount", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Asset;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class AssetDto implements Dto3<ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<AssetDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<AssetDto, ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset>> binaryBase64Serializer$delegate;
                private static final AssetDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ AssetDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private AssetDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public AssetDto(IdlDecimal amount) {
                    this(new Surrogate(amount));
                    Intrinsics.checkNotNullParameter(amount, "amount");
                }

                public /* synthetic */ AssetDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset toProto() {
                    return new ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset(this.surrogate.getAmount().getStringValue(), null, 2, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[AssetDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof AssetDto) && Intrinsics.areEqual(((AssetDto) other).surrogate, this.surrogate);
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
                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getAmount", "()Lcom/robinhood/idl/IdlDecimal;", "getAmount$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final IdlDecimal amount;

                    /* JADX WARN: Multi-variable type inference failed */
                    public Surrogate() {
                        this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Surrogate) && Intrinsics.areEqual(this.amount, ((Surrogate) other).amount);
                    }

                    public int hashCode() {
                        return this.amount.hashCode();
                    }

                    public String toString() {
                        return "Surrogate(amount=" + this.amount + ")";
                    }

                    /* compiled from: ValidateCryptoOrderRequestDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C44045xd032edd1.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.amount = new IdlDecimal("");
                        } else {
                            this.amount = idlDecimal;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        if (Intrinsics.areEqual(self.amount, new IdlDecimal(""))) {
                            return;
                        }
                        output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.amount);
                    }

                    public Surrogate(IdlDecimal amount) {
                        Intrinsics.checkNotNullParameter(amount, "amount");
                        this.amount = amount;
                    }

                    public final IdlDecimal getAmount() {
                        return this.amount;
                    }

                    public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$UserInputs$Asset;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<AssetDto, ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<AssetDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<AssetDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<AssetDto> getBinaryBase64Serializer() {
                        return (KSerializer) AssetDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset> getProtoAdapter() {
                        return ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public AssetDto getZeroValue() {
                        return AssetDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public AssetDto fromProto(ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new AssetDto(new Surrogate(new IdlDecimal(proto.getAmount())), null);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ValidateCryptoOrderRequestDto.OrderContextDto.UserInputsDto.AssetDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new AssetDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<AssetDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.OrderContext.UserInputs.Asset", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, AssetDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public AssetDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new AssetDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                    public final String provideIntoMap() {
                        return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$AssetDto";
                    }
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<UserInputsDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.OrderContext.UserInputs", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, UserInputsDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public UserInputsDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new UserInputsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$UserInputsDto";
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderInfo;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "order_quantity", "uncollared_total_cost", "collared_price", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderInfo;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class OrderInfoDto implements Dto3<ValidateCryptoOrderRequest.OrderContext.OrderInfo>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<OrderInfoDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<OrderInfoDto, ValidateCryptoOrderRequest.OrderContext.OrderInfo>> binaryBase64Serializer$delegate;
            private static final OrderInfoDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ OrderInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private OrderInfoDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public /* synthetic */ OrderInfoDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public OrderInfoDto(IdlDecimal order_quantity, IdlDecimal uncollared_total_cost, IdlDecimal collared_price) {
                this(new Surrogate(order_quantity, uncollared_total_cost, collared_price));
                Intrinsics.checkNotNullParameter(order_quantity, "order_quantity");
                Intrinsics.checkNotNullParameter(uncollared_total_cost, "uncollared_total_cost");
                Intrinsics.checkNotNullParameter(collared_price, "collared_price");
            }

            @Override // com.robinhood.idl.Dto
            public ValidateCryptoOrderRequest.OrderContext.OrderInfo toProto() {
                return new ValidateCryptoOrderRequest.OrderContext.OrderInfo(this.surrogate.getOrder_quantity().getStringValue(), this.surrogate.getUncollared_total_cost().getStringValue(), this.surrogate.getCollared_price().getStringValue(), null, 8, null);
            }

            public String toString() {
                return "[OrderInfoDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof OrderInfoDto) && Intrinsics.areEqual(((OrderInfoDto) other).surrogate, this.surrogate);
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
            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002,+BR\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\t\u0010\nB9\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R/\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$¨\u0006-"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "order_quantity", "uncollared_total_cost", "collared_price", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getOrder_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getOrder_quantity$annotations", "()V", "getUncollared_total_cost", "getUncollared_total_cost$annotations", "getCollared_price", "getCollared_price$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal collared_price;
                private final IdlDecimal order_quantity;
                private final IdlDecimal uncollared_total_cost;

                public Surrogate() {
                    this((IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.order_quantity, surrogate.order_quantity) && Intrinsics.areEqual(this.uncollared_total_cost, surrogate.uncollared_total_cost) && Intrinsics.areEqual(this.collared_price, surrogate.collared_price);
                }

                public int hashCode() {
                    return (((this.order_quantity.hashCode() * 31) + this.uncollared_total_cost.hashCode()) * 31) + this.collared_price.hashCode();
                }

                public String toString() {
                    return "Surrogate(order_quantity=" + this.order_quantity + ", uncollared_total_cost=" + this.uncollared_total_cost + ", collared_price=" + this.collared_price + ")";
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C44033xf6a908ac.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
                    this.order_quantity = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
                    if ((i & 2) == 0) {
                        this.uncollared_total_cost = new IdlDecimal("");
                    } else {
                        this.uncollared_total_cost = idlDecimal2;
                    }
                    if ((i & 4) == 0) {
                        this.collared_price = new IdlDecimal("");
                    } else {
                        this.collared_price = idlDecimal3;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.order_quantity, new IdlDecimal(""))) {
                        output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.order_quantity);
                    }
                    if (!Intrinsics.areEqual(self.uncollared_total_cost, new IdlDecimal(""))) {
                        output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.uncollared_total_cost);
                    }
                    if (Intrinsics.areEqual(self.collared_price, new IdlDecimal(""))) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.collared_price);
                }

                public Surrogate(IdlDecimal order_quantity, IdlDecimal uncollared_total_cost, IdlDecimal collared_price) {
                    Intrinsics.checkNotNullParameter(order_quantity, "order_quantity");
                    Intrinsics.checkNotNullParameter(uncollared_total_cost, "uncollared_total_cost");
                    Intrinsics.checkNotNullParameter(collared_price, "collared_price");
                    this.order_quantity = order_quantity;
                    this.uncollared_total_cost = uncollared_total_cost;
                    this.collared_price = collared_price;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3);
                }

                public final IdlDecimal getOrder_quantity() {
                    return this.order_quantity;
                }

                public final IdlDecimal getUncollared_total_cost() {
                    return this.uncollared_total_cost;
                }

                public final IdlDecimal getCollared_price() {
                    return this.collared_price;
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$OrderInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<OrderInfoDto, ValidateCryptoOrderRequest.OrderContext.OrderInfo> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<OrderInfoDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<OrderInfoDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<OrderInfoDto> getBinaryBase64Serializer() {
                    return (KSerializer) OrderInfoDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.OrderInfo> getProtoAdapter() {
                    return ValidateCryptoOrderRequest.OrderContext.OrderInfo.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public OrderInfoDto getZeroValue() {
                    return OrderInfoDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public OrderInfoDto fromProto(ValidateCryptoOrderRequest.OrderContext.OrderInfo proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new OrderInfoDto(new Surrogate(new IdlDecimal(proto.getOrder_quantity()), new IdlDecimal(proto.getUncollared_total_cost()), new IdlDecimal(proto.getCollared_price())), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.OrderContextDto.OrderInfoDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new OrderInfoDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<OrderInfoDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.OrderContext.OrderInfo", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, OrderInfoDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public OrderInfoDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new OrderInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$OrderInfoDto";
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&%'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006)"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$AccountInfo;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "", "is_pattern_day_trader", "is_margin", "", "account_type_display_name", "is_margin_investing_enabled", "is_levered", "(Lcom/robinhood/idl/IdlDecimal;ZZLjava/lang/String;ZZ)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$AccountInfo;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class AccountInfoDto implements Dto3<ValidateCryptoOrderRequest.OrderContext.AccountInfo>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<AccountInfoDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<AccountInfoDto, ValidateCryptoOrderRequest.OrderContext.AccountInfo>> binaryBase64Serializer$delegate;
            private static final AccountInfoDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ AccountInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private AccountInfoDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ AccountInfoDto(com.robinhood.idl.IdlDecimal r3, boolean r4, boolean r5, java.lang.String r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
                /*
                    r2 = this;
                    r10 = r9 & 1
                    java.lang.String r0 = ""
                    if (r10 == 0) goto Lb
                    com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
                    r3.<init>(r0)
                Lb:
                    r10 = r9 & 2
                    r1 = 0
                    if (r10 == 0) goto L11
                    r4 = r1
                L11:
                    r10 = r9 & 4
                    if (r10 == 0) goto L16
                    r5 = r1
                L16:
                    r10 = r9 & 8
                    if (r10 == 0) goto L1b
                    r6 = r0
                L1b:
                    r10 = r9 & 16
                    if (r10 == 0) goto L20
                    r7 = r1
                L20:
                    r9 = r9 & 32
                    if (r9 == 0) goto L2c
                    r10 = r1
                    r8 = r6
                    r9 = r7
                    r6 = r4
                    r7 = r5
                    r4 = r2
                    r5 = r3
                    goto L33
                L2c:
                    r10 = r8
                    r9 = r7
                    r7 = r5
                    r8 = r6
                    r5 = r3
                    r6 = r4
                    r4 = r2
                L33:
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto.OrderContextDto.AccountInfoDto.<init>(com.robinhood.idl.IdlDecimal, boolean, boolean, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public AccountInfoDto(IdlDecimal equity, boolean z, boolean z2, String account_type_display_name, boolean z3, boolean z4) {
                this(new Surrogate(equity, z, z2, account_type_display_name, z3, z4));
                Intrinsics.checkNotNullParameter(equity, "equity");
                Intrinsics.checkNotNullParameter(account_type_display_name, "account_type_display_name");
            }

            @Override // com.robinhood.idl.Dto
            public ValidateCryptoOrderRequest.OrderContext.AccountInfo toProto() {
                return new ValidateCryptoOrderRequest.OrderContext.AccountInfo(this.surrogate.getEquity().getStringValue(), this.surrogate.getIs_pattern_day_trader(), this.surrogate.getIs_margin(), this.surrogate.getAccount_type_display_name(), this.surrogate.getIs_margin_investing_enabled(), this.surrogate.getIs_levered(), null, 64, null);
            }

            public String toString() {
                return "[AccountInfoDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof AccountInfoDto) && Intrinsics.areEqual(((AccountInfoDto) other).surrogate, this.surrogate);
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
            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000243BR\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fBO\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b\b\u0010+R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b\t\u0010+R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u001fR \u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010*\u0012\u0004\b1\u0010)\u001a\u0004\b\f\u0010+R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010*\u0012\u0004\b2\u0010)\u001a\u0004\b\r\u0010+¨\u00065"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "", "is_pattern_day_trader", "is_margin", "", "account_type_display_name", "is_margin_investing_enabled", "is_levered", "<init>", "(Lcom/robinhood/idl/IdlDecimal;ZZLjava/lang/String;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;ZZLjava/lang/String;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getEquity", "()Lcom/robinhood/idl/IdlDecimal;", "getEquity$annotations", "()V", "Z", "()Z", "is_pattern_day_trader$annotations", "is_margin$annotations", "Ljava/lang/String;", "getAccount_type_display_name", "getAccount_type_display_name$annotations", "is_margin_investing_enabled$annotations", "is_levered$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String account_type_display_name;
                private final IdlDecimal equity;
                private final boolean is_levered;
                private final boolean is_margin;
                private final boolean is_margin_investing_enabled;
                private final boolean is_pattern_day_trader;

                public Surrogate() {
                    this((IdlDecimal) null, false, false, (String) null, false, false, 63, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.equity, surrogate.equity) && this.is_pattern_day_trader == surrogate.is_pattern_day_trader && this.is_margin == surrogate.is_margin && Intrinsics.areEqual(this.account_type_display_name, surrogate.account_type_display_name) && this.is_margin_investing_enabled == surrogate.is_margin_investing_enabled && this.is_levered == surrogate.is_levered;
                }

                public int hashCode() {
                    return (((((((((this.equity.hashCode() * 31) + Boolean.hashCode(this.is_pattern_day_trader)) * 31) + Boolean.hashCode(this.is_margin)) * 31) + this.account_type_display_name.hashCode()) * 31) + Boolean.hashCode(this.is_margin_investing_enabled)) * 31) + Boolean.hashCode(this.is_levered);
                }

                public String toString() {
                    return "Surrogate(equity=" + this.equity + ", is_pattern_day_trader=" + this.is_pattern_day_trader + ", is_margin=" + this.is_margin + ", account_type_display_name=" + this.account_type_display_name + ", is_margin_investing_enabled=" + this.is_margin_investing_enabled + ", is_levered=" + this.is_levered + ")";
                }

                /* compiled from: ValidateCryptoOrderRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C44031x57eba96d.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, boolean z, boolean z2, String str, boolean z3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
                    this.equity = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
                    if ((i & 2) == 0) {
                        this.is_pattern_day_trader = false;
                    } else {
                        this.is_pattern_day_trader = z;
                    }
                    if ((i & 4) == 0) {
                        this.is_margin = false;
                    } else {
                        this.is_margin = z2;
                    }
                    if ((i & 8) == 0) {
                        this.account_type_display_name = "";
                    } else {
                        this.account_type_display_name = str;
                    }
                    if ((i & 16) == 0) {
                        this.is_margin_investing_enabled = false;
                    } else {
                        this.is_margin_investing_enabled = z3;
                    }
                    if ((i & 32) == 0) {
                        this.is_levered = false;
                    } else {
                        this.is_levered = z4;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.equity, new IdlDecimal(""))) {
                        output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.equity);
                    }
                    boolean z = self.is_pattern_day_trader;
                    if (z) {
                        output.encodeBooleanElement(serialDesc, 1, z);
                    }
                    boolean z2 = self.is_margin;
                    if (z2) {
                        output.encodeBooleanElement(serialDesc, 2, z2);
                    }
                    if (!Intrinsics.areEqual(self.account_type_display_name, "")) {
                        output.encodeStringElement(serialDesc, 3, self.account_type_display_name);
                    }
                    boolean z3 = self.is_margin_investing_enabled;
                    if (z3) {
                        output.encodeBooleanElement(serialDesc, 4, z3);
                    }
                    boolean z4 = self.is_levered;
                    if (z4) {
                        output.encodeBooleanElement(serialDesc, 5, z4);
                    }
                }

                public Surrogate(IdlDecimal equity, boolean z, boolean z2, String account_type_display_name, boolean z3, boolean z4) {
                    Intrinsics.checkNotNullParameter(equity, "equity");
                    Intrinsics.checkNotNullParameter(account_type_display_name, "account_type_display_name");
                    this.equity = equity;
                    this.is_pattern_day_trader = z;
                    this.is_margin = z2;
                    this.account_type_display_name = account_type_display_name;
                    this.is_margin_investing_enabled = z3;
                    this.is_levered = z4;
                }

                /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                    java.lang.NullPointerException
                    */
                public /* synthetic */ Surrogate(com.robinhood.idl.IdlDecimal r3, boolean r4, boolean r5, java.lang.String r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
                    /*
                        r2 = this;
                        r10 = r9 & 1
                        java.lang.String r0 = ""
                        if (r10 == 0) goto Lb
                        com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
                        r3.<init>(r0)
                    Lb:
                        r10 = r9 & 2
                        r1 = 0
                        if (r10 == 0) goto L11
                        r4 = r1
                    L11:
                        r10 = r9 & 4
                        if (r10 == 0) goto L16
                        r5 = r1
                    L16:
                        r10 = r9 & 8
                        if (r10 == 0) goto L1b
                        r6 = r0
                    L1b:
                        r10 = r9 & 16
                        if (r10 == 0) goto L20
                        r7 = r1
                    L20:
                        r9 = r9 & 32
                        if (r9 == 0) goto L2c
                        r10 = r1
                        r8 = r6
                        r9 = r7
                        r6 = r4
                        r7 = r5
                        r4 = r2
                        r5 = r3
                        goto L33
                    L2c:
                        r10 = r8
                        r9 = r7
                        r7 = r5
                        r8 = r6
                        r5 = r3
                        r6 = r4
                        r4 = r2
                    L33:
                        r4.<init>(r5, r6, r7, r8, r9, r10)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto.OrderContextDto.AccountInfoDto.Surrogate.<init>(com.robinhood.idl.IdlDecimal, boolean, boolean, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
                }

                public final IdlDecimal getEquity() {
                    return this.equity;
                }

                /* renamed from: is_pattern_day_trader, reason: from getter */
                public final boolean getIs_pattern_day_trader() {
                    return this.is_pattern_day_trader;
                }

                /* renamed from: is_margin, reason: from getter */
                public final boolean getIs_margin() {
                    return this.is_margin;
                }

                public final String getAccount_type_display_name() {
                    return this.account_type_display_name;
                }

                /* renamed from: is_margin_investing_enabled, reason: from getter */
                public final boolean getIs_margin_investing_enabled() {
                    return this.is_margin_investing_enabled;
                }

                /* renamed from: is_levered, reason: from getter */
                public final boolean getIs_levered() {
                    return this.is_levered;
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$OrderContext$AccountInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<AccountInfoDto, ValidateCryptoOrderRequest.OrderContext.AccountInfo> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<AccountInfoDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<AccountInfoDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<AccountInfoDto> getBinaryBase64Serializer() {
                    return (KSerializer) AccountInfoDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateCryptoOrderRequest.OrderContext.AccountInfo> getProtoAdapter() {
                    return ValidateCryptoOrderRequest.OrderContext.AccountInfo.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public AccountInfoDto getZeroValue() {
                    return AccountInfoDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public AccountInfoDto fromProto(ValidateCryptoOrderRequest.OrderContext.AccountInfo proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new AccountInfoDto(new Surrogate(new IdlDecimal(proto.getEquity()), proto.getIs_pattern_day_trader(), proto.getIs_margin(), proto.getAccount_type_display_name(), proto.getIs_margin_investing_enabled(), proto.getIs_levered()), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.OrderContextDto.AccountInfoDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new AccountInfoDto(null, false, false, null, false, false, 63, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<AccountInfoDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.OrderContext.AccountInfo", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, AccountInfoDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public AccountInfoDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new AccountInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto$AccountInfoDto";
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<OrderContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.OrderContext", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderContextDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public OrderContextDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new OrderContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$OrderContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$OrderContextDto";
            }
        }
    }

    /* compiled from: ValidateCryptoOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b! \"#$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006("}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto;", "type", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "DefaultDto", "OrderPriceDto", "TokenizedStocksDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ValidationSourceDto implements Dto3<ValidateCryptoOrderRequest.ValidationSource>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ValidationSourceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ValidationSourceDto, ValidateCryptoOrderRequest.ValidationSource>> binaryBase64Serializer$delegate;
        private static final ValidationSourceDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ValidationSourceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ValidationSourceDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ValidationSourceDto(TypeDto typeDto) {
            TypeDto.Default r1 = typeDto instanceof TypeDto.Default ? (TypeDto.Default) typeDto : null;
            DefaultDto value = r1 != null ? r1.getValue() : null;
            TypeDto.OrderPrice orderPrice = typeDto instanceof TypeDto.OrderPrice ? (TypeDto.OrderPrice) typeDto : null;
            OrderPriceDto value2 = orderPrice != null ? orderPrice.getValue() : null;
            TypeDto.TokenizedStocks tokenizedStocks = typeDto instanceof TypeDto.TokenizedStocks ? (TypeDto.TokenizedStocks) typeDto : null;
            this(new Surrogate(value, value2, tokenizedStocks != null ? tokenizedStocks.getValue() : null));
        }

        public /* synthetic */ ValidationSourceDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : typeDto);
        }

        @Override // com.robinhood.idl.Dto
        public ValidateCryptoOrderRequest.ValidationSource toProto() {
            DefaultDto defaultDto = this.surrogate.getDefault();
            ValidateCryptoOrderRequest.ValidationSource.Default proto = defaultDto != null ? defaultDto.toProto() : null;
            OrderPriceDto order_price = this.surrogate.getOrder_price();
            ValidateCryptoOrderRequest.ValidationSource.OrderPrice proto2 = order_price != null ? order_price.toProto() : null;
            TokenizedStocksDto tokenized_stocks = this.surrogate.getTokenized_stocks();
            return new ValidateCryptoOrderRequest.ValidationSource(proto, proto2, tokenized_stocks != null ? tokenized_stocks.toProto() : null, null, 8, null);
        }

        public String toString() {
            return "[ValidationSourceDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ValidationSourceDto) && Intrinsics.areEqual(((ValidationSourceDto) other).surrogate, this.surrogate);
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
        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;", "order_price", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;", "tokenized_stocks", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;", "getDefault", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;", "getDefault$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;", "getOrder_price", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;", "getOrder_price$annotations", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;", "getTokenized_stocks", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;", "getTokenized_stocks$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DefaultDto default;
            private final OrderPriceDto order_price;
            private final TokenizedStocksDto tokenized_stocks;

            public Surrogate() {
                this((DefaultDto) null, (OrderPriceDto) null, (TokenizedStocksDto) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.default, surrogate.default) && Intrinsics.areEqual(this.order_price, surrogate.order_price) && Intrinsics.areEqual(this.tokenized_stocks, surrogate.tokenized_stocks);
            }

            public int hashCode() {
                DefaultDto defaultDto = this.default;
                int iHashCode = (defaultDto == null ? 0 : defaultDto.hashCode()) * 31;
                OrderPriceDto orderPriceDto = this.order_price;
                int iHashCode2 = (iHashCode + (orderPriceDto == null ? 0 : orderPriceDto.hashCode())) * 31;
                TokenizedStocksDto tokenizedStocksDto = this.tokenized_stocks;
                return iHashCode2 + (tokenizedStocksDto != null ? tokenizedStocksDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(default=" + this.default + ", order_price=" + this.order_price + ", tokenized_stocks=" + this.tokenized_stocks + ")";
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C44055x3cfc7d4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, DefaultDto defaultDto, OrderPriceDto orderPriceDto, TokenizedStocksDto tokenizedStocksDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.default = null;
                } else {
                    this.default = defaultDto;
                }
                if ((i & 2) == 0) {
                    this.order_price = null;
                } else {
                    this.order_price = orderPriceDto;
                }
                if ((i & 4) == 0) {
                    this.tokenized_stocks = null;
                } else {
                    this.tokenized_stocks = tokenizedStocksDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                DefaultDto defaultDto = self.default;
                if (defaultDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, DefaultDto.Serializer.INSTANCE, defaultDto);
                }
                OrderPriceDto orderPriceDto = self.order_price;
                if (orderPriceDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, OrderPriceDto.Serializer.INSTANCE, orderPriceDto);
                }
                TokenizedStocksDto tokenizedStocksDto = self.tokenized_stocks;
                if (tokenizedStocksDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, TokenizedStocksDto.Serializer.INSTANCE, tokenizedStocksDto);
                }
            }

            public Surrogate(DefaultDto defaultDto, OrderPriceDto orderPriceDto, TokenizedStocksDto tokenizedStocksDto) {
                this.default = defaultDto;
                this.order_price = orderPriceDto;
                this.tokenized_stocks = tokenizedStocksDto;
            }

            public /* synthetic */ Surrogate(DefaultDto defaultDto, OrderPriceDto orderPriceDto, TokenizedStocksDto tokenizedStocksDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : defaultDto, (i & 2) != 0 ? null : orderPriceDto, (i & 4) != 0 ? null : tokenizedStocksDto);
            }

            public final DefaultDto getDefault() {
                return this.default;
            }

            public final OrderPriceDto getOrder_price() {
                return this.order_price;
            }

            public final TokenizedStocksDto getTokenized_stocks() {
                return this.tokenized_stocks;
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ValidationSourceDto, ValidateCryptoOrderRequest.ValidationSource> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ValidationSourceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ValidationSourceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ValidationSourceDto> getBinaryBase64Serializer() {
                return (KSerializer) ValidationSourceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ValidateCryptoOrderRequest.ValidationSource> getProtoAdapter() {
                return ValidateCryptoOrderRequest.ValidationSource.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ValidationSourceDto getZeroValue() {
                return ValidationSourceDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ValidationSourceDto fromProto(ValidateCryptoOrderRequest.ValidationSource proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                ValidateCryptoOrderRequest.ValidationSource.Default r0 = proto.getDefault();
                DefaultConstructorMarker defaultConstructorMarker = null;
                DefaultDto defaultDtoFromProto = r0 != null ? DefaultDto.INSTANCE.fromProto(r0) : null;
                ValidateCryptoOrderRequest.ValidationSource.OrderPrice order_price = proto.getOrder_price();
                OrderPriceDto orderPriceDtoFromProto = order_price != null ? OrderPriceDto.INSTANCE.fromProto(order_price) : null;
                ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks tokenized_stocks = proto.getTokenized_stocks();
                return new ValidationSourceDto(new Surrogate(defaultDtoFromProto, orderPriceDtoFromProto, tokenized_stocks != null ? TokenizedStocksDto.INSTANCE.fromProto(tokenized_stocks) : null), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ValidateCryptoOrderRequestDto.ValidationSourceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ValidationSourceDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Default", "OrderPrice", "TokenizedStocks", "Companion", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto$Default;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto$OrderPrice;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto$TokenizedStocks;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class TypeDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TypeDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto$Default;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Default extends TypeDto {
                private final DefaultDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Default) && Intrinsics.areEqual(this.value, ((Default) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Default(value=" + this.value + ")";
                }

                public final DefaultDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Default(DefaultDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto$OrderPrice;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class OrderPrice extends TypeDto {
                private final OrderPriceDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OrderPrice) && Intrinsics.areEqual(this.value, ((OrderPrice) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "OrderPrice(value=" + this.value + ")";
                }

                public final OrderPriceDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OrderPrice(OrderPriceDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto$TokenizedStocks;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class TokenizedStocks extends TypeDto {
                private final TokenizedStocksDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TokenizedStocks) && Intrinsics.areEqual(this.value, ((TokenizedStocks) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "TokenizedStocks(value=" + this.value + ")";
                }

                public final TokenizedStocksDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TokenizedStocks(TokenizedStocksDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto4.Creator<TypeDto, ValidateCryptoOrderRequest.ValidationSource> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.idl.Dto.Creator
                public Void getZeroValue() {
                    return Dto4.Creator.DefaultImpls.getZeroValue(this);
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateCryptoOrderRequest.ValidationSource> getProtoAdapter() {
                    return ValidateCryptoOrderRequest.ValidationSource.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto fromProto(ValidateCryptoOrderRequest.ValidationSource proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getDefault() != null) {
                        return new Default(DefaultDto.INSTANCE.fromProto(proto.getDefault()));
                    }
                    if (proto.getOrder_price() != null) {
                        return new OrderPrice(OrderPriceDto.INSTANCE.fromProto(proto.getOrder_price()));
                    }
                    if (proto.getTokenized_stocks() != null) {
                        return new TokenizedStocks(TokenizedStocksDto.INSTANCE.fromProto(proto.getTokenized_stocks()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$Default;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$Default;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class DefaultDto implements Dto3<ValidateCryptoOrderRequest.ValidationSource.Default>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<DefaultDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<DefaultDto, ValidateCryptoOrderRequest.ValidationSource.Default>> binaryBase64Serializer$delegate;
            private static final DefaultDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ DefaultDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private DefaultDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public DefaultDto() {
                this(Surrogate.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public ValidateCryptoOrderRequest.ValidationSource.Default toProto() {
                return new ValidateCryptoOrderRequest.ValidationSource.Default(null, 1, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[DefaultDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof DefaultDto) && Intrinsics.areEqual(((DefaultDto) other).surrogate, this.surrogate);
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
            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                public static final Surrogate INSTANCE = new Surrogate();
                private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.ValidationSourceDto.DefaultDto.Surrogate._init_$_anonymous_();
                    }
                });

                public boolean equals(Object other) {
                    return this == other || (other instanceof Surrogate);
                }

                public int hashCode() {
                    return 874755861;
                }

                public String toString() {
                    return "Surrogate";
                }

                private Surrogate() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                    return new ObjectSerializer("contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto.ValidationSourceDto.DefaultDto.Surrogate", INSTANCE, new Annotation[0]);
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return $cachedSerializer$delegate.getValue();
                }

                public final KSerializer<Surrogate> serializer() {
                    return get$cachedSerializer();
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$Default;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<DefaultDto, ValidateCryptoOrderRequest.ValidationSource.Default> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<DefaultDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<DefaultDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<DefaultDto> getBinaryBase64Serializer() {
                    return (KSerializer) DefaultDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateCryptoOrderRequest.ValidationSource.Default> getProtoAdapter() {
                    return ValidateCryptoOrderRequest.ValidationSource.Default.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public DefaultDto getZeroValue() {
                    return DefaultDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public DefaultDto fromProto(ValidateCryptoOrderRequest.ValidationSource.Default proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new DefaultDto();
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.ValidationSourceDto.DefaultDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new DefaultDto();
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<DefaultDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.ValidationSource.Default", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, DefaultDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public DefaultDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new DefaultDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto$DefaultDto";
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$OrderPrice;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$OrderPrice;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class OrderPriceDto implements Dto3<ValidateCryptoOrderRequest.ValidationSource.OrderPrice>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<OrderPriceDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<OrderPriceDto, ValidateCryptoOrderRequest.ValidationSource.OrderPrice>> binaryBase64Serializer$delegate;
            private static final OrderPriceDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ OrderPriceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private OrderPriceDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public OrderPriceDto() {
                this(Surrogate.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public ValidateCryptoOrderRequest.ValidationSource.OrderPrice toProto() {
                return new ValidateCryptoOrderRequest.ValidationSource.OrderPrice(null, 1, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[OrderPriceDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof OrderPriceDto) && Intrinsics.areEqual(((OrderPriceDto) other).surrogate, this.surrogate);
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
            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                public static final Surrogate INSTANCE = new Surrogate();
                private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.ValidationSourceDto.OrderPriceDto.Surrogate._init_$_anonymous_();
                    }
                });

                public boolean equals(Object other) {
                    return this == other || (other instanceof Surrogate);
                }

                public int hashCode() {
                    return 1374983425;
                }

                public String toString() {
                    return "Surrogate";
                }

                private Surrogate() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                    return new ObjectSerializer("contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto.ValidationSourceDto.OrderPriceDto.Surrogate", INSTANCE, new Annotation[0]);
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return $cachedSerializer$delegate.getValue();
                }

                public final KSerializer<Surrogate> serializer() {
                    return get$cachedSerializer();
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$OrderPrice;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<OrderPriceDto, ValidateCryptoOrderRequest.ValidationSource.OrderPrice> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<OrderPriceDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<OrderPriceDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<OrderPriceDto> getBinaryBase64Serializer() {
                    return (KSerializer) OrderPriceDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateCryptoOrderRequest.ValidationSource.OrderPrice> getProtoAdapter() {
                    return ValidateCryptoOrderRequest.ValidationSource.OrderPrice.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public OrderPriceDto getZeroValue() {
                    return OrderPriceDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public OrderPriceDto fromProto(ValidateCryptoOrderRequest.ValidationSource.OrderPrice proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new OrderPriceDto();
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.ValidationSourceDto.OrderPriceDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new OrderPriceDto();
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<OrderPriceDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.ValidationSource.OrderPrice", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, OrderPriceDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public OrderPriceDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new OrderPriceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4188_4)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto$OrderPriceDto";
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$TokenizedStocks;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$TokenizedStocks;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class TokenizedStocksDto implements Dto3<ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<TokenizedStocksDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TokenizedStocksDto, ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks>> binaryBase64Serializer$delegate;
            private static final TokenizedStocksDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ TokenizedStocksDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private TokenizedStocksDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public TokenizedStocksDto() {
                this(Surrogate.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks toProto() {
                return new ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks(null, 1, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[TokenizedStocksDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof TokenizedStocksDto) && Intrinsics.areEqual(((TokenizedStocksDto) other).surrogate, this.surrogate);
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
            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                public static final Surrogate INSTANCE = new Surrogate();
                private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.ValidationSourceDto.TokenizedStocksDto.Surrogate._init_$_anonymous_();
                    }
                });

                public boolean equals(Object other) {
                    return this == other || (other instanceof Surrogate);
                }

                public int hashCode() {
                    return 432575472;
                }

                public String toString() {
                    return "Surrogate";
                }

                private Surrogate() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                    return new ObjectSerializer("contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto.ValidationSourceDto.TokenizedStocksDto.Surrogate", INSTANCE, new Annotation[0]);
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return $cachedSerializer$delegate.getValue();
                }

                public final KSerializer<Surrogate> serializer() {
                    return get$cachedSerializer();
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequest$ValidationSource$TokenizedStocks;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<TokenizedStocksDto, ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TokenizedStocksDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TokenizedStocksDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TokenizedStocksDto> getBinaryBase64Serializer() {
                    return (KSerializer) TokenizedStocksDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks> getProtoAdapter() {
                    return ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TokenizedStocksDto getZeroValue() {
                    return TokenizedStocksDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TokenizedStocksDto fromProto(ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new TokenizedStocksDto();
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderRequestDto.ValidationSourceDto.TokenizedStocksDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new TokenizedStocksDto();
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<TokenizedStocksDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.ValidationSource.TokenizedStocks", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TokenizedStocksDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public TokenizedStocksDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new TokenizedStocksDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: ValidateCryptoOrderRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4189_5)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto$TokenizedStocksDto";
                }
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ValidationSourceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest.ValidationSource", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ValidationSourceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ValidationSourceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ValidationSourceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: ValidateCryptoOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$ValidationSourceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto$ValidationSourceDto";
            }
        }
    }

    /* compiled from: ValidateCryptoOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ValidateCryptoOrderRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ValidateCryptoOrderRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ValidateCryptoOrderRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ValidateCryptoOrderRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ValidateCryptoOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderRequestDto";
        }
    }
}
