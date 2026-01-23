package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.FundingContext;
import com.robinhood.rosetta.eventlogging.FundingContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: FundingContextDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006()*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/FundingContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FundingContextDto$Surrogate;)V", "transfer_type", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "transfer_state", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "", "transfer_amount", "", "(Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;Ljava/lang/String;D)V", "getTransfer_type", "()Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "getTransfer_state", "()Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", "getTransfer_id", "()Ljava/lang/String;", "getTransfer_amount", "()D", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "TransferTypeDto", "TransferStateDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class FundingContextDto implements Dto3<FundingContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FundingContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FundingContextDto, FundingContext>> binaryBase64Serializer$delegate;
    private static final FundingContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FundingContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FundingContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TransferTypeDto getTransfer_type() {
        return this.surrogate.getTransfer_type();
    }

    public final TransferStateDto getTransfer_state() {
        return this.surrogate.getTransfer_state();
    }

    public final String getTransfer_id() {
        return this.surrogate.getTransfer_id();
    }

    public final double getTransfer_amount() {
        return this.surrogate.getTransfer_amount();
    }

    public /* synthetic */ FundingContextDto(TransferTypeDto transferTypeDto, TransferStateDto transferStateDto, String str, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TransferTypeDto.INSTANCE.getZeroValue() : transferTypeDto, (i & 2) != 0 ? TransferStateDto.INSTANCE.getZeroValue() : transferStateDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? 0.0d : d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FundingContextDto(TransferTypeDto transfer_type, TransferStateDto transfer_state, String transfer_id, double d) {
        this(new Surrogate(transfer_type, transfer_state, transfer_id, d));
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(transfer_state, "transfer_state");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
    }

    public static /* synthetic */ FundingContextDto copy$default(FundingContextDto fundingContextDto, TransferTypeDto transferTypeDto, TransferStateDto transferStateDto, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            transferTypeDto = fundingContextDto.surrogate.getTransfer_type();
        }
        if ((i & 2) != 0) {
            transferStateDto = fundingContextDto.surrogate.getTransfer_state();
        }
        if ((i & 4) != 0) {
            str = fundingContextDto.surrogate.getTransfer_id();
        }
        if ((i & 8) != 0) {
            d = fundingContextDto.surrogate.getTransfer_amount();
        }
        String str2 = str;
        return fundingContextDto.copy(transferTypeDto, transferStateDto, str2, d);
    }

    public final FundingContextDto copy(TransferTypeDto transfer_type, TransferStateDto transfer_state, String transfer_id, double transfer_amount) {
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(transfer_state, "transfer_state");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        return new FundingContextDto(new Surrogate(transfer_type, transfer_state, transfer_id, transfer_amount));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FundingContext toProto() {
        return new FundingContext((FundingContext.TransferType) this.surrogate.getTransfer_type().toProto(), (FundingContext.TransferState) this.surrogate.getTransfer_state().toProto(), this.surrogate.getTransfer_id(), this.surrogate.getTransfer_amount(), null, 16, null);
    }

    public String toString() {
        return "[FundingContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FundingContextDto) && Intrinsics.areEqual(((FundingContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: FundingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234B>\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\u0004\b\r\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u0018\u0010$\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003J@\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0010HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR+\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 ¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$Surrogate;", "", "transfer_type", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "transfer_state", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "", "transfer_amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;Ljava/lang/String;D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;Ljava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTransfer_type$annotations", "()V", "getTransfer_type", "()Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "getTransfer_state$annotations", "getTransfer_state", "()Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", "getTransfer_id$annotations", "getTransfer_id", "()Ljava/lang/String;", "getTransfer_amount$annotations", "getTransfer_amount", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double transfer_amount;
        private final String transfer_id;
        private final TransferStateDto transfer_state;
        private final TransferTypeDto transfer_type;

        public Surrogate() {
            this((TransferTypeDto) null, (TransferStateDto) null, (String) null, 0.0d, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, TransferTypeDto transferTypeDto, TransferStateDto transferStateDto, String str, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                transferTypeDto = surrogate.transfer_type;
            }
            if ((i & 2) != 0) {
                transferStateDto = surrogate.transfer_state;
            }
            if ((i & 4) != 0) {
                str = surrogate.transfer_id;
            }
            if ((i & 8) != 0) {
                d = surrogate.transfer_amount;
            }
            String str2 = str;
            return surrogate.copy(transferTypeDto, transferStateDto, str2, d);
        }

        @SerialName("transferAmount")
        @JsonAnnotations2(names = {"transfer_amount"})
        public static /* synthetic */ void getTransfer_amount$annotations() {
        }

        @SerialName("transferId")
        @JsonAnnotations2(names = {MatchSelectionActivity.TRANSFER_ID_EXTRA})
        public static /* synthetic */ void getTransfer_id$annotations() {
        }

        @SerialName("transferState")
        @JsonAnnotations2(names = {"transfer_state"})
        public static /* synthetic */ void getTransfer_state$annotations() {
        }

        @SerialName("transferType")
        @JsonAnnotations2(names = {"transfer_type"})
        public static /* synthetic */ void getTransfer_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final TransferTypeDto getTransfer_type() {
            return this.transfer_type;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferStateDto getTransfer_state() {
            return this.transfer_state;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTransfer_id() {
            return this.transfer_id;
        }

        /* renamed from: component4, reason: from getter */
        public final double getTransfer_amount() {
            return this.transfer_amount;
        }

        public final Surrogate copy(TransferTypeDto transfer_type, TransferStateDto transfer_state, String transfer_id, double transfer_amount) {
            Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
            Intrinsics.checkNotNullParameter(transfer_state, "transfer_state");
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            return new Surrogate(transfer_type, transfer_state, transfer_id, transfer_amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.transfer_type == surrogate.transfer_type && this.transfer_state == surrogate.transfer_state && Intrinsics.areEqual(this.transfer_id, surrogate.transfer_id) && Double.compare(this.transfer_amount, surrogate.transfer_amount) == 0;
        }

        public int hashCode() {
            return (((((this.transfer_type.hashCode() * 31) + this.transfer_state.hashCode()) * 31) + this.transfer_id.hashCode()) * 31) + Double.hashCode(this.transfer_amount);
        }

        public String toString() {
            return "Surrogate(transfer_type=" + this.transfer_type + ", transfer_state=" + this.transfer_state + ", transfer_id=" + this.transfer_id + ", transfer_amount=" + this.transfer_amount + ")";
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FundingContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TransferTypeDto transferTypeDto, TransferStateDto transferStateDto, String str, double d, SerializationConstructorMarker serializationConstructorMarker) {
            this.transfer_type = (i & 1) == 0 ? TransferTypeDto.INSTANCE.getZeroValue() : transferTypeDto;
            if ((i & 2) == 0) {
                this.transfer_state = TransferStateDto.INSTANCE.getZeroValue();
            } else {
                this.transfer_state = transferStateDto;
            }
            if ((i & 4) == 0) {
                this.transfer_id = "";
            } else {
                this.transfer_id = str;
            }
            if ((i & 8) == 0) {
                this.transfer_amount = 0.0d;
            } else {
                this.transfer_amount = d;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.transfer_type != TransferTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, TransferTypeDto.Serializer.INSTANCE, self.transfer_type);
            }
            if (self.transfer_state != TransferStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TransferStateDto.Serializer.INSTANCE, self.transfer_state);
            }
            if (!Intrinsics.areEqual(self.transfer_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.transfer_id);
            }
            if (Double.compare(self.transfer_amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.transfer_amount));
            }
        }

        public Surrogate(TransferTypeDto transfer_type, TransferStateDto transfer_state, String transfer_id, double d) {
            Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
            Intrinsics.checkNotNullParameter(transfer_state, "transfer_state");
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            this.transfer_type = transfer_type;
            this.transfer_state = transfer_state;
            this.transfer_id = transfer_id;
            this.transfer_amount = d;
        }

        public final TransferTypeDto getTransfer_type() {
            return this.transfer_type;
        }

        public /* synthetic */ Surrogate(TransferTypeDto transferTypeDto, TransferStateDto transferStateDto, String str, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? TransferTypeDto.INSTANCE.getZeroValue() : transferTypeDto, (i & 2) != 0 ? TransferStateDto.INSTANCE.getZeroValue() : transferStateDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? 0.0d : d);
        }

        public final TransferStateDto getTransfer_state() {
            return this.transfer_state;
        }

        public final String getTransfer_id() {
            return this.transfer_id;
        }

        public final double getTransfer_amount() {
            return this.transfer_amount;
        }
    }

    /* compiled from: FundingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto;", "Lcom/robinhood/rosetta/eventlogging/FundingContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FundingContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FundingContextDto, FundingContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FundingContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FundingContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FundingContextDto> getBinaryBase64Serializer() {
            return (KSerializer) FundingContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FundingContext> getProtoAdapter() {
            return FundingContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FundingContextDto getZeroValue() {
            return FundingContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FundingContextDto fromProto(FundingContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new FundingContextDto(new Surrogate(TransferTypeDto.INSTANCE.fromProto(proto.getTransfer_type()), TransferStateDto.INSTANCE.fromProto(proto.getTransfer_state()), proto.getTransfer_id(), proto.getTransfer_amount()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FundingContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FundingContextDto(null, null, null, 0.0d, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FundingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_TYPE_UNSPECIFIED", "DEPOSIT", "WITHDRAWAL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TransferTypeDto implements Dto2<FundingContext.TransferType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TransferTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TransferTypeDto, FundingContext.TransferType>> binaryBase64Serializer$delegate;
        public static final TransferTypeDto TRANSFER_TYPE_UNSPECIFIED = new TRANSFER_TYPE_UNSPECIFIED("TRANSFER_TYPE_UNSPECIFIED", 0);
        public static final TransferTypeDto DEPOSIT = new DEPOSIT("DEPOSIT", 1);
        public static final TransferTypeDto WITHDRAWAL = new WITHDRAWAL("WITHDRAWAL", 2);

        private static final /* synthetic */ TransferTypeDto[] $values() {
            return new TransferTypeDto[]{TRANSFER_TYPE_UNSPECIFIED, DEPOSIT, WITHDRAWAL};
        }

        public /* synthetic */ TransferTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TransferTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FundingContextDto.TransferTypeDto.TRANSFER_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_TYPE_UNSPECIFIED extends TransferTypeDto {
            TRANSFER_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FundingContext.TransferType toProto() {
                return FundingContext.TransferType.TRANSFER_TYPE_UNSPECIFIED;
            }
        }

        private TransferTypeDto(String str, int i) {
        }

        static {
            TransferTypeDto[] transferTypeDtoArr$values = $values();
            $VALUES = transferTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FundingContextDto$TransferTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FundingContextDto.TransferTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FundingContextDto.TransferTypeDto.DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT extends TransferTypeDto {
            DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FundingContext.TransferType toProto() {
                return FundingContext.TransferType.DEPOSIT;
            }
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FundingContextDto.TransferTypeDto.WITHDRAWAL", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WITHDRAWAL extends TransferTypeDto {
            WITHDRAWAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FundingContext.TransferType toProto() {
                return FundingContext.TransferType.WITHDRAWAL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TransferTypeDto, FundingContext.TransferType> {

            /* compiled from: FundingContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FundingContext.TransferType.values().length];
                    try {
                        iArr[FundingContext.TransferType.TRANSFER_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FundingContext.TransferType.DEPOSIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FundingContext.TransferType.WITHDRAWAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TransferTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TransferTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FundingContext.TransferType> getProtoAdapter() {
                return FundingContext.TransferType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferTypeDto getZeroValue() {
                return TransferTypeDto.TRANSFER_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferTypeDto fromProto(FundingContext.TransferType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TransferTypeDto.TRANSFER_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return TransferTypeDto.DEPOSIT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return TransferTypeDto.WITHDRAWAL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TransferTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TransferTypeDto, FundingContext.TransferType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.FundingContext.TransferType", TransferTypeDto.getEntries(), TransferTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TransferTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TransferTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TransferTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TransferTypeDto valueOf(String str) {
            return (TransferTypeDto) Enum.valueOf(TransferTypeDto.class, str);
        }

        public static TransferTypeDto[] values() {
            return (TransferTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FundingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_STATE_UNSPECIFIED", "PENDING", "IN_TRANSIT", "COMPLETED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TransferStateDto implements Dto2<FundingContext.TransferState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TransferStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TransferStateDto, FundingContext.TransferState>> binaryBase64Serializer$delegate;
        public static final TransferStateDto TRANSFER_STATE_UNSPECIFIED = new TRANSFER_STATE_UNSPECIFIED("TRANSFER_STATE_UNSPECIFIED", 0);
        public static final TransferStateDto PENDING = new PENDING("PENDING", 1);
        public static final TransferStateDto IN_TRANSIT = new IN_TRANSIT("IN_TRANSIT", 2);
        public static final TransferStateDto COMPLETED = new COMPLETED("COMPLETED", 3);

        private static final /* synthetic */ TransferStateDto[] $values() {
            return new TransferStateDto[]{TRANSFER_STATE_UNSPECIFIED, PENDING, IN_TRANSIT, COMPLETED};
        }

        public /* synthetic */ TransferStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TransferStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FundingContextDto.TransferStateDto.TRANSFER_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_STATE_UNSPECIFIED extends TransferStateDto {
            TRANSFER_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FundingContext.TransferState toProto() {
                return FundingContext.TransferState.TRANSFER_STATE_UNSPECIFIED;
            }
        }

        private TransferStateDto(String str, int i) {
        }

        static {
            TransferStateDto[] transferStateDtoArr$values = $values();
            $VALUES = transferStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FundingContextDto$TransferStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FundingContextDto.TransferStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FundingContextDto.TransferStateDto.PENDING", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING extends TransferStateDto {
            PENDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FundingContext.TransferState toProto() {
                return FundingContext.TransferState.PENDING;
            }
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FundingContextDto.TransferStateDto.IN_TRANSIT", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IN_TRANSIT extends TransferStateDto {
            IN_TRANSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FundingContext.TransferState toProto() {
                return FundingContext.TransferState.IN_TRANSIT;
            }
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FundingContextDto.TransferStateDto.COMPLETED", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPLETED extends TransferStateDto {
            COMPLETED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FundingContext.TransferState toProto() {
                return FundingContext.TransferState.COMPLETED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", "Lcom/robinhood/rosetta/eventlogging/FundingContext$TransferState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TransferStateDto, FundingContext.TransferState> {

            /* compiled from: FundingContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FundingContext.TransferState.values().length];
                    try {
                        iArr[FundingContext.TransferState.TRANSFER_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FundingContext.TransferState.PENDING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FundingContext.TransferState.IN_TRANSIT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[FundingContext.TransferState.COMPLETED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TransferStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferStateDto> getBinaryBase64Serializer() {
                return (KSerializer) TransferStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FundingContext.TransferState> getProtoAdapter() {
                return FundingContext.TransferState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferStateDto getZeroValue() {
                return TransferStateDto.TRANSFER_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferStateDto fromProto(FundingContext.TransferState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TransferStateDto.TRANSFER_STATE_UNSPECIFIED;
                }
                if (i == 2) {
                    return TransferStateDto.PENDING;
                }
                if (i == 3) {
                    return TransferStateDto.IN_TRANSIT;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return TransferStateDto.COMPLETED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FundingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$TransferStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TransferStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TransferStateDto, FundingContext.TransferState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.FundingContext.TransferState", TransferStateDto.getEntries(), TransferStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TransferStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TransferStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TransferStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TransferStateDto valueOf(String str) {
            return (TransferStateDto) Enum.valueOf(TransferStateDto.class, str);
        }

        public static TransferStateDto[] values() {
            return (TransferStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: FundingContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/FundingContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<FundingContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.FundingContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FundingContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FundingContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FundingContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FundingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FundingContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.FundingContextDto";
        }
    }
}
