package microgram.contracts.money_movement.transfer_validation.proto.p501v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.GetServiceFeeResponse;
import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import bff_money_movement.service.p019v1.TransferAccountType;
import bff_money_movement.service.p019v1.TransferAccountTypeDto;
import bff_money_movement.service.p019v1.TransferFrequency;
import bff_money_movement.service.p019v1.TransferFrequencyDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.Transfer;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.TransferDto;
import rosetta.payment_hub.p540v1.service.TransferType;
import rosetta.payment_hub.p540v1.service.TransferTypeDto;

/* compiled from: TransferDto.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007/.01234B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bk\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0006\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-¨\u00065"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$Surrogate;)V", "", "id", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;", "source", "sink", "Lbff_money_movement/service/v1/TransferFrequencyDto;", "frequency", "Lrosetta/payment_hub/v1/service/TransferTypeDto;", "type", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "entry_point", "Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "service_fee", "(Ljava/lang/String;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;Lbff_money_movement/service/v1/TransferFrequencyDto;Lrosetta/payment_hub/v1/service/TransferTypeDto;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;Lbff_money_movement/service/v1/GetServiceFeeResponseDto;)V", "toProto", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$Surrogate;", "Companion", "Surrogate", "StateDto", "AccountDto", "EntryPointDto", "Serializer", "MultibindingModule", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class TransferDto implements Dto3<Transfer>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TransferDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransferDto, Transfer>> binaryBase64Serializer$delegate;
    private static final TransferDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TransferDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TransferDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TransferDto(java.lang.String r2, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.StateDto r3, com.robinhood.rosetta.common.MoneyDto r4, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.AccountDto r5, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.AccountDto r6, bff_money_movement.service.p019v1.TransferFrequencyDto r7, rosetta.payment_hub.p540v1.service.TransferTypeDto r8, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.EntryPointDto r9, bff_money_movement.service.p019v1.GetServiceFeeResponseDto r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto L10
            microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$StateDto$Companion r3 = microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.StateDto.INSTANCE
            microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$StateDto r3 = r3.getZeroValue()
        L10:
            r12 = r11 & 4
            r0 = 0
            if (r12 == 0) goto L16
            r4 = r0
        L16:
            r12 = r11 & 8
            if (r12 == 0) goto L1b
            r5 = r0
        L1b:
            r12 = r11 & 16
            if (r12 == 0) goto L20
            r6 = r0
        L20:
            r12 = r11 & 32
            if (r12 == 0) goto L2a
            bff_money_movement.service.v1.TransferFrequencyDto$Companion r7 = bff_money_movement.service.p019v1.TransferFrequencyDto.INSTANCE
            bff_money_movement.service.v1.TransferFrequencyDto r7 = r7.getZeroValue()
        L2a:
            r12 = r11 & 64
            if (r12 == 0) goto L34
            rosetta.payment_hub.v1.service.TransferTypeDto$Companion r8 = rosetta.payment_hub.p540v1.service.TransferTypeDto.INSTANCE
            rosetta.payment_hub.v1.service.TransferTypeDto r8 = r8.getZeroValue()
        L34:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L3e
            microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$EntryPointDto$Companion r9 = microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.EntryPointDto.INSTANCE
            microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$EntryPointDto r9 = r9.getZeroValue()
        L3e:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L4d
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L57
        L4d:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L57:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: microgram.contracts.money_movement.transfer_validation.proto.p501v1.TransferDto.<init>(java.lang.String, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$StateDto, com.robinhood.rosetta.common.MoneyDto, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$AccountDto, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$AccountDto, bff_money_movement.service.v1.TransferFrequencyDto, rosetta.payment_hub.v1.service.TransferTypeDto, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$EntryPointDto, bff_money_movement.service.v1.GetServiceFeeResponseDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferDto(String id, StateDto state, MoneyDto moneyDto, AccountDto accountDto, AccountDto accountDto2, TransferFrequencyDto frequency, TransferTypeDto type2, EntryPointDto entry_point, GetServiceFeeResponseDto getServiceFeeResponseDto) {
        this(new Surrogate(id, state, moneyDto, accountDto, accountDto2, frequency, type2, entry_point, getServiceFeeResponseDto));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Transfer toProto() {
        String id = this.surrogate.getId();
        Transfer.State state = (Transfer.State) this.surrogate.getState().toProto();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        AccountDto source = this.surrogate.getSource();
        Transfer.Account proto2 = source != null ? source.toProto() : null;
        AccountDto sink = this.surrogate.getSink();
        Transfer.Account proto3 = sink != null ? sink.toProto() : null;
        TransferFrequency transferFrequency = (TransferFrequency) this.surrogate.getFrequency().toProto();
        TransferType transferType = (TransferType) this.surrogate.getType().toProto();
        Transfer.EntryPoint entryPoint = (Transfer.EntryPoint) this.surrogate.getEntry_point().toProto();
        GetServiceFeeResponseDto service_fee = this.surrogate.getService_fee();
        return new Transfer(id, state, proto, proto2, proto3, transferFrequency, transferType, entryPoint, service_fee != null ? service_fee.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[TransferDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TransferDto) && Intrinsics.areEqual(((TransferDto) other).surrogate, this.surrogate);
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
    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b'\b\u0083\b\u0018\u0000 M2\u00020\u0001:\u0002NMBi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bu\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b<\u0010.\u001a\u0004\b;\u00109R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010A\u0012\u0004\bD\u0010.\u001a\u0004\bB\u0010CR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010E\u0012\u0004\bH\u0010.\u001a\u0004\bF\u0010GR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010I\u0012\u0004\bL\u0010.\u001a\u0004\bJ\u0010K¨\u0006O"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$Surrogate;", "", "", "id", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;", "source", "sink", "Lbff_money_movement/service/v1/TransferFrequencyDto;", "frequency", "Lrosetta/payment_hub/v1/service/TransferTypeDto;", "type", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "entry_point", "Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "service_fee", "<init>", "(Ljava/lang/String;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;Lbff_money_movement/service/v1/TransferFrequencyDto;Lrosetta/payment_hub/v1/service/TransferTypeDto;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;Lbff_money_movement/service/v1/GetServiceFeeResponseDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;Lbff_money_movement/service/v1/TransferFrequencyDto;Lrosetta/payment_hub/v1/service/TransferTypeDto;Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;Lbff_money_movement/service/v1/GetServiceFeeResponseDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_money_movement_transfer_validation_proto_v1_externalRelease", "(Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "getState", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "getState$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount$annotations", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;", "getSource", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;", "getSource$annotations", "getSink", "getSink$annotations", "Lbff_money_movement/service/v1/TransferFrequencyDto;", "getFrequency", "()Lbff_money_movement/service/v1/TransferFrequencyDto;", "getFrequency$annotations", "Lrosetta/payment_hub/v1/service/TransferTypeDto;", "getType", "()Lrosetta/payment_hub/v1/service/TransferTypeDto;", "getType$annotations", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "getEntry_point", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "getEntry_point$annotations", "Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "getService_fee", "()Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "getService_fee$annotations", "Companion", "$serializer", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final EntryPointDto entry_point;
        private final TransferFrequencyDto frequency;
        private final String id;
        private final GetServiceFeeResponseDto service_fee;
        private final AccountDto sink;
        private final AccountDto source;
        private final StateDto state;
        private final TransferTypeDto type;

        public Surrogate() {
            this((String) null, (StateDto) null, (MoneyDto) null, (AccountDto) null, (AccountDto) null, (TransferFrequencyDto) null, (TransferTypeDto) null, (EntryPointDto) null, (GetServiceFeeResponseDto) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.state == surrogate.state && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.sink, surrogate.sink) && this.frequency == surrogate.frequency && this.type == surrogate.type && this.entry_point == surrogate.entry_point && Intrinsics.areEqual(this.service_fee, surrogate.service_fee);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.state.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            AccountDto accountDto = this.source;
            int iHashCode3 = (iHashCode2 + (accountDto == null ? 0 : accountDto.hashCode())) * 31;
            AccountDto accountDto2 = this.sink;
            int iHashCode4 = (((((((iHashCode3 + (accountDto2 == null ? 0 : accountDto2.hashCode())) * 31) + this.frequency.hashCode()) * 31) + this.type.hashCode()) * 31) + this.entry_point.hashCode()) * 31;
            GetServiceFeeResponseDto getServiceFeeResponseDto = this.service_fee;
            return iHashCode4 + (getServiceFeeResponseDto != null ? getServiceFeeResponseDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", state=" + this.state + ", amount=" + this.amount + ", source=" + this.source + ", sink=" + this.sink + ", frequency=" + this.frequency + ", type=" + this.type + ", entry_point=" + this.entry_point + ", service_fee=" + this.service_fee + ")";
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$Surrogate;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TransferDto5.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, StateDto stateDto, MoneyDto moneyDto, AccountDto accountDto, AccountDto accountDto2, TransferFrequencyDto transferFrequencyDto, TransferTypeDto transferTypeDto, EntryPointDto entryPointDto, GetServiceFeeResponseDto getServiceFeeResponseDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.state = StateDto.INSTANCE.getZeroValue();
            } else {
                this.state = stateDto;
            }
            if ((i & 4) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 8) == 0) {
                this.source = null;
            } else {
                this.source = accountDto;
            }
            if ((i & 16) == 0) {
                this.sink = null;
            } else {
                this.sink = accountDto2;
            }
            if ((i & 32) == 0) {
                this.frequency = TransferFrequencyDto.INSTANCE.getZeroValue();
            } else {
                this.frequency = transferFrequencyDto;
            }
            if ((i & 64) == 0) {
                this.type = TransferTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = transferTypeDto;
            }
            if ((i & 128) == 0) {
                this.entry_point = EntryPointDto.INSTANCE.getZeroValue();
            } else {
                this.entry_point = entryPointDto;
            }
            if ((i & 256) == 0) {
                this.service_fee = null;
            } else {
                this.service_fee = getServiceFeeResponseDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$contracts_money_movement_transfer_validation_proto_v1_externalRelease */
        public static final /* synthetic */ void m3808xfe6db2c1(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.state != StateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, StateDto.Serializer.INSTANCE, self.state);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            AccountDto accountDto = self.source;
            if (accountDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AccountDto.Serializer.INSTANCE, accountDto);
            }
            AccountDto accountDto2 = self.sink;
            if (accountDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, AccountDto.Serializer.INSTANCE, accountDto2);
            }
            if (self.frequency != TransferFrequencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, TransferFrequencyDto.Serializer.INSTANCE, self.frequency);
            }
            if (self.type != TransferTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, TransferTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.entry_point != EntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, EntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
            GetServiceFeeResponseDto getServiceFeeResponseDto = self.service_fee;
            if (getServiceFeeResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, GetServiceFeeResponseDto.Serializer.INSTANCE, getServiceFeeResponseDto);
            }
        }

        public Surrogate(String id, StateDto state, MoneyDto moneyDto, AccountDto accountDto, AccountDto accountDto2, TransferFrequencyDto frequency, TransferTypeDto type2, EntryPointDto entry_point, GetServiceFeeResponseDto getServiceFeeResponseDto) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            this.id = id;
            this.state = state;
            this.amount = moneyDto;
            this.source = accountDto;
            this.sink = accountDto2;
            this.frequency = frequency;
            this.type = type2;
            this.entry_point = entry_point;
            this.service_fee = getServiceFeeResponseDto;
        }

        public final String getId() {
            return this.id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.StateDto r3, com.robinhood.rosetta.common.MoneyDto r4, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.AccountDto r5, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.AccountDto r6, bff_money_movement.service.p019v1.TransferFrequencyDto r7, rosetta.payment_hub.p540v1.service.TransferTypeDto r8, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.EntryPointDto r9, bff_money_movement.service.p019v1.GetServiceFeeResponseDto r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r1 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r12 = r11 & 2
                if (r12 == 0) goto L10
                microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$StateDto$Companion r3 = microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.StateDto.INSTANCE
                microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$StateDto r3 = r3.getZeroValue()
            L10:
                r12 = r11 & 4
                r0 = 0
                if (r12 == 0) goto L16
                r4 = r0
            L16:
                r12 = r11 & 8
                if (r12 == 0) goto L1b
                r5 = r0
            L1b:
                r12 = r11 & 16
                if (r12 == 0) goto L20
                r6 = r0
            L20:
                r12 = r11 & 32
                if (r12 == 0) goto L2a
                bff_money_movement.service.v1.TransferFrequencyDto$Companion r7 = bff_money_movement.service.p019v1.TransferFrequencyDto.INSTANCE
                bff_money_movement.service.v1.TransferFrequencyDto r7 = r7.getZeroValue()
            L2a:
                r12 = r11 & 64
                if (r12 == 0) goto L34
                rosetta.payment_hub.v1.service.TransferTypeDto$Companion r8 = rosetta.payment_hub.p540v1.service.TransferTypeDto.INSTANCE
                rosetta.payment_hub.v1.service.TransferTypeDto r8 = r8.getZeroValue()
            L34:
                r12 = r11 & 128(0x80, float:1.794E-43)
                if (r12 == 0) goto L3e
                microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$EntryPointDto$Companion r9 = microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto.EntryPointDto.INSTANCE
                microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$EntryPointDto r9 = r9.getZeroValue()
            L3e:
                r11 = r11 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L4d
                r12 = r0
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L57
            L4d:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L57:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: microgram.contracts.money_movement.transfer_validation.proto.p501v1.TransferDto.Surrogate.<init>(java.lang.String, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$StateDto, com.robinhood.rosetta.common.MoneyDto, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$AccountDto, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$AccountDto, bff_money_movement.service.v1.TransferFrequencyDto, rosetta.payment_hub.v1.service.TransferTypeDto, microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$EntryPointDto, bff_money_movement.service.v1.GetServiceFeeResponseDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final StateDto getState() {
            return this.state;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final AccountDto getSource() {
            return this.source;
        }

        public final AccountDto getSink() {
            return this.sink;
        }

        public final TransferFrequencyDto getFrequency() {
            return this.frequency;
        }

        public final TransferTypeDto getType() {
            return this.type;
        }

        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        public final GetServiceFeeResponseDto getService_fee() {
            return this.service_fee;
        }
    }

    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TransferDto, Transfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferDto> getBinaryBase64Serializer() {
            return (KSerializer) TransferDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Transfer> getProtoAdapter() {
            return Transfer.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferDto getZeroValue() {
            return TransferDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferDto fromProto(Transfer proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            StateDto stateDtoFromProto = StateDto.INSTANCE.fromProto(proto.getState());
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            Transfer.Account source = proto.getSource();
            AccountDto accountDtoFromProto = source != null ? AccountDto.INSTANCE.fromProto(source) : null;
            Transfer.Account sink = proto.getSink();
            AccountDto accountDtoFromProto2 = sink != null ? AccountDto.INSTANCE.fromProto(sink) : null;
            TransferFrequencyDto transferFrequencyDtoFromProto = TransferFrequencyDto.INSTANCE.fromProto(proto.getFrequency());
            TransferTypeDto transferTypeDtoFromProto = TransferTypeDto.INSTANCE.fromProto(proto.getType());
            EntryPointDto entryPointDtoFromProto = EntryPointDto.INSTANCE.fromProto(proto.getEntry_point());
            GetServiceFeeResponse service_fee = proto.getService_fee();
            return new TransferDto(new Surrogate(id, stateDtoFromProto, moneyDtoFromProto, accountDtoFromProto, accountDtoFromProto2, transferFrequencyDtoFromProto, transferTypeDtoFromProto, entryPointDtoFromProto, service_fee != null ? GetServiceFeeResponseDto.INSTANCE.fromProto(service_fee) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TransferDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "Lcom/robinhood/idl/EnumDto;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_UNSPECIFIED", "STATE_CREATE", "STATE_REVIEW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StateDto implements Dto2<Transfer.State>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StateDto, Transfer.State>> binaryBase64Serializer$delegate;
        public static final StateDto STATE_UNSPECIFIED = new STATE_UNSPECIFIED("STATE_UNSPECIFIED", 0);
        public static final StateDto STATE_CREATE = new STATE_CREATE("STATE_CREATE", 1);
        public static final StateDto STATE_REVIEW = new STATE_REVIEW("STATE_REVIEW", 2);

        private static final /* synthetic */ StateDto[] $values() {
            return new StateDto[]{STATE_UNSPECIFIED, STATE_CREATE, STATE_REVIEW};
        }

        public /* synthetic */ StateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<StateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/contracts/money_movement/transfer_validation/proto/v1/TransferDto.StateDto.STATE_UNSPECIFIED", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "toProto", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_UNSPECIFIED extends StateDto {
            STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Transfer.State toProto() {
                return Transfer.State.STATE_UNSPECIFIED;
            }
        }

        private StateDto(String str, int i) {
        }

        static {
            StateDto[] stateDtoArr$values = $values();
            $VALUES = stateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$StateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferDto.StateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/contracts/money_movement/transfer_validation/proto/v1/TransferDto.StateDto.STATE_CREATE", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "toProto", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_CREATE extends StateDto {
            STATE_CREATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Transfer.State toProto() {
                return Transfer.State.STATE_CREATE;
            }
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/contracts/money_movement/transfer_validation/proto/v1/TransferDto.StateDto.STATE_REVIEW", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "toProto", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_REVIEW extends StateDto {
            STATE_REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Transfer.State toProto() {
                return Transfer.State.STATE_REVIEW;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StateDto, Transfer.State> {

            /* compiled from: TransferDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Transfer.State.values().length];
                    try {
                        iArr[Transfer.State.STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Transfer.State.STATE_CREATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Transfer.State.STATE_REVIEW.ordinal()] = 3;
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

            public final KSerializer<StateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StateDto> getBinaryBase64Serializer() {
                return (KSerializer) StateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Transfer.State> getProtoAdapter() {
                return Transfer.State.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto getZeroValue() {
                return StateDto.STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto fromProto(Transfer.State proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return StateDto.STATE_UNSPECIFIED;
                }
                if (i == 2) {
                    return StateDto.STATE_CREATE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return StateDto.STATE_REVIEW;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$StateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<StateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StateDto, Transfer.State> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer.State", StateDto.getEntries(), StateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public StateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (StateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"!#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006%"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$Account;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$Surrogate;)V", "", "id", "Lbff_money_movement/service/v1/TransferAccountTypeDto;", "type", "(Ljava/lang/String;Lbff_money_movement/service/v1/TransferAccountTypeDto;)V", "toProto", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$Account;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AccountDto implements Dto3<Transfer.Account>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<AccountDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AccountDto, Transfer.Account>> binaryBase64Serializer$delegate;
        private static final AccountDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ AccountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AccountDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AccountDto(String id, TransferAccountTypeDto type2) {
            this(new Surrogate(id, type2));
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
        }

        public /* synthetic */ AccountDto(String str, TransferAccountTypeDto transferAccountTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TransferAccountTypeDto.INSTANCE.getZeroValue() : transferAccountTypeDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public Transfer.Account toProto() {
            return new Transfer.Account(this.surrogate.getId(), (TransferAccountType) this.surrogate.getType().toProto(), null, 4, null);
        }

        public String toString() {
            return "[AccountDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof AccountDto) && Intrinsics.areEqual(((AccountDto) other).surrogate, this.surrogate);
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
        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006("}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$Surrogate;", "", "", "id", "Lbff_money_movement/service/v1/TransferAccountTypeDto;", "type", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/TransferAccountTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbff_money_movement/service/v1/TransferAccountTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_money_movement_transfer_validation_proto_v1_externalRelease", "(Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lbff_money_movement/service/v1/TransferAccountTypeDto;", "getType", "()Lbff_money_movement/service/v1/TransferAccountTypeDto;", "getType$annotations", "Companion", "$serializer", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String id;
            private final TransferAccountTypeDto type;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, (TransferAccountTypeDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.id, surrogate.id) && this.type == surrogate.type;
            }

            public int hashCode() {
                return (this.id.hashCode() * 31) + this.type.hashCode();
            }

            public String toString() {
                return "Surrogate(id=" + this.id + ", type=" + this.type + ")";
            }

            /* compiled from: TransferDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$Surrogate;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return TransferDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, TransferAccountTypeDto transferAccountTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.id = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.type = TransferAccountTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.type = transferAccountTypeDto;
                }
            }

            @JvmStatic
            /* renamed from: write$Self$contracts_money_movement_transfer_validation_proto_v1_externalRelease */
            public static final /* synthetic */ void m3807xfe6db2c1(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.id);
                }
                if (self.type != TransferAccountTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, TransferAccountTypeDto.Serializer.INSTANCE, self.type);
                }
            }

            public Surrogate(String id, TransferAccountTypeDto type2) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(type2, "type");
                this.id = id;
                this.type = type2;
            }

            public final String getId() {
                return this.id;
            }

            public /* synthetic */ Surrogate(String str, TransferAccountTypeDto transferAccountTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TransferAccountTypeDto.INSTANCE.getZeroValue() : transferAccountTypeDto);
            }

            public final TransferAccountTypeDto getType() {
                return this.type;
            }
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$Account;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<AccountDto, Transfer.Account> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AccountDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AccountDto> getBinaryBase64Serializer() {
                return (KSerializer) AccountDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Transfer.Account> getProtoAdapter() {
                return Transfer.Account.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountDto getZeroValue() {
                return AccountDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountDto fromProto(Transfer.Account proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new AccountDto(new Surrogate(proto.getId(), TransferAccountTypeDto.INSTANCE.fromProto(proto.getType())), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$AccountDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferDto.AccountDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new AccountDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AccountDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer.Account", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AccountDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public AccountDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new AccountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$AccountDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_POINT_UNSPECIFIED", "ENTRY_POINT_RECURRING_DEPOSIT_UPSELL", "ENTRY_POINT_RECURRING_TRANSFER_HUB", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<Transfer.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, Transfer.EntryPoint>> binaryBase64Serializer$delegate;
        public static final EntryPointDto ENTRY_POINT_UNSPECIFIED = new ENTRY_POINT_UNSPECIFIED("ENTRY_POINT_UNSPECIFIED", 0);
        public static final EntryPointDto ENTRY_POINT_RECURRING_DEPOSIT_UPSELL = new ENTRY_POINT_RECURRING_DEPOSIT_UPSELL("ENTRY_POINT_RECURRING_DEPOSIT_UPSELL", 1);
        public static final EntryPointDto ENTRY_POINT_RECURRING_TRANSFER_HUB = new ENTRY_POINT_RECURRING_TRANSFER_HUB("ENTRY_POINT_RECURRING_TRANSFER_HUB", 2);

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{ENTRY_POINT_UNSPECIFIED, ENTRY_POINT_RECURRING_DEPOSIT_UPSELL, ENTRY_POINT_RECURRING_TRANSFER_HUB};
        }

        public /* synthetic */ EntryPointDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EntryPointDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/contracts/money_movement/transfer_validation/proto/v1/TransferDto.EntryPointDto.ENTRY_POINT_UNSPECIFIED", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "toProto", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_UNSPECIFIED extends EntryPointDto {
            ENTRY_POINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Transfer.EntryPoint toProto() {
                return Transfer.EntryPoint.ENTRY_POINT_UNSPECIFIED;
            }
        }

        private EntryPointDto(String str, int i) {
        }

        static {
            EntryPointDto[] entryPointDtoArr$values = $values();
            $VALUES = entryPointDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/contracts/money_movement/transfer_validation/proto/v1/TransferDto.EntryPointDto.ENTRY_POINT_RECURRING_DEPOSIT_UPSELL", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "toProto", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_RECURRING_DEPOSIT_UPSELL extends EntryPointDto {
            ENTRY_POINT_RECURRING_DEPOSIT_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Transfer.EntryPoint toProto() {
                return Transfer.EntryPoint.ENTRY_POINT_RECURRING_DEPOSIT_UPSELL;
            }
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/contracts/money_movement/transfer_validation/proto/v1/TransferDto.EntryPointDto.ENTRY_POINT_RECURRING_TRANSFER_HUB", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "toProto", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_RECURRING_TRANSFER_HUB extends EntryPointDto {
            ENTRY_POINT_RECURRING_TRANSFER_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Transfer.EntryPoint toProto() {
                return Transfer.EntryPoint.ENTRY_POINT_RECURRING_TRANSFER_HUB;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, Transfer.EntryPoint> {

            /* compiled from: TransferDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Transfer.EntryPoint.values().length];
                    try {
                        iArr[Transfer.EntryPoint.ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Transfer.EntryPoint.ENTRY_POINT_RECURRING_DEPOSIT_UPSELL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Transfer.EntryPoint.ENTRY_POINT_RECURRING_TRANSFER_HUB.ordinal()] = 3;
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

            public final KSerializer<EntryPointDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getBinaryBase64Serializer() {
                return (KSerializer) EntryPointDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Transfer.EntryPoint> getProtoAdapter() {
                return Transfer.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(Transfer.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
                }
                if (i == 2) {
                    return EntryPointDto.ENTRY_POINT_RECURRING_DEPOSIT_UPSELL;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return EntryPointDto.ENTRY_POINT_RECURRING_TRANSFER_HUB;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TransferDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, Transfer.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EntryPointDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EntryPointDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EntryPointDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EntryPointDto valueOf(String str) {
            return (EntryPointDto) Enum.valueOf(EntryPointDto.class, str);
        }

        public static EntryPointDto[] values() {
            return (EntryPointDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TransferDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TransferDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TransferDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TransferDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TransferDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "microgram.contracts.money_movement.transfer_validation.proto.v1.TransferDto";
        }
    }
}
