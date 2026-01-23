package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.OrderFormTypeDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.YesNoDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
import rosetta.mainst.PositionEffect;
import rosetta.mainst.PositionEffectDto;

/* compiled from: GetOrderFormDisplayDetailsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto$Surrogate;)V", "contract_id", "", "yes_no_from_contract_element", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "order_form_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormTypeDto;", "(Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;Lrosetta/mainst/PositionEffectDto;Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormTypeDto;)V", "getContract_id", "()Ljava/lang/String;", "getYes_no_from_contract_element", "()Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;", "getPosition_effect", "()Lrosetta/mainst/PositionEffectDto;", "getOrder_form_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormTypeDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class GetOrderFormDisplayDetailsRequestDto implements Dto3<GetOrderFormDisplayDetailsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetOrderFormDisplayDetailsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetOrderFormDisplayDetailsRequestDto, GetOrderFormDisplayDetailsRequest>> binaryBase64Serializer$delegate;
    private static final GetOrderFormDisplayDetailsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetOrderFormDisplayDetailsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetOrderFormDisplayDetailsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final YesNoDto getYes_no_from_contract_element() {
        return this.surrogate.getYes_no_from_contract_element();
    }

    public final PositionEffectDto getPosition_effect() {
        return this.surrogate.getPosition_effect();
    }

    public final OrderFormTypeDto getOrder_form_type() {
        return this.surrogate.getOrder_form_type();
    }

    public /* synthetic */ GetOrderFormDisplayDetailsRequestDto(String str, YesNoDto yesNoDto, PositionEffectDto positionEffectDto, OrderFormTypeDto orderFormTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? YesNoDto.INSTANCE.getZeroValue() : yesNoDto, (i & 4) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i & 8) != 0 ? OrderFormTypeDto.INSTANCE.getZeroValue() : orderFormTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetOrderFormDisplayDetailsRequestDto(String contract_id, YesNoDto yes_no_from_contract_element, PositionEffectDto position_effect, OrderFormTypeDto order_form_type) {
        this(new Surrogate(contract_id, yes_no_from_contract_element, position_effect, order_form_type));
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(yes_no_from_contract_element, "yes_no_from_contract_element");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
    }

    public static /* synthetic */ GetOrderFormDisplayDetailsRequestDto copy$default(GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, String str, YesNoDto yesNoDto, PositionEffectDto positionEffectDto, OrderFormTypeDto orderFormTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOrderFormDisplayDetailsRequestDto.surrogate.getContract_id();
        }
        if ((i & 2) != 0) {
            yesNoDto = getOrderFormDisplayDetailsRequestDto.surrogate.getYes_no_from_contract_element();
        }
        if ((i & 4) != 0) {
            positionEffectDto = getOrderFormDisplayDetailsRequestDto.surrogate.getPosition_effect();
        }
        if ((i & 8) != 0) {
            orderFormTypeDto = getOrderFormDisplayDetailsRequestDto.surrogate.getOrder_form_type();
        }
        return getOrderFormDisplayDetailsRequestDto.copy(str, yesNoDto, positionEffectDto, orderFormTypeDto);
    }

    public final GetOrderFormDisplayDetailsRequestDto copy(String contract_id, YesNoDto yes_no_from_contract_element, PositionEffectDto position_effect, OrderFormTypeDto order_form_type) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(yes_no_from_contract_element, "yes_no_from_contract_element");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
        return new GetOrderFormDisplayDetailsRequestDto(new Surrogate(contract_id, yes_no_from_contract_element, position_effect, order_form_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetOrderFormDisplayDetailsRequest toProto() {
        return new GetOrderFormDisplayDetailsRequest(this.surrogate.getContract_id(), (YesNo) this.surrogate.getYes_no_from_contract_element().toProto(), (PositionEffect) this.surrogate.getPosition_effect().toProto(), (OrderFormType) this.surrogate.getOrder_form_type().toProto(), null, 16, null);
    }

    public String toString() {
        return "[GetOrderFormDisplayDetailsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetOrderFormDisplayDetailsRequestDto) && Intrinsics.areEqual(((GetOrderFormDisplayDetailsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetOrderFormDisplayDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J1\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto$Surrogate;", "", "contract_id", "", "yes_no_from_contract_element", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "order_form_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormTypeDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;Lrosetta/mainst/PositionEffectDto;Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormTypeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;Lrosetta/mainst/PositionEffectDto;Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_id$annotations", "()V", "getContract_id", "()Ljava/lang/String;", "getYes_no_from_contract_element$annotations", "getYes_no_from_contract_element", "()Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;", "getPosition_effect$annotations", "getPosition_effect", "()Lrosetta/mainst/PositionEffectDto;", "getOrder_form_type$annotations", "getOrder_form_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/OrderFormTypeDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String contract_id;
        private final OrderFormTypeDto order_form_type;
        private final PositionEffectDto position_effect;
        private final YesNoDto yes_no_from_contract_element;

        public Surrogate() {
            this((String) null, (YesNoDto) null, (PositionEffectDto) null, (OrderFormTypeDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, YesNoDto yesNoDto, PositionEffectDto positionEffectDto, OrderFormTypeDto orderFormTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.contract_id;
            }
            if ((i & 2) != 0) {
                yesNoDto = surrogate.yes_no_from_contract_element;
            }
            if ((i & 4) != 0) {
                positionEffectDto = surrogate.position_effect;
            }
            if ((i & 8) != 0) {
                orderFormTypeDto = surrogate.order_form_type;
            }
            return surrogate.copy(str, yesNoDto, positionEffectDto, orderFormTypeDto);
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("orderFormType")
        @JsonAnnotations2(names = {"order_form_type"})
        public static /* synthetic */ void getOrder_form_type$annotations() {
        }

        @SerialName("positionEffect")
        @JsonAnnotations2(names = {"position_effect"})
        public static /* synthetic */ void getPosition_effect$annotations() {
        }

        @SerialName("yesNoFromContractElement")
        @JsonAnnotations2(names = {"yes_no_from_contract_element"})
        public static /* synthetic */ void getYes_no_from_contract_element$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component2, reason: from getter */
        public final YesNoDto getYes_no_from_contract_element() {
            return this.yes_no_from_contract_element;
        }

        /* renamed from: component3, reason: from getter */
        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderFormTypeDto getOrder_form_type() {
            return this.order_form_type;
        }

        public final Surrogate copy(String contract_id, YesNoDto yes_no_from_contract_element, PositionEffectDto position_effect, OrderFormTypeDto order_form_type) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(yes_no_from_contract_element, "yes_no_from_contract_element");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
            return new Surrogate(contract_id, yes_no_from_contract_element, position_effect, order_form_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.yes_no_from_contract_element == surrogate.yes_no_from_contract_element && this.position_effect == surrogate.position_effect && this.order_form_type == surrogate.order_form_type;
        }

        public int hashCode() {
            return (((((this.contract_id.hashCode() * 31) + this.yes_no_from_contract_element.hashCode()) * 31) + this.position_effect.hashCode()) * 31) + this.order_form_type.hashCode();
        }

        public String toString() {
            return "Surrogate(contract_id=" + this.contract_id + ", yes_no_from_contract_element=" + this.yes_no_from_contract_element + ", position_effect=" + this.position_effect + ", order_form_type=" + this.order_form_type + ")";
        }

        /* compiled from: GetOrderFormDisplayDetailsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetOrderFormDisplayDetailsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, YesNoDto yesNoDto, PositionEffectDto positionEffectDto, OrderFormTypeDto orderFormTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.contract_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.yes_no_from_contract_element = YesNoDto.INSTANCE.getZeroValue();
            } else {
                this.yes_no_from_contract_element = yesNoDto;
            }
            if ((i & 4) == 0) {
                this.position_effect = PositionEffectDto.INSTANCE.getZeroValue();
            } else {
                this.position_effect = positionEffectDto;
            }
            if ((i & 8) == 0) {
                this.order_form_type = OrderFormTypeDto.INSTANCE.getZeroValue();
            } else {
                this.order_form_type = orderFormTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.contract_id);
            }
            if (self.yes_no_from_contract_element != YesNoDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, YesNoDto.Serializer.INSTANCE, self.yes_no_from_contract_element);
            }
            if (self.position_effect != PositionEffectDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, PositionEffectDto.Serializer.INSTANCE, self.position_effect);
            }
            if (self.order_form_type != OrderFormTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, OrderFormTypeDto.Serializer.INSTANCE, self.order_form_type);
            }
        }

        public Surrogate(String contract_id, YesNoDto yes_no_from_contract_element, PositionEffectDto position_effect, OrderFormTypeDto order_form_type) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(yes_no_from_contract_element, "yes_no_from_contract_element");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
            this.contract_id = contract_id;
            this.yes_no_from_contract_element = yes_no_from_contract_element;
            this.position_effect = position_effect;
            this.order_form_type = order_form_type;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public /* synthetic */ Surrogate(String str, YesNoDto yesNoDto, PositionEffectDto positionEffectDto, OrderFormTypeDto orderFormTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? YesNoDto.INSTANCE.getZeroValue() : yesNoDto, (i & 4) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i & 8) != 0 ? OrderFormTypeDto.INSTANCE.getZeroValue() : orderFormTypeDto);
        }

        public final YesNoDto getYes_no_from_contract_element() {
            return this.yes_no_from_contract_element;
        }

        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        public final OrderFormTypeDto getOrder_form_type() {
            return this.order_form_type;
        }
    }

    /* compiled from: GetOrderFormDisplayDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetOrderFormDisplayDetailsRequestDto, GetOrderFormDisplayDetailsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetOrderFormDisplayDetailsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetOrderFormDisplayDetailsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetOrderFormDisplayDetailsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetOrderFormDisplayDetailsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetOrderFormDisplayDetailsRequest> getProtoAdapter() {
            return GetOrderFormDisplayDetailsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetOrderFormDisplayDetailsRequestDto getZeroValue() {
            return GetOrderFormDisplayDetailsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetOrderFormDisplayDetailsRequestDto fromProto(GetOrderFormDisplayDetailsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetOrderFormDisplayDetailsRequestDto(new Surrogate(proto.getContract_id(), YesNoDto.INSTANCE.fromProto(proto.getYes_no_from_contract_element()), PositionEffectDto.INSTANCE.fromProto(proto.getPosition_effect()), OrderFormTypeDto.INSTANCE.fromProto(proto.getOrder_form_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetOrderFormDisplayDetailsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetOrderFormDisplayDetailsRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetOrderFormDisplayDetailsRequestDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetOrderFormDisplayDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetOrderFormDisplayDetailsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.GetOrderFormDisplayDetailsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetOrderFormDisplayDetailsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetOrderFormDisplayDetailsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetOrderFormDisplayDetailsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetOrderFormDisplayDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.GetOrderFormDisplayDetailsRequestDto";
        }
    }
}
