package equity_trading_tax_lots.proto.p460v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import equity_trading_tax_lots.proto.p460v1.FailureReasonDto;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategyDto;
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

/* compiled from: SetTaxLotsSelectionMethodResponseDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponse;", "Landroid/os/Parcelable;", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$Surrogate;", "surrogate", "<init>", "(Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$Surrogate;)V", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "selection_strategy", "Lequity_trading_tax_lots/proto/v1/FailureReasonDto;", "failure_reason", "Lcom/robinhood/idl/IdlDecimal;", "maximum_number_of_shares", "(Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;Lequity_trading_tax_lots/proto/v1/FailureReasonDto;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class SetTaxLotsSelectionMethodResponseDto implements Dto3<SetTaxLotsSelectionMethodResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SetTaxLotsSelectionMethodResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SetTaxLotsSelectionMethodResponseDto, SetTaxLotsSelectionMethodResponse>> binaryBase64Serializer$delegate;
    private static final SetTaxLotsSelectionMethodResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SetTaxLotsSelectionMethodResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SetTaxLotsSelectionMethodResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ SetTaxLotsSelectionMethodResponseDto(SelectionStrategyDto selectionStrategyDto, FailureReasonDto failureReasonDto, IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SelectionStrategyDto.INSTANCE.getZeroValue() : selectionStrategyDto, (i & 2) != 0 ? null : failureReasonDto, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SetTaxLotsSelectionMethodResponseDto(SelectionStrategyDto selection_strategy, FailureReasonDto failureReasonDto, IdlDecimal maximum_number_of_shares) {
        this(new Surrogate(selection_strategy, failureReasonDto, maximum_number_of_shares));
        Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
        Intrinsics.checkNotNullParameter(maximum_number_of_shares, "maximum_number_of_shares");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SetTaxLotsSelectionMethodResponse toProto() {
        SelectionStrategy selectionStrategy = (SelectionStrategy) this.surrogate.getSelection_strategy().toProto();
        FailureReasonDto failure_reason = this.surrogate.getFailure_reason();
        return new SetTaxLotsSelectionMethodResponse(selectionStrategy, failure_reason != null ? (FailureReason) failure_reason.toProto() : null, this.surrogate.getMaximum_number_of_shares().getStringValue(), null, 8, null);
    }

    public String toString() {
        return "[SetTaxLotsSelectionMethodResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SetTaxLotsSelectionMethodResponseDto) && Intrinsics.areEqual(((SetTaxLotsSelectionMethodResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: SetTaxLotsSelectionMethodResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221B6\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\u0004\b\u000b\u0010\fB9\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$Surrogate;", "", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "selection_strategy", "Lequity_trading_tax_lots/proto/v1/FailureReasonDto;", "failure_reason", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "maximum_number_of_shares", "<init>", "(Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;Lequity_trading_tax_lots/proto/v1/FailureReasonDto;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILequity_trading_tax_lots/proto/v1/SelectionStrategyDto;Lequity_trading_tax_lots/proto/v1/FailureReasonDto;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_trading_tax_lots_proto_v1_externalRelease", "(Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "getSelection_strategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "getSelection_strategy$annotations", "()V", "Lequity_trading_tax_lots/proto/v1/FailureReasonDto;", "getFailure_reason", "()Lequity_trading_tax_lots/proto/v1/FailureReasonDto;", "getFailure_reason$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getMaximum_number_of_shares", "()Lcom/robinhood/idl/IdlDecimal;", "getMaximum_number_of_shares$annotations", "Companion", "$serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FailureReasonDto failure_reason;
        private final IdlDecimal maximum_number_of_shares;
        private final SelectionStrategyDto selection_strategy;

        public Surrogate() {
            this((SelectionStrategyDto) null, (FailureReasonDto) null, (IdlDecimal) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.selection_strategy == surrogate.selection_strategy && this.failure_reason == surrogate.failure_reason && Intrinsics.areEqual(this.maximum_number_of_shares, surrogate.maximum_number_of_shares);
        }

        public int hashCode() {
            int iHashCode = this.selection_strategy.hashCode() * 31;
            FailureReasonDto failureReasonDto = this.failure_reason;
            return ((iHashCode + (failureReasonDto == null ? 0 : failureReasonDto.hashCode())) * 31) + this.maximum_number_of_shares.hashCode();
        }

        public String toString() {
            return "Surrogate(selection_strategy=" + this.selection_strategy + ", failure_reason=" + this.failure_reason + ", maximum_number_of_shares=" + this.maximum_number_of_shares + ")";
        }

        /* compiled from: SetTaxLotsSelectionMethodResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$Surrogate;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SetTaxLotsSelectionMethodResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SelectionStrategyDto selectionStrategyDto, FailureReasonDto failureReasonDto, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
            this.selection_strategy = (i & 1) == 0 ? SelectionStrategyDto.INSTANCE.getZeroValue() : selectionStrategyDto;
            if ((i & 2) == 0) {
                this.failure_reason = null;
            } else {
                this.failure_reason = failureReasonDto;
            }
            if ((i & 4) == 0) {
                this.maximum_number_of_shares = new IdlDecimal("");
            } else {
                this.maximum_number_of_shares = idlDecimal;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.selection_strategy != SelectionStrategyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, SelectionStrategyDto.Serializer.INSTANCE, self.selection_strategy);
            }
            FailureReasonDto failureReasonDto = self.failure_reason;
            if (failureReasonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, FailureReasonDto.Serializer.INSTANCE, failureReasonDto);
            }
            if (Intrinsics.areEqual(self.maximum_number_of_shares, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.maximum_number_of_shares);
        }

        public Surrogate(SelectionStrategyDto selection_strategy, FailureReasonDto failureReasonDto, IdlDecimal maximum_number_of_shares) {
            Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
            Intrinsics.checkNotNullParameter(maximum_number_of_shares, "maximum_number_of_shares");
            this.selection_strategy = selection_strategy;
            this.failure_reason = failureReasonDto;
            this.maximum_number_of_shares = maximum_number_of_shares;
        }

        public final SelectionStrategyDto getSelection_strategy() {
            return this.selection_strategy;
        }

        public /* synthetic */ Surrogate(SelectionStrategyDto selectionStrategyDto, FailureReasonDto failureReasonDto, IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SelectionStrategyDto.INSTANCE.getZeroValue() : selectionStrategyDto, (i & 2) != 0 ? null : failureReasonDto, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal);
        }

        public final FailureReasonDto getFailure_reason() {
            return this.failure_reason;
        }

        public final IdlDecimal getMaximum_number_of_shares() {
            return this.maximum_number_of_shares;
        }
    }

    /* compiled from: SetTaxLotsSelectionMethodResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto;", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SetTaxLotsSelectionMethodResponseDto, SetTaxLotsSelectionMethodResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SetTaxLotsSelectionMethodResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SetTaxLotsSelectionMethodResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SetTaxLotsSelectionMethodResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) SetTaxLotsSelectionMethodResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SetTaxLotsSelectionMethodResponse> getProtoAdapter() {
            return SetTaxLotsSelectionMethodResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SetTaxLotsSelectionMethodResponseDto getZeroValue() {
            return SetTaxLotsSelectionMethodResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SetTaxLotsSelectionMethodResponseDto fromProto(SetTaxLotsSelectionMethodResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            SelectionStrategyDto selectionStrategyDtoFromProto = SelectionStrategyDto.INSTANCE.fromProto(proto.getSelection_strategy());
            FailureReason failure_reason = proto.getFailure_reason();
            return new SetTaxLotsSelectionMethodResponseDto(new Surrogate(selectionStrategyDtoFromProto, failure_reason != null ? FailureReasonDto.INSTANCE.fromProto(failure_reason) : null, new IdlDecimal(proto.getMaximum_number_of_shares())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_trading_tax_lots.proto.v1.SetTaxLotsSelectionMethodResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SetTaxLotsSelectionMethodResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SetTaxLotsSelectionMethodResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SetTaxLotsSelectionMethodResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto;", "<init>", "()V", "surrogateSerializer", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<SetTaxLotsSelectionMethodResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/equity_trading_tax_lots.proto.v1.SetTaxLotsSelectionMethodResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SetTaxLotsSelectionMethodResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SetTaxLotsSelectionMethodResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SetTaxLotsSelectionMethodResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SetTaxLotsSelectionMethodResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "equity_trading_tax_lots.proto.v1.SetTaxLotsSelectionMethodResponseDto";
        }
    }
}
