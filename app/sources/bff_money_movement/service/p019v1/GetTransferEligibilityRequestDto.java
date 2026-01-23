package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.CreateTransferAccountDto;
import bff_money_movement.service.p019v1.TransferFrequencyDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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
import rosetta.payment_hub.p540v1.service.TransferType;
import rosetta.payment_hub.p540v1.service.TransferTypeDto;

/* compiled from: GetTransferEligibilityRequestDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/GetTransferEligibilityRequest;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$Surrogate;)V", "Lrosetta/payment_hub/v1/service/TransferTypeDto;", "transfer_type", "Lbff_money_movement/service/v1/CreateTransferAccountDto;", "source", "sink", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "Lbff_money_movement/service/v1/TransferFrequencyDto;", "frequency", "(Lrosetta/payment_hub/v1/service/TransferTypeDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lcom/robinhood/rosetta/common/MoneyDto;Lbff_money_movement/service/v1/TransferFrequencyDto;)V", "toProto", "()Lbff_money_movement/service/v1/GetTransferEligibilityRequest;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$Surrogate;", "getTransfer_type", "()Lrosetta/payment_hub/v1/service/TransferTypeDto;", "getSource", "()Lbff_money_movement/service/v1/CreateTransferAccountDto;", "getSink", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getFrequency", "()Lbff_money_movement/service/v1/TransferFrequencyDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class GetTransferEligibilityRequestDto implements Dto3<GetTransferEligibilityRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetTransferEligibilityRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetTransferEligibilityRequestDto, GetTransferEligibilityRequest>> binaryBase64Serializer$delegate;
    private static final GetTransferEligibilityRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetTransferEligibilityRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetTransferEligibilityRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TransferTypeDto getTransfer_type() {
        return this.surrogate.getTransfer_type();
    }

    public final CreateTransferAccountDto getSource() {
        return this.surrogate.getSource();
    }

    public final CreateTransferAccountDto getSink() {
        return this.surrogate.getSink();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final TransferFrequencyDto getFrequency() {
        return this.surrogate.getFrequency();
    }

    public /* synthetic */ GetTransferEligibilityRequestDto(TransferTypeDto transferTypeDto, CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2, MoneyDto moneyDto, TransferFrequencyDto transferFrequencyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TransferTypeDto.INSTANCE.getZeroValue() : transferTypeDto, (i & 2) != 0 ? null : createTransferAccountDto, (i & 4) != 0 ? null : createTransferAccountDto2, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? TransferFrequencyDto.INSTANCE.getZeroValue() : transferFrequencyDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetTransferEligibilityRequestDto(TransferTypeDto transfer_type, CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2, MoneyDto moneyDto, TransferFrequencyDto frequency) {
        this(new Surrogate(transfer_type, createTransferAccountDto, createTransferAccountDto2, moneyDto, frequency));
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetTransferEligibilityRequest toProto() {
        TransferType transferType = (TransferType) this.surrogate.getTransfer_type().toProto();
        CreateTransferAccountDto source = this.surrogate.getSource();
        CreateTransferAccount proto = source != null ? source.toProto() : null;
        CreateTransferAccountDto sink = this.surrogate.getSink();
        CreateTransferAccount proto2 = sink != null ? sink.toProto() : null;
        MoneyDto amount = this.surrogate.getAmount();
        return new GetTransferEligibilityRequest(transferType, proto, proto2, amount != null ? amount.toProto() : null, (TransferFrequency) this.surrogate.getFrequency().toProto(), null, 32, null);
    }

    public String toString() {
        return "[GetTransferEligibilityRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetTransferEligibilityRequestDto) && Intrinsics.areEqual(((GetTransferEligibilityRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetTransferEligibilityRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010+R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010(\u001a\u0004\b0\u00101R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b6\u0010(\u001a\u0004\b4\u00105¨\u00069"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$Surrogate;", "", "Lrosetta/payment_hub/v1/service/TransferTypeDto;", "transfer_type", "Lbff_money_movement/service/v1/CreateTransferAccountDto;", "source", "sink", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "Lbff_money_movement/service/v1/TransferFrequencyDto;", "frequency", "<init>", "(Lrosetta/payment_hub/v1/service/TransferTypeDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lcom/robinhood/rosetta/common/MoneyDto;Lbff_money_movement/service/v1/TransferFrequencyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/payment_hub/v1/service/TransferTypeDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lcom/robinhood/rosetta/common/MoneyDto;Lbff_money_movement/service/v1/TransferFrequencyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/payment_hub/v1/service/TransferTypeDto;", "getTransfer_type", "()Lrosetta/payment_hub/v1/service/TransferTypeDto;", "getTransfer_type$annotations", "()V", "Lbff_money_movement/service/v1/CreateTransferAccountDto;", "getSource", "()Lbff_money_movement/service/v1/CreateTransferAccountDto;", "getSource$annotations", "getSink", "getSink$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount$annotations", "Lbff_money_movement/service/v1/TransferFrequencyDto;", "getFrequency", "()Lbff_money_movement/service/v1/TransferFrequencyDto;", "getFrequency$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final TransferFrequencyDto frequency;
        private final CreateTransferAccountDto sink;
        private final CreateTransferAccountDto source;
        private final TransferTypeDto transfer_type;

        public Surrogate() {
            this((TransferTypeDto) null, (CreateTransferAccountDto) null, (CreateTransferAccountDto) null, (MoneyDto) null, (TransferFrequencyDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.transfer_type == surrogate.transfer_type && Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.sink, surrogate.sink) && Intrinsics.areEqual(this.amount, surrogate.amount) && this.frequency == surrogate.frequency;
        }

        public int hashCode() {
            int iHashCode = this.transfer_type.hashCode() * 31;
            CreateTransferAccountDto createTransferAccountDto = this.source;
            int iHashCode2 = (iHashCode + (createTransferAccountDto == null ? 0 : createTransferAccountDto.hashCode())) * 31;
            CreateTransferAccountDto createTransferAccountDto2 = this.sink;
            int iHashCode3 = (iHashCode2 + (createTransferAccountDto2 == null ? 0 : createTransferAccountDto2.hashCode())) * 31;
            MoneyDto moneyDto = this.amount;
            return ((iHashCode3 + (moneyDto != null ? moneyDto.hashCode() : 0)) * 31) + this.frequency.hashCode();
        }

        public String toString() {
            return "Surrogate(transfer_type=" + this.transfer_type + ", source=" + this.source + ", sink=" + this.sink + ", amount=" + this.amount + ", frequency=" + this.frequency + ")";
        }

        /* compiled from: GetTransferEligibilityRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetTransferEligibilityRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TransferTypeDto transferTypeDto, CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2, MoneyDto moneyDto, TransferFrequencyDto transferFrequencyDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.transfer_type = (i & 1) == 0 ? TransferTypeDto.INSTANCE.getZeroValue() : transferTypeDto;
            if ((i & 2) == 0) {
                this.source = null;
            } else {
                this.source = createTransferAccountDto;
            }
            if ((i & 4) == 0) {
                this.sink = null;
            } else {
                this.sink = createTransferAccountDto2;
            }
            if ((i & 8) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 16) == 0) {
                this.frequency = TransferFrequencyDto.INSTANCE.getZeroValue();
            } else {
                this.frequency = transferFrequencyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.transfer_type != TransferTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, TransferTypeDto.Serializer.INSTANCE, self.transfer_type);
            }
            CreateTransferAccountDto createTransferAccountDto = self.source;
            if (createTransferAccountDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CreateTransferAccountDto.Serializer.INSTANCE, createTransferAccountDto);
            }
            CreateTransferAccountDto createTransferAccountDto2 = self.sink;
            if (createTransferAccountDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, CreateTransferAccountDto.Serializer.INSTANCE, createTransferAccountDto2);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (self.frequency != TransferFrequencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, TransferFrequencyDto.Serializer.INSTANCE, self.frequency);
            }
        }

        public Surrogate(TransferTypeDto transfer_type, CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2, MoneyDto moneyDto, TransferFrequencyDto frequency) {
            Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            this.transfer_type = transfer_type;
            this.source = createTransferAccountDto;
            this.sink = createTransferAccountDto2;
            this.amount = moneyDto;
            this.frequency = frequency;
        }

        public final TransferTypeDto getTransfer_type() {
            return this.transfer_type;
        }

        public /* synthetic */ Surrogate(TransferTypeDto transferTypeDto, CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2, MoneyDto moneyDto, TransferFrequencyDto transferFrequencyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? TransferTypeDto.INSTANCE.getZeroValue() : transferTypeDto, (i & 2) != 0 ? null : createTransferAccountDto, (i & 4) != 0 ? null : createTransferAccountDto2, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? TransferFrequencyDto.INSTANCE.getZeroValue() : transferFrequencyDto);
        }

        public final CreateTransferAccountDto getSource() {
            return this.source;
        }

        public final CreateTransferAccountDto getSink() {
            return this.sink;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final TransferFrequencyDto getFrequency() {
            return this.frequency;
        }
    }

    /* compiled from: GetTransferEligibilityRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto;", "Lbff_money_movement/service/v1/GetTransferEligibilityRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetTransferEligibilityRequestDto, GetTransferEligibilityRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetTransferEligibilityRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTransferEligibilityRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTransferEligibilityRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetTransferEligibilityRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetTransferEligibilityRequest> getProtoAdapter() {
            return GetTransferEligibilityRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTransferEligibilityRequestDto getZeroValue() {
            return GetTransferEligibilityRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTransferEligibilityRequestDto fromProto(GetTransferEligibilityRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            TransferTypeDto transferTypeDtoFromProto = TransferTypeDto.INSTANCE.fromProto(proto.getTransfer_type());
            CreateTransferAccount source = proto.getSource();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CreateTransferAccountDto createTransferAccountDtoFromProto = source != null ? CreateTransferAccountDto.INSTANCE.fromProto(source) : null;
            CreateTransferAccount sink = proto.getSink();
            CreateTransferAccountDto createTransferAccountDtoFromProto2 = sink != null ? CreateTransferAccountDto.INSTANCE.fromProto(sink) : null;
            Money amount = proto.getAmount();
            return new GetTransferEligibilityRequestDto(new Surrogate(transferTypeDtoFromProto, createTransferAccountDtoFromProto, createTransferAccountDtoFromProto2, amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null, TransferFrequencyDto.INSTANCE.fromProto(proto.getFrequency())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.GetTransferEligibilityRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTransferEligibilityRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetTransferEligibilityRequestDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetTransferEligibilityRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<GetTransferEligibilityRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.GetTransferEligibilityRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetTransferEligibilityRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetTransferEligibilityRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetTransferEligibilityRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetTransferEligibilityRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.GetTransferEligibilityRequestDto";
        }
    }
}
