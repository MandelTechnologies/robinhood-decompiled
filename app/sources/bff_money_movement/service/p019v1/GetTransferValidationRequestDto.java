package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.CreateTransferAccountDto;
import bff_money_movement.service.p019v1.TransferDirectionDto;
import bff_money_movement.service.p019v1.TransferStateDto;
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

/* compiled from: GetTransferValidationRequestDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b/\u0010.¨\u00064"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferValidationRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/GetTransferValidationRequest;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/GetTransferValidationRequestDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/GetTransferValidationRequestDto$Surrogate;)V", "Lbff_money_movement/service/v1/TransferStateDto;", "state", "Lbff_money_movement/service/v1/TransferDirectionDto;", "direction", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "Lbff_money_movement/service/v1/CreateTransferAccountDto;", "source", "sink", "(Lbff_money_movement/service/v1/TransferStateDto;Lbff_money_movement/service/v1/TransferDirectionDto;Lcom/robinhood/rosetta/common/MoneyDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;)V", "toProto", "()Lbff_money_movement/service/v1/GetTransferValidationRequest;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/GetTransferValidationRequestDto$Surrogate;", "getState", "()Lbff_money_movement/service/v1/TransferStateDto;", "getDirection", "()Lbff_money_movement/service/v1/TransferDirectionDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getSource", "()Lbff_money_movement/service/v1/CreateTransferAccountDto;", "getSink", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class GetTransferValidationRequestDto implements Dto3<GetTransferValidationRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetTransferValidationRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetTransferValidationRequestDto, GetTransferValidationRequest>> binaryBase64Serializer$delegate;
    private static final GetTransferValidationRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetTransferValidationRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetTransferValidationRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TransferStateDto getState() {
        return this.surrogate.getState();
    }

    public final TransferDirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final CreateTransferAccountDto getSource() {
        return this.surrogate.getSource();
    }

    public final CreateTransferAccountDto getSink() {
        return this.surrogate.getSink();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetTransferValidationRequestDto(bff_money_movement.service.p019v1.TransferStateDto r2, bff_money_movement.service.p019v1.TransferDirectionDto r3, com.robinhood.rosetta.common.MoneyDto r4, bff_money_movement.service.p019v1.CreateTransferAccountDto r5, bff_money_movement.service.p019v1.CreateTransferAccountDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto La
            bff_money_movement.service.v1.TransferStateDto$Companion r2 = bff_money_movement.service.p019v1.TransferStateDto.INSTANCE
            bff_money_movement.service.v1.TransferStateDto r2 = r2.getZeroValue()
        La:
            r8 = r7 & 2
            if (r8 == 0) goto L14
            bff_money_movement.service.v1.TransferDirectionDto$Companion r3 = bff_money_movement.service.p019v1.TransferDirectionDto.INSTANCE
            bff_money_movement.service.v1.TransferDirectionDto r3 = r3.getZeroValue()
        L14:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L1a
            r4 = r0
        L1a:
            r8 = r7 & 8
            if (r8 == 0) goto L1f
            r5 = r0
        L1f:
            r7 = r7 & 16
            if (r7 == 0) goto L2a
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L30
        L2a:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L30:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bff_money_movement.service.p019v1.GetTransferValidationRequestDto.<init>(bff_money_movement.service.v1.TransferStateDto, bff_money_movement.service.v1.TransferDirectionDto, com.robinhood.rosetta.common.MoneyDto, bff_money_movement.service.v1.CreateTransferAccountDto, bff_money_movement.service.v1.CreateTransferAccountDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetTransferValidationRequestDto(TransferStateDto state, TransferDirectionDto direction, MoneyDto moneyDto, CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2) {
        this(new Surrogate(state, direction, moneyDto, createTransferAccountDto, createTransferAccountDto2));
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetTransferValidationRequest toProto() {
        TransferState transferState = (TransferState) this.surrogate.getState().toProto();
        TransferDirection transferDirection = (TransferDirection) this.surrogate.getDirection().toProto();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        CreateTransferAccountDto source = this.surrogate.getSource();
        CreateTransferAccount proto2 = source != null ? source.toProto() : null;
        CreateTransferAccountDto sink = this.surrogate.getSink();
        return new GetTransferValidationRequest(transferState, transferDirection, proto, proto2, sink != null ? sink.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[GetTransferValidationRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetTransferValidationRequestDto) && Intrinsics.areEqual(((GetTransferValidationRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetTransferValidationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b6\u0010(\u001a\u0004\b5\u00103¨\u00069"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferValidationRequestDto$Surrogate;", "", "Lbff_money_movement/service/v1/TransferStateDto;", "state", "Lbff_money_movement/service/v1/TransferDirectionDto;", "direction", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "Lbff_money_movement/service/v1/CreateTransferAccountDto;", "source", "sink", "<init>", "(Lbff_money_movement/service/v1/TransferStateDto;Lbff_money_movement/service/v1/TransferDirectionDto;Lcom/robinhood/rosetta/common/MoneyDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/TransferStateDto;Lbff_money_movement/service/v1/TransferDirectionDto;Lcom/robinhood/rosetta/common/MoneyDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/GetTransferValidationRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/TransferStateDto;", "getState", "()Lbff_money_movement/service/v1/TransferStateDto;", "getState$annotations", "()V", "Lbff_money_movement/service/v1/TransferDirectionDto;", "getDirection", "()Lbff_money_movement/service/v1/TransferDirectionDto;", "getDirection$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount$annotations", "Lbff_money_movement/service/v1/CreateTransferAccountDto;", "getSource", "()Lbff_money_movement/service/v1/CreateTransferAccountDto;", "getSource$annotations", "getSink", "getSink$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final TransferDirectionDto direction;
        private final CreateTransferAccountDto sink;
        private final CreateTransferAccountDto source;
        private final TransferStateDto state;

        public Surrogate() {
            this((TransferStateDto) null, (TransferDirectionDto) null, (MoneyDto) null, (CreateTransferAccountDto) null, (CreateTransferAccountDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.state == surrogate.state && this.direction == surrogate.direction && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.sink, surrogate.sink);
        }

        public int hashCode() {
            int iHashCode = ((this.state.hashCode() * 31) + this.direction.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            CreateTransferAccountDto createTransferAccountDto = this.source;
            int iHashCode3 = (iHashCode2 + (createTransferAccountDto == null ? 0 : createTransferAccountDto.hashCode())) * 31;
            CreateTransferAccountDto createTransferAccountDto2 = this.sink;
            return iHashCode3 + (createTransferAccountDto2 != null ? createTransferAccountDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(state=" + this.state + ", direction=" + this.direction + ", amount=" + this.amount + ", source=" + this.source + ", sink=" + this.sink + ")";
        }

        /* compiled from: GetTransferValidationRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferValidationRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetTransferValidationRequestDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetTransferValidationRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TransferStateDto transferStateDto, TransferDirectionDto transferDirectionDto, MoneyDto moneyDto, CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2, SerializationConstructorMarker serializationConstructorMarker) {
            this.state = (i & 1) == 0 ? TransferStateDto.INSTANCE.getZeroValue() : transferStateDto;
            if ((i & 2) == 0) {
                this.direction = TransferDirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = transferDirectionDto;
            }
            if ((i & 4) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 8) == 0) {
                this.source = null;
            } else {
                this.source = createTransferAccountDto;
            }
            if ((i & 16) == 0) {
                this.sink = null;
            } else {
                this.sink = createTransferAccountDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.state != TransferStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, TransferStateDto.Serializer.INSTANCE, self.state);
            }
            if (self.direction != TransferDirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TransferDirectionDto.Serializer.INSTANCE, self.direction);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            CreateTransferAccountDto createTransferAccountDto = self.source;
            if (createTransferAccountDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CreateTransferAccountDto.Serializer.INSTANCE, createTransferAccountDto);
            }
            CreateTransferAccountDto createTransferAccountDto2 = self.sink;
            if (createTransferAccountDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CreateTransferAccountDto.Serializer.INSTANCE, createTransferAccountDto2);
            }
        }

        public Surrogate(TransferStateDto state, TransferDirectionDto direction, MoneyDto moneyDto, CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.state = state;
            this.direction = direction;
            this.amount = moneyDto;
            this.source = createTransferAccountDto;
            this.sink = createTransferAccountDto2;
        }

        public final TransferStateDto getState() {
            return this.state;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(bff_money_movement.service.p019v1.TransferStateDto r2, bff_money_movement.service.p019v1.TransferDirectionDto r3, com.robinhood.rosetta.common.MoneyDto r4, bff_money_movement.service.p019v1.CreateTransferAccountDto r5, bff_money_movement.service.p019v1.CreateTransferAccountDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto La
                bff_money_movement.service.v1.TransferStateDto$Companion r2 = bff_money_movement.service.p019v1.TransferStateDto.INSTANCE
                bff_money_movement.service.v1.TransferStateDto r2 = r2.getZeroValue()
            La:
                r8 = r7 & 2
                if (r8 == 0) goto L14
                bff_money_movement.service.v1.TransferDirectionDto$Companion r3 = bff_money_movement.service.p019v1.TransferDirectionDto.INSTANCE
                bff_money_movement.service.v1.TransferDirectionDto r3 = r3.getZeroValue()
            L14:
                r8 = r7 & 4
                r0 = 0
                if (r8 == 0) goto L1a
                r4 = r0
            L1a:
                r8 = r7 & 8
                if (r8 == 0) goto L1f
                r5 = r0
            L1f:
                r7 = r7 & 16
                if (r7 == 0) goto L2a
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L30
            L2a:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L30:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bff_money_movement.service.p019v1.GetTransferValidationRequestDto.Surrogate.<init>(bff_money_movement.service.v1.TransferStateDto, bff_money_movement.service.v1.TransferDirectionDto, com.robinhood.rosetta.common.MoneyDto, bff_money_movement.service.v1.CreateTransferAccountDto, bff_money_movement.service.v1.CreateTransferAccountDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final TransferDirectionDto getDirection() {
            return this.direction;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final CreateTransferAccountDto getSource() {
            return this.source;
        }

        public final CreateTransferAccountDto getSink() {
            return this.sink;
        }
    }

    /* compiled from: GetTransferValidationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferValidationRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/GetTransferValidationRequestDto;", "Lbff_money_movement/service/v1/GetTransferValidationRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/GetTransferValidationRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetTransferValidationRequestDto, GetTransferValidationRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetTransferValidationRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTransferValidationRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTransferValidationRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetTransferValidationRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetTransferValidationRequest> getProtoAdapter() {
            return GetTransferValidationRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTransferValidationRequestDto getZeroValue() {
            return GetTransferValidationRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTransferValidationRequestDto fromProto(GetTransferValidationRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            TransferStateDto transferStateDtoFromProto = TransferStateDto.INSTANCE.fromProto(proto.getState());
            TransferDirectionDto transferDirectionDtoFromProto = TransferDirectionDto.INSTANCE.fromProto(proto.getDirection());
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            CreateTransferAccount source = proto.getSource();
            CreateTransferAccountDto createTransferAccountDtoFromProto = source != null ? CreateTransferAccountDto.INSTANCE.fromProto(source) : null;
            CreateTransferAccount sink = proto.getSink();
            return new GetTransferValidationRequestDto(new Surrogate(transferStateDtoFromProto, transferDirectionDtoFromProto, moneyDtoFromProto, createTransferAccountDtoFromProto, sink != null ? CreateTransferAccountDto.INSTANCE.fromProto(sink) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.GetTransferValidationRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTransferValidationRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetTransferValidationRequestDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetTransferValidationRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferValidationRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetTransferValidationRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/GetTransferValidationRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<GetTransferValidationRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.GetTransferValidationRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetTransferValidationRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetTransferValidationRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetTransferValidationRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetTransferValidationRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferValidationRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.GetTransferValidationRequestDto";
        }
    }
}
