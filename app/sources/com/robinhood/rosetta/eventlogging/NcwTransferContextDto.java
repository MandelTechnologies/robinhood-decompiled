package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.CryptoWalletAssetBalanceDto;
import com.robinhood.rosetta.eventlogging.NcwTransferContext;
import com.robinhood.rosetta.eventlogging.NcwTransferContextDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: NcwTransferContextDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b456789:;B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0006\u0010\u0016JN\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u0015H\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020-H\u0016J\b\u00103\u001a\u00020-H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$Surrogate;)V", "currency", "Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;", "transfer_type", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "amount", "", "status", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "error", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "input_style", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "connect_id", "", "(Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;DLcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;Ljava/lang/String;)V", "getCurrency", "()Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;", "getTransfer_type", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "getAmount", "()D", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "getError", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "getInput_style", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "getConnect_id", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "TransferTypeDto", "ErrorDto", "TransferStatusDto", "InputStyleDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NcwTransferContextDto implements Dto3<NcwTransferContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NcwTransferContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NcwTransferContextDto, NcwTransferContext>> binaryBase64Serializer$delegate;
    private static final NcwTransferContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NcwTransferContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NcwTransferContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CryptoWalletAssetBalanceDto getCurrency() {
        return this.surrogate.getCurrency();
    }

    public final TransferTypeDto getTransfer_type() {
        return this.surrogate.getTransfer_type();
    }

    public final double getAmount() {
        return this.surrogate.getAmount();
    }

    public final TransferStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final ErrorDto getError() {
        return this.surrogate.getError();
    }

    public final InputStyleDto getInput_style() {
        return this.surrogate.getInput_style();
    }

    public final String getConnect_id() {
        return this.surrogate.getConnect_id();
    }

    public /* synthetic */ NcwTransferContextDto(CryptoWalletAssetBalanceDto cryptoWalletAssetBalanceDto, TransferTypeDto transferTypeDto, double d, TransferStatusDto transferStatusDto, ErrorDto errorDto, InputStyleDto inputStyleDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoWalletAssetBalanceDto, (i & 2) != 0 ? TransferTypeDto.INSTANCE.getZeroValue() : transferTypeDto, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? TransferStatusDto.INSTANCE.getZeroValue() : transferStatusDto, (i & 16) != 0 ? ErrorDto.INSTANCE.getZeroValue() : errorDto, (i & 32) != 0 ? InputStyleDto.INSTANCE.getZeroValue() : inputStyleDto, (i & 64) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NcwTransferContextDto(CryptoWalletAssetBalanceDto cryptoWalletAssetBalanceDto, TransferTypeDto transfer_type, double d, TransferStatusDto status, ErrorDto error, InputStyleDto input_style, String connect_id) {
        this(new Surrogate(cryptoWalletAssetBalanceDto, transfer_type, d, status, error, input_style, connect_id));
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(input_style, "input_style");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
    }

    public static /* synthetic */ NcwTransferContextDto copy$default(NcwTransferContextDto ncwTransferContextDto, CryptoWalletAssetBalanceDto cryptoWalletAssetBalanceDto, TransferTypeDto transferTypeDto, double d, TransferStatusDto transferStatusDto, ErrorDto errorDto, InputStyleDto inputStyleDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoWalletAssetBalanceDto = ncwTransferContextDto.surrogate.getCurrency();
        }
        if ((i & 2) != 0) {
            transferTypeDto = ncwTransferContextDto.surrogate.getTransfer_type();
        }
        if ((i & 4) != 0) {
            d = ncwTransferContextDto.surrogate.getAmount();
        }
        if ((i & 8) != 0) {
            transferStatusDto = ncwTransferContextDto.surrogate.getStatus();
        }
        if ((i & 16) != 0) {
            errorDto = ncwTransferContextDto.surrogate.getError();
        }
        if ((i & 32) != 0) {
            inputStyleDto = ncwTransferContextDto.surrogate.getInput_style();
        }
        if ((i & 64) != 0) {
            str = ncwTransferContextDto.surrogate.getConnect_id();
        }
        double d2 = d;
        return ncwTransferContextDto.copy(cryptoWalletAssetBalanceDto, transferTypeDto, d2, transferStatusDto, errorDto, inputStyleDto, str);
    }

    public final NcwTransferContextDto copy(CryptoWalletAssetBalanceDto currency, TransferTypeDto transfer_type, double amount, TransferStatusDto status, ErrorDto error, InputStyleDto input_style, String connect_id) {
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(input_style, "input_style");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        return new NcwTransferContextDto(new Surrogate(currency, transfer_type, amount, status, error, input_style, connect_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NcwTransferContext toProto() {
        CryptoWalletAssetBalanceDto currency = this.surrogate.getCurrency();
        return new NcwTransferContext(currency != null ? currency.toProto() : null, (NcwTransferContext.TransferType) this.surrogate.getTransfer_type().toProto(), this.surrogate.getAmount(), (NcwTransferContext.TransferStatus) this.surrogate.getStatus().toProto(), (NcwTransferContext.Error) this.surrogate.getError().toProto(), (NcwTransferContext.InputStyle) this.surrogate.getInput_style().toProto(), this.surrogate.getConnect_id(), null, 128, null);
    }

    public String toString() {
        return "[NcwTransferContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NcwTransferContextDto) && Intrinsics.areEqual(((NcwTransferContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: NcwTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 F2\u00020\u0001:\u0002EFB^\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014B_\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0013\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u0018\u00102\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\t\u00106\u001a\u00020\u0012HÆ\u0003J`\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0016HÖ\u0001J\t\u0010<\u001a\u00020\u0012HÖ\u0001J%\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0001¢\u0006\u0002\bDR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010/¨\u0006G"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$Surrogate;", "", "currency", "Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;", "transfer_type", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "status", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "error", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "input_style", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "connect_id", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;DLcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;DLcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCurrency$annotations", "()V", "getCurrency", "()Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;", "getTransfer_type$annotations", "getTransfer_type", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "getAmount$annotations", "getAmount", "()D", "getStatus$annotations", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "getError$annotations", "getError", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "getInput_style$annotations", "getInput_style", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "getConnect_id$annotations", "getConnect_id", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double amount;
        private final String connect_id;
        private final CryptoWalletAssetBalanceDto currency;
        private final ErrorDto error;
        private final InputStyleDto input_style;
        private final TransferStatusDto status;
        private final TransferTypeDto transfer_type;

        public Surrogate() {
            this((CryptoWalletAssetBalanceDto) null, (TransferTypeDto) null, 0.0d, (TransferStatusDto) null, (ErrorDto) null, (InputStyleDto) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CryptoWalletAssetBalanceDto cryptoWalletAssetBalanceDto, TransferTypeDto transferTypeDto, double d, TransferStatusDto transferStatusDto, ErrorDto errorDto, InputStyleDto inputStyleDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoWalletAssetBalanceDto = surrogate.currency;
            }
            if ((i & 2) != 0) {
                transferTypeDto = surrogate.transfer_type;
            }
            if ((i & 4) != 0) {
                d = surrogate.amount;
            }
            if ((i & 8) != 0) {
                transferStatusDto = surrogate.status;
            }
            if ((i & 16) != 0) {
                errorDto = surrogate.error;
            }
            if ((i & 32) != 0) {
                inputStyleDto = surrogate.input_style;
            }
            if ((i & 64) != 0) {
                str = surrogate.connect_id;
            }
            double d2 = d;
            return surrogate.copy(cryptoWalletAssetBalanceDto, transferTypeDto, d2, transferStatusDto, errorDto, inputStyleDto, str);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("connectId")
        @JsonAnnotations2(names = {"connect_id"})
        public static /* synthetic */ void getConnect_id$annotations() {
        }

        @SerialName("currency")
        @JsonAnnotations2(names = {"currency"})
        public static /* synthetic */ void getCurrency$annotations() {
        }

        @SerialName("error")
        @JsonAnnotations2(names = {"error"})
        public static /* synthetic */ void getError$annotations() {
        }

        @SerialName("inputStyle")
        @JsonAnnotations2(names = {"input_style"})
        public static /* synthetic */ void getInput_style$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        @SerialName("transferType")
        @JsonAnnotations2(names = {"transfer_type"})
        public static /* synthetic */ void getTransfer_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoWalletAssetBalanceDto getCurrency() {
            return this.currency;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferTypeDto getTransfer_type() {
            return this.transfer_type;
        }

        /* renamed from: component3, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final ErrorDto getError() {
            return this.error;
        }

        /* renamed from: component6, reason: from getter */
        public final InputStyleDto getInput_style() {
            return this.input_style;
        }

        /* renamed from: component7, reason: from getter */
        public final String getConnect_id() {
            return this.connect_id;
        }

        public final Surrogate copy(CryptoWalletAssetBalanceDto currency, TransferTypeDto transfer_type, double amount, TransferStatusDto status, ErrorDto error, InputStyleDto input_style, String connect_id) {
            Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(input_style, "input_style");
            Intrinsics.checkNotNullParameter(connect_id, "connect_id");
            return new Surrogate(currency, transfer_type, amount, status, error, input_style, connect_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.currency, surrogate.currency) && this.transfer_type == surrogate.transfer_type && Double.compare(this.amount, surrogate.amount) == 0 && this.status == surrogate.status && this.error == surrogate.error && this.input_style == surrogate.input_style && Intrinsics.areEqual(this.connect_id, surrogate.connect_id);
        }

        public int hashCode() {
            CryptoWalletAssetBalanceDto cryptoWalletAssetBalanceDto = this.currency;
            return ((((((((((((cryptoWalletAssetBalanceDto == null ? 0 : cryptoWalletAssetBalanceDto.hashCode()) * 31) + this.transfer_type.hashCode()) * 31) + Double.hashCode(this.amount)) * 31) + this.status.hashCode()) * 31) + this.error.hashCode()) * 31) + this.input_style.hashCode()) * 31) + this.connect_id.hashCode();
        }

        public String toString() {
            return "Surrogate(currency=" + this.currency + ", transfer_type=" + this.transfer_type + ", amount=" + this.amount + ", status=" + this.status + ", error=" + this.error + ", input_style=" + this.input_style + ", connect_id=" + this.connect_id + ")";
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NcwTransferContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CryptoWalletAssetBalanceDto cryptoWalletAssetBalanceDto, TransferTypeDto transferTypeDto, double d, TransferStatusDto transferStatusDto, ErrorDto errorDto, InputStyleDto inputStyleDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.currency = (i & 1) == 0 ? null : cryptoWalletAssetBalanceDto;
            if ((i & 2) == 0) {
                this.transfer_type = TransferTypeDto.INSTANCE.getZeroValue();
            } else {
                this.transfer_type = transferTypeDto;
            }
            if ((i & 4) == 0) {
                this.amount = 0.0d;
            } else {
                this.amount = d;
            }
            if ((i & 8) == 0) {
                this.status = TransferStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = transferStatusDto;
            }
            if ((i & 16) == 0) {
                this.error = ErrorDto.INSTANCE.getZeroValue();
            } else {
                this.error = errorDto;
            }
            if ((i & 32) == 0) {
                this.input_style = InputStyleDto.INSTANCE.getZeroValue();
            } else {
                this.input_style = inputStyleDto;
            }
            if ((i & 64) == 0) {
                this.connect_id = "";
            } else {
                this.connect_id = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            CryptoWalletAssetBalanceDto cryptoWalletAssetBalanceDto = self.currency;
            if (cryptoWalletAssetBalanceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CryptoWalletAssetBalanceDto.Serializer.INSTANCE, cryptoWalletAssetBalanceDto);
            }
            if (self.transfer_type != TransferTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TransferTypeDto.Serializer.INSTANCE, self.transfer_type);
            }
            if (Double.compare(self.amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.amount));
            }
            if (self.status != TransferStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, TransferStatusDto.Serializer.INSTANCE, self.status);
            }
            if (self.error != ErrorDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, ErrorDto.Serializer.INSTANCE, self.error);
            }
            if (self.input_style != InputStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, InputStyleDto.Serializer.INSTANCE, self.input_style);
            }
            if (Intrinsics.areEqual(self.connect_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.connect_id);
        }

        public Surrogate(CryptoWalletAssetBalanceDto cryptoWalletAssetBalanceDto, TransferTypeDto transfer_type, double d, TransferStatusDto status, ErrorDto error, InputStyleDto input_style, String connect_id) {
            Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(input_style, "input_style");
            Intrinsics.checkNotNullParameter(connect_id, "connect_id");
            this.currency = cryptoWalletAssetBalanceDto;
            this.transfer_type = transfer_type;
            this.amount = d;
            this.status = status;
            this.error = error;
            this.input_style = input_style;
            this.connect_id = connect_id;
        }

        public final CryptoWalletAssetBalanceDto getCurrency() {
            return this.currency;
        }

        public final TransferTypeDto getTransfer_type() {
            return this.transfer_type;
        }

        public /* synthetic */ Surrogate(CryptoWalletAssetBalanceDto cryptoWalletAssetBalanceDto, TransferTypeDto transferTypeDto, double d, TransferStatusDto transferStatusDto, ErrorDto errorDto, InputStyleDto inputStyleDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cryptoWalletAssetBalanceDto, (i & 2) != 0 ? TransferTypeDto.INSTANCE.getZeroValue() : transferTypeDto, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? TransferStatusDto.INSTANCE.getZeroValue() : transferStatusDto, (i & 16) != 0 ? ErrorDto.INSTANCE.getZeroValue() : errorDto, (i & 32) != 0 ? InputStyleDto.INSTANCE.getZeroValue() : inputStyleDto, (i & 64) != 0 ? "" : str);
        }

        public final double getAmount() {
            return this.amount;
        }

        public final TransferStatusDto getStatus() {
            return this.status;
        }

        public final ErrorDto getError() {
            return this.error;
        }

        public final InputStyleDto getInput_style() {
            return this.input_style;
        }

        public final String getConnect_id() {
            return this.connect_id;
        }
    }

    /* compiled from: NcwTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<NcwTransferContextDto, NcwTransferContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NcwTransferContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NcwTransferContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NcwTransferContextDto> getBinaryBase64Serializer() {
            return (KSerializer) NcwTransferContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NcwTransferContext> getProtoAdapter() {
            return NcwTransferContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NcwTransferContextDto getZeroValue() {
            return NcwTransferContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NcwTransferContextDto fromProto(NcwTransferContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CryptoWalletAssetBalance currency = proto.getCurrency();
            return new NcwTransferContextDto(new Surrogate(currency != null ? CryptoWalletAssetBalanceDto.INSTANCE.fromProto(currency) : null, TransferTypeDto.INSTANCE.fromProto(proto.getTransfer_type()), proto.getAmount(), TransferStatusDto.INSTANCE.fromProto(proto.getStatus()), ErrorDto.INSTANCE.fromProto(proto.getError()), InputStyleDto.INSTANCE.fromProto(proto.getInput_style()), proto.getConnect_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwTransferContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NcwTransferContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NcwTransferContextDto(null, null, 0.0d, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_TYPE_UNSPECIFIED", "SEND", "RECEIVE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TransferTypeDto implements Dto2<NcwTransferContext.TransferType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TransferTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TransferTypeDto, NcwTransferContext.TransferType>> binaryBase64Serializer$delegate;
        public static final TransferTypeDto TRANSFER_TYPE_UNSPECIFIED = new TRANSFER_TYPE_UNSPECIFIED("TRANSFER_TYPE_UNSPECIFIED", 0);
        public static final TransferTypeDto SEND = new SEND("SEND", 1);
        public static final TransferTypeDto RECEIVE = new RECEIVE("RECEIVE", 2);

        private static final /* synthetic */ TransferTypeDto[] $values() {
            return new TransferTypeDto[]{TRANSFER_TYPE_UNSPECIFIED, SEND, RECEIVE};
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

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.TransferTypeDto.TRANSFER_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_TYPE_UNSPECIFIED extends TransferTypeDto {
            TRANSFER_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.TransferType toProto() {
                return NcwTransferContext.TransferType.TRANSFER_TYPE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwTransferContextDto$TransferTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NcwTransferContextDto.TransferTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.TransferTypeDto.SEND", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SEND extends TransferTypeDto {
            SEND(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.TransferType toProto() {
                return NcwTransferContext.TransferType.SEND;
            }
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.TransferTypeDto.RECEIVE", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECEIVE extends TransferTypeDto {
            RECEIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.TransferType toProto() {
                return NcwTransferContext.TransferType.RECEIVE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TransferTypeDto, NcwTransferContext.TransferType> {

            /* compiled from: NcwTransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NcwTransferContext.TransferType.values().length];
                    try {
                        iArr[NcwTransferContext.TransferType.TRANSFER_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NcwTransferContext.TransferType.SEND.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NcwTransferContext.TransferType.RECEIVE.ordinal()] = 3;
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
            public ProtoAdapter<NcwTransferContext.TransferType> getProtoAdapter() {
                return NcwTransferContext.TransferType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferTypeDto getZeroValue() {
                return TransferTypeDto.TRANSFER_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferTypeDto fromProto(NcwTransferContext.TransferType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TransferTypeDto.TRANSFER_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return TransferTypeDto.SEND;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return TransferTypeDto.RECEIVE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TransferTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TransferTypeDto, NcwTransferContext.TransferType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NcwTransferContext.TransferType", TransferTypeDto.getEntries(), TransferTypeDto.INSTANCE.getZeroValue());

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
    /* compiled from: NcwTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_UNSPECIFIED", "INSUFFICIENT_BALANCE", "EXPIRED_FEE", "FAILED_AUTH", "FAILED_REQUEST", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ErrorDto implements Dto2<NcwTransferContext.Error>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ErrorDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ErrorDto, NcwTransferContext.Error>> binaryBase64Serializer$delegate;
        public static final ErrorDto ERROR_UNSPECIFIED = new ERROR_UNSPECIFIED("ERROR_UNSPECIFIED", 0);
        public static final ErrorDto INSUFFICIENT_BALANCE = new INSUFFICIENT_BALANCE("INSUFFICIENT_BALANCE", 1);
        public static final ErrorDto EXPIRED_FEE = new EXPIRED_FEE("EXPIRED_FEE", 2);
        public static final ErrorDto FAILED_AUTH = new FAILED_AUTH("FAILED_AUTH", 3);
        public static final ErrorDto FAILED_REQUEST = new FAILED_REQUEST("FAILED_REQUEST", 4);

        private static final /* synthetic */ ErrorDto[] $values() {
            return new ErrorDto[]{ERROR_UNSPECIFIED, INSUFFICIENT_BALANCE, EXPIRED_FEE, FAILED_AUTH, FAILED_REQUEST};
        }

        public /* synthetic */ ErrorDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ErrorDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.ErrorDto.ERROR_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_UNSPECIFIED extends ErrorDto {
            ERROR_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.Error toProto() {
                return NcwTransferContext.Error.ERROR_UNSPECIFIED;
            }
        }

        private ErrorDto(String str, int i) {
        }

        static {
            ErrorDto[] errorDtoArr$values = $values();
            $VALUES = errorDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwTransferContextDto$ErrorDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NcwTransferContextDto.ErrorDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.ErrorDto.INSUFFICIENT_BALANCE", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INSUFFICIENT_BALANCE extends ErrorDto {
            INSUFFICIENT_BALANCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.Error toProto() {
                return NcwTransferContext.Error.INSUFFICIENT_BALANCE;
            }
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.ErrorDto.EXPIRED_FEE", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPIRED_FEE extends ErrorDto {
            EXPIRED_FEE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.Error toProto() {
                return NcwTransferContext.Error.EXPIRED_FEE;
            }
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.ErrorDto.FAILED_AUTH", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED_AUTH extends ErrorDto {
            FAILED_AUTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.Error toProto() {
                return NcwTransferContext.Error.FAILED_AUTH;
            }
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.ErrorDto.FAILED_REQUEST", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED_REQUEST extends ErrorDto {
            FAILED_REQUEST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.Error toProto() {
                return NcwTransferContext.Error.FAILED_REQUEST;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ErrorDto, NcwTransferContext.Error> {

            /* compiled from: NcwTransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NcwTransferContext.Error.values().length];
                    try {
                        iArr[NcwTransferContext.Error.ERROR_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NcwTransferContext.Error.INSUFFICIENT_BALANCE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NcwTransferContext.Error.EXPIRED_FEE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NcwTransferContext.Error.FAILED_AUTH.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[NcwTransferContext.Error.FAILED_REQUEST.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ErrorDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorDto> getBinaryBase64Serializer() {
                return (KSerializer) ErrorDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NcwTransferContext.Error> getProtoAdapter() {
                return NcwTransferContext.Error.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorDto getZeroValue() {
                return ErrorDto.ERROR_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorDto fromProto(NcwTransferContext.Error proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ErrorDto.ERROR_UNSPECIFIED;
                }
                if (i == 2) {
                    return ErrorDto.INSUFFICIENT_BALANCE;
                }
                if (i == 3) {
                    return ErrorDto.EXPIRED_FEE;
                }
                if (i == 4) {
                    return ErrorDto.FAILED_AUTH;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return ErrorDto.FAILED_REQUEST;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$ErrorDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ErrorDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ErrorDto, NcwTransferContext.Error> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NcwTransferContext.Error", ErrorDto.getEntries(), ErrorDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ErrorDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ErrorDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ErrorDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ErrorDto valueOf(String str) {
            return (ErrorDto) Enum.valueOf(ErrorDto.class, str);
        }

        public static ErrorDto[] values() {
            return (ErrorDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_STATUS_UNSPECIFIED", "SUBMITTED", "FAILED", "SUCCEEDED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TransferStatusDto implements Dto2<NcwTransferContext.TransferStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TransferStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TransferStatusDto, NcwTransferContext.TransferStatus>> binaryBase64Serializer$delegate;
        public static final TransferStatusDto TRANSFER_STATUS_UNSPECIFIED = new TRANSFER_STATUS_UNSPECIFIED("TRANSFER_STATUS_UNSPECIFIED", 0);
        public static final TransferStatusDto SUBMITTED = new SUBMITTED("SUBMITTED", 1);
        public static final TransferStatusDto FAILED = new FAILED("FAILED", 2);
        public static final TransferStatusDto SUCCEEDED = new SUCCEEDED("SUCCEEDED", 3);

        private static final /* synthetic */ TransferStatusDto[] $values() {
            return new TransferStatusDto[]{TRANSFER_STATUS_UNSPECIFIED, SUBMITTED, FAILED, SUCCEEDED};
        }

        public /* synthetic */ TransferStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TransferStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.TransferStatusDto.TRANSFER_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_STATUS_UNSPECIFIED extends TransferStatusDto {
            TRANSFER_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.TransferStatus toProto() {
                return NcwTransferContext.TransferStatus.TRANSFER_STATUS_UNSPECIFIED;
            }
        }

        private TransferStatusDto(String str, int i) {
        }

        static {
            TransferStatusDto[] transferStatusDtoArr$values = $values();
            $VALUES = transferStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwTransferContextDto$TransferStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NcwTransferContextDto.TransferStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.TransferStatusDto.SUBMITTED", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUBMITTED extends TransferStatusDto {
            SUBMITTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.TransferStatus toProto() {
                return NcwTransferContext.TransferStatus.SUBMITTED;
            }
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.TransferStatusDto.FAILED", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends TransferStatusDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.TransferStatus toProto() {
                return NcwTransferContext.TransferStatus.FAILED;
            }
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.TransferStatusDto.SUCCEEDED", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUCCEEDED extends TransferStatusDto {
            SUCCEEDED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.TransferStatus toProto() {
                return NcwTransferContext.TransferStatus.SUCCEEDED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TransferStatusDto, NcwTransferContext.TransferStatus> {

            /* compiled from: NcwTransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NcwTransferContext.TransferStatus.values().length];
                    try {
                        iArr[NcwTransferContext.TransferStatus.TRANSFER_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NcwTransferContext.TransferStatus.SUBMITTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NcwTransferContext.TransferStatus.FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NcwTransferContext.TransferStatus.SUCCEEDED.ordinal()] = 4;
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

            public final KSerializer<TransferStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransferStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) TransferStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NcwTransferContext.TransferStatus> getProtoAdapter() {
                return NcwTransferContext.TransferStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferStatusDto getZeroValue() {
                return TransferStatusDto.TRANSFER_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferStatusDto fromProto(NcwTransferContext.TransferStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TransferStatusDto.TRANSFER_STATUS_UNSPECIFIED;
                }
                if (i == 2) {
                    return TransferStatusDto.SUBMITTED;
                }
                if (i == 3) {
                    return TransferStatusDto.FAILED;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return TransferStatusDto.SUCCEEDED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$TransferStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TransferStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TransferStatusDto, NcwTransferContext.TransferStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NcwTransferContext.TransferStatus", TransferStatusDto.getEntries(), TransferStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TransferStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TransferStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TransferStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TransferStatusDto valueOf(String str) {
            return (TransferStatusDto) Enum.valueOf(TransferStatusDto.class, str);
        }

        public static TransferStatusDto[] values() {
            return (TransferStatusDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "INPUTSTYLE_UNSPECIFIED", "USD", "TOKEN", "CUSTOM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class InputStyleDto implements Dto2<NcwTransferContext.InputStyle>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputStyleDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<InputStyleDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<InputStyleDto, NcwTransferContext.InputStyle>> binaryBase64Serializer$delegate;
        public static final InputStyleDto INPUTSTYLE_UNSPECIFIED = new INPUTSTYLE_UNSPECIFIED("INPUTSTYLE_UNSPECIFIED", 0);
        public static final InputStyleDto USD = new USD("USD", 1);
        public static final InputStyleDto TOKEN = new TOKEN("TOKEN", 2);
        public static final InputStyleDto CUSTOM = new CUSTOM("CUSTOM", 3);

        private static final /* synthetic */ InputStyleDto[] $values() {
            return new InputStyleDto[]{INPUTSTYLE_UNSPECIFIED, USD, TOKEN, CUSTOM};
        }

        public /* synthetic */ InputStyleDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<InputStyleDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.InputStyleDto.INPUTSTYLE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INPUTSTYLE_UNSPECIFIED extends InputStyleDto {
            INPUTSTYLE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.InputStyle toProto() {
                return NcwTransferContext.InputStyle.INPUTSTYLE_UNSPECIFIED;
            }
        }

        private InputStyleDto(String str, int i) {
        }

        static {
            InputStyleDto[] inputStyleDtoArr$values = $values();
            $VALUES = inputStyleDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inputStyleDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwTransferContextDto$InputStyleDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NcwTransferContextDto.InputStyleDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.InputStyleDto.USD", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class USD extends InputStyleDto {
            USD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.InputStyle toProto() {
                return NcwTransferContext.InputStyle.USD;
            }
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.InputStyleDto.TOKEN", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOKEN extends InputStyleDto {
            TOKEN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.InputStyle toProto() {
                return NcwTransferContext.InputStyle.TOKEN;
            }
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwTransferContextDto.InputStyleDto.CUSTOM", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CUSTOM extends InputStyleDto {
            CUSTOM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwTransferContext.InputStyle toProto() {
                return NcwTransferContext.InputStyle.CUSTOM;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<InputStyleDto, NcwTransferContext.InputStyle> {

            /* compiled from: NcwTransferContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NcwTransferContext.InputStyle.values().length];
                    try {
                        iArr[NcwTransferContext.InputStyle.INPUTSTYLE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NcwTransferContext.InputStyle.USD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NcwTransferContext.InputStyle.TOKEN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NcwTransferContext.InputStyle.CUSTOM.ordinal()] = 4;
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

            public final KSerializer<InputStyleDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InputStyleDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InputStyleDto> getBinaryBase64Serializer() {
                return (KSerializer) InputStyleDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NcwTransferContext.InputStyle> getProtoAdapter() {
                return NcwTransferContext.InputStyle.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InputStyleDto getZeroValue() {
                return InputStyleDto.INPUTSTYLE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InputStyleDto fromProto(NcwTransferContext.InputStyle proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return InputStyleDto.INPUTSTYLE_UNSPECIFIED;
                }
                if (i == 2) {
                    return InputStyleDto.USD;
                }
                if (i == 3) {
                    return InputStyleDto.TOKEN;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return InputStyleDto.CUSTOM;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NcwTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$InputStyleDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<InputStyleDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<InputStyleDto, NcwTransferContext.InputStyle> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NcwTransferContext.InputStyle", InputStyleDto.getEntries(), InputStyleDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public InputStyleDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (InputStyleDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, InputStyleDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static InputStyleDto valueOf(String str) {
            return (InputStyleDto) Enum.valueOf(InputStyleDto.class, str);
        }

        public static InputStyleDto[] values() {
            return (InputStyleDto[]) $VALUES.clone();
        }
    }

    /* compiled from: NcwTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NcwTransferContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NcwTransferContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NcwTransferContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NcwTransferContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NcwTransferContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NcwTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NcwTransferContextDto";
        }
    }
}
