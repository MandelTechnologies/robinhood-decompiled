package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.CryptoOrderMetaDto;
import com.robinhood.rosetta.eventlogging.CryptoOrderPayloadDto;
import com.robinhood.rosetta.eventlogging.OrderFormStepDto;
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

/* compiled from: CryptoOrderEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto$Surrogate;)V", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "payload", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/CryptoOrderMetaDto;", "(Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderMetaDto;)V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;", "getMeta", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderMetaDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CryptoOrderEventDataDto implements Dto3<CryptoOrderEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoOrderEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoOrderEventDataDto, CryptoOrderEventData>> binaryBase64Serializer$delegate;
    private static final CryptoOrderEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoOrderEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoOrderEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final OrderFormStepDto getStep() {
        return this.surrogate.getStep();
    }

    public final CryptoOrderPayloadDto getPayload() {
        return this.surrogate.getPayload();
    }

    public final CryptoOrderMetaDto getMeta() {
        return this.surrogate.getMeta();
    }

    public /* synthetic */ CryptoOrderEventDataDto(OrderFormStepDto orderFormStepDto, CryptoOrderPayloadDto cryptoOrderPayloadDto, CryptoOrderMetaDto cryptoOrderMetaDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OrderFormStepDto.INSTANCE.getZeroValue() : orderFormStepDto, (i & 2) != 0 ? null : cryptoOrderPayloadDto, (i & 4) != 0 ? null : cryptoOrderMetaDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoOrderEventDataDto(OrderFormStepDto step, CryptoOrderPayloadDto cryptoOrderPayloadDto, CryptoOrderMetaDto cryptoOrderMetaDto) {
        this(new Surrogate(step, cryptoOrderPayloadDto, cryptoOrderMetaDto));
        Intrinsics.checkNotNullParameter(step, "step");
    }

    public static /* synthetic */ CryptoOrderEventDataDto copy$default(CryptoOrderEventDataDto cryptoOrderEventDataDto, OrderFormStepDto orderFormStepDto, CryptoOrderPayloadDto cryptoOrderPayloadDto, CryptoOrderMetaDto cryptoOrderMetaDto, int i, Object obj) {
        if ((i & 1) != 0) {
            orderFormStepDto = cryptoOrderEventDataDto.surrogate.getStep();
        }
        if ((i & 2) != 0) {
            cryptoOrderPayloadDto = cryptoOrderEventDataDto.surrogate.getPayload();
        }
        if ((i & 4) != 0) {
            cryptoOrderMetaDto = cryptoOrderEventDataDto.surrogate.getMeta();
        }
        return cryptoOrderEventDataDto.copy(orderFormStepDto, cryptoOrderPayloadDto, cryptoOrderMetaDto);
    }

    public final CryptoOrderEventDataDto copy(OrderFormStepDto step, CryptoOrderPayloadDto payload, CryptoOrderMetaDto meta) {
        Intrinsics.checkNotNullParameter(step, "step");
        return new CryptoOrderEventDataDto(new Surrogate(step, payload, meta));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoOrderEventData toProto() {
        OrderFormStep orderFormStep = (OrderFormStep) this.surrogate.getStep().toProto();
        CryptoOrderPayloadDto payload = this.surrogate.getPayload();
        CryptoOrderPayload proto = payload != null ? payload.toProto() : null;
        CryptoOrderMetaDto meta = this.surrogate.getMeta();
        return new CryptoOrderEventData(orderFormStep, proto, meta != null ? meta.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[CryptoOrderEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoOrderEventDataDto) && Intrinsics.areEqual(((CryptoOrderEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto$Surrogate;", "", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "payload", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/CryptoOrderMetaDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderMetaDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/OrderFormStepDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderMetaDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStep$annotations", "()V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "getPayload$annotations", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;", "getMeta$annotations", "getMeta", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderMetaDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CryptoOrderMetaDto meta;
        private final CryptoOrderPayloadDto payload;
        private final OrderFormStepDto step;

        public Surrogate() {
            this((OrderFormStepDto) null, (CryptoOrderPayloadDto) null, (CryptoOrderMetaDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, OrderFormStepDto orderFormStepDto, CryptoOrderPayloadDto cryptoOrderPayloadDto, CryptoOrderMetaDto cryptoOrderMetaDto, int i, Object obj) {
            if ((i & 1) != 0) {
                orderFormStepDto = surrogate.step;
            }
            if ((i & 2) != 0) {
                cryptoOrderPayloadDto = surrogate.payload;
            }
            if ((i & 4) != 0) {
                cryptoOrderMetaDto = surrogate.meta;
            }
            return surrogate.copy(orderFormStepDto, cryptoOrderPayloadDto, cryptoOrderMetaDto);
        }

        @SerialName(Constants.REFERRER_API_META)
        @JsonAnnotations2(names = {Constants.REFERRER_API_META})
        public static /* synthetic */ void getMeta$annotations() {
        }

        @SerialName("payload")
        @JsonAnnotations2(names = {"payload"})
        public static /* synthetic */ void getPayload$annotations() {
        }

        @SerialName("step")
        @JsonAnnotations2(names = {"step"})
        public static /* synthetic */ void getStep$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final OrderFormStepDto getStep() {
            return this.step;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoOrderPayloadDto getPayload() {
            return this.payload;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoOrderMetaDto getMeta() {
            return this.meta;
        }

        public final Surrogate copy(OrderFormStepDto step, CryptoOrderPayloadDto payload, CryptoOrderMetaDto meta) {
            Intrinsics.checkNotNullParameter(step, "step");
            return new Surrogate(step, payload, meta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.step == surrogate.step && Intrinsics.areEqual(this.payload, surrogate.payload) && Intrinsics.areEqual(this.meta, surrogate.meta);
        }

        public int hashCode() {
            int iHashCode = this.step.hashCode() * 31;
            CryptoOrderPayloadDto cryptoOrderPayloadDto = this.payload;
            int iHashCode2 = (iHashCode + (cryptoOrderPayloadDto == null ? 0 : cryptoOrderPayloadDto.hashCode())) * 31;
            CryptoOrderMetaDto cryptoOrderMetaDto = this.meta;
            return iHashCode2 + (cryptoOrderMetaDto != null ? cryptoOrderMetaDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(step=" + this.step + ", payload=" + this.payload + ", meta=" + this.meta + ")";
        }

        /* compiled from: CryptoOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoOrderEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, OrderFormStepDto orderFormStepDto, CryptoOrderPayloadDto cryptoOrderPayloadDto, CryptoOrderMetaDto cryptoOrderMetaDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.step = (i & 1) == 0 ? OrderFormStepDto.INSTANCE.getZeroValue() : orderFormStepDto;
            if ((i & 2) == 0) {
                this.payload = null;
            } else {
                this.payload = cryptoOrderPayloadDto;
            }
            if ((i & 4) == 0) {
                this.meta = null;
            } else {
                this.meta = cryptoOrderMetaDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.step != OrderFormStepDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, OrderFormStepDto.Serializer.INSTANCE, self.step);
            }
            CryptoOrderPayloadDto cryptoOrderPayloadDto = self.payload;
            if (cryptoOrderPayloadDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CryptoOrderPayloadDto.Serializer.INSTANCE, cryptoOrderPayloadDto);
            }
            CryptoOrderMetaDto cryptoOrderMetaDto = self.meta;
            if (cryptoOrderMetaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, CryptoOrderMetaDto.Serializer.INSTANCE, cryptoOrderMetaDto);
            }
        }

        public Surrogate(OrderFormStepDto step, CryptoOrderPayloadDto cryptoOrderPayloadDto, CryptoOrderMetaDto cryptoOrderMetaDto) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.step = step;
            this.payload = cryptoOrderPayloadDto;
            this.meta = cryptoOrderMetaDto;
        }

        public final OrderFormStepDto getStep() {
            return this.step;
        }

        public /* synthetic */ Surrogate(OrderFormStepDto orderFormStepDto, CryptoOrderPayloadDto cryptoOrderPayloadDto, CryptoOrderMetaDto cryptoOrderMetaDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? OrderFormStepDto.INSTANCE.getZeroValue() : orderFormStepDto, (i & 2) != 0 ? null : cryptoOrderPayloadDto, (i & 4) != 0 ? null : cryptoOrderMetaDto);
        }

        public final CryptoOrderPayloadDto getPayload() {
            return this.payload;
        }

        public final CryptoOrderMetaDto getMeta() {
            return this.meta;
        }
    }

    /* compiled from: CryptoOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CryptoOrderEventDataDto, CryptoOrderEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoOrderEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoOrderEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoOrderEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoOrderEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoOrderEventData> getProtoAdapter() {
            return CryptoOrderEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoOrderEventDataDto getZeroValue() {
            return CryptoOrderEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoOrderEventDataDto fromProto(CryptoOrderEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            OrderFormStepDto orderFormStepDtoFromProto = OrderFormStepDto.INSTANCE.fromProto(proto.getStep());
            CryptoOrderPayload payload = proto.getPayload();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CryptoOrderPayloadDto cryptoOrderPayloadDtoFromProto = payload != null ? CryptoOrderPayloadDto.INSTANCE.fromProto(payload) : null;
            CryptoOrderMeta meta = proto.getMeta();
            return new CryptoOrderEventDataDto(new Surrogate(orderFormStepDtoFromProto, cryptoOrderPayloadDtoFromProto, meta != null ? CryptoOrderMetaDto.INSTANCE.fromProto(meta) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoOrderEventDataDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CryptoOrderEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoOrderEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoOrderEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoOrderEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoOrderEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoOrderEventDataDto";
        }
    }
}
